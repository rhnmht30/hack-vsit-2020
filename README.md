# ![MobiTrack](https://github.com/rhnmht30/hack-vsit-2020/blob/demo/demo/logo.png?raw=true)
#### An offline android map app to helps you when you have a slow/no internet.

### [Prototype Link](https://xd.adobe.com/view/cb0a9d48-176a-4ebd-42c0-965eb73ce3b2-bd3b/)

# What problem it solves?

Internet shutdowns are a major threat to one's day to day activities. We have seen a number of cases where the government puts a ban due to issues in public but it affects those people too who just want to use the internet for basic activities like find routes or places on a map.

Not only internet shutdown but in general in India, there is poor internet connectivity in villages and even cities! It becomes impossible sometimes to even browse the internet.

Our application is an android app that works totally offline to perform location-based features via SMS.

We have a server that uses MapMyIndia's API to search the queried location coming through the SMS in our server. We are using Twilio SMS API to send/receive the SMS.

Features of our app are:

-   Find the address of the current location of the user with no internet.
-   Find hospitals/police stations etc around the user's location.
-   Broadcast location to near and dear ones with just a click.
-   Get the location of the phone remotely by sending an SMS to your phone.


## How it works ?
- User opens app when offline and clicks **Get My Location** button
![Main Page](https://github.com/rhnmht30/hack-vsit-2020/blob/demo/demo/1.png?raw=true)
- The app then fetches the GPS data and sends an SMS to a provided number.
- We have a server setup which listens to the Webhook request from the **Twilio API** when it receives a SMS
- We process that request and find the location via **MapMyIndia** API and then send the results to the same number via SMS.
- The received SMS is then read by the app and the results are displayed.
![Recieved Data](https://raw.githubusercontent.com/rhnmht30/hack-vsit-2020/demo/demo/2.png)
- User can also get details of nearby Hospitals and Police stations just by sending their location.![get results](https://raw.githubusercontent.com/rhnmht30/hack-vsit-2020/demo/demo/3.png)
-![Nice](https://raw.githubusercontent.com/rhnmht30/hack-vsit-2020/demo/demo/4.png)
- Our app can also send your current location to the listed numbers in the app , so that when you have no connectivity your near and dear onescould be updated always.![great](https://raw.githubusercontent.com/rhnmht30/hack-vsit-2020/demo/demo/5.png)

## Challenges we ran into

Due to TRAI regulations in India, messages are only delivered between the hours of 9 A.M. and 9 P.M. local Indian time, we were not able to test the SMS features in the backend using the Twilio API. Also, the mapMyIndia API was not accepting new registrations for API keys.

We used manual ways to test the API and we were successful in fetching GPS data from the phone when it's offline but weren't able to send messages to API as it had international numbers.


## Technologies used

- Nodejs
- Android
- Twilio API
- MapMyIndia API

## Team: HtmlHackers

- [Rohan Mehta](github.com/rhnmht30)
- [Ritik Srivastava](github.com/ritiksr25)
- [Anshul Gupta](github.com/Anshul1507)


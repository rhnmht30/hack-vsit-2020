const client = require("twilio")(
	process.env.ACCOUNT_SID,
	process.env.AUTH_TOKEN
);

const axios = require("axios");

module.exports.test = async (req, res) => {
	const message = await client.messages.create({
		body: "Test message",
		from: process.env.PHONE,
		to: "+919582323048"
	});

	res.json({ message: message });
};

module.exports.location = async (req, res) => {
	const resp = axios.get("mapURL");
	res.json({ message: "success", data });
};

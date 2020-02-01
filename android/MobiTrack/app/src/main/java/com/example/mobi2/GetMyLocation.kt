package com.example.mobi2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.mobi2.databinding.FragmentGetMyLocationBinding
import kotlinx.android.synthetic.main.activity_main.view.*

/**
 * A simple [Fragment] subclass.
 */
class GetMyLocation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGetMyLocationBinding>(
            inflater, R.layout.fragment_get_my_location, container, false)
        activity?.title="MobiTrack"
        binding.getmylocation = this

        binding.getMyLocationBtn.setOnClickListener {
            it.findNavController().navigate(GetMyLocationDirections.actionGetMyLocationToGetMyLocationFinal())
        }

        return binding.root
    }


}

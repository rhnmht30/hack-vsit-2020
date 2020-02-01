package com.example.mobi2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.mobi2.databinding.FragmentGetMyLocationBinding
import com.example.mobi2.databinding.FragmentNearByLocationBinding

/**
 * A simple [Fragment] subclass.
 */
class NearByLocation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNearByLocationBinding>(
            inflater, R.layout.fragment_near_by_location, container, false)

        binding.nearByLocation = this

        binding.getNearByLocationBtn.setOnClickListener {
            it.findNavController().navigate(NearByLocationDirections.actionNearByLocationToNearByLocaitonFinal())
        }

        return binding.root
    }


}

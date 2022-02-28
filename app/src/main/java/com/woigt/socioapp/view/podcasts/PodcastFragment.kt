package com.woigt.socioapp.view.podcasts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.woigt.socioapp.databinding.PodcastFragmentBinding

class PodcastFragment : Fragment() {

    private lateinit var binding: PodcastFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PodcastFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}

package com.zireddinismayilov.recipeapp.SettingAccount.Fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zireddinismayilov.recipeapp.R
import com.zireddinismayilov.recipeapp.SettingAccount.adapter.Adapter
import com.zireddinismayilov.recipeapp.databinding.FragmentSelectingCountryPageBinding

class SelectingCountryPage : Fragment() {
    var locations = mutableListOf<String>(
        "Afghanistan",
        "Albania",
        "Algeria",
        "Argentina",
        "Armenia",
        "Australia",
        "Austria",
        "Azerbaijan",
        "Bangladesh",
        "Belgium",
        "Belize",
        "Bhutan",
        "Bolivia",
        "Bosnia and Herzegovina",
        "Brazil",
        "Cambodia",
        "Canada",
        "Chile",
        "China",
        "Colombia",
        "Croatia",
        "Cuba",
        "Cyprus",
        "Czech Republic",
        "Denmark",
        "Egypt",
        "Ethiopia",
        "Finland",
        "France",
        "Georgia",
        "Germany",
        "Greece",
        "Hungary",
        "India",
        "Indonesia",
        "Iran",
        "Ireland",
        "Italy",
        "Japan",
        "Kenya",
        "Lebanon",
        "Malaysia",
        "Mexico",
        "Morocco",
        "Nepal",
        "Netherlands",
        "Nigeria",
        "Norway",
        "Pakistan",
        "Peru",
        "Philippines",
        "Poland",
        "Portugal",
        "Russia",
        "Saudi Arabia",
        "Senegal",
        "Serbia",
        "Singapore",
        "South Korea",
        "Spain",
        "Sri Lanka",
        "Sweden",
        "Switzerland",
        "Thailand",
        "Turkey",
        "Ukraine",
        "United Kingdom",
        "United States",
        "Vietnam"
    )

    lateinit var binding: FragmentSelectingCountryPageBinding
    lateinit var adapter: Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectingCountryPageBinding.inflate(inflater, container, false)
        adapter = Adapter(locations)
        binding.countriesRecyclerView.adapter = adapter
        search()
        return binding.root
    }

    fun search() {
        var filteredList = mutableListOf<String>()
        binding.SelectCountryeditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                filteredList = locations.filter { it -> it.contains(p0.toString()) }.toMutableList()
                adapter.filteredList(filteredList)
            }

            override fun afterTextChanged(p0: Editable?) {}

        })
    }
}
package com.example.jerom.controle_app.fragment


import android.os.Bundle
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jerom.controle_app.R
import com.example.jerom.controle_app.adapters.EarthQuakeAdapter
import com.example.jerom.controle_app.api.EarthQuakeInterface

import com.example.jerom.controle_app.api.RetrofitClient
import com.example.jerom.controle_app.models.EarthQuake
import kotlinx.android.synthetic.main.fragment_api_.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Response


class Api_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_api_, container, false)

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val client = RetrofitClient().getEarthQuake().create(EarthQuakeInterface::class.java)
        client.getEarthQuake().enqueue(object : retrofit2.Callback<EarthQuake>{

            override fun onResponse(call: Call<EarthQuake>, response: Response<EarthQuake>) {

                if (response.isSuccessful){
                    recyclerEarthQuake.layoutManager = LinearLayoutManager(context)
                    val adapter = EarthQuakeAdapter(response.body()!!.features)
                    recyclerEarthQuake.adapter = adapter
                    context?.toast(response.body()?.features?.get(0)?.properties!!.place)
                }
                else
                    context?.toast("" + response.code() + response.message())
            }

            override fun onFailure(call: Call<EarthQuake>, t: Throwable) {
                context!!.toast("onfailure")
            }

        })
    }

}

package com.example.cartilla

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var adapter: NewsAdapter
    val newsList = ArrayList<News>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        createData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycleview = view.findViewById<RecyclerView>(R.id.recycleView)
        layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        recycleview.layoutManager = layoutManager
        adapter = NewsAdapter(newsList)
        recycleview.adapter = adapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance():Home = Home()
            /*Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }*/
    }

    private fun createData(){
        newsList.add(News(1, R.drawable.vacunacion , "Titulo de la noticia","Este es el resumen de la noticia que queremos leer más adelante respecto a la vacunación..."))
        newsList.add(News(2, R.drawable.vacunacion , "Titulo de la noticia","Este es el resumen de la noticia que queremos leer más adelante respecto a la vacunación..."))
        newsList.add(News(3, R.drawable.vacunacion , "Titulo de la noticia","Este es el resumen de la noticia que queremos leer más adelante respecto a la vacunación..."))
    }

}
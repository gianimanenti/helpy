package com.example.helpy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helpy.Model.Help
import com.example.helpy.R
import kotlinx.android.synthetic.main.fragment_whelp.*

class HelpFragment : Fragment() {

  //  private lateinit var homeViewModel: HomeViewModel
    private lateinit var helpAdapter: HelpAdapter

    val pessoaList: MutableList<Help> = mutableListOf(
        Help("Rufus Ramírez", "rramirez@email.com", "9999-9999", "Doar máscaras", "Salvador", 9),
        Help("Marco Lousã", "mlousa@email.com", "7777-7777", "Ajudo com crianças", "Florianópolis", 7),
        Help("Flávio Noite", "fnoite@email.com", "5555-5555","Doação de comida","São José dos Pinhais", 1),
        Help("Adérito Tibiriçá", "atibirica@email.com", "1111-1111", "Fazer Compra", "São Paulo", 5),
        Help("Gisela Siebra", "gsiebra@email.com", "6666-6666","Dou aula de francês", "Maringá", 7),
        Help("Cleiton Siqueira ", "csiqueira@email.com", "2222-2222","Aula de exercícios fisicos", "Curitiba", 4),
        Help("Miriam Tabosa", "mtabosa@email.com", "8888-8888", "Ajudo com conversas", "Cuiabá", 3),
        Help("Carlos Proença", "cproenca@email.com", "3333-3333", "Aula de inglês", "Curitiba", 7),
        Help("Filipe Valadão", "fvaladao@email.om", "4444-4444", "Doação de comida", "Marília", 1),
        Help("Socorro Cabreira", "scabreira@email.com", "1010-1010", "Doar álcool em gel", "Manaus", 9)
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //homeViewModel =
        //    ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_whelp, container, false)







        return root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recyclerViewWHelp.layoutManager = LinearLayoutManager(context)
        helpAdapter =
            HelpAdapter(activity, pessoaList)
        recyclerViewWHelp.adapter = helpAdapter

    }
}

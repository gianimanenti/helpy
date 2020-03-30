package com.example.helpy.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.helpy.Model.Help
import com.example.helpy.R
import kotlinx.android.synthetic.main.help_item.view.*

class HelpAdapter(private val context: FragmentActivity?, private var whelpList: MutableList<Help>):
    RecyclerView.Adapter<HelpAdapter.HelpViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelpViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.help_item, parent, false)
        return HelpViewHolder(view)
    }

    override fun getItemCount() = whelpList.size

    override fun onBindViewHolder(holder: HelpViewHolder, position: Int) {
        holder.bindView(whelpList[position])
    }

    class HelpViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textViewAjuda = itemView.textViewAjuda
        val textViewNome = itemView.textViewNome
        val textViewEmail = itemView.textViewEmail
        val textViewTelefone = itemView.textViewTelefone
        val textViewCidade = itemView.textViewCidade
        val imageViewHelp = itemView.imageHelp

        fun bindView(pessoa: Help) {
            textViewAjuda.text = pessoa.ajuda
            textViewNome.text = pessoa.nome
            textViewEmail.text = pessoa.email
            textViewTelefone.text = pessoa.telefone
            textViewCidade.text = pessoa.cidade
            var helpImg = when (pessoa.type){
                1 -> R.drawable.helpy_food_1
                2 -> R.drawable.helpy_money_2
                3 -> R.drawable.helpy_mental_health_3
                4 -> R.drawable.helpy_exercises_4
                5 -> R.drawable.helpy_buy_5
                6 -> R.drawable.android_image_1
                7 -> R.drawable.helpy_teaching_7
                8 -> R.drawable.helpy_small_business_8
                9 -> R.drawable.helpy_mask_9
                else -> R.drawable.android_image_1

            }
            imageViewHelp.setImageResource(helpImg)

        }
    }
}
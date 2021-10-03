import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.resakleview.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item.view.*

class UserAdapter(val context: Context,val userList: List<list>) : RecyclerView.Adapter<UserAdapter.Vh>() {
    inner class Vh(var itemRv: View) : RecyclerView.ViewHolder(itemRv) {

        @SuppressLint("SetTextI18n")
        fun onbind(user: list) {
            itemRv.txt_name.text = user.name
            itemRv.txt_views.text ="Views:${user.views}"
            itemRv.txt_date.text = "Release Date: ${user.date}"
            Picasso.get().load(user.image).into(itemRv.imageView)

            itemRv.animation = AnimationUtils.loadAnimation(context,R.anim.anim_item1)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {

        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }


    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onbind(userList[position])


    }

    override fun getItemCount(): Int = userList.size
}
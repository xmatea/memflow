import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.memflow.R
import com.example.memflow.data.WordEntry
import com.example.memflow.ui.home.VocabularyListViewHolder

class VocabularyListAdapter(private val data: List<WordEntry>) :
    RecyclerView.Adapter<VocabularyListAdapter.MyViewHolder>() {

    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    // Create new views (invoked by the fragment_vocabulary_list manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): VocabularyListAdapter.MyViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.vocabulary_item, parent, false) as TextView
        return MyViewHolder(textView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = data[position].entryValue
    }

    override fun getItemCount() = data.size
}
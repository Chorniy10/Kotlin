import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recycleviev.DataItem
import com.example.recycleviev.HorizontalListAdapter
import com.example.recycleviev.PhotoItem
import com.example.recycleviev.PhotoPagerAdapter
import com.example.recycleviev.R

class FirstFragment : Fragment() {

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = view.findViewById(R.id.viewPager)
        val photoAdapter = PhotoPagerAdapter(getPhotoList().take(6))
        viewPager.adapter = photoAdapter

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = HorizontalListAdapter(getDataList().take(8))
        viewPager = view.findViewById(R.id.viewPager)
        viewPager = view.findViewById(R.id.viewPager)
        val photoAdapter2 = PhotoPagerAdapter(getPhotoList().take(6))
        viewPager.adapter = photoAdapter2
    }

    private fun getDataList(): List<DataItem> {
        val dataList = mutableListOf<DataItem>()
        dataList.add(DataItem(R.drawable.image1, "minato"))
        dataList.add(DataItem(R.drawable.image2, "Godo"))
        dataList.add(DataItem(R.drawable.image3, "Madara"))
        dataList.add(DataItem(R.drawable.image4, "Tobi"))
        dataList.add(DataItem(R.drawable.image5, "School boy"))
        dataList.add(DataItem(R.drawable.image6, "Ath"))
        dataList.add(DataItem(R.drawable.image7, "Digital_fo"))
        dataList.add(DataItem(R.drawable.image8, "Obi"))

        return dataList
    }

    private fun getPhotoList(): List<PhotoItem> {
        val photoList = mutableListOf<PhotoItem>()
        photoList.add(PhotoItem(R.drawable.minato))
        photoList.add(PhotoItem(R.drawable.kabuto))
        photoList.add(PhotoItem(R.drawable.itachi1))
        photoList.add(PhotoItem(R.drawable.itachi2))
        photoList.add(PhotoItem(R.drawable.madara1))
        photoList.add(PhotoItem(R.drawable.madara2))
        return photoList
    }

    private fun gotPhotoList() {
        val photoList = mutableListOf<PhotoItem>()
        photoList.add(PhotoItem(R.drawable.minato))
        photoList.add(PhotoItem(R.drawable.kabuto))
        photoList.add(PhotoItem(R.drawable.itachi2))
        photoList.add(PhotoItem(R.drawable.itachi1))
        photoList.add(PhotoItem(R.drawable.madara1))
        photoList.add(PhotoItem(R.drawable.madara2))
    }
}

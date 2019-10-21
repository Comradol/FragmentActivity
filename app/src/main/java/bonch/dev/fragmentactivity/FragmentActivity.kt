package bonch.dev.fragmentactivity
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.fragmentactivity.moduls.FirstFragment
import bonch.dev.fragmentactivity.moduls.SecondFragment
import kotlinx.android.synthetic.main.fragment_first.*

class FragmentActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment1, FirstFragment())
            .commit()






    }
    fun replaceFragment(){
        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment1, SecondFragment())
            .addToBackStack("second_fragment")
            .commit()
    }
}



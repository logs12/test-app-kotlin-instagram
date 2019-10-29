package instagram.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation_view.setTextVisibility(false)
        bottom_navigation_view.enableItemShiftingMode(false)
        bottom_navigation_view.enableShiftingMode(false)
        bottom_navigation_view.enableAnimation(false)
        for (i in 0 until bottom_navigation_view.menu.size()) {
            bottom_navigation_view.setIconTintList(i, null);
        }
        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_item_home -> android.util.Log.d(TAG, "msg: nav_item_home")
                R.id.nav_item_search -> android.util.Log.d(TAG, "msg: nav_item_search")
                R.id.nav_item_share -> android.util.Log.d(TAG, "msg: nav_item_share")
                R.id.nav_item_likes -> android.util.Log.d(TAG, "msg: nav_item_likes")
                R.id.nav_item_profiles -> android.util.Log.d(TAG, "msg: nav_item_profiles")
            }
            false

        }
    }
}

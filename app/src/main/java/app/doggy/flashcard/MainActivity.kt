package app.doggy.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //カレーインスタンスの配列。
    val currys: Array<Curry> = arrayOf(
            Curry("ドライカレー", R.drawable.dry),
            Curry("キーマカレー", R.drawable.keema),
            Curry("カレーまん", R.drawable.man),
            Curry("マッサマンカレー", R.drawable.matsaman),
            Curry("カレーパン", R.drawable.pan),
            Curry("カレーうどん", R.drawable.udon),
            Curry("焼きカレー", R.drawable.yaki)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in currys.indices)
            addCurryView(currys[i])
    }

    //カレーのビューを追加する処理。
    fun addCurryView(curry: Curry) {

        //カレーの名前。
        val nameTextView = TextView(applicationContext)
        nameTextView.text = curry.name

        //カレーの画像。
        val imageView = ImageView(applicationContext)
        imageView.setImageResource(curry.image)
        imageView.layoutParams = ViewGroup.LayoutParams(250, 250)

        //LinearLayoutを生成。
        val linearLayout = LinearLayout(applicationContext)
        linearLayout.orientation = LinearLayout.HORIZONTAL

        //LinearLayoutにカレーの情報を追加。
        linearLayout.addView(imageView)
        linearLayout.addView(nameTextView)

        //containerにLinearLayoutを追加。
        container.addView(linearLayout)
    }
}
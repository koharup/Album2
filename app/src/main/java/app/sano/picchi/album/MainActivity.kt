package app.sano.picchi.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //プレビュー画面に情報を送る変数を準備する
        val preview = Intent(this,PreviewActivity::class.java)




        cakeImage.setOnClickListener {
            preview.putExtra("image", R.drawable.cake_image)
            preview.putExtra("title","ケーキ")
            startActivity(preview)
        }

        catImage.setOnClickListener {
            preview.putExtra("image",R.drawable.cat_image)
            preview.putExtra("title","ねこ")
            startActivity(preview)
        }

        dogImage.setOnClickListener {
            preview.putExtra("image",R.drawable.dog_image)
            preview.putExtra("title","いぬ")
            startActivity(preview)
        }

        seaImage.setOnClickListener {
            preview.putExtra("image",R.drawable.sea_image)
            preview.putExtra("title","海")
            startActivity(preview)
        }

        nightImage.setOnClickListener {
            preview.putExtra("image",R.drawable.night_image)
            preview.putExtra("title","夜景")
            startActivity(preview)
        }

        flowerImage.setOnClickListener {
            preview.putExtra("image",R.drawable.flower_image)
            preview.putExtra("title","桜")
            startActivity(preview)
        }
    }
}

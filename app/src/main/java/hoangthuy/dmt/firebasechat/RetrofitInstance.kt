package hoangthuy.dmt.firebasechat

import android.provider.SyncStateContract
import hoangthuy.dmt.firebasechat.`interface`.NotificationApi
import hoangthuy.dmt.firebasechat.model.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object{
        private val retrofit by lazy{
            Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy {
            retrofit.create(NotificationApi::class.java)
        }
    }
}
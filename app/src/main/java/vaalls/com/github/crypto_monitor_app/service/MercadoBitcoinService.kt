package vaalls.com.github.crypto_monitor_app.service

import retrofit2.Response
import retrofit2.http.GET
import vaalls.com.github.crypto_monitor_app.model.TickerResponse

interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}
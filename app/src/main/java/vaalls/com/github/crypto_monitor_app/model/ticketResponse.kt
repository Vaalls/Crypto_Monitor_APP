package vaalls.com.github.crypto_monitor_app.model

class TickerResponse(
    val ticker: Ticker
)
class Ticker(
    val high: String,
    val low: String,
    val vol: String,
    val last: String,
    val buy: String,
    val sell: String,
    val date: Long
)
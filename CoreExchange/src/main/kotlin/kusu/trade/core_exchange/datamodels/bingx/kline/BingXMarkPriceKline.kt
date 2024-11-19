package kusu.trade.core_exchange.datamodels.bingx.kline

import kotlinx.serialization.Serializable
import kusu.trade.core_exchange.datamodels.bingx.BingXResponse

@Serializable
data class BingXMarkPriceKline(
    val list: List<BingXMarkPriceKlineElement>
) : BingXResponse()


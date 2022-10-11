package com.hismayfly.ledger.purchase.adapter.port.input

import com.hismayfly.ledger.purchase.application.port.input.RegisterPurchaseDTO
import com.hismayfly.ledger.purchase.application.port.input.RegisterPurchaseInputPort
import com.hismayfly.ledger.purchase.domain.Purchase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class RegisterPurchaseRequestBody(
    val userId: Long,
    val sum: Int,
    val description: String = "",
    val purchasedAt: String,
)

@RestController
@RequestMapping("/api/purchase")
class RegisterPurchaseController(
    private val registerPurchaseInputPort: RegisterPurchaseInputPort,
) {
    @PostMapping
    fun registerPurchase(@RequestBody body: RegisterPurchaseRequestBody): Purchase {
        val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val purchasedAt = LocalDateTime.parse(body.purchasedAt, pattern)

        val dto = RegisterPurchaseDTO(
            userId = body.userId,
            sum = body.sum,
            description = body.description,
            purchasedAt = purchasedAt,
        )
        return registerPurchaseInputPort.registerPurchase(dto)
    }
}

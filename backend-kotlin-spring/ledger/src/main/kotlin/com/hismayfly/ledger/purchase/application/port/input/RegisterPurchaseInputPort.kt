package com.hismayfly.ledger.purchase.application.port.input

import com.hismayfly.ledger.purchase.domain.Purchase
import java.time.LocalDateTime

data class RegisterPurchaseDTO(
    val userId: Long,
    val sum: Int,
    val description: String = "",
    val purchasedAt: LocalDateTime,
)

interface RegisterPurchaseInputPort {
    fun registerPurchase(dto: RegisterPurchaseDTO): Purchase
}
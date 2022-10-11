package com.hismayfly.ledger.purchase.application.usecase

import com.hismayfly.ledger.purchase.application.port.input.RegisterPurchaseDTO
import com.hismayfly.ledger.purchase.application.port.input.RegisterPurchaseInputPort
import com.hismayfly.ledger.purchase.application.port.output.RegisterPurchaseOutputPort
import com.hismayfly.ledger.purchase.domain.Purchase
import org.springframework.stereotype.Service

@Service
class RegisterPurchaseUsecase(
    private val purchaseOutputPort: RegisterPurchaseOutputPort,
): RegisterPurchaseInputPort {
    override fun registerPurchase(dto: RegisterPurchaseDTO): Purchase {
        val purchase = Purchase(
                userId = dto.userId,
                sum = dto.sum,
                description = dto.description,
                purchasedAt = dto.purchasedAt,
        )
        return purchaseOutputPort.registerPurchase(purchase)
    }
}
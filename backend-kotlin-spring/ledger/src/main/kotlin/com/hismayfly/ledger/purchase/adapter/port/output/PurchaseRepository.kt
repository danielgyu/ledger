package com.hismayfly.ledger.purchase.adapter.port.output

import com.hismayfly.ledger.purchase.adapter.port.output.persistence.PurchasePersistenceRepository
import com.hismayfly.ledger.purchase.adapter.port.output.persistence.PurchaseTable
import com.hismayfly.ledger.purchase.application.port.output.RegisterPurchaseOutputPort
import com.hismayfly.ledger.purchase.domain.Purchase
import org.springframework.stereotype.Repository
import java.sql.Date

@Repository
class PurchaseRepository(
    private val persistenceRepository: PurchasePersistenceRepository,
): RegisterPurchaseOutputPort {
    override fun registerPurchase(purchase: Purchase): Purchase {
        persistenceRepository.save(PurchaseTable(
            userId = purchase.userId,
            sum = purchase.sum,
            description = purchase.description,
            purchasedAt = Date.valueOf(purchase.purchasedAt.toLocalDate())
        ))
        return purchase
    }
}
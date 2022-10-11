package com.hismayfly.ledger.purchase.application.port.output

import com.hismayfly.ledger.purchase.domain.Purchase

interface RegisterPurchaseOutputPort {
    fun registerPurchase(purchase: Purchase): Purchase
}
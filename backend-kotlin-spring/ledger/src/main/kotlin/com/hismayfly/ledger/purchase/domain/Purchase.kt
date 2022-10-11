package com.hismayfly.ledger.purchase.domain

import java.time.LocalDateTime

class Purchase(
    val userId: Long,
    val sum: Int,
    val description: String = "",
    val purchasedAt: LocalDateTime,
)
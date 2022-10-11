package com.hismayfly.ledger.purchase.adapter.port.output.persistence

import org.springframework.data.jpa.repository.JpaRepository
import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "purchase")
class PurchaseTable(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    val userId: Long,

    @Column
    val sum: Int,

    @Column
    val description: String,

    @Column
    val purchasedAt: Date,
)

interface PurchasePersistenceRepository: JpaRepository<PurchaseTable, Long>
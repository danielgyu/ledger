package com.hismayfly.ledger.book.adapter.output.persistence

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
@Table(name = "books")
class BookTable (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    val userId: Long,

    @Column
    val dailyBudget: Int,
)

interface BookPersistenceRepository: JpaRepository<BookTable, Long>
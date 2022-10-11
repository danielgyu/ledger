package com.hismayfly.ledger.book.application.port.input

import com.hismayfly.ledger.book.domain.Book

data class SaveBookDTO (
    val userId: Long,
    val dailyBudget: Int,
)

interface SaveBookInputPort {
    fun saveBook(dto: SaveBookDTO): Book
}
package com.hismayfly.ledger.book.adapter.output

import com.hismayfly.ledger.book.adapter.output.persistence.BookPersistenceRepository
import com.hismayfly.ledger.book.adapter.output.persistence.BookTable
import com.hismayfly.ledger.book.domain.Book
import org.springframework.stereotype.Repository

@Repository
class BookRepository(
    private val persistenceRepository: BookPersistenceRepository,
) {
    fun saveBook(book: Book): Book {
        persistenceRepository.save(BookTable(
            userId = book.userId,
            dailyBudget = book.dailyBudget,
        ))
        return book
    }
}
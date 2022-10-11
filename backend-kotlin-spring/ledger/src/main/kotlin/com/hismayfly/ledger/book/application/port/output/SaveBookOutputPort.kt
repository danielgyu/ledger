package com.hismayfly.ledger.book.application.port.output

import com.hismayfly.ledger.book.domain.Book

interface SaveBookOutputPort {
    fun saveBook(book: Book): Book
}
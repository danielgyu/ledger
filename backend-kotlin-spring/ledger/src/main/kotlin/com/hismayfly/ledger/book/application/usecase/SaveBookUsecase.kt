package com.hismayfly.ledger.book.application.usecase

import com.hismayfly.ledger.book.application.port.input.SaveBookDTO
import com.hismayfly.ledger.book.application.port.input.SaveBookInputPort
import com.hismayfly.ledger.book.application.port.output.SaveBookOutputPort
import com.hismayfly.ledger.book.domain.Book
import org.springframework.stereotype.Service

@Service
class SaveBookUsecase(
    private val bookRepository: SaveBookOutputPort,
): SaveBookInputPort {
    override fun saveBook(dto: SaveBookDTO): Book {
        return bookRepository.saveBook(Book(
            userId = dto.userId,
            dailyBudget = dto.dailyBudget,
        ))
    }
}
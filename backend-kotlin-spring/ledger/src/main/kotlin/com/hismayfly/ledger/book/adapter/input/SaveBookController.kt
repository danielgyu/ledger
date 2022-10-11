package com.hismayfly.ledger.book.adapter.input

import com.hismayfly.ledger.book.application.port.input.SaveBookDTO
import com.hismayfly.ledger.book.application.usecase.SaveBookUsecase
import com.hismayfly.ledger.book.domain.Book
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class SaveBookRequestBody (
    val userId: Long,
    val dailyBudget: Int,
)

@RestController
@RequestMapping("/api/book/")
class SaveBookController(
    private val bookUsecase: SaveBookUsecase,
) {
    @PostMapping
    fun saveBook(@RequestBody body: SaveBookRequestBody): Book {
        return bookUsecase.saveBook(SaveBookDTO(
            userId = body.userId,
            dailyBudget = body.dailyBudget,
        ))
    }
}
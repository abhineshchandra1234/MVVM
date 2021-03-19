package com.eegrab.mvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.eegrab.mvvm.data.Quote
import com.eegrab.mvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}
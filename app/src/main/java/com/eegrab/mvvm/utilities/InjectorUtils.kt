package com.eegrab.mvvm.utilities

import com.eegrab.mvvm.data.FakeDatabase
import com.eegrab.mvvm.data.QuoteRepository
import com.eegrab.mvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory     {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}
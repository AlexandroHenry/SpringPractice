package com.alaxhenry.myblog.service

import com.alaxhenry.myblog.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // given
//        every { dataSource.retrieveBanks() } returns emptyList()
        println(dataSource)
        // when
        val banks = bankService.getBanks()
        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}
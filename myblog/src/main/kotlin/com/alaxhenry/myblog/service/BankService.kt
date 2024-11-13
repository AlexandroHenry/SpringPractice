package com.alaxhenry.myblog.service

import com.alaxhenry.myblog.datasource.BankDataSource
import com.alaxhenry.myblog.model.Bank
import org.springframework.stereotype.Service


@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String) : Bank = dataSource.retrieveBank(accountNumber)
}
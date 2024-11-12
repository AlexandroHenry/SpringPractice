package com.alaxhenry.myblog.datasource

import com.alaxhenry.myblog.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}
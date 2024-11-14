package com.alaxhenry.myblog.datasource.network.dto

import com.alaxhenry.myblog.model.Bank

data class BankList(
    val results: Collection<Bank>
)
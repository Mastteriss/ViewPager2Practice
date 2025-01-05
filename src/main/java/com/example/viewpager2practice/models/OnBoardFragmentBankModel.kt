package com.example.viewpager2practice.models

import com.example.viewpager2practice.R
import java.io.Serializable


class OnBoardFragmentBankModel (
    val title:String,
    val imageView: Int,
    val checkButton: Boolean
):Serializable{
    companion object{
        val viewPagerList = mutableListOf(
            OnBoardFragmentBankModel(
                "Добро пожаловать в наше банковское приложение! Здесь вы можете управлять своими счетами, совершать платежи и многое другое.",
                (R.drawable.bank),
                true
            ),
            OnBoardFragmentBankModel(
                "Следите за своими расходами и доходами легко и удобно.",
                R.drawable.price,
                true
            ),
            OnBoardFragmentBankModel(
                "Управляйте своими финансами из любого места в любое время.",
                R.drawable.gps,
                true
            ),
            OnBoardFragmentBankModel(
                "Получите доступ к эксклюзивным предложениям и бонусам.",
                R.drawable.bonus,
                true
            ),
            OnBoardFragmentBankModel(
                "Безопасность ваших данных — наш приоритет.",
                R.drawable.security,
                false
            )

        )
    }
}
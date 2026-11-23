package com.example.practica30.ui.theme.screens.home

import androidx.lifecycle.ViewModel
import com.example.practica30.model.Product
import com.example.practica30.model.sampleProducts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products.asStateFlow()

    init {
        loadProducts()
    }

    fun loadProducts() {
        _products.value = sampleProducts
    }
}

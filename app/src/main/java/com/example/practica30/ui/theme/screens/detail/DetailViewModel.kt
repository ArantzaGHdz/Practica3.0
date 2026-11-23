package com.example.practica30.ui.theme.screens.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.practica30.model.Product
import com.example.practica30.model.sampleProducts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _product = MutableStateFlow<Product?>(null)
    val product: StateFlow<Product?> = _product.asStateFlow()

    init {
        val productId: Int? = savedStateHandle.get<Int>("productId")
        if (productId != null) {
            loadProduct(productId)
        }
    }

    fun loadProduct(id: Int) {
        _product.value = sampleProducts.find { it.id == id }
    }
}

package com.example.practica30.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val category: String = "General",
    val rating: Double = 4.5
)

val sampleProducts = listOf(
    Product(
        id = 1,
        name = "Auriculares Inalámbricos",
        description = "Auriculares con cancelación de ruido activa y alta calidad de sonido. Batería de hasta 30 horas.",
        price = 89.99,
        category = "Electrónica",
        rating = 4.8
    ),
    Product(
        id = 2,
        name = "Reloj Inteligente Sport",
        description = "Seguimiento de actividad física, monitor de ritmo cardíaco y resistencia al agua hasta 50m.",
        price = 129.50,
        category = "Tecnología",
        rating = 4.6
    ),
    Product(
        id = 3,
        name = "Mochila Ergonómica",
        description = "Mochila resistente al agua con compartimento para portátil de 15.6 pulgadas y puerto de carga USB.",
        price = 45.00,
        category = "Accesorios",
        rating = 4.7
    ),
    Product(
        id = 4,
        name = "Teclado Mecánico RGB",
        description = "Teclado mecánico con switches silenciosos e iluminación RGB personalizable por tecla.",
        price = 74.99,
        category = "Informática",
        rating = 4.9
    ),
    Product(
        id = 5,
        name = "Botella Térmica Inox",
        description = "Botella de acero inoxidable de 750ml que mantiene bebidas frías durante 24 horas y calientes durante 12.",
        price = 22.90,
        category = "Hogar",
        rating = 4.5
    )
)

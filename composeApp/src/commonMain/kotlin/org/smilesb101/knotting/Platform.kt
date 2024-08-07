package org.smilesb101.knotting

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.smilesb101.knotting.platform

interface ViewModelMvi<in UserIntent : Any> {
    fun execute(intent: UserIntent)
}
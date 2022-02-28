package com.woigt.socioapp.data.entity

interface Mapper<I, O> {
    fun transform(t: I): O
}

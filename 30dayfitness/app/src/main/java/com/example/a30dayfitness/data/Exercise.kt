package com.example.a30dayfitness.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

import com.example.a30dayfitness.R

data class Exercise(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val day: Int,
    @StringRes val description: Int
)

val exercises = listOf(
Exercise(R.drawable.bench, R.string.exercise1,1,R.string.description1 ),
    Exercise(R.drawable.shoulder, R.string.exercise2,2,R.string.description2),
    Exercise(R.drawable.bicep, R.string.exercise3,3,R.string.description3 ),
    Exercise(R.drawable.tricep, R.string.exercise4,4,R.string.description4 ),
    Exercise(R.drawable.hammer, R.string.exercise5, 5, R.string.description5 ),
    Exercise(R.drawable.pullup, R.string.exercise6,6,R.string.description6 ),
    Exercise(R.drawable.pullup, R.string.exercise7,7,R.string.description7 ),
    Exercise(R.drawable.squats, R.string.exercise8,8,R.string.description8 ),
    Exercise(R.drawable.deadlift, R.string.exercise9,9,R.string.description9 ),
    Exercise(R.drawable.latpulldown, R.string.exercise10,10,R.string.description10 ),
    Exercise(R.drawable.bentrow, R.string.exercise11,11,R.string.description11 ),
    Exercise(R.drawable.legrow, R.string.exercise12,12,R.string.description12 ),
    Exercise(R.drawable.legpress, R.string.exercise13,13,R.string.description13 ),
    Exercise(R.drawable.ropeextension, R.string.exercise14,14,R.string.description14 ),
    Exercise(R.drawable.crunches, R.string.exercise15,15,R.string.description15),
    Exercise(R.drawable.pecfly, R.string.exercise16,16,R.string.description16 ),
    Exercise(R.drawable.lateralraise, R.string.exercise17,17,R.string.description17 ),
    Exercise(R.drawable.isorow, R.string.exercise18,18,R.string.description18 ),
    Exercise(R.drawable.reardelt, R.string.exercise19,19,R.string.description19 ),
    Exercise(R.drawable.isorow, R.string.exercise20,20,R.string.description20 ),
    Exercise(R.drawable.facepull, R.string.exercise21,21,R.string.description21 ),
    Exercise(R.drawable.legcurl, R.string.exercise22,22,R.string.description22),
    Exercise(R.drawable.calfraise, R.string.exercise23,23,R.string.description23 ),
    Exercise(R.drawable.spider_curl, R.string.exercise24,24,R.string.description24 ),
    Exercise(R.drawable.preachercurl, R.string.exercise25,25,R.string.description25 ),
    Exercise(R.drawable.inclinepress, R.string.exercise26,26,R.string.description26 ),
    Exercise(R.drawable.cable_fly, R.string.exercise27,27,R.string.description27 ),
    Exercise(R.drawable.skullcrusher, R.string.exercise28,28,R.string.description28 ),
    Exercise(R.drawable.reversecurl, R.string.exercise29,29,R.string.description29 ),
    Exercise(R.drawable.muscleup, R.string.exercise30,30,R.string.description30 ),



)

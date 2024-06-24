package com.example.rps

fun main (){

    var computerChoice = ""

    var playerChoice = ""

    val randomNumber = (1..3).random()

    println("Choose Rock, Paper or Scissors")

    playerChoice = readln()

    if(playerChoice =="Rock" || playerChoice =="rock" || playerChoice =="Paper" || playerChoice =="paper" || playerChoice =="Scissors" || playerChoice =="scissors"){

        when(randomNumber){

            1 -> {

                computerChoice = "Rock"

            }

            2 -> {

                computerChoice = "Paper"

            }

            3 -> {

                computerChoice = "Scissors"

            }

        }
        println("PC Choice is $computerChoice")
        val winner = when {

            playerChoice == computerChoice -> "Tie"

            (playerChoice == "Rock" || playerChoice == "rock" ) && computerChoice == "Scissors" -> "Player"

            (playerChoice == "Paper" || playerChoice == "paper") && computerChoice =="Rock" -> "Player"

            (playerChoice == "Scissors" || playerChoice == "scissors") && computerChoice =="Paper" -> "Player"

            else -> "PC"

        }
        if(winner == "Tie"){

            println("It is a Tie")

        }else{

            println("The winner is $winner")

        }


    }else{

        println("Input Error, Please try again")

    }


}
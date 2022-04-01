package com.example.lp4_quizapp

object Constants {
        fun getQuestions():ArrayList<Question>{
            val questionList = ArrayList<Question>()

            //1
            val q1 = Question(
                1,"What country does the flag belong to ?", R.drawable.ic_flag_of_argentina,
                "Argentina","India","Australia","Armenia",
                1
            )

            questionList.add(q1)


            //2
            val q2 = Question(
                1,"What country does the flag belong to ?",R.drawable.ic_flag_of_kuwait,
                "Belgium","Kuwait","Denmark","Fiji",
                1
            )

            questionList.add(q2)


            //3
            val q3 = Question(
                1,"What country does the flag belong to ?",R.drawable.ic_flag_of_australia,
                "New Zealand","Kuwait","Australia","Armenia",
                1
            )

            questionList.add(q3)


            //4
            val q4 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_belgium,
                "Kuwait","India","Brazil","Belgium",
                1
            )

            questionList.add(q4)

            //5
            val q5 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_brazil,
                "Belgium","Brazil","Denmark","Fiji",
                1
            )

            questionList.add(q5)

            //6
            val q6 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_denmark,
                "Fiji","Brazil","Denmark","Armenia",
                1
            )

            questionList.add(q6)

            //7
            val q7 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_fiji,
                "Fiji","Kuwait","Phillipines","Bangladesh",
                1
            )

            questionList.add(q7)

            //8
            val q8 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_germany,
                "Russia","Pakistan","Sri Lanka","Germany",
                1
            )

            questionList.add(q8)

            //9
            val q9 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_india,
                "England","India","Australia","UAE",
                1
            )

            questionList.add(q9)

            //10
            val q10 = Question(
                1,"What country does the flag belong to",R.drawable.ic_flag_of_new_zealand,
                "West Indies","Bangladesh","New Zealand","Afganisthan",
                1
            )

            questionList.add(q10)
            return questionList


        }
}
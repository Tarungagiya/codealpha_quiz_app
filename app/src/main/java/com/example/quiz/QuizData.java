package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizData {
    public static List<QuizList> getEasyLevelQuizList(){

        final List<QuizList> quizLists1 = new ArrayList<>();

        QuizList quiz1 = new QuizList("Where is Taj Mahel?","Delhi","Gujarat","Agra","Mumbai","Agra");
        quizLists1.add(quiz1);

        QuizList quiz2 = new QuizList("Where is Burj Khalifa?","India","Australia","USA","Dubai","Dubai");
        quizLists1.add(quiz2);

        QuizList quiz3 = new QuizList("Where is Lal-killa?","Gujrat","Delhi","USA","Dubai","Delhi");
        quizLists1.add(quiz3);

        QuizList quiz4 = new QuizList("Who is the Prime Minister of India?","Indira gandhi","Yogi","Narendra MOdi","Kejarival","Narendra MOdi");
        quizLists1.add(quiz4);

        QuizList quiz5 = new QuizList("Who is president of India?","Dropadi Murmur","Narendra MOdi","Yogi","Trump","Dropadi Murmur");
        quizLists1.add(quiz5);

        return quizLists1;
    }

    public static List<QuizList> getNormalLevelQuizList(){

        final List<QuizList> quizLists1 = new ArrayList<>();

        QuizList quiz1 = new QuizList("The largest mountain of India?","Mount Abu","Kamet","Girnar","Trisul","Mount Abu");
        quizLists1.add(quiz1);

        QuizList quiz2 = new QuizList("The largest mountain of World?","Mount Abu","Trisul","Kamet","Mount Everest","Mount Everest");
        quizLists1.add(quiz2);

        QuizList quiz3 = new QuizList("The largest mountain of Gujrat?","Trisul","Girnar","Mount Abu","Kamet","Girnar");
        quizLists1.add(quiz3);

        QuizList quiz4 = new QuizList("Who is the Prime Minister of India?","Indira gandhi","Yogi","Narendra MOdi","Kejarival","Narendra MOdi");
        quizLists1.add(quiz4);

        QuizList quiz5 = new QuizList("Who is president of India?","Dropadi Murmur","Narendra MOdi","Yogi","Trump","Dropadi Murmur");
        quizLists1.add(quiz5);

        return quizLists1;
    }

    public static List<QuizList> getHardLevelQuizList(){

        final List<QuizList> quizLists1 = new ArrayList<>();

        QuizList quiz1 = new QuizList("Ricky Ponting is also known as what?","The Rickster","Ponts","Ponter","Punter","Punter");
        quizLists1.add(quiz1);

        QuizList quiz2 = new QuizList("India won its Olympic hockey gold in?","1928","1932","1936","1948","1928");
        quizLists1.add(quiz2);

        QuizList quiz3 = new QuizList("Who won the 1993 King of the Ring?","Owen Hart","Bret Hart","Edge","Mabel","Bret Hart");
        quizLists1.add(quiz3);

        QuizList quiz4 = new QuizList("Who is the 1st ODI captain for India?","Ajit Wadekar","Bishen Singh Bedi","Nawab Pataudi","Vinoo Mankad","Ajit Wadekar");
        quizLists1.add(quiz4);

        QuizList quiz5 = new QuizList("Where did India play its 1st one day international match?","Lords","Headingley","Taunton","The oval","Headingley");
        quizLists1.add(quiz5);

        return quizLists1;
    }

}

package com.tikto.services;

import com.tikto.model.HighScore;

import java.util.ArrayList;
import java.util.List;

public class HighScoreService {
    private static List<HighScore> highScores = new ArrayList<HighScore>();

    public void addHighScore(HighScore score)
    {
        System.out.println("{addHighScore Adding: [" + score.getNickName() + "," + score.getScore() + "]");
        highScores.add(score);
    }

    public List<HighScore> getHighScores()
    {
        System.out.println("{getHighScores}:: start");
        return highScores;
    }

    public List<HighScore> getHighScoresForNickname(String nickname)
    {
        System.out.println("{getHighScoresForNickname}:: start");
        List<HighScore> userScores = new ArrayList<HighScore>();

        for (HighScore h: highScores){
            if (h.getNickName().equals(nickname))
            {
                userScores.add(h);
            }
        }
        return userScores;
    }

    public int getHighScoresSize()
    {
        System.out.println("{getHighScoresSize}:: start");
        return highScores.size();
    }

}

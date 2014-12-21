package com.sapphirine.rf.MovieRecommender;

import org.apache.mahout.cf.taste.common.TasteException;

/**
 * User Based Recommender
 *
 */
public class MovieRecommender 
{
    public static void main( String[] args ) throws TasteException
    {
    	RecommendationEngine engine = new RecommendationEngine();
    	engine.recommendForAllUsers();
    }
}

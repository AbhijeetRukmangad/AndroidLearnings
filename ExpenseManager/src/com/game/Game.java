package com.game;

import android.content.Context;

public class Game {
	
	public Context mContext;
	
	// By default size of board is 3 X 3
	private int mBoardSize = 3;
	
	public Game(Context context) {
		mContext = context.getApplicationContext();
	}
	
	public void setBoardSize(int size) {
		mBoardSize = size; 
	}
	
	public int getBoardSize() {
		return mBoardSize;
	}
	
	
		

}

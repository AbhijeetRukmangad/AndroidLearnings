package com.game;

import static com.util.Logger.logd;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.personalfinance.expenses.R;

public class GameActivity extends Activity {

	Game mGame;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		logd("Now showing game activity....");
		mGame = new Game(this);
	}

	@Override
	protected void onStart() {
		super.onStart();
		initView();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}

	protected void initView() {

		// Add blocks to game play area
		RelativeLayout playArea = (RelativeLayout) findViewById(R.id.gameactivity_layout_playarea);

		int id = 1500;
		int inc = 0;
		int boardSize = mGame.getBoardSize();

		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++, id++, inc++) {
				Button button = new Button(getApplicationContext());
				LayoutParams params = new LayoutParams(100, 100);

				int top = -1;
				int left = -1;

				// calculate top and left
				if (id % boardSize != 0) {
					left = id - 1;
				}

				if (id >= boardSize) {
					top = id - boardSize;
				}

				logd("id is " + id);
				logd("top is " + top);
				logd("left is " + left);

				if (top >= 0) {
					params.addRule(RelativeLayout.BELOW, top);
				}
				if (left >= 0) {
					params.addRule(RelativeLayout.RIGHT_OF, left);
				}
				button.setLayoutParams(params);

				logd("button added..");

				button.setId(id);
				button.setText(Integer.toString(inc));
//				button.setOnClickListener(mButtonListener);
				 button.setOnTouchListener(mButtonTouchListener);
				playArea.addView(button);
			}

			logd(playArea.getChildCount() + " buttons added to playarea");
		}

	}

	OnClickListener mButtonListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			logd("Buton clicked " + v + " with ID " + v.getId());
		}
	};

	OnTouchListener mButtonTouchListener = new OnTouchListener() {

		int xValue;
		int yValue;

		@Override
		public boolean onTouch(View view, MotionEvent event) {

//			logd("Event detected on button " + ((Button) view).getText()
//					+ "  with Id " + view.getId());

			switch (event.getAction()) {
			case MotionEvent.ACTION_MOVE: {
				// logd("view is " + view);
				// LayoutParams params = new LayoutParams(100, 100);
				// view.getX()
				// params.leftMargin = (int)event.getRawX();
				// params.rightMargin = (int)event.getRawY();
				// view.setLayoutParams(params);
				// logd("X = " + (int)event.getRawX() + "  Y = " +
				// (int)event.getRawY());
				// logd("X axis value = "
				// + (int) event.getAxisValue(MotionEvent.AXIS_X));
				// logd("Y axis value = "
				// + (int) event.getAxisValue(MotionEvent.AXIS_Y));
				break;
			}
			case MotionEvent.ACTION_DOWN: {
				xValue = (int) event.getAxisValue(MotionEvent.AXIS_X);
				yValue = (int) event.getAxisValue(MotionEvent.AXIS_Y);
				break;
			}
			case MotionEvent.ACTION_UP: {
				int xdiff = xValue
						- (int) event.getAxisValue(MotionEvent.AXIS_X);
				int ydiff = yValue
						- (int) event.getAxisValue(MotionEvent.AXIS_Y);

				// logd("xdiff = " + xdiff + "  ydiff = " + ydiff);

				if (Math.abs(xdiff) > Math.abs(ydiff)) {
					// more motion on X axis
					if (xdiff > 0) {
						showToastMessage("LEFT");
					} else {
						showToastMessage("RIGHT");
					}
				} else {
					// more motion on Y axis
					if (ydiff > 0) {
						showToastMessage("UP");
						if (view.getId() > 1500 + mGame.getBoardSize()) {
							mSWapTiles(view.getId(),
									view.getId() - mGame.getBoardSize());
						}
					} else {
						showToastMessage("DOWN");
					}
				}
				break;
			}
			default:
				return false;
			}

			return true;
		}

	};

	protected void showToastMessage(String message) {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}

	protected void mShiftTile(int id, int direction) {
		switch (direction) {
		// UP
		case 0: {
			if (id >= mGame.getBoardSize()) {

			}
			break;
		}
		// DOWN
		case 1: {
			break;
		}
		// LEFT
		case 2: {
			break;
		}
		// RIGHT
		case 3: {
			break;
		}
		}
	}

	protected void mSWapTiles(int tileId1, int tileId2) {
		logd("Swaping " + tileId1 + " with " + tileId2);
//		LayoutParams tempParams = (RelativeLayout.LayoutParams) (findViewById(tileId1))
//				.getLayoutParams();
//		findViewById(tileId1).setLayoutParams(
//				(findViewById(tileId2)).getLayoutParams());
//		findViewById(tileId2).setLayoutParams(tempParams);
		
		CharSequence tempString = ((Button)findViewById(tileId1)).getText();
		((Button)findViewById(tileId1)).setText(((Button)findViewById(tileId2)).getText());
		((Button)findViewById(tileId1)).setText(tempString);
		
		
	}

}

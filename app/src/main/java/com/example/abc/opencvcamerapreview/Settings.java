
package com.example.abc.opencvcamerapreview;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * Manages user preferences via SharedPreferences. 
 * 
 * @author Mariusz Nowostawski <mariusz@nowostawski.org>
 * 
 * Created: 1/09/2013
 */
public class Settings {

	/**
	 * Returns the current grid size.
	 * @return current grid size.
	 */
	public final static int getGridSize(final Context ctx) {
		final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
		return Integer.parseInt(prefs.getString(PREFS_GRID_SIZE, "4"));
	}
	
	/**
	 * Sets new value of the GridSize property.
	 *       
	 * @param ctx current context
	 * @param newValue new value
	 * @return returns <code>true</code> if the new value was successfully written 
	 * 	to persistent storage
	 */
	public final static boolean setGridSize(final Context ctx, final int newValue) {
		final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
		final Editor e = prefs.edit();
		e.putInt(PREFS_GRID_SIZE, newValue);
		return e.commit();
	}
	
	
	
	public final static String PREFS_GRID_SIZE = "prefs.grid.size";
	
	
}

package io.sqlc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.database.CursorWindow;

class CustomCursorFactory implements SQLiteDatabase.CursorFactory {
    private int windowSize;

    public CustomCursorFactory(int windowSize) {
        this.windowSize = windowSize;
    }

    @Override
    public Cursor newCursor(SQLiteDatabase db,
                            SQLiteCursorDriver masterQuery,
                            String editTable,
                            SQLiteQuery query) {
        SQLiteCursor cursor = new SQLiteCursor(db, masterQuery, editTable, query);
        cursor.setWindow(new CursorWindow("cursorWindow", windowSize));
        return cursor;
    }
}

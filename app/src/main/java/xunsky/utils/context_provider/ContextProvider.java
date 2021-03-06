package xunsky.utils.context_provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class ContextProvider {
    private static Context sContext;

    public static Context get(){
        if (sContext==null)
            throw new RuntimeException("ContextProvider.context is null");
        return sContext;
    }

    public static class ContextProviderInner extends ContentProvider{
        @Override
        public boolean onCreate() {
            sContext=getContext();
            return true;
        }



        @Override
        public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
            return null;
        }

        @Override
        public String getType(Uri uri) {
            return null;
        }

        @Override
        public Uri insert(Uri uri, ContentValues values) {
            return null;
        }

        @Override
        public int delete( Uri uri, String selection, String[] selectionArgs) {
            return 0;
        }

        @Override
        public int update( Uri uri, ContentValues values, String selection, String[] selectionArgs) {
            return 0;
        }
    }
}

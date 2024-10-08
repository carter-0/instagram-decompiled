package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.JYz  reason: case insensitive filesystem */
public abstract class C59805JYz {
    public static final String[] A00 = {"_data", DevServerEntity.COLUMN_DESCRIPTION};

    public static final String A00(Context context, Uri uri) {
        try {
            Cursor A01 = 0fM.A01(context.getContentResolver(), uri, (String) null, (String) null, new String[]{DevServerEntity.COLUMN_DESCRIPTION}, (String[]) null, 1483597648);
            if (A01 != null) {
                if (A01.getCount() > 0) {
                    A01.moveToFirst();
                    int columnIndex = A01.getColumnIndex(DevServerEntity.COLUMN_DESCRIPTION);
                    if (columnIndex >= 0) {
                        return A01.getString(columnIndex);
                    }
                    return null;
                }
                A01.close();
            }
        } catch (IllegalStateException | UnsupportedOperationException unused) {
        }
        return null;
    }
}

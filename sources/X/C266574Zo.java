package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: X.4Zo  reason: invalid class name and case insensitive filesystem */
public abstract class C266574Zo extends ContentProvider {
    public final boolean onCreate() {
        return true;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            Context context = getContext();
            0Pj r2 = C49849F9o.A01;
            if (!r2.A03(context)) {
                0Pj r1 = C49849F9o.A00;
                if (!r1.A03(context)) {
                    r2.A02(context);
                    r1.A02(context);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            getContext();
            AnonymousClass0jb r12 = AnonymousClass0jd.A04;
            Context context2 = C60960kU.A00;
            0qQ.A07(context2);
            19i A01 = r12.A00(context2).A01((0lg) null);
            if (A01 != null) {
                getContext();
                arrayList.add(Pxd.A00(438));
                arrayList.add(Pxd.A00(439));
                arrayList.add("COL_ORIGIN");
                arrayList2.add(A01.A01);
                arrayList2.add(Long.toString(A01.A00));
                arrayList2.add(A01.A02);
            }
            getContext();
            if (arrayList.isEmpty()) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor((String[]) arrayList.toArray(new String[arrayList.size()]));
            matrixCursor.addRow(arrayList2.toArray(new String[arrayList2.size()]));
            return matrixCursor;
        } catch (Exception e) {
            Log.e("AbstractPhoneIdProvider", "Failed to call queryForIds", e);
            String message = e.getMessage();
            if (message == null) {
                message = String.valueOf(e);
            }
            0wb.A06("AbstractPhoneIdProvider", message, e);
            return null;
        }
    }
}

package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* renamed from: X.Dis  reason: case insensitive filesystem */
public final class C46664Dis extends ContentProvider {
    public final boolean onCreate() {
        return true;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        0KC.A02(C46664Dis.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        0KC.A02(C46664Dis.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        0KC.A02(C46664Dis.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C49592EzB ezB;
        String str3;
        String str4;
        String str5;
        AnonymousClass2VO.A01.A01();
        if (!0Pj.A01(getContext())) {
            if (!((AnonymousClass0cT) AnonymousClass7TE.A14(C49277EsK.A00)).A03(getContext(), (Intent) null, (0bY) null)) {
                String A00 = AnonymousClass000.A00(102);
                0KC.A02(C46664Dis.class, A00);
                throw new SecurityException(A00);
            }
        }
        AnonymousClass0wW A0S = DbS.A0S(this);
        0qQ.A0B(A0S, 0);
        C239393Gh r1 = (C239393Gh) A0S.A01(C239393Gh.class, new C51763G0f(A0S, 9));
        synchronized (r1) {
            ezB = r1.A00;
        }
        String str6 = null;
        if (ezB != null) {
            str6 = ezB.A03;
        }
        String str7 = "";
        if (str6 == null) {
            str6 = str7;
        }
        if (ezB == null || (str3 = ezB.A02) == null) {
            str3 = str7;
        }
        if (ezB != null) {
            str4 = ezB.A00;
        } else {
            str4 = str7;
        }
        if (!(ezB == null || (str5 = ezB.A01) == null)) {
            str7 = str5;
        }
        MatrixCursor matrixCursor = new MatrixCursor(C49275EsI.A00);
        matrixCursor.addRow(new String[]{str6, str3, str4, str7});
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        0KC.A02(C46664Dis.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }
}

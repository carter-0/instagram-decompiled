package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.7iS  reason: invalid class name and case insensitive filesystem */
public final class C338737iS implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass86O A01;

    public C338737iS(1WY r1, AnonymousClass86O r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1 = this.A01.A01;
        1WY r8 = this.A00;
        Cursor A002 = 1wT.A00(r1, r8, false);
        try {
            int A012 = 1Wd.A01(A002, "miniGallerySurface");
            int A013 = 1Wd.A01(A002, "categoryId");
            int A014 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            int A015 = 1Wd.A01(A002, "syncedAt");
            int A016 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A017 = 1Wd.A01(A002, "isDefaultCategory");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                String string = A002.getString(A012);
                String string2 = A002.getString(A013);
                String string3 = A002.getString(A014);
                long j = A002.getLong(A015);
                String string4 = A002.getString(A016);
                boolean z = false;
                if (A002.getInt(A017) != 0) {
                    z = true;
                }
                arrayList.add(new C338797iY(string, string2, string3, string4, j, z));
            }
            return arrayList;
        } finally {
            A002.close();
            r8.A00();
        }
    }
}

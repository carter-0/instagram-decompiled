package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.5rD  reason: invalid class name and case insensitive filesystem */
public final class C297115rD implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass92T A01;

    public C297115rD(1WY r1, AnonymousClass92T r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1 = this.A01.A00;
        1WY r12 = this.A00;
        Cursor A002 = 1wT.A00(r1, r12, false);
        try {
            int A012 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(A002, "dictionary_key");
            int A014 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int A015 = 1Wd.A01(A002, "language");
            int A016 = 1Wd.A01(A002, "editable");
            int A017 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int A018 = 1Wd.A01(A002, "strategy_id");
            int A019 = 1Wd.A01(A002, "loadedVersion");
            int A0110 = 1Wd.A01(A002, "latestVersion");
            int A0111 = 1Wd.A01(A002, "supportsVersioning");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                long j = A002.getLong(A012);
                String string = A002.getString(A013);
                String string2 = A002.getString(A014);
                String string3 = A002.getString(A015);
                boolean z = false;
                if (A002.getInt(A016) != 0) {
                    z = true;
                }
                int i = A002.getInt(A017);
                int i2 = A002.getInt(A018);
                String string4 = A002.getString(A019);
                String string5 = A002.getString(A0110);
                boolean z2 = false;
                if (A002.getInt(A0111) != 0) {
                    z2 = true;
                }
                arrayList.add(new C297125rE(string, string2, string3, string4, string5, i, i2, j, z, z2));
            }
            return arrayList;
        } finally {
            A002.close();
            r12.A00();
        }
    }
}

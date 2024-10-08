package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.AsC  reason: case insensitive filesystem */
public final class C41329AsC implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass92T A01;

    public C41329AsC(1WY r1, AnonymousClass92T r2) {
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
            ArrayList A0o = AnonymousClass7TF.A0o(A002);
            while (A002.moveToNext()) {
                long j = A002.getLong(A012);
                String string = A002.getString(A013);
                String string2 = A002.getString(A014);
                String string3 = A002.getString(A015);
                boolean A1P = AnonymousClass7TF.A1P(A002.getInt(A016));
                A0o.add(new C297125rE(string, string2, string3, A002.getString(A019), A002.getString(A0110), A002.getInt(A017), A002.getInt(A018), j, A1P, AnonymousClass7TF.A1P(A002.getInt(A0111))));
            }
            return A0o;
        } finally {
            A002.close();
            r12.A00();
        }
    }
}

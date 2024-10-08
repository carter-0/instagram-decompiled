package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.AsI  reason: case insensitive filesystem */
public final class C41335AsI implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass93J A01;

    public C41335AsI(1WY r1, AnonymousClass93J r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r1 = this.A01.A01;
        1WY r6 = this.A00;
        Cursor A002 = 1wT.A00(r1, r6, false);
        try {
            int A012 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int A014 = 1Wd.A01(A002, "data");
            int A015 = 1Wd.A01(A002, "stored_time");
            int A016 = 1Wd.A01(A002, "ranking_score");
            ArrayList A0o = AnonymousClass7TF.A0o(A002);
            while (A002.moveToNext()) {
                A0o.add(new C300575xR(A002.getString(A012), A002.getString(A013), A002.getBlob(A014), A002.getFloat(A016), A002.getLong(A015)));
            }
            return A0o;
        } finally {
            A002.close();
            r6.A00();
        }
    }
}

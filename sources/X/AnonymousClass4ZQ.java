package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.4ZQ  reason: invalid class name */
public final class AnonymousClass4ZQ implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 1Vd A01;

    public AnonymousClass4ZQ(1WY r1, 1Vd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Float f;
        Long l;
        C251983oI r1 = this.A01.A01;
        1WY r8 = this.A00;
        Cursor A002 = 1wT.A00(r1, r8, false);
        try {
            int A012 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(A002, "ranking_weight");
            int A014 = 1Wd.A01(A002, "data");
            int A015 = 1Wd.A01(A002, "media_age");
            int A016 = 1Wd.A01(A002, "stored_age");
            int A017 = 1Wd.A01(A002, "item_type");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                String string = A002.getString(A012);
                if (A002.isNull(A013)) {
                    f = null;
                } else {
                    f = Float.valueOf(A002.getFloat(A013));
                }
                byte[] blob = A002.getBlob(A014);
                if (A002.isNull(A015)) {
                    l = null;
                } else {
                    l = Long.valueOf(A002.getLong(A015));
                }
                arrayList.add(new AnonymousClass4ZW(AnonymousClass4ZV.A00(A002.getString(A017)), f, l, string, blob, A002.getLong(A016)));
            }
            return arrayList;
        } finally {
            A002.close();
            r8.A00();
        }
    }
}

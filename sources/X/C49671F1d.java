package X;

import android.content.Context;

/* renamed from: X.F1d  reason: case insensitive filesystem */
public final class C49671F1d {
    public final Context A00;

    public final String A00() {
        C62880wX r3 = C61170le.A00;
        String string = DbT.A0g(r3).getString("google_ad_id", (String) null);
        if (string != null) {
            return string;
        }
        SFJ A002 = SFJ.A00(this.A00);
        if (A002 == null) {
            return null;
        }
        String str = A002.A01;
        if (str == null) {
            return str;
        }
        DbX.A1U(DbT.A0g(r3), "google_ad_id", str);
        return str;
    }

    public C49671F1d(Context context) {
        this.A00 = context;
    }
}

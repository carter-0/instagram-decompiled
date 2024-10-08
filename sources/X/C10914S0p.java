package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.S0p  reason: case insensitive filesystem */
public final class C10914S0p {
    public final /* synthetic */ C11235SGv A00;

    public C10914S0p(C11235SGv sGv) {
        this.A00 = sGv;
    }

    public final String A00(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        0TC r1 = this.A00.A00;
        Uri A002 = 0cp.A00(r1, str);
        if (A002 == null) {
            return "failed-to-parse";
        }
        Uri A003 = C11429STt.A00(A002, r1);
        if (TextUtils.isEmpty(A003.getHost())) {
            return A003.toString();
        }
        String A004 = 0SC.A00(A003, C11429STt.A00).A00();
        if (A004 == null) {
            return "failed-to-sanitize";
        }
        return A004;
    }
}

package X;

import android.graphics.RectF;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.LPh  reason: case insensitive filesystem */
public abstract class C64133LPh {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.8VT] */
    public static final AnonymousClass8VT A00(String str, String str2, int i, int i2) {
        boolean A1U = AnonymousClass7TF.A1U(0, str, str2);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 4);
        ? obj = new Object();
        obj.A00 = "";
        obj.A02 = str2;
        obj.A01 = str;
        obj.A03 = r1;
        obj.A04 = A1U;
        RectF A08 = JW0.A08(JW0.A01(i, i2), i, i2);
        obj.A03 = 0sr.A1P(JTU.A1b(A08, Float.valueOf(A08.left)));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.8VT] */
    public static final AnonymousClass8VT A01(String str, String str2, String str3, boolean z) {
        DbY.A1S(str, str3);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 4);
        ? obj = new Object();
        obj.A00 = str;
        obj.A02 = str3;
        obj.A01 = str2;
        obj.A03 = r1;
        obj.A04 = z;
        return obj;
    }

    public static final String A02(AnonymousClass8VT r2) {
        try {
            StringWriter A0v = JTO.A0v();
            17W A0Q = JTO.A0Q(A0v);
            LJY.A00(A0Q, r2);
            return JTR.A12(A0Q, A0v);
        } catch (IOException unused) {
            0KC.A0C("PendingHighlightsInfo_Error", "Error writing pending highlights info to string.");
            return "";
        }
    }
}

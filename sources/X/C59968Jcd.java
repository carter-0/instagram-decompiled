package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Jcd  reason: case insensitive filesystem */
public abstract class C59968Jcd {
    public static final void A01(0xI r3, AnonymousClass3Q2 r4, Throwable th) {
        ImmutableMap A00;
        if (th != null) {
            C2373637i.A01(r4);
            r4.A0E();
            String message = th.getMessage();
            if (message == null) {
                message = "No Message";
            }
            0wb.A05("ig_media_creation_ingestion_trace", message, 1, th);
            if (r3 != null && (A00 = C63375Kvw.A00(th)) != null) {
                0xF r1 = new 0xF();
                r1.A0C(A00);
                r3.A05(r1, "exception_data");
            }
        }
    }

    public static final void A00(0xI r2, AnonymousClass3Q2 r3) {
        String A0F = r3.A0F();
        if (A0F.length() > 0) {
            r2.A0C("waterfall_id", A0F);
        }
    }
}

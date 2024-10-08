package X;

import java.util.Map;

/* renamed from: X.Sqz  reason: case insensitive filesystem */
public final class C12298Sqz implements C13586TdE {
    public final Map A00 = AnonymousClass7TE.A1E();

    /* JADX WARNING: type inference failed for: r0v4, types: [X.RQb, java.lang.Object] */
    public final void AUd(Integer num, String str, String str2, long j) {
        C9128RQb rQb;
        String A0B = 002.A0B("LiteOverlayRenderer");
        Map map = this.A00;
        if (!map.containsKey(A0B)) {
            C8867RDi rDi = C8867RDi.FAILED_TO_DRAW;
            ? obj = new Object();
            obj.A01 = rDi;
            obj.A02 = "LiteOverlayRenderer";
            map.put(A0B, obj);
            rQb = obj;
        } else {
            C9128RQb rQb2 = (C9128RQb) map.get(A0B);
            rQb = rQb2;
            if (rQb2 == null) {
                return;
            }
        }
        rQb.A00++;
    }
}

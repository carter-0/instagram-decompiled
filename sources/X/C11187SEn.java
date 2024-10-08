package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.SEn  reason: case insensitive filesystem */
public final class C11187SEn {
    public final C13886Tj9 A00;
    public final Map A01;
    public final Map A02;

    public C11187SEn(C13886Tj9 tj9, Map map) {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A02 = A1E;
        if (map != null) {
            A1E.putAll(map);
        }
        this.A00 = tj9;
        this.A01 = AnonymousClass7TE.A1E();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C11284SJc r6, X.C11187SEn r7, java.lang.Exception r8, java.lang.String r9, org.json.JSONObject r10, long r11) {
        /*
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.Map r0 = r7.A02
            r5.putAll(r0)
            X.RF9 r0 = r6.A04
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.C66582MXn.A0w(r0)
            java.lang.String r0 = "segment_type"
            r5.put(r0, r1)
            int r0 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "segment_id"
            r5.put(r0, r1)
            long r1 = r6.A02
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 614(0x266, float:8.6E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x0037:
            r5.put(r0, r1)
        L_0x003a:
            if (r10 == 0) goto L_0x0045
            java.lang.String r1 = X.DbT.A10(r10)
            java.lang.String r0 = "debug"
            r5.put(r0, r1)
        L_0x0045:
            X.Tj9 r2 = r7.A00
            r3 = r8
            r4 = r9
            r6 = r11
            X.C9596Rda.A00(r2, r3, r4, r5, r6)
            return
        L_0x004e:
            long r1 = r6.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "estimated_chunk_size"
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11187SEn.A00(X.SJc, X.SEn, java.lang.Exception, java.lang.String, org.json.JSONObject, long):void");
    }
}

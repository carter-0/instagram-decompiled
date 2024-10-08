package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.S3y  reason: case insensitive filesystem */
public class C10986S3y {
    public final C62637KjI A00;

    public C10986S3y(C62637KjI kjI) {
        this.A00 = kjI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A00(X.C11286SJe r5, X.RQK r6, X.C11284SJc r7) {
        /*
            r4 = this;
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = r6.A00     // Catch:{ JSONException -> 0x003b }
            if (r2 == 0) goto L_0x000f
            int r1 = r2.length()     // Catch:{ JSONException -> 0x003b }
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 != 0) goto L_0x0022
            org.json.JSONObject r1 = X.C66580MXl.A17(r2)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "stream_id"
            java.lang.String r1 = X.Pxe.A0y(r0, r1)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Stream-Id"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x003b }
        L_0x0022:
            java.lang.String r1 = "Segment-Type"
            X.RF9 r0 = r7.A04     // Catch:{ JSONException -> 0x003b }
            int r0 = r0.A00     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x003b }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r2 = "Segment-Start-Offset"
            long r0 = r7.A03     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x003b }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x003b }
            return r3
        L_0x003b:
            r1 = move-exception
            java.lang.String r0 = "Invalid start response"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10986S3y.A00(X.SJe, X.RQK, X.SJc):java.util.Map");
    }

    public Map A01(RQK rqk) {
        HashMap A1E = AnonymousClass7TE.A1E();
        try {
            A1E.put("Stream-Id", Pxe.A0y("stream_id", C66580MXl.A17(rqk.A00)));
            return A1E;
        } catch (JSONException e) {
            throw Pxe.A0h("Invalid start Response", e);
        }
    }
}

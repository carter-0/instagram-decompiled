package X;

import java.util.ArrayList;

public final class OGG {
    public Integer A00;
    public String A01;
    public String A02;
    public ArrayList A03 = AnonymousClass7TE.A1C();
    public boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        r1 = (java.util.ArrayList) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OGG(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r4 = "is_group_thread"
            java.lang.String r5 = "recipient_id"
            java.lang.String r6 = "audience"
            java.lang.String r7 = "source_attribution"
            r9.<init>()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r9.A03 = r0
            java.lang.String r2 = "media_uri"
            boolean r0 = r10.has(r2)     // Catch:{ JSONException -> 0x00a3 }
            if (r0 == 0) goto L_0x0043
            java.util.ArrayList r1 = r9.A03     // Catch:{ JSONException -> 0x00a3 }
            java.lang.String r0 = r10.getString(r2)     // Catch:{ JSONException -> 0x00a3 }
            r1.add(r0)     // Catch:{ JSONException -> 0x00a3 }
        L_0x0022:
            boolean r0 = r10.has(r7)     // Catch:{ JSONException -> 0x00a3 }
            r8 = 0
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r10.getString(r7)     // Catch:{ JSONException -> 0x00a3 }
        L_0x002d:
            r9.A02 = r0     // Catch:{ JSONException -> 0x00a3 }
            boolean r0 = r10.has(r6)     // Catch:{ JSONException -> 0x00a3 }
            if (r0 == 0) goto L_0x0081
            int r7 = r10.getInt(r6)     // Catch:{ JSONException -> 0x00a3 }
            r0 = 3
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)     // Catch:{ JSONException -> 0x00a3 }
            int r3 = r6.length     // Catch:{ JSONException -> 0x00a3 }
            r2 = 0
            goto L_0x006c
        L_0x0041:
            r0 = r8
            goto L_0x002d
        L_0x0043:
            java.lang.String r1 = "media_uri_list"
            boolean r0 = r10.has(r1)     // Catch:{ JSONException -> 0x00a3 }
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList r3 = r9.A03     // Catch:{ JSONException -> 0x00a3 }
            X.4db r2 = X.C268554db.A02()     // Catch:{ JSONException -> 0x00a3 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ JSONException -> 0x00a3 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Object r1 = r2.A0E(r1, r0)     // Catch:{ JSONException -> 0x00a3 }
            boolean r0 = r1 instanceof java.util.ArrayList     // Catch:{ JSONException -> 0x00a3 }
            if (r0 == 0) goto L_0x0067
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ JSONException -> 0x00a3 }
            if (r1 == 0) goto L_0x0067
        L_0x0063:
            r3.addAll(r1)     // Catch:{ JSONException -> 0x00a3 }
            goto L_0x0022
        L_0x0067:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x00a3 }
            goto L_0x0063
        L_0x006c:
            if (r2 >= r3) goto L_0x0083
            r1 = r6[r2]     // Catch:{ JSONException -> 0x00a3 }
            int r0 = r1.intValue()     // Catch:{ JSONException -> 0x00a3 }
            switch(r0) {
                case 1: goto L_0x0079;
                case 2: goto L_0x007b;
                default: goto L_0x0077;
            }     // Catch:{ JSONException -> 0x00a3 }
        L_0x0077:
            r0 = 0
            goto L_0x007c
        L_0x0079:
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            if (r0 == r7) goto L_0x0085
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0081:
            r1 = r8
            goto L_0x0085
        L_0x0083:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ JSONException -> 0x00a3 }
        L_0x0085:
            r9.A00 = r1     // Catch:{ JSONException -> 0x00a3 }
            boolean r0 = r10.has(r5)     // Catch:{ JSONException -> 0x00a3 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r8 = r10.getString(r5)     // Catch:{ JSONException -> 0x00a3 }
        L_0x0091:
            r9.A01 = r8     // Catch:{ JSONException -> 0x00a3 }
            boolean r0 = r10.has(r4)     // Catch:{ JSONException -> 0x00a3 }
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r10.getBoolean(r4)     // Catch:{ JSONException -> 0x00a3 }
        L_0x009d:
            r9.A04 = r0     // Catch:{ JSONException -> 0x00a3 }
            goto L_0x00a2
        L_0x00a0:
            r0 = 0
            goto L_0x009d
        L_0x00a2:
            return
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OGG.<init>(org.json.JSONObject):void");
    }
}

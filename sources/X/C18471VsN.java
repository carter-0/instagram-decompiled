package X;

import java.util.List;

/* renamed from: X.VsN  reason: case insensitive filesystem */
public final class C18471VsN {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.VUc[]} */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.VsN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VUc, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C18471VsN A00(org.json.JSONObject r10) {
        /*
            r8 = 0
            if (r10 != 0) goto L_0x0004
            return r8
        L_0x0004:
            X.VsN r7 = new X.VsN
            r7.<init>()
            java.lang.String r9 = "name"
            java.lang.String r0 = r10.optString(r9, r8)
            r7.A00 = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = r10.optString(r0, r8)
            r7.A02 = r0
            java.lang.String r0 = "callsite"
            r10.optBoolean(r0)
            java.lang.String r1 = "buckets"
            boolean r0 = r10.isNull(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 0
        L_0x0027:
            r7.A03 = r0
            java.lang.String r0 = "override"
            java.lang.String r0 = r10.optString(r0, r8)
            r7.A01 = r0
            return r7
        L_0x0032:
            org.json.JSONArray r6 = r10.getJSONArray(r1)
            int r5 = r6.length()
            X.VUc[] r4 = new X.VUc[r5]
            r3 = 0
        L_0x003d:
            if (r3 >= r5) goto L_0x0063
            org.json.JSONObject r2 = r6.getJSONObject(r3)
            X.VUc r1 = new X.VUc
            r1.<init>()
            java.lang.String r0 = r2.optString(r9, r8)
            r1.A00 = r0
            java.lang.String r0 = "strategy"
            java.lang.String r0 = r2.optString(r0, r8)
            r1.A01 = r0
            java.lang.String r0 = "values"
            java.util.List r0 = X.W0X.A02(r0, r2)
            r1.A02 = r0
            r4[r3] = r1
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0063:
            java.util.List r0 = java.util.Arrays.asList(r4)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18471VsN.A00(org.json.JSONObject):X.VsN");
    }
}

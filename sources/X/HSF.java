package X;

public abstract class HSF {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r2 = r5.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject A00(X.I4U r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            org.json.JSONObject r3 = X.DbS.A11()
            java.lang.Object r5 = r6.A02
            boolean r4 = r5 instanceof android.view.View
            r2 = 0
            if (r4 == 0) goto L_0x001b
            r1 = r5
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x001b
            r0 = 2131443848(0x7f0b4088, float:1.8509776E38)
            java.lang.Object r2 = r1.getTag(r0)
        L_0x001b:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r1 = r0.getCanonicalName()
            java.lang.String r0 = "node_class"
            r3.put(r0, r1)
            if (r2 != 0) goto L_0x0032
            java.lang.Class r0 = r5.getClass()
            java.lang.String r2 = r0.getCanonicalName()
        L_0x0032:
            java.lang.String r0 = "class"
            r3.put(r0, r2)
            android.view.View r5 = (android.view.View) r5
            r0 = 2131428763(0x7f0b059b, float:1.847918E38)
            java.lang.Object r2 = r5.getTag(r0)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x00e8
            if (r2 == 0) goto L_0x00e8
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "bk:"
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = "simple_name"
            r3.put(r1, r0)
        L_0x0057:
            if (r4 == 0) goto L_0x0083
            int r2 = r5.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1 = 1
            if (r4 == 0) goto L_0x0083
            r0 = -1
            if (r2 == r0) goto L_0x0083
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            X.0qQ.A07(r1)
            r0 = 4201(0x1069, float:5.887E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
        L_0x0083:
            java.lang.Integer r0 = r6.A01
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00e5
            java.lang.String r1 = "VIEW"
        L_0x008f:
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.put(r0, r1)
            boolean r0 = r6 instanceof X.C59650JRs
            if (r0 == 0) goto L_0x00c0
            r0 = r6
            X.JRs r0 = (X.C59650JRs) r0
            X.JwK r4 = r0.BMF()
            org.json.JSONObject r2 = X.DbS.A11()
            boolean r1 = r4.A01
            java.lang.String r0 = "is_visible"
            r2.put(r0, r1)
            java.lang.Object r0 = r4.A00
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.lang.String r1 = r0.flattenToString()
            java.lang.String r0 = "bounds_on_screen"
            r2.put(r0, r1)
            java.lang.String r0 = "leaf_data"
            r3.put(r0, r2)
        L_0x00c0:
            java.util.List r1 = r6.A03
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x00f6
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r1.next()
            X.I4U r0 = (X.I4U) r0
            org.json.JSONObject r0 = A00(r0)
            r2.put(r0)
            goto L_0x00d1
        L_0x00e5:
            java.lang.String r1 = "LITHO"
            goto L_0x008f
        L_0x00e8:
            r0 = 2131432703(0x7f0b14ff, float:1.848717E38)
            java.lang.Object r0 = r5.getTag(r0)
            goto L_0x0050
        L_0x00f1:
            java.lang.String r0 = "children"
            r3.put(r0, r2)
        L_0x00f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSF.A00(X.I4U):org.json.JSONObject");
    }
}

package X;

import java.util.List;

/* renamed from: X.Lit  reason: case insensitive filesystem */
public final class C64832Lit implements AnonymousClass0lh {
    public static final C63904LBk A04 = new Object();
    public K1E A00;
    public Integer A01;
    public String A02;
    public List A03;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60762Jqt A00(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r2 = 0
            java.lang.String r0 = r5.A02
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x009a
            X.K1E r0 = r5.A00
            if (r0 == 0) goto L_0x0084
            java.util.List r0 = r0.A00
            r0.getClass()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x0084
            java.util.Iterator r1 = r0.iterator()
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r4 = r1.next()
            r0 = r4
            X.Koi r0 = (X.C62930Koi) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x0020
        L_0x0035:
            X.Koi r4 = (X.C62930Koi) r4
        L_0x0037:
            X.Jqt r3 = new X.Jqt
            r3.<init>()
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L_0x007f
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0079;
                case 2: goto L_0x007c;
                default: goto L_0x0047;
            }
        L_0x0047:
            java.lang.String r1 = "success"
        L_0x0049:
            java.lang.String r0 = "status"
            r3.A06(r0, r1)
            java.lang.String r0 = "upload_id"
            r3.A06(r0, r7)
            if (r4 == 0) goto L_0x0088
            java.util.List r0 = r4.A02
            if (r0 == 0) goto L_0x0088
            r2 = 0
            java.util.Iterator r1 = r0.iterator()
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            com.instagram.tagging.api.model.MediaSuggestedProductTag r0 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r0
            java.util.List r0 = r0.A02
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 != 0) goto L_0x0074
            X.0sn r0 = X.0sn.A00
        L_0x0074:
            int r2 = X.DbT.A01(r0, r2)
            goto L_0x005e
        L_0x0079:
            java.lang.String r1 = "fail"
            goto L_0x0049
        L_0x007c:
            java.lang.String r1 = "pending"
            goto L_0x0049
        L_0x007f:
            java.lang.String r1 = ""
            goto L_0x0049
        L_0x0082:
            r4 = r2
            goto L_0x0035
        L_0x0084:
            r4 = r2
            goto L_0x0037
        L_0x0086:
            long r0 = (long) r2
            goto L_0x0090
        L_0x0088:
            java.lang.Integer r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0094
            r0 = 0
        L_0x0090:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x0094:
            java.lang.String r0 = "suggestions_count"
            r3.A05(r0, r2)
            return r3
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64832Lit.A00(java.lang.String, java.lang.String):X.Jqt");
    }

    public final void onSessionWillEnd() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
    }
}

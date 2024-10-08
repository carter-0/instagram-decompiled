package X;

/* renamed from: X.6BK  reason: invalid class name */
public final class AnonymousClass6BK {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4 == 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C66628MZp A00(X.AnonymousClass5HJ r8) {
        /*
            r7 = this;
            java.lang.String r1 = r8.A0X
            java.lang.String r0 = "two_factor_trusted_notification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = ""
        L_0x000c:
            com.instagram.common.notifications.push.intf.PushChannelType r5 = r8.A0B
            if (r5 != 0) goto L_0x0012
            com.instagram.common.notifications.push.intf.PushChannelType r5 = com.instagram.common.notifications.push.intf.PushChannelType.A0D
        L_0x0012:
            X.5ER r3 = r8.A08
            if (r3 != 0) goto L_0x0018
            X.5ER r3 = X.AnonymousClass6BJ.A0S
        L_0x0018:
            X.MZp r2 = new X.MZp
            r2.<init>()
            java.lang.String r1 = r8.A12
            r2.A0F = r1
            java.lang.String r4 = r8.A0j
            if (r4 == 0) goto L_0x00f8
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r4)
        L_0x002b:
            r2.A09 = r1
            java.lang.String r1 = r8.A11
            r2.A0G = r1
            r2.A0C = r1
            java.lang.String r1 = r8.A0r
            r6 = 0
            if (r1 == 0) goto L_0x003f
            int r4 = r1.length()
            r1 = 0
            if (r4 != 0) goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            r1 = r1 ^ 1
            r2.A0O = r1
            java.lang.String r4 = r8.A1A
            if (r4 == 0) goto L_0x00f5
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r4)
        L_0x004e:
            r2.A0A = r1
            java.lang.String r1 = r8.A0X
            r2.A0D = r1
            r2.A0E = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A03 = r0
            boolean r0 = r8.A05()
            if (r0 != 0) goto L_0x0064
            boolean r0 = r8.A1S
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r6 = 1
        L_0x0065:
            r2.A0Q = r6
            java.lang.Long r0 = r8.A0L
            r2.A08 = r0
            java.lang.String r0 = r8.A0T
            r2.A0B = r0
            java.lang.String r0 = r8.A1G
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = r8.A1F
        L_0x0075:
            r2.A0H = r0
            r2.A02 = r5
            X.N4O r0 = r8.A05
            if (r0 == 0) goto L_0x00f3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = 1
            boolean r0 = r0.A00()
            if (r0 != r1) goto L_0x008e
            X.Nmi r0 = X.C69500Nmi.A04
            r4.add(r0)
        L_0x008e:
            boolean r0 = r8.A1U
            if (r0 == 0) goto L_0x0097
            X.Nmi r0 = X.C69500Nmi.A0E
            r4.add(r0)
        L_0x0097:
            r2.A0N = r4
            java.lang.String r0 = r8.A13
            r2.A0M = r0
            java.util.HashMap r1 = r8.A1J
            if (r1 != 0) goto L_0x00a5
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x00a5:
            java.lang.String r0 = r5.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0L = r0
            X.5Lz r0 = r8.A0A
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r0.A07
        L_0x00b7:
            r2.A0J = r0
            int r0 = r3.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            int r0 = r3.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            java.lang.String r0 = r8.A0j
            boolean r0 = X.C282435Db.A02(r0)
            r2.A0P = r0
            java.lang.String r1 = r8.A0x
            if (r1 == 0) goto L_0x00ee
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x00ee
            long r0 = r0.longValue()
        L_0x00e3:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            java.lang.String r0 = r8.A0s
            r2.A0I = r0
            return r2
        L_0x00ee:
            r0 = 0
            goto L_0x00e3
        L_0x00f1:
            r0 = 0
            goto L_0x00b7
        L_0x00f3:
            r4 = 0
            goto L_0x0097
        L_0x00f5:
            r1 = 0
            goto L_0x004e
        L_0x00f8:
            r1 = 0
            goto L_0x002b
        L_0x00fb:
            java.lang.String r0 = r8.A0g
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BK.A00(X.5HJ):X.MZp");
    }
}

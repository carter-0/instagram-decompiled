package X;

public final class EUT extends AnonymousClass2FB {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.util.BitSet A00(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = 30
            com.instagram.model.direct.DirectShareTarget r8 = (com.instagram.model.direct.DirectShareTarget) r8
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.util.BitSet r5 = X.DbS.A0w(r0)
            java.lang.String r1 = X.DbT.A0y(r8)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0023
            char r0 = r1.charAt(r6)
            char r0 = java.lang.Character.toLowerCase(r0)
            int r0 = r0 % 30
            r5.set(r0)
        L_0x0023:
            java.lang.String r1 = r8.A0J
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = ""
        L_0x0029:
            java.lang.String r0 = " "
            java.util.List r2 = X.DbW.A0o(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x006f
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x003d:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x006f
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = X.DbX.A0y(r2, r1)
        L_0x004d:
            java.lang.String[] r4 = X.DbU.A1b(r0, r6)
            int r3 = r4.length
            r2 = 0
        L_0x0053:
            if (r2 >= r3) goto L_0x0072
            r1 = r4[r2]
            if (r1 == 0) goto L_0x006c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006c
            char r0 = r1.charAt(r6)
            char r0 = java.lang.Character.toLowerCase(r0)
            int r0 = r0 % 30
            r5.set(r0)
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0053
        L_0x006f:
            X.0sn r0 = X.0sn.A00
            goto L_0x004d
        L_0x0072:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUT.A00(java.lang.Object, int):java.util.BitSet");
    }
}

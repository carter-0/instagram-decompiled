package X;

public final class F1H {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r2.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.ULk A00(X.C276544tV r10) {
        /*
            r9 = this;
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.String r2 = r10.A0E()
            r3 = 0
            if (r2 == 0) goto L_0x0012
            int r0 = r2.hashCode()
            switch(r0) {
                case -2119261262: goto L_0x0126;
                case -1866255949: goto L_0x011a;
                case -1782234803: goto L_0x010e;
                case -1335458389: goto L_0x0102;
                case -934641255: goto L_0x00f6;
                case -934521548: goto L_0x00ea;
                case -218232060: goto L_0x00de;
                case 96417: goto L_0x00d2;
                case 3015911: goto L_0x00c6;
                case 3046176: goto L_0x00ba;
                case 3089282: goto L_0x00ae;
                case 3237038: goto L_0x00a2;
                case 3343799: goto L_0x0097;
                case 3357525: goto L_0x008c;
                case 3377907: goto L_0x0081;
                case 3387192: goto L_0x0078;
                case 94627080: goto L_0x0075;
                case 94756344: goto L_0x006a;
                case 109400031: goto L_0x005f;
                case 1382682413: goto L_0x0054;
                case 1434631203: goto L_0x0049;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.String r0 = "Unsupported icon type: "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.3yO r2 = new X.3yO
            r2.<init>(r0)
            java.lang.String r0 = "BloksNavbarButton"
            X.1Kn.A03(r0, r2)
        L_0x0022:
            java.lang.String r4 = r10.A0G()
            r0 = 1
            boolean r8 = r10.A0T(r0)
            java.lang.String r0 = r10.A0F()
            java.lang.String r5 = X.C48719Ej4.A00(r0)
            java.lang.String r6 = r10.A0D()
            r0 = 43
            int r7 = r10.A03(r0, r1)
            r0 = 41
            X.4uI r2 = r10.A0A(r0)
            X.ULk r1 = new X.ULk
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0049:
            java.lang.String r0 = "settings"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0H
            goto L_0x0022
        L_0x0054:
            java.lang.String r0 = "payments"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0K
            goto L_0x0022
        L_0x005f:
            java.lang.String r0 = "share"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x0022
        L_0x006a:
            java.lang.String r0 = "close"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A09
            goto L_0x0022
        L_0x0075:
            java.lang.String r0 = "check"
            goto L_0x00b0
        L_0x0078:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0022
            goto L_0x0012
        L_0x0081:
            java.lang.String r0 = "next"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0022
        L_0x008c:
            java.lang.String r0 = "more"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0022
        L_0x0097:
            java.lang.String r0 = "mail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0I
            goto L_0x0022
        L_0x00a2:
            java.lang.String r0 = "info"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x0022
        L_0x00ae:
            java.lang.String r0 = "done"
        L_0x00b0:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            goto L_0x0022
        L_0x00ba:
            java.lang.String r0 = "cart"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0G
            goto L_0x0022
        L_0x00c6:
            java.lang.String r0 = "back"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0B
            goto L_0x0022
        L_0x00d2:
            java.lang.String r0 = "add"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            goto L_0x0022
        L_0x00de:
            java.lang.String r0 = "menu_horizontal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0F
            goto L_0x0022
        L_0x00ea:
            java.lang.String r0 = "report"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            goto L_0x0022
        L_0x00f6:
            java.lang.String r0 = "reload"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0D
            goto L_0x0022
        L_0x0102:
            java.lang.String r0 = "delete"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x0022
        L_0x010e:
            java.lang.String r0 = "questions"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0L
            goto L_0x0022
        L_0x011a:
            java.lang.String r0 = "edit_list"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0M
            goto L_0x0022
        L_0x0126:
            java.lang.String r0 = "sliders"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r3 = X.AnonymousClass05K.A0J
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F1H.A00(X.4tV):X.ULk");
    }
}

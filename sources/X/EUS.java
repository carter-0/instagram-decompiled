package X;

public final class EUS extends C50916Fkv {
    public final /* synthetic */ C46430Der A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EUS(C46430Der der) {
        super(der);
        this.A00 = der;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0166, code lost:
        if (r7.length() == 0) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dev(X.AnonymousClass1XT r11, java.lang.String r12) {
        /*
            r10 = this;
            X.7ax r11 = (X.C334247ax) r11
            r5 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r5, r12, r11)
            X.Der r4 = r10.A00
            X.7dC r9 = r11.FH3()
            java.util.List r2 = r11.getItems()
            X.C46430Der.A0M(r4, r2)
            int r1 = r2.size()
            X.Dew r0 = r4.A0J
            java.lang.String r7 = "paginationHelper"
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = r0.A00
            X.C46430Der.A0I(r4, r0, r1)
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r4.A0R
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 != 0) goto L_0x003d
        L_0x002f:
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x01db
            X.EVw r0 = r4.A0H
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x01db
        L_0x003d:
            int r0 = r12.length()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r8 = "followListAdapter"
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = r9.CCT()
            boolean r1 = X.AnonymousClass7TG.A1X(r0)
            r4.A0T = r1
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            r0.A0D = r1
        L_0x0059:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.C46430Der.A0U(r4, r2)
            if (r0 == 0) goto L_0x0068
            X.C46430Der.A0D(r4)
        L_0x0068:
            boolean r0 = X.C46430Der.A0U(r4, r2)
            if (r0 == 0) goto L_0x008e
            int r1 = r2.size()
            r0 = 10
            if (r1 >= r0) goto L_0x0079
            X.C46430Der.A0D(r4)
        L_0x0079:
            boolean r0 = r4.A0T
            if (r0 == 0) goto L_0x008e
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            java.util.Set r0 = r0.A0y
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x008e
            X.C46430Der.A0D(r4)
        L_0x008e:
            java.util.List r1 = r9.C2q()
            if (r1 != 0) goto L_0x0096
            X.0sn r1 = X.0sn.A00
        L_0x0096:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x009f
            X.C46430Der.A0O(r4, r1)
        L_0x009f:
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r11.CPt()
            if (r0 == 0) goto L_0x00b8
            android.content.Context r6 = r4.requireContext()
            long r0 = r11.AjP()
            X.FEJ.A02(r6, r0)
        L_0x00b8:
            java.lang.Boolean r0 = r9.BuD()
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ca
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            r0.A0L = r3
        L_0x00ca:
            X.Dew r1 = r4.A0J
            if (r1 == 0) goto L_0x010b
            java.lang.String r0 = r9.getNextMaxId()
            r1.A00 = r0
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x0134
            X.Dex r7 = r4.A0E
            if (r7 == 0) goto L_0x01fc
            java.util.List r0 = r9.Bey()
            if (r0 == 0) goto L_0x0124
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0126
            java.lang.Object r0 = r1.next()
            X.G8n r0 = (X.C51944G8n) r0
            java.lang.String r0 = r0.getName()
            r6.add(r0)
            goto L_0x00ea
        L_0x00fe:
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            r0.A0E(r2)
            X.F28 r3 = r4.A0G
            if (r3 != 0) goto L_0x0113
            java.lang.String r7 = "tailLoadPerfLogger"
        L_0x010b:
            X.0qQ.A0F(r7)
        L_0x010e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0113:
            int r2 = r3.A00
            if (r2 == 0) goto L_0x01ca
            X.02m r1 = r3.A01
            java.lang.String r0 = "users_added_to_view"
            r1.markerPoint(r2, r0)
            r0 = 2
            r3.A00(r0)
            goto L_0x01ca
        L_0x0124:
            X.0sn r6 = X.0sn.A00
        L_0x0126:
            java.lang.Integer r0 = r9.BCY()
            int r0 = X.AnonymousClass7TG.A0A(r0)
            X.Ex9 r0 = X.C46430Der.A04(r4, r6, r0)
            r7.A04 = r0
        L_0x0134:
            X.Dex r6 = r4.A0E
            if (r6 == 0) goto L_0x01fc
            X.7g5 r1 = r9.B8B()
            if (r1 == 0) goto L_0x01f9
            X.Fnb r0 = new X.Fnb
            r0.<init>(r1)
        L_0x0143:
            r6.A05 = r0
            r6.A0G(r5, r5)
            java.util.List r1 = r9.BAC()
            java.lang.Boolean r0 = r9.BUA()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            X.C46430Der.A0P(r4, r1, r0)
            boolean r0 = X.C46430Der.A0S(r4)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r7 = r4.A0P
            if (r7 == 0) goto L_0x0168
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L_0x0169
        L_0x0168:
            r1 = 1
        L_0x0169:
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x01dc
            X.Dex r6 = r4.A0E
            if (r6 == 0) goto L_0x01fc
            if (r7 != 0) goto L_0x0174
            r7 = r0
        L_0x0174:
            r6.A07 = r7
            r6.A0G(r5, r5)
        L_0x0179:
            java.lang.String r1 = r4.A0Q
            if (r1 == 0) goto L_0x018c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x018c
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            r0.A06 = r1
            r0.A0G(r5, r5)
        L_0x018c:
            java.lang.String r1 = r4.A0M
            if (r1 == 0) goto L_0x01ac
            java.lang.String r0 = "potential_spam"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01ac
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            r0.A0E = r3
            r0.A0G(r5, r5)
            X.Dex r1 = r4.A0E
            if (r1 == 0) goto L_0x01fc
            int r0 = r4.A00
            r1.A00 = r0
            r1.A0G(r5, r5)
        L_0x01ac:
            boolean r0 = X.C46430Der.A0T(r4)
            if (r0 == 0) goto L_0x01b5
            X.C46430Der.A0L(r4, r2)
        L_0x01b5:
            boolean r0 = X.C46430Der.A0S(r4)
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r4.A0e
            if (r0 == 0) goto L_0x00fe
            X.Dex r1 = r4.A0E
            if (r1 == 0) goto L_0x01fc
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r2)
            r1.A0F(r0)
        L_0x01ca:
            com.instagram.api.schemas.GraphGuardianContent r1 = r9.By9()
            if (r1 == 0) goto L_0x01d9
            X.Dex r0 = r4.A0E
            if (r0 == 0) goto L_0x01fc
            r0.A02 = r1
            r0.A0G(r5, r5)
        L_0x01d9:
            r4.A0e = r5
        L_0x01db:
            return
        L_0x01dc:
            java.util.List r0 = r9.BAC()
            if (r0 != 0) goto L_0x0179
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0179
            X.Dex r6 = r4.A0E
            if (r6 == 0) goto L_0x01fc
            android.content.Context r1 = r4.requireContext()
            r0 = 2131963236(0x7f132d64, float:1.956322E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x0174
        L_0x01f9:
            r0 = 0
            goto L_0x0143
        L_0x01fc:
            X.0qQ.A0F(r8)
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUS.Dev(X.1XT, java.lang.String):void");
    }
}

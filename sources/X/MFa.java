package X;

public final class MFa extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFa(Object obj, AnonymousClass4D7 r3, int i, boolean z, boolean z2) {
        super(2, r3);
        this.A03 = i;
        this.A04 = obj;
        this.A02 = z;
        this.A01 = z2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MFa, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.MFa, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        Object obj2;
        boolean z;
        boolean z2;
        int i;
        AnonymousClass4D7 r3 = r9;
        switch (this.A03) {
            case 0:
                obj2 = this.A04;
                z2 = this.A02;
                z = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                z = this.A01;
                z2 = this.A02;
                i = 1;
                break;
            case 2:
                return new MFa((C67744Mtx) this.A04, r9);
            case 3:
                obj2 = this.A04;
                z = this.A01;
                z2 = this.A02;
                i = 3;
                break;
            default:
                obj2 = this.A04;
                z = this.A01;
                z2 = this.A02;
                i = 4;
                break;
        }
        return new MFa(obj2, r3, i, z2, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MFa, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        if (r0 != r1) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ea, code lost:
        X.0eS.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0241, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        r0 = X.C64835Lix.A01(r5, r2, r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r7 = r24
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00ae;
                case 2: goto L_0x0120;
                case 3: goto L_0x0060;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x01ea
            X.0eS.A00(r7)
            java.lang.Object r3 = r0.A04
            X.JjA r3 = (X.C60309JjA) r3
            X.LQe r4 = r3.A08
            boolean r2 = r0.A01
            boolean r11 = r0.A02
            boolean r12 = r3.A0D
            r0.A00 = r5
            X.UzF r6 = X.C16679UzF.WISH_LIST
            boolean r2 = X.C64142LQe.A01(r6, r4, r2)
            if (r2 == 0) goto L_0x023f
            X.05G r2 = r4.A06
            int r3 = X.JTR.A0K(r2)
            X.05G r2 = r4.A04
            X.JwC r2 = X.JTO.A0P(r2)
            java.lang.Object r2 = r2.A03
            X.Jw7 r2 = (X.C61069Jw7) r2
            java.lang.Object r2 = r2.A02
            int r2 = X.DbS.A05(r2)
            if (r3 <= r2) goto L_0x023f
            X.Lix r2 = r4.A00
            java.lang.String r8 = r4.A01
            boolean r10 = r4.A07
            java.lang.String r9 = r4.A02
            java.lang.Integer r7 = X.JTU.A0V(r6)
            X.UKY r5 = new X.UKY
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3 = 30
            X.Wxb r4 = new X.Wxb
            r4.<init>(r3, r2, r5, r5)
        L_0x0059:
            java.lang.Object r0 = X.C64835Lix.A01(r5, r2, r0, r4)
        L_0x005d:
            if (r0 != r1) goto L_0x023f
        L_0x005f:
            return r1
        L_0x0060:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 != 0) goto L_0x01ea
            X.0eS.A00(r7)
            java.lang.Object r3 = r0.A04
            X.JjA r3 = (X.C60309JjA) r3
            X.LQe r5 = r3.A08
            boolean r2 = r0.A01
            boolean r11 = r0.A02
            boolean r12 = r3.A0D
            r0.A00 = r4
            X.UzF r6 = X.C16679UzF.RECENTLY_VIEWED
            boolean r2 = X.C64142LQe.A01(r6, r5, r2)
            if (r2 == 0) goto L_0x023f
            X.05G r2 = r5.A04
            X.JwC r2 = X.JTO.A0P(r2)
            java.lang.Object r4 = r2.A02
            X.Jw7 r4 = (X.C61069Jw7) r4
            java.lang.Object r3 = r4.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 == r2) goto L_0x023f
            java.lang.Object r2 = r4.A01
            boolean r2 = r2 instanceof X.C62085KZp
            if (r2 == 0) goto L_0x023f
            X.Lix r2 = r5.A00
            java.lang.String r8 = r5.A01
            boolean r10 = r5.A07
            java.lang.String r9 = r5.A02
            java.lang.Integer r7 = X.JTU.A0V(r6)
            X.UKY r5 = new X.UKY
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3 = 5
            X.Wvv r4 = new X.Wvv
            r4.<init>(r3, r5, r2)
            goto L_0x0059
        L_0x00ae:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x01ea
            X.0eS.A00(r7)
            java.lang.Object r2 = r0.A04
            X.Mtw r2 = (X.C67743Mtw) r2
            com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository r6 = r2.A03
            java.lang.String r7 = r2.A06
            com.instagram.model.direct.DirectThreadKey r2 = r2.A04
            java.lang.String r4 = r2.A00
            if (r4 == 0) goto L_0x01e5
            boolean r3 = r0.A01
            boolean r2 = r0.A02
            r0.A00 = r5
            java.lang.String r8 = "daily_prompt"
            r9 = r4
            r10 = r0
            r11 = r3
            r12 = r2
            java.lang.Object r0 = r6.A01(r7, r8, r9, r10, r11, r12)
            goto L_0x005d
        L_0x00d7:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0102
            X.0eS.A00(r7)
        L_0x00e1:
            r1 = r7
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f9
            X.3Ih r1 = X.JTT.A0j(r6)
        L_0x00ec:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x005f
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0242
            X.5sO r1 = X.JTU.A0R(r1)
            return r1
        L_0x00f9:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ec
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0102:
            X.0eS.A00(r7)
            java.lang.Object r2 = r0.A04
            com.instagram.archive.data.ArchiveStoryRepository r2 = (com.instagram.archive.data.ArchiveStoryRepository) r2
            com.instagram.common.session.UserSession r5 = r2.A03
            boolean r4 = r0.A02
            boolean r3 = r0.A01
            r0.A00 = r6
            r2 = 0
            X.1OC r3 = X.AnonymousClass738.A02(r2, r5, r4, r3)
            r2 = 953251634(0x38d17732, float:9.9880985E-5)
            java.lang.Object r7 = r3.A00(r2, r0)
            if (r7 != r1) goto L_0x00e1
            return r1
        L_0x0120:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x01a8
            boolean r3 = r0.A02
            boolean r4 = r0.A01
            X.0eS.A00(r7)
        L_0x012e:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r13 = r7.iterator()
        L_0x0138:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x01ee
            java.lang.Object r11 = r13.next()
            X.JvM r11 = (X.C61022JvM) r11
            r12 = 0
            X.0qQ.A0B(r11, r12)
            java.lang.String r10 = r11.A0A
            if (r10 == 0) goto L_0x01a6
            X.GKw r7 = new X.GKw
            r7.<init>(r10)
        L_0x0151:
            int r9 = r11.A05
            r1 = 2
            if (r9 == r8) goto L_0x019e
            if (r9 != r1) goto L_0x01de
            X.4Yx[] r6 = new X.C266444Yx[r1]
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r1 = 2131968286(0x7f13411e, float:1.9573462E38)
        L_0x015f:
            X.GKO r1 = X.DbS.A0Q(r2, r1)
            r6[r12] = r1
            r6[r8] = r7
            X.0qQ.A0B(r6, r12)
            java.util.List r6 = X.03t.A0I(r6)
            java.lang.String r2 = " • "
            java.lang.String r18 = ""
            r1 = 3
            X.0qQ.A0B(r6, r1)
            X.Uhc r15 = new X.Uhc
            r15.<init>(r2, r6)
            java.lang.String r7 = r11.A08
            int r6 = r11.A06
            if (r10 != 0) goto L_0x0183
            r10 = r18
        L_0x0183:
            java.lang.String r1 = r11.A09
            if (r1 == 0) goto L_0x0189
            r18 = r1
        L_0x0189:
            long r1 = r11.A07
            X.N30 r14 = new X.N30
            r19 = r6
            r20 = r9
            r21 = r1
            r17 = r10
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r5.add(r14)
            goto L_0x0138
        L_0x019e:
            X.4Yx[] r6 = new X.C266444Yx[r1]
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r1 = 2131964551(0x7f133287, float:1.9565887E38)
            goto L_0x015f
        L_0x01a6:
            r7 = 0
            goto L_0x0151
        L_0x01a8:
            X.0eS.A00(r7)
            java.lang.Object r5 = r0.A04
            X.Mtx r5 = (X.C67744Mtx) r5
            X.5Gf r2 = r5.A02
            boolean r4 = r2.A02()
            X.0xa r3 = r2.A01
            r2 = 344(0x158, float:4.82E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            boolean r3 = X.DbT.A1a(r3, r2)
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r9 = r5.A01
            r0.A01 = r4
            r0.A02 = r3
            r0.A00 = r8
            X.12T r2 = X.AnonymousClass12T.A00
            r7 = 0
            X.0nV r6 = X.DbX.A0c(r2)
            r5 = 9
            X.MGs r2 = new X.MGs
            r2.<init>(r9, r7, r5)
            java.lang.Object r7 = X.1Eo.A00(r0, r6, r2)
            if (r7 != r1) goto L_0x012e
            return r1
        L_0x01de:
            java.lang.String r0 = "deviceChangeType is not supported "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r9)
            throw r0
        L_0x01e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01ea:
            X.0eS.A00(r7)
            goto L_0x023f
        L_0x01ee:
            java.lang.Object r1 = r0.A04
            X.Mtx r1 = (X.C67744Mtx) r1
            com.instagram.common.session.UserSession r8 = r1.A00
            boolean r0 = X.AnonymousClass5OS.A00(r8)
            r14 = r0 ^ 1
            X.05G r7 = r1.A03
        L_0x01fc:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r11 = 4
            X.Jvy r1 = new X.Jvy
            r9 = r1
            r10 = r5
            r12 = r4
            r13 = r3
            r9.<init>((java.util.List) r10, (int) r11, (boolean) r12, (boolean) r13, (boolean) r14)
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            X.JwM r0 = X.C61084JwM.A00(r1, r2, r0)
            boolean r0 = r7.AIY(r6, r0)
            if (r0 == 0) goto L_0x01fc
            int r3 = r5.size()
            X.0Aj r2 = X.JTU.A09(r8)
            r0 = 1131(0x46b, float:1.585E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "source"
            java.lang.Long r1 = X.DbV.A0p(r2, r0, r1, r3)
            java.lang.String r0 = "number_of_alerts_in_setting_page"
            r2.A9F(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x023f
            r2.Cgf()
        L_0x023f:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0242:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFa) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFa(C67744Mtx mtx, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A03 = 2;
        this.A04 = mtx;
    }
}

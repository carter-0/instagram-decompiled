package X;

/* renamed from: X.MEd  reason: case insensitive filesystem */
public final class C66150MEd extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66150MEd(Object obj, String str, String str2, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEd, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        String str;
        boolean z;
        String str2;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        AnonymousClass4D7 r4 = r9;
        switch (i2) {
            case 0:
                str2 = this.A04;
                str = this.A03;
                z = this.A05;
                i = 0;
                break;
            case 1:
                z = this.A05;
                str2 = this.A04;
                str = this.A03;
                i = 1;
                break;
            case 2:
                str = this.A03;
                z = this.A05;
                str2 = this.A04;
                i = 2;
                break;
            default:
                str2 = this.A04;
                z = this.A05;
                str = this.A03;
                i = 3;
                break;
        }
        return new C66150MEd(obj2, str2, str, r4, i, z);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.MEd, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d1, code lost:
        X.0eS.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002d, code lost:
        if (r0 != r5) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r1 = r13.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r13.A00
            r6 = 1
            switch(r1) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x0098;
                case 2: goto L_0x0030;
                default: goto L_0x000a;
            }
        L_0x000a:
            if (r0 != 0) goto L_0x00d1
            X.0eS.A00(r14)
            java.lang.Object r1 = r13.A02
            X.Jhq r1 = (X.C60233Jhq) r1
            X.05G r0 = r1.A02
            java.lang.String r8 = r13.A04
            r0.Epw(r8)
            X.LQd r7 = r1.A01
            boolean r12 = r13.A05
            java.lang.String r9 = r13.A03
            r13.A00 = r6
            r10 = 0
            r11 = 3
            X.MFj r6 = new X.MFj
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.19E.A00(r13, r6)
        L_0x002d:
            if (r0 != r5) goto L_0x00d4
        L_0x002f:
            return r5
        L_0x0030:
            if (r0 != 0) goto L_0x00d1
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A02
            X.Ne1 r0 = (X.C69064Ne1) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            java.lang.String r4 = r13.A03
            boolean r1 = r13.A05
            java.lang.String r3 = r13.A04
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "direct_v2/update_channel_invite/"
            r2.A0A(r0)
            r0 = 2151(0x867, float:3.014E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A9m(r0, r4)
            if (r1 == 0) goto L_0x0095
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
        L_0x005b:
            r0 = 921(0x399, float:1.29E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A9m(r0, r1)
            java.lang.String r0 = "threadId"
            r2.A9m(r0, r3)
            java.lang.Class<X.K1A> r1 = X.K1A.class
            java.lang.Class<X.LIu> r0 = X.LIu.class
            X.1OC r1 = X.DbT.A0S(r2, r1, r0)
            r3 = 0
            r0 = 1695661322(0x6511bd0a, float:4.3014393E22)
            r2 = 0
            X.032 r1 = r1.A03(r0)
            X.MGs r0 = new X.MGs
            r0.<init>(r2, r3)
            X.0pz r2 = X.JUM.A04(r0, r1)
            r1 = 11
            X.MEQ r0 = new X.MEQ
            r0.<init>(r1, r3)
            X.0pz r0 = X.JUM.A03(r0, r2)
            r13.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A01(r13, r0)
            goto L_0x002d
        L_0x0095:
            java.lang.String r1 = "declined_by_receiver"
            goto L_0x005b
        L_0x0098:
            if (r0 != 0) goto L_0x00d1
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A02
            X.Jhj r0 = (X.C60226Jhj) r0
            com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository r3 = r0.A01
            boolean r2 = r13.A05
            java.lang.String r1 = r13.A04
            java.lang.String r0 = r13.A03
            r13.A00 = r6
            java.lang.Object r0 = r3.A01(r1, r0, r13, r2)
            goto L_0x002d
        L_0x00b1:
            if (r0 != 0) goto L_0x00d1
            X.0eS.A00(r14)
            java.lang.Object r4 = r13.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            java.lang.String r3 = r13.A04
            java.lang.String r2 = r13.A03
            boolean r1 = r13.A05
            r13.A00 = r6
            X.MMu r0 = new X.MMu
            r0.<init>(r3, r2, r1)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r4, r13, r0)
            if (r0 == r5) goto L_0x002f
            X.0gF r0 = X.C60340gF.A00
            goto L_0x002d
        L_0x00d1:
            X.0eS.A00(r14)
        L_0x00d4:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66150MEd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66150MEd) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

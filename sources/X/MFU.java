package X;

public final class MFU extends AnonymousClass1Ek implements 0sL {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFU(Object obj, AnonymousClass4D7 r3, int i, boolean z) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MFU, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MFU, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MFU, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.MFU, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        boolean z;
        Object obj2;
        int i;
        AnonymousClass4D7 r5 = r11;
        switch (this.A01) {
            case 0:
                return new MFU(this.A02, r5, 0, this.A03, this.A00);
            case 1:
                z = this.A03;
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                z = this.A03;
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                return new MFU(this.A02, r5, 3, this.A03, this.A00);
            default:
                ? mfu = new MFU(this.A02, r11, 4, this.A03);
                mfu.A00 = AnonymousClass7TE.A1a(obj);
                return mfu;
        }
        ? mfu2 = new MFU(obj2, r11, i, z);
        mfu2.A00 = AnonymousClass7TE.A1a(obj);
        return mfu2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r5.A03 == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r5.A03 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r2 = (X.AnonymousClass6D9) r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r3 == X.AnonymousClass7TF.A1Q((((X.AnonymousClass4M1) X.AnonymousClass6D9.A00(r2).A06).A02 > 0.0f ? 1 : (((X.AnonymousClass4M1) X.AnonymousClass6D9.A00(r2).A06).A02 == 0.0f ? 0 : -1)))) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r2.A02((java.lang.Integer) null, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0056;
                case 2: goto L_0x0060;
                case 3: goto L_0x0085;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0eS.A00(r6)
            boolean r4 = r5.A00
            java.lang.Object r3 = r5.A02
            com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment r3 = (com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment) r3
            com.instagram.igds.components.textcell.IgdsListCell r1 = r3.includeInProfileToggle
            if (r1 == 0) goto L_0x004d
            r0 = r4 ^ 1
            r1.setChecked(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r3.clipsOnlyToggle
            if (r0 == 0) goto L_0x004a
            r0.setChecked(r4)
            com.instagram.common.ui.base.IgTextView r2 = r3.footerText
            if (r2 == 0) goto L_0x0050
            android.content.Context r1 = r3.requireContext()
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0041
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x0041
            X.C51967G9n.A0v()
            r0 = 2131968848(0x7f134350, float:1.9574602E38)
            if (r4 == 0) goto L_0x003b
            r0 = 2131968847(0x7f13434f, float:1.95746E38)
        L_0x003b:
            X.DbT.A18(r1, r2, r0)
        L_0x003e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0041:
            r0 = 2131955632(0x7f130fb0, float:1.9547797E38)
            if (r4 == 0) goto L_0x003b
            r0 = 2131955630(0x7f130fae, float:1.9547793E38)
            goto L_0x003b
        L_0x004a:
            java.lang.String r0 = "clipsOnlyToggle"
            goto L_0x0052
        L_0x004d:
            java.lang.String r0 = "includeInProfileToggle"
            goto L_0x0052
        L_0x0050:
            java.lang.String r0 = "footerText"
        L_0x0052:
            X.0qQ.A0F(r0)
            goto L_0x00a5
        L_0x0056:
            X.0eS.A00(r6)
            boolean r3 = r5.A00
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x003e
            goto L_0x0069
        L_0x0060:
            X.0eS.A00(r6)
            boolean r3 = r5.A00
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x003e
        L_0x0069:
            java.lang.Object r2 = r5.A02
            X.6D9 r2 = (X.AnonymousClass6D9) r2
            X.Tol r0 = X.AnonymousClass6D9.A00(r2)
            X.4M3 r0 = r0.A06
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            float r1 = r0.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r3 == r0) goto L_0x003e
            r0 = 0
            r2.A02(r0, r3)
            goto L_0x003e
        L_0x0085:
            X.0eS.A00(r6)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x003e
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r5.A02
            X.DbS.A1U(r0)
            goto L_0x003e
        L_0x0096:
            X.0eS.A00(r6)
            boolean r1 = r5.A03
            boolean r0 = r5.A00
            if (r1 != 0) goto L_0x00a1
            if (r0 == 0) goto L_0x003e
        L_0x00a1:
            r0 = 0
            X.0qQ.A0A(r0)
        L_0x00a5:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFU) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFU(Object obj, AnonymousClass4D7 r3, int i, boolean z, boolean z2) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
        this.A00 = z2;
    }
}

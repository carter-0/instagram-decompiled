package X;

/* renamed from: X.Ilc  reason: case insensitive filesystem */
public final class C58086Ilc extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58086Ilc(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ilc, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        Object obj2;
        String str;
        int i;
        int i2 = this.A01;
        Object obj3 = this.A03;
        AnonymousClass4D7 r4 = r8;
        switch (i2) {
            case 0:
                str = this.A04;
                obj2 = this.A02;
                i = 0;
                break;
            case 1:
                str = this.A04;
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                str = this.A04;
                i = 2;
                break;
            default:
                str = this.A04;
                obj2 = this.A02;
                i = 3;
                break;
        }
        return new C58086Ilc(obj3, obj2, str, r4, i);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Ilc, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0195 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0110;
                case 1: goto L_0x00a9;
                case 2: goto L_0x0051;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x019b
            X.0eS.A00(r8)
        L_0x0011:
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r7.A02
            android.content.Context r2 = (android.content.Context) r2
            r1 = 0
            r0 = 2131972137(0x7f135029, float:1.9581273E38)
        L_0x001d:
            X.C59689JTv.A0F(r2, r1, r0)
        L_0x0020:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0023:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0196
            java.lang.Object r2 = r7.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "leave_campfire_failed"
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            goto L_0x001d
        L_0x0031:
            X.0eS.A00(r8)
            com.instagram.hallpass.util.HallPassApiUtil r2 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r0 = r7.A03
            X.6Z5 r0 = (X.AnonymousClass6Z5) r0
            com.instagram.common.session.UserSession r1 = r0.A09
            if (r1 != 0) goto L_0x0046
            X.DbS.A17()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0046:
            java.lang.String r0 = r7.A04
            r7.A00 = r3
            java.lang.Object r8 = r2.A05(r1, r0, r7)
            if (r8 != r4) goto L_0x0011
            return r4
        L_0x0051:
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            if (r0 == 0) goto L_0x008c
            if (r0 != r2) goto L_0x01a5
            X.0eS.A00(r8)
        L_0x005d:
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0083
            X.3Ih r8 = X.C51967G9n.A0d()
        L_0x0065:
            java.lang.String r2 = r7.A04
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0020
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01a0
            X.0wj r1 = X.0wj.A01
            r0 = 817902720(0x30c03480, float:1.398476E-9)
            X.0f9 r2 = r1.AEf(r2, r0)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Failed to write midcard seen"
            r2.ABQ(r1, r0)
            r2.report()
            goto L_0x0020
        L_0x0083:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0065
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008c:
            X.0eS.A00(r8)
            java.lang.Object r1 = r7.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A02
            X.GmI r0 = (X.C53332GmI) r0
            X.1OC r3 = X.C56369HxN.A01(r0, r1)
            r7.A00 = r2
            r2 = 575058749(0x2246b33d, float:2.6928892E-18)
            r1 = 2
            r0 = 0
            java.lang.Object r8 = r3.A02(r7, r2, r1, r0)
            if (r8 != r4) goto L_0x005d
            return r4
        L_0x00a9:
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x00d9
            if (r0 != r3) goto L_0x01aa
            X.0eS.A00(r8)
        L_0x00b5:
            X.3Ii r8 = (X.C239803Ii) r8
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f6
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r1 = r8.A00
            X.Jvg r1 = (X.C61042Jvg) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r7.A03
            X.GCg r0 = (X.C52034GCg) r0
            X.4DH r0 = r0.A05
            android.content.Context r2 = r0.getContext()
            r1 = 0
            r0 = 2131973611(0x7f1355eb, float:1.9584263E38)
            goto L_0x001d
        L_0x00d9:
            X.0eS.A00(r8)
            java.lang.Object r0 = r7.A03
            X.GCg r0 = (X.C52034GCg) r0
            com.instagram.common.session.UserSession r0 = r0.A0B
            com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl r2 = new com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl
            r2.<init>(r0)
            java.lang.String r1 = r7.A04
            java.lang.Object r0 = r7.A02
            com.instagram.api.schemas.MediaTrialGraduationStrategy r0 = (com.instagram.api.schemas.MediaTrialGraduationStrategy) r0
            r7.A00 = r3
            java.lang.Object r8 = r2.A00(r0, r1, r7)
            if (r8 != r4) goto L_0x00b5
            return r4
        L_0x00f6:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ff
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ff:
            java.lang.Object r0 = r7.A03
            X.GCg r0 = (X.C52034GCg) r0
            X.4DH r0 = r0.A05
            android.content.Context r2 = r0.getContext()
            java.lang.String r1 = "trial_update_graduation_strategy_failed"
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            goto L_0x001d
        L_0x0110:
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 4
            r5 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0123
            if (r0 == r3) goto L_0x0141
            if (r0 == r2) goto L_0x016f
            X.0eS.A00(r8)
            goto L_0x0020
        L_0x0123:
            X.0eS.A00(r8)
            java.lang.Object r0 = r7.A03
            X.GDI r0 = (X.GDI) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r0 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r0
            java.lang.String r1 = r7.A04
            r7.A00 = r3
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r0.A01
            X.2NP r0 = r0.A01
            java.lang.Object r8 = r0.A0H(r1, r7)
            if (r8 != r4) goto L_0x0144
            return r4
        L_0x0141:
            X.0eS.A00(r8)
        L_0x0144:
            boolean r0 = X.AnonymousClass7TE.A1a(r8)
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r7.A03
            X.GDI r0 = (X.GDI) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r1 = (com.instagram.clips.drafts.model.validation.ClipsDraftValidator) r1
            java.lang.String r0 = r7.A04
            r7.A00 = r2
            java.lang.Object r8 = r1.A01(r0, r7)
            if (r8 != r4) goto L_0x0172
            return r4
        L_0x0161:
            java.lang.Object r0 = r7.A03
            X.GDI r0 = (X.GDI) r0
            X.JU4 r3 = r0.A00
            X.Gql r2 = new X.Gql
            r2.<init>()
            r7.A00 = r6
            goto L_0x018f
        L_0x016f:
            X.0eS.A00(r8)
        L_0x0172:
            X.GO1 r8 = (X.GO1) r8
            java.util.List r0 = r8.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r7.A03
            X.GDI r0 = (X.GDI) r0
            X.JU4 r3 = r0.A00
            java.lang.Object r1 = r7.A02
            X.28D r1 = (X.28D) r1
            java.lang.String r0 = r7.A04
            X.Gqq r2 = new X.Gqq
            r2.<init>((X.28D) r1, (java.lang.String) r0)
            r7.A00 = r5
        L_0x018f:
            java.lang.Object r0 = r3.ELH(r2, r7)
            if (r0 != r4) goto L_0x0020
            return r4
        L_0x0196:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x019b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01a0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58086Ilc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58086Ilc) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

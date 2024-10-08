package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hqq  reason: case insensitive filesystem */
public final class C55985Hqq {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = C58684Ivt.A00(this, 19);
    public final AnonymousClass0eM A02 = C58684Ivt.A00(this, 20);
    public final AnonymousClass0eM A03 = C58684Ivt.A00(this, 21);
    public final AnonymousClass0eM A04 = C58684Ivt.A00(this, 22);

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0153, code lost:
        if (X.C246413eY.A00(r2).A02(r15, r0, r0) == false) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C53331GmH A00(android.content.Context r57, X.JQG r58, X.AnonymousClass3V2 r59, X.1Xj r60, X.AnonymousClass4DU r61, X.AnonymousClass3W1 r62, X.AnonymousClass2xS r63, int r64, int r65) {
        /*
            r56 = this;
            r23 = 0
            r0 = r60
            r1 = r23
            X.0qQ.A0B(r0, r1)
            r10 = 1
            r9 = 2
            r27 = r58
            r15 = r61
            r1 = r27
            int r22 = X.DbW.A03(r9, r15, r1)
            r21 = 4
            r25 = r59
            r2 = r25
            r1 = r21
            X.0qQ.A0B(r2, r1)
            r20 = 6
            r13 = r57
            r1 = r20
            X.0qQ.A0B(r13, r1)
            X.1Xj r7 = r0.A1b()
            X.3lZ r1 = X.C51966G9m.A0w(r0)
            r19 = 0
            if (r1 == 0) goto L_0x0097
            X.3xt r1 = r1.BF6()
            if (r1 == 0) goto L_0x0097
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r2 = r1.B7T()
        L_0x003f:
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r1 = com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum.PRODUCT_TAGS_SINGLE_MEDIA_TO_COLLECTION
            boolean r55 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.String r35 = r0.getId()
            java.lang.String r11 = "Required value was null."
            if (r35 == 0) goto L_0x023b
            r1 = r56
            com.instagram.common.session.UserSession r2 = r1.A00
            java.lang.String r36 = X.C231122qu.A07(r2, r0)
            X.1Xy r3 = r0.A0C
            java.util.List r8 = r3.Aok()
            if (r8 == 0) goto L_0x0236
            int r6 = r8.size()
            r5 = 1
        L_0x0062:
            if (r5 >= r6) goto L_0x009a
            X.1Xj r3 = X.DbZ.A0T(r8, r5)
            X.1Xy r3 = r3.A0C
            X.56P r4 = r3.C4I()
            if (r4 == 0) goto L_0x009a
            com.instagram.api.schemas.CornerStyle r3 = r4.ArW()
            if (r3 == 0) goto L_0x009a
            com.instagram.api.schemas.CornerStyle r4 = r4.ArW()
            r3 = -1
            if (r4 == 0) goto L_0x0094
            int r4 = r4.ordinal()
            if (r4 == r3) goto L_0x0094
            r3 = r22
            if (r4 == r3) goto L_0x009a
            if (r4 == r9) goto L_0x009d
            r3 = r23
            if (r4 == r3) goto L_0x0094
            if (r4 == r10) goto L_0x0094
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0094:
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0097:
            r2 = r19
            goto L_0x003f
        L_0x009a:
            java.lang.Integer r34 = X.AnonymousClass05K.A00
            goto L_0x009f
        L_0x009d:
            java.lang.Integer r34 = X.AnonymousClass05K.A01
        L_0x009f:
            float r38 = r7.A0l()
            X.0eM r3 = r1.A02
            java.lang.Object r3 = r3.getValue()
            X.3fS r3 = (X.C246923fS) r3
            X.3fX r28 = r3.A00(r13, r7)
            X.0eM r3 = r1.A03
            java.lang.Object r4 = r3.getValue()
            X.4Jd r4 = (X.AnonymousClass4Jd) r4
            java.lang.String r3 = r15.getModuleName()
            X.9IB r24 = r4.A00(r0, r3)
            X.1Xy r3 = r0.A0C
            java.util.List r6 = r3.Aok()
            if (r6 == 0) goto L_0x0231
            int r18 = X.C51966G9m.A06(r6)
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            r5 = 0
        L_0x00d0:
            r9 = r62
            r3 = r18
            if (r5 >= r3) goto L_0x013a
            int r5 = r5 + 1
            java.lang.Object r4 = r6.get(r5)
            X.1Xj r4 = (X.1Xj) r4
            X.0eM r3 = r1.A01
            java.lang.Object r3 = r3.getValue()
            X.Hkp r3 = (X.C55630Hkp) r3
            r8 = r22
            X.0qQ.A0B(r4, r8)
            float r16 = r4.A0l()
            X.0eM r8 = r3.A01
            java.lang.Object r8 = r8.getValue()
            X.3fS r8 = (X.C246923fS) r8
            X.3fX r14 = r8.A00(r13, r4)
            r40 = 17
            X.J7t r12 = new X.J7t
            r39 = r12
            r41 = r3
            r42 = r15
            r43 = r4
            r44 = r0
            r39.<init>(r40, r41, r42, r43, r44)
            r10 = 10
            X.JK1 r8 = new X.JK1
            r3 = r25
            r8.<init>((int) r10, (java.lang.Object) r4, (java.lang.Object) r3, (java.lang.Object) r9)
            X.JJT r11 = new X.JJT
            r39 = r11
            r40 = r10
            r41 = r9
            r42 = r4
            r43 = r0
            r44 = r3
            r39.<init>(r40, r41, r42, r43, r44)
            r4 = 42
            X.JwM r3 = new X.JwM
            r3.<init>((int) r4, (java.lang.Object) r11, (java.lang.Object) r8, (java.lang.Object) r12)
            X.GlF r8 = new X.GlF
            r4 = r16
            r8.<init>(r3, r14, r4)
            r3 = r17
            r3.add(r8)
            goto L_0x00d0
        L_0x013a:
            boolean r5 = r7.A6W(r2)
            X.9IQ r6 = new X.9IQ
            r4 = r19
            r3 = r20
            r6.<init>((java.lang.Integer) r4, (int) r3, (boolean) r5)
            if (r55 != 0) goto L_0x0155
            X.3eZ r3 = X.C246413eY.A00(r2)
            boolean r3 = r3.A02(r15, r0, r0)
            r39 = 1
            if (r3 != 0) goto L_0x0157
        L_0x0155:
            r39 = 0
        L_0x0157:
            X.3eW r40 = X.C246393eW.A00
            r41 = r13
            r42 = r2
            r43 = r0
            r44 = r0
            r45 = r15
            r46 = r9
            r47 = r4
            X.4Fv r31 = r40.A00(r41, r42, r43, r44, r45, r46, r47)
            X.4jJ r3 = X.C271614jJ.A00
            X.50X r30 = r3.A00(r2, r0, r15, r9)
            X.0eM r3 = r1.A04
            java.lang.Object r4 = r3.getValue()
            X.3fg r4 = (X.C247043fg) r4
            X.1Xj r3 = r0.A1b()
            X.3fk r32 = r4.A00(r3, r9)
            X.9J0 r26 = X.C262724Ft.A00(r2, r0, r15, r9)
            X.1Xj r2 = r0.A1b()
            r3 = r63
            X.3TO r33 = r3.A02(r2)
            X.1Xj r2 = r0.A1b()
            X.3da r29 = r3.A01(r2)
            X.HMq r3 = r0.A1s()
            X.HMq r2 = X.C54659HMq.TOP_MAIN_BOTTOM_SCROLLABLE_THUMBNAILS
            boolean r40 = X.AnonymousClass7TF.A1W(r3, r2)
            X.IxY r43 = new X.IxY
            r48 = r64
            r44 = r27
            r45 = r0
            r47 = r25
            r49 = r21
            r43.<init>(r44, r45, r46, r47, r48, r49)
            X.GVC r47 = new X.GVC
            r49 = r25
            r50 = r9
            r51 = r0
            r52 = r27
            r53 = r48
            r54 = r20
            r48 = r47
            r48.<init>(r49, r50, r51, r52, r53, r54)
            r49 = 47
            X.IxG r48 = new X.IxG
            r51 = r1
            r52 = r15
            r53 = r0
            r48.<init>(r49, r50, r51, r52, r53)
            r2 = 45
            r3 = r65
            X.JGN r46 = X.JGN.A01(r1, r13, r0, r3, r2)
            r2 = 20
            X.J6S r45 = X.J6S.A00(r0, r9, r2)
            X.J8W r44 = new X.J8W
            r49 = r44
            r50 = r23
            r52 = r0
            r53 = r15
            r54 = r9
            r49.<init>(r50, r51, r52, r53, r54, r55)
            X.Jvx r27 = new X.Jvx
            r41 = r27
            r42 = r22
            r41.<init>((int) r42, (java.lang.Object) r43, (java.lang.Object) r44, (java.lang.Object) r45, (java.lang.Object) r46, (java.lang.Object) r47, (java.lang.Object) r48)
            X.3lZ r1 = X.C51966G9m.A0w(r0)
            if (r1 == 0) goto L_0x022e
            X.3xt r1 = r1.BF6()
            if (r1 == 0) goto L_0x022e
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r2 = r1.B7T()
        L_0x0206:
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r1 = com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum.PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION
            boolean r41 = X.AnonymousClass7TF.A1W(r2, r1)
            X.3lZ r0 = X.C51966G9m.A0w(r0)
            if (r0 == 0) goto L_0x021c
            X.3xt r0 = r0.BF6()
            if (r0 == 0) goto L_0x021c
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r19 = r0.B7T()
        L_0x021c:
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r1 = com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum.PROFILE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION
            r0 = r19
            boolean r42 = X.AnonymousClass7TF.A1W(r0, r1)
            X.GmH r23 = new X.GmH
            r37 = r17
            r25 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r23
        L_0x022e:
            r2 = r19
            goto L_0x0206
        L_0x0231:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0236:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x023b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55985Hqq.A00(android.content.Context, X.JQG, X.3V2, X.1Xj, X.4DU, X.3W1, X.2xS, int, int):X.GmH");
    }

    public C55985Hqq(UserSession userSession) {
        this.A00 = userSession;
    }
}

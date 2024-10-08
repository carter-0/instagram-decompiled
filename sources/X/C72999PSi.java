package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PSi  reason: case insensitive filesystem */
public final class C72999PSi implements 1aV {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ OIL A02;
    public final /* synthetic */ AnonymousClass7H8 A03;
    public final /* synthetic */ AnonymousClass77B A04;
    public final /* synthetic */ C66819MdB A05;
    public final /* synthetic */ C254783t2 A06;
    public final /* synthetic */ boolean A07;

    public C72999PSi(AnonymousClass0iw r1, UserSession userSession, OIL oil, AnonymousClass7H8 r4, AnonymousClass77B r5, C66819MdB mdB, C254783t2 r7, boolean z) {
        this.A02 = oil;
        this.A04 = r5;
        this.A01 = userSession;
        this.A00 = r1;
        this.A07 = z;
        this.A05 = mdB;
        this.A03 = r4;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00be, code lost:
        if (r1.length() == 0) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r47) {
        /*
            r46 = this;
            r3 = r47
            X.3xP r3 = (X.C257443xP) r3
            r4 = r46
            X.OIL r2 = r4.A02
            X.3oV r0 = r2.A07
            android.view.View r1 = r0.getView()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r1
            X.77B r5 = r4.A04
            float r0 = r5.A02
            r1.A00 = r0
            X.Nhg r0 = r2.A0A
            java.lang.Object r1 = r3.A04()
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.session.UserSession r11 = r4.A01
            X.0iw r10 = r4.A00
            boolean r9 = r4.A07
            X.MdB r6 = r4.A05
            X.7H8 r2 = r4.A03
            X.7GR r2 = r2.A02
            X.3t2 r4 = r4.A06
            r38 = 0
            r3 = 6
            X.0qQ.A0B(r2, r3)
            X.1Xj r7 = r5.A0E
            r3 = 1
            if (r7 == 0) goto L_0x00b0
            X.3WR r14 = r7.CEL()
        L_0x003b:
            java.lang.Long r8 = r5.A0M
            r0.A02 = r8
            boolean r8 = r5.A0p
            r0.A05 = r8
            r0.A00 = r6
            java.lang.String r8 = r5.A0N
            r2.A01(r8)
            android.widget.SeekBar r12 = r0.A0C
            android.widget.SeekBar$OnSeekBarChangeListener r6 = r0.A0B
            r12.setOnSeekBarChangeListener(r6)
            com.instagram.common.ui.base.IgSimpleImageView r12 = r0.A0D
            r6 = 4
            X.C71401Ok0.A01(r12, r6, r0)
            X.3tH r16 = X.AnonymousClass4KK.A00(r4)
            java.lang.Boolean r6 = r5.A0J
            java.lang.Long r13 = r5.A0K
            boolean r12 = r5.A0q
            r5 = 0
            if (r4 == 0) goto L_0x00ad
            java.lang.String r24 = X.AnonymousClass4KK.A02(r4)
        L_0x0068:
            X.1iA r18 = X.1iA.A0a
            java.lang.Integer r20 = X.AnonymousClass05K.A0u
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            X.N89 r15 = new X.N89
            r17 = r7
            r19 = r6
            r22 = r13
            r23 = r8
            r25 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.C69226Nhg.A00(r10, r11, r0, r2)
            X.Pc9 r4 = new X.Pc9
            r16 = r4
            r17 = r10
            r18 = r11
            r19 = r15
            r20 = r0
            r21 = r2
            r22 = r14
            r23 = r1
            r24 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.A03 = r4
            if (r9 != 0) goto L_0x00a3
            boolean r2 = X.AnonymousClass7TF.A1Y(r6, r3)
            if (r2 == 0) goto L_0x00a3
            if (r1 == 0) goto L_0x00ac
        L_0x00a3:
            java.lang.Runnable r1 = r0.A03
            if (r1 == 0) goto L_0x00aa
            r1.run()
        L_0x00aa:
            r0.A03 = r5
        L_0x00ac:
            return
        L_0x00ad:
            r24 = r5
            goto L_0x0068
        L_0x00b0:
            java.lang.Integer r20 = X.AnonymousClass05K.A1F
            java.lang.String r22 = X.AnonymousClass7TG.A0j()
            r15 = 0
            if (r1 == 0) goto L_0x00c0
            int r12 = r1.length()
            r8 = 0
            if (r12 != 0) goto L_0x00c1
        L_0x00c0:
            r8 = 1
        L_0x00c1:
            r44 = r8 ^ 1
            r36 = -1
            r34 = -1
            X.3WR r14 = new X.3WR
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r21 = r15
            r23 = r15
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r29 = r15
            r30 = r15
            r31 = r15
            r32 = r15
            r33 = r15
            r35 = r34
            r39 = r38
            r40 = r38
            r41 = r3
            r42 = r38
            r43 = r38
            r45 = r38
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72999PSi.accept(java.lang.Object):void");
    }
}

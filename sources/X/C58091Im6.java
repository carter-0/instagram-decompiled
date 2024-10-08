package X;

/* renamed from: X.Im6  reason: case insensitive filesystem */
public final class C58091Im6 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58091Im6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, AnonymousClass4D7 r14, int i) {
        super(2, r14);
        this.A01 = i;
        this.A0D = obj;
        this.A0A = obj2;
        this.A05 = obj3;
        this.A0B = obj4;
        this.A07 = obj5;
        this.A04 = obj6;
        this.A08 = obj7;
        this.A09 = obj8;
        this.A06 = obj9;
        this.A0C = obj10;
        this.A03 = obj11;
        this.A02 = obj12;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Im6, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r17) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i;
        AnonymousClass4D7 r13 = r17;
        if (this.A01 != 0) {
            obj9 = this.A09;
            obj4 = this.A05;
            obj3 = this.A0A;
            obj12 = this.A03;
            obj7 = this.A04;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj2 = this.A0D;
            obj13 = this.A02;
            obj10 = this.A06;
            obj8 = this.A08;
            obj11 = this.A0C;
            i = 1;
        } else {
            obj2 = this.A0D;
            obj3 = this.A0A;
            obj4 = this.A05;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj7 = this.A04;
            obj8 = this.A08;
            obj9 = this.A09;
            obj10 = this.A06;
            obj11 = this.A0C;
            obj12 = this.A03;
            obj13 = this.A02;
            i = 0;
        }
        return new C58091Im6(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, r13, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Im6, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r4 = r25
            int r1 = r0.A01
            X.1Hj r2 = X.1Hj.A02
            if (r1 == 0) goto L_0x0128
            int r5 = r0.A00
            r3 = 2
            r1 = 1
            if (r5 == 0) goto L_0x00e2
            if (r5 == r1) goto L_0x00f8
            X.0eS.A00(r4)
        L_0x0015:
            X.3Ii r4 = (X.C239803Ii) r4
            if (r4 == 0) goto L_0x0084
            java.lang.Object r2 = r0.A05
            com.instagram.clips.intf.ClipsViewerSource r2 = (com.instagram.clips.intf.ClipsViewerSource) r2
            java.lang.Object r8 = r0.A0A
            X.4DH r8 = (X.AnonymousClass4DH) r8
            java.lang.Object r12 = r0.A03
            X.0iw r12 = (X.AnonymousClass0iw) r12
            java.lang.Object r13 = r0.A04
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13
            java.lang.Object r15 = r0.A0B
            X.1Xj r15 = (X.1Xj) r15
            java.lang.Object r7 = r0.A07
            X.GDe r7 = (X.C52058GDe) r7
            java.lang.Object r6 = r0.A0D
            X.Hlh r6 = (X.C55684Hlh) r6
            java.lang.Object r9 = r0.A02
            androidx.fragment.app.FragmentActivity r9 = (androidx.fragment.app.FragmentActivity) r9
            java.lang.Object r0 = r0.A06
            X.4bN r0 = (X.C267324bN) r0
            boolean r5 = r4 instanceof X.C239793Ih
            if (r5 == 0) goto L_0x00d9
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r4 = r4.A00
            X.1s9 r4 = (X.C67161s9) r4
            if (r4 == 0) goto L_0x0090
            X.4bJ r4 = r4.BZ6()
            if (r4 == 0) goto L_0x0090
            java.lang.Boolean r5 = r4.BP3()
            r4 = 0
            boolean r5 = X.AnonymousClass7TF.A1Y(r5, r4)
            if (r5 == 0) goto L_0x0090
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.SEQUENCE_ORIGINAL_REEL
            if (r2 == r0) goto L_0x008d
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.SEQUENCE_REEL_CTA
            if (r2 == r0) goto L_0x008d
            com.instagram.api.schemas.ClipsMashupType r1 = com.instagram.api.schemas.ClipsMashupType.A0B
        L_0x0064:
            com.instagram.api.schemas.ClipsMashupType r0 = com.instagram.api.schemas.ClipsMashupType.A0A
            android.content.Context r3 = r8.getContext()
            if (r1 != r0) goto L_0x0087
            java.lang.String r1 = "sequencing_unavailable"
            r0 = 2131956128(0x7f1311a0, float:1.9548803E38)
        L_0x0071:
            android.widget.Toast r0 = X.C59689JTv.A01(r3, r1, r0, r4)
        L_0x0075:
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x0079:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0084
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0169
            X.C56654I6j.A03(r8, r2)
        L_0x0084:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0087:
            java.lang.String r1 = "remix_unavailable"
            r0 = 2131956124(0x7f13119c, float:1.9548795E38)
            goto L_0x0071
        L_0x008d:
            com.instagram.api.schemas.ClipsMashupType r1 = com.instagram.api.schemas.ClipsMashupType.A0A
            goto L_0x0064
        L_0x0090:
            X.GOp r17 = X.C52345GOp.A00
            int r4 = r7.A09()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.String r6 = r6.A00
            X.28D r10 = X.C55275Hf4.A00(r2)
            java.lang.String r21 = X.I7J.A08(r0)
            java.lang.String r22 = X.I7J.A09(r0)
            java.lang.String r23 = X.I7J.A07(r0)
            java.lang.Boolean r18 = X.I7J.A06(r0)
            com.instagram.common.typedurl.ImageUrl r14 = X.I7J.A01(r0)
            com.instagram.clips.intf.ClipsViewerSource r4 = com.instagram.clips.intf.ClipsViewerSource.SEQUENCE_ORIGINAL_REEL
            if (r2 == r4) goto L_0x00d6
            com.instagram.clips.intf.ClipsViewerSource r4 = com.instagram.clips.intf.ClipsViewerSource.SEQUENCE_REEL_CTA
            if (r2 == r4) goto L_0x00d6
            com.instagram.api.schemas.ClipsMashupType r11 = com.instagram.api.schemas.ClipsMashupType.A0B
        L_0x00bf:
            X.1Xj r0 = r0.A02
            X.Dba.A0j(r1, r12, r13)
            X.0qQ.A0B(r15, r3)
            X.C51974G9v.A1N(r9, r8, r10)
            r16 = r0
            r19 = r5
            r20 = r6
            X.C52345GOp.A04(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0075
        L_0x00d6:
            com.instagram.api.schemas.ClipsMashupType r11 = com.instagram.api.schemas.ClipsMashupType.A0A
            goto L_0x00bf
        L_0x00d9:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0079
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e2:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A09
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r4 = r4.A00
            X.4Co r4 = (X.C262204Co) r4
            if (r4 == 0) goto L_0x00fb
            r0.A00 = r1
            java.lang.Object r4 = r4.CfH(r0)
            if (r4 != r2) goto L_0x00fb
            return r2
        L_0x00f8:
            X.0eS.A00(r4)
        L_0x00fb:
            java.lang.Object r5 = r0.A09
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r4 = r5.A00
            X.4Co r4 = (X.C262204Co) r4
            if (r4 == 0) goto L_0x0084
            boolean r4 = r4.CQL()
            if (r4 != r1) goto L_0x0084
            java.lang.Object r4 = r5.A00
            X.4Co r4 = (X.C262204Co) r4
            if (r4 == 0) goto L_0x0084
            boolean r4 = r4.isCancelled()
            if (r4 != 0) goto L_0x0084
            java.lang.Object r4 = r5.A00
            X.2Q9 r4 = (X.AnonymousClass2Q9) r4
            if (r4 == 0) goto L_0x0084
            r0.A00 = r3
            X.4Cp r4 = (X.C262214Cp) r4
            java.lang.Object r4 = r4.A0E(r0)
            if (r4 != r2) goto L_0x0015
            return r2
        L_0x0128:
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x0134
            if (r1 != r3) goto L_0x016e
            X.0eS.A00(r4)
            goto L_0x0084
        L_0x0134:
            X.0eS.A00(r4)
            java.lang.Object r1 = r0.A0D
            X.07Z r1 = (X.AnonymousClass07Z) r1
            X.07V r4 = r1.getLifecycle()
            java.lang.Object r1 = r0.A0A
            X.07U r1 = (X.07U) r1
            r16 = 0
            java.lang.Object r8 = r0.A05
            java.lang.Object r6 = r0.A0B
            java.lang.Object r7 = r0.A07
            java.lang.Object r9 = r0.A04
            java.lang.Object r10 = r0.A08
            java.lang.Object r11 = r0.A09
            java.lang.Object r12 = r0.A06
            java.lang.Object r13 = r0.A0C
            java.lang.Object r14 = r0.A03
            java.lang.Object r15 = r0.A02
            r17 = 0
            X.Fxq r5 = new X.Fxq
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A00 = r3
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r1, r4, r0, r5)
            if (r0 != r2) goto L_0x0084
            return r2
        L_0x0169:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58091Im6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58091Im6) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

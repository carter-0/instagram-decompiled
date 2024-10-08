package X;

import com.instagram.zero.headers.IGZeroHeadersPing;

public final class MGL extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGL(IGZeroHeadersPing iGZeroHeadersPing, AnonymousClass4D7 r3, ONQ onq) {
        super(2, r3);
        this.A04 = 6;
        this.A05 = onq;
        this.A03 = iGZeroHeadersPing;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MGL, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.MGL, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        AnonymousClass4D7 r7 = r11;
        switch (this.A04) {
            case 0:
                obj4 = this.A03;
                obj2 = this.A02;
                obj3 = this.A01;
                obj5 = this.A05;
                i = 0;
                break;
            case 1:
                return new MGL(this.A02, this.A01, this.A05, r7, 1);
            case 2:
                obj2 = this.A02;
                obj5 = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                obj5 = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 3;
                break;
            case 4:
                obj2 = this.A02;
                obj5 = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 4;
                break;
            case 5:
                obj4 = this.A03;
                obj5 = this.A05;
                obj2 = this.A02;
                obj3 = this.A01;
                i = 5;
                break;
            case 6:
                return new MGL((IGZeroHeadersPing) this.A03, r11, (ONQ) this.A05);
            case 7:
                MGL mgl = new MGL(this.A02, this.A01, this.A05, r7, 7);
                mgl.A03 = obj;
                return mgl;
            case 8:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A05;
                i = 8;
                break;
            default:
                obj4 = this.A03;
                obj3 = this.A01;
                obj2 = this.A02;
                obj5 = this.A05;
                i = 9;
                break;
        }
        return new MGL(obj2, obj5, obj3, obj4, r7, i);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MGL, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0126, code lost:
        r5 = new X.C52070GDq(r3, r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0179, code lost:
        r9.A00 = r6;
        r1 = X.AnonymousClass3DM.A00(r7, r8, r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017f, code lost:
        if (r1 != r0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0181, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0182, code lost:
        X.0eS.A00(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r17
            r4 = r18
            int r0 = r9.A04
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x025a;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00ef;
                case 4: goto L_0x010b;
                case 5: goto L_0x018c;
                case 6: goto L_0x01ba;
                case 7: goto L_0x012c;
                case 8: goto L_0x0159;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r3 = 1
            if (r1 == 0) goto L_0x0070
            X.0eS.A00(r4)
        L_0x0013:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r2 = r9.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r6 = r9.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r3 = r9.A05
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r5 = r9.A01
            com.instagram.api.schemas.BonusPromoDialogType r5 = (com.instagram.api.schemas.BonusPromoDialogType) r5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0067
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r4 = r4.A00
            X.DrT r4 = (X.C47152DrT) r4
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0045
            com.instagram.api.schemas.BonusPromoDialogAudienceType r1 = r4.A00
            com.instagram.api.schemas.BonusPromoDialogAudienceType r0 = com.instagram.api.schemas.BonusPromoDialogAudienceType.UNRECOGNIZED
            if (r1 == r0) goto L_0x0045
            X.FYh r7 = X.C63304Kun.A00(r6)
            X.Fvq r1 = new X.Fvq
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3.runOnUiThread(r1)
        L_0x0045:
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0049:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0061
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0187
            X.FYh r3 = X.C63304Kun.A00(r6)
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            com.instagram.api.schemas.BonusPromoDialogType r0 = com.instagram.api.schemas.BonusPromoDialogType.SELF_PROFILE_REELS
            if (r5 != r0) goto L_0x0064
            java.lang.String r1 = "should_show_self_profile_reel_promo_dialog"
        L_0x005d:
            r0 = 0
            r3.A00(r2, r0, r0, r1)
        L_0x0061:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0064:
            java.lang.String r1 = "should_show_after_reel_creation_promo_dialog"
            goto L_0x005d
        L_0x0067:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0049
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0070:
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.incentiveplatform.api.IncentivePlatformApi r2 = X.C63305Kuo.A00(r1)
            java.lang.Object r1 = r9.A01
            com.instagram.api.schemas.BonusPromoDialogType r1 = (com.instagram.api.schemas.BonusPromoDialogType) r1
            r9.A00 = r3
            java.lang.Object r4 = r2.A02(r1, r9)
            if (r4 != r0) goto L_0x0013
            return r0
        L_0x0088:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r14 = 1
            if (r1 == 0) goto L_0x009a
            X.0eS.A00(r4)
        L_0x0092:
            java.lang.Object r0 = r9.A05
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.onBackPressed()
            goto L_0x0061
        L_0x009a:
            X.0eS.A00(r4)
            java.lang.Object r3 = r9.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.F3K r4 = X.Ky3.A00(r3)
            java.lang.Object r1 = r9.A02
            X.3FW r1 = (X.AnonymousClass3FW) r1
            long r10 = r1.A01()
            long r12 = r1.A00()
            java.lang.Object r5 = r9.A01
            X.Fo6 r5 = (X.C51076Fo6) r5
            java.util.List r8 = r1.A04()
            r15 = 0
            long r1 = X.C46359DdX.A01(r3)
            java.lang.Long r6 = X.JTO.A0y(r1)
            long r1 = X.C46359DdX.A00(r3)
            java.lang.Long r7 = X.JTO.A0y(r1)
            r9.A00 = r14
            java.lang.Object r1 = r4.A00(r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r1 != r0) goto L_0x0092
            return r0
        L_0x00d3:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r6 = 1
            if (r1 != 0) goto L_0x0182
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A02
            X.07V r8 = X.JTO.A0J(r1)
            java.lang.Object r7 = r9.A05
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r9.A01
            java.lang.Object r2 = r9.A03
            r1 = 26
            goto L_0x0126
        L_0x00ef:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r6 = 1
            if (r1 != 0) goto L_0x0182
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A02
            X.07V r8 = X.JTO.A0J(r1)
            java.lang.Object r7 = r9.A05
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r9.A01
            java.lang.Object r2 = r9.A03
            r1 = 27
            goto L_0x0126
        L_0x010b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r6 = 1
            if (r1 != 0) goto L_0x0182
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A02
            X.07V r8 = X.JTO.A0J(r1)
            java.lang.Object r7 = r9.A05
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r9.A01
            java.lang.Object r2 = r9.A03
            r1 = 28
        L_0x0126:
            X.GDq r5 = new X.GDq
            r5.<init>(r3, r2, r4, r1)
            goto L_0x0179
        L_0x012c:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r2 = 1
            if (r1 != 0) goto L_0x0182
            X.0eS.A00(r4)
            java.lang.Object r15 = r9.A03
            X.4Cq r15 = (X.C262224Cq) r15
            X.134 r1 = X.JTO.A1F()
            java.lang.Object r12 = r9.A02
            X.07V r12 = (X.AnonymousClass07V) r12
            java.lang.Object r11 = r9.A01
            X.07U r11 = (X.07U) r11
            java.lang.Object r14 = r9.A05
            X.0sL r14 = (X.0sL) r14
            r13 = 0
            r16 = 5
            X.AwF r10 = new X.AwF
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.A00 = r2
            java.lang.Object r1 = X.1Eo.A00(r9, r1, r10)
            goto L_0x017f
        L_0x0159:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r6 = 1
            if (r1 != 0) goto L_0x0182
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A02
            X.07V r8 = X.JTO.A0J(r1)
            java.lang.Object r7 = r9.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A05
            r1 = 36
            X.GDq r5 = new X.GDq
            r5.<init>(r2, r3, r4, r1)
        L_0x0179:
            r9.A00 = r6
            java.lang.Object r1 = X.AnonymousClass3DM.A00(r7, r8, r9, r5)
        L_0x017f:
            if (r1 != r0) goto L_0x0061
            return r0
        L_0x0182:
            X.0eS.A00(r4)
            goto L_0x0061
        L_0x0187:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x018c:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r7 = 1
            if (r1 == 0) goto L_0x019b
            X.0eS.A00(r4)
        L_0x0196:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x019b:
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A03
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r1 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r1
            X.05G r6 = r1.A05
            java.lang.Object r5 = r9.A05
            java.lang.Object r4 = r9.A02
            java.lang.Object r3 = r9.A01
            r2 = 24
            X.MCf r1 = new X.MCf
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r4, (java.lang.Object) r3)
            r9.A00 = r7
            java.lang.Object r1 = r6.collect(r1, r9)
            if (r1 != r0) goto L_0x0196
            return r0
        L_0x01ba:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r3 = 1
            if (r1 == 0) goto L_0x01c5
            X.0eS.A00(r4)
            return r4
        L_0x01c5:
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A05
            X.ONQ r1 = (X.ONQ) r1
            java.lang.Object r2 = r9.A03
            r9.A01 = r1
            r9.A02 = r2
            r9.A00 = r3
            X.3Pl r5 = X.JTQ.A0m(r9)
            java.lang.String r8 = r1.A00
            r1 = 3
            X.LcP r6 = new X.LcP
            r6.<init>(r1, r5, r2)
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            X.0sm r2 = X.0Yt.A0E()
            r1 = 2
            X.0qQ.A0B(r2, r1)
            int r1 = r2.size()
            java.util.ArrayList r7 = X.DbS.A0v(r1)
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x01fa:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0215
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r4)
            java.lang.String r3 = X.DbT.A13(r1)
            java.lang.String r2 = X.DbS.A0s(r1)
            X.1Fn r1 = new X.1Fn
            r1.<init>(r3, r2)
            r7.add(r1)
            goto L_0x01fa
        L_0x0215:
            r1 = 0
            X.1Pq r2 = new X.1Pq
            r2.<init>(r1)
            r2.A01(r9)
            java.util.List r1 = r2.A06
            r1.clear()
            r1.addAll(r7)
            r2.A02 = r8
            r1 = 0
            r2.A05 = r1
            X.1QS r4 = r2.A00()
            X.1QT r2 = X.JTQ.A0E()
            X.1Fe r1 = X.1Fe.A02
            r2.A03 = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A07 = r1
            java.lang.String r1 = "HEADERS_PING"
            r2.A0A = r1
            X.1QU r3 = r2.A00()
            X.1CO r2 = X.AnonymousClass1CO.A00()
            X.T6I r1 = new X.T6I
            r1.<init>(r6)
            X.1T9 r1 = r2.A02(r1, r4, r3)
            X.0qQ.A07(r1)
            java.lang.Object r4 = r5.A00()
            if (r4 != r0) goto L_0x026d
            return r0
        L_0x025a:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r9.A00
            r2 = 1
            if (r1 == 0) goto L_0x026e
            java.lang.Object r7 = r9.A03
            X.5Oz r7 = (X.C284945Oz) r7
            X.0eS.A00(r4)
        L_0x0268:
            r7.Epw(r4)
            X.0gF r4 = X.C60340gF.A00
        L_0x026d:
            return r4
        L_0x026e:
            X.0eS.A00(r4)
            java.lang.Object r7 = r9.A05
            X.5Oz r7 = (X.C284945Oz) r7
            java.lang.Object r6 = r9.A02
            java.lang.Object r1 = r9.A01
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A08
            if (r1 == 0) goto L_0x02a0
            com.instagram.common.typedurl.ImageUrl r1 = r1.A03
            if (r1 == 0) goto L_0x02a0
            java.lang.String r5 = r1.getUrl()
        L_0x0287:
            r9.A03 = r7
            r9.A00 = r2
            X.12T r1 = X.AnonymousClass12T.A00
            r4 = 0
            X.0nV r3 = X.DbX.A0c(r1)
            r2 = 39
            X.MGy r1 = new X.MGy
            r1.<init>(r6, r5, r4, r2)
            java.lang.Object r4 = X.1Eo.A00(r9, r3, r1)
            if (r4 != r0) goto L_0x0268
            return r0
        L_0x02a0:
            r5 = 0
            goto L_0x0287
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGL) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGL(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGL(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A04 = i;
        this.A02 = obj;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }
}

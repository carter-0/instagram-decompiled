package X;

/* renamed from: X.WxQ  reason: case insensitive filesystem */
public final class C20694WxQ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20694WxQ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20694WxQ(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cc, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d3, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ff, code lost:
        return X.JTU.A0D(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x022f;
                case 2: goto L_0x0244;
                case 3: goto L_0x0228;
                case 4: goto L_0x0005;
                case 5: goto L_0x0217;
                case 6: goto L_0x020d;
                case 7: goto L_0x0200;
                case 8: goto L_0x01f5;
                case 9: goto L_0x01ee;
                case 10: goto L_0x009e;
                case 11: goto L_0x0244;
                case 12: goto L_0x0228;
                case 13: goto L_0x0005;
                case 14: goto L_0x01db;
                case 15: goto L_0x01b6;
                case 16: goto L_0x0244;
                case 17: goto L_0x0228;
                case 18: goto L_0x0005;
                case 19: goto L_0x0152;
                case 20: goto L_0x0148;
                case 21: goto L_0x0244;
                case 22: goto L_0x0228;
                case 23: goto L_0x0005;
                case 24: goto L_0x012e;
                case 25: goto L_0x010f;
                case 26: goto L_0x00f2;
                case 27: goto L_0x00ea;
                case 28: goto L_0x00db;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00c4;
                case 31: goto L_0x007e;
                case 32: goto L_0x0066;
                case 33: goto L_0x00ac;
                case 34: goto L_0x000c;
                case 35: goto L_0x01ee;
                case 36: goto L_0x009e;
                case 37: goto L_0x008f;
                case 38: goto L_0x0087;
                case 39: goto L_0x007e;
                case 40: goto L_0x006f;
                case 41: goto L_0x0066;
                case 42: goto L_0x0052;
                case 43: goto L_0x0043;
                case 44: goto L_0x0039;
                case 45: goto L_0x002f;
                case 46: goto L_0x0244;
                case 47: goto L_0x0228;
                case 48: goto L_0x0005;
                case 49: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.07f r4 = X.DbY.A0I(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r1 = r11.A01
            X.UaU r1 = (X.C15322UaU) r1
            com.instagram.business.promote.model.PromoteData r0 = X.C15322UaU.A00(r1)
            com.instagram.common.session.UserSession r4 = r0.A0y
            if (r4 != 0) goto L_0x000b
            X.0eM r0 = r1.A0K
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x001f:
            java.lang.Object r0 = r11.A01
            X.UZX r0 = (X.UZX) r0
            X.0eM r0 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Uh7 r4 = new X.Uh7
            r4.<init>(r0)
            return r4
        L_0x002f:
            java.lang.Object r0 = r11.A01
            X.4DH r0 = (X.AnonymousClass4DH) r0
            X.UAF r4 = new X.UAF
            r4.<init>(r0)
            return r4
        L_0x0039:
            java.lang.Object r1 = r11.A01
            r0 = 15
            X.Ufn r4 = new X.Ufn
            r4.<init>(r1, r0)
            return r4
        L_0x0043:
            java.lang.Object r0 = r11.A01
            X.UZX r0 = (X.UZX) r0
            X.0eM r0 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VwK r4 = X.VA1.A00(r0)
            return r4
        L_0x0052:
            java.lang.Object r2 = r11.A01
            X.UZX r2 = (X.UZX) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r2.requireContext()
            X.Vvg r4 = new X.Vvg
            r4.<init>(r0, r2, r1)
            return r4
        L_0x0066:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.business.promote.model.PromoteState r4 = X.XA9.A00(r0)
            return r4
        L_0x006f:
            java.lang.Object r1 = r11.A01
            X.UZh r1 = (X.C15279UZh) r1
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r1)
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.W1k r4 = X.C18784W1k.A01(r1, r0)
            return r4
        L_0x007e:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.business.promote.model.PromoteData r4 = X.XAI.A00(r0)
            return r4
        L_0x0087:
            java.lang.Object r0 = r11.A01
            X.UZh r0 = (X.C15279UZh) r0
            X.0eM r0 = r0.A0I
            goto L_0x01fb
        L_0x008f:
            java.lang.Object r0 = r11.A01
            X.UZh r0 = (X.C15279UZh) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VwK r4 = X.VA1.A00(r0)
            return r4
        L_0x009e:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r0 = X.DbY.A08(r0)
            X.UhH r4 = new X.UhH
            r4.<init>(r0)
            return r4
        L_0x00ac:
            java.lang.Object r0 = r11.A01
            X.UaU r0 = (X.C15322UaU) r0
            X.0eM r0 = r0.A0N
            X.0lg r2 = X.DbY.A0R(r0)
            r0 = 19
            X.Wvn r1 = new X.Wvn
            r1.<init>(r2, r0)
            java.lang.Class<X.WT6> r0 = X.WT6.class
            java.lang.Object r4 = r2.A01(r0, r1)
            return r4
        L_0x00c4:
            java.lang.Object r2 = r11.A01
            X.UaU r2 = (X.C15322UaU) r2
            X.WGU r1 = r2.A03
            r0 = 7
            X.UcZ r4 = new X.UcZ
            r4.<init>(r1, r2, r0)
            return r4
        L_0x00d1:
            java.lang.Object r0 = r11.A01
            X.UaU r0 = (X.C15322UaU) r0
            X.Ugp r4 = new X.Ugp
            r4.<init>(r0)
            return r4
        L_0x00db:
            java.lang.Object r1 = r11.A01
            X.UaU r1 = (X.C15322UaU) r1
            X.0eM r0 = r1.A0N
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.W1k r4 = X.C18784W1k.A01(r1, r0)
            return r4
        L_0x00ea:
            java.lang.Object r0 = r11.A01
            X.K54 r0 = (X.K54) r0
            X.0eM r0 = r0.A0A
            goto L_0x01fb
        L_0x00f2:
            java.lang.String r1 = "ads/promote/suggested_interests/"
            int r0 = r1.length()
            int r0 = r0 + -1
            java.lang.String r3 = X.C13991Tnr.A0a(r0, r1)
            java.lang.Object r2 = r11.A01
            X.UAD r2 = (X.UAD) r2
            com.instagram.common.session.UserSession r0 = r2.A03
            X.WGU r1 = X.WGU.A00(r0)
            r0 = 6
            X.UcZ r4 = new X.UcZ
            r4.<init>(r1, r2, r3, r0)
            return r4
        L_0x010f:
            java.lang.String r1 = "ads/promote/suggested_interests/"
            int r0 = r1.length()
            int r0 = r0 + -1
            java.lang.String r3 = X.C13991Tnr.A0a(r0, r1)
            java.lang.Object r2 = r11.A01
            X.UAI r2 = (X.UAI) r2
            com.instagram.business.promote.model.PromoteData r0 = r2.A03
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.WGU r1 = X.WGU.A00(r0)
            r0 = 5
            X.UcZ r4 = new X.UcZ
            r4.<init>(r1, r2, r3, r0)
            return r4
        L_0x012e:
            java.lang.Object r3 = r11.A01
            X.E4h r3 = (X.C47482E4h) r3
            X.0eM r0 = r3.A0D
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r3.A05
            if (r1 != 0) goto L_0x0140
            java.lang.String r0 = "entryPoint"
            goto L_0x01cc
        L_0x0140:
            java.lang.String r0 = r3.A06
            X.H6G r4 = new X.H6G
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0148:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VMU r4 = new X.VMU
            r4.<init>(r0)
            return r4
        L_0x0152:
            java.lang.Object r4 = r11.A01
            X.E1j r4 = (X.C47415E1j) r4
            X.0eM r3 = r4.A03
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r3)
            android.os.Bundle r1 = r4.mArguments
            r0 = 0
            if (r1 == 0) goto L_0x0167
            java.lang.String r0 = "destination"
            java.lang.String r0 = r1.getString(r0)
        L_0x0167:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x01b0
            com.instagram.api.schemas.XIGIGBoostDestination r6 = com.instagram.api.schemas.XIGIGBoostDestination.valueOf(r0)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x01aa
            java.lang.String r0 = "media_id"
            java.lang.String r9 = r1.getString(r0)
            if (r9 == 0) goto L_0x01aa
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x01a4
            java.lang.String r0 = "call_to_action"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x01a4
            com.instagram.api.schemas.XIGIGBoostCallToAction r5 = com.instagram.api.schemas.XIGIGBoostCallToAction.valueOf(r0)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x01a2
            java.lang.String r0 = "is_political_ads"
            boolean r10 = r1.getBoolean(r0)
        L_0x0195:
            X.WGU r7 = X.JTU.A0D(r3)
            X.0qQ.A07(r7)
            X.EFV r4 = new X.EFV
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x01a2:
            r10 = 0
            goto L_0x0195
        L_0x01a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01b6:
            java.lang.String r1 = "ads/promote/delete_draft_promotion/"
            int r0 = r1.length()
            int r0 = r0 + -1
            java.lang.String r3 = X.C13991Tnr.A0a(r0, r1)
            java.lang.Object r2 = r11.A01
            X.UYy r2 = (X.UYy) r2
            X.WGU r1 = r2.A02
            if (r1 != 0) goto L_0x01d4
            java.lang.String r0 = "promoteLogger"
        L_0x01cc:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d4:
            r0 = 4
            X.UcZ r4 = new X.UcZ
            r4.<init>(r1, r2, r3, r0)
            return r4
        L_0x01db:
            java.lang.Object r6 = r11.A01
            X.4DH r6 = (X.AnonymousClass4DH) r6
            com.instagram.business.promote.model.PromoteData r8 = X.XAI.A00(r6)
            android.os.Bundle r5 = r6.mArguments
            r7 = 0
            X.U8J r4 = new X.U8J
            r9 = r7
            r10 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x01ee:
            java.lang.Object r0 = r11.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x01f5:
            java.lang.Object r0 = r11.A01
            X.UZP r0 = (X.UZP) r0
            X.0eM r0 = r0.A06
        L_0x01fb:
            X.WGU r4 = X.JTU.A0D(r0)
            return r4
        L_0x0200:
            java.lang.Object r0 = r11.A01
            X.UaV r0 = (X.C15323UaV) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.WGU r4 = X.WGU.A00(r0)
            return r4
        L_0x020d:
            java.lang.Object r0 = r11.A01
            X.UaV r0 = (X.C15323UaV) r0
            X.Ugp r4 = new X.Ugp
            r4.<init>(r0)
            return r4
        L_0x0217:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.business.promote.model.PromoteData r0 = X.XAI.A00(r0)
            X.0qQ.A0A(r0)
            X.Uh6 r4 = new X.Uh6
            r4.<init>(r0)
            return r4
        L_0x0228:
            java.lang.Object r0 = r11.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x022f:
            java.lang.Object r0 = r11.A01
            X.UaQ r0 = (X.C15318UaQ) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            if (r0 == 0) goto L_0x023c
            X.WGU r4 = X.WGU.A00(r0)
            return r4
        L_0x023c:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0244:
            java.lang.Object r4 = r11.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20694WxQ.invoke():java.lang.Object");
    }
}

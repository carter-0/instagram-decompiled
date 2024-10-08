package X;

/* renamed from: X.WxZ  reason: case insensitive filesystem */
public final class C20702WxZ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20702WxZ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C20702WxZ(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20702WxZ(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.0iw} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x006e: MOVE  (r1v8 X.XA9) = (r1v7 X.XA9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01a8;
                case 2: goto L_0x0196;
                case 3: goto L_0x00a9;
                case 4: goto L_0x0189;
                case 5: goto L_0x0098;
                case 6: goto L_0x017e;
                case 7: goto L_0x0173;
                case 8: goto L_0x0005;
                case 9: goto L_0x00f9;
                case 10: goto L_0x016c;
                case 11: goto L_0x0005;
                case 12: goto L_0x00f9;
                case 13: goto L_0x0005;
                case 14: goto L_0x00f9;
                case 15: goto L_0x0156;
                case 16: goto L_0x0149;
                case 17: goto L_0x00a9;
                case 18: goto L_0x0098;
                case 19: goto L_0x013c;
                case 20: goto L_0x0126;
                case 21: goto L_0x011f;
                case 22: goto L_0x0005;
                case 23: goto L_0x00f9;
                case 24: goto L_0x010e;
                case 25: goto L_0x0107;
                case 26: goto L_0x0005;
                case 27: goto L_0x00f9;
                case 28: goto L_0x00e7;
                case 29: goto L_0x00dd;
                case 30: goto L_0x00a9;
                case 31: goto L_0x0098;
                case 32: goto L_0x00d3;
                case 33: goto L_0x01cb;
                case 34: goto L_0x00cc;
                case 35: goto L_0x00c5;
                case 36: goto L_0x00b2;
                case 37: goto L_0x000c;
                case 38: goto L_0x00a9;
                case 39: goto L_0x00a1;
                case 40: goto L_0x0098;
                case 41: goto L_0x008a;
                case 42: goto L_0x01cb;
                case 43: goto L_0x00cc;
                case 44: goto L_0x00c5;
                case 45: goto L_0x0047;
                case 46: goto L_0x01cb;
                case 47: goto L_0x00cc;
                case 48: goto L_0x00c5;
                case 49: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r3
        L_0x000c:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "step"
            java.lang.Object r3 = r1.get(r0)
            if (r3 != 0) goto L_0x000b
            java.lang.String r1 = "screen information in extra should never be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0022:
            java.lang.Object r3 = r10.A01
            X.UaB r3 = (X.C15304UaB) r3
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = "mediaId"
        L_0x0032:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003a:
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "accessToken"
            goto L_0x0032
        L_0x0041:
            X.UhI r3 = new X.UhI
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0047:
            java.lang.Object r6 = r10.A01
            X.UbT r6 = (X.C15375UbT) r6
            android.content.Context r5 = r6.requireContext()
            com.instagram.common.session.UserSession r4 = r6.A00
            if (r4 == 0) goto L_0x0117
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            boolean r1 = r2 instanceof X.XAI
            r0 = 0
            if (r1 == 0) goto L_0x007c
            X.XAI r2 = (X.XAI) r2
        L_0x005e:
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x0084
            com.instagram.business.promote.model.PromoteData r2 = r2.Bhh()
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            boolean r0 = r1 instanceof X.XA9
            if (r0 == 0) goto L_0x007e
            X.XA9 r1 = (X.XA9) r1
            if (r1 == 0) goto L_0x007e
            com.instagram.business.promote.model.PromoteState r0 = r1.Bhj()
            X.UhN r3 = new X.UhN
            r3.<init>(r5, r2, r0, r4)
            return r3
        L_0x007c:
            r2 = r0
            goto L_0x005e
        L_0x007e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0084:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x008a:
            java.lang.Object r0 = r10.A01
            X.UZM r0 = (X.UZM) r0
            X.0eM r0 = r0.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            goto L_0x0186
        L_0x0098:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.business.promote.model.PromoteState r3 = X.XA9.A00(r0)
            return r3
        L_0x00a1:
            java.lang.Object r0 = r10.A01
            X.UZM r0 = (X.UZM) r0
            X.0eM r0 = r0.A08
            goto L_0x014f
        L_0x00a9:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.business.promote.model.PromoteData r3 = X.XAI.A00(r0)
            return r3
        L_0x00b2:
            java.lang.Object r5 = r10.A01
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.business.promote.model.PromoteData r7 = X.XAI.A00(r5)
            android.os.Bundle r4 = r5.mArguments
            r6 = 0
            X.U8J r3 = new X.U8J
            r8 = r6
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x00c5:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x00cc:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x00d3:
            java.lang.Object r0 = r10.A01
            X.UZd r0 = (X.C15275UZd) r0
            com.instagram.business.promote.model.PromoteData r0 = X.C15275UZd.A01(r0)
            goto L_0x0186
        L_0x00dd:
            java.lang.Object r0 = r10.A01
            X.UZd r0 = (X.C15275UZd) r0
            com.instagram.common.session.UserSession r0 = X.C15275UZd.A03(r0)
            goto L_0x0191
        L_0x00e7:
            java.lang.Object r2 = r10.A01
            X.UZd r2 = (X.C15275UZd) r2
            com.instagram.common.session.UserSession r1 = X.C15275UZd.A03(r2)
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.W1k r3 = new X.W1k
            r3.<init>(r0, r2, r1)
            return r3
        L_0x00f9:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r0 = X.DbY.A08(r0)
            X.UhH r3 = new X.UhH
            r3.<init>(r0)
            return r3
        L_0x0107:
            java.lang.Object r0 = r10.A01
            X.UZJ r0 = (X.UZJ) r0
            X.0eM r0 = r0.A02
            goto L_0x0179
        L_0x010e:
            java.lang.Object r0 = r10.A01
            X.UZe r0 = (X.C15276UZe) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            if (r0 == 0) goto L_0x0117
            goto L_0x0191
        L_0x0117:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x011f:
            java.lang.Object r0 = r10.A01
            X.UZ7 r0 = (X.UZ7) r0
            X.0eM r0 = r0.A0A
            goto L_0x0179
        L_0x0126:
            java.lang.Object r2 = r10.A01
            X.UZ7 r2 = (X.UZ7) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x01c9
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VRe r3 = new X.VRe
            r3.<init>(r1, r2, r0)
            return r3
        L_0x013c:
            java.lang.Object r0 = r10.A01
            X.UZo r0 = (X.C15284UZo) r0
            X.0eM r0 = r0.A0E
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            goto L_0x0186
        L_0x0149:
            java.lang.Object r0 = r10.A01
            X.UZo r0 = (X.C15284UZo) r0
            X.0eM r0 = r0.A0G
        L_0x014f:
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            goto L_0x0191
        L_0x0156:
            java.lang.Object r2 = r10.A01
            X.UZo r2 = (X.C15284UZo) r2
            X.0eM r0 = r2.A0G
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.VRe r3 = new X.VRe
            r3.<init>(r0, r2, r1)
            return r3
        L_0x016c:
            java.lang.Object r0 = r10.A01
            X.UZV r0 = (X.UZV) r0
            X.0eM r0 = r0.A0E
            goto L_0x0179
        L_0x0173:
            java.lang.Object r0 = r10.A01
            X.6Ky r0 = (X.C306146Ky) r0
            X.0eM r0 = r0.A0S
        L_0x0179:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x0191
        L_0x017e:
            java.lang.Object r0 = r10.A01
            X.UZi r0 = (X.C15280UZi) r0
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r0)
        L_0x0186:
            com.instagram.common.session.UserSession r3 = r0.A0y
            return r3
        L_0x0189:
            java.lang.Object r0 = r10.A01
            X.UZi r0 = (X.C15280UZi) r0
            com.instagram.common.session.UserSession r0 = X.C15280UZi.A02(r0)
        L_0x0191:
            X.WGU r3 = X.WGU.A00(r0)
            return r3
        L_0x0196:
            java.lang.Object r2 = r10.A01
            X.UZi r2 = (X.C15280UZi) r2
            com.instagram.common.session.UserSession r1 = X.C15280UZi.A02(r2)
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.W1k r3 = new X.W1k
            r3.<init>(r0, r2, r1)
            return r3
        L_0x01a8:
            java.lang.Object r0 = r10.A01
            X.UZi r0 = (X.C15280UZi) r0
            X.0eM r0 = r0.A0V
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x01b7
            X.UzE r3 = X.C16678UzE.EDIT_AUDIENCE
            return r3
        L_0x01b7:
            X.UzE r3 = X.C16678UzE.CREATE_AUDIENCE
            return r3
        L_0x01ba:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01c9
            java.lang.String r0 = "audience_id"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x01c9:
            r3 = 0
            return r3
        L_0x01cb:
            java.lang.Object r3 = r10.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20702WxZ.invoke():java.lang.Object");
    }
}

package X;

/* renamed from: X.Wvr  reason: case insensitive filesystem */
public final class C20610Wvr extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20610Wvr(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029a, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02af, code lost:
        return r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d4, code lost:
        r5.A0A = r1;
        r5.A0L = true;
        X.DbY.A1N(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0188, code lost:
        r0 = r1.getBoolean(X.AnonymousClass000.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0194, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c6, code lost:
        ((X.C60260JiH) r0.getValue()).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ec, code lost:
        r0 = "bottomSheetLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ee, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024d, code lost:
        return java.lang.Boolean.valueOf(X.DbT.A1X(r1, X.AnonymousClass000.A00(r0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0035;
                case 2: goto L_0x0085;
                case 3: goto L_0x00de;
                case 4: goto L_0x00f2;
                case 5: goto L_0x0024;
                case 6: goto L_0x00fa;
                case 7: goto L_0x0005;
                case 8: goto L_0x0121;
                case 9: goto L_0x0024;
                case 10: goto L_0x00fa;
                case 11: goto L_0x0005;
                case 12: goto L_0x0139;
                case 13: goto L_0x0151;
                case 14: goto L_0x0024;
                case 15: goto L_0x00fa;
                case 16: goto L_0x0005;
                case 17: goto L_0x0158;
                case 18: goto L_0x016c;
                case 19: goto L_0x0024;
                case 20: goto L_0x00fa;
                case 21: goto L_0x0005;
                case 22: goto L_0x0101;
                case 23: goto L_0x0173;
                case 24: goto L_0x017e;
                case 25: goto L_0x0197;
                case 26: goto L_0x0024;
                case 27: goto L_0x00fa;
                case 28: goto L_0x0005;
                case 29: goto L_0x01b0;
                case 30: goto L_0x01c0;
                case 31: goto L_0x0024;
                case 32: goto L_0x00fa;
                case 33: goto L_0x0005;
                case 34: goto L_0x01d1;
                case 35: goto L_0x01f6;
                case 36: goto L_0x0207;
                case 37: goto L_0x0210;
                case 38: goto L_0x021d;
                case 39: goto L_0x022e;
                case 40: goto L_0x000c;
                case 41: goto L_0x0239;
                case 42: goto L_0x024e;
                case 43: goto L_0x025c;
                case 44: goto L_0x026f;
                case 45: goto L_0x027a;
                case 46: goto L_0x0281;
                case 47: goto L_0x0298;
                case 48: goto L_0x02a0;
                case 49: goto L_0x02a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.DbY.A0I(r0)
        L_0x000b:
            return r3
        L_0x000c:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 4216(0x1078, float:5.908E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r3 = r1.getParcelable(r0)
            if (r3 != 0) goto L_0x000b
            com.instagram.wonderwall.model.WallMenuConfig r3 = new com.instagram.wonderwall.model.WallMenuConfig
            r3.<init>()
            return r3
        L_0x0024:
            java.lang.Object r3 = r10.A01
            return r3
        L_0x0027:
            java.lang.Object r0 = r10.A01
            X.UbQ r0 = (X.C15372UbQ) r0
            X.VQ3 r1 = r0.A06
            X.VQ2 r0 = X.VKK.A00
            X.UhE r3 = new X.UhE
            r3.<init>(r0, r1)
            return r3
        L_0x0035:
            java.lang.Object r0 = r10.A01
            X.U8Q r0 = (X.U8Q) r0
            X.VQ3 r0 = r0.A01
            X.UbQ r3 = r0.A00
            android.content.Context r4 = r3.getContext()
            if (r4 == 0) goto L_0x029d
            r0 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 == 0) goto L_0x0053
            int r1 = r3.A05
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x0053:
            X.6ap r5 = new X.6ap
            r5.<init>()
            r5.A06()
            r1 = 2131976104(0x7f135fa8, float:1.958932E38)
            X.0eM r0 = r3.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = X.DbW.A0h(r4, r0, r1)
            r5.A0D = r0
            r0 = 2131976103(0x7f135fa7, float:1.9589317E38)
            java.lang.String r0 = r4.getString(r0)
            r5.A0I = r0
            r5.A04 = r2
            r5.A02()
            r0 = 2131976110(0x7f135fae, float:1.9589331E38)
            X.DbW.A0q(r4, r5, r0)
            r0 = 3
            X.WYE r1 = new X.WYE
            r1.<init>(r3, r0)
            goto L_0x00d4
        L_0x0085:
            java.lang.Object r0 = r10.A01
            X.U8Q r0 = (X.U8Q) r0
            X.VQ3 r0 = r0.A01
            X.UbQ r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            if (r3 == 0) goto L_0x029d
            r0 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
            if (r2 == 0) goto L_0x00a3
            int r1 = r4.A05
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x00a3:
            X.6ap r5 = new X.6ap
            r5.<init>()
            r5.A06()
            r1 = 2131976112(0x7f135fb0, float:1.9589335E38)
            X.0eM r0 = r4.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = X.DbW.A0h(r3, r0, r1)
            r5.A0D = r0
            r0 = 2131976111(0x7f135faf, float:1.9589333E38)
            java.lang.String r0 = r3.getString(r0)
            r5.A0I = r0
            r5.A04 = r2
            r5.A02()
            r0 = 2131976110(0x7f135fae, float:1.9589331E38)
            X.DbW.A0q(r3, r5, r0)
            r0 = 4
            X.WYF r1 = new X.WYF
            r1.<init>(r0, r3, r4)
        L_0x00d4:
            r5.A0A = r1
            r0 = 1
            r5.A0L = r0
            X.DbY.A1N(r5)
            goto L_0x029d
        L_0x00de:
            java.lang.Object r0 = r10.A01
            X.U8Q r0 = (X.U8Q) r0
            X.VQ3 r0 = r0.A01
            X.UbQ r0 = r0.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x029d
        L_0x00f2:
            java.lang.Object r0 = r10.A01
            X.UYk r0 = (X.C15270UYk) r0
            X.0eM r0 = r0.A05
            goto L_0x01c6
        L_0x00fa:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0101:
            java.lang.Object r4 = r10.A01
            X.UYl r4 = (X.C15271UYl) r4
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = r4.A03
            X.HMr r6 = r4.A00
            X.Hs7 r7 = r4.A01
            if (r7 != 0) goto L_0x0117
            java.lang.String r0 = "upsellsLogger"
            goto L_0x01ee
        L_0x0117:
            X.I10 r8 = r4.A02
            if (r8 == 0) goto L_0x01e9
            X.UhV r3 = new X.UhV
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x0121:
            java.lang.Object r3 = r10.A01
            X.UYk r3 = (X.C15270UYk) r3
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.Hth r1 = r3.A00
            if (r1 == 0) goto L_0x01ec
            X.I10 r0 = r3.A01
            if (r0 == 0) goto L_0x01e9
            X.UhK r3 = new X.UhK
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0139:
            java.lang.Object r3 = r10.A01
            X.UYm r3 = (X.UYm) r3
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.Hth r1 = r3.A00
            if (r1 == 0) goto L_0x01ec
            X.I10 r0 = r3.A01
            if (r0 == 0) goto L_0x01e9
            X.UhL r3 = new X.UhL
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0151:
            java.lang.Object r0 = r10.A01
            X.UYj r0 = (X.C15269UYj) r0
            X.0eM r0 = r0.A04
            goto L_0x01c6
        L_0x0158:
            java.lang.Object r2 = r10.A01
            X.UYj r2 = (X.C15269UYj) r2
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.Hth r0 = r2.A00
            if (r0 == 0) goto L_0x01ec
            X.UhF r3 = new X.UhF
            r3.<init>(r1, r0)
            return r3
        L_0x016c:
            java.lang.Object r0 = r10.A01
            X.UYl r0 = (X.C15271UYl) r0
            X.0eM r0 = r0.A05
            goto L_0x01c6
        L_0x0173:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0195
            r0 = 1537(0x601, float:2.154E-42)
            goto L_0x0188
        L_0x017e:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0195
            r0 = 3484(0xd9c, float:4.882E-42)
        L_0x0188:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
        L_0x0190:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0195:
            r0 = 0
            goto L_0x0190
        L_0x0197:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01ae
            r0 = 3485(0xd9d, float:4.884E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r0)
        L_0x01a9:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x01ae:
            r0 = 0
            goto L_0x01a9
        L_0x01b0:
            java.lang.Object r1 = r10.A01
            X.UZ4 r1 = (X.UZ4) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Hs7 r3 = new X.Hs7
            r3.<init>(r1, r0)
            return r3
        L_0x01c0:
            java.lang.Object r0 = r10.A01
            X.UYn r0 = (X.UYn) r0
            X.0eM r0 = r0.A07
        L_0x01c6:
            java.lang.Object r0 = r0.getValue()
            X.JiH r0 = (X.C60260JiH) r0
            r0.A01()
            goto L_0x029d
        L_0x01d1:
            java.lang.Object r3 = r10.A01
            X.UYn r3 = (X.UYn) r3
            X.0eM r0 = r3.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.Hth r1 = r3.A00
            if (r1 == 0) goto L_0x01ec
            X.I10 r0 = r3.A01
            if (r0 == 0) goto L_0x01e9
            X.UhM r3 = new X.UhM
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01e9:
            java.lang.String r0 = "snackBarLogger"
            goto L_0x01ee
        L_0x01ec:
            java.lang.String r0 = "bottomSheetLogger"
        L_0x01ee:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f6:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 1225(0x4c9, float:1.717E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r3 = r1.get(r0)
            return r3
        L_0x0207:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 313(0x139, float:4.39E-43)
            goto L_0x0241
        L_0x0210:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r10.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            com.instagram.common.session.UserSession r3 = r1.A06(r0)
            return r3
        L_0x021d:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 393(0x189, float:5.51E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r3 = r1.get(r0)
            return r3
        L_0x022e:
            java.lang.Object r0 = r10.A01
            com.instagram.wonderwall.repository.WallFeedRepository r0 = (com.instagram.wonderwall.repository.WallFeedRepository) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            X.1Av r3 = X.1Au.A00(r0)
            return r3
        L_0x0239:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 3458(0xd82, float:4.846E-42)
        L_0x0241:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x024e:
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.DbX.A10(r0, r1)
            goto L_0x029d
        L_0x025c:
            java.lang.Object r2 = r10.A01
            X.GhK r2 = (X.C53029GhK) r2
            r1 = 0
            r2.A00 = r1
            r0 = 1
            r2.A02(r0)
            com.instagram.wonderwall.repository.WallPostComposerRepository r0 = r2.A03
            X.05G r0 = r0.A06
            r0.Epw(r1)
            goto L_0x029d
        L_0x026f:
            java.lang.Object r0 = r10.A01
            X.LR8 r0 = (X.LR8) r0
            X.5Oz r0 = r0.A00
            java.lang.Object r3 = r0.getValue()
            return r3
        L_0x027a:
            java.lang.Object r0 = r10.A01
            X.Jw3 r0 = (X.C61065Jw3) r0
            java.lang.Object r0 = r0.A02
            goto L_0x029a
        L_0x0281:
            java.lang.Object r0 = r10.A01
            X.Gm7 r0 = (X.C53321Gm7) r0
            X.5Tl r0 = r0.A00
            X.5Tq r0 = r0.A01
            java.lang.String r0 = r0.A00
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0298:
            java.lang.Object r0 = r10.A01
        L_0x029a:
            X.DbS.A1U(r0)
        L_0x029d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x02a0:
            java.lang.Object r0 = r10.A01
            X.HqK r0 = (X.C55956HqK) r0
            X.4gU r0 = r0.A00
            goto L_0x02ab
        L_0x02a7:
            java.lang.Object r0 = r10.A01
            X.4gU r0 = (X.C270284gU) r0
        L_0x02ab:
            java.lang.Object r3 = r0.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20610Wvr.invoke():java.lang.Object");
    }
}

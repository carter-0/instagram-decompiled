package X;

/* renamed from: X.Mof  reason: case insensitive filesystem */
public final class C67485Mof extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67485Mof(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C67485Mof(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ae, code lost:
        if (X.C66582MXn.A1X(r3) == false) goto L_0x01b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0027;
                case 2: goto L_0x0036;
                case 3: goto L_0x0044;
                case 4: goto L_0x0051;
                case 5: goto L_0x0062;
                case 6: goto L_0x0083;
                case 7: goto L_0x000c;
                case 8: goto L_0x009a;
                case 9: goto L_0x0005;
                case 10: goto L_0x00a1;
                case 11: goto L_0x00ac;
                case 12: goto L_0x0016;
                case 13: goto L_0x00c8;
                case 14: goto L_0x00d7;
                case 15: goto L_0x00e0;
                case 16: goto L_0x00eb;
                case 17: goto L_0x00f6;
                case 18: goto L_0x0101;
                case 19: goto L_0x0118;
                case 20: goto L_0x012f;
                case 21: goto L_0x0146;
                case 22: goto L_0x015a;
                case 23: goto L_0x016a;
                case 24: goto L_0x0027;
                case 25: goto L_0x0175;
                case 26: goto L_0x0194;
                case 27: goto L_0x000c;
                case 28: goto L_0x009a;
                case 29: goto L_0x0005;
                case 30: goto L_0x01b6;
                case 31: goto L_0x01c5;
                case 32: goto L_0x01d0;
                case 33: goto L_0x01e4;
                case 34: goto L_0x01f1;
                case 35: goto L_0x01fc;
                case 36: goto L_0x0209;
                case 37: goto L_0x0214;
                case 38: goto L_0x021e;
                case 39: goto L_0x0228;
                case 40: goto L_0x0235;
                case 41: goto L_0x0240;
                case 42: goto L_0x024b;
                case 43: goto L_0x0256;
                case 44: goto L_0x0260;
                case 45: goto L_0x0274;
                case 46: goto L_0x0287;
                case 47: goto L_0x000f;
                case 48: goto L_0x0292;
                case 49: goto L_0x02b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x000c:
            java.lang.Object r3 = r6.A01
            return r3
        L_0x000f:
            java.lang.Object r0 = r6.A01
            X.MoE r0 = (X.C67459MoE) r0
            X.MoD r3 = r0.A02
            return r3
        L_0x0016:
            java.lang.Object r0 = r6.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "BUNDLE_WAS_TABLE_DROPPED"
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0027:
            java.lang.Object r0 = r6.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x0036:
            java.lang.Object r0 = r6.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429737(0x7f0b0969, float:1.8481155E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0044:
            java.lang.Object r0 = r6.A01
            X.KQW r0 = (X.KQW) r0
            X.MtU r0 = X.JTT.A0U(r0)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_IMPRESSION"
            goto L_0x005d
        L_0x0051:
            java.lang.Object r0 = r6.A01
            X.KQW r0 = (X.KQW) r0
            X.MtU r0 = X.JTT.A0U(r0)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_CANCEL_TAP"
        L_0x005d:
            r1.A0B(r0)
            goto L_0x0191
        L_0x0062:
            java.lang.Object r2 = r6.A01
            X.KQW r2 = (X.KQW) r2
            X.MtU r0 = X.JTT.A0U(r2)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_OTC_TAP"
            r1.A0B(r0)
            X.0eM r0 = r2.A05
            boolean r0 = X.C66582MXn.A1Y(r0)
            if (r0 == 0) goto L_0x0080
            X.Njy r0 = X.C69358Njy.OTC_WAIT
        L_0x007b:
            X.C66582MXn.A1H(r0, r2)
            goto L_0x0191
        L_0x0080:
            X.Njy r0 = X.C69358Njy.OTC_ENTER_CODE_INTRO
            goto L_0x007b
        L_0x0083:
            java.lang.Object r2 = r6.A01
            X.KQW r2 = (X.KQW) r2
            X.MtU r0 = X.JTT.A0U(r2)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_PIN_TAP"
            X.2DR r1 = X.C66913Mex.A01(r1, r2, r0)
            X.Njy r0 = X.C69358Njy.RESTORE_WITH_PIN
            X.C66581MXm.A1D(r2, r0, r1)
            goto L_0x0191
        L_0x009a:
            java.lang.Object r0 = r6.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x00a1:
            java.lang.Object r0 = r6.A01
            X.KQW r0 = (X.KQW) r0
            X.0sa r0 = r0.A01
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x00ac:
            java.lang.Object r3 = r6.A01
            X.NJT r3 = (X.NJT) r3
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r2 = X.DbY.A05(r3)
            java.lang.Integer r1 = X.C71145Oe2.A02(r3)
            X.NUa r0 = X.OP6.A01(r3)
            X.NNI r3 = new X.NNI
            r3.<init>(r2, r4, r0, r1)
            return r3
        L_0x00c8:
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "EncryptedBackupsGDriveRestoreViewModel"
            X.1aU r0 = X.OP5.A00(r1, r0)
            X.032 r3 = X.C301235ym.A00(r0)
            return r3
        L_0x00d7:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.NUN r3 = X.C69898Nu0.A00(r0)
            return r3
        L_0x00e0:
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "EncryptedBackupsGDriveSetupViewModel"
            X.1aU r3 = X.OP5.A00(r1, r0)
            return r3
        L_0x00eb:
            java.lang.Object r0 = r6.A01
            X.MhG r0 = (X.C67043MhG) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x00f6:
            java.lang.Object r0 = r6.A01
            X.MhG r0 = (X.C67043MhG) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3HH r3 = X.AnonymousClass3HG.A00(r0)
            return r3
        L_0x0101:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.02m r2 = X.02m.A0p
            X.0BQ r1 = X.C66580MXl.A0o(r0, r2)
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            X.AnonymousClass7TG.A1Q(r1, r0)
            X.NUJ r3 = new X.NUJ
            r3.<init>(r2, r0, r1)
            return r3
        L_0x0118:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.02m r2 = X.02m.A0p
            X.0BQ r1 = X.C66580MXl.A0o(r0, r2)
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            X.AnonymousClass7TG.A1Q(r1, r0)
            X.NUK r3 = new X.NUK
            r3.<init>(r2, r0, r1)
            return r3
        L_0x012f:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.02m r2 = X.02m.A0p
            X.0BQ r1 = X.C66580MXl.A0o(r0, r2)
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            X.AnonymousClass7TG.A1Q(r1, r0)
            X.NUL r3 = new X.NUL
            r3.<init>(r2, r0, r1)
            return r3
        L_0x0146:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.02m r2 = X.02m.A0p
            X.0BQ r1 = X.C66580MXl.A0o(r0, r2)
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            X.NUZ r3 = new X.NUZ
            r3.<init>(r2, r0, r1)
            return r3
        L_0x015a:
            java.lang.Object r1 = r6.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.OyT r0 = X.C69901Nu3.A00(r1, r0)
            X.OW5 r3 = new X.OW5
            r3.<init>(r1, r0)
            return r3
        L_0x016a:
            java.lang.Object r0 = r6.A01
            X.OW5 r0 = (X.OW5) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x0175:
            java.lang.Object r2 = r6.A01
            X.NUx r2 = (X.C68737NUx) r2
            X.0eM r0 = r2.A0B
            java.lang.Object r0 = r0.getValue()
            X.Mtd r0 = (X.C67724Mtd) r0
            X.NUN r1 = r0.A00
            java.lang.String r0 = "MORE_OPTIONS_SETTINGS_DEEP_LINK_TAP"
            X.C66913Mex.A03(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "instagram://encryptedbackups?type=settings"
            X.FH7.A03(r1, r0)
        L_0x0191:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0194:
            java.lang.Object r0 = r6.A01
            X.NUx r0 = (X.C68737NUx) r0
            X.0eM r3 = r0.A09
            com.instagram.common.session.UserSession r2 = X.C66581MXm.A0S(r3)
            r0 = 36315949942640339(0x81052a00030ed3, double:3.0296912040941693E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x01b0
            boolean r1 = X.C66582MXn.A1X(r3)
            r0 = 1
            if (r1 != 0) goto L_0x01b1
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x01b6:
            java.lang.Object r0 = r6.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2DR r3 = X.OYI.A00(r0)
            return r3
        L_0x01c5:
            java.lang.Object r0 = r6.A01
            X.NUx r0 = (X.C68737NUx) r0
            X.0sa r0 = r0.A04
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x01d0:
            java.lang.Object r2 = r6.A01
            X.NJT r2 = (X.NJT) r2
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.C71145Oe2.A02(r2)
            X.NMq r3 = new X.NMq
            r3.<init>(r1, r0)
            return r3
        L_0x01e4:
            java.lang.Object r0 = r6.A01
            X.OTo r0 = (X.C70967OTo) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.OyT r3 = X.C69901Nu3.A00(r1, r0)
            return r3
        L_0x01f1:
            java.lang.Object r0 = r6.A01
            X.OTo r0 = (X.C70967OTo) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x01fc:
            java.lang.Object r0 = r6.A01
            X.OHj r0 = (X.C70714OHj) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.OyT r3 = X.C69901Nu3.A00(r1, r0)
            return r3
        L_0x0209:
            java.lang.Object r0 = r6.A01
            X.OHj r0 = (X.C70714OHj) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.NUX r3 = X.C69895Ntx.A00(r0)
            return r3
        L_0x0214:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.ONk r3 = new X.ONk
            r3.<init>(r0)
            return r3
        L_0x021e:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OTr r3 = new X.OTr
            r3.<init>(r0)
            return r3
        L_0x0228:
            java.lang.Object r0 = r6.A01
            X.OTr r0 = (X.C70970OTr) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.OyT r3 = X.C69901Nu3.A00(r1, r0)
            return r3
        L_0x0235:
            java.lang.Object r0 = r6.A01
            X.OTr r0 = (X.C70970OTr) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.3HH r3 = X.AnonymousClass3HG.A00(r0)
            return r3
        L_0x0240:
            java.lang.Object r0 = r6.A01
            X.OTr r0 = (X.C70970OTr) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x024b:
            java.lang.Object r0 = r6.A01
            X.OFw r0 = (X.C70675OFw) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x0256:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.MoE r3 = new X.MoE
            r3.<init>(r0)
            return r3
        L_0x0260:
            java.lang.Object r0 = r6.A01
            X.MoE r0 = (X.C67459MoE) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            r0 = 37
            X.Mof r1 = new X.Mof
            r1.<init>(r2, r0)
            java.lang.Class<X.ONk> r0 = X.C70838ONk.class
            java.lang.Object r3 = r2.A01(r0, r1)
            return r3
        L_0x0274:
            java.lang.Object r0 = r6.A01
            X.MoE r0 = (X.C67459MoE) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            r0 = 6
            X.Plf r1 = new X.Plf
            r1.<init>(r2, r0)
            java.lang.Class<X.OBN> r0 = X.OBN.class
            java.lang.Object r3 = r2.A01(r0, r1)
            return r3
        L_0x0287:
            java.lang.Object r0 = r6.A01
            X.MoE r0 = (X.C67459MoE) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.NUX r3 = X.C69895Ntx.A00(r0)
            return r3
        L_0x0292:
            java.lang.Object r1 = r6.A01
            X.MoE r1 = (X.C67459MoE) r1
            com.instagram.common.session.UserSession r5 = r1.A01
            r0 = 47
            X.Mof r4 = new X.Mof
            r4.<init>(r1, r0)
            X.MoF r0 = X.C70003Nvh.A00(r5)
            boolean r3 = r0.A00()
            java.lang.Class<X.ONh> r2 = X.C70835ONh.class
            r1 = 9
            X.GL3 r0 = new X.GL3
            r0.<init>(r1, r4, r5, r3)
            java.lang.Object r3 = r5.A01(r2, r0)
            return r3
        L_0x02b5:
            java.lang.Object r0 = r6.A01
            X.MoE r0 = (X.C67459MoE) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            r0 = 38
            X.Mof r1 = new X.Mof
            r1.<init>(r2, r0)
            java.lang.Class<X.OTr> r0 = X.C70970OTr.class
            java.lang.Object r3 = r2.A01(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67485Mof.invoke():java.lang.Object");
    }
}

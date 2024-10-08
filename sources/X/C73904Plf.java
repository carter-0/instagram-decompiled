package X;

/* renamed from: X.Plf  reason: case insensitive filesystem */
public final class C73904Plf extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73904Plf(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C73904Plf(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.NUA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.NUB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.NUA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.NUA} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        r1.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e2, code lost:
        X.C69901Nu3.A00(r0, r1).A05(r1);
        r2.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0191, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0268;
                case 1: goto L_0x025d;
                case 2: goto L_0x0216;
                case 3: goto L_0x020b;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01d8;
                case 7: goto L_0x01c2;
                case 8: goto L_0x01b5;
                case 9: goto L_0x0275;
                case 10: goto L_0x01ae;
                case 11: goto L_0x0005;
                case 12: goto L_0x0275;
                case 13: goto L_0x01ae;
                case 14: goto L_0x0005;
                case 15: goto L_0x0192;
                case 16: goto L_0x0164;
                case 17: goto L_0x015c;
                case 18: goto L_0x0152;
                case 19: goto L_0x0147;
                case 20: goto L_0x012f;
                case 21: goto L_0x0275;
                case 22: goto L_0x01ae;
                case 23: goto L_0x0005;
                case 24: goto L_0x0124;
                case 25: goto L_0x0110;
                case 26: goto L_0x00ff;
                case 27: goto L_0x00ee;
                case 28: goto L_0x00d2;
                case 29: goto L_0x00a8;
                case 30: goto L_0x0275;
                case 31: goto L_0x01ae;
                case 32: goto L_0x0005;
                case 33: goto L_0x00c7;
                case 34: goto L_0x00b6;
                case 35: goto L_0x00a8;
                case 36: goto L_0x0098;
                case 37: goto L_0x0275;
                case 38: goto L_0x01ae;
                case 39: goto L_0x0005;
                case 40: goto L_0x0089;
                case 41: goto L_0x0078;
                case 42: goto L_0x006b;
                case 43: goto L_0x004a;
                case 44: goto L_0x0033;
                case 45: goto L_0x0275;
                case 46: goto L_0x01ae;
                case 47: goto L_0x0005;
                case 48: goto L_0x0028;
                case 49: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x000c:
            java.lang.Object r4 = r10.A01
            X.NJT r4 = (X.NJT) r4
            X.0eM r0 = r4.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r2 = X.DbY.A05(r4)
            java.lang.Integer r1 = X.C71145Oe2.A02(r4)
            X.NUa r0 = X.OP6.A01(r4)
            X.NNI r4 = new X.NNI
            r4.<init>(r2, r3, r0, r1)
            return r4
        L_0x0028:
            java.lang.Object r0 = r10.A01
            X.KQV r0 = (X.KQV) r0
            X.0sa r0 = r0.A01
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x0033:
            java.lang.Object r2 = r10.A01
            X.KQV r2 = (X.KQV) r2
            X.MtU r0 = X.JTT.A0T(r2)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_PIN_TAP"
            X.2DR r1 = X.C66913Mex.A01(r1, r2, r0)
            X.Njy r0 = X.C69358Njy.RESTORE_WITH_PIN
            X.C66581MXm.A1D(r2, r0, r1)
            goto L_0x018f
        L_0x004a:
            java.lang.Object r2 = r10.A01
            X.KQV r2 = (X.KQV) r2
            X.MtU r0 = X.JTT.A0T(r2)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_OTC_TAP"
            r1.A0B(r0)
            X.0eM r0 = r2.A04
            boolean r0 = X.C66582MXn.A1Y(r0)
            if (r0 == 0) goto L_0x0068
            X.Njy r0 = X.C69358Njy.OTC_RESTORE
        L_0x0063:
            X.C66582MXn.A1H(r0, r2)
            goto L_0x018f
        L_0x0068:
            X.Njy r0 = X.C69358Njy.OTC_ENTER_CODE_INTRO
            goto L_0x0063
        L_0x006b:
            java.lang.Object r0 = r10.A01
            X.KQV r0 = (X.KQV) r0
            X.MtU r0 = X.JTT.A0T(r0)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_CANCEL_TAP"
            goto L_0x0084
        L_0x0078:
            java.lang.Object r0 = r10.A01
            X.KQV r0 = (X.KQV) r0
            X.MtU r0 = X.JTT.A0T(r0)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_TRY_ANOTHER_WAY_IMPRESSION"
        L_0x0084:
            r1.A0B(r0)
            goto L_0x018f
        L_0x0089:
            java.lang.Object r0 = r10.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.65E r4 = X.AnonymousClass65D.A00(r0)
            return r4
        L_0x0098:
            java.lang.Object r0 = r10.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMX r4 = new X.NMX
            r4.<init>(r0)
            return r4
        L_0x00a8:
            java.lang.Object r0 = r10.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429737(0x7f0b0969, float:1.8481155E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x00b6:
            java.lang.Object r2 = r10.A01
            X.NUB r2 = (X.NUB) r2
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.MtZ r0 = (X.C67720MtZ) r0
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            com.instagram.common.session.UserSession r0 = r0.A00
            goto L_0x00e2
        L_0x00c7:
            java.lang.Object r0 = r10.A01
            X.NUB r0 = (X.NUB) r0
            X.0sa r0 = r0.A01
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x00d2:
            java.lang.Object r2 = r10.A01
            X.NUA r2 = (X.NUA) r2
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.Mtc r0 = (X.C67723Mtc) r0
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            com.instagram.common.session.UserSession r0 = r0.A00
        L_0x00e2:
            X.OyT r0 = X.C69901Nu3.A00(r0, r1)
            r0.A05(r1)
            r2.A0I()
            goto L_0x018f
        L_0x00ee:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "BUNDLE_IS_HARDBLOCK_RELEASE"
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x00ff:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "BUNDLE_HAS_IMPLICIT_BACKUP"
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0110:
            java.lang.Object r2 = r10.A01
            X.NJT r2 = (X.NJT) r2
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.C71145Oe2.A02(r2)
            X.NMp r4 = new X.NMp
            r4.<init>(r1, r0)
            return r4
        L_0x0124:
            java.lang.Object r0 = r10.A01
            X.NUA r0 = (X.NUA) r0
            X.0sa r0 = r0.A01
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x012f:
            java.lang.Object r3 = r10.A01
            X.NJT r3 = (X.NJT) r3
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r1 = X.DbY.A05(r3)
            java.lang.Integer r0 = X.C71145Oe2.A02(r3)
            X.NNJ r4 = new X.NNJ
            r4.<init>(r1, r2, r0)
            return r4
        L_0x0147:
            java.lang.Object r0 = r10.A01
            X.KQc r0 = (X.C61887KQc) r0
            X.0sa r0 = r0.A00
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x0152:
            X.02m r0 = X.C51965G9l.A0l()
            X.65G r4 = new X.65G
            r4.<init>(r0)
            return r4
        L_0x015c:
            java.lang.Object r0 = r10.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            java.lang.Object[] r4 = new java.lang.Object[r0]
            return r4
        L_0x0164:
            java.lang.Object r2 = r10.A01
            X.Mu9 r2 = (X.C67754Mu9) r2
            com.instagram.common.session.UserSession r1 = r2.A05
            X.61K r0 = X.AnonymousClass61K.ENCRYPTED_BACKUPS_FISHFOOD_VIEWMODEL
            X.1aD r0 = X.1aD.A00(r1, r0)
            X.68G r0 = r0.A04
            X.68F r0 = r0.A01
            X.692 r0 = r0.A00
            java.lang.String r1 = r0.A09
            int r0 = X.C66580MXl.A06(r1)
            if (r0 <= 0) goto L_0x018f
            java.io.File r0 = X.AnonymousClass7TE.A0t(r1)
            X.C67754Mu9.A00(r2, r0)
            java.lang.String r0 = "Deleting DB and restart"
            X.C67754Mu9.A01(r2, r0)
            java.lang.String r0 = "Instagram Android Table Drop."
            X.0Je.A01(r0)
        L_0x018f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0192:
            java.lang.Object r3 = r10.A01
            X.NgT r3 = (X.C69180NgT) r3
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.Jfc r0 = (X.C60096Jfc) r0
            X.NN0 r4 = new X.NN0
            r4.<init>(r1, r2, r0)
            return r4
        L_0x01ae:
            java.lang.Object r0 = r10.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x01b5:
            java.lang.Object r0 = r10.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 1
            X.6ST r4 = new X.6ST
            r4.<init>(r1, r0)
            return r4
        L_0x01c2:
            java.lang.Object r0 = r10.A01
            X.NgT r0 = (X.C69180NgT) r0
            android.app.Application r2 = X.DbY.A05(r0)
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.MuJ r4 = new X.MuJ
            r4.<init>(r2, r1, r0)
            return r4
        L_0x01d8:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OBN r4 = new X.OBN
            r4.<init>(r0)
            return r4
        L_0x01e2:
            java.lang.Object r0 = r10.A01
            X.OO6 r0 = (X.OO6) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            java.lang.Integer r0 = r0.A07
            X.OyT r4 = X.C69901Nu3.A00(r1, r0)
            return r4
        L_0x01ef:
            java.lang.Object r0 = r10.A01
            X.P0u r0 = (X.C72303P0u) r0
            android.app.Activity r1 = r0.A00
            r0 = 2131961158(0x7f132546, float:1.9559005E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131961159(0x7f132547, float:1.9559007E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.N4O r4 = new X.N4O
            r4.<init>(r2, r1, r0)
            return r4
        L_0x020b:
            java.lang.Object r0 = r10.A01
            X.P0u r0 = (X.C72303P0u) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.65E r4 = X.AnonymousClass65D.A00(r0)
            return r4
        L_0x0216:
            java.lang.Object r2 = r10.A01
            X.P0t r2 = (X.C72302P0t) r2
            X.0eM r1 = r2.A02
            boolean r0 = X.C66582MXn.A1X(r1)
            if (r0 == 0) goto L_0x0250
            java.lang.Object r0 = r1.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            android.app.Activity r1 = r2.A00
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0250
            r0 = 2131961157(0x7f132545, float:1.9559003E38)
            java.lang.String r7 = r1.getString(r0)
            r0 = 2131961152(0x7f132540, float:1.9558993E38)
        L_0x023a:
            java.lang.String r5 = X.AnonymousClass7TE.A16(r1, r0)
            r9 = 2131237601(0x7f081ae1, float:1.8091457E38)
            r0 = 2131961156(0x7f132544, float:1.9559E38)
            java.lang.String r6 = r1.getString(r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            X.N4O r4 = new X.N4O
            r4.<init>((java.lang.CharSequence) r5, (java.lang.CharSequence) r6, (java.lang.CharSequence) r7, (java.lang.Integer) r8, (int) r9)
            return r4
        L_0x0250:
            android.app.Activity r1 = r2.A00
            r0 = 2131961157(0x7f132545, float:1.9559003E38)
            java.lang.String r7 = r1.getString(r0)
            r0 = 2131961155(0x7f132543, float:1.9558999E38)
            goto L_0x023a
        L_0x025d:
            java.lang.Object r0 = r10.A01
            X.P0t r0 = (X.C72302P0t) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.65E r4 = X.AnonymousClass65D.A00(r0)
            return r4
        L_0x0268:
            java.lang.Object r0 = r10.A01
            X.OHi r0 = (X.C70713OHi) r0
            com.instagram.common.session.UserSession r1 = r0.A03
            java.lang.Integer r0 = r0.A06
            X.OyT r4 = X.C69901Nu3.A00(r1, r0)
            return r4
        L_0x0275:
            java.lang.Object r4 = r10.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73904Plf.invoke():java.lang.Object");
    }
}

package X;

/* renamed from: X.Phc  reason: case insensitive filesystem */
public final class C73663Phc extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73663Phc(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0121, code lost:
        return java.lang.Boolean.valueOf(X.DbT.A1X(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0172, code lost:
        return X.AnonymousClass7TF.A0G(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x017c;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0173;
                case 3: goto L_0x002b;
                case 4: goto L_0x0165;
                case 5: goto L_0x00a2;
                case 6: goto L_0x0157;
                case 7: goto L_0x002b;
                case 8: goto L_0x0187;
                case 9: goto L_0x0150;
                case 10: goto L_0x0005;
                case 11: goto L_0x0145;
                case 12: goto L_0x012d;
                case 13: goto L_0x0122;
                case 14: goto L_0x002b;
                case 15: goto L_0x0111;
                case 16: goto L_0x0108;
                case 17: goto L_0x002b;
                case 18: goto L_0x0187;
                case 19: goto L_0x0150;
                case 20: goto L_0x0005;
                case 21: goto L_0x00f8;
                case 22: goto L_0x0187;
                case 23: goto L_0x0150;
                case 24: goto L_0x0005;
                case 25: goto L_0x00e8;
                case 26: goto L_0x000c;
                case 27: goto L_0x00dd;
                case 28: goto L_0x00d2;
                case 29: goto L_0x00c7;
                case 30: goto L_0x00bc;
                case 31: goto L_0x00b1;
                case 32: goto L_0x00a2;
                case 33: goto L_0x0097;
                case 34: goto L_0x008d;
                case 35: goto L_0x0076;
                case 36: goto L_0x006b;
                case 37: goto L_0x002b;
                case 38: goto L_0x0187;
                case 39: goto L_0x0150;
                case 40: goto L_0x0005;
                case 41: goto L_0x0060;
                case 42: goto L_0x0040;
                case 43: goto L_0x0036;
                case 44: goto L_0x002b;
                case 45: goto L_0x0187;
                case 46: goto L_0x0150;
                case 47: goto L_0x0005;
                case 48: goto L_0x001b;
                case 49: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x000c:
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.2dZ r3 = r1.A03(r0)
            return r3
        L_0x001b:
            java.lang.Object r0 = r9.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMa r3 = new X.NMa
            r3.<init>(r0)
            return r3
        L_0x002b:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429737(0x7f0b0969, float:1.8481155E38)
            goto L_0x016e
        L_0x0036:
            java.lang.Object r0 = r9.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "BUNDLE_WAS_TABLE_DROPPED"
            goto L_0x0119
        L_0x0040:
            java.lang.Object r1 = r9.A01
            X.NJT r1 = (X.NJT) r1
            X.0eM r0 = r1.A00
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r8 = X.C71145Oe2.A02(r1)
            android.app.Application r4 = X.DbY.A05(r1)
            r0 = 1
            X.PHr r7 = new X.PHr
            r7.<init>(r1, r0)
            X.12T r5 = X.AnonymousClass12T.A00
            X.NNL r3 = new X.NNL
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0060:
            java.lang.Object r0 = r9.A01
            X.NV0 r0 = (X.NV0) r0
            X.0sa r0 = r0.A01
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x006b:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131433860(0x7f0b1984, float:1.8489518E38)
            goto L_0x016e
        L_0x0076:
            java.lang.Object r1 = r9.A01
            X.NV0 r1 = (X.NV0) r1
            X.0eM r0 = r1.A0B
            boolean r0 = X.C66582MXn.A1Y(r0)
            if (r0 == 0) goto L_0x008a
            X.Njy r0 = X.C69358Njy.OTC_WAIT
        L_0x0084:
            X.C66582MXn.A1H(r0, r1)
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x008a:
            X.Njy r0 = X.C69358Njy.OTC_ENTER_CODE
            goto L_0x0084
        L_0x008d:
            java.lang.Object r0 = r9.A01
            X.NJT r0 = (X.NJT) r0
            r0.onBackPressed()
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0097:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131432465(0x7f0b1411, float:1.8486688E38)
            goto L_0x016e
        L_0x00a2:
            java.lang.Object r0 = r9.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.65E r3 = X.AnonymousClass65D.A00(r0)
            return r3
        L_0x00b1:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131431105(0x7f0b0ec1, float:1.848393E38)
            goto L_0x016e
        L_0x00bc:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131430587(0x7f0b0cbb, float:1.848288E38)
            goto L_0x016e
        L_0x00c7:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131427586(0x7f0b0102, float:1.8476792E38)
            goto L_0x016e
        L_0x00d2:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131428882(0x7f0b0612, float:1.8479421E38)
            goto L_0x016e
        L_0x00dd:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131428839(0x7f0b05e7, float:1.8479334E38)
            goto L_0x016e
        L_0x00e8:
            java.lang.Object r0 = r9.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMZ r3 = new X.NMZ
            r3.<init>(r0)
            return r3
        L_0x00f8:
            java.lang.Object r0 = r9.A01
            X.NJT r0 = (X.NJT) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMY r3 = new X.NMY
            r3.<init>(r0)
            return r3
        L_0x0108:
            java.lang.Object r0 = r9.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "BUNDLE_IS_HARDBLOCK_RELEASE"
            goto L_0x0119
        L_0x0111:
            java.lang.Object r0 = r9.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "BUNDLE_HAS_IMPLICIT_BACKUP"
        L_0x0119:
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0122:
            java.lang.Object r1 = r9.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "EncryptedBackupsOneTimeCodeWaitViewModel"
            X.1aU r3 = X.OP5.A01(r1, r0)
            return r3
        L_0x012d:
            java.lang.Object r3 = r9.A01
            X.NJT r3 = (X.NJT) r3
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.NUa r1 = X.OP6.A01(r3)
            android.app.Application r0 = X.DbY.A05(r3)
            X.NNK r3 = new X.NNK
            r3.<init>(r0, r2, r1)
            return r3
        L_0x0145:
            java.lang.Object r0 = r9.A01
            X.NUy r0 = (X.C68738NUy) r0
            X.0sa r0 = r0.A02
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x0150:
            java.lang.Object r0 = r9.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0157:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131431435(0x7f0b100b, float:1.84846E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0165:
            java.lang.Object r0 = r9.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
        L_0x016e:
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0173:
            java.lang.Object r0 = r9.A01
            X.NJT r0 = (X.NJT) r0
            X.NUa r3 = X.OP6.A01(r0)
            return r3
        L_0x017c:
            java.lang.Object r1 = r9.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "EncryptedBackupsOneTimeCodeEnterCodeViewModel"
            X.1aU r3 = X.OP5.A01(r1, r0)
            return r3
        L_0x0187:
            java.lang.Object r3 = r9.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73663Phc.invoke():java.lang.Object");
    }
}

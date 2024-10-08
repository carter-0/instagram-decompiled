package X;

/* renamed from: X.Ivs  reason: case insensitive filesystem */
public final class C58683Ivs extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58683Ivs(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C58683Ivs(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0121, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017b, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x01af;
                case 1: goto L_0x017c;
                case 2: goto L_0x0199;
                case 3: goto L_0x0192;
                case 4: goto L_0x017c;
                case 5: goto L_0x016d;
                case 6: goto L_0x015d;
                case 7: goto L_0x00f2;
                case 8: goto L_0x0005;
                case 9: goto L_0x0156;
                case 10: goto L_0x01af;
                case 11: goto L_0x013a;
                case 12: goto L_0x0124;
                case 13: goto L_0x00f2;
                case 14: goto L_0x0113;
                case 15: goto L_0x0005;
                case 16: goto L_0x0156;
                case 17: goto L_0x01af;
                case 18: goto L_0x00fd;
                case 19: goto L_0x00f2;
                case 20: goto L_0x00e1;
                case 21: goto L_0x00d5;
                case 22: goto L_0x0005;
                case 23: goto L_0x0156;
                case 24: goto L_0x01af;
                case 25: goto L_0x00c5;
                case 26: goto L_0x0005;
                case 27: goto L_0x0156;
                case 28: goto L_0x01af;
                case 29: goto L_0x0084;
                case 30: goto L_0x0005;
                case 31: goto L_0x0156;
                case 32: goto L_0x01af;
                case 33: goto L_0x0075;
                case 34: goto L_0x0062;
                case 35: goto L_0x0056;
                case 36: goto L_0x004f;
                case 37: goto L_0x004f;
                case 38: goto L_0x004f;
                case 39: goto L_0x003e;
                case 40: goto L_0x0005;
                case 41: goto L_0x0156;
                case 42: goto L_0x01af;
                case 43: goto L_0x002e;
                case 44: goto L_0x001e;
                case 45: goto L_0x0005;
                case 46: goto L_0x0156;
                case 47: goto L_0x01af;
                case 48: goto L_0x0008;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r11.A01
            return r4
        L_0x0008:
            java.lang.Object r2 = r11.A01
            X.E48 r2 = (X.E48) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A01
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H5v r4 = new X.H5v
            r4.<init>(r1, r0)
            return r4
        L_0x001e:
            java.lang.Object r0 = r11.A01
            X.E48 r0 = (X.E48) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.FA6 r4 = new X.FA6
            r4.<init>(r0)
            return r4
        L_0x002e:
            java.lang.Object r0 = r11.A01
            X.H1c r0 = (X.C54158H1c) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5b r4 = new X.H5b
            r4.<init>(r0)
            return r4
        L_0x003e:
            java.lang.Object r0 = r11.A01
            X.H1c r0 = (X.C54158H1c) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.GPq r4 = new X.GPq
            r4.<init>(r1, r0)
            return r4
        L_0x004f:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            goto L_0x0179
        L_0x0056:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0122
            java.lang.String r0 = "entryPoint"
            goto L_0x011d
        L_0x0062:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0122
            r0 = 2566(0xa06, float:3.596E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r4 = r1.getParcelableArrayList(r0)
            return r4
        L_0x0075:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0122
            java.lang.String r0 = "challengeTierList"
            java.util.ArrayList r4 = r1.getParcelableArrayList(r0)
            return r4
        L_0x0084:
            java.lang.Object r2 = r11.A01
            X.H0I r2 = (X.H0I) r2
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x00c0
            r0 = 2123(0x84b, float:2.975E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r0 = r1.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L_0x00c0
            long r9 = r0.longValue()
            com.instagram.api.schemas.ChallengeName r5 = X.H0I.A00(r2)
            com.instagram.api.schemas.ChallengeState r6 = X.H0I.A01(r2)
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = "ENTRY_POINT_KEY"
            java.lang.String r8 = r1.getString(r0)
        L_0x00b8:
            X.H6f r4 = new X.H6f
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00be:
            r8 = 0
            goto L_0x00b8
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00c5:
            java.lang.Object r1 = r11.A01
            X.H1f r1 = (X.C54161H1f) r1
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5u r4 = new X.H5u
            r4.<init>(r1, r0)
            return r4
        L_0x00d5:
            java.lang.Object r0 = r11.A01
            X.H0P r0 = (X.H0P) r0
            X.0eM r0 = r0.A04
            r0.getValue()
            X.02m r4 = X.02m.A0p
            return r4
        L_0x00e1:
            java.lang.Object r0 = r11.A01
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            X.H9N r0 = X.H9N.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x00f2:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0122
            java.lang.String r0 = "entrypoint"
            goto L_0x011d
        L_0x00fd:
            java.lang.Object r2 = r11.A01
            X.H0P r2 = (X.H0P) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H5t r4 = new X.H5t
            r4.<init>(r1, r0)
            return r4
        L_0x0113:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0122
            java.lang.String r0 = "media_id"
        L_0x011d:
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0122:
            r4 = 0
            return r4
        L_0x0124:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0135
            java.lang.String r0 = "achievement_id"
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L_0x0135
            return r4
        L_0x0135:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x013a:
            java.lang.Object r3 = r11.A01
            X.H0J r3 = (X.H0J) r3
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A01
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H6X r4 = new X.H6X
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0156:
            java.lang.Object r0 = r11.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x015d:
            java.lang.Object r0 = r11.A01
            X.H0N r0 = (X.H0N) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5a r4 = new X.H5a
            r4.<init>(r0)
            return r4
        L_0x016d:
            java.lang.Object r1 = r11.A01
            X.9RG r1 = (X.AnonymousClass9RG) r1
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
        L_0x0179:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x017c:
            java.lang.Object r0 = r11.A01
            X.K3p r0 = (X.C61347K3p) r0
            com.instagram.common.session.UserSession r1 = r0.A0A()
            android.content.Context r0 = r0.requireContext()
            boolean r0 = X.JWN.A05(r0)
            X.KCk r4 = new X.KCk
            r4.<init>(r1, r0)
            return r4
        L_0x0192:
            java.lang.Object r0 = r11.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0199:
            java.lang.Object r0 = r11.A01
            X.K3p r0 = (X.C61347K3p) r0
            com.instagram.common.session.UserSession r1 = r0.A0A()
            android.content.Context r0 = r0.requireContext()
            boolean r0 = X.JWN.A05(r0)
            X.KCl r4 = new X.KCl
            r4.<init>(r1, r0)
            return r4
        L_0x01af:
            java.lang.Object r0 = r11.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58683Ivs.invoke():java.lang.Object");
    }
}

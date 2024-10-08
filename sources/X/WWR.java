package X;

import com.instagram.common.session.UserSession;

public final class WWR implements AnonymousClass36F {
    public final int A00;
    public final Object A01;

    public WWR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass36D A00(UserSession userSession, Object obj, int i) {
        return new AnonymousClass36D(userSession, new WWR(obj, i), false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r0 = ((X.C15486Udb) r0.getValue()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        return r0.A0B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJb(X.1Xj r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0115;
                case 1: goto L_0x0106;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00c2;
                case 4: goto L_0x0132;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00a6;
                case 7: goto L_0x0093;
                case 8: goto L_0x007f;
                case 9: goto L_0x0074;
                case 10: goto L_0x0061;
                case 11: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r6.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            com.instagram.model.reels.Reel r0 = r0.A07
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.A1B(r7)
        L_0x0015:
            if (r0 == 0) goto L_0x0132
        L_0x0017:
            r5 = 1
            return r5
        L_0x0019:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Uau r0 = (X.C15344Uau) r0
            X.0eM r0 = r0.A0R
            java.lang.Object r0 = r0.getValue()
            X.Jgc r0 = (X.C60157Jgc) r0
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            X.JwK r0 = (X.C61082JwK) r0
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0132
            java.util.Iterator r3 = r0.iterator()
        L_0x003d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.1Xg r0 = (X.1Xg) r0
            java.lang.String r1 = r7.getId()
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            java.lang.String r0 = X.C51969G9p.A0u(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x0132
            goto L_0x0017
        L_0x0061:
            java.lang.Object r0 = r6.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r0
            X.Udf r0 = r0.A03
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0132
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            goto L_0x0015
        L_0x0074:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Uay r0 = (X.C15347Uay) r0
            X.0eM r0 = r0.A07
            goto L_0x0089
        L_0x007f:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Uax r0 = (X.C15346Uax) r0
            X.0eM r0 = r0.A07
        L_0x0089:
            java.lang.Object r0 = r0.getValue()
            X.Udb r0 = (X.C15486Udb) r0
            X.4n0 r0 = r0.A02
            goto L_0x0123
        L_0x0093:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Ub2 r0 = (X.C15351Ub2) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Ude r0 = (X.C15489Ude) r0
            X.4n0 r0 = r0.A02
            goto L_0x0123
        L_0x00a6:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Uaz r0 = (X.C15348Uaz) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.UdU r0 = (X.C15479UdU) r0
            X.4n0 r0 = r0.A00
            goto L_0x0123
        L_0x00b9:
            java.lang.Object r0 = r6.A01
            X.Uc0 r0 = (X.C15397Uc0) r0
            X.UdE r0 = r0.A04
            X.4n0 r0 = r0.A07
            goto L_0x0123
        L_0x00c2:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.TpO r0 = r0.A07
            if (r0 != 0) goto L_0x0132
            java.lang.String r0 = "grid"
            goto L_0x012a
        L_0x00d1:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r0 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r0
            X.UdD r0 = r0.A05
            if (r0 == 0) goto L_0x0128
            java.util.List r0 = r0.A04
            java.util.Iterator r4 = r0.iterator()
        L_0x00e3:
            boolean r0 = r4.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0132
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.ViH r2 = (X.C17926ViH) r2
            java.lang.Integer r1 = r2.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00e3
            X.1Xg r0 = r2.A02
            if (r0 == 0) goto L_0x00e3
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 != r7) goto L_0x00e3
            if (r3 == 0) goto L_0x0132
            return r5
        L_0x0106:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Ubn r0 = (X.C15388Ubn) r0
            X.UdG r0 = r0.A01
            if (r0 == 0) goto L_0x0128
            X.4n0 r0 = r0.A04
            goto L_0x0123
        L_0x0115:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.Ubz r0 = (X.C15396Ubz) r0
            X.UdF r0 = r0.A00
            if (r0 == 0) goto L_0x0128
            X.4n0 r0 = r0.A02
        L_0x0123:
            boolean r5 = r0.A0B(r7)
            return r5
        L_0x0128:
            java.lang.String r0 = "adapter"
        L_0x012a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0132:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WWR.AJb(X.1Xj):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        X.C15486Udb.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r0 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        X.DbS.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        X.C14227TsA.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQv(X.1Xj r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x006c;
                case 2: goto L_0x0060;
                case 3: goto L_0x0084;
                case 4: goto L_0x0094;
                case 5: goto L_0x0053;
                case 6: goto L_0x004b;
                case 7: goto L_0x0037;
                case 8: goto L_0x002d;
                case 9: goto L_0x0026;
                case 10: goto L_0x001a;
                case 11: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r2.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r1
            r0 = 1
            r1.A0M(r0)
            return
        L_0x000e:
            java.lang.Object r0 = r2.A01
            X.Uau r0 = (X.C15344Uau) r0
            X.2t9 r0 = X.C15344Uau.A00(r0)
            r0.notifyDataSetChanged()
            return
        L_0x001a:
            java.lang.Object r0 = r2.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r0
            X.Udf r1 = r0.A03
            X.1Xj r0 = r0.A01
            r1.A01(r0)
            return
        L_0x0026:
            java.lang.Object r0 = r2.A01
            X.Uay r0 = (X.C15347Uay) r0
            X.0eM r0 = r0.A07
            goto L_0x0033
        L_0x002d:
            java.lang.Object r0 = r2.A01
            X.Uax r0 = (X.C15346Uax) r0
            X.0eM r0 = r0.A07
        L_0x0033:
            X.C15486Udb.A00(r0)
            return
        L_0x0037:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r2.A01
            X.Ub2 r0 = (X.C15351Ub2) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Ude r0 = (X.C15489Ude) r0
            r0.A00()
            return
        L_0x004b:
            java.lang.Object r0 = r2.A01
            X.Uaz r0 = (X.C15348Uaz) r0
            X.C15479UdU.A00(r0)
            return
        L_0x0053:
            java.lang.Object r0 = r2.A01
            X.Uc0 r0 = (X.C15397Uc0) r0
            X.UdE r1 = r0.A04
            r0 = 655233526(0x270e11f6, float:1.9716195E-15)
            X.0fE.A00(r1, r0)
            return
        L_0x0060:
            java.lang.Object r0 = r2.A01
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r0 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r0
            X.UdD r0 = r0.A05
            if (r0 == 0) goto L_0x008c
            X.C15462UdD.A00(r0)
            return
        L_0x006c:
            java.lang.Object r0 = r2.A01
            X.Ubn r0 = (X.C15388Ubn) r0
            X.UdG r0 = r0.A01
            if (r0 == 0) goto L_0x008c
            r0.A0C()
            return
        L_0x0078:
            java.lang.Object r0 = r2.A01
            X.Ubz r0 = (X.C15396Ubz) r0
            X.UdF r0 = r0.A00
            if (r0 == 0) goto L_0x008c
            r0.A0C()
            return
        L_0x0084:
            java.lang.Object r0 = r2.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.TsA r0 = r0.A06
            if (r0 != 0) goto L_0x009a
        L_0x008c:
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0094:
            java.lang.Object r0 = r2.A01
            X.Ub9 r0 = (X.C15357Ub9) r0
            X.TsA r0 = r0.A06
        L_0x009a:
            X.C14227TsA.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WWR.DQv(X.1Xj):void");
    }
}

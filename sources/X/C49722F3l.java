package X;

/* renamed from: X.F3l  reason: case insensitive filesystem */
public abstract class C49722F3l {
    public final G54 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        C49722F3l f3l;
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        G54 g54 = null;
        if (obj instanceof C49722F3l) {
            f3l = (C49722F3l) obj;
        } else {
            f3l = null;
        }
        G54 g542 = this.A00;
        if (f3l != null) {
            g54 = f3l.A00;
        }
        return g542 == g54;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02b8, code lost:
        X.0qQ.A0F("stepName");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02c1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        return X.DbT.A1a(r1, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C47942ENt
            if (r0 == 0) goto L_0x022d
            r3 = r7
            X.ENt r3 = (X.C47942ENt) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0018;
                case 2: goto L_0x005d;
                case 3: goto L_0x0246;
                case 4: goto L_0x006e;
                case 5: goto L_0x0085;
                case 6: goto L_0x006e;
                case 7: goto L_0x0085;
                case 8: goto L_0x000c;
                case 9: goto L_0x000c;
                case 10: goto L_0x009a;
                case 11: goto L_0x00ba;
                case 12: goto L_0x000c;
                case 13: goto L_0x00de;
                case 14: goto L_0x000c;
                case 15: goto L_0x000c;
                case 16: goto L_0x000c;
                case 17: goto L_0x0109;
                case 18: goto L_0x0126;
                case 19: goto L_0x0167;
                case 20: goto L_0x0188;
                case 21: goto L_0x01ea;
                case 22: goto L_0x0018;
                case 23: goto L_0x0018;
                case 24: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0293
        L_0x0016:
            r5 = 1
        L_0x0017:
            return r5
        L_0x0018:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r6 = r0.A00
            com.instagram.common.session.UserSession r0 = r6.A00
            if (r0 == 0) goto L_0x0293
            r0 = 1001140420(0x3bac30c4, float:0.0052548368)
            java.lang.String r5 = "ConditionalOnboardingStepFactory"
            r4 = 1
            X.0f9 r0 = X.0wj.A00(r5, r0, r4)
            java.lang.String r3 = "ci_nux_eligibility"
            java.lang.String r2 = "checking CI NUX eligibility"
            r0.ABQ(r3, r2)
            r0.report()
            X.EXD r1 = r6.A01
            X.EXD r0 = X.EXD.SAC
            if (r1 == r0) goto L_0x004f
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x004f
            r0 = 1001133559(0x3bac15f7, float:0.005251642)
            X.0f9 r0 = X.0wj.A00(r5, r0, r4)
            r0.ABQ(r3, r2)
            r0.report()
            goto L_0x0293
        L_0x004f:
            r0 = 1001130976(0x3bac0be0, float:0.005250439)
            X.0f9 r0 = X.0wj.A00(r5, r0, r4)
            r0.ABQ(r3, r2)
            r0.report()
            goto L_0x0016
        L_0x005d:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0293
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "has_denied_full_ci_nux"
            goto L_0x0095
        L_0x006e:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0293
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "has_partially_imported_contacts"
            boolean r0 = X.DbT.A1a(r1, r0)
            r5 = r0 ^ 1
            return r5
        L_0x0085:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0293
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "has_partially_imported_contacts"
        L_0x0095:
            boolean r5 = X.DbT.A1a(r1, r0)
            return r5
        L_0x009a:
            X.0Tu r2 = X.0Tu.A05
            r0 = 18312933096307030(0x410f8400003956, double:1.898055633562294E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            r5 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            X.Ewb r0 = X.FCJ.A00(r0)
            if (r0 == 0) goto L_0x0017
            goto L_0x0016
        L_0x00ba:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r2 = r0.A00
            X.EXD r1 = r2.A01
            X.EXD r0 = X.EXD.A04
            if (r1 == r0) goto L_0x0016
            X.EXD r0 = X.EXD.SAC
            if (r1 != r0) goto L_0x0293
            com.instagram.common.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x0016
            X.6qt r1 = X.C319606qt.A01(r0)
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = r0.A06
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x0016
        L_0x00de:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            com.instagram.common.session.UserSession r3 = r0.A00
            if (r3 == 0) goto L_0x0293
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318191915374573(0x810734000017ed, double:3.0311090366789985E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 != 0) goto L_0x0016
            X.0t1 r0 = X.0eE.A00(r3)
            r0.A00()
            X.4Cl r0 = X.DbX.A0m(r3)
            java.lang.Boolean r0 = r0.Bvn()
            boolean r5 = X.AnonymousClass7TG.A1X(r0)
            return r5
        L_0x0109:
            X.0Tu r2 = X.0Tu.A05
            r0 = 18312933096307030(0x410f8400003956, double:1.898055633562294E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0293
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r0 = r0.A00
            X.EXD r1 = r0.A01
            if (r1 == 0) goto L_0x0293
            X.EXD r0 = X.EXD.A03
            if (r1 != r0) goto L_0x0293
            goto L_0x0016
        L_0x0126:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r2 = r0.A00
            X.EXD r1 = r2.A01
            X.EXD r0 = X.EXD.SAC
            r5 = 0
            if (r1 != r0) goto L_0x013a
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x013a
            return r5
        L_0x013a:
            com.instagram.common.session.UserSession r3 = r2.A00
            boolean r0 = r2.A00()
            if (r0 != 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321576350197278(0x810a480009261e, double:3.033249366888902E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0017
            r0 = 36330711745053412(0x811297000042e4, double:3.039026627381204E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0017
            r0 = 18316321825506022(0x411299000042e6, double:1.8993950373065188E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0017
            goto L_0x0016
        L_0x0167:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r2 = r0.A00
            X.EXD r1 = r2.A01
            X.EXD r0 = X.EXD.A04
            if (r1 != r0) goto L_0x0293
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0293
            X.0Tu r2 = X.0Tu.A06
            r0 = 18298454761538840(0x41025900000518, double:1.8923330353079327E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 == 0) goto L_0x0293
            goto L_0x0016
        L_0x0188:
            X.0Tu r4 = X.0Tu.A06
            r0 = 18302350296879735(0x4105e400001277, double:1.89387275545521E-307)
            boolean r0 = X.1AW.A06(r4, r0)
            r5 = 0
            if (r0 != 0) goto L_0x01a2
            r0 = 18302350297010809(0x4105e400021279, double:1.8938727555070174E-307)
            boolean r0 = X.1AW.A06(r4, r0)
            if (r0 == 0) goto L_0x01a2
            return r5
        L_0x01a2:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r2 = r0.A00
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0017
            X.FBl r1 = X.C47938ENp.A03
            com.instagram.common.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x01e8
            java.lang.String r0 = r0.A06
        L_0x01b6:
            X.ENp r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0297
            java.util.Map r0 = r0.A04
            java.util.ArrayList r0 = X.Dba.A0e(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x01c6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0297
            java.lang.Object r2 = r3.next()
            X.F38 r2 = (X.F38) r2
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x02b8
            kotlin.enums.EnumEntries r0 = X.C48155EZx.A00
            java.lang.String r0 = "IDENTITY_SYNCING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01c6
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x0017
            if (r1 != 0) goto L_0x01c6
            return r5
        L_0x01e8:
            r0 = 0
            goto L_0x01b6
        L_0x01ea:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r4 = r0.A00
            com.instagram.common.session.UserSession r3 = r4.A00
            r5 = 0
            if (r3 == 0) goto L_0x0017
            X.2Ly r2 = X.2Lv.A00(r3)
            java.lang.Class<X.FRM> r0 = X.FRM.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            r0 = 738(0x2e2, float:1.034E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r2.A00(r1, r0)
            if (r0 != 0) goto L_0x0211
            X.EXD r1 = r4.A01
            X.EXD r0 = X.EXD.A04
            if (r1 != r0) goto L_0x0017
        L_0x0211:
            X.LBg r1 = X.C64839Lj1.A0F
            r0 = 0
            boolean r0 = r1.A00(r0, r3)
            if (r0 == 0) goto L_0x0017
            X.FRW r1 = X.FRW.A04
            if (r1 != 0) goto L_0x0225
            X.FRW r1 = new X.FRW
            r1.<init>(r3)
            X.FRW.A04 = r1
        L_0x0225:
            monitor-enter(r1)
            boolean r0 = r1.A01     // Catch:{ all -> 0x02b5 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0017
            goto L_0x0016
        L_0x022d:
            boolean r0 = r7 instanceof X.C47941ENs
            if (r0 == 0) goto L_0x0293
            r1 = r7
            X.ENs r1 = (X.C47941ENs) r1
            X.F3l r0 = r1.A00
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0293
            X.F3l r0 = r1.A01
            boolean r0 = r0.A00()
            r5 = 1
            if (r0 != 0) goto L_0x0017
            goto L_0x0293
        L_0x0246:
            java.lang.Object r0 = r3.A01
            X.FET r0 = (X.FET) r0
            X.FRM r2 = r0.A00
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0293
            X.FBl r1 = X.C47938ENp.A03
            com.instagram.common.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x0295
            java.lang.String r0 = r0.A06
        L_0x0258:
            X.ENp r0 = r1.A04(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0016
            java.util.Map r0 = r0.A04
            java.util.ArrayList r0 = X.Dba.A0e(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0269:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.F38 r2 = (X.F38) r2
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x02b8
            kotlin.enums.EnumEntries r0 = X.C48155EZx.A00
            java.lang.String r0 = "IDENTITY_SYNCING"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x028f
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x02b8
            java.lang.String r0 = "IDENTITY_SYNCING_AFTER_NUX_LINKING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0269
        L_0x028f:
            int r0 = r2.A00
            if (r0 != r4) goto L_0x0269
        L_0x0293:
            r5 = 0
            return r5
        L_0x0295:
            r0 = 0
            goto L_0x0258
        L_0x0297:
            r0 = 18299305165129926(0x41031f000108c6, double:1.892669159467497E-307)
            boolean r0 = X.1AW.A06(r4, r0)
            if (r0 == 0) goto L_0x02a4
            X.0Tu r4 = X.0Tu.A05
        L_0x02a4:
            r0 = 18299305165064389(0x41031f000008c5, double:1.8926691594415935E-307)
            boolean r5 = X.1AW.A06(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.0qQ.A0A(r0)
            return r5
        L_0x02b5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02b8:
            java.lang.String r0 = "stepName"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49722F3l.A00():boolean");
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return ((C48155EZx) this.A00).name();
    }

    public C49722F3l(G54 g54, String str) {
        this.A00 = g54;
        this.A01 = str;
    }
}

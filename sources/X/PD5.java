package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class PD5 implements AnonymousClass1cH {
    public final UserSession A00;
    public final AnonymousClass1cH A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;

    public PD5(UserSession userSession, AnonymousClass1cH r14) {
        0qQ.A0B(r14, 1);
        C73658PhX phX = new C73658PhX(userSession, 8);
        C73658PhX phX2 = new C73658PhX(userSession, 9);
        C73658PhX phX3 = new C73658PhX(userSession, 10);
        C73658PhX phX4 = new C73658PhX(userSession, 11);
        C73658PhX phX5 = new C73658PhX(userSession, 12);
        C73658PhX phX6 = new C73658PhX(userSession, 13);
        C73658PhX phX7 = new C73658PhX(userSession, 14);
        C73658PhX phX8 = new C73658PhX(userSession, 15);
        C73658PhX phX9 = new C73658PhX(userSession, 7);
        C73815PkE pkE = C73815PkE.A00;
        C73816PkF pkF = C73816PkF.A00;
        C51969G9p.A1O(pkE, 12, pkF);
        this.A01 = r14;
        this.A00 = userSession;
        this.A0E = phX7;
        this.A0D = pkF;
        0eO r2 = 0eO.A02;
        this.A0B = A00(phX, r2, 24);
        this.A04 = A00(phX2, r2, 17);
        this.A07 = A00(phX3, r2, 20);
        this.A05 = A00(phX6, r2, 18);
        this.A06 = A00(phX4, r2, 19);
        this.A03 = A00(phX5, r2, 16);
        this.A02 = AnonymousClass0eN.A00(r2, new C73667Phg(26, phX8, this));
        this.A0A = A00(phX9, r2, 23);
        this.A0C = A00(pkE, r2, 25);
        this.A08 = A00(this, r2, 21);
        this.A09 = A00(this, r2, 22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        if (X.AnonymousClass7TF.A1Z(r11.A0A) != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.0xF r8, X.C74551Pwk r9, X.1OS r10, X.PD5 r11) {
        /*
            r0 = r10
            X.1bq r0 = (X.C65331bq) r0
            java.util.List r1 = r0.C6L()
            r0 = 0
            java.lang.Object r4 = r1.get(r0)
            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
            com.instagram.common.session.UserSession r3 = r11.A00
            X.0qQ.A0A(r4)
            X.797 r2 = X.AnonymousClass796.A00(r3, r10, r4)
            X.0eM r0 = r11.A0B
            X.2Dm r0 = X.C66580MXl.A0e(r0)
            X.3U9 r1 = r0.B33(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0028
            X.3Tu r0 = r1.AiM()
        L_0x0028:
            boolean r0 = X.C331057Pi.A02(r0)
            if (r0 == 0) goto L_0x00cc
            if (r1 == 0) goto L_0x0077
            java.lang.String r5 = r1.C6C()
            if (r5 == 0) goto L_0x0077
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322409576868012(0x810b0a003728ac, double:3.033776302790609E-306)
            boolean r1 = X.182.A06(r6, r3, r0)
            java.lang.String r6 = "CUTOVER_THREAD_LIST_PERF_KEY"
            X.0eM r7 = r11.A08
            java.lang.Object r0 = r7.getValue()
            X.0xa r0 = (X.0xa) r0
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = r0.C1q(r6)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = X.DbX.A0x(r1)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0077
            r0 = 44
            java.lang.String r5 = X.002.A0T(r1, r5, r0)
        L_0x0067:
            java.lang.Object r0 = r7.getValue()
            X.0xa r0 = (X.0xa) r0
            X.0xY r0 = r0.AR4()
            r0.E5g(r6, r5)
        L_0x0074:
            r0.commit()
        L_0x0077:
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_ONLY
            if (r2 == r0) goto L_0x00cc
            boolean r0 = r10 instanceof X.C65701gB
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "Unsupported content type for DirectForwardMessageMutation: "
            r1.append(r0)
            r0 = r10
            X.1gB r0 = (X.C65701gB) r0
            X.2FW r0 = r0.Aqm()
            r1.append(r0)
        L_0x0092:
            java.lang.String r2 = r1.toString()
            X.0eM r0 = r11.A0C
            java.lang.Object r1 = r0.getValue()
            X.0fA r1 = (X.0fA) r1
            r0 = 817899303(0x30c02727, float:1.3980966E-9)
            X.0f9 r0 = r1.AEf(r2, r0)
            r0.report()
            X.0eM r0 = r11.A0A
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0114
        L_0x00b0:
            X.4gN r1 = X.C270214gN.A0Q
            r0 = 0
            r9.DTM(r1, r0)
            return
        L_0x00b7:
            java.lang.String r0 = "Unsupported mutation type: "
            r1.append(r0)
            java.lang.String r0 = r10.A02()
            r1.append(r0)
            goto L_0x0092
        L_0x00c4:
            X.0xY r0 = r0.AR4()
            r0.ED3(r6)
            goto L_0x0074
        L_0x00cc:
            X.MaY r0 = r10.A02
            X.ODs r0 = r0.A00
            if (r0 == 0) goto L_0x0114
            boolean r0 = X.C70054NwW.A00(r0)
            if (r0 == 0) goto L_0x0114
            X.797 r0 = X.AnonymousClass797.OPEN_ONLY
            if (r2 != r0) goto L_0x0114
            X.0Tu r7 = X.0Tu.A05
            r0 = 2342168674372301938(0x20810e0000023472, double:4.070389454175035E-152)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x0108
            X.MaY r0 = r10.A02
            X.ODs r0 = r0.A00
            if (r0 == 0) goto L_0x0114
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto L_0x0114
            long r5 = r0.longValue()
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0114
            r0 = 36325665159459959(0x810e00000f3477, double:3.035835146330935E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 != 0) goto L_0x0114
        L_0x0108:
            X.OVs r1 = X.C69881Ntj.A00(r3)
            X.MaY r0 = r10.A02
            X.ODs r0 = r0.A00
            r1.A01(r0, r4)
            goto L_0x00b0
        L_0x0114:
            X.1cH r0 = r11.A01
            r0.EM9(r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PD5.A01(X.0xF, X.Pwk, X.1OS, X.PD5):void");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.0rk] */
    public final void EM9(0xF r21, C74551Pwk pwk, 1OS r23) {
        AnonymousClass7BP r2;
        0xF r7 = r21;
        1OS r5 = r23;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, r7);
        C74551Pwk pwk2 = pwk;
        0qQ.A0B(pwk2, 2);
        C65331bq r10 = (C65331bq) r5;
        DirectThreadKey directThreadKey = (DirectThreadKey) r10.C6L().get(0);
        2Dm A0e = C66580MXl.A0e(this.A0B);
        0qQ.A0A(directThreadKey);
        AnonymousClass3U9 B33 = A0e.B33(directThreadKey);
        int i = 1;
        if (AnonymousClass7TF.A1Z(this.A03) || (r5.A02.A00 == null && (B33 == null || B33.BMT() != AnonymousClass05K.A0N || B33.AiM() == null))) {
            0qQ.A0B(directThreadKey, 0);
            List list = directThreadKey.A02;
            if ((list == null || list.size() == A1U) && (AnonymousClass7TF.A1Z(this.A06) || AnonymousClass7TF.A1Z(this.A05) || C51971G9r.A1b(this.A0E))) {
                long convert = TimeUnit.SECONDS.convert(JTR.A0O(this.A0D) - r5.A01, TimeUnit.MILLISECONDS);
                AnonymousClass0eM r3 = this.A02;
                if (AnonymousClass7TE.A0R(r3.getValue()) <= 0 || convert <= AnonymousClass7TE.A0R(r3.getValue())) {
                    ? obj = new Object();
                    if (r10.Aqm() != 2FW.A1g) {
                        i = 4;
                    }
                    obj.A00 = i;
                    AnonymousClass0eM r32 = this.A07;
                    r32.getValue();
                    String traceIdForAliasId = TraceLogger.getTraceIdForAliasId(obj.A00, r5.A05);
                    if (traceIdForAliasId != null) {
                        r32.getValue();
                        C282375Cv.A03(traceIdForAliasId, (List) null, obj.A00, 7034, 0);
                    }
                    if (B33 != null) {
                        B33.C6C();
                    }
                    1bO r33 = (1bO) this.A04.getValue();
                    C72644PDx pDx = new C72644PDx(r7, pwk2, r5, this, directThreadKey, traceIdForAliasId, obj);
                    String str = directThreadKey.A00;
                    List list2 = directThreadKey.A02;
                    if (str == null && list2 != null) {
                        if (182.A06(0Tu.A05, r33.A0M, 36325605028934731L)) {
                            r2 = new C68959Nbl(new C72642PDv(1, pDx, r33), r33, list2);
                            r2.A03();
                            return;
                        }
                    }
                    r2 = new AnonymousClass7BO(ThreadFetchReason.EAGER_THREAD_RESOLUTION, new C72642PDv(2, pDx, r33), r33, directThreadKey);
                    r2.A03();
                    return;
                }
                pwk2.DTM(C270214gN.A0S, (String) null);
                return;
            }
        }
        C70621ODs oDs = r5.A02.A00;
        if (oDs != null && C70054NwW.A00(oDs) == A1U) {
            C69881Ntj.A00(this.A00).A02(directThreadKey);
        }
        if (B33 != null) {
            B33.C6C();
        }
        A01(r7, pwk2, r5, this);
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C73658PhX(obj, i));
    }

    public final boolean CeE(1OS r2, C74248Prc prc) {
        AnonymousClass7TG.A1N(r2, prc);
        return this.A01.CeE(r2, prc);
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FhS  reason: case insensitive filesystem */
public final class C50727FhS implements AnonymousClass5IX {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ea, code lost:
        if (r10 == 1) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E1z(X.AnonymousClass5IY r18) {
        /*
            r17 = this;
            r6 = r17
            android.content.Context r5 = r6.A00
            com.instagram.common.session.UserSession r4 = r6.A01
            r3 = 1
            X.NBv r2 = new X.NBv
            r2.<init>(r5, r4)
            X.1Ub r0 = new X.1Ub
            r0.<init>(r5)
            X.1Uf r1 = r0.A00()
            java.lang.String r0 = "fdid_oe_exposure_time"
            X.1Uk r9 = r1.A00(r0)
            X.1Ub r0 = new X.1Ub
            r0.<init>(r5)
            X.1Uf r1 = r0.A00()
            X.95S r0 = X.AGj.A00
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r12 = r0.getTime()
            X.0qQ.A07(r12)
            java.lang.String r0 = "fdid_oe"
            X.1Uk r10 = r1.A00(r0)
            X.EUn r1 = X.C48069EUn.NDX_FDID_HOLDOUT
            java.lang.String r8 = "ndx_fdid_holdout"
            r13 = 250(0xfa, float:3.5E-43)
            r11 = 2
            java.lang.String[] r7 = r1.A02
            java.util.Date r0 = r1.A01
            java.util.Date r1 = r1.A00
            r16 = 1
            java.lang.String r2 = r2.A00()
            boolean r0 = r12.before(r0)
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r12.after(r1)
            if (r0 != 0) goto L_0x00fb
            X.0Tu r12 = X.0Tu.A06
            r0 = 36314674337155840(0x81040100000b00, double:3.028884506049321E-306)
            boolean r0 = X.182.A06(r12, r4, r0)
            if (r0 != 0) goto L_0x00fb
            r1 = -1
            if (r2 == 0) goto L_0x00fb
            java.lang.String r0 = X.AGj.A01(r8)
            int r0 = r10.getInt(r0, r1)
            if (r0 != r1) goto L_0x0078
            java.lang.String r0 = X.002.A0R(r2, r8)
            int r0 = X.DbZ.A04(r10, r0, r8)
        L_0x0078:
            if (r0 < 0) goto L_0x00fb
            int r0 = r0 / r13
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r10 = (int) r0
            if (r10 >= r11) goto L_0x00fb
            if (r10 < 0) goto L_0x00fb
            X.0kM r0 = X.DbY.A0M(r4)
            X.0wc r1 = r0.A00()
            java.lang.String r0 = "fdid_offline_experiment_exposure"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 153(0x99, float:2.14E-43)
            X.1Ln r11 = new X.1Ln
            r11.<init>(r1, r0)
            X.0qQ.A0A(r11)
            r1 = r7[r10]
            java.lang.String r0 = "not_in_experiment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ea
            if (r9 == 0) goto L_0x00ea
            java.lang.String r12 = X.AGj.A00(r8)
            r0 = -1
            long r0 = r9.getLong(r12, r0)
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r0
            long r12 = X.C47272Du0.A00
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00ea
            boolean r0 = X.DbT.A1Y(r11)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "exp_name"
            r11.A0R(r0, r8)
            r1 = r7[r10]
            java.lang.String r0 = "exp_group"
            r11.A0R(r0, r1)
            java.lang.String r0 = "family_device_id"
            r11.A0R(r0, r2)
            r11.Cgf()
            X.1W3 r7 = r9.AR0()
            java.lang.String r2 = X.AGj.A00(r8)
            long r0 = java.lang.System.currentTimeMillis()
            r7.A08(r2, r0)
            r7.A0B()
        L_0x00ea:
            if (r10 != r3) goto L_0x00fb
        L_0x00ec:
            r2 = 0
            if (r16 != 0) goto L_0x00fa
            boolean r1 = r6.A02
            boolean r0 = X.C267044ar.A00(r5, r4)
            r0 = r0 ^ 1
            if (r1 != r0) goto L_0x00fa
            r2 = 1
        L_0x00fa:
            return r2
        L_0x00fb:
            r16 = 0
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50727FhS.E1z(X.5IY):boolean");
    }

    public C50727FhS(UserSession userSession, Context context, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
    }
}

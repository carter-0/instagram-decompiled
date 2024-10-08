package X;

import android.os.StatFs;
import com.instagram.common.session.UserSession;

/* renamed from: X.ONh  reason: case insensitive filesystem */
public final class C70835ONh {
    public final AnonymousClass3HH A00;
    public final C67460MoF A01;
    public final NUT A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C73918Ply(this, 17));
    public final C62320sa A04;
    public final UserSession A05;
    public final C62320sa A06;
    public final C62320sa A07;

    public final double A00() {
        Object invoke = this.A06.invoke();
        if (!0qQ.A0K(invoke, AnonymousClass000.A00(707)) && !0qQ.A0K(invoke, "mounted_ro")) {
            return 0.0d;
        }
        StatFs statFs = (StatFs) this.A07.invoke();
        0qQ.A0B(statFs, 0);
        return ((double) (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong())) / 1.073741824E9d;
    }

    public final double A01() {
        StatFs statFs = (StatFs) this.A07.invoke();
        return ((double) (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong())) / 1.073741824E9d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c0, code lost:
        if (90.0d > X.182.A00(r5, r8, 37170880363102741L)) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r17 = this;
            r10 = r17
            X.NUT r7 = r10.A02
            r7.A09()
            X.3HH r0 = r10.A00
            X.0xa r11 = r0.A00
            java.lang.String r3 = "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN"
            r2 = 0
            boolean r1 = r11.getBoolean(r3, r2)
            java.lang.String r0 = "TOGGLE_LOW_STORAGE_MODE_ACTIVATION_STATUS"
            r7.A0E(r0, r1)
            boolean r0 = r11.getBoolean(r3, r2)
            r6 = 1
            if (r0 == 0) goto L_0x00c2
            X.MoF r4 = r10.A01
            boolean r1 = r4.A00()
            java.lang.String r0 = "MESSAGE_EXPIRATION_ENABLED"
            r7.A0E(r0, r1)
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x00c2
            X.0eM r3 = r10.A03
            java.lang.Object r0 = r3.getValue()
            X.MoD r0 = (X.C67458MoD) r0
            long r1 = r0.A05()
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0043
            r1 = 1
        L_0x0043:
            java.lang.String r0 = "USER_CUTOVER_TIMESTAMP_ABOVE_THRESHOLD"
            r7.A0E(r0, r1)
            java.lang.Object r0 = r3.getValue()
            X.MoD r0 = (X.C67458MoD) r0
            long r1 = r0.A05()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00c2
            double r2 = r10.A01()
            com.instagram.common.session.UserSession r8 = r4.A01
            X.0Tu r5 = r4.A00
            r0 = 37170880362775058(0x840eb800030212, double:3.57035264431585E-306)
            double r12 = X.182.A00(r5, r8, r0)
            java.lang.String r9 = java.lang.String.valueOf(r12)
            java.lang.String r4 = "LOW_DISK_SPACE_ERASE_TRIGGER_GB"
            r7.A0D(r4, r9)
            double r15 = X.182.A00(r5, r8, r0)
            java.lang.String r1 = "CUSTOM_DISK_SPACE_THRESHOLD"
            r0 = 0
            float r4 = r11.getFloat(r1, r0)
            r0 = 36326455433312018(0x810eb8000d3712, double:3.0363349186971547E-306)
            boolean r9 = X.182.A06(r5, r8, r0)
            double r13 = r10.A01()
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            boolean r1 = X.Dba.A1U(r0)
            java.lang.String r0 = "STORAGE_SPACE_LOW"
            r7.A0E(r0, r1)
            r11 = 0
            if (r9 == 0) goto L_0x009a
            double r2 = (double) r4
        L_0x009a:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00c2
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x00c2
            r0 = 37170880363102741(0x840eb800080215, double:3.570352644523078E-306)
            double r2 = X.182.A00(r5, r8, r0)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "MESSAGE_EXPIRATION_RETENTION_DAYS"
            r7.A0D(r2, r3)
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r1 = X.182.A00(r5, r8, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 1
            if (r0 <= 0) goto L_0x00c3
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            X.MoF r0 = r10.A01
            com.instagram.common.session.UserSession r9 = r0.A01
            X.0Tu r8 = r0.A00
            r0 = 36326455433180944(0x810eb8000b3710, double:3.036334918614263E-306)
            boolean r3 = X.182.A06(r8, r9, r0)
            java.lang.String r2 = "MEV2_FEATURE_ENABLED"
            r7.A0E(r2, r3)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0118
            if (r4 == 0) goto L_0x0116
            double r3 = r10.A00()
            r0 = 37170880363168278(0x840eb800090216, double:3.570352644564524E-306)
            double r1 = X.182.A00(r8, r9, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0116
            double r4 = r10.A00()
            double r2 = r10.A01()
            r0 = 37170880363233815(0x840eb8000a0217, double:3.57035264460597E-306)
            double r0 = X.182.A00(r8, r9, r0)
            double r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
        L_0x0106:
            java.lang.String r0 = "TRIGGER_MESSAGE_EXPIRATION_ELIGIBILITY"
            r7.A0E(r0, r6)
            if (r6 == 0) goto L_0x0113
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x010f:
            r7.A0A(r0)
            return r6
        L_0x0113:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x010f
        L_0x0116:
            r6 = 0
            goto L_0x0106
        L_0x0118:
            r6 = r4
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70835ONh.A02():boolean");
    }

    public C70835ONh(UserSession userSession, AnonymousClass3HH r5, NUT nut, C62320sa r7, C62320sa r8, C62320sa r9) {
        C51972G9s.A1C(r7, r5);
        0qQ.A0B(r9, 7);
        this.A05 = userSession;
        this.A04 = r7;
        this.A00 = r5;
        this.A02 = nut;
        this.A07 = r8;
        this.A06 = r9;
        this.A01 = C70003Nvh.A00(userSession);
    }
}

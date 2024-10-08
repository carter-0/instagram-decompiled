package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IWc  reason: case insensitive filesystem */
public final class C57293IWc implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r10 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI0(android.net.Uri r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r2 = 0
            r1 = r16
            X.0qQ.A0B(r1, r2)
            java.lang.String r0 = "thread_id"
            java.lang.String r8 = r1.getQueryParameter(r0)
            r13 = 0
            r3 = 1
            if (r8 == 0) goto L_0x007c
            int r0 = r8.length()
            if (r0 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r7 = r15.A01
            X.2Dm r0 = X.2L2.A00(r7)
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r5 = r0.A0N(r8)
            if (r5 == 0) goto L_0x007c
            X.HpP r0 = X.C56508Hze.A02
            X.KWh r0 = r0.A00(r7, r8)
            X.0Ud r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            boolean r0 = X.C59678JTj.A01(r3, r1)
            r9 = 0
            if (r0 == 0) goto L_0x0080
            X.JTj r1 = (X.C59678JTj) r1
            if (r1 == 0) goto L_0x0080
            java.lang.Object r4 = r1.A01
            X.Gmn r4 = (X.C53363Gmn) r4
            if (r4 == 0) goto L_0x0045
            java.lang.String r10 = r4.A05
            if (r10 != 0) goto L_0x0047
        L_0x0045:
            java.lang.String r10 = r7.A06
        L_0x0047:
            boolean r0 = r5.CUG()
            if (r0 != 0) goto L_0x007d
            java.util.List r0 = r5.BRZ()
            java.lang.String r11 = X.I5N.A01(r10, r0, r3)
            java.util.List r0 = r5.BRZ()
            java.lang.String r12 = X.I5N.A01(r10, r0, r2)
        L_0x005d:
            androidx.fragment.app.FragmentActivity r6 = r15.A00
            if (r4 != 0) goto L_0x0062
            r13 = 1
        L_0x0062:
            X.1Av r3 = X.1Au.A00(r7)
            java.lang.String r0 = "blend_last_invite_time_ms"
            java.lang.String r2 = X.002.A0R(r0, r8)
            r0 = 1
            boolean r14 = X.1Av.A07(r3, r2, r0)
            if (r4 == 0) goto L_0x0076
            java.lang.String r9 = r4.A04
        L_0x0076:
            r5.CUG()
            X.I5N.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x007c:
            return
        L_0x007d:
            r11 = r9
            r12 = r9
            goto L_0x005d
        L_0x0080:
            r4 = r9
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57293IWc.CI0(android.net.Uri, android.os.Bundle):void");
    }

    public C57293IWc(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}

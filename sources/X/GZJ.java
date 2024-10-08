package X;

import com.instagram.common.session.UserSession;

public abstract class GZJ implements JRN {
    public C267324bN A00;
    public C52058GDe A01;
    public JRK A02;
    public final UserSession A03;
    public final String A04;

    public final void Eg1(float f) {
    }

    public final boolean CeZ() {
        JRK jrk = this.A02;
        if (jrk != null) {
            return jrk.isPlaying();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ECP(java.lang.String r7) {
        /*
            r6 = this;
            X.JRK r5 = r6.A02
            r4 = 0
            if (r5 == 0) goto L_0x0023
            r5.stop()
            com.instagram.common.session.UserSession r3 = r6.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320541263995479(0x81095700172257, double:3.032594774206927E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "fragment_paused"
            if (r7 == r0) goto L_0x001c
            r1 = 1
            if (r2 != 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r0 = 0
            r5.EHs(r3, r0, r1, r2)
            r6.A02 = r4
        L_0x0023:
            r6.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZJ.ECP(java.lang.String):void");
    }

    public final void EKy(int i, boolean z) {
        if (this instanceof C54597HKg) {
            AnonymousClass4M3 r0 = ((C54597HKg) this).A00;
            if (r0 != null) {
                r0.EKy(i, z);
                return;
            }
            return;
        }
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.seekTo(i);
        }
    }

    public final void EL3() {
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.seekTo(0);
        }
    }

    public GZJ(UserSession userSession, String str) {
        this.A03 = userSession;
        this.A04 = str;
    }
}

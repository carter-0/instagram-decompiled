package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GIb  reason: case insensitive filesystem */
public final class C52185GIb extends C52050GCw {
    public boolean A00 = true;
    public boolean A01 = true;
    public final C57048IMo A02;
    public final ClipsViewerConfig A03;
    public final C270664h6 A04;
    public final UserSession A05;
    public final 0xa A06;
    public final C3728893a A07;
    public final GM9 A08;
    public final C62320sa A09;

    public C52185GIb(ClipsViewerConfig clipsViewerConfig, UserSession userSession, C62320sa r6) {
        this.A05 = userSession;
        this.A03 = clipsViewerConfig;
        this.A09 = r6;
        0xa A0n = C51969G9p.A0n(1Al.A01(userSession), 1An.A2h, this);
        this.A06 = A0n;
        this.A08 = C52166GHi.A00(userSession);
        this.A07 = AnonymousClass93Z.A01(userSession);
        this.A02 = new C57048IMo(this, 1);
        this.A01 = A0n.getBoolean("seen_chained_media_headload_response", true);
        this.A04 = new H39(this, 0);
    }

    public static final void A00(C52185GIb gIb, int i) {
        C62320sa r1 = gIb.A09;
        if (i < GD6.A01(r1).A0A()) {
            C267324bN A0E = GD6.A01(r1).A0E(i);
            Set set = gIb.A08.A05;
            if (!set.isEmpty()) {
                0qQ.A0B(A0E, 0);
                if (!set.contains(A0E.getId())) {
                    return;
                }
            }
            if (!gIb.A01) {
                gIb.A01 = true;
                0xY AR4 = gIb.A06.AR4();
                AR4.E5T("seen_chained_media_headload_response", gIb.A01);
                AR4.apply();
                C3728893a r0 = gIb.A07;
                if (r0 != null) {
                    r0.A05(A0E, true);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (X.1KU.A02(r4).contains(r14.A03.A0J.name()) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(int r15) {
        /*
            r14 = this;
            com.instagram.common.session.UserSession r4 = r14.A05
            boolean r0 = X.1KU.A05(r4)
            if (r0 != 0) goto L_0x000e
            boolean r0 = X.1KU.A04(r4)
            if (r0 == 0) goto L_0x00b3
        L_0x000e:
            r6 = 0
            X.0Tu r2 = X.DbS.A0J(r4, r6)
            r0 = 36318509746886860(0x81077e003c18cc, double:3.0313100346071736E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0041
            if (r15 != 0) goto L_0x0062
            X.0sa r0 = r14.A09
            X.GBg r0 = X.GD6.A01(r0)
            java.util.Iterator r3 = X.C52009GBg.A07(r0)
            r1 = 0
        L_0x002b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r3.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0054
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0041:
            java.util.List r1 = X.1KU.A02(r4)
            com.instagram.clips.intf.ClipsViewerConfig r0 = r14.A03
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            java.lang.String r0 = r0.name()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0064
            goto L_0x0062
        L_0x0054:
            X.4bN r0 = (X.C267324bN) r0
            if (r1 <= 0) goto L_0x00b4
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x00b4
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x00b4
        L_0x0062:
            r14.A00 = r6
        L_0x0064:
            X.93a r5 = r14.A07
            if (r5 == 0) goto L_0x00b0
            boolean r1 = r14.A00
            com.instagram.clips.intf.ClipsViewerConfig r0 = r14.A03
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            java.lang.String r4 = r0.name()
            r3 = 2
            X.0qQ.A0B(r4, r3)
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x00b0
            X.C3728893a.A02(r5)
            X.0XK r9 = new X.0XK
            r9.<init>()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r1 = 8
            java.lang.String r0 = "jpc_enabled"
            r9.A00(r0, r2, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "entry_index"
            r9.A00(r0, r1, r3)
            r1 = 1
            java.lang.String r0 = "analytics_module"
            r9.A00(r0, r4, r1)
            X.02m r4 = X.C3728893a.A00(r5)
            r5 = 976032351(0x3a2d125f, float:6.602164E-4)
            r7 = 7
            long r10 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r8 = "is_jpc_enabled"
            r13 = r6
            r4.markerPoint(r5, r6, r7, r8, r9, r10, r12, r13)
        L_0x00b0:
            A00(r14, r15)
        L_0x00b3:
            return
        L_0x00b4:
            r1 = r2
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52185GIb.A0C(int):void");
    }

    public final boolean A0D() {
        if (this.A00 && !this.A01) {
            GM9 gm9 = this.A08;
            long j = gm9.A01;
            if (j != -1) {
                if (C51966G9m.A07(j) > TimeUnit.MINUTES.toMillis(182.A01(0Tu.A05, gm9.A02, 36599984722874019L))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}

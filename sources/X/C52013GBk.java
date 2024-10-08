package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GBk  reason: case insensitive filesystem */
public final class C52013GBk extends C249403jg {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final /* synthetic */ C52012GBj A03;

    public C52013GBk(C52012GBj gBj) {
        this.A03 = gBj;
    }

    private final boolean A00(RecyclerView recyclerView, C267324bN r6) {
        1Xj r0;
        if ((!C2808154f.A04(recyclerView) || r6.A01 == C295365o2.GHOST) && (!0qQ.A0K(this.A03.A07.A0U, true) || (r0 = r6.A02) == null || !r0.A5z())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        if (X.0qQ.A0K(r1, "friend_su_in_reels") == false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r13, int r14) {
        /*
            r12 = this;
            r0 = 243372183(0xe819097, float:3.194019E-30)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r13, r5)
            X.GBj r4 = r12.A03
            X.4bN r3 = X.C52012GBj.A04(r4)
            boolean r0 = r4.A0D
            r7 = 1
            if (r0 == 0) goto L_0x0025
            boolean r2 = X.AnonymousClass7TF.A1P(r14)
            com.instagram.common.session.UserSession r0 = r4.A08
            X.1wS r1 = X.1wS.A01(r0)
            com.facebook.video.heroplayer.ipc.HeroScrollSetting r0 = r4.A06
            r1.A0D(r0, r2)
        L_0x0025:
            if (r14 != 0) goto L_0x0121
            if (r3 == 0) goto L_0x0051
            int r0 = r12.A00
            if (r0 != r7) goto L_0x0051
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0051
            boolean r0 = r12.A00(r13, r3)
            if (r0 == 0) goto L_0x0051
            X.GBl r0 = r4.A04
            if (r0 == 0) goto L_0x0051
            java.util.Set r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r1.next()
            X.32U r0 = (X.AnonymousClass32U) r0
            r0.Dpv()
            goto L_0x0041
        L_0x0051:
            r12.A02 = r5
            com.instagram.common.session.UserSession r7 = r4.A08
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319480405564857(0x81086000001db9, double:3.0319238830636677E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x008d
            r1 = 0
            if (r3 == 0) goto L_0x0137
            X.5o2 r8 = r3.A01
        L_0x0067:
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r8 != r0) goto L_0x012d
            X.GmE r0 = r3.A02()
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r0.A0B
        L_0x0073:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x012d
            boolean r0 = X.GBU.A09
            if (r0 != 0) goto L_0x008a
            boolean r0 = X.GBU.A0A
            if (r0 == 0) goto L_0x008a
            X.HtK r0 = X.GBU.A05
            if (r0 == 0) goto L_0x008a
            r0.A01()
        L_0x008a:
            r0 = 1
        L_0x008b:
            X.GBU.A09 = r0
        L_0x008d:
            r0 = 36320618571899562(0x810969000022aa, double:3.032643664036763E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00fc
            com.instagram.clips.intf.ClipsViewerConfig r0 = r4.A07
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r1 != r0) goto L_0x00fc
            X.GDC r9 = r4.A02
            if (r9 == 0) goto L_0x00fc
            r1 = 0
            if (r3 == 0) goto L_0x012a
            X.5o2 r8 = r3.A01
        L_0x00a9:
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r8 != r0) goto L_0x00be
            X.GmE r0 = r3.A02()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = r0.A0B
        L_0x00b5:
            java.lang.String r0 = "friend_su_in_reels"
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            X.GDB r10 = r9.A00
            r1 = 0
            if (r0 == 0) goto L_0x00c6
            r1 = 8
        L_0x00c6:
            X.2dY r9 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r8 = r10.A0D
            X.2dZ r11 = r9.A03(r8)
            X.2dZ.A0F(r11)
            com.instagram.common.ui.base.IgTextView r0 = X.2dZ.A04(r11)
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x00fc
            com.instagram.common.ui.base.IgTextView r0 = X.2dZ.A04(r11)
            r0.setVisibility(r1)
            X.0eM r0 = r11.A0X
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r0.setVisibility(r1)
            X.2dZ r9 = r9.A03(r8)
            r8 = 0
            if (r1 != 0) goto L_0x00f9
            X.2is r1 = r10.A0I
            boolean r0 = r1 instanceof X.C227252iu
            if (r0 == 0) goto L_0x00f9
            r8 = r1
        L_0x00f9:
            r9.ErT(r8)
        L_0x00fc:
            r0 = 36322199119865852(0x810ad9000027fc, double:3.033643208935001E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0121
            if (r3 == 0) goto L_0x0121
            java.lang.String r2 = r3.getId()
            X.GD6 r0 = r4.A09
            X.I4M r1 = r0.A00
            if (r1 == 0) goto L_0x0121
            java.lang.String r0 = r1.A02
            boolean r0 = X.00l.A0d(r2, r0, r5)
            if (r0 != 0) goto L_0x0121
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0121
            r1.A09 = r5
        L_0x0121:
            r12.A00 = r14
            r0 = 2037733021(0x7975569d, float:7.961684E34)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x012a:
            r8 = r1
            goto L_0x00a9
        L_0x012d:
            boolean r0 = X.GBU.A09
            if (r0 == 0) goto L_0x0134
            X.GBU.A00()
        L_0x0134:
            r0 = 0
            goto L_0x008b
        L_0x0137:
            r8 = r1
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52013GBk.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(-1407845341);
        0qQ.A0B(recyclerView, 0);
        if (!this.A01) {
            C52012GBj gBj = this.A03;
            C267324bN A0C = gBj.A0C(gBj.A06());
            if (A0C != null) {
                if (A00(recyclerView, A0C)) {
                    this.A01 = true;
                    C267324bN r8 = gBj.A01;
                    C52014GBl gBl = gBj.A04;
                    if (gBl != null) {
                        if (A0C.A01 != C295365o2.BLEND_END_OF_FEED || r8 == null) {
                            r8 = A0C;
                        }
                        for (AnonymousClass32U Dpy : gBl.A03) {
                            Dpy.Dpy(r8, gBl.A00);
                        }
                    }
                }
                if (A0C.A02 != null) {
                    gBj.A01 = A0C;
                }
            }
        }
        if (this.A00 == 1 && i2 != 0) {
            this.A02 = true;
        }
        AnonymousClass0fD.A0A(-1449948773, A032);
    }
}

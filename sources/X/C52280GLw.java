package X;

import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.GLw  reason: case insensitive filesystem */
public final class C52280GLw extends C270664h6 {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C52280GLw(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }

    public final void D3r(H3D h3d) {
        if (1 - this.A01 != 0) {
            super.D3r(h3d);
            return;
        }
        EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A00;
        C321676uZ r1 = effectsPageFragment.A05;
        C268654dm r0 = h3d.A01;
        r1.A0T(r0);
        if (r0 != null && (r0 instanceof C268664dn)) {
            EffectsPageFragment.A05(effectsPageFragment, 2131961549);
        }
    }

    public final void D3t(C52228GJt gJt) {
        switch (this.A01) {
            case 1:
                ((EffectsPageFragment) this.A00).A05.A00.A04();
                return;
            case 2:
                0qQ.A0B(gJt, 0);
                if (this.A00 == null) {
                    this.A00 = gJt;
                }
                18g A012 = C638918c.A01(C61170le.A00);
                A012.A0O(A012.A02, "REELS_TAB_NETWORK_REQUEST_STARTED");
                C52196GIn gIn = (C52196GIn) this.A02;
                C52228GJt gJt2 = (C52228GJt) this.A00;
                if (gJt2 != null) {
                    gJt = gJt2;
                }
                C52196GIn.A01(gJt, gIn);
                return;
            default:
                super.D3t(gJt);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (X.AnonymousClass1B1.A00(r5).A00(X.1B2.A0a) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3u(X.C52263GLe r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x012d;
                case 1: goto L_0x011d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 0
            X.0qQ.A0B(r12, r3)
            java.lang.Object r4 = r11.A02
            X.GIn r4 = (X.C52196GIn) r4
            X.4Co r0 = r4.A01
            X.C51970G9q.A1S(r0)
            com.instagram.common.session.UserSession r5 = r4.A08
            X.0Tu r2 = X.DbS.A0J(r5, r3)
            r0 = 36325918562006387(0x810e3b00073573, double:3.0359953991216664E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x004c
            r0 = 36318509745969346(0x81077e002e18c2, double:3.031310034026934E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x004c
        L_0x002e:
            java.util.List r0 = r12.A09
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0038
            r6.add(r0)
            goto L_0x0038
        L_0x004c:
            r0 = 36325918562202998(0x810e3b000a3576, double:3.035995399246004E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0066
            boolean r0 = X.AnonymousClass1B0.A05
            X.1B0 r1 = X.AnonymousClass1B1.A00(r5)
            X.1B2 r0 = X.1B2.A0a
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0066
            goto L_0x002e
        L_0x0066:
            r0 = 36325918562334072(0x810e3b000c3578, double:3.035995399328896E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0076
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x0076
            goto L_0x002e
        L_0x0076:
            X.GBj r0 = r4.A02
            if (r0 == 0) goto L_0x002e
            int r1 = r0.A06()
            X.GD6 r0 = r4.A0D
            X.GBg r7 = r0.A0A
            java.util.List r6 = r7.A0I()
            int r1 = r1 + 1
            if (r1 < 0) goto L_0x002e
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x002e
            java.util.List r0 = X.C51969G9p.A0v(r6, r1)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r0.iterator()
        L_0x009c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r8 = r10.next()
            r6 = r8
            X.4bN r6 = (X.C267324bN) r6
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x009c
            X.1Xj r6 = r6.A02
            if (r6 == 0) goto L_0x00c6
            boolean r0 = r6.A5z()
            if (r0 != 0) goto L_0x009c
            X.1Ua r1 = r4.A0B
            java.lang.String r0 = r6.getId()
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00c6
            goto L_0x009c
        L_0x00c6:
            r9.add(r8)
            goto L_0x009c
        L_0x00ca:
            java.util.Iterator r6 = r9.iterator()
        L_0x00ce:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r6.next()
            X.4bN r1 = (X.C267324bN) r1
            X.0qQ.A0B(r1, r3)
            r0 = 1
            r7.A0T(r1, r0)
            goto L_0x00ce
        L_0x00e2:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r6.iterator()
        L_0x00ea:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r7 = r8.next()
            r6 = r7
            X.1Xj r6 = (X.1Xj) r6
            boolean r0 = r6.CcK()
            r1 = 1
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r6.CcK()
            if (r0 != 0) goto L_0x00ea
            java.util.List r0 = r6.A3b()
            if (r0 == 0) goto L_0x0113
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0113
            goto L_0x00ea
        L_0x0113:
            boolean r0 = X.C52196GIn.A03(r6, r4)
            if (r0 != 0) goto L_0x00ea
            r3.add(r7)
            goto L_0x00ea
        L_0x011d:
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r1 = r11.A02
            X.JOk r1 = (X.C59564JOk) r1
            X.5u7 r0 = r12.A01
            X.H2n r0 = (X.C54193H2n) r0
            r1.DoI(r0)
            return
        L_0x012d:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r3 = r11.A02
            X.GXJ r3 = (X.GXJ) r3
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x01ae
            X.5qs r4 = X.GXJ.A00(r3)
            if (r4 == 0) goto L_0x01ae
            com.instagram.common.session.UserSession r2 = r3.A02
            X.1se r1 = X.1sd.A00(r2)
            X.1Xj r0 = r4.BPf()
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x01ae
            X.5oy r4 = r4.A01
            java.util.List r1 = r12.A09
            java.lang.Object r0 = r11.A00
            java.lang.String r0 = X.C51966G9m.A1F(r0)
            java.util.List r0 = X.AnonymousClass93X.A00(r2, r0, r1)
            r4.A04(r0)
            X.5u7 r0 = r12.A01
            X.4sa r0 = r0.BaP()
            r4.A03 = r0
            int r2 = r4.A00
            java.util.List r0 = r4.A02()
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            if (r2 >= r1) goto L_0x01ae
            int r0 = r4.A00
            int r0 = r0 + 1
            r4.A00 = r0
            java.lang.String r1 = r4.A0A
            X.TpO r0 = r3.A03
            r0.A08(r1)
            X.JQy r0 = r0.A0D
            r0.EHL()
            return
        L_0x0189:
            r0 = 36323427480644762(0x810bf700022c9a, double:3.034420029237795E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x019e
            X.5u7 r0 = r12.A01
            boolean r0 = r0.CPt()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ae
        L_0x019e:
            X.93F r2 = r4.A09
            X.93C r1 = r4.A0A
            boolean r0 = r12.A0D
            r2.A9J(r1, r3, r0)
            X.5o6 r1 = r4.A0C
            X.5o7 r0 = X.C295415o7.FLASH_CACHE
            r1.A01(r0, r3)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52280GLw.D3u(X.GLe):void");
    }

    public C52280GLw(C52196GIn gIn) {
        this.A01 = 2;
        this.A02 = gIn;
    }
}

package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.NQw  reason: case insensitive filesystem */
public final class C68642NQw extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C68642NQw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass3NG r1, Object obj, Object obj2, int i) {
        r1.A04 = new C68642NQw(i, obj, obj2);
        r1.A00();
    }

    public final void DP5(View view) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                C70431O6i o6i = ((NOV) this.A02).A02;
                C317966o8 r8 = ((C68185N5a) this.A01).A01;
                0qQ.A0B(r8, 1);
                P3E p3e = o6i.A00.A03;
                ArrayList A1C = AnonymousClass7TE.A1C();
                String str = r8.A0S;
                0qQ.A07(str);
                A1C.add(new WVK(new C72317P1i(p3e), str));
                if (p3e.A0X) {
                    UserSession userSession = p3e.A0G;
                    if (182.A06(0Tu.A05, userSession, 36325166942532266L)) {
                        String str2 = r8.A0S;
                        0qQ.A07(str2);
                        A1C.add(new WVL(new N41(new C61077JwF(r8, "", 8), 1), new C72319P1k(p3e, 0), C71044OaM.A03(userSession, str2)));
                    }
                }
                C54944HZa.A00(view, p3e.A0G, A1C);
                return;
            case 2:
                0qQ.A0B(view, 0);
                C70652OEz oEz = (C70652OEz) this.A01;
                C68137N2b n2b = (C68137N2b) this.A02;
                C71020OYv oYv = oEz.A02;
                if (AnonymousClass7TF.A1Z(oYv.A0F)) {
                    C54944HZa.A00(view, oYv.A06, AnonymousClass7TE.A1I(new WVL(new N41(new C61077JwF(n2b, ""), 2), new C72320P1l(1, oEz.A01, oYv), ((C67542Mpc) oYv.A0E.getValue()).A02(n2b.A01.A05))));
                    return;
                }
                return;
            case 11:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            default:
                super.DP5(view);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        X.C68478NJv.A04(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0128, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x01e0;
                case 2: goto L_0x010e;
                case 3: goto L_0x000c;
                case 4: goto L_0x00f7;
                case 5: goto L_0x0094;
                case 6: goto L_0x0071;
                case 7: goto L_0x0056;
                case 8: goto L_0x003e;
                case 9: goto L_0x0026;
                case 10: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A02
            X.0sa r0 = (X.C62320sa) r0
        L_0x0009:
            r0.invoke()
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            boolean r0 = X.C66583MXo.A1Y(r13)
            if (r0 == 0) goto L_0x023e
            r0 = 3
            r13.performHapticFeedback(r0)
            java.lang.Object r2 = r12.A02
            X.NJv r2 = (X.C68478NJv) r2
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "❤️"
            goto L_0x006d
        L_0x0026:
            boolean r0 = X.C66583MXo.A1Y(r13)
            if (r0 == 0) goto L_0x023e
            r0 = 3
            r13.performHapticFeedback(r0)
            java.lang.Object r2 = r12.A02
            X.NJv r2 = (X.C68478NJv) r2
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "😂"
            goto L_0x006d
        L_0x003e:
            boolean r0 = X.C66583MXo.A1Y(r13)
            if (r0 == 0) goto L_0x023e
            r0 = 3
            r13.performHapticFeedback(r0)
            java.lang.Object r2 = r12.A02
            X.NJv r2 = (X.C68478NJv) r2
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "🔥"
            goto L_0x006d
        L_0x0056:
            boolean r0 = X.C66583MXo.A1Y(r13)
            if (r0 == 0) goto L_0x023e
            r0 = 3
            r13.performHapticFeedback(r0)
            java.lang.Object r2 = r12.A02
            X.NJv r2 = (X.C68478NJv) r2
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "😍"
        L_0x006d:
            X.C68478NJv.A04(r1, r2, r0)
            goto L_0x000c
        L_0x0071:
            boolean r0 = X.C66583MXo.A1Y(r13)
            if (r0 == 0) goto L_0x023e
            r0 = 3
            r13.performHapticFeedback(r0)
            java.lang.Object r0 = r12.A02
            X.NJa r0 = (X.C68462NJa) r0
            android.view.View r1 = r0.A00
            if (r1 != 0) goto L_0x0087
            java.lang.String r0 = "bannerView"
            goto L_0x0128
        L_0x0087:
            r0 = 8
            r1.setVisibility(r0)
            java.lang.Object r0 = r12.A01
            X.OGJ r0 = (X.OGJ) r0
            X.0sa r0 = r0.A03
            goto L_0x0009
        L_0x0094:
            java.lang.Object r6 = r12.A02
            X.OdL r6 = (X.C71126OdL) r6
            com.instagram.common.session.UserSession r4 = r6.A0Q
            X.60k r1 = X.C3018660j.A01(r4)
            X.Nmo r0 = X.C69506Nmo.A0S
            r7 = 0
            r1.A0B(r0)
            java.lang.Object r0 = r12.A01
            X.NWf r0 = (X.C68770NWf) r0
            long r1 = r6.A00
            java.lang.String r11 = r0.A0B
            java.lang.String r10 = r0.A08
            java.lang.String r9 = r0.A0G
            com.instagram.common.typedurl.ImageUrl r8 = r0.A04
            java.lang.String r5 = r0.A0E
            X.AnonymousClass7TG.A1Q(r10, r9)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "NOTE_ID"
            r3.putLong(r0, r1)
            java.lang.String r0 = "NOTE_TEXT"
            r3.putString(r0, r11)
            r0 = 463(0x1cf, float:6.49E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.putString(r0, r10)
            java.lang.String r0 = "AUTHOR_USERNAME"
            r3.putString(r0, r9)
            java.lang.String r0 = "AUDIO_CLUSTER_ID"
            r3.putString(r0, r5)
            java.lang.String r0 = "AUTHOR_PROFILE_PIC"
            r3.putParcelable(r0, r8)
            java.lang.String r0 = "camera_entry_bounds"
            r3.putParcelable(r0, r7)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            com.instagram.base.activity.BaseFragmentActivity r2 = r6.A0O
            r0 = 3065(0xbf9, float:4.295E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.AnonymousClass6W8.A02(r2, r3, r4, r1, r0)
            r0 = 256(0x100, float:3.59E-43)
            r1.A0A(r2, r0)
            goto L_0x000c
        L_0x00f7:
            java.lang.Object r0 = r12.A02
            X.Mz9 r0 = (X.C68042Mz9) r0
            android.content.Context r3 = X.JTQ.A06(r0)
            com.instagram.common.session.UserSession r2 = r0.A07
            java.lang.Object r0 = r12.A01
            X.Jw0 r0 = (X.C61062Jw0) r0
            java.lang.String r1 = r0.A02
            X.2EG r0 = X.2EG.A46
            X.Dbb.A0k(r3, r2, r0, r1)
            goto L_0x000c
        L_0x010e:
            java.lang.Object r3 = r12.A01
            X.OEz r3 = (X.C70652OEz) r3
            java.lang.Object r4 = r12.A02
            X.N2b r4 = (X.C68137N2b) r4
            X.OYv r5 = r3.A02
            X.0eM r0 = r5.A0F
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0151
            com.instagram.model.direct.gifs.DirectAnimatedMedia r6 = r4.A00
            X.OFy r2 = r5.A03
            if (r2 != 0) goto L_0x0130
            java.lang.String r0 = "directGifCategoriesTabsManager"
        L_0x0128:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0130:
            X.Jec r0 = r2.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01dc
            java.util.List r1 = r2.A03
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.N4H r0 = (X.N4H) r0
            java.lang.Object r0 = r0.A03
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x0146:
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x01b9;
                case 2: goto L_0x01c0;
                case 3: goto L_0x01c3;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01c9;
                case 6: goto L_0x01cc;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01d8;
                default: goto L_0x014d;
            }
        L_0x014d:
            java.lang.String r0 = "recents"
        L_0x014f:
            r6.A00 = r0
        L_0x0151:
            X.7Hz r1 = r5.A09
            if (r1 == 0) goto L_0x015a
            X.NjK r0 = r5.A0B
            r1.DMN(r0, r4)
        L_0x015a:
            com.instagram.common.session.UserSession r2 = r5.A06
            X.0iw r1 = r3.A00
            java.lang.String r9 = r5.A0D
            com.instagram.model.direct.gifs.DirectAnimatedMedia r0 = r4.A00
            java.lang.String r8 = r0.A05
            java.lang.String r6 = r5.A04
            boolean r7 = r4.A02
            long r4 = java.lang.System.currentTimeMillis()
            boolean r3 = r3.A03
            r0 = 3
            X.0qQ.A0B(r8, r0)
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r2)
            java.lang.String r0 = "giphy_gif_send_attempt"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "gif_id"
            r2.AAJ(r0, r8)
            if (r9 != 0) goto L_0x018b
            java.lang.String r9 = ""
        L_0x018b:
            java.lang.String r0 = X.C66654MaN.A00()
            r2.AAJ(r0, r9)
            double r0 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r2.A8D(r0, r1)
            if (r7 == 0) goto L_0x01b6
            r0 = 1
        L_0x01a0:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "is_trending"
            r2.A9F(r0, r1)
            java.lang.String r0 = "response_id"
            r2.AAJ(r0, r6)
            X.C66581MXm.A1H(r2, r3)
            r2.Cgf()
            goto L_0x000c
        L_0x01b6:
            r0 = 0
            goto L_0x01a0
        L_0x01b9:
            r0 = 3107(0xc23, float:4.354E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x014f
        L_0x01c0:
            java.lang.String r0 = "popular"
            goto L_0x014f
        L_0x01c3:
            java.lang.String r0 = "laugh"
            goto L_0x014f
        L_0x01c6:
            java.lang.String r0 = "love"
            goto L_0x014f
        L_0x01c9:
            java.lang.String r0 = "sad"
            goto L_0x014f
        L_0x01cc:
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x014f
        L_0x01d4:
            java.lang.String r0 = "thumbs"
            goto L_0x014f
        L_0x01d8:
            java.lang.String r0 = "search"
            goto L_0x014f
        L_0x01dc:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            goto L_0x0146
        L_0x01e0:
            java.lang.Object r2 = r12.A02
            X.7Hz r2 = (X.C329207Hz) r2
            java.lang.Object r1 = r12.A01
            X.N2b r1 = (X.C68137N2b) r1
            X.NjK r0 = X.C69319NjK.UNKNOWN
            r2.DMN(r0, r1)
            goto L_0x000c
        L_0x01ef:
            java.lang.Object r2 = r12.A02
            X.NOV r2 = (X.NOV) r2
            X.O6i r1 = r2.A02
            java.lang.Object r0 = r12.A01
            X.N5a r0 = (X.C68185N5a) r0
            X.6o8 r6 = r0.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.OHJ r0 = r1.A00
            X.P3E r0 = r0.A03
            X.O6U r0 = r0.A0J
            X.NJX r0 = r0.A00
            X.OUx r0 = r0.A00
            if (r0 == 0) goto L_0x021b
            X.NJq r0 = r0.A00
            X.O6V r0 = r0.A07
            r0.getClass()
            X.NJc r0 = r0.A00
            X.Pw6 r0 = r0.A02
            if (r0 == 0) goto L_0x021b
            r0.D7d(r6)
        L_0x021b:
            com.instagram.common.session.UserSession r3 = r2.A01
            r0 = 1
            X.0Tu r2 = X.DbS.A0J(r3, r0)
            r0 = 36609803016607670(0x82106c001a17b6, double:3.215525071322464E-306)
            int r0 = X.DbS.A04(r2, r3, r0)
            X.Nj5 r7 = X.C69304Nj5.CUTOUT
            r5 = 0
            long r10 = java.lang.System.currentTimeMillis()
            X.PUH r4 = new X.PUH
            r8 = r5
            r9 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.OPI.A01(r3, r4, r0)
            goto L_0x000c
        L_0x023e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68642NQw.Dqe(android.view.View):boolean");
    }
}

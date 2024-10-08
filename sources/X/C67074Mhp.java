package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.Mhp  reason: case insensitive filesystem */
public final class C67074Mhp implements C74512Pw7 {
    public OF5 A00;
    public boolean A01;
    public final /* synthetic */ C66633Ma2 A02;

    public final 2cs ByR(DirectThreadKey directThreadKey, boolean z) {
        0qQ.A0B(directThreadKey, 0);
        C66633Ma2 ma2 = this.A02;
        if (!ma2.A1J.isResumed()) {
            return null;
        }
        UserSession A0p = ma2.A0p();
        if (182.A06(DbS.A0J(A0p, 1), A0p, 36325579259458624L)) {
            return null;
        }
        String str = directThreadKey.A00;
        Pair pair = ma2.A08;
        if (pair == null || !0qQ.A0K(pair.first, str)) {
            AnonymousClass0eM r3 = ma2.A2d;
            ((2cs) AnonymousClass7TE.A14(r3)).A08(0.0d, true);
            ma2.A08 = new Pair(str, AnonymousClass7TE.A14(r3));
        }
        Pair pair2 = ma2.A08;
        0qQ.A0A(pair2);
        return (2cs) pair2.second;
    }

    public final void DKN(DirectThreadKey directThreadKey, String str) {
        0qQ.A0B(directThreadKey, 0);
        if (directThreadKey.A00 != null && str != null) {
            C66633Ma2 ma2 = this.A02;
            if (((C74548Pwh) ma2.A2v.getValue()).Cnr(directThreadKey.A00, str)) {
                C66633Ma2.A0W(ma2, directThreadKey);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DKO(android.view.View r14, X.C67058MhZ r15, X.C254743sy r16, java.util.List r17) {
        /*
            r13 = this;
            r0 = 2
            X.0qQ.A0B(r14, r0)
            java.lang.String r0 = "DirectInboxController.RowDelegate.onInboxThreadRowBind"
            X.0lp r3 = X.0lq.A00(r0)
            X.Ma2 r4 = r13.A02
            X.0eM r0 = r4.A2B     // Catch:{ all -> 0x00b6 }
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00af
            com.instagram.model.direct.DirectThreadKey r5 = X.C66647MaG.A04(r16)     // Catch:{ all -> 0x00b6 }
            if (r5 == 0) goto L_0x00af
            java.lang.String r2 = r5.A00     // Catch:{ all -> 0x00b6 }
            X.2Dm r0 = r4.A0v()     // Catch:{ all -> 0x00b6 }
            java.util.HashSet r0 = r0.Bk6()     // Catch:{ all -> 0x00b6 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00af
            if (r2 == 0) goto L_0x00af
            java.util.HashSet r1 = r4.A1Z     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r5.A00     // Catch:{ all -> 0x00b6 }
            boolean r0 = X.00k.A0u(r1, r0)     // Catch:{ all -> 0x00b6 }
            if (r0 != 0) goto L_0x00af
            r1.add(r2)     // Catch:{ all -> 0x00b6 }
            X.2Dm r0 = r4.A0v()     // Catch:{ all -> 0x00b6 }
            java.util.ArrayList r12 = r0.CBx(r5)     // Catch:{ all -> 0x00b6 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x00b6 }
        L_0x0049:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b6 }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r0.A0g()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0049
            r5.add(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x0049
        L_0x005f:
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x00b6 }
        L_0x0063:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x00b6 }
            java.util.HashMap r9 = r4.A1V     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = r9.get(r10)     // Catch:{ all -> 0x00b6 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0082
            double r7 = r0.doubleValue()     // Catch:{ all -> 0x00b6 }
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            goto L_0x0084
        L_0x0082:
            r7 = 0
        L_0x0084:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 + r0
        L_0x0087:
            java.lang.Double r0 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x00b6 }
            r9.put(r10, r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x0063
        L_0x008f:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x00b6 }
            if (r0 != 0) goto L_0x00af
            com.instagram.common.session.UserSession r0 = r4.A0p()     // Catch:{ all -> 0x00b6 }
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "ig_inbox_reels_play_pile_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)     // Catch:{ all -> 0x00b6 }
            boolean r0 = r1.isSampled()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00af
            X.C66580MXl.A1J(r1, r2)     // Catch:{ all -> 0x00b6 }
            r1.Cgf()     // Catch:{ all -> 0x00b6 }
        L_0x00af:
            X.C66633Ma2.A0D(r14, r4)     // Catch:{ all -> 0x00b6 }
            r3.close()
            return
        L_0x00b6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67074Mhp.DKO(android.view.View, X.MhZ, X.3sy, java.util.List):void");
    }

    public final boolean DRf(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, C254743sy r25, String str, List list, boolean z, boolean z2) {
        AnonymousClass3U9 r12;
        C254743sy r14 = r25;
        0qQ.A0B(r14, 0);
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str2 = str;
        List list2 = list;
        DbZ.A0t(1, directShareTarget2, str2, list2);
        C66633Ma2 ma2 = this.A02;
        if (!ma2.A1A) {
            DirectThreadKey A04 = C66647MaG.A04(r14);
            Integer num = null;
            if (A04 != null) {
                boolean isLockedChatEnabled = LockedChatKillSwitch.isLockedChatEnabled(ma2.A0p(), true);
                r12 = 2Dr.A03(ma2.A0v(), A04);
                if (r12 == null) {
                    List list3 = A04.A02;
                    if (list3 != null) {
                        num = C51968G9o.A0t(list3);
                    }
                    boolean A1a = DbW.A1a(A04.A00);
                    0wb r2 = 0wb.A01;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Could not find thread with threadKey thread. threadIdIsNull:");
                    A1A.append(A1a);
                    A1A.append(", numRecipients:");
                    A1A.append(num);
                    A1A.append(", isLockedChatEnabled");
                    A1A.append(isLockedChatEnabled);
                    r2.Ew1("DirectInboxController_missingThread_onMessageLongClick", A1A.toString(), 1);
                }
            } else {
                r12 = null;
            }
            C67484Moe.A00(rectF, view, mhZ, (C67484Moe) ma2.A26.getValue(), new P3P(ma2), ma2.A0t(), r12, directShareTarget2, r14, str2, (String) null, list2, z, z2);
            return true;
        }
        return true;
    }

    public final void Dc8(DirectThreadKey directThreadKey, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        0qQ.A0B(reel, 1);
        ((C66650MaJ) this.A02.A2b.getValue()).A02(reel, AnonymousClass3BQ.DIRECT_INBOX, gradientSpinnerAvatarView);
    }

    public final void Dg2(C254743sy r3) {
        0qQ.A0B(r3, 0);
        C70320O1y.A00(this.A02.A0p()).A03(AnonymousClass05K.A0C);
        A02(r3, C331537Rj.DIRECT_INBOX_THREAD, true);
    }

    public final void Dg3(C67058MhZ mhZ, C254743sy r3, List list, int i) {
        0qQ.A0B(r3, 0);
        A01(mhZ, r3, list, i);
    }

    public final void Dg5(C254743sy r2, boolean z) {
        0qQ.A0B(r2, 0);
        A02(r2, C331537Rj.DIRECT_INBOX_CALL_BACK, z);
    }

    public final void DgL(C254743sy r4) {
        0qQ.A0B(r4, 0);
        C70320O1y.A00(this.A02.A0p()).A03(AnonymousClass05K.A0C);
        A02(r4, C331537Rj.DIRECT_INBOX_THREAD, false);
    }

    public final void Dzf(RectF rectF, C74455PvA pvA, DirectThreadKey directThreadKey) {
        C74455PvA pvA2 = pvA;
        DirectThreadKey directThreadKey2 = directThreadKey;
        AnonymousClass7TF.A1B(directThreadKey2, 0, pvA2);
        C66633Ma2 ma2 = this.A02;
        AnonymousClass4DH r9 = ma2.A1J;
        if (!r9.isResumed()) {
            0wb.A01.Ew0("DirectInboxPresenter", "click listener called when fragment is not resumed");
            return;
        }
        ma2.A0y();
        AnonymousClass3U9 A03 = 2Dr.A03(ma2.A0v(), directThreadKey2);
        RectF rectF2 = rectF;
        if (ORX.A01(ma2.A0p())) {
            C72990PRz pRz = new C72990PRz(0, rectF2, pvA2, ma2, A03);
            ORX.A00(r9.requireContext(), ma2.A0p(), pRz);
            return;
        }
        UserSession A0p = ma2.A0p();
        Integer num = AnonymousClass05K.A0N;
        if (!C70349O3b.A00(A0p, num)) {
            C66633Ma2.A0B(rectF2, pvA2, ma2, A03);
            return;
        }
        1Av A002 = 1Au.A00(ma2.A0p());
        int i = A002.A01.getInt("zero_rating_direct_video_nux_count", 0);
        1R7 C82 = AnonymousClass1Qz.A00(ma2.A0p()).C82();
        C50107FOx fOx = new C50107FOx(i, 0, (Object) A03, (Object) ma2, (Object) pvA2, (Object) A002, (Object) rectF2);
        Context requireContext = r9.requireContext();
        ma2.A0p();
        C49256Erz.A00(requireContext, fOx, C82, r9, (ImageUrl) null, false, num);
    }

    public C67074Mhp(C66633Ma2 ma2) {
        this.A02 = ma2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (X.AnonymousClass65A.A02(X.AnonymousClass65D.A00(r3.A0p()).A00, 36326627231152009L) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C67058MhZ r13, X.C254743sy r14, int r15) {
        /*
            r12 = this;
            java.lang.String r4 = "inbox"
            X.Ma2 r3 = r12.A02
            X.Pvy r0 = X.C66581MXm.A0V(r3)
            X.PuB r8 = r0.BVW()
            X.0eM r0 = r3.A2D
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r0 = r3.A0p()
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36326627231152009(0x810ee000003789, double:3.0364435643429393E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            r11 = 13376(0x3440, float:1.8744E-41)
            if (r0 == 0) goto L_0x002d
        L_0x002b:
            r11 = 13369(0x3439, float:1.8734E-41)
        L_0x002d:
            r9 = r14
            boolean r0 = r14 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r7 = r13
            r10 = r15
            if (r0 == 0) goto L_0x0063
            X.1a8 r5 = r3.A1K
            X.MYb r2 = X.MYc.A00(r3)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r4 = X.C66647MaG.A06(r14)
            X.1aU r1 = r2.A09
            r0 = 52
            X.1aU r3 = X.C72120Owf.A01(r1, r4, r0)
            X.1aU r2 = r2.A01(r4)
            r1 = 3
            X.OuU r0 = new X.OuU
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.1aU r1 = X.1aU.A01(r0, r3, r2)
            X.4fh r0 = X.C318146oT.A01
            X.1aU r0 = r1.A0P(r0)
            X.PSa r6 = new X.PSa
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A02(r0, r6)
            return
        L_0x0063:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0 = r8
            r1 = r13
            r2 = r14
            r5 = r15
            r0.Cqi(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67074Mhp.A00(X.MhZ, X.3sy, int):void");
    }

    private final void A01(C67058MhZ mhZ, C254743sy r6, List list, int i) {
        C254743sy r0;
        C66633Ma2 ma2 = this.A02;
        AnonymousClass4DH r3 = ma2.A1J;
        if (C66732Mbd.A03(r3.requireContext(), ma2.A0p())) {
            OF5 of5 = this.A00;
            if (of5 != null) {
                r0 = of5.A02;
            } else {
                r0 = null;
            }
            if (!r6.equals(r0)) {
                this.A00 = new OF5(mhZ, r6, list, i);
                this.A01 = false;
                if (C66732Mbd.A03(r3.requireContext(), ma2.A0p())) {
                    C66581MXm.A0V(ma2).C6W().Ejj(r6);
                    return;
                }
                return;
            }
        }
        A00(mhZ, r6, i);
    }

    private final void A02(C254743sy r8, C331537Rj r9, boolean z) {
        boolean z2 = r8 instanceof DirectThreadKey;
        C66633Ma2 ma2 = this.A02;
        if (z2) {
            AnonymousClass3U9 A022 = C66647MaG.A02(ma2.A0v(), r8);
            UserSession A0p = ma2.A0p();
            0qQ.A0B(A0p, 1);
            PFH pfh = new PFH(A0p, A022);
            C69966Nv6.A00(ma2.A1J, ma2.A0p(), pfh, r9, !z);
            return;
        }
        1a8 r3 = ma2.A1K;
        MYb A002 = MYc.A00(ma2);
        MsysThreadId A06 = C66647MaG.A06(r8);
        r3.A02(1aU.A01(new OuU((Object) A06, 3), C72120Owf.A01(A002.A09, A06, 52), A002.A01(A06)).A0L(C72092Ow5.A00).A0P(C318146oT.A01), new PSV(0, ma2, r9, z));
    }

    public final void Cqc() {
        OF5 of5 = this.A00;
        if (of5 != null && !this.A01) {
            this.A01 = true;
            A00(of5.A01, of5.A02, of5.A00);
        }
    }

    public final void DRc(C67058MhZ mhZ, C254743sy r3, List list, int i) {
        mhZ.A01 = C66724MbV.A00(Integer.valueOf(this.A02.A0t().A00));
        A01(mhZ, r3, list, i);
    }

    public final void DgJ(RectF rectF, DirectShareTarget directShareTarget, C254743sy r21) {
        String C6C;
        DirectShareTarget directShareTarget2 = directShareTarget;
        C254743sy r11 = r21;
        AnonymousClass7TG.A1N(r11, directShareTarget2);
        C66633Ma2 ma2 = this.A02;
        RectF rectF2 = rectF;
        if (r11 instanceof DirectThreadKey) {
            AnonymousClass3U9 A022 = C66647MaG.A02(ma2.A0v(), r11);
            if (A022 != null && (C6C = A022.C6C()) != null && !C66633Ma2.A0d(rectF2, ma2, A022)) {
                C66633Ma2.A0C(rectF2, ma2, (AnonymousClass7SD) null, A022, directShareTarget2, r11);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(ma2.A0p()), "ig_inbox_reels_play_pile_tap");
                if (A0e.isSampled()) {
                    C66580MXl.A1J(A0e, C6C);
                    A0e.Cgf();
                }
            }
        } else if (r11 instanceof MsysThreadId) {
            1a8 r4 = ma2.A1K;
            MYb A002 = MYc.A00(ma2);
            MsysThreadId A06 = C66647MaG.A06(r11);
            r4.A02(1aU.A01(new OuU((Object) A06, 3), C72120Owf.A01(A002.A09, A06, 52), A002.A01(A06)).A0P(C318146oT.A01), new PSW(2, directShareTarget2, rectF2, ma2, r11));
        }
    }

    public final void Eyb(AnonymousClass9IV r2, String str) {
        this.A02.A1U.put(str, r2);
    }

    public final void Eyc(C241473Pi r2, String str) {
        this.A02.A1W.put(str, r2);
    }

    public final boolean Dg6(RectF rectF, DirectShareTarget directShareTarget, C254743sy r6) {
        boolean A1Z = AnonymousClass7TG.A1Z(r6, directShareTarget);
        C66633Ma2.A09(rectF, 28D.A2K, this.A02, directShareTarget, r6);
        return A1Z;
    }
}

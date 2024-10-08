package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

public final class P3T implements C74512Pw7 {
    public final /* synthetic */ C71153OeR A00;

    public final 2cs ByR(DirectThreadKey directThreadKey, boolean z) {
        return null;
    }

    public final void Cqc() {
    }

    public final void DKN(DirectThreadKey directThreadKey, String str) {
    }

    public final void DKO(View view, C67058MhZ mhZ, C254743sy r3, List list) {
    }

    public final void Dc8(DirectThreadKey directThreadKey, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void Dg2(C254743sy r1) {
    }

    public final void Dg5(C254743sy r1, boolean z) {
    }

    public final boolean Dg6(RectF rectF, DirectShareTarget directShareTarget, C254743sy r4) {
        return false;
    }

    public final void DgJ(RectF rectF, DirectShareTarget directShareTarget, C254743sy r3) {
    }

    public final void DgL(C254743sy r1) {
    }

    public final void Dzf(RectF rectF, C74455PvA pvA, DirectThreadKey directThreadKey) {
    }

    public final void Eyb(AnonymousClass9IV r1, String str) {
    }

    public final void Eyc(C241473Pi r1, String str) {
    }

    public final void DRc(C67058MhZ mhZ, C254743sy r3, List list, int i) {
        C71153OeR.A0B(mhZ, this.A00, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        if (X.182.A06(X.DbS.A0J(r4, 0), r4, 36313166804354869L) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DRf(android.graphics.RectF r17, android.view.View r18, X.C67058MhZ r19, com.instagram.model.direct.DirectShareTarget r20, X.C254743sy r21, java.lang.String r22, java.util.List r23, boolean r24, boolean r25) {
        /*
            r16 = this;
            r0 = r16
            X.OeR r9 = r0.A00
            boolean r0 = r9.A0H
            r2 = 0
            if (r0 != 0) goto L_0x0080
            r3 = r21
            X.PwB r0 = X.C71153OeR.A01(r9, r3)
            if (r0 == 0) goto L_0x0080
            boolean r0 = X.C66640Ma9.A02(r0)
            r5 = r19
            if (r0 == 0) goto L_0x0083
            int r14 = r5.A00
            X.PwB r1 = X.C71153OeR.A01(r9, r3)
            if (r1 == 0) goto L_0x0073
            X.4DH r6 = r9.A0b
            X.PFk r5 = new X.PFk
            r5.<init>(r1, r9, r3, r14)
            X.0qQ.A0B(r6, r2)
            r7 = 1
            boolean r0 = r1.CUG()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0125
            android.content.Context r8 = r6.requireContext()
            r0 = 2131975973(0x7f135f25, float:1.9589053E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131959994(0x7f1320ba, float:1.9556644E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            X.170 r0 = X.C71097OcX.A00(r1)
            if (r0 == 0) goto L_0x0081
            boolean r1 = r0.CXO()
            r0 = 2131959993(0x7f1320b9, float:1.9556642E38)
            if (r1 == 0) goto L_0x0058
            r0 = 2131959999(0x7f1320bf, float:1.9556654E38)
        L_0x0058:
            java.lang.String r0 = r8.getString(r0)
        L_0x005c:
            java.lang.String[] r0 = new java.lang.String[]{r4, r2, r0}
            X.8ab r4 = X.DbS.A0Y(r8)
            r4.A0m(r6)
            r1 = 70
            X.OgE r1 = X.C71249OgE.A00(r5, r1)
        L_0x006d:
            r4.A0e(r1, r0)
            X.AnonymousClass7TH.A0a(r4, r7)
        L_0x0073:
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r3)
            r12 = 0
            java.lang.String r10 = "direct_request_thread_swipe_in_list_view"
            java.lang.String r11 = "swipe"
            X.C71153OeR.A0N(r9, r10, r11, r12, r13, r14)
            r2 = 1
        L_0x0080:
            return r2
        L_0x0081:
            r0 = 0
            goto L_0x005c
        L_0x0083:
            boolean r0 = r9.A17
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x009c
            com.instagram.common.session.UserSession r4 = r9.A0h
            X.0Tu r2 = X.DbS.A0J(r4, r2)
            r0 = 36313166804354869(0x8102a2000b0735, double:3.02793113623564E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00c2
        L_0x009c:
            int r14 = r5.A00
            X.PwB r6 = X.C71153OeR.A01(r9, r3)
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r3)
            if (r6 == 0) goto L_0x0073
            boolean r5 = r6.Cdt()
            com.instagram.common.session.UserSession r4 = r9.A0h
            X.4DH r2 = r9.A0b
            r1 = 1
            X.PFD r0 = new X.PFD
            r0.<init>(r13, r9, r5, r14)
            X.C71097OcX.A03(r2, r4, r6, r0, r1)
            r12 = 0
            java.lang.String r10 = "direct_request_allow_folder_dialog_impression"
            java.lang.String r11 = "swipe"
            X.C71153OeR.A0N(r9, r10, r11, r12, r13, r14)
            goto L_0x0073
        L_0x00c2:
            int r14 = r5.A00
            X.PwB r11 = X.C71153OeR.A01(r9, r3)
            if (r11 == 0) goto L_0x0073
            boolean r0 = r3 instanceof com.instagram.model.direct.DirectThreadKey
            X.4DH r6 = r9.A0b
            X.PFl r10 = new X.PFl
            r12 = r9
            r13 = r3
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r7 = 1
            X.0qQ.A0B(r6, r7)
            r5 = 2
            android.content.Context r4 = r6.requireContext()
            boolean r2 = r11.CUK()
            boolean r0 = r11.CUG()
            if (r0 != 0) goto L_0x0121
            X.170 r0 = X.C71097OcX.A00(r11)
            if (r0 == 0) goto L_0x011f
            boolean r1 = r0.CXO()
            r0 = 2131959993(0x7f1320b9, float:1.9556642E38)
            if (r1 == 0) goto L_0x00fb
            r0 = 2131959999(0x7f1320bf, float:1.9556654E38)
        L_0x00fb:
            java.lang.String r1 = r4.getString(r0)
        L_0x00ff:
            r0 = 2131959994(0x7f1320ba, float:1.9556644E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            if (r2 == 0) goto L_0x011a
            java.lang.String[] r0 = new java.lang.String[]{r0}
        L_0x010c:
            X.8ab r4 = X.DbS.A0Y(r4)
            r4.A0m(r6)
            X.FJc r1 = new X.FJc
            r1.<init>((int) r5, (java.lang.Object) r10, (java.lang.Object) r11, (boolean) r2)
            goto L_0x006d
        L_0x011a:
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            goto L_0x010c
        L_0x011f:
            r1 = 0
            goto L_0x00ff
        L_0x0121:
            r0 = 2131959998(0x7f1320be, float:1.9556652E38)
            goto L_0x00fb
        L_0x0125:
            java.lang.String r0 = "unrestrict dialog cannot be shown for a group thread"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P3T.DRf(android.graphics.RectF, android.view.View, X.MhZ, com.instagram.model.direct.DirectShareTarget, X.3sy, java.lang.String, java.util.List, boolean, boolean):boolean");
    }

    public final void Dg3(C67058MhZ mhZ, C254743sy r3, List list, int i) {
        C71153OeR.A0B(mhZ, this.A00, r3);
    }

    public P3T() {
    }

    public P3T(C71153OeR oeR) {
        this.A00 = oeR;
    }
}

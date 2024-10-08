package X;

import android.view.View;

public final class FPA implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public FPA(C46848DmQ dmQ, Object obj, int i, int i2) {
        this.A00 = i2;
        this.A03 = dmQ;
        if (19 - i2 != 0) {
            this.A01 = i;
            this.A02 = obj;
        } else {
            this.A02 = obj;
            this.A01 = i;
        }
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        AnonymousClass0fU.A00(new FPA(i, i2, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46, types: [X.JV7, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x045d, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0460, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r5.Dw6(new X.C47179Dru(r2, r1, r2, r4), r6, r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0436;
                case 1: goto L_0x0418;
                case 2: goto L_0x03ec;
                case 3: goto L_0x03cc;
                case 4: goto L_0x03a6;
                case 5: goto L_0x0380;
                case 6: goto L_0x035f;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0351;
                case 10: goto L_0x033b;
                case 11: goto L_0x0029;
                case 12: goto L_0x0324;
                case 13: goto L_0x030e;
                case 14: goto L_0x02f8;
                case 15: goto L_0x02d7;
                case 16: goto L_0x02c1;
                case 17: goto L_0x02b2;
                case 18: goto L_0x01f5;
                case 19: goto L_0x0247;
                case 20: goto L_0x0163;
                case 21: goto L_0x0117;
                case 22: goto L_0x00f1;
                case 23: goto L_0x00da;
                case 24: goto L_0x00c3;
                case 25: goto L_0x00aa;
                case 26: goto L_0x0091;
                case 27: goto L_0x0078;
                case 28: goto L_0x005f;
                case 29: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r10.A02
            X.5Gi r6 = (X.C283155Gi) r6
            java.lang.Object r5 = r10.A03
            X.G9f r5 = (X.C51959G9f) r5
            int r4 = r10.A01
            X.5Gj r0 = r6.A04
            java.lang.String r0 = r0.A0f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0028
            X.5Gj r0 = r6.A04
            java.lang.String r3 = r0.A0f
            r2 = 0
            X.EVf r1 = X.C48087EVf.CONTAINER
        L_0x0020:
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r4)
            r5.Dw6(r0, r6, r3, r4)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r6 = r10.A02
            X.5Gi r6 = (X.C283155Gi) r6
            java.lang.Object r5 = r10.A03
            X.G9f r5 = (X.C51959G9f) r5
            int r4 = r10.A01
            X.5Gj r0 = r6.A04
            java.lang.String r3 = r0.A0f
            if (r3 != 0) goto L_0x0042
            java.lang.String r1 = "NewsfeedStoryRowBinderDirectShare"
            java.lang.String r0 = "Profile ID should not be null."
            X.0wb.A03(r1, r0)
            java.lang.String r3 = ""
        L_0x0042:
            r2 = 0
            X.EVf r1 = X.C48087EVf.START_AVATAR
            goto L_0x0020
        L_0x0046:
            r0 = -1860526290(0xffffffff911a9f2e, float:-1.2197509E-28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            X.G7T r2 = (X.G7T) r2
            java.lang.Object r1 = r10.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            int r0 = r10.A01
            r2.Dw0(r1, r0)
            r0 = 2143183785(0x7fbe63a9, float:NaN)
            goto L_0x045d
        L_0x005f:
            r0 = -1682209033(0xffffffff9bbb86f7, float:-3.1023774E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            X.G7n r2 = (X.C51919G7n) r2
            java.lang.Object r1 = r10.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            int r0 = r10.A01
            r2.DwV(r1, r0)
            r0 = -627338076(0xffffffffda9b94a4, float:-2.18960267E16)
            goto L_0x045d
        L_0x0078:
            r0 = -2031035338(0xffffffff86f0dc36, float:-9.0601537E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            X.G7n r2 = (X.C51919G7n) r2
            java.lang.Object r1 = r10.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            int r0 = r10.A01
            r2.DwV(r1, r0)
            r0 = 253556351(0xf1cf67f, float:7.738867E-30)
            goto L_0x045d
        L_0x0091:
            r0 = 1015150197(0x3c81f675, float:0.01586459)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            X.G7l r2 = (X.C51917G7l) r2
            java.lang.Object r1 = r10.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            int r0 = r10.A01
            r2.DRY(r1, r0)
            r0 = -2068942474(0xffffffff84ae7176, float:-4.10114E-36)
            goto L_0x045d
        L_0x00aa:
            r0 = -1889042598(0xffffffff8f677f5a, float:-1.1413706E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            X.G7l r2 = (X.C51917G7l) r2
            java.lang.Object r1 = r10.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            int r0 = r10.A01
            r2.DwV(r1, r0)
            r0 = 1170570540(0x45c57d2c, float:6319.6465)
            goto L_0x045d
        L_0x00c3:
            r0 = 234602078(0xdfbbe5e, float:1.5514899E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r10.A02
            X.E5e r1 = (X.C47499E5e) r1
            java.lang.Object r0 = r10.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A00(r0)
            r0 = 940408595(0x380d7f13, float:3.3735367E-5)
            goto L_0x045d
        L_0x00da:
            r0 = -1193025301(0xffffffffb8e3e0eb, float:-1.0866098E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r10.A02
            X.E5e r1 = (X.C47499E5e) r1
            java.lang.Object r0 = r10.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A00(r0)
            r0 = -1355145915(0xffffffffaf3a1d45, float:-1.6927E-10)
            goto L_0x045d
        L_0x00f1:
            r0 = 269258863(0x100c906f, float:2.77214E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            if (r2 == 0) goto L_0x0109
            java.lang.Object r0 = r10.A03
            X.F1B r0 = (X.F1B) r0
            android.app.Dialog r1 = r0.A05
            int r0 = r10.A01
            r2.onClick(r1, r0)
        L_0x0109:
            java.lang.Object r0 = r10.A03
            X.F1B r0 = (X.F1B) r0
            android.app.Dialog r0 = r0.A05
            r0.dismiss()
            r0 = -768882713(0xffffffffd22bc7e7, float:-1.84448303E11)
            goto L_0x045d
        L_0x0117:
            r0 = -1897134210(0xffffffff8eec077e, float:-5.8185706E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r10.A02
            X.E6T r8 = (X.E6T) r8
            java.lang.Object r7 = r10.A03
            X.F2g r7 = (X.F2g) r7
            int r6 = r10.A01
            java.util.List r5 = r7.A05
            int r2 = r5.size()
            int r3 = r7.A00
            int r2 = r2 - r3
            boolean r1 = r7.A03
            r0 = 10
            if (r1 == 0) goto L_0x0139
            r0 = 50
        L_0x0139:
            if (r2 >= r0) goto L_0x014a
            java.lang.String r2 = r7.A02
            if (r2 == 0) goto L_0x014a
            com.instagram.user.model.User r1 = r7.A04
            r0 = 0
            X.E6T.A03(r8, r1, r2, r0)
        L_0x0145:
            r0 = -1944679452(0xffffffff8c168be4, float:-1.1597676E-31)
            goto L_0x045d
        L_0x014a:
            int r3 = r3 + r6
            r7.A00 = r3
            int r1 = r5.size()
            int r0 = r7.A01
            if (r3 != r1) goto L_0x0157
            int r6 = r6 + -1
        L_0x0157:
            int r0 = r0 + r6
            r7.A01 = r0
            X.Djg r1 = r8.A06
            r0 = -348973539(0xffffffffeb33161d, float:-2.1650215E26)
            X.0fE.A00(r1, r0)
            goto L_0x0145
        L_0x0163:
            r0 = -667047126(0xffffffffd83dab2a, float:-8.3417137E14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r10.A03
            X.DmQ r8 = (X.C46848DmQ) r8
            boolean r0 = r8.A05
            int r7 = r10.A01
            java.lang.Object r9 = r10.A02
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.instagram.api.schemas.SuggestedUserItem>"
            X.0qQ.A0C(r9, r0)
            java.util.AbstractList r9 = (java.util.AbstractList) r9
            int r1 = r9.size()
            int r0 = r8.A00
            int r6 = java.lang.Math.min(r1, r0)
            r5 = 0
            r3 = 0
        L_0x0189:
            if (r3 >= r6) goto L_0x01dc
            java.lang.Object r2 = X.DbZ.A0g(r9, r5)
            X.Dt4 r2 = (X.C47217Dt4) r2
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x0189
            java.util.ArrayList r1 = r8.A0B
            int r0 = r7 + r3
            r1.add(r0, r2)
            r9.remove(r5)
            int r3 = r3 + 1
            goto L_0x0189
        L_0x01a2:
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.instagram.api.schemas.NuxMediaResponse>"
            X.0qQ.A0C(r9, r0)
            java.util.AbstractCollection r9 = (java.util.AbstractCollection) r9
            java.util.ArrayList r6 = r8.A0B
            r6.remove(r7)
            r8.notifyItemRemoved(r7)
            java.util.Iterator r5 = X.AnonymousClass7TE.A1G(r9)
            r3 = 0
        L_0x01b6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r5)
            X.4hL r2 = (X.C270814hL) r2
            java.util.List r1 = r2.A01
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x01b6
            if (r1 == 0) goto L_0x01b6
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x01b6
            int r0 = r7 + r3
            r6.add(r0, r2)
            int r3 = r3 + 1
            goto L_0x01b6
        L_0x01d8:
            r8.notifyItemRangeInserted(r7, r3)
            goto L_0x01f0
        L_0x01dc:
            int r0 = r7 + 1
            r8.notifyItemRangeInserted(r0, r3)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01f0
            java.util.ArrayList r0 = r8.A0B
            int r7 = r7 + r3
            r0.remove(r7)
            r8.notifyItemRemoved(r7)
        L_0x01f0:
            r0 = -2088907867(0xffffffff837dcba5, float:-7.458379E-37)
            goto L_0x045d
        L_0x01f5:
            r0 = 1484445974(0x587ad916, float:1.10324114E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A03
            X.DmQ r0 = (X.C46848DmQ) r0
            X.E23 r2 = r0.A0A
            java.lang.Object r1 = r10.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r10.A01
            X.1Xj r0 = X.DbZ.A0T(r1, r0)
            java.lang.String r3 = r0.getId()
            if (r3 == 0) goto L_0x023c
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r0 = r2.A09
            X.6Yo r2 = X.DbX.A0N(r1, r0)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r1 = new X.F3W
            r1.<init>()
            r1.A0B = r3
            java.lang.String r0 = "ip_discover_accounts"
            r1.A0E = r0
            r0 = 1
            r1.A0O = r0
            X.32F r0 = r1.A01()
            r2.A0D(r0)
            r2.A04()
            r0 = -878612533(0xffffffffcba16fcb, float:-2.115983E7)
            goto L_0x045d
        L_0x023c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 530776228(0x1fa300a4, float:6.9034245E-20)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0247:
            r0 = -1895423876(0xffffffff8f06207c, float:-6.612966E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A03
            X.DmQ r2 = (X.C46848DmQ) r2
            java.lang.Object r9 = r10.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.api.schemas.SuggestedUserItem"
            X.0qQ.A0C(r9, r0)
            X.Dt4 r9 = (X.C47217Dt4) r9
            int r1 = r10.A01
            java.util.ArrayList r0 = r2.A0B
            r0.remove(r1)
            r2.notifyItemRemoved(r1)
            int r0 = r0.size()
            r2.notifyItemRangeChanged(r1, r0)
            X.E23 r8 = r2.A0A
            int r7 = X.C46848DmQ.A00(r2, r1)
            com.instagram.user.model.User r6 = r9.A00
            java.lang.String r0 = X.DbX.A0r(r6)
            java.lang.String r5 = X.C46848DmQ.A01(r2, r0)
            java.lang.String r3 = r9.A05
            if (r6 == 0) goto L_0x02ad
            X.0eM r0 = r8.A09
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = r9.A02
            X.1OC r0 = X.F88.A01(r2, r1, r3, r0)
            X.1ES.A03(r0)
            X.2om r2 = r8.A02
            if (r2 != 0) goto L_0x02a1
            java.lang.String r0 = "recommendedUserLogger"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x02a1:
            X.6KM r1 = X.E23.A00(r9, r6, r3, r5, r7)
            X.6KN r0 = new X.6KN
            r0.<init>(r1)
            r2.A07(r0)
        L_0x02ad:
            r0 = 454084084(0x1b10c5f4, float:1.1975363E-22)
            goto L_0x045d
        L_0x02b2:
            java.lang.Object r3 = r10.A02
            X.G9f r3 = (X.C51959G9f) r3
            java.lang.Object r2 = r10.A03
            X.5Gi r2 = (X.C283155Gi) r2
            int r1 = r10.A01
            r0 = 0
            r3.DzH(r0, r2, r1)
            return
        L_0x02c1:
            java.lang.Object r5 = r10.A02
            X.G9f r5 = (X.C51959G9f) r5
            java.lang.Object r4 = r10.A03
            X.5Gi r4 = (X.C283155Gi) r4
            int r3 = r10.A01
            r2 = 0
            X.EVf r1 = X.C48087EVf.REPLY_BUTTON
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r3)
            r5.Ddw(r0, r4, r3)
            return
        L_0x02d7:
            java.lang.Object r6 = r10.A02
            X.G9f r6 = (X.C51959G9f) r6
            java.lang.Object r5 = r10.A03
            X.5Gi r5 = (X.C283155Gi) r5
            int r4 = r10.A01
            X.5Gj r0 = r5.A04
            java.lang.String r3 = r0.A0f
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r3 != 0) goto L_0x02ec
            r3 = r1
        L_0x02ec:
            r2 = 0
            X.EVf r1 = X.C48087EVf.START_AVATAR
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r4)
            r6.Dw6(r0, r5, r3, r4)
            return
        L_0x02f8:
            java.lang.Object r5 = r10.A02
            X.G9f r5 = (X.C51959G9f) r5
            java.lang.Object r4 = r10.A03
            X.5Gi r4 = (X.C283155Gi) r4
            int r3 = r10.A01
            r2 = 0
            X.EVf r1 = X.C48087EVf.CONTAINER
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r3)
            r5.DIQ(r0, r4, r3)
            return
        L_0x030e:
            java.lang.Object r5 = r10.A02
            X.G9f r5 = (X.C51959G9f) r5
            java.lang.Object r4 = r10.A03
            X.5Gi r4 = (X.C283155Gi) r4
            int r3 = r10.A01
            r2 = 0
            X.EVf r1 = X.C48087EVf.CONTAINER
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r3)
            r5.DgD(r0, r4, r3)
            return
        L_0x0324:
            java.lang.Object r5 = r10.A02
            X.G9f r5 = (X.C51959G9f) r5
            java.lang.Object r4 = r10.A03
            X.5Gi r4 = (X.C283155Gi) r4
            int r3 = r10.A01
            r2 = 0
            X.EVf r0 = X.C48087EVf.END_IMAGE
            X.Dru r1 = new X.Dru
            r1.<init>(r2, r0, r2, r3)
            r0 = 0
            r5.D8v(r1, r4, r3, r0)
            return
        L_0x033b:
            java.lang.Object r5 = r10.A02
            X.G9f r5 = (X.C51959G9f) r5
            java.lang.Object r4 = r10.A03
            X.5Gi r4 = (X.C283155Gi) r4
            int r3 = r10.A01
            r2 = 0
            X.EVf r1 = X.C48087EVf.CONTAINER
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r3)
            r5.D6M(r0, r4, r3)
            return
        L_0x0351:
            java.lang.Object r2 = r10.A02
            X.G9f r2 = (X.C51959G9f) r2
            java.lang.Object r1 = r10.A03
            X.5Gi r1 = (X.C283155Gi) r1
            int r0 = r10.A01
            r2.D0k(r1, r0)
            return
        L_0x035f:
            r0 = -1266446596(0xffffffffb4838efc, float:-2.4504686E-7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r10.A02
            X.G9f r6 = (X.C51959G9f) r6
            java.lang.Object r5 = r10.A03
            X.5Gi r5 = (X.C283155Gi) r5
            int r3 = r10.A01
            r2 = 0
            X.EVf r1 = X.C48087EVf.PRIMARY_BUTTON
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r3)
            r6.DKj(r0, r5, r3)
            r0 = -1361917284(0xffffffffaed2ca9c, float:-9.585685E-11)
            goto L_0x045d
        L_0x0380:
            r0 = -525365530(0xffffffffe0af8ee6, float:-1.0120241E20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            if (r2 == 0) goto L_0x0398
            java.lang.Object r0 = r10.A03
            com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog r0 = (com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog) r0
            android.app.Dialog r1 = r0.A00
            int r0 = r10.A01
            r2.onClick(r1, r0)
        L_0x0398:
            java.lang.Object r0 = r10.A03
            com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog r0 = (com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog) r0
            android.app.Dialog r0 = r0.A00
            r0.dismiss()
            r0 = -1264391016(0xffffffffb4a2ec98, float:-3.0346996E-7)
            goto L_0x045d
        L_0x03a6:
            r0 = 1231576783(0x49685ecf, float:951788.94)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            if (r2 == 0) goto L_0x03be
            java.lang.Object r0 = r10.A03
            X.Dfy r0 = (X.C46495Dfy) r0
            android.app.Dialog r1 = r0.A00
            int r0 = r10.A01
            r2.onClick(r1, r0)
        L_0x03be:
            java.lang.Object r0 = r10.A03
            X.Dfy r0 = (X.C46495Dfy) r0
            android.app.Dialog r0 = r0.A00
            r0.dismiss()
            r0 = -271638294(0xffffffffefcf20ea, float:-1.2820638E29)
            goto L_0x045d
        L_0x03cc:
            r0 = 935282602(0x37bf47aa, float:2.2802345E-5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A02
            X.EIn r3 = (X.C47816EIn) r3
            java.lang.Object r0 = r10.A03
            X.DpZ r0 = (X.C47039DpZ) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A04
            android.graphics.RectF r2 = X.0nA.A0F(r0)
            int r1 = r10.A01
            X.G9Z r0 = r3.A0B
            r0.Df4(r2, r1)
            r0 = -1989016112(0xffffffff897205d0, float:-2.9132423E-33)
            goto L_0x045d
        L_0x03ec:
            r0 = 137860705(0x8379661, float:5.524633E-34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A02
            X.EIn r3 = (X.C47816EIn) r3
            java.lang.Object r0 = r10.A03
            X.Dpb r0 = (X.C47041Dpb) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r0.A0E
            if (r1 != 0) goto L_0x0403
            r0 = -554524180(0xffffffffdef2a1ec, float:-8.7417574E18)
            goto L_0x045d
        L_0x0403:
            android.graphics.RectF r0 = X.0nA.A01
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            X.0nA.A0L(r2, r1)
            int r1 = r10.A01
            X.G9Z r0 = r3.A0B
            r0.Df4(r2, r1)
            r0 = 1191514865(0x470512f1, float:34066.94)
            goto L_0x045d
        L_0x0418:
            r0 = -788176539(0xffffffffd1056165, float:-3.5804041E10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r10.A02
            X.G9Z r2 = (X.G9Z) r2
            java.lang.Object r0 = r10.A03
            X.Dpa r0 = (X.C47040Dpa) r0
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r0.A06
            android.graphics.RectF r1 = X.0nA.A0F(r0)
            int r0 = r10.A01
            r2.Df4(r1, r0)
            r0 = 254271978(0xf27e1ea, float:8.277245E-30)
            goto L_0x045d
        L_0x0436:
            r0 = 723173116(0x2b1abefc, float:5.4976835E-13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A03
            X.Dm8 r3 = (X.C46832Dm8) r3
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0461
            java.util.Set r1 = r3.A04
            int r0 = r10.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0461
            r0 = -284334569(0xffffffffef0d6617, float:-4.3760805E28)
        L_0x045d:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0461:
            java.lang.Object r0 = r10.A02
            X.Dnn r0 = (X.C46933Dnn) r0
            android.widget.CompoundButton r2 = r0.A00
            java.util.Set r1 = r3.A04
            int r0 = r10.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            r2.setChecked(r0)
            r0 = 1639711822(0x61bc044e, float:4.3353726E20)
            goto L_0x045d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPA.onClick(android.view.View):void");
    }

    public FPA(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public FPA(C51959G9f g9f, C283155Gi r2, int i, int i2) {
        this.A00 = i2;
        switch (i2) {
            case 6:
                this.A02 = g9f;
                this.A03 = r2;
                this.A01 = i;
                return;
            case 7:
            case 8:
            case 11:
                this.A02 = r2;
                this.A03 = g9f;
                break;
            default:
                this.A02 = g9f;
                this.A03 = r2;
                break;
        }
        this.A01 = i;
    }
}

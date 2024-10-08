package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.EAb  reason: case insensitive filesystem */
public final class C47615EAb extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final DirectPrivateStoryRecipientController A02;
    public final MVT A03;
    public final MTF A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        if (r0 != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d5, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36318234865309714L) == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ed, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36318234865244177L) == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f0, code lost:
        if (r17 != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f2, code lost:
        r2 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f9, code lost:
        if (r14 != false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fb, code lost:
        if (r17 == false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fd, code lost:
        r0 = 2131960123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0200, code lost:
        if (r14 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0202, code lost:
        if (r17 == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0204, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0205, code lost:
        r12.setPresenceBadgeDrawable(X.DbZ.A0X(r9, r4, r0));
        r12.setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0211, code lost:
        r0 = 2131960124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r26, android.view.View r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            r25 = this;
            r11 = r28
            r0 = -173373241(0xfffffffff5aa88c7, float:-4.323558E32)
            int r18 = X.AnonymousClass0fD.A03(r0)
            X.FV6 r11 = (X.FV6) r11
            r1 = r25
            X.MVT r0 = r1.A03
            r21 = r0
            com.instagram.common.session.UserSession r10 = r1.A01
            X.MTF r0 = r1.A04
            r19 = r0
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r0 = r1.A02
            r20 = r27
            android.content.Context r9 = r20.getContext()
            X.0iw r3 = r1.A00
            X.Lqu r13 = new X.Lqu
            r4 = r10
            r5 = r0
            r6 = r21
            r7 = r11
            r8 = r19
            r1 = r13
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r8 = X.DbT.A0o(r20)
            X.F11 r8 = (X.F11) r8
            com.instagram.model.direct.DirectShareTarget r7 = r11.A09
            r7.getClass()
            android.widget.TextView r4 = r8.A06
            java.lang.String r6 = r11.A0C
            r4.setText(r6)
            java.util.List r5 = r11.A0D
            int r1 = r5.size()
            r2 = 0
            r0 = 1
            if (r1 != r0) goto L_0x0056
            java.lang.Object r0 = r5.get(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0056
            r2 = 1
        L_0x0056:
            boolean r0 = X.C66651MaK.A00(r10, r7)
            r5 = 0
            if (r0 == 0) goto L_0x025b
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Integer) r1)
        L_0x0064:
            X.C46334Dcc.A00(r4, r0, r6, r2)
            boolean r0 = r11.A02()
            r4 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0254
            boolean r0 = r11.A03()
            if (r0 == 0) goto L_0x0248
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r7.A04
            if (r0 != 0) goto L_0x0248
            android.widget.TextView r1 = r8.A05
            X.FvE r0 = new X.FvE
            r0.<init>(r9, r10, r8, r11)
            r1.post(r0)
        L_0x0084:
            android.text.SpannableStringBuilder r14 = r11.A05
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0241
            android.widget.TextView r4 = r8.A04
            r4.setText(r14)
            r4.setVisibility(r2)
            boolean r0 = r11.A02()
            if (r0 == 0) goto L_0x022f
            X.0Tu r12 = X.0Tu.A05
            r0 = 36314811777092405(0x810421000f0b35, double:3.028971423618631E-306)
            boolean r0 = X.182.A06(r12, r10, r0)
            if (r0 == 0) goto L_0x021d
            if (r14 == 0) goto L_0x021d
            java.lang.String r1 = r14.toString()
            java.lang.String r0 = "You both"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x021d
            r0 = 2
            r4.setMaxLines(r0)
            android.view.ViewGroup r0 = r8.A03
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            X.DbT.A1B(r1, r4, r0)
        L_0x00c9:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r8.A0A
            X.C49758F5j.A00(r3, r10, r11, r12)
            r12.setGradientSpinnerVisible(r2)
            boolean r0 = r11.A03()
            if (r0 != 0) goto L_0x01a9
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x01a9
            r0 = 2130970900(0x7f040914, float:1.7550523E38)
            X.DbY.A0x(r9, r12, r0)
        L_0x00e1:
            X.LRm r3 = r19.AXA()
            r3.getClass()
            X.Juy r0 = X.C61002Juy.A04
            X.Juy r0 = X.C64010LIx.A00(r7)
            X.LMN r2 = r3.A01(r0)
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x00fc
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x011a
        L_0x00fc:
            X.Juy r0 = X.C61002Juy.A04
            X.MXS r1 = r3.A02(r0)
            X.Juy r0 = X.C61002Juy.A06
            X.MXS r0 = r3.A02(r0)
            if (r1 == 0) goto L_0x0191
            if (r0 == 0) goto L_0x0112
            boolean r0 = r0.CKn(r7)
            if (r0 != 0) goto L_0x0118
        L_0x0112:
            boolean r0 = r1.CKn(r7)
        L_0x0116:
            if (r0 == 0) goto L_0x0199
        L_0x0118:
            X.LMN r2 = X.LMN.A04
        L_0x011a:
            X.LRd r3 = r8.A08
            r3.A03(r2, r13)
            java.lang.Integer r4 = r2.A01
            r3.A05(r6, r4)
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x0145
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.182.A05(r0, r10)
            if (r4 != r12) goto L_0x0188
            r0 = 2131952457(0x7f130349, float:1.9541357E38)
            if (r1 == 0) goto L_0x013c
            r0 = 2131952458(0x7f13034a, float:1.954136E38)
        L_0x013c:
            android.view.ViewGroup r1 = r8.A03
            java.lang.String r0 = X.DbW.A0h(r9, r6, r0)
            r1.setContentDescription(r0)
        L_0x0145:
            X.LMN r0 = r8.A00
            if (r0 == 0) goto L_0x0150
            java.lang.Integer r0 = r0.A01
            if (r0 == r4) goto L_0x0150
            r3.A02()
        L_0x0150:
            r8.A00 = r2
            android.view.ViewGroup r3 = r8.A03
            X.LMN r1 = X.LMN.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 != r1) goto L_0x015d
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x015d:
            r3.setAlpha(r0)
            X.2eb r2 = r8.A07
            X.Mhs r1 = r8.A09
            X.DcN r0 = r11.A08
            X.C46488Dfr.A00(r2, r1, r0)
            int r2 = r11.A01
            int r1 = r11.A03
            int r0 = r11.A04
            r19 = r21
            r21 = r7
            r22 = r2
            r23 = r1
            r24 = r0
            r19.DpA(r20, r21, r22, r23, r24)
            r3.setBackground(r5)
            r1 = -153957520(0xfffffffff6d2cb70, float:-2.137712E33)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0188:
            r0 = 2131952416(0x7f130320, float:1.9541274E38)
            if (r1 == 0) goto L_0x013c
            r0 = 2131952417(0x7f130321, float:1.9541276E38)
            goto L_0x013c
        L_0x0191:
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.CKn(r7)
            goto L_0x0116
        L_0x0199:
            r0 = r21
            boolean r0 = r0.Cbc(r7)
            if (r0 == 0) goto L_0x01a5
            X.LMN r2 = X.LMN.A02
            goto L_0x011a
        L_0x01a5:
            X.LMN r2 = X.LMN.A05
            goto L_0x011a
        L_0x01a9:
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x01b5
            r0 = 2130970844(0x7f0408dc, float:1.755041E38)
            X.DbY.A0x(r9, r12, r0)
            goto L_0x00e1
        L_0x01b5:
            boolean r0 = X.C49758F5j.A01(r10, r11)
            if (r0 == 0) goto L_0x0215
            int r4 = r11.A02
            long r2 = (long) r4
            r15 = 1440(0x5a0, double:7.115E-321)
            r14 = 60
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x01d7
            if (r4 <= r14) goto L_0x01d7
            X.0Tu r15 = X.0Tu.A05
            r0 = 36318234865309714(0x81073e00041812, double:3.031136198390927E-306)
            boolean r0 = X.182.A06(r15, r10, r0)
            r17 = 1
            if (r0 != 0) goto L_0x01d9
        L_0x01d7:
            r17 = 0
        L_0x01d9:
            r15 = 480(0x1e0, double:2.37E-321)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x01ef
            if (r4 <= r14) goto L_0x01ef
            X.0Tu r14 = X.0Tu.A05
            r0 = 36318234865244177(0x81073e00031811, double:3.0311361983494813E-306)
            boolean r0 = X.182.A06(r14, r10, r0)
            r14 = 1
            if (r0 != 0) goto L_0x01f2
        L_0x01ef:
            r14 = 0
            if (r17 == 0) goto L_0x0211
        L_0x01f2:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = r0.toHours(r2)
            int r2 = (int) r0
            if (r14 != 0) goto L_0x01fd
            if (r17 == 0) goto L_0x0211
        L_0x01fd:
            r0 = 2131960123(0x7f13213b, float:1.9556906E38)
            if (r14 != 0) goto L_0x0204
            if (r17 == 0) goto L_0x0205
        L_0x0204:
            r4 = r2
        L_0x0205:
            X.U0t r0 = X.DbZ.A0X(r9, r4, r0)
            r12.setPresenceBadgeDrawable(r0)
            r12.setBottomBadgeDrawable(r5)
            goto L_0x00e1
        L_0x0211:
            r0 = 2131960124(0x7f13213c, float:1.9556908E38)
            goto L_0x0205
        L_0x0215:
            r12.setBottomBadgeDrawable(r5)
            r12.setPresenceBadgeDrawable(r5)
            goto L_0x00e1
        L_0x021d:
            android.view.ViewGroup r0 = r8.A03
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165229(0x7f07002d, float:1.794467E38)
            X.DbT.A1B(r1, r4, r0)
            goto L_0x00c9
        L_0x022f:
            android.view.ViewGroup r0 = r8.A03
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            X.DbT.A1B(r1, r4, r0)
            goto L_0x00c9
        L_0x0241:
            android.widget.TextView r0 = r8.A04
            r0.setVisibility(r4)
            goto L_0x00c9
        L_0x0248:
            android.widget.TextView r1 = r8.A05
            android.text.SpannableStringBuilder r0 = r11.A06
            r1.setText(r0)
            r1.setVisibility(r2)
            goto L_0x0084
        L_0x0254:
            android.widget.TextView r0 = r8.A05
            r0.setVisibility(r4)
            goto L_0x0084
        L_0x025b:
            r0 = r5
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47615EAb.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C47615EAb(AnonymousClass0iw r1, UserSession userSession, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, MVT mvt, MTF mtf) {
        this.A03 = mvt;
        this.A04 = mtf;
        this.A02 = directPrivateStoryRecipientController;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(729414285);
        UserSession userSession = this.A01;
        Integer num = AnonymousClass05K.A00;
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.selectable_user_row);
        A0C.setTag(new F11(A0C, userSession, num));
        AnonymousClass0fD.A0A(-1699291883, A032);
        return A0C;
    }
}

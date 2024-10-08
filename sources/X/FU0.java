package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class FU0 implements C231642s0 {
    public final Context A00;
    public final UserSession A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final C50674FgZ A04;
    public final boolean A05;

    public final String getBinderGroupName() {
        return "CreatorLegacyProfileHeader";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return 0;
    }

    public final String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        if (r11 != false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r0 == 4) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r36, android.view.View r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            r35 = this;
            r12 = r39
            r2 = r38
            r0 = -1346038904(0xffffffffafc51388, float:-3.584797E-10)
            int r19 = X.AnonymousClass0fD.A03(r0)
            X.6vx r2 = (X.C322516vx) r2
            X.6vy r12 = (X.C322526vy) r12
            r10 = 1
            r1 = r35
            r3 = r36
            if (r36 == 0) goto L_0x036d
            if (r3 == r10) goto L_0x016c
            r0 = 2
            if (r3 != r0) goto L_0x04be
            java.lang.Object r14 = X.DbT.A0o(r37)
            X.EzE r14 = (X.C49595EzE) r14
            com.instagram.user.model.User r13 = r2.A0E
            android.content.Context r0 = r1.A00
            r23 = r0
            com.instagram.common.session.UserSession r12 = r1.A01
            X.FgZ r0 = r1.A04
            r25 = r0
            boolean r11 = r1.A05
            r9 = 0
            X.0qQ.A0B(r14, r9)
            r2 = 3
            r1 = 4
            X.0qQ.A0B(r0, r1)
            r0 = r23
            int r8 = X.AnonymousClass703.A00(r0, r12, r13, r11, r9)
            android.content.res.Resources r0 = r23.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            if (r0 == r2) goto L_0x004f
            r7 = 3
            if (r0 != r1) goto L_0x0050
        L_0x004f:
            r7 = 4
        L_0x0050:
            if (r13 == 0) goto L_0x014f
            boolean r0 = r13.A1g()
            if (r0 == 0) goto L_0x014f
            if (r8 <= r7) goto L_0x014f
            r18 = 1
            int r8 = r7 + -1
        L_0x005e:
            r6 = 0
            r5 = 0
            r17 = 0
        L_0x0062:
            if (r5 >= r8) goto L_0x0153
            r13.getClass()
            r0 = r23
            X.6pK r4 = X.AnonymousClass703.A01(r0, r12, r13, r6, r9)
            android.view.View[] r0 = r14.A01
            r16 = r0
            r3 = r0[r5]
            if (r4 == 0) goto L_0x0128
            int r1 = r4.A00
            r0 = 2131429241(0x7f0b0779, float:1.848015E38)
            if (r1 != r0) goto L_0x007f
            int r5 = r5 + 1
            goto L_0x0062
        L_0x007f:
            r3.setVisibility(r9)
            boolean r0 = r3 instanceof android.widget.TextView
            r2 = r3
            if (r0 != 0) goto L_0x008d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = r2.getChildAt(r9)
        L_0x008d:
            com.instagram.common.ui.text.TitleTextView r2 = (com.instagram.common.ui.text.TitleTextView) r2
            int r1 = r4.A00
            r0 = 2131429233(0x7f0b0771, float:1.8480133E38)
            if (r1 != r0) goto L_0x0135
            X.4Cl r0 = r13.A03
            X.4bj r0 = r0.B4O()
            if (r0 == 0) goto L_0x0135
            X.4Cl r0 = r13.A03
            X.4bj r0 = r0.B4O()
            java.lang.String r0 = r0.AqF()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0135
            X.4Cl r0 = r13.A03
            X.4bj r0 = r0.B4O()
            java.lang.String r0 = r0.AqF()
            r2.setText(r0)
        L_0x00bb:
            r2.setIsBold(r10)
            boolean r0 = X.2R8.A04(r12, r13)
            if (r0 == 0) goto L_0x00f7
            X.6pK r0 = X.C318666pK.CALL_TO_ACTION
            if (r4 != r0) goto L_0x00f7
            X.1Av r1 = X.1Au.A00(r12)
            X.0s0 r0 = r1.A7v
            X.0YZ[] r15 = X.1Av.A8a
            r2 = 148(0x94, float:2.07E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r15, r2)
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r3 instanceof android.widget.ViewSwitcher
            if (r0 == 0) goto L_0x00f7
            X.1Av r1 = X.1Au.A00(r12)
            X.0s0 r0 = r1.A7v
            X.AnonymousClass7TF.A1J(r1, r0, r15, r2, r9)
            r15 = r3
            android.widget.ViewSwitcher r15 = (android.widget.ViewSwitcher) r15
            r15.setDisplayedChild(r10)
            X.Fum r2 = new X.Fum
            r0 = r16
            r2.<init>(r15, r0, r8)
            r0 = 2000(0x7d0, double:9.88E-321)
            r15.postDelayed(r2, r0)
        L_0x00f7:
            boolean r0 = r3 instanceof android.widget.ViewSwitcher
            if (r0 == 0) goto L_0x0106
            r0 = r3
            android.widget.ViewAnimator r0 = (android.widget.ViewAnimator) r0
            int r0 = r0.getDisplayedChild()
            if (r0 != r10) goto L_0x0106
            r17 = 1
        L_0x0106:
            int r0 = r4.A00
            r3.setId(r0)
            r21 = 12
            X.FO6 r0 = new X.FO6
            r20 = r0
            r22 = r4
            r24 = r13
            r20.<init>(r21, r22, r23, r24, r25)
            X.AnonymousClass0fU.A00(r0, r3)
            int r0 = r8 + -1
            if (r5 == r0) goto L_0x0126
            android.view.View[] r0 = r14.A02
            r0 = r0[r5]
            r0.setVisibility(r9)
        L_0x0126:
            int r5 = r5 + 1
        L_0x0128:
            int r6 = r6 + 1
            if (r17 != 0) goto L_0x012f
            r0 = 1
            if (r11 == 0) goto L_0x0130
        L_0x012f:
            r0 = 0
        L_0x0130:
            r3.setClickable(r0)
            goto L_0x0062
        L_0x0135:
            int r1 = r4.A00
            r0 = 2131429242(0x7f0b077a, float:1.8480151E38)
            if (r1 != r0) goto L_0x014c
            java.lang.Integer r1 = X.C324476zN.A0A(r12, r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x014c
            r0 = 2131952349(0x7f1302dd, float:1.9541138E38)
        L_0x0147:
            r2.setText(r0)
            goto L_0x00bb
        L_0x014c:
            int r0 = r4.A01
            goto L_0x0147
        L_0x014f:
            r18 = 0
            goto L_0x005e
        L_0x0153:
            r2 = 8
            if (r5 >= r7) goto L_0x04a7
            android.view.View[] r0 = r14.A01
            r0 = r0[r5]
            r0.setVisibility(r2)
            if (r5 <= 0) goto L_0x0169
            android.view.View[] r1 = r14.A02
            int r0 = r5 + -1
            r0 = r1[r0]
            r0.setVisibility(r2)
        L_0x0169:
            int r5 = r5 + 1
            goto L_0x0153
        L_0x016c:
            java.lang.Object r11 = X.DbT.A0o(r37)
            X.F0z r11 = (X.C49667F0z) r11
            android.content.Context r9 = r1.A00
            com.instagram.common.session.UserSession r0 = r1.A01
            r34 = r0
            X.0iw r8 = r1.A03
            com.instagram.user.model.User r7 = r2.A0E
            r6 = 0
            boolean r2 = r2.A0K
            X.6vw r0 = r12.A03
            r18 = r0
            boolean r0 = r12.A06
            r17 = r0
            boolean r13 = r1.A05
            int r0 = r12.A00
            boolean r33 = X.AnonymousClass7TF.A1R(r0)
            r5 = 0
            r4 = 8
            if (r7 == 0) goto L_0x0314
            android.content.res.Resources r3 = r9.getResources()
            java.lang.String r0 = r7.getFullName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 == 0) goto L_0x02f2
            boolean r0 = r7.isVerified()
            if (r0 != 0) goto L_0x02f2
            android.widget.TextView r0 = r11.A03
            r0.setVisibility(r4)
        L_0x01ae:
            X.2eb r0 = r11.A06
            r21 = r8
            r22 = r34
            r23 = r0
            r24 = r6
            r25 = r7
            r26 = r6
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r20 = r9
            X.AnonymousClass70T.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r13 != 0) goto L_0x035d
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            int r14 = r0.widthPixels
            r13 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r3.getDimensionPixelSize(r13)
            int r0 = r0 * 2
            int r14 = r14 - r0
            com.instagram.feed.ui.text.LinkTextView r0 = r11.A09
            r16 = r0
            android.widget.TextView r15 = r11.A02
            android.view.View r1 = r11.A00
            r0 = 2
            r21 = r1
            r22 = r15
            r23 = r34
            r24 = r18
            r25 = r16
            r27 = r7
            r28 = r14
            r29 = r0
            r31 = r17
            r32 = r10
            X.AnonymousClass70T.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.2eb r1 = r11.A07
            r26 = r8
            r27 = r34
            r28 = r1
            r29 = r6
            r30 = r6
            r31 = r7
            r32 = r6
            X.AnonymousClass70T.A03(r26, r27, r28, r29, r30, r31, r32, r33)
            X.2eb r1 = r11.A05
            r21 = r8
            r22 = r34
            r23 = r1
            r24 = r6
            r25 = r7
            r26 = r5
            X.AnonymousClass70X.A00(r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = r7.isRestricted()
            r14 = 0
            if (r1 == 0) goto L_0x022a
            X.1YZ r1 = X.1YZ.A02
            if (r1 == 0) goto L_0x022a
            r14 = 1
        L_0x022a:
            X.2eb r1 = r11.A08
            X.AnonymousClass70T.A02(r9, r1, r6, r7)
            r18 = 1
            if (r14 != 0) goto L_0x030e
            X.4Cl r1 = r7.A03
            java.lang.String r1 = r1.Bgn()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x030e
            r5 = 1
            android.widget.TextView r6 = r11.A04
            X.4Cl r1 = r7.A03
            java.lang.String r17 = r1.Bgn()
            r17.getClass()
            android.text.SpannableStringBuilder r4 = X.DbS.A0C(r17)
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            android.content.res.Resources$Theme r9 = r9.getTheme()
            r1 = 2130971404(0x7f040b0c, float:1.7551545E38)
            r9.resolveAttribute(r1, r14, r10)
            int r10 = r14.data
            X.4Cl r1 = r7.A03
            java.util.List r1 = r1.Bgp()
            if (r1 == 0) goto L_0x02ee
            java.util.List r1 = X.00k.A0a(r1)
        L_0x026c:
            java.util.Iterator r16 = r1.iterator()
        L_0x0270:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0327
            java.lang.Object r15 = r16.next()
            X.3rT r15 = (X.C253823rT) r15
            int r1 = r15.Byb()
            if (r1 < 0) goto L_0x02ab
            int r9 = r15.Byb()
            int r1 = r15.B1Q()
            if (r9 >= r1) goto L_0x02ab
            int r9 = r15.B1Q()
            java.util.regex.Pattern r1 = X.0mp.A01
            int r1 = r17.length()
            if (r9 > r1) goto L_0x02ab
            X.HBI r14 = new X.HBI
            r14.<init>((int) r10, (int) r0, (java.lang.Object) r15, (java.lang.Object) r7)
            int r9 = r15.Byb()
            int r15 = r15.B1Q()
            r1 = 33
            r4.setSpan(r14, r9, r15, r1)
            goto L_0x0270
        L_0x02ab:
            java.lang.String r1 = "social_context_array_out_of_bounds"
            X.0xI r14 = X.0xI.A00(r8, r1)
            X.4Cl r1 = r7.A03
            java.lang.String r9 = r1.Bgn()
            java.lang.String r1 = "social_context_string"
            r14.A0C(r1, r9)
            int r1 = r15.Byb()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "range_start"
            r14.A08(r9, r1)
            int r1 = r15.B1Q()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "range_end"
            r14.A08(r9, r1)
            int r9 = r15.B1Q()
            int r1 = r15.Byb()
            int r9 = r9 - r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r1 = "range_length"
            r14.A08(r9, r1)
            r1 = r34
            X.DbU.A1R(r14, r1)
            goto L_0x0270
        L_0x02ee:
            X.0sn r1 = X.0sn.A00
            goto L_0x026c
        L_0x02f2:
            android.widget.TextView r14 = r11.A03
            java.lang.String r0 = r7.B8Q()
            r14.setText(r0)
            if (r33 != 0) goto L_0x0302
            r0 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A06(r14, r0)
        L_0x0302:
            boolean r0 = r7.isVerified()
            X.C244273av.A0C(r14, r0)
            r14.setVisibility(r5)
            goto L_0x01ae
        L_0x030e:
            android.widget.TextView r0 = r11.A04
            r0.setVisibility(r4)
            goto L_0x032d
        L_0x0314:
            X.2eb r0 = r11.A07
            r0.A03(r4)
            com.instagram.feed.ui.text.LinkTextView r1 = r11.A09
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            if (r2 == 0) goto L_0x0323
            r0 = 2131976230(0x7f136026, float:1.9589575E38)
        L_0x0323:
            r1.setText(r0)
            goto L_0x035d
        L_0x0327:
            X.DbX.A1G(r6, r4)
            r6.setVisibility(r2)
        L_0x032d:
            java.lang.String r0 = r7.A0O()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x036a
            X.4Cl r0 = r7.A03
            java.lang.String r0 = r0.getExternalUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x036a
            if (r5 != 0) goto L_0x036a
            java.lang.String r0 = r7.getFullName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x036a
            boolean r0 = r7.isVerified()
            if (r0 != 0) goto L_0x036a
        L_0x0355:
            android.view.View r1 = r11.A01
            if (r18 == 0) goto L_0x0365
            r0 = 0
        L_0x035a:
            X.0nA.A0X(r1, r0)
        L_0x035d:
            int r0 = r12.A00
            int r0 = r0 + 1
            r12.A00 = r0
            goto L_0x04be
        L_0x0365:
            int r0 = r3.getDimensionPixelSize(r13)
            goto L_0x035a
        L_0x036a:
            r18 = 0
            goto L_0x0355
        L_0x036d:
            java.lang.Object r8 = X.DbT.A0o(r37)
            X.FgD r8 = (X.C50652FgD) r8
            com.instagram.common.session.UserSession r5 = r1.A01
            com.instagram.user.model.User r4 = r2.A0E
            if (r4 == 0) goto L_0x037c
            X.C324376zB.A02(r5, r4)
        L_0x037c:
            X.6vv r6 = r12.A04
            r11 = 0
            androidx.fragment.app.Fragment r7 = r1.A02
            X.0iw r3 = r1.A03
            X.FgZ r13 = r1.A04
            X.6rP r2 = r2.A0C
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r1 = r12.A02
            boolean r0 = r12.A07
            boolean r14 = r12.A0I
            r9 = 0
            X.AnonymousClass7TF.A1D(r8, r9, r6)
            r12 = 8
            X.0qQ.A0B(r13, r12)
            X.70G r6 = r8.A00
            java.lang.String r15 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileAvatarViewBinder.Holder"
            X.0qQ.A0C(r6, r15)
            X.70F r6 = (X.AnonymousClass70F) r6
            r21 = r11
            r22 = r1
            r23 = r3
            r24 = r5
            r25 = r6
            r26 = r13
            r27 = r2
            r28 = r11
            r29 = r11
            r30 = r4
            r31 = r9
            r32 = r0
            r33 = r14
            r20 = r7
            X.AnonymousClass70L.A02(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.F17 r3 = r8.A01
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x04a3
            X.4Cl r0 = r4.A03
            java.lang.Integer r1 = r0.BPt()
            android.widget.TextView r0 = r3.A0A
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r8 = X.C253673rC.A02(r0, r1)
            X.4Cl r0 = r4.A03
            java.lang.Integer r1 = r0.B6v()
            android.widget.TextView r0 = r3.A08
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = X.C253673rC.A02(r0, r1)
            X.4Cl r0 = r4.A03
            java.lang.Integer r1 = r0.B70()
            android.widget.TextView r0 = r3.A09
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = X.C253673rC.A02(r0, r1)
        L_0x03f4:
            android.widget.TextView r0 = r3.A0A
            r0.setText(r8)
            android.widget.TextView r0 = r3.A08
            r0.setText(r2)
            android.widget.TextView r0 = r3.A09
            r0.setText(r1)
            com.instagram.user.follow.FollowButton r2 = r3.A0C
            r2.setVisibility(r12)
            r2.setOnClickListener(r11)
            com.instagram.follow.chaining.FollowChainingButton r8 = r3.A0B
            r8.setVisibility(r12)
            r8.setOnClickListener(r11)
            if (r4 == 0) goto L_0x0447
            r2.A0A = r10
            r2.setVisibility(r9)
            X.4as r0 = X.C267054as.FULL
            r2.setFollowButtonSize(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.width = r9
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r0
            r2.setLayoutParams(r1)
            java.lang.String r25 = "user_profile_header"
            r20 = r11
            r22 = r11
            r23 = r2
            r24 = r4
            r26 = r11
            r27 = r11
            X.C3254572l.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.4at r0 = r2.A0J
            r0.A05(r5, r4)
            r2.setEnabled(r9)
        L_0x0447:
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            r8.setCustomImagePadding(r0)
            android.view.View r5 = r3.A03
            android.content.Context r1 = r5.getContext()
            r0 = 2130971031(0x7f040997, float:1.7550789E38)
            int r4 = X.2Yu.A0H(r1, r0)
            int r3 = X.2Yu.A0H(r1, r0)
            int r2 = X.2Yu.A07(r1)
            int r1 = X.2Yu.A07(r1)
            X.6rv r0 = new X.6rv
            r0.<init>(r4, r3, r2, r1)
            r8.setCustomButtonStyle(r0)
            r8.setVisibility(r9)
            r8.setEnabled(r9)
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131165699(0x7f070203, float:1.7945622E38)
            r1.getValue(r0, r3, r10)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131165701(0x7f070205, float:1.7945627E38)
            r1.getValue(r0, r2, r10)
            android.view.ViewGroup r1 = r6.A0J
            float r0 = r3.getFloat()
            r1.setAlpha(r0)
            float r0 = r2.getFloat()
            r5.setAlpha(r0)
            goto L_0x04be
        L_0x04a3:
            r1 = r8
            r2 = r8
            goto L_0x03f4
        L_0x04a7:
            if (r18 == 0) goto L_0x04cf
            android.view.View[] r1 = r14.A02
            int r0 = r7 + -2
            r0 = r1[r0]
            r0.setVisibility(r9)
            android.view.View r0 = r14.A00
            r0.setVisibility(r9)
            android.view.View r2 = r14.A00
            if (r11 == 0) goto L_0x04c7
            r2.setEnabled(r9)
        L_0x04be:
            r1 = 1963636544(0x750ab740, float:1.758432E32)
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x04c7:
            r1 = 22
            r0 = r25
            X.FPG.A00(r2, r1, r0, r13)
            goto L_0x04be
        L_0x04cf:
            android.view.View r0 = r14.A00
            r0.setVisibility(r2)
            goto L_0x04be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FU0.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        r5.A7U(0);
        r5.A7U(1);
        if (C3254572l.A01(this.A00, this.A01, ((C322516vx) obj).A0E, false)) {
            r5.A7U(2);
        }
    }

    public final String getViewTypeName(int i) {
        return 002.A06(i, "CreatorLegacyProfileHeader", "[", "]");
    }

    public FU0(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, C50674FgZ fgZ, boolean z) {
        this.A02 = fragment;
        this.A00 = fragment.requireContext();
        this.A01 = userSession;
        this.A05 = z;
        this.A04 = fgZ;
        this.A03 = r3;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A032 = AnonymousClass0fD.A03(-227243732);
        if (i == 0) {
            Context context = this.A00;
            UserSession userSession = this.A01;
            view = LayoutInflater.from(context).inflate(R.layout.row_profile_header, (ViewGroup) null, false);
            view.setTag(new C50652FgD(new AnonymousClass70F(DbS.A0E(view, R.id.avatar_container), userSession), new F17(view)));
            i2 = -1230161597;
        } else if (i == 1) {
            view = DbT.A0C(LayoutInflater.from(this.A00), (ViewGroup) null, R.layout.row_profile_header_bio);
            view.setTag(new C49667F0z(view));
            i2 = -675358817;
        } else if (i == 2) {
            Context context2 = this.A00;
            0qQ.A0B(viewGroup, 1);
            view = LayoutInflater.from(context2).inflate(R.layout.row_profile_action_group, viewGroup, false);
            ViewGroup A0I = DbX.A0I(view, R.id.action_group);
            int i3 = context2.getResources().getConfiguration().screenLayout & 15;
            int i4 = 3;
            if (i3 == 3 || i3 == 4) {
                i4 = 4;
            }
            C49595EzE ezE = new C49595EzE(A0I, i4);
            int i5 = 0;
            while (true) {
                View[] viewArr = ezE.A01;
                int length = viewArr.length;
                if (i5 >= length) {
                    break;
                }
                int i6 = R.layout.text_action_item;
                if (i5 == 0) {
                    i6 = R.layout.text_action_item_view_switcher;
                }
                View inflate = LayoutInflater.from(context2).inflate(i6, A0I, false);
                0nA.A0V(inflate, context2.getResources().getDimensionPixelSize(R.dimen.abc_star_medium));
                viewArr[i5] = inflate;
                A0I.addView(viewArr[i5]);
                viewArr[i5].setVisibility(8);
                if (i5 != length - 1) {
                    View[] viewArr2 = ezE.A02;
                    View inflate2 = LayoutInflater.from(context2).inflate(R.layout.vertical_divider, A0I, false);
                    0nA.A0V(inflate2, context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                    viewArr2[i5] = inflate2;
                    A0I.addView(viewArr2[i5]);
                    viewArr2[i5].setVisibility(8);
                }
                i5++;
            }
            View inflate3 = LayoutInflater.from(context2).inflate(R.layout.text_action_more, A0I, false);
            0nA.A0V(inflate3, context2.getResources().getDimensionPixelSize(R.dimen.abc_star_medium));
            ezE.A00 = inflate3;
            A0I.addView(inflate3);
            ezE.A00.setVisibility(8);
            view.setTag(ezE);
            i2 = -791893326;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException();
            AnonymousClass0fD.A0A(1468064184, A032);
            throw illegalStateException;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-356849162);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        AnonymousClass0fD.A0A(-830498597, A032);
        return view;
    }
}

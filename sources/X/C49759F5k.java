package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.F5k  reason: case insensitive filesystem */
public abstract class C49759F5k {
    public static SpannableStringBuilder A00(Context context, SpannableStringBuilder spannableStringBuilder, TextView textView, String str, int i, int i2) {
        if (spannableStringBuilder == null || str == null) {
            return spannableStringBuilder;
        }
        TextPaint paint = textView.getPaint();
        float f = (float) i;
        if (paint.measureText(spannableStringBuilder.toString()) <= f) {
            return spannableStringBuilder;
        }
        int i3 = i2 - 1;
        Resources resources = context.getResources();
        Integer valueOf = Integer.valueOf(i3);
        String quantityString = resources.getQuantityString(R.plurals.thread_title_x_and_n_others, i3, new Object[]{str, valueOf});
        if (paint.measureText(quantityString) <= f) {
            return DbS.A0C(quantityString);
        }
        String A0v = DbV.A0v(context.getResources(), valueOf, R.plurals.thread_title_suffix_n_others, i3);
        return DbS.A0C(C252993q2.A03(paint, A0v, quantityString, i)).append(A0v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a6, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36318234865309714L) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36318234865244177L) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        if (r13 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        r10 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        if (r11 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        if (r13 == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        r1 = 2131960123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d0, code lost:
        if (r11 != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (r13 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        r22 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        r0 = new X.U0t(X.DbW.A0h(r8, java.lang.Integer.valueOf(r22), r1), r8.getColor(X.2Yu.A07(r8)), r8.getColor(com.instagram.android.R.color.green_0), r8.getColor(X.2Yu.A0C(r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0195, code lost:
        if (r37 != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019c, code lost:
        if (r36 == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        if (r12 == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0210, code lost:
        r1 = 2131960124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r23, X.AnonymousClass0iw r24, com.instagram.common.session.UserSession r25, X.G8F r26, X.C47035DpR r27, com.instagram.model.direct.DirectShareTarget r28, int r29, int r30, int r31, int r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            r15 = r26
            r5 = r27
            r4 = r28
            r27 = r29
            r19 = r30
            r20 = r31
            r22 = r32
            if (r39 == 0) goto L_0x02a3
            android.view.ViewGroup r2 = r5.A01
            r1 = 67
            X.FPE r0 = new X.FPE
            r0.<init>((X.G8F) r15, (com.instagram.model.direct.DirectShareTarget) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            android.widget.CheckBox r1 = r5.A02
            X.FOO r0 = new X.FOO
            r21 = 0
            r16 = r5
            r17 = r4
            r18 = r27
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
        L_0x002c:
            X.AnonymousClass0fU.A00(r0, r1)
            X.0eE r0 = X.AnonymousClass0t1.A01
            r7 = r25
            com.instagram.user.model.User r1 = r0.A01(r7)
            java.lang.String r18 = X.AnonymousClass50n.A03(r4, r1)
            com.instagram.user.model.User r2 = r0.A01(r7)
            java.util.List r1 = X.DbT.A14(r4)
            r4.A0S()
            r6 = 0
            X.34S r11 = X.AnonymousClass3UE.A02(r6, r2, r6, r1)
            com.instagram.common.typedurl.ImageUrl r10 = X.OXB.A02(r7, r4)
            com.instagram.common.typedurl.ImageUrl r1 = X.OXB.A01(r7, r4)
            r3 = 8
            r14 = 0
            r2 = 0
            r8 = r23
            r9 = r24
            if (r10 == 0) goto L_0x021e
            X.3oV r0 = r5.A0B
            X.DbZ.A1X(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r5.A0C
            r0.setVisibility(r2)
            r0.A0F(r6, r9, r10)
        L_0x006a:
            r16 = 480(0x1e0, double:2.37E-321)
            r12 = 1440(0x5a0, double:7.115E-321)
            r10 = 60
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r9 = r5.A0C
            if (r33 == 0) goto L_0x0078
            android.graphics.drawable.Drawable r14 = X.DbY.A07(r8)
        L_0x0078:
            r9.setBottomBadgeDrawable(r14)
            X.3oV r0 = r5.A0B
            boolean r1 = r0.CVM()
            if (r1 == 0) goto L_0x008d
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r0 = X.DbS.A0Z(r0)
            if (r33 != 0) goto L_0x0218
            r1 = 0
        L_0x008a:
            r0.setBottomBadgeDrawable(r1)
        L_0x008d:
            if (r34 == 0) goto L_0x0215
            r0 = r22
            long r0 = (long) r0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x00a8
            r11 = r22
            if (r11 <= r10) goto L_0x00a8
            X.0Tu r13 = X.0Tu.A05
            r11 = 36318234865309714(0x81073e00041812, double:3.031136198390927E-306)
            boolean r11 = X.182.A06(r13, r7, r11)
            r13 = 1
            if (r11 != 0) goto L_0x00a9
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 > 0) goto L_0x00bf
            r11 = r22
            if (r11 <= r10) goto L_0x00bf
            X.0Tu r12 = X.0Tu.A05
            r10 = 36318234865244177(0x81073e00031811, double:3.0311361983494813E-306)
            boolean r10 = X.182.A06(r12, r7, r10)
            r11 = 1
            if (r10 != 0) goto L_0x00c2
        L_0x00bf:
            r11 = 0
            if (r13 == 0) goto L_0x0210
        L_0x00c2:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = r10.toHours(r0)
            int r10 = (int) r0
            if (r11 != 0) goto L_0x00cd
            if (r13 == 0) goto L_0x0210
        L_0x00cd:
            r1 = 2131960123(0x7f13213b, float:1.9556906E38)
            if (r11 != 0) goto L_0x00d4
            if (r13 == 0) goto L_0x00d6
        L_0x00d4:
            r22 = r10
        L_0x00d6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            java.lang.String r12 = X.DbW.A0h(r8, r0, r1)
            int r0 = X.2Yu.A07(r8)
            int r11 = r8.getColor(r0)
            r0 = 2131100224(0x7f060240, float:1.7812823E38)
            int r10 = r8.getColor(r0)
            int r0 = X.2Yu.A0C(r8)
            int r1 = r8.getColor(r0)
            X.U0t r0 = new X.U0t
            r0.<init>(r12, r11, r10, r1)
        L_0x00fa:
            r9.setPresenceBadgeDrawable(r0)
            r9.setGradientSpinnerVisible(r2)
            android.widget.TextView r11 = r5.A09
            boolean r9 = r4.A0V()
            boolean r0 = X.C66651MaK.A00(r7, r4)
            if (r0 == 0) goto L_0x020d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Jw4 r1 = new X.Jw4
            r1.<init>((java.lang.Integer) r0)
        L_0x0113:
            r0 = r18
            X.C46334Dcc.A00(r11, r1, r0, r9)
            r1 = r0
            r0 = r27
            android.text.SpannableStringBuilder r10 = X.C49751F5c.A00(r8, r7, r4, r1, r0)
            boolean r0 = r4.A0M()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r4.A0I()
            if (r0 == 0) goto L_0x013f
            r0 = 2130970132(0x7f040614, float:1.7548965E38)
            int r0 = X.AnonymousClass7TF.A03(r8, r0)
            android.widget.TextView r1 = X.DbZ.A0C(r8, r5)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setCompoundDrawableTintList(r0)
        L_0x013f:
            android.widget.TextView r1 = r5.A0A
            X.Fvh r0 = new X.Fvh
            r21 = r0
            r22 = r8
            r23 = r10
            r24 = r7
            r25 = r5
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r1.post(r0)
        L_0x0155:
            android.widget.TextView r7 = r5.A07
            r7.setVisibility(r3)
            r0 = r27
            android.text.SpannableStringBuilder r0 = X.C49751F5c.A01(r8, r4, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x016e
            if (r38 == 0) goto L_0x016e
            r7.setText(r0)
            r7.setVisibility(r2)
        L_0x016e:
            boolean r12 = r15.Es2(r4)
            android.widget.ImageView r10 = r5.A04
            r10.setVisibility(r3)
            boolean r0 = r15.Cdh(r4)
            if (r0 == 0) goto L_0x01be
            if (r12 != 0) goto L_0x01be
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            X.DbT.A17(r8, r11, r0)
            X.DbT.A17(r8, r1, r0)
            X.DbT.A17(r8, r7, r0)
            android.widget.CheckBox r0 = r5.A02
            r0.setVisibility(r3)
            android.widget.ImageView r1 = r5.A05
            if (r36 == 0) goto L_0x0197
            r0 = 0
            if (r37 == 0) goto L_0x0199
        L_0x0197:
            r0 = 8
        L_0x0199:
            r1.setVisibility(r0)
            if (r36 != 0) goto L_0x01a3
        L_0x019e:
            if (r35 != 0) goto L_0x01a3
            r10.setVisibility(r2)
        L_0x01a3:
            android.widget.LinearLayout r1 = r5.A06
            if (r35 != 0) goto L_0x01a9
            if (r12 == 0) goto L_0x01ac
        L_0x01a9:
            r9 = 1050253722(0x3e99999a, float:0.3)
        L_0x01ac:
            r1.setAlpha(r9)
            android.widget.FrameLayout r0 = r5.A03
            r0.setBackground(r6)
            r16 = r1
            r17 = r4
            r18 = r27
            r15.Dbk(r16, r17, r18, r19, r20)
            return
        L_0x01be:
            X.DbY.A12(r11, r8)
            X.DbY.A11(r1, r8)
            X.DbY.A11(r7, r8)
            android.widget.ImageView r0 = r5.A05
            r0.setVisibility(r3)
            if (r36 == 0) goto L_0x01eb
            if (r12 != 0) goto L_0x01eb
            if (r37 == 0) goto L_0x01de
            boolean r0 = r15.CbW(r4)
            if (r0 != 0) goto L_0x01de
            android.widget.CheckBox r0 = r5.A02
            r0.setVisibility(r3)
            goto L_0x01a3
        L_0x01de:
            android.widget.CheckBox r1 = r5.A02
            r1.setVisibility(r2)
            boolean r0 = r15.CbW(r4)
            r1.setChecked(r0)
            goto L_0x01a3
        L_0x01eb:
            android.widget.CheckBox r0 = r5.A02
            r0.setVisibility(r3)
            if (r36 != 0) goto L_0x01a3
            if (r12 != 0) goto L_0x01a3
            goto L_0x019e
        L_0x01f5:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            android.widget.TextView r1 = r5.A0A
            if (r0 == 0) goto L_0x0202
            r1.setVisibility(r3)
            goto L_0x0155
        L_0x0202:
            r1.setText(r10)
            r1.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2)
            r1.setVisibility(r2)
            goto L_0x0155
        L_0x020d:
            r1 = 0
            goto L_0x0113
        L_0x0210:
            r1 = 2131960124(0x7f13213c, float:1.9556908E38)
            goto L_0x00d6
        L_0x0215:
            r0 = 0
            goto L_0x00fa
        L_0x0218:
            android.graphics.drawable.Drawable r1 = X.DbY.A07(r8)
            goto L_0x008a
        L_0x021e:
            if (r1 == 0) goto L_0x022f
            X.3oV r0 = r5.A0B
            X.DbZ.A1X(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r5.A0C
            r0.setVisibility(r2)
            r0.A0F(r6, r9, r1)
            goto L_0x006a
        L_0x022f:
            boolean r1 = r4.A0M()
            if (r1 != 0) goto L_0x0239
            boolean r1 = r4.A0R
            if (r1 != 0) goto L_0x028e
        L_0x0239:
            java.lang.Object r1 = r11.A00
            if (r1 == 0) goto L_0x028e
            X.0Tu r10 = X.0Tu.A05
            r12 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r10 = X.182.A06(r10, r7, r12)
            if (r10 == 0) goto L_0x026e
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r5.A0C
            r1.setVisibility(r3)
            r1.setGradientSpinnerVisible(r2)
            X.3oV r1 = r5.A0B
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r1 = X.DbS.A0Z(r1)
            r1.setVisibility(r2)
            com.instagram.user.model.User r10 = r0.A01(r7)
            java.util.List r0 = X.DbT.A14(r4)
            java.util.ArrayList r0 = X.AnonymousClass3UE.A05(r10, r0, r2)
            r1.A08 = r2
            r1.setImageUrls(r0, r9)
            goto L_0x006a
        L_0x026e:
            X.3oV r0 = r5.A0B
            X.DbZ.A1X(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r10 = r5.A0C
            r10.setVisibility(r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.Object r0 = r11.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r10.A0G(r6, r9, r1, r0)
            int r0 = X.2Yu.A0C(r8)
            int r0 = r8.getColor(r0)
            r10.setBackgroundRingColor(r0)
            goto L_0x006a
        L_0x028e:
            java.lang.Object r1 = r11.A00
            if (r1 == 0) goto L_0x006a
            X.3oV r0 = r5.A0B
            X.DbZ.A1X(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r5.A0C
            r0.setVisibility(r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r0.A0F(r6, r9, r1)
            goto L_0x006a
        L_0x02a3:
            android.widget.FrameLayout r1 = r5.A03
            r21 = 1
            X.FOO r0 = new X.FOO
            r16 = r5
            r17 = r4
            r18 = r27
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49759F5k.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.G8F, X.DpR, com.instagram.model.direct.DirectShareTarget, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Pv  reason: invalid class name and case insensitive filesystem */
public final class C307366Pv {
    public static C49391Eut A00;
    public static final C307366Pv A01 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        if (X.C297785sK.A0J(r11, r12, r13) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.session.UserSession r16, X.C255773uh r17, X.C250973mM r18, X.AnonymousClass3BQ r19, X.C309426Yf r20, X.C309406Yd r21, X.C309786Zp r22, X.AnonymousClass6PC r23) {
        /*
            r0 = 6
            r11 = r16
            X.0qQ.A0B(r11, r0)
            r12 = r17
            boolean r0 = A05(r11, r12)
            r5 = r23
            android.widget.TextView r2 = r5.A00
            r13 = r18
            r14 = r19
            r15 = r20
            r16 = r21
            r3 = r22
            if (r0 == 0) goto L_0x01ad
            android.content.Context r8 = r2.getContext()
            X.0qQ.A07(r8)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.lang.String r0 = r12.A0Z(r11)
            if (r0 == 0) goto L_0x02bb
            r4.append(r0)
            com.instagram.user.model.User r0 = r12.A0L()
            r9 = 1
            if (r0 == 0) goto L_0x01aa
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0043
            java.lang.String r0 = " • "
            r4.append(r0)
        L_0x0043:
            int r0 = X.2Yu.A0A(r8)
            int r6 = r8.getColor(r0)
            X.Gd6 r7 = new X.Gd6
            r7.<init>(r6)
            com.instagram.user.model.User r0 = r12.A0L()
            if (r0 == 0) goto L_0x02b3
            java.lang.String r1 = r0.getUsername()
            r0 = 2131974136(0x7f1357f8, float:1.9585328E38)
            java.lang.String r0 = r8.getString(r0)
            X.0qQ.A07(r0)
            android.text.SpannableStringBuilder r10 = X.1sx.A01(r7, r1, r0)
            X.DjV r7 = new X.DjV
            r17 = r7
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r15
            r23 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r6 = 0
            int r1 = r10.length()
            r0 = 17
            r10.setSpan(r7, r6, r1, r0)
            r4.append(r10)
            com.instagram.user.model.User r0 = r12.A0L()
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r0.isVerified()
            if (r0 != r9) goto L_0x01aa
            boolean r0 = r14.A00()
            if (r0 == 0) goto L_0x01aa
            r7 = 0
            X.C244273av.A07(r8, r4, r6)
        L_0x009c:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327898541603608(0x81100800023b18, double:3.037247546191687E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x00eb
            X.1Xj r0 = r12.A0b
            X.3xx r1 = X.C231122qu.A02(r11, r0)
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r0 = com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.ABOVE_IMAGE
            java.lang.String r1 = X.C247573gZ.A00(r0, r1)
            if (r1 == 0) goto L_0x00eb
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00eb
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            java.lang.String r0 = " • "
            r10.append(r0)
            int r0 = X.2Yu.A0A(r8)
            int r0 = r8.getColor(r0)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            r9.append(r1)
            X.DjI r6 = new X.DjI
            r6.<init>(r12, r3, r0)
            int r1 = r9.length()
            r0 = 17
            r9.setSpan(r6, r7, r1, r0)
            r10.append(r9)
            r4.append(r10)
        L_0x00eb:
            int r0 = X.2Yu.A0A(r8)
            int r6 = r8.getColor(r0)
            boolean r0 = X.C297785sK.A0K(r11, r12, r13)
            if (r0 == 0) goto L_0x0100
            boolean r1 = X.C297785sK.A0J(r11, r12, r13)
            r0 = 1
            if (r1 == 0) goto L_0x0101
        L_0x0100:
            r0 = 0
        L_0x0101:
            r1 = 17
            if (r0 == 0) goto L_0x018f
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0110
            java.lang.String r0 = " • "
            r4.append(r0)
        L_0x0110:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            A01(r8, r0)
            r9 = 2131969052(0x7f13441c, float:1.9575016E38)
            java.lang.String r8 = r8.getString(r9)
            r0.append(r8)
            X.DjW r10 = new X.DjW
            r18 = r5
            r19 = r6
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x012d:
            int r6 = r0.length()
            r0.setSpan(r10, r7, r6, r1)
        L_0x0134:
            r4.append(r0)
        L_0x0137:
            r2.setText(r4)
            boolean r0 = A05(r11, r12)
            if (r0 == 0) goto L_0x0145
            r10 = 0
        L_0x0141:
            X.AnonymousClass0fU.A00(r10, r2)
            return
        L_0x0145:
            boolean r0 = X.C297785sK.A0K(r11, r12, r13)
            if (r0 == 0) goto L_0x015b
            boolean r0 = X.C297785sK.A0J(r11, r12, r13)
            if (r0 != 0) goto L_0x015b
            X.6L5 r10 = new X.6L5
            r18 = r5
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0141
        L_0x015b:
            boolean r0 = X.C297785sK.A0i(r12, r13)
            if (r0 == 0) goto L_0x016d
            boolean r0 = X.C297785sK.A0o(r13, r15)
            if (r0 != 0) goto L_0x016d
            X.6LL r10 = new X.6LL
            r10.<init>(r12, r15, r3)
            goto L_0x0141
        L_0x016d:
            boolean r0 = X.C297785sK.A0D(r11, r12)
            if (r0 != 0) goto L_0x02ae
            X.0Tu r4 = X.0Tu.A05
            r0 = 36329818391920986(0x8111c70001415a, double:3.0384616672630134E-306)
            boolean r0 = X.182.A06(r4, r11, r0)
            if (r0 == 0) goto L_0x02ae
            X.3Dp r1 = X.C238833Dp.A00(r11)
            X.3Ds r0 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r1.A05(r2, r0)
            X.FO1 r10 = new X.FO1
            r10.<init>(r11, r12, r3, r5)
            goto L_0x0141
        L_0x018f:
            boolean r0 = X.C297785sK.A0i(r12, r13)
            if (r0 == 0) goto L_0x0137
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x01a0
            java.lang.String r0 = " • "
            r4.append(r0)
        L_0x01a0:
            android.text.SpannableStringBuilder r0 = A00(r8, r12, r13, r15)
            X.DjQ r10 = new X.DjQ
            r10.<init>(r12, r15, r3, r6)
            goto L_0x012d
        L_0x01aa:
            r7 = 0
            goto L_0x009c
        L_0x01ad:
            android.content.Context r6 = r2.getContext()
            X.0qQ.A07(r6)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            boolean r0 = X.C297785sK.A0D(r11, r12)
            if (r0 != 0) goto L_0x0215
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329818391855449(0x8111c700004159, double:3.0384616672215675E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x0215
            r0 = 2131239126(0x7f0820d6, float:1.809455E38)
            android.graphics.drawable.Drawable r10 = r6.getDrawable(r0)
            if (r10 == 0) goto L_0x0215
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r8 = r1.getDimensionPixelSize(r0)
            int r0 = X.2Yu.A0A(r6)
            int r7 = r6.getColor(r0)
            r1 = 0
            r10.setBounds(r1, r1, r8, r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            android.graphics.ColorFilter r0 = X.C9162RRn.A00(r0, r7)
            r10.setColorFilter(r0)
            java.lang.String r9 = " "
            r4.append(r9)
            X.46l r8 = new X.46l
            r8.<init>(r10)
            int r0 = r4.length()
            int r0 = r0 + -1
            int r7 = java.lang.Math.max(r1, r0)
            int r1 = r4.length()
            r0 = 33
            r4.setSpan(r8, r7, r1, r0)
            r4.append(r9)
        L_0x0215:
            java.lang.String r0 = r12.A0Z(r11)
            if (r0 == 0) goto L_0x02c3
            r4.append(r0)
            boolean r0 = X.C297785sK.A0n(r13)
            java.lang.String r7 = " • "
            if (r0 == 0) goto L_0x0283
            com.instagram.model.reels.Reel r10 = r13.A0H
            r8 = 1
            boolean r0 = X.C297785sK.A0V(r10)
            if (r0 == 0) goto L_0x023c
            X.0Tu r9 = X.0Tu.A06
            r0 = 36317818255119950(0x8106dd001d164e, double:3.030872732429366E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            if (r0 != 0) goto L_0x024f
        L_0x023c:
            boolean r0 = X.C297785sK.A0W(r10)
            if (r0 == 0) goto L_0x0283
            X.0Tu r9 = X.0Tu.A06
            r0 = 36317818255316561(0x8106dd00201651, double:3.0308727325537034E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            if (r0 == 0) goto L_0x0283
        L_0x024f:
            java.lang.String r0 = r12.A0j
            X.0qQ.A07(r0)
            int r0 = r13.A04(r11, r0)
            int r1 = r0 + 1
            java.util.List r0 = X.C250973mM.A00(r11, r13)
            int r0 = r0.size()
            if (r8 > r1) goto L_0x0283
            if (r1 > r0) goto L_0x0283
            r4.append(r7)
            android.content.res.Resources r9 = r6.getResources()
            r8 = 2131967692(0x7f133ecc, float:1.9572258E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = r9.getString(r8, r0)
            r4.append(r0)
        L_0x0283:
            boolean r0 = X.C297785sK.A0K(r11, r12, r13)
            if (r0 == 0) goto L_0x02a0
            boolean r0 = X.C297785sK.A0J(r11, r12, r13)
            if (r0 != 0) goto L_0x02a0
            r4.append(r7)
            A01(r6, r4)
            r0 = 2131969052(0x7f13441c, float:1.9575016E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x029c:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x0134
        L_0x02a0:
            boolean r0 = X.C297785sK.A0i(r12, r13)
            if (r0 == 0) goto L_0x0137
            r4.append(r7)
            android.text.SpannableStringBuilder r0 = A00(r6, r12, r13, r15)
            goto L_0x029c
        L_0x02ae:
            r0 = 0
            r2.setClickable(r0)
            return
        L_0x02b3:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02bb:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02c3:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307366Pv.A03(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6Yf, X.6Yd, X.6Zp, X.6PC):void");
    }

    public static final SpannableStringBuilder A00(Context context, C255773uh r6, C250973mM r7, C309426Yf r8) {
        long j;
        String A02;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!C297785sK.A0o(r7, r8)) {
            A01(context, spannableStringBuilder);
            A02 = context.getString(2131969051);
        } else {
            1Xj r1 = r6.A0b;
            if (r1 == null || !r1.CeS()) {
                j = -1;
            } else {
                long A1B = r1.A1B();
                if (C309456Yi.A02(r7)) {
                    f = (1.0f - r8.A0B) * ((float) C309456Yi.A00(r7, A1B));
                } else {
                    f = (1.0f - r8.A0B) * ((float) A1B);
                }
                j = (long) f;
            }
            A02 = 1G0.A02(j);
        }
        spannableStringBuilder.append(A02);
        return spannableStringBuilder;
    }

    public static final void A04(C255773uh r1, C309426Yf r2, C309786Zp r3) {
        if (!r2.A1A) {
            r2.A1A = true;
            if (r2.A0V != null) {
                r2.A05(AnonymousClass05K.A0N);
            }
            r3.E0C(r1);
            C49391Eut eut = A00;
            if (eut != null) {
                eut.A00.A0I.A03.getView().setVisibility(0);
                A00 = null;
            }
        }
    }

    public static final boolean A05(UserSession userSession, C255773uh r7) {
        String A002;
        1Xj r5 = r7.A0b;
        r5.getClass();
        boolean z = !C231122qu.A0P((UserSession) null, r5);
        if (!182.A06(0Tu.A05, userSession, 36327898541603608L)) {
            A002 = null;
        } else {
            A002 = C247573gZ.A00(IGAdTransparencyDisclaimerPlacement.ABOVE_IMAGE, C231122qu.A02(userSession, r5));
        }
        if ((!r7.A0z() || !z) && (A002 == null || A002.length() <= 0)) {
            return false;
        }
        return true;
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder) {
        Drawable drawable = context.getDrawable(R.drawable.play_icon);
        if (drawable != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new C2606346l(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append("  ");
        }
    }

    public static final void A02(UserSession userSession, C255773uh r2, C250973mM r3, AnonymousClass3BQ r4, C309426Yf r5, C309406Yd r6, C309786Zp r7, AnonymousClass6PC r8) {
        if (C297785sK.A0l(r3)) {
            r7.DSa(0nA.A0F(r8.A00), r2, r3);
            r7.D1D(r2, r5);
            return;
        }
        r6.A02();
        A03(userSession, r2, r3, r4, r5, r6, r7, r8);
        r7.D1D(r2, r5);
        C49391Eut eut = A00;
        if (eut != null) {
            eut.A00.A0I.A03.getView().setVisibility(0);
            A00 = null;
        }
    }
}

package X;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.7bR  reason: invalid class name and case insensitive filesystem */
public final class C334527bR extends C251343mx {
    public final C52971GgO A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final 0sP A03;
    public final boolean A04;
    public final C334067ac A05;

    public C334527bR(C52971GgO ggO, C334067ac r3, UserSession userSession, AnonymousClass4DU r5, 0sP r6, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(ggO, 3);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r6, 5);
        this.A05 = r3;
        this.A01 = userSession;
        this.A00 = ggO;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00fb, code lost:
        if (r10.A02 != true) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r35) {
        /*
            r34 = this;
            r5 = 0
            r33 = r35
            r0 = r33
            X.0qQ.A0B(r0, r5)
            r6 = r34
            X.7ac r8 = r6.A05
            boolean r1 = r8 instanceof X.C334057ab
            r0 = 0
            if (r1 != 0) goto L_0x028f
            boolean r1 = r8 instanceof X.C335407cu
            if (r1 != 0) goto L_0x028f
            boolean r1 = r8 instanceof X.C335417cv
            if (r1 == 0) goto L_0x0295
            X.7cv r8 = (X.C335417cv) r8
            r21 = 1
            com.instagram.common.session.UserSession r1 = r6.A01
            r32 = r1
            java.lang.Object[] r3 = new java.lang.Object[]{r32}
            r11 = 44
            X.9Kp r2 = new X.9Kp
            r2.<init>(r6, r11)
            r1 = r33
            java.lang.Object r12 = X.AnonymousClass3Zw.A00(r1, r2, r3)
            X.4Ew r12 = (X.AnonymousClass4Ew) r12
            X.3XV r1 = X.2WX.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r3 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r2 = new X.9JQ
            r2.<init>(r9, r3, r5)
            r30 = 0
            X.2WX r20 = new X.2WX
            r1 = r20
            r1.<init>(r0, r2)
            r1 = r33
            X.2V1 r2 = r1.A05
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r4 = new X.2Wb
            r4.<init>(r2, r1)
            X.7cr r7 = r8.A00
            X.7ct r10 = r8.A01
            r1 = 9221401712017801217(0x7ff9000000000001, double:NaN)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.9JR r14 = new X.9JR
            r14.<init>(r13, r5, r1)
            X.2WX r13 = new X.2WX
            r13.<init>(r0, r14)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r9, r3, r5)
            X.2WX r2 = new X.2WX
            r2.<init>(r13, r1)
            X.2V1 r1 = r4.A00
            r31 = r1
            android.content.Context r3 = r1.A0C
            r1 = 2130970213(0x7f040665, float:1.754913E38)
            int r1 = X.2Yu.A0H(r3, r1)
            int r1 = X.C244013aV.A02(r4, r1)
            X.7gD r14 = new X.7gD
            r14.<init>(r1)
            r1 = 4
            X.9JS r13 = new X.9JS
            r13.<init>(r9, r14, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r2, r13)
            r22 = r0
            r23 = r4
            r24 = r1
            r25 = r0
            r26 = r0
            r27 = r0
            r28 = r0
            r29 = r5
            X.2Tp r19 = X.C243563Zg.A0H(r22, r23, r24, r25, r26, r27, r28, r29)
            X.7ee r14 = new X.7ee
            r14.<init>()
            r14.A02 = r12
            X.3Zd r2 = X.C243533Zd.LOCAL
            java.lang.String r1 = "replying_to_bar"
            X.4Ey r13 = X.2Vi.A00(r2, r1)
            X.3du r1 = X.C246033ds.A01
            r13.A03(r1)
            r2 = 0
            r13.A01(r2)
            r13.A02(r2)
            r13.A02 = r12
            X.3du r1 = X.C246033ds.A00
            r13.A03(r1)
            r13.A01(r2)
            r13.A02(r2)
            r13.A02 = r12
            X.4Ez[] r1 = new X.C262564Ez[]{r14, r13}
            X.2Vm r2 = new X.2Vm
            r2.<init>(r1)
            r1 = r33
            X.AnonymousClass4F7.A00(r1, r2)
            if (r7 == 0) goto L_0x0117
            com.instagram.user.model.User r13 = r7.A00
            r1 = 2130968839(0x7f040107, float:1.7546343E38)
            int r1 = X.2Yu.A0H(r3, r1)
            int r27 = X.C244013aV.A02(r4, r1)
            X.4DU r2 = r6.A02
            if (r10 == 0) goto L_0x00fd
            boolean r12 = r10.A02
            r29 = 1
            r1 = r21
            if (r12 == r1) goto L_0x00ff
        L_0x00fd:
            r29 = 0
        L_0x00ff:
            r12 = 43
            X.9Kp r1 = new X.9Kp
            r1.<init>(r6, r12)
            r22 = r6
            r24 = r2
            r25 = r13
            r26 = r1
            r28 = r5
            X.2Tp r1 = r22.A00(r23, r24, r25, r26, r27, r28, r29)
            r4.A00(r1)
        L_0x0117:
            if (r10 == 0) goto L_0x0215
            boolean r1 = r10.A03
            if (r1 == 0) goto L_0x0146
            if (r7 != 0) goto L_0x0146
            com.instagram.user.model.User r12 = r10.A01
            X.4DU r2 = r6.A02
            r1 = 2130968839(0x7f040107, float:1.7546343E38)
            int r1 = X.2Yu.A0H(r3, r1)
            int r27 = X.C244013aV.A02(r4, r1)
            X.Inh r1 = new X.Inh
            r1.<init>(r6, r11)
            r22 = r6
            r24 = r2
            r25 = r12
            r26 = r1
            r28 = r21
            r29 = r21
            X.2Tp r1 = r22.A00(r23, r24, r25, r26, r27, r28, r29)
            r4.A00(r1)
        L_0x0146:
            int r1 = r10.A00
            java.lang.String r18 = X.C244013aV.A0E(r4, r1)
            r1 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r1 = X.2Yu.A0H(r3, r1)
            int r17 = X.C244013aV.A02(r4, r1)
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            long r10 = X.C244013aV.A0C(r4, r1)
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            r1 = 4622945017495814144(0x4028000000000000, double:12.0)
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            java.lang.Integer r13 = X.AnonymousClass05K.A0E
            X.9JR r12 = new X.9JR
            r12.<init>(r13, r5, r1)
            X.2WX r13 = new X.2WX
            r13.<init>(r0, r12)
            java.lang.Integer r14 = X.AnonymousClass05K.A05
            X.9JR r12 = new X.9JR
            r12.<init>(r14, r5, r1)
            X.2WX r14 = new X.2WX
            r14.<init>(r13, r12)
            android.graphics.Typeface r15 = android.graphics.Typeface.DEFAULT
            r1 = 0
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r12 = r31
            X.3ae r13 = X.2WW.A00(r12, r5)
            r12 = r18
            r13.A0V(r12)
            r13.A0U(r0)
            r12 = r17
            r13.A0P(r12)
            X.2V4 r12 = r4.Bnf()
            int r10 = X.2Wd.A00(r12, r10)
            r13.A0Q(r10)
            r13.A0R(r5)
            r13.A0S(r15)
            r10 = -7829368(0xffffffffff888888, float:NaN)
            r13.A0O(r10)
            X.2V4 r10 = r4.Bnf()
            int r10 = X.2Wd.A00(r10, r1)
            float r10 = (float) r10
            r13.A0K(r10)
            X.2V4 r10 = r4.Bnf()
            int r10 = X.2Wd.A00(r10, r1)
            float r10 = (float) r10
            r13.A0I(r10)
            X.2V4 r10 = r4.Bnf()
            int r10 = X.2Wd.A00(r10, r1)
            float r10 = (float) r10
            r13.A0J(r10)
            X.2V4 r10 = r4.Bnf()
            int r1 = X.2Wd.A00(r10, r1)
            float r1 = (float) r1
            r13.A0H(r1)
            r1 = r16
            r13.A0W(r1)
            r13.A0C()
            r13.A0X(r9)
            r1 = 1068121457(0x3faa3d71, float:1.33)
            r13.A0L(r1)
            r13.A0a(r5)
            r13.A0N(r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r13.A0M(r1)
            r1 = r21
            r13.A0b(r1)
            r13.A0Y(r5)
            r13.A0Z(r1)
            r13.A05(r0)
            X.C244123ag.A00(r13, r14)
            X.2WW r1 = r13.A0A()
            r4.A00(r1)
        L_0x0215:
            r1 = r19
            r4.A00(r1)
            if (r7 == 0) goto L_0x025d
            boolean r1 = r6.A04
            if (r1 == 0) goto L_0x025d
            X.0Tu r10 = X.0Tu.A05
            r1 = 36323874157112907(0x810c5f00002e4b, double:3.034702509234872E-306)
            r9 = r32
            boolean r1 = X.182.A06(r10, r9, r1)
            if (r1 == 0) goto L_0x025d
            X.1Xl r1 = r8.A03
            if (r1 == 0) goto L_0x0293
            X.1Xj r1 = r1.BPf()
        L_0x0237:
            X.0sP r9 = r6.A03
            java.lang.String r2 = r7.A02
            if (r1 == 0) goto L_0x0290
            java.lang.String r29 = r1.A2n()
            X.1Xy r1 = r1.A0C
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x024d
            java.lang.String r30 = r1.getId()
        L_0x024d:
            X.Gts r1 = new X.Gts
            r27 = r32
            r28 = r2
            r31 = r9
            r26 = r1
            r26.<init>(r27, r28, r29, r30, r31)
            r4.A00(r1)
        L_0x025d:
            boolean r1 = r8.A0G
            if (r1 == 0) goto L_0x0282
            java.util.List r2 = r8.A07
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0282
            X.4DU r7 = r6.A02
            X.0qQ.A07(r3)
            int r11 = X.AnonymousClass0nB.A01(r3)
            X.0sP r1 = r6.A03
            X.7eg r6 = new X.7eg
            r8 = r32
            r9 = r2
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A00(r6)
        L_0x0282:
            r6 = r4
            r7 = r33
            r8 = r20
            r9 = r0
            r10 = r0
            r11 = r0
            r12 = r5
            X.2Tl r0 = X.C243563Zg.A06(r6, r7, r8, r9, r10, r11, r12)
        L_0x028f:
            return r0
        L_0x0290:
            r29 = r0
            goto L_0x024d
        L_0x0293:
            r1 = r0
            goto L_0x0237
        L_0x0295:
            boolean r1 = r8 instanceof X.C381889ck
            if (r1 != 0) goto L_0x028f
            boolean r1 = r8 instanceof X.C53497GpT
            if (r1 == 0) goto L_0x02ce
            X.GpT r8 = (X.C53497GpT) r8
            X.3XV r1 = X.2WX.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r2 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r3, r2, r5)
            X.2WX r3 = new X.2WX
            r3.<init>(r0, r1)
            X.2V1 r1 = r33.Aqq()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r2 = new X.2Wb
            r2.<init>(r1, r0)
            X.GgO r1 = r6.A00
            X.Gwe r0 = new X.Gwe
            r0.<init>(r1, r8)
            r2.A00(r0)
            r0 = r33
            X.2Tl r0 = X.C243563Zg.A03(r2, r0, r3)
            return r0
        L_0x02ce:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334527bR.A0X(X.3Y5):X.3mp");
    }

    private final 2Tp A00(C70832Wc r48, AnonymousClass4DU r49, User user, C62320sa r51, int i, boolean z, boolean z2) {
        String A0F;
        2WX r0;
        AnonymousClass3XV r02 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX r4 = new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num, 100.0f, 0)), new AnonymousClass9JR(AnonymousClass05K.A0Y, 0, Double.doubleToRawLongBits(48.0d))), new AnonymousClass9JS(num, new ColorDrawable(i), 4));
        Integer num2 = AnonymousClass05K.A08;
        2WX r5 = new 2WX(r4, new AnonymousClass9JS(num2, "dismissable_callout_info_banner", 4));
        C70832Wc r40 = r48;
        2V1 Aqq = r40.Aqq();
        2WX r03 = new 2WX(r5, new C243543Ze(Aqq, C243533Zd.LOCAL, "replying_to_bar"));
        C243573Zh r36 = C243573Zh.CENTER;
        2Wb r2 = new 2Wb(Aqq, new ArrayList());
        if (z2) {
            r2.A00(new C244443bC(new 2WX(new 2WX(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(num, 0, C244013aV.A0C(r2, R.dimen.add_account_icon_circle_radius))), new AnonymousClass9JR(AnonymousClass05K.A01, 0, C244013aV.A0C(r2, R.dimen.add_account_icon_circle_radius))), new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r2, 2131970052), 0)), new AnonymousClass9JR(AnonymousClass05K.A07, 0, Double.doubleToRawLongBits(16.0d))), new AnonymousClass9JR(AnonymousClass05K.A09, 0, C244013aV.A0C(r2, R.dimen.abc_edit_text_inset_top_material))), new AnonymousClass9JQ(AnonymousClass05K.A0C, 0.0f, 1)), r49, user.Bh3(), (AnonymousClass3NK) null, C244013aV.A02(r2, 2Yu.A0H(r2.A00.A0C, R.attr.igds_color_highlight_background)), 0, -16777216, false, true, false));
        }
        if (z) {
            A0F = C244013aV.A0F(r2, user.getUsername(), 2131956414);
        } else {
            A0F = C244013aV.A0F(r2, user.getUsername(), 2131972170);
        }
        2V1 r10 = r2.A00;
        int A022 = C244013aV.A02(r2, 2Yu.A0H(r10.A0C, R.attr.igds_color_secondary_text));
        long A0C = C244013aV.A0C(r2, R.dimen.abc_text_size_menu_header_material);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Integer num3 = AnonymousClass05K.A01;
        2WX r42 = new 2WX((2WX) null, new AnonymousClass9JQ(num3, 1.0f, 1));
        if (!z2) {
            r0 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A0u, 0, Double.doubleToRawLongBits(16.0d))), new AnonymousClass9JR(AnonymousClass05K.A1F, 0, Double.doubleToRawLongBits(32.0d)));
        } else {
            r0 = null;
        }
        2WX A002 = r42.A00(r0);
        Typeface typeface = Typeface.DEFAULT;
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        C244103ae A003 = 2WW.A00(r10, 0);
        A003.A0V(A0F);
        A003.A0U((2V5) null);
        A003.A0P(A022);
        A003.A0Q(2Wd.A00(r2.Bnf(), A0C));
        A003.A0R(0);
        A003.A0S(typeface);
        A003.A0O(-7829368);
        A003.A0K((float) 2Wd.A00(r2.Bnf(), doubleToRawLongBits));
        A003.A0I((float) 2Wd.A00(r2.Bnf(), doubleToRawLongBits));
        A003.A0J((float) 2Wd.A00(r2.Bnf(), doubleToRawLongBits));
        A003.A0H((float) 2Wd.A00(r2.Bnf(), doubleToRawLongBits));
        A003.A0W(num);
        A003.A0C();
        A003.A0X(num);
        A003.A0L(1.0f);
        A003.A0a(false);
        A003.A0N(0);
        A003.A0M(1);
        A003.A0b(true);
        A003.A0Y(false);
        A003.A0Z(true);
        A003.A0T(truncateAt);
        A003.A05((AnonymousClass2VW) null);
        C244123ag.A00(A003, A002);
        r2.A00(A003.A0A());
        2WX r9 = new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num3, 100.0f, 0)), new AnonymousClass9JS(num3, "android.widget.Button", 0)), new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r2, 2131972168), 0)), new AnonymousClass9JS(AnonymousClass05K.A1F, new AnonymousClass9LG(r51, 6), 4));
        2Wb r8 = new 2Wb(r2.Aqq(), new ArrayList());
        Drawable A0D = C244013aV.A0D(r8, R.drawable.instagram_x_pano_outline_12);
        2V1 r11 = r8.A00;
        A0D.setTint(C244013aV.A02(r8, 2Yu.A0H(r11.A0C, R.attr.igds_color_primary_icon)));
        2WX r43 = new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(num2, "dismiss_button", 4)), new AnonymousClass9JR(AnonymousClass05K.A07, 0, Double.doubleToRawLongBits(14.0d))), new AnonymousClass9JR(AnonymousClass05K.A09, 0, Double.doubleToRawLongBits(22.0d))), new AnonymousClass9JQ(AnonymousClass05K.A0C, 0.0f, 1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        C247393gG A004 = C247373gE.A00(r11);
        A004.A0D(A0D);
        A004.A0E(scaleType);
        A004.A0C();
        C244123ag.A00(A004, r43);
        r8.A00(A004.A0A());
        r2.A00(C243563Zg.A0H(r8, r2, r9, (C243573Zh) null, r36, (C243583Zi) null, (C244343b2) null, false));
        return C243563Zg.A0H(r2, r40, r03, (C243573Zh) null, r36, (C243583Zi) null, (C244343b2) null, false);
    }
}

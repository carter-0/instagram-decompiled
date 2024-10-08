package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class Tw6 extends C232222tE {
    public final int A00;
    public final XC2 A01;
    public final XAH A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        View A0A = DbU.A0A(LayoutInflater.from(A0S), viewGroup, R.layout.row_search_keyword_icons, false);
        C14498TxK txK = new C14498TxK(A0A);
        C14497TxJ.A00(A0S, txK.A07, AnonymousClass05K.A00);
        A0A.setTag(txK);
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof C14498TxK) {
            return r1;
        }
        throw DbT.A0m();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        if (r0 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        if (X.0qQ.A0K(r11.A09, "null_state_popular") == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        if (r6 != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        r4 = r11.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d7, code lost:
        if (X.0qQ.A0K(r4, "null_state_recent") != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (X.0qQ.A0K(r4, "meta_ai_recent") != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (X.0qQ.A0K(r4, "null_state_popular") != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        if (X.0qQ.A0K(r4, "null_state_suggestions") != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        if (r26 != r12) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        r7.A07.setVisibility(8);
        r1.setVisibility(8);
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        if (r1 != null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0101, code lost:
        r1 = X.C13989Tnp.A0U(r7.A04);
        r7.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        if (r5 == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r3.A0A != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        if (r1 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0113, code lost:
        r0 = com.instagram.android.R.drawable.instagram_search_gen_ai_pano_filled_20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        r1.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        if (X.0qQ.A0K(r3.A07, "meta_ai_suggestion") == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0121, code lost:
        if (r5 != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0123, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0124, code lost:
        r1.setColorFilter(r0);
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012a, code lost:
        X.C67434Mnp.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        r0 = X.AnonymousClass37O.A00(X.AnonymousClass7TF.A03(r10, com.instagram.android.R.attr.glyphColorSecondary));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0145, code lost:
        if (X.0qQ.A0K(r3.A07, "meta_ai_suggestion") == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r1 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        r0 = com.instagram.android.R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014f, code lost:
        if (r3.A0A == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0151, code lost:
        if (r1 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0153, code lost:
        r0 = com.instagram.android.R.drawable.instagram_arrow_up_right_pano_filled_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0157, code lost:
        if (r1 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0159, code lost:
        r0 = com.instagram.android.R.drawable.instagram_search_outline_12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r28, X.C249703kE r29) {
        /*
            r27 = this;
            r0 = r28
            X.Mnw r0 = (X.C67441Mnw) r0
            r13 = 0
            r1 = r29
            boolean r12 = X.AnonymousClass7TF.A1U(r13, r0, r1)
            X.Mg0 r11 = r0.A00
            android.content.Context r10 = X.JTQ.A06(r1)
            X.Mn4 r9 = r0.A00
            r2 = r27
            X.XC2 r8 = r2.A01
            X.XAH r0 = r2.A02
            android.view.View r1 = r1.itemView
            java.lang.Object r7 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.search.common.ui.KeywordRowViewBinder.Holder"
            X.0qQ.A0C(r7, r1)
            X.TxK r7 = (X.C14498TxK) r7
            boolean r6 = r11.A0F
            boolean r25 = X.AnonymousClass7TF.A1P(r6)
            boolean r1 = r2.A08
            r19 = r1
            boolean r1 = r2.A06
            r18 = r1
            boolean r1 = r2.A07
            r17 = r1
            boolean r1 = r2.A09
            r16 = r1
            int r1 = r2.A00
            r26 = r1
            boolean r15 = r2.A05
            boolean r5 = r2.A04
            boolean r14 = r2.A03
            r4 = 2
            r1 = 3
            X.C51973G9u.A0r(r1, r8, r0, r7)
            com.instagram.model.keyword.Keyword r3 = r9.A01
            android.view.View r2 = r7.A02
            r0.ECK(r2, r9, r11)
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            java.lang.String r0 = r3.A04
            r1.setText(r0)
            if (r15 == 0) goto L_0x005e
            r1.setMaxLines(r4)
        L_0x005e:
            if (r6 != 0) goto L_0x0186
            if (r16 == 0) goto L_0x0186
            X.C13988Tno.A16(r1, r13)
            java.lang.CharSequence r0 = r9.A02
            if (r0 != 0) goto L_0x006d
            com.instagram.model.keyword.Keyword r0 = r9.A01
            java.lang.String r0 = r0.A04
        L_0x006d:
            r1.setText(r0)
        L_0x0070:
            boolean r0 = r11.A0J
            if (r0 == 0) goto L_0x0182
            java.lang.String r4 = r11.A09
        L_0x0076:
            if (r4 == 0) goto L_0x0179
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0179
            com.instagram.common.ui.base.IgTextView r1 = r7.A05
            r1.setVisibility(r13)
            r1.setText(r4)
        L_0x0086:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A00
            if (r0 != 0) goto L_0x0094
            android.view.ViewStub r0 = r7.A03
            com.instagram.common.ui.base.IgSimpleImageView r0 = X.C13989Tnp.A0U(r0)
            r7.A00 = r0
            if (r0 == 0) goto L_0x00a1
        L_0x0094:
            r20 = 0
            r21 = r0
            r22 = r9
            r23 = r11
            r24 = r8
            X.C67429Mnk.A00(r20, r21, r22, r23, r24, r25)
        L_0x00a1:
            java.lang.String r14 = "null_state_popular"
            if (r17 == 0) goto L_0x00ad
            java.lang.String r0 = r11.A09
            boolean r0 = X.0qQ.A0K(r0, r14)
            if (r0 != 0) goto L_0x00b9
        L_0x00ad:
            if (r18 == 0) goto L_0x00cd
            if (r6 != 0) goto L_0x0164
            java.lang.String r0 = r11.A09
            boolean r0 = X.0qQ.A0K(r0, r14)
            if (r0 != 0) goto L_0x00cf
        L_0x00b9:
            java.lang.String r4 = r3.A08
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x015d
            if (r4 == 0) goto L_0x015d
            int r0 = r4.length()
            if (r0 == 0) goto L_0x015d
            r1.setVisibility(r13)
            r1.setText(r4)
        L_0x00cd:
            if (r6 != 0) goto L_0x0164
        L_0x00cf:
            java.lang.String r4 = r11.A09
            java.lang.String r0 = "null_state_recent"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "meta_ai_recent"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x0164
            boolean r0 = X.0qQ.A0K(r4, r14)
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "null_state_suggestions"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x0164
            r0 = r26
            if (r0 != r12) goto L_0x0164
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r7.A07
            r0 = 8
            r4.setVisibility(r0)
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r7.A01
            if (r1 != 0) goto L_0x0109
            android.view.ViewStub r0 = r7.A04
            com.instagram.common.ui.base.IgSimpleImageView r1 = X.C13989Tnp.A0U(r0)
            r7.A01 = r1
        L_0x0109:
            java.lang.String r4 = "meta_ai_suggestion"
            if (r5 == 0) goto L_0x013f
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x013f
            if (r1 == 0) goto L_0x012a
            r0 = 2131238744(0x7f081f58, float:1.8093775E38)
        L_0x0116:
            r1.setImageResource(r0)
            java.lang.String r0 = r3.A07
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0133
            if (r5 != 0) goto L_0x0133
            r0 = 0
        L_0x0124:
            r1.setColorFilter(r0)
            r1.setVisibility(r13)
        L_0x012a:
            X.C67434Mnp.A02(r2)
        L_0x012d:
            r0 = 50
            X.WB4.A00(r2, r8, r9, r11, r0)
            return
        L_0x0133:
            r0 = 2130970006(0x7f040596, float:1.754871E38)
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            goto L_0x0124
        L_0x013f:
            java.lang.String r0 = r3.A07
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x014d
            if (r1 == 0) goto L_0x012a
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            goto L_0x0116
        L_0x014d:
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0157
            if (r1 == 0) goto L_0x012a
            r0 = 2131237925(0x7f081c25, float:1.8092114E38)
            goto L_0x0116
        L_0x0157:
            if (r1 == 0) goto L_0x012a
            r0 = 2131238761(0x7f081f69, float:1.809381E38)
            goto L_0x0116
        L_0x015d:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00cd
        L_0x0164:
            if (r19 == 0) goto L_0x012d
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r7.A07
            r3.setVisibility(r13)
            android.view.ViewStub r1 = r7.A04
            r0 = 8
            r1.setVisibility(r0)
            X.C67434Mnp.A04(r3)
            X.C67434Mnp.A01(r2)
            goto L_0x012d
        L_0x0179:
            r0 = 8
            com.instagram.common.ui.base.IgTextView r1 = r7.A05
            r1.setVisibility(r0)
            goto L_0x0086
        L_0x0182:
            java.lang.String r4 = r3.A06
            goto L_0x0076
        L_0x0186:
            X.C13988Tno.A16(r1, r12)
            java.lang.String r0 = r3.A04
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r7.A07
            if (r14 == 0) goto L_0x019b
            if (r6 == 0) goto L_0x019b
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0196:
            X.C14497TxJ.A00(r10, r1, r0)
            goto L_0x0070
        L_0x019b:
            com.instagram.model.keyword.Keyword r0 = r9.A01
            java.lang.String r4 = r0.A07
            java.lang.String r0 = "meta_ai_suggestion"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x01aa
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0196
        L_0x01aa:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0196
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Tw6.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C67441Mnw.class;
    }

    public Tw6(XC2 xc2, XAH xah, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A01 = xc2;
        this.A02 = xah;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A09 = z4;
        this.A00 = i;
        this.A05 = z5;
        this.A04 = z6;
        this.A03 = z7;
    }
}

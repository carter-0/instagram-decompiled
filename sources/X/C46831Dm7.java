package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dm7  reason: case insensitive filesystem */
public final class C46831Dm7 extends 2Rw {
    public List A00;
    public final Context A01;
    public final UserSession A02;
    public final C49942FFv A03;
    public final AnonymousClass4DU A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        boolean z = this.A05;
        int i2 = R.layout.direct_external_reshare_row_button;
        if (z) {
            i2 = R.layout.direct_external_reshare_row_button_v2;
        }
        return new C47034DpQ(DbW.A09(A0F, viewGroup, i2, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r20, int r21) {
        /*
            r19 = this;
            r5 = r20
            X.DpQ r5 = (X.C47034DpQ) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            r6 = r19
            java.util.List r0 = r6.A00
            r1 = r21
            java.lang.Object r3 = r0.get(r1)
            X.FBq r3 = (X.C49890FBq) r3
            boolean r0 = r6.A05
            r14 = r0
            r2 = 8
            if (r0 != 0) goto L_0x030e
            com.instagram.common.session.UserSession r8 = r6.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x030e
            boolean r0 = X.DbW.A1T(r7, r8)
            if (r0 == 0) goto L_0x030e
            androidx.constraintlayout.widget.ConstraintLayout r10 = r5.A04
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            android.content.Context r8 = r6.A01
            r7 = 56
            int r0 = X.DbS.A02(r8, r7)
            r1.height = r0
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            int r0 = X.DbS.A02(r8, r7)
            r1.width = r0
            int r9 = X.DbS.A02(r8, r2)
            r10.setPadding(r9, r9, r9, r9)
        L_0x0051:
            boolean r0 = r3 instanceof X.EK3
            r18 = r0
            if (r0 == 0) goto L_0x006b
            com.instagram.common.session.UserSession r8 = r6.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36326575691544411(0x810ed40000375b, double:3.036410970487561E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x006b
            r0 = 2131960052(0x7f1320f4, float:1.9556762E38)
            r3.A00 = r0
        L_0x006b:
            boolean r0 = r3 instanceof X.C47850EJw
            r17 = -1061158912(0xffffffffc0c00000, float:-6.0)
            java.lang.String r16 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x0094
            X.FGK r13 = X.FGK.A00
            com.instagram.common.session.UserSession r12 = r6.A02
            boolean r0 = X.C249223jK.A02(r12)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x028d
            X.0Tu r7 = X.0Tu.A05
            r0 = 36320652934914788(0x810971003222e4, double:3.032665395345961E-306)
            boolean r0 = X.182.A06(r7, r12, r0)
            if (r0 != 0) goto L_0x0094
            X.EW5 r1 = X.FGK.A00(r12)
            X.EW5 r0 = X.EW5.HScrollIcon
            if (r1 != r0) goto L_0x028d
        L_0x0094:
            android.widget.FrameLayout r8 = r5.A02
            r8.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A07
            int r0 = r3.A04
            r1.setImageResource(r0)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r5.A03
            r10.setVisibility(r2)
            androidx.constraintlayout.widget.ConstraintLayout r7 = r5.A04
            r7.setVisibility(r4)
        L_0x00aa:
            boolean r0 = r3 instanceof X.C47847EJt
            if (r0 == 0) goto L_0x010b
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r13 = r6.A02
            com.instagram.user.model.User r0 = r0.A01(r13)
            com.instagram.common.typedurl.ImageUrl r11 = r0.Bh3()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A06
            X.4DU r0 = r6.A04
            r1.setUrl(r11, r0)
            r1.setVisibility(r4)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r5.A0A
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r12.A0A
            android.content.Context r11 = r12.getContext()
            r0 = 2131238578(0x7f081eb2, float:1.8093439E38)
            X.DbU.A13(r11, r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0D
            r1 = 2131238579(0x7f081eb3, float:1.809344E38)
            X.DbU.A13(r11, r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0C
            X.DbU.A13(r11, r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0B
            X.DbU.A13(r11, r0, r1)
            X.DbY.A1L(r13, r12)
            r12.setCreationLayoutForShareSheet(r4)
            r0 = r17
            r12.setRotation(r0)
            com.instagram.common.ui.base.IgTextView r12 = r5.A05
            r0 = r16
            android.view.ViewGroup$MarginLayoutParams r11 = X.DbW.A0A(r12, r0)
            r1 = 2
            int r9 = r9 / r1
            android.content.Context r0 = r6.A01
            int r0 = X.DbS.A02(r0, r1)
            int r9 = r9 - r0
            r11.topMargin = r9
            r12.setLayoutParams(r11)
            r10.setVisibility(r4)
            r7.setVisibility(r2)
        L_0x010b:
            com.instagram.common.session.UserSession r10 = r6.A02
            X.0Tu r11 = X.0Tu.A05
            r0 = 36324295063908306(0x810cc100002fd2, double:3.034968692387138E-306)
            boolean r0 = X.182.A06(r11, r10, r0)
            if (r0 == 0) goto L_0x0139
            r12 = 1
            X.0qQ.A0B(r3, r12)
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            r8.setVisibility(r2)
            boolean r0 = r3 instanceof X.C47840EJm
            if (r0 == 0) goto L_0x018f
            android.content.Context r2 = r6.A01
            r0 = 2131100477(0x7f06033d, float:1.7813337E38)
            X.DbU.A10(r2, r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A07
            r0 = 2131238391(0x7f081df7, float:1.809306E38)
            X.DbU.A13(r2, r1, r0)
        L_0x0139:
            com.instagram.common.ui.base.IgTextView r7 = r5.A05
            int r0 = r3.A00
            r7.setText(r0)
            android.content.Context r1 = r6.A01
            int r0 = r3.A00
            X.DbU.A12(r1, r7, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.A07
            int r0 = r3.A00
            X.DbU.A12(r1, r2, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            r7.setAlpha(r0)
            X.3NG r1 = new X.3NG
            r1.<init>(r2)
            X.H7j r0 = new X.H7j
            r0.<init>(r4, r3, r5, r6)
            r1.A04 = r0
            r1.A00()
            android.view.View r5 = r5.A00
            r0 = 35
            X.FPE.A01(r5, r0, r3, r6)
            X.FFv r4 = r6.A03
            X.2FW r1 = r3.A05
            java.lang.Object r0 = r3.A06
            java.lang.String r2 = X.C49890FBq.A01(r1, r0)
            java.lang.String r1 = "_"
            java.lang.String r0 = r3.A08
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            r0 = 0
            X.30a r1 = X.AnonymousClass30Y.A00(r3, r0, r1)
            X.FZU r0 = r4.A0D
            X.30Y r1 = X.DbU.A0a(r0, r1)
            X.2el r0 = r4.A0C
            r0.A05(r5, r1)
            return
        L_0x018f:
            boolean r0 = r3 instanceof X.C47838EJk
            if (r0 == 0) goto L_0x01aa
            android.content.Context r2 = r6.A01
            r0 = 2131100360(0x7f0602c8, float:1.78131E38)
            X.DbU.A10(r2, r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A07
            r0 = 2131237886(0x7f081bfe, float:1.8092035E38)
            X.DbU.A13(r2, r1, r0)
        L_0x01a3:
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
        L_0x01a6:
            X.DbU.A14(r2, r1, r0)
            goto L_0x0139
        L_0x01aa:
            boolean r0 = r3 instanceof X.C47837EJj
            if (r0 == 0) goto L_0x01c2
            android.content.Context r2 = r6.A01
            r0 = 2131100359(0x7f0602c7, float:1.7813097E38)
            X.DbU.A10(r2, r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A07
            r0 = 2131237884(0x7f081bfc, float:1.8092031E38)
            X.DbU.A13(r2, r1, r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            goto L_0x01a6
        L_0x01c2:
            boolean r0 = r3 instanceof X.C47843EJp
            if (r0 != 0) goto L_0x026c
            boolean r0 = r3 instanceof X.C47835EJh
            if (r0 == 0) goto L_0x01d5
            android.content.Context r2 = r6.A01
            r0 = 2131100319(0x7f06029f, float:1.7813016E38)
        L_0x01cf:
            X.DbU.A10(r2, r9, r0)
        L_0x01d2:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A07
            goto L_0x01a3
        L_0x01d5:
            if (r18 == 0) goto L_0x01dd
            android.content.Context r2 = r6.A01
            r0 = 2131100317(0x7f06029d, float:1.7813012E38)
            goto L_0x01cf
        L_0x01dd:
            boolean r0 = r3 instanceof X.C47844EJq
            if (r0 == 0) goto L_0x01e7
            android.content.Context r2 = r6.A01
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            goto L_0x01cf
        L_0x01e7:
            boolean r0 = r3 instanceof X.C47839EJl
            if (r0 == 0) goto L_0x0232
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            r8.setOrientation(r0)
            android.content.Context r2 = r6.A01
            r0 = 2131100363(0x7f0602cb, float:1.7813105E38)
            int r10 = r2.getColor(r0)
            r0 = 2131100364(0x7f0602cc, float:1.7813107E38)
            int r9 = r2.getColor(r0)
            r0 = 2131100365(0x7f0602cd, float:1.781311E38)
            int r1 = r2.getColor(r0)
            r0 = 2131100366(0x7f0602ce, float:1.7813111E38)
            int r0 = r2.getColor(r0)
            int[] r0 = new int[]{r10, r9, r1, r0}
            r8.setColors(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.0nA.A01(r2, r0)
            int r1 = (int) r0
            r0 = 2131099838(0x7f0600be, float:1.781204E38)
            int r0 = r2.getColor(r0)
            r8.setStroke(r1, r0)
            r8.setShape(r12)
            r7.setBackground(r8)
            goto L_0x01d2
        L_0x0232:
            boolean r0 = r3 instanceof X.C47842EJo
            if (r0 == 0) goto L_0x023c
            android.content.Context r2 = r6.A01
            r0 = 2131100483(0x7f060343, float:1.7813349E38)
            goto L_0x01cf
        L_0x023c:
            boolean r0 = r3 instanceof X.C47841EJn
            if (r0 != 0) goto L_0x026c
            boolean r0 = r3 instanceof X.C47849EJv
            if (r0 == 0) goto L_0x0279
            r0 = 36324295063973843(0x810cc100012fd3, double:3.034968692428584E-306)
            boolean r0 = X.182.A06(r11, r10, r0)
            if (r0 == 0) goto L_0x0273
            com.instagram.common.typedurl.ImageUrl r9 = X.DbX.A0X(r10)
            r7.setVisibility(r2)
            r8.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A09
            X.4DU r0 = r6.A04
            r1.setUrl(r9, r0)
            android.view.ViewStub r0 = r5.A01
            r0.setVisibility(r4)
            r0 = 2131960056(0x7f1320f8, float:1.955677E38)
            r3.A00 = r0
            goto L_0x0139
        L_0x026c:
            android.content.Context r2 = r6.A01
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            goto L_0x01cf
        L_0x0273:
            android.content.Context r2 = r6.A01
            r0 = 2131099838(0x7f0600be, float:1.781204E38)
            goto L_0x0282
        L_0x0279:
            android.content.Context r2 = r6.A01
            r0 = 2130970211(0x7f040663, float:1.7549126E38)
            int r0 = X.2Yu.A0H(r2, r0)
        L_0x0282:
            X.DbU.A10(r2, r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A07
            int r0 = X.2Yu.A0B(r2)
            goto L_0x01a6
        L_0x028d:
            android.widget.FrameLayout r8 = r5.A02
            r8.setVisibility(r2)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r11 = r5.A0A
            X.DbY.A1L(r12, r11)
            r11.setCreationLayoutForShareSheet(r4)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r5.A03
            r10.setVisibility(r4)
            androidx.constraintlayout.widget.ConstraintLayout r7 = r5.A04
            r7.setVisibility(r2)
            boolean r0 = r13.A05(r12)
            if (r0 == 0) goto L_0x0300
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r12 = r5.A0B
            r0 = r16
            android.view.ViewGroup$MarginLayoutParams r13 = X.DbW.A0A(r12, r0)
            r1 = r3
            X.EJw r1 = (X.C47850EJw) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x02f5
            r15 = 52
            if (r14 == 0) goto L_0x02bf
            r15 = 62
        L_0x02bf:
            r14 = 1060823368(0x3f3ae148, float:0.73)
            float r0 = (float) r15
            float r0 = r0 * r14
            int r0 = X.AnonymousClass1GB.A01(r0)
            android.content.Context r14 = r6.A01
            int r0 = X.DbS.A02(r14, r0)
            r13.width = r0
            int r0 = X.DbS.A02(r14, r15)
            r13.height = r0
            int r14 = r9 / 2
        L_0x02d8:
            r13.topMargin = r14
            r12.setLayoutParams(r13)
            r12.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r5.A08
            com.instagram.common.typedurl.ImageUrl r1 = r1.A00
            X.4DU r0 = r6.A04
            r12.setUrl(r1, r0)
            r0 = r17
            r11.setRotation(r0)
            goto L_0x00aa
        L_0x02f5:
            int r14 = r9 / 2
            android.content.Context r0 = r6.A01
            r15 = 4
            int r0 = X.DbS.A02(r0, r15)
            int r14 = r14 + r0
            goto L_0x02d8
        L_0x0300:
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r5.A06
            r0 = r3
            X.EJw r0 = (X.C47850EJw) r0
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            X.4DU r0 = r6.A04
            r11.setUrl(r1, r0)
            goto L_0x00aa
        L_0x030e:
            r9 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46831Dm7.onBindViewHolder(X.3kE, int):void");
    }

    public C46831Dm7(Context context, UserSession userSession, C49942FFv fFv, AnonymousClass4DU r7, List list, boolean z) {
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = r7;
        this.A00 = list;
        this.A03 = fFv;
        this.A06 = z;
        this.A05 = 182.A06(0Tu.A05, userSession, 36328826254409327L);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1235678664);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(848692240, A032);
        return size;
    }
}

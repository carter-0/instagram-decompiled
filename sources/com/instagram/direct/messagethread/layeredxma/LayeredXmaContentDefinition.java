package com.instagram.direct.messagethread.layeredxma;

import X.0qQ;
import X.0sr;
import X.AnonymousClass0iw;
import X.AnonymousClass75W;
import X.AnonymousClass7D2;
import X.AnonymousClass7DV;
import X.AnonymousClass7DX;
import X.AnonymousClass7DY;
import X.AnonymousClass7DZ;
import X.AnonymousClass7XN;
import X.AnonymousClass7XR;
import X.AnonymousClass7XX;
import X.AnonymousClass9HC;
import X.C3265877j;
import X.C3265977k;
import X.C3266077l;
import X.C3266177m;
import X.C328007Db;
import X.C333107Xr;
import X.C72577PBi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class LayeredXmaContentDefinition implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DZ A01;
    public final boolean A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_layered_xma_message, viewGroup, false);
        0qQ.A0A(inflate);
        C72577PBi pBi = new C72577PBi(inflate);
        this.A01.A00(pBi);
        return pBi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        if (r1.intValue() <= 0) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r14, X.AnonymousClass7FW r15) {
        /*
            r13 = this;
            X.PBi r14 = (X.C72577PBi) r14
            X.7Fr r15 = (X.C328667Fr) r15
            r10 = 0
            X.0qQ.A0B(r14, r10)
            r6 = 1
            X.0qQ.A0B(r15, r6)
            X.3tD r1 = r15.A0J
            X.3tD r0 = X.C254883tD.SINGLE
            if (r1 != r0) goto L_0x017f
            X.777 r3 = r15.A0F
            if (r3 == 0) goto L_0x017f
            boolean r0 = r3 instanceof X.AnonymousClass776
            if (r0 == 0) goto L_0x017f
            android.widget.LinearLayout r0 = r14.A02
            android.content.Context r7 = r0.getContext()
            com.instagram.feed.widget.IgProgressImageView r4 = r14.A07
            X.7FE r0 = r15.A0C
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.getIgImageView()
            X.77D r0 = X.C3265577g.A05(r1, r0)
            r1.setImageRendererAndReset(r0)
            boolean r2 = r13.A02
            if (r2 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.width = r0
        L_0x0044:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            int r0 = r0.width
            float r5 = (float) r0
            X.776 r3 = (X.AnonymousClass776) r3
            java.lang.Float r0 = r3.A02
            if (r0 == 0) goto L_0x0059
            float r1 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r1
            float r5 = r5 * r0
        L_0x0059:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            int r0 = (int) r5
            r1.height = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.getIgImageView()
            r0.clearColorFilter()
            android.content.Context r1 = r7.getApplicationContext()
            r0 = 2131239103(0x7f0820bf, float:1.8094503E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r4.setForeground(r0)
            android.content.Context r1 = r7.getApplicationContext()
            r0 = 2131237395(0x7f081a13, float:1.809104E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x0097
            r4.setForeground(r1)
            X.0eM r0 = r14.A08
            java.lang.Object r0 = r0.getValue()
            X.OG3 r0 = (X.OG3) r0
            com.instagram.common.ui.base.IgFrameLayout r0 = r0.A01
            r0.setForeground(r1)
        L_0x0097:
            r0 = 3
            r4.setMiniPreviewBlurRadius(r0)
            if (r2 != 0) goto L_0x00b8
            android.widget.ImageView r2 = r14.A01
            java.lang.Integer r1 = r3.A03
            if (r1 == 0) goto L_0x01aa
            int r0 = r1.intValue()
        L_0x00a7:
            r2.setImageResource(r0)
            if (r1 == 0) goto L_0x00b3
            int r1 = r1.intValue()
            r0 = 0
            if (r1 > 0) goto L_0x00b5
        L_0x00b3:
            r0 = 8
        L_0x00b5:
            r2.setVisibility(r0)
        L_0x00b8:
            com.instagram.common.typedurl.ImageUrl r0 = r3.A00
            X.0iw r5 = r13.A00
            r4.setUrl(r0, r5)
            X.74T r2 = r15.A0D
            if (r2 == 0) goto L_0x017c
            X.4gb r7 = new X.4gb
            r7.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r3 = r14.A03
            r7.A0I(r3)
            int r1 = r4.getId()
            r0 = 6
            r7.A09(r1, r0)
            int r1 = r4.getId()
            r0 = 7
            r7.A09(r1, r0)
            X.7FU r0 = r15.A00
            boolean r0 = r0.CU2()
            int r8 = r4.getId()
            r9 = 6
            if (r0 == 0) goto L_0x00eb
            r9 = 7
        L_0x00eb:
            r11 = r9
            r12 = r10
            r7.A0E(r8, r9, r10, r11, r12)
            r7.A0G(r3)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.CharSequence r1 = r2.A09
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r3.append(r0)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r6)
            int r0 = r3.length()
            r7 = 17
            r3.setSpan(r1, r10, r0, r7)
            int r6 = r3.length()
            java.lang.CharSequence r8 = r2.A08
            if (r8 == 0) goto L_0x0131
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 32
            r1.append(r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r8)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.append(r0)
        L_0x0131:
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r10)
            int r0 = r3.length()
            r3.setSpan(r1, r6, r0, r7)
            X.0eM r6 = r14.A08
            java.lang.Object r0 = r6.getValue()
            X.OG3 r0 = (X.OG3) r0
            android.widget.TextView r0 = r0.A00
            r0.setText(r3)
            java.lang.Object r0 = r6.getValue()
            X.OG3 r0 = (X.OG3) r0
            android.widget.TextView r1 = r0.A00
            int r0 = r2.A00
            r1.setMaxLines(r0)
            com.instagram.common.typedurl.ImageUrl r3 = r2.A01
            if (r3 == 0) goto L_0x0177
            java.lang.Object r0 = r6.getValue()
            X.OG3 r0 = (X.OG3) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r0.A02
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r3)
            r0 = 0
            r2.A0F(r0, r5, r1)
            java.lang.Object r0 = r6.getValue()
            X.OG3 r0 = (X.OG3) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A02
            r0.A05()
        L_0x0177:
            X.3oV r0 = r14.A06
            r0.setVisibility(r10)
        L_0x017c:
            r4.setVisibility(r10)
        L_0x017f:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r14.A03
            r0.setVisibility(r10)
            X.9J6 r1 = r15.A06
            r2 = 0
            if (r1 == 0) goto L_0x01a8
            java.lang.String r0 = r1.A01
            java.lang.String r2 = r1.A00
        L_0x018d:
            android.widget.LinearLayout r1 = r14.A02
            r1.setContentDescription(r0)
            if (r2 == 0) goto L_0x01a2
            X.U7G r0 = new X.U7G
            r0.<init>(r2)
        L_0x0199:
            X.03v.A0B(r1, r0)
            X.7DZ r0 = r13.A01
            r0.A02(r14, r15)
            return
        L_0x01a2:
            X.02Z r0 = new X.02Z
            r0.<init>()
            goto L_0x0199
        L_0x01a8:
            r0 = r2
            goto L_0x018d
        L_0x01aa:
            r0 = -1
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        C72577PBi pBi = (C72577PBi) r2;
        0qQ.A0B(pBi, 0);
        pBi.A07.A04();
        this.A01.A01(pBi);
    }

    public LayeredXmaContentDefinition(AnonymousClass0iw r12, UserSession userSession, AnonymousClass7XR r14, AnonymousClass9HC r15, boolean z) {
        boolean z2 = r15.A1X;
        C3265877j r1 = new C3265877j(z2);
        AnonymousClass75W r4 = new AnonymousClass75W(r14);
        C3265977k r5 = new C3265977k(r14, r1.A00);
        AnonymousClass7DV r6 = new AnonymousClass7DV((AnonymousClass7XX) r14, z2);
        AnonymousClass7DX r3 = new AnonymousClass7DX((AnonymousClass7XN) r14);
        this.A01 = new AnonymousClass7DZ(0sr.A1P(new AnonymousClass7DY[]{new C3266077l(r3, r4, r5, r6, (C333107Xr) r14, r15, (C3266177m) null, false), r1}));
        this.A00 = r12;
        this.A03 = userSession;
        this.A02 = z;
    }
}

package com.instagram.video.live.mvvm.view.likes.customviews;

import X.0qQ;
import X.0sP;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.C306386Ly;
import X.C62174KbW;
import X.C62175KbX;
import X.C62876Knq;
import X.DbW;
import X.JTT;
import X.JZU;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MixedReactionsView extends FrameLayout implements AnonymousClass0iw {
    public 0sP A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context) {
        this(context, (AttributeSet) null, 0, 0, JZU.A00);
        0qQ.A0B(context, 1);
    }

    public final void setOnStickerUrlExpired(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.graphics.drawable.Drawable r10, com.instagram.common.typedurl.ImageUrl r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            X.L8a r5 = new X.L8a
            r5.<init>(r10, r11, r12, r13)
            java.lang.String r3 = r5.A01
            java.lang.String r6 = "AVATAR_REACTION_TYPE"
            boolean r0 = X.0qQ.A0K(r3, r6)
            android.content.Context r2 = r9.getContext()
            if (r0 == 0) goto L_0x00e4
            X.0qQ.A07(r2)
            r0 = 0
            X.KI2 r4 = new X.KI2
            r4.<init>(r2, r0)
        L_0x001c:
            int r0 = r9.getRight()
            float r1 = (float) r0
            int r0 = X.AnonymousClass7TG.A06(r2)
            float r0 = (float) r0
            float r1 = r1 - r0
            r4.setX(r1)
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 != 0) goto L_0x00df
            com.instagram.common.typedurl.ImageUrl r2 = r5.A02
            if (r2 == 0) goto L_0x003d
            r1 = 5
            X.WTN r0 = new X.WTN
            r0.<init>(r1, r9, r5)
            r4.A0E = r0
            r4.setUrl(r2, r9)
        L_0x003d:
            r9.addView(r4)
            boolean r0 = X.0qQ.A0K(r3, r6)
            if (r0 == 0) goto L_0x00cb
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
        L_0x004d:
            int r8 = r1.getDimensionPixelSize(r0)
        L_0x0051:
            boolean r1 = r9.A01
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r1 == 0) goto L_0x005f
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L_0x005f:
            float r0 = X.AnonymousClass7TE.A01(r2, r0)
            int r1 = r9.getRight()
            int r0 = (int) r0
            int r1 = r1 - r0
            int r1 = r1 - r8
            int r0 = X.JTP.A05(r2)
            int r0 = r1 - r0
            X.2HY r5 = new X.2HY
            r5.<init>(r0, r1)
            java.lang.String r0 = "EMOJI_REACTION_TYPE"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x00c9
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r6 = r2.getDimensionPixelSize(r0)
        L_0x0088:
            X.5nL r7 = X.JTP.A0b(r4)
            r2 = 4627448617123184640(0x4038000000000000, double:24.0)
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            X.2co r0 = X.C71392co.A04(r2, r0)
            X.5nL r3 = r7.A0E(r0)
            float r2 = (float) r8
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.A0R(r1, r2)
            r3.A0N(r1, r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.A0M(r0, r1)
            int r0 = r9.getBottom()
            float r1 = (float) r0
            float r1 = r1 - r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r0 = (float) r6
            float r2 = r2 + r0
            r3.A0T(r1, r2)
            X.2SQ r0 = X.2SP.A00
            int r0 = X.C229632nm.A04(r0, r5)
            float r0 = (float) r0
            r3.A0J(r0)
            X.PQY r0 = new X.PQY
            r0.<init>(r4, r9)
            r3.A06 = r0
            r3.A0H()
            return
        L_0x00c9:
            r6 = 0
            goto L_0x0088
        L_0x00cb:
            java.lang.String r0 = "EMOJI_REACTION_TYPE"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00dc
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            goto L_0x004d
        L_0x00dc:
            r8 = 0
            goto L_0x0051
        L_0x00df:
            r4.setImageDrawable(r0)
            goto L_0x003d
        L_0x00e4:
            X.0qQ.A07(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = new com.instagram.common.ui.widget.imageview.IgImageView
            r4.<init>(r2)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.view.likes.customviews.MixedReactionsView.A00(android.graphics.drawable.Drawable, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String):void");
    }

    public final void A01(C62876Knq knq) {
        if (this.A02) {
            if (knq instanceof C62174KbW) {
                Spannable spannable = C306386Ly.A0d;
                Context context = getContext();
                Resources resources = getResources();
                C306386Ly A0s = AnonymousClass7TE.A0s(context, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                A0s.A0M(((C62174KbW) knq).A02);
                A0s.A0A(AnonymousClass7TE.A01(resources, R.dimen.abc_dialog_padding_material));
                A00(A0s, (ImageUrl) null, "EMOJI_REACTION_TYPE", (String) null);
            }
            if (knq instanceof C62175KbX) {
                C62175KbX kbX = (C62175KbX) knq;
                A00(kbX.A00, kbX.A01, "AVATAR_REACTION_TYPE", kbX.A06);
            }
            invalidate();
        }
    }

    public String getModuleName() {
        return this.A03;
    }

    public final 0sP getOnStickerUrlExpired() {
        return this.A00;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-639177397);
        super.onAttachedToWindow();
        this.A02 = true;
        AnonymousClass0fD.A0D(-1709949400, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1992495762);
        super.onDetachedFromWindow();
        this.A02 = false;
        AnonymousClass0fD.A0D(1083793028, A06);
    }

    public final void setSelfView(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, JZU.A00);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet, int i, int i2, 0sP r6) {
        super(context, attributeSet, i, i2);
        DbW.A1N(context, 1, r6);
        this.A00 = r6;
        this.A03 = "IGLIVE_SELF_MIXED_REACTIONS_VIEW";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MixedReactionsView(Context context, AttributeSet attributeSet, int i, int i2, JZU jzu, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i3), (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? JZU.A00 : jzu);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, JZU.A00);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MixedReactionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, JZU.A00);
        0qQ.A0B(context, 1);
    }
}

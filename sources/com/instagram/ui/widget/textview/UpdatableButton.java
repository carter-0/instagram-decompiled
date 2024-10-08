package com.instagram.ui.widget.textview;

import X.0qQ;
import X.1QE;
import X.1QG;
import X.AnonymousClass05K;
import X.AnonymousClass3Z5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class UpdatableButton extends ImageWithTitleTextView implements AnonymousClass3Z5 {
    public static final int[] A03 = {R.attr.state_black};
    public static final int[] A04 = {R.attr.state_blue};
    public static final int[] A05 = {R.attr.state_disabled_blue, R.attr.state_blue};
    public static final int[] A06 = {R.attr.state_grey};
    public static final int[] A07 = {R.attr.state_transparent};
    public GradientDrawable A00;
    public Integer A01 = AnonymousClass05K.A01;
    public final 1QG A02 = 1QE.A0E();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableButton(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setPrismBackground(int[] r8) {
        /*
            r7 = this;
            X.1QG r3 = r7.A02
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0071
            android.graphics.drawable.GradientDrawable r0 = r7.A00
            if (r0 != 0) goto L_0x0011
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r7.A00 = r0
        L_0x0011:
            java.lang.Integer r2 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r2 != r0) goto L_0x0083
            android.content.Context r5 = r7.getContext()
            X.0qQ.A07(r5)
            r0 = 0
            android.content.res.ColorStateList r2 = X.1QE.A0B(r5, r0)
        L_0x0023:
            android.graphics.drawable.GradientDrawable r1 = r7.A00
            if (r1 == 0) goto L_0x00a7
            int r0 = r2.getDefaultColor()
            int r0 = r2.getColorForState(r8, r0)
            r1.setColor(r0)
            android.content.res.Resources r6 = r7.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r6.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r1.setCornerRadius(r0)
            X.1QG r4 = X.1QG.A04
            r0 = 0
            if (r3 != r4) goto L_0x0047
            r0 = 1
        L_0x0047:
            r3 = 0
            r1 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.Integer r2 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r2 != r0) goto L_0x0072
            X.0qQ.A07(r5)
            X.1QG r0 = X.1QE.A0E()
            if (r0 != r4) goto L_0x0061
            r0 = 2131100458(0x7f06032a, float:1.7813298E38)
        L_0x005d:
            android.content.res.ColorStateList r1 = X.02K.A02(r5, r0)
        L_0x0061:
            if (r1 == 0) goto L_0x006a
            r0 = 2131165257(0x7f070049, float:1.7944726E38)
            int r3 = r6.getDimensionPixelSize(r0)
        L_0x006a:
            android.graphics.drawable.GradientDrawable r0 = r7.A00
            if (r0 == 0) goto L_0x009f
            r0.setStroke(r3, r1)
        L_0x0071:
            return
        L_0x0072:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r2 != r0) goto L_0x006a
            X.0qQ.A07(r5)
            X.1QG r0 = X.1QE.A0E()
            if (r0 != r4) goto L_0x0061
            r0 = 2131100456(0x7f060328, float:1.7813294E38)
            goto L_0x005d
        L_0x0083:
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            r0 = 0
            if (r2 != r1) goto L_0x0089
            r0 = 1
        L_0x0089:
            android.content.Context r5 = r7.getContext()
            if (r0 == 0) goto L_0x0097
            X.0qQ.A07(r5)
            android.content.res.ColorStateList r2 = X.1QE.A0A(r5)
            goto L_0x0023
        L_0x0097:
            X.0qQ.A07(r5)
            android.content.res.ColorStateList r2 = X.1QE.A09(r5)
            goto L_0x0023
        L_0x009f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00a7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.textview.UpdatableButton.setPrismBackground(int[]):void");
    }

    public final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        Integer num = this.A01;
        if (num == null) {
            num = AnonymousClass05K.A01;
        }
        switch (num.intValue()) {
            case 0:
                iArr = A04;
                break;
            case 2:
                iArr = A05;
                break;
            case 3:
                iArr = A07;
                break;
            case 4:
                iArr = A03;
                break;
            case 5:
            case 6:
            case 7:
                0qQ.A0A(onCreateDrawableState);
                setPrismBackground(onCreateDrawableState);
                break;
            default:
                iArr = A06;
                break;
        }
        View.mergeDrawableStates(onCreateDrawableState, iArr);
        0qQ.A0A(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public final void setIsBlack(boolean z) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A01 = num;
    }

    public final void setIsBlueButton(boolean z) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A01 = num;
    }

    public final void setIsDisabled(boolean z) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A01 = num;
    }

    public final void setIsTransparent(boolean z) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A01 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

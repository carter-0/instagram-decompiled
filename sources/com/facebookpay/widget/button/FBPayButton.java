package com.facebookpay.widget.button;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11409SSh;
import X.C18674VwX;
import X.C51972G9s;
import X.C71382cm;
import X.C8923RFr;
import X.C9658Rec;
import X.Pxh;
import X.SPB;
import X.SRn;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FBPayButton extends Button {
    public C8923RFr A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, C8923RFr.A08);
        0qQ.A0B(context, 1);
    }

    public final void setButtonStyle(C8923RFr rFr) {
        0qQ.A0B(rFr, 0);
        this.A00 = rFr;
        C9658Rec.A00(this, rFr.A04);
        C8923RFr rFr2 = this.A00;
        0qQ.A0B(rFr2, 1);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass2E0.A0A().A02(rFr2.A04), C71382cm.A0d);
        0qQ.A07(obtainStyledAttributes);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        AnonymousClass2E0.A0A();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            SPB A0A = AnonymousClass2E0.A0A();
            int i = rFr2.A00;
            drawable.setTint(A0A.A03(context, i));
            stateListDrawable.addState(iArr, drawable);
            int[] iArr2 = {16842919};
            AnonymousClass2E0.A0A();
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                SPB A0A2 = AnonymousClass2E0.A0A();
                int i2 = rFr2.A03;
                drawable2.setTint(A0A2.A03(context, i2));
                stateListDrawable.addState(iArr2, drawable2);
                int[] iArr3 = {-16842919};
                AnonymousClass2E0.A0A();
                Drawable drawable3 = obtainStyledAttributes.getDrawable(1);
                if (drawable3 != null) {
                    drawable3.setTint(SPB.A00(context, i));
                    stateListDrawable.addState(iArr3, drawable3);
                    int[] iArr4 = {16842908};
                    AnonymousClass2E0.A0A();
                    Drawable drawable4 = obtainStyledAttributes.getDrawable(1);
                    if (drawable4 != null) {
                        drawable4.setTint(SPB.A00(context, i2));
                        stateListDrawable.addState(iArr4, drawable4);
                        int[] iArr5 = {-16842908};
                        AnonymousClass2E0.A0A();
                        Drawable drawable5 = obtainStyledAttributes.getDrawable(1);
                        if (drawable5 != null) {
                            drawable5.setTint(SPB.A00(context, i));
                            stateListDrawable.addState(iArr5, drawable5);
                            setBackground(stateListDrawable);
                            obtainStyledAttributes.recycle();
                            SRn.A02(this, this.A00.A05);
                            C8923RFr rFr3 = this.A00;
                            int i3 = rFr3.A02;
                            int i4 = rFr3.A01;
                            int[][] iArr6 = {Pxh.A1Y(16842910), Pxh.A1Y(-16842910)};
                            SPB A0A3 = AnonymousClass2E0.A0A();
                            0qQ.A07(context);
                            setTextColor(new ColorStateList(iArr6, new int[]{A0A3.A03(context, i3), SPB.A00(context, i4)}));
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet, int i, C8923RFr rFr) {
        super(context, attributeSet, i);
        C51972G9s.A1B(context, rFr);
        this.A00 = rFr;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C18674VwX.A01(this, AnonymousClass05K.A01, (String) null);
        C11409SSh.A04(this, this.A00.A04, false);
        setButtonStyle(this.A00);
        setFocusable(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FBPayButton(Context context, AttributeSet attributeSet, int i, C8923RFr rFr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, (i2 & 8) != 0 ? C8923RFr.A08 : rFr);
    }
}

package com.instagram.user.follow;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C71382cm;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.instagram.ui.widget.textview.UpdatableButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InviteButton extends UpdatableButton {
    public static final Typeface A00;
    public static final Typeface A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0p, i, 0);
        0qQ.A07(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setIsBlueButton(true);
    }

    static {
        Typeface create = Typeface.create("sans-serif", 0);
        0qQ.A07(create);
        A01 = create;
        Typeface create2 = Typeface.create("sans-serif-medium", 0);
        0qQ.A07(create2);
        A00 = create2;
    }

    public void setEnabled(boolean z) {
        Typeface typeface;
        super.setEnabled(z);
        if (z) {
            typeface = A00;
        } else {
            typeface = A01;
        }
        setTypeface(typeface);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ InviteButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, JTT.A01(i2, i));
    }
}

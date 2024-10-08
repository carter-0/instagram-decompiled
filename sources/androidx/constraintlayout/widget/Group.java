package androidx.constraintlayout.widget;

import X.2d3;
import X.AnonymousClass0fD;
import X.C252043oT;
import X.C71492dQ;
import android.content.Context;
import android.util.AttributeSet;

public class Group extends C252043oT {
    public final void A09(ConstraintLayout constraintLayout) {
        2d3 r1 = ((C71492dQ) getLayoutParams()).A0x;
        r1.A0I(0);
        r1.A0H(0);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1816887170);
        super.onAttachedToWindow();
        A05();
        AnonymousClass0fD.A0D(1579384541, A06);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A05();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A05();
    }

    public Group(Context context) {
        super(context);
    }

    public final void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
    }

    public final void A08(ConstraintLayout constraintLayout) {
        A0A(constraintLayout);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

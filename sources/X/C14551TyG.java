package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.TyG  reason: case insensitive filesystem */
public final class C14551TyG extends FrameLayout {
    public ViewGroup A00;
    public C14558TyN A01;
    public C46626Di6 A02;

    public final void setMode(C46626Di6 di6) {
        0qQ.A0B(di6, 0);
        this.A02 = di6;
    }

    public final C14558TyN getContentPager() {
        C14558TyN tyN = this.A01;
        if (tyN != null) {
            return tyN;
        }
        0qQ.A0F("contentPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup getHeaderContainer() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("headerContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C46626Di6 getMode() {
        return this.A02;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContentPager().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        getHeaderContainer().measure(C13988Tno.A04(View.MeasureSpec.getSize(getMeasuredWidth())), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), AnonymousClass972.MUTABLE_FLAG_MASK));
        getHeaderContainer().layout(0, 0, getHeaderContainer().getMeasuredWidth(), getHeaderContainer().getMeasuredHeight());
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = SN3.MAX_SIGNED_POWER_OF_TWO;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.A02.A01) {
            i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        getContentPager().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i3));
        setMeasuredDimension(getContentPager().getMeasuredWidth(), getContentPager().getMeasuredHeight());
    }
}

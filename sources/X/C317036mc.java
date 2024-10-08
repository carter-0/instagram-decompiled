package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6mc  reason: invalid class name and case insensitive filesystem */
public final class C317036mc {
    public final View A00;
    public final C294975nL A01;

    public C317036mc(C71662eb r4) {
        View requireViewById = r4.A01().requireViewById(R.id.polaroid_sticker_cta_container);
        0qQ.A07(requireViewById);
        this.A00 = requireViewById;
        C294975nL A012 = C294975nL.A01(requireViewById, 1);
        0qQ.A07(A012);
        this.A01 = A012;
        ((TextView) requireViewById.requireViewById(R.id.polaroid_sticker_cta_text)).setText(requireViewById.getContext().getString(2131969533));
    }

    public final void A00(boolean z) {
        if (!z) {
            this.A00.setVisibility(8);
            return;
        }
        C294975nL r3 = this.A01;
        r3.A0G();
        if (r3 instanceof C315596kB) {
            throw new UnsupportedOperationException("SpringViewAnimator does not support interpolator config");
        }
        C294985nM r32 = (C294985nM) r3;
        r32.A01.setStartDelay(300);
        C294975nL A0C = r32.A0C(1400);
        A0C.A0I(0.0f);
        A0C.A05 = new Ag4(this);
        A0C.A0H();
    }
}

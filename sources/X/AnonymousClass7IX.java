package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.7IX  reason: invalid class name */
public final class AnonymousClass7IX {
    public final /* synthetic */ AnonymousClass7TI A00;
    public final /* synthetic */ AnonymousClass9H7 A01;

    public AnonymousClass7IX(AnonymousClass7TI r1, AnonymousClass9H7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(int i, int i2, int i3, boolean z) {
        View view;
        AnonymousClass9H7 r1 = this.A01;
        if (r1.A0F != null) {
            AnonymousClass7TI r3 = this.A00;
            if (r3.A0U.isAdded()) {
                ADC adc = r1.A0Z;
                if (!(AnonymousClass9H7.A01(r1).A00 == i || r1.A0I != AnonymousClass7GM.PERMISSIONS_THREAD || adc == null || (view = adc.A00) == null)) {
                    0nA.A0X(view, i - view.getContext().getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
                }
                r3.A0T(i, i2, i3, z);
                return;
            }
        }
        r1.A0c = Integer.valueOf(i);
    }
}

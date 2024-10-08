package X;

import android.widget.NumberPicker;

public final class LZK implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final Object A01;

    public LZK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        if (this.A00 != 0) {
            AnonymousClass0eM r2 = ((K4R) this.A01).A04;
            ((C60251Ji8) r2.getValue()).A01(i2 + 1);
            ((C60251Ji8) r2.getValue()).A00();
            return;
        }
        AnonymousClass9Y9 r0 = ((K46) this.A01).A02;
        if (r0 == null) {
            0qQ.A0F("musicOverlayDurationViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else {
            JTP.A19(r0.A00, i2);
        }
    }
}

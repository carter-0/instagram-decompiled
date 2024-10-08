package X;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

public abstract class V4P {
    public final void A00(int i) {
        if (this instanceof UWQ) {
            UWQ uwq = (UWQ) this;
            Typeface typeface = uwq.A01;
            if (!uwq.A00) {
                uwq.A02.ABo(typeface);
            }
        } else if (this instanceof UWR) {
            ((UWR) this).A02.A00(i);
        } else if (this instanceof UWP) {
            C18007Vjj vjj = ((UWP) this).A00;
            vjj.A02 = true;
            C20973X7d x7d = (C20973X7d) vjj.A01.get();
            if (x7d != null) {
                x7d.Dr7();
            }
        }
    }

    public final void A01(Typeface typeface, boolean z) {
        CharSequence text;
        if (this instanceof UWR) {
            UWR uwr = (UWR) this;
            uwr.A01.A06(typeface, uwr.A00);
            uwr.A02.A01(typeface, z);
        } else if (this instanceof UWQ) {
            UWQ uwq = (UWQ) this;
            if (!uwq.A00) {
                uwq.A02.ABo(typeface);
            }
        } else if (this instanceof UWP) {
            UWP uwp = (UWP) this;
            if (!z) {
                C18007Vjj vjj = uwp.A00;
                vjj.A02 = true;
                C20973X7d x7d = (C20973X7d) vjj.A01.get();
                if (x7d != null) {
                    x7d.Dr7();
                }
            }
        } else {
            Chip chip = ((UWO) this).A00;
            UWU uwu = chip.A04;
            if (uwu.A0g) {
                text = uwu.A0Z;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }
    }
}

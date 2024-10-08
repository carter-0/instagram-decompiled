package X;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.U7q  reason: case insensitive filesystem */
public final class C14759U7q extends C271074hr {
    public final Reference A00;

    public final void A00() {
        SwitchCompat switchCompat = (SwitchCompat) this.A00.get();
        if (switchCompat != null) {
            switchCompat.A04();
        }
    }

    public final void A01(Throwable th) {
        SwitchCompat switchCompat = (SwitchCompat) this.A00.get();
        if (switchCompat != null) {
            switchCompat.A04();
        }
    }

    public C14759U7q(SwitchCompat switchCompat) {
        this.A00 = new WeakReference(switchCompat);
    }
}

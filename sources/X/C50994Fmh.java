package X;

import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.Fmh  reason: case insensitive filesystem */
public final class C50994Fmh implements G86 {
    public final /* synthetic */ E3L A00;

    public final void Cvy() {
    }

    public final boolean DBR(int i) {
        boolean z = false;
        if (i == 2) {
            z = true;
            E3L e3l = this.A00;
            ProgressButton progressButton = e3l.A01;
            if (progressButton == null) {
                0qQ.A0F("nextButton");
                throw AnonymousClass00P.createAndThrow();
            } else if (progressButton.isEnabled()) {
                E3L.A00(e3l);
            }
        }
        return z;
    }

    public final void DWw() {
    }

    public final void DvR() {
    }

    public final void Dws() {
    }

    public C50994Fmh(E3L e3l) {
        this.A00 = e3l;
    }
}

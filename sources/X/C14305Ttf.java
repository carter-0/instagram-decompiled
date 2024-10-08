package X;

import android.graphics.Typeface;

/* renamed from: X.Ttf  reason: case insensitive filesystem */
public final class C14305Ttf implements X33 {
    public final /* synthetic */ C14129TqO A00;

    public C14305Ttf(C14129TqO tqO) {
        this.A00 = tqO;
    }

    public final void ABo(Typeface typeface) {
        C14129TqO tqO = this.A00;
        UWQ uwq = tqO.A0e;
        if (uwq != null) {
            uwq.A00 = true;
        }
        if (tqO.A0b != typeface) {
            tqO.A0b = typeface;
            tqO.A0G(false);
        }
    }
}

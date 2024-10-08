package X;

import android.graphics.Typeface;

/* renamed from: X.Ttg  reason: case insensitive filesystem */
public final class C14306Ttg implements X33 {
    public final /* synthetic */ C14129TqO A00;

    public C14306Ttg(C14129TqO tqO) {
        this.A00 = tqO;
    }

    public final void ABo(Typeface typeface) {
        C14129TqO tqO = this.A00;
        UWQ uwq = tqO.A0d;
        if (uwq != null) {
            uwq.A00 = true;
        }
        if (tqO.A0a != typeface) {
            tqO.A0a = typeface;
            tqO.A0G(false);
        }
    }
}

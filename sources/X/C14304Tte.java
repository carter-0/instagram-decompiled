package X;

import android.graphics.Typeface;

/* renamed from: X.Tte  reason: case insensitive filesystem */
public final class C14304Tte extends AnonymousClass3U1 {
    public final /* synthetic */ W0Q A00;
    public final /* synthetic */ V4P A01;

    public C14304Tte(W0Q w0q, V4P v4p) {
        this.A00 = w0q;
        this.A01 = v4p;
    }

    public final void A01(int i) {
        this.A00.A02 = true;
        this.A01.A00(i);
    }

    public final void A02(Typeface typeface) {
        W0Q w0q = this.A00;
        Typeface create = Typeface.create(typeface, w0q.A07);
        w0q.A01 = create;
        w0q.A02 = true;
        this.A01.A01(create, false);
    }
}

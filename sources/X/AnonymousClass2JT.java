package X;

import android.content.Context;

/* renamed from: X.2JT  reason: invalid class name */
public final class AnonymousClass2JT implements AnonymousClass2JP {
    public final AnonymousClass2JL A00;

    public AnonymousClass2JT(AnonymousClass2JL r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object FP1() {
        C70102Jm r1;
        Context context = this.A00.A00;
        synchronized (C70102Jm.class) {
            r1 = C70102Jm.A08;
            if (r1 == null) {
                r1 = new C70102Jm(context, C70112Jn.A02);
                C70102Jm.A08 = r1;
            }
        }
        return r1;
    }
}

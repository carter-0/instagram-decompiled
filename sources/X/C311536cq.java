package X;

import android.content.Context;

/* renamed from: X.6cq  reason: invalid class name and case insensitive filesystem */
public final class C311536cq implements C233292vT {
    public C18625VvI A00;
    public final C309856Zw A01;

    public C311536cq(Context context, C309856Zw r4) {
        0qQ.A0B(r4, 2);
        this.A01 = r4;
        if (0tS.A4E.A01(context).A0T()) {
            this.A00 = new C18625VvI(context, this, new C309996aG());
        }
    }

    public final void FHG(boolean z) {
        C309856Zw r0 = this.A01;
        if (z) {
            r0.D7v();
        } else {
            r0.D7u();
        }
    }
}

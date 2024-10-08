package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Vfc  reason: case insensitive filesystem */
public final class C17765Vfc {
    public final /* synthetic */ U1L A00;

    public final void A00(Drawable drawable, C16491Uvm uvm) {
        C226492gu r4;
        U1L u1l = this.A00;
        if (u1l.A02 != uvm || u1l.A01 != null) {
            return;
        }
        if (drawable == null) {
            u1l.A07 = true;
            return;
        }
        u1l.A01 = drawable;
        drawable.setCallback(u1l);
        u1l.A05 = true;
        if (u1l.A06) {
            u1l.A06 = false;
            U1L.A01(u1l);
            if ((drawable instanceof C226492gu) && (r4 = (C226492gu) drawable) != null) {
                r4.E2p();
            }
            u1l.invalidateSelf();
        }
    }

    public C17765Vfc(U1L u1l) {
        this.A00 = u1l;
    }
}

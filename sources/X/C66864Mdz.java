package X;

import android.view.View;

/* renamed from: X.Mdz  reason: case insensitive filesystem */
public final class C66864Mdz implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass7E5 A00;
    public final /* synthetic */ C66869Me5 A01;

    public C66864Mdz(AnonymousClass7E5 r1, C66869Me5 me5) {
        this.A01 = me5;
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C332807Wl r2 = this.A01.A0B;
        if (r2 == null) {
            return true;
        }
        AnonymousClass7E5 r0 = this.A00;
        r2.DBq(r0.A09, r0.A0D);
        return true;
    }
}

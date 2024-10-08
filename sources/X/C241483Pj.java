package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Pj  reason: invalid class name and case insensitive filesystem */
public final class C241483Pj extends C249403jg {
    public final C241493Pk A00;

    public C241483Pj(String str) {
        this.A00 = new C241493Pk(str, false);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(-916300652);
        int i2 = 0;
        0qQ.A0B(recyclerView, 0);
        C241493Pk r1 = this.A00;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = -1;
            }
        }
        r1.A00(recyclerView, i2);
        AnonymousClass0fD.A0A(1271717179, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(-830327913);
        C241493Pk r2 = this.A00;
        if (r2.A01) {
            if (i2 != 0) {
                r2.A00 += (float) Math.abs(i2);
            } else if (i != 0) {
                r2.A00 += (float) Math.abs(i);
                r2.A02 = false;
            }
        }
        AnonymousClass0fD.A0A(-511816006, A03);
    }
}

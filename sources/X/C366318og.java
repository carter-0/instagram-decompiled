package X;

import android.view.View;

/* renamed from: X.8og  reason: invalid class name and case insensitive filesystem */
public final class C366318og extends C232922uf {
    public final /* synthetic */ C366308of A00;

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        int i = (((float) r5.A09.A00) > 0.0f ? 1 : (((float) r5.A09.A00) == 0.0f ? 0 : -1));
        C366308of r0 = this.A00;
        if (i == 0) {
            ((View) r0.A0E.getValue()).setVisibility(8);
            return;
        }
        AnonymousClass871 r02 = r0.A01;
        if (r02 != null) {
            r02.Ciw();
        }
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        this.A00.FL7((float) r5.A09.A00);
    }

    public C366318og(C366308of r1) {
        this.A00 = r1;
    }
}

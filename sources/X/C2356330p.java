package X;

import android.view.View;

/* renamed from: X.30p  reason: invalid class name and case insensitive filesystem */
public final class C2356330p implements C2356430q {
    public final View A00;
    public final C62320sa A01;
    public final C62320sa A02;

    public final void DSB() {
        if (this.A00 != null) {
            this.A01.invoke();
        } else {
            0wb.A03("ModalListener#MainFeedFragment", "Modal fragment closed while view does not exist");
        }
    }

    public final void DSC() {
        this.A02.invoke();
    }

    public C2356330p(View view, C62320sa r2, C62320sa r3) {
        this.A00 = view;
        this.A02 = r2;
        this.A01 = r3;
    }
}

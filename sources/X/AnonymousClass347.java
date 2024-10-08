package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.347  reason: invalid class name */
public final class AnonymousClass347 extends AnonymousClass1GX {
    public final Fragment A00;
    public final AnonymousClass343 A01;

    public AnonymousClass347(Fragment fragment, AnonymousClass343 r2) {
        this.A00 = fragment;
        this.A01 = r2;
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = AnonymousClass0fD.A03(-458264169);
        if (!this.A00.isResumed()) {
            i6 = 1527268208;
        } else {
            this.A01.A01();
            i6 = -1812962827;
        }
        AnonymousClass0fD.A0A(i6, A03);
    }
}

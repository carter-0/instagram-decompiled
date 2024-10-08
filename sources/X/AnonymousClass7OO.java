package X;

import android.view.View;

/* renamed from: X.7OO  reason: invalid class name */
public final class AnonymousClass7OO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass7U1 A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass7OO(View view, View view2, AnonymousClass7U1 r3, int i, boolean z) {
        this.A03 = r3;
        this.A04 = z;
        this.A00 = i;
        this.A02 = view;
        this.A01 = view2;
    }

    public final void run() {
        boolean z = this.A04;
        int i = this.A00;
        View view = this.A02;
        AnonymousClass4DH r0 = this.A03.A07;
        AnonymousClass7U1.A00(r0.requireActivity(), r0.requireContext(), view, i, z);
        0nA.A0r(this.A01, this);
    }
}

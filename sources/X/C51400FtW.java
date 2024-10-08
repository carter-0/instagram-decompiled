package X;

import android.view.View;

/* renamed from: X.FtW  reason: case insensitive filesystem */
public final class C51400FtW implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ E2Z A01;

    public C51400FtW(View view, E2Z e2z) {
        this.A01 = e2z;
        this.A00 = view;
    }

    public final void run() {
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(this.A01.requireActivity(), 2131969959);
        A0e.A03(this.A00);
        A0e.A0F = true;
        A0e.A06(C226262fy.CENTER_OF_ANCHOR);
        A0e.A0B = false;
        A0e.A0A = true;
        DbU.A1T(A0e);
    }
}

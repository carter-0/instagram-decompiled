package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Woh  reason: case insensitive filesystem */
public final class C20292Woh implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ U5O A01;
    public final /* synthetic */ 1Av A02;

    public C20292Woh(FragmentActivity fragmentActivity, U5O u5o, 1Av r3) {
        this.A00 = fragmentActivity;
        this.A01 = u5o;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131970578);
        A0V.A03(this.A01);
        A0V.A0B = true;
        A0V.A02();
        DbU.A1T(A0V);
        1Av r3 = this.A02;
        AnonymousClass7TF.A1J(r3, r3.A40, 1Av.A8a, 113, true);
    }
}

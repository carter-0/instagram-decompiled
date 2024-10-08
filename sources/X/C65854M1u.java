package X;

/* renamed from: X.M1u  reason: case insensitive filesystem */
public final /* synthetic */ class C65854M1u implements Runnable {
    public final /* synthetic */ KB1 A00;

    public /* synthetic */ C65854M1u(KB1 kb1) {
        this.A00 = kb1;
    }

    public final void run() {
        KB1 kb1 = this.A00;
        0hq r1 = kb1.A0R.mFragmentManager;
        if (kb1.A0B && r1 != null) {
            SQH.A01(r1);
        }
        kb1.A0B = false;
    }
}

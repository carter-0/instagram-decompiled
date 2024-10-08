package X;

/* renamed from: X.9Vj  reason: invalid class name and case insensitive filesystem */
public final class C379809Vj extends C360678ey {
    public final C360658ew A00;
    public final 1Ef A01;
    public final 1vn A02;

    public C379809Vj(1Ef r2, C360658ew r3, 1vn r4) {
        0qQ.A0B(r4, 2);
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = r3;
    }

    public final int getRunnableId() {
        return -6;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public final String getName() {
        String callName = this.A01.getCallName();
        0qQ.A07(callName);
        return callName;
    }

    public final void run() {
        this.A02.A06(this.A01, new C385479j0(this, 1));
    }
}

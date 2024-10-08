package X;

import java.util.concurrent.Executor;

public final class Q3C implements AnonymousClass11X {
    public final Q3F A00;
    public final 1Ef A01;
    public final 1vn A02;
    public final Executor A03;

    public Q3C(1Ef r2, Q3F q3f, 1vn r4, Executor executor) {
        0qQ.A0B(r4, 2);
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = executor;
        this.A00 = q3f;
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
        String friendlyName = this.A01.getFriendlyName();
        0qQ.A07(friendlyName);
        return friendlyName;
    }

    public final void run() {
        1vn r4 = this.A02;
        1Ef r3 = this.A01;
        r4.ATM(new C12090Smk((Object) this, 2), new C12093Smn(this, 1), r3, this.A03);
    }
}

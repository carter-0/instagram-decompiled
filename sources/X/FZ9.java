package X;

import java.util.concurrent.Executor;

public class FZ9 implements AnonymousClass11X {
    public 2IR A00;
    public final 1Ef A01;
    public final 1vn A02;
    public final Executor A03;

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public void onStart() {
    }

    public final String getName() {
        String callName = this.A01.getCallName();
        0qQ.A07(callName);
        return callName;
    }

    public final int getRunnableId() {
        return -2;
    }

    public final void run() {
        2IR r5 = this.A00;
        if (r5 != null) {
            1vn r4 = this.A02;
            1Ef r3 = this.A01;
            r4.ATM(new FS6((Object) r5, 7), new FSC(r5, 11), r3, this.A03);
        }
    }

    public FZ9(1Ef r1, 2IR r2, 1vn r3, Executor executor) {
        AnonymousClass7TG.A1O(r3, r1);
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = executor;
    }
}

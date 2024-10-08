package X;

import java.util.List;

/* renamed from: X.39w  reason: invalid class name and case insensitive filesystem */
public abstract class C2379439w implements Runnable {
    public final C2379539x A00 = new Object();

    public abstract List A00();

    public final void run() {
        try {
            this.A00.A07(A00());
        } catch (Throwable th) {
            this.A00.A08(th);
        }
    }
}

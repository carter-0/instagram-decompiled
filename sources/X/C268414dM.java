package X;

import java.util.concurrent.Callable;

/* renamed from: X.4dM  reason: invalid class name and case insensitive filesystem */
public final class C268414dM extends 1GK {
    public final /* synthetic */ Callable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C268414dM(Callable callable, int i) {
        super(i);
        this.A00 = callable;
    }

    public final void run() {
        try {
            A0A(this.A00.call());
        } catch (Exception e) {
            if (!(e instanceof RuntimeException)) {
                A09(e);
                return;
            }
            throw e;
        }
    }

    public final String toString() {
        return this.A00.toString();
    }
}

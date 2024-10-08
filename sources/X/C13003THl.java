package X;

import java.util.Set;

/* renamed from: X.THl  reason: case insensitive filesystem */
public final class C13003THl implements Runnable {
    public final /* synthetic */ Exception A00;
    public final /* synthetic */ Set A01;

    public C13003THl(Exception exc, Set set) {
        this.A01 = set;
        this.A00 = exc;
    }

    public final void run() {
        for (C13567Tcn handleException : this.A01) {
            handleException.handleException(this.A00);
        }
    }
}

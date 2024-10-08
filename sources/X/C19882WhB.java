package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.WhB  reason: case insensitive filesystem */
public final class C19882WhB implements Runnable {
    public Handler A00;
    public 02R A01;
    public Callable A02;

    public final void run() {
        Object obj;
        try {
            obj = this.A02.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.A00.post(new C20266WoH(this, this.A01, obj));
    }
}

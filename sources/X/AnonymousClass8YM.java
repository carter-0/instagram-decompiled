package X;

import java.util.Set;

/* renamed from: X.8YM  reason: invalid class name */
public final class AnonymousClass8YM implements Runnable {
    public final /* synthetic */ C3494680m A00;
    public final /* synthetic */ Object A01;

    public AnonymousClass8YM(C3494680m r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void run() {
        Set<C3495480u> set = this.A00.A01;
        Object obj = this.A01;
        synchronized (set) {
            for (C3495480u onChanged : set) {
                onChanged.onChanged(obj);
            }
        }
    }
}

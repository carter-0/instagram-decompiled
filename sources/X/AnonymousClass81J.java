package X;

import java.util.Set;

/* renamed from: X.81J  reason: invalid class name */
public final class AnonymousClass81J implements Runnable {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ Set A01;

    public AnonymousClass81J(Object obj, Set set) {
        this.A01 = set;
        this.A00 = obj;
    }

    public final void run() {
        Set<C3495480u> set = this.A01;
        Object obj = this.A00;
        for (C3495480u onChanged : set) {
            onChanged.onChanged(obj);
        }
    }
}

package X;

import java.util.List;

/* renamed from: X.7zB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C348887zB implements Runnable {
    public final /* synthetic */ C340837lu A00;

    public /* synthetic */ C348887zB(C340837lu r1) {
        this.A00 = r1;
    }

    public final void run() {
        List list = this.A00.A0N.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass8FP) list.get(i)).DZE();
        }
    }
}

package X;

import java.util.List;

/* renamed from: X.9Te  reason: invalid class name and case insensitive filesystem */
public final class C379269Te implements Runnable {
    public final /* synthetic */ C378949Rv A00;
    public final /* synthetic */ List A01;

    public C379269Te(C378949Rv r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass8FP) list.get(i)).DZE();
        }
    }
}

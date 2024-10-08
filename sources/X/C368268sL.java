package X;

import java.util.List;

/* renamed from: X.8sL  reason: invalid class name and case insensitive filesystem */
public final class C368268sL implements Runnable {
    public final /* synthetic */ C378949Rv A00;
    public final /* synthetic */ List A01;

    public C368268sL(C378949Rv r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C340347l7) list.get(i)).DZF();
        }
    }
}

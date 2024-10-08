package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VjQ  reason: case insensitive filesystem */
public final class C17988VjQ {
    public int A00;
    public int A01;
    public int A02;
    public List A03 = new ArrayList();

    public final synchronized void A00() {
        0JA.A09(AnonymousClass7TF.A1Q(this.A01), "There are allocated frame buffers unaccounted for, we're leaking!");
        List<C369008tg> list = this.A03;
        for (C369008tg A012 : list) {
            A012.A01();
        }
        list.clear();
        this.A00 = 0;
        this.A02 = 0;
    }

    public final synchronized void A01(C369008tg r3) {
        if (r3 != null) {
            List list = this.A03;
            if (!list.contains(r3)) {
                list.add(r3);
                this.A01--;
            }
        }
    }
}

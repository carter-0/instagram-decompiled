package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1O9  reason: invalid class name */
public final class AnonymousClass1O9 {
    public boolean A00;
    public final List A01 = new ArrayList();

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            List list = this.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) list.get(i)).run();
            }
        }
    }
}

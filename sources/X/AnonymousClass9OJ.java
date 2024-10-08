package X;

import java.util.List;

/* renamed from: X.9OJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9OJ implements Runnable {
    public final /* synthetic */ List A00;

    public /* synthetic */ AnonymousClass9OJ(List list) {
        this.A00 = list;
    }

    public final void run() {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C295015nP) list.get(i)).A04();
        }
    }
}

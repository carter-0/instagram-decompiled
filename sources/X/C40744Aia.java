package X;

import java.util.List;

/* renamed from: X.Aia  reason: case insensitive filesystem */
public final /* synthetic */ class C40744Aia implements Runnable {
    public final /* synthetic */ C340837lu A00;

    public /* synthetic */ C40744Aia(C340837lu r1) {
        this.A00 = r1;
    }

    public final void run() {
        List list = this.A00.A0O.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C340347l7) list.get(i)).DZF();
        }
    }
}

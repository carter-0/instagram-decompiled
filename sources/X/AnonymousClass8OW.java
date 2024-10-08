package X;

import java.util.Queue;

/* renamed from: X.8OW  reason: invalid class name */
public final class AnonymousClass8OW implements Runnable {
    public final /* synthetic */ AnonymousClass80W A00;
    public final /* synthetic */ Object A01;

    public AnonymousClass8OW(AnonymousClass80W r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void run() {
        AnonymousClass80W r2 = this.A00;
        if (r2.A01) {
            r2.A06.add(this.A01);
            return;
        }
        Object obj = this.A01;
        while (true) {
            AnonymousClass80W.A00(r2, obj);
            Queue queue = r2.A06;
            if (!queue.isEmpty()) {
                obj = queue.remove();
            } else {
                return;
            }
        }
    }
}

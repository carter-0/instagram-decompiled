package X;

import java.util.Queue;

public final class Y2N implements Runnable {
    public final /* synthetic */ C21468Xc0 A00;
    public final /* synthetic */ C296505qA A01;

    public Y2N(C21468Xc0 xc0, C296505qA r2) {
        this.A00 = xc0;
        this.A01 = r2;
    }

    public final void run() {
        C21468Xc0 xc0 = this.A00;
        Queue queue = xc0.A08;
        boolean isEmpty = queue.isEmpty();
        C296505qA r0 = this.A01;
        queue.add(r0);
        xc0.A01 = r0;
        if (isEmpty) {
            xc0.A07.clear();
            C296575qI r02 = new C296575qI(xc0.A03);
            r02.A01();
            xc0.A00 = r02;
            xc0.A02.postDelayed(new C22372Y1a(xc0), xc0.A04.A00);
        }
    }
}

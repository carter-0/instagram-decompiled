package X;

import java.util.Queue;

/* renamed from: X.Y1a  reason: case insensitive filesystem */
public final class C22372Y1a implements Runnable {
    public final /* synthetic */ C21468Xc0 A00;

    public C22372Y1a(C21468Xc0 xc0) {
        this.A00 = xc0;
    }

    public final void run() {
        Queue queue;
        C21468Xc0 xc0 = this.A00;
        C296575qI r8 = xc0.A00;
        if (r8 == null) {
            return;
        }
        if (r8.A01()) {
            for (C296505qA r7 : xc0.A08) {
                C340097kh r6 = xc0.A05;
                0qQ.A0A(r7);
                r6.A01(r7, r8, xc0.A07, (((double) xc0.A06.now()) - ((double) r7.A05)) / 1000.0d, xc0.A04.A04);
            }
            xc0.A00();
            return;
        }
        long now = xc0.A06.now();
        XnF xnF = xc0.A04;
        long j = now - xnF.A02;
        while (true) {
            queue = xc0.A08;
            if (!queue.isEmpty() && ((C296505qA) queue.element()).A05 < j) {
                queue.remove();
            }
        }
        if (!queue.isEmpty()) {
            xc0.A02.postDelayed(new C22372Y1a(xc0), xnF.A00);
        }
    }
}

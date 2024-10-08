package X;

import android.os.HandlerThread;
import android.os.Message;
import java.util.Stack;

/* renamed from: X.Xcf  reason: case insensitive filesystem */
public final class C21488Xcf {
    public Xnq A00;
    public Xnq A01;
    public 1sY A02;
    public final C66731qH A03;
    public final C66931qz A04;
    public final C21457XbL A05;
    public final C21132XFz A06;

    public final void A00(1tH r6) {
        Message message;
        C21132XFz xFz = this.A06;
        if (xFz.A09.A04.B11()) {
            synchronized (xFz.A06) {
                Stack stack = xFz.A03;
                if (stack == null) {
                    stack = new Stack();
                    xFz.A03 = stack;
                }
                stack.push(r6);
            }
            message = xFz.obtainMessage(8);
        } else {
            message = xFz.obtainMessage(1, r6);
        }
        xFz.sendMessageAtFrontOfQueue(message);
        C21132XFz.A05(xFz, r6.A03, "event.queued", r6.A05, r6.A06);
    }

    public final void A01(1tG r3) {
        C21132XFz xFz = this.A06;
        C21132XFz.A04(xFz);
        0Sd.A01(r3, "Cannot start a session with null batchSession");
        AnonymousClass7TE.A1S(xFz, r3, 3);
    }

    public C21488Xcf(HandlerThread handlerThread, C66731qH r4, C66931qz r5, C21457XbL xbL, 1qv r7, 1sY r8, Integer num) {
        this.A06 = new C21132XFz(handlerThread.getLooper(), this, r7, num);
        this.A03 = r4;
        this.A05 = xbL;
        this.A04 = r5;
        this.A02 = r8;
    }
}

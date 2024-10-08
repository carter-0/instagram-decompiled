package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Xqi  reason: case insensitive filesystem */
public final class C22007Xqi {
    public boolean A00;
    public final YB5 A01;
    public final C22520Y7r A02;
    public final C20871X1x A03;
    public final CopyOnWriteArraySet A04;
    public final Object A05 = Pxe.A0p();
    public final ArrayDeque A06 = new ArrayDeque();
    public final ArrayDeque A07 = new ArrayDeque();

    private void A00() {
        if (this.A00) {
            C11366SPh.A02(AnonymousClass7TF.A1W(Thread.currentThread(), ((C22061Xun) this.A02).A00.getLooper().getThread()));
        }
    }

    public static void A01(C22007Xqi xqi, Object obj, int i, int i2) {
        xqi.A03(new C22066Xus(obj, i), i2);
    }

    public final void A04(Object obj) {
        synchronized (this.A05) {
            this.A04.add(new C21482XcZ(obj));
        }
    }

    public C22007Xqi(Looper looper, YB5 yb5, C20871X1x x1x, CopyOnWriteArraySet copyOnWriteArraySet, boolean z) {
        this.A01 = yb5;
        this.A04 = copyOnWriteArraySet;
        this.A03 = x1x;
        W6B w6b = new W6B(this, 0);
        List list = C22061Xun.A01;
        this.A02 = new C22061Xun(new Handler(looper, w6b));
        this.A00 = z;
    }

    public final void A02() {
        A00();
        ArrayDeque arrayDeque = this.A07;
        if (!arrayDeque.isEmpty()) {
            C22061Xun xun = (C22061Xun) this.A02;
            Handler handler = xun.A00;
            if (!handler.hasMessages(1)) {
                C21997Xq5 A002 = C22061Xun.A00();
                Message obtainMessage = handler.obtainMessage(1);
                A002.A00 = obtainMessage;
                A002.A01 = xun;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                C21997Xq5.A01(A002);
            }
            ArrayDeque arrayDeque2 = this.A06;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void A03(Y8w y8w, int i) {
        A00();
        this.A07.add(new Y31(y8w, new CopyOnWriteArraySet(this.A04), i));
    }
}

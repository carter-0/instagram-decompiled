package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.5N4  reason: invalid class name */
public final class AnonymousClass5N4 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C697227w A03;
    public final AnonymousClass4S6 A04;
    public final AnonymousClass5N3 A05;
    public final Object A06 = new Object();
    public final ArrayDeque A07 = new ArrayDeque();
    public final ArrayDeque A08 = new ArrayDeque();
    public final CopyOnWriteArraySet A09;

    public AnonymousClass5N4(Looper looper, C697227w r5, AnonymousClass5N3 r6) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A03 = r5;
        this.A09 = copyOnWriteArraySet;
        this.A05 = r6;
        AnonymousClass5N5 r2 = new AnonymousClass5N5(this);
        List list = AnonymousClass4S5.A01;
        this.A04 = new AnonymousClass4S5(new Handler(looper, r2));
        this.A02 = true;
        this.A00 = 2BY.A02(2BQ.A0D);
    }

    public static void A00(AnonymousClass5N4 r3) {
        if (r3.A02) {
            boolean z = false;
            if (Thread.currentThread() == ((AnonymousClass4S5) r3.A04).A00.getLooper().getThread()) {
                z = true;
            }
            C256703wD.A04(z);
        }
    }

    public final void A01() {
        A00(this);
        ArrayDeque arrayDeque = this.A08;
        if (!arrayDeque.isEmpty()) {
            AnonymousClass4S5 r4 = (AnonymousClass4S5) this.A04;
            Handler handler = r4.A00;
            if (!handler.hasMessages(0)) {
                AnonymousClass4SD A002 = AnonymousClass4S5.A00();
                Message obtainMessage = handler.obtainMessage(0);
                A002.A00 = obtainMessage;
                A002.A01 = r4;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                AnonymousClass4SD.A00(A002);
            }
            ArrayDeque arrayDeque2 = this.A07;
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

    public final void A02(AnonymousClass5NW r4, int i) {
        A00(this);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A09);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                AnonymousClass5NG r1 = (AnonymousClass5NG) it.next();
                if (!r1.A02) {
                    if (i != -1) {
                        r1.A00.A01(i);
                    }
                    r1.A01 = true;
                    r4.CNv(r1.A03);
                }
            }
            return;
        }
        this.A08.add(new Y3P(r4, copyOnWriteArraySet, i));
    }
}

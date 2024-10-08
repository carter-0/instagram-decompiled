package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5PM  reason: invalid class name */
public final class AnonymousClass5PM extends AnonymousClass4CZ {
    public static final ThreadLocal A0A = new AnonymousClass5PO();
    public static final AnonymousClass0eM A0B = AnonymousClass0eN.A01(AnonymousClass5PN.A00);
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final Choreographer A05;
    public final AnonymousClass5PR A06;
    public final AnonymousClass5PP A07 = new AnonymousClass5PP(this);
    public final Object A08 = new Object();
    public final 01W A09 = new 01W();

    public static final void A00(AnonymousClass5PM r3) {
        01W r1;
        Runnable runnable;
        boolean z;
        while (true) {
            Object obj = r3.A08;
            synchronized (obj) {
                r1 = r3.A09;
                runnable = (Runnable) r1.A0S();
            }
            if (runnable != null) {
                runnable.run();
            } else {
                synchronized (obj) {
                    z = false;
                    if (r1.isEmpty()) {
                        r3.A03 = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    public final void A0O(Runnable runnable, C262094Cc r6) {
        synchronized (this.A08) {
            this.A09.addLast(runnable);
            if (!this.A03) {
                this.A03 = true;
                Handler handler = this.A04;
                AnonymousClass5PP r1 = this.A07;
                handler.post(r1);
                if (!this.A02) {
                    this.A02 = true;
                    this.A05.postFrameCallback(r1);
                }
            }
        }
    }

    public AnonymousClass5PM(Handler handler, Choreographer choreographer) {
        this.A05 = choreographer;
        this.A04 = handler;
        this.A06 = new AnonymousClass5PQ(choreographer, this);
    }
}

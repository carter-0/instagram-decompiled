package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.LinkedList;

/* renamed from: X.6QX  reason: invalid class name */
public final class AnonymousClass6QX {
    public boolean A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02;
    public final Runnable A03;
    public final LinkedList A04;
    public final AnonymousClass0eM A05;
    public final boolean A06;

    public AnonymousClass6QX(boolean z) {
        this.A06 = z;
        this.A05 = AnonymousClass0eN.A01(AnonymousClass6NU.A00);
        this.A04 = new LinkedList();
        AnonymousClass6NV r1 = new AnonymousClass6NV(this);
        this.A02 = r1;
        if (C245983dn.A03()) {
            Choreographer.getInstance().postFrameCallback(r1);
        } else {
            ((Handler) this.A05.getValue()).postAtTime(new C14547TyC(this), SystemClock.uptimeMillis());
        }
        this.A03 = new AnonymousClass6NW(this);
    }

    public final void A00(C67607Mqf mqf) {
        if (C245983dn.A03() && !this.A00 && !this.A01) {
            LinkedList linkedList = this.A04;
            boolean isEmpty = linkedList.isEmpty();
            linkedList.add(mqf);
            if (isEmpty && this.A06) {
                Choreographer.getInstance().postFrameCallback(this.A02);
            }
        }
    }

    public AnonymousClass6QX() {
        this(false);
    }
}

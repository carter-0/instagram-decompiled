package X;

import android.os.SystemClock;

/* renamed from: X.2jt  reason: invalid class name and case insensitive filesystem */
public final class C227772jt implements Runnable {
    public float A00;
    public C238133Ar A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C227762js A04;

    public C227772jt(C227762js r1) {
        this.A04 = r1;
    }

    public final C238133Ar A00() {
        C238133Ar r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean getShouldShow() {
        return this.A03;
    }

    public final void run() {
        C240093Jo r0;
        long uptimeMillis = SystemClock.uptimeMillis();
        C227762js r6 = this.A04;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        int i2 = (int) (uptimeMillis - r6.A05);
        if (A00().BLQ() == A00().getCount() - 1 && A00().AnC(A00().AnH() - 1) != null && A00().AnC(A00().AnH() - 1).getBottom() == A00().CEd().getBottom()) {
            C240093Jo r3 = r6.A06;
            if (r3 != null) {
                if (r3.EsJ(A00())) {
                    this.A00 = r6.A00;
                    this.A03 = true;
                }
                this.A02 = true;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        int round = Math.round(Math.abs((r6.A00 - r6.A01) - this.A00));
        int i3 = (int) (((float) i2) * r6.A0G);
        if (round < i3 && ((r0 = r6.A06) == null || !r0.E3Y())) {
            i3 = round;
        }
        if (round != 0) {
            r6.A05 = uptimeMillis;
            r6.A0H.postDelayed(this, 5);
        }
        if (this.A03) {
            i3 = -i3;
        }
        if (!this.A02) {
            C240093Jo r02 = r6.A06;
            if (r02 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (!r02.EsH()) {
                boolean CWN = A00().CWN();
                C238133Ar A002 = A00();
                if (!CWN) {
                    A002.CEd().scrollBy(0, i3);
                    return;
                } else {
                    A002.Ejm(A00().B6L(), A00().AnC(0).getTop() - i3);
                    return;
                }
            }
        }
        C227762js.A00(r6, (float) i3);
        A00().CEd().requestLayout();
    }
}

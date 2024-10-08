package X;

import android.view.MotionEvent;

/* renamed from: X.Hqy  reason: case insensitive filesystem */
public final class C55992Hqy {
    public boolean A00;
    public final 0sP A01;
    public final 0sP A02;
    public final int A03;
    public final C55940Hq4 A04;
    public final C62320sa A05;
    public final 0sP A06;

    public final boolean A00(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = false;
        }
        if (this.A00) {
            C51968G9o.A1O(this.A01, true);
            return C51971G9r.A1a(motionEvent, this.A02);
        }
        if (motionEvent.getY() > ((float) this.A03) || !this.A04.A00(motionEvent) || C51971G9r.A1b(this.A05)) {
            return C51971G9r.A1a(motionEvent, this.A06);
        }
        this.A00 = true;
        C51968G9o.A1O(this.A01, true);
        boolean A1a = C51971G9r.A1a(motionEvent, this.A02);
        0sP r1 = this.A06;
        motionEvent.setAction(3);
        r1.invoke(motionEvent);
        return A1a;
    }

    public C55992Hqy(C62320sa r2, 0sP r3, 0sP r4, 0sP r5, int i, int i2) {
        this.A03 = i2;
        this.A05 = r2;
        this.A02 = r3;
        this.A06 = r4;
        this.A01 = r5;
        this.A04 = new C55940Hq4(i);
    }
}

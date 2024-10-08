package X;

import java.util.ArrayDeque;

/* renamed from: X.5Of  reason: invalid class name */
public abstract class AnonymousClass5Of implements AnonymousClass5Og {
    public int A00;
    public int A01;
    public int A02;
    public C261794Ay A03;
    public boolean A04;
    public boolean A05;
    public AnonymousClass4PQ A06;
    public final Object A07 = new Object();
    public final ArrayDeque A08 = new ArrayDeque();
    public final ArrayDeque A09 = new ArrayDeque();
    public final AnonymousClass4PQ[] A0A;
    public final AnonymousClass5Oj[] A0B;
    public final Thread A0C;

    public abstract AnonymousClass4PQ createInputBuffer();

    public abstract AnonymousClass5Oj createOutputBuffer();

    public abstract C261794Ay createUnexpectedDecodeException(Throwable th);

    public abstract C261794Ay decode(AnonymousClass4PQ r1, AnonymousClass5Oj r2, boolean z);

    /* renamed from: A01 */
    public final AnonymousClass4PQ AOh() {
        AnonymousClass4PQ r0;
        synchronized (this.A07) {
            C261794Ay r02 = this.A03;
            if (r02 == null) {
                boolean z = false;
                if (this.A06 == null) {
                    z = true;
                }
                C256703wD.A04(z);
                int i = this.A00;
                if (i == 0) {
                    r0 = null;
                } else {
                    AnonymousClass4PQ[] r03 = this.A0A;
                    int i2 = i - 1;
                    this.A00 = i2;
                    r0 = r03[i2];
                }
                this.A06 = r0;
            } else {
                throw r02;
            }
        }
        return r0;
    }

    /* renamed from: A02 */
    public final AnonymousClass5Oj AOk() {
        AnonymousClass5Oj r0;
        synchronized (this.A07) {
            C261794Ay r02 = this.A03;
            if (r02 == null) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    r0 = null;
                } else {
                    r0 = (AnonymousClass5Oj) arrayDeque.removeFirst();
                }
            } else {
                throw r02;
            }
        }
        return r0;
    }

    /* renamed from: A03 */
    public final void E5x(AnonymousClass4PQ r4) {
        Object obj = this.A07;
        synchronized (obj) {
            C261794Ay r0 = this.A03;
            if (r0 == null) {
                boolean z = false;
                if (r4 == this.A06) {
                    z = true;
                }
                C256703wD.A03(z);
                ArrayDeque arrayDeque = this.A08;
                arrayDeque.addLast(r4);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj.notify();
                }
                this.A06 = null;
            } else {
                throw r0;
            }
        }
    }

    public final void A04(AnonymousClass5Oj r5) {
        Object obj = this.A07;
        synchronized (obj) {
            r5.clear();
            AnonymousClass5Oj[] r2 = this.A0B;
            int i = this.A01;
            this.A01 = i + 1;
            r2[i] = r5;
            if (!this.A08.isEmpty() && this.A01 > 0) {
                obj.notify();
            }
        }
    }

    public final void flush() {
        synchronized (this.A07) {
            this.A04 = true;
            this.A02 = 0;
            AnonymousClass4PQ r3 = this.A06;
            if (r3 != null) {
                r3.clear();
                AnonymousClass4PQ[] r2 = this.A0A;
                int i = this.A00;
                this.A00 = i + 1;
                r2[i] = r3;
                this.A06 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A08;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                AnonymousClass4PQ r32 = (AnonymousClass4PQ) arrayDeque.removeFirst();
                r32.clear();
                AnonymousClass4PQ[] r22 = this.A0A;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                r22[i2] = r32;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A09;
                if (!arrayDeque2.isEmpty()) {
                    ((AnonymousClass5Oj) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A05 = true;
            obj.notify();
        }
        try {
            this.A0C.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public AnonymousClass5Of(AnonymousClass4PQ[] r5, AnonymousClass5Oj[] r6) {
        this.A0A = r5;
        this.A00 = r5.length;
        for (int i = 0; i < this.A00; i++) {
            this.A0A[i] = createInputBuffer();
        }
        this.A0B = r6;
        int length = r6.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            r6[i2] = createOutputBuffer();
        }
        AnonymousClass5Ok r0 = new AnonymousClass5Ok(this);
        this.A0C = r0;
        r0.start();
    }
}

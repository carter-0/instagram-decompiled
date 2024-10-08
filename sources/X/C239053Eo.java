package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Eo  reason: invalid class name and case insensitive filesystem */
public final class C239053Eo extends 19W implements Runnable {
    public long A00 = -1;
    public AnonymousClass1T9 A01 = null;
    public 1Fe A02 = null;
    public AnonymousClass3EQ A03;
    public boolean A04;
    public long A05;
    public 1Qe A06;
    public 0ng A07;
    public final 1Qe A08;
    public final 1QS A09;
    public final 1QU A0A;
    public final String A0B;
    public final AtomicInteger A0C;
    public final /* synthetic */ 1Lt A0D;

    public C239053Eo(1Qe r4, 1QS r5, 1QU r6, 1Lt r7, long j) {
        this.A0D = r7;
        this.A09 = r5;
        this.A0A = r6;
        this.A08 = r4;
        this.A0C = new AtomicInteger(0);
        this.A06 = new 1Qe((1Qd) null, r6);
        this.A0B = 002.A0b(r6.A04, "-copy", r5.hashCode());
        this.A05 = j;
    }

    public static void A00(C239053Eo r2) {
        r2.A0D.A03.ATE(new AnonymousClass3HI(r2));
    }

    public final void onFailed(1QS r4, IOException iOException) {
        AtomicInteger atomicInteger = this.A0C;
        if (atomicInteger.get() == 2) {
            this.A08.A04(r4, iOException);
        } else if (atomicInteger.get() == 0) {
            0ng r1 = this.A07;
            if (r1 != null) {
                this.A0D.A04.A02(r1);
            }
            A00(this);
        }
    }

    public final void onNewData(1QS r3, 1QU r4, ByteBuffer byteBuffer) {
        if (this.A0C.get() == 2) {
            this.A08.A05(r3, byteBuffer);
        }
    }

    public final void onResponseStarted(1QS r6, 1QU r7, 2ZD r8) {
        Integer num;
        if (r8.A01 == 304 && (((num = r7.A0C) == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0j) && this.A0C.get() == 0)) {
            A00(this);
            return;
        }
        AtomicInteger atomicInteger = this.A0C;
        if (atomicInteger.compareAndSet(0, 2)) {
            this.A0D.A01.markerPoint(this.A09, "set_read_mode", String.valueOf(atomicInteger.get()));
            this.A08.A00(r8, r6);
        }
    }

    public final void onSucceeded(1QS r4) {
        if (this.A0C.get() == 2) {
            this.A0D.A01.markerPoint(this.A09, "cache_task_dispatch_network_success");
            this.A08.A03(r4);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4Cr, X.3Eo] */
    public final void run() {
        1Lt r4 = this.A0D;
        1QS r3 = this.A09;
        1Lt.A00(r3, AnonymousClass05K.A01);
        this.A00 = System.currentTimeMillis();
        1QU r2 = this.A0A;
        String str = r2.A04;
        str.getClass();
        String str2 = this.A0B;
        1JQ r0 = 1JQ.A05;
        AnonymousClass3EQ r8 = new AnonymousClass3EQ(str);
        AnonymousClass3EQ r6 = new AnonymousClass3EQ(str2);
        1JI r5 = r0.A00;
        if (!AnonymousClass3EQ.A00(r5, r8.A0C, r6.A0C) || !AnonymousClass3EQ.A00(r5, r8.A0A, r6.A0A)) {
            r8.A03(r5);
            r6.A03(r5);
            r6 = null;
        }
        this.A03 = r6;
        switch (r2.A0C.intValue()) {
            case 0:
            case 1:
                throw new IllegalStateException("Not Supported cached policy");
            case 2:
            case 3:
                if (r6 != null) {
                    A00(this);
                    return;
                }
                this.A08.A04(r3, new IOException("no content"));
                r4.A01.markerEnd(r3, 3);
                return;
            case 4:
            case 5:
                if (r6 != null) {
                    C289675e1 r62 = new C289675e1(this);
                    this.A07 = r62;
                    r4.A04.A01(r62, r2.A00);
                }
                1Qe r52 = this.A06;
                r52.A01(this);
                1JQ.A05.A01(r52, r3, str);
                if (r3.A02) {
                    r3.A01("X-IG-Cache-Entry-Timestamp", String.valueOf(this.A05));
                }
                1Lt.A00(r3, AnonymousClass05K.A0C);
                r4.A01.markerPoint(r3, "pass_to_next_layer");
                AnonymousClass1T9 startRequest = r4.A02.startRequest(r3, r2, r52);
                this.A01 = startRequest;
                1Fe r02 = this.A02;
                if (r02 != null) {
                    startRequest.FJj(r02);
                }
                if (this.A04) {
                    this.A01.cancel();
                    return;
                }
                return;
            default:
                return;
        }
    }
}

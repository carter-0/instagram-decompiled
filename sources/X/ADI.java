package X;

import java.util.concurrent.CountDownLatch;

public final class ADI {
    public CountDownLatch A00;
    public boolean A01;
    public Integer A02;
    public final B31 A03;
    public final B15 A04;
    public final B15 A05;
    public final C341567nA A06;
    public final String A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public static synchronized void A00(ADI adi) {
        B15 b15;
        B31 b31;
        synchronized (adi) {
            if (!adi.A09 && !adi.A0A && !adi.A01) {
                B15 b152 = adi.A04;
                if ((b152 == null || b152.BZV() != null) && ((b15 = adi.A05) == null || b15.BZV() != null)) {
                    Integer num = adi.A02;
                    if (num == null || num == AnonymousClass05K.A0C) {
                        b31 = adi.A03;
                        b31.AJ0(adi.A07);
                    } else {
                        b31 = adi.A03;
                        b31.AJ1(adi.A07, num);
                    }
                    if (!(b152 == null || b152.BZV() == null)) {
                        b31.EPD(b152.BZV());
                    }
                    if (!(b15 == null || b15.BZV() == null)) {
                        b31.EqH(b15.BZV());
                    }
                    b31.Eev(0);
                    b31.start();
                    adi.A09 = true;
                } else {
                    adi.A0C = true;
                }
            }
        }
    }

    public ADI(B15 b15, B15 b152, C341567nA r6, B31 b31, Integer num, String str) {
        this.A03 = b31;
        this.A07 = str;
        this.A04 = b15;
        this.A05 = b152;
        if (!(b15 == null || b152 == null)) {
            this.A00 = new CountDownLatch(2);
        }
        this.A06 = r6;
        this.A08 = false;
        this.A0B = false;
        this.A0C = false;
        this.A02 = num;
    }
}

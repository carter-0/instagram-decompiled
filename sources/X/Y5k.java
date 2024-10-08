package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class Y5k extends AtomicInteger implements C65051aA {
    public final 1aL A00;
    public final C3032668b A01;
    public final Y18[] A02;
    public final Object[] A03;
    public volatile boolean A04;

    public final void A00() {
        Y18[] y18Arr = this.A02;
        for (Y18 y18 : y18Arr) {
            y18.A02.clear();
        }
        for (Y18 y182 : y18Arr) {
            1af.A01(y182.A03);
        }
    }

    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            Y18[] y18Arr = this.A02;
            for (Y18 y18 : y18Arr) {
                1af.A01(y18.A03);
            }
            if (getAndIncrement() == 0) {
                for (Y18 y182 : y18Arr) {
                    y182.A02.clear();
                }
            }
        }
    }

    public Y5k(1aL r2, C3032668b r3, int i) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = new Y18[i];
        this.A03 = new Object[i];
    }

    public final void A01() {
        Throwable th;
        if (getAndIncrement() == 0) {
            Y18[] y18Arr = this.A02;
            1aL r4 = this.A00;
            Object[] objArr = this.A03;
            int i = 1;
            loop0:
            while (true) {
                int length = y18Arr.length;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    Y18 y18 = y18Arr[i2];
                    Object obj = objArr[i4];
                    boolean z = y18.A04;
                    if (obj == null) {
                        Object poll = y18.A02.poll();
                        boolean A1a = DbW.A1a(poll);
                        if (this.A04) {
                            A00();
                            return;
                        }
                        if (z) {
                            th = y18.A00;
                            if (th != null) {
                                break loop0;
                            } else if (A1a) {
                                A00();
                                r4.onComplete();
                                return;
                            }
                        } else if (A1a) {
                            i3++;
                            i4++;
                            i2++;
                        }
                        objArr[i4] = poll;
                        i4++;
                        i2++;
                    } else {
                        if (z && (th = y18.A00) != null) {
                            break loop0;
                        }
                        i4++;
                        i2++;
                    }
                }
                if (i3 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        Object apply = this.A01.apply(objArr.clone());
                        1aP.A01(apply, "The zipper returned a null value");
                        r4.DUK(apply);
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        C9877Riq.A00(th2);
                        A00();
                        r4.onError(th2);
                        return;
                    }
                }
            }
            A00();
            r4.onError(th);
        }
    }
}

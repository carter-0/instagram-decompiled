package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5P5  reason: invalid class name */
public final class AnonymousClass5P5 {
    public Object A00;
    public final Object A01 = new Object();
    public final AtomicReference A02 = new AtomicReference(AnonymousClass5P6.A00);

    public final Object A00() {
        long id = Thread.currentThread().getId();
        if (id == C284905Ot.A00) {
            return this.A00;
        }
        AnonymousClass5P7 r0 = (AnonymousClass5P7) this.A02.get();
        int A002 = AnonymousClass5P7.A00(r0, id);
        if (A002 >= 0) {
            return r0.A02[A002];
        }
        return null;
    }

    public final void A01(Object obj) {
        long id = Thread.currentThread().getId();
        Object obj2 = obj;
        if (id == C284905Ot.A00) {
            this.A00 = obj2;
            return;
        }
        synchronized (this.A01) {
            AtomicReference atomicReference = this.A02;
            AnonymousClass5P7 r11 = (AnonymousClass5P7) atomicReference.get();
            int A002 = AnonymousClass5P7.A00(r11, id);
            if (A002 < 0) {
                int i = r11.A00;
                Object[] objArr = r11.A02;
                int i2 = 0;
                int i3 = 0;
                for (Object obj3 : objArr) {
                    if (obj3 != null) {
                        i3++;
                    }
                }
                int i4 = i3 + 1;
                long[] jArr = new long[i4];
                Object[] objArr2 = new Object[i4];
                if (i4 > 1) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i) {
                            break;
                        }
                        long j = r11.A01[i5];
                        Object obj4 = objArr[i5];
                        if (j <= id) {
                            if (obj4 != null) {
                                jArr[i2] = j;
                                objArr2[i2] = obj4;
                                i2++;
                            }
                            i5++;
                            if (i2 >= i4) {
                                break;
                            }
                        } else {
                            jArr[i2] = id;
                            objArr2[i2] = obj;
                            i2++;
                            break;
                        }
                    }
                    if (i5 == i) {
                        i2 = i4 - 1;
                    } else {
                        while (i2 < i4) {
                            long j2 = r11.A01[i5];
                            Object obj5 = objArr[i5];
                            if (obj5 != null) {
                                jArr[i2] = j2;
                                objArr2[i2] = obj5;
                                i2++;
                            }
                            i5++;
                        }
                        atomicReference.set(new AnonymousClass5P7(jArr, objArr2, i4));
                    }
                }
                jArr[i2] = id;
                objArr2[i2] = obj;
                atomicReference.set(new AnonymousClass5P7(jArr, objArr2, i4));
            } else {
                r11.A02[A002] = obj;
            }
        }
    }
}

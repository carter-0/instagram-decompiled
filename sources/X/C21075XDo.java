package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XDo  reason: case insensitive filesystem */
public final class C21075XDo implements 1aL, C65051aA {
    public static final XEv[] A04 = new XEv[0];
    public static final XEv[] A05 = new XEv[0];
    public final AtomicBoolean A00;
    public final AtomicReference A01;
    public final AtomicReference A02 = new AtomicReference(A04);
    public final AtomicReference A03 = new AtomicReference();

    public final void A00(XEv xEv) {
        AtomicReference atomicReference;
        XEv[] xEvArr;
        XEv[] xEvArr2;
        do {
            atomicReference = this.A02;
            xEvArr = (XEv[]) atomicReference.get();
            int length = xEvArr.length;
            if (length != 0) {
                int i = 0;
                while (!xEvArr[i].equals(xEv)) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    xEvArr2 = A04;
                } else {
                    xEvArr2 = new XEv[(length - 1)];
                    System.arraycopy(xEvArr, 0, xEvArr2, 0, i);
                    System.arraycopy(xEvArr, i + 1, xEvArr2, i, (length - i) - 1);
                }
            } else {
                return;
            }
        } while (!1FH.A00(xEvArr, xEvArr2, atomicReference));
    }

    public final void DUK(Object obj) {
        for (XEv xEv : (XEv[]) this.A02.get()) {
            xEv.A00.DUK(obj);
        }
    }

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A03);
    }

    public final void dispose() {
        AtomicReference atomicReference = this.A02;
        Object obj = A05;
        if (atomicReference.getAndSet(obj) != obj) {
            1FH.A00(this, (Object) null, this.A01);
            1af.A01(this.A03);
        }
    }

    public final void onComplete() {
        1FH.A00(this, (Object) null, this.A01);
        for (XEv xEv : (XEv[]) this.A02.getAndSet(A05)) {
            xEv.A00.onComplete();
        }
    }

    public final void onError(Throwable th) {
        1FH.A00(this, (Object) null, this.A01);
        XEv[] xEvArr = (XEv[]) this.A02.getAndSet(A05);
        int length = xEvArr.length;
        if (length != 0) {
            int i = 0;
            do {
                xEvArr[i].A00.onError(th);
                i++;
            } while (i < length);
            return;
        }
        C318176oW.A01(th);
    }

    public C21075XDo(AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = new AtomicBoolean();
    }
}

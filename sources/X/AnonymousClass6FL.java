package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6FL  reason: invalid class name */
public final class AnonymousClass6FL extends AtomicReference implements 1aL {
    public final int A00;
    public final long A01;
    public final AnonymousClass6FK A02;
    public volatile C3029566q A03;
    public volatile boolean A04;

    public final void DUK(Object obj) {
        long j = this.A01;
        AnonymousClass6FK r3 = this.A02;
        if (j == r3.A06) {
            if (obj != null) {
                this.A03.offer(obj);
            }
            r3.A01();
        }
    }

    public final void onComplete() {
        long j = this.A01;
        AnonymousClass6FK r3 = this.A02;
        if (j == r3.A06) {
            this.A04 = true;
            r3.A01();
        }
    }

    public final void onError(Throwable th) {
        AnonymousClass6FK r5 = this.A02;
        if (this.A01 != r5.A06 || !C22013Xr3.A02(th, r5.A04)) {
            C318176oW.A01(th);
            return;
        }
        r5.A00.dispose();
        this.A04 = true;
        r5.A01();
    }

    public AnonymousClass6FL(AnonymousClass6FK r1, int i, long j) {
        this.A02 = r1;
        this.A01 = j;
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.XCy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.66p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.XCy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.XCy} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 == 2) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Do4(X.C65051aA r3) {
        /*
            r2 = this;
            boolean r0 = X.1af.A03(r3, r2)
            if (r0 == 0) goto L_0x001d
            boolean r0 = r3 instanceof X.AnonymousClass66o
            if (r0 == 0) goto L_0x001e
            X.66p r3 = (X.C3029466p) r3
            r0 = 7
            int r1 = r3.EHR(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0026
            r2.A03 = r3
            r2.A04 = r0
            X.6FK r0 = r2.A02
            r0.A01()
        L_0x001d:
            return
        L_0x001e:
            int r0 = r2.A00
            X.XCy r3 = new X.XCy
            r3.<init>(r0)
            goto L_0x0029
        L_0x0026:
            r0 = 2
            if (r1 != r0) goto L_0x001e
        L_0x0029:
            r2.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FL.Do4(X.1aA):void");
    }
}

package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.ArX  reason: case insensitive filesystem */
public abstract class C41291ArX implements Iterator {
    public int A00;
    public int A01 = -1;
    public C367908rl A02;
    public C13132TMq A03;
    public C13132TMq A04;
    public C367948rp A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ C367698rQ A07;

    /* JADX WARNING: CFG modification limit reached, blocks count: 130 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1 = r3.A06;
        r3.A01 = r2 - 1;
        r0 = (X.C367948rp) r1.get(r2);
        r3.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (A01(r0) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r0 = r0.BW2();
        r3.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (A01(r0) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r0 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            r0 = 0
            r3.A04 = r0
            X.8rp r0 = r3.A05
            if (r0 == 0) goto L_0x003a
        L_0x0007:
            X.8rp r0 = r0.BW2()
            r3.A05 = r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L_0x0069
            X.8rp r0 = r3.A05
            goto L_0x0007
        L_0x0018:
            int r2 = r3.A00
            if (r2 < 0) goto L_0x0069
            X.8rQ r0 = r3.A07
            X.8rl[] r1 = r0.A0K
            int r0 = r2 + -1
            r3.A00 = r0
            r0 = r1[r2]
            r3.A02 = r0
            int r0 = r0.A0C
            if (r0 == 0) goto L_0x0018
            X.8rl r0 = r3.A02
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.A0D
            r3.A06 = r0
            int r0 = r0.length()
            int r0 = r0 + -1
            r3.A01 = r0
        L_0x003a:
            int r2 = r3.A01
            if (r2 < 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.A06
            int r0 = r2 + -1
            r3.A01 = r0
            java.lang.Object r0 = r1.get(r2)
            X.8rp r0 = (X.C367948rp) r0
            r3.A05 = r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L_0x0069
            X.8rp r0 = r3.A05
            if (r0 == 0) goto L_0x003a
        L_0x0058:
            X.8rp r0 = r0.BW2()
            r3.A05 = r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L_0x0069
            X.8rp r0 = r3.A05
            goto L_0x0058
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41291ArX.A00():void");
    }

    public abstract Object next();

    public C41291ArX(C367698rQ r2) {
        this.A07 = r2;
        this.A00 = r2.A0K.length - 1;
        A00();
    }

    public final boolean A01(C367948rp r7) {
        boolean z;
        Object obj;
        try {
            C367698rQ r5 = this.A07;
            long A002 = r5.A0B.A00();
            Object key = r7.getKey();
            if (r7.getKey() == null || (obj = r7.CDT().get()) == null || r5.A03(r7, A002)) {
                z = false;
            } else {
                this.A04 = new C13132TMq(r5, key, obj);
                z = true;
            }
            return z;
        } finally {
            this.A02.A0D();
        }
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1V(this.A04);
    }

    public final void remove() {
        C13132TMq tMq = this.A03;
        17k.A0F(AnonymousClass7TF.A1V(tMq));
        this.A07.remove(tMq.getKey());
        this.A03 = null;
    }
}

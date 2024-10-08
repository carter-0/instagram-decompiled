package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class AA3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final C39775A8u A05 = new C39775A8u();
    public final A36 A06;
    public final C344987sk A07;
    public final Map A08 = Collections.synchronizedMap(new IdentityHashMap());
    public final AtomicReference A09 = new AtomicReference();
    public final C41805B1k A0A;
    public volatile A81 A0B;
    public volatile float A0C;
    public volatile C367508qr A0D = new C367508qr(0, 0);

    public final void A00() {
        ASJ asj = (ASJ) this.A09.getAndSet((Object) null);
        if (asj != null) {
            asj.release();
        }
        this.A05.A00();
        if (this.A0B != null) {
            A81 a81 = this.A0B;
            C369008tg r0 = a81.A02;
            if (r0 != null) {
                r0.A01();
                a81.A02 = null;
            }
            a81.A03.A02();
            this.A0B = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.7sh[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.7sh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r13 = this;
            X.A8u r2 = r13.A05
            monitor-enter(r2)
            java.util.List r1 = r2.A03     // Catch:{ all -> 0x00c9 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            r0 = 0
            java.lang.Object r11 = r1.remove(r0)     // Catch:{ all -> 0x00c9 }
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11     // Catch:{ all -> 0x00c9 }
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            monitor-exit(r2)
            if (r11 == 0) goto L_0x009f
            java.util.concurrent.atomic.AtomicReference r6 = r13.A09
            r0 = 0
            java.lang.Object r0 = r6.getAndSet(r0)
            X.ASJ r0 = (X.ASJ) r0
            if (r0 == 0) goto L_0x0026
            r0.release()
        L_0x0026:
            java.util.Map r0 = r13.A08
            java.lang.Object r1 = r0.get(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            r1.getClass()
            X.7sk r0 = r13.A07
            X.ASJ r5 = r0.A00()
            java.lang.Object r10 = r5.get()
            X.ADH r10 = (X.ADH) r10
            int r9 = r11.capacity()
            int r8 = r13.A00
            int r9 = r9 / r8
            int r4 = r13.A02
            long r1 = r1.longValue()
            int r3 = r13.A03
            r7 = 0
            X.7sh[] r12 = r10.A0C
            if (r12 == 0) goto L_0x0098
            int r0 = r12.length
            if (r7 >= r0) goto L_0x0091
            r0 = r12[r7]
            if (r0 != 0) goto L_0x005f
            X.7sh r0 = new X.7sh
            r0.<init>()
            r12[r7] = r0
        L_0x005f:
            r0 = r12[r7]
            r0.A02 = r11
            r0.A00 = r7
            r0.A01 = r9
            r10.A03 = r4
            r10.A07 = r1
            r10.A09 = r7
            r10.A04 = r3
            r10.A02 = r8
            X.A36 r0 = r13.A06     // Catch:{ all -> 0x008c }
            java.util.ArrayList r4 = r0.A00     // Catch:{ all -> 0x008c }
            int r3 = r4.size()     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x007a:
            if (r2 >= r3) goto L_0x00c5
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x008c }
            X.8tR r1 = (X.C368858tR) r1     // Catch:{ all -> 0x008c }
            X.8tS r0 = r1.A00     // Catch:{ all -> 0x008c }
            r0.A00(r5)     // Catch:{ all -> 0x008c }
            r1.A02 = r7     // Catch:{ all -> 0x008c }
            int r2 = r2 + 1
            goto L_0x007a
        L_0x008c:
            r0 = move-exception
            r6.set(r5)
            throw r0
        L_0x0091:
            java.lang.String r0 = "planeIndex is greater then the number of planes available"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0098:
            java.lang.String r0 = "FrameData has been initialized with 0 planes"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x009f:
            java.util.concurrent.atomic.AtomicReference r0 = r13.A09
            java.lang.Object r5 = r0.get()
            X.ASJ r5 = (X.ASJ) r5
            if (r5 == 0) goto L_0x00c8
            X.A36 r0 = r13.A06
            java.util.ArrayList r4 = r0.A00
            int r3 = r4.size()
            r2 = 0
        L_0x00b2:
            if (r2 >= r3) goto L_0x00c8
            java.lang.Object r1 = r4.get(r2)
            X.8tR r1 = (X.C368858tR) r1
            X.8tS r0 = r1.A00
            r0.A00(r5)
            r0 = 0
            r1.A02 = r0
            int r2 = r2 + 1
            goto L_0x00b2
        L_0x00c5:
            r6.set(r5)
        L_0x00c8:
            return
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AA3.A01():void");
    }

    public final void A02(int i, int i2) {
        int i3 = this.A01;
        if (i3 != 0 && !this.A04) {
            C367508qr AWU = this.A0A.AWU(i, i2, i3);
            i = AWU.A01;
            i2 = AWU.A00;
        }
        if (this.A03 != i || this.A00 != i2) {
            this.A03 = i;
            this.A00 = i2;
            this.A0C = 1.0f / ((float) i);
            this.A0D = this.A0A.AWT(i, i2);
            C39775A8u a8u = this.A05;
            int i4 = this.A0D.A01 * this.A0D.A00 * 4;
            synchronized (a8u) {
                if (a8u.A00 != i4) {
                    a8u.A00();
                }
                a8u.A00 = i4;
            }
        }
    }

    public final void A03(X9O x9o, List list) {
        ArrayList arrayList = this.A06.A00;
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C368858tR) it.next()).A03.put(x9o.B7P(), x9o);
        }
    }

    public final boolean A04(C368538so r15, boolean z) {
        ByteBuffer byteBuffer;
        A81 a81 = this.A0B;
        if (a81 == null || (z && this.A09.get() != null)) {
            return false;
        }
        ASJ asj = (ASJ) this.A09.getAndSet((Object) null);
        if (asj != null) {
            asj.release();
        }
        C39775A8u a8u = this.A05;
        synchronized (a8u) {
            List list = a8u.A02;
            if (list.isEmpty() && a8u.A01 < 3) {
                byteBuffer = ByteBuffer.allocateDirect(a8u.A00);
                byteBuffer.order(ByteOrder.nativeOrder());
                a8u.A01++;
                byteBuffer.rewind();
            } else if (!list.isEmpty()) {
                byteBuffer = (ByteBuffer) list.remove(0);
            } else {
                List list2 = a8u.A03;
                if (!list2.isEmpty()) {
                    byteBuffer = (ByteBuffer) list2.remove(0);
                } else {
                    throw AnonymousClass7TE.A0z(002.A0c("Max buffers (", ") already out and in use", 3));
                }
            }
        }
        this.A08.put(byteBuffer, Long.valueOf(r15.A00));
        byteBuffer.rewind();
        int i = this.A0D.A01;
        int i2 = this.A0D.A00;
        float f = this.A0C;
        C369008tg r1 = a81.A02;
        if (!(r1 == null || (a81.A01 == i && a81.A00 == i2))) {
            r1.A01();
            a81.A02 = null;
        }
        a81.A01 = i;
        a81.A00 = i2;
        boolean A052 = r15.A05();
        if (A052 != a81.A04) {
            a81.A04 = A052;
            a81.A03.A02();
            a81.A03 = a81.A08.A02(a81.A06, a81.A05, a81.A04);
        }
        C369008tg r0 = a81.A02;
        if (r0 == null) {
            r0 = new C369008tg(i, i2);
            a81.A02 = r0;
        }
        GLES20.glBindFramebuffer(36160, r0.A00);
        C369008tg r02 = a81.A02;
        GLES20.glViewport(0, 0, r02.A02, r02.A01);
        C361258fv A012 = a81.A03.A01();
        A012.A04("uSurfaceTransformMatrix", r15.A04);
        A012.A04("uSceneTransformMatrix", r15.A03);
        A012.A04("uVideoTransformMatrix", r15.A05);
        A012.A03("sTexture", r15.A00());
        if (a81.A09) {
            A012.A02("uInverseSize", f);
        }
        A012.A01(a81.A07);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, byteBuffer);
        GLES20.glBindFramebuffer(36160, 0);
        synchronized (a8u) {
            if (byteBuffer.capacity() == a8u.A00) {
                a8u.A03.add(byteBuffer);
            }
        }
        return true;
    }

    public final boolean A05(C368888tU r7) {
        ArrayList arrayList = this.A06.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C368858tR r1 = (C368858tR) arrayList.get(i);
            if (r1.A00.A00.A0m && r1.A01 == r7) {
                return true;
            }
        }
        return false;
    }

    public AA3(C41805B1k b1k, int i) {
        this.A0A = b1k;
        this.A06 = new A36();
        this.A02 = i;
        this.A07 = new C344987sk(new ASK(this));
    }
}

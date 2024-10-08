package X;

import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;

/* renamed from: X.2iK  reason: invalid class name and case insensitive filesystem */
public final class C226992iK implements C226532gy {
    public C270244gQ A00;
    public final C226752hn A01;
    public final Executor A02;
    public final long A03;
    public final 0sK A04;

    public C226992iK(C270244gQ r2, C226752hn r3, Executor executor, 0sK r5, long j) {
        0qQ.A0B(r5, 3);
        this.A03 = j;
        this.A01 = r3;
        this.A04 = r5;
        this.A00 = r2;
        this.A02 = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DEW(X.1TY r21) {
        /*
            r20 = this;
            r5 = 0
            r4 = r20
            long r12 = r4.A03
            X.2hn r3 = r4.A01
            long r1 = r3.A00
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            X.2hl r10 = r3.A02
            if (r10 == 0) goto L_0x0059
            X.2hx r14 = r3.A0G
            android.content.res.Resources r7 = r10.A00
            X.1U1 r6 = r10.A01
            X.0qQ.A0B(r14, r5)
            r5 = 1
            android.graphics.drawable.Drawable r2 = r6.A0A
            int r1 = r6.A00
            java.lang.Integer r0 = r6.A0Q
            X.2i9 r19 = X.AnonymousClass2i5.A00(r7, r2, r0, r1)
            if (r19 != 0) goto L_0x0083
            r14.A02(r5)
        L_0x002a:
            r6 = r21
            boolean r0 = r6.A08()
            if (r0 == 0) goto L_0x0039
            X.2hx r0 = r3.A04
            if (r0 == 0) goto L_0x0039
            r0.A02(r5)
        L_0x0039:
            boolean r0 = r6.A08()
            if (r0 != 0) goto L_0x005a
            X.2ho r1 = r3.A0E
            java.lang.Throwable r0 = r6.A03()
            r1.DLQ(r10, r0, r12)
        L_0x0048:
            java.util.concurrent.Executor r1 = r4.A02
            X.3Lq r0 = new X.3Lq
            r0.<init>(r3)
            r1.execute(r0)
            X.4gQ r0 = r4.A00
            if (r0 == 0) goto L_0x0059
            r0.A00(r3)
        L_0x0059:
            return
        L_0x005a:
            java.lang.Object r5 = r6.A02()
            java.io.Closeable r5 = (java.io.Closeable) r5
            r2 = r5
            X.3kY r2 = (X.C249903kY) r2     // Catch:{ all -> 0x00a0 }
            X.2ho r7 = r3.A0E     // Catch:{ all -> 0x00a0 }
            X.2i9 r1 = r14.A04     // Catch:{ all -> 0x00a0 }
            boolean r0 = r1 instanceof X.AnonymousClass2i8     // Catch:{ all -> 0x00a0 }
            r8 = 0
            if (r0 == 0) goto L_0x0072
            X.2i8 r1 = (X.AnonymousClass2i8) r1     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0072
            android.graphics.drawable.Drawable r8 = r1.A02     // Catch:{ all -> 0x00a0 }
        L_0x0072:
            java.lang.Throwable r11 = r6.A03()     // Catch:{ all -> 0x00a0 }
            X.2i4 r9 = X.AnonymousClass2i2.A00(r2, r6, r3)     // Catch:{ all -> 0x00a0 }
            r7.DEj(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x0048
            r5.close()
            goto L_0x0048
        L_0x0083:
            X.1U5 r1 = r6.A0F
            if (r1 == 0) goto L_0x009e
            android.graphics.PointF r0 = r6.A08
            X.3Lk r2 = new X.3Lk
            r2.<init>(r0, r1)
        L_0x008e:
            X.2hf r1 = r14.A03
            android.graphics.Rect r0 = r14.A02
            android.graphics.ColorFilter r15 = r14.A01
            r18 = r1
            r16 = r0
            r17 = r2
            r14.A01(r15, r16, r17, r18, r19)
            goto L_0x002a
        L_0x009e:
            r2 = 0
            goto L_0x008e
        L_0x00a0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            X.1zE.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226992iK.DEW(X.1TY):void");
    }

    public final void DUB(1TY r13) {
        C226732hl r7;
        C226852hx r0;
        long j = this.A03;
        C226752hn r1 = this.A01;
        if (j == r1.A00 && (r7 = r1.A02) != null) {
            C249903kY r3 = (C249903kY) r13.A02();
            if (r3 == null || !r3.A06()) {
                DEW(r13);
                if (r3 != null) {
                    r3.close();
                    return;
                }
                return;
            }
            r1.A0D.Epx(r1, r3, C226752hn.A0O[1]);
            C240483Lb r5 = (C240483Lb) r3.A05();
            C240553Li.A00(r7.A00, r1.A0G, r7.A01, r5, this.A04);
            Executor executor = this.A02;
            executor.execute(new C240583Ll(r7, this));
            if (r13.A08() && (r0 = r1.A04) != null) {
                r0.A02(true);
            }
            C240493Lc BGA = r5.BGA();
            if (!r13.A08()) {
                r1.A0E.DLS(r7, BGA, j);
            } else {
                r1.A0E.DFZ(r1.AYq(), AnonymousClass2i2.A00(r3, r13, r1), r7, BGA, 1, j);
            }
            executor.execute(new C240633Lq(r1));
            C270244gQ r02 = this.A00;
            if (r02 != null) {
                r02.A00(r1);
            }
        }
    }

    public final void DaR(1TY r4) {
        C226902i9 r1;
        AnonymousClass2i8 r12;
        Drawable drawable;
        float f;
        C226752hn r2 = this.A01;
        C226852hx r0 = r2.A04;
        if (r0 != null) {
            r1 = r0.A04;
        } else {
            r1 = null;
        }
        if ((r1 instanceof AnonymousClass2i8) && (r12 = (AnonymousClass2i8) r1) != null && (drawable = r12.A02) != null && !r4.A08()) {
            synchronized (r4) {
                f = r4.A00;
            }
            C16780V5n.A00(drawable, f);
        }
        C270244gQ r02 = this.A00;
        if (r02 != null) {
            r02.A00(r2);
        }
    }
}

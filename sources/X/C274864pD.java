package X;

import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4pD  reason: invalid class name and case insensitive filesystem */
public final class C274864pD implements C274834pA {
    public static final Map A08 = new HashMap();
    public long A00 = 0;
    public C274844pB A01;
    public Thread A02;
    public final C275074pY[] A03;
    public final C275204pl A04;
    public final C275174pi A05 = new C275174pi();
    public final boolean A06;
    public final boolean A07;

    public final void AVY() {
        AVV((Message) null);
    }

    public final void ExE() {
        Ewt((Message) null);
    }

    public final void AVV(Message message) {
        Integer num;
        C274844pB r0 = this.A01;
        if (r0 != null) {
            r0.A04();
            if (this.A07) {
                C274844pB.A0F = null;
            }
            C274844pB r5 = this.A01;
            r5.A0B = true;
            if (this.A06 && r5.A01() >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                if (C274794p6.A02.A01.get()) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A01;
                }
                r5.A06 = num;
            }
            this.A04.E4R(this.A01);
            this.A01 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r5 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ewt(android.os.Message r7) {
        /*
            r6 = this;
            X.4pi r4 = r6.A05
            java.util.LinkedList r3 = r4.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x001e
            java.lang.Object r5 = r3.pollLast()
            X.4pB r5 = (X.C274844pB) r5
            if (r5 != 0) goto L_0x0040
        L_0x0012:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A02
            int r0 = r2.get()
            if (r0 <= 0) goto L_0x0082
            java.util.LinkedList r1 = r4.A01
            monitor-enter(r1)
            goto L_0x0020
        L_0x001e:
            r5 = 0
            goto L_0x0012
        L_0x0020:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r5 = r1.pollLast()     // Catch:{ all -> 0x003b }
            X.4pB r5 = (X.C274844pB) r5     // Catch:{ all -> 0x003b }
            r3.addAll(r1)     // Catch:{ all -> 0x003b }
            r1.clear()     // Catch:{ all -> 0x003b }
            int r0 = r1.size()     // Catch:{ all -> 0x003b }
            r2.set(r0)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            if (r5 == 0) goto L_0x0082
        L_0x0040:
            java.lang.Thread r4 = r6.A02
            long r2 = r6.A00
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0
            r5.A09 = r4
            r5.A05 = r2
            r5.A05(r7)
            r5.A02()
            r0 = 0
            r5.A01 = r0
            X.4p6 r0 = X.C274794p6.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x007f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0062:
            r5.A07 = r0
            r0 = 1
            r5.A0C = r0
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x006d
            X.C274844pB.A0F = r5
        L_0x006d:
            X.4pl r0 = r6.A04
            r0.E4R(r5)
            r6.A01 = r5
            long r3 = r6.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            r6.A00 = r1
        L_0x007e:
            return
        L_0x007f:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0062
        L_0x0082:
            X.4pB r5 = new X.4pB
            r5.<init>(r4)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274864pD.Ewt(android.os.Message):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C274864pD(android.os.Looper r6, X.C275164ph r7, X.C275074pY[] r8) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.A00 = r0
            X.4pi r0 = new X.4pi
            r0.<init>()
            r5.A05 = r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0 = 0
            if (r6 != r1) goto L_0x0016
            r0 = 1
        L_0x0016:
            r5.A07 = r0
            r5.A03 = r8
            boolean r4 = r7 instanceof X.C275154pg
            if (r4 == 0) goto L_0x0057
            r0 = r7
            X.4pg r0 = (X.C275154pg) r0
            X.0lg r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313110972073738(0x810295002e070a, double:3.027895827676234E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0057
            X.QJS r2 = new X.QJS
            r2.<init>(r8)
        L_0x0035:
            r5.A04 = r2
            boolean r0 = r7.A00()
            r5.A06 = r0
            if (r4 == 0) goto L_0x0054
            X.4pg r7 = (X.C275154pg) r7
            X.0lg r3 = r7.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36594585949636378(0x820295003b071a, double:3.205901736895608E-306)
            long r1 = X.182.A01(r2, r3, r0)
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x0053
        L_0x0051:
            X.C275174pi.A03 = r0
        L_0x0053:
            return
        L_0x0054:
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x0057:
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x0078
            if (r4 == 0) goto L_0x0075
            r0 = r7
            X.4pg r0 = (X.C275154pg) r0
            X.0lg r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36594585947539220(0x820295001b0714, double:3.205901735569357E-306)
            long r0 = X.182.A01(r2, r3, r0)
        L_0x006f:
            X.4pj r2 = new X.4pj
            r2.<init>(r8, r0)
            goto L_0x0035
        L_0x0075:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x006f
        L_0x0078:
            X.QJR r2 = new X.QJR
            r2.<init>(r8)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274864pD.<init>(android.os.Looper, X.4ph, X.4pY[]):void");
    }

    public final void Ex8(Looper looper, String str) {
        this.A02 = looper.getThread();
        C275174pi r3 = this.A05;
        int i = 100;
        do {
            r3.A00.add(new C274844pB(r3));
            i--;
        } while (i >= 0);
        for (C275074pY r1 : this.A03) {
            if (r1 instanceof C275064pX) {
                ((C275064pX) r1).CwF(str);
            }
        }
        this.A04.start();
    }
}

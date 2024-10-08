package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class QpU extends AnonymousClass63S implements C13785Th0 {
    public Q67 A00;
    public C13841TiG A01 = null;
    public Integer A02 = null;
    public Set A03 = AnonymousClass7TE.A1F();
    public long A04 = 120000;
    public final Context A05;
    public final Looper A06;
    public final GoogleApiAvailability A07;
    public final AnonymousClass63I A08;
    public final SEZ A09;
    public final AnonymousClass643 A0A;
    public final C11456SVu A0B;
    public final ArrayList A0C;
    public final Map A0D;
    public final Map A0E;
    public final Queue A0F = Pxe.A1A();
    public final Lock A0G;
    public final int A0H;
    public final C10263RpN A0I = new C10263RpN();
    public final C8433QuV A0J;
    public final AnonymousClass649 A0K;
    public volatile boolean A0L;

    public final Context A03() {
        return this.A05;
    }

    public final Looper A04() {
        return this.A06;
    }

    public final void FOQ(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1) {
            if (!this.A0L) {
                this.A0L = true;
                if (this.A00 == null) {
                    try {
                        this.A00 = this.A07.A05(this.A05.getApplicationContext(), new C8378Qpj(this));
                    } catch (SecurityException unused) {
                    }
                }
                C8433QuV quV = this.A0J;
                quV.sendMessageDelayed(quV.obtainMessage(1), this.A04);
                quV.sendMessageDelayed(quV.obtainMessage(2), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
            i = 1;
        }
        for (BasePendingResult A082 : (BasePendingResult[]) this.A09.A01.toArray(new BasePendingResult[0])) {
            A082.A08(SEZ.A02);
        }
        C11456SVu sVu = this.A0B;
        Handler handler = sVu.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (sVu.A03) {
                sVu.A00 = true;
                ArrayList arrayList = sVu.A05;
                ArrayList A1D = AnonymousClass7TE.A1D(arrayList);
                atomicInteger = sVu.A07;
                int i2 = atomicInteger.get();
                Iterator it = A1D.iterator();
                while (it.hasNext()) {
                    AnonymousClass63y r1 = (AnonymousClass63y) it.next();
                    if (!sVu.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(r1)) {
                        r1.D5q(i);
                    }
                }
                sVu.A04.clear();
                sVu.A00 = false;
            }
            sVu.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                A01(this);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    public static final void A01(QpU qpU) {
        qpU.A0B.A08 = true;
        C13841TiG tiG = qpU.A01;
        AnonymousClass3Qk.A02(tiG);
        tiG.FOb();
    }

    public static /* bridge */ /* synthetic */ void A02(QpU qpU) {
        Lock lock = qpU.A0G;
        lock.lock();
        try {
            if (qpU.A0L) {
                A01(qpU);
            }
        } finally {
            lock.unlock();
        }
    }

    public final AnonymousClass647 A05(AnonymousClass63G r3) {
        AnonymousClass647 r1 = (AnonymousClass647) this.A0D.get(r3);
        AnonymousClass3Qk.A03(r1, "Appropriate Api was not requested.");
        return r1;
    }

    public final C8412Qts A06(C8412Qts qts) {
        String str;
        AnonymousClass63K r2 = qts.A01;
        boolean containsKey = this.A0D.containsKey(qts.A00);
        if (r2 != null) {
            str = r2.A02;
        } else {
            str = "the API";
        }
        AnonymousClass3Qk.A08(containsKey, 002.A0g("GoogleApiClient is not configured to use ", str, " required for this call."));
        Lock lock = this.A0G;
        lock.lock();
        try {
            C13841TiG tiG = this.A01;
            if (tiG == null) {
                this.A0F.add(qts);
            } else {
                tiG.FOT(qts);
            }
            return qts;
        } finally {
            lock.unlock();
        }
    }

    public final C8412Qts A07(C8412Qts qts) {
        String str;
        Map map = this.A0D;
        AnonymousClass63K r1 = qts.A01;
        boolean containsKey = map.containsKey(qts.A00);
        if (r1 != null) {
            str = r1.A02;
        } else {
            str = "the API";
        }
        AnonymousClass3Qk.A08(containsKey, 002.A0g("GoogleApiClient is not configured to use ", str, " required for this call."));
        Lock lock = this.A0G;
        lock.lock();
        try {
            C13841TiG tiG = this.A01;
            if (tiG != null) {
                if (this.A0L) {
                    Queue queue = this.A0F;
                    queue.add(qts);
                    while (!queue.isEmpty()) {
                        C8412Qts qts2 = (C8412Qts) queue.remove();
                        SEZ sez = this.A09;
                        sez.A01.add(qts2);
                        qts2.A0B.set(sez.A00);
                        qts2.A0A(Status.A06);
                    }
                } else {
                    qts = tiG.FOW(qts);
                }
                return qts;
            }
            throw AnonymousClass7TE.A0z("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [X.TiG] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.Sxf] */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.Sxe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[Catch:{ all -> 0x01fd, all -> 0x0202 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[Catch:{ all -> 0x01fd, all -> 0x0202 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c A[Catch:{ all -> 0x01fd, all -> 0x0202 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r30 = this;
            r14 = r30
            java.util.concurrent.locks.Lock r0 = r14.A0G
            r29 = r0
            r29.lock()
            int r0 = r14.A0H     // Catch:{ all -> 0x0202 }
            r6 = 2
            r1 = 0
            r4 = 1
            if (r0 < 0) goto L_0x0017
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x0202 }
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            goto L_0x003a
        L_0x0017:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x002c
            java.util.Map r0 = r14.A0D     // Catch:{ all -> 0x0202 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0202 }
            int r0 = A00(r0, r1)     // Catch:{ all -> 0x0202 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0202 }
            r14.A02 = r0     // Catch:{ all -> 0x0202 }
            goto L_0x003f
        L_0x002c:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0202 }
            if (r0 != r6) goto L_0x003f
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0202 }
            goto L_0x0201
        L_0x003a:
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.AnonymousClass3Qk.A09(r2, r0)     // Catch:{ all -> 0x0202 }
        L_0x003f:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x0202 }
            X.AnonymousClass3Qk.A02(r0)     // Catch:{ all -> 0x0202 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0202 }
            r29.lock()     // Catch:{ all -> 0x0202 }
            r5 = 3
            if (r0 == r5) goto L_0x0054
            if (r0 == r4) goto L_0x0054
            if (r0 == r6) goto L_0x0055
            r6 = r0
            goto L_0x0056
        L_0x0054:
            r6 = r0
        L_0x0055:
            r1 = 1
        L_0x0056:
            java.lang.String r0 = "Illegal sign-in mode: "
            java.lang.String r0 = X.002.A0O(r0, r6)     // Catch:{ all -> 0x01fd }
            X.AnonymousClass3Qk.A08(r1, r0)     // Catch:{ all -> 0x01fd }
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x008c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01fd }
            r14.A02 = r0     // Catch:{ all -> 0x01fd }
        L_0x0069:
            X.TiG r0 = r14.A01     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x01b9
            java.util.Map r6 = r14.A0D     // Catch:{ all -> 0x01fd }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0v(r6)     // Catch:{ all -> 0x01fd }
            r3 = 0
            r2 = 0
        L_0x0075:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x01fd }
            X.647 r1 = (X.AnonymousClass647) r1     // Catch:{ all -> 0x01fd }
            boolean r0 = r1.requiresSignIn()     // Catch:{ all -> 0x01fd }
            r3 = r3 | r0
            boolean r0 = r1.E57()     // Catch:{ all -> 0x01fd }
            r2 = r2 | r0
            goto L_0x0075
        L_0x008c:
            int r1 = r0.intValue()     // Catch:{ all -> 0x01fd }
            if (r1 == r6) goto L_0x0069
            goto L_0x01c3
        L_0x0094:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x01fd }
            int r1 = r0.intValue()     // Catch:{ all -> 0x01fd }
            if (r1 == r4) goto L_0x0182
            r0 = 2
            if (r1 != r0) goto L_0x0194
            if (r3 == 0) goto L_0x0194
            android.content.Context r0 = r14.A05     // Catch:{ all -> 0x01fd }
            r17 = r0
            android.os.Looper r15 = r14.A06     // Catch:{ all -> 0x01fd }
            com.google.android.gms.common.GoogleApiAvailability r13 = r14.A07     // Catch:{ all -> 0x01fd }
            X.643 r12 = r14.A0A     // Catch:{ all -> 0x01fd }
            java.util.Map r1 = r14.A0E     // Catch:{ all -> 0x01fd }
            X.63I r11 = r14.A08     // Catch:{ all -> 0x01fd }
            java.util.ArrayList r10 = r14.A0C     // Catch:{ all -> 0x01fd }
            r16 = 0
            X.0yf r9 = X.Pxe.A0N(r16)     // Catch:{ all -> 0x01fd }
            X.0yf r8 = X.Pxe.A0N(r16)     // Catch:{ all -> 0x01fd }
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r6)     // Catch:{ all -> 0x01fd }
            r20 = 0
        L_0x00c1:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x00eb
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r6)     // Catch:{ all -> 0x01fd }
            java.lang.Object r3 = r5.getValue()     // Catch:{ all -> 0x01fd }
            X.647 r3 = (X.AnonymousClass647) r3     // Catch:{ all -> 0x01fd }
            boolean r0 = r3.E57()     // Catch:{ all -> 0x01fd }
            if (r4 != r0) goto L_0x00d9
            r20 = r3
        L_0x00d9:
            boolean r2 = r3.requiresSignIn()     // Catch:{ all -> 0x01fd }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x01fd }
            if (r2 == 0) goto L_0x00e7
            r9.put(r0, r3)     // Catch:{ all -> 0x01fd }
            goto L_0x00c1
        L_0x00e7:
            r8.put(r0, r3)     // Catch:{ all -> 0x01fd }
            goto L_0x00c1
        L_0x00eb:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01fd }
            r2 = r0 ^ 1
            java.lang.String r0 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            X.AnonymousClass3Qk.A09(r2, r0)     // Catch:{ all -> 0x01fd }
            X.0yf r7 = X.Pxe.A0N(r16)     // Catch:{ all -> 0x01fd }
            X.0yf r6 = X.Pxe.A0N(r16)     // Catch:{ all -> 0x01fd }
            java.util.Iterator r4 = X.DbV.A16(r1)     // Catch:{ all -> 0x01fd }
        L_0x0102:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x012c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x01fd }
            X.63K r2 = (X.AnonymousClass63K) r2     // Catch:{ all -> 0x01fd }
            X.63G r3 = r2.A01     // Catch:{ all -> 0x01fd }
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x01fd }
            r7.put(r2, r0)     // Catch:{ all -> 0x01fd }
            goto L_0x0102
        L_0x011e:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x01f6
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x01fd }
            r6.put(r2, r0)     // Catch:{ all -> 0x01fd }
            goto L_0x0102
        L_0x012c:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01fd }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01fd }
            int r3 = r10.size()     // Catch:{ all -> 0x01fd }
            r2 = 0
        L_0x0139:
            if (r2 >= r3) goto L_0x0163
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x01fd }
            X.Sx8 r1 = (X.Sx8) r1     // Catch:{ all -> 0x01fd }
            X.63K r0 = r1.A01     // Catch:{ all -> 0x01fd }
            boolean r0 = r7.containsKey(r0)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x014d
            r5.add(r1)     // Catch:{ all -> 0x01fd }
            goto L_0x0158
        L_0x014d:
            X.63K r0 = r1.A01     // Catch:{ all -> 0x01fd }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x015b
            r4.add(r1)     // Catch:{ all -> 0x01fd }
        L_0x0158:
            int r2 = r2 + 1
            goto L_0x0139
        L_0x015b:
            java.lang.String r0 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x0163:
            X.Sxe r3 = new X.Sxe     // Catch:{ all -> 0x01fd }
            r23 = r5
            r24 = r4
            r25 = r9
            r26 = r8
            r27 = r7
            r28 = r6
            r19 = r11
            r21 = r14
            r22 = r12
            r16 = r17
            r17 = r15
            r18 = r13
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01fd }
            goto L_0x01b7
        L_0x0182:
            if (r3 == 0) goto L_0x018d
            if (r2 == 0) goto L_0x0194
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x018d:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x0194:
            android.content.Context r8 = r14.A05     // Catch:{ all -> 0x01fd }
            android.os.Looper r7 = r14.A06     // Catch:{ all -> 0x01fd }
            com.google.android.gms.common.GoogleApiAvailability r5 = r14.A07     // Catch:{ all -> 0x01fd }
            X.643 r4 = r14.A0A     // Catch:{ all -> 0x01fd }
            java.util.Map r2 = r14.A0E     // Catch:{ all -> 0x01fd }
            X.63I r1 = r14.A08     // Catch:{ all -> 0x01fd }
            java.util.ArrayList r0 = r14.A0C     // Catch:{ all -> 0x01fd }
            X.Sxf r3 = new X.Sxf     // Catch:{ all -> 0x01fd }
            r9 = r3
            r10 = r8
            r11 = r7
            r12 = r5
            r13 = r1
            r15 = r14
            r16 = r4
            r17 = r0
            r18 = r6
            r19 = r2
            r20 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01fd }
        L_0x01b7:
            r14.A01 = r3     // Catch:{ all -> 0x01fd }
        L_0x01b9:
            A01(r14)     // Catch:{ all -> 0x01fd }
            r29.unlock()     // Catch:{ all -> 0x0202 }
            r29.unlock()
            return
        L_0x01c3:
            if (r1 == r4) goto L_0x01d1
            r0 = 2
            if (r1 == r0) goto L_0x01ce
            if (r1 == r5) goto L_0x01cb
            goto L_0x01d4
        L_0x01cb:
            java.lang.String r3 = "SIGN_IN_MODE_NONE"
            goto L_0x01d6
        L_0x01ce:
            java.lang.String r3 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01d6
        L_0x01d1:
            java.lang.String r3 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r3 = "UNKNOWN"
        L_0x01d6:
            java.lang.String r2 = "Cannot use sign-in mode: "
            if (r6 == r4) goto L_0x01e6
            r0 = 2
            if (r6 == r0) goto L_0x01e3
            if (r6 == r5) goto L_0x01e0
            goto L_0x01e9
        L_0x01e0:
            java.lang.String r1 = "SIGN_IN_MODE_NONE"
            goto L_0x01eb
        L_0x01e3:
            java.lang.String r1 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01eb
        L_0x01e6:
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01eb
        L_0x01e9:
            java.lang.String r1 = "UNKNOWN"
        L_0x01eb:
            java.lang.String r0 = ". Mode was already set to "
            java.lang.String r0 = X.002.A0u(r2, r1, r0, r3)     // Catch:{ all -> 0x01fd }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01f6:
            java.lang.String r0 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01fd }
        L_0x01fc:
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            r29.unlock()     // Catch:{ all -> 0x0202 }
        L_0x0201:
            throw r0     // Catch:{ all -> 0x0202 }
        L_0x0202:
            r0 = move-exception
            r29.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QpU.A08():void");
    }

    public final void A09() {
        boolean z;
        Lock lock = this.A0G;
        lock.lock();
        try {
            Set set = this.A09.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.A0B.set((Object) null);
                synchronized (basePendingResult.A07) {
                    if (((AnonymousClass63S) basePendingResult.A08.get()) == null || !basePendingResult.A03) {
                        basePendingResult.A04();
                    }
                    z = basePendingResult.A02;
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            C13841TiG tiG = this.A01;
            if (tiG != null) {
                tiG.FOc();
            }
            Set<C10598Rus> set2 = this.A0I.A00;
            for (C10598Rus rus : set2) {
                rus.A02 = null;
                rus.A01 = null;
            }
            set2.clear();
            Queue<C8412Qts> queue = this.A0F;
            for (C8412Qts qts : queue) {
                qts.A0B.set((Object) null);
                qts.A04();
            }
            queue.clear();
            if (this.A01 != null) {
                A0H();
                C11456SVu sVu = this.A0B;
                sVu.A08 = false;
                sVu.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    public final void A0A() {
        C13841TiG tiG = this.A01;
        if (tiG != null) {
            tiG.FOe();
        }
    }

    public final void A0B(AnonymousClass63y r2) {
        this.A0B.A00(r2);
    }

    public final void A0C(AnonymousClass63y r6) {
        C11456SVu sVu = this.A0B;
        AnonymousClass3Qk.A02(r6);
        synchronized (sVu.A03) {
            if (!sVu.A05.remove(r6)) {
                Pxf.A1L("unregisterConnectionCallbacks(): listener ", String.valueOf(r6), " not found", "GmsClientEvents");
            } else if (sVu.A00) {
                sVu.A04.add(r6);
            }
        }
    }

    public final void A0D(AnonymousClass640 r2) {
        this.A0B.A01(r2);
    }

    public final boolean A0F() {
        C13841TiG tiG = this.A01;
        if (tiG == null || !tiG.FOf()) {
            return false;
        }
        return true;
    }

    public final boolean A0G(C13469Taw taw) {
        C13841TiG tiG = this.A01;
        if (tiG == null || !tiG.FOg(taw)) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        boolean z = false;
        if (this.A0L) {
            this.A0L = false;
            C8433QuV quV = this.A0J;
            quV.removeMessages(2);
            z = true;
            quV.removeMessages(1);
            Q67 q67 = this.A00;
            if (q67 != null) {
                q67.A00();
                this.A00 = null;
            }
        }
        return z;
    }

    public final void FOL(ConnectionResult connectionResult) {
        AtomicInteger atomicInteger;
        if (!GooglePlayServicesUtil.A00(this.A05, connectionResult.A01)) {
            A0H();
        }
        if (!this.A0L) {
            C11456SVu sVu = this.A0B;
            Handler handler = sVu.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (sVu.A03) {
                    ArrayList arrayList = sVu.A06;
                    ArrayList A1D = AnonymousClass7TE.A1D(arrayList);
                    atomicInteger = sVu.A07;
                    int i = atomicInteger.get();
                    Iterator it = A1D.iterator();
                    while (it.hasNext()) {
                        AnonymousClass640 r1 = (AnonymousClass640) it.next();
                        if (!sVu.A08 || atomicInteger.get() != i) {
                            break;
                        } else if (arrayList.contains(r1)) {
                            r1.D5m(connectionResult);
                        }
                    }
                }
                sVu.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw AnonymousClass7TE.A0z("onConnectionFailure must only be called on the Handler thread");
        }
    }

    public final void FOO(Bundle bundle) {
        IllegalStateException illegalStateException;
        while (true) {
            Queue queue = this.A0F;
            if (queue.isEmpty()) {
                break;
            }
            A07((C8412Qts) queue.remove());
        }
        C11456SVu sVu = this.A0B;
        Handler handler = sVu.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (sVu.A03) {
                if (!sVu.A00) {
                    handler.removeMessages(1);
                    sVu.A00 = true;
                    ArrayList arrayList = sVu.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList A1D = AnonymousClass7TE.A1D(sVu.A05);
                        AtomicInteger atomicInteger = sVu.A07;
                        int i = atomicInteger.get();
                        Iterator it = A1D.iterator();
                        while (it.hasNext()) {
                            AnonymousClass63y r1 = (AnonymousClass63y) it.next();
                            if (!sVu.A08 || !sVu.A02.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(r1)) {
                                r1.D5e(bundle);
                            }
                        }
                        arrayList.clear();
                        sVu.A00 = false;
                    } else {
                        illegalStateException = Pxe.A0i();
                    }
                } else {
                    illegalStateException = Pxe.A0i();
                }
                throw illegalStateException;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("onConnectionSuccess must only be called on the Handler thread");
    }

    public QpU(Context context, Looper looper, GoogleApiAvailability googleApiAvailability, AnonymousClass63I r7, AnonymousClass643 r8, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock, int i, int i2) {
        C12559Sxk sxk = new C12559Sxk(this);
        this.A0K = sxk;
        this.A05 = context;
        this.A0G = lock;
        this.A0B = new C11456SVu(looper, sxk);
        this.A06 = looper;
        this.A0J = new C8433QuV(looper, this);
        this.A07 = googleApiAvailability;
        this.A0H = i;
        if (i >= 0) {
            this.A02 = Integer.valueOf(i2);
        }
        this.A0E = map;
        this.A0D = map2;
        this.A0C = arrayList;
        this.A09 = new SEZ();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0B.A00((AnonymousClass63y) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.A0B.A01((AnonymousClass640) it2.next());
        }
        this.A0A = r8;
        this.A08 = r7;
    }

    public static int A00(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            AnonymousClass647 r1 = (AnonymousClass647) it.next();
            z2 |= r1.requiresSignIn();
            z3 |= r1.E57();
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    public final void A0E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.A05);
        printWriter.append(str).append("mResuming=").print(this.A0L);
        printWriter.append(" mWorkQueue.size()=").print(this.A0F.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A09.A01.size());
        C13841TiG tiG = this.A01;
        if (tiG != null) {
            tiG.FOd(str, fileDescriptor, printWriter, strArr);
        }
    }
}

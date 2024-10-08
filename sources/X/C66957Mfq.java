package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Mfq  reason: case insensitive filesystem */
public final class C66957Mfq {
    public static C66957Mfq A09;
    public static final C66956Mfp A0A = new Object();
    public long A00;
    public C71068Oan A01;
    public String A02;
    public final Set A03 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentLinkedQueue A04 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A07 = JTQ.A0k();
    public final C70114NxU A08;

    public static final void A00(C66957Mfq mfq) {
        C61073JwB jwB;
        C61073JwB jwB2;
        String str;
        mfq.A01 = null;
        ConcurrentLinkedQueue concurrentLinkedQueue = mfq.A05;
        if (concurrentLinkedQueue.isEmpty() && mfq.A06.isEmpty() && mfq.A04.isEmpty()) {
            mfq.A07.set(false);
        }
        ConcurrentLinkedQueue concurrentLinkedQueue2 = mfq.A04;
        if (DbT.A1b(concurrentLinkedQueue2)) {
            Iterator A1G = AnonymousClass7TE.A1G(concurrentLinkedQueue2);
            do {
                if (A1G.hasNext()) {
                    jwB2 = (C61073JwB) A1G.next();
                    str = jwB2.A01;
                    if (0qQ.A0K(str, mfq.A02)) {
                        concurrentLinkedQueue2.remove(jwB2);
                        A00(mfq);
                    }
                }
            } while (mfq.A03.contains(str));
            concurrentLinkedQueue2.remove(jwB2);
            mfq.A01(str, jwB2.A02, jwB2.A03, (HashMap) jwB2.A00);
            return;
        }
        if (!DbT.A1b(concurrentLinkedQueue) || (jwB = (C61073JwB) concurrentLinkedQueue.poll()) == null) {
            ConcurrentLinkedQueue concurrentLinkedQueue3 = mfq.A06;
            if (DbT.A1b(concurrentLinkedQueue3)) {
                jwB = (C61073JwB) concurrentLinkedQueue3.poll();
                if (jwB != null) {
                    String str2 = jwB.A01;
                    if (!0qQ.A0K(str2, mfq.A02)) {
                        if (!mfq.A03.contains(str2)) {
                            mfq.A01(str2, jwB.A02, jwB.A03, (HashMap) null);
                            return;
                        }
                    }
                }
                A00(mfq);
                return;
            }
            return;
        }
        String str3 = jwB.A01;
        if (!0qQ.A0K(str3, mfq.A02)) {
            if (!mfq.A03.contains(str3)) {
                mfq.A01(str3, jwB.A02, jwB.A03, (HashMap) jwB.A00);
                return;
            }
        }
        A00(mfq);
        if (!A03(mfq, jwB.A01, concurrentLinkedQueue2)) {
            concurrentLinkedQueue2.add(jwB);
        }
        A00(mfq);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0Js] */
    private final void A01(String str, String str2, String str3, HashMap hashMap) {
        C73670Phj phj = new C73670Phj(str, this, 2);
        C59148J8e j8e = new C59148J8e(this, hashMap, str, str2, str3, 0);
        0qQ.A0B(str, 0);
        if (!09i.A0A.A0A(new Object(), (0Jv) null, new C72929PPn(j8e, 4), str)) {
            phj.invoke();
        }
    }

    public static final synchronized boolean A03(C66957Mfq mfq, String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        boolean z;
        synchronized (mfq) {
            z = true;
            if (!concurrentLinkedQueue.isEmpty()) {
                Iterator A1G = AnonymousClass7TE.A1G(concurrentLinkedQueue);
                while (true) {
                    if (A1G.hasNext()) {
                        if (0qQ.A0K(str, ((C61073JwB) A1G.next()).A01)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public final void A04(String str) {
        if (!0qQ.A0K(this.A02, str)) {
            this.A02 = str;
            A02(str, this.A05);
            A02(str, this.A06);
            A02(str, this.A04);
            C71068Oan oan = this.A01;
            if (oan != null && 0qQ.A0K(oan.A0D, str) && oan.A05 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C71068Oan.A01(oan, new C73161PXw(oan, countDownLatch), "SwitchAccount");
                try {
                    countDownLatch.await(AnonymousClass7TE.A0R(2HM.A00(oan.A0C.A01).A17.A00()), TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    0KC.A0E("MultiInstanceSingleBackgroundAccountSyncHandler", "Interrupted while tearing down background account instance on account switch");
                }
            }
        }
    }

    public C66957Mfq(C70114NxU nxU) {
        this.A08 = nxU;
    }

    public static final void A02(String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        Iterator A1G = AnonymousClass7TE.A1G(concurrentLinkedQueue);
        while (A1G.hasNext()) {
            C61073JwB jwB = (C61073JwB) A1G.next();
            if (str.equals(jwB.A01)) {
                concurrentLinkedQueue.remove(jwB);
            }
        }
    }
}

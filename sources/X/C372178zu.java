package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8zu  reason: invalid class name and case insensitive filesystem */
public final class C372178zu {
    public static C372178zu A09;
    public static final C372188zv A0A = new Object();
    public long A00;
    public long A01;
    public C72939PPx A02;
    public String A03;
    public Set A04 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A07 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public static final void A01(C372178zu r11) {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        AnonymousClass65S r7;
        C372198zw r1;
        MailboxCallback mailboxCallback = null;
        C372178zu r5 = r11;
        r11.A02 = null;
        ConcurrentLinkedQueue concurrentLinkedQueue = r11.A06;
        if (concurrentLinkedQueue.isEmpty() && r11.A07.isEmpty() && r11.A05.isEmpty()) {
            r11.A08.set(false);
        }
        ConcurrentLinkedQueue concurrentLinkedQueue2 = r11.A05;
        if (!concurrentLinkedQueue2.isEmpty()) {
            Iterator it = concurrentLinkedQueue2.iterator();
            0qQ.A07(it);
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r1 = (C372198zw) it.next();
                str3 = r1.A02;
                if (0qQ.A0K(str3, r11.A03)) {
                    concurrentLinkedQueue2.remove(r1);
                    break;
                } else if (!r11.A04.contains(str3)) {
                    r7 = r1.A01;
                    if (r7 != null) {
                        r7.A00();
                    }
                    concurrentLinkedQueue2.remove(r1);
                }
            }
            str2 = r1.A03;
            str = r1.A04;
            hashMap = r1.A05;
            mailboxCallback = r1.A00;
            r5.A00(mailboxCallback, r7, str3, str2, str, hashMap);
            return;
        }
        if (!(!concurrentLinkedQueue.isEmpty()) || (r1 = (C372198zw) concurrentLinkedQueue.poll()) == null) {
            ConcurrentLinkedQueue concurrentLinkedQueue3 = r11.A07;
            if (!concurrentLinkedQueue3.isEmpty()) {
                r1 = (C372198zw) concurrentLinkedQueue3.poll();
                if (r1 != null) {
                    str3 = r1.A02;
                    if (!0qQ.A0K(str3, r11.A03)) {
                        if (!r11.A04.contains(str3)) {
                            str2 = r1.A03;
                            str = r1.A04;
                            r7 = null;
                            hashMap = null;
                            r5.A00(mailboxCallback, r7, str3, str2, str, hashMap);
                            return;
                        }
                    }
                }
                A01(r11);
                return;
            }
            return;
        }
        str3 = r1.A02;
        if (!0qQ.A0K(str3, r11.A03)) {
            if (!r11.A04.contains(str3)) {
                r7 = r1.A01;
                if (r7 != null) {
                    r7.A00();
                }
                str2 = r1.A03;
                str = r1.A04;
                hashMap = r1.A05;
                mailboxCallback = r1.A00;
                r5.A00(mailboxCallback, r7, str3, str2, str, hashMap);
                return;
            }
        }
        A01(r11);
        if (!A03(r11, r1.A02, (String) null, concurrentLinkedQueue2)) {
            concurrentLinkedQueue2.add(r1);
        }
        A01(r11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized boolean A03(X.C372178zu r5, java.lang.String r6, java.lang.String r7, java.util.concurrent.ConcurrentLinkedQueue r8) {
        /*
            monitor-enter(r5)
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0035 }
            r4 = 1
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L_0x0033
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x0035 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0035 }
        L_0x0012:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0035 }
            X.8zw r1 = (X.C372198zw) r1     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0035 }
            boolean r0 = X.0qQ.A0K(r6, r0)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0012
            if (r7 == 0) goto L_0x0031
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x0035 }
            boolean r0 = X.0qQ.A0K(r0, r7)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0031
            r4 = 0
        L_0x0031:
            monitor-exit(r5)
            return r4
        L_0x0033:
            monitor-exit(r5)
            return r3
        L_0x0035:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372178zu.A03(X.8zu, java.lang.String, java.lang.String, java.util.concurrent.ConcurrentLinkedQueue):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0Js] */
    private final void A00(MailboxCallback mailboxCallback, AnonymousClass65S r11, String str, String str2, String str3, HashMap hashMap) {
        C72939PPx pPx = new C72939PPx(mailboxCallback, r11, str2, str3, hashMap);
        this.A02 = pPx;
        if (!09i.A0A.A0A(new Object(), new AfH(this), pPx, str)) {
            0KC.A0C("IgMsysMultiInstancesManager", "Failed to login background account");
            if (r11 != null) {
                r11.A05("login_failed");
            }
            A01(this);
        }
    }

    public final void A04(MailboxCallback mailboxCallback, AnonymousClass65S r16, String str, HashMap hashMap) {
        boolean z;
        String str2;
        C72939PPx pPx = this.A02;
        if (pPx != null) {
            z = pPx.A0O.get();
        } else {
            z = false;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A06;
        String str3 = str;
        AnonymousClass65S r9 = r16;
        if (!A03(this, str3, (String) null, concurrentLinkedQueue)) {
            C72939PPx pPx2 = this.A02;
            if (pPx2 != null) {
                UserSession userSession = pPx2.A03;
                if (userSession != null) {
                    str2 = userSession.A06;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (!0qQ.A0K(str2, str3) || z) {
                if (!A03(this, str3, (String) null, this.A05)) {
                    AnonymousClass65T r1 = r9.A02;
                    if (r1.A06 && r1.A03) {
                        UserFlowLogger userFlowLogger = r1.A05;
                        long j = r1.A04;
                        AnonymousClass9J6 r3 = AnonymousClass65T.A0C;
                        userFlowLogger.flowMarkPoint(j, r3.A01);
                        userFlowLogger.flowAnnotateWithCrucialData(j, "c", r3.A00);
                    }
                    String obj = UUID.randomUUID().toString();
                    0qQ.A07(obj);
                    concurrentLinkedQueue.add(new C372198zw(mailboxCallback, r9, str3, obj, AnonymousClass000.A00(3823), hashMap));
                } else {
                    r9.A05("exists_notification_in_pending_foreground_teardown_queue");
                }
                ConcurrentLinkedQueue concurrentLinkedQueue2 = this.A07;
                if (A03(this, str3, (String) null, concurrentLinkedQueue2)) {
                    Iterator it = concurrentLinkedQueue2.iterator();
                    0qQ.A07(it);
                    while (it.hasNext()) {
                        C372198zw r12 = (C372198zw) it.next();
                        if (str3.equals(r12.A02)) {
                            concurrentLinkedQueue2.remove(r12);
                        }
                    }
                }
                if (this.A02 == null && !this.A08.getAndSet(true)) {
                    A01(this);
                    return;
                }
                return;
            }
        }
        r9.A05("exists_notification_in_queue");
    }

    public final void A05(String str) {
        String str2;
        if (!0qQ.A0K(this.A03, str)) {
            this.A03 = str;
            A02(str, this.A06);
            A02(str, this.A07);
            A02(str, this.A05);
            C72939PPx pPx = this.A02;
            if (pPx != null) {
                UserSession userSession = pPx.A03;
                if (userSession != null) {
                    str2 = userSession.A06;
                } else {
                    str2 = null;
                }
                if (0qQ.A0K(str2, str)) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    C72940PPy pPy = new C72940PPy(pPx, countDownLatch);
                    boolean z = pPx.A0A;
                    String A002 = C66579MXk.A00(618);
                    if (z) {
                        C72939PPx.A04(pPx, pPy, A002);
                    } else {
                        C72939PPx.A03(pPx, pPy, A002);
                    }
                    UserSession userSession2 = pPx.A03;
                    if (userSession2 != null) {
                        try {
                            if (!countDownLatch.await(((Number) 2HM.A00(userSession2).A17.A00()).longValue(), TimeUnit.MILLISECONDS)) {
                                0wj.A01.AEf("MsysMultiInstancesBackgroundUserSessionOperationPayload: Timeout deactivate background account instance during switch account", 20134884).report();
                            }
                        } catch (InterruptedException unused) {
                            0KC.A0E(C66579MXk.A00(248), C66579MXk.A00(578));
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
    }

    public final void A06(String str) {
        this.A04.remove(str);
        if (this.A02 == null && (!this.A05.isEmpty())) {
            A01(this);
        }
    }

    public static final void A02(String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        Iterator it = concurrentLinkedQueue.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            C372198zw r1 = (C372198zw) it.next();
            if (str.equals(r1.A02)) {
                concurrentLinkedQueue.remove(r1);
                AnonymousClass65S r0 = r1.A01;
                if (r0 != null) {
                    AnonymousClass65T r12 = r0.A02;
                    if (r12.A06 && r12.A03) {
                        UserFlowLogger userFlowLogger = r12.A05;
                        long j = r12.A04;
                        AnonymousClass9J6 r13 = AnonymousClass65T.A0D;
                        userFlowLogger.flowMarkPoint(j, r13.A01);
                        userFlowLogger.flowAnnotateWithCrucialData(j, "c", r13.A00);
                    }
                }
            }
        }
    }
}

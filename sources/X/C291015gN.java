package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5gN  reason: invalid class name and case insensitive filesystem */
public final class C291015gN extends 1P0 {
    public final /* synthetic */ BanyanCoordinator A00;

    public C291015gN(BanyanCoordinator banyanCoordinator) {
        this.A00 = banyanCoordinator;
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [X.1qK, java.lang.Object] */
    private final void A00(C290995gL r29) {
        InterruptedException th;
        int i;
        boolean z;
        C290935gF A02;
        InterruptedException th2;
        C290935gF A002;
        C290935gF A022;
        List list;
        try {
            BanyanCoordinator banyanCoordinator = this.A00;
            ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (writeLock.tryLock(1, timeUnit)) {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock2 = banyanCoordinator.A0L;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock2.readLock();
                    int i2 = 0;
                    if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock2.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                    writeLock2.lock();
                    try {
                        HashMap hashMap = banyanCoordinator.A0K;
                        if (!hashMap.isEmpty()) {
                            C290995gL r7 = r29;
                            Iterator it = r7.A03.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (0qQ.A0K(((C290935gF) it.next()).A03, "direct_ibc_inbox_invitations")) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (!r7.A03.isEmpty() && ((C290935gF) r7.A03.get(0)).A02 != null) {
                                C290975gJ A003 = C290965gI.A00(banyanCoordinator.A0I);
                                String str = ((C290935gF) r7.A03.get(0)).A02;
                                if (str != null) {
                                    List A03 = new 11S(",").A03(str);
                                    if (!A03.isEmpty()) {
                                        ListIterator listIterator = A03.listIterator(A03.size());
                                        while (true) {
                                            if (listIterator.hasPrevious()) {
                                                if (((String) listIterator.previous()).length() != 0) {
                                                    list = 00k.A0d(A03, listIterator.nextIndex() + 1);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    list = 0sn.A00;
                                    String str2 = ((String[]) list.toArray(new String[0]))[0];
                                    ArrayList arrayList = new ArrayList();
                                    for (C290935gF r0 : r7.A03) {
                                        String str3 = r0.A03;
                                        if (str3 != null) {
                                            arrayList.add(str3);
                                        }
                                    }
                                    A003.A01(str2, r7.A01(), (String[]) arrayList.toArray(new String[0]), false);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            C290935gF A004 = r7.A00("direct_ibc_nullstate");
                            if (A004 != null) {
                                C70935OSi.A00(C69968Nv8.A00(banyanCoordinator.A0I), A004.A02, "banyan_response_received", A004.A04.size());
                            }
                            UserSession userSession = banyanCoordinator.A0I;
                            0Tu r10 = 0Tu.A05;
                            boolean A06 = 182.A06(r10, userSession, 36315958533361489L);
                            boolean A062 = 182.A06(r10, userSession, 36317521902245140L);
                            double A005 = 182.A00(r10, userSession, 37161946832437426L);
                            if (reentrantReadWriteLock.writeLock().tryLock(1, timeUnit)) {
                                try {
                                    C290675fi r11 = banyanCoordinator.A07;
                                    r11.A02.A00();
                                    for (String str4 : r11.A07.keySet()) {
                                        if (!((!0qQ.A0K(str4, "direct_user_search_nullstate") && !0qQ.A0K(str4, "direct_user_search_keypressed")) || (A002 = r7.A00(str4)) == null || (A022 = r11.A02(str4)) == null)) {
                                            if (A062) {
                                                float f = 0.0f;
                                                for (Object next : A002.A04.values()) {
                                                    0qQ.A07(next);
                                                    if (((C290955gH) next).A00 == 0.0d) {
                                                        f += 1.0f;
                                                    }
                                                }
                                                if (((double) (f / ((float) A002.A04.values().size()))) > A005) {
                                                    r7.A03.remove(A002);
                                                    r7.A03.add(A022);
                                                }
                                            }
                                            if (A06) {
                                                OOd.A00(A022, A002);
                                                r7.A03.remove(A002);
                                                r7.A03.add(A002);
                                            } else {
                                                r7.A03.add(A022);
                                                r7.A04.add(str4);
                                            }
                                        }
                                    }
                                    reentrantReadWriteLock.writeLock().unlock();
                                    if (z && r7.A00("direct_ibc_inbox_invitations") == null && (A02 = banyanCoordinator.A07.A02("direct_ibc_inbox_invitations")) != null) {
                                        A02.A04 = new HashMap();
                                        A02.A01 = System.currentTimeMillis() + A02.A00;
                                    }
                                    C290675fi r3 = banyanCoordinator.A07;
                                    r3.A03(r7);
                                    02m r2 = 02m.A0p;
                                    if (r3.A02("reshare_share_sheet") != null) {
                                        r2.markerPoint(145755797, "BANYAN_RESHARE_SHEET_RESPONSE_PARSED");
                                    }
                                    C290935gF A023 = r3.A02("direct_ibc_nullstate");
                                    if (A023 != null) {
                                        C70935OSi.A00(C69968Nv8.A00(userSession), A023.A02, "banyan_response_parsed", A023.A04.size());
                                    }
                                    C290855g4 A006 = C290825g1.A00(userSession);
                                    C290655fg r8 = r3.A02;
                                    r8.A00();
                                    ArrayList arrayList2 = new ArrayList(r3.A07.values());
                                    C290875g6 r22 = A006.A00;
                                    if (r22 != null) {
                                        C290855g4.A02((Boolean) null, "disk_persist_banyan_start", arrayList2);
                                        r22.A00.add("banyan");
                                    }
                                    C293635l6 r02 = new C293635l6(banyanCoordinator, "banyan");
                                    r8.A00();
                                    C290675fi.A00(r3, r02);
                                    if (z) {
                                        AnonymousClass1Nd.A00(userSession).A00(new Object());
                                    }
                                    Iterator it2 = hashMap.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next2 = it2.next();
                                        0qQ.A07(next2);
                                        Set set = (Set) next2;
                                        if (!r7.A03.isEmpty() && 00k.A0u(set, ((C290935gF) r7.A03.get(0)).A03)) {
                                            hashMap.remove(set);
                                            break;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    reentrantReadWriteLock.writeLock().unlock();
                                }
                            } else {
                                th2 = new InterruptedException("Failed to claim lock after 1 seconds");
                                throw th2;
                            }
                        }
                    } catch (InterruptedException e) {
                        0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
                    } catch (Throwable th4) {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock2.unlock();
                        throw th4;
                    }
                    banyanCoordinator.A02 = null;
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock2.unlock();
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th5) {
                    th = th5;
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e2) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r19) {
        /*
            r18 = this;
            r0 = 1723367393(0x66b87fe1, float:4.356372E23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            r0 = r19
            X.0qQ.A0B(r0, r7)
            java.lang.Object r12 = r0.A00()
            X.5gL r12 = (X.C290995gL) r12
            r11 = r18
            if (r12 == 0) goto L_0x00ff
            com.instagram.banyan.BanyanCoordinator r10 = r11.A00
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r10.A0L
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r17 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L_0x0032
            int r4 = r1.getReadHoldCount()
            r0 = 0
        L_0x002a:
            if (r0 >= r4) goto L_0x0033
            r17.unlock()
            int r0 = r0 + 1
            goto L_0x002a
        L_0x0032:
            r4 = 0
        L_0x0033:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r16 = r1.writeLock()
            r16.lock()
            java.util.HashMap r9 = r10.A0K     // Catch:{ all -> 0x00e8 }
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x0044:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00df
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x00e8 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x00e8 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ all -> 0x00e8 }
            java.util.List r0 = X.00k.A0X(r8)     // Catch:{ all -> 0x00e8 }
            java.util.Set r13 = X.00k.A0k(r0)     // Catch:{ all -> 0x00e8 }
            java.util.List r1 = r12.A03     // Catch:{ all -> 0x00e8 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x0044
            java.lang.Object r14 = r1.get(r7)     // Catch:{ all -> 0x00e8 }
            X.5gF r14 = (X.C290935gF) r14     // Catch:{ all -> 0x00e8 }
            java.lang.String r2 = r14.A02     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00d1
            com.instagram.common.session.UserSession r0 = r10.A0I     // Catch:{ all -> 0x00e8 }
            X.5gJ r6 = X.C290965gI.A00(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = ","
            X.11S r0 = new X.11S     // Catch:{ all -> 0x00e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e8 }
            java.util.List r1 = r0.A03(r2)     // Catch:{ all -> 0x00e8 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00ce
            int r0 = r1.size()     // Catch:{ all -> 0x00e8 }
            java.util.ListIterator r2 = r1.listIterator(r0)     // Catch:{ all -> 0x00e8 }
        L_0x008c:
            boolean r0 = r2.hasPrevious()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r2.previous()     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00e8 }
            int r0 = r0.length()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x008c
            int r0 = r2.nextIndex()     // Catch:{ all -> 0x00e8 }
            int r0 = r0 + 1
            java.util.List r1 = X.00k.A0d(r1, r0)     // Catch:{ all -> 0x00e8 }
        L_0x00a8:
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x00e8 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00e8 }
            r3 = r0[r7]     // Catch:{ all -> 0x00e8 }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x00e8 }
            java.lang.Object[] r2 = r13.toArray(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x00e8 }
            java.util.HashMap r1 = r12.A01()     // Catch:{ all -> 0x00e8 }
            r0 = 1
            r6.A01(r3, r1, r2, r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r14.A03     // Catch:{ all -> 0x00e8 }
            boolean r0 = X.00k.A0u(r13, r0)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x0044
            r9.remove(r8)     // Catch:{ all -> 0x00e8 }
            goto L_0x00df
        L_0x00ce:
            X.0sn r1 = X.0sn.A00     // Catch:{ all -> 0x00e8 }
            goto L_0x00a8
        L_0x00d1:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e8 }
            r0 = 593111574(0x235a2a16, float:1.1826716E-17)
            X.AnonymousClass0fD.A0A(r0, r5)     // Catch:{ all -> 0x00e8 }
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00df:
            r0 = 0
        L_0x00e0:
            if (r0 >= r4) goto L_0x00fc
            r17.lock()
            int r0 = r0 + 1
            goto L_0x00e0
        L_0x00e8:
            r1 = move-exception
            r0 = 0
        L_0x00ea:
            if (r0 >= r4) goto L_0x00f2
            r17.lock()
            int r0 = r0 + 1
            goto L_0x00ea
        L_0x00f2:
            r16.unlock()
            r0 = -2119275336(0xffffffff81ae6cb8, float:-6.407351E-38)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        L_0x00fc:
            r16.unlock()
        L_0x00ff:
            com.instagram.banyan.BanyanCoordinator r6 = r11.A00
            com.instagram.common.session.UserSession r0 = r6.A0I
            X.5g4 r4 = X.C290825g1.A00(r0)
            int r1 = r6.A00
            int r3 = r6.A06
            int r1 = r1 - r3
            java.util.List r2 = java.util.Collections.emptyList()
            X.0qQ.A07(r2)
            X.5g6 r0 = r4.A00
            if (r0 == 0) goto L_0x012e
            r0.A03 = r7
            if (r1 > 0) goto L_0x0122
            java.util.List r1 = r0.A01
            java.lang.String r0 = "banyan_fetch_failed"
            r1.add(r0)
        L_0x0122:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "banyan_fetch_end"
            X.C290855g4.A02(r1, r0, r2)
            X.C290855g4.A00(r4)
        L_0x012e:
            int r0 = r6.A00
            if (r0 >= r3) goto L_0x0142
            com.instagram.banyan.BanyanCoordinator.A04(r6)
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
        L_0x013b:
            r0 = -1428328776(0xffffffffaadd6eb8, float:-3.9334313E-13)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0142:
            r0 = 0
            r6.A02 = r0
            goto L_0x013b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291015gN.onFail(X.4dm):void");
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(503888526);
        BanyanCoordinator banyanCoordinator = this.A00;
        if (banyanCoordinator.A02 != null) {
            C290855g4 A002 = C290825g1.A00(banyanCoordinator.A0I);
            if (A002.A00 == null) {
                C290855g4.A01(A002);
            }
            C290875g6 r1 = A002.A00;
            if (r1 != null) {
                r1.A03 = true;
                02m.A0p.markerPoint(135806945, "banyan_fetch_start");
            }
        }
        AnonymousClass0fD.A0A(398734232, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1697356403);
        C290995gL r7 = (C290995gL) obj;
        int A032 = AnonymousClass0fD.A03(1937769772);
        0qQ.A0B(r7, 0);
        if (!182.A06(0Tu.A05, this.A00.A0I, 36312230500762634L)) {
            A00(r7);
        }
        AnonymousClass0fD.A0A(745767349, A032);
        AnonymousClass0fD.A0A(-1697671386, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(879259491);
        C290995gL r8 = (C290995gL) obj;
        int A032 = AnonymousClass0fD.A03(-304816237);
        0qQ.A0B(r8, 0);
        if (!r8.A03.isEmpty()) {
            C290855g4 A002 = C290825g1.A00(this.A00.A0I);
            List list = r8.A03;
            C290875g6 r0 = A002.A00;
            if (r0 != null) {
                r0.A03 = false;
                C290855g4.A02(true, "banyan_fetch_end", list);
                C290855g4.A00(A002);
            }
        }
        if (182.A06(0Tu.A05, this.A00.A0I, 36312230500762634L)) {
            A00(r8);
        }
        AnonymousClass0fD.A0A(379969795, A032);
        AnonymousClass0fD.A0A(819503917, A03);
    }
}

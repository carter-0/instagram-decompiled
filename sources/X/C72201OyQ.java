package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.OyQ  reason: case insensitive filesystem */
public final class C72201OyQ implements AnonymousClass0lh {
    public long A00 = -1;
    public final 1wn A01;
    public final UserSession A02;
    public final OZM A03;
    public final OTX A04;
    public final OTY A05;
    public final OI7 A06;
    public final OO2 A07;
    public final Object A08 = new Object();
    public final OL8 A09;
    public final 2Dm A0A;
    public final C70808OMd A0B;
    public final AnonymousClass65S A0C;

    public static final void A00(C72201OyQ oyQ) {
        long j;
        UserSession userSession = oyQ.A02;
        AnonymousClass1Nd.A00(userSession).A02(oyQ.A01, AnonymousClass2KZ.class);
        synchronized (oyQ.A08) {
            2ED r2 = oyQ.A0A.A0C;
            ReentrantReadWriteLock reentrantReadWriteLock = r2.A0G;
            if (r2.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    j = r2.A00.A05;
                    readLock.unlock();
                } catch (Throwable th) {
                    th = th;
                    readLock.unlock();
                    throw th;
                }
            } else {
                synchronized (r2.A0D) {
                    try {
                        j = r2.A00.A05;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            oyQ.A00 = j;
        }
        if (j != -1 && 182.A06(0Tu.A05, userSession, 36327666613500518L)) {
            MYY.A01("ArmadilloExpressSyncManager.performCursorRewinding").execute(new C73232PZB(oyQ, j));
        }
    }

    public static final void A01(C72201OyQ oyQ, long j) {
        int i;
        synchronized (oyQ.A08) {
            oyQ.A00 = j;
            2ED r6 = oyQ.A0A.A0C;
            ReentrantReadWriteLock reentrantReadWriteLock = r6.A0G;
            if (r6.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    r6.A00.A05 = j;
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                } catch (Throwable th) {
                    th = th;
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            } else {
                synchronized (r6.A0D) {
                    try {
                        r6.A00.A05 = j;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        }
    }

    public static final void A02(C72201OyQ oyQ, String str, List list, long j) {
        ArrayList arrayList;
        C254703su r1;
        String str2;
        String A0g;
        String str3;
        AnonymousClass3U9 r0;
        C72201OyQ oyQ2 = oyQ;
        C71033OZu oZu = oyQ2.A07.A01;
        C71033OZu oZu2 = oZu;
        oZu.A02(str, "process_start");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C69615Nox nox = (C69615Nox) it.next();
            if (nox instanceof C68981NcC) {
                OI7 oi7 = oyQ2.A06;
                C68981NcC ncC = (C68981NcC) nox;
                0qQ.A0B(ncC, 0);
                UserSession userSession = oi7.A01;
                0Tu r6 = 0Tu.A05;
                if (!(182.A01(r6, userSession, 36600366979813236L) == 0 || 182.A01(r6, userSession, 36600366979878773L) == 0)) {
                    List list2 = oi7.A0A;
                    list2.add(C51968G9o.A0u());
                    if (((long) list2.size()) > 182.A01(r6, userSession, 36600366979813236L)) {
                        list2.remove(0);
                    }
                    if (((long) list2.size()) >= 182.A01(r6, userSession, 36600366979813236L) && AnonymousClass7TE.A0R(00k.A0K(list2)) - AnonymousClass7TE.A0R(00k.A0I(list2)) < 182.A01(r6, userSession, 36600366979878773L)) {
                        oi7.A00 = true;
                    }
                }
                if (oi7.A00) {
                    oi7.A09.add(ncC);
                    0no r3 = oi7.A03;
                    0ng r2 = oi7.A02;
                    r3.A02(r2);
                    r3.A01(r2, 182.A01(r6, userSession, 36600366979944310L));
                } else if (ncC instanceof C68978Nc9) {
                    C68978Nc9 nc9 = (C68978Nc9) ncC;
                    AnonymousClass2Ep r32 = nc9.A01;
                    C254703su r5 = nc9.A00;
                    if (r5.A2P && !r32.CVE()) {
                        2Dr r12 = oi7.A05;
                        DirectThreadKey BJy = r32.BJy();
                        2Dr r13 = r12;
                        synchronized (r13) {
                            AnonymousClass48S A0P = r13.A0P(BJy);
                            if (!(A0P == null || (r0 = A0P.A0I) == null)) {
                                r0.A0L(true);
                            }
                        }
                    }
                    String A0f = r5.A0f();
                    if (A0f != null) {
                        2Dm r22 = oi7.A05;
                        if (r22.BRx(r32.BJy(), 2FW.A1M, A0f) != null) {
                            r22.EE5(r32.BJy(), (String) null, A0f);
                        }
                    }
                    oi7.A06.A00(str, (List) null, 7021, 0);
                    2Dm r23 = oi7.A05;
                    r23.A9h(r5, r32.BJy(), true, false);
                    if (r5.A01 > 0) {
                        C331247Qd.A00(userSession, r32, r23, r23.Bm7(r32.BJy(), r5.A0g()));
                    }
                } else if (ncC instanceof C68979NcA) {
                    C68979NcA ncA = (C68979NcA) ncC;
                    AnonymousClass2Ep r16 = ncA.A00;
                    String str4 = ncA.A01;
                    DirectThreadKey BJy2 = r16.BJy();
                    if (182.A06(r6, userSession, 2342164525433824748L)) {
                        arrayList = oi7.A05.Bm7(BJy2, str4);
                    } else {
                        arrayList = null;
                    }
                    2Dm r62 = oi7.A05;
                    C254703su BRy = r62.BRy(r16.BJy(), str4);
                    if (BRy != null) {
                        AnonymousClass0eM r02 = C71105Ocj.A05;
                        C71105Ocj A002 = C69851NtF.A00(userSession);
                        List A012 = C71023OYz.A00.A01(BRy);
                        0qQ.A0B(A012, 0);
                        Iterator it2 = A012.iterator();
                        while (it2.hasNext()) {
                            C71105Ocj.A02(A002, AnonymousClass7TE.A18(it2), true);
                        }
                    }
                    List Bk4 = r62.Bk4(BJy2, true);
                    C254703su r14 = (C254703su) 00k.A0L(Bk4);
                    if (Bk4.size() > 1) {
                        r1 = (C254703su) Bk4.get(Bk4.size() - 2);
                    } else {
                        r1 = null;
                    }
                    if (r14 != null) {
                        str2 = r14.A0f();
                    } else {
                        str2 = null;
                    }
                    if (0qQ.A0K(str2, str4)) {
                        r14 = r1;
                    }
                    if (!(r14 == null || (A0g = r14.A0g()) == null || (str3 = BJy2.A00) == null)) {
                        C66665MaY A003 = C66669Mac.A00(userSession, r14.A0M());
                        0qQ.A0B(A003, 1);
                        1OS r142 = new 1OS(A003);
                        r142.A01 = "";
                        r142.A02 = str3;
                        r142.A01 = A0g;
                        r142.A00 = 0;
                        r142.A03 = true;
                        r142.A04 = false;
                        OC0 oc0 = oi7.A04;
                        1Ou r03 = oc0.A00;
                        if (r03 == null) {
                            r03 = 1Ou.A01(oc0.A01);
                            oc0.A00 = r03;
                        }
                        if (r03 == null) {
                            0qQ.A0F("mutationManager");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        r03.A0A(r142);
                    }
                    oi7.A06.A00(str, (List) null, 7022, 0);
                    r62.EE5(BJy2, (String) null, str4);
                    if (arrayList != null) {
                        C331247Qd.A00(userSession, r16, r62, arrayList);
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        }
        if (182.A06(0Tu.A05, oyQ2.A02, 36327666613434981L)) {
            synchronized (oyQ2.A08) {
                long j2 = j;
                if (oyQ2.A00 < j) {
                    A01(oyQ2, j2);
                }
            }
        }
        oZu2.A02(str, "process_end");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        if (r0.equals(r13) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r30, X.C69405Nkj r31, java.lang.String r32, java.lang.String r33, int r34, long r35, long r37, long r39, long r41, boolean r43) {
        /*
            r29 = this;
            r0 = 8
            r11 = r31
            X.0qQ.A0B(r11, r0)
            r5 = r29
            X.OMd r2 = r5.A0B
            com.instagram.common.session.UserSession r0 = r5.A02
            X.0BQ r0 = X.AnonymousClass0BO.A00(r0)
            boolean r0 = r0.CKD()
            if (r0 == 0) goto L_0x010f
            r0 = 1
        L_0x0019:
            java.util.List r1 = X.C66582MXn.A10(r0)
            r0 = 7039(0x1b7f, float:9.864E-42)
            r3 = 0
            r13 = r32
            r2.A00(r13, r1, r0, r3)
            X.OO2 r4 = r5.A07
            java.lang.String r0 = "message"
            r1 = r43
            r4.A02(r13, r0, r1)
            X.OZM r12 = r5.A03
            X.2Dm r6 = r12.A03
            r0 = r6
            X.2Dr r0 = (X.2Dr) r0
            X.1bC r0 = r0.A0H
            boolean r0 = r0.A0F
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "RenderOperationAsync"
            r6.CnE(r0)
            X.OMd r2 = r12.A05
            r1 = 0
            r0 = 413(0x19d, float:5.79E-43)
            r2.A00(r13, r1, r0, r3)
        L_0x0048:
            r2 = r37
            X.3U9 r21 = r6.B34(r2)
            r10 = r30
            r14 = r33
            r15 = r39
            r17 = r41
            if (r21 != 0) goto L_0x00fc
            X.65S r9 = r12.A06
            X.65V r6 = r9.A01
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x007c
            if (r33 == 0) goto L_0x007c
            java.lang.Long r0 = X.AnonymousClass65V.A00(r6, r14)
            if (r0 == 0) goto L_0x007c
            long r0 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r8 = r6.A00
            X.9J6 r7 = X.AnonymousClass65V.A08
            java.lang.String r6 = r7.A01
            r8.flowMarkPoint(r0, r6)
            java.lang.String r7 = r7.A00
            java.lang.String r6 = "c"
            r8.flowAnnotateWithCrucialData(r0, r6, r7)
        L_0x007c:
            X.65T r1 = r9.A02
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x009e
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x00f5
            r1.A01 = r13
        L_0x008c:
            com.facebook.quicklog.reliability.UserFlowLogger r8 = r1.A05
            long r0 = r1.A04
            X.9J6 r7 = X.AnonymousClass65T.A0O
            java.lang.String r6 = r7.A01
            r8.flowMarkPoint(r0, r6)
            java.lang.String r7 = r7.A00
            java.lang.String r6 = "c"
            r8.flowAnnotateWithCrucialData(r0, r6, r7)
        L_0x009e:
            X.O5t r9 = new X.O5t
            r9.<init>()
            X.OO2 r0 = r12.A04
            X.OZu r1 = r0.A01
            java.lang.String r0 = "thread_fetch_in_render_start"
            r1.A02(r13, r0)
            X.OL8 r0 = r12.A02
            com.instagram.direct.perf.constants.ThreadFetchReason r19 = com.instagram.direct.perf.constants.ThreadFetchReason.AE_MISSING_THREAD_AT_MESSAGE_SYNC_OP_RENDERER
            X.Pmu r8 = new X.Pmu
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            r22 = r34
            r18 = r0
            r20 = r13
            r21 = r8
            r23 = r2
            r25 = r15
            r18.A00(r19, r20, r21, r22, r23, r25)
            X.1GK r3 = r9.A00
        L_0x00c6:
            X.OZu r2 = r4.A01
            java.lang.String r0 = "render_start"
            r2.A02(r13, r0)
            r1 = 1
            X.Oyl r0 = new X.Oyl
            r0.<init>(r5, r13, r1)
            X.1GK r1 = r3.A03(r0)
            X.Oyo r0 = new X.Oyo
            r22 = r35
            r17 = r10
            r18 = r11
            r19 = r5
            r20 = r13
            r21 = r14
            r24 = r15
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            r1.A03(r0)
            java.lang.String r0 = "dispatch_end"
            r2.A02(r13, r0)
            return
        L_0x00f5:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x009e
            goto L_0x008c
        L_0x00fc:
            r19 = r10
            r20 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            r25 = r15
            r27 = r17
            X.1GK r3 = X.OZM.A00(r19, r20, r21, r22, r23, r24, r25, r27)
            goto L_0x00c6
        L_0x010f:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72201OyQ.A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.Nkj, java.lang.String, java.lang.String, int, long, long, long, long, boolean):void");
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A02).A02(this.A01, AnonymousClass2KZ.class);
    }

    public C72201OyQ(UserSession userSession) {
        this.A02 = userSession;
        OO2 A002 = O0F.A00(userSession);
        this.A07 = A002;
        C70808OMd A003 = O0G.A00(userSession);
        this.A0B = A003;
        AnonymousClass65S A004 = AnonymousClass6ED.A00(userSession);
        this.A0C = A004;
        2Dr A005 = 2L2.A00(userSession);
        this.A0A = A005;
        OL8 ol8 = new OL8(userSession, A003);
        this.A09 = ol8;
        this.A03 = new OZM(userSession, ol8, A005, A002, A003, A004);
        this.A04 = new OTX(userSession, ol8, A005, A003);
        this.A05 = new OTY(userSession, ol8, A003);
        this.A06 = new OI7(userSession, A005, A003, A004);
        C71932OtG A006 = C71932OtG.A00(this, 32);
        this.A01 = A006;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36327666613369444L)) {
            AnonymousClass1Nd.A00(userSession).A01(A006, AnonymousClass2KZ.class);
            if (A005.A0H.A0F) {
                A00(this);
            }
        }
    }
}

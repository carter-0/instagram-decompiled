package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7IG  reason: invalid class name */
public final class AnonymousClass7IG {
    public MessageIdentifier A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass7IA A03;
    public final AnonymousClass7IF A04;
    public final PendingMediaStore A05;
    public final AnonymousClass7IH A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 0));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 1));
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();

    public AnonymousClass7IG(Context context, UserSession userSession, AnonymousClass7IA r5, AnonymousClass7IF r6, PendingMediaStore pendingMediaStore) {
        0qQ.A0B(pendingMediaStore, 3);
        0qQ.A0B(r6, 4);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = pendingMediaStore;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = new AnonymousClass7IH(context);
        0nA.A0D(context);
    }

    private final void A03(C53401GnY gnY, Long l, List list, boolean z, boolean z2) {
        List list2 = list;
        C53401GnY gnY2 = gnY;
        Long l2 = l;
        boolean z3 = z;
        boolean z4 = z2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C60926Jtk) it.next()).A03) {
                    0nY.A00().ATE(new KJC(gnY2, this, l2, list2, z3, z4));
                    return;
                }
            }
        }
        A02(gnY2, this, l2, list2, z3, z4);
    }

    public final void A05(C53401GnY gnY, MessageIdentifier messageIdentifier, C381779cJ r7, Long l, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 0);
        C71012OYk A002 = C63234Ktf.A00(this.A02);
        C71012OYk.A01(A002, new MJ3(list.size(), 25, A002));
        A04(gnY, messageIdentifier, r7, l, list, z, z2);
    }

    private final void A00(C53401GnY gnY, Medium medium, C381779cJ r21, AnonymousClass3Q2 r22, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z, boolean z2) {
        0eP r1;
        if (z2) {
            UserSession userSession = this.A02;
            0Tu r2 = 0Tu.A05;
            r1 = new 0eP(Integer.valueOf((int) 182.A01(r2, userSession, 36611641261037812L)), Integer.valueOf((int) 182.A01(r2, userSession, 36611641260972275L)));
        } else {
            r1 = new 0eP(0, 0);
        }
        int intValue = ((Number) r1.A00).intValue();
        int intValue2 = ((Number) r1.A01).intValue();
        Medium medium2 = medium;
        String str2 = medium2.A0X;
        Context context = this.A01;
        UserSession userSession2 = this.A02;
        M0D m0d = new M0D(gnY, medium2, this, r21, r22, l, str, concurrentLinkedQueue, i, i2, z);
        0qQ.A0B(str2, 0);
        C39908AIz.A05(context, userSession2, new RBZ(str2, intValue, intValue2), m0d);
    }

    public static final void A01(C53401GnY gnY, AnonymousClass7IG r3, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = r3.A09;
            AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(str);
            if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
                11Z.A02(new M9Y(gnY, r3, l, concurrentLinkedQueue));
                concurrentHashMap.remove(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r0 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C53401GnY r40, com.instagram.model.direct.messageid.MessageIdentifier r41, X.C381779cJ r42, java.lang.Long r43, java.util.List r44, boolean r45, boolean r46) {
        /*
            r39 = this;
            r12 = r39
            r9 = r40
            java.util.concurrent.ConcurrentHashMap r0 = r12.A09
            r0.clear()
            r1 = 0
            r13 = r42
            if (r42 == 0) goto L_0x0172
            java.lang.String r2 = r13.A06
        L_0x0010:
            java.lang.String r0 = "once"
            boolean r0 = X.0qQ.A0K(r2, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0026
            if (r42 == 0) goto L_0x001d
            java.lang.String r1 = r13.A06
        L_0x001d:
            java.lang.String r0 = "replayable"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0 = r41
            r15 = r43
            r36 = r44
            r20 = r45
            r32 = r46
            if (r41 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            r12.A00 = r0
            r33 = r12
            r34 = r9
            r35 = r15
            r37 = r20
            r38 = r32
            r33.A03(r34, r35, r36, r37, r38)
        L_0x0044:
            return
        L_0x0045:
            int r0 = r36.size()
            if (r0 <= r2) goto L_0x00e0
            if (r1 == 0) goto L_0x00e0
            com.instagram.common.session.UserSession r3 = r12.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316448158650743(0x81059e00001177, double:3.0300062779053037E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00e0
            X.7IA r1 = r12.A03
            int r0 = r36.size()
            boolean r0 = r1.CbZ(r0)
            if (r0 == 0) goto L_0x00e0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r36.iterator()
            r7 = 0
            r5 = 0
            r4 = 0
            r6 = 0
        L_0x0075:
            boolean r0 = r8.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00ca
            int r1 = r7 + 1
            java.lang.Object r0 = r8.next()
            X.Jtk r0 = (X.C60926Jtk) r0
            r3.add(r0)
            int r5 = r5 + 1
            boolean r0 = r0.A03
            int r4 = r4 + r0
            int r0 = r36.size()
            int r0 = r0 + -2
            if (r7 == r0) goto L_0x00c8
            X.0eM r0 = r12.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r4 >= r0) goto L_0x00b0
            X.0eM r0 = r12.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r5 < r0) goto L_0x00c8
        L_0x00b0:
            r14 = r9
            if (r6 == 0) goto L_0x00b4
            r14 = r2
        L_0x00b4:
            r13 = r12
            r16 = r3
            r17 = r20
            r18 = r32
            r13.A03(r14, r15, r16, r17, r18)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7 = r1
            r5 = 0
            r4 = 0
            r6 = 1
            goto L_0x0075
        L_0x00c8:
            r7 = r1
            goto L_0x0075
        L_0x00ca:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0044
            if (r6 == 0) goto L_0x00d5
            r9 = r2
        L_0x00d5:
            r0 = r12
            r1 = r9
            r2 = r15
            r4 = r20
            r5 = r32
            r0.A03(r1, r2, r3, r4, r5)
            return
        L_0x00e0:
            java.lang.String r16 = X.HZX.A00()
            java.util.Iterator r5 = r36.iterator()
        L_0x00e8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r11 = r5.next()
            X.Jtk r11 = (X.C60926Jtk) r11
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0155
            com.instagram.common.gallery.Medium r3 = r11.A00
            X.3Q2 r4 = r11.A01
            int r27 = r36.size()
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            X.7IF r1 = r12.A04
            int r0 = r3.A05
            X.8Cl r2 = r1.Bc1(r0)
            if (r2 == 0) goto L_0x0153
            java.lang.String r0 = r2.A0h
            java.lang.String r1 = r1.BbT(r0)
        L_0x0115:
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r12.A05
            X.3Q2 r24 = r0.A03(r1)
            if (r2 == 0) goto L_0x0134
            if (r1 == 0) goto L_0x0134
            if (r24 == 0) goto L_0x0134
            X.MAA r21 = new X.MAA
            r22 = r9
            r23 = r12
            r25 = r2
            r26 = r15
            r28 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            X.11Z.A02(r21)
            goto L_0x00e8
        L_0x0134:
            int r30 = r36.size()
            r29 = -1
            java.util.concurrent.ConcurrentLinkedQueue r28 = new java.util.concurrent.ConcurrentLinkedQueue
            r28.<init>()
            r21 = r12
            r22 = r9
            r23 = r3
            r24 = r13
            r25 = r4
            r26 = r15
            r27 = r16
            r31 = r20
            r21.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00e8
        L_0x0153:
            r1 = 0
            goto L_0x0115
        L_0x0155:
            int r19 = r36.size()
            java.util.concurrent.ConcurrentLinkedQueue r17 = new java.util.concurrent.ConcurrentLinkedQueue
            r17.<init>()
            r18 = -1
            com.instagram.common.gallery.Medium r10 = r11.A00
            X.3Q2 r14 = r11.A01
            X.0nO r0 = X.0nY.A00()
            X.KJK r8 = new X.KJK
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.ATE(r8)
            goto L_0x00e8
        L_0x0172:
            r2 = r1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IG.A04(X.GnY, com.instagram.model.direct.messageid.MessageIdentifier, X.9cJ, java.lang.Long, java.util.List, boolean, boolean):void");
    }

    public static final void A02(C53401GnY gnY, AnonymousClass7IG r27, Long l, List list, boolean z, boolean z2) {
        String str;
        String A002 = HZX.A00();
        AnonymousClass7IG r6 = r27;
        r6.A09.put(A002, new AtomicInteger(list.size()));
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C60926Jtk jtk = (C60926Jtk) it.next();
            C53401GnY gnY2 = gnY;
            Long l2 = l;
            boolean z3 = z;
            if (jtk.A03) {
                int size = list.size();
                AnonymousClass7IG r17 = r6;
                C60926Jtk jtk2 = jtk;
                0nY.A00().ATE(new KJK(gnY2, jtk.A00, jtk2, r17, (C381779cJ) null, jtk.A01, l2, A002, concurrentLinkedQueue, i, size, z3));
            } else {
                Medium medium = jtk.A00;
                AnonymousClass3Q2 r9 = jtk.A01;
                int size2 = list.size();
                AnonymousClass7IF r1 = r6.A04;
                C352218Cl Bc1 = r1.Bc1(medium.A05);
                if (Bc1 != null) {
                    str = r1.BbT(Bc1.A0h);
                } else {
                    str = null;
                }
                AnonymousClass3Q2 A032 = r6.A05.A03(str);
                if (Bc1 == null || str == null || A032 == null) {
                    r6.A00(gnY2, medium, (C381779cJ) null, r9, l2, A002, concurrentLinkedQueue, i, list.size(), z3, z2);
                } else if (i != -1) {
                    concurrentLinkedQueue.offer(new 0eP(Integer.valueOf(i), new KR0(A032, Bc1)));
                    A01(gnY2, r6, l2, A002, concurrentLinkedQueue);
                } else {
                    11Z.A02(new MAA(gnY2, r6, A032, Bc1, l2, size2, z3));
                }
            }
            i = i2;
        }
    }
}

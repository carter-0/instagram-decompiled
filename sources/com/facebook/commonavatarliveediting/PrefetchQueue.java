package com.facebook.commonavatarliveediting;

import X.136;
import X.AnonymousClass0JR;
import X.C15055ULy;
import X.C16771V5e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PrefetchQueue {
    public static PrefetchQueue A07;
    public static final C16771V5e A08 = new Object();
    public C15055ULy A00 = new C15055ULy((Integer) null, (Long) null, (Long) null, (Long) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (DefaultConstructorMarker) null, 511, 0);
    public final List A01 = new ArrayList();
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final 136 A04 = new 136();
    public final 136 A05 = new 136();
    public final AnonymousClass0JR A06;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.commonavatarliveediting.PrefetchQueue r13, X.C15055ULy r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 11
            boolean r0 = X.MED.A04(r3, r15)
            if (r0 == 0) goto L_0x0032
            r5 = r15
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003d
            if (r1 != r0) goto L_0x0038
            java.lang.Object r2 = r5.A03
            X.136 r2 = (X.136) r2
            java.lang.Object r14 = r5.A02
            X.ULy r14 = (X.C15055ULy) r14
            java.lang.Object r13 = r5.A01
            com.facebook.commonavatarliveediting.PrefetchQueue r13 = (com.facebook.commonavatarliveediting.PrefetchQueue) r13
            X.0eS.A00(r4)
            goto L_0x0051
        L_0x0032:
            X.MED r5 = new X.MED
            r5.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003d:
            X.0eS.A00(r4)
            X.136 r2 = r13.A04
            r5.A01 = r13
            r5.A02 = r14
            r5.A03 = r2
            r5.A00 = r0
            java.lang.Object r0 = X.136.A00(r5, r2)
            if (r0 != r6) goto L_0x0051
            return r6
        L_0x0051:
            java.lang.Object r8 = r14.A00     // Catch:{ all -> 0x00ad }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x00ad }
            java.lang.Object r9 = r14.A05     // Catch:{ all -> 0x00ad }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x00ad }
            java.lang.Object r10 = r14.A06     // Catch:{ all -> 0x00ad }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x007f
            X.0JR r0 = r13.A06     // Catch:{ all -> 0x00ad }
            long r4 = r0.now()     // Catch:{ all -> 0x00ad }
            long r0 = r8.longValue()     // Catch:{ all -> 0x00ad }
            long r4 = r4 - r0
            long r0 = r0 + r4
            java.lang.Long r8 = new java.lang.Long     // Catch:{ all -> 0x00ad }
            r8.<init>(r0)     // Catch:{ all -> 0x00ad }
            if (r9 == 0) goto L_0x007c
            long r0 = r9.longValue()     // Catch:{ all -> 0x00ad }
            long r0 = r0 + r4
            java.lang.Long r9 = new java.lang.Long     // Catch:{ all -> 0x00ad }
            r9.<init>(r0)     // Catch:{ all -> 0x00ad }
        L_0x007c:
            if (r10 == 0) goto L_0x008c
            goto L_0x0082
        L_0x007f:
            r9 = r3
            r10 = r3
            goto L_0x008c
        L_0x0082:
            long r0 = r10.longValue()     // Catch:{ all -> 0x00ad }
            long r0 = r0 + r4
            java.lang.Long r10 = new java.lang.Long     // Catch:{ all -> 0x00ad }
            r10.<init>(r0)     // Catch:{ all -> 0x00ad }
        L_0x008c:
            java.lang.Object r7 = r14.A01     // Catch:{ all -> 0x00ad }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x00ad }
            java.lang.Object r15 = r14.A02     // Catch:{ all -> 0x00ad }
            java.util.Map r15 = (java.util.Map) r15     // Catch:{ all -> 0x00ad }
            java.lang.Object r11 = r14.A03     // Catch:{ all -> 0x00ad }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x00ad }
            java.lang.Object r12 = r14.A04     // Catch:{ all -> 0x00ad }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x00ad }
            java.lang.Object r13 = r14.A07     // Catch:{ all -> 0x00ad }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x00ad }
            java.lang.Object r14 = r14.A08     // Catch:{ all -> 0x00ad }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x00ad }
            X.ULy r6 = new X.ULy     // Catch:{ all -> 0x00ad }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ad }
            r2.A05(r3)
            return r6
        L_0x00ad:
            r0 = move-exception
            r2.A05(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue.A00(com.facebook.commonavatarliveediting.PrefetchQueue, X.ULy, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095 A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129 A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0164 A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018a A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a5 A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c5 A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f0 A[Catch:{ all -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010e A[EDGE_INSN: B:75:0x010e->B:37:0x010e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.commonavatarliveediting.PrefetchQueue r29, java.util.List r30, X.AnonymousClass4D7 r31) {
        /*
            r1 = r29
            r8 = r30
            r5 = 10
            r6 = r31
            boolean r0 = X.MED.A04(r5, r6)
            if (r0 == 0) goto L_0x0039
            r4 = r6
            X.MED r4 = (X.MED) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0039
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r3 = r4.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r21 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r10) goto L_0x003f
            java.lang.Object r9 = r4.A03
            X.136 r9 = (X.136) r9
            java.lang.Object r8 = r4.A02
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r4.A01
            com.facebook.commonavatarliveediting.PrefetchQueue r1 = (com.facebook.commonavatarliveediting.PrefetchQueue) r1
            X.0eS.A00(r3)
            goto L_0x0058
        L_0x0039:
            X.MED r4 = new X.MED
            r4.<init>(r1, r6, r5)
            goto L_0x001c
        L_0x003f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0044:
            X.0eS.A00(r3)
            X.136 r9 = r1.A04
            r4.A01 = r1
            r4.A02 = r8
            r4.A03 = r9
            r4.A00 = r10
            java.lang.Object r0 = X.136.A00(r4, r9)
            if (r0 != r2) goto L_0x0058
            return r2
        L_0x0058:
            java.util.LinkedHashMap r20 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01f8 }
            r20.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01f8 }
            r7.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x01f8 }
            r19.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ all -> 0x01f8 }
            r18.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01f8 }
            r6.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ all -> 0x01f8 }
            r17.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x01f8 }
            r16.<init>()     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x01f8 }
            r11.<init>()     // Catch:{ all -> 0x01f8 }
            X.0JR r0 = r1.A06     // Catch:{ all -> 0x01f8 }
            long r2 = r0.now()     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0p(r8)     // Catch:{ all -> 0x01f8 }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x01f8 }
        L_0x008e:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x01f8 }
            r13 = 0
            if (r0 == 0) goto L_0x010e
            java.lang.Object r5 = r14.next()     // Catch:{ all -> 0x01f8 }
            X.GEi r5 = (X.C52088GEi) r5     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r5.A02     // Catch:{ all -> 0x01f8 }
            X.JV7 r0 = (X.JV7) r0     // Catch:{ all -> 0x01f8 }
            java.lang.Object r4 = r0.A00     // Catch:{ all -> 0x01f8 }
            X.Uwt r4 = (X.C16546Uwt) r4     // Catch:{ all -> 0x01f8 }
            r0 = r20
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x010c
            int r0 = r0.intValue()     // Catch:{ all -> 0x01f8 }
        L_0x00b1:
            int r0 = r0 + 1
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ all -> 0x01f8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f8 }
            r0 = r20
            r0.put(r4, r1)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r5.A03     // Catch:{ all -> 0x01f8 }
            X.Uwk r0 = (X.C16539Uwk) r0     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x00db
            java.lang.String r4 = r0.A00     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x010a
            int r0 = r0.intValue()     // Catch:{ all -> 0x01f8 }
        L_0x00d1:
            int r1 = r0 + 1
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f8 }
            r7.put(r4, r0)     // Catch:{ all -> 0x01f8 }
        L_0x00db:
            java.lang.String r4 = r5.A04     // Catch:{ all -> 0x01f8 }
            if (r4 == 0) goto L_0x00f5
            java.lang.Object r0 = r6.get(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x00eb
            int r13 = r0.intValue()     // Catch:{ all -> 0x01f8 }
        L_0x00eb:
            int r1 = r13 + 1
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f8 }
            r6.put(r4, r0)     // Catch:{ all -> 0x01f8 }
        L_0x00f5:
            long r4 = r5.A01     // Catch:{ all -> 0x01f8 }
            long r0 = r2 - r4
            java.lang.Long r4 = new java.lang.Long     // Catch:{ all -> 0x01f8 }
            r4.<init>(r0)     // Catch:{ all -> 0x01f8 }
            boolean r0 = r11.add(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01f8 }
            r12.add(r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x008e
        L_0x010a:
            r0 = 0
            goto L_0x00d1
        L_0x010c:
            r0 = 0
            goto L_0x00b1
        L_0x010e:
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x01f8 }
            java.util.List r1 = X.00k.A0a(r0)     // Catch:{ all -> 0x01f8 }
            r0 = r19
            r0.addAll(r1)     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r19)     // Catch:{ all -> 0x01f8 }
            java.util.Iterator r4 = r19.iterator()     // Catch:{ all -> 0x01f8 }
        L_0x0123:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = X.AnonymousClass7TE.A18(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0142
            int r1 = r0.intValue()     // Catch:{ all -> 0x01f8 }
        L_0x0139:
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f8 }
            r5.add(r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x0123
        L_0x0142:
            r1 = 0
            goto L_0x0139
        L_0x0144:
            r0 = r18
            r0.addAll(r5)     // Catch:{ all -> 0x01f8 }
            java.util.Set r0 = r6.keySet()     // Catch:{ all -> 0x01f8 }
            java.util.List r1 = X.00k.A0a(r0)     // Catch:{ all -> 0x01f8 }
            r0 = r17
            r0.addAll(r1)     // Catch:{ all -> 0x01f8 }
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r17)     // Catch:{ all -> 0x01f8 }
            java.util.Iterator r4 = r17.iterator()     // Catch:{ all -> 0x01f8 }
        L_0x015e:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = X.AnonymousClass7TE.A18(r4)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x017d
            int r1 = r0.intValue()     // Catch:{ all -> 0x01f8 }
        L_0x0174:
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f8 }
            r5.add(r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x015e
        L_0x017d:
            r1 = 0
            goto L_0x0174
        L_0x017f:
            r0 = r16
            r0.addAll(r5)     // Catch:{ all -> 0x01f8 }
            boolean r0 = X.DbT.A1b(r11)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01a5
            long[] r15 = X.00k.A0y(r11)     // Catch:{ all -> 0x01f8 }
            int r14 = r15.length     // Catch:{ all -> 0x01f8 }
            r6 = 0
            r12 = 0
        L_0x0192:
            if (r13 >= r14) goto L_0x019d
            r4 = r15[r13]     // Catch:{ all -> 0x01f8 }
            double r0 = (double) r4     // Catch:{ all -> 0x01f8 }
            double r6 = r6 + r0
            int r12 = r12 + 1
            int r13 = r13 + 1
            goto L_0x0192
        L_0x019d:
            if (r12 != 0) goto L_0x01a2
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x01a8
        L_0x01a2:
            double r0 = (double) r12     // Catch:{ all -> 0x01f8 }
            double r6 = r6 / r0
            goto L_0x01a8
        L_0x01a5:
            r25 = 0
            goto L_0x01ad
        L_0x01a8:
            long r0 = (long) r6     // Catch:{ all -> 0x01f8 }
            java.lang.Long r25 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01f8 }
        L_0x01ad:
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r0
            int r0 = r11.size()     // Catch:{ all -> 0x01f8 }
            double r0 = (double) r0     // Catch:{ all -> 0x01f8 }
            double r4 = r4 * r0
            double r0 = java.lang.Math.ceil(r4)     // Catch:{ all -> 0x01f8 }
            int r4 = (int) r0     // Catch:{ all -> 0x01f8 }
            if (r10 > r4) goto L_0x01f0
            int r0 = r11.size()     // Catch:{ all -> 0x01f8 }
            if (r4 > r0) goto L_0x01f0
            int r4 = r4 - r10
            java.lang.Object r4 = r11.get(r4)     // Catch:{ all -> 0x01f8 }
        L_0x01ca:
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x01f8 }
            int r0 = r8.size()     // Catch:{ all -> 0x01f8 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ all -> 0x01f8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x01f8 }
            r0.<init>(r2)     // Catch:{ all -> 0x01f8 }
            X.ULy r22 = new X.ULy     // Catch:{ all -> 0x01f8 }
            r23 = r1
            r24 = r0
            r26 = r4
            r27 = r19
            r28 = r18
            r29 = r17
            r30 = r16
            r31 = r20
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x01f8 }
            goto L_0x01f2
        L_0x01f0:
            r4 = 0
            goto L_0x01ca
        L_0x01f2:
            r0 = r21
            r9.A05(r0)
            return r22
        L_0x01f8:
            r1 = move-exception
            r0 = r21
            r9.A05(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue.A01(com.facebook.commonavatarliveediting.PrefetchQueue, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r13v1, types: [X.4D7, X.WvE] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8 A[Catch:{ all -> 0x011d }, LOOP:0: B:21:0x00c2->B:23:0x00c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e8 A[Catch:{ all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.MTM r26, X.C16539Uwk r27, X.C18073Vl1 r28, java.lang.String r29, java.util.List r30, X.AnonymousClass4D7 r31, X.AnonymousClass4CZ r32, X.C262224Cq r33, int r34) {
        /*
            r25 = this;
            r12 = r31
            r0 = r30
            r6 = r27
            r7 = r29
            r8 = r28
            r3 = r26
            r5 = r32
            r4 = r33
            r10 = r34
            boolean r1 = r12 instanceof X.C20586WvE
            r2 = r25
            if (r1 == 0) goto L_0x0111
            r13 = r12
            X.WvE r13 = (X.C20586WvE) r13
            int r11 = r13.A01
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r11 & r9
            if (r1 == 0) goto L_0x0111
            int r11 = r11 - r9
            r13.A01 = r11
        L_0x0026:
            java.lang.Object r1 = r13.A0B
            r16 = r1
            X.1Hj r12 = X.1Hj.A02
            int r9 = r13.A01
            java.lang.String r15 = "PREFETCH_ADD_TO_NATIVE_QUEUE"
            r1 = 1
            r14 = 2
            r11 = 0
            if (r9 == 0) goto L_0x0089
            if (r9 == r1) goto L_0x005f
            if (r9 != r14) goto L_0x0118
            int r10 = r13.A00
            java.lang.Object r5 = r13.A05
            X.4CZ r5 = (X.AnonymousClass4CZ) r5
            java.lang.Object r4 = r13.A04
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r13.A03
            X.MTM r3 = (X.MTM) r3
            java.lang.Object r2 = r13.A02
            com.facebook.commonavatarliveediting.PrefetchQueue r2 = (com.facebook.commonavatarliveediting.PrefetchQueue) r2
            X.0eS.A00(r16)
        L_0x004e:
            com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1 r0 = new com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1
            r12 = r10
            r9 = r3
            r10 = r11
            r11 = r5
            r7 = r0
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            X.1Eo.A05(r5, r0, r4)
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x005f:
            int r10 = r13.A00
            java.lang.Object r9 = r13.A0A
            X.136 r9 = (X.136) r9
            java.lang.Object r8 = r13.A09
            X.Vl1 r8 = (X.C18073Vl1) r8
            java.lang.Object r7 = r13.A08
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r13.A07
            X.Uwk r6 = (X.C16539Uwk) r6
            java.lang.Object r0 = r13.A06
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r13.A05
            X.4CZ r5 = (X.AnonymousClass4CZ) r5
            java.lang.Object r4 = r13.A04
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r13.A03
            X.MTM r3 = (X.MTM) r3
            java.lang.Object r2 = r13.A02
            com.facebook.commonavatarliveediting.PrefetchQueue r2 = (com.facebook.commonavatarliveediting.PrefetchQueue) r2
            X.0eS.A00(r16)
            goto L_0x00b0
        L_0x0089:
            X.0eS.A00(r16)
            if (r28 == 0) goto L_0x0091
            r8.A02(r15)
        L_0x0091:
            X.136 r9 = r2.A05
            r13.A02 = r2
            r13.A03 = r3
            r13.A04 = r4
            r13.A05 = r5
            r13.A06 = r0
            r13.A07 = r6
            r13.A08 = r7
            r13.A09 = r8
            r13.A0A = r9
            r13.A00 = r10
            r13.A01 = r1
            java.lang.Object r1 = X.136.A00(r13, r9)
            if (r1 != r12) goto L_0x00b0
            return r12
        L_0x00b0:
            X.0JR r1 = r2.A06     // Catch:{ all -> 0x011d }
            long r22 = r1.now()     // Catch:{ all -> 0x011d }
            java.util.List r1 = r2.A01     // Catch:{ all -> 0x011d }
            r24 = r1
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ all -> 0x011d }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x011d }
        L_0x00c2:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x011d }
            X.JV7 r0 = (X.JV7) r0     // Catch:{ all -> 0x011d }
            X.GEi r16 = new X.GEi     // Catch:{ all -> 0x011d }
            r20 = r0
            r21 = r7
            r18 = r16
            r19 = r6
            r18.<init>((X.C16539Uwk) r19, (X.JV7) r20, (java.lang.String) r21, (long) r22)     // Catch:{ all -> 0x011d }
            r0 = r16
            r1.add(r0)     // Catch:{ all -> 0x011d }
            goto L_0x00c2
        L_0x00e1:
            r0 = r24
            r0.addAll(r1)     // Catch:{ all -> 0x011d }
            if (r8 == 0) goto L_0x00eb
            r8.A01(r15)     // Catch:{ all -> 0x011d }
        L_0x00eb:
            r9.A05(r11)
            r13.A02 = r2
            r13.A03 = r3
            r13.A04 = r4
            r13.A05 = r5
            r13.A06 = r11
            r13.A07 = r11
            r13.A08 = r11
            r13.A09 = r11
            r13.A0A = r11
            r13.A00 = r10
            r13.A01 = r14
            r1 = 4
            X.JTw r0 = new X.JTw
            r0.<init>(r2, r3, r11, r1)
            java.lang.Object r0 = X.1Eo.A00(r13, r5, r0)
            if (r0 != r12) goto L_0x004e
            return r12
        L_0x0111:
            X.WvE r13 = new X.WvE
            r13.<init>(r2, r12)
            goto L_0x0026
        L_0x0118:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x011d:
            r0 = move-exception
            r9.A05(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue.A02(X.MTM, X.Uwk, X.Vl1, java.lang.String, java.util.List, X.4D7, X.4CZ, X.4Cq, int):java.lang.Object");
    }

    public PrefetchQueue(AnonymousClass0JR r14) {
        this.A06 = r14;
    }
}

package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pbc  reason: case insensitive filesystem */
public final class C73379Pbc implements Runnable {
    public final /* synthetic */ C73540PeW A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ AtomicInteger A03;
    public final /* synthetic */ 0sP A04;

    public C73379Pbc(C73540PeW peW, Object obj, List list, AtomicInteger atomicInteger, 0sP r5) {
        this.A03 = atomicInteger;
        this.A00 = peW;
        this.A02 = list;
        this.A04 = r5;
        this.A01 = obj;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0129, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
        r14 = X.AnonymousClass7TF.A0u(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0163, code lost:
        r13 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        if (r13.hasNext() != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        r4 = (X.C74225PrE) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        if ((r4 instanceof X.C74560Px9) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        if ((r4 instanceof X.C59667JSm) != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017b, code lost:
        r7.add(new X.C58696Iw5(21, r10, r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0188, code lost:
        if ((r4 instanceof X.C71759OqL) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018a, code lost:
        r3 = (X.C74225PrE) ((X.C71759OqL) r4).A01.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
        if (r3 != null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0199, code lost:
        if ((r3 instanceof X.C74560Px9) == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019d, code lost:
        if ((r3 instanceof X.C59667JSm) != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019f, code lost:
        r7.add(new X.C58696Iw5(19, r10, r5, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a9, code lost:
        r8.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        if ((r3 instanceof X.C71759OqL) != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        r0 = X.AnonymousClass7TE.A0z("nested GranularSubscribers are not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b8, code lost:
        r0 = X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bd, code lost:
        r0 = X.AnonymousClass7TE.A0z("RpStateSubscriber not supported in granular subscribers");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        r0 = X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0155 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0064 A[LOOP:0: B:9:0x0064->B:106:0x0064, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a A[Catch:{ all -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0163 A[Catch:{ all -> 0x01ee }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r4 = r19
            java.util.concurrent.atomic.AtomicInteger r9 = r4.A03
            int r0 = r9.incrementAndGet()
            r15 = 1
            if (r0 <= r15) goto L_0x0015
            X.OWb r3 = X.C71004OWb.A00
            r2 = 0
            java.lang.String r1 = "RpStore"
            java.lang.String r0 = "RpStore execution entrant count > 1. Non-serial processing of actions may lead to undefined behavior."
            r3.A02(r1, r0, r2)
        L_0x0015:
            X.PeW r3 = r4.A00
            X.0sa r0 = r3.B9B()
            java.lang.Object r12 = r0.invoke()
            X.N4A r12 = (X.N4A) r12
            java.util.List r2 = r4.A02
            r11 = 0
            X.0qQ.A0B(r2, r11)
            r0 = 29
            X.J6L r1 = new X.J6L
            r1.<init>(r2, r0)
            X.0sP r0 = r4.A04
            java.lang.Object r1 = r1.invoke(r0)
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A01
            r1.invoke(r0)
            X.0sa r0 = r3.B9B()
            java.lang.Object r10 = r0.invoke()
            X.N4A r10 = (X.N4A) r10
            X.OZc r2 = r3.A01
            monitor-enter(r2)
            X.0qQ.A0B(r12, r11)     // Catch:{ all -> 0x01f6 }
            X.0qQ.A0B(r10, r15)     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "SubscriptionManager.onChange"
            r0 = -1105092824(0xffffffffbe219f28, float:-0.1578337)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x01f6 }
            java.util.LinkedHashSet r8 = X.DbS.A0y()     // Catch:{ all -> 0x01ee }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01ee }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x01ee }
            java.util.Iterator r18 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x01ee }
        L_0x0064:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0123
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r18)     // Catch:{ all -> 0x01ee }
            java.lang.Object r14 = r0.getKey()     // Catch:{ all -> 0x01ee }
            java.lang.Class r14 = (java.lang.Class) r14     // Catch:{ all -> 0x01ee }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x01ee }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x01ee }
            X.0qQ.A0B(r14, r11)     // Catch:{ all -> 0x01ee }
            r13 = 0
            java.lang.String r0 = "CONVERTER"
            java.lang.reflect.Field r0 = r14.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0090 }
            java.lang.Object r1 = r0.get(r13)     // Catch:{ NoSuchFieldException -> 0x0090 }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.djinni.msys.infra.McfReference.McfTypeConverter<T of com.facebook.rp.platform.statemanagement.rpstate.RpStateKt.getConverter>"
            X.0qQ.A0C(r1, r0)     // Catch:{ NoSuchFieldException -> 0x0090 }
            X.2LV r1 = (X.2LV) r1     // Catch:{ NoSuchFieldException -> 0x0090 }
            r13 = r1
        L_0x0090:
            java.util.Iterator r17 = X.AnonymousClass7TF.A0u(r3)     // Catch:{ all -> 0x01ee }
        L_0x0094:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0064
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r17)     // Catch:{ all -> 0x01ee }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x01ee }
            X.0sP r6 = (X.0sP) r6     // Catch:{ all -> 0x01ee }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x01ee }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ee }
            java.lang.Object r0 = X.C71025OZc.A00(r13, r12, r14)     // Catch:{ all -> 0x01ee }
            java.lang.Object r1 = X.C71025OZc.A00(r13, r10, r14)     // Catch:{ all -> 0x01ee }
            r5 = 0
            if (r0 != 0) goto L_0x00b6
            goto L_0x00bb
        L_0x00b6:
            java.lang.Object r0 = r6.invoke(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x00bc
        L_0x00bb:
            r0 = r5
        L_0x00bc:
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r5 = r6.invoke(r1)     // Catch:{ all -> 0x01ee }
        L_0x00c2:
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0094
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x01ee }
        L_0x00cc:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r4 = r16.next()     // Catch:{ all -> 0x01ee }
            X.PrE r4 = (X.C74225PrE) r4     // Catch:{ all -> 0x01ee }
            boolean r0 = r4 instanceof X.C74560Px9     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0111
            boolean r0 = r4 instanceof X.C59667JSm     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x00eb
            r1 = 20
            X.Iw5 r0 = new X.Iw5     // Catch:{ all -> 0x01ee }
            r0.<init>(r1, r10, r5, r4)     // Catch:{ all -> 0x01ee }
            r7.add(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x00cc
        L_0x00eb:
            boolean r0 = r4 instanceof X.C71759OqL     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x011d
            r0 = r4
            X.OqL r0 = (X.C71759OqL) r0     // Catch:{ all -> 0x01ee }
            X.0qQ.A0B(r6, r15)     // Catch:{ all -> 0x01ee }
            X.0yf r0 = r0.A02     // Catch:{ all -> 0x01ee }
            java.lang.Object r3 = r0.get(r6)     // Catch:{ all -> 0x01ee }
            X.PrE r3 = (X.C74225PrE) r3     // Catch:{ all -> 0x01ee }
            if (r3 == 0) goto L_0x0111
            boolean r0 = r3 instanceof X.C74560Px9     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0115
            boolean r0 = r3 instanceof X.C59667JSm     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01c9
            r1 = 19
            X.Iw5 r0 = new X.Iw5     // Catch:{ all -> 0x01ee }
            r0.<init>(r1, r10, r5, r3)     // Catch:{ all -> 0x01ee }
            r7.add(r0)     // Catch:{ all -> 0x01ee }
        L_0x0111:
            r8.add(r4)     // Catch:{ all -> 0x01ee }
            goto L_0x00cc
        L_0x0115:
            java.lang.String r0 = "RpStateSubscriber not supported in granular subscribers"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x011d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x0123:
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x01ee }
            java.util.Iterator r14 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x01ee }
        L_0x0129:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01d9
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r14)     // Catch:{ all -> 0x01ee }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x01ee }
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x01ee }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x01ee }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x01ee }
            X.0qQ.A0B(r6, r11)     // Catch:{ all -> 0x01ee }
            r4 = 0
            java.lang.String r0 = "CONVERTER"
            java.lang.reflect.Field r0 = r6.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0155 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ NoSuchFieldException -> 0x0155 }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.djinni.msys.infra.McfReference.McfTypeConverter<T of com.facebook.rp.platform.statemanagement.rpstate.RpStateKt.getConverter>"
            X.0qQ.A0C(r1, r0)     // Catch:{ NoSuchFieldException -> 0x0155 }
            X.2LV r1 = (X.2LV) r1     // Catch:{ NoSuchFieldException -> 0x0155 }
            r4 = r1
        L_0x0155:
            java.lang.Object r0 = X.C71025OZc.A00(r4, r12, r6)     // Catch:{ all -> 0x01ee }
            java.lang.Object r5 = X.C71025OZc.A00(r4, r10, r6)     // Catch:{ all -> 0x01ee }
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x0129
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x01ee }
        L_0x0167:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0129
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x01ee }
            X.PrE r4 = (X.C74225PrE) r4     // Catch:{ all -> 0x01ee }
            boolean r0 = r4 instanceof X.C74560Px9     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01a9
            boolean r0 = r4 instanceof X.C59667JSm     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0186
            r1 = 21
            X.Iw5 r0 = new X.Iw5     // Catch:{ all -> 0x01ee }
            r0.<init>(r1, r10, r5, r4)     // Catch:{ all -> 0x01ee }
            r7.add(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x0167
        L_0x0186:
            boolean r0 = r4 instanceof X.C71759OqL     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01c4
            r0 = r4
            X.OqL r0 = (X.C71759OqL) r0     // Catch:{ all -> 0x01ee }
            X.0yf r0 = r0.A01     // Catch:{ all -> 0x01ee }
            java.lang.Object r3 = r0.get(r6)     // Catch:{ all -> 0x01ee }
            X.PrE r3 = (X.C74225PrE) r3     // Catch:{ all -> 0x01ee }
            if (r3 == 0) goto L_0x01a9
            boolean r0 = r3 instanceof X.C74560Px9     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01bd
            boolean r0 = r3 instanceof X.C59667JSm     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01ad
            r1 = 19
            X.Iw5 r0 = new X.Iw5     // Catch:{ all -> 0x01ee }
            r0.<init>(r1, r10, r5, r3)     // Catch:{ all -> 0x01ee }
            r7.add(r0)     // Catch:{ all -> 0x01ee }
        L_0x01a9:
            r8.add(r4)     // Catch:{ all -> 0x01ee }
            goto L_0x0167
        L_0x01ad:
            boolean r0 = r3 instanceof X.C71759OqL     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01b8
            java.lang.String r0 = "nested GranularSubscribers are not supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x01b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x01bd:
            java.lang.String r0 = "RpStateSubscriber not supported in granular subscribers"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x01c4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x01c9:
            boolean r0 = r3 instanceof X.C71759OqL     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01d4
            java.lang.String r0 = "nested GranularSubscribers are not supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01ee }
        L_0x01d3:
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x01d4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x01ee }
            goto L_0x01d3
        L_0x01d9:
            java.util.concurrent.Executor r1 = r2.A02     // Catch:{ all -> 0x01ee }
            X.Pa0 r0 = new X.Pa0     // Catch:{ all -> 0x01ee }
            r0.<init>(r10, r7, r8)     // Catch:{ all -> 0x01ee }
            r1.execute(r0)     // Catch:{ all -> 0x01ee }
            r0 = -886381852(0xffffffffcb2ae2e4, float:-1.1199204E7)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01f6 }
            monitor-exit(r2)
            r9.decrementAndGet()
            return
        L_0x01ee:
            r1 = move-exception
            r0 = 489673785(0x1d2fd439, float:2.3270774E-21)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01f6 }
            throw r1     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73379Pbc.run():void");
    }
}

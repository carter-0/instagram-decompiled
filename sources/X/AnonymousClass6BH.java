package X;

import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6BH  reason: invalid class name */
public final class AnonymousClass6BH extends AnonymousClass659 {
    public final ThreadFetchReason A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final /* synthetic */ AnonymousClass43O A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6BH(ThreadFetchReason threadFetchReason, AnonymousClass43O r3, Long l, List list, boolean z) {
        super(r3, l);
        this.A07 = r3;
        this.A03 = new ArrayList();
        this.A02 = null;
        this.A04 = list;
        01V.A1C(list);
        this.A01 = null;
        this.A05 = z;
        this.A06 = false;
        this.A00 = threadFetchReason;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r0.longValue() >= r1.longValue()) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r17 = this;
            r7 = r17
            X.4dm r0 = r7.A01
            r3 = 0
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r9 = r0.A00()
            X.74W r9 = (X.AnonymousClass74W) r9
            if (r9 == 0) goto L_0x00e6
            X.43O r6 = r7.A07
            X.43S r8 = r6.A08
            X.7BV r10 = r7.A03
            X.8wd r1 = r9.A02
            if (r1 == 0) goto L_0x0469
            boolean r0 = r1.CKJ()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0463
            r0 = 0
        L_0x0026:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x002a:
            if (r10 == 0) goto L_0x004f
            X.02m r2 = r8.A00
            int r1 = r10.A01
            int r0 = r10.A00
            com.facebook.quicklog.MarkerEditor r2 = r2.withMarker(r1, r0)
            if (r5 == 0) goto L_0x0041
            boolean r1 = r5.booleanValue()
            java.lang.String r0 = "server_has_older"
            r2.annotate(r0, r1)
        L_0x0041:
            if (r4 == 0) goto L_0x004c
            boolean r1 = r4.booleanValue()
            java.lang.String r0 = "server_has_newer"
            r2.annotate(r0, r1)
        L_0x004c:
            r2.markerEditingCompleted()
        L_0x004f:
            boolean r0 = r9.isOk()
            if (r0 == 0) goto L_0x00ce
            X.7BV r0 = r7.A03
            r8.A04(r0)
            X.8wd r5 = r9.A02
            if (r5 == 0) goto L_0x0183
            X.3Tu r0 = r5.A0Z
            r10 = 817904752(0x30c03c70, float:1.3987016E-9)
            if (r0 != 0) goto L_0x0076
            X.0wj r2 = X.0wj.A01
            java.lang.String r1 = "Snapshot returns null btv map for thread: "
            java.lang.String r0 = r5.A1D
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0f9 r0 = r2.AEf(r0, r10)
            r0.report()
        L_0x0076:
            com.instagram.common.session.UserSession r2 = r6.A04
            X.1Am r4 = X.1Al.A01(r2)
            X.1An r1 = X.1An.A3V
            java.lang.Class r0 = r7.getClass()
            X.0xa r1 = r4.A04(r1, r0)
            java.lang.String r0 = "CUTOVER_THREAD_LIST_PERF_KEY"
            java.lang.String r11 = r1.C1q(r0)
            int r0 = r11.length()
            r4 = 1
            r1 = 0
            if (r0 <= 0) goto L_0x00be
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = X.00l.A0R(r11, r0, r1)
            java.lang.String r0 = r5.A1D
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00be
            X.A5N r0 = r5.A0g
            if (r0 == 0) goto L_0x0143
            java.lang.Long r1 = r0.A00
            java.lang.Long r0 = r0.A01
            if (r0 == 0) goto L_0x0143
            if (r1 == 0) goto L_0x0143
            long r13 = r0.longValue()
            long r11 = r1.longValue()
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
        L_0x00be:
            java.lang.String r10 = r7.A01
            if (r10 != 0) goto L_0x00f3
            X.2Dm r1 = r6.A09
            X.2EN r0 = r5.A0o
            r1.FKy(r5, r0, r5, r4)
        L_0x00c9:
            X.7BV r0 = r7.A03
            r8.A03(r0)
        L_0x00ce:
            X.43T r0 = r6.A06
            java.lang.String r2 = r7.A05
            java.lang.String r1 = r7.A01
            r0.A02(r2, r1)
            r6.A0C(r7)
            X.8wd r0 = r9.A02
            r13 = 0
            java.lang.String r12 = "makeup_for_thread_fetch_due_to_instamadillo_failure"
            r9 = r0
            r10 = r1
            r11 = r2
            r8 = r6
            X.AnonymousClass43O.A01(r8, r9, r10, r11, r12, r13)
        L_0x00e6:
            r7.A03()
            X.43O r0 = r7.A07
            X.43S r1 = r0.A08
            X.7BV r0 = r7.A03
            r1.A0C(r0)
            return
        L_0x00f3:
            java.lang.String r4 = r7.A02
            if (r4 == 0) goto L_0x046d
            com.instagram.model.direct.DirectThreadKey r12 = new com.instagram.model.direct.DirectThreadKey
            r12.<init>(r4, r3)
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x010b
            X.3Tu r11 = r5.A0Z
            if (r11 == 0) goto L_0x010b
            X.2Dm r1 = r6.A09
            java.lang.String r0 = "null_btv_map"
            r1.FLp(r11, r12, r0)
        L_0x010b:
            X.2Dm r0 = r6.A09
            r0.A9r(r5, r12, r10)
            int r1 = r5.A0I
            r0 = 29
            if (r1 != r0) goto L_0x00c9
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r5.A0k
            if (r0 == 0) goto L_0x011c
            java.lang.String r3 = r0.A03
        L_0x011c:
            java.lang.String r0 = r2.A06
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00c9
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319407394790730(0x81084f00381d4a, double:3.031877710756119E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00c9
            com.instagram.direct.perf.constants.ThreadFetchReason r0 = r7.A00
            java.lang.String r0 = r0.getFetchType()
            int r0 = com.instagram.direct.request.DirectThreadApi.A00(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C71129OdS.A06(r2, r0, r4, r10)
            goto L_0x00c9
        L_0x0143:
            X.3Tu r11 = r5.A0Z
            if (r11 != 0) goto L_0x016b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "btvEnabledMap is null for cutover thread: "
        L_0x014e:
            r1.append(r0)
            java.lang.String r0 = r5.A1D
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.0eM r0 = r6.A0D
            java.lang.Object r0 = r0.getValue()
            X.0wj r0 = (X.0wj) r0
            X.0f9 r0 = r0.AEf(r1, r10)
            r0.report()
            goto L_0x00be
        L_0x016b:
            boolean r0 = r11.A01()
            if (r0 != 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "tlc flag = "
            r1.append(r0)
            int r0 = r11.A01
            r1.append(r0)
            java.lang.String r0 = " for cutover thread: "
            goto L_0x014e
        L_0x0183:
            java.lang.String r4 = r7.A02
            if (r4 == 0) goto L_0x0198
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "threadId: "
            java.lang.String r0 = " got empty successful response"
            java.lang.String r1 = X.002.A0g(r1, r4, r0)
            java.lang.String r0 = "BaseSnapshotRequestManager"
            r2.Ew0(r0, r1)
            goto L_0x00c9
        L_0x0198:
            java.util.List r0 = r9.A0B
            if (r0 == 0) goto L_0x01d5
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            if (r2 == 0) goto L_0x01d5
            java.util.List r0 = r7.A04
            if (r0 == 0) goto L_0x01d5
            X.2Dm r5 = r6.A09
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r3, r0)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            r4 = 1
            X.2En r0 = r5.A0F     // Catch:{ all -> 0x04a7 }
            X.48S r0 = r0.A04(r1)     // Catch:{ all -> 0x04a7 }
            if (r0 != 0) goto L_0x01c5
            r0 = 2388(0x954, float:3.346E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x04a7 }
            java.lang.String r1 = "the thread entry should exist when adding top-level thread context items"
            X.0wb.A03(r0, r1)     // Catch:{ all -> 0x04a7 }
            goto L_0x01d4
        L_0x01c5:
            X.2Dr.A0J(r0, r2)     // Catch:{ all -> 0x04a7 }
            X.3U9 r0 = r0.A0I     // Catch:{ all -> 0x04a7 }
            com.instagram.model.direct.DirectThreadKey r2 = r0.BJz()     // Catch:{ all -> 0x04a7 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0E     // Catch:{ all -> 0x04a7 }
            r0 = 0
            X.2Dr.A0G(r5, r2, r1, r4, r0)     // Catch:{ all -> 0x04a7 }
        L_0x01d4:
            monitor-exit(r5)
        L_0x01d5:
            java.util.List r0 = r9.A0C
            if (r0 == 0) goto L_0x020e
            java.util.List r11 = java.util.Collections.unmodifiableList(r0)
            if (r11 == 0) goto L_0x020e
            X.2Dm r5 = r6.A09
            java.util.List r1 = r7.A04
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            r0.<init>(r3, r1)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            r10 = 0
            X.48S r4 = r5.A0P(r0)     // Catch:{ all -> 0x04a7 }
            if (r4 == 0) goto L_0x020d
            X.3Te r2 = r4.A0L()     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x04a7 }
            X.3U9 r1 = r4.A0I     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x04a7 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04a7 }
            r0.<init>(r11)     // Catch:{ all -> 0x04a7 }
            X.C370828x8.A01(r1, r0)     // Catch:{ all -> 0x04a7 }
            X.2Kb r0 = r4.A0M(r2)     // Catch:{ all -> 0x04a7 }
            X.2Dr.A0E(r0, r5, r10)     // Catch:{ all -> 0x04a7 }
        L_0x020d:
            monitor-exit(r5)
        L_0x020e:
            java.lang.String r12 = r9.A08
            if (r12 == 0) goto L_0x0275
            X.2Dm r5 = r6.A09
            java.util.List r0 = r7.A04
            com.instagram.model.direct.DirectThreadKey r10 = new com.instagram.model.direct.DirectThreadKey
            r10.<init>(r3, r0)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            X.2En r0 = r5.A0F     // Catch:{ all -> 0x04a7 }
            X.48S r0 = r0.A04(r10)     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0274
            X.3U9 r13 = r0.A0I     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x04a7 }
            X.0eM r0 = r13.A05     // Catch:{ all -> 0x04a7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04a7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0267
            java.util.concurrent.locks.ReentrantReadWriteLock r11 = r13.A03     // Catch:{ all -> 0x04a7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r11.readLock()     // Catch:{ all -> 0x04a7 }
            int r0 = r11.getWriteHoldCount()     // Catch:{ all -> 0x04a7 }
            r2 = 0
            if (r0 != 0) goto L_0x0253
            int r1 = r11.getReadHoldCount()     // Catch:{ all -> 0x04a7 }
            r0 = 0
        L_0x024b:
            if (r0 >= r1) goto L_0x0254
            r4.unlock()     // Catch:{ all -> 0x04a7 }
            int r0 = r0 + 1
            goto L_0x024b
        L_0x0253:
            r1 = 0
        L_0x0254:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r16 = r11.writeLock()     // Catch:{ all -> 0x04a7 }
            r16.lock()     // Catch:{ all -> 0x04a7 }
            X.3S9 r0 = r13.A01     // Catch:{ all -> 0x0475 }
            r0.A1n = r12     // Catch:{ all -> 0x0475 }
        L_0x025f:
            if (r2 >= r1) goto L_0x026e
            r4.lock()     // Catch:{ all -> 0x04a7 }
            int r2 = r2 + 1
            goto L_0x025f
        L_0x0267:
            X.3S9 r11 = r13.A01     // Catch:{ all -> 0x04a7 }
            monitor-enter(r11)     // Catch:{ all -> 0x04a7 }
            r11.A1n = r12     // Catch:{ all -> 0x0490 }
            monitor-exit(r11)     // Catch:{ all -> 0x04a7 }
            goto L_0x0271
        L_0x026e:
            r16.unlock()     // Catch:{ all -> 0x04a7 }
        L_0x0271:
            r5.FLo(r10)     // Catch:{ all -> 0x04a7 }
        L_0x0274:
            monitor-exit(r5)
        L_0x0275:
            java.util.List r0 = r9.A0A
            if (r0 != 0) goto L_0x028f
            r1 = 0
        L_0x027a:
            X.9IV r14 = r9.A00
            X.Cte r13 = r9.A01
            if (r1 != 0) goto L_0x0282
            if (r13 == 0) goto L_0x032c
        L_0x0282:
            X.2Dm r5 = r6.A09
            java.util.List r0 = r7.A04
            com.instagram.model.direct.DirectThreadKey r12 = new com.instagram.model.direct.DirectThreadKey
            r12.<init>(r3, r0)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            goto L_0x0294
        L_0x028f:
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            goto L_0x027a
        L_0x0294:
            X.48S r0 = r5.A0P(r12)     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x032b
            X.3U9 r4 = r0.A0I     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x04a7 }
            r4.A0G(r1)     // Catch:{ all -> 0x04a7 }
            X.0eM r10 = r4.A05     // Catch:{ all -> 0x04a7 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x04a7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x02e2
            java.util.concurrent.locks.ReentrantReadWriteLock r11 = r4.A03     // Catch:{ all -> 0x04a7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r15 = r11.readLock()     // Catch:{ all -> 0x04a7 }
            int r0 = r11.getWriteHoldCount()     // Catch:{ all -> 0x04a7 }
            r2 = 0
            if (r0 != 0) goto L_0x02ca
            int r1 = r11.getReadHoldCount()     // Catch:{ all -> 0x04a7 }
            r0 = 0
        L_0x02c2:
            if (r0 >= r1) goto L_0x02cb
            r15.unlock()     // Catch:{ all -> 0x04a7 }
            int r0 = r0 + 1
            goto L_0x02c2
        L_0x02ca:
            r1 = 0
        L_0x02cb:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r16 = r11.writeLock()     // Catch:{ all -> 0x04a7 }
            r16.lock()     // Catch:{ all -> 0x04a7 }
            X.3S9 r11 = r4.A01     // Catch:{ all -> 0x047e }
            r11.A0T = r14     // Catch:{ all -> 0x047e }
        L_0x02d6:
            if (r2 >= r1) goto L_0x02de
            r15.lock()     // Catch:{ all -> 0x04a7 }
            int r2 = r2 + 1
            goto L_0x02d6
        L_0x02de:
            r16.unlock()     // Catch:{ all -> 0x04a7 }
            goto L_0x02e8
        L_0x02e2:
            X.3S9 r11 = r4.A01     // Catch:{ all -> 0x04a7 }
            monitor-enter(r11)     // Catch:{ all -> 0x04a7 }
            r11.A0T = r14     // Catch:{ all -> 0x0490 }
            monitor-exit(r11)     // Catch:{ all -> 0x04a7 }
        L_0x02e8:
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x04a7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0320
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.A03     // Catch:{ all -> 0x04a7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r1.readLock()     // Catch:{ all -> 0x04a7 }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x04a7 }
            r4 = 0
            if (r0 != 0) goto L_0x030e
            int r2 = r1.getReadHoldCount()     // Catch:{ all -> 0x04a7 }
            r0 = 0
        L_0x0306:
            if (r0 >= r2) goto L_0x030f
            r10.unlock()     // Catch:{ all -> 0x04a7 }
            int r0 = r0 + 1
            goto L_0x0306
        L_0x030e:
            r2 = 0
        L_0x030f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()     // Catch:{ all -> 0x04a7 }
            r1.lock()     // Catch:{ all -> 0x04a7 }
            r11.A0d = r13     // Catch:{ all -> 0x0487 }
        L_0x0318:
            if (r4 >= r2) goto L_0x0325
            r10.lock()     // Catch:{ all -> 0x04a7 }
            int r4 = r4 + 1
            goto L_0x0318
        L_0x0320:
            monitor-enter(r11)     // Catch:{ all -> 0x04a7 }
            r11.A0d = r13     // Catch:{ all -> 0x0490 }
            monitor-exit(r11)     // Catch:{ all -> 0x04a7 }
            goto L_0x0328
        L_0x0325:
            r1.unlock()     // Catch:{ all -> 0x04a7 }
        L_0x0328:
            r5.FLo(r12)     // Catch:{ all -> 0x04a7 }
        L_0x032b:
            monitor-exit(r5)
        L_0x032c:
            java.util.HashMap r0 = r9.A09
            if (r0 == 0) goto L_0x038d
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            if (r1 == 0) goto L_0x038d
            X.2Dm r5 = r6.A09
            java.util.List r0 = r7.A04
            com.instagram.model.direct.DirectThreadKey r10 = new com.instagram.model.direct.DirectThreadKey
            r10.<init>(r3, r0)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            X.48S r0 = r5.A0P(r10)     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x038c
            X.3U9 r4 = r0.A0I     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x04a7 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x04a7 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x04a7 }
        L_0x0355:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0389
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x04a7 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x04a7 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x04a7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04a7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04a7 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x04a7 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x04a7 }
            com.instagram.user.model.User r2 = r4.CCf(r1)     // Catch:{ all -> 0x04a7 }
            if (r2 == 0) goto L_0x0355
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04a7 }
            r2.A0r(r0)     // Catch:{ all -> 0x04a7 }
            X.1Ng r1 = r5.A06     // Catch:{ all -> 0x04a7 }
            X.7Pj r0 = new X.7Pj     // Catch:{ all -> 0x04a7 }
            r0.<init>(r2)     // Catch:{ all -> 0x04a7 }
            r1.A00(r0)     // Catch:{ all -> 0x04a7 }
            goto L_0x0355
        L_0x0389:
            r5.FLo(r10)     // Catch:{ all -> 0x04a7 }
        L_0x038c:
            monitor-exit(r5)
        L_0x038d:
            java.lang.Boolean r0 = r9.A04
            if (r0 == 0) goto L_0x03c1
            boolean r1 = r0.booleanValue()
        L_0x0395:
            X.2Dm r5 = r6.A09
            java.util.List r11 = r7.A04
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            r0.<init>(r3, r11)
            r5.A8d(r0, r1)
            java.lang.String r1 = r9.A07
            if (r1 == 0) goto L_0x03ad
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            r0.<init>(r3, r11)
            r5.A8r(r0, r1)
        L_0x03ad:
            java.lang.Boolean r0 = r9.A06
            if (r0 == 0) goto L_0x03bf
            boolean r10 = r0.booleanValue()
        L_0x03b5:
            com.instagram.model.direct.DirectThreadKey r4 = new com.instagram.model.direct.DirectThreadKey
            r4.<init>(r3, r11)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            r12 = 0
            goto L_0x03c3
        L_0x03bf:
            r10 = 0
            goto L_0x03b5
        L_0x03c1:
            r1 = 0
            goto L_0x0395
        L_0x03c3:
            X.48S r0 = r5.A0P(r4)     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x03f3
            X.3U9 r2 = r0.A0I     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x04a7 }
            java.util.List r0 = r2.BRZ()     // Catch:{ all -> 0x04a7 }
            int r1 = r0.size()     // Catch:{ all -> 0x04a7 }
            r0 = 1
            if (r1 != r0) goto L_0x03f3
            java.util.List r0 = r2.BRZ()     // Catch:{ all -> 0x04a7 }
            java.lang.Object r2 = r0.get(r12)     // Catch:{ all -> 0x04a7 }
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2     // Catch:{ all -> 0x04a7 }
            r2.A1G(r10)     // Catch:{ all -> 0x04a7 }
            X.1Ng r1 = r5.A06     // Catch:{ all -> 0x04a7 }
            X.DGp r0 = new X.DGp     // Catch:{ all -> 0x04a7 }
            r0.<init>(r2)     // Catch:{ all -> 0x04a7 }
            r1.A00(r0)     // Catch:{ all -> 0x04a7 }
            r5.FLo(r4)     // Catch:{ all -> 0x04a7 }
        L_0x03f3:
            monitor-exit(r5)
            java.lang.Boolean r0 = r9.A05
            if (r0 == 0) goto L_0x00c9
            boolean r10 = r0.booleanValue()
            com.instagram.model.direct.DirectThreadKey r4 = new com.instagram.model.direct.DirectThreadKey
            r4.<init>(r3, r11)
            monitor-enter(r5)
            X.48S r0 = r5.A0P(r4)     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0460
            X.3U9 r12 = r0.A0I     // Catch:{ all -> 0x04a7 }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x04a7 }
            X.0eM r0 = r12.A05     // Catch:{ all -> 0x04a7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04a7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0449
            java.util.concurrent.locks.ReentrantReadWriteLock r11 = r12.A03     // Catch:{ all -> 0x04a7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r11.readLock()     // Catch:{ all -> 0x04a7 }
            int r0 = r11.getWriteHoldCount()     // Catch:{ all -> 0x04a7 }
            r2 = 0
            if (r0 != 0) goto L_0x0435
            int r1 = r11.getReadHoldCount()     // Catch:{ all -> 0x04a7 }
            r0 = 0
        L_0x042d:
            if (r0 >= r1) goto L_0x0436
            r3.unlock()     // Catch:{ all -> 0x04a7 }
            int r0 = r0 + 1
            goto L_0x042d
        L_0x0435:
            r1 = 0
        L_0x0436:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r16 = r11.writeLock()     // Catch:{ all -> 0x04a7 }
            r16.lock()     // Catch:{ all -> 0x04a7 }
            X.3S9 r0 = r12.A01     // Catch:{ all -> 0x0493 }
            r0.A2T = r10     // Catch:{ all -> 0x0493 }
        L_0x0441:
            if (r2 >= r1) goto L_0x0450
            r3.lock()     // Catch:{ all -> 0x04a7 }
            int r2 = r2 + 1
            goto L_0x0441
        L_0x0449:
            X.3S9 r1 = r12.A01     // Catch:{ all -> 0x04a7 }
            monitor-enter(r1)     // Catch:{ all -> 0x04a7 }
            r1.A2T = r10     // Catch:{ all -> 0x04a0 }
            monitor-exit(r1)     // Catch:{ all -> 0x04a7 }
            goto L_0x0453
        L_0x0450:
            r16.unlock()     // Catch:{ all -> 0x04a7 }
        L_0x0453:
            X.1Ng r1 = r5.A06     // Catch:{ all -> 0x04a7 }
            X.7Ks r0 = new X.7Ks     // Catch:{ all -> 0x04a7 }
            r0.<init>(r10)     // Catch:{ all -> 0x04a7 }
            r1.A00(r0)     // Catch:{ all -> 0x04a7 }
            r5.FLo(r4)     // Catch:{ all -> 0x04a7 }
        L_0x0460:
            monitor-exit(r5)
            goto L_0x00c9
        L_0x0463:
            boolean r0 = r0.booleanValue()
            goto L_0x0026
        L_0x0469:
            r5 = r3
            r4 = r3
            goto L_0x002a
        L_0x046d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0475:
            r0 = move-exception
        L_0x0476:
            if (r2 >= r1) goto L_0x049c
            r4.lock()     // Catch:{ all -> 0x04a7 }
            int r2 = r2 + 1
            goto L_0x0476
        L_0x047e:
            r0 = move-exception
        L_0x047f:
            if (r2 >= r1) goto L_0x049c
            r15.lock()     // Catch:{ all -> 0x04a7 }
            int r2 = r2 + 1
            goto L_0x047f
        L_0x0487:
            r0 = move-exception
        L_0x0488:
            if (r4 >= r2) goto L_0x04a3
            r10.lock()     // Catch:{ all -> 0x04a7 }
            int r4 = r4 + 1
            goto L_0x0488
        L_0x0490:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x04a7 }
            goto L_0x04a6
        L_0x0493:
            r0 = move-exception
        L_0x0494:
            if (r2 >= r1) goto L_0x049c
            r3.lock()     // Catch:{ all -> 0x04a7 }
            int r2 = r2 + 1
            goto L_0x0494
        L_0x049c:
            r16.unlock()     // Catch:{ all -> 0x04a7 }
            goto L_0x04a6
        L_0x04a0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04a7 }
            goto L_0x04a6
        L_0x04a3:
            r1.unlock()     // Catch:{ all -> 0x04a7 }
        L_0x04a6:
            throw r0     // Catch:{ all -> 0x04a7 }
        L_0x04a7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BH.A04():void");
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(-1736351506);
        0qQ.A0B(r4, 0);
        this.A07.A08.A02(r4, this.A03);
        super.onFail(r4);
        AnonymousClass0fD.A0A(445629120, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1923557817);
        super.onStart();
        if (this.A00 == 1) {
            this.A07.A06.A04(this.A05, this.A02, this.A01);
        }
        AnonymousClass43O r4 = this.A07;
        r4.A06.A03(this.A05, this.A02, this.A01);
        r4.A08.A05(this.A03);
        AnonymousClass0fD.A0A(1231962006, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            X.MbX r2 = X.C66725MbW.A00(r3)
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "threadId"
        L_0x000a:
            r2.A01(r1, r0)
        L_0x000d:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x001a
            r0 = 5093(0x13e5, float:7.137E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A01(r1, r0)
        L_0x001a:
            java.lang.Long r1 = r3.A04
            java.lang.String r0 = "seqId"
            r2.A01(r1, r0)
            java.util.List r0 = r3.A03
            int r1 = r0.size()
            java.lang.String r0 = "pendingSyncMessages"
            r2.A02(r0, r1)
            java.lang.String r0 = r2.toString()
            X.0qQ.A07(r0)
            return r0
        L_0x0034:
            java.util.List r1 = r3.A04
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = "recipients"
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BH.toString():java.lang.String");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6BH(ThreadFetchReason threadFetchReason, AnonymousClass43O r3, Long l, String str, String str2, boolean z) {
        super(r3, l);
        this.A07 = r3;
        this.A03 = new ArrayList();
        this.A02 = str;
        this.A04 = null;
        this.A01 = str2;
        this.A05 = false;
        this.A06 = z;
        this.A00 = threadFetchReason;
    }
}

package X;

import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.ohai.OhaiPlugin;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.68H  reason: invalid class name */
public final class AnonymousClass68H extends AnonymousClass68I {
    public AnonymousClass67H A00;
    public AnonymousClass67L A01;
    public Mailbox A02;
    public SlimMailbox A03;
    public final AnonymousClass68O A04 = new AnonymousClass68O();
    public final AnonymousClass68F A05;
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A07 = new ConcurrentLinkedQueue();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r1 = r7[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r1 == 5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r1 != 7) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r10 = new X.MZI(r3);
        r8 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r8.A04.get() != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (r8.A00() != null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r1 = r8.A00;
        r3 = r1.A01;
        r9 = X.C300435xB.A00(r3.A08);
        r14 = r1.A09;
        r1 = (java.lang.Long) r8.A0N.get();
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r0 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r0 = (java.lang.String) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        r9.A0Q(r1, r14, r0, 3, false);
        X.MZN.A00(r3.A09).A02();
        r1 = r3.A0C;
        com.facebook.msys.mci.Execution.initialize(r1, (java.util.concurrent.Executor) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        if (((java.lang.Boolean) r8.A0D.get()).booleanValue() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r1 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        com.facebook.msys.mci.Execution.setThreadPriorities(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        r0 = r3.A0F;
        r6 = com.facebook.msys.mci.Execution.sThreadPriorityMap;
        r6.clear();
        r7 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        if (r7.hasNext() == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r0 = (java.util.Map.Entry) r7.next();
        r1 = r0.getKey();
        r5 = (java.lang.Number) r0.getValue();
        r6.put(r1, r5);
        r4 = (java.util.List) com.facebook.msys.mci.Execution.sThreadIds.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0116, code lost:
        if (r3.hasNext() == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        android.os.Process.setThreadPriority(((java.lang.Integer) r3.next()).intValue(), r5.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        r11 = new X.MZK(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0135, code lost:
        r13 = new X.MZJ(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Unsynchronized RUN_WITH_MAILBOX code does not exist for ");
        r1.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0155, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0156, code lost:
        if (r20 == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0158, code lost:
        com.facebook.msys.mci.Execution.executePossiblySync(new X.NBT(r3, r5), r12.mAccountSession, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0162, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0163, code lost:
        r9.A0I();
        r8.A0U.getClass();
        com.facebook.msys.mci.Stats.setUInt64(1, java.lang.System.currentTimeMillis());
        com.facebook.msys.mci.Execution.executeAsync(new X.AnonymousClass6EM(r8, r9, r10, r11, r12, r13, r14), r12.mAccountSession, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017c, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.msys.mca.SlimMailbox A00(X.AnonymousClass68H r19, com.facebook.msys.mca.MailboxCallback r20) {
        /*
            r2 = 1
            r3 = r19
            monitor-enter(r3)
            X.68O r1 = r3.A04     // Catch:{ all -> 0x017d }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x017d }
            X.68P r4 = r1.A00(r0)     // Catch:{ all -> 0x017d }
            int[] r7 = X.MZD.A00     // Catch:{ all -> 0x017d }
            int r6 = r4.ordinal()     // Catch:{ all -> 0x017d }
            r0 = r7[r6]     // Catch:{ all -> 0x017d }
            r5 = r20
            switch(r0) {
                case 1: goto L_0x0030;
                case 2: goto L_0x003d;
                case 3: goto L_0x0030;
                case 4: goto L_0x0019;
                case 5: goto L_0x004f;
                case 6: goto L_0x003d;
                case 7: goto L_0x0060;
                case 8: goto L_0x0030;
                default: goto L_0x0019;
            }     // Catch:{ all -> 0x017d }
        L_0x0019:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
            r1.<init>()     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "calling RUN_WITH_MAILBOX must not return "
            r1.append(r0)     // Catch:{ all -> 0x017d }
            r1.append(r4)     // Catch:{ all -> 0x017d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x017d }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017d }
            r0.<init>(r1)     // Catch:{ all -> 0x017d }
            throw r0     // Catch:{ all -> 0x017d }
        L_0x0030:
            java.lang.String r2 = "LazyMailbox"
            java.lang.String r1 = "Ignore run with mailbox calls after mailbox clean up start, current phase: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x017d }
            X.0KC.A0O(r2, r1, r0)     // Catch:{ all -> 0x017d }
            r12 = 0
            goto L_0x004d
        L_0x003d:
            com.facebook.msys.mca.SlimMailbox r1 = r3.A03     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "the slim mailbox must not be null in the INITIALIZING phase"
            X.0Sd.A01(r1, r0)     // Catch:{ all -> 0x017d }
            if (r20 == 0) goto L_0x004b
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A07     // Catch:{ all -> 0x017d }
            r0.add(r5)     // Catch:{ all -> 0x017d }
        L_0x004b:
            com.facebook.msys.mca.SlimMailbox r12 = r3.A03     // Catch:{ all -> 0x017d }
        L_0x004d:
            monitor-exit(r3)     // Catch:{ all -> 0x017d }
            return r12
        L_0x004f:
            com.facebook.msys.mca.Mailbox r1 = r3.A02     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "the mailbox must not be null in the READY phase"
            X.0Sd.A01(r1, r0)     // Catch:{ all -> 0x017d }
            com.facebook.msys.mca.SlimMailbox r1 = r3.A03     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "the slim mailbox must not be null in the READY phase"
            X.0Sd.A01(r1, r0)     // Catch:{ all -> 0x017d }
            com.facebook.msys.mca.SlimMailbox r12 = r3.A03     // Catch:{ all -> 0x017d }
            goto L_0x006f
        L_0x0060:
            if (r20 == 0) goto L_0x0067
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A07     // Catch:{ all -> 0x017d }
            r0.add(r5)     // Catch:{ all -> 0x017d }
        L_0x0067:
            X.68F r0 = r3.A05     // Catch:{ all -> 0x017d }
            com.facebook.msys.mca.SlimMailbox r12 = X.MZE.A02(r0)     // Catch:{ all -> 0x017d }
            r3.A03 = r12     // Catch:{ all -> 0x017d }
        L_0x006f:
            monitor-exit(r3)     // Catch:{ all -> 0x017d }
            r1 = r7[r6]
            r0 = 5
            if (r1 == r0) goto L_0x0156
            r0 = 7
            if (r1 != r0) goto L_0x013f
            X.MZI r10 = new X.MZI
            r10.<init>(r3)
            X.68F r8 = r3.A05
            X.5wo r0 = r8.A04
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0135
            r13 = 0
        L_0x0088:
            com.facebook.msys.mci.Database$OpenCallback r0 = r8.A00()
            if (r0 != 0) goto L_0x012e
            r11 = 0
        L_0x008f:
            X.692 r1 = r8.A00
            X.5wg r3 = r1.A01
            com.facebook.quicklog.QuickPerformanceLogger r0 = r3.A08
            X.5xB r9 = X.C300435xB.A00(r0)
            java.lang.String r14 = r1.A09
            X.5wo r0 = r8.A0N
            java.lang.Object r1 = r0.get()
            java.lang.Long r1 = (java.lang.Long) r1
            X.5wo r0 = r8.A02
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
        L_0x00ad:
            r20 = 0
            r19 = 3
            r15 = r9
            r16 = r1
            r17 = r14
            r18 = r0
            r15.A0Q(r16, r17, r18, r19, r20)
            com.facebook.quicklog.reliability.UserFlowLogger r0 = r3.A09
            X.MZN r0 = X.MZN.A00(r0)
            r0.A02()
            java.lang.Integer r1 = r3.A0C
            r0 = 0
            com.facebook.msys.mci.Execution.initialize(r1, r0)
            X.5wo r0 = r8.A0D
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00dd
            if (r1 == 0) goto L_0x00dd
            com.facebook.msys.mci.Execution.setThreadPriorities(r1)
        L_0x00dd:
            java.util.Map r0 = r3.A0F
            java.util.concurrent.ConcurrentHashMap r6 = com.facebook.msys.mci.Execution.sThreadPriorityMap
            r6.clear()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x00ec:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r5 = r0.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            r6.put(r1, r5)
            java.util.Map r0 = com.facebook.msys.mci.Execution.sThreadIds
            java.lang.Object r4 = r0.get(r1)
            java.util.List r4 = (java.util.List) r4
            monitor-enter(r4)
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x013c }
        L_0x0112:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x013c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x013c }
            int r1 = r0.intValue()     // Catch:{ all -> 0x013c }
            int r0 = r5.intValue()     // Catch:{ all -> 0x013c }
            android.os.Process.setThreadPriority(r1, r0)     // Catch:{ all -> 0x013c }
            goto L_0x0112
        L_0x012a:
            monitor-exit(r4)     // Catch:{ all -> 0x013c }
            goto L_0x00ec
        L_0x012c:
            r0 = 0
            goto L_0x00ad
        L_0x012e:
            X.MZK r11 = new X.MZK
            r11.<init>(r3)
            goto L_0x008f
        L_0x0135:
            X.MZJ r13 = new X.MZJ
            r13.<init>(r3)
            goto L_0x0088
        L_0x013c:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013c }
            throw r1
        L_0x013f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsynchronized RUN_WITH_MAILBOX code does not exist for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0156:
            if (r20 == 0) goto L_0x017c
            X.NBT r1 = new X.NBT
            r1.<init>(r3, r5)
            com.facebook.msys.mci.AccountSession r0 = r12.mAccountSession
            com.facebook.msys.mci.Execution.executePossiblySync(r1, r0, r2)
            return r12
        L_0x0163:
            r9.A0I()
            java.lang.Boolean r0 = r8.A0U
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            com.facebook.msys.mci.Stats.setUInt64(r2, r0)
            X.6EM r7 = new X.6EM
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.facebook.msys.mci.AccountSession r0 = r12.mAccountSession
            com.facebook.msys.mci.Execution.executeAsync(r7, r0, r2)
        L_0x017c:
            return r12
        L_0x017d:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x017d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68H.A00(X.68H, com.facebook.msys.mca.MailboxCallback):com.facebook.msys.mca.SlimMailbox");
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.XY9] */
    public static void A01(AnonymousClass68H r12) {
        int i;
        C55588Hk8[] hk8Arr;
        boolean z;
        synchronized (r12) {
            boolean z2 = false;
            if (r12.A04.A00(AnonymousClass05K.A0Y) == AnonymousClass68P.A02) {
                z2 = true;
            }
            0Sd.A03(z2, "clean_up_ready can only result in destroyed phase");
            r12.A03 = null;
            r12.A02 = null;
            ConcurrentLinkedQueue concurrentLinkedQueue = r12.A06;
            hk8Arr = (C55588Hk8[]) concurrentLinkedQueue.toArray(new C55588Hk8[0]);
            concurrentLinkedQueue.clear();
        }
        synchronized (r12) {
            if (r12.A00 != null) {
                AnonymousClass67I.A00.getAndIncrement();
                r12.A00 = null;
            }
        }
        AnonymousClass68F r11 = r12.A05;
        AnonymousClass692 r3 = r11.A00;
        QuickPerformanceLogger quickPerformanceLogger = r3.A01.A08;
        C300435xB.A00(quickPerformanceLogger).A03();
        NetworkSession A002 = MsysInfraNoSqliteObjectHolder.A00();
        AuthData authData = r3.A03;
        if (A002 != null) {
            AnonymousClass689 r8 = (AnonymousClass689) r11.A0K.get();
            if (r8 != null) {
                AnonymousClass2HN r122 = r8.A01;
                if (AnonymousClass2HN.A00()) {
                    ((OhaiPlugin) r8.A00.A01(OhaiPlugin.class, C301415zC.A00)).unregister(A002, authData);
                }
                if (((Boolean) r122.A0Q.get()).booleanValue()) {
                    UserSession userSession = r8.A00;
                    ((DgwNetworkSessionPluginImpl) userSession.A01(DgwNetworkSessionPluginImpl.class, new AnonymousClass9LX(userSession, 10))).unregister(A002, authData);
                }
            }
            if (r11.A01() != null) {
                MqttNetworkSessionPlugin.get().unregister(A002, authData);
            }
        }
        String str = MZE.A00;
        if (str != null) {
            synchronized (MsysInfraNoSqliteObjectHolder.class) {
                MsysInfraNoSqliteObjectHolder msysInfraNoSqliteObjectHolder = MsysInfraNoSqliteObjectHolder.A03;
                HashSet hashSet = msysInfraNoSqliteObjectHolder.A00;
                if (hashSet.contains(str) && hashSet.size() > 1) {
                    hashSet.remove(str);
                } else if (hashSet.contains(str)) {
                    if (msysInfraNoSqliteObjectHolder.A02 != null) {
                        msysInfraNoSqliteObjectHolder.A02.dispose();
                    }
                    hashSet.clear();
                    msysInfraNoSqliteObjectHolder.A02 = null;
                    msysInfraNoSqliteObjectHolder.A01 = null;
                }
            }
        }
        C300435xB.A00(quickPerformanceLogger).A02();
        synchronized (XY9.class) {
            if (XY9.A00 == null) {
                XY9.A00 = new Object();
            }
        }
        String str2 = r3.A09;
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(53086316);
            if (str2 != null) {
                z = new File(str2).exists();
            } else {
                z = false;
            }
            withMarker.annotate("db_file_exist_at_end", z);
            withMarker.markerEditingCompleted();
            quickPerformanceLogger.markerEnd(53086316, 2);
        }
        for (C55588Hk8 hk8 : hk8Arr) {
            hk8.A00.onCompletion((Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.XY9] */
    public static void A02(AnonymousClass68H r6) {
        Mailbox mailbox;
        C55588Hk8 hk8;
        boolean z;
        synchronized (r6) {
            mailbox = r6.A02;
            hk8 = (C55588Hk8) r6.A06.peek();
        }
        if (mailbox == null) {
            0KC.A0N("LazyMailbox", "Mailbox is null, no shutdown has occurred for %s", new RuntimeException("Shutdown skipped"), new Object[]{r6.A05.A00.A04});
            A01(r6);
            return;
        }
        0Sd.A00(hk8);
        int intValue = hk8.A01.intValue();
        synchronized (XY9.class) {
            if (XY9.A00 == null) {
                XY9.A00 = new Object();
            }
        }
        AnonymousClass692 r1 = r6.A05.A00;
        QuickPerformanceLogger quickPerformanceLogger = r1.A01.A08;
        String str = r1.A09;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(53086316);
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(53086316);
            withMarker.annotate("bootstrapper_ver", 3);
            withMarker.annotate("mailbox_ver", 3);
            withMarker.annotate("cleanup_type", intValue);
            if (str != null) {
                z = new File(str).exists();
            } else {
                z = false;
            }
            withMarker.annotate("db_file_exist_at_start", z);
            withMarker.markerEditingCompleted();
        }
        Execution.executeAsync(new NBS(r6, intValue), (AccountSession) null, 1);
    }

    public AnonymousClass68H(AnonymousClass68F r2) {
        r2.getClass();
        this.A05 = r2;
    }
}

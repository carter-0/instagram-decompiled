package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.FutureTask;

/* renamed from: X.6R6  reason: invalid class name */
public final class AnonymousClass6R6 {
    public final AnonymousClass6R2 A00;
    public final C307656Qy A01;
    public final AnonymousClass0JR A02;
    public final C307556Qo A03;

    public AnonymousClass6R6(AnonymousClass6R2 r2, C307656Qy r3, C307556Qo r4) {
        0qQ.A0B(r4, 3);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        0qQ.A07(realtimeSinceBootClock);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = realtimeSinceBootClock;
    }

    public final void A02(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((REH) it.next()).ordinal();
            if (ordinal == 0) {
                C307656Qy r4 = this.A01;
                try {
                    1KZ.A01(002.A0T("BloksComponentQueryLRUMemoryCache", QuickExperimentDumperPlugin.CLEAR_CMD, ':'));
                    synchronized (r4.A04) {
                        16f r1 = r4.A02;
                        r1.A05(-1);
                        LinkedHashMap A04 = r1.A04();
                        r4.A00 = A04;
                        r4.A03.A01(new AnonymousClass6RJ(A04));
                    }
                    1KZ.A00();
                } catch (Throwable th) {
                    1KZ.A00();
                    throw th;
                }
            } else if (ordinal == 1) {
                AnonymousClass6R2 r0 = this.A00;
                r0.A04.execute(new FutureTask(new TN2(r0)));
            } else {
                throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.1zE.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A00(X.Q3K r31, X.Q34 r32, X.AnonymousClass6R6 r33, X.C11017S5o r34, java.lang.String r35, long r36, long r38, long r40) {
        /*
            r10 = r33
            X.6Qo r14 = r10.A03
            long r2 = r14.currentMonotonicTimestamp()
            r30 = r34
            r0 = r30
            X.Q3y r9 = r0.A01
            r8 = 0
            if (r9 == 0) goto L_0x0140
            long r0 = r9.A00
            r28 = r0
            r16 = r31
            r19 = r36
            r26 = r38
            r21 = r16
            r22 = r0
            r24 = r19
            boolean r0 = X.Q32.A04(r21, r22, r24, r26)
            if (r0 == 0) goto L_0x0140
            java.lang.String r4 = r9.A02
            X.0sn r13 = X.0sn.A00
            java.lang.String r11 = "ComponentQueryParser"
            java.lang.String r1 = "parseWithExternalVariableEntries"
            r0 = 58
            java.lang.String r0 = X.002.A0T(r11, r1, r0)     // Catch:{ all -> 0x013b }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x013b }
            int r1 = r4.length()     // Catch:{ all -> 0x013b }
            r0 = 0
            if (r1 != 0) goto L_0x0040
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x0057
            r0 = 486(0x1e6, float:6.81E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x013b }
            X.1Kn.A02(r0, r11)     // Catch:{ all -> 0x013b }
            X.Q3p r0 = new X.Q3p     // Catch:{ all -> 0x013b }
            r0.<init>()     // Catch:{ all -> 0x013b }
            X.0eP r1 = new X.0eP     // Catch:{ all -> 0x013b }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x013b }
            goto L_0x00dc
        L_0x0057:
            long r6 = r14.currentMonotonicTimestamp()     // Catch:{ all -> 0x013b }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ Exception -> 0x00ce }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00ce }
            android.util.JsonReader r12 = new android.util.JsonReader     // Catch:{ Exception -> 0x00ce }
            r12.<init>(r0)     // Catch:{ Exception -> 0x00ce }
            X.8fW r0 = new X.8fW     // Catch:{ all -> 0x00c7 }
            r0.<init>(r12)     // Catch:{ all -> 0x00c7 }
            r0.Crg()     // Catch:{ all -> 0x00c7 }
            X.Q3k r1 = X.C7307Q3j.A00(r0)     // Catch:{ all -> 0x00c7 }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "Expected a valid set of components but found none"
            X.1Kn.A02(r0, r11)     // Catch:{ all -> 0x00c7 }
            X.Q3p r0 = new X.Q3p     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            X.0eP r1 = new X.0eP     // Catch:{ all -> 0x00c7 }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x00c7 }
            r12.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00dc
        L_0x0088:
            long r4 = r14.currentMonotonicTimestamp()     // Catch:{ all -> 0x00c7 }
            X.Q3u r13 = X.C7314Q3q.A00(r1, r13)     // Catch:{ all -> 0x00c7 }
            long r0 = r14.currentMonotonicTimestamp()     // Catch:{ all -> 0x00c7 }
            X.Q3w r14 = new X.Q3w     // Catch:{ all -> 0x00c7 }
            r14.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r15 = "parse_start"
            r14.A00(r15, r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r15 = "json_parse_start"
            r14.A00(r15, r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = "json_parse_end"
            r14.A00(r6, r4)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "parse_end"
            r14.A00(r4, r0)     // Catch:{ all -> 0x00c7 }
            java.util.Map r0 = r14.A02     // Catch:{ all -> 0x00c7 }
            java.util.Map r4 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x00c7 }
            java.util.Map r0 = r14.A01     // Catch:{ all -> 0x00c7 }
            java.util.Map r1 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x00c7 }
            X.Q3v r0 = new X.Q3v     // Catch:{ all -> 0x00c7 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x00c7 }
            X.0eP r1 = new X.0eP     // Catch:{ all -> 0x00c7 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x00c7 }
            r12.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00dc
        L_0x00c7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            X.1zE.A00(r12, r1)     // Catch:{ Exception -> 0x00ce }
            throw r0     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            X.1Kn.A03(r11, r0)     // Catch:{ all -> 0x013b }
            X.Q3p r0 = new X.Q3p     // Catch:{ all -> 0x013b }
            r0.<init>()     // Catch:{ all -> 0x013b }
            X.0eP r1 = new X.0eP     // Catch:{ all -> 0x013b }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x013b }
        L_0x00dc:
            X.1KZ.A00()
            java.lang.Object r15 = r1.A00
            X.Q3u r15 = (X.C7318Q3u) r15
            java.lang.Object r4 = r1.A01
            if (r15 == 0) goto L_0x0140
            X.6Qy r14 = r10.A01
            X.T9F r0 = r9.A01
            r18 = r35
            r17 = r0
            r21 = r28
            r14.A00(r15, r16, r17, r18, r19, r21)
            X.Q3t r5 = new X.Q3t
            r9 = r5
            r10 = r15
            r11 = r16
            r12 = r0
            r13 = r8
            r14 = r28
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = r30
            X.Q3h r8 = r0.A00
            X.Q3h r4 = (X.C7305Q3h) r4
            java.lang.String r1 = "cache_src"
            java.lang.String r0 = "disk"
            r9 = r32
            r9.A01(r1, r0)
            java.lang.String r0 = "read_start"
            r6 = r40
            r9.A00(r0, r6)
            java.lang.String r0 = "read_end"
            r9.A00(r0, r2)
            java.util.Map r0 = r9.A02
            java.util.Map r2 = X.0Yt.A0B(r0)
            java.util.Map r0 = r9.A01
            java.util.Map r1 = X.0Yt.A0B(r0)
            X.R9N r0 = new X.R9N
            r0.<init>(r2, r1)
            X.Q3h[] r0 = new X.C7305Q3h[]{r8, r4, r0}
            X.Q3h r0 = X.C7306Q3i.A00(r0)
            X.0eP r8 = new X.0eP
            r8.<init>(r5, r0)
            return r8
        L_0x013b:
            r0 = move-exception
            X.1KZ.A00()
            throw r0
        L_0x0140:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6R6.A00(X.Q3K, X.Q34, X.6R6, X.S5o, java.lang.String, long, long, long):X.0eP");
    }

    public final AnonymousClass6RK A01(AnonymousClass6RF r7) {
        AnonymousClass6RK r1;
        C307656Qy r5 = this.A01;
        AnonymousClass6RH r4 = new AnonymousClass6RH(r7);
        try {
            1KZ.A01(002.A0T("BloksComponentQueryLRUMemoryCache", "getSnapshotAndSubscribe", ':'));
            synchronized (r5.A04) {
                r1 = new AnonymousClass6RK(r5.A03.A00(r4), new AnonymousClass6RJ(r5.A00));
            }
            1KZ.A00();
            return new AnonymousClass6RK(r1.A01, new AnonymousClass6RL(((AnonymousClass6RJ) r1.A00).A00));
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
    }
}

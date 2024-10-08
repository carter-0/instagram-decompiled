package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.gtm.zzcj;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Qvc  reason: case insensitive filesystem */
public final class C8490Qvc extends C8492Qve {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final C8487QvZ A03;
    public final C8491Qvd A04;
    public final SHG A05;
    public final zzcj A06;
    public final C8489Qvb A07;
    public final SHG A08;
    public final C11233SGt A09 = new C11233SGt(this.A00.A04);

    private final void A00() {
        C8484QvW qvW = this.A00.A0B;
        C11381SQt.A02(qvW);
        if (qvW.A01 && !qvW.A02) {
            C11200SFa.A00();
            A0J();
            try {
                C8491Qvd qvd = this.A04;
                C11200SFa.A00();
                qvd.A0J();
                long A012 = C8491Qvd.A01(qvd, C8491Qvd.A04, (String[]) null);
                if (A012 != 0 && Math.abs(C51966G9m.A07(A012)) <= AnonymousClass7TE.A0R(SDN.A0J.A00)) {
                    Object obj = SDN.A0I.A00;
                    A0E("Dispatch alarm scheduled (ms)", obj);
                    qvW.A0J();
                    AnonymousClass3Qk.A09(qvW.A01, "Receiver not registered");
                    long A0R = AnonymousClass7TE.A0R(obj);
                    if (A0R > 0) {
                        qvW.A0K();
                        C11381SQt sQt = qvW.A00;
                        SystemClock.elapsedRealtime();
                        qvW.A02 = true;
                        ST5.A0B(qvW, "Scheduling upload with JobScheduler", 2);
                        Context context = sQt.A00;
                        ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService");
                        Integer num = qvW.A00;
                        if (num == null) {
                            num = Integer.valueOf(Pxh.A0l("analytics", context.getPackageName()).hashCode());
                            qvW.A00 = num;
                        }
                        int intValue = num.intValue();
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                        JobInfo build = new JobInfo.Builder(intValue, componentName).setMinimumLatency(A0R).setOverrideDeadline(A0R << 1).setExtras(persistableBundle).build();
                        qvW.A0E("Scheduling job. JobID", Integer.valueOf(intValue));
                        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(build);
                    }
                }
            } catch (SQLiteException e) {
                A0H("Failed to get min/max hit times from local store", e);
            }
        }
    }

    private final void A01() {
        SHG shg = this.A08;
        if (shg.A02 != 0) {
            ST5.A0B(this, "All hits dispatched or no network/service. Going to power save mode", 2);
        }
        shg.A02 = 0;
        SHG.A00(shg).removeCallbacks(shg.A01);
        C8484QvW qvW = this.A00.A0B;
        C11381SQt.A02(qvW);
        if (qvW.A02) {
            qvW.A0K();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        r6.A00 = r2;
        X.C8487QvZ.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C8490Qvc r11) {
        /*
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x00bf
            X.SNL r0 = X.SDN.A0C
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00bf
            X.QvZ r6 = r11.A03
            X.C11200SFa.A00()
            r6.A0J()
            com.google.android.gms.internal.gtm.zzce r0 = r6.A00
            if (r0 != 0) goto L_0x00bf
            X.SNL r0 = X.SDN.A08
            java.lang.Object r0 = r0.A00
            long r0 = X.AnonymousClass7TE.A0R(r0)
            X.SGt r5 = r11.A09
            boolean r0 = r5.A00(r0)
            if (r0 == 0) goto L_0x00bf
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A00 = r0
            java.lang.String r1 = "Connecting to service"
            r0 = 2
            X.ST5.A0B(r11, r1, r0)
            X.C11200SFa.A00()
            r6.A0J()
            com.google.android.gms.internal.gtm.zzce r0 = r6.A00
            r10 = 1
            if (r0 != 0) goto L_0x00b2
            X.SVX r4 = r6.A01
            X.C11200SFa.A00()
            java.lang.String r0 = "com.google.android.gms.analytics.service.START"
            android.content.Intent r9 = X.Pxe.A0G(r0)
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = "com.google.android.gms.analytics.service.AnalyticsService"
            X.C66581MXm.A17(r9, r1, r0)
            X.QvZ r3 = r4.A02
            X.SQt r0 = r3.A00
            android.content.Context r8 = r0.A00
            java.lang.String r1 = "app_package_name"
            java.lang.String r0 = r8.getPackageName()
            r9.putExtra(r1, r0)
            X.64D r2 = X.AnonymousClass64D.A00()
            monitor-enter(r4)
            r7 = 0
            r4.A00 = r7     // Catch:{ all -> 0x00a8 }
            r4.A01 = r10     // Catch:{ all -> 0x00a8 }
            X.SVX r1 = r3.A01     // Catch:{ all -> 0x00a8 }
            r0 = 129(0x81, float:1.81E-43)
            boolean r8 = r2.A03(r8, r9, r1, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "Bind to service requested"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x00a8 }
            r3.A0E(r1, r0)     // Catch:{ all -> 0x00a8 }
            r2 = 0
            if (r8 != 0) goto L_0x0084
            r4.A01 = r2     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0084:
            X.SNL r0 = X.SDN.A07     // Catch:{ InterruptedException -> 0x0092 }
            java.lang.Object r0 = r0.A00     // Catch:{ InterruptedException -> 0x0092 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ InterruptedException -> 0x0092 }
            long r0 = r0.longValue()     // Catch:{ InterruptedException -> 0x0092 }
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0092 }
            goto L_0x0098
        L_0x0092:
            java.lang.String r1 = "Wait for service connect was interrupted"
            r0 = 5
            X.ST5.A0B(r3, r1, r0)     // Catch:{ all -> 0x00a8 }
        L_0x0098:
            r4.A01 = r2     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.internal.gtm.zzce r2 = r4.A00     // Catch:{ all -> 0x00a8 }
            r4.A00 = r7     // Catch:{ all -> 0x00a8 }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r1 = "Successfully bound to service but never got onServiceConnected callback"
            r0 = 6
            X.ST5.A0B(r3, r1, r0)     // Catch:{ all -> 0x00a8 }
        L_0x00a6:
            monitor-exit(r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x00ab
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a8 }
            throw r0
        L_0x00ab:
            if (r2 == 0) goto L_0x00bf
            r6.A00 = r2
            X.C8487QvZ.A00(r6)
        L_0x00b2:
            java.lang.String r1 = "Connected to service"
            r0 = 2
            X.ST5.A0B(r11, r1, r0)
            r0 = 0
            r5.A00 = r0
            r11.A0K()
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8490Qvc.A03(X.Qvc):void");
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x034d A[SYNTHETIC, Splitter:B:144:0x034d] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0359 A[Catch:{ SQLiteException -> 0x009d, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0365 A[Catch:{ SQLiteException -> 0x009d, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0374 A[Catch:{ SQLiteException -> 0x009d, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x039b A[Catch:{ SQLiteException -> 0x009d, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04c2 A[Catch:{ SQLiteException -> 0x009d, all -> 0x0529 }, LOOP:5: B:222:0x04bc->B:224:0x04c2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04ea A[SYNTHETIC, Splitter:B:234:0x04ea] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0502 A[SYNTHETIC, Splitter:B:241:0x0502] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0510 A[SYNTHETIC, Splitter:B:249:0x0510] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x03d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c6 A[Catch:{ SQLiteException -> 0x009d, all -> 0x0529 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C8490Qvc r38) {
        /*
            java.lang.String r23 = "Failed to commit local dispatch transaction"
            X.C11200SFa.A00()
            r2 = r38
            r2.A0J()
            java.lang.String r0 = "Dispatching a batch of local hits"
            r13 = 2
            X.ST5.A0B(r2, r0, r13)
            X.QvZ r0 = r2.A03
            r38 = r0
            X.C11200SFa.A00()
            r38.A0J()
            com.google.android.gms.internal.gtm.zzce r0 = r0.A00
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r1 = r0 ^ 1
            X.Qvb r6 = r2.A07
            boolean r0 = r6.A0L()
            r0 = r0 ^ 1
            r27 = 0
            if (r1 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "No network or service available. Will retry later"
            X.ST5.A0B(r2, r0, r13)
            return
        L_0x0036:
            X.SNL r0 = X.SDN.A0K
            java.lang.Object r0 = r0.A00
            r26 = r0
            r0 = r26
            java.lang.Number r0 = (java.lang.Number) r0
            r26 = r0
            int r1 = r26.intValue()
            X.SNL r0 = X.SDN.A0L
            java.lang.Object r0 = r0.A00
            r25 = r0
            r0 = r25
            java.lang.Number r0 = (java.lang.Number) r0
            r25 = r0
            int r0 = r25.intValue()
            int r0 = java.lang.Math.max(r1, r0)
            long r0 = (long) r0
            r36 = r0
            java.util.ArrayList r24 = X.AnonymousClass7TE.A1C()
            r8 = 0
        L_0x0063:
            X.Qvd r0 = r2.A04     // Catch:{ all -> 0x0529 }
            r35 = r0
            r35.A0J()     // Catch:{ all -> 0x0529 }
            android.database.sqlite.SQLiteDatabase r1 = r35.A0K()     // Catch:{ all -> 0x0529 }
            r0 = -1896096357(0xffffffff8efbdd9b, float:-6.2089676E-30)
            X.AnonymousClass0fa.A01(r1, r0)     // Catch:{ all -> 0x0529 }
            r24.clear()     // Catch:{ all -> 0x0529 }
            r0 = r36
            r3 = r35
            java.util.ArrayList r3 = r3.A0L(r0)     // Catch:{ SQLiteException -> 0x009d }
            boolean r0 = r3.isEmpty()     // Catch:{ SQLiteException -> 0x009d }
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "Store is empty, nothing to dispatch"
            X.ST5.A0B(r2, r0, r13)     // Catch:{ SQLiteException -> 0x009d }
            r2.A01()     // Catch:{ SQLiteException -> 0x009d }
            goto L_0x051b
        L_0x008f:
            java.lang.String r1 = "Hits loaded from store. count"
            int r0 = r3.size()     // Catch:{ SQLiteException -> 0x009d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x009d }
            r2.A0E(r1, r0)     // Catch:{ SQLiteException -> 0x009d }
            goto L_0x00a4
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "Failed to read hits from persisted store"
            r2.A0G(r0, r1)     // Catch:{ all -> 0x0529 }
            goto L_0x00ce
        L_0x00a4:
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x0529 }
        L_0x00a8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0529 }
            X.SHk r0 = (X.C11250SHk) r0     // Catch:{ all -> 0x0529 }
            long r0 = r0.A01     // Catch:{ all -> 0x0529 }
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00a8
            java.lang.String r7 = "Database contains successfully uploaded hit"
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0529 }
            int r0 = r3.size()     // Catch:{ all -> 0x0529 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0529 }
            r8 = 6
            r6 = 0
            r3 = r2
            X.ST5.A0A(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0529 }
        L_0x00ce:
            r2.A01()     // Catch:{ all -> 0x0529 }
            goto L_0x051b
        L_0x00d3:
            X.C11200SFa.A00()     // Catch:{ all -> 0x0529 }
            r38.A0J()     // Catch:{ all -> 0x0529 }
            r0 = r38
            com.google.android.gms.internal.gtm.zzce r0 = r0.A00     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "Service connected, sending hits to the service"
            X.ST5.A0B(r2, r0, r13)     // Catch:{ all -> 0x0529 }
        L_0x00e4:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x0131
            r0 = r27
            java.lang.Object r5 = r3.get(r0)     // Catch:{ all -> 0x0529 }
            X.SHk r5 = (X.C11250SHk) r5     // Catch:{ all -> 0x0529 }
            r0 = r38
            boolean r0 = r0.A0L(r5)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0131
            long r0 = r5.A01     // Catch:{ all -> 0x0529 }
            long r8 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x0529 }
            r3.remove(r5)     // Catch:{ all -> 0x0529 }
            java.lang.String r4 = "Hit sent do device AnalyticsService for delivery"
            r2.A0F(r4, r5)     // Catch:{ all -> 0x0529 }
            X.C11200SFa.A00()     // Catch:{ SQLiteException -> 0x012a }
            r35.A0J()     // Catch:{ SQLiteException -> 0x012a }
            r4 = 1
            java.util.ArrayList r5 = X.DbS.A0v(r4)     // Catch:{ SQLiteException -> 0x012a }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x012a }
            r5.add(r4)     // Catch:{ SQLiteException -> 0x012a }
            java.lang.String r1 = "Deleting hit, id"
            r0 = r35
            r0.A0E(r1, r4)     // Catch:{ SQLiteException -> 0x012a }
            r0.A0N(r5)     // Catch:{ SQLiteException -> 0x012a }
            r0 = r24
            r0.add(r4)     // Catch:{ SQLiteException -> 0x012a }
            goto L_0x00e4
        L_0x012a:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove hit that was send for delivery"
            r2.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            goto L_0x00ce
        L_0x0131:
            boolean r0 = r6.A0L()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x04e4
            X.C11200SFa.A00()     // Catch:{ all -> 0x0529 }
            r6.A0J()     // Catch:{ all -> 0x0529 }
            X.SQt r5 = r6.A00     // Catch:{ all -> 0x0529 }
            X.S2U r0 = r5.A09     // Catch:{ all -> 0x0529 }
            r34 = r0
            java.util.Set r0 = r34.A00()     // Catch:{ all -> 0x0529 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x01c0
            X.SGt r4 = r6.A00     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A01     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0529 }
            long r0 = X.Pxf.A0E(r0)     // Catch:{ all -> 0x0529 }
            boolean r0 = r4.A00(r0)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x01c0
            X.SNL r0 = X.SDN.A0R     // Catch:{ all -> 0x0529 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "BATCH_BY_SESSION"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0174
            X.RDT r1 = X.RDT.BATCH_BY_SESSION     // Catch:{ all -> 0x0529 }
        L_0x0171:
            X.RDT r0 = X.RDT.NONE     // Catch:{ all -> 0x0529 }
            goto L_0x01a3
        L_0x0174:
            java.lang.String r0 = "BATCH_BY_TIME"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x017f
            X.RDT r1 = X.RDT.BATCH_BY_TIME     // Catch:{ all -> 0x0529 }
            goto L_0x0171
        L_0x017f:
            java.lang.String r0 = "BATCH_BY_BRUTE_FORCE"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x018a
            X.RDT r1 = X.RDT.BATCH_BY_BRUTE_FORCE     // Catch:{ all -> 0x0529 }
            goto L_0x0171
        L_0x018a:
            java.lang.String r0 = "BATCH_BY_COUNT"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0195
            X.RDT r1 = X.RDT.BATCH_BY_COUNT     // Catch:{ all -> 0x0529 }
            goto L_0x0171
        L_0x0195:
            java.lang.String r0 = "BATCH_BY_SIZE"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x01a0
            X.RDT r1 = X.RDT.BATCH_BY_SIZE     // Catch:{ all -> 0x0529 }
            goto L_0x0171
        L_0x01a0:
            X.RDT r1 = X.RDT.NONE     // Catch:{ all -> 0x0529 }
            goto L_0x0171
        L_0x01a3:
            boolean r4 = X.C51969G9p.A1a(r1, r0)
            X.SNL r0 = X.SDN.A0S     // Catch:{ all -> 0x0529 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "GZIP"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x01bd
            X.RDQ r1 = X.RDQ.GZIP     // Catch:{ all -> 0x0529 }
        L_0x01b7:
            X.RDQ r0 = X.RDQ.GZIP     // Catch:{ all -> 0x0529 }
            r15 = 1
            if (r1 == r0) goto L_0x01c2
            goto L_0x01c1
        L_0x01bd:
            X.RDQ r1 = X.RDQ.NONE     // Catch:{ all -> 0x0529 }
            goto L_0x01b7
        L_0x01c0:
            r4 = 0
        L_0x01c1:
            r15 = 0
        L_0x01c2:
            r14 = 200(0xc8, float:2.8E-43)
            if (r4 == 0) goto L_0x039b
            boolean r0 = X.DbT.A1b(r3)     // Catch:{ all -> 0x0529 }
            X.AnonymousClass3Qk.A07(r0)     // Catch:{ all -> 0x0529 }
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x0529 }
            int r0 = r3.size()     // Catch:{ all -> 0x0529 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r20 = "Uploading batched hits. compression, count"
            r19 = 0
            r16 = r6
            r21 = r13
            X.ST5.A0A(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0529 }
            r22 = 0
            java.io.ByteArrayOutputStream r4 = X.Pxe.A0b()     // Catch:{ all -> 0x0529 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0529 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0529 }
        L_0x01f2:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0267
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x0529 }
            X.SHk r3 = (X.C11250SHk) r3     // Catch:{ all -> 0x0529 }
            X.AnonymousClass3Qk.A02(r3)     // Catch:{ all -> 0x0529 }
            int r1 = r22 + 1
            int r0 = r25.intValue()     // Catch:{ all -> 0x0529 }
            if (r1 > r0) goto L_0x0267
            r0 = r27
            java.lang.String r0 = r6.A0K(r3, r0)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x0221
            X.QvX r1 = r5.A0C     // Catch:{ all -> 0x0529 }
            X.C11381SQt.A02(r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Error formatting hit"
        L_0x0218:
            r1.A0K(r3, r0)     // Catch:{ all -> 0x0529 }
        L_0x021b:
            long r0 = r3.A01     // Catch:{ all -> 0x0529 }
            X.AnonymousClass7TE.A1Y(r7, r0)     // Catch:{ all -> 0x0529 }
            goto L_0x01f2
        L_0x0221:
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x0529 }
            int r11 = r1.length     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A0T     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0529 }
            if (r11 <= r0) goto L_0x0238
            X.QvX r1 = r5.A0C     // Catch:{ all -> 0x0529 }
            X.C11381SQt.A02(r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Hit size exceeds the maximum size limit"
            goto L_0x0218
        L_0x0238:
            int r0 = r4.size()     // Catch:{ all -> 0x0529 }
            if (r0 <= 0) goto L_0x0240
            int r11 = r11 + 1
        L_0x0240:
            int r10 = r4.size()     // Catch:{ all -> 0x0529 }
            int r10 = r10 + r11
            X.SNL r0 = X.SDN.A0V     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0529 }
            if (r10 > r0) goto L_0x0267
            int r0 = r4.size()     // Catch:{ IOException -> 0x0260 }
            if (r0 <= 0) goto L_0x025a
            byte[] r0 = X.C8489Qvb.A02     // Catch:{ IOException -> 0x0260 }
            r4.write(r0)     // Catch:{ IOException -> 0x0260 }
        L_0x025a:
            r4.write(r1)     // Catch:{ IOException -> 0x0260 }
            int r22 = r22 + 1
            goto L_0x021b
        L_0x0260:
            r1 = move-exception
            java.lang.String r0 = "Failed to write payload when batching hits"
            r6.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            goto L_0x021b
        L_0x0267:
            if (r22 == 0) goto L_0x04b8
            X.SNL r0 = X.SDN.A0N     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A0P     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = X.Pxh.A0l(r1, r0)     // Catch:{ all -> 0x0529 }
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0367 }
            r12.<init>(r0)     // Catch:{ MalformedURLException -> 0x0367 }
            byte[] r11 = r4.toByteArray()     // Catch:{ all -> 0x0529 }
            if (r15 == 0) goto L_0x035d
            java.lang.String r21 = "Error closing http compressed post connection output stream"
            X.AnonymousClass3Qk.A02(r11)     // Catch:{ all -> 0x0529 }
            r20 = 0
            android.content.Context r0 = r5.A00     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0.getPackageName()     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            java.io.ByteArrayOutputStream r1 = X.Pxe.A0b()     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0.write(r11)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0.close()     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r1.close()     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            byte[] r19 = r1.toByteArray()     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            java.lang.String r32 = "POST compressed size, ratio %, url"
            r0 = r19
            int r10 = r0.length     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0 = 100
            long r3 = (long) r10     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            long r3 = r3 * r0
            int r15 = r11.length     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            long r0 = (long) r15     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            long r3 = r3 / r0
            java.lang.Long r30 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r33 = 3
            r28 = r6
            r29 = r18
            r31 = r12
            X.ST5.A0A(r28, r29, r30, r31, r32, r33)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            if (r10 <= r15) goto L_0x02d4
            java.lang.String r3 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0 = r18
            r6.A0D(r0, r1, r3)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
        L_0x02d4:
            X.SNL r0 = X.SDN.A0D     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            java.lang.Object r0 = r0.A00     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            boolean r0 = android.util.Log.isLoggable(r0, r13)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            if (r0 == 0) goto L_0x02f6
            java.lang.String r4 = "Post payload"
            java.lang.String r3 = "\n"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r1.<init>(r11)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            int r0 = r1.length()     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = r3.concat(r1)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
        L_0x02f3:
            r6.A0E(r4, r0)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
        L_0x02f6:
            java.net.HttpURLConnection r4 = X.C8489Qvb.A01(r6, r12)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            goto L_0x0301
        L_0x02fb:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0343, all -> 0x04fd }
            goto L_0x02f3
        L_0x0301:
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r0 = "gzip"
            r4.addRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            r4.setFixedLengthStreamingMode(r10)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            r0 = 2141710880(0x7fa7ea20, float:NaN)
            X.0fi.A02(r4, r0)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            r0 = -1917917470(0xffffffff8daee6e2, float:-1.0779161E-30)
            X.0fY r10 = X.0fi.A01(r4, r0)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            r0 = r19
            r10.write(r0)     // Catch:{ IOException -> 0x033d, all -> 0x04f9 }
            r10.close()     // Catch:{ IOException -> 0x033d, all -> 0x04f9 }
            X.C8489Qvb.A02(r6, r4)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            int r3 = r4.getResponseCode()     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            if (r3 != r14) goto L_0x0330
            X.C8492Qve.A05(r5)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
        L_0x0330:
            java.lang.String r1 = "POST status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            r6.A0F(r1, r0)     // Catch:{ IOException -> 0x0341, all -> 0x050d }
            r4.disconnect()     // Catch:{ all -> 0x0529 }
            goto L_0x0363
        L_0x033d:
            r1 = move-exception
            r20 = r10
            goto L_0x0346
        L_0x0341:
            r1 = move-exception
            goto L_0x0346
        L_0x0343:
            r1 = move-exception
            r4 = r20
        L_0x0346:
            java.lang.String r0 = "Network compressed POST connection error"
            r6.A0G(r0, r1)     // Catch:{ all -> 0x04ff }
            if (r20 == 0) goto L_0x0357
            r20.close()     // Catch:{ IOException -> 0x0351 }
            goto L_0x0357
        L_0x0351:
            r1 = move-exception
            r0 = r21
            r6.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
        L_0x0357:
            if (r4 == 0) goto L_0x0362
            r4.disconnect()     // Catch:{ all -> 0x0529 }
            goto L_0x0362
        L_0x035d:
            int r3 = X.C8489Qvb.A00(r6, r12, r11)     // Catch:{ all -> 0x0529 }
            goto L_0x0363
        L_0x0362:
            r3 = 0
        L_0x0363:
            if (r14 != r3) goto L_0x0374
            goto L_0x04af
        L_0x0367:
            r1 = move-exception
            java.lang.String r0 = "Error trying to parse the hardcoded host url"
            r6.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = "Failed to build batching endpoint url"
            r0 = 6
            X.ST5.A0B(r6, r1, r0)     // Catch:{ all -> 0x0529 }
            goto L_0x0395
        L_0x0374:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Network error uploading hits. status code"
            r6.A0E(r0, r1)     // Catch:{ all -> 0x0529 }
            java.util.Set r0 = r34.A00()     // Catch:{ all -> 0x0529 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0395
            java.lang.String r1 = "Server instructed the client to stop batching"
            r0 = 5
            X.ST5.A0B(r6, r1, r0)     // Catch:{ all -> 0x0529 }
            X.SGt r3 = r6.A00     // Catch:{ all -> 0x0529 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0529 }
            r3.A00 = r0     // Catch:{ all -> 0x0529 }
        L_0x0395:
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0529 }
            goto L_0x04b8
        L_0x039b:
            java.util.ArrayList r7 = X.Pxg.A14(r3)     // Catch:{ all -> 0x0529 }
            java.util.Iterator r15 = r3.iterator()     // Catch:{ all -> 0x0529 }
        L_0x03a3:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x04b8
            java.lang.Object r3 = r15.next()     // Catch:{ all -> 0x0529 }
            X.SHk r3 = (X.C11250SHk) r3     // Catch:{ all -> 0x0529 }
            X.AnonymousClass3Qk.A02(r3)     // Catch:{ all -> 0x0529 }
            boolean r10 = r3.A05     // Catch:{ all -> 0x0529 }
            r0 = r10 ^ 1
            java.lang.String r12 = r6.A0K(r3, r0)     // Catch:{ all -> 0x0529 }
            if (r12 != 0) goto L_0x03d7
            X.QvX r1 = r5.A0C     // Catch:{ all -> 0x0529 }
            X.C11381SQt.A02(r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Error formatting hit for upload"
        L_0x03c3:
            r1.A0K(r3, r0)     // Catch:{ all -> 0x0529 }
        L_0x03c6:
            long r0 = r3.A01     // Catch:{ all -> 0x0529 }
            X.AnonymousClass7TE.A1Y(r7, r0)     // Catch:{ all -> 0x0529 }
            int r1 = r7.size()     // Catch:{ all -> 0x0529 }
            int r0 = r26.intValue()     // Catch:{ all -> 0x0529 }
            if (r1 < r0) goto L_0x03a3
            goto L_0x04b8
        L_0x03d7:
            int r1 = r12.length()     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A0Q     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0529 }
            if (r1 > r0) goto L_0x043d
            java.lang.String r11 = "?"
            if (r10 == 0) goto L_0x040c
            X.SNL r0 = X.SDN.A0N     // Catch:{ all -> 0x0529 }
        L_0x03eb:
            java.lang.Object r10 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A0O     // Catch:{ all -> 0x0529 }
            java.lang.Object r4 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0529 }
            int r0 = X.Pxf.A09(r10)     // Catch:{ all -> 0x0529 }
            int r1 = r0 + 1
            int r0 = X.Pxf.A09(r4)     // Catch:{ all -> 0x0529 }
            int r1 = r1 + r0
            java.lang.StringBuilder r0 = X.Pxh.A0q(r12, r1)     // Catch:{ all -> 0x0529 }
            X.Pxj.A1M(r10, r4, r11, r12, r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0529 }
            goto L_0x040f
        L_0x040c:
            X.SNL r0 = X.SDN.A0M     // Catch:{ all -> 0x0529 }
            goto L_0x03eb
        L_0x040f:
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0499 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x0499 }
            java.lang.String r0 = "GET request"
            r6.A0F(r0, r1)     // Catch:{ all -> 0x0529 }
            r10 = 0
            java.net.HttpURLConnection r10 = X.C8489Qvb.A01(r6, r1)     // Catch:{ IOException -> 0x048d }
            r0 = -1830811795(0xffffffff92e0076d, float:-1.4138218E-27)
            X.0fi.A02(r10, r0)     // Catch:{ IOException -> 0x048d }
            X.C8489Qvb.A02(r6, r10)     // Catch:{ IOException -> 0x048d }
            int r4 = r10.getResponseCode()     // Catch:{ IOException -> 0x048d }
            if (r4 != r14) goto L_0x0430
            X.C8492Qve.A05(r5)     // Catch:{ IOException -> 0x048d }
        L_0x0430:
            java.lang.String r1 = "GET status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x048d }
            r6.A0F(r1, r0)     // Catch:{ IOException -> 0x048d }
            r10.disconnect()     // Catch:{ all -> 0x0529 }
            goto L_0x0489
        L_0x043d:
            r0 = r27
            java.lang.String r0 = r6.A0K(r3, r0)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x044e
            X.QvX r1 = r5.A0C     // Catch:{ all -> 0x0529 }
            X.C11381SQt.A02(r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Error formatting hit for POST upload"
            goto L_0x03c3
        L_0x044e:
            byte[] r4 = r0.getBytes()     // Catch:{ all -> 0x0529 }
            int r1 = r4.length     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A0U     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            int r0 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0529 }
            if (r1 <= r0) goto L_0x0466
            X.QvX r1 = r5.A0C     // Catch:{ all -> 0x0529 }
            X.C11381SQt.A02(r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Hit payload exceeds size limit"
            goto L_0x03c3
        L_0x0466:
            if (r10 == 0) goto L_0x0469
            goto L_0x046c
        L_0x0469:
            X.SNL r0 = X.SDN.A0M     // Catch:{ all -> 0x0529 }
            goto L_0x046e
        L_0x046c:
            X.SNL r0 = X.SDN.A0N     // Catch:{ all -> 0x0529 }
        L_0x046e:
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0529 }
            X.SNL r0 = X.SDN.A0O     // Catch:{ all -> 0x0529 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = X.Pxh.A0l(r1, r0)     // Catch:{ all -> 0x0529 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04a2 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x04a2 }
            int r4 = X.C8489Qvb.A00(r6, r0, r4)     // Catch:{ all -> 0x0529 }
        L_0x0489:
            if (r4 != r14) goto L_0x04b8
            goto L_0x03c6
        L_0x048d:
            r1 = move-exception
            java.lang.String r0 = "Network GET connection error"
            r6.A0G(r0, r1)     // Catch:{ all -> 0x0514 }
            if (r10 == 0) goto L_0x04b8
            r10.disconnect()     // Catch:{ all -> 0x0529 }
            goto L_0x04b8
        L_0x0499:
            r1 = move-exception
            java.lang.String r0 = "Error trying to parse the hardcoded host url"
            r6.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = "Failed to build collect GET endpoint url"
            goto L_0x04aa
        L_0x04a2:
            r1 = move-exception
            java.lang.String r0 = "Error trying to parse the hardcoded host url"
            r6.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = "Failed to build collect POST endpoint url"
        L_0x04aa:
            r0 = 6
            X.ST5.A0B(r6, r1, r0)     // Catch:{ all -> 0x0529 }
            goto L_0x04b8
        L_0x04af:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "Batched upload completed. Hits batched"
            r6.A0E(r0, r1)     // Catch:{ all -> 0x0529 }
        L_0x04b8:
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0529 }
        L_0x04bc:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x04d1
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0529 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0529 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0529 }
            long r8 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x0529 }
            goto L_0x04bc
        L_0x04d1:
            r0 = r35
            r0.A0N(r7)     // Catch:{ SQLiteException -> 0x04dc }
            r0 = r24
            r0.addAll(r7)     // Catch:{ SQLiteException -> 0x04dc }
            goto L_0x04e4
        L_0x04dc:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove successfully uploaded hits"
            r2.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            goto L_0x00ce
        L_0x04e4:
            boolean r0 = r24.isEmpty()     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x051b
            r35.A0J()     // Catch:{ SQLiteException -> 0x053a }
            android.database.sqlite.SQLiteDatabase r0 = r35.A0K()     // Catch:{ SQLiteException -> 0x053a }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x053a }
            r35.A0M()     // Catch:{ SQLiteException -> 0x053a }
            goto L_0x0063
        L_0x04f9:
            r3 = move-exception
            r20 = r10
            goto L_0x0500
        L_0x04fd:
            r3 = move-exception
            goto L_0x051a
        L_0x04ff:
            r3 = move-exception
        L_0x0500:
            if (r20 == 0) goto L_0x050e
            r20.close()     // Catch:{ IOException -> 0x0506 }
            goto L_0x050e
        L_0x0506:
            r1 = move-exception
            r0 = r21
            r6.A0H(r0, r1)     // Catch:{ all -> 0x0529 }
            goto L_0x050e
        L_0x050d:
            r3 = move-exception
        L_0x050e:
            if (r4 == 0) goto L_0x051a
            r4.disconnect()     // Catch:{ all -> 0x0529 }
            goto L_0x051a
        L_0x0514:
            r3 = move-exception
            if (r10 == 0) goto L_0x051a
            r10.disconnect()     // Catch:{ all -> 0x0529 }
        L_0x051a:
            throw r3     // Catch:{ all -> 0x0529 }
        L_0x051b:
            r35.A0J()     // Catch:{ SQLiteException -> 0x053a }
            android.database.sqlite.SQLiteDatabase r0 = r35.A0K()     // Catch:{ SQLiteException -> 0x053a }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x053a }
            r35.A0M()     // Catch:{ SQLiteException -> 0x053a }
            return
        L_0x0529:
            r3 = move-exception
            X.Qvd r1 = r2.A04     // Catch:{ SQLiteException -> 0x053a }
            r1.A0J()     // Catch:{ SQLiteException -> 0x053a }
            android.database.sqlite.SQLiteDatabase r0 = r1.A0K()     // Catch:{ SQLiteException -> 0x053a }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x053a }
            r1.A0M()     // Catch:{ SQLiteException -> 0x053a }
            throw r3
        L_0x053a:
            r1 = move-exception
            r0 = r23
            r2.A0H(r0, r1)
            r2.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8490Qvc.A04(X.Qvc):void");
    }

    public C8490Qvc(C11381SQt sQt) {
        super(sQt);
        this.A06 = new zzcj(sQt);
        this.A04 = new C8491Qvd(sQt);
        this.A07 = new C8489Qvb(sQt);
        this.A03 = new C8487QvZ(sQt);
        this.A08 = new C8494Qvg(sQt, this);
        this.A05 = new C8495Qvh(sQt, this);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.SNp, X.Qok, java.lang.Object] */
    public static final void A02(C10754RxY rxY, C8490Qvc qvc, C8337Qon qon) {
        AnonymousClass3Qk.A02(rxY);
        C8337Qon qon2 = qon;
        AnonymousClass3Qk.A02(qon);
        C8490Qvc qvc2 = qvc;
        C11381SQt sQt = qvc.A00;
        C8339Qop qop = new C8339Qop(sQt);
        String str = rxY.A02;
        AnonymousClass3Qk.A04(str);
        AnonymousClass3Qk.A04(str);
        Uri.Builder A0I = Pxe.A0I();
        A0I.scheme("uri");
        A0I.authority("google-analytics.com");
        A0I.path(str);
        Uri build = A0I.build();
        C11350SOj sOj = qop.A00;
        List list = sOj.A08;
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (build.equals(((C13740TgC) listIterator.next()).FPA())) {
                listIterator.remove();
            }
        }
        C11381SQt sQt2 = qop.A01;
        list.add(new C8478QvQ(sQt2, str));
        qop.A00 = rxY.A04;
        C11350SOj sOj2 = new C11350SOj(sOj);
        C8482QvU qvU = sQt2.A07;
        C11381SQt.A02(qvU);
        qvU.A0J();
        sOj2.A02(qvU.A00);
        C8479QvR qvR = sQt2.A0A;
        qvR.A0J();
        DisplayMetrics A0E = AnonymousClass7TF.A0E(C11381SQt.A00(qvR).A01);
        ? obj = new Object();
        obj.A05 = C11304SKp.A01(Locale.getDefault());
        obj.A01 = A0E.widthPixels;
        obj.A02 = A0E.heightPixels;
        sOj2.A02(obj);
        Iterator it = qop.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("zza");
        }
        C8336Qom qom = (C8336Qom) sOj2.A01(C8336Qom.class);
        qom.A01 = "data";
        qom.A07 = true;
        sOj2.A02(qon);
        Qoe qoe = (Qoe) sOj2.A01(Qoe.class);
        C8338Qoo qoo = (C8338Qoo) sOj2.A01(C8338Qoo.class);
        Iterator A0u = AnonymousClass7TF.A0u(rxY.A03);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            String A0s = DbS.A0s(A1J);
            if ("an".equals(A13)) {
                qoo.A00 = A0s;
            } else if ("av".equals(A13)) {
                qoo.A01 = A0s;
            } else if ("aid".equals(A13)) {
                qoo.A02 = A0s;
            } else if ("aiid".equals(A13)) {
                qoo.A03 = A0s;
            } else if ("uid".equals(A13)) {
                qom.A03 = A0s;
            } else {
                AnonymousClass3Qk.A04(A13);
                if (A13 != null && A13.startsWith("&")) {
                    A13 = A13.substring(1);
                }
                AnonymousClass3Qk.A06(A13, "Name can not be empty or \"&\"");
                qoe.A00.put(A13, A0s);
            }
        }
        ST5.A0A(qvc2, str, qon2, (Object) null, "Sending installation campaign to", 3);
        C8486QvY qvY = sQt.A0D;
        C11381SQt.A02(qvY);
        sOj2.A01 = qvY.A0K();
        C11200SFa sFa = sOj2.A07.A01;
        if (sOj2.A04) {
            throw AnonymousClass7TE.A0z("Measurement prototype can't be submitted");
        } else if (!sOj2.A03) {
            C11350SOj sOj3 = new C11350SOj(sOj2);
            sOj3.A02 = SystemClock.elapsedRealtime();
            long j = sOj3.A01;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            sOj3.A00 = j;
            sOj3.A03 = true;
            sFa.A02.execute(new TH3(sOj3, sFa));
        } else {
            throw AnonymousClass7TE.A0z("Measurement can only be submitted once");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[LOOP:1: B:12:0x004e->B:20:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K() {
        /*
            r8 = this;
            X.C11200SFa.A00()
            X.C11200SFa.A00()
            r8.A0J()
            X.SNL r0 = X.SDN.A0C
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r1 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r0 = 5
            X.ST5.A0B(r8, r1, r0)
        L_0x0019:
            X.QvZ r7 = r8.A03
            X.C11200SFa.A00()
            r7.A0J()
            com.google.android.gms.internal.gtm.zzce r0 = r7.A00
            if (r0 == 0) goto L_0x0099
            X.Qvd r6 = r8.A04
            long r3 = X.C8491Qvd.A00(r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009f
            java.lang.String r1 = "Dispatching local hits to device AnalyticsService"
            r0 = 2
            X.ST5.A0B(r8, r1, r0)
        L_0x0037:
            X.SNL r0 = X.SDN.A0K     // Catch:{ SQLiteException -> 0x008f }
            java.lang.Object r0 = r0.A00     // Catch:{ SQLiteException -> 0x008f }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ SQLiteException -> 0x008f }
            long r0 = (long) r0     // Catch:{ SQLiteException -> 0x008f }
            java.util.ArrayList r5 = r6.A0L(r0)     // Catch:{ SQLiteException -> 0x008f }
            boolean r0 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x008f }
            if (r0 == 0) goto L_0x004e
            r8.A0L()     // Catch:{ SQLiteException -> 0x008f }
            goto L_0x0084
        L_0x004e:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0037
            java.lang.Object r1 = X.AnonymousClass7TE.A12(r5)
            X.SHk r1 = (X.C11250SHk) r1
            boolean r0 = r7.A0L(r1)
            if (r0 != 0) goto L_0x0064
            r8.A0L()
            return
        L_0x0064:
            r5.remove(r1)
            long r3 = r1.A01     // Catch:{ SQLiteException -> 0x0085 }
            X.C11200SFa.A00()     // Catch:{ SQLiteException -> 0x0085 }
            r6.A0J()     // Catch:{ SQLiteException -> 0x0085 }
            r0 = 1
            java.util.ArrayList r2 = X.DbS.A0v(r0)     // Catch:{ SQLiteException -> 0x0085 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0085 }
            r2.add(r1)     // Catch:{ SQLiteException -> 0x0085 }
            java.lang.String r0 = "Deleting hit, id"
            r6.A0E(r0, r1)     // Catch:{ SQLiteException -> 0x0085 }
            r6.A0N(r2)     // Catch:{ SQLiteException -> 0x0085 }
            goto L_0x004e
        L_0x0084:
            return
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove hit that was send for delivery"
            r8.A0H(r0, r1)
            r8.A01()
            return
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "Failed to read hits from store"
            r8.A0H(r0, r1)
            r8.A01()
            return
        L_0x0099:
            java.lang.String r1 = "Service not connected"
            r0 = 2
            X.ST5.A0B(r8, r1, r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8490Qvc.A0K():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (r1 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e3, code lost:
        if (r2 > 0) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L() {
        /*
            r12 = this;
            X.C11200SFa.A00()
            r12.A0J()
            boolean r0 = r12.A02
            r5 = 0
            if (r0 != 0) goto L_0x016e
            X.SNL r0 = X.SDN.A0G
            java.lang.Object r0 = r0.A00
            long r1 = X.AnonymousClass7TE.A0R(r0)
            X.SQt r4 = r12.A00
            X.QvS r3 = r4.A0E
            X.C11381SQt.A02(r3)
            r3.A0J()
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x002e
            X.C11381SQt.A02(r3)
            r3.A0J()
            int r0 = r3.A00
            long r1 = X.Pxf.A0E(r0)
        L_0x002e:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            X.Qvd r0 = r12.A04
            long r1 = X.C8491Qvd.A00(r0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016e
            X.SNL r0 = X.SDN.A05
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x00a9
            com.google.android.gms.internal.gtm.zzcj r2 = r12.A06
            X.SQt r1 = r2.A02
            X.QvX r7 = r1.A0C
            X.C11381SQt.A02(r7)
            X.QvT r0 = r1.A06
            X.C11381SQt.A02(r0)
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x009e
            android.content.Context r8 = r1.A00
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r8.registerReceiver(r2, r0)
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = r8.getPackageName()
            r1.addCategory(r0)
            r8.registerReceiver(r2, r1)
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x008a }
            if (r0 == 0) goto L_0x008a
            boolean r1 = r0.isConnected()     // Catch:{ SecurityException -> 0x008a }
            r0 = 1
            if (r1 != 0) goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            r2.A01 = r0
            X.C11381SQt.A02(r7)
            boolean r0 = r2.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "Registering connectivity change receiver. Network connected"
            r7.A0E(r0, r1)
            r0 = 1
            r2.A00 = r0
        L_0x009e:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x00a9
            r12.A01()
            r12.A00()
            return
        L_0x00a9:
            r12.A00()
            X.SNL r0 = X.SDN.A0G
            java.lang.Object r0 = r0.A00
            long r0 = X.AnonymousClass7TE.A0R(r0)
            X.C11381SQt.A02(r3)
            r3.A0J()
            boolean r2 = r3.A03
            if (r2 == 0) goto L_0x00ca
            X.C11381SQt.A02(r3)
            r3.A0J()
            int r0 = r3.A00
            long r0 = X.Pxf.A0E(r0)
        L_0x00ca:
            X.QvY r2 = r4.A0D
            X.C11381SQt.A02(r2)
            long r3 = r2.A0L()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0128
            long r2 = X.C51966G9m.A07(r3)
            long r7 = java.lang.Math.abs(r2)
            long r2 = r0 - r7
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0128
        L_0x00e5:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "Dispatch scheduled (ms)"
            r12.A0E(r0, r1)
            X.SHG r9 = r12.A08
            long r7 = r9.A02
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016a
            r0 = 1
            long r7 = r9.A02
            r10 = 0
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x010b
            long r10 = java.lang.System.currentTimeMillis()
            long r7 = r9.A02
            long r10 = r10 - r7
            long r10 = java.lang.Math.abs(r10)
        L_0x010b:
            long r2 = r2 + r10
            long r10 = java.lang.Math.max(r0, r2)
            long r1 = r9.A02
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0198
            r3 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0135
            r9.A02 = r5
            android.os.Handler r1 = X.SHG.A00(r9)
            java.lang.Runnable r0 = r9.A01
            r1.removeCallbacks(r0)
            return
        L_0x0128:
            X.SNL r2 = X.SDN.A0H
            java.lang.Object r2 = r2.A00
            long r2 = X.AnonymousClass7TE.A0R(r2)
            long r2 = java.lang.Math.min(r2, r0)
            goto L_0x00e5
        L_0x0135:
            X.SQt r2 = r9.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r9.A02
            long r7 = r7 - r0
            long r0 = java.lang.Math.abs(r7)
            long r10 = r10 - r0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0148
            r3 = r10
        L_0x0148:
            android.os.Handler r0 = X.SHG.A00(r9)
            java.lang.Runnable r1 = r9.A01
            r0.removeCallbacks(r1)
            android.os.Handler r0 = X.SHG.A00(r9)
            boolean r0 = r0.postDelayed(r1, r3)
            if (r0 != 0) goto L_0x0198
            X.QvX r2 = r2.A0C
            X.C11381SQt.A02(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "Failed to adjust delayed post. time"
            r2.A0H(r0, r1)
            return
        L_0x016a:
            r9.A01(r2)
            return
        L_0x016e:
            com.google.android.gms.internal.gtm.zzcj r4 = r12.A06
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0195
            X.SQt r3 = r4.A02
            X.QvX r2 = r3.A0C
            X.C11381SQt.A02(r2)
            java.lang.String r1 = "Unregistering connectivity change receiver"
            r0 = 2
            X.ST5.A0B(r2, r1, r0)
            r0 = 0
            r4.A00 = r0
            r4.A01 = r0
            android.content.Context r0 = r3.A00
            r0.unregisterReceiver(r4)     // Catch:{ IllegalArgumentException -> 0x018c }
            goto L_0x0195
        L_0x018c:
            r1 = move-exception
            X.C11381SQt.A02(r2)
            java.lang.String r0 = "Failed to unregister the network broadcast receiver"
            r2.A0H(r0, r1)
        L_0x0195:
            r12.A01()
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8490Qvc.A0L():void");
    }
}

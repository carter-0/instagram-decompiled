package X;

import android.app.job.JobScheduler;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class T7D implements C61110lV, AnonymousClass0lh {
    public SOU A00;
    public boolean A01;
    public IgBgFetchMetadata A02;
    public boolean A03;
    public final UserSession A04;
    public final List A05;
    public final List A06;
    public final C262224Cq A07;
    public final 2IN A08;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.2jE] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r1 == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T7D(android.content.Context r13, com.instagram.common.session.UserSession r14, X.2IN r15) {
        /*
            r12 = this;
            r6 = 1
            int r10 = X.DbW.A02(r6, r13, r14)
            r5 = 3
            X.0qQ.A0B(r15, r5)
            r12.<init>()
            r12.A04 = r14
            r12.A08 = r15
            X.4Cq r0 = r15.A0A
            r12.A07 = r0
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r8 = 5
            int[] r7 = new int[r8]
            r7 = {0, 1, 2, 3, 4} // fill-array
            r4 = 0
        L_0x001f:
            r3 = r7[r4]
            com.instagram.common.session.UserSession r2 = r12.A04
            if (r3 == 0) goto L_0x00c0
            if (r3 == r6) goto L_0x0097
            if (r3 == r10) goto L_0x008b
            if (r3 == r5) goto L_0x0076
            r0 = 4
            if (r3 != r0) goto L_0x00e8
            X.0Tu r11 = X.0Tu.A05
            r0 = 36316224820940908(0x81056a0009106c, double:3.029865038238295E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x0049
            X.0Tu r11 = X.0Tu.A06
            r0 = 36330235003814425(0x81122800024219, double:3.0387251343019857E-306)
        L_0x0042:
            boolean r1 = X.182.A06(r11, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            boolean r0 = X.C66581MXm.A1a(r0)
            if (r0 == 0) goto L_0x005e
            if (r3 == r10) goto L_0x0073
            if (r3 == r5) goto L_0x0070
            java.lang.Class<com.instagram.util.offline.StoryBackgroundPrefetchJobService> r1 = com.instagram.util.offline.StoryBackgroundPrefetchJobService.class
        L_0x0056:
            X.Rt8 r0 = new X.Rt8
            r0.<init>(r1, r3)
            r9.add(r0)
        L_0x005e:
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x001f
            r12.A05 = r9
            X.14i.A05(r12)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r12.A06 = r0
            r12.A03 = r6
            return
        L_0x0070:
            java.lang.Class<com.instagram.util.offline.MainFeedBackgroundPrefetchJobService> r1 = com.instagram.util.offline.MainFeedBackgroundPrefetchJobService.class
            goto L_0x0056
        L_0x0073:
            java.lang.Class<com.instagram.util.offline.BackgroundPrefetchJobService> r1 = com.instagram.util.offline.BackgroundPrefetchJobService.class
            goto L_0x0056
        L_0x0076:
            X.0Tu r11 = X.0Tu.A05
            r0 = 36315309993561217(0x81049500130c81, double:3.0292864977196645E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x0049
            X.0Tu r11 = X.0Tu.A06
            r0 = 36330235004273182(0x8112280009421e, double:3.0387251345921055E-306)
            goto L_0x0042
        L_0x008b:
            X.0Tu r11 = X.0Tu.A06
            r0 = 36330235004338719(0x811228000a421f, double:3.0387251346335513E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            goto L_0x004a
        L_0x0097:
            X.5EZ r0 = X.C10035RlX.A00
            X.2jA r0 = new X.2jA
            r0.<init>()
            r1 = 0
            boolean r0 = r0.A01(r2)
            if (r0 != 0) goto L_0x00b0
            X.2jE r0 = new X.2jE
            r0.<init>()
            boolean r0 = r0.A01(r2, r1)
            if (r0 == 0) goto L_0x005e
        L_0x00b0:
            X.0Tu r11 = X.0Tu.A06
            r0 = 36330235004142109(0x8112280007421d, double:3.0387251345092144E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Class<com.instagram.gallery.scanner.MediaScannerJobService> r1 = com.instagram.gallery.scanner.MediaScannerJobService.class
            goto L_0x0056
        L_0x00c0:
            X.0Tu r11 = X.0Tu.A06
            r0 = 36330235004076572(0x8112280006421c, double:3.0387251344677685E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x005e
            r11 = 0
            X.0xa r1 = X.AnonymousClass7TE.A0q(r2)
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r11)
            if (r0 == 0) goto L_0x005e
            boolean r0 = X.C267044ar.A01(r13, r2)
            if (r0 == 0) goto L_0x005e
            java.lang.Class<com.instagram.contacts.ccu.intf.CCUJobService> r1 = com.instagram.contacts.ccu.intf.CCUJobService.class
            goto L_0x0056
        L_0x00e8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7D.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2IN):void");
    }

    public static final IgBgFetchMetadata A00(T7D t7d) {
        StringBuilder sb;
        String str;
        IgBgFetchMetadata igBgFetchMetadata = t7d.A02;
        if (igBgFetchMetadata == null) {
            String string = ((0xa) ((OCW) t7d.A08.A08.getValue()).A01.getValue()).getString("IgBgFetchMetadataStorageKey", (String) null);
            if (string != null) {
                C255463uA[] r0 = IgBgFetchMetadata.A03;
                try {
                    igBgFetchMetadata = (IgBgFetchMetadata) AnonymousClass9FA.A00(C13377TXm.A00, C250863mB.A03).A00(string, C20513Wst.A00);
                    if (igBgFetchMetadata == null) {
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    sb = AnonymousClass7TE.A1A();
                    str = "Corrupted metadata ";
                    0wb.A03("IgBgFetchMetadata", AnonymousClass7TG.A0m(e, str, sb));
                    C255463uA[] r02 = IgBgFetchMetadata.A03;
                    long currentTimeMillis = System.currentTimeMillis();
                    0sn r03 = 0sn.A00;
                    igBgFetchMetadata = new IgBgFetchMetadata(r03, r03, currentTimeMillis);
                    t7d.A02 = igBgFetchMetadata;
                    return igBgFetchMetadata;
                } catch (Exception e2) {
                    e = e2;
                    sb = AnonymousClass7TE.A1A();
                    str = "Corrupted metadat: ";
                    0wb.A03("IgBgFetchMetadata", AnonymousClass7TG.A0m(e, str, sb));
                    C255463uA[] r022 = IgBgFetchMetadata.A03;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    0sn r032 = 0sn.A00;
                    igBgFetchMetadata = new IgBgFetchMetadata(r032, r032, currentTimeMillis2);
                    t7d.A02 = igBgFetchMetadata;
                    return igBgFetchMetadata;
                }
                t7d.A02 = igBgFetchMetadata;
            }
            C255463uA[] r0222 = IgBgFetchMetadata.A03;
            long currentTimeMillis22 = System.currentTimeMillis();
            0sn r0322 = 0sn.A00;
            igBgFetchMetadata = new IgBgFetchMetadata(r0322, r0322, currentTimeMillis22);
            t7d.A02 = igBgFetchMetadata;
        }
        return igBgFetchMetadata;
    }

    public static final void A01(IgBgFetchMetadata igBgFetchMetadata, T7D t7d) {
        t7d.A02 = igBgFetchMetadata;
        String A022 = AnonymousClass9FA.A00(C13378TXn.A00, C250863mB.A03).A02(igBgFetchMetadata, C20513Wst.A00);
        0xY AR4 = ((0xa) ((OCW) t7d.A08.A08.getValue()).A01.getValue()).AR4();
        AR4.E5g("IgBgFetchMetadataStorageKey", A022);
        AR4.apply();
    }

    public static final void A02(C10637RvW rvW, T7D t7d) {
        Object obj;
        C10637RvW rvW2 = rvW;
        int i = rvW2.A00;
        if (C66581MXm.A1W(i, C66582MXn.A0z(R.id.ig_bg_fetch_id))) {
            T7D t7d2 = t7d;
            t7d2.A06.add(rvW2);
            if (t7d2.A00 == null) {
                IgBgFetchMetadata A002 = A00(t7d2);
                List list = A002.A02;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((IgBgFetchPendingJob) obj).A01.A00 == i) {
                        break;
                    }
                }
                IgBgFetchPendingJob igBgFetchPendingJob = (IgBgFetchPendingJob) obj;
                if (igBgFetchPendingJob == null) {
                    0wb.A03("IgBgFetchScheduler", "Invoked job is not in the pending jobs list");
                    igBgFetchPendingJob = new IgBgFetchPendingJob(new IgBgFetchJob(i, System.currentTimeMillis()), System.currentTimeMillis() - 900000);
                }
                long j = A002.A00;
                List list2 = A002.A01;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (((IgBgFetchPendingJob) next).A01.A00 != i) {
                        A1C.add(next);
                    }
                }
                IgBgFetchMetadata igBgFetchMetadata = new IgBgFetchMetadata(list2, A1C, j);
                A01(igBgFetchMetadata, t7d2);
                Context context = rvW2.A01;
                UserSession userSession = t7d2.A04;
                2IN r3 = t7d2.A08;
                SHP shp = (SHP) r3.A07.getValue();
                OEJ oej = (OEJ) r3.A05.getValue();
                List<C10493Rt8> list3 = t7d2.A05;
                ArrayList A0r = AnonymousClass7TG.A0r(list3);
                for (C10493Rt8 rt8 : list3) {
                    AnonymousClass7TF.A1M(A0r, rt8.A00);
                }
                SOU sou = new SOU(context, userSession, igBgFetchMetadata, igBgFetchPendingJob, oej, shp, A0r, t7d2.A07, AnonymousClass7TE.A0R(AnonymousClass7TE.A14(r3.A04)));
                t7d2.A00 = sou;
                if (sou.A00 == null) {
                    sou.A00 = t7d2;
                    IgBgFetchJobRun igBgFetchJobRun = sou.A08;
                    igBgFetchJobRun.A01 = System.currentTimeMillis();
                    long j2 = sou.A04;
                    if (j2 > 0) {
                        sou.A06.postDelayed(new C12928TDr(sou), j2);
                    }
                    SHP shp2 = sou.A0B;
                    IgBgFetchMetadata igBgFetchMetadata2 = sou.A09;
                    shp2.A01(igBgFetchMetadata2, new C8815RAr(igBgFetchJobRun), new C20786Wyx(sou, 0));
                    sou.A06.post(new C12997THf(new C10313RqB(igBgFetchMetadata2), sou));
                }
            }
        }
    }

    public static final void A03(T7D t7d) {
        if (t7d.A03) {
            Iterator it = C66582MXn.A0z(R.id.ig_bg_fetch_id).iterator();
            while (it.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it);
                C10636RvV rvV = (C10636RvV) t7d.A08.A09.getValue();
                int i = rvV.A00;
                if (!(i == 1 || i == 2)) {
                    try {
                        Object systemService = rvV.A01.getSystemService("jobscheduler");
                        if (systemService != null) {
                            ((JobScheduler) systemService).cancel(A0F);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } catch (Exception e) {
                        0wb.A02(0kg.A09, "IgBgFetchScheduler(NativeJobDelegate)", "cancelJobWithJobScheduler() failed: ", e);
                    }
                }
            }
            t7d.A03 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r5 = (X.C10636RvV) r10.A08.A09.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.T7D r10, java.util.List r11) {
        /*
            java.lang.Class<com.instagram.jobscheduler.bgfetch.scheduler.IgBgFetchSchedulerService> r4 = com.instagram.jobscheduler.bgfetch.scheduler.IgBgFetchSchedulerService.class
            java.util.Iterator r9 = r11.iterator()
        L_0x0006:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r3 = r9.next()
            com.instagram.jobscheduler.bgfetch.IgBgFetchJob r3 = (com.instagram.jobscheduler.bgfetch.IgBgFetchJob) r3
            r0 = 2131434095(0x7f0b1a6f, float:1.8489994E38)
            java.util.List r0 = X.C66582MXn.A0z(r0)
            int r6 = r3.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0006
            X.2IN r0 = r10.A08
            X.0eM r0 = r0.A09
            java.lang.Object r5 = r0.getValue()
            X.RvV r5 = (X.C10636RvV) r5
            r0 = 1
            int r1 = r5.A00
            if (r1 == r0) goto L_0x0006
            r0 = 2
            if (r1 == r0) goto L_0x0081
            android.content.Context r7 = r5.A01     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r5 = r7.getSystemService(r0)     // Catch:{ Exception -> 0x0075 }
            if (r5 == 0) goto L_0x0070
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5     // Catch:{ Exception -> 0x0075 }
            long r2 = r3.A01     // Catch:{ Exception -> 0x0075 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0075 }
            long r2 = r2 - r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r1 = java.lang.Math.max(r2, r0)     // Catch:{ Exception -> 0x0075 }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Exception -> 0x0075 }
            r3.<init>(r7, r4)     // Catch:{ Exception -> 0x0075 }
            android.app.job.JobInfo$Builder r0 = new android.app.job.JobInfo$Builder     // Catch:{ Exception -> 0x0075 }
            r0.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
            r3 = 1
            android.app.job.JobInfo$Builder r0 = r0.setRequiredNetworkType(r3)     // Catch:{ Exception -> 0x0075 }
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r3)     // Catch:{ Exception -> 0x0075 }
            android.app.job.JobInfo$Builder r0 = r0.setMinimumLatency(r1)     // Catch:{ Exception -> 0x0075 }
            android.app.job.JobInfo r0 = r0.build()     // Catch:{ Exception -> 0x0075 }
            r5.schedule(r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0006
        L_0x0070:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0075 }
            throw r0     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            r3 = move-exception
            X.0kg r2 = X.0kg.A09
            java.lang.String r1 = "IgBgFetchScheduler(NativeJobDelegate)"
            java.lang.String r0 = "scheduleJobWithJobScheduler() failed: "
            X.0wb.A02(r2, r1, r0, r3)
            goto L_0x0006
        L_0x0081:
            X.9Ed r1 = new X.9Ed
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A01(r0)
            X.3ty r7 = r1.A00()
            X.3tx r2 = new X.3tx
            r2.<init>()
            java.lang.String r1 = "job_id_key"
            java.util.Map r0 = r2.A00
            r0.put(r1, r8)
            X.3tw r6 = r2.A00()
            long r2 = r3.A01
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = java.lang.Math.max(r2, r0)
            java.lang.Class<com.instagram.jobscheduler.bgfetch.scheduler.IgBgFetchSchedulerWorker> r0 = com.instagram.jobscheduler.bgfetch.scheduler.IgBgFetchSchedulerWorker.class
            X.QFs r1 = new X.QFs
            r1.<init>(r0)
            r1.A02(r7)
            X.3DG r0 = r1.A00
            r0.A0C = r6
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.A01(r2, r0)
            X.9En r2 = r1.A00()
            android.content.Context r0 = r5.A01
            X.385 r1 = X.AnonymousClass385.A00(r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.A03(r0)
            goto L_0x0006
        L_0x00d3:
            r0 = 1
            r10.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7D.A04(X.T7D, java.util.List):void");
    }

    public static final void A05(T7D t7d, C62320sa r6) {
        if (t7d.A01) {
            r6.invoke();
            return;
        }
        t7d.A01 = true;
        C255463uA[] r0 = IgBgFetchMetadata.A03;
        long currentTimeMillis = System.currentTimeMillis();
        0sn r02 = 0sn.A00;
        IgBgFetchMetadata igBgFetchMetadata = new IgBgFetchMetadata(r02, r02, currentTimeMillis);
        ((SHP) t7d.A08.A07.getValue()).A01(igBgFetchMetadata, C8816RAs.A00, new C74188PqU(48, (Object) igBgFetchMetadata, (Object) r6, (Object) t7d));
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1261821167);
        C51971G9r.A1P(this, this.A07, 15);
        AnonymousClass0fD.A0A(525527677, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(1924350297);
        C51971G9r.A1P(this, this.A07, 16);
        AnonymousClass0fD.A0A(-2051085389, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
        C51971G9r.A1P(this, this.A07, 17);
    }
}

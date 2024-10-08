package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class SzT implements 2JI {
    public static final long A0F = JTR.A0N(TimeUnit.SECONDS);
    public final Context A00;
    public final Handler A01;
    public final C10904S0e A02;
    public final C10904S0e A03;
    public final C70132Jp A04;
    public final Set A05;
    public final Set A06;
    public final Executor A07;
    public final AtomicBoolean A08;
    public final AtomicReference A09;
    public final C10273RpX A0A;
    public final AnonymousClass2JS A0B;
    public final SC2 A0C;
    public final C70122Jo A0D;
    public final File A0E;

    public final AnonymousClass9GD AOL(List list) {
        C8359QpH qpH = new C8359QpH(-5);
        AnonymousClass9GD r0 = new AnonymousClass9GD();
        r0.A0B(qpH);
        return r0;
    }

    public final AnonymousClass9GD AOM(List list) {
        C8359QpH qpH = new C8359QpH(-5);
        AnonymousClass9GD r0 = new AnonymousClass9GD();
        r0.A0B(qpH);
        return r0;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public SzT(Context context, AnonymousClass2JS r10, C70132Jp r11, File file) {
        if (RQ3.A00 == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Object());
            RQ3.A00 = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor2 = RQ3.A00;
        C10273RpX rpX = new C10273RpX(context);
        SC2 sc2 = SC2.A00;
        this.A01 = AnonymousClass7TF.A0D();
        this.A09 = new AtomicReference();
        this.A05 = Collections.synchronizedSet(AnonymousClass7TE.A1F());
        this.A06 = Collections.synchronizedSet(AnonymousClass7TE.A1F());
        this.A08 = JTQ.A0k();
        this.A00 = context;
        this.A0E = file;
        this.A04 = r11;
        this.A0B = r10;
        this.A07 = threadPoolExecutor2;
        this.A0A = rpX;
        this.A0C = sc2;
        this.A03 = new C10904S0e();
        this.A02 = new C10904S0e();
        this.A0D = C70112Jn.A02;
    }

    private final AnonymousClass9GD A00(int i) {
        int i2;
        Qy2 qy2;
        ArrayList A1C;
        synchronized (this) {
            AtomicReference atomicReference = this.A09;
            C10893Rzt rzt = (C10893Rzt) atomicReference.get();
            i2 = i;
            if (rzt == null) {
                qy2 = null;
            } else {
                Qy2 qy22 = (Qy2) rzt;
                int i3 = qy22.A00;
                long j = qy22.A03;
                long j2 = qy22.A04;
                ArrayList A012 = rzt.A01();
                List list = qy22.A07;
                if (list != null) {
                    A1C = AnonymousClass7TE.A1D(list);
                } else {
                    A1C = AnonymousClass7TE.A1C();
                }
                qy2 = new Qy2((PendingIntent) null, A012, A1C, (List) null, i3, 6, i2, j, j2);
            }
            while (true) {
                if (!1FH.A00(rzt, qy2, atomicReference)) {
                    if (atomicReference.get() != rzt) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C8359QpH qpH = new C8359QpH(i2);
        AnonymousClass9GD r0 = new AnonymousClass9GD();
        r0.A0B(qpH);
        return r0;
    }

    private final C10905S0f A01() {
        try {
            Context context = this.A00;
            C10905S0f A022 = this.A04.A02(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (A022 != null) {
                return A022;
            }
            throw AnonymousClass7TE.A0z("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw Pxe.A0j("App is not found in PackageManager", e);
        }
    }

    public static final void A02(SzT szT, Integer num, Long l, Long l2, List list, List list2, int i, int i2) {
        C10893Rzt rzt;
        int i3;
        long j;
        long j2;
        Qy2 qy2;
        SzT szT2 = szT;
        List list3 = list2;
        List list4 = list;
        synchronized (szT2) {
            AtomicReference atomicReference = szT2.A09;
            C10893Rzt rzt2 = (C10893Rzt) atomicReference.get();
            if (rzt2 == null) {
                rzt = new Qy2((PendingIntent) null, AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), (List) null, 0, 0, 0, 0, 0);
            } else {
                rzt = rzt2;
            }
            if (num == null) {
                i3 = ((Qy2) rzt).A00;
            } else {
                i3 = num.intValue();
            }
            if (l == null) {
                j = ((Qy2) rzt).A03;
            } else {
                j = l.longValue();
            }
            if (l2 == null) {
                j2 = ((Qy2) rzt).A04;
            } else {
                j2 = l2.longValue();
            }
            if (list == null) {
                list4 = rzt.A01();
            }
            if (list2 == null) {
                List list5 = ((Qy2) rzt).A07;
                if (list5 != null) {
                    list3 = AnonymousClass7TE.A1D(list5);
                } else {
                    list3 = AnonymousClass7TE.A1C();
                }
            }
            qy2 = new Qy2((PendingIntent) null, list4, list3, (List) null, i3, i, i2, j, j2);
            while (true) {
                if (!1FH.A00(rzt2, qy2, atomicReference)) {
                    if (atomicReference.get() != rzt2) {
                        qy2 = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (qy2 != null) {
            szT2.A01.post(new THE(qy2, szT2));
        }
    }

    public final AnonymousClass9GD AGM(int i) {
        int i2;
        ArrayList A1C;
        Qy2 qy2;
        try {
            synchronized (this) {
                AtomicReference atomicReference = this.A09;
                C10893Rzt rzt = (C10893Rzt) atomicReference.get();
                if (rzt != null) {
                    try {
                        Qy2 qy22 = (Qy2) rzt;
                        int i3 = i;
                        if (i3 == qy22.A00 && ((i2 = qy22.A01) == 1 || i2 == 2 || i2 == 8 || i2 == 9 || i2 == 7)) {
                            int i4 = qy22.A02;
                            long j = qy22.A03;
                            long j2 = qy22.A04;
                            ArrayList A012 = rzt.A01();
                            List list = qy22.A07;
                            if (list != null) {
                                A1C = AnonymousClass7TE.A1D(list);
                            } else {
                                A1C = AnonymousClass7TE.A1C();
                            }
                            qy2 = new Qy2((PendingIntent) null, A012, A1C, (List) null, i3, 7, i4, j, j2);
                            while (true) {
                                if (!1FH.A00(rzt, qy2, atomicReference)) {
                                    if (atomicReference.get() != rzt) {
                                        qy2 = null;
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (RuntimeException e) {
                        e = e;
                        throw e;
                    } catch (Exception e2) {
                        e = new RuntimeException("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e2);
                        throw e;
                    }
                }
                throw new C8359QpH(-3);
            }
            if (qy2 != null) {
                this.A01.post(new THE(qy2, this));
            }
            AnonymousClass9GD r0 = new AnonymousClass9GD();
            r0.A0C((Object) null);
            return r0;
        } catch (TQN e3) {
            Exception A002 = e3.A00();
            AnonymousClass9GD r02 = new AnonymousClass9GD();
            r02.A0B(A002);
            return r02;
        }
    }

    public final AnonymousClass9GD Bst() {
        List emptyList;
        Object obj = this.A09.get();
        if (obj != null) {
            emptyList = Collections.singletonList(obj);
        } else {
            emptyList = Collections.emptyList();
        }
        AnonymousClass9GD r0 = new AnonymousClass9GD();
        r0.A0C(emptyList);
        return r0;
    }

    public final void EBk(C70062Je r3) {
        C10904S0e s0e = this.A03;
        synchronized (s0e) {
            s0e.A00.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
        if (r1.contains(r5) == false) goto L_0x018c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9GD Ex7(X.C365678nV r29) {
        /*
            r28 = this;
            r8 = r28
            r5 = r8
            monitor-enter(r5)     // Catch:{ TQN -> 0x0270 }
            java.util.concurrent.atomic.AtomicReference r4 = r8.A09     // Catch:{ all -> 0x026d }
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x026d }
            X.Rzt r2 = (X.C10893Rzt) r2     // Catch:{ all -> 0x026d }
            if (r2 == 0) goto L_0x0025
            r3 = r2
            X.Qy2 r3 = (X.Qy2) r3     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            int r1 = r3.A01     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            if (r1 == 0) goto L_0x0028
            r0 = 5
            if (r1 == r0) goto L_0x0028
            r0 = 6
            if (r1 == r0) goto L_0x0028
            r0 = 7
            if (r1 == r0) goto L_0x0028
            r1 = -1
            X.QpH r0 = new X.QpH     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            throw r0     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
        L_0x0025:
            r21 = 1
            goto L_0x002c
        L_0x0028:
            int r0 = r3.A00     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            int r21 = r0 + 1
        L_0x002c:
            r3 = r29
            java.util.List r7 = r3.A00     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            r15 = 1
            r6 = 0
            r24 = 0
            r17 = 0
            X.Qy2 r1 = new X.Qy2     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
            r18 = r7
            r20 = r17
            r22 = r15
            r23 = r6
            r26 = r24
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26)     // Catch:{ RuntimeException -> 0x0263, Exception -> 0x0261 }
        L_0x004b:
            boolean r0 = X.1FH.A00(r2, r1, r4)     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x0058
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x026d }
            if (r0 == r2) goto L_0x004b
            r1 = 0
        L_0x0058:
            monitor-exit(r5)     // Catch:{ TQN -> 0x0270 }
            if (r1 == 0) goto L_0x025a
            int r0 = r1.A00     // Catch:{ TQN -> 0x0270 }
            r22 = r0
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r3.A01
            r20 = r0
            java.util.Iterator r1 = r20.iterator()
        L_0x006b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r1.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r0 = r0.getLanguage()
            r11.add(r0)
            goto L_0x006b
        L_0x007f:
            java.util.HashSet r13 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.io.File r1 = r8.A0E
            X.T95 r0 = X.T95.A00
            java.io.File[] r12 = r1.listFiles(r0)
            java.lang.String r1 = "FakeSplitInstallManager"
            if (r12 == 0) goto L_0x01e0
            r9 = 0
            r18 = 0
        L_0x0096:
            int r0 = r12.length
            if (r9 >= r0) goto L_0x01e7
            r14 = r12[r9]
            java.lang.String r5 = X.C9732Rfq.A00(r14)
            java.lang.String r2 = "\\.config\\."
            r1 = 2
            java.lang.String[] r0 = r5.split(r2, r1)
            r4 = 0
            r0 = r0[r6]
            r13.add(r5)
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x018c
            java.lang.String[] r0 = r5.split(r2, r1)
            r17 = r0[r6]
            X.RpX r0 = r8.A0A
            android.content.Context r0 = r0.A00
            android.content.res.Configuration r0 = X.Pxf.A0G(r0)
            android.os.LocaleList r3 = r0.getLocales()
            int r0 = r3.size()
            java.util.ArrayList r2 = X.DbS.A0v(r0)
        L_0x00cc:
            int r0 = r3.size()
            if (r4 >= r0) goto L_0x0103
            java.util.Locale r1 = r3.get(r4)
            java.lang.String r16 = r1.getLanguage()
            java.lang.String r0 = r1.getCountry()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = ""
        L_0x00e6:
            java.lang.String r0 = java.lang.String.valueOf(r16)
            java.lang.String r0 = r0.concat(r1)
            r2.add(r0)
            int r4 = r4 + 1
            goto L_0x00cc
        L_0x00f4:
            java.lang.String r0 = r1.getCountry()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "_"
            java.lang.String r1 = r0.concat(r1)
            goto L_0x00e6
        L_0x0103:
            java.util.HashSet r4 = X.C66580MXl.A12(r2)
            X.S0f r1 = r8.A01()
            java.lang.String[] r0 = new java.lang.String[]{r17}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.HashMap r17 = r1.A00(r0)
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r1 = X.AnonymousClass7TF.A0t(r17)
        L_0x011f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            goto L_0x011f
        L_0x012f:
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r16 = r4.iterator()
        L_0x0137:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.String r1 = X.AnonymousClass7TE.A18(r16)
            java.lang.String r0 = "_"
            boolean r4 = r1.contains(r0)
            if (r4 == 0) goto L_0x014f
            java.lang.String[] r0 = X.Pxh.A1b(r1, r0)
            r1 = r0[r6]
        L_0x014f:
            r2.add(r1)
            goto L_0x0137
        L_0x0153:
            java.util.Set r0 = r8.A06
            r2.addAll(r0)
            r2.addAll(r11)
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r16 = X.AnonymousClass7TF.A0s(r17)
        L_0x0163:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x017f
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r16)
            java.lang.Object r0 = r4.getKey()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0163
            java.util.Collection r0 = X.Pxe.A18(r4)
            r1.addAll(r0)
            goto L_0x0163
        L_0x017f:
            boolean r0 = r3.contains(r5)
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r1.contains(r5)
            if (r0 == 0) goto L_0x018c
            goto L_0x01d3
        L_0x018c:
            java.util.Set r0 = r8.A05
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r2 = ""
            java.lang.String r0 = "base"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            X.S0f r0 = r8.A01()
            java.util.HashMap r1 = r0.A00(r1)
            java.util.Iterator r3 = r20.iterator()
        L_0x01ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r2 = r3.next()
            java.util.Locale r2 = (java.util.Locale) r2
            java.lang.String r0 = r2.getLanguage()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = r2.getLanguage()
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x01ad
        L_0x01d3:
            long r0 = r14.length()
            long r18 = r18 + r0
            r10.add(r14)
        L_0x01dc:
            int r9 = r9 + 1
            goto L_0x0096
        L_0x01e0:
            java.lang.String r0 = "Specified splits directory does not exist."
            android.util.Log.w(r1, r0)
            r0 = -5
            goto L_0x0222
        L_0x01e7:
            r13.toString()
            java.lang.String.valueOf(r7)
            int r0 = r7.size()
            if (r0 != r15) goto L_0x0209
            X.2JS r0 = r8.A0B
            java.lang.Object r0 = r0.FP1()
            X.Rl0 r0 = (X.C10005Rl0) r0
            X.Qy3 r0 = (X.Qy3) r0
            java.util.Map r1 = r0.A01
            java.lang.Object r0 = r7.get(r6)
            java.lang.Number r0 = X.C51966G9m.A14(r0, r1)
            if (r0 != 0) goto L_0x0227
        L_0x0209:
            X.2JS r0 = r8.A0B
            java.lang.Object r0 = r0.FP1()
            X.Rl0 r0 = (X.C10005Rl0) r0
            X.Qy3 r0 = (X.Qy3) r0
            java.lang.Integer r0 = r0.A00
            if (r0 != 0) goto L_0x0227
            java.util.HashSet r0 = X.C66580MXl.A12(r7)
            boolean r0 = r13.containsAll(r0)
            if (r0 != 0) goto L_0x022c
            r0 = -2
        L_0x0222:
            X.9GD r0 = r8.A00(r0)
            return r0
        L_0x0227:
            int r0 = r0.intValue()
            goto L_0x0222
        L_0x022c:
            java.lang.Long r20 = java.lang.Long.valueOf(r24)
            java.lang.Long r21 = java.lang.Long.valueOf(r18)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r18 = r8
            r19 = r2
            r22 = r7
            r23 = r11
            r24 = r15
            r25 = r6
            A02(r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.concurrent.Executor r1 = r8.A07
            X.TJ4 r0 = new X.TJ4
            r0.<init>(r8, r10, r11)
            r1.execute(r0)
            X.9GD r0 = new X.9GD
            r0.<init>()
            r0.A0C(r2)
            return r0
        L_0x025a:
            r0 = -100
            X.9GD r0 = r8.A00(r0)     // Catch:{ TQN -> 0x0270 }
            return r0
        L_0x0261:
            r2 = move-exception
            goto L_0x0265
        L_0x0263:
            r1 = move-exception
            goto L_0x026c
        L_0x0265:
            java.lang.String r0 = "TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly."
            X.TQN r1 = new X.TQN     // Catch:{ all -> 0x026d }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x026d }
        L_0x026c:
            throw r1     // Catch:{ all -> 0x026d }
        L_0x026d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ TQN -> 0x0270 }
            throw r0     // Catch:{ TQN -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            java.lang.Exception r0 = r0.A00()
            X.RKT r0 = (X.RKT) r0
            com.google.android.gms.common.api.Status r0 = r0.A00
            int r0 = r0.A00
            X.9GD r0 = r8.A00(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SzT.Ex7(X.8nV):X.9GD");
    }

    public final Set BHt() {
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.addAll(this.A04.A03());
        A1F.addAll(this.A05);
        return A1F;
    }
}

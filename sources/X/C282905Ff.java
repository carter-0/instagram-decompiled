package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.5Ff  reason: invalid class name and case insensitive filesystem */
public final class C282905Ff implements Runnable {
    public static final String A0I = AnonymousClass389.A01("WorkerWrapper");
    public Context A00;
    public AnonymousClass38C A01;
    public C282935Fi A02 = new C282925Fh();
    public C283015Ft A03;
    public C282915Fg A04;
    public WorkDatabase A05;
    public AnonymousClass39L A06;
    public AnonymousClass390 A07;
    public AnonymousClass3DG A08;
    public C2377438z A09;
    public C2379539x A0A = new Object();
    public AnonymousClass38N A0B;
    public String A0C;
    public List A0D;
    public AnonymousClass38G A0E;
    public final C2379539x A0F = new Object();
    public final String A0G;
    public volatile int A0H = -256;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.39x, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.39x, java.lang.Object] */
    public C282905Ff(Context context, AnonymousClass38C r3, C282915Fg r4, WorkDatabase workDatabase, AnonymousClass39L r6, AnonymousClass3DG r7, AnonymousClass38N r8, List list) {
        this.A00 = context;
        this.A0B = r8;
        this.A06 = r6;
        this.A08 = r7;
        this.A0G = r7.A0M;
        this.A04 = r4;
        this.A03 = null;
        this.A01 = r3;
        this.A0E = r3.A00;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A05();
        this.A07 = this.A05.A00();
        this.A0D = list;
    }

    private void A00(boolean z) {
        1WY A002;
        Cursor query;
        WorkDatabase workDatabase = this.A05;
        workDatabase.beginTransaction();
        try {
            boolean z2 = false;
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            C251983oI r1 = ((C238313Bj) workDatabase.A05()).A02;
            r1.assertNotSuspendingTransaction();
            query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z2 = true;
            }
            query.close();
            A002.A00();
            if (!z2) {
                AnonymousClass39T.A00(this.A00, RescheduleReceiver.class, false);
            }
            if (z) {
                C2377438z r3 = this.A09;
                C2379139t r0 = C2379139t.ENQUEUED;
                String str = this.A0G;
                r3.Elp(r0, str);
                r3.Ely(str, this.A0H);
                r3.CmC(-1, str);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            this.A0A.A07(Boolean.valueOf(z));
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    public static boolean A01(C282905Ff r3) {
        if (r3.A0H == -256) {
            return false;
        }
        AnonymousClass389.A00();
        C2379139t Bz2 = r3.A09.Bz2(r3.A0G);
        if (Bz2 == null) {
            r3.A00(false);
            return true;
        }
        r3.A00(!Bz2.A00());
        return true;
    }

    public final void A03() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.beginTransaction();
        try {
            String str = this.A0G;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                C2377438z r2 = this.A09;
                if (r2.Bz2(str2) != C2379139t.CANCELLED) {
                    r2.Elp(C2379139t.FAILED, str2);
                }
                linkedList.addAll(this.A07.AwN(str2));
            }
            C255323tw r22 = ((C282925Fh) this.A02).A00;
            C2377438z r1 = this.A09;
            r1.EIO(str, this.A08.A00);
            r1.Ef5(r22, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            A00(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v2, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v36, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void run() {
        String str;
        StringBuilder sb;
        String str2;
        C255323tw A002;
        byte[] bArr;
        boolean z;
        C251983oI r3;
        1Vg r2;
        AnonymousClass1WV acquire;
        boolean z2;
        List<String> list = this.A0D;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str3 = this.A0G;
        sb2.append(str3);
        sb2.append(", tags={ ");
        boolean z3 = true;
        for (String str4 : list) {
            if (z3) {
                z3 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str4);
        }
        sb2.append(" } ]");
        this.A0C = sb2.toString();
        if (!A01(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.beginTransaction();
            try {
                AnonymousClass3DG r5 = this.A08;
                C2379139t r0 = r5.A0E;
                C2379139t r22 = C2379139t.ENQUEUED;
                if (r0 != r22) {
                    if (this.A09.Bz2(str3) == C2379139t.RUNNING) {
                        AnonymousClass389.A00();
                        z2 = true;
                    } else {
                        AnonymousClass389.A00();
                        z2 = false;
                    }
                    A00(z2);
                    workDatabase.setTransactionSuccessful();
                    AnonymousClass389.A00();
                } else if ((r5.A02() || r5.A02 > 0) && System.currentTimeMillis() < r5.A00()) {
                    AnonymousClass389.A00();
                    String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{r5.A0I});
                    A00(true);
                    workDatabase.setTransactionSuccessful();
                } else {
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (r5.A02()) {
                        A002 = r5.A0C;
                    } else {
                        String str5 = r5.A0H;
                        0qQ.A0B(str5, 0);
                        try {
                            Object newInstance = Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            0qQ.A0C(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                            C375629Ek r11 = (C375629Ek) newInstance;
                            if (r11 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(r5.A0C);
                                TreeMap treeMap = 1WY.A08;
                                1WY A003 = 1Wa.A00("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                A003.ADh(1, str3);
                                C251983oI r02 = ((C238313Bj) this.A09).A02;
                                r02.assertNotSuspendingTransaction();
                                Cursor query = r02.query((AnonymousClass1WA) A003, (CancellationSignal) null);
                                try {
                                    ArrayList arrayList2 = new ArrayList(query.getCount());
                                    while (query.moveToNext()) {
                                        if (query.isNull(0)) {
                                            bArr = null;
                                        } else {
                                            bArr = query.getBlob(0);
                                        }
                                        arrayList2.add(C255323tw.A00(bArr));
                                    }
                                    query.close();
                                    A003.A00();
                                    arrayList.addAll(arrayList2);
                                    A002 = r11.A00(arrayList);
                                } catch (Throwable th) {
                                    query.close();
                                    A003.A00();
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            AnonymousClass389.A00();
                            Log.e(C9892Rj7.A00, 002.A0R("Trouble instantiating ", str5), e);
                        }
                        AnonymousClass389.A00();
                        str = A0I;
                        sb = new StringBuilder();
                        sb.append("Could not create Input Merger ");
                        str2 = r5.A0H;
                        sb.append(str2);
                        Log.e(str, sb.toString());
                        A03();
                        return;
                    }
                    UUID fromString = UUID.fromString(str3);
                    C282915Fg r15 = this.A04;
                    int i = r5.A02;
                    int i2 = r5.A0K;
                    AnonymousClass38C r32 = this.A01;
                    Executor executor = r32.A05;
                    AnonymousClass38N r6 = this.A0B;
                    AnonymousClass38I r112 = r32.A03;
                    C282975Fm r9 = new C282975Fm(workDatabase, r6);
                    C282995Fo r33 = new C282995Fo(workDatabase, this.A06, r6);
                    ? obj = new Object();
                    obj.A09 = fromString;
                    obj.A02 = A002;
                    obj.A08 = new HashSet(list);
                    obj.A06 = r15;
                    obj.A01 = i;
                    obj.A00 = i2;
                    obj.A0A = executor;
                    obj.A07 = r6;
                    obj.A05 = r112;
                    obj.A04 = r9;
                    obj.A03 = r33;
                    C283015Ft r1 = this.A03;
                    if (r1 == null) {
                        Context context = this.A00;
                        str2 = r5.A0I;
                        r1 = r112.A00(context, obj, str2);
                        this.A03 = r1;
                        if (r1 == null) {
                            AnonymousClass389.A00();
                            str = A0I;
                            sb = new StringBuilder();
                            sb.append("Could not create Worker ");
                            sb.append(str2);
                            Log.e(str, sb.toString());
                            A03();
                            return;
                        }
                    }
                    if (r1.mUsed) {
                        AnonymousClass389.A00();
                        str = A0I;
                        sb = new StringBuilder();
                        sb.append("Received an already-used Worker ");
                        sb.append(r5.A0I);
                        str2 = "; Worker Factory should return new instances";
                        sb.append(str2);
                        Log.e(str, sb.toString());
                        A03();
                        return;
                    }
                    boolean z4 = true;
                    r1.mUsed = true;
                    workDatabase.beginTransaction();
                    C2377438z r113 = this.A09;
                    if (r113.Bz2(str3) == r22) {
                        r113.Elp(C2379139t.RUNNING, str3);
                        C238313Bj r03 = (C238313Bj) r113;
                        r3 = r03.A02;
                        r3.assertNotSuspendingTransaction();
                        r2 = r03.A04;
                        acquire = r2.acquire();
                        acquire.ADh(1, str3);
                        r3.beginTransaction();
                        acquire.ATQ();
                        r3.setTransactionSuccessful();
                        r3.endTransaction();
                        r2.release(acquire);
                        r113.Ely(str3, -256);
                        z = true;
                    } else {
                        z = false;
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (!z) {
                        if (r113.Bz2(str3) == C2379139t.RUNNING) {
                            AnonymousClass389.A00();
                        } else {
                            AnonymousClass389.A00();
                            z4 = false;
                        }
                        A00(z4);
                        return;
                    } else if (!A01(this)) {
                        C283035Fv r7 = new C283035Fv(this.A00, obj.A03, this.A03, r5, r6);
                        AnonymousClass38M r62 = (AnonymousClass38M) r6;
                        Executor executor2 = r62.A02;
                        executor2.execute(r7);
                        C2379539x r34 = r7.A04;
                        C2379539x r23 = this.A0F;
                        r23.addListener(new C283045Fw(this, r34), new Object());
                        r34.addListener(new C283065Fy(this, r34), executor2);
                        r23.addListener(new C283075Fz(this, this.A0C), r62.A01);
                        return;
                    } else {
                        return;
                    }
                }
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    public final void A02() {
        boolean z;
        boolean z2;
        AnonymousClass3DG r10;
        C251983oI r8;
        1Vg r6;
        AnonymousClass1WV acquire;
        1WY A002;
        Cursor query;
        if (!A01(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.beginTransaction();
            try {
                C2377438z r4 = this.A09;
                String str = this.A0G;
                C2379139t Bz2 = r4.Bz2(str);
                workDatabase.A04().AOP(str);
                if (Bz2 == null) {
                    z = false;
                } else {
                    if (Bz2 == C2379139t.RUNNING) {
                        C282935Fi r1 = this.A02;
                        if (r1 instanceof AnonymousClass5G1) {
                            AnonymousClass389.A00();
                            r10 = this.A08;
                            if (!r10.A02()) {
                                workDatabase.beginTransaction();
                                try {
                                    r4.Elp(C2379139t.SUCCEEDED, str);
                                    r4.Ef5(((AnonymousClass5G1) this.A02).A00, str);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    AnonymousClass390 r9 = this.A07;
                                    Iterator it = r9.AwN(str).iterator();
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        if (r4.Bz2(str2) == C2379139t.BLOCKED) {
                                            C282945Fj r62 = (C282945Fj) r9;
                                            boolean z3 = true;
                                            TreeMap treeMap = 1WY.A08;
                                            A002 = 1Wa.A00("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            if (str2 == null) {
                                                A002.ADb(1);
                                            } else {
                                                A002.ADh(1, str2);
                                            }
                                            C251983oI r5 = r62.A01;
                                            r5.assertNotSuspendingTransaction();
                                            boolean z4 = false;
                                            query = r5.query((AnonymousClass1WA) A002, (CancellationSignal) null);
                                            if (query.moveToFirst()) {
                                                if (query.getInt(0) == 0) {
                                                    z3 = false;
                                                }
                                                z4 = z3;
                                            }
                                            query.close();
                                            A002.A00();
                                            if (z4) {
                                                AnonymousClass389.A00();
                                                r4.Elp(C2379139t.ENQUEUED, str2);
                                                r4.Eak(str2, currentTimeMillis);
                                            }
                                        }
                                    }
                                    workDatabase.setTransactionSuccessful();
                                    workDatabase.endTransaction();
                                    A00(false);
                                    workDatabase.setTransactionSuccessful();
                                } catch (Throwable th) {
                                    th = th;
                                    workDatabase.endTransaction();
                                    A00(false);
                                    throw th;
                                }
                            }
                        } else {
                            boolean z5 = r1 instanceof AnonymousClass5G2;
                            AnonymousClass389.A00();
                            if (!z5) {
                                r10 = this.A08;
                                if (!r10.A02()) {
                                    A03();
                                    workDatabase.setTransactionSuccessful();
                                }
                            }
                        }
                        workDatabase.beginTransaction();
                        z = false;
                        try {
                            r4.Eak(str, System.currentTimeMillis());
                            r4.Elp(C2379139t.ENQUEUED, str);
                            C238313Bj r92 = (C238313Bj) r4;
                            r8 = r92.A02;
                            r8.assertNotSuspendingTransaction();
                            r6 = r92.A06;
                            acquire = r6.acquire();
                            acquire.ADh(1, str);
                            r8.beginTransaction();
                            acquire.ATQ();
                            r8.setTransactionSuccessful();
                            r8.endTransaction();
                            r6.release(acquire);
                            r4.EIO(str, r10.A00);
                            r8.assertNotSuspendingTransaction();
                            r6 = r92.A03;
                            acquire = r6.acquire();
                            acquire.ADh(1, str);
                            r8.beginTransaction();
                            acquire.ATQ();
                            r8.setTransactionSuccessful();
                            r8.endTransaction();
                            r6.release(acquire);
                            r4.CmC(-1, str);
                            workDatabase.setTransactionSuccessful();
                            workDatabase.endTransaction();
                        } catch (Throwable th2) {
                            th = th2;
                            workDatabase.endTransaction();
                            A00(z2);
                            throw th;
                        }
                    } else {
                        if (!Bz2.A00()) {
                            this.A0H = -512;
                        }
                        workDatabase.setTransactionSuccessful();
                    }
                    workDatabase.beginTransaction();
                    z = true;
                    r4.Elp(C2379139t.ENQUEUED, str);
                    r4.Eak(str, System.currentTimeMillis());
                    r4.EIO(str, this.A08.A00);
                    r4.CmC(-1, str);
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                }
                A00(z);
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
    }
}

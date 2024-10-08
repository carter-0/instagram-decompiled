package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.instagram.android.R;
import com.instagram.app.InstagramAppShell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.385  reason: invalid class name */
public final class AnonymousClass385 {
    public static AnonymousClass385 A0A;
    public static AnonymousClass385 A0B;
    public static final Object A0C = new Object();
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public AnonymousClass38C A02;
    public AnonymousClass39K A03;
    public WorkDatabase A04;
    public C2378839p A05;
    public AnonymousClass38N A06;
    public List A07;
    public boolean A08;
    public final AnonymousClass397 A09;

    public final C375689Eq A03(List list) {
        List list2 = list;
        if (!list.isEmpty()) {
            return new SSM(this, AnonymousClass05K.A01, (String) null, list2, (List) null).A02();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final C375679Ep A05(String str) {
        C293065jz r1 = new C293065jz(this, str, true);
        this.A06.ATP(r1);
        return r1.A00;
    }

    static {
        AnonymousClass389.A01("WorkManagerImpl");
    }

    public static AnonymousClass385 A00(Context context) {
        AnonymousClass385 r0;
        synchronized (A0C) {
            try {
                r0 = A0B;
                if (r0 == null) {
                    r0 = A0A;
                }
                if (r0 == null) {
                    InstagramAppShell applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof AnonymousClass091) {
                        String str = ((AnonymousClass091) applicationContext).A00.A01;
                        str.getClass();
                        A01(applicationContext, new AnonymousClass38C(str));
                        r0 = A00(applicationContext);
                    } else {
                        th = new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
        }
        return r0;
    }

    public static void A01(Context context, AnonymousClass38C r22) {
        1VA A002;
        synchronized (A0C) {
            if (A0B == null) {
                Context applicationContext = context.getApplicationContext();
                AnonymousClass385 r11 = A0A;
                if (r11 == null) {
                    0qQ.A0B(applicationContext, 0);
                    AnonymousClass38C r13 = r22;
                    AnonymousClass38M r3 = new AnonymousClass38M(r13.A06);
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    0qQ.A07(applicationContext2);
                    AnonymousClass38P r8 = r3.A01;
                    0qQ.A07(r8);
                    AnonymousClass38G r7 = r13.A00;
                    boolean z = applicationContext.getResources().getBoolean(R.bool.enable_system_alarm_service_default);
                    0qQ.A0B(r7, 2);
                    Class<WorkDatabase> cls = WorkDatabase.class;
                    if (z) {
                        A002 = new 1VA(applicationContext2, cls, (String) null);
                        A002.A04 = true;
                    } else {
                        A002 = 1V9.A00(applicationContext2, cls, "androidx.work.workdb");
                        A002.A00 = new AnonymousClass38S(applicationContext2);
                    }
                    A002.A01 = r8;
                    A002.A09.add(new AnonymousClass38T(r7));
                    A002.A03(new AnonymousClass1VF[]{AnonymousClass38V.A00});
                    A002.A03(new AnonymousClass1VF[]{new AnonymousClass38X(applicationContext2, 2, 3)});
                    A002.A03(new AnonymousClass1VF[]{AnonymousClass38Z.A00});
                    A002.A03(new AnonymousClass1VF[]{C2375138a.A00});
                    A002.A03(new AnonymousClass1VF[]{new AnonymousClass38X(applicationContext2, 5, 6)});
                    A002.A03(new AnonymousClass1VF[]{C2375238b.A00});
                    A002.A03(new AnonymousClass1VF[]{C2375438d.A00});
                    A002.A03(new AnonymousClass1VF[]{C2375538e.A00});
                    A002.A03(new AnonymousClass1VF[]{new C2375638f(applicationContext2)});
                    A002.A03(new AnonymousClass1VF[]{new AnonymousClass38X(applicationContext2, 10, 11)});
                    A002.A03(new AnonymousClass1VF[]{C2375738g.A00});
                    A002.A03(new AnonymousClass1VF[]{C2375938i.A00});
                    A002.A03(new AnonymousClass1VF[]{C2376038j.A00});
                    A002.A03(new AnonymousClass1VF[]{C2376238l.A00});
                    A002.A01();
                    WorkDatabase workDatabase = (WorkDatabase) A002.A00();
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    0qQ.A07(applicationContext3);
                    AnonymousClass397 r2 = new AnonymousClass397(applicationContext3, r3);
                    AnonymousClass39K r14 = new AnonymousClass39K(applicationContext.getApplicationContext(), r13, workDatabase, r3);
                    AnonymousClass39M r1 = AnonymousClass39M.A00;
                    0qQ.A0B(workDatabase, 3);
                    0qQ.A0B(r1, 6);
                    AnonymousClass397 r16 = r2;
                    r11 = new AnonymousClass385(applicationContext.getApplicationContext(), r13, r14, workDatabase, r16, r3, (List) r1.invoke(applicationContext, r13, r3, workDatabase, r2, r14));
                    A0A = r11;
                }
                A0B = r11;
            } else if (A0A != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    public final C375679Ep A04(String str) {
        QG7 qg7 = new QG7(this, str);
        this.A06.ATP(qg7);
        return qg7.A00;
    }

    public final void A06() {
        synchronized (A0C) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A07() {
        ArrayList A002;
        Context context = this.A01;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (A002 = AnonymousClass39O.A00(jobScheduler, context)) == null || A002.isEmpty())) {
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                AnonymousClass39O.A01(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.A04;
        C238313Bj r0 = (C238313Bj) workDatabase.A05();
        C251983oI r3 = r0.A02;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = r0.A05;
        AnonymousClass1WV acquire = r2.acquire();
        r3.beginTransaction();
        try {
            acquire.ATQ();
            r3.setTransactionSuccessful();
            r3.endTransaction();
            r2.release(acquire);
            C255313tv.A00(workDatabase, this.A07);
        } catch (Throwable th) {
            r3.endTransaction();
            r2.release(acquire);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.389, java.lang.Object] */
    public AnonymousClass385(Context context, AnonymousClass38C r5, AnonymousClass39K r6, WorkDatabase workDatabase, AnonymousClass397 r8, AnonymousClass38N r9, List list) {
        this.A08 = false;
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            ? obj = new Object();
            synchronized (AnonymousClass389.A00) {
                AnonymousClass389.A01 = obj;
            }
            this.A01 = applicationContext;
            this.A06 = r9;
            this.A04 = workDatabase;
            this.A03 = r6;
            this.A09 = r8;
            this.A02 = r5;
            this.A07 = list;
            this.A05 = new C2378839p(workDatabase);
            r6.A02(new C2378939q(r5, workDatabase, list, ((AnonymousClass38M) r9).A01));
            this.A06.ATP(new AnonymousClass39r(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public final C375689Eq A02(C7485QFt qFt, Integer num, String str) {
        return new SSM(this, num, str, Collections.singletonList(qFt), (List) null).A02();
    }

    public AnonymousClass385() {
    }
}

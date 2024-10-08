package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.TAn  reason: case insensitive filesystem */
public final class C12848TAn implements Runnable {
    public final /* synthetic */ Sg6 A00;

    public C12848TAn(Sg6 sg6) {
        this.A00 = sg6;
    }

    public final void run() {
        List<C2805352f> list;
        C251983oI r8;
        1Vg r7;
        AnonymousClass1WV acquire;
        Executor executor;
        Runnable tAm;
        Sg6 sg6 = this.A00;
        List list2 = sg6.A0A;
        synchronized (list2) {
            sg6.A00 = (Intent) list2.get(0);
        }
        Intent intent = sg6.A00;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = sg6.A00.getIntExtra("KEY_START_ID", 0);
            AnonymousClass389.A00();
            String str = Sg6.A0B;
            PowerManager.WakeLock A002 = SAu.A00(sg6.A03, 002.A06(intExtra, action, " (", ")"));
            try {
                AnonymousClass389.A00();
                C60270fk.A00(A002);
                Sg5 sg5 = sg6.A07;
                Intent intent2 = sg6.A00;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    AnonymousClass389.A00();
                    Context context = sg5.A00;
                    AnonymousClass385 r1 = sg6.A06;
                    C2377939g r9 = new C2377939g(r1.A09);
                    ArrayList Bpe = r1.A04.A05().Bpe();
                    Iterator it = Bpe.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        C255343ty r12 = ((AnonymousClass3DG) it.next()).A0B;
                        z |= r12.A04;
                        z2 |= r12.A05;
                        z3 |= r12.A07;
                        z4 |= C51969G9p.A1a(r12.A02, AnonymousClass05K.A00);
                        if (z && z2 && z3 && z4) {
                            break;
                        }
                    }
                    Intent A0G = Pxe.A0G("androidx.work.impl.background.systemalarm.UpdateProxies");
                    A0G.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
                    A0G.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                    context.sendBroadcast(A0G);
                    ArrayList A14 = Pxg.A14(Bpe);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it2 = Bpe.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3DG r5 = (AnonymousClass3DG) it2.next();
                        if (currentTimeMillis >= r5.A00() && (!C51966G9m.A1a(C255343ty.A08, r5.A0B) || r9.A00(r5))) {
                            A14.add(r5);
                        }
                    }
                    Iterator it3 = A14.iterator();
                    while (it3.hasNext()) {
                        C255373u1 A003 = C255363u0.A00((AnonymousClass3DG) it3.next());
                        Intent A0A = C66580MXl.A0A(context, SystemAlarmService.class);
                        A0A.setAction("ACTION_DELAY_MET");
                        Sg5.A00(A0A, A003);
                        AnonymousClass389.A00();
                        TL2.A00(A0A, sg6, ((AnonymousClass38M) sg6.A09).A02, intExtra);
                    }
                    AnonymousClass389.A00();
                    C60270fk.A01(A002);
                    ((AnonymousClass38M) sg6.A09).A02.execute(new C12849TAo(sg6));
                }
                if ("ACTION_RESCHEDULE".equals(action2)) {
                    AnonymousClass389.A00();
                    sg6.A06.A07();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                        AnonymousClass389.A00();
                        Log.e(Sg5.A05, 002.A11("Invalid request for ", action2, " , requires ", "KEY_WORKSPEC_ID", " ."));
                    } else if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                        C255373u1 r92 = new C255373u1(intent2.getStringExtra("KEY_WORKSPEC_ID"), intent2.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        AnonymousClass389.A00();
                        String str2 = Sg5.A05;
                        WorkDatabase workDatabase = sg6.A06.A04;
                        workDatabase.beginTransaction();
                        try {
                            AnonymousClass3DG CGi = workDatabase.A05().CGi(r92.A01);
                            if (CGi == null) {
                                AnonymousClass389.A00();
                                StringBuilder A0n = AnonymousClass7TF.A0n("Skipping scheduling ");
                                A0n.append(r92);
                                Pxg.A1Q(" because it's no longer in the DB", str2, A0n);
                            } else if (CGi.A0E.A00()) {
                                AnonymousClass389.A00();
                                StringBuilder A0n2 = AnonymousClass7TF.A0n("Skipping scheduling ");
                                A0n2.append(r92);
                                Pxg.A1Q("because it is finished.", str2, A0n2);
                            } else {
                                long A004 = CGi.A00();
                                if (!C51966G9m.A1a(C255343ty.A08, CGi.A0B)) {
                                    AnonymousClass389.A00();
                                    SKC.A00(sg5.A00, workDatabase, r92, A004);
                                } else {
                                    AnonymousClass389.A00();
                                    Context context2 = sg5.A00;
                                    SKC.A00(context2, workDatabase, r92, A004);
                                    Intent A0A2 = C66580MXl.A0A(context2, SystemAlarmService.class);
                                    A0A2.setAction("ACTION_CONSTRAINTS_CHANGED");
                                    TL2.A00(A0A2, sg6, ((AnonymousClass38M) sg6.A09).A02, intExtra);
                                }
                                workDatabase.setTransactionSuccessful();
                            }
                            workDatabase.endTransaction();
                        } catch (Throwable th) {
                            th = th;
                            workDatabase.endTransaction();
                            throw th;
                        }
                    } else if ("ACTION_DELAY_MET".equals(action2)) {
                        synchronized (sg5.A02) {
                            try {
                                C255373u1 r6 = new C255373u1(intent2.getStringExtra("KEY_WORKSPEC_ID"), intent2.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                                AnonymousClass389.A00();
                                Map map = sg5.A03;
                                if (!map.containsKey(r6)) {
                                    Sg7 sg7 = new Sg7(sg5.A00, sg5.A01.A01(r6), sg6, intExtra);
                                    map.put(r6, sg7);
                                    String str3 = sg7.A08.A01;
                                    sg7.A01 = SAu.A00(sg7.A04, 002.A06(sg7.A03, str3, " (", ")"));
                                    AnonymousClass389.A00();
                                    C60270fk.A00(sg7.A01);
                                    AnonymousClass3DG CGi2 = sg7.A06.A06.A04.A05().CGi(str3);
                                    if (CGi2 == null) {
                                        executor = sg7.A0A;
                                        tAm = new C12846TAl(sg7);
                                    } else {
                                        boolean A1a = C51966G9m.A1a(C255343ty.A08, CGi2.A0B);
                                        sg7.A02 = A1a;
                                        if (!A1a) {
                                            AnonymousClass389.A00();
                                            executor = sg7.A0A;
                                            tAm = new C12847TAm(sg7);
                                        } else {
                                            sg7.A0D = AnonymousClass52Y.A00(sg7, sg7.A07, CGi2, sg7.A0B);
                                        }
                                    }
                                    executor.execute(tAm);
                                } else {
                                    AnonymousClass389.A00();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else if ("ACTION_STOP_WORK".equals(action2)) {
                        Bundle extras2 = intent2.getExtras();
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                            int i = extras2.getInt("KEY_WORKSPEC_GENERATION");
                            ArrayList A0v = DbS.A0v(1);
                            C2805352f A005 = sg5.A01.A00(new C255373u1(string, i));
                            list = A0v;
                            if (A005 != null) {
                                A0v.add(A005);
                                list = A0v;
                            }
                        } else {
                            list = sg5.A01.A02(string);
                        }
                        for (C2805352f r2 : list) {
                            AnonymousClass389.A00();
                            AnonymousClass39Z r13 = sg6.A05;
                            0qQ.A0B(r2, 1);
                            r13.EyV(r2, -512);
                            Context context3 = sg5.A00;
                            WorkDatabase workDatabase2 = sg6.A06.A04;
                            C255373u1 r11 = r2.A00;
                            AnonymousClass392 A02 = workDatabase2.A02();
                            C255383u2 C3e = A02.C3e(r11);
                            if (C3e != null) {
                                SKC.A01(context3, r11, C3e.A01);
                                AnonymousClass389.A00();
                                String str4 = r11.A01;
                                int i2 = r11.A00;
                                AnonymousClass3A6 r22 = (AnonymousClass3A6) A02;
                                r8 = r22.A00;
                                r8.assertNotSuspendingTransaction();
                                r7 = r22.A01;
                                acquire = r7.acquire();
                                acquire.ADh(1, str4);
                                acquire.ADa(2, (long) i2);
                                r8.beginTransaction();
                                acquire.ATQ();
                                r8.setTransactionSuccessful();
                                r8.endTransaction();
                                r7.release(acquire);
                            }
                            sg6.DDI(r11, false);
                        }
                    } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                        C255373u1 r23 = new C255373u1(intent2.getStringExtra("KEY_WORKSPEC_ID"), intent2.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        boolean z5 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                        AnonymousClass389.A00();
                        sg5.DDI(r23, z5);
                    } else {
                        AnonymousClass389.A00();
                        Log.w(Sg5.A05, AnonymousClass7TG.A0m(intent2, "Ignoring intent ", AnonymousClass7TE.A1A()));
                    }
                }
                AnonymousClass389.A00();
                C60270fk.A01(A002);
                ((AnonymousClass38M) sg6.A09).A02.execute(new C12849TAo(sg6));
            } catch (Throwable th3) {
                try {
                    AnonymousClass389.A00();
                    Log.e(str, "Unexpected error in onHandleIntent", th3);
                } catch (Throwable th4) {
                    AnonymousClass389.A00();
                    C60270fk.A01(A002);
                    ((AnonymousClass38M) sg6.A09).A02.execute(new C12849TAo(sg6));
                    throw th4;
                }
            }
        }
    }
}

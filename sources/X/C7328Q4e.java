package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* renamed from: X.Q4e  reason: case insensitive filesystem */
public final class C7328Q4e implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C7325Q4b A01;
    public final /* synthetic */ C282995Fo A02;
    public final /* synthetic */ C2379539x A03;
    public final /* synthetic */ UUID A04;

    public C7328Q4e(Context context, C7325Q4b q4b, C282995Fo r3, C2379539x r4, UUID uuid) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = uuid;
        this.A01 = q4b;
        this.A00 = context;
    }

    public final void run() {
        IllegalStateException th;
        try {
            C2379539x r3 = this.A03;
            if (!r3.isCancelled()) {
                String obj = this.A04.toString();
                C282995Fo r1 = this.A02;
                AnonymousClass3DG CGi = r1.A01.CGi(obj);
                if (CGi == null || CGi.A0E.A00()) {
                    th = AnonymousClass7TE.A0z("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    AnonymousClass39L r7 = r1.A00;
                    C7325Q4b q4b = this.A01;
                    AnonymousClass39K r72 = (AnonymousClass39K) r7;
                    synchronized (r72.A09) {
                        try {
                            AnonymousClass389.A00();
                            C282905Ff r2 = (C282905Ff) r72.A04.remove(obj);
                            if (r2 != null) {
                                if (r72.A01 == null) {
                                    PowerManager.WakeLock A002 = SAu.A00(r72.A00, "ProcessorForegroundLck");
                                    r72.A01 = A002;
                                    C60270fk.A00(A002);
                                }
                                r72.A05.put(obj, r2);
                                Context context = r72.A00;
                                C255373u1 A003 = C255363u0.A00(r2.A08);
                                Intent A0A = C66580MXl.A0A(context, SystemForegroundService.class);
                                A0A.setAction("ACTION_START_FOREGROUND");
                                A0A.putExtra("KEY_WORKSPEC_ID", A003.A01);
                                A0A.putExtra("KEY_GENERATION", A003.A00);
                                A0A.putExtra("KEY_NOTIFICATION_ID", q4b.A01);
                                A0A.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q4b.A00);
                                A0A.putExtra("KEY_NOTIFICATION", q4b.A02);
                                context.startForegroundService(A0A);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Context context2 = this.A00;
                    C255373u1 A004 = C255363u0.A00(CGi);
                    Intent A0A2 = C66580MXl.A0A(context2, SystemForegroundService.class);
                    A0A2.setAction("ACTION_NOTIFY");
                    A0A2.putExtra("KEY_NOTIFICATION_ID", q4b.A01);
                    A0A2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q4b.A00);
                    A0A2.putExtra("KEY_NOTIFICATION", q4b.A02);
                    A0A2.putExtra("KEY_WORKSPEC_ID", A004.A01);
                    A0A2.putExtra("KEY_GENERATION", A004.A00);
                    context2.startService(A0A2);
                }
                throw th;
            }
            r3.A07((Object) null);
        } catch (Throwable th3) {
            this.A03.A08(th3);
        }
    }
}

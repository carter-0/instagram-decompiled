package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

public final class Q4Y implements AnonymousClass39S, C2377639c {
    public static final String A0A = AnonymousClass389.A01("SystemFgDispatcher");
    public AnonymousClass385 A00;
    public TZm A01;
    public C255373u1 A02;
    public Context A03;
    public final C2377939g A04;
    public final AnonymousClass38N A05;
    public final Object A06 = Pxe.A0p();
    public final Map A07;
    public final Map A08;
    public final Map A09;

    public final void A00() {
        this.A01 = null;
        synchronized (this.A06) {
            Iterator A0v = AnonymousClass7TF.A0v(this.A08);
            while (A0v.hasNext()) {
                ((C262204Co) A0v.next()).AG7((CancellationException) null);
            }
        }
        this.A00.A03.A03(this);
    }

    public final void D5t(C2805152d r7, AnonymousClass3DG r8) {
        if (r7 instanceof QG4) {
            AnonymousClass389.A00();
            AnonymousClass385 r1 = this.A00;
            C255373u1 A002 = C255363u0.A00(r8);
            AnonymousClass38N r5 = r1.A06;
            AnonymousClass39K r4 = r1.A03;
            C2805352f r3 = new C2805352f(A002);
            0qQ.A0B(r4, 1);
            r5.ATP(new TJQ(r4, r3, -512, true));
        }
    }

    public final void DDI(C255373u1 r8, boolean z) {
        Map.Entry A1J;
        C262204Co r0;
        synchronized (this.A06) {
            if (!(((AnonymousClass3DG) this.A09.remove(r8)) == null || (r0 = (C262204Co) this.A08.remove(r8)) == null)) {
                r0.AG7((CancellationException) null);
            }
        }
        Map map = this.A07;
        C7325Q4b q4b = (C7325Q4b) map.remove(r8);
        if (r8.equals(this.A02)) {
            if (map.size() > 0) {
                Iterator A0u = AnonymousClass7TF.A0u(map);
                do {
                    A1J = AnonymousClass7TE.A1J(A0u);
                } while (A0u.hasNext());
                this.A02 = (C255373u1) A1J.getKey();
                if (this.A01 != null) {
                    C7325Q4b q4b2 = (C7325Q4b) A1J.getValue();
                    TZm tZm = this.A01;
                    int i = q4b2.A01;
                    int i2 = q4b2.A00;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) tZm;
                    systemForegroundService.A01.post(new TJP(q4b2.A02, systemForegroundService, i, i2));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A01;
                    systemForegroundService2.A01.post(new C12940TEr(systemForegroundService2, i));
                }
            } else {
                this.A02 = null;
            }
        }
        TZm tZm2 = this.A01;
        if (q4b != null && tZm2 != null) {
            AnonymousClass389.A00();
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) tZm2;
            systemForegroundService3.A01.post(new C12940TEr(systemForegroundService3, q4b.A01));
        }
    }

    public Q4Y(Context context) {
        this.A03 = context;
        AnonymousClass385 A002 = AnonymousClass385.A00(context);
        this.A00 = A002;
        this.A05 = A002.A06;
        this.A02 = null;
        this.A07 = AnonymousClass7TE.A1H();
        this.A08 = AnonymousClass7TE.A1E();
        this.A09 = AnonymousClass7TE.A1E();
        this.A04 = new C2377939g(A002.A09);
        this.A00.A03.A02(this);
    }

    public final void A01(Intent intent) {
        Handler handler;
        TJP tjp;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            AnonymousClass389.A00();
            this.A05.ATP(new C12939TEq(this, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                AnonymousClass389.A00();
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    AnonymousClass385 r2 = this.A00;
                    r2.A06.ATP(new QG6(r2, UUID.fromString(stringExtra)));
                    return;
                }
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                AnonymousClass389.A00();
                TZm tZm = this.A01;
                if (tZm != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) tZm;
                    systemForegroundService.A03 = true;
                    AnonymousClass389.A00();
                    systemForegroundService.stopForeground(true);
                    SystemForegroundService.A04 = null;
                    systemForegroundService.stopSelf();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C255373u1 r1 = new C255373u1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AnonymousClass389.A00();
        if (notification != null && this.A01 != null) {
            C7325Q4b q4b = new C7325Q4b(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(r1, q4b);
            if (this.A02 == null) {
                this.A02 = r1;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A01;
                handler = systemForegroundService2.A01;
                tjp = new TJP(notification, systemForegroundService2, intExtra, intExtra2);
            } else {
                SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.A01;
                systemForegroundService3.A01.post(new C7327Q4d(notification, systemForegroundService3, intExtra));
                if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                    Iterator A0u = AnonymousClass7TF.A0u(map);
                    while (A0u.hasNext()) {
                        i |= ((C7325Q4b) ((Map.Entry) A0u.next()).getValue()).A00;
                    }
                    C7325Q4b q4b2 = (C7325Q4b) map.get(this.A02);
                    if (q4b2 != null) {
                        TZm tZm2 = this.A01;
                        int i2 = q4b2.A01;
                        Notification notification2 = q4b2.A02;
                        SystemForegroundService systemForegroundService4 = (SystemForegroundService) tZm2;
                        handler = systemForegroundService4.A01;
                        tjp = new TJP(notification2, systemForegroundService4, i2, i);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            handler.post(tjp);
        }
    }
}

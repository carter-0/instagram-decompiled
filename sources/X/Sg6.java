package X;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class Sg6 implements AnonymousClass39S {
    public static final String A0B = AnonymousClass389.A01("SystemAlarmDispatcher");
    public Intent A00;
    public AnonymousClass39d A01 = new AnonymousClass39d();
    public TZl A02;
    public final Context A03;
    public final AnonymousClass39K A04;
    public final AnonymousClass39Z A05;
    public final AnonymousClass385 A06;
    public final Sg5 A07;
    public final SHJ A08;
    public final AnonymousClass38N A09;
    public final List A0A;

    public Sg6(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext;
        AnonymousClass385 A002 = AnonymousClass385.A00(context);
        this.A06 = A002;
        AnonymousClass38C r3 = A002.A02;
        this.A07 = new Sg5(applicationContext, r3.A00, this.A01);
        this.A08 = new SHJ(r3.A02);
        AnonymousClass39K r2 = A002.A03;
        this.A04 = r2;
        AnonymousClass38N r1 = A002.A06;
        this.A09 = r1;
        this.A05 = new AnonymousClass39Y(r2, r1);
        r2.A02(this);
        this.A0A = AnonymousClass7TE.A1C();
        this.A00 = null;
    }

    public final void DDI(C255373u1 r4, boolean z) {
        Executor executor = ((AnonymousClass38M) this.A09).A02;
        Intent A0A2 = C66580MXl.A0A(this.A03, SystemAlarmService.class);
        A0A2.setAction("ACTION_EXECUTION_COMPLETED");
        A0A2.putExtra("KEY_NEEDS_RESCHEDULE", z);
        Sg5.A00(A0A2, r4);
        TL2.A00(A0A2, this, executor, 0);
    }

    public static void A00() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw AnonymousClass7TE.A0z("Needs to be invoked on the main thread.");
        }
    }

    public static void A01(Sg6 sg6) {
        A00();
        PowerManager.WakeLock A002 = SAu.A00(sg6.A03, "ProcessCommand");
        try {
            C60270fk.A00(A002);
            sg6.A06.A06.ATP(new C12848TAn(sg6));
        } finally {
            C60270fk.A01(A002);
        }
    }

    public final void A02(Intent intent, int i) {
        boolean z;
        AnonymousClass389.A00();
        String str = A0B;
        A00();
        String action = intent.getAction();
        boolean z2 = false;
        if (TextUtils.isEmpty(action)) {
            AnonymousClass389.A00();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A00();
            List list = this.A0A;
            synchronized (list) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.A0A;
        synchronized (list2) {
            if (!list2.isEmpty()) {
                z2 = true;
            }
            list2.add(intent);
            if (!z2) {
                A01(this);
            }
        }
    }
}

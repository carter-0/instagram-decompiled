package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Map;

public final class Sg5 implements AnonymousClass39S {
    public static final String A05 = AnonymousClass389.A01("CommandHandler");
    public final Context A00;
    public final AnonymousClass39d A01;
    public final Object A02 = Pxe.A0p();
    public final Map A03 = AnonymousClass7TE.A1E();
    public final AnonymousClass38G A04;

    public static void A00(Intent intent, C255373u1 r3) {
        intent.putExtra("KEY_WORKSPEC_ID", r3.A01);
        intent.putExtra("KEY_WORKSPEC_GENERATION", r3.A00);
    }

    public final void DDI(C255373u1 r7, boolean z) {
        synchronized (this.A02) {
            Sg7 sg7 = (Sg7) this.A03.remove(r7);
            this.A01.A00(r7);
            if (sg7 != null) {
                AnonymousClass389.A00();
                C255373u1 r2 = sg7.A08;
                Sg7.A00(sg7);
                if (z) {
                    Intent A0A = C66580MXl.A0A(sg7.A04, SystemAlarmService.class);
                    A0A.setAction("ACTION_SCHEDULE_WORK");
                    A00(A0A, r2);
                    TL2.A00(A0A, sg7.A06, sg7.A09, sg7.A03);
                }
                if (sg7.A02) {
                    Intent A0A2 = C66580MXl.A0A(sg7.A04, SystemAlarmService.class);
                    A0A2.setAction("ACTION_CONSTRAINTS_CHANGED");
                    TL2.A00(A0A2, sg7.A06, sg7.A09, sg7.A03);
                }
            }
        }
    }

    public Sg5(Context context, AnonymousClass38G r3, AnonymousClass39d r4) {
        this.A00 = context;
        this.A04 = r3;
        this.A01 = r4;
    }
}

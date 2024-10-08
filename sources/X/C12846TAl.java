package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* renamed from: X.TAl  reason: case insensitive filesystem */
public final /* synthetic */ class C12846TAl implements Runnable {
    public final /* synthetic */ Sg7 A00;

    public /* synthetic */ C12846TAl(Sg7 sg7) {
        this.A00 = sg7;
    }

    public final void run() {
        Sg7 sg7 = this.A00;
        C255373u1 r8 = sg7.A08;
        String str = r8.A01;
        if (sg7.A00 < 2) {
            sg7.A00 = 2;
            AnonymousClass389.A00();
            Context context = sg7.A04;
            Class<SystemAlarmService> cls = SystemAlarmService.class;
            Intent A0A = C66580MXl.A0A(context, cls);
            A0A.setAction("ACTION_STOP_WORK");
            Sg5.A00(A0A, r8);
            Executor executor = sg7.A09;
            Sg6 sg6 = sg7.A06;
            int i = sg7.A03;
            TL2.A00(A0A, sg6, executor, i);
            boolean A05 = sg6.A04.A05(str);
            AnonymousClass389.A00();
            if (A05) {
                Intent A0A2 = C66580MXl.A0A(context, cls);
                A0A2.setAction("ACTION_SCHEDULE_WORK");
                Sg5.A00(A0A2, r8);
                TL2.A00(A0A2, sg6, executor, i);
                return;
            }
            return;
        }
        AnonymousClass389.A00();
    }
}

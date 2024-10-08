package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3hY  reason: invalid class name and case insensitive filesystem */
public final class C248183hY extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248183hY(2Lk r7) {
        super("device_compute_platform_init", 675609327, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        AnonymousClass94M r0 = AnonymousClass94M.$redex_init_class;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        AnonymousClass94M r6 = (AnonymousClass94M) userSession.A01(AnonymousClass94M.class, new TTP(10, context, userSession));
        try {
            C60400gq r2 = r6.A00.A00;
            if (r2 == null || !r2.Agw(36315498970877177L)) {
                for (AnonymousClass94T cleanup : r6.A02) {
                    cleanup.cleanup();
                }
                return;
            }
            List list = r6.A03;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                C258743zZ r22 = (C258743zZ) next;
                if (r22.BeZ() != AnonymousClass05K.A01 || r22.Bux()) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                C3733194w.A00(r6.A01).A01(arrayList);
            }
            for (AnonymousClass94T CN8 : r6.A02) {
                CN8.CN8();
            }
        } catch (Exception e) {
            0f9 AEf = 0wj.A01.AEf("error on IgMLEngineSessionManager.init", 1011495295);
            AEf.ERJ(e);
            AEf.report();
        }
    }
}

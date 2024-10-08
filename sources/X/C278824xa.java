package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.util.offline.BackgroundPrefetchJobService;

/* renamed from: X.4xa  reason: invalid class name and case insensitive filesystem */
public final class C278824xa implements C278704xO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C278704xO A02;
    public final /* synthetic */ BackgroundPrefetchJobService A03;
    public final /* synthetic */ Class A04;
    public final /* synthetic */ Integer A05;

    public C278824xa(Context context, UserSession userSession, C278704xO r3, BackgroundPrefetchJobService backgroundPrefetchJobService, Class cls, Integer num) {
        this.A03 = backgroundPrefetchJobService;
        this.A01 = userSession;
        this.A05 = num;
        this.A00 = context;
        this.A04 = cls;
        this.A02 = r3;
    }

    public final void DFq(Integer num, boolean z) {
        String A002 = C278844xc.A00(num);
        BackgroundPrefetchJobService backgroundPrefetchJobService = this.A03;
        UserSession userSession = this.A01;
        Integer num2 = this.A05;
        BackgroundPrefetchJobService.A01(userSession, backgroundPrefetchJobService, num2, A002, 276376302);
        Class<C278724xQ> cls = C278724xQ.class;
        synchronized (cls) {
            userSession.A03(cls);
        }
        if (num2 != null && 182.A06(0Tu.A05, userSession, 36319463225695650L)) {
            C227462jM.A00(this.A00, userSession).A04(new C227512jS(new C227502jR(this.A04, num2.intValue())));
        } else if (z && backgroundPrefetchJobService.A02()) {
            BackgroundPrefetchJobService.A01(userSession, backgroundPrefetchJobService, num2, "rescheduled", 276374386);
        }
        C278714xP r0 = backgroundPrefetchJobService.A00;
        if (r0 != null) {
            r0.A02();
            if (num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N || num == AnonymousClass05K.A00) {
                C278714xP r1 = backgroundPrefetchJobService.A00;
                String A003 = C278844xc.A00(num);
                if (C278714xP.A01(r1)) {
                    r1.A02.flowEndCancel(r1.A01, A003);
                }
            } else {
                C278714xP r12 = backgroundPrefetchJobService.A00;
                if (C278714xP.A01(r12)) {
                    r12.A02.flowEndSuccess(r12.A01);
                }
            }
        }
        this.A02.DFq(num, z);
    }
}

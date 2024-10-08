package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ADf  reason: case insensitive filesystem */
public final class C39883ADf {
    public final Context A00;
    public final UserSession A01;

    public C39883ADf(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void A01(C254793t3 r18, User user, long j) {
        User user2 = user;
        0qQ.A0B(user2, 0);
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        if (r0.A01(userSession).A1x() && !A00(this)) {
            1Av A002 = 1Au.A00(userSession);
            0s0 r1 = A002.A0v;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            if (j > AnonymousClass7TE.A0R(r1.CDM(A002, r5[527]))) {
                1Av A003 = 1Au.A00(userSession);
                A003.A0v.Epx(A003, Long.valueOf(j), r5[527]);
                String fbidV2 = user2.A03.getFbidV2();
                if (fbidV2 != null) {
                    J6W j6w = new J6W(43, user2, r18, this);
                    1vn A012 = 1vm.A01(userSession);
                    2IS r2 = new 2IS();
                    2IS r12 = new 2IS();
                    r2.A04("consumer_fbid", fbidV2);
                    AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
                    1Ef ensureCacheWrite = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "DetectedOutcomesNuxQuery", r2.getParamsCopy(), r12.getParamsCopy(), C382839eb.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_should_show_ig_detected_outcomes_nux", AnonymousClass7TE.A1C()).setMaxToleratedCacheAgeMs(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT).setFreshCacheAgeMs(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT).setEnsureCacheWrite(false);
                    A012.ATL(C40121ASm.A00, new FSC(j6w, 8), ensureCacheWrite);
                }
            }
        }
    }

    public static final boolean A00(C39883ADf aDf) {
        1Av A002 = 1Au.A00(aDf.A01);
        return AnonymousClass7TG.A1a(A002, A002.A35, 1Av.A8a, 526);
    }
}

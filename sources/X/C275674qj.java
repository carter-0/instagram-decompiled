package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4qj  reason: invalid class name and case insensitive filesystem */
public final class C275674qj extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C275674qj(2Lk r7, int i) {
        super("story_ad_swipe_odml_startup_job", 772923945, i, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        A6Q a6q = (A6Q) userSession.A01(A6Q.class, new C41562AwU(userSession, 45));
        if (a6q.A00 == null) {
            a6q.A00 = 02m.A0p;
        }
        UserSession userSession2 = a6q.A01;
        C293475kn r5 = new C293475kn(userSession2);
        02m r0 = a6q.A00;
        if (r0 != null) {
            r0.markerStart(424087700);
        }
        02m r3 = a6q.A00;
        if (r3 != null) {
            r3.markerAnnotate(424087700, "use_case_name", r5.CCP());
        }
        02m r32 = a6q.A00;
        if (r32 != null) {
            r32.markerAnnotate(424087700, "use_case_version", r5.CCS());
        }
        0qQ.A0B(userSession2, 0);
        AD6 ad6 = (AD6) ((C3732594q) userSession2.A01(C3732594q.class, new C41562AwU(userSession2, 44))).A02.getValue();
        AnonymousClass40G ATg = new C258933zs(ad6.A01, ad6.A03.CCP()).ATg((OdinContext) null);
        02m r33 = a6q.A00;
        if (r33 != null) {
            r33.markerAnnotate(424087700, "feature_download_result", ATg.A02);
        }
        02m r34 = a6q.A00;
        if (r34 != null) {
            r34.markerAnnotate(424087700, TraceFieldType.FailureReason, ATg.A01);
        }
        for (FeatureData featureData : (List) ATg.A00) {
            a6q.A02.put(featureData.A03, Float.valueOf((float) featureData.A00));
        }
        02m r35 = a6q.A00;
        if (r35 != null) {
            r35.markerAnnotate(424087700, "available_features_count", a6q.A02.size());
        }
        for (Object next : 0sr.A1P(new String[]{"4275", "4276", "4277", "4278", "4279", "4280", "4281", "4300"})) {
            ConcurrentHashMap concurrentHashMap = a6q.A02;
            if (!concurrentHashMap.containsKey(next)) {
                concurrentHashMap.put(next, Float.valueOf(0.0f));
            }
        }
        02m r12 = a6q.A00;
        if (r12 != null) {
            r12.markerEnd(424087700, 2);
        }
    }
}

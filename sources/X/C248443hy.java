package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hy  reason: invalid class name and case insensitive filesystem */
public final class C248443hy extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248443hy(2Lk r7) {
        super("initPushTokenBackgroundRefresh", 1560068420, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r18 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r18.A04;
        AnonymousClass0eM r0 = AnonymousClass9D9.A00;
        0qQ.A0B(userSession, 0);
        0eg qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance == null) {
            qPLInstance = QuickPerformanceLoggerProvider.A01;
        }
        qPLInstance.markerStart(813775312);
        AnonymousClass0eM r17 = AnonymousClass9D9.A00;
        long j = ((0xa) r17.getValue()).getLong("REFRESH_PUSH_TOKEN_EXPERIMENT_EXPERIMENT_VERSION_PREF_KEY", 0);
        long A01 = 182.A01(0Tu.A06, userSession, 36607144430540309L);
        0xY AR4 = ((0xa) r17.getValue()).AR4();
        if (qPLInstance.isMarkerOn(813775312)) {
            MarkerEditor withMarker = qPLInstance.withMarker(813775312);
            0qQ.A0A(withMarker);
            withMarker.annotate("deviceExperimentVersion", j);
            withMarker.annotate("experimentVersion", A01);
            withMarker.markerEditingCompleted();
        }
        String A002 = AnonymousClass000.A00(1002);
        String A003 = AnonymousClass000.A00(1001);
        String A004 = AnonymousClass000.A00(1003);
        if ((A01 != 0 || j == 0) && A01 <= j) {
            qPLInstance.markerAnnotate(813775312, "skipped_reset_experiment", true);
        } else {
            qPLInstance.markerPoint(813775312, "reset_experiment_start");
            AR4.E5c("REFRESH_PUSH_TOKEN_EXPERIMENT_EXPERIMENT_VERSION_PREF_KEY", A01);
            AR4.ED3(A004);
            AR4.ED3("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY");
            AR4.ED3(A003);
            AR4.ED3(A002);
            qPLInstance.markerPoint(813775312, "reset_experiment_end");
        }
        if (!((0xa) r17.getValue()).contains("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY") || 0qQ.A0K(userSession.A06, ((0xa) r17.getValue()).getString("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY", "-1"))) {
            qPLInstance.markerAnnotate(813775312, "skipped_non_first_exposure", false);
            qPLInstance.markerPoint(813775312, "set_params_start");
            AR4.E5g("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY", userSession.A06);
            0Tu r5 = 0Tu.A04;
            0qQ.A08(r5);
            boolean A06 = 182.A06(r5, userSession, 36325669453509756L);
            AR4.E5T(A004, A06);
            long A012 = 182.A01(r5, userSession, 36607144430343698L);
            AR4.E5c(A002, A012);
            long A013 = 182.A01(r5, userSession, 36607144430278161L);
            AR4.E5c(A003, A013);
            if (qPLInstance.isMarkerOn(813775312)) {
                MarkerEditor withMarker2 = qPLInstance.withMarker(813775312);
                0qQ.A0A(withMarker2);
                withMarker2.annotate("should_refresh", A06);
                withMarker2.annotate(AnonymousClass000.A00(1749), A012);
                withMarker2.annotate("job_interval", A013);
                withMarker2.markerEditingCompleted();
            }
            qPLInstance.markerPoint(813775312, "set_params_end");
        } else {
            qPLInstance.markerAnnotate(813775312, "skipped_non_first_exposure", true);
        }
        AR4.apply();
        qPLInstance.markerEnd(813775312, 2);
        AnonymousClass9DB.A01.A00(r18.A01);
    }
}

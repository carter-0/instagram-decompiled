package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.58J  reason: invalid class name */
public final class AnonymousClass58J extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58J(2Lk r7, int i) {
        super("video_seek_startup_job", 1198825535, i, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        short s;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        if (RQ9.A01 == null) {
            RQ9.A01 = 02m.A0p;
        }
        AnonymousClass94P r3 = new AnonymousClass94P(userSession);
        02m r0 = RQ9.A01;
        if (r0 != null) {
            r0.markerStart(424087700);
        }
        02m r2 = RQ9.A01;
        if (r2 != null) {
            r2.markerAnnotate(424087700, "use_case_name", r3.CCP());
        }
        02m r22 = RQ9.A01;
        if (r22 != null) {
            r22.markerAnnotate(424087700, "use_case_version", r3.CCS());
        }
        int i = ((C298415tO) userSession.A01(C298415tO.class, new C41562AwU(userSession, 46))).A00.A00.getInt(002.A0T("p_video_seek", "prediction_score", '_'), -2);
        RQ9.A00 = i;
        02m r02 = RQ9.A01;
        if (r02 != null) {
            r02.markerAnnotate(424087700, "prediction_score", i);
        }
        int i2 = RQ9.A00;
        02m r23 = RQ9.A01;
        if (i2 < 0) {
            if (r23 != null) {
                r23.markerAnnotate(424087700, TraceFieldType.FailureReason, "prediction cache empty");
            }
            r23 = RQ9.A01;
            if (r23 != null) {
                s = 3;
            } else {
                return;
            }
        } else if (r23 != null) {
            s = 2;
        } else {
            return;
        }
        r23.markerEnd(424087700, s);
    }
}

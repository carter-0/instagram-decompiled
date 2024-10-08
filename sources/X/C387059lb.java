package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9lb  reason: invalid class name and case insensitive filesystem */
public final class C387059lb extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387059lb(2Lk r7, int i) {
        super("delayed_cta_odml_load_dwell_time", 1099678014, i, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        02m r1;
        short s;
        2Lk r12 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r12.A04;
        0qQ.A0B(userSession, 0);
        if (C39623A2n.A02 == null) {
            C39623A2n.A02 = 02m.A0p;
        }
        AnonymousClass94O r4 = new AnonymousClass94O(userSession);
        02m r0 = C39623A2n.A02;
        if (r0 != null) {
            r0.markerStart(424087700);
        }
        02m r2 = C39623A2n.A02;
        if (r2 != null) {
            r2.markerAnnotate(424087700, AnonymousClass000.A00(5360), r4.CCP());
        }
        02m r22 = C39623A2n.A02;
        if (r22 != null) {
            r22.markerAnnotate(424087700, "use_case_version", r4.CCS());
        }
        C2604745u r13 = ((C298405tN) userSession.A01(C298405tN.class, new C41562AwU(userSession, 36))).A00;
        AnonymousClass40G A002 = C39561A0d.A00(r13, "FOR_IMAGE_TYPE");
        C39623A2n.A00 = A002;
        ((Number) A002.A00).floatValue();
        AnonymousClass40G A003 = C39561A0d.A00(r13, "FOR_VIDEO_TYPE");
        C39623A2n.A01 = A003;
        ((Number) A003.A00).floatValue();
        02m r23 = C39623A2n.A02;
        if (r23 != null) {
            r23.markerAnnotate(424087700, "load_failure_reason_for_image", C39623A2n.A00.A01);
        }
        02m r24 = C39623A2n.A02;
        if (r24 != null) {
            r24.markerAnnotate(424087700, "load_failure_reason_for_video", C39623A2n.A01.A01);
        }
        if (C39623A2n.A00.A02 || C39623A2n.A01.A02) {
            r1 = C39623A2n.A02;
            if (r1 != null) {
                s = 2;
            } else {
                return;
            }
        } else {
            r1 = C39623A2n.A02;
            if (r1 != null) {
                s = 3;
            } else {
                return;
            }
        }
        r1.markerEnd(424087700, s);
    }
}

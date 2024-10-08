package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.37q  reason: invalid class name and case insensitive filesystem */
public final class C2374437q implements C2374237o {
    public final UserFlowLogger A00;
    public final UserSession A01;

    public static final long A00(AnonymousClass3Q2 r3, C2374437q r4) {
        return r4.A00.generateFlowId(51052545, 002.A0G(r3.A3t, ':', r3.A1T.A00()).hashCode());
    }

    public final void A01(AnonymousClass3Q2 r4, String str, String str2) {
        if (!r4.A5D && str2 != null) {
            this.A00.flowAnnotate(A00(r4, this), str, str2);
        }
    }

    public final void ABU(AnonymousClass3Q2 r5, int i) {
        if (!r5.A5D) {
            this.A00.flowAnnotate(A00(r5, this), "media_upload_session_index", i);
        }
    }

    public final void ABV(AnonymousClass3Q2 r5, int i) {
        if (!r5.A5D) {
            this.A00.flowAnnotate(A00(r5, this), "pending_media_tasks_count", i);
        }
    }

    public final void CjK(SJL sjl, AnonymousClass3Q2 r10) {
        if (!r10.A5D) {
            long A002 = A00(r10, this);
            A01(r10, Pxd.A00(703), sjl.A0H);
            A01(r10, Pxd.A00(709), sjl.A0I);
            A01(r10, "encoder_profile_name", sjl.A0K);
            UserFlowLogger userFlowLogger = this.A00;
            userFlowLogger.flowAnnotate(A002, "init_complete", sjl.A0U);
            userFlowLogger.flowAnnotate(A002, "bytes_int_transcode_file", sjl.A02);
            userFlowLogger.flowAnnotate(A002, "encoder_completed", sjl.A0T);
            userFlowLogger.flowAnnotate(A002, "used_media_composition", sjl.A0V);
        }
    }

    public final void Cjm(AnonymousClass3Q2 r4, String str, String str2) {
        if (!r4.A5D) {
            this.A00.flowMarkPoint(A00(r4, this), str, str2);
        }
    }

    public final void Cjn(AnonymousClass3Q2 r5, String str, String str2) {
        String A002 = AnonymousClass000.A00(640);
        if (!r5.A5D) {
            UserFlowLogger userFlowLogger = this.A00;
            if (userFlowLogger.isOngoingFlow(A00(r5, this))) {
                userFlowLogger.flowEndFail(A00(r5, this), A002, str2);
            }
        }
    }

    public C2374437q(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }
}

package X;

import android.os.Bundle;
import com.facebook.quicklog.PointEditor;
import com.instagram.bugreporter.source.BugReportSource;

/* renamed from: X.Orn  reason: case insensitive filesystem */
public final class C71846Orn implements C74547Pwg {
    public long A00;
    public final 1QP A01;

    public final void AVr(Integer num) {
        String str;
        0qQ.A0B(num, 0);
        1QP r3 = this.A01;
        if (r3.isOngoingFlow(this.A00)) {
            long j = this.A00;
            if (num.intValue() != 0) {
                str = "gdpr_back_exit";
            } else {
                str = "gdpr_decline";
            }
            r3.flowEndCancel(j, str);
        }
    }

    public final void AW2(BugReportSource bugReportSource, String str) {
        AnonymousClass7TF.A1H(bugReportSource, str);
        1QP r4 = this.A01;
        Long flowStartIfNotOngoingForMarker = r4.flowStartIfNotOngoingForMarker(396366232, str.hashCode(), bugReportSource.name(), false, -1);
        if (flowStartIfNotOngoingForMarker != null) {
            long longValue = flowStartIfNotOngoingForMarker.longValue();
            this.A00 = longValue;
            r4.flowAnnotate(longValue, "client_server_join_key", str);
            r4.flowAnnotate(longValue, "asl_session_id", 0LA.A01());
        }
    }

    public final void AVu(String str, String str2) {
        1QP r2 = this.A01;
        if (r2.isOngoingFlow(this.A00)) {
            r2.flowEndFail(this.A00, "upload_service_error", str2);
        }
    }

    public final void AVw() {
        1QP r2 = this.A01;
        if (r2.isOngoingFlow(this.A00)) {
            r2.flowEndSuccess(this.A00);
        }
    }

    public final void AVy(String str) {
        1QP r2 = this.A01;
        if (r2.isOngoingFlow(this.A00)) {
            r2.flowMarkPoint(this.A00, str);
        }
    }

    public final void AW0(String str, 0sP r5) {
        1QP r2 = this.A01;
        if (r2.isOngoingFlow(this.A00)) {
            PointEditor markPointWithEditor = r2.markPointWithEditor(this.A00, str);
            0qQ.A0A(markPointWithEditor);
            r5.invoke(markPointWithEditor);
            markPointWithEditor.markerEditingCompleted();
        }
    }

    public C71846Orn(0lg r2, long j) {
        this.A00 = j;
        this.A01 = AnonymousClass1QO.A00(r2);
    }

    public final Bundle E2f() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putLong("bug_reporter_user_flow_logger_v2_flow_id_extra", this.A00);
        return A0a;
    }
}

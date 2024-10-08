package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.Mjt  reason: case insensitive filesystem */
public final class C67197Mjt {
    public int A00;
    public final 02m A01 = C51965G9l.A0l();
    public final UserSession A02;

    public C67197Mjt(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        02m r4 = this.A01;
        r4.markerAnnotate(20125924, "inbox_fetch_attempted", i);
        r4.markerPoint(20125924, 002.A0c("inbox_fetch_", "_start", this.A00));
    }

    public final void A04(String str) {
        02m r2 = this.A01;
        r2.markerAnnotate(20125924, "cancel_reason", str);
        r2.markerEnd(20125924, 4);
    }

    public final void A05(String str) {
        02m r2 = this.A01;
        r2.markerAnnotate(20125924, TraceFieldType.FailureReason, str);
        r2.markerEnd(20125924, 3);
    }

    public static MarkerEditor A00(02m r2, 2EM r3, String str, String str2) {
        r2.markerStart(20125924);
        MarkerEditor withMarker = r2.withMarker(20125924);
        withMarker.annotate("start_reason", str);
        withMarker.annotate("inbox_mode", r3.A04);
        withMarker.annotate("inbox_type", C67312Mlm.A00(r3.A03));
        withMarker.annotate("account_type", str2);
        withMarker.annotate("thread_folder", C67317Mlr.A00(r3.A00));
        return withMarker;
    }

    public final void A02(2EM r5, C2611948q r6, String str) {
        String str2;
        boolean A1Y = C51970G9q.A1Y(r6);
        02m r2 = this.A01;
        if (r2.isMarkerOn(20125924, A1Y ? 1 : 0)) {
            A04(str);
        }
        this.A00 = A1Y;
        16V A0J = AnonymousClass0t1.A01.A01(this.A02).A0J();
        if (A0J != null) {
            str2 = A0J.A01;
        } else {
            str2 = null;
        }
        MarkerEditor A002 = A00(r2, r5, str, str2);
        A002.annotate("thread_filter", r6.A00);
        A002.annotate("inbox_fetch_attempted", A1Y);
        A002.markerEditingCompleted();
    }

    public final void A03(2EM r6, String str, Set set) {
        String str2;
        boolean A1Y = C51970G9q.A1Y(set);
        02m r4 = this.A01;
        if (r4.isMarkerOn(20125924, A1Y ? 1 : 0)) {
            A04(str);
        }
        this.A00 = A1Y;
        16V A0J = AnonymousClass0t1.A01.A01(this.A02).A0J();
        if (A0J != null) {
            str2 = A0J.A01;
        } else {
            str2 = null;
        }
        List A0Z = 00k.A0Z(00k.A0a(set));
        MarkerEditor A002 = A00(r4, r6, str, str2);
        A002.annotate("thread_filter", C66581MXm.A0w(",", A0Z));
        A002.annotate("inbox_fetch_attempted", A1Y);
        A002.markerEditingCompleted();
    }
}

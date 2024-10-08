package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.OSi  reason: case insensitive filesystem */
public final class C70935OSi {
    public final 02m A00 = 02m.A0p;

    public C70935OSi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
    }

    public static final void A00(C70935OSi oSi, String str, String str2, int i) {
        02m r2 = oSi.A00;
        r2.markerStart(77004801);
        r2.markerAnnotate(77004801, "num_ranking_results", i);
        r2.markerAnnotate(77004801, "ranking_delivery_point", str2);
        r2.markerAnnotate(77004801, TraceFieldType.RequestID, str);
        r2.markerEnd(77004801, 467);
    }
}

package X;

import com.facebook.quicklog.PointEditor;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5g4  reason: invalid class name and case insensitive filesystem */
public final class C290855g4 implements AnonymousClass0lh {
    public C290875g6 A00;
    public final UserSession A01;

    public C290855g4(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        if (this.A00 != null) {
            02m.A0p.markerEnd(135806945, 4);
            this.A00 = null;
        }
    }

    public static final void A00(C290855g4 r5) {
        C290875g6 r3 = r5.A00;
        if (r3 != null && !r3.A04 && !r3.A03) {
            PointEditor pointEditor = 02m.A0p.withMarker(135806945).pointEditor("network_fetch_end");
            List list = r3.A01;
            pointEditor.addPointData("is_successful", list.isEmpty()).addPointData("error_descriptions", (String[]) list.toArray(new String[0])).markerEditingCompleted();
            if (!list.isEmpty()) {
                r5.A03(false);
            }
        }
    }

    public static final void A01(C290855g4 r4) {
        if (182.A06(0Tu.A05, r4.A01, 36323126832802679L)) {
            02m.A0p.markerStart(135806945);
            r4.A00 = new C290875g6();
        }
    }

    public static final void A02(Boolean bool, String str, List list) {
        PointEditor pointEditor = 02m.A0p.withMarker(135806945).pointEditor(str);
        if (bool != null) {
            pointEditor.addPointData("is_successful", bool.booleanValue());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C290935gF r6 = (C290935gF) it.next();
            pointEditor.addPointData(002.A0R(r6.A03, "_num_res"), r6.A04.size()).addPointData(002.A0R(r6.A03, "_expires_in_secs"), TimeUnit.MILLISECONDS.toSeconds(r6.A01 - System.currentTimeMillis())).addPointData(002.A0R(r6.A03, "_request_id"), r6.A02);
        }
        pointEditor.markerEditingCompleted();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r0.A02.size() != 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r4) {
        /*
            r3 = this;
            X.5g6 r0 = r3.A00
            if (r0 == 0) goto L_0x001f
            if (r4 == 0) goto L_0x000f
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r2 = 2
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r2 = 3
        L_0x0010:
            X.5g6 r0 = r3.A00
            if (r0 == 0) goto L_0x001f
            X.02m r1 = X.02m.A0p
            r0 = 135806945(0x8183fe1, float:4.5815925E-34)
            r1.markerEnd(r0, r2)
            r0 = 0
            r3.A00 = r0
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290855g4.A03(boolean):void");
    }
}

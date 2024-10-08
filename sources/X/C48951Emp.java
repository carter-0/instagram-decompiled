package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Emp  reason: case insensitive filesystem */
public abstract class C48951Emp {
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.Vbz, java.lang.Boolean, java.lang.String, java.lang.Integer, X.4uI] */
    /* JADX WARNING: type inference failed for: r5v3 */
    public static final void A00(Context context, QP5 qp5, UserSession userSession) {
        ? r5;
        0sm A0E;
        Map A0B;
        long j;
        int i;
        String str;
        String str2 = qp5.A01;
        LinkedHashMap A06 = 0Yt.A06(AnonymousClass7TH.A0h("surface", qp5.A03, AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, qp5.A00), AnonymousClass7TE.A1L("flow", str2), AnonymousClass7TE.A1L("flow_id", qp5.A02)));
        if (0qQ.A0K(str2, "management_surface")) {
            r5 = 0;
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            BitSet A0w = DbS.A0w(1);
            0qQ.A0B(A06, 0);
            A1H.put("logging_data", A06);
            A0w.set(0);
            if (A0w.nextClearBit(0) >= 1) {
                A0E = 0Yt.A0E();
                A0B = 0Yt.A0B(A1H);
                j = 0;
                i = 719983200;
                str = "com.bloks.www.screen_query.ig_permissions.management_surface_screen";
            } else {
                throw DbT.A0n();
            }
        } else if (0qQ.A0K(str2, "removed_accounts")) {
            r5 = 0;
            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
            BitSet A0w2 = DbS.A0w(1);
            0qQ.A0B(A06, 0);
            A1H2.put("logging_data", A06);
            A0w2.set(0);
            if (A0w2.nextClearBit(0) >= 1) {
                A0E = 0Yt.A0E();
                A0B = 0Yt.A0B(A1H2);
                j = 0;
                i = 719983200;
                str = "com.bloks.www.screen_query.ig_permissions.management_surface.removed_accounts";
            } else {
                throw DbT.A0n();
            }
        } else {
            return;
        }
        C11844ShW shW = new C11844ShW(str, r5, "ig_permissions_first_screen_query", A0B, A0E, i, j, true);
        C307506Qj A00 = C48721Ej6.A00(userSession, false);
        WF5 wf5 = new WF5(r5, r5, r5, r5);
        0qQ.A0B(A00, 1);
        shW.A02(context, wf5, A00);
    }
}

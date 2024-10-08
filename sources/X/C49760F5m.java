package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.F5m  reason: case insensitive filesystem */
public abstract class C49760F5m {
    public static void A00(C48137EZf eZf, EZZ ezz, AnonymousClass0iw r6, UserSession userSession, String str, String str2, Map map, int i, int i2, boolean z) {
        0Aj A0e;
        int i3;
        C69454Nly nly;
        0wc A01 = AnonymousClass0kN.A01(r6, userSession);
        if (z) {
            A0e = AnonymousClass7TE.A0e(A01, "ig_block_action");
            i3 = 193;
        } else {
            A0e = AnonymousClass7TE.A0e(A01, "ig_unblock_action");
            i3 = 271;
        }
        1Ln r2 = new 1Ln(A0e, i3);
        r2.A00.A8k("action", Integer.valueOf(i));
        r2.A0Q("target_user_id", DbV.A0q(str));
        if (i2 == 0) {
            nly = C69454Nly.INSTAGRAM;
        } else {
            nly = C69454Nly.FACEBOOK;
        }
        r2.A0M(nly, "target_user_type");
        r2.A0R(TraceFieldType.RequestID, str2);
        r2.A0M(eZf, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r2.A0M(ezz, "surface");
        r2.A00.A9H("surface_data", map);
        r2.Cgf();
    }

    public static void A01(C48137EZf eZf, EZZ ezz, AnonymousClass0iw r6, UserSession userSession, String str, List list, Map map, int i) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_bulk_block_action");
        AnonymousClass7TE.A1W(A0e, "action", i);
        ArrayList A0v = DbS.A0v(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0v.add(DbV.A0q(AnonymousClass7TE.A18(it)));
        }
        A0e.AAe("target_user_id", A0v);
        A0e.AAJ(TraceFieldType.RequestID, str);
        DbS.A1F(eZf, A0e);
        A0e.A8M(ezz, "surface");
        A0e.A9H("target_user_type", map);
        A0e.Cgf();
    }
}

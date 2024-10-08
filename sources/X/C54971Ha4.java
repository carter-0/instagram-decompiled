package X;

import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ha4  reason: case insensitive filesystem */
public abstract class C54971Ha4 {
    public static final void A00(MediaControlEventSourceEnum mediaControlEventSourceEnum, MediaControlSurfaceEnum mediaControlSurfaceEnum, AnonymousClass0iw r10, UserSession userSession, 1Xj r12, String str, boolean z) {
        String str2;
        0qQ.A0B(str, 3);
        Integer A0l = C51967G9n.A0l(z ? 1 : 0);
        String id = r12.getId();
        if (id != null) {
            String mezqlToken = r12.A0C.getMezqlToken();
            String A0x = DbT.A0x(r12);
            String BkE = r12.A0C.BkE();
            String A0t = C51965G9l.A0t(r12);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            if (A0l.intValue() != 0) {
                str2 = "discover/media_positive_control_event_undo/";
            } else {
                str2 = "discover/media_positive_control_event/";
            }
            A0a.A0E = str2;
            A0a.A9m("m_pk", id);
            A0a.A0G(Py2.A00(), str);
            A0a.A0G("surface", mediaControlSurfaceEnum.A00);
            A0a.A0G("event_source", mediaControlEventSourceEnum.A00);
            A0a.A0G("inventory_source", A0t);
            A0a.A9m("recommendation_data", BkE);
            A0a.A0G("mezql_token", mezqlToken);
            A0a.A0G("ranking_info_token", A0x);
            DbX.A1M(A0a, "container_module", r10.getModuleName());
            1ES.A03(A0a.A0M());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

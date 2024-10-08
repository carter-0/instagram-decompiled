package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

public abstract class GTA {
    public static final C254523sc A01(UserSession userSession, AnonymousClass4DU r4, Reel reel, String str) {
        0qQ.A0B(reel, 0);
        C254523sc A04 = C254513sb.A04(reel, r4, 002.A0R("reel_", str));
        if (!reel.A15(userSession) && reel.A0A(userSession, 0).CWu()) {
            A04.A0G(userSession, reel.A0A(userSession, 0).A0b);
        }
        return A04;
    }

    public static final C254523sc A02(UserSession userSession, AnonymousClass4DU r3, C255773uh r4, String str) {
        C254523sc A04;
        DbZ.A0t(0, r4, r3, userSession);
        1Nv A09 = r4.A09();
        if (A09 instanceof 1Xj) {
            1Xj A092 = r4.A09();
            0qQ.A0C(A092, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            1Xj r1 = A092;
            C254523sc A0c = C51967G9n.A0c(userSession, r1, r3, str);
            0qQ.A0B(r1, 1);
            List<C255783ui> A3o = r1.A3o(AnonymousClass3WT.MEDIA);
            if (A3o == null || A3o.isEmpty()) {
                return A0c;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C255783ui r0 : A3o) {
                String str2 = r0.A1a;
                if (str2 != null) {
                    A1C.add(str2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0c.A7W = AnonymousClass7TE.A1D(A1C);
            return A0c;
        }
        if (A09 instanceof C278124wJ) {
            C278124wJ A093 = r4.A09();
            0qQ.A0C(A093, "null cannot be cast to non-null type com.instagram.model.iglive.broadcast.BroadcastImpression");
            C278124wJ r12 = A093;
            A04 = C254513sb.A04(r12, r3, str);
            A04.A0M(r12.A01);
        } else {
            A04 = C254513sb.A04(r4, r3, str);
        }
        0qQ.A0A(A04);
        return A04;
    }

    @Deprecated(message = "The method is used by [ReelViewerLogger] that is being slowly migrated over to ViewPoint.")
    public static final C254523sc A00(UserSession userSession, 1Nv r2, AnonymousClass4DU r3, String str) {
        AnonymousClass7TG.A1Q(r3, userSession);
        if (r2 instanceof C255773uh) {
            return A02(userSession, r3, (C255773uh) r2, str);
        }
        if (r2 instanceof Reel) {
            return A01(userSession, r3, (Reel) r2, str);
        }
        throw AnonymousClass7TE.A1B(C273654mx.A00(1397));
    }
}

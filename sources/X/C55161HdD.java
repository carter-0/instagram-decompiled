package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HdD  reason: case insensitive filesystem */
public abstract class C55161HdD {
    public static C21044XAx A00(UserSession userSession, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, List list, boolean z, boolean z2) {
        Object obj;
        if (z2) {
            AnonymousClass0kM A0M = DbY.A0M(userSession);
            A0M.A01 = "music_ads_audio_player";
            0wc A00 = A0M.A00();
            if (l != null) {
                long longValue = l.longValue();
                if (l2 != null) {
                    Long l5 = l4;
                    String str4 = str3;
                    obj = new IZ8(A00, l5, l3, str, str4, str2, list, longValue, l2.longValue(), z);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            obj = new Object();
        }
        return (C21044XAx) obj;
    }
}

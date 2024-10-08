package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ddr  reason: case insensitive filesystem */
public abstract class C46374Ddr {
    public static final 1OC A00(UserSession userSession, Integer num, String str, String str2, boolean z) {
        String str3;
        0qQ.A0B(userSession, 0);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("discover/chaining/");
        A0b.A9m("target_id", str);
        A0b.A0H("profile_chaining_check", z);
        A0b.A0Q(C334247ax.class, C334257ay.class);
        if (num != AnonymousClass05K.A0C) {
            switch (num.intValue()) {
                case 0:
                    str3 = "profile";
                    break;
                case 1:
                    str3 = "feed_su";
                    break;
                default:
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
            }
            A0b.A9m("module", str3);
        }
        if (str2 != null) {
            A0b.A9m("from_module", str2);
        }
        return A0b.A0M();
    }
}

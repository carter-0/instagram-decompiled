package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public abstract class ABO {
    public static final int A00(AnonymousClass8HJ r1) {
        0qQ.A0B(r1, 0);
        String str = r1.A00;
        if (str != null) {
            switch (str.hashCode()) {
                case -899450013:
                    if (str.equals("slowmo")) {
                        return 2131953956;
                    }
                    break;
                case 99838:
                    if (str.equals("duo")) {
                        return 2131953951;
                    }
                    break;
                case 3107365:
                    if (str.equals("echo")) {
                        return 2131953953;
                    }
                    break;
                case 3208383:
                    if (str.equals("hold")) {
                        return 2131953954;
                    }
                    break;
                case 3387192:
                    if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                        return 2131953955;
                    }
                    break;
                case 853620882:
                    if (str.equals("classic")) {
                        return 2131953950;
                    }
                    break;
                case 1081676587:
                    if (str.equals("rebound")) {
                        return 2131953952;
                    }
                    break;
            }
        }
        throw AnonymousClass7TE.A0w("Unsupported boomerang mode id.");
    }

    public static final ArrayList A01(Context context, UserSession userSession) {
        AnonymousClass7TG.A1N(context, userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (182.A06(0Tu.A05, userSession, 36320605687325340L)) {
            A1C.add(AnonymousClass8HJ.NONE);
        }
        A1C.addAll(0sr.A1P(new AnonymousClass8HJ[]{AnonymousClass8HJ.NORMAL, AnonymousClass8HJ.SLOWMO, AnonymousClass8HJ.DUO}));
        if (C305756Jk.A00(context)) {
            A1C.add(AnonymousClass8HJ.ECHO);
        }
        return A1C;
    }
}

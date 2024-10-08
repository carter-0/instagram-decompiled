package X;

import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* renamed from: X.6bP  reason: invalid class name and case insensitive filesystem */
public final class C310656bP extends Enum {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C310656bP[] A01;
    public static final C310656bP A02;

    static {
        C310656bP r0 = new C310656bP();
        A02 = r0;
        C310656bP[] r02 = {r0};
        A01 = r02;
        A00 = 0oU.A00(r02);
    }

    public C310656bP() {
        super("VIEWPOINT", 0);
    }

    public final String A00(UserSession userSession, AnonymousClass30Y r5) {
        int i;
        C255773uh r2 = (C255773uh) r5.A03;
        String ByO = r2.ByO(userSession);
        if (ByO != null) {
            i = ByO.hashCode();
        } else {
            i = 0;
        }
        return 002.A0R(Integer.toHexString(i), r2.A0j);
    }
}

package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.82M  reason: invalid class name */
public final class AnonymousClass82M implements AnonymousClass82N {
    public AnonymousClass82O A00 = AnonymousClass82O.NotDetermined;
    public final 1Ng A01;

    public AnonymousClass82M(UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = AnonymousClass1Nd.A00(userSession);
    }

    public final void Eqm(AnonymousClass82O r11, List list, List list2, List list3) {
        0qQ.A0B(r11, 0);
        if (this.A00 != r11) {
            this.A00 = r11;
            int ordinal = r11.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                        Eue(A00(r11, false));
                        return;
                    case 7:
                        List list4 = list;
                        if (list != null) {
                            List list5 = list2;
                            if (list2 != null) {
                                List list6 = list3;
                                if (list3 != null) {
                                    boolean z = true;
                                    if (list.size() <= 1) {
                                        z = false;
                                    }
                                    this.A01.A00(new C359188c9(AnonymousClass05K.A0C, A00(r11, z), (String) null, list4, list5, list6, 3000));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                CLT();
            }
        }
    }

    public final void Eud(String str) {
        0qQ.A0B(str, 0);
        this.A01.A00(new C359188c9(AnonymousClass05K.A01, (String) null, str, (List) null, (List) null, (List) null, 3000));
    }

    public final void Eue(String str) {
        0qQ.A0B(str, 0);
        this.A01.A00(new C359188c9(AnonymousClass05K.A00, str, (String) null, (List) null, (List) null, (List) null, 3000));
    }

    public final void CLT() {
        this.A01.A00(new C359188c9(AnonymousClass05K.A0N, (String) null, (String) null, (List) null, (List) null, (List) null, -1));
    }

    public static final String A00(AnonymousClass82O r1, boolean z) {
        switch (r1.ordinal()) {
            case 2:
                return "Find a face";
            case 3:
                return "Hold up a hand";
            case 4:
                return "Find a person";
            case 5:
                return "Find a friend";
            case 6:
                return "Stand in view";
            case 7:
                if (z) {
                    return "Find an image";
                }
                return "Find the image";
            case 8:
                return "Switch to back camera";
            default:
                return "";
        }
    }
}

package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Cox  reason: case insensitive filesystem */
public abstract class C45020Cox {
    public static final DHZ A00(UserSession userSession, CGR cgr, X9L x9l) {
        WSU A00;
        0qQ.A0B(userSession, 0);
        C45422Cw2 cw2 = new C45422Cw2(userSession, cgr, x9l);
        for (C45406Cvm cvm : cgr.A04) {
            0qQ.A0B(cvm, 0);
            if (!(cvm.A02 == null || (A00 = C45019Cow.A00(cw2.A02, cvm)) == null)) {
                List list = cw2.A07;
                if (!list.isEmpty()) {
                    WSU wsu = (WSU) list.get(list.size() - 1);
                    0qQ.A0B(wsu, 0);
                    Integer num = A00.A01;
                    if (num == AnonymousClass05K.A09 && wsu.A01 == num && 0qQ.A0K(wsu.A02, A00.A02)) {
                        WSU wsu2 = (WSU) list.get(list.size() - 1);
                        0qQ.A0B(wsu2, 0);
                        Integer num2 = wsu2.A01;
                        if (num2.intValue() == 17) {
                            throw new NullPointerException("mId");
                        }
                        throw new IllegalArgumentException(002.A0R("Unsupported PDP concatenated section type ", VHG.A00(num2)));
                    }
                }
                list.add(A00);
                Integer num3 = A00.A01;
                if (num3 == AnonymousClass05K.A0I) {
                    cw2.A01 = true;
                }
                if (num3 == AnonymousClass05K.A0H) {
                    cw2.A00 = true;
                }
            }
        }
        return new DHZ(cw2);
    }
}

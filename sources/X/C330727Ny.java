package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Ny  reason: invalid class name and case insensitive filesystem */
public abstract class C330727Ny {
    public static final String A00(C333517Zg r3, String str, C62320sa r5) {
        List BRZ;
        0qQ.A0B(r3, 2);
        if (str != null) {
            2Et r0 = (2Et) r5.invoke();
            if (r0 == null) {
                return null;
            }
            BRZ = r0.BRZ();
        } else {
            AnonymousClass7S7 C6l = r3.C6l();
            if (!C6l.CdE()) {
                return null;
            }
            BRZ = C6l.BRZ();
        }
        User user = (User) 00k.A0J(BRZ);
        if (user != null) {
            return user.getId();
        }
        return null;
    }
}

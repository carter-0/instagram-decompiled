package X;

import android.content.Context;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Tza  reason: case insensitive filesystem */
public abstract class C14628Tza {
    public static DUR A00(C255773uh r1) {
        if (r1 == null || !r1.CWu()) {
            return null;
        }
        1Xj r12 = r1.A0b;
        r12.getClass();
        if (r12.A0C.C0Z() == null) {
            return null;
        }
        List C0Z = r12.A0C.C0Z();
        0qQ.A0B(C0Z, 0);
        return (DUR) 00k.A0J(C0Z);
    }

    public static C19475WaN A01(Context context, User user, String str) {
        User user2 = user;
        user2.getClass();
        int[] iArr = C19475WaN.A03;
        AnonymousClass4Hy r2 = new AnonymousClass8YF(C18710Vyf.A00(), (User) null, (String) null, "", "", (String) null, (String) null, "", "", "", "", "", "", 0).A01;
        String upperCase = DbW.A0h(context, user2.B8Q(), 2131962835).toUpperCase(Locale.getDefault());
        0qQ.A0B(upperCase, 0);
        return new C19475WaN(C39574A0q.A00(r2, user2, (String) null, "", "", "DEFAULT", (String) null, "", str, "", "", upperCase, "", 0));
    }
}

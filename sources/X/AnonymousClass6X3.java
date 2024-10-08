package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6X3  reason: invalid class name */
public abstract class AnonymousClass6X3 extends C308916We {
    public final C255773uh A00;

    public final List A0A() {
        AnonymousClass6X2 r6 = (AnonymousClass6X2) this;
        List<User> A1Q = 0sr.A1Q(new User[]{r6.A06, r6.A05});
        ArrayList arrayList = new ArrayList(0Yv.A1E(A1Q, 10));
        for (User username : A1Q) {
            String string = r6.A00.getResources().getString(2131962809, new Object[]{username.getUsername()});
            0qQ.A07(string);
            arrayList.add(string);
        }
        return arrayList;
    }

    public AnonymousClass6X3(AnonymousClass0iw r1, UserSession userSession, C255773uh r3) {
        super(r1, userSession, r3);
        this.A00 = r3;
    }
}

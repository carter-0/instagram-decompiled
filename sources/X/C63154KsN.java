package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KsN  reason: case insensitive filesystem */
public abstract class C63154KsN {
    public static final C66540MVu A00(FragmentActivity fragmentActivity, AnonymousClass07Z r2, UserSession userSession, C279284yO r4, C3499582p r5) {
        2YN A0L;
        Class cls;
        AnonymousClass7TG.A0w(0, r4, userSession, r5);
        if (r4.equals(AnonymousClass9QA.A00)) {
            A0L = JTO.A0L(new C64323LZy(userSession, r5), fragmentActivity);
            cls = QDV.class;
        } else if (!(r4 instanceof AnonymousClass80O)) {
            return null;
        } else {
            A0L = JTO.A0L(new C64324LZz(fragmentActivity, r2, userSession), fragmentActivity);
            cls = C60322JjR.class;
        }
        return A0L.A00(cls);
    }
}

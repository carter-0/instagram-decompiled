package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cnh  reason: case insensitive filesystem */
public abstract class C44947Cnh {
    public static C42133BIn A00(User user, String str, String str2, String str3, List list) {
        AnonymousClass7TH.A0K();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((DS9) it.next()).FBO());
        }
        return new C42133BIn(user, (String) null, (String) null, str, str2, (String) null, str3, A0r);
    }
}

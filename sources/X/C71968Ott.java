package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ott  reason: case insensitive filesystem */
public final class C71968Ott implements C232262tL {
    public final User A00;
    public final List A01;

    public C71968Ott(User user, List list) {
        0qQ.A0B(user, 1);
        this.A00 = user;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C71968Ott ott = (C71968Ott) obj;
        String id = this.A00.getId();
        if (ott != null) {
            str = ott.A00.getId();
        } else {
            str = null;
        }
        if (0qQ.A0K(id, str)) {
            List<C53401GnY> list = this.A01;
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            for (C53401GnY gnY : list) {
                A0p.add(((1Xj) gnY.A02).getId());
            }
            List<C53401GnY> list2 = ott.A01;
            ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
            for (C53401GnY gnY2 : list2) {
                A0p2.add(((1Xj) gnY2.A02).getId());
            }
            if (!A0p.equals(A0p2)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

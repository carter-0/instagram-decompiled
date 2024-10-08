package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HXd  reason: case insensitive filesystem */
public abstract class C54895HXd {
    public static final C61080JwI A00(List list) {
        ImageUrl imageUrl;
        List<C2809354u> A0d = 00k.A0d(list, 3);
        ArrayList A0r = AnonymousClass7TG.A0r(A0d);
        for (C2809354u CCd : A0d) {
            User CCd2 = CCd.CCd();
            if (CCd2 != null) {
                imageUrl = CCd2.Bh3();
            } else {
                imageUrl = null;
            }
            A0r.add(imageUrl);
        }
        return new C61080JwI((List) A0r, 27);
    }
}

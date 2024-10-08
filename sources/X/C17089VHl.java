package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.VHl  reason: case insensitive filesystem */
public abstract class C17089VHl {
    public static final User A00(UserSession userSession, 1Xj r9, List list) {
        String shopRoutingUserId;
        User A0j;
        List Alu;
        AnonymousClass7TG.A1O(list, userSession);
        if (r9 == null || ((r9.A5D() && ((Alu = r9.A0C.Alu()) == null || (r9 = (1Xj) 00k.A0J(Alu)) == null)) || (shopRoutingUserId = r9.A0C.getShopRoutingUserId()) == null || (A0j = DbV.A0j(userSession, shopRoutingUserId)) == null)) {
            return ((Product) 00k.A0I(list)).A0B;
        }
        Parcelable.Creator creator = User.CREATOR;
        String id = A0j.getId();
        String username = A0j.getUsername();
        ImageUrl Bh3 = A0j.Bh3();
        return 1aC.A02(A0j.A03.BRp(), A0j.A03.BsB(), Bh3, (Boolean) null, Boolean.valueOf(A0j.isVerified()), AnonymousClass7TE.A0u(), id, (String) null, username);
    }
}

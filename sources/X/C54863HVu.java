package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HVu  reason: case insensitive filesystem */
public abstract class C54863HVu {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String str = (String) DbW.A0g(r13, 0);
        List list = r13.A00;
        String A0t = DbU.A0t(list, 1);
        String A0t2 = DbU.A0t(list, 2);
        FragmentActivity A04 = C308206Td.A04(r12);
        AnonymousClass0iw A08 = C308206Td.A08(r12);
        UserSession A0B = C308206Td.A0B(r12);
        SimpleImageUrl simpleImageUrl = User.A08;
        User A03 = 1aC.A03(DbS.A0V(""), str, "");
        if (A0t2 == null) {
            A0t2 = A08.getModuleName();
        }
        ITS its = new ITS(A0t2);
        C249713kF.A00.A0N(A04, A03.A03.BsB(), A0B, its, A0t, A0t2, "shopping_product_details_page", str, A03.A03.getUsername()).A05();
        return null;
    }
}

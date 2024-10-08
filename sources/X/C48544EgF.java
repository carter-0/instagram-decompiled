package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EgF  reason: case insensitive filesystem */
public abstract class C48544EgF {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        SecondaryTextContent secondaryTextContent;
        String str;
        String str2;
        List list = r13.A00;
        C276544tV r0 = (C276544tV) list.get(0);
        if (r0 == null) {
            1Kn.A02("IgBloksExtensions", "missing parameter: product in bk.action.ig.cxf.SendMessageToMerchant");
            return null;
        }
        C277014uI A0P = DbW.A0P(r13, 1);
        C276544tV r2 = (C276544tV) list.get(2);
        Product A01 = C18132Vm8.A01(r0);
        if (r2 != null) {
            String A0F = r2.A0F();
            List A0N = r2.A0N(35);
            secondaryTextContent = new SecondaryTextContent();
            secondaryTextContent.A00 = A0F;
            secondaryTextContent.A01 = A0N;
        } else {
            secondaryTextContent = null;
        }
        C307896Rx r10 = r12;
        UserSession A0Y = DbT.A0Y(r12);
        FragmentActivity A04 = C308206Td.A04(r10);
        AnonymousClass0iw A08 = C308206Td.A08(r10);
        0qQ.A0B(A0Y, 1);
        AnonymousClass7TF.A1C(A04, 2, A08);
        AnonymousClass37D A0i = DbT.A0i(A04);
        if (A0i != null) {
            Parcelable.Creator creator = User.CREATOR;
            User user = A01.A0B;
            ImageUrl imageUrl = null;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
                str2 = user.A03.getUsername();
            } else {
                str = null;
                str2 = null;
            }
            User user2 = new User(str, str2);
            if (user != null) {
                imageUrl = user.A03.Bh3();
            }
            user2.A0l(imageUrl);
            String A00 = C273654mx.A00(52);
            Bundle A0B = DbY.A0B("IgSessionManager.SESSION_TOKEN_KEY", A0Y.A05);
            A0B.putString(AnonymousClass000.A00(220), A00);
            A0B.putParcelable(AnonymousClass000.A00(432), A01);
            A0B.putString(AnonymousClass000.A00(908), C66579MXk.A00(36));
            C50398Fb6 fb6 = new C50398Fb6(A08, r10, A0P, A0Y, A01);
            if (secondaryTextContent != null) {
                A0B.putParcelable(AnonymousClass000.A00(433), secondaryTextContent);
            }
            A0i.A0J(C48839El1.A00(A0B, fb6, user2));
        }
        return null;
    }
}

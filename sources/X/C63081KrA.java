package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KrA  reason: case insensitive filesystem */
public abstract class C63081KrA {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        r13.A03(0);
        Object A03 = r13.A03(1);
        0qQ.A0C(A03, AnonymousClass000.A00(12));
        List list = (List) A03;
        boolean A01 = Q0A.A01(r13.A00());
        Object A032 = r13.A03(3);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A032;
        String str2 = (String) DbT.A0q(r13, "null cannot be cast to non-null type kotlin.String", 4);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object next : list) {
            0qQ.A0C(next, C66579MXk.A00(1010));
            AbstractMap abstractMap = (AbstractMap) next;
            Parcelable.Creator creator = User.CREATOR;
            Object obj = abstractMap.get("pk");
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = abstractMap.get(Dbp.A01());
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            User user = new User((String) obj, (String) obj2);
            Object obj3 = abstractMap.get("profile_pic_url");
            0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
            user.A0u((String) obj3);
            A0r.add(new BrandedContentTag(user, JTQ.A1W(abstractMap.get(AnonymousClass000.A00(4555))), JTQ.A1W(abstractMap.get("is_pending"))));
        }
        C309516Yo A00 = C49892FBu.A00(C308206Td.A04(r12), C308206Td.A0B(r12));
        A00.A0B((Bundle) null, LSU.A03((BrandedContentGatingInfoIntf) null, AnonymousClass7TF.A0j(str), str2, A0r, false, true, A01, false, false));
        A00.A04();
        return null;
    }
}

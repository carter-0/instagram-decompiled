package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public abstract class V96 {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        UserSession A0W = DbX.A0W(r13);
        FragmentActivity A04 = C308206Td.A04(r13);
        Object A00 = r14.A00();
        DbS.A1Y(A00);
        Locale locale = Locale.ROOT;
        AdsAPIInstagramPosition A002 = V70.A00(Pxf.A0n(locale, (String) A00));
        Object A03 = r14.A03(1);
        String A003 = AnonymousClass000.A00(12);
        0qQ.A0C(A03, A003);
        for (Object next : (List) A03) {
            0qQ.A0C(next, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModelBuilder");
            C276544tV r1 = (C276544tV) next;
            r1.A0O();
            r1.A0K(38);
            r1.A0K(36);
            r1.A0K(35);
            r1.A0K(40);
        }
        Object A032 = r14.A03(1);
        0qQ.A0C(A032, A003);
        List list = (List) A032;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object next2 : list) {
            0qQ.A0C(next2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C276544tV r7 = (C276544tV) next2;
            String A0H = r7.A0H();
            if (A0H == null) {
                A0H = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            A0r.add(new C61073JwB((Object) EnumHelper.A00(Pxf.A0n(locale, A0H), C16658Uyu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), r7.A0D(), r7.A0E(), r7.A0F(), 6));
        }
        LinkedHashMap A07 = 0Yt.A07(DbW.A1b(A002, new LME(A002, A0r)));
        A07.get(A002);
        W1Y.A00(A04, (LME) A07.get(A002), A0W);
        return null;
    }
}

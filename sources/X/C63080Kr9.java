package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Kr9  reason: case insensitive filesystem */
public abstract class C63080Kr9 {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Object A0e = DbW.A0e(r9);
        Object A03 = r9.A03(1);
        0qQ.A0C(A03, Pxd.A00(2));
        Map map = (Map) A03;
        if (!0qQ.A0K(A0e, "ig_ig_feed_cross_posting")) {
            return null;
        }
        UserSession A0W = DbX.A0W(r8);
        Context context = C308206Td.A09(r8).A00;
        Object obj = map.get("linked_id");
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get(Dbp.A01());
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        C64833Liv A00 = C63270KuF.A00(A0W);
        AnonymousClass7TF.A1B(str, 1, str2);
        C310336ap A0W2 = DbV.A0W();
        A0W2.A0D = DbW.A0h(context, str2, 2131963570);
        A0W2.A06();
        AnonymousClass7TF.A0D().postDelayed(new C66043M9c(A00, A0W2.A00(), str, str2), 1000);
        return null;
    }
}

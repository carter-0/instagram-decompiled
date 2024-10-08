package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.EfA  reason: case insensitive filesystem */
public abstract class C48477EfA {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        Object A0f = DbW.A0f(r6);
        FragmentActivity A04 = C308206Td.A04(r5);
        0lg A0B = C308206Td.A0B(r5);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("creator_user_id", A0f);
        C46649DiU A042 = C46649DiU.A04(C273654mx.A00(2179), A1E);
        IgBloksScreenConfig A0N = DbS.A0N(A0B);
        A0N.A0i = true;
        A0N.A0U = "";
        AnonymousClass3M3 A02 = C49891FBs.A02(A0N, A042);
        C358248ab A0X = DbS.A0X(A04);
        A0X.A05 = "In-App Purchase";
        A0X.A0q("Purchase successful?");
        A0X.A0c(new C50026FJl(2, (Object) A04, (Object) A0B, (Object) A02), "Yes");
        A0X.A0b(C50023FJi.A00(A04, 10), "No");
        DbT.A1V(A0X);
        return null;
    }
}

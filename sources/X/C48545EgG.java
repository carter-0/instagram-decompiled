package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.user.model.Product;

/* renamed from: X.EgG  reason: case insensitive filesystem */
public abstract class C48545EgG {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        C276544tV A0M = DbW.A0M(r8, 0);
        if (A0M == null) {
            1Kn.A02("IgBloksExtensions", "missing parameter: product in bk.action.ig.cxf.ShareProduct");
        } else {
            Product A01 = C18132Vm8.A01(A0M);
            UserSession A0Z = DbT.A0Z(r7);
            FragmentActivity A04 = C308206Td.A04(r7);
            AnonymousClass0iw A08 = C308206Td.A08(r7);
            0qQ.A0B(A0Z, 0);
            AnonymousClass7TF.A1B(A04, 1, A08);
            C49731F3w A07 = 1as.A04.A02.A07(new C50446Fbt(A08), A0Z, 2FW.A1Y);
            A07.A07.putParcelable(C66579MXk.A00(19), A01);
            DirectShareSheetFragment A00 = A07.A00();
            AnonymousClass37D A0i = DbT.A0i(A04);
            if (A0i != null) {
                A0i.A0J(A00);
                return null;
            }
        }
        return null;
    }
}

package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EiO  reason: case insensitive filesystem */
public abstract class C48677EiO {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String str;
        List list = r10.A00;
        if (list.size() == 0) {
            str = "";
        } else {
            str = (String) AnonymousClass7TE.A13(list);
        }
        UserSession A0Z = DbT.A0Z(r9);
        Fragment A0H = DbU.A0H(r9);
        FragmentActivity A04 = C308206Td.A04(r9);
        FragmentActivity A042 = C308206Td.A04(r9);
        C51079Fo9 fo9 = new C51079Fo9(DbS.A0O("quiet_mode"), A0Z, str);
        AnonymousClass7TE.A1Z(new MHC((Object) fo9, (Object) A0Z, (AnonymousClass4D7) null, 27), DbV.A0J(A0H));
        if (str == null) {
            str = "unknown";
        }
        C49848F9n.A00(A04, A042, A0Z, str);
        return null;
    }
}

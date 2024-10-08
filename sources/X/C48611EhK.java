package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.EhK  reason: case insensitive filesystem */
public abstract class C48611EhK {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        String str;
        Object A01 = r9.A01();
        if (A01 instanceof String) {
            str = (String) A01;
        } else {
            str = null;
        }
        FragmentActivity A04 = C308206Td.A04(r8);
        0lg A0B = C308206Td.A0B(r8);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("timezone_offset", String.valueOf(1G0.A00()));
        C46649DiU A042 = C46649DiU.A04(str, A1E);
        IgBloksScreenConfig A0N = DbS.A0N(A0B);
        A0N.A0U = A04.getResources().getString(2131962682);
        A0N.A0l = true;
        C46649DiU.A07(A04, A0N, A042);
        return null;
    }
}

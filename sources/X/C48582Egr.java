package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.Egr  reason: case insensitive filesystem */
public abstract class C48582Egr {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Object A03 = r8.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.bloks.datatypes.user.IgBloksUserAlienObject");
        User user = ((EtL) A03).A00;
        if (user == null) {
            1Kn.A02(C273654mx.A00(733), "Null user in user alien object");
            return null;
        }
        FragmentActivity A04 = C308206Td.A04(r7);
        AnonymousClass0iw A08 = C308206Td.A08(r7);
        AnonymousClass0aP A0B = C308206Td.A0B(r7);
        0qQ.A0C(A0B, AnonymousClass000.A00(36));
        C46413Dea.A08(A04, A08, C46413Dea.A02(A04, A08, A0B, user, (String) null, false));
        return null;
    }
}

package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.EhD  reason: case insensitive filesystem */
public abstract class C48604EhD {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        C277014uI A0P = DbW.A0P(r8, 1);
        0lg A0B = C308206Td.A0B(r7);
        FragmentActivity A04 = C308206Td.A04(r7);
        AnonymousClass6SN.A00 = new C51084FoE(r7, A0P);
        F3W A03 = IgFragmentFactoryImpl.A00().A03((String) r8.A01());
        A03.A0N = true;
        A03.A0U = true;
        A03.A0L = true;
        DbV.A0Y(A04, A03.A00(), A0B, ModalActivity.class, "single_media_feed").A0A(A04, 1001);
        return null;
    }
}

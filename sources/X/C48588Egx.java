package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Egx  reason: case insensitive filesystem */
public abstract class C48588Egx {
    public static Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        C270394gf r0;
        C277014uI A0P = DbW.A0P(r10, 1);
        boolean A1a = AnonymousClass7TE.A1a(r10.A00());
        0lg A0B = C308206Td.A0B(r9);
        AnonymousClass6SO.A01 = new C51071Fo1(r9, A0P);
        FragmentActivity A04 = C308206Td.A04(r9);
        Class<ModalActivity> cls = ModalActivity.class;
        F3W A03 = IgFragmentFactoryImpl.A00().A03((String) r10.A01());
        A03.A0N = true;
        A03.A0P = !A1a;
        if (A1a) {
            r0 = C270394gf.LIKES;
        } else {
            r0 = C270394gf.FEED_MEDIA;
        }
        A03.A04 = r0;
        DbV.A0Y(A04, A03.A00(), A0B, cls, "single_media_feed").A0A(A04, 1005);
        return null;
    }
}

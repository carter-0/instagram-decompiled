package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.7bd  reason: invalid class name and case insensitive filesystem */
public final class C334647bd implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334647bd(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2024633084);
        C240213Ka r5 = (C240213Ka) obj;
        int A032 = AnonymousClass0fD.A03(-1018270168);
        0qQ.A0B(r5, 0);
        1Xj r14 = r5.A01;
        C334537bS r1 = this.A00;
        UserSession userSession = r1.A0E;
        1Xj A1e = r14.A1e(userSession);
        Product product = r5.A02;
        Fragment fragment = r1.A01;
        I6Q.A00(fragment, userSession, A1e);
        boolean CcK = A1e.CcK();
        AnonymousClass4DU r10 = r1.A0G;
        if (CcK) {
            C18694Vws.A01(userSession, r14, A1e, r10, product);
        } else {
            W3r.A08(userSession, r14, r10, product, r5.A05, r5.A04);
        }
        WNN A0L = C249713kF.A00.A0L(fragment.requireActivity(), userSession, r10, product, "tags", (String) null);
        A0L.A02(A1e, Integer.valueOf(r14.A15(userSession)));
        A0L.A0Z = true;
        A0L.A0b = true;
        A0L.A08 = null;
        A0L.A05 = C55150Hcy.A00(A1e, product, r5.A00);
        A0L.A0a = true;
        WNN.A01(A0L);
        AnonymousClass0fD.A0A(842129996, A032);
        AnonymousClass0fD.A0A(-539071806, A03);
    }
}

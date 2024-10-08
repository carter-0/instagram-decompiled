package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wbw  reason: case insensitive filesystem */
public final class C19572Wbw implements C20924X4p {
    public final /* synthetic */ C15334Uaj A00;

    public C19572Wbw(C15334Uaj uaj) {
        this.A00 = uaj;
    }

    public final void DU9() {
        C249713kF r2 = C249713kF.A00;
        C15334Uaj uaj = this.A00;
        FragmentActivity requireActivity = uaj.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(uaj.A0G);
        String str = uaj.A0D;
        if (str == null) {
            0qQ.A0F("waterfallId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r2.A1D(requireActivity, A0l, str, EWE.STORE_FRONT_MENU_MANAGE_PRODUCTS.toString(), (String) null, (String) null, false, false, false);
        }
    }
}

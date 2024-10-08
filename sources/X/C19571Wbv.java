package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wbv  reason: case insensitive filesystem */
public final class C19571Wbv implements C20924X4p {
    public final /* synthetic */ C15341Uar A00;

    public C19571Wbv(C15341Uar uar) {
        this.A00 = uar;
    }

    public final void DU9() {
        C249713kF r2 = C249713kF.A00;
        C15341Uar uar = this.A00;
        FragmentActivity requireActivity = uar.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(uar.A0M);
        String str = uar.A08;
        if (str == null) {
            0qQ.A0F("waterfallId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r2.A1D(requireActivity, A0l, str, "multi_product_search", (String) null, (String) null, false, false, false);
        }
    }
}

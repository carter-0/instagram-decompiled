package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fj5  reason: case insensitive filesystem */
public final class C50825Fj5 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        C249713kF r0 = C249713kF.A00;
        UserSession userSession = this.A01;
        C50328FYi A0E = r0.A0E(userSession);
        0qQ.A07(A0E);
        if (2bg.A2K.A01(userSession, uri.toString())) {
            String queryParameter = uri.getQueryParameter("source");
            if (queryParameter != null) {
                boolean booleanQueryParameter = uri.getBooleanQueryParameter("show_product_row_tooltip", false);
                EXF exf = (EXF) EXF.A01.get(queryParameter);
                Fragment fragment = this.A00;
                if (exf == null) {
                    exf = EXF.A0X;
                }
                C324476zN.A0B(fragment, userSession, exf, uri.getQueryParameter("product_row_tooltip_string_override"), booleanQueryParameter);
            } else if (C367088qA.A01(userSession)) {
                C324476zN.A0B(this.A00, userSession, EXF.A0X, (String) null, true);
            } else {
                Fragment fragment2 = this.A00;
                FragmentActivity activity = fragment2.getActivity();
                if (activity != null) {
                    A0E.A00(fragment2, activity);
                }
                AnonymousClass0t1.A01.A01(userSession);
                FragmentActivity activity2 = fragment2.getActivity();
                if (activity2 != null) {
                    C324476zN.A0P(activity2, userSession, "product_tagging_dialog", "qp_product_shopping_dialog", true);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public C50825Fj5(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}

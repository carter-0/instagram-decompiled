package X;

import android.app.Dialog;
import com.instagram.android.R;

/* renamed from: X.Wnl  reason: case insensitive filesystem */
public final class C20246Wnl implements Runnable {
    public final /* synthetic */ C61363K4f A00;
    public final /* synthetic */ W0T A01;

    public C20246Wnl(C61363K4f k4f, W0T w0t) {
        this.A00 = k4f;
        this.A01 = w0t;
    }

    public final void run() {
        C61363K4f k4f = this.A00;
        Dialog dialog = k4f.A01;
        if ((dialog == null || !dialog.isShowing()) && !k4f.A0S) {
            C358248ab A0U = DbW.A0U(k4f);
            A0U.A0j(k4f.requireContext().getDrawable(R.drawable.ig_illustrations_illo_glasses_connection_refresh));
            A0U.A09(2131974040);
            A0U.A08(2131974039);
            A0U.A0I(new C18833W4v(20, this.A01, k4f), 2131956706);
            W5U.A01(A0U, k4f, 43, 2131968513);
            A0U.A04();
            Dialog A02 = A0U.A02();
            k4f.A01 = A02;
            if (A02 == null) {
                0qQ.A0F("currentPermissionsDialog");
                throw AnonymousClass00P.createAndThrow();
            } else {
                AnonymousClass0fN.A00(A02);
            }
        }
    }
}

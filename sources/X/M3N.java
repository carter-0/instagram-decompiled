package X;

import android.os.Bundle;
import com.instagram.igds.components.button.IgdsButton;

public final class M3N implements Runnable {
    public final /* synthetic */ K6N A00;

    public M3N(K6N k6n) {
        this.A00 = k6n;
    }

    public final void run() {
        K6N k6n = this.A00;
        IgdsButton igdsButton = k6n.A00;
        if (igdsButton == null) {
            0qQ.A0F("nextButton");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsButton.setLoading(false);
        C331157Pu A002 = C48943Emh.A00(DbX.A0i(k6n));
        if (A002 != null) {
            C331127Pr A0f = DbX.A0f(k6n.A01);
            A0f.A03();
            K6Q k6q = new K6Q();
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("is_new_user_activation_flow", true);
            k6q.setArguments(bundle);
            A002.A0F(k6q, A0f);
        }
    }
}

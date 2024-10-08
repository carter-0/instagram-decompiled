package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.T5q  reason: case insensitive filesystem */
public final class C12756T5q implements X6L {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ T8N A03;

    public C12756T5q(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, T8N t8n) {
        this.A03 = t8n;
        this.A02 = userSession;
        this.A00 = bundle;
        this.A01 = fragmentActivity;
    }

    public final void DED() {
        Bundle bundle = this.A00;
        String string = bundle.getString("bundle_param_route");
        if (string == null || !string.equals("BillingNexusIGRoute")) {
            T8N.A02(this.A01, this.A03);
            return;
        }
        T8N t8n = this.A03;
        T8N.A01(bundle, this.A01, this.A02, t8n);
    }

    public final void Doe(String str) {
        T8N t8n = this.A03;
        T8N.A01(this.A00, this.A01, this.A02, t8n);
    }
}

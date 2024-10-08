package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mif  reason: case insensitive filesystem */
public final class C67121Mif implements MSP {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public C67121Mif(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void D3J(String str) {
        SUL A0J = Dba.A0J(this.A00, this.A01, 2EG.A0e, str);
        A0J.A0S = "direct_bc_partnerships_inbox_header";
        A0J.A0A();
    }
}

package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.8wZ  reason: invalid class name and case insensitive filesystem */
public final class C370498wZ implements AnonymousClass91K {
    public final /* synthetic */ C66769McE A00;

    public C370498wZ(C66769McE mcE) {
        this.A00 = mcE;
    }

    public final void D9N() {
        C66769McE.A00(this.A00);
    }

    public final void DZL() {
        C66769McE mcE = this.A00;
        C66769McE.A00(mcE);
        if (mcE.A02) {
            C71137Odf.A03(C69483NmR.BANNER, mcE.A05, mcE.A00);
        }
    }

    public final void Di4() {
        C66769McE mcE = this.A00;
        C66769McE.A00(mcE);
        Bundle bundle = new Bundle();
        UserSession userSession = mcE.A05;
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("ODNC_USER_ROLE_KEY", "SENDER");
        bundle.putString(C66579MXk.A00(249), "BANNER");
        bundle.putBoolean(C66579MXk.A00(239), mcE.A02);
        bundle.putParcelable(C66579MXk.A00(216), 0B0.A00(mcE.A00));
        FragmentActivity fragmentActivity = mcE.A04;
        AnonymousClass6W8 A03 = AnonymousClass6W8.A03(fragmentActivity, bundle, userSession, ModalActivity.class, C273654mx.A00(61));
        A03.A08();
        A03.A0C(fragmentActivity);
        if (mcE.A02) {
            C71137Odf.A02(C69483NmR.BANNER, C69459Nm3.SENDER, userSession, mcE.A00);
        }
    }
}

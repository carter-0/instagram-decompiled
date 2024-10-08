package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class PFT implements C51928G7w {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C70272O0c A02;
    public final /* synthetic */ C71109Ocn A03;

    public final void DNf() {
    }

    public PFT(Fragment fragment, UserSession userSession, C70272O0c o0c, C71109Ocn ocn) {
        this.A03 = ocn;
        this.A02 = o0c;
        this.A01 = userSession;
        this.A00 = fragment;
    }

    public final void DZL() {
        this.A03.A05(1, 0);
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putSerializable("reachability_settings_upsell", C69453Nlx.UPSELL);
        DbT.A1L(fragment, DbV.A0Y(fragment.requireActivity(), requireArguments, userSession, ModalActivity.class, "direct_message_options"));
    }

    public final void Di4() {
        this.A03.A05(1, 1);
    }

    public final void onCancel() {
        this.A03.A05(1, 1);
    }
}

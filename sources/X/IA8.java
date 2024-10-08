package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class IA8 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2uE A00;

    public IA8(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1152890872);
        AnonymousClass2uE r0 = this.A00;
        Fragment fragment = r0.A0R;
        UserSession userSession = r0.A0T;
        String A2n = r0.A07().A2n();
        if (A2n != null) {
            1ES.A03(C56334Hwl.A01(fragment, userSession, A2n));
            AnonymousClass0fD.A0C(-214193380, A05);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

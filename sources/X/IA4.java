package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class IA4 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2uE A00;

    public IA4(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-361122847);
        AnonymousClass2uE r1 = this.A00;
        AnonymousClass4DU r6 = r1.A0X;
        UserSession userSession = r1.A0T;
        int i = r1.A01;
        C249763kK r0 = r1.A0a;
        if (r0 != null) {
            str = r0.getSessionId();
        } else {
            str = null;
        }
        C52086GEg.A0h(userSession, r6, "creator_unpick", "long_press_drop_down_menu", str, i);
        Fragment fragment = r1.A0R;
        1Xj A07 = r1.A07();
        AnonymousClass7TF.A1H(userSession, fragment);
        C52200GIr.A01(fragment, (1P0) null, userSession, A07, false);
        AnonymousClass0fD.A0C(-2000535436, A05);
    }
}

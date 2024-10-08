package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Set;

public final class FLS implements View.OnClickListener {
    public final /* synthetic */ C322756wM A00;

    public FLS(C322756wM r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(506062298);
        1Yy A01 = FC8.A01();
        C322756wM r0 = this.A00;
        FragmentActivity fragmentActivity = r0.A00;
        UserSession userSession = r0.A03;
        User user = r0.A04.A02.A0P.A0J;
        if (user != null) {
            String id = user.getId();
            Set set = C49280EsP.A00;
            A01.A04(fragmentActivity, userSession, (Boolean) null, (Boolean) null, id, "content_preview_activation_card");
            AnonymousClass0fD.A0C(1336462560, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-988044301, A05);
        throw A0y;
    }
}

package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FTh  reason: case insensitive filesystem */
public final class C50201FTh implements G5S {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ EES A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ UserSession A03;

    public C50201FTh(FragmentActivity fragmentActivity, EES ees, C307896Rx r3, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = ees;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void Deu(AnonymousClass3BQ r9, List list) {
        if (!list.isEmpty()) {
            boolean z = false;
            String id = DbZ.A0T(list, 0).getId();
            1Xj A0T = DbZ.A0T(list, 0);
            UserSession userSession = this.A03;
            User A2A = A0T.A2A(userSession);
            A2A.getClass();
            AnonymousClass3BQ r7 = r9;
            if (r9 == AnonymousClass3BQ.BUSINESS_INSIGHTS) {
                z = true;
            }
            this.A01.A00(new RectF(), this.A00, C308206Td.A08(this.A02), userSession, 1OP.A05(userSession).A0J(new 1Nr(A2A), id, list, z), r7);
        }
    }
}

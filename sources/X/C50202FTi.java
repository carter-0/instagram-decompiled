package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FTi  reason: case insensitive filesystem */
public final class C50202FTi implements G5S {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ EES A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ UserSession A04;

    public C50202FTi(FragmentActivity fragmentActivity, EES ees, C307896Rx r3, C276544tV r4, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = ees;
        this.A00 = fragmentActivity;
    }

    public final void Deu(AnonymousClass3BQ r14, List list) {
        if (!list.isEmpty()) {
            String id = DbZ.A0T(list, 0).getId();
            1Xj A0T = DbZ.A0T(list, 0);
            UserSession userSession = this.A04;
            User A2A = A0T.A2A(userSession);
            A2A.getClass();
            AnonymousClass3BQ r12 = r14;
            Reel A0J = 1OP.A05(userSession).A0J(new 1Nr(A2A), id, list, AnonymousClass7TF.A1W(r14, AnonymousClass3BQ.BUSINESS_INSIGHTS));
            C276544tV r1 = this.A03;
            C307896Rx r3 = this.A02;
            View A05 = r1.A05(r3.A03);
            int[] iArr = new int[2];
            if (A05 != null) {
                A05.getLocationOnScreen(iArr);
            }
            EES ees = this.A01;
            float f = (float) iArr[0];
            float f2 = (float) iArr[1];
            ees.A00(new RectF(f, f2, f, f2), this.A00, C308206Td.A07(C308206Td.A09(r3)), userSession, A0J, r12);
        }
    }
}

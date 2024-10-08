package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.4lk  reason: invalid class name and case insensitive filesystem */
public final class C272984lk implements View.OnClickListener {
    public final /* synthetic */ C252643pR A00;
    public final /* synthetic */ C243503Za A01;

    public C272984lk(C252643pR r1, C243503Za r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1019607965);
        1Yy A012 = FC8.A01();
        C252643pR r0 = this.A00;
        FragmentActivity fragmentActivity = r0.A02;
        if (fragmentActivity != null) {
            UserSession userSession = r0.A03;
            String id = this.A01.A0F.getId();
            Set set = C49280EsP.A00;
            A012.A04(fragmentActivity, userSession, false, true, id, AnonymousClass000.A00(4066));
            AnonymousClass0fD.A0C(-391574422, A05);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
        AnonymousClass0fD.A0C(-1539070417, A05);
        throw illegalArgumentException;
    }
}

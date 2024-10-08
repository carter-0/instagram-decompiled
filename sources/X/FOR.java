package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOR implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public FOR(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, FBQ fbq, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = fragmentActivity;
        this.A03 = r2;
        this.A05 = userSession;
        this.A06 = str;
        this.A01 = i;
        this.A04 = fbq;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        if (this.A00 != 0) {
            A052 = AnonymousClass0fD.A05(1760575992);
            FGZ.A01.A06((FragmentActivity) this.A02, (AnonymousClass0iw) this.A03, (UserSession) this.A05, (FBQ) this.A04, this.A06, this.A01, false);
            i = 975322671;
        } else {
            A052 = AnonymousClass0fD.A05(-916332040);
            FGZ.A01.A06((FragmentActivity) this.A02, (AnonymousClass0iw) this.A03, (UserSession) this.A05, (FBQ) this.A04, this.A06, this.A01, true);
            i = 874295442;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}

package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class OH4 {
    public ViewGroup A00;
    public final int A01;
    public final Resources A02;
    public final OZD A03;
    public final C70498O8x A04;
    public final UserSession A05;

    public OH4(FragmentActivity fragmentActivity, UserSession userSession, C70498O8x o8x) {
        0qQ.A0B(o8x, 3);
        this.A05 = userSession;
        this.A04 = o8x;
        this.A02 = AnonymousClass7TF.A0A(fragmentActivity);
        Context applicationContext = fragmentActivity.getApplicationContext();
        this.A03 = O0R.A00(applicationContext);
        this.A01 = applicationContext.getColor(2Yu.A03(applicationContext));
    }
}

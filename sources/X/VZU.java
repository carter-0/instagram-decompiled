package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class VZU {
    public C246923fS A00;
    public final Context A01;
    public final C231672s5 A02 = new Object();
    public final C242923Ws A03;
    public final C252643pR A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2s5, java.lang.Object] */
    public VZU(Context context, FragmentActivity fragmentActivity, UserSession userSession, C242813Wa r13, 0Pl r14) {
        this.A01 = context;
        this.A03 = new C242923Ws(userSession, r13, r14, true);
        this.A04 = new C252643pR(context, fragmentActivity, userSession, r13, (C249763kK) null, (String) null, true, false);
    }
}

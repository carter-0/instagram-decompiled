package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class VZW {
    public final C242423Ua A00;
    public final C14044Tol A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.7Pq] */
    public VZW(Context context, UserSession userSession, AnonymousClass4DU r11) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r11;
        this.A00 = new MediaFrameLayout(context, (AttributeSet) null, 0);
        C14044Tol tol = new C14044Tol(context, userSession, new C252313ou(userSession, r11, (String) null, false), new Object(), "genericsurvey");
        this.A01 = tol;
        tol.A02();
    }
}

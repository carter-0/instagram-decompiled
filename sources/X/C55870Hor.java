package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Hor  reason: case insensitive filesystem */
public final class C55870Hor {
    public final C284945Oz A00;
    public final C284945Oz A01 = C51970G9q.A0S(C51967G9n.A0g());
    public final UserSession A02;
    public final MediaFrameLayout A03;
    public final C14044Tol A04;
    public final String A05;
    public final C331117Pq A06;
    public AnonymousClass4DM volumeKeyListener;

    public C55870Hor(Context context, C284945Oz r9, UserSession userSession, AnonymousClass4DU r11, MediaFrameLayout mediaFrameLayout, C62320sa r13, C62320sa r14) {
        C51974G9v.A1P(mediaFrameLayout, context, userSession, r11);
        0qQ.A0B(r9, 5);
        this.A03 = mediaFrameLayout;
        this.A02 = userSession;
        this.A00 = r9;
        String moduleName = r11.getModuleName();
        this.A05 = moduleName;
        C54509HGv hGv = new C54509HGv(this, r13, r14);
        this.A06 = hGv;
        C14044Tol tol = new C14044Tol(context, userSession, new C252313ou(userSession, r11, (String) null, false), hGv, moduleName);
        tol.A02();
        this.A04 = tol;
    }
}

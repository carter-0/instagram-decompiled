package X;

import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

/* renamed from: X.IDq  reason: case insensitive filesystem */
public final class C56819IDq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C57286IVv A00;
    public final /* synthetic */ C55852HoZ A01;

    public C56819IDq(C57286IVv iVv, C55852HoZ hoZ) {
        this.A00 = iVv;
        this.A01 = hoZ;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.A00.A02.getViewTreeObserver();
        0qQ.A07(viewTreeObserver);
        0nA.A0w(this, viewTreeObserver);
        C55852HoZ hoZ = this.A01;
        UserSession userSession = hoZ.A01;
        0Tu r4 = 0Tu.A06;
        if (182.A06(r4, userSession, 36312887633839496L) && !182.A06(r4, userSession, 36312887635281300L)) {
            hoZ.A00.postDelayed(new C57738Iff(hoZ), 200);
        }
    }
}

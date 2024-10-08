package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.L9c  reason: case insensitive filesystem */
public final class C63847L9c {
    public boolean A00;
    public final Rect A01 = AnonymousClass7TE.A0W();
    public final WeakReference A02;
    public final Map A03 = new WeakHashMap();
    public final Set A04 = DbS.A0y();
    public final UserSession A05;

    public C63847L9c(UserSession userSession, WeakReference weakReference) {
        this.A05 = userSession;
        this.A02 = weakReference;
        View view = (View) weakReference.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new LZ1(this, 0));
            }
        }
    }
}

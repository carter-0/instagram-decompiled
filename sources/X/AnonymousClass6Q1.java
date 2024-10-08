package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.lang.ref.WeakReference;

/* renamed from: X.6Q1  reason: invalid class name */
public final class AnonymousClass6Q1 implements AnonymousClass4HI {
    public 1Xj A00;
    public WeakReference A01;
    public final UserSession A02;

    public final String AWr() {
        1Xj r4;
        AndroidLink A012;
        WeakReference weakReference = this.A01;
        if (weakReference == null || weakReference.get() == null || (r4 = this.A00) == null || (A012 = AnonymousClass47K.A01((Context) weakReference.get(), this.A02, r4, r4.A3h(), false)) == null) {
            return null;
        }
        return C9759RgH.A00(A012);
    }

    public AnonymousClass6Q1(Context context, UserSession userSession, 1Xj r4) {
        WeakReference weakReference;
        if (context != null) {
            weakReference = new WeakReference(context);
        } else {
            weakReference = null;
        }
        this.A01 = weakReference;
        this.A00 = r4;
        this.A02 = userSession;
    }
}

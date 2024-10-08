package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7JA  reason: invalid class name */
public final class AnonymousClass7JA {
    public final WeakReference A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public AnonymousClass7JA(Context context, UserSession userSession, AnonymousClass7IG r4) {
        0qQ.A0B(r4, 2);
        0qQ.A0B(context, 3);
        this.A02 = new WeakReference(userSession);
        this.A01 = new WeakReference(r4);
        this.A00 = new WeakReference(context);
    }
}

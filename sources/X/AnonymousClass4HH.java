package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.lang.ref.WeakReference;

/* renamed from: X.4HH  reason: invalid class name */
public final class AnonymousClass4HH implements AnonymousClass4HI {
    public final AnonymousClass3W2 A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final WeakReference A03;

    public AnonymousClass4HH(Context context, AnonymousClass3W2 r3, UserSession userSession, 1Xj r5) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(userSession, 4);
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = userSession;
        this.A03 = new WeakReference(context);
    }

    public final String AWr() {
        AndroidLink A022;
        Context context = (Context) this.A03.get();
        if (context == null || (A022 = AnonymousClass47K.A02(context, this.A01, this.A02, this.A00.Alr(), false)) == null) {
            return null;
        }
        return C9759RgH.A00(A022);
    }
}

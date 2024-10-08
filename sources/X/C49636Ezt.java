package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ezt  reason: case insensitive filesystem */
public final class C49636Ezt {
    public AnonymousClass36V A00;
    public final Context A01;
    public final UserSession A02;
    public final G80 A03;
    public final C50348FZf A04;

    public C49636Ezt(Context context, UserSession userSession, G80 g80) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = g80;
        C50348FZf fZf = new C50348FZf(this, 6);
        this.A04 = fZf;
        this.A00 = AnonymousClass36R.A00(context, userSession, fZf);
    }
}

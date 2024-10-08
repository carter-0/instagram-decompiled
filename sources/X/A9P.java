package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class A9P {
    public boolean A00;
    public final Context A01;
    public final C347017w8 A02;
    public final UserSession A03;

    public abstract boolean A01();

    public final String A00() {
        if (this instanceof AnonymousClass9UZ) {
            return ((AnonymousClass9UZ) this).A01;
        }
        if (this instanceof C387219lr) {
            return AnonymousClass7TF.A0d(this.A01.getResources(), 2131974209);
        }
        return AnonymousClass7TE.A16(this.A01, 2131964065);
    }

    public A9P(Context context, UserSession userSession, C347017w8 r3) {
        this.A02 = r3;
        this.A03 = userSession;
        this.A01 = context;
    }
}

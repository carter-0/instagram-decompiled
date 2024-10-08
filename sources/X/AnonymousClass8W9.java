package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CancellationException;

/* renamed from: X.8W9  reason: invalid class name */
public final class AnonymousClass8W9 implements AnonymousClass81E {
    public C262204Co A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass8W7 A03;
    public final AnonymousClass8WC A04;

    public AnonymousClass8W9(AnonymousClass4DH r6, UserSession userSession, AnonymousClass8W7 r8) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(userSession, 3);
        this.A03 = r8;
        this.A01 = r6;
        this.A02 = userSession;
        this.A04 = (AnonymousClass8WC) new AnonymousClass8ZB(userSession).Bmt().A00(AnonymousClass8WC.class, new C377269Le(new AnonymousClass8WA(userSession), 16));
    }

    public final void A7M(Parcelable parcelable) {
        this.A00 = AnonymousClass8WD.A00(this.A01, 07U.A04, new C376889Js(this, (AnonymousClass4D7) null, 33));
    }

    public final Parcelable ANX() {
        C262204Co r1 = this.A00;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A00 = null;
        return null;
    }
}

package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CancellationException;

/* renamed from: X.8no  reason: invalid class name and case insensitive filesystem */
public final class C365868no implements AnonymousClass81E {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass8W7 A02;
    public final AnonymousClass8WC A03;
    public final 01W A04 = new 01W();

    public C365868no(AnonymousClass4DH r6, UserSession userSession, AnonymousClass8W7 r8) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(userSession, 3);
        this.A02 = r8;
        this.A00 = r6;
        this.A01 = userSession;
        this.A03 = (AnonymousClass8WC) new AnonymousClass8ZB(userSession).Bmt().A00(AnonymousClass8WC.class, new C377269Le(new AnonymousClass8WA(userSession), 15));
    }

    public final void A7M(Parcelable parcelable) {
        01W r5 = this.A04;
        AnonymousClass4DH r4 = this.A00;
        07U r3 = 07U.A04;
        r5.add(AnonymousClass8WD.A00(r4, r3, new C376889Js(this, (AnonymousClass4D7) null, 31)));
        r5.add(AnonymousClass8WD.A00(r4, r3, new C376889Js(this, (AnonymousClass4D7) null, 32)));
    }

    public final Parcelable ANX() {
        while (true) {
            01W r2 = this.A04;
            if (!(!r2.isEmpty())) {
                return null;
            }
            C262204Co r0 = (C262204Co) r2.removeFirst();
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
        }
    }
}

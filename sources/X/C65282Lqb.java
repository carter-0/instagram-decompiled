package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lqb  reason: case insensitive filesystem */
public final class C65282Lqb implements AnonymousClass7Hf {
    public final UserSession A00;
    public final AnonymousClass7IF A01;
    public final 1ua A02;
    public final Context A03;

    public final void AGW(C62812Kmo kmo) {
        if (kmo instanceof KRJ) {
            this.A02.A06((AnonymousClass0iw) null, ((KRJ) kmo).A01.A35, (String) null, false, true, true);
        }
    }

    public final void FMa(C62812Kmo kmo, DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 1);
        if (kmo instanceof KRJ) {
            Context context = this.A03;
            KRJ krj = (KRJ) kmo;
            Medium medium = krj.A00;
            AnonymousClass3Q2 r3 = krj.A01;
            AnonymousClass7IB.A00(context, this.A00, new C65266LqL(new L89(medium, this, directThreadKey, r3))).A04((C53401GnY) null, (MessageIdentifier) null, (C381779cJ) null, (Long) null, AnonymousClass7TE.A1I(new C60926Jtk(medium, r3)), false, false);
        }
    }

    public C65282Lqb(Context context, UserSession userSession, AnonymousClass7IF r3, 1ua r4) {
        this.A03 = context;
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
    }
}

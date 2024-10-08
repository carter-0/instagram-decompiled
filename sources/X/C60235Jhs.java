package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jhs  reason: case insensitive filesystem */
public final class C60235Jhs extends 2YL {
    public final UserSession A00;
    public final 2Dm A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final C63243Kto A04;

    public final boolean A00() {
        05G r1 = this.A02;
        if (!((C61082JwK) r1.getValue()).A01 || ((C61082JwK) r1.getValue()).A00 != AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    public C60235Jhs(UserSession userSession, C63243Kto kto, 2Dm r9) {
        AnonymousClass7TG.A1O(userSession, kto);
        0qQ.A0B(r9, 3);
        this.A00 = userSession;
        this.A04 = kto;
        this.A01 = r9;
        02z A10 = DbS.A10(new C61082JwK(false, (Integer) null, 3, (DefaultConstructorMarker) null, 21));
        this.A02 = A10;
        this.A03 = A10;
    }
}

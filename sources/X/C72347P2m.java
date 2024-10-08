package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2m  reason: case insensitive filesystem */
public final class C72347P2m implements C74394PuA {
    public final AnonymousClass0iw A00;
    public final 1a8 A01;
    public final C74449Pv4 A02;
    public final N4P A03;
    public final UserSession A04;
    public final C358618bC A05;
    public final boolean A06;

    public final List getItems() {
        int i = 2131959831;
        if (this.A03.A0D()) {
            i = 2131959832;
        }
        return AnonymousClass7TE.A1I(new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 20), this.A05, i, this.A06));
    }

    public final boolean isEnabled() {
        return AnonymousClass9HV.A00(this.A04).A00(this.A03.A0L, 27);
    }

    public C72347P2m(AnonymousClass0iw r1, 1a8 r2, UserSession userSession, C74449Pv4 pv4, N4P n4p, C358618bC r6, boolean z) {
        C51972G9s.A1B(userSession, r6);
        this.A04 = userSession;
        this.A03 = n4p;
        this.A06 = z;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = pv4;
        this.A00 = r1;
    }
}

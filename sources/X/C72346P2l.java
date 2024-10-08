package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* renamed from: X.P2l  reason: case insensitive filesystem */
public final class C72346P2l implements C74394PuA {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74449Pv4 A03;
    public final N4P A04;
    public final C254743sy A05;
    public final C358618bC A06;

    public final boolean isEnabled() {
        N4P n4p = this.A04;
        UserSession userSession = this.A02;
        C254743sy A08 = n4p.A08();
        if (!AnonymousClass9HV.A00(userSession).A00(n4p.A0L, 26) || !n4p.A0z || ((C66647MaG.A04(A08) == null && (A08 instanceof MsysThreadId) && !182.A06(0Tu.A05, userSession, 36312432364487787L)) || AnonymousClass48O.A02(n4p.A09))) {
            return false;
        }
        return true;
    }

    public C72346P2l(Context context, AnonymousClass0iw r2, UserSession userSession, C74449Pv4 pv4, N4P n4p, C358618bC r6, C254743sy r7) {
        C51974G9v.A1L(userSession, r7, r6);
        this.A02 = userSession;
        this.A05 = r7;
        this.A04 = n4p;
        this.A06 = r6;
        this.A01 = r2;
        this.A03 = pv4;
        this.A00 = context;
    }

    public final List getItems() {
        return AnonymousClass7TE.A1I(new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 19), this.A06, 2131959839, this.A04.A10));
    }
}

package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfw  reason: case insensitive filesystem */
public final class C19815Wfw implements XAF {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ V43 A02;
    public final /* synthetic */ 1WW A03;

    public C19815Wfw(FragmentActivity fragmentActivity, UserSession userSession, V43 v43, 1WW r4) {
        this.A03 = r4;
        this.A02 = v43;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        V43 v43 = this.A02;
        C15310UaH uaH = v43.A03;
        1OC A07 = C318486p2.A07(this.A01, v43.A01, 0qv.A00(this.A00), true);
        C15619Ufl.A00(A07, this, vc9, 13);
        uaH.schedule(A07);
        return null;
    }
}

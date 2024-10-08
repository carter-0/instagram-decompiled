package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfg  reason: case insensitive filesystem */
public final class C19799Wfg implements XAD {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ boolean AFU(C17678Vc9 vc9, Object obj) {
        V43 v43 = (V43) obj;
        if (vc9.A04 != null) {
            return true;
        }
        VT3 vt3 = v43.A02;
        if ((vt3 == null || vt3.A00 == null) && !C13990Tnq.A1a(v43.A07) && !C13990Tnq.A1a(v43.A06)) {
            return true;
        }
        F74.A00(this.A01, vc9.A07, AnonymousClass05K.A02);
        C358248ab r3 = new C358248ab((Activity) this.A00);
        r3.A09(2131972514);
        r3.A08(2131969965);
        r3.A0I(new W5R(3, (Object) this, (Object) vc9, (Object) v43), 2131972513);
        r3.A0H(new C18833W4v(11, this, vc9), 2131960798);
        DbT.A1V(r3);
        return false;
    }

    public C19799Wfg(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}

package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vgu  reason: case insensitive filesystem */
public final class C17841Vgu {
    public final X55 A00;
    public final AnonymousClass0eM A01;
    public final Fragment A02;

    public C17841Vgu(Fragment fragment, UserSession userSession, X55 x55, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(userSession, fragment);
        this.A02 = fragment;
        this.A00 = x55;
        TTV ttv = new TTV(userSession, str, str2, 0, z);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20693WxP(new C20693WxP(fragment, 16), 17));
        this.A01 = new C227862kA(new C20693WxP(A002, 18), ttv, new C20613Wvu(24, A002, (Object) null), new 0Yh(C60270JiR.class));
    }

    public final void A00() {
        DbV.A1F(this.A02.getViewLifecycleOwner(), ((C60270JiR) this.A01.getValue()).A00, new C20705Wxc(this, 39), 46);
    }
}

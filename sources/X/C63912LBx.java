package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LBx  reason: case insensitive filesystem */
public final class C63912LBx {
    public final C60640iu A00;

    public final void A00(String str, boolean z) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A0P;
        } else {
            num = AnonymousClass05K.A0a;
        }
        0xI A002 = C59882Jb5.A00(num);
        A002.A0C("filter_name", str);
        A002.A0C("selection_method", "touch");
        this.A00.EFq(A002);
    }

    public C63912LBx(UserSession userSession) {
        this.A00 = C60510iO.A00(userSession);
    }
}

package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wfo  reason: case insensitive filesystem */
public final class C19807Wfo implements XAF {
    public UserSession A00;

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        Integer num;
        V43 v43 = (V43) obj;
        v43.getClass();
        if (i == 1) {
            C15310UaH uaH = v43.A03;
            if (uaH.A00 == uaH.A01 - 1) {
                num = AnonymousClass05K.A0j;
            } else {
                num = AnonymousClass05K.A01;
            }
            F74.A00(this.A00, vc9.A07, num);
            C15310UaH uaH2 = v43.A03;
            C15310UaH.A00(uaH2, uaH2.A00 + 1);
            return v43;
        }
        C15310UaH uaH3 = v43.A03;
        C15310UaH.A00(uaH3, uaH3.A00 - 1);
        v43.A03.getChildFragmentManager().A0c();
        return v43;
    }
}

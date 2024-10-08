package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gx7  reason: case insensitive filesystem */
public final class C53963Gx7 extends C243963aQ {
    public static final 2WU A02 = G9t.A17(C56975IJt.A00);
    public final C54588HJx A00;
    public final UserSession A01;

    public final C244523bK A0X(C244463bE r9) {
        0qQ.A0B(r9, 0);
        int A0H = C51971G9r.A0H((List) C52149GGr.A00(r9, this.A00.A03));
        IKA ika = new IKA(A0H);
        AnonymousClass2WG A0f = C51969G9p.A0f(r9, A02, C58636Iv7.A00, new J6V(A0H, 16, (Object) r9, (Object) this));
        int A09 = C51969G9p.A09(r9, C244013aV.A0C(r9, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size)) + C51969G9p.A09(r9, C244013aV.A0A(r9));
        AnonymousClass3XV r0 = 2WX.A02;
        long A0B = C51969G9p.A0B();
        return C51965G9l.A0W(C51972G9s.A0S(C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, 0, A0B), 0, A0B), 0, C51969G9p.A0G(A09)), ika, A0f);
    }

    public C53963Gx7(UserSession userSession, C54588HJx hJx) {
        this.A00 = hJx;
        this.A01 = userSession;
    }
}

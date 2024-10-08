package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class OLB {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C67087Mi3 A03;

    public final void A00(C254703su r11, AnonymousClass2Ep r12, ON2 on2) {
        String A0f;
        UserSession userSession = this.A02;
        if (r11.A1e(userSession) || (r11.A10 == 2FW.A0y && r11.A1W())) {
            Context context = this.A00;
            AnonymousClass2Ep r7 = r12;
            User A04 = AnonymousClass48N.A04(userSession, r11, r12);
            if (A04 != null) {
                C68167N3h A022 = C271384il.A02(context, userSession, r11, A04, AnonymousClass48N.A06(r12));
                P3H p3h = new P3H(A022, on2);
                String A0g = r11.A0g();
                if (A0g != null && (A0f = r11.A0f()) != null) {
                    this.A03.A01(context, this.A01, p3h, A022, r7, A0g, A0f);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        C330377Mn r1 = on2.A03;
        C59689JTv.A0F(r1.A05, "failed_to_load_media_toast", 2131961944);
        C330377Mn.A00(r1);
    }

    public OLB(Context context, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = new C67087Mi3(userSession);
    }
}

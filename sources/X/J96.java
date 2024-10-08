package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class J96 extends 0Yg implements 0sL {
    public final /* synthetic */ C53372Gmw A00;
    public final /* synthetic */ C70832Wc A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ GHV A03;
    public final /* synthetic */ C54588HJx A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J96(C53372Gmw gmw, C70832Wc r3, 1Xj r4, GHV ghv, C54588HJx hJx, Integer num, String str) {
        super(2);
        this.A00 = gmw;
        this.A04 = hJx;
        this.A05 = num;
        this.A02 = r4;
        this.A03 = ghv;
        this.A01 = r3;
        this.A06 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C54588HJx hJx;
        Integer num;
        User user = (User) obj;
        0qQ.A0B(user, 0);
        C53372Gmw gmw = this.A00;
        if (!(gmw == null || (hJx = this.A04) == null || (num = this.A05) == null || num.intValue() <= 0 || 0qQ.A0K(C51966G9m.A11(this.A02), user))) {
            GHV ghv = this.A03;
            UserSession userSession = ghv.A06;
            if (!0qQ.A0K(AnonymousClass7TF.A0Q(userSession), user)) {
                Context A0K = C51969G9p.A0K(this.A01);
                int A09 = ghv.A05.A09();
                C55264Het.A00(A0K, gmw, userSession, user.Bh3(), hJx, this.A06, user.getUsername(), user.getId(), A09);
                return C60340gF.A00;
            }
        }
        this.A03.A09.invoke(user, obj2);
        return C60340gF.A00;
    }
}

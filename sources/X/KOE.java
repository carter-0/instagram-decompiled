package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

public final class KOE extends LSR {
    public final KO2 A00;
    public final Reel A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOE(UserSession userSession, KO2 ko2, String str, String str2) {
        super(ko2);
        Reel reel;
        0qQ.A0B(userSession, 2);
        this.A00 = ko2;
        this.A03 = str;
        this.A02 = str2;
        if (str2 != null) {
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A032 = ReelStore.A03(userSession);
            0qQ.A07(A032);
            reel = A032.A0M(str);
        } else {
            reel = null;
        }
        this.A01 = reel;
    }
}

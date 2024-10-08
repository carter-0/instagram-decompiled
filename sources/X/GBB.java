package X;

import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.common.session.UserSession;

public final class GBB extends C230372pW {
    public final AnonymousClass32Z A00;

    private final void A00(C267324bN r5) {
        OrganicCTAType AtT;
        String str;
        1Xj r1 = r5.A02;
        if (r1 != null) {
            String A002 = LLF.A00(r1.BR7().A00);
            AnonymousClass5HT BYk = r1.A0C.BYk();
            if (BYk != null && (AtT = BYk.AtT()) != null && (str = AtT.A00) != null) {
                this.A00.A00(A002, str, "reels");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C267324bN r1 = (C267324bN) obj;
        AnonymousClass7TG.A1N(r1, obj2);
        A00(r1);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r1 = (C267324bN) obj;
        AnonymousClass7TG.A1N(r1, obj2);
        A00(r1);
    }

    public GBB(UserSession userSession, String str) {
        super(C51972G9s.A0b(userSession));
        this.A00 = new AnonymousClass32Z(userSession, str);
    }
}

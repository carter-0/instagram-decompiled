package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PmZ  reason: case insensitive filesystem */
public final class C73955PmZ extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73955PmZ(UserSession userSession, C70626ODx oDx, int i, int i2, long j) {
        super(1);
        this.A00 = i2;
        this.A04 = oDx;
        this.A02 = j;
        this.A01 = i;
        this.A03 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C70626ODx oDx = (C70626ODx) this.A04;
            long j = this.A02;
            int i = this.A01;
            UserSession userSession = (UserSession) this.A03;
            return C72120Owf.A03(C72120Owf.A02(oDx.A00, new C73955PmZ(userSession, oDx, i, 0, j), 58), new C58749Iww(j, oDx, userSession, 6), 58).A0L(new C72120Owf((Long) obj2, 59));
        }
        C269794fh A002 = AnonymousClass6F9.A00("setIGE2EEEligibility");
        long j2 = this.A02;
        int i2 = this.A01;
        return 1aU.A07(new C72156OxG((AnonymousClass6AW) obj2, (UserSession) this.A03, (C70626ODx) this.A04, i2, j2), A002);
    }
}

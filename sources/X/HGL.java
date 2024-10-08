package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class HGL extends C243843aC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3Y5 A01;
    public final /* synthetic */ C334997cD A02;
    public final /* synthetic */ C53732GtN A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ HBL A05;

    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        HBL hbl = this.A05;
        if (hbl != null) {
            hbl.A09(this.A04, this.A00);
        }
        FollowStatus A0N = AnonymousClass2f1.A00(this.A03.A00).A0N(user);
        if (A0N == FollowStatus.A05 || A0N == FollowStatus.A07) {
            C334997cD r4 = this.A02;
            int i = this.A00;
            AnonymousClass3Y5 r2 = this.A01;
            r4.A01(AnonymousClass05K.A0C, i, C51969G9p.A07(r2, C244013aV.A06(r2)));
        }
    }

    public HGL(AnonymousClass3Y5 r1, C334997cD r2, C53732GtN gtN, User user, HBL hbl, int i) {
        this.A05 = hbl;
        this.A00 = i;
        this.A04 = user;
        this.A03 = gtN;
        this.A02 = r2;
        this.A01 = r1;
    }
}

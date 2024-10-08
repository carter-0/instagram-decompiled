package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gux  reason: case insensitive filesystem */
public final class C53830Gux extends C251343mx {
    public final 0sP A00;
    public final 0sL A01;
    public final 2WX A02;
    public final UserSession A03;
    public final C262754Fw A04;
    public final C56011HrJ A05;
    public final Integer A06;
    public final List A07;

    public final C251263mp A0X(AnonymousClass3Y5 r9) {
        0qQ.A0B(r9, 0);
        0sP A012 = AnonymousClass3j0.A01(r9, new J6H(this, 17));
        0sL A022 = AnonymousClass3j0.A02(r9, JGK.A01(this, 32));
        int intValue = this.A06.intValue();
        if (intValue == 0) {
            List list = this.A07;
            return new C53789GuI(this.A02, this.A04, this.A05, list, A012, A022);
        } else if (intValue == 1) {
            UserSession userSession = this.A03;
            List list2 = this.A07;
            return new C53955Gwz(this.A02, userSession, this.A04, this.A05, list2, A012, A022);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public C53830Gux(2WX r2, UserSession userSession, C262754Fw r4, C56011HrJ hrJ, Integer num, List list, 0sP r8, 0sL r9) {
        AnonymousClass7TG.A1Q(userSession, list);
        0qQ.A0B(hrJ, 5);
        this.A06 = num;
        this.A03 = userSession;
        this.A07 = list;
        this.A04 = r4;
        this.A05 = hrJ;
        this.A01 = r9;
        this.A00 = r8;
        this.A02 = r2;
    }
}

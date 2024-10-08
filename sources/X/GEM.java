package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;

public final class GEM extends AnonymousClass0T0 implements C59517JMp {
    public final C267324bN A00;
    public final 1Xj A01;
    public final AnonymousClass3W1 A02;
    public final SearchContext A03;
    public final User A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public GEM(C267324bN r2, 1Xj r3, AnonymousClass3W1 r4, SearchContext searchContext, User user, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        0qQ.A0B(num, 7);
        0qQ.A0B(searchContext, 8);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = user;
        this.A02 = r4;
        this.A07 = z;
        this.A0C = z2;
        this.A05 = num;
        this.A03 = searchContext;
        this.A06 = z3;
        this.A0B = z4;
        this.A08 = z5;
        this.A0A = z6;
        this.A09 = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GEM) {
                GEM gem = (GEM) obj;
                if (!(0qQ.A0K(this.A00, gem.A00) && 0qQ.A0K(this.A01, gem.A01) && 0qQ.A0K(this.A04, gem.A04) && 0qQ.A0K(this.A02, gem.A02) && this.A07 == gem.A07 && this.A0C == gem.A0C && this.A05 == gem.A05 && 0qQ.A0K(this.A03, gem.A03) && this.A06 == gem.A06 && this.A0B == gem.A0B && this.A08 == gem.A08 && this.A0A == gem.A0A && this.A09 == gem.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00));
        int A092 = AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A07(this.A04, A072) + AnonymousClass7TG.A0C(this.A02)) * 31));
        int intValue = this.A05.intValue();
        if (1 != intValue) {
            str = "BLUE";
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A03, C51971G9r.A0F(str, intValue, A092)))))));
    }
}

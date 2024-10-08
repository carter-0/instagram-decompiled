package X;

import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.common.session.UserSession;

public final class ILP implements JRH {
    public final TextPostAppHeaderFollowVariant A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final int AYv() {
        return 5;
    }

    public final boolean Akg() {
        return true;
    }

    public final boolean Akk() {
        return false;
    }

    public final boolean AxW() {
        return false;
    }

    public final int BPB() {
        return 30;
    }

    public final TextPostAppHeaderFollowVariant Bbf() {
        return this.A00;
    }

    public final boolean BvO() {
        return this.A02;
    }

    public final boolean Bvl() {
        return false;
    }

    public final boolean COq() {
        return this.A01;
    }

    public final boolean CX5() {
        return this.A03;
    }

    public final boolean Ca0() {
        return false;
    }

    public final boolean CaK() {
        return true;
    }

    public final boolean CbD() {
        return true;
    }

    public final boolean CdN() {
        return false;
    }

    public ILP(UserSession userSession) {
        0Tu r3 = 0Tu.A05;
        this.A03 = 182.A06(r3, userSession, 36321653659018866L);
        boolean z = true;
        182.A06(r3, userSession, 36322186234963953L);
        if (182.A06(r3, userSession, 36322186235029490L)) {
            182.A06(r3, userSession, 36322186235095027L);
        }
        this.A00 = TextPostAppHeaderFollowVariant.PRIMARY;
        this.A02 = 182.A06(r3, userSession, 36326524151936824L);
        if (!182.A06(r3, userSession, 36323985826262676L) && !182.A06(r3, userSession, 36328117584804810L)) {
            z = false;
        }
        this.A01 = z;
    }
}

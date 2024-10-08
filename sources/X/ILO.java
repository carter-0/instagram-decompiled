package X;

import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.common.session.UserSession;

public final class ILO implements JRH {
    public final boolean A00;
    public final /* synthetic */ ILP A01;

    public final int AYv() {
        return 5;
    }

    public final boolean Akg() {
        return this.A00;
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
        return this.A01.A00;
    }

    public final boolean BvO() {
        return this.A01.A02;
    }

    public final boolean Bvl() {
        return false;
    }

    public final boolean COq() {
        return this.A01.A01;
    }

    public final boolean CX5() {
        return false;
    }

    public final boolean Ca0() {
        return false;
    }

    public final boolean CaK() {
        return false;
    }

    public final boolean CbD() {
        return false;
    }

    public final boolean CdN() {
        return false;
    }

    public ILO(C53008Ggz ggz) {
        UserSession userSession = ggz.A07;
        this.A01 = new ILP(userSession);
        this.A00 = 182.A06(0Tu.A05, userSession, 36322796120517034L);
    }
}

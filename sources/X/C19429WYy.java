package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WYy  reason: case insensitive filesystem */
public final class C19429WYy implements X8U {
    public final /* synthetic */ C15357Ub9 A00;

    public C19429WYy(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void DED() {
        C15357Ub9 ub9 = this.A00;
        ub9.A00.A00.A01();
        C14227TsA.A00(ub9.A06);
        C59689JTv.A03(ub9.getContext(), DbV.A05(ub9).getString(2131974093), "onFeedRequestFail", 0);
    }

    public final void DF4(C16672Uz8 uz8, UY5 uy5, boolean z) {
        List A0o;
        C15357Ub9 ub9 = this.A00;
        ub9.A00.A00.A05();
        UserSession userSession = ub9.A02;
        List list = uy5.A03;
        if (list == null) {
            A0o = Collections.emptyList();
        } else {
            A0o = C13991Tnr.A0o(userSession, list);
        }
        if (z) {
            ub9.A08.A05(uz8);
        }
        ub9.A08.A06(uz8, A0o);
        ub9.A09.A00();
        if (z && ub9.mView != null) {
            ub9.A07.A02();
        }
    }

    public final void DQ5() {
        C14074TpO tpO = this.A00.A07;
        if (tpO != null) {
            C14074TpO.A00(tpO, false, true);
        }
    }

    public final void DQ8() {
        this.A00.A00.A00.A04();
    }
}

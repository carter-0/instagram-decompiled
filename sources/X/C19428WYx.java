package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.WYx  reason: case insensitive filesystem */
public final class C19428WYx implements X8U {
    public final /* synthetic */ C15693Ugy A00;

    public C19428WYx(C15693Ugy ugy) {
        this.A00 = ugy;
    }

    public final void DED() {
        C14227TsA.A00(this.A00.A03);
    }

    public final void DF4(C16672Uz8 uz8, UY5 uy5, boolean z) {
        Collection A0o;
        C15693Ugy ugy = this.A00;
        Map map = ugy.A0L;
        List A13 = C66580MXl.A13(uz8, map);
        if (A13 == null) {
            A13 = new ArrayList();
            map.put(uz8, A13);
        }
        if (z) {
            A13.clear();
        }
        UserSession userSession = ugy.A0I;
        List list = uy5.A03;
        if (list == null) {
            A0o = Collections.emptyList();
        } else {
            A0o = C13991Tnr.A0o(userSession, list);
        }
        A13.addAll(A0o);
        List A132 = C66580MXl.A13(uz8, map);
        C15693Ugy.A01(uz8, ugy, A132);
        if (A132 != null) {
            ugy.A05.A06(uz8, A132);
        }
    }

    public final void DQ5() {
        C14074TpO tpO = this.A00.A04;
        if (tpO != null) {
            C14074TpO.A00(tpO, false, true);
        }
    }

    public final void DQ8() {
        C14074TpO tpO = this.A00.A04;
        if (tpO != null) {
            C14074TpO.A00(tpO, true, true);
        }
    }
}

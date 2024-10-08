package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.PBp  reason: case insensitive filesystem */
public final class C72584PBp implements 2Er {
    public final AnonymousClass7SD A00;
    public final C254743sy A01;

    public final int AdN() {
        return 0;
    }

    public final C254403sQ Aie() {
        return null;
    }

    public final Boolean Amk() {
        return null;
    }

    public final AnonymousClass914 Amp() {
        return null;
    }

    public final boolean AqP() {
        return false;
    }

    public final String AsX() {
        return null;
    }

    public final ImageUrl Asd() {
        return null;
    }

    public final User Ash() {
        return null;
    }

    public final String Asi() {
        return null;
    }

    public final AnonymousClass9IV AtZ() {
        return null;
    }

    public final boolean Aud() {
        return false;
    }

    public final boolean Axj() {
        return false;
    }

    public final C272964li Axk() {
        return null;
    }

    public final C61081JwJ B7g(UserSession userSession) {
        return null;
    }

    public final boolean BAj() {
        return false;
    }

    public final boolean BBQ() {
        return false;
    }

    public final boolean BBy() {
        return false;
    }

    public final List BIp() {
        return null;
    }

    public final List BIq() {
        return null;
    }

    public final boolean BJ3() {
        return false;
    }

    public final List BJk() {
        return null;
    }

    public final List BJl() {
        return null;
    }

    public final C59832Ja7 BKp() {
        return null;
    }

    public final String BMX() {
        return null;
    }

    public final int BSK() {
        return -1;
    }

    public final Map BWN() {
        return null;
    }

    public final N49 BYB() {
        return null;
    }

    public final User BZK() {
        return null;
    }

    public final Boolean BZL() {
        return null;
    }

    public final String BZP() {
        return null;
    }

    public final List Bk5() {
        return null;
    }

    public final String BkK() {
        return null;
    }

    public final int Bpc() {
        return 0;
    }

    public final SmartSuggestion Bwx() {
        return null;
    }

    public final List BxY() {
        return null;
    }

    public final int C66() {
        return -1;
    }

    public final int C6a() {
        return 0;
    }

    public final Long CBk() {
        return null;
    }

    public final Integer CHO() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final List CHP() {
        return null;
    }

    public final boolean CJZ() {
        return false;
    }

    public final boolean CJt() {
        return false;
    }

    public final boolean COP() {
        return false;
    }

    public final boolean CVE() {
        return false;
    }

    public final boolean CVZ(UserSession userSession) {
        return false;
    }

    public final boolean CVa(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return false;
    }

    public final boolean CVb() {
        return false;
    }

    public final boolean CW5() {
        return false;
    }

    public final boolean Ca9() {
        return false;
    }

    public final boolean Car() {
        return false;
    }

    public final boolean CbG() {
        return false;
    }

    public final boolean CbX() {
        return false;
    }

    public final boolean CcG() {
        return false;
    }

    public final boolean Cez() {
        return false;
    }

    public final void EY1(boolean z) {
    }

    public final void EaA(boolean z) {
    }

    public final boolean isPending() {
        return false;
    }

    public final List AZs() {
        return this.A00.A0Z;
    }

    public final String Ayt(UserSession userSession) {
        return this.A00.A0U;
    }

    public final int BHS() {
        return this.A00.A1A ^ true ? 1 : 0;
    }

    public final C254743sy BJz() {
        return this.A01;
    }

    public final Integer BMT() {
        return AnonymousClass05K.A0N;
    }

    public final List BRZ() {
        return this.A00.A0b;
    }

    public final User BSJ() {
        AnonymousClass7SD r1 = this.A00;
        if (r1.A0r) {
            return null;
        }
        List list = r1.A0b;
        if (!list.isEmpty()) {
            return (User) AnonymousClass7TE.A13(list);
        }
        return null;
    }

    public final String BZM() {
        AnonymousClass7SD r1 = this.A00;
        if (r1.A0r) {
            return null;
        }
        List list = r1.A0b;
        if (!list.isEmpty()) {
            return ((User) AnonymousClass7TE.A13(list)).getFullName();
        }
        return null;
    }

    public final String BZN() {
        AnonymousClass7SD r1 = this.A00;
        if (r1.A0r) {
            return null;
        }
        List list = r1.A0b;
        if (!list.isEmpty()) {
            return ((User) AnonymousClass7TE.A13(list)).B8Q();
        }
        return null;
    }

    public final String C6C() {
        C254793t3 r0 = this.A00.A0P;
        if (r0 != null) {
            return String.valueOf(C66580MXl.A07(r0));
        }
        return null;
    }

    public final String C6f() {
        return this.A00.A0W;
    }

    public final String C6k() {
        Long l;
        MsysThreadId A06 = C66647MaG.A06(this.A01);
        if (A06 != null) {
            l = A06.A02;
        } else {
            l = null;
        }
        return String.valueOf(l);
    }

    public final boolean CUG() {
        return this.A00.A0r;
    }

    public final boolean CVr() {
        return this.A00.A0y;
    }

    public final boolean Ce4(String str) {
        return this.A00.A0Z.contains(str);
    }

    public C72584PBp(AnonymousClass7SD r1, C254743sy r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Boolean CSS() {
        return AnonymousClass7TE.A0u();
    }
}

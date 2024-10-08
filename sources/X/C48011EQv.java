package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.session.AbstractValueResolverImpl;
import java.util.List;

/* renamed from: X.EQv  reason: case insensitive filesystem */
public final class C48011EQv extends C64185LSs {
    public final 0tM A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48011EQv) {
                C48011EQv eQv = (C48011EQv) obj;
                if (!0qQ.A0K(this.A00, eQv.A00) || this.A01 != eQv.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C66419MQz A05() {
        return C50957Flk.A00;
    }

    public final Object A07(UserSession userSession, AbstractValueResolverImpl abstractValueResolverImpl, AnonymousClass4D7 r5) {
        boolean z = this.A01;
        0tM r0 = this.A00;
        if (z) {
            return r0.A01(userSession);
        }
        return r0.A00(userSession);
    }

    public final List A08() {
        return 0sn.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C48011EQv(0tM r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { ");
        0tM r1 = this.A00;
        A1A.append(r1.getConfigKey());
        A1A.append(", ");
        A1A.append(r1.getParamKey());
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}

package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3qj  reason: invalid class name and case insensitive filesystem */
public final class C253403qj implements C253333qc {
    public final C253413qk A00;

    public static final boolean A00(String str, String str2) {
        return 00k.A0k(00l.A0R(str, new String[]{","}, 0)).contains(str2);
    }

    public final boolean getBoolForContext(String str, String str2, boolean z) {
        UserSession userSession;
        0Tu r2;
        long j;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        if (str2.equals("shouldExecuteLiveQueryWithConfigId")) {
            userSession = this.A00.A00;
            r2 = 0Tu.A05;
            if (A00(182.A04(r2, userSession, 36879466831544589L), str)) {
                return false;
            }
            if (A00(182.A04(r2, userSession, 36879466832068881L), str)) {
                return true;
            }
            if (A00(182.A04(r2, userSession, 36879466831610126L), str)) {
                j = 36316516878455245L;
            } else if (A00(182.A04(r2, userSession, 36879466831675663L), str)) {
                j = 36316516878520782L;
            } else if (!A00(182.A04(r2, userSession, 36879466831741200L), str)) {
                return z;
            } else {
                j = 36316516878586319L;
            }
        } else if (!str2.equals("shouldEnableUnsetFieldRemoval")) {
            return z;
        } else {
            userSession = this.A00.A00;
            r2 = 0Tu.A05;
            j = 36314485363182193L;
        }
        return 182.A06(r2, userSession, j);
    }

    public final boolean getGlobalBool(String str, boolean z) {
        return z;
    }

    public final int getGlobalInt(String str, int i) {
        return i;
    }

    public final String getGlobalString(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        if (str.equals("kGraphQLLiveQuerySandboxUrl")) {
            return 1Ma.A01();
        }
        return str2;
    }

    public final String getStringForContext(String str, String str2, String str3) {
        0qQ.A0B(str3, 2);
        return str3;
    }

    public C253403qj(C253413qk r1) {
        this.A00 = r1;
    }
}

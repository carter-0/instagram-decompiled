package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;

/* renamed from: X.41q  reason: invalid class name and case insensitive filesystem */
public final class C2594241q implements C253333qc {
    public final UserSession A00;
    public final RealtimeClientConfig A01;

    public final boolean getBoolForContext(String str, String str2, boolean z) {
        return z;
    }

    public final boolean getGlobalBool(String str, boolean z) {
        0qQ.A0B(str, 0);
        if (str.equals("graphQLSubscriptionsDisableRetryStrategy")) {
            return 182.A06(0Tu.A05, this.A00, 36314408049248795L);
        } else if (str.equals(AnonymousClass000.A00(2297))) {
            return this.A01.isGqlsDebugLogEnable();
        } else {
            return z;
        }
    }

    public final int getGlobalInt(String str, int i) {
        0qQ.A0B(str, 0);
        if (str.equals(AnonymousClass000.A00(2296))) {
            return (int) this.A01.getGQLSSamplingWeight();
        }
        return i;
    }

    public final String getGlobalString(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        if (str.equals("graphQLSubscriptionsSandboxUrl")) {
            return 1Ma.A01();
        }
        return str2;
    }

    public final String getStringForContext(String str, String str2, String str3) {
        0qQ.A0B(str3, 2);
        return str3;
    }

    public C2594241q(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new RealtimeClientConfig(userSession);
    }
}

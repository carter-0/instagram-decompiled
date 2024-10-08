package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.7Wg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C332757Wg implements C61910qF, C332767Wh {
    public final /* synthetic */ AnonymousClass7TI A00;

    public C332757Wg(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final void AFb(String str, String str2, String str3, String str4, boolean z) {
        0qQ.A0B(str2, 1);
        AnonymousClass7TI r8 = this.A00;
        Set set = r8.A0I;
        if (!set.contains(new 0eP(str, str2))) {
            set.add(new 0eP(str, str2));
            UserSession userSession = r8.A0d;
            AnonymousClass0iw r2 = r8.A0V;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r2, 4);
            0wc A01 = AnonymousClass0kN.A01(r2, userSession);
            0Aj A002 = A01.A00(A01.A00, "direct_message_impression");
            A002.AAJ("send_type", str2);
            A002.AAJ("client_context", str4);
            A002.AAJ("message_id", str);
            A002.Cgf();
            if (z) {
                C333517Zg r0 = r8.A08;
                if (r0 == null) {
                    0qQ.A0F("clientInfra");
                    throw AnonymousClass00P.createAndThrow();
                }
                String A003 = AnonymousClass747.A00(r0);
                0wc A012 = AnonymousClass0kN.A01(r2, userSession);
                0Aj A004 = A012.A00(A012.A00, "direct_message_generic_xma_impression");
                A004.AAJ("send_type", str2);
                A004.AAJ("xma_content_type", str3);
                A004.AAJ("client_context", str4);
                A004.AAJ("message_id", str);
                A004.AAJ("open_thread_id", A003);
                if (A004.isSampled()) {
                    A004.Cgf();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C332767Wh) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(5, this.A00, AnonymousClass7TI.class, "shouldLogMessageImpressions", "shouldLogMessageImpressions(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

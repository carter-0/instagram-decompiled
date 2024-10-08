package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.DEc  reason: case insensitive filesystem */
public final class C45897DEc implements 1MD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C45897DEc(SIS sis, C11214SFo sFo, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = sis;
        if (i != 0) {
            this.A04 = str;
            this.A03 = str2;
        } else {
            this.A03 = str;
            this.A04 = str2;
        }
        this.A02 = sFo;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i = this.A00;
        AnonymousClass34S r3 = (AnonymousClass34S) obj;
        SIS sis = (SIS) this.A01;
        if (i != 0) {
            C10633RvS rvS = sis.A02;
            S4g s4g = (S4g) r3.A01;
            String str = this.A04;
            Object obj2 = r3.A00;
            obj2.getClass();
            String str2 = (String) obj2;
            String str3 = this.A03;
            Map unmodifiableMap = Collections.unmodifiableMap(((C11214SFo) this.A02).A08);
            UserSession userSession = rvS.A00;
            if (userSession != null) {
                String str4 = userSession.A06;
                try {
                    C45943DFx dFx = (C45943DFx) C41847B3o.A16(C45473Cx9.class);
                    QNI qni = new QNI();
                    C41848B3p.A1N(qni);
                    qni.A07(str4, "actor_id");
                    qni.A07(str2, "platform_trust_token");
                    qni.A07(str3, "authentication_ticket_id");
                    qni.A07(str, "payment_type");
                    qni.A07(C2818159r.A04(unmodifiableMap), "logging_id");
                    dFx.A00.A00(qni, "input");
                    dFx.A01 = true;
                    C8294Qna A002 = C8294Qna.A00(s4g, C41847B3o.A0t(), dFx.build(), new DGZ(6));
                    0qQ.A0A(A002);
                    return A002;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            } else {
                throw AnonymousClass7TE.A15("No user session found");
            }
        } else {
            C10633RvS rvS2 = sis.A02;
            Object obj3 = r3.A00;
            obj3.getClass();
            String str5 = this.A03;
            String str6 = this.A04;
            Collections.unmodifiableMap(((C11214SFo) this.A02).A08);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            QNI qni2 = new QNI();
            qni2.A07(UUID.randomUUID().toString(), "client_mutation_id");
            2IV r32 = new 2IV();
            String A003 = AnonymousClass000.A00(1798);
            r32.A09(str6, A003);
            qni2.A06(r32, "new_pin");
            2IV r33 = new 2IV();
            r33.A09(str5, A003);
            qni2.A06(r33, "password");
            qni2.A07((String) obj3, "platform_trust_token");
            A042.A00(qni2, "input");
            return C8294Qna.A00((S4g) r3.A01, rvS2.A01, new PandoGraphQLRequest(C41845B3m.A06(true), "IGResetPINWithPasswordMutation", A042.getParamsCopy(), A043.getParamsCopy(), C42873Bkt.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "payment_pin_update", AnonymousClass7TE.A1C()), DGS.A00);
        }
    }
}

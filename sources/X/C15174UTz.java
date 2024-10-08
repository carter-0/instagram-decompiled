package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.UTz  reason: case insensitive filesystem */
public final class C15174UTz extends TurnAllocationProxy {
    public final UserSession A00;

    public final void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback) {
        String str8 = str;
        0qQ.A0B(str8, 1);
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str2;
        C51974G9v.A1S(str13, str9, str10, str11, str12);
        String str14 = str7;
        TurnAllocationCallback turnAllocationCallback2 = turnAllocationCallback;
        AnonymousClass7TF.A1F(str14, 7, turnAllocationCallback2);
        UserSession userSession = this.A00;
        C15675Ugg ugg = new C15675Ugg(turnAllocationCallback2, 1);
        0qQ.A0B(userSession, 0);
        AnonymousClass0K0 r10 = GraphQlCallInput.A02;
        0Df A03 = C41845B3m.A03(r10, str8, "sensitive_string_value");
        0Df A02 = r10.A02();
        A02.A0E(A03, "turn_username");
        A02.A0E(C41845B3m.A03(r10, str13, "sensitive_string_value"), "turn_password");
        A02.A0E(C41845B3m.A03(r10, str9, "sensitive_string_value"), "session_key");
        0Df.A00(A02, Pxf.A0Z(str10), "version");
        0Df.A00(A02, str11, C66579MXk.A00(110));
        0Df.A00(A02, str12, "callee_id");
        0Df.A00(A02, str14, "call_id");
        C15622Ufo ufo = new C15622Ufo(ugg, 0);
        2IS r2 = new 2IS();
        1vm.A01(userSession).A06(JTS.A0G(new PandoGraphQLRequest(C41847B3o.A04(A02, r2, "request"), "IGMultiRelayDiscovery", r2.getParamsCopy(), new 2IS().getParamsCopy(), C15128UQr.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_multi_relay_discovery", new ArrayList())), ufo);
    }

    public final void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback) {
        String str5 = str3;
        String str6 = str4;
        String str7 = str;
        String str8 = str2;
        C51974G9v.A1P(str7, str8, str5, str6);
        TurnAllocationCallback turnAllocationCallback2 = turnAllocationCallback;
        0qQ.A0B(turnAllocationCallback2, 5);
        UserSession userSession = this.A00;
        C15675Ugg ugg = new C15675Ugg(turnAllocationCallback2, 0);
        0qQ.A0B(userSession, 0);
        2IV r5 = new 2IV();
        2IV r1 = new 2IV();
        r1.A09(str7, "sensitive_string_value");
        r5.A06(r1, "turn_username");
        2IV r12 = new 2IV();
        r12.A09(str8, "sensitive_string_value");
        r5.A06(r12, "turn_password");
        2IV r13 = new 2IV();
        r13.A09(str5, "sensitive_string_value");
        r5.A06(r13, "session_key");
        r5.A07(Pxf.A0Z(str6), "version");
        r5.A05("avoid_ips", 0sn.A00);
        C15621Ufn ufn = new C15621Ufn(ugg, 41);
        2IS r2 = new 2IS();
        1vm.A01(userSession).A06(JTS.A0G(new PandoGraphQLRequest(JTP.A0L(r5, r2, "request"), "IGTurnDiscovery", r2.getParamsCopy(), new 2IS().getParamsCopy(), C15133UQw.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_turn_discovery", new ArrayList())), ufn);
    }

    public C15174UTz(UserSession userSession) {
        this.A00 = userSession;
    }
}

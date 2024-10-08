package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class ELX extends C47529E6p {
    public static final String __redex_internal_original_name = "IgFxBaseFragment";
    public UserSession A00;
    public String A01;
    public String A02;

    public void onCreate(Bundle bundle) {
        String str;
        String A0g;
        int A022 = AnonymousClass0fD.A02(420437615);
        ELX.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A01 = DbU.A0l(requireArguments, "flow");
        String A002 = AnonymousClass000.A00(1653);
        this.A02 = requireArguments.getString(A002);
        UserSession userSession = this.A00;
        String str2 = this.A01;
        if (this instanceof ELW) {
            AnonymousClass7TG.A1N(userSession, str2);
            FG9.A00(userSession, "initial_async_controller_request_start", str2);
        }
        UserSession userSession2 = this.A00;
        boolean z = this instanceof ELV;
        if (z) {
            str = "com.bloks.www.fxim.sync.interop.async";
        } else {
            str = "com.bloks.www.fxcal.link.async";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        if (z) {
            A0g = 002.A0g("{server_params: {", 002.A0S("\"flow\":\"", this.A01, '\"'), "}}");
        } else {
            String A003 = ELW.A00("logging_event", "linking_flow_initiated");
            UserSession userSession3 = this.A00;
            0qQ.A06(userSession3);
            int A004 = F5u.A00(userSession3);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append('\"');
            A1A.append("cds_client_value");
            A1A.append("\":");
            A1A.append(A004);
            ArrayList A1D = AnonymousClass7TE.A1D(0sr.A1P(new String[]{A003, A1A.toString()}));
            String str3 = this.A01;
            if (str3 != null) {
                A1D.add(ELW.A00("flow", str3));
            }
            String str4 = this.A02;
            if (str4 != null) {
                A1D.add(ELW.A00(A002, str4));
            }
            A0g = 002.A0g("{server_params: {", TextUtils.join(",", A1D), "}}");
        }
        A1E.put("params", A0g);
        C360678ey A04 = C359988do.A04(userSession2, str, A1E);
        E84.A00(A04, this, 6);
        schedule(A04);
        AnonymousClass0fD.A09(1501295586, A022);
    }
}

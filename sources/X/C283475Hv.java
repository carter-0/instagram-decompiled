package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5Hv  reason: invalid class name and case insensitive filesystem */
public abstract class C283475Hv {
    public static final void A01(UserSession userSession, String str, long j, boolean z) {
        try {
            0wc A00 = new AnonymousClass0kM(userSession).A00();
            0Aj A002 = A00.A00(A00.A00, "mobile_config_sampled_access");
            A002.A9F("internal_sampling_rate", 50000L);
            A002.A7p("is_default_fallback", Boolean.valueOf(z));
            A002.AAJ("param_specifier", String.valueOf(j));
            A002.AAJ("client_value", str);
            A002.A9F("config_id", Long.valueOf((long) C63140yR.A00(j)));
            A002.A9F("param_id", Long.valueOf((long) 0UG.A00(j)));
            A002.Cgf();
        } catch (AnonymousClass0UC e) {
            0KC.A0M("QuickExperimentManagerFactoryImpl", AnonymousClass000.A00(2275), e, new Object[]{Long.valueOf(j)});
        }
    }

    public static final void A00(C60400gq r2, Object obj, Object obj2, String str, StringBuilder sb, long j) {
        Object valueOf;
        if (!obj2.equals(obj)) {
            sb.append(str);
            sb.append(" ");
        }
        if (obj instanceof Boolean) {
            valueOf = Boolean.valueOf(r2.Agx(j, true));
        } else if (obj instanceof Double) {
            valueOf = Double.valueOf(r2.Aye(j, -123.5d));
        } else if (obj instanceof String) {
            valueOf = r2.C1j(j, "__NVAL__");
            0qQ.A07(valueOf);
        } else {
            valueOf = Long.valueOf(r2.BOO(j, -2021));
        }
        if (!0qQ.A0K(obj, valueOf)) {
            sb.append(str);
            sb.append("_mc ");
        }
    }
}

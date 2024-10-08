package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

public final class FGS {
    public static final FGS A00 = new Object();

    public static final HashMap A00(ImmutableList immutableList, ImmutableList immutableList2) {
        EZT ezt;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (immutableList.size() == immutableList2.size()) {
            int size = immutableList2.size();
            for (int i = 0; i < size; i++) {
                Object obj = immutableList.get(i);
                0qQ.A07(obj);
                EZY ezy = (EZY) obj;
                int ordinal = ezy.ordinal();
                if (!(ordinal == 0 || ordinal == 1)) {
                    ezy = EZY.AVATAR;
                }
                Object obj2 = immutableList2.get(i);
                0qQ.A07(obj2);
                if (((C48128EWu) obj2).ordinal() == 1) {
                    ezt = EZT.FACEBOOK;
                } else {
                    ezt = EZT.INSTAGRAM;
                }
                A1E.put(ezy, ezt);
            }
        }
        return A1E;
    }

    public static final void A01(C48144EZm eZm, UserSession userSession, String str) {
        EZS ezs;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "fx_identity_product");
        A0e.AAJ("fx_im_logger_events", str);
        A0e.AAJ("flow_type", "business_reminders");
        A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
        String str2 = userSession.A06;
        A0e.A9F("initiator_account_id", AnonymousClass7TE.A10(str2));
        A0e.A8M(eZm, "type_of_reminder");
        HashMap A1E = AnonymousClass7TE.A1E();
        try {
            long parseLong = Long.parseLong(str2);
            16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
            if (16V.A06 == A0J) {
                ezs = EZS.IG_CREATOR;
            } else if (16V.A05 == A0J) {
                ezs = EZS.IG_BUSINESS;
            } else {
                0wb.A03("FxImLogger", AnonymousClass7TG.A0m(A0J, "UserAccountType expected to be MEDIA_CREATOR or BUSINESS, but got: ", AnonymousClass7TE.A1A()));
                A1E = null;
                A0e.A9H("target_identity_info", A1E);
                A0e.Cgf();
            }
            A1E.put(Long.valueOf(parseLong), ezs);
        } catch (NumberFormatException e) {
            0wb.A03("FxImLogger", AnonymousClass7TF.A0m("Error parsing userid to long: ", e));
            A1E = null;
        }
        A0e.A9H("target_identity_info", A1E);
        A0e.Cgf();
    }

    public static final void A02(C48144EZm eZm, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "fx_identity_product");
        A0e.AAJ("fx_im_logger_events", str);
        A0e.AAJ("flow_type", AnonymousClass000.A00(3877));
        A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
        A0e.A9F("initiator_account_id", AnonymousClass7TE.A10(userSession.A06));
        A0e.A8M(eZm, "type_of_reminder");
        A0e.Cgf();
    }

    public static final void A03(UserSession userSession, String str, String str2, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "fx_identity_product");
        if (A0e.isSampled()) {
            A0e.AAJ("fx_im_logger_events", str);
            A0e.AAJ("flow_type", str2);
            A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
            A0e.A9F("initiator_account_id", AnonymousClass7TE.A10(userSession.A06));
            A0e.A9F("target_identity_id", (Long) null);
            A0e.A9H("target_identity_resource_source_of_truth", map);
            A0e.Cgf();
        }
    }
}

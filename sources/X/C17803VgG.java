package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;

/* renamed from: X.VgG  reason: case insensitive filesystem */
public final class C17803VgG {
    public final 0wc A00;
    public final String A01;

    public final void A00(Boolean bool, String str, 0sn<C18043VkR> r8, boolean z, boolean z2) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_shopping_collection_search");
        if (A0e.isSampled()) {
            A0e.AAJ("product_search_context", "product_collection_picker");
            if (z) {
                str2 = RealtimeConstants.SEND_SUCCESS;
            } else {
                str2 = "failure";
            }
            A0e.AAJ("network_result", str2);
            A0e.AAJ("search_text", str);
            C13988Tno.A1C(A0e, this.A01);
            if (r8 == null) {
                r8 = 0sn.A00;
            }
            int i = 0;
            if (!(r8 instanceof Collection) || !r8.isEmpty()) {
                for (C18043VkR A02 : r8) {
                    if (VH2.A00(A02.A02()) == C16551Uwy.SECTION_TYPE_COLLECTION && (i = i + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            A0e.A9F("result_count", Long.valueOf((long) i));
            A0e.A7p("is_initial_load", Boolean.valueOf(z2));
            A0e.A7p("has_more_results", bool);
            A0e.Cgf();
        }
    }

    public C17803VgG(UserSession userSession, AnonymousClass4DU r3, String str) {
        AnonymousClass7TG.A1P(userSession, str);
        this.A01 = str;
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
    }
}

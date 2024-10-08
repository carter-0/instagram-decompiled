package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6eB  reason: invalid class name and case insensitive filesystem */
public final class C312296eB extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        1Xj r3 = (1Xj) obj;
        List list = (List) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(list, 1);
        A00(r3, list, false);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        1Xj r2 = (1Xj) obj;
        List list = (List) obj2;
        0qQ.A0B(r2, 0);
        0qQ.A0B(list, 1);
        A00(r2, list, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C312296eB(com.instagram.common.session.UserSession r2, X.AnonymousClass4DU r3) {
        /*
            r1 = this;
            X.2n4 r0 = X.C229232n3.A00(r2)
            X.2n5 r0 = r0.A00
            X.1Bk r0 = r0.A00
            X.0qQ.A07(r0)
            r1.<init>(r0)
            r1.A00 = r2
            r1.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C312296eB.<init>(com.instagram.common.session.UserSession, X.4DU):void");
    }

    private final void A00(1Xj r12, List list, boolean z) {
        1Ln A02;
        if (list.size() > 1) {
            UserSession userSession = this.A00;
            0bb r8 = new 0bb();
            r8.A06("prior_module", (String) list.get(0));
            r8.A06("submodule", (String) list.get(1));
            String str = (String) list.get(0);
            String str2 = (String) list.get(1);
            AnonymousClass4DU r10 = this.A01;
            0qQ.A0B(str, 3);
            0qQ.A0B(str2, 4);
            if (z) {
                0wc A012 = AnonymousClass0kN.A01(r10, userSession);
                A02 = new 1Ln(A012.A00(A012.A00, "instagram_shopping_story_cta_bar_sub_impression"), 321);
                if (A02.A00.isSampled()) {
                    String id = r12.getId();
                    if (id != null) {
                        A02.A0m(id);
                        A02.A0N(r8, "navigation_info");
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    return;
                }
            } else {
                0wc A013 = AnonymousClass0kN.A01(r10, userSession);
                0Aj A002 = A013.A00(A013.A00, "instagram_shopping_story_cta_bar_impression");
                if (A002.isSampled()) {
                    String id2 = r12.getId();
                    if (id2 != null) {
                        A002.AAJ("m_pk", id2);
                        A002.AAK(r8, "navigation_info");
                        A002.AAJ("cta_bar_type", "stories_view_shop");
                        A002.Cgf();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                A02 = 1Ln.A02(AnonymousClass0kN.A01(r10, userSession));
                if (A02.A00.isSampled()) {
                    A02.A0R("shopping_session_id", "");
                    A02.A0M(V1Z.CTA_BAR, "analytics_component");
                    A02.A0R("legacy_event_name", "instagram_shopping_story_cta_bar_impression");
                    A02.A0R("legacy_referral_surface", str);
                    A02.A0R("legacy_ui_component", str2);
                    A02.A0m(r12.getId());
                } else {
                    return;
                }
            }
            A02.A0R("cta_bar_type", "stories_view_shop");
            A02.Cgf();
        }
    }
}

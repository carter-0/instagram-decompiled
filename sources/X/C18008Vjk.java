package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Vjk  reason: case insensitive filesystem */
public final class C18008Vjk {
    public long A00;
    public 0wc A01;
    public String A02;
    public String A03;
    public String A04;
    public final EZO A05;

    public C18008Vjk(AnonymousClass0iw r7, UserSession userSession, EWI ewi, String str, String str2) {
        EZO ezo;
        0qQ.A0B(userSession, 1);
        this.A02 = str;
        this.A04 = str2;
        this.A01 = AnonymousClass0kN.A01(r7, userSession);
        EZO[] values = EZO.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ezo = EZO.UNKNOWN;
                break;
            }
            ezo = values[i];
            if (ezo.A00.equals(ewi.A00)) {
                break;
            }
            i++;
        }
        this.A05 = ezo;
    }

    public final void A00(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "voting_info_center_action");
        DbS.A1H(A0e, str);
        A0e.AAJ("action_type", "click");
        A0e.A8M(this.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A0e.AAJ("ig_media_id", this.A02);
        A0e.AAJ("utm_source", this.A04);
        A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A03);
        A0e.Cgf();
    }

    public final void A01(String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "voting_info_center_action");
        DbS.A1H(A0e, str);
        A0e.AAJ("action_type", "impression");
        A0e.A8M(this.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A0e.AAJ("ig_media_id", this.A02);
        A0e.AAJ("utm_source", this.A04);
        A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A03);
        if (z) {
            long j = this.A00;
            if (j != 0) {
                A0e.A9F("timespent_in_ms", Long.valueOf(System.currentTimeMillis() - j));
            }
        }
        A0e.Cgf();
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;

public final class FZR implements C250603lj {
    public final 0wc A00;
    public final UserSession A01;

    public FZR(0wc r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        Long l;
        AnonymousClass7TG.A1N(r7, r8);
        if (r8.CEk(r7) == AnonymousClass05K.A00) {
            IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = (IgxfbNetEgoCTABannerParams) r7.A03;
            UserSession userSession = this.A01;
            0wc r1 = this.A00;
            0qQ.A0A(igxfbNetEgoCTABannerParams);
            0qQ.A0B(igxfbNetEgoCTABannerParams, 2);
            0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_pymr_fb_banner_impression");
            if (A0e.isSampled()) {
                A0e.A9F("entity_id", 00y.A0n(10, userSession.A06));
                String str = igxfbNetEgoCTABannerParams.A02;
                Long l2 = null;
                if (str != null) {
                    l = 00y.A0n(10, str);
                } else {
                    l = null;
                }
                A0e.A9F("netego_type", l);
                String str2 = igxfbNetEgoCTABannerParams.A01;
                if (str2 != null) {
                    l2 = 00y.A0n(10, str2);
                }
                A0e.A9F("media_id", l2);
                A0e.Cgf();
            }
        }
    }
}

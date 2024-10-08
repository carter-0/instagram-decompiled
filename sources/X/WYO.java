package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.business.promote.model.PromoteData;

public final class WYO implements C358618bC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WYO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final boolean onToggle(boolean z) {
        String str;
        C16664Uz0 uz0;
        String str2;
        C16678UzE uzE;
        String str3;
        if (this.A00 != 0) {
            UZZ uzz = (UZZ) this.A02;
            PromoteData promoteData = uzz.A03;
            if (promoteData == null) {
                str2 = "promoteData";
            } else {
                InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) this.A01;
                0qQ.A0A(instagramProfileCallToActionDestinations);
                if (!z || !W3E.A00(instagramProfileCallToActionDestinations, promoteData)) {
                    promoteData.A24.remove(instagramProfileCallToActionDestinations);
                } else {
                    promoteData.A24.add(instagramProfileCallToActionDestinations);
                }
                UZZ.A00(uzz, z);
                uzz.A08 = z;
                str2 = "promoteLogger";
                WGU wgu = uzz.A01;
                if (z) {
                    if (wgu != null) {
                        uzE = C16678UzE.PROFILE_VISIT_SETTING;
                        str3 = "secondary_cta_toggle_opt_in";
                    }
                } else if (wgu != null) {
                    uzE = C16678UzE.PROFILE_VISIT_SETTING;
                    str3 = "secondary_cta_toggle_opt_out";
                }
                wgu.A0F(uzE, str3);
                return true;
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        WGU wgu2 = (WGU) this.A01;
        String obj = C16678UzE.AD_PREVIEW.toString();
        if (z) {
            str = "automatic_creative_optimization_toggle_button_opt_in";
        } else {
            str = "automatic_creative_optimization_toggle_button_opt_out";
        }
        wgu2.A0R(obj, str);
        PromoteData promoteData2 = (PromoteData) this.A02;
        if (z) {
            uz0 = C16664Uz0.OPT_IN;
        } else {
            uz0 = C16664Uz0.OPT_OUT;
        }
        promoteData2.A14 = uz0;
        return true;
    }
}

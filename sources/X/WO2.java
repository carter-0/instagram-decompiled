package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class WO2 implements AnonymousClass9FE {
    public final int A00;
    public final Object A01;

    public WO2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.A00) {
            case 0:
                C46478Dfh dfh = (C46478Dfh) obj;
                0qQ.A0B(dfh, 0);
                C15328Uac uac = (C15328Uac) this.A01;
                C375999Gd r2 = dfh.A00;
                if (r2 != null) {
                    str = r2.A00(C15328Uac.A00(), AnonymousClass7TE.A0l(uac.A0f));
                } else {
                    str = null;
                }
                uac.A0P = str;
                return;
            case 1:
                VVL vvl = (VVL) obj;
                0qQ.A0B(vvl, 0);
                C15328Uac uac2 = (C15328Uac) this.A01;
                C375999Gd r22 = vvl.A01;
                if (r22 != null) {
                    str2 = r22.A00(C15328Uac.A00(), AnonymousClass7TE.A0l(uac2.A0f));
                } else {
                    str2 = null;
                }
                uac2.A0L = str2;
                return;
            case 2:
                C46478Dfh dfh2 = (C46478Dfh) obj;
                0qQ.A0B(dfh2, 0);
                C15327Uab uab = (C15327Uab) this.A01;
                C375999Gd r23 = dfh2.A00;
                if (r23 != null) {
                    str3 = r23.A00(C15327Uab.A00(), AnonymousClass7TE.A0l(uab.A0I));
                } else {
                    str3 = null;
                }
                uab.A0B = String.valueOf(str3);
                return;
            case 3:
                VVL vvl2 = (VVL) obj;
                0qQ.A0B(vvl2, 0);
                C15327Uab uab2 = (C15327Uab) this.A01;
                C375999Gd r24 = vvl2.A01;
                if (r24 != null) {
                    str4 = r24.A00(C15327Uab.A00(), AnonymousClass7TE.A0l(uab2.A0I));
                } else {
                    str4 = null;
                }
                uab2.A07 = String.valueOf(str4);
                return;
            case 4:
                return;
            case 5:
                C18458Vs7 vs7 = (C18458Vs7) obj;
                PromoteData promoteData = ((C18784W1k) this.A01).A03;
                promoteData.A1R = vs7.A00;
                promoteData.A10 = new SimpleImageUrl(vs7.A01);
                return;
            default:
                C376009Ge r11 = (C376009Ge) obj;
                0qQ.A0B(r11, 0);
                U8N u8n = (U8N) this.A01;
                C375999Gd r25 = r11.A00;
                if (r25 != null) {
                    UserSession userSession = u8n.A01;
                    CallerContext A012 = CallerContext.A01("PromoteCampaignControlsViewModel");
                    0qQ.A0A(A012);
                    str5 = r25.A00(new AnonymousClass9JK(A012, "ig_android_promote_ads_manager_ig_to_fb_campaign_controls", "ads_manager", C16678UzE.ADS_MANAGER.toString(), "campaign_controls"), userSession);
                } else {
                    str5 = null;
                }
                u8n.A00 = str5;
                return;
        }
    }
}

package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9pH  reason: invalid class name and case insensitive filesystem */
public final class C389339pH extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C389339pH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DsC(AnonymousClass5Gv r5) {
        View view;
        switch (this.A00) {
            case 0:
                ((C358408ar) this.A02).A00 = null;
                return;
            case 1:
                ((AnonymousClass8I0) this.A02).A00 = false;
                return;
            case 3:
                C322356vh r3 = (C322356vh) this.A02;
                r3.A03 = null;
                r3.A00 = null;
                r3.A02 = null;
                r3.A05 = false;
                Runnable runnable = r3.A04;
                if (!(runnable == null || (view = r3.A01) == null)) {
                    view.removeCallbacks(runnable);
                }
                r3.A04 = null;
                return;
            case 5:
                ((GKU) this.A02).A00 = null;
                return;
            default:
                super.DsC(r5);
                return;
        }
    }

    public final void DsH(AnonymousClass5Gv r7) {
        switch (this.A00) {
            case 0:
                int A0M = AnonymousClass7TE.A0M(this.A01);
                C358408ar r4 = (C358408ar) this.A02;
                if (A0M != 0) {
                    0xa A0q = AnonymousClass7TE.A0q(r4.A03);
                    AnonymousClass7TG.A1M(A0q, "story_private_mention_reshare_tooltip_impression_count", A0q.getInt("story_private_mention_reshare_tooltip_impression_count", 0) + 1);
                } else {
                    1Av A002 = 1Au.A00(r4.A03);
                    AnonymousClass7TF.A1J(A002, A002.A3z, 1Av.A8a, 193, true);
                }
                r4.A01 = true;
                return;
            case 1:
                ((Number) this.A01).intValue();
                AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(((AnonymousClass8I0) this.A02).A04), "clips_nux_camera_tooltip_green_screen_count").apply();
                return;
            case 2:
                0xY A0p = AnonymousClass7TE.A0p((1Av) this.A01);
                A0p.E5T(C273654mx.A00(2108), true);
                A0p.apply();
                AnonymousClass818 r3 = AnonymousClass818.IG_CHANNELS_XPOSTING_TOOLTIP;
                AnonymousClass819 r2 = AnonymousClass819.TOOLTIP_XPOSTING_CHANNELS;
                C368288sN.A00(r3, C368278sM.VIEW, r2, (AnonymousClass81A) null, (UserSession) this.A02);
                return;
            case 3:
                ((C322386vk) this.A01).DsG(((C322356vh) this.A02).A07);
                return;
            case 4:
                UserSession userSession = ((C365738nb) this.A02).A07;
                0qQ.A0B(userSession, 0);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) this.A01, userSession), "instagram_smb_partner_flow_producer");
                A0e.A9F("igid", Long.valueOf(C49959FGr.A00(userSession)));
                A0e.AAJ("step", "story_postcapture_tooltip");
                A0e.AAJ("action", "view");
                A0e.AAJ(Dd6.A01(), AnonymousClass7TG.A0j());
                A0e.A7p("is_support_partner_enabled", Boolean.valueOf(C49959FGr.A08(userSession)));
                A0e.Cgf();
                return;
            default:
                ((C59596JPq) this.A01).Dka();
                return;
        }
    }
}

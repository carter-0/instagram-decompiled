package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.model.venue.Venue;
import com.instagram.save.api.SaveApiUtil;

public final class W9v implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public W9v(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }

    public final void onClick(View view) {
        int A05;
        String str;
        C243373Ym r3;
        int i;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        String str2;
        C243373Ym r32;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-1894774111);
                MediaMapPin mediaMapPin = (MediaMapPin) this.A02;
                boolean z = this.A03;
                LocationDetailFragment locationDetailFragment = ((C17772Vfj) this.A01).A00;
                W3Q A0F = Dba.A0F(locationDetailFragment);
                MediaMapQuery mediaMapQuery = locationDetailFragment.A02;
                if (z) {
                    str = "instagram_map_location_detail_tap_unsave";
                } else {
                    str = "instagram_map_location_detail_tap_save";
                }
                DbZ.A1a(mediaMapQuery, A0F, mediaMapPin, str);
                Venue A002 = C18231Vnv.A00(mediaMapPin.A09);
                if (z) {
                    r3 = C243373Ym.NOT_SAVED;
                } else {
                    r3 = C243373Ym.SAVED;
                }
                SaveApiUtil.A07(locationDetailFragment.requireContext(), AnonymousClass7TE.A0l(locationDetailFragment.A00), r3, A002, "discovery_map_location_detail");
                i = 773453640;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-1589610755);
                C15998Umf umf = (C15998Umf) this.A02;
                C16039UnS A0R = C13990Tnq.A0R(umf);
                String A022 = C15998Umf.A02(umf);
                boolean z2 = this.A03;
                LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) A0R.A0b.getValue();
                if (!(leadGenProfileContentInfo == null || (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) == null)) {
                    C16611Uy7 A003 = leadGenTrustSignalsPayload.A00();
                    String str3 = A003.A02;
                    if (str3 == null) {
                        str3 = A003.toString();
                    }
                    C18462VsB vsB = A0R.A0M;
                    if (z2) {
                        str2 = "business_profile_header_click";
                    } else {
                        str2 = "business_profile_header_click_disabled";
                    }
                    XB6.A00(C18462VsB.A00(vsB, A022, str3), vsB.A00, vsB.A01, "lead_gen_multi_step_consumer_questions", str2);
                }
                if (z2) {
                    String A023 = C15998Umf.A02(umf);
                    C13992Tns.A0c(C13991Tnr.A06(umf), umf);
                    Bundle bundle = new Bundle();
                    bundle.putAll(umf.mArguments);
                    bundle.putParcelable("arg_profile_content_info", (LeadGenProfileContentInfo) this.A01);
                    bundle.putString("arg_form_page_type", A023);
                    UZ6 uz6 = new UZ6();
                    uz6.setArguments(bundle);
                    C331127Pr r2 = new C331127Pr(((C16039UnS) umf.A0D.getValue()).A0H);
                    r2.A0T = new C19678Wdg(uz6, 0);
                    r2.A0U = new C19687Wdp(umf, A023, 0);
                    DbY.A13(umf, uz6, r2);
                }
                i = -564364794;
                break;
            default:
                A05 = AnonymousClass0fD.A05(372226781);
                Venue venue = (Venue) this.A02;
                if (this.A03) {
                    r32 = C243373Ym.NOT_SAVED;
                } else {
                    r32 = C243373Ym.SAVED;
                }
                C15357Ub9 ub9 = (C15357Ub9) this.A01;
                SaveApiUtil.A07(ub9.getContext(), ub9.A02, r32, venue, "feed_location");
                i = 1684212976;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}

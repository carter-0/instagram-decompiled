package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import java.util.ArrayList;
import java.util.Iterator;

public final class UZ6 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LeadAdsProfileContentBottomSheetFragment";
    public IgTextView A00;
    public final Rect A01 = new Rect();
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        C17361VSo vSo;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0a(view, R.id.profile_content_description);
        View A0G = AnonymousClass7TF.A0G(view, R.id.profile_content_header_image);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.profile_content_username);
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.profile_content_secondary_text);
        View A0G4 = AnonymousClass7TF.A0G(view, R.id.profile_content_tertiary_text);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        AnonymousClass7TE.A1Z(new C59700JUh(A0G2, viewLifecycleOwner, this, r6, view, A0G4, A0G3, A0G, (AnonymousClass4D7) null, 14), A002);
        C14774U8k u8k = (C14774U8k) this.A02.getValue();
        LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) u8k.A03.getValue();
        if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) != null && (vSo = u8k.A01) != null) {
            String str = u8k.A02;
            LeadGenTrustSignal[] leadGenTrustSignalArr = {leadGenTrustSignalsPayload.A00, leadGenTrustSignalsPayload.A02, leadGenTrustSignalsPayload.A01};
            0qQ.A0B(leadGenTrustSignalArr, 0);
            ArrayList A0S = 00k.A0S(leadGenTrustSignalsPayload.A05, 03t.A0I(leadGenTrustSignalArr));
            ArrayList arrayList = new ArrayList();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                LeadGenTrustSignal leadGenTrustSignal = (LeadGenTrustSignal) it.next();
                String str2 = leadGenTrustSignal.A02;
                if (!(str2 == null || str2.length() == 0)) {
                    C16611Uy7 uy7 = leadGenTrustSignal.A01;
                    String str3 = uy7.A02;
                    if (str3 != null || (str3 = uy7.toString()) != null) {
                        arrayList.add(str3);
                    }
                }
            }
            XB6 xb6 = vSo.A00;
            String str4 = vSo.A01;
            String A0P = 00k.A0P(",", "", "", arrayList, (0sP) null);
            Bundle bundle2 = new Bundle();
            if (str != null) {
                bundle2.putString("question_type", str);
            }
            bundle2.putString("pii_question_type", A0P);
            xb6.Cgq(bundle2, str4, "lead_gen_business_profile_content", "business_profile_bottom_sheet_impression", "impression");
        }
    }

    public static final void A00(IgTextView igTextView, String str) {
        if (igTextView != null) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            igTextView.setVisibility(i);
            igTextView.setText(str);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C14774U8k) this.A02.getValue()).A00;
    }

    public UZ6() {
        C20696WxS wxS = new C20696WxS(this, 20);
        AnonymousClass0eM A002 = C20696WxS.A00(new C20696WxS(this, 17), 0eO.A02, 18);
        this.A02 = new C227862kA(new C20696WxS(A002, 19), wxS, new C73666Phf(42, (Object) null, A002), new 0Yh(C14774U8k.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2023852818);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_profile_content_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(412133127, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1498705662);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(747268621, A022);
    }
}

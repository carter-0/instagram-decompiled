package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E0y  reason: case insensitive filesystem */
public final class C47406E0y extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectWellBeingUpsellBottomSheetFragment";
    public IgdsHeadline A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C73914Plp(this, 10));

    public final String getModuleName() {
        return "DIRECT_WELL_BEING_UPSELL_BOTTOM_SHEET";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgdsHeadline) view.findViewById(R.id.upsell_bottom_sheet_headerline);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) bundle2.getParcelable(AnonymousClass000.A00(900))) == null) {
            throw AnonymousClass7TE.A0y();
        }
        IgdsHeadline igdsHeadline = this.A00;
        if (igdsHeadline != null) {
            igdsHeadline.setHeadline((CharSequence) directWellBeingUpsellBottomSheetData.A08);
            String str = directWellBeingUpsellBottomSheetData.A06;
            if (str == null || directWellBeingUpsellBottomSheetData.A07 == null || directWellBeingUpsellBottomSheetData.A01 == null) {
                IgdsHeadline igdsHeadline2 = this.A00;
                if (igdsHeadline2 != null) {
                    igdsHeadline2.setBody((CharSequence) directWellBeingUpsellBottomSheetData.A05);
                }
            } else {
                SpannableStringBuilder A0C = DbS.A0C(directWellBeingUpsellBottomSheetData.A05);
                AnonymousClass7AV.A04(A0C, new C48053ESw(directWellBeingUpsellBottomSheetData, this, Dbb.A04(this)), str);
                IgdsHeadline igdsHeadline3 = this.A00;
                if (igdsHeadline3 != null) {
                    igdsHeadline3.setBody((CharSequence) A0C);
                }
            }
            IgdsHeadline igdsHeadline4 = this.A00;
            if (igdsHeadline4 != null) {
                igdsHeadline4.setImageResource(directWellBeingUpsellBottomSheetData.A00);
                return;
            }
        }
        0qQ.A0F("headline");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1980459723);
        0qQ.A0B(layoutInflater, 0);
        C47406E0y.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_upsell_bottom_sheet_content, viewGroup, false);
        AnonymousClass0fD.A09(625320540, A02);
        return inflate;
    }
}

package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H1T extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "CutoutStickerAttributionBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final Integer A01 = AnonymousClass05K.A0u;

    public final String getModuleName() {
        return "cutout_sticker_attribution_bottomsheet_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final Integer BkZ() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String string;
        Integer num;
        int A02 = AnonymousClass0fD.A02(1373465421);
        0qQ.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_attribution_bottom_sheet_fragment, viewGroup, false);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("media_id")) == null) {
            i = -359058315;
        } else {
            AnonymousClass0eM r3 = this.A00;
            1Xj A022 = DbX.A0d(r3).A02(string);
            if (A022 == null) {
                i = -842501926;
            } else {
                Bundle bundle3 = this.mArguments;
                if (bundle3 != null) {
                    z = bundle3.getBoolean("is_story", false);
                }
                DbT.A0I(inflate, R.id.cutout_sticker_attribution_recycler_view).setAdapter(new C53073Gi6(requireActivity(), getViewLifecycleOwner(), this, AnonymousClass7TE.A0l(r3), A022, H3S.A08.A00(requireContext(), AnonymousClass7TE.A0l(r3), A022, z), new C58142In8(this, 29), z));
                C358148aR r32 = new C358148aR(this, AnonymousClass7TE.A0l(r3));
                if (z) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                C358148aR.A00(r32, num, (Integer) null, (Integer) null, (Long) null, "attribution_list_impression");
                i = 451110859;
            }
        }
        AnonymousClass0fD.A09(i, A02);
        return inflate;
    }
}

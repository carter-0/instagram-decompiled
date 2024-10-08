package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class H16 extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "MixAttributionSheetFragment";
    public ListView A00;
    public C56157Htl A01;
    public C52980GgX A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "mix_attribution_sheet_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-141426963);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        Bundle requireArguments = requireArguments();
        C320506sU r9 = new C320506sU((AnonymousClass8ZN) requireArguments.getSerializable("ARGS_PIVOT_PAGE_ENTRY_POINT"), C320236s2.A01(requireArguments, "ARGS_PIVOT_PAGE_SESSION_ID"));
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        AnonymousClass0eM r1 = this.A03;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        String string = requireArguments.getString("ARGS_MEDIA_ID");
        String string2 = requireArguments.getString("ARGS_MEDIA_AUTHOR_ID");
        long j = requireArguments.getLong("ARGS_CONTAINER_ID");
        this.A01 = new C56157Htl(requireContext, requireActivity, (HOL) requireArguments.getSerializable("ARGS_AUDIO_TYPE"), r9, A0l, this, string, string2, requireArguments.getString("ARGS_MEDIA_TAP_TOKEN"), j);
        View inflate = layoutInflater2.inflate(R.layout.layout_clips_mix_sheet_fragment, viewGroup, false);
        this.A02 = new 2YN(requireActivity()).A00(C52980GgX.class);
        ListView listView = (ListView) inflate.requireViewById(R.id.mix_tracks_list);
        C52980GgX ggX = this.A02;
        C52864Gdx gdx = null;
        if (ggX == null) {
            str = "model";
        } else {
            List list = (List) ggX.A00.A02();
            if (list != null) {
                Context A0S = AnonymousClass7TE.A0S(listView);
                r1.getValue();
                IN7 in7 = new IN7();
                C56157Htl htl = this.A01;
                if (htl == null) {
                    str = "mixAttributionHelper";
                } else {
                    gdx = new C52864Gdx(A0S, in7, htl, list);
                }
            }
            listView.setAdapter(gdx);
            this.A00 = listView;
            AnonymousClass0fD.A09(-1003801923, A022);
            return inflate;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

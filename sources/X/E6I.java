package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class E6I extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "MentionThreadSettingNuxBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final /* synthetic */ void Cyc() {
    }

    public final /* synthetic */ void Cyf() {
    }

    public final String getModuleName() {
        return "mention_thread_setting_bottomsheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        1Av A0h = DbX.A0h(this.A00);
        AnonymousClass7TF.A1J(A0h, A0h.A5D, 1Av.A8a, 235, true);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList(AnonymousClass000.A00(3761))) == null) {
            throw AnonymousClass7TE.A0y();
        }
        ImageView A0J = DbX.A0J(view, R.id.facepile_holder);
        ArrayList A0r = AnonymousClass7TG.A0r(parcelableArrayList);
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            A0r.add(DbT.A0k(it).Bh3());
        }
        A0J.setImageDrawable(FCA.A02(requireContext(), "mention_thread_setting_bottomsheet", A0r, 3, R.dimen.abc_list_item_height_material, R.dimen.abc_action_bar_elevation_material));
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(781252584);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_mention_thread_setting_nux_bottomsheet_fragment, false);
        AnonymousClass0fD.A09(1018715290, A02);
        return A0D;
    }
}

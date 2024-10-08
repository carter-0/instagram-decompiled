package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.profile.fragment.UserDetailTabController;

public final class H1S extends AnonymousClass4DH implements AnonymousClass723 {
    public static final String __redex_internal_original_name = "SavedProfileTabFragment";
    public C54177H1x A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "saved_collections_list";

    public final String BhI() {
        return C273654mx.A00(370);
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
        0qQ.A0B(userDetailTabController, 0);
        C54177H1x h1x = this.A00;
        if (h1x != null) {
            C51968G9o.A0p(h1x).EB9(new C58685Ivu(new C55526Hj8(userDetailTabController), 13));
        }
    }

    public final void DqG(boolean z) {
    }

    public final void DqL(boolean z) {
    }

    public final void DqM() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A00 == null) {
            0hq childFragmentManager = getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString("profile_user_id");
            } else {
                str = null;
            }
            this.A00 = C55112HcL.A00(DbT.A0X(this.A01), str, true, false, false);
            0s1 r2 = new 0s1(childFragmentManager);
            C54177H1x h1x = this.A00;
            if (h1x != null) {
                r2.A0A(h1x, R.id.save_fragment_container);
                r2.A00();
                return;
            }
            throw DbU.A0h();
        }
    }

    public final Fragment ACU() {
        return this;
    }

    public final ViewGroup BqB() {
        C54177H1x h1x = this.A00;
        if (h1x != null) {
            return h1x.getRecyclerView();
        }
        return null;
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-853638311);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_saved_profile_tab_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1422562825, A022);
        return inflate;
    }
}

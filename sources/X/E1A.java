package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.List;

public final class E1A extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BannerBottomSheetFragment";
    public User A00;
    public List A01 = 0sn.A00;
    public RecyclerView A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "profile_banner_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0I = DbT.A0I(view, R.id.banner_rv);
        this.A02 = A0I;
        String str = "recyclerView";
        if (A0I != null) {
            DbU.A15(requireContext(), A0I, 1, false);
            int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.A11(new C60455Jln(dimensionPixelOffset, 5));
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    requireContext();
                    User user = this.A00;
                    if (user == null) {
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    } else {
                        recyclerView2.setAdapter(new E95(AnonymousClass7TE.A0l(this.A03), user, this.A01));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-940862765);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_banner_bottom_sheet_fragment, false);
        AnonymousClass0fD.A09(1733029721, A022);
        return A0D;
    }
}

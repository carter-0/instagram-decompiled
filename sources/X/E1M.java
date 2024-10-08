package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class E1M extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReelXpostViewerInfoFragment";
    public C49574Eyj A00;
    public UserSession A01;
    public IgTextView A02;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(331006592);
        E1M.super.onCreate(bundle);
        this.mArguments.getClass();
        this.A01 = DbX.A0U(this);
        AnonymousClass0fD.A09(-922788667, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-942685333);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reel_xpost_viewer_info);
        AnonymousClass0fD.A09(818500182, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgTextView A0a = DbT.A0a(view, R.id.info_icon_content);
        this.A02 = A0a;
        AnonymousClass7AV.A07(new C46679Dj8(this, 17), A0a, requireContext().getString(2131971488), DbW.A0h(requireContext(), requireContext().getString(2131971488), 2131971487));
    }
}

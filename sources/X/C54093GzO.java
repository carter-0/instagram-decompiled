package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.GzO  reason: case insensitive filesystem */
public final class C54093GzO extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SpotifyAccountLinkingBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(6522988);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_spotify_linking_flow_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(-768259480, A02);
        return inflate;
    }
}

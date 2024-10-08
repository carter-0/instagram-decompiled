package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;

/* renamed from: X.Gzf  reason: case insensitive filesystem */
public final class C54110Gzf extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SchoolChannelsCreationNuxFragment";
    public C62320sa A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = __redex_internal_original_name;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((ComposeView) view.requireViewById(R.id.school_channel_creation_nux_compose_view)).setContent(AnonymousClass5PI.A03(new C59110J6s(this, 20), -959397580));
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2106264444);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_school_channels_creation_nux_fragment, false);
        AnonymousClass0fD.A09(1137079688, A022);
        return A0D;
    }
}

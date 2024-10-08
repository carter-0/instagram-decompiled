package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NIS extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FeaturedChannelsDisclaimerFragment";
    public int A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.disclaimer_subtitle);
        Context context = A0R.getContext();
        int i = 2131959285;
        if (this.A00 == 1) {
            i = 2131960024;
        }
        C66581MXm.A15(context, A0R, i);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(390164810);
        NIS.super.onCreate(bundle);
        this.A00 = requireArguments().getInt("FeaturedChannelsDisclaimerFragment.ARGUMENT_SUBTITLE_VARIANT", 0);
        AnonymousClass0fD.A09(-970080384, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1924945072);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_featured_channels_disclaimer, viewGroup, false);
        AnonymousClass0fD.A09(-1924655865, A02);
        return inflate;
    }
}

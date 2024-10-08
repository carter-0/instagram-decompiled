package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class E3h extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "BroadcastChannelXpostingEducationBottomsheetFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "broadcast_channel_xposting_education_bottomsheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FPI.A01(view.requireViewById(R.id.primary_button), 35, this);
        FPI.A01(view.requireViewById(R.id.secondary_button), 36, this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        DbZ.A17(this);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1757815146);
        E3h.super.onCreate(bundle);
        String string = requireArguments().getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (string != null) {
            this.A00 = string;
            AnonymousClass0fD.A09(-786584251, A02);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(970524016, A02);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(422803264);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.broadcast_channel_xposting_education_bottomsheet_fragment, false);
        AnonymousClass0fD.A09(-561066603, A02);
        return A0D;
    }
}

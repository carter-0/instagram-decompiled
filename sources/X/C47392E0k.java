package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.Serializable;

/* renamed from: X.E0k  reason: case insensitive filesystem */
public final class C47392E0k extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiAgentAccessRequestedFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C69503Nml nml;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Resources A05 = DbV.A05(this);
        C3021461u r4 = (C3021461u) view.findViewById(R.id.access_requested_bottom_button_layout);
        Serializable serializable = requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (!(serializable instanceof C69503Nml) || (nml = (C69503Nml) serializable) == null) {
            nml = C69503Nml.A0J;
        }
        r4.setPrimaryAction(A05.getString(2131968772), new FPE(nml, this, 42));
        r4.setSecondaryAction(A05.getString(2131964884), new FPE(nml, this, 43));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1360958276);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_access_requested, false);
        AnonymousClass0fD.A09(-316584025, A02);
        return A0D;
    }
}

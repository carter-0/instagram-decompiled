package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class E13 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectManageFoldersEducationSheet";
    public C70933OSg A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "direct_manage_folders_education_sheet";

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(981010173);
        E13.super.onCreate(bundle);
        C70933OSg oSg = new C70933OSg(AnonymousClass7TE.A0l(this.A01));
        this.A00 = oSg;
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string == null) {
            string = "unknown";
        }
        C70933OSg.A00(oSg, C66579MXk.A00(906), AnonymousClass7TF.A0w(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string));
        AnonymousClass0fD.A09(1648502601, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1594590279);
        ComposeView A002 = GTX.A00(this, C55332Hg0.A00);
        AnonymousClass0fD.A09(-1719840023, A022);
        return A002;
    }
}

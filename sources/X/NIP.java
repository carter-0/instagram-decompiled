package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class NIP extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectMoveThreadActionBottomSheet";
    public C284945Oz A00;
    public C70933OSg A01;
    public 2EM A02;
    public 0sP A03;
    public final AnonymousClass0eM A04 = C73907Pli.A00(this, 31);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final String A06 = "direct_ui_professional_move_thread_action_bottom_sheet";

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(871906425);
        NIP.super.onCreate(bundle);
        C70933OSg oSg = new C70933OSg(AnonymousClass7TE.A0l(this.A05));
        this.A01 = oSg;
        Object value = this.A04.getValue();
        0qQ.A0B(value, 0);
        C70933OSg.A00(oSg, "inbox_folders_move_thread_sheet_impression", AnonymousClass7TF.A0w(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value));
        AnonymousClass0fD.A09(534888516, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-687146578);
        ComposeView A0H = DbV.A0H(this, new JGK(this, 25), -1871338697);
        AnonymousClass0fD.A09(-1589235892, A022);
        return A0H;
    }
}

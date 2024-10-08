package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.ENz  reason: case insensitive filesystem */
public final class C47948ENz extends E3K {
    public static final String __redex_internal_original_name = "OpalProfilePicSelectorFragment";
    public C49375Eud A00;

    public final String getModuleName() {
        return "opal_profile_pic_selector_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-753103657);
        super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A00;
        C49049EoT.A00(this, AnonymousClass7TE.A0l(r1), "surface_appear", "empty", "profile_picture_bottom_sheet", AnonymousClass7TE.A0l(r1).A06, (String) null);
        AnonymousClass0fD.A09(-828411963, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        AnonymousClass37D A0i;
        BottomSheetFragment A09;
        int A02 = AnonymousClass0fD.A02(-1298506792);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("argument_show_remove_picture_option");
        } else {
            z = false;
        }
        FragmentActivity activity = getActivity();
        if (!(activity == null || (A0i = DbT.A0i(activity)) == null || (A09 = A0i.A09()) == null)) {
            A09.A0T(8);
        }
        ComposeView A01 = GTX.A01(this, AnonymousClass5PI.A04(new J73(19, this, z), -168689063, true), true, false);
        AnonymousClass0fD.A09(-698833006, A02);
        return A01;
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(693926055);
        super.onDestroy();
        AnonymousClass0eM r1 = this.A00;
        C49049EoT.A00(this, AnonymousClass7TE.A0l(r1), "surface_disappear", "empty", "profile_picture_bottom_sheet", AnonymousClass7TE.A0l(r1).A06, (String) null);
        AnonymousClass0fD.A09(1650800658, A02);
    }
}

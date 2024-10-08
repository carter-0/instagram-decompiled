package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.ENy  reason: case insensitive filesystem */
public final class C47947ENy extends E3K {
    public static final String __redex_internal_original_name = "OpalNuxFragment";
    public C51913G7h A00;
    public boolean A01;

    public final String getModuleName() {
        return "opal_nux_bottomsheet_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass37D A0i;
        BottomSheetFragment A09;
        int A02 = AnonymousClass0fD.A02(1777476702);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (A0i = DbT.A0i(activity)) == null || (A09 = A0i.A09()) == null)) {
            A09.A0T(8);
        }
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new C59345JFx(this, 43), -1414057275, true), true, false);
        AnonymousClass0fD.A09(137060014, A02);
        return A012;
    }
}

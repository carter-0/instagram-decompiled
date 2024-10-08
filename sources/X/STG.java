package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebookpay.widget.navibar.NavigationBar;

public final class STG {
    public static final /* synthetic */ STG A00 = new Object();

    public static final void A01(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        0SM r1 = fragment.mParentFragment;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        r1.A07();
    }

    public static final void A03(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        C13894TjH tjH = fragment.mParentFragment;
        0qQ.A0C(tjH, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
        tjH.D68();
    }

    public static final void A02(Fragment fragment) {
        boolean z;
        C13894TjH tjH = fragment.mParentFragment;
        0qQ.A0C(tjH, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
        C8608Qxp qxp = (C8608Qxp) tjH;
        NavigationBar navigationBar = qxp.A07;
        if (navigationBar != null) {
            navigationBar.setVisibility(8);
            z = false;
        } else {
            z = true;
        }
        qxp.A08 = z;
    }

    public static final void A00(View.OnClickListener onClickListener, Fragment fragment) {
        C8608Qxp A0K = Pxi.A0K(fragment);
        DbS.A1a(A0K, onClickListener, A0K.A0H, C8608Qxp.A0X, 11);
    }

    public static final void A04(Fragment fragment, String str, String str2) {
        C8608Qxp A0K = Pxi.A0K(fragment);
        0s0 r1 = A0K.A0R;
        AnonymousClass0YZ[] r2 = C8608Qxp.A0X;
        DbS.A1a(A0K, str, r1, r2, 6);
        DbS.A1a(A0K, str2, A0K.A0P, r2, 18);
    }
}

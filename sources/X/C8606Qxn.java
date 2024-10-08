package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;

/* renamed from: X.Qxn  reason: case insensitive filesystem */
public final class C8606Qxn extends QAN {
    public Fragment A00;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        View A0G = AnonymousClass7TF.A0G(view, R.id.bottom_sheet_container);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.bottom_sheet_drag_handle);
        Context requireContext = requireContext();
        C10896Rzw A03 = C11426STk.A03();
        Drawable drawable = requireContext.getDrawable(R.drawable.bsc_bottom_sheet_background);
        if (drawable != null) {
            drawable.setTint(A03.A00(requireContext, 19));
        }
        A0G.setBackground(drawable);
        C10896Rzw A032 = C11426STk.A03();
        Drawable drawable2 = requireContext.getDrawable(R.drawable.bsc_bottom_sheet_drag_handle);
        if (drawable2 != null) {
            drawable2.setTint(A032.A00(requireContext, 14));
        }
        A0G2.setBackground(drawable2);
        Dialog dialog = this.A01;
        if (dialog instanceof QAL) {
            BottomSheetBehavior A06 = ((QAL) dialog).A06();
            0qQ.A07(A06);
            A06.A0W(3);
        }
        Fragment fragment = this.A00;
        if (fragment == null) {
            fragment = getChildFragmentManager().A0R("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
            if (fragment != null) {
                this.A00 = fragment;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0s1 A0O = Pxj.A0O(this);
        A0O.A0D(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", R.id.content_fragment);
        A0O.A0I((String) null);
        A0O.A00();
    }

    public final Dialog A0F(Bundle bundle) {
        Context requireContext = requireContext();
        C11426STk.A05();
        C8603Qxk qxk = new C8603Qxk(requireContext);
        qxk.setOnShowListener(new SVK(this, 0));
        return qxk;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(8357107);
        0qQ.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        C11426STk.A05();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(requireContext, R.style.BSCIGTheme)).inflate(R.layout.bsc_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-101293252, A02);
        return inflate;
    }
}

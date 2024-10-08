package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class QAM extends QC1 {
    public Fragment A00;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        View A0G = AnonymousClass7TF.A0G(view, R.id.dialog_fragment_container);
        C10896Rzw A03 = C11426STk.A03();
        Context requireContext = requireContext();
        Drawable drawable = requireContext().getDrawable(R.drawable.bsc_dialog_background);
        if (drawable != null) {
            drawable.setTint(A03.A00(requireContext, 19));
        }
        A0G.setBackground(drawable);
        Fragment fragment = this.A00;
        if (fragment == null) {
            fragment = getChildFragmentManager().A0R("DIALOG_CONTENT_FRAGMENT_TAG");
            if (fragment != null) {
                this.A00 = fragment;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0s1 A0O = Pxj.A0O(this);
        A0O.A0D(fragment, "DIALOG_CONTENT_FRAGMENT_TAG", R.id.dialog_fragment);
        A0O.A0I((String) null);
        A0O.A00();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        int A02 = AnonymousClass0fD.A02(415389798);
        0qQ.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        C11426STk.A05();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(requireContext, R.style.BSCIGTheme));
        Dialog dialog = this.A01;
        if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.A01;
        if (!(dialog2 == null || (window = dialog2.getWindow()) == null)) {
            window.requestFeature(1);
        }
        View inflate = cloneInContext.inflate(R.layout.bsc_dialog_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1909975196, A02);
        return inflate;
    }
}

package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public final class E52 extends AnonymousClass4DH implements AnonymousClass4DR, C51957G9a {
    public static final String __redex_internal_original_name = "DirectThreadBottomSheetFragmentImpl";
    public AnonymousClass37D A00;
    public AnonymousClass37D A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return C273654mx.A00(23);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Fragment nj8;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = A00(R.id.custom_bottom_sheet_fragment_transaction_view_1);
        this.A00 = A00(R.id.custom_bottom_sheet_fragment_transaction_view_2);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (string = bundle2.getString(AnonymousClass000.A00(3013))) == null)) {
            int hashCode = string.hashCode();
            if (hashCode != -2107409558) {
                if (hashCode == -714477863 && string.equals("fragment_thread")) {
                    nj8 = new C273484me();
                }
            } else if (string.equals(AnonymousClass000.A00(3154))) {
                nj8 = new NJ8();
            }
            nj8.setArguments(this.mArguments);
            C331127Pr A002 = C69861NtP.A00(AnonymousClass7TE.A0l(this.A02));
            A002.A1I = true;
            A002.A10 = true;
            if (nj8 instanceof C273494mf) {
                A002.A0T = (C273494mf) nj8;
            }
            A002.A0U = new C72959PQr(nj8, 7);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                float f = bundle3.getFloat(AnonymousClass000.A00(3015));
                if (f > 0.0f && f <= 1.0f) {
                    A002.A03 = f;
                }
            }
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                int i = bundle4.getInt(AnonymousClass000.A00(3014));
                if (Integer.valueOf(i) != null) {
                    A002.A07 = i;
                }
            }
            C331157Pu A003 = A002.A00();
            FragmentActivity requireActivity = requireActivity();
            C331157Pu.A00(requireActivity, requireActivity, nj8, A003, this.A01);
            return;
        }
        DbX.A1I(this);
    }

    public final AnonymousClass37D AhO() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        AnonymousClass37D r0 = this.A00;
        if (r0 != null && r0.A0X()) {
            return true;
        }
        AnonymousClass37D r02 = this.A01;
        if (r02 == null || !r02.A0X()) {
            return false;
        }
        return true;
    }

    private final AnonymousClass37F A00(int i) {
        LayoutInflater from = LayoutInflater.from(requireActivity());
        View requireView = requireView();
        0qQ.A0C(requireView, "null cannot be cast to non-null type android.view.ViewGroup");
        View inflate = from.inflate(R.layout.bottom_sheet_container, (ViewGroup) requireView, false);
        View requireView2 = requireView();
        0qQ.A0C(requireView2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) requireView2).addView(inflate);
        DbX.A1B(inflate, R.id.bottom_sheet_container);
        int i2 = i;
        inflate.requireViewById(R.id.layout_container_bottom_sheet).setId(i);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            0lg A0X = DbT.A0X(this.A02);
            0hq childFragmentManager = getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            0qQ.A0B(A0X, 2);
            AnonymousClass37F r1 = new AnonymousClass37F(rootActivity, inflate, childFragmentManager, A0X, i2, false);
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.IgBottomSheetNavigator");
            return r1;
        }
        throw DbU.A0h();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int i;
        int A022 = AnonymousClass0fD.A02(1302242765);
        if (viewGroup == null) {
            frameLayout = null;
            i = 539597178;
        } else {
            frameLayout = new FrameLayout(AnonymousClass7TE.A0S(viewGroup));
            i = 1932094364;
        }
        AnonymousClass0fD.A09(i, A022);
        return frameLayout;
    }
}

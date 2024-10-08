package com.instagram.shopping.fragment.variantselector;

import X.0gy;
import X.0lg;
import X.0nA;
import X.0qQ;
import X.1ES;
import X.1NY;
import X.1OC;
import X.AnonymousClass00P;
import X.AnonymousClass07i;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C15241UXb;
import X.C15620Ufm;
import X.C16581Uxb;
import X.C17393VTu;
import X.C18263VoU;
import X.C19593WcI;
import X.C227642jf;
import X.C273654mx;
import X.DbS;
import X.DbT;
import X.DbU;
import X.JTP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

public final class MultiVariantSelectorLoadingFragment extends AnonymousClass4DH {
    public C16581Uxb A00;
    public C17393VTu A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public EmptyStateView emptyStateView;

    public final String getModuleName() {
        return "multi_variant_selector_loading";
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView2 = (EmptyStateView) view.requireViewById(16908292);
        0qQ.A0B(emptyStateView2, 0);
        this.emptyStateView = emptyStateView2;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            int i = bundle2.getInt("arg_fixed_height");
            if (i > 0) {
                EmptyStateView emptyStateView3 = this.emptyStateView;
                if (emptyStateView3 != null) {
                    0nA.A0V(emptyStateView3, i);
                }
                str = "emptyStateView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            EmptyStateView emptyStateView4 = this.emptyStateView;
            if (emptyStateView4 != null) {
                emptyStateView4.A0L();
                C19593WcI wcI = new C19593WcI(this, 1);
                C16581Uxb uxb = this.A00;
                if (uxb != null) {
                    FragmentActivity requireActivity = requireActivity();
                    0gy A002 = AnonymousClass07i.A00(this);
                    0lg A0X = DbT.A0X(this.A04);
                    String str2 = this.A03;
                    if (str2 == null) {
                        str = "productId";
                    } else {
                        String str3 = this.A02;
                        if (str3 == null) {
                            str = "merchantId";
                        } else {
                            1NY A0O = DbU.A0O(A0X);
                            A0O.A0A("commerce/product_tagging/product_group/");
                            A0O.A9m("product_id", str2);
                            A0O.A9m("merchant_id", str3);
                            A0O.A9m("usage", uxb.A00);
                            1OC A0S = DbT.A0S(A0O, C15241UXb.class, C18263VoU.class);
                            A0S.A00 = new C15620Ufm(wcI, A0X, str2, 5);
                            1ES.A00(requireActivity, A002, A0S);
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            str = "emptyStateView";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-709850966);
        MultiVariantSelectorLoadingFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = JTP.A0m(bundle2, "product_id");
            this.A02 = JTP.A0m(bundle2, "merchant_id");
            this.A00 = (C16581Uxb) bundle2.getSerializable(C273654mx.A00(893));
            AnonymousClass0fD.A09(-927462199, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1456951960, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1928075675);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_empty_state_view, viewGroup, false);
        AnonymousClass0fD.A09(-1176040588, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(436504481);
        super.onDestroyView();
        this.emptyStateView = null;
        AnonymousClass0fD.A09(-1831071057, A022);
    }
}

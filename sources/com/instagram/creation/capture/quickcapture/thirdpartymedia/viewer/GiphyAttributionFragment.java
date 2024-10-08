package com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer;

import X.0qQ;
import X.0sn;
import X.1Xj;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C270534gt;
import X.C320236s2;
import X.C46820Dlw;
import X.C50113FPd;
import X.C53090GiO;
import X.C67231sQ;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

public final class GiphyAttributionFragment extends AnonymousClass4DH {
    public C46820Dlw A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public RecyclerView recycler;

    public final String getModuleName() {
        return "GiphyAttributionFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if ((view instanceof TouchInterceptorFrameLayout) && (touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view) != null) {
            touchInterceptorFrameLayout.CNi(new C50113FPd(this, 0));
        }
        RecyclerView A0I = DbT.A0I(view, R.id.recycler);
        this.recycler = A0I;
        if (A0I != null) {
            DbV.A1B(requireActivity(), A0I);
        }
        RecyclerView recyclerView = this.recycler;
        if (recyclerView != null) {
            C46820Dlw dlw = this.A00;
            if (dlw == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.setAdapter(dlw);
        }
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 != null) {
            recyclerView2.A11(new C53090GiO(0, DbU.A05(view).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, false));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        List list;
        C270534gt B3C;
        int A02 = AnonymousClass0fD.A02(2037898715);
        GiphyAttributionFragment.super.onCreate(bundle);
        1Xj A022 = DbX.A0d(this.A01).A02(C320236s2.A01(requireArguments(), "media_id"));
        if (A022 != null) {
            C67231sQ clipsMetadata = A022.A0C.getClipsMetadata();
            if (clipsMetadata == null || (B3C = clipsMetadata.B3C()) == null || (list = B3C.B9M()) == null) {
                list = 0sn.A00;
            }
            this.A00 = new C46820Dlw(requireActivity(), this, list);
            AnonymousClass0fD.A09(-1654131800, A02);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-406232758, A02);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-661956141);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.giphy_attribution_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-668660944, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(269031391);
        super.onDestroyView();
        this.recycler = null;
        AnonymousClass0fD.A09(-1818886330, A02);
    }
}

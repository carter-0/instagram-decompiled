package com.instagram.shopping.fragment.postpurchase;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.C227642jf;
import X.C46824Dm0;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class ProductSharePickerFragment extends AnonymousClass4DH {
    public C46824Dm0 A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public RecyclerView recyclerView;

    public final String getModuleName() {
        return "instagram_shopping_product_share_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0K = DbX.A0K(view);
        this.recyclerView = A0K;
        if (A0K != null) {
            DbY.A15(this, A0K);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A00);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        C46824Dm0 dm0;
        int A02 = AnonymousClass0fD.A02(1949537405);
        ProductSharePickerFragment.super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(AnonymousClass000.A00(3760));
        if (parcelableArrayList != null) {
            dm0 = new C46824Dm0(this, this, parcelableArrayList);
        } else {
            dm0 = null;
        }
        this.A00 = dm0;
        AnonymousClass0fD.A09(-697176260, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2117877323);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_recyclerview, false);
        AnonymousClass0fD.A09(446941423, A02);
        return A0D;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(1290799593);
        super.onDestroyView();
        this.recyclerView = null;
        AnonymousClass0fD.A09(-1930132723, A02);
    }
}

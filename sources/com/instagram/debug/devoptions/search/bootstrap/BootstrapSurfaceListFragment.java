package com.instagram.debug.devoptions.search.bootstrap;

import X.002;
import X.0nC;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass4DS;
import X.C273374mT;
import X.C275824s0;
import X.C293645l7;
import X.C309516Yo;
import X.C363288jT;
import X.C51968G9o;
import X.C59689JTv;
import X.DbV;
import X.DbW;
import X.Dba;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceAdapter;

public class BootstrapSurfaceListFragment extends C273374mT implements AnonymousClass4DS {
    public BootstrapSurfaceAdapter mAdapter;
    public final BootstrapSurfaceAdapter.Delegate mAdapterDelegate = new BootstrapSurfaceAdapter.Delegate() {
        public void onSurfaceClick(C293645l7 r5) {
            Bundle bundle = new Bundle();
            bundle.putString(BootstrapUsersListFragment.EXTRA_SURFACE_NAME, r5.A01);
            C309516Yo r1 = new C309516Yo(BootstrapSurfaceListFragment.this.requireActivity(), BootstrapSurfaceListFragment.this.getSession());
            r1.A0B(bundle, new BootstrapUsersListFragment());
            r1.A04();
        }

        public void onSurfaceLongClick(C293645l7 r4) {
            String str = r4.A01;
            0nC.A00(BootstrapSurfaceListFragment.this.requireActivity(), str);
            C59689JTv.A09(BootstrapSurfaceListFragment.this.getActivity(), 002.A0R("Copied to clipboard: ", str));
        }
    };
    public RecyclerView mRecyclerView;

    public String getModuleName() {
        return "search_debug_settings_view_bootstrap_surfaces";
    }

    public void configureActionBar(2da r2) {
        DbW.A1C(r2, getString(2131958279));
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1634200164);
        BootstrapSurfaceListFragment.super.onCreate(bundle);
        C363288jT.A00(getSession()).A05();
        BootstrapSurfaceAdapter bootstrapSurfaceAdapter = new BootstrapSurfaceAdapter(this.mAdapterDelegate);
        this.mAdapter = bootstrapSurfaceAdapter;
        bootstrapSurfaceAdapter.setSurfaces(Dba.A0e(C363288jT.A00(getSession()).A01.A05));
        AnonymousClass0fD.A09(-290837616, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-706362446);
        float f = RecyclerView.A1E;
        RecyclerView recyclerView = new RecyclerView(requireActivity());
        this.mRecyclerView = recyclerView;
        C51968G9o.A1D(recyclerView, -1);
        RecyclerView recyclerView2 = this.mRecyclerView;
        AnonymousClass0fD.A09(-1493568180, A02);
        return recyclerView2;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DbV.A1B(getActivity(), this.mRecyclerView);
        C275824s0 r2 = new C275824s0(requireActivity(), 1);
        r2.A01(requireActivity().getDrawable(R.drawable.drawable_divider));
        this.mRecyclerView.A11(r2);
        this.mRecyclerView.setAdapter(this.mAdapter);
    }
}

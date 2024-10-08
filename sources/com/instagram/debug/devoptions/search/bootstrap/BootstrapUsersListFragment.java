package com.instagram.debug.devoptions.search.bootstrap;

import X.002;
import X.0nC;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass4DS;
import X.C249403jg;
import X.C273374mT;
import X.C275824s0;
import X.C293645l7;
import X.C309516Yo;
import X.C363288jT;
import X.C46447Df9;
import X.C46474Dfc;
import X.C46548Dgp;
import X.C59689JTv;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.Dba;
import X.G7N;
import X.Pxg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.Iterator;
import java.util.List;

public class BootstrapUsersListFragment extends C273374mT implements AnonymousClass4DS {
    public static final String EXTRA_SURFACE_NAME = "extra_surface_name";
    public BootstrapUsersAdapter mAdapter;
    public final BootstrapUsersAdapter.Delegate mAdapterDelegate = new BootstrapUsersAdapter.Delegate() {
        public void onUserClick(BootstrapUserInfo bootstrapUserInfo) {
            UserSession session = BootstrapUsersListFragment.this.getSession();
            C46474Dfc.A02(new C309516Yo(BootstrapUsersListFragment.this.requireActivity(), BootstrapUsersListFragment.this.getSession()), session, C46447Df9.A02(), C46548Dgp.A01(session, bootstrapUserInfo.user.getId(), "developer_options", "search_debug_settings_view_bootstrap_users"));
        }

        public void onUserLongClick(BootstrapUserInfo bootstrapUserInfo) {
            String id = bootstrapUserInfo.user.getId();
            0nC.A00(BootstrapUsersListFragment.this.requireActivity(), id);
            C59689JTv.A09(BootstrapUsersListFragment.this.getActivity(), 002.A0R("Copied to clipboard: ", id));
        }
    };
    public RecyclerView mRecyclerView;
    public final G7N mSearchBarDelegate = new G7N() {
        public void registerTextViewLogging(TextView textView) {
        }

        public void searchTextChanged(String str) {
            BootstrapUsersListFragment.this.mAdapter.applyFilterText(str);
        }
    };
    public C293645l7 mSurface;

    public String getModuleName() {
        return "search_debug_settings_view_bootstrap_users";
    }

    public void configureActionBar(2da r2) {
        DbW.A1C(r2, this.mSurface.A01);
    }

    private List getUserInfos() {
        C363288jT A00 = C363288jT.A00(getSession());
        return BootstrapUserInfo.generateInfosForSurface(A00.A02.A05, this.mSurface, Dba.A0e(A00.A01.A05));
    }

    private void setSurface() {
        String A0l = DbU.A0l(requireArguments(), EXTRA_SURFACE_NAME);
        Iterator A16 = Pxg.A16(C363288jT.A00(getSession()).A01.A05.values());
        while (true) {
            if (!A16.hasNext()) {
                break;
            }
            C293645l7 r1 = (C293645l7) A16.next();
            if (r1.A01.equals(A0l)) {
                this.mSurface = r1;
                break;
            }
        }
        this.mSurface.getClass();
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1573638851);
        BootstrapUsersListFragment.super.onCreate(bundle);
        setSurface();
        BootstrapUsersAdapter bootstrapUsersAdapter = new BootstrapUsersAdapter(this, this.mAdapterDelegate, this.mSurface);
        this.mAdapter = bootstrapUsersAdapter;
        bootstrapUsersAdapter.setUnfilteredUsers(getUserInfos());
        AnonymousClass0fD.A09(-1812582695, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-836803540);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.bootstrap_searchable_list_fragment);
        final TypeaheadHeader typeaheadHeader = (TypeaheadHeader) A0C.requireViewById(R.id.search_bar);
        typeaheadHeader.setDelegate(this.mSearchBarDelegate);
        typeaheadHeader.A03("Search...");
        typeaheadHeader.setAllowTextSelection(true);
        RecyclerView A0K = DbX.A0K(A0C);
        this.mRecyclerView = A0K;
        A0K.A15(new C249403jg() {
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int A03 = AnonymousClass0fD.A03(1891404798);
                if (i == 1) {
                    typeaheadHeader.A01();
                }
                AnonymousClass0fD.A0A(499571422, A03);
            }
        });
        AnonymousClass0fD.A09(3817614, A02);
        return A0C;
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

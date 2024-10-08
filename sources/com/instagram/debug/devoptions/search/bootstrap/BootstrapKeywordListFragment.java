package com.instagram.debug.devoptions.search.bootstrap;

import X.002;
import X.0nC;
import X.182;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TF;
import X.C14398TvR;
import X.C14452Twa;
import X.C249403jg;
import X.C275824s0;
import X.C293655l8;
import X.C309516Yo;
import X.C363368jb;
import X.C59689JTv;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.G7N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapKeywordAdapter;
import com.instagram.model.keyword.Keyword;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;

public class BootstrapKeywordListFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public BootstrapKeywordAdapter mAdapter;
    public final BootstrapKeywordAdapter.Delegate mDelegate = new BootstrapKeywordAdapter.Delegate() {
        public void onKeywordClick(Keyword keyword) {
            UserSession userSession = BootstrapKeywordListFragment.this.mUserSession;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36331033867600762L)) {
                C309516Yo r2 = new C309516Yo(BootstrapKeywordListFragment.this.requireActivity(), BootstrapKeywordListFragment.this.mUserSession);
                C14398TvR.A00();
                r2.A0E(C14452Twa.A02(keyword, (String) null, (String) null, "", (String) null));
                r2.A04();
            }
        }

        public void onKeywordLongClick(Keyword keyword) {
            String str = keyword.A04;
            0nC.A00(BootstrapKeywordListFragment.this.requireActivity(), str);
            C59689JTv.A09(BootstrapKeywordListFragment.this.getActivity(), 002.A0R("Copied to clipboard: ", str));
        }
    };
    public RecyclerView mRecyclerView;
    public final G7N mSearchBarDelegate = new G7N() {
        public void registerTextViewLogging(TextView textView) {
        }

        public void searchTextChanged(String str) {
            BootstrapKeywordListFragment.this.mAdapter.applyFilterText(str);
        }
    };
    public UserSession mUserSession;

    public String getModuleName() {
        return "search_debug_settings_view_bootstrap_keywords";
    }

    public AnonymousClass0wW getSession() {
        return this.mUserSession;
    }

    public void configureActionBar(2da r2) {
        DbW.A1C(r2, getString(2131958278));
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(241459940);
        BootstrapKeywordListFragment.super.onCreate(bundle);
        UserSession A0U = DbS.A0U(requireArguments());
        this.mUserSession = A0U;
        C293655l8.A00(A0U).A02();
        BootstrapKeywordAdapter bootstrapKeywordAdapter = new BootstrapKeywordAdapter(this.mDelegate);
        this.mAdapter = bootstrapKeywordAdapter;
        bootstrapKeywordAdapter.setUnfilteredUsers(new ArrayList(((C363368jb) C293655l8.A00(this.mUserSession).A06.getValue()).A04));
        AnonymousClass0fD.A09(-383332948, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-330647454);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.bootstrap_searchable_list_fragment);
        final TypeaheadHeader typeaheadHeader = (TypeaheadHeader) A0C.requireViewById(R.id.search_bar);
        typeaheadHeader.setDelegate(this.mSearchBarDelegate);
        typeaheadHeader.A03("Search...");
        typeaheadHeader.setAllowTextSelection(true);
        RecyclerView A0K = DbX.A0K(A0C);
        this.mRecyclerView = A0K;
        A0K.A15(new C249403jg() {
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int A03 = AnonymousClass0fD.A03(339736245);
                if (i == 1) {
                    typeaheadHeader.A01();
                }
                AnonymousClass0fD.A0A(806113977, A03);
            }
        });
        AnonymousClass0fD.A09(304972889, A02);
        return A0C;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DbV.A1B(getActivity(), this.mRecyclerView);
        C275824s0 r2 = new C275824s0(getActivity(), 1);
        r2.A01(getActivity().getDrawable(R.drawable.drawable_divider));
        this.mRecyclerView.A11(r2);
        this.mRecyclerView.setAdapter(this.mAdapter);
    }
}

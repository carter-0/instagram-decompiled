package com.instagram.debug.mcdoptions;

import X.0nA;
import X.0xY;
import X.0xa;
import X.1Al;
import X.1An;
import X.2Yu;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1GX;
import X.AnonymousClass4DS;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.C238133Ar;
import X.C46448DfA;
import X.C47518E6c;
import X.C49605EzO;
import X.C74374Pto;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.G7N;
import X.PR9;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

public class MetaCheckoutDeveloperOptionsFragment extends C47518E6c implements AnonymousClass4DS {
    public DevOptionsPreferenceAdapter mAdapter;
    public final G7N mTypeaheadDelegate = new G7N() {
        public void registerTextViewLogging(TextView textView) {
            textView.addTextChangedListener(AnonymousClass4v0.A00(MetaCheckoutDeveloperOptionsFragment.this.mUserSession));
        }

        public void searchTextChanged(String str) {
            boolean isEmpty = str.isEmpty();
            MetaCheckoutDeveloperOptionsFragment metaCheckoutDeveloperOptionsFragment = MetaCheckoutDeveloperOptionsFragment.this;
            if (isEmpty) {
                metaCheckoutDeveloperOptionsFragment.refreshItems();
            } else {
                C49605EzO ezO = metaCheckoutDeveloperOptionsFragment.mTypeaheadHeaderModel;
                if (ezO != null) {
                    ezO.A03 = true;
                }
                DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = metaCheckoutDeveloperOptionsFragment.mAdapter;
                if (devOptionsPreferenceAdapter != null) {
                    devOptionsPreferenceAdapter.setTypeaheadHeaderModel(ezO);
                }
            }
            MetaCheckoutDeveloperOptionsFragment.this.filterOptions(str);
        }
    };
    public C49605EzO mTypeaheadHeaderModel;
    public 0xa mUserPreferences;
    public UserSession mUserSession;

    public String getModuleName() {
        return "meta_checkout_developer_options";
    }

    private void addNetworkItems(List list) {
        list.add(new C46448DfA((CharSequence) "Script Injection"));
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                0xY AR4 = MetaCheckoutDeveloperOptionsFragment.this.mUserPreferences.AR4();
                AR4.E5T("script_injection", z);
                AR4.apply();
            }
        }, (CharSequence) "Enable Meta Checkout script injection", DbT.A1a(this.mUserPreferences, "script_injection")));
    }

    /* access modifiers changed from: private */
    public void filterOptions(CharSequence charSequence) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.getFilter().filter(charSequence);
        }
    }

    public AnonymousClass0wW getSession() {
        return this.mUserSession;
    }

    /* access modifiers changed from: private */
    public void refreshItems() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        SearchEditText searchEditText = this.mTypeaheadHeaderModel.A00;
        if (searchEditText != null) {
            searchEditText.setText("");
        }
        A1C.add(this.mTypeaheadHeaderModel);
        addNetworkItems(A1C);
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.setUnfilteredItems(A1C);
        }
        filterOptions("");
    }

    public void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131966447);
    }

    public void onPause() {
        int A02 = AnonymousClass0fD.A02(1582180815);
        MetaCheckoutDeveloperOptionsFragment.super.onPause();
        if (this.mView != null) {
            0nA.A0N(DbV.A0F(this));
        }
        AnonymousClass0fD.A09(-217480789, A02);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.EzO] */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mUserSession = DbX.A0U(this);
        this.mAdapter = new DevOptionsPreferenceAdapter(requireActivity(), this.mUserSession, this);
        this.mUserPreferences = 1Al.A01(this.mUserSession).A03(1An.A2D);
        getScrollingViewProxy().ENw(this.mAdapter);
        DbV.A0F(this).setBackgroundColor(2Yu.A00(requireContext()));
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search preferences");
        ? obj = new Object();
        this.mTypeaheadHeaderModel = obj;
        obj.A01 = this.mTypeaheadDelegate;
        obj.A00 = searchEditText;
        obj.A02 = new C74374Pto() {
            public void onSearchCleared(String str) {
                MetaCheckoutDeveloperOptionsFragment.this.refreshItems();
            }
        };
        getScrollingViewProxy().AAD(new AnonymousClass1GX() {
            public void onScrollStateChanged(C238133Ar r3, int i) {
                int A03 = AnonymousClass0fD.A03(-205512161);
                if (i == 1) {
                    0nA.A0N(DbV.A0F(MetaCheckoutDeveloperOptionsFragment.this));
                }
                AnonymousClass0fD.A0A(-1483740041, A03);
            }
        });
        refreshItems();
    }
}

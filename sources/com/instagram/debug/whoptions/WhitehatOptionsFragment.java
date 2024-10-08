package com.instagram.debug.whoptions;

import X.0nA;
import X.0tS;
import X.0xY;
import X.1CI;
import X.2Yu;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1GX;
import X.AnonymousClass4DS;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C238133Ar;
import X.C249473jq;
import X.C46448DfA;
import X.C47518E6c;
import X.C49605EzO;
import X.C74374Pto;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.G7N;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

public class WhitehatOptionsFragment extends C47518E6c implements AnonymousClass4DS {
    public DevOptionsPreferenceAdapter mAdapter;
    public final G7N mTypeaheadDelegate = new G7N() {
        public void registerTextViewLogging(TextView textView) {
            textView.addTextChangedListener(AnonymousClass4v0.A00(WhitehatOptionsFragment.this.mUserSession));
        }

        public void searchTextChanged(String str) {
            boolean isEmpty = str.isEmpty();
            WhitehatOptionsFragment whitehatOptionsFragment = WhitehatOptionsFragment.this;
            if (isEmpty) {
                whitehatOptionsFragment.refreshItems();
            } else {
                C49605EzO ezO = whitehatOptionsFragment.mTypeaheadHeaderModel;
                if (ezO != null) {
                    ezO.A03 = true;
                }
                DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = whitehatOptionsFragment.mAdapter;
                if (devOptionsPreferenceAdapter != null) {
                    devOptionsPreferenceAdapter.setTypeaheadHeaderModel(ezO);
                }
            }
            WhitehatOptionsFragment.this.filterOptions(str);
        }
    };
    public C49605EzO mTypeaheadHeaderModel;
    public UserSession mUserSession;

    public String getModuleName() {
        return "whitehat_options";
    }

    /* access modifiers changed from: private */
    public void filterOptions(CharSequence charSequence) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.getFilter().filter(charSequence);
        }
    }

    /* access modifiers changed from: private */
    public boolean shouldAddPrefTTL() {
        return AnonymousClass7TF.A1Q(1CI.A00(this.mUserSession) ? 1 : 0);
    }

    public AnonymousClass0wW getSession() {
        return this.mUserSession;
    }

    private void addNetworkItems(List list) {
        final 0tS A00 = 0tS.A00();
        list.add(C46448DfA.A00(2131976880));
        list.add(DbS.A0f(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                0tS A00 = 0tS.A00();
                if (!WhitehatOptionsFragment.this.shouldAddPrefTTL() || !z) {
                    str = "";
                } else {
                    str = StringFormatUtil.formatStrLocaleSafe("%d:%d", Long.valueOf(System.currentTimeMillis()), 86400000);
                }
                0xY AR4 = A00.A00.AR4();
                AR4.E5T("debug_allow_user_certs", z);
                AR4.E5g("debug_allow_user_certs_ttl", str);
                AR4.apply();
                if (z) {
                    0tS.A4F.add("debug_allow_user_certs");
                }
                C249473jq activity = WhitehatOptionsFragment.this.getActivity();
                if (activity instanceof C249473jq) {
                    activity.E0N(A00);
                }
            }
        }, 2131976877, A00.A0K()));
        boolean A1a = DbT.A1a(A00.A00, "debug_disable_liger_fizz");
        if (!A1a && 0tS.A4F.contains("debug_disable_liger_fizz")) {
            A1a = true;
        }
        list.add(DbS.A0f(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                0xY AR4 = A00.A00.AR4();
                AR4.E5T("debug_disable_liger_fizz", z);
                AR4.apply();
                if (z) {
                    0tS.A4F.add("debug_disable_liger_fizz");
                }
            }
        }, 2131976879, A1a));
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
        DbW.A1B(r2, 2131976876);
    }

    public void onPause() {
        int A02 = AnonymousClass0fD.A02(2026245052);
        WhitehatOptionsFragment.super.onPause();
        if (this.mView != null) {
            0nA.A0N(DbV.A0F(this));
        }
        AnonymousClass0fD.A09(1948291223, A02);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.EzO] */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mUserSession = DbX.A0U(this);
        this.mAdapter = new DevOptionsPreferenceAdapter(requireActivity(), this.mUserSession, this);
        getScrollingViewProxy().ENw(this.mAdapter);
        DbV.A0F(this).setBackgroundColor(2Yu.A00(requireContext()));
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search Whitehat Settings");
        ? obj = new Object();
        this.mTypeaheadHeaderModel = obj;
        obj.A01 = this.mTypeaheadDelegate;
        obj.A00 = searchEditText;
        obj.A02 = new C74374Pto() {
            public void onSearchCleared(String str) {
                WhitehatOptionsFragment.this.refreshItems();
            }
        };
        getScrollingViewProxy().AAD(new AnonymousClass1GX() {
            public void onScrollStateChanged(C238133Ar r3, int i) {
                int A03 = AnonymousClass0fD.A03(-1974471149);
                if (i == 1) {
                    0nA.A0N(DbV.A0F(WhitehatOptionsFragment.this));
                }
                AnonymousClass0fD.A0A(-606453774, A03);
            }
        });
        refreshItems();
    }
}

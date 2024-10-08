package com.instagram.debug.quickexperiment;

import X.0nY;
import X.0ng;
import X.0yN;
import X.11Z;
import X.1UV;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1GX;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.C238133Ar;
import X.C47518E6c;
import X.C66584MXp;
import X.DbW;
import X.DbX;
import X.G6X;
import X.G7N;
import X.JTS;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OverlayConfigEditFragment extends C47518E6c implements AnonymousClass4DR, G7N, AnonymousClass4DS, G6X {
    public static final String TITLE = "Edit Overlay Configs";
    public OverlayConfigEditAdapter mAdapter;
    public List mOverlayConfigsList = AnonymousClass7TE.A1C();
    public final 1UV mSearchOverlayConfigPredicate = new 1UV() {
        public boolean apply(0yN r5) {
            if (!OverlayConfigHelper.isOverlayConfig(r5)) {
                return false;
            }
            if (QuickExperimentHelper.getNiceUniverseName(r5.universeName).toLowerCase().contains(OverlayConfigEditFragment.this.mSearchQuery.toLowerCase()) || r5.name.replace("_", " ").toLowerCase().contains(OverlayConfigEditFragment.this.mSearchQuery.toLowerCase())) {
                return true;
            }
            return false;
        }
    };
    public String mSearchQuery = "";
    public UserSession mSession;
    public TypeaheadHeader mTypeaheadHeader;

    public String getModuleName() {
        return "overlay_config_edit";
    }

    /* access modifiers changed from: private */
    public void setItems(List list, boolean z) {
        OverlayConfigEditAdapter overlayConfigEditAdapter = this.mAdapter;
        overlayConfigEditAdapter.setMenuItemList(QuickExperimentHelper.setupMenuItems(this, this.mSession, list, overlayConfigEditAdapter, false));
    }

    private void sortOverlayConfigList(List list) {
        Collections.sort(list, new Comparator() {
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return C66584MXp.A06((0yN) obj, (0yN) obj2);
            }

            public int compare(0yN r2, 0yN r3) {
                return C66584MXp.A06(r2, r3);
            }
        });
    }

    public void configureActionBar(2da r2) {
        DbW.A1C(r2, TITLE);
    }

    public View getRowView() {
        return this.mTypeaheadHeader;
    }

    public AnonymousClass0wW getSession() {
        return this.mSession;
    }

    public boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.mTypeaheadHeader;
        if (typeaheadHeader == null) {
            return false;
        }
        typeaheadHeader.A01();
        return false;
    }

    public void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(AnonymousClass4v0.A00(this.mSession));
    }

    public void searchTextChanged(String str) {
        this.mSearchQuery = str;
        if (!TextUtils.isEmpty(str)) {
            0nY.A00().ATE(new 0ng(1386848661) {
                public void run() {
                    OverlayConfigEditFragment overlayConfigEditFragment = OverlayConfigEditFragment.this;
                    overlayConfigEditFragment.filterOverlayConfigList(overlayConfigEditFragment.mSearchQuery);
                }
            });
        } else {
            setItems(this.mOverlayConfigsList, false);
        }
    }

    /* access modifiers changed from: private */
    public void filterOverlayConfigList(String str) {
        final ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : QuickExperimentHelper.getAllExperiments()) {
            if (!str.equals(this.mSearchQuery)) {
                return;
            }
            if (this.mSearchOverlayConfigPredicate.apply(next)) {
                A1C.add(next);
            }
        }
        sortOverlayConfigList(A1C);
        11Z.A03(new Runnable() {
            public void run() {
                OverlayConfigEditFragment.this.setItems(A1C, true);
            }
        });
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-873723397);
        super.onCreate(bundle);
        this.mSession = DbX.A0U(this);
        this.mAdapter = new OverlayConfigEditAdapter(requireContext(), this);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (0yN r1 : QuickExperimentHelper.getAllExperiments()) {
            if (OverlayConfigHelper.isOverlayConfig(r1)) {
                A1C.add(r1);
            }
        }
        this.mOverlayConfigsList = A1C;
        sortOverlayConfigList(A1C);
        AnonymousClass0fD.A09(2129308742, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(requireContext());
        this.mTypeaheadHeader = typeaheadHeader;
        typeaheadHeader.A01 = this;
        JTS.A0x(typeaheadHeader);
        if (!TextUtils.isEmpty(this.mSearchQuery)) {
            this.mTypeaheadHeader.A04(this.mSearchQuery);
        }
        this.mTypeaheadHeader.A03("Search Quick Experiments");
        getScrollingViewProxy().AAD(new AnonymousClass1GX() {
            public void onScrollStateChanged(C238133Ar r3, int i) {
                int A03 = AnonymousClass0fD.A03(-1769412514);
                if (i == 1) {
                    OverlayConfigEditFragment.this.mTypeaheadHeader.A01();
                }
                AnonymousClass0fD.A0A(444555902, A03);
            }
        });
        getScrollingViewProxy().CEd().setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        getScrollingViewProxy().ENw(this.mAdapter);
        setItems(this.mOverlayConfigsList, false);
    }
}

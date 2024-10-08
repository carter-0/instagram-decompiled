package com.instagram.debug.devoptions.zero;

import X.00k;
import X.0qQ;
import X.0xY;
import X.0xa;
import X.1Al;
import X.1An;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C227642jf;
import X.C355568Qm;
import X.DbW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ZeroFeatureOverrideFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public final AnonymousClass0eM enabledFeaturesStore$delegate = AnonymousClass0eN.A01(new ZeroFeatureOverrideFragment$enabledFeaturesStore$2(this));
    public IgEditText featureText;
    public final AnonymousClass0eM featuresAdapter$delegate = AnonymousClass0eN.A01(new ZeroFeatureOverrideFragment$featuresAdapter$2(this));
    public RecyclerView featuresList;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public final class EnabledFeaturesStore {
        public final List features;
        public final 0xa sharedPreferences;

        public EnabledFeaturesStore(UserSession userSession) {
            0qQ.A0B(userSession, 1);
            ArrayList arrayList = new ArrayList();
            this.features = arrayList;
            0xa A03 = 1Al.A01(userSession).A03(1An.A3d);
            this.sharedPreferences = A03;
            Iterable stringSet = A03.getStringSet("zero_overridden_features", (Set) null);
            arrayList.addAll(00k.A0X(stringSet == null ? new HashSet() : stringSet));
        }

        public final void add(String str) {
            0qQ.A0B(str, 0);
            if (!this.features.contains(str)) {
                this.features.add(str);
                0xY AR4 = this.sharedPreferences.AR4();
                AR4.E5h("zero_overridden_features", new HashSet(this.features));
                AR4.apply();
            }
        }

        public final int count() {
            return this.features.size();
        }

        public final String get(int i) {
            return AnonymousClass7TE.A19(this.features, i);
        }

        public final void remove(int i) {
            this.features.remove(i);
            0xY AR4 = this.sharedPreferences.AR4();
            AR4.E5h("zero_overridden_features", new HashSet(this.features));
            AR4.apply();
        }
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Override Enabled Features");
    }

    public String getModuleName() {
        return "ZeroFeatureOverrideFragment";
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InputMethodManager A07 = C13991Tnr.A07(requireContext());
        RecyclerView A0G = C13990Tnq.A0G(view);
        this.featuresList = A0G;
        if (A0G == null) {
            str = "featuresList";
        } else {
            A0G.setAdapter(getFeaturesAdapter());
            IgEditText igEditText = (IgEditText) view.findViewById(R.id.new_feature_text);
            this.featureText = igEditText;
            if (igEditText == null) {
                str = "featureText";
            } else {
                igEditText.setOnEditorActionListener(new ZeroFeatureOverrideFragment$onViewCreated$1(this, A07));
                setupSwipeToDelete();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* access modifiers changed from: private */
    public final EnabledFeaturesStore getEnabledFeaturesStore() {
        return (EnabledFeaturesStore) this.enabledFeaturesStore$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ZeroFeatureOverrideAdapter getFeaturesAdapter() {
        return (ZeroFeatureOverrideAdapter) this.featuresAdapter$delegate.getValue();
    }

    private final void setupSwipeToDelete() {
        ZeroFeatureOverrideFragment$setupSwipeToDelete$callback$1 zeroFeatureOverrideFragment$setupSwipeToDelete$callback$1 = new ZeroFeatureOverrideFragment$setupSwipeToDelete$callback$1(this);
        zeroFeatureOverrideFragment$setupSwipeToDelete$callback$1.mDefaultDragDirs = 12;
        zeroFeatureOverrideFragment$setupSwipeToDelete$callback$1.mDefaultSwipeDirs = 12;
        C355568Qm r1 = new C355568Qm(zeroFeatureOverrideFragment$setupSwipeToDelete$callback$1);
        RecyclerView recyclerView = this.featuresList;
        if (recyclerView == null) {
            0qQ.A0F("featuresList");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A0A(recyclerView);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(603496869);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_zero_feature_override, viewGroup, false);
        AnonymousClass0fD.A09(-1692699624, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

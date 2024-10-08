package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C249703kE;
import X.DbT;
import X.DbW;
import X.DbX;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment;

public final class ZeroFeatureOverrideAdapter extends 2Rw {
    public final ZeroFeatureOverrideFragment.EnabledFeaturesStore featuresStore;

    public final class FeatureItemViewHolder extends C249703kE {
        public final TextView featureText;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FeatureItemViewHolder(View view) {
            super(view);
            0qQ.A0B(view, 1);
            this.featureText = DbW.A0B(view, R.id.feature_text);
        }

        public final TextView getFeatureText() {
            return this.featureText;
        }
    }

    public ZeroFeatureOverrideAdapter(ZeroFeatureOverrideFragment.EnabledFeaturesStore enabledFeaturesStore) {
        0qQ.A0B(enabledFeaturesStore, 1);
        this.featuresStore = enabledFeaturesStore;
    }

    public void onBindViewHolder(C249703kE r3, int i) {
        0qQ.A0B(r3, 0);
        ((FeatureItemViewHolder) r3).featureText.setText(AnonymousClass7TE.A19(this.featuresStore.features, i));
    }

    public C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new FeatureItemViewHolder(DbT.A0D(A0F, viewGroup, R.layout.zero_feature_list_row, false));
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1713880661);
        int size = this.featuresStore.features.size();
        AnonymousClass0fD.A0A(-94803003, A03);
        return size;
    }
}

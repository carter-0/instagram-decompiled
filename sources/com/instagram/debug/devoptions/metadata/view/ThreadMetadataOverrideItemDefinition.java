package com.instagram.debug.devoptions.metadata.view;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C232232tF;
import X.C232262tL;
import X.C249703kE;
import X.DbT;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder;

public final class ThreadMetadataOverrideItemDefinition extends C232232tF {
    public final ThreadMetadataOverrideViewHolder.Delegate delegate;

    public ThreadMetadataOverrideItemDefinition(ThreadMetadataOverrideViewHolder.Delegate delegate2) {
        0qQ.A0B(delegate2, 1);
        this.delegate = delegate2;
    }

    public ThreadMetadataOverrideViewHolder createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new ThreadMetadataOverrideViewHolder(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_metadata_override_item, false), this.delegate);
    }

    public /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
        ThreadMetadataOverride threadMetadataOverride = (ThreadMetadataOverride) r1;
        ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = (ThreadMetadataOverrideViewHolder) r2;
        AnonymousClass7TG.A1N(threadMetadataOverride, threadMetadataOverrideViewHolder);
        threadMetadataOverrideViewHolder.bind(threadMetadataOverride);
    }

    public Class modelClass() {
        return ThreadMetadataOverride.class;
    }

    public void bind(ThreadMetadataOverride threadMetadataOverride, ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder) {
        AnonymousClass7TG.A1N(threadMetadataOverride, threadMetadataOverrideViewHolder);
        threadMetadataOverrideViewHolder.bind(threadMetadataOverride);
    }
}

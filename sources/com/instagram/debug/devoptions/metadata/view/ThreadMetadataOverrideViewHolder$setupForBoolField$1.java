package com.instagram.debug.devoptions.metadata.view;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C249703kE;
import X.C358248ab;
import X.DbS;
import X.DbT;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;

public final class ThreadMetadataOverrideViewHolder$setupForBoolField$1 implements View.OnClickListener {
    public final /* synthetic */ ThreadMetadataOverride $model;
    public final /* synthetic */ ThreadMetadataOverrideViewHolder this$0;

    public ThreadMetadataOverrideViewHolder$setupForBoolField$1(ThreadMetadataOverride threadMetadataOverride, ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder) {
        this.$model = threadMetadataOverride;
        this.this$0 = threadMetadataOverrideViewHolder;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-673201181);
        C358248ab A0Y = DbS.A0Y(view.getContext());
        final ThreadMetadataOverride threadMetadataOverride = this.$model;
        final ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = this.this$0;
        A0Y.A0c(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadMetadataOverride.this.update(AnonymousClass7TE.A0v());
                ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = threadMetadataOverrideViewHolder;
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                threadMetadataOverrideViewHolder.delegate.onMetadataOverrideValueChanged();
            }
        }, "True");
        final ThreadMetadataOverride threadMetadataOverride2 = this.$model;
        final ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder2 = this.this$0;
        A0Y.A0a(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadMetadataOverride.this.update(AnonymousClass7TE.A0u());
                ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = threadMetadataOverrideViewHolder2;
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                threadMetadataOverrideViewHolder.delegate.onMetadataOverrideValueChanged();
            }
        }, "False");
        DbT.A1V(A0Y);
        AnonymousClass0fD.A0C(-1252189080, A05);
    }
}

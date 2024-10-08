package com.instagram.debug.devoptions.signalsplayground.view;

import X.AnonymousClass0fD;
import X.C249703kE;
import android.view.View;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;

public final class CreatorInspirationSignalsPlaygroundSignalRowViewHolder$bind$2 implements View.OnClickListener {
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals $signal;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalRowViewHolder this$0;

    public CreatorInspirationSignalsPlaygroundSignalRowViewHolder$bind$2(CreatorInspirationSignalsPlaygroundSignalRowViewHolder creatorInspirationSignalsPlaygroundSignalRowViewHolder, CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals) {
        this.this$0 = creatorInspirationSignalsPlaygroundSignalRowViewHolder;
        this.$signal = signals;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(925491384);
        CreatorInspirationSignalsPlaygroundSignalRowViewHolder creatorInspirationSignalsPlaygroundSignalRowViewHolder = this.this$0;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        creatorInspirationSignalsPlaygroundSignalRowViewHolder.delegate.onSignalRowClick(this.$signal);
        AnonymousClass0fD.A0C(1009243037, A05);
    }
}

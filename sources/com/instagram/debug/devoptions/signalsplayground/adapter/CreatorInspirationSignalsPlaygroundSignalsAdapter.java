package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.0qQ;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.DbT;
import X.DbX;
import X.DbZ;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundSignalRowViewHolder;
import java.util.ArrayList;
import java.util.List;

public final class CreatorInspirationSignalsPlaygroundSignalsAdapter extends 2Rw {
    public final CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate delegate;
    public final ArrayList signals = AnonymousClass7TE.A1C();

    public CreatorInspirationSignalsPlaygroundSignalsAdapter(CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate delegate2) {
        0qQ.A0B(delegate2, 1);
        this.delegate = delegate2;
    }

    public void onBindViewHolder(CreatorInspirationSignalsPlaygroundSignalRowViewHolder creatorInspirationSignalsPlaygroundSignalRowViewHolder, int i) {
        0qQ.A0B(creatorInspirationSignalsPlaygroundSignalRowViewHolder, 0);
        creatorInspirationSignalsPlaygroundSignalRowViewHolder.bind((CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals) DbZ.A0g(this.signals, i));
    }

    public CreatorInspirationSignalsPlaygroundSignalRowViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CreatorInspirationSignalsPlaygroundSignalRowViewHolder(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_signal_row_item, false), this.delegate);
    }

    public final void setSignals(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = this.signals;
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1315865076);
        int size = this.signals.size();
        AnonymousClass0fD.A0A(685069504, A03);
        return size;
    }
}

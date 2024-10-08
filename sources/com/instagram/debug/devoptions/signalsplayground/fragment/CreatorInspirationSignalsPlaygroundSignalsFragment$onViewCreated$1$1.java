package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.02o;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundSignalsAdapter;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel;

public final class CreatorInspirationSignalsPlaygroundSignalsFragment$onViewCreated$1$1 implements 02o {
    public final /* synthetic */ IgTextView $errorText;
    public final /* synthetic */ IgTextView $headerText;
    public final /* synthetic */ View $loadingSpinner;
    public final /* synthetic */ RecyclerView $signalsRecyclerView;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalsFragment this$0;

    public CreatorInspirationSignalsPlaygroundSignalsFragment$onViewCreated$1$1(IgTextView igTextView, IgTextView igTextView2, RecyclerView recyclerView, View view, CreatorInspirationSignalsPlaygroundSignalsFragment creatorInspirationSignalsPlaygroundSignalsFragment) {
        this.$errorText = igTextView;
        this.$headerText = igTextView2;
        this.$signalsRecyclerView = recyclerView;
        this.$loadingSpinner = view;
        this.this$0 = creatorInspirationSignalsPlaygroundSignalsFragment;
    }

    public final Object emit(CreatorInspirationSignalsPlaygroundSignalsViewModel.UiState uiState, AnonymousClass4D7 r6) {
        View view;
        if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalsViewModel.UiState.Loading) {
            this.$errorText.setVisibility(8);
            this.$headerText.setVisibility(8);
            this.$signalsRecyclerView.setVisibility(8);
            view = this.$loadingSpinner;
        } else if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalsViewModel.UiState.Loaded) {
            CreatorInspirationSignalsPlaygroundSignalsAdapter creatorInspirationSignalsPlaygroundSignalsAdapter = this.this$0.signalsAdapter;
            if (creatorInspirationSignalsPlaygroundSignalsAdapter == null) {
                0qQ.A0F("signalsAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            creatorInspirationSignalsPlaygroundSignalsAdapter.setSignals(((CreatorInspirationSignalsPlaygroundSignalsViewModel.UiState.Loaded) uiState).signals);
            this.$errorText.setVisibility(8);
            this.$loadingSpinner.setVisibility(8);
            this.$headerText.setVisibility(0);
            view = this.$signalsRecyclerView;
        } else if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalsViewModel.UiState.Error) {
            this.$loadingSpinner.setVisibility(8);
            this.$headerText.setVisibility(8);
            this.$signalsRecyclerView.setVisibility(8);
            view = this.$errorText;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        view.setVisibility(0);
        return C60340gF.A00;
    }
}

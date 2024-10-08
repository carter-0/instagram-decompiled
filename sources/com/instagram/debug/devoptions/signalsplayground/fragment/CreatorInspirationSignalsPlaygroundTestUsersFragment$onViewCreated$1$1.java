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
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundTestUsersAdapter;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel;

public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1 implements 02o {
    public final /* synthetic */ IgTextView $errorText;
    public final /* synthetic */ IgTextView $headerText;
    public final /* synthetic */ View $loadingSpinner;
    public final /* synthetic */ RecyclerView $testUsersRecyclerView;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUsersFragment this$0;

    public CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1(IgTextView igTextView, IgTextView igTextView2, RecyclerView recyclerView, View view, CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment) {
        this.$errorText = igTextView;
        this.$headerText = igTextView2;
        this.$testUsersRecyclerView = recyclerView;
        this.$loadingSpinner = view;
        this.this$0 = creatorInspirationSignalsPlaygroundTestUsersFragment;
    }

    public final Object emit(CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState uiState, AnonymousClass4D7 r6) {
        View view;
        if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Loading) {
            this.$errorText.setVisibility(8);
            this.$headerText.setVisibility(8);
            this.$testUsersRecyclerView.setVisibility(8);
            view = this.$loadingSpinner;
        } else if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Loaded) {
            CreatorInspirationSignalsPlaygroundTestUsersAdapter creatorInspirationSignalsPlaygroundTestUsersAdapter = this.this$0.testUsersAdapter;
            if (creatorInspirationSignalsPlaygroundTestUsersAdapter == null) {
                0qQ.A0F("testUsersAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            creatorInspirationSignalsPlaygroundTestUsersAdapter.setTestUserListItems(((CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Loaded) uiState).testUserListItems);
            this.$errorText.setVisibility(8);
            this.$loadingSpinner.setVisibility(8);
            this.$headerText.setVisibility(0);
            view = this.$testUsersRecyclerView;
        } else if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Error) {
            this.$loadingSpinner.setVisibility(8);
            this.$headerText.setVisibility(8);
            this.$testUsersRecyclerView.setVisibility(8);
            view = this.$errorText;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        view.setVisibility(0);
        return C60340gF.A00;
    }
}

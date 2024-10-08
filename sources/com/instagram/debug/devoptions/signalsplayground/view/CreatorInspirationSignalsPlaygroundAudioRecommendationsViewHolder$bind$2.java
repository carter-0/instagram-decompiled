package com.instagram.debug.devoptions.signalsplayground.view;

import X.AnonymousClass0fD;
import X.C16181Uq6;
import android.view.View;

public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$bind$2 implements View.OnClickListener {
    public final /* synthetic */ C16181Uq6 $audioTrackItem;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder this$0;

    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$bind$2(CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, C16181Uq6 uq6) {
        this.this$0 = creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
        this.$audioTrackItem = uq6;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(911407087);
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.delegate.onViewAudioDetailsClick(this.$audioTrackItem);
        AnonymousClass0fD.A0C(-1113682309, A05);
    }
}

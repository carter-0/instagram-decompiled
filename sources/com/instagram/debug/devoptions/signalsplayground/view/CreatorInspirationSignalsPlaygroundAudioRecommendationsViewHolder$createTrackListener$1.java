package com.instagram.debug.devoptions.signalsplayground.view;

import X.C16181Uq6;
import X.C63348KvV;
import X.C65502LuQ;

public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1 extends C65502LuQ {
    public final /* synthetic */ C16181Uq6 $audioTrackItem;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder this$0;

    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder$createTrackListener$1(CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, C16181Uq6 uq6) {
        this.this$0 = creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
        this.$audioTrackItem = uq6;
    }

    private final int getPreviewTrackStartTimeMs(int i) {
        return C63348KvV.A00(i, 30000, this.$audioTrackItem.A0C);
    }

    public void onCurrentTrackPlayTimeUpdated(int i) {
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        int previewTrackStartTimeMs = getPreviewTrackStartTimeMs(creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.AzN());
        float min = ((float) (i - previewTrackStartTimeMs)) / ((float) Math.min(30000, this.this$0.musicPlayer.AzN() - previewTrackStartTimeMs));
        if (min >= 1.0f) {
            this.this$0.musicPlayer.EHu(false);
        } else {
            this.this$0.musicPreviewButton.setProgress(min);
        }
    }

    public void onCurrentTrackStopped() {
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.AHY();
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.bindTrackState(this.$audioTrackItem.A02);
    }

    public void onCurrentTrackPrepared(int i) {
        int previewTrackStartTimeMs = getPreviewTrackStartTimeMs(i);
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = this.this$0;
        int i2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.musicPlayer.seekTo(previewTrackStartTimeMs);
        this.this$0.musicPlayer.E2p();
        this.this$0.bindTrackState(this.$audioTrackItem.A02);
    }
}

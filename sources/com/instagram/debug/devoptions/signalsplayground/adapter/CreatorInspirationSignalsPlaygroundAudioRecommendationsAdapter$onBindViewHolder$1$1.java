package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.0qQ;
import X.C226632hb;
import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter$onBindViewHolder$1$1 implements C226632hb {
    public static final CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter$onBindViewHolder$1$1 INSTANCE = new CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter$onBindViewHolder$1$1();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blurWithAlpha(bitmap, 0.25f, 6, 200);
    }
}

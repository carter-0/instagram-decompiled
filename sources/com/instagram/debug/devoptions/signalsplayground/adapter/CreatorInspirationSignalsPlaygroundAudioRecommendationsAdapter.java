package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.0qQ;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.C16181Uq6;
import X.C234502xy;
import X.C51973G9u;
import X.DbT;
import X.DbV;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter extends 2Rw {
    public static final int ALPHA = 200;
    public static final int BLUR_RADIUS = 6;
    public static final Companion Companion = new Object();
    public static final float SCALE_RATIO = 0.25f;
    public final AnonymousClass0iw analyticsModule;
    public final ArrayList audioTrackItems = AnonymousClass7TE.A1C();
    public final CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate delegate;
    public final int itemHeight;
    public final int itemWidth;
    public final C234502xy musicPlayer;

    public CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter(int i, int i2, C234502xy r4, AnonymousClass0iw r5, CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate delegate2) {
        C51973G9u.A0r(3, r4, r5, delegate2);
        this.itemWidth = i;
        this.itemHeight = i2;
        this.musicPlayer = r4;
        this.analyticsModule = r5;
        this.delegate = delegate2;
    }

    public void onBindViewHolder(CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, int i) {
        0qQ.A0B(creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder, 0);
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.backgroundImageBlur.A0I = CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter$onBindViewHolder$1$1.INSTANCE;
        Object obj = this.audioTrackItems.get(i);
        0qQ.A07(obj);
        creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.bind((C16181Uq6) obj, this.itemWidth, this.itemHeight, this.analyticsModule);
    }

    public CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.PREVIEW_TRACK_DURATION_MS;
        return new CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_audio_recommendation_item, false), this.delegate, this.musicPlayer);
    }

    public final void setAudioTrackItems(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = this.audioTrackItems;
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-277329341);
        int size = this.audioTrackItems.size();
        AnonymousClass0fD.A0A(-1171356266, A03);
        return size;
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}

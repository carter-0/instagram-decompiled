package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.C250663lr;
import X.C41846B3n;
import X.C41848B3p;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundAudioMetadataImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundAudioMetadata {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1789564771;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioMetadataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public boolean getAllowMediaCreationWithMusic() {
        return getRequiredBooleanField(0, "allow_media_creation_with_music");
    }

    public boolean hasAllowMediaCreationWithMusic() {
        return true;
    }

    public boolean hasIsBookmarked() {
        return true;
    }

    public boolean isBookmarked() {
        return getRequiredBooleanField(1, "is_bookmarked");
    }

    public boolean isTrendingInClips() {
        return getCoercedBooleanField(4, "is_trending_in_clips");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public String getFormattedClipsMediaCount() {
        return A0A("formatted_clips_media_count");
    }

    public int getTrendRank() {
        return A00("trend_rank");
    }

    public boolean hasIsTrendingInClips() {
        return hasFieldValue("is_trending_in_clips");
    }

    public boolean hasTrendRank() {
        return hasFieldValue("trend_rank");
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4LF r5 = AnonymousClass4LF.A00;
        return C41846B3n.A0M(AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "allow_media_creation_with_music"), C41848B3p.A0m(r5), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "trend_rank"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "formatted_clips_media_count"), AnonymousClass7TE.A0f(r5, "is_trending_in_clips"));
    }

    public CreatorInspirationSignalsPlaygroundAudioMetadataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioMetadataImpl() {
        super(TYPE_TAG);
    }
}

package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.C250663lr;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundTrackDataImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundTrackData {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1732907703;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundTrackDataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public boolean getAllowsSaving() {
        return getRequiredBooleanField(0, "allows_saving");
    }

    public String getCoverArtworkUri() {
        return C41847B3o.A1A(this, "cover_artwork_uri", 4);
    }

    public String getDisplayArtist() {
        return getOptionalStringField(6, "display_artist");
    }

    public int getDurationInMs() {
        return getCoercedIntField(7, "duration_in_ms");
    }

    public boolean hasAllowsSaving() {
        return true;
    }

    public boolean hasIsExplicit() {
        return true;
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public String getAudioAssetId() {
        return A08("audio_asset_id");
    }

    public String getAudioClusterId() {
        return A09("audio_cluster_id");
    }

    public String getCoverArtworkThumbnailUri() {
        return A0A("cover_artwork_thumbnail_uri");
    }

    public String getDashManifest() {
        return A0C("dash_manifest");
    }

    public String getFastStartProgressiveDownloadUrl() {
        return A0D("fast_start_progressive_download_url");
    }

    public boolean getHasLyrics() {
        return getCoercedBooleanField(9, "has_lyrics");
    }

    public ImmutableList getHighlightStartTimesInMs() {
        return getCoercedCompactedIntListField(10, "highlight_start_times_in_ms");
    }

    public String getId() {
        return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 11);
    }

    public String getProgressiveDownloadUrl() {
        return getOptionalStringField(14, "progressive_download_url");
    }

    public String getSubtitle() {
        return getOptionalStringField(15, "subtitle");
    }

    public String getTitle() {
        return getOptionalStringField(16, DialogModule.KEY_TITLE);
    }

    public boolean hasDurationInMs() {
        return hasFieldValue("duration_in_ms");
    }

    public boolean hasHasLyrics() {
        return hasFieldValue("has_lyrics");
    }

    public boolean hasIsEligibleForAudioEffects() {
        return hasFieldValue("is_eligible_for_audio_effects");
    }

    public boolean isEligibleForAudioEffects() {
        return getCoercedBooleanField(12, "is_eligible_for_audio_effects");
    }

    public boolean isExplicit() {
        return getRequiredBooleanField(13, "is_explicit");
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        AnonymousClass4L7 A0X = C41848B3p.A0X(r2);
        AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0X, AnonymousClass7TE.A0f(r0, "audio_asset_id"), AnonymousClass7TE.A0f(r0, "audio_cluster_id"), AnonymousClass7TE.A0f(r0, "cover_artwork_thumbnail_uri"), C41848B3p.A0Z(r0), AnonymousClass7TE.A0f(r0, "dash_manifest"), AnonymousClass7TE.A0f(r0, "display_artist"), C41847B3o.A0C(AnonymousClass4L8.A00), AnonymousClass7TE.A0f(r0, "fast_start_progressive_download_url"), AnonymousClass7TE.A0f(r2, "has_lyrics"), C41848B3p.A0G(), C41846B3n.A09(r0), AnonymousClass7TE.A0f(r2, "is_eligible_for_audio_effects"), C41848B3p.A0K(r2), AnonymousClass7TE.A0f(r0, "progressive_download_url"), C41847B3o.A0O(r0), C41845B3m.A0I(r0)});
    }

    public CreatorInspirationSignalsPlaygroundTrackDataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundTrackDataImpl() {
        super(TYPE_TAG);
    }
}

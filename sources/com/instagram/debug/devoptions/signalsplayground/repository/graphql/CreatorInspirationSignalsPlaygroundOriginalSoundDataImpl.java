package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.HN9;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundOriginalSoundData {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1938538694;

    public final class AudioParts extends C250663lr implements CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1157816568;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return AudioParts.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public String getDisplayArtist() {
            return C41847B3o.A1A(this, "display_artist", 1);
        }

        public String getDisplayTitle() {
            return C41847B3o.A1A(this, "display_title", 2);
        }

        public String getThumbnailUri() {
            return C41847B3o.A1A(this, "thumbnail_uri", 3);
        }

        public boolean hasIsExplicit() {
            return true;
        }

        public boolean isExplicit() {
            return getRequiredBooleanField(0, "is_explicit");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0K = C41848B3p.A0K(AnonymousClass4LF.A00);
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(AnonymousClass7TE.A0g(r0), A0K, C41848B3p.A0c(r0), C41848B3p.A0k(r0), "thumbnail_uri");
        }

        public AudioParts(int i) {
            super(i);
        }

        public AudioParts() {
            super(TYPE_TAG);
        }
    }

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class ConsumptionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundOriginalSoundData.ConsumptionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 769353394;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ConsumptionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean hasIsTrendingInClips() {
            return true;
        }

        public boolean isTrendingInClips() {
            return getRequiredBooleanField(0, "is_trending_in_clips");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ConsumptionInfo(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41846B3n.A0J(), "is_trending_in_clips");
        }

        public ConsumptionInfo() {
            super(TYPE_TAG);
        }
    }

    public final class IgArtist extends C250663lr implements CreatorInspirationSignalsPlaygroundOriginalSoundData.IgArtist {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -820409681;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgArtist.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser() {
            return (CreatorInspirationSignalsPlaygroundTestUser) A01(CreatorInspirationSignalsPlaygroundTestUserImpl.class, CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundTestUserImpl.class, "CreatorInspirationSignalsPlaygroundTestUser", CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        public IgArtist(int i) {
            super(i);
        }

        public IgArtist() {
            super(TYPE_TAG);
        }
    }

    public String getAudioAssetId() {
        return C41847B3o.A1A(this, "audio_asset_id", 0);
    }

    public String getFormattedClipsMediaCount() {
        return getOptionalStringField(6, "formatted_clips_media_count");
    }

    public String getOriginalAudioTitle() {
        return C41847B3o.A1A(this, "original_audio_title", 1);
    }

    public boolean hasIsExplicit() {
        return true;
    }

    public boolean hasShouldMuteAudio() {
        return true;
    }

    public boolean isExplicit() {
        return getRequiredBooleanField(5, "is_explicit");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public ImmutableList getAudioParts() {
        return getRequiredCompactedTreeListField(4, "audio_parts", AudioParts.class, AudioParts.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundOriginalSoundData.ConsumptionInfo getConsumptionInfo() {
        C250663lr requiredTreeField = getRequiredTreeField(7, "consumption_info", ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
        0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.ConsumptionInfo");
        return (ConsumptionInfo) requiredTreeField;
    }

    public String getDashManifest() {
        return C41847B3o.A1A(this, "dash_manifest", 9);
    }

    public int getDurationInMs() {
        return getCoercedIntField(12, "duration_in_ms");
    }

    public CreatorInspirationSignalsPlaygroundOriginalSoundData.IgArtist getIgArtist() {
        C250663lr requiredTreeField = getRequiredTreeField(2, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
        0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.IgArtist");
        return (IgArtist) requiredTreeField;
    }

    public HN9 getOriginalAudioSubtype() {
        return (HN9) C41847B3o.A10(this, HN9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "original_audio_subtype", 3);
    }

    public String getProgressiveDownloadUrl() {
        return C41847B3o.A1A(this, "progressive_download_url", 8);
    }

    public boolean getShouldMuteAudio() {
        return getRequiredBooleanField(13, "should_mute_audio");
    }

    public int getTrendRank() {
        return getCoercedIntField(10, "trend_rank");
    }

    public boolean hasDurationInMs() {
        return hasFieldValue("duration_in_ms");
    }

    public boolean hasIsEligibleForAudioEffects() {
        return hasFieldValue("is_eligible_for_audio_effects");
    }

    public boolean hasTrendRank() {
        return hasFieldValue("trend_rank");
    }

    public boolean isEligibleForAudioEffects() {
        return getCoercedBooleanField(11, "is_eligible_for_audio_effects");
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0a = C41848B3p.A0a(r3);
        AnonymousClass4L7 A0U = C41848B3p.A0U(r3);
        AnonymousClass4Kp A06 = C41848B3p.A06(IgArtist.class, IgArtist.TYPE_TAG);
        AnonymousClass4L7 A0i = C41848B3p.A0i(r3);
        AnonymousClass4Kp A08 = C41848B3p.A08(AudioParts.class, AudioParts.TYPE_TAG);
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        AnonymousClass4L7 A0K = C41848B3p.A0K(r1);
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "formatted_clips_media_count");
        AnonymousClass4Kp A05 = C41848B3p.A05(ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
        AnonymousClass4L7 A0R = C41848B3p.A0R(r3);
        AnonymousClass4L7 A0j = C41848B3p.A0j(r3);
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0a, A0U, A06, A0i, A08, A0K, A0f, A05, A0R, A0j, AnonymousClass7TE.A0f(r2, "trend_rank"), AnonymousClass7TE.A0f(r1, "is_eligible_for_audio_effects"), C41847B3o.A0C(r2), C41848B3p.A0f(r1)});
    }

    public CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl() {
        super(TYPE_TAG);
    }
}

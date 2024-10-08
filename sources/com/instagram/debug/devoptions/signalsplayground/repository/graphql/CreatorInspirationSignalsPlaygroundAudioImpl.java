package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass4Kx;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C41845B3m;
import X.C41847B3o;
import com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundAudioImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundAudio {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -883834309;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class Metadata extends C250663lr implements CreatorInspirationSignalsPlaygroundAudio.Metadata {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -271941014;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Metadata.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundAudioMetadata asCreatorInspirationSignalsPlaygroundAudioMetadata() {
            return (CreatorInspirationSignalsPlaygroundAudioMetadata) A01(CreatorInspirationSignalsPlaygroundAudioMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioMetadataImpl.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundAudioMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioMetadata", CreatorInspirationSignalsPlaygroundAudioMetadataImpl.TYPE_TAG);
        }

        public Metadata(int i) {
            super(i);
        }

        public Metadata() {
            super(TYPE_TAG);
        }
    }

    public final class OriginalSound extends C250663lr implements CreatorInspirationSignalsPlaygroundAudio.OriginalSound {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1109401295;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return OriginalSound.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundOriginalSoundData asCreatorInspirationSignalsPlaygroundOriginalSoundData() {
            return (CreatorInspirationSignalsPlaygroundOriginalSoundData) A01(CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.class, CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.class, "CreatorInspirationSignalsPlaygroundOriginalSoundData", CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.TYPE_TAG);
        }

        public OriginalSound(int i) {
            super(i);
        }

        public OriginalSound() {
            super(TYPE_TAG);
        }
    }

    public final class Track extends C250663lr implements CreatorInspirationSignalsPlaygroundAudio.Track {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1339965688;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Track.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundTrackData asCreatorInspirationSignalsPlaygroundTrackData() {
            return (CreatorInspirationSignalsPlaygroundTrackData) A01(CreatorInspirationSignalsPlaygroundTrackDataImpl.class, CreatorInspirationSignalsPlaygroundTrackDataImpl.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundTrackDataImpl.class, "CreatorInspirationSignalsPlaygroundTrackData", CreatorInspirationSignalsPlaygroundTrackDataImpl.TYPE_TAG);
        }

        public Track(int i) {
            super(i);
        }

        public Track() {
            super(TYPE_TAG);
        }
    }

    public TrackOrOriginalSoundSchemaIntf asApiTypeModel(1E6 r5) {
        0qQ.A0B(r5, 0);
        ImmutablePandoTrackOrOriginalSoundSchema immutablePandoTrackOrOriginalSoundSchema = (ImmutablePandoTrackOrOriginalSoundSchema) reinterpret(ImmutablePandoTrackOrOriginalSoundSchema.class);
        immutablePandoTrackOrOriginalSoundSchema.E9T(new 1E9(r5, 6, false));
        return immutablePandoTrackOrOriginalSoundSchema;
    }

    public TrackOrOriginalSoundSchema asRestModel__DO_NOT_USE(1E6 r5) {
        0qQ.A0B(r5, 0);
        return ((ImmutablePandoTrackOrOriginalSoundSchema) reinterpret(ImmutablePandoTrackOrOriginalSoundSchema.class)).FCx(new 1E9(r5, 6, false));
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public CreatorInspirationSignalsPlaygroundAudio.Metadata getMetadata() {
        return (CreatorInspirationSignalsPlaygroundAudio.Metadata) A03(Metadata.class, "metadata", Metadata.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundAudio.OriginalSound getOriginalSound() {
        return (CreatorInspirationSignalsPlaygroundAudio.OriginalSound) A04(OriginalSound.class, "original_sound", OriginalSound.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundAudio.Track getTrack() {
        return (CreatorInspirationSignalsPlaygroundAudio.Track) A02(Track.class, "track", Track.TYPE_TAG);
    }

    public AnonymousClass4Kx modelSelectionSet() {
        return C41847B3o.A0k(C41845B3m.A0C(Metadata.class, "metadata", Metadata.TYPE_TAG), C41845B3m.A0C(Track.class, "track", Track.TYPE_TAG), OriginalSound.class, "original_sound", OriginalSound.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundAudioImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioImpl() {
        super(TYPE_TAG);
    }
}

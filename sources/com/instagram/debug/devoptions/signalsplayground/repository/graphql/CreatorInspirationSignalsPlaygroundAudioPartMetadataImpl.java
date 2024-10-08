package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.C250663lr;
import X.C41847B3o;
import X.C41848B3p;
import X.UyX;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundAudioPartMetadata {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1712129853;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG;
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

    public String getMusicCanonicalId() {
        return C41847B3o.A1A(this, "music_canonical_id", 5);
    }

    public String getThumbnailUri() {
        return C41847B3o.A1A(this, "thumbnail_uri", 6);
    }

    public boolean hasIsBookmarked() {
        return true;
    }

    public boolean hasIsExplicit() {
        return true;
    }

    public boolean isBookmarked() {
        return getRequiredBooleanField(3, "is_bookmarked");
    }

    public boolean isExplicit() {
        return getRequiredBooleanField(4, "is_explicit");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public UyX getAudioType() {
        return (UyX) C41847B3o.A10(this, UyX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "audio_type", 0);
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0h = C41848B3p.A0h(r1);
        AnonymousClass4L7 A0c = C41848B3p.A0c(r1);
        AnonymousClass4L7 A0k = C41848B3p.A0k(r1);
        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0h, A0c, A0k, C41848B3p.A0m(r0), C41848B3p.A0K(r0), C41848B3p.A0d(r1), C41848B3p.A0Y(r1)});
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl() {
        super(TYPE_TAG);
    }
}

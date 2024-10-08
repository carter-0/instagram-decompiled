package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9PN;
import X.C250663lr;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.UyX;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl extends C250663lr implements CreatorInspirationSignalsPlaygroundAudioPartMetadata2 {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -2113477131;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class IgArtist extends C250663lr implements CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1202860027;

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

        public boolean isVerified() {
            return C41847B3o.A1b(this, 2);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getProfilePicUrl() {
            return A0A("profile_pic_url");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(r4, AnonymousClass7TF.A0I(r4), C41847B3o.A0T(r4), C41846B3n.A0H(AnonymousClass4LF.A00), "profile_pic_url");
        }

        public IgArtist(int i) {
            super(i);
        }

        public String getId() {
            return C41845B3m.A0k(this);
        }

        public String getUsername() {
            return A08(AnonymousClass9PN.A00());
        }

        public boolean hasIsVerified() {
            return C41847B3o.A1a(this);
        }

        public IgArtist() {
            super(TYPE_TAG);
        }
    }

    public String getDisplayArtist() {
        return C41847B3o.A1A(this, "display_artist", 1);
    }

    public String getDisplayTitle() {
        return C41847B3o.A1A(this, "display_title", 2);
    }

    public String getMusicCanonicalId() {
        return C41847B3o.A1A(this, "music_canonical_id", 6);
    }

    public String getThumbnailUri() {
        return C41847B3o.A1A(this, "thumbnail_uri", 7);
    }

    public boolean hasIsBookmarked() {
        return true;
    }

    public boolean hasIsExplicit() {
        return true;
    }

    public boolean isBookmarked() {
        return getRequiredBooleanField(4, "is_bookmarked");
    }

    public boolean isExplicit() {
        return getRequiredBooleanField(5, "is_explicit");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public UyX getAudioType() {
        return (UyX) C41847B3o.A10(this, UyX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "audio_type", 0);
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist getIgArtist() {
        return (CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist) getOptionalTreeField(3, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0h = C41848B3p.A0h(r3);
        AnonymousClass4L7 A0c = C41848B3p.A0c(r3);
        AnonymousClass4L7 A0k = C41848B3p.A0k(r3);
        AnonymousClass4Kp A0C = C41845B3m.A0C(IgArtist.class, "ig_artist", IgArtist.TYPE_TAG);
        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0h, A0c, A0k, A0C, C41848B3p.A0m(r0), C41848B3p.A0K(r0), C41848B3p.A0d(r3), C41848B3p.A0Y(r3)});
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl() {
        super(TYPE_TAG);
    }
}

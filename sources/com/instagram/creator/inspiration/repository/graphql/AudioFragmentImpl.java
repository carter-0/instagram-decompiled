package com.instagram.creator.inspiration.repository.graphql;

import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;

public final class AudioFragmentImpl extends C250663lr implements C250673ls {

    public final class Metadata extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4LF r2 = AnonymousClass4LF.A00;
            return C41847B3o.A0j(AnonymousClass4L8.A00, C41848B3p.A0m(r2), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "formatted_clips_media_count"), AnonymousClass7TE.A0f(r2, "is_trending_in_clips"), "trend_rank");
        }

        public Metadata() {
            super(1483975643);
        }
    }

    public final class OriginalSound extends C250663lr implements C250673ls {

        public final class AudioParts extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0K = C41848B3p.A0K(AnonymousClass4LF.A00);
                AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0U(AnonymousClass7TE.A0g(r0), A0K, C41848B3p.A0c(r0), "display_title");
            }

            public AudioParts() {
                super(1080001334);
            }
        }

        public final class IgArtist extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0U(r3, AnonymousClass7TF.A0I(r3), C41847B3o.A0T(r3), "profile_pic_url");
            }

            public IgArtist() {
                super(-54680151);
            }
        }

        public final class ConsumptionInfo extends C250663lr implements C250673ls {
            public ConsumptionInfo() {
                super(-711392543);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41846B3n.A0J(), "is_trending_in_clips");
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0a = C41848B3p.A0a(r3);
            AnonymousClass4L7 A0U = C41848B3p.A0U(r3);
            AnonymousClass4Kp A06 = C41848B3p.A06(IgArtist.class, -54680151);
            AnonymousClass4L7 A0i = C41848B3p.A0i(r3);
            AnonymousClass4Kp A08 = C41848B3p.A08(AudioParts.class, 1080001334);
            AnonymousClass4LF r2 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0a, A0U, A06, A0i, A08, C41848B3p.A0K(r2), AnonymousClass7TE.A0f(r3, "formatted_clips_media_count"), C41848B3p.A05(ConsumptionInfo.class, -711392543), C41848B3p.A0R(r3), C41848B3p.A0j(r3), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "trend_rank"), AnonymousClass7TE.A0f(r2, "is_eligible_for_audio_effects")});
        }

        public OriginalSound() {
            super(-368279371);
        }
    }

    public final class Track extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A09 = C41846B3n.A09(r2);
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "audio_cluster_id");
            AnonymousClass4L7 A0I = C41845B3m.A0I(r2);
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, "display_artist");
            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, "cover_artwork_thumbnail_uri");
            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A09, A0f, A0I, A0f2, A0f3, C41848B3p.A0K(r0), AnonymousClass7TE.A0f(r2, "progressive_download_url"), AnonymousClass7TE.A0f(r2, "dash_manifest"), AnonymousClass7TE.A0f(r2, "artist_id"), C41848B3p.A0G(), AnonymousClass7TE.A0f(r2, "audio_asset_id"), C41848B3p.A0Z(r2), AnonymousClass7TE.A0f(r0, "is_eligible_for_audio_effects"), C41847B3o.A0C(AnonymousClass4L8.A00), AnonymousClass7TE.A0f(r0, "has_lyrics"), C41848B3p.A0X(r0)});
        }

        public Track() {
            super(-1278535760);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return C41847B3o.A0k(C41845B3m.A0C(Track.class, "track", -1278535760), C41845B3m.A0C(OriginalSound.class, "original_sound", -368279371), Metadata.class, "metadata", 1483975643);
    }

    public AudioFragmentImpl() {
        super(-1423030943);
    }
}

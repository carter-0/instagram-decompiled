package com.instagram.reels.api;

import X.AnonymousClass000;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass69U;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C342787pA;
import X.C41845B3m;
import X.C41846B3n;

public final class ReelsTrayQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtApiV1FeedReelsTray extends C250663lr implements C250673ls {

        public final class Broadcasts extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0X(BroadcastFragmentImpl.class, "BroadcastFragment", 1811615736);
            }

            public Broadcasts() {
                super(1803191269);
            }
        }

        public final class PersonalizationFeatures extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(C342787pA.A00, "avg_core_sessions_per_day");
                AnonymousClass4L8 r4 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r4, "follow_count");
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                return C41846B3n.A0M(A0f, A0f2, AnonymousClass7TE.A0f(r1, "is_high_usage_likelihood"), AnonymousClass7TE.A0f(r1, "is_teen"), AnonymousClass7TE.A0f(r4, "stories_imp_bucket"));
            }

            public PersonalizationFeatures() {
                super(469207818);
            }
        }

        public final class StoryLikesConfig extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_enabled"), "ufi_type");
            }

            public StoryLikesConfig() {
                super(-539239447);
            }
        }

        public final class Tray extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0X(ReelDictFragmentImpl.class, "ReelDictFragment", 1884166355);
            }

            public Tray() {
                super(1044873890);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Broadcasts.class, "broadcasts", 1803191269);
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, AnonymousClass000.A00(1144));
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "cursor");
            AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "face_filter_nux_version");
            AnonymousClass4LF r2 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, A0f, A0f2, A0f3, AnonymousClass7TE.A0f(r2, AnonymousClass000.A00(1400)), AnonymousClass7TE.A0f(r2, AnonymousClass000.A00(1531)), AnonymousClass7TE.A0f(r3, AnonymousClass000.A00(1563)), AnonymousClass7TE.A0f(r3, AnonymousClass000.A00(1564)), AnonymousClass7TE.A0f(r3, AnonymousClass000.A00(1618)), C41845B3m.A0C(PersonalizationFeatures.class, AnonymousClass000.A00(1677), 469207818), AnonymousClass7TE.A0f(r3, AnonymousClass000.A00(1750)), AnonymousClass7TE.A0f(AnonymousClass69U.A00, "response_timestamp"), AnonymousClass7TE.A0f(r3, "sticker_version"), AnonymousClass7TE.A0f(r2, AnonymousClass000.A00(1849)), C41845B3m.A0C(StoryLikesConfig.class, "story_likes_config", -539239447), AnonymousClass7TE.A0f(r0, AnonymousClass000.A00(1853)), C41845B3m.A0A(AnonymousClass4Ks.A02(), Tray.class, "tray", 1044873890)});
        }

        public XdtApiV1FeedReelsTray() {
            super(1869972267);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtApiV1FeedReelsTray.class, "xdt_api__v1__feed__reels_tray(request_data:{\"page_size\":$page_size,\"reason\":$reason})", 1869972267);
    }

    public ReelsTrayQueryResponseImpl() {
        super(-1046115776);
    }
}

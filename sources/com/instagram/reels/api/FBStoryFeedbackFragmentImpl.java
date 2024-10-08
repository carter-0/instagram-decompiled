package com.instagram.reels.api;

import X.AnonymousClass000;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import com.facebook.react.modules.dialog.DialogModule;

public final class FBStoryFeedbackFragmentImpl extends C250663lr implements C250673ls {

    public final class EdgeStoryMediaViewers extends C250663lr implements C250673ls {

        public final class Edges extends C250663lr implements C250673ls {

            public final class EmojiReactions extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "reactor_id"), "reaction");
                }

                public EmojiReactions() {
                    super(-1242013829);
                }
            }

            public final class Node extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(FBStoryViewerFragmentImpl.class, "FBStoryViewerFragment", -47832053);
                }

                public Node() {
                    super(921598298);
                }
            }

            public final class Reply extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "replier_id"), DialogModule.KEY_MESSAGE);
                }

                public Reply() {
                    super(776447298);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0k(C41845B3m.A07(C41845B3m.A0A(AnonymousClass4Ks.A02(), EmojiReactions.class, "emoji_reactions", -1242013829), AnonymousClass000.A00(3343)), C41845B3m.A07(C41845B3m.A0C(Reply.class, "reply", 776447298), AnonymousClass000.A00(3344)), Node.class, "node", 921598298);
            }

            public Edges() {
                super(-1542550260);
            }
        }

        public final class PageInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "has_next_page");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "has_previous_page");
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return C41847B3o.A0j(r2, A0f, A0f2, AnonymousClass7TE.A0f(r2, "start_cursor"), "end_cursor");
            }

            public PageInfo() {
                super(-867972959);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41846B3n.A0K(C41845B3m.A0A(AnonymousClass4Ks.A02(), Edges.class, "edges", -1542550260), C41845B3m.A0C(PageInfo.class, "page_info", -867972959), C41845B3m.A07(C41846B3n.A03(), AnonymousClass000.A00(1454)));
        }

        public EdgeStoryMediaViewers() {
            super(697836456);
        }
    }

    public final EdgeStoryMediaViewers A0E() {
        return (EdgeStoryMediaViewers) A03(EdgeStoryMediaViewers.class, "edge_story_media_viewers(after:$after,before:$before,first:$first,last:$last)", 697836456);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{C41845B3m.A0C(EdgeStoryMediaViewers.class, "edge_story_media_viewers(after:$after,before:$before,first:$first,last:$last)", 697836456), C41845B3m.A07(AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "nonfriend_viewers_count"), AnonymousClass000.A00(1454))});
    }

    public FBStoryFeedbackFragmentImpl() {
        super(-1063303607);
    }
}

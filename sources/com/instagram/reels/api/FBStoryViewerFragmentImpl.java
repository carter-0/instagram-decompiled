package com.instagram.reels.api;

import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;

public final class FBStoryViewerFragmentImpl extends C250663lr implements C250673ls {

    public final class ProfilePhoto extends C250663lr implements C250673ls {

        public final class InlineXFBXPSProfilePhoto extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "url");
            }

            public InlineXFBXPSProfilePhoto() {
                super(-497406717);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0n(C41845B3m.A08(InlineXFBXPSProfilePhoto.class, "InlineXFBXPSProfilePhoto", -497406717), "XFBXPSProfilePhoto");
        }

        public ProfilePhoto() {
            super(-519054585);
        }
    }

    public final ProfilePhoto A0E() {
        return (ProfilePhoto) getOptionalTreeField(3, "profile_photo(height:$profile_pic_height,width:$profile_pic_width)", ProfilePhoto.class, -519054585);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r0);
        AnonymousClass4L7 A0G = C41845B3m.A0G(r0);
        AnonymousClass4LF r3 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0I, A0G, C41846B3n.A0H(r3), C41845B3m.A0C(ProfilePhoto.class, "profile_photo(height:$profile_pic_height,width:$profile_pic_width)", -519054585), AnonymousClass7TE.A0f(r3, "has_interop_enabled"), AnonymousClass7TE.A0f(r3, "is_blocked_by_viewer"), AnonymousClass7TE.A0f(r3, "is_friends_with_viewer"), AnonymousClass7TE.A0f(r3, "is_viewer_story_hidden_from_user")});
    }

    public FBStoryViewerFragmentImpl() {
        super(-47832053);
    }
}

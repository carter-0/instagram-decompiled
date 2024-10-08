package com.instagram.creator.inspiration.repository.graphql;

import X.AnonymousClass4Kr;
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

public final class UserInfoFragmentImpl extends C250663lr implements C250673ls {

    public final class FriendshipStatus extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "following");
        }

        public FriendshipStatus() {
            super(809774099);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0E = C41845B3m.A0E(r0);
        AnonymousClass4L7 A0N = C41845B3m.A0N(r0);
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0E, A0N, C41847B3o.A0E(r2), C41846B3n.A0H(r2), C41847B3o.A0Z(r0), C41847B3o.A0T(r0), C41847B3o.A0d(r0), C41845B3m.A0D(r0), C41847B3o.A0a(r0), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "mutual_followers_count"), C41847B3o.A0c(r2), C41847B3o.A05(FriendshipStatus.class, 809774099), C41847B3o.A07()});
    }

    public UserInfoFragmentImpl() {
        super(1766112135);
    }
}

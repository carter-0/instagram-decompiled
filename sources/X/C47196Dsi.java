package X;

import com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum;

/* renamed from: X.Dsi  reason: case insensitive filesystem */
public final class C47196Dsi extends AnonymousClass0T0 implements G8V {
    public final FeedAfterPartyPromoteEligibilityStatusEnum A00;

    public C47196Dsi(FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum) {
        0qQ.A0B(feedAfterPartyPromoteEligibilityStatusEnum, 1);
        this.A00 = feedAfterPartyPromoteEligibilityStatusEnum;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47196Dsi) && this.A00 == ((C47196Dsi) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;

/* renamed from: X.E7a  reason: case insensitive filesystem */
public final class C47537E7a extends C247303g7 {
    public final UserSession A00;
    public final FollowRequestsRepository A01;
    public final C334007aW A02;
    public final C230012om A03;
    public final AnonymousClass0eM A04 = C51792G2b.A00(this, 2);
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final boolean A09;

    public C47537E7a(UserSession userSession, FollowRequestsRepository followRequestsRepository, C334007aW r5, C230012om r6, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = r5;
        this.A01 = followRequestsRepository;
        this.A09 = z;
        this.A03 = r6;
        02z A012 = 106.A01(0sl.A00);
        this.A08 = A012;
        this.A07 = A012;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A05 = r0;
        this.A06 = 0u9.A04(r0);
    }

    public final void A04(AnonymousClass8ZF r3, boolean z) {
        super.A04(r3, true);
        this.A02.A04(r3, true);
    }
}

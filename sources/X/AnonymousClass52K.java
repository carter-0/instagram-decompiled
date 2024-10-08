package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.52K  reason: invalid class name */
public final class AnonymousClass52K implements AnonymousClass2WK {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C243993aT A04;
    public final 0xF A05;
    public final UserSession A06;
    public final 1Xj A07;
    public final SearchContext A08;
    public final C243923aK A09;
    public final C243873aF A0A;
    public final C243853aD A0B;
    public final C243913aJ A0C;
    public final C243893aH A0D;
    public final C243943aO A0E;
    public final User A0F;
    public final Integer A0G;
    public final Long A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final FollowStatus followStatus;

    public AnonymousClass52K(C243993aT r2, 0xF r3, UserSession userSession, 1Xj r5, SearchContext searchContext, C243923aK r7, C243873aF r8, C243853aD r9, C243913aJ r10, C243893aH r11, C243943aO r12, FollowStatus followStatus2, User user, Integer num, Long l, String str, String str2, float f, float f2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(followStatus2, 17);
        this.A06 = userSession;
        this.A0F = user;
        this.A0Q = z;
        this.A07 = r5;
        this.A05 = r3;
        this.A0G = num;
        this.A08 = searchContext;
        this.A0B = r9;
        this.A0A = r8;
        this.A0D = r11;
        this.A0C = r10;
        this.A0K = z2;
        this.A0S = z3;
        this.A0R = z4;
        this.A0P = z5;
        this.A04 = r2;
        this.followStatus = followStatus2;
        this.A0O = z6;
        this.A09 = r7;
        this.A0L = z7;
        this.A0N = z8;
        this.A0M = z9;
        this.A0J = str;
        this.A0E = r12;
        this.A01 = f;
        this.A03 = i;
        this.A00 = f2;
        this.A02 = i2;
        this.A0H = l;
        this.A0I = str2;
    }

    public final 2WL Cfk(2WI r35, long j) {
        2WI r2 = r35;
        0qQ.A0B(r2, 0);
        FollowButton followButton = (FollowButton) C243953aP.A0V.A00(r2.A00.A04);
        UserSession userSession = this.A06;
        boolean z = this.A0Q;
        Integer num = this.A0G;
        boolean z2 = this.A0K;
        boolean z3 = this.A0S;
        boolean z4 = this.A0R;
        boolean z5 = this.A0P;
        C243923aK r33 = this.A09;
        float f = this.A01;
        int i = this.A03;
        AnonymousClass52M.A01(userSession, r33, followButton, num, f, this.A00, i, this.A02, z, z2, z3, z4, z5, 182.A06(0Tu.A05, userSession, 36329852751593828L));
        C267064at r10 = followButton.A0J;
        String str = this.A0J;
        C243943aO r23 = this.A0E;
        1Xj r16 = this.A07;
        0xF r32 = this.A05;
        SearchContext searchContext = this.A08;
        C243853aD r14 = this.A0B;
        C243873aF r13 = this.A0A;
        C243893aH r12 = this.A0D;
        C243913aJ r11 = this.A0C;
        C243993aT r7 = this.A04;
        boolean z6 = this.A0O;
        boolean z7 = this.A0L;
        boolean z8 = this.A0N;
        boolean z9 = this.A0M;
        C243993aT r132 = r7;
        0xF r142 = r32;
        UserSession userSession2 = userSession;
        AnonymousClass52M.A00(r132, r142, userSession2, r16, searchContext, r33, r13, r14, r11, r12, r23, r10, this.A0H, str, this.A0I, z6, z7, z8, z9);
        r10.A06(userSession, this.A0F);
        followButton.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(Math.max(C245073cH.A03(j), followButton.getMeasuredWidth()), Math.max(C245073cH.A02(j), followButton.getMeasuredHeight())), (Object) null);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return HSX.A00(this, (AnonymousClass2WK) obj);
    }
}

package X;

import com.instagram.user.model.FollowStatus;

/* renamed from: X.4Oc  reason: invalid class name and case insensitive filesystem */
public abstract class C263984Oc {
    public static final C264094Oo A00(FollowStatus followStatus) {
        FollowStatus followStatus2 = FollowStatus.A08;
        C264094Oo r6 = C264094Oo.UNKNOWN;
        C264094Oo r0 = (C264094Oo) 0Yt.A06(new 0eP[]{new 0eP(followStatus2, r6), new 0eP(FollowStatus.A04, C264094Oo.FETCHING), new 0eP(FollowStatus.A06, C264094Oo.NOT_FOLLOWING), new 0eP(FollowStatus.A05, C264094Oo.FOLLOWING), new 0eP(FollowStatus.A07, C264094Oo.REQUESTED)}).get(followStatus);
        if (r0 == null) {
            return r6;
        }
        return r0;
    }

    public static final String A01(AnonymousClass3WR r2, boolean z, boolean z2) {
        if (z || r2 == null) {
            return null;
        }
        return (z2 || !r2.A08()) ? "progressive" : "dash";
    }
}

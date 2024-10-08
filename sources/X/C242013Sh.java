package X;

import com.instagram.user.model.FollowStatus;

/* renamed from: X.3Sh  reason: invalid class name and case insensitive filesystem */
public abstract class C242013Sh {
    public static final FollowStatus A00(String str) {
        FollowStatus followStatus = (FollowStatus) FollowStatus.A01.get(str);
        if (followStatus == null) {
            return FollowStatus.A09;
        }
        return followStatus;
    }
}

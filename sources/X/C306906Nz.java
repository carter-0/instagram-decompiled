package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6Nz  reason: invalid class name and case insensitive filesystem */
public abstract class C306906Nz {
    public static final User A00(C306886Nx r3) {
        0qQ.A0B(r3, 0);
        C306876Nw r32 = (C306876Nw) r3;
        User user = r32.A02;
        if (user.B6o() == FollowStatus.A08 || user.B6o() == FollowStatus.A04) {
            user.A0n(FollowStatus.A06);
        }
        user.A13(0qQ.A0K(r32.A03, true));
        return user;
    }
}

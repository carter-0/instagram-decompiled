package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Comparator;

/* renamed from: X.53X  reason: invalid class name */
public final class AnonymousClass53X implements Comparator {
    public final int compare(Object obj, Object obj2) {
        User user = (User) obj2;
        FollowStatus followStatus = null;
        if (user != null) {
            followStatus = user.B6o();
        }
        FollowStatus followStatus2 = FollowStatus.A05;
        boolean z = true;
        boolean z2 = false;
        if (followStatus == followStatus2) {
            z2 = true;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        User user2 = (User) obj;
        if (user2 == null || user2.B6o() != followStatus2) {
            z = false;
        }
        return 29b.A00(valueOf, Boolean.valueOf(z));
    }
}

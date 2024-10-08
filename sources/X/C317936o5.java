package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6o5  reason: invalid class name and case insensitive filesystem */
public final class C317936o5 {
    public final C317946o6 A00;
    public final AvatarStore A01;
    public final UserSession A02;

    public static final boolean A00(C317936o5 r5) {
        long j = r5.A00.A00.A00.getLong("key_last_avatar_convergence_launch_upsells_limit_reached_timestamp", 0);
        if (j == 0 || TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) >= 7) {
            return false;
        }
        return true;
    }

    public static final boolean A01(AvatarStore avatarStore) {
        C293135kC r2;
        AnonymousClass27E r22 = avatarStore.A01;
        if (!(r22 instanceof C293135kC) || (r2 = (C293135kC) r22) == null || !r2.A00.A04) {
            return false;
        }
        return true;
    }

    public static final boolean A02(AvatarStore avatarStore) {
        C293135kC r1;
        AnonymousClass27E r12 = avatarStore.A01;
        Integer num = null;
        if ((r12 instanceof C293135kC) && (r1 = (C293135kC) r12) != null) {
            num = r1.A00.A00;
        }
        if (num == AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    public final EV5 A03() {
        AvatarStore avatarStore = this.A01;
        if (!A02(avatarStore) || !A01(avatarStore) || !C314866iy.A00(this.A02)) {
            return EV5.LAUNCH;
        }
        return EV5.AUTO_MIGRATION;
    }

    public final boolean A04() {
        AvatarStore avatarStore = this.A01;
        if (A02(avatarStore) || !C314866iy.A00(this.A02) || !A01(avatarStore) || this.A00.A00.A00.getBoolean("key_has_seen_any_avatar_convergence_auto_migration_upsell", false)) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        AvatarStore avatarStore = this.A01;
        if ((avatarStore.A01 instanceof C293135kC) && !A02(avatarStore)) {
            UserSession userSession = this.A02;
            if (!C314866iy.A00(userSession) && !this.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_upsell_in_identity_sheet", false) && !A00(this)) {
                0qQ.A0B(userSession, 0);
                if (!182.A06(0Tu.A05, userSession, 36325351626388376L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ C317936o5(UserSession userSession) {
        this(new C317946o6(26G.A00(userSession)), 25x.A00(userSession), userSession);
    }

    public C317936o5(C317946o6 r2, AvatarStore avatarStore, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(avatarStore, 3);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = avatarStore;
    }

    public C317936o5() {
    }
}

package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2f1  reason: invalid class name */
public final class AnonymousClass2f1 extends 0px {
    public 1NH A00;

    public static AnonymousClass2f1 A00(UserSession userSession) {
        Class<AnonymousClass2f1> cls = AnonymousClass2f1.class;
        0rJ A002 = 0rL.A00(userSession);
        AnonymousClass2f1 r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        1NH r0 = new 1NH(C60960kU.A00, new C225862f2(), 1931339941);
        0px r12 = new 0px(userSession);
        r12.A00 = r0;
        A002.A03(r12, cls);
        return r12;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        C267094ax r6 = (C267094ax) obj;
        1NY r3 = new 1NY(this.A02);
        r3.A08(AnonymousClass05K.A01);
        boolean z = false;
        r3.A0K(C273654mx.A00(149), new Object[]{r6.A02, r6.A03});
        r3.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r6.A03);
        r3.A9m("radio_type", r6.A01);
        if (r6.A05 || r6.A04) {
            z = true;
        }
        r3.A0H(AnonymousClass000.A00(3445), z);
        r3.A0R(1XP.class, 1XY.class);
        r3.A0R = true;
        return r3.A0M();
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C267094ax> list;
        1NH r7 = this.A00;
        String str = this.A02.A06;
        C246913fR r0 = (C246913fR) r7.A02(002.A0R("pending_follows_", str), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (C267094ax r1 : list) {
                r1.A04 = true;
                hashMap.put(r1.A00(), r1);
            }
            A0E(hashMap);
            A08();
            hashMap.size();
        }
        r7.A04(002.A0R("pending_follows_", str));
    }

    public final void A0J() {
        this.A00.A04(002.A0R("pending_follows_", this.A02.A06));
    }

    public final FollowStatus A0M(FollowStatus followStatus, Integer num, String str) {
        if (this.A00 == null) {
            A07();
        }
        C267094ax r1 = (C267094ax) A03(002.A0R("follow-", str));
        if (r1 == null) {
            return followStatus;
        }
        String str2 = r1.A02;
        if ("create".equals(str2)) {
            if (num == AnonymousClass05K.A0C) {
                return FollowStatus.A07;
            }
            return FollowStatus.A05;
        } else if ("destroy".equals(str2)) {
            return FollowStatus.A06;
        } else {
            return followStatus;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3fR, java.lang.Object] */
    public final void A0K() {
        A02();
        ? obj = new Object();
        obj.A00 = A05();
        this.A00.A06(002.A0R("pending_follows_", this.A02.A06), obj);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4ax, java.lang.Object] */
    public final C267094ax A0L(EWA ewa, User user, String str) {
        user.getId();
        String id = user.getId();
        String str2 = ewa.A00;
        ? obj = new Object();
        obj.A05 = false;
        obj.A04 = false;
        obj.A00 = RealtimeSinceBootClock.A00.now();
        obj.A03 = id;
        obj.A02 = str2;
        obj.A01 = str;
        A0D(obj.A00(), obj);
        return obj;
    }

    public final FollowStatus A0N(User user) {
        String id = user.getId();
        return A0M(user.B6o(), user.A0N(), id);
    }

    public final void A0O(C267094ax r2) {
        if (r2 == A03(r2.A00())) {
            A0B(r2.A00());
        }
    }

    public final void A0P(User user) {
        C267094ax r2 = (C267094ax) A03(002.A0R("follow-", user.getId()));
        if (r2 != null && r2.A02.equals("create")) {
            user.getId();
            A0B(r2.A00());
        }
    }

    public final boolean A0Q(User user) {
        if (A0N(user) == FollowStatus.A05) {
            return true;
        }
        return false;
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3PQ  reason: invalid class name */
public final class AnonymousClass3PQ {
    public static final AnonymousClass3PQ A00 = new Object();

    public static final DirectCameraViewModel A00(C255773uh r13, String str) {
        int i;
        boolean z;
        User user = r13.A0i;
        if (user != null) {
            List singletonList = Collections.singletonList(new PendingRecipient(user));
            0qQ.A07(singletonList);
            DirectShareTarget directShareTarget = new DirectShareTarget(new C291175gg(singletonList), "", singletonList, true);
            if (str.equals(AnonymousClass000.A00(1854))) {
                i = 4;
            } else {
                i = 0;
                if (str.equals(AnonymousClass000.A00(372))) {
                    i = 5;
                }
            }
            String username = user.getUsername();
            ImageUrl Bh3 = user.Bh3();
            Boolean CeA = user.A03.CeA();
            if (CeA != null) {
                z = CeA.booleanValue();
            } else {
                z = false;
            }
            return new DirectCameraViewModel(Bh3, (ImageUrl) null, directShareTarget, (Long) null, username, user.getUsername(), (String) null, i, false, false, false, z);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final DirectCameraViewModel A01(C250973mM r15, String str) {
        boolean z;
        int i;
        1Ns r0 = r15.A0H.A0W;
        if (r0 != null) {
            User CCd = r0.CCd();
            if (CCd != null) {
                List singletonList = Collections.singletonList(new PendingRecipient(CCd));
                0qQ.A07(singletonList);
                String username = CCd.getUsername();
                ImageUrl Bh3 = CCd.Bh3();
                Boolean CeA = CCd.A03.CeA();
                if (CeA != null) {
                    z = CeA.booleanValue();
                } else {
                    z = false;
                }
                String username2 = CCd.getUsername();
                String str2 = str;
                if (str2.equals(AnonymousClass000.A00(1854))) {
                    i = 4;
                } else {
                    i = 0;
                    if (str2.equals(AnonymousClass000.A00(372))) {
                        i = 5;
                    }
                }
                return new DirectCameraViewModel(Bh3, (ImageUrl) null, new DirectShareTarget(new C291175gg(singletonList), "", singletonList, true), (Long) null, username, username2, (String) null, i, false, false, false, z);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A04(Reel reel) {
        if (reel == null) {
            return "reel_";
        }
        if (reel.A0d()) {
            return "live_";
        }
        if (reel.A0R != null) {
            return "stories_ad4ad";
        }
        return "reel_";
    }

    public static final boolean A05(UserSession userSession, Reel reel, String str) {
        0qQ.A0B(userSession, 0);
        if (reel == null) {
            return false;
        }
        if (str == null) {
            return reel.A0z(userSession);
        }
        for (1Xj id : reel.A19) {
            if (id.getId().equals(str)) {
                return true;
            }
        }
        for (1Xj id2 : reel.A15) {
            if (id2.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r4.A0W;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(com.instagram.model.reels.Reel r4) {
        /*
            r3 = 0
            boolean r0 = r4.A0o()
            r2 = 1
            r1 = 6
            if (r0 != 0) goto L_0x0017
            X.1Ns r0 = r4.A0W
            if (r0 == 0) goto L_0x0018
            java.lang.Integer r0 = r0.CAm()
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PQ.A07(com.instagram.model.reels.Reel):boolean");
    }

    public static final Reel A02(UserSession userSession, User user) {
        Reel A03 = A03(userSession, user);
        if (A03 == null || A03.A16(userSession)) {
            return null;
        }
        return A03;
    }

    public static final Reel A03(UserSession userSession, User user) {
        Long BLa;
        if (ReelStore.A03(userSession).A0M(user.getId()) != null || (user.A03.BLa() != null && ((BLa = user.A03.BLa()) == null || BLa.longValue() != 0))) {
            Reel A0K = ReelStore.A03(userSession).A0K(new 1Nr(user), user.getId(), 0qQ.A0K(userSession.A06, user.getId()));
            Long BLa2 = user.A03.BLa();
            user.A03.Eax((Long) null);
            Long Bkn = user.A03.Bkn();
            user.A03.Ei2((Long) null);
            Long BLX = user.A03.BLX();
            user.A03.Eav((Long) null);
            Long BLY = user.A03.BLY();
            user.A03.Eaw((Long) null);
            if (BLa2 != null) {
                A0K.A03 = BLa2.longValue();
            }
            if (Bkn != null) {
                A0K.A0S(userSession, Bkn.longValue());
            }
            if (A0K.A0l()) {
                A0K.A0U(userSession, A0K.A0L());
            }
            if (BLX != null) {
                A0K.A1F = !2O0.A00(userSession).A06(A0K, Long.valueOf(BLX.longValue()));
            }
            if (BLY != null) {
                A0K.A1G = !2O0.A00(userSession).A06(A0K, Long.valueOf(BLY.longValue()));
            }
            if (A06(userSession, user)) {
                if (A0K.A03 + (AnonymousClass3PE.A00 / 1000) > (System.currentTimeMillis() / 1000) - SandboxRepository.CACHE_TTL) {
                    return A0K;
                }
            }
        }
        return null;
    }

    public static final boolean A06(UserSession userSession, User user) {
        if (user.CPV()) {
            return false;
        }
        if (user.A0N() == AnonymousClass05K.A01 || 0qQ.A0K(userSession.A06, user.getId()) || AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
            return true;
        }
        return false;
    }
}

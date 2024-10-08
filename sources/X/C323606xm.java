package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6xm  reason: invalid class name and case insensitive filesystem */
public final class C323606xm {
    public View A00;
    public 2cs A01;
    public C323616xn A02 = C323616xn.NOT_TRIGGERED;
    public User A03;
    public final C252203oj A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final 1Av A07;
    public final List A08 = 0sr.A1P(new String[]{"app_background_detector", "login"});

    public C323606xm(AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = r3;
        this.A07 = 1Au.A00(userSession);
        this.A04 = new C323626xo(this);
    }

    public static final void A00(C323606xm r6, User user, String str, String str2) {
        UserSession userSession = r6.A06;
        AnonymousClass0iw r3 = r6.A05;
        String id = user.getId();
        String str3 = str;
        C319976rX.A06(r3, userSession, GU2.A00(userSession, user.B6o(), user.A0N(), id), str3, user.getId(), str2);
    }

    public final void A01(Context context, View view, boolean z) {
        C323616xn r3;
        if (view != null && context != null && this.A02 != (r3 = C323616xn.DISMISSED)) {
            View findViewById = view.findViewById(R.id.profile_upsell_container);
            0qQ.A0C(findViewById, "null cannot be cast to non-null type android.view.View");
            if (findViewById.getVisibility() == 0) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.upsell_banner_fade_out);
                0qQ.A07(loadAnimation);
                loadAnimation.setAnimationListener(new LZ9(findViewById));
                findViewById.startAnimation(loadAnimation);
                if (z) {
                    User user = this.A03;
                    if (user != null) {
                        A00(this, user, "dismiss_profile_upsell_banner", "profile_upsell_banner");
                    } else {
                        return;
                    }
                }
            }
            this.A02 = r3;
        }
    }

    public final void A02(Context context, View view, boolean z) {
        if (view != null && context != null) {
            if (z) {
                View view2 = this.A00;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                2cs r2 = this.A01;
                if (r2 != null) {
                    r2.A06(1.0d);
                }
                User user = this.A03;
                if (user != null) {
                    A00(this, user, "impression_profile_upsell_floating_button", "profile_upsell_banner_follow_button");
                    return;
                }
                return;
            }
            2cs r22 = this.A01;
            if (r22 != null) {
                r22.A06(0.0d);
            }
            View view3 = this.A00;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
    }

    public final boolean A03() {
        Integer BPt;
        FriendshipStatus B8F;
        User user;
        FriendshipStatus B8F2;
        User user2;
        Boolean bool;
        User user3 = this.A03;
        if (user3 == null || (BPt = user3.A03.BPt()) == null || BPt.intValue() <= 0 || user3.B6o() != FollowStatus.A06) {
            return false;
        }
        UserSession userSession = this.A06;
        0Tu r5 = 0Tu.A05;
        if (!182.A06(r5, userSession, 36325549194359837L)) {
            User user4 = this.A03;
            if (user4 == null || (B8F = user4.A03.B8F()) == null || !0qQ.A0K(B8F.Bug(), true) || (user = this.A03) == null || (B8F2 = user.A03.B8F()) == null || B8F2.CPL() == null || (user2 = this.A03) == null) {
                return false;
            }
            FriendshipStatus B8F3 = user2.A03.B8F();
            if (B8F3 != null) {
                bool = B8F3.CPL();
            } else {
                bool = null;
            }
            if (!0qQ.A0K(bool, true)) {
                return false;
            }
        }
        if (((double) TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - this.A07.A01.getLong("third_party_profile_upsell_last_seen_timestamp_ms", 0))) >= 182.A00(r5, userSession, 37169974124610049L)) {
            return true;
        }
        return false;
    }
}

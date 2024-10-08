package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6tm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C321226tm implements C62320sa {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ProfileCoinFlipView A01;
    public final /* synthetic */ C314336i2 A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ AnonymousClass70F A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C321226tm(Activity activity, ProfileCoinFlipView profileCoinFlipView, C314336i2 r3, AnonymousClass0iw r4, UserSession userSession, AnonymousClass70F r6, User user, boolean z) {
        this.A07 = z;
        this.A04 = userSession;
        this.A06 = user;
        this.A01 = profileCoinFlipView;
        this.A02 = r3;
        this.A00 = activity;
        this.A05 = r6;
        this.A03 = r4;
    }

    public final Object invoke() {
        boolean z = this.A07;
        UserSession userSession = this.A04;
        User user = this.A06;
        ProfileCoinFlipView profileCoinFlipView = this.A01;
        C314336i2 r8 = this.A02;
        Activity activity = this.A00;
        AnonymousClass70F r9 = this.A05;
        AnonymousClass0iw r3 = this.A03;
        if (!z) {
            if (!2R8.A04(userSession, user)) {
                ViewGroup viewGroup = r9.A0J;
                26t A002 = 26G.A00(userSession);
                if (!A002.A00.getBoolean("key_has_seen_coin_flip_mimicry_tooltip", false) && DcE.A02(userSession) && profileCoinFlipView.A01 == C320946tJ.AVATAR) {
                    profileCoinFlipView.postDelayed(new C66045M9e(activity, viewGroup, userSession, A002), 250);
                }
            } else if (profileCoinFlipView.A01 == C320946tJ.AVATAR) {
                if (r8 != null) {
                    C317936o5 r4 = r8.A01;
                    if (!C317936o5.A02(r4.A01)) {
                        UserSession userSession2 = r4.A02;
                        if (!C314866iy.A00(userSession2) && !r4.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_self_profile_tooltip", false) && !C317936o5.A00(r4)) {
                            0qQ.A0B(userSession2, 0);
                            if (182.A06(0Tu.A05, userSession2, 36325351626322839L)) {
                                ViewGroup viewGroup2 = r9.A0J;
                                AnonymousClass5Gt r1 = new AnonymousClass5Gt(activity, new C315476jx(2131956737));
                                r1.A03(viewGroup2);
                                r1.A01();
                                r1.A0B = true;
                                r1.A00 = 5000;
                                r1.A0A = true;
                                r1.A00().A07(userSession);
                                0xY AR4 = r8.A00.A00.A00.AR4();
                                AR4.E5T("key_has_seen_avatar_convergence_self_profile_tooltip", true);
                                AR4.apply();
                                r8.A01();
                                r8.A00();
                                r8.A02.A01(AnonymousClass05K.A00, "ig_self_profile", "mux_tooltip", true);
                            }
                        }
                    }
                }
                26t A003 = 26G.A00(userSession);
                0xa r82 = A003.A00;
                if (!r82.getBoolean("KEY_HAS_SEEN_POSE_CUSTOMIZATION_TOOLTIP_ON_SELF_PROFILE", false) && DcE.A04(userSession)) {
                    profileCoinFlipView.postDelayed(new C51521FvT(activity, profileCoinFlipView, userSession, A003), 250);
                    0xY AR42 = r82.AR4();
                    AR42.E5T("KEY_HAS_SEEN_POSE_CUSTOMIZATION_TOOLTIP_ON_SELF_PROFILE", true);
                    AR42.apply();
                }
                AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
                r0.A00 = r3;
                C48376EdX.A00(r0.A00(), "ig_self_profile");
            }
        }
        return C60340gF.A00;
    }
}

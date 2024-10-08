package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6O0  reason: invalid class name */
public final class AnonymousClass6O0 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Animation A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ 0xF A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C255773uh A06;
    public final /* synthetic */ C250973mM A07;
    public final /* synthetic */ C306886Nx A08;
    public final /* synthetic */ C309426Yf A09;
    public final /* synthetic */ C317286n1 A0A;
    public final /* synthetic */ C306866Nv A0B;
    public final /* synthetic */ C267064at A0C;
    public final /* synthetic */ User A0D;

    public AnonymousClass6O0(Animation animation, AnonymousClass0iw r2, 0xF r3, UserSession userSession, C255773uh r5, C250973mM r6, C306886Nx r7, C309426Yf r8, C317286n1 r9, C306866Nv r10, C267064at r11, User user, int i, int i2) {
        this.A0B = r10;
        this.A0A = r9;
        this.A07 = r6;
        this.A0D = user;
        this.A05 = userSession;
        this.A08 = r7;
        this.A09 = r8;
        this.A0C = r11;
        this.A03 = r2;
        this.A01 = i;
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = animation;
        this.A00 = i2;
    }

    public final void onClick(View view) {
        String str;
        int A032;
        int A033;
        String str2;
        0Aj A002;
        String str3;
        int A0H;
        EWA ewa;
        String str4;
        int A052 = AnonymousClass0fD.A05(-1401679842);
        C306866Nv r1 = this.A0B;
        View view2 = r1.A05;
        view2.clearAnimation();
        C317286n1 r8 = this.A0A;
        if (r8 != null) {
            r8.DGK(false);
        }
        C250973mM r9 = this.A07;
        if (r9 != null) {
            C309426Yf r6 = this.A09;
            int i = this.A00;
            if (r9.A0H.A0P == ReelType.A0I && r8 != null) {
                r8.Ckc(r9, "tap", "ess_su_card_follow_button", r6.A0B, r6.A0A, i);
            }
        }
        if (!this.A0D.CPV()) {
            C294975nL A012 = C294975nL.A01(view2, 0);
            A012.A0G();
            A012.A0U(0.9f, 1.0f, -1.0f);
            A012.A0V(0.9f, 1.0f, -1.0f);
            A012.A0E(C71392co.A03(5.0d, 2.5d)).A0F(true).A0H();
            UserSession userSession = this.A05;
            C306886Nx r4 = this.A08;
            C309426Yf r10 = this.A09;
            C267064at r13 = this.A0C;
            AnonymousClass0iw r3 = this.A03;
            int i2 = this.A01;
            0xF r14 = this.A04;
            C270074g9 r2 = this.A06.A09;
            if (r2 != null) {
                str = r2.getId();
            } else {
                str = null;
            }
            User A003 = C306906Nz.A00(r4);
            FollowStatus A0N = AnonymousClass2f1.A00(userSession).A0N(A003);
            boolean z = r10.A13;
            int A004 = C306846Nt.A00(r10, A003.getId(), i2);
            if (A0N == FollowStatus.A06) {
                boolean z2 = !r1.A01;
                r1.A01 = z2;
                FollowButton followButton = r1.A0E;
                followButton.A0B = z2;
                if (z && !1QE.A0E().A00) {
                    followButton.A09 = r1.A01;
                }
                if (r1.A01) {
                    Context context = followButton.getContext();
                    if (z) {
                        0qQ.A07(context);
                        A0H = 1QE.A08(context, 1QE.A0E());
                    } else {
                        A0H = 2Yu.A0H(context, R.attr.igds_color_secondary_text);
                    }
                    followButton.setCustomForegroundColor(A0H);
                    AnonymousClass2S0.A01.A03();
                    FollowStatus A0N2 = AnonymousClass2f1.A00(userSession).A0N(A003);
                    String id = A003.getId();
                    C306876Nw r42 = (C306876Nw) r4;
                    String str5 = r42.A09;
                    String str6 = r42.A0E;
                    0qQ.A0B(str5, 5);
                    0qQ.A0B(r3.getModuleName(), 3);
                    str2 = "";
                    int ordinal = A0N2.ordinal();
                    if (ordinal != 4) {
                        if (ordinal == 3) {
                            ewa = EWA.UserActionFollow;
                        } else if (ordinal != 5) {
                            str4 = null;
                        } else {
                            ewa = EWA.UserActionCancelRequest;
                        }
                        str4 = ewa.A00;
                    } else {
                        ewa = EWA.UserActionUnfollow;
                        str4 = ewa.A00;
                    }
                    if (str6 != null) {
                        str2 = str6;
                    }
                    0wc r92 = new C230012om(r3, userSession).A01;
                    A002 = r92.A00(r92.A00, "recommended_follow_button_tapped_unconfirmed");
                    A002.A8k("position", Integer.valueOf(A004));
                    A002.AAJ("view", "su_stories");
                    A002.AAJ("uid", id);
                    A002.AAJ("algorithm", str5);
                    A002.AAJ(AnonymousClass000.A00(90), str4);
                    str3 = "impression_uuid";
                } else {
                    if (z) {
                        Context context2 = followButton.getContext();
                        0qQ.A07(context2);
                        A033 = 1QE.A06(context2, 1QE.A0E());
                    } else {
                        Context context3 = followButton.getContext();
                        0qQ.A07(context3);
                        A033 = 1QE.A03(context3);
                    }
                    followButton.setCustomForegroundColor(A033);
                    String id2 = A003.getId();
                    C306876Nw r43 = (C306876Nw) r4;
                    String str7 = r43.A09;
                    str2 = r43.A0E;
                    0qQ.A0B(str7, 4);
                    0wc A013 = AnonymousClass0kN.A01(r3, userSession);
                    A002 = A013.A00(A013.A00, "recommended_follow_button_undo_tapped");
                    A002.AAJ("target_id", id2);
                    A002.A8k("position", Integer.valueOf(A004));
                    A002.AAJ("view_module", "su_stories");
                    A002.AAJ("algorithm", str7);
                    A002.AAJ("container_module", r3.getModuleName());
                    str3 = "follow_impression_id";
                }
                A002.AAJ(str3, str2);
                A002.Cgf();
            } else {
                FollowButton followButton2 = r1.A0E;
                if (z) {
                    followButton2.A09 = false;
                    Context context4 = followButton2.getContext();
                    0qQ.A07(context4);
                    A032 = 1QE.A06(context4, 1QE.A0E());
                } else {
                    Context context5 = followButton2.getContext();
                    0qQ.A07(context5);
                    A032 = 1QE.A03(context5);
                }
                followButton2.setCustomForegroundColor(A032);
                r13.A04(r14, userSession, (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, (C243853aD) null, A003, (C249763kK) null, (Double) null, r3.getModuleName());
                C306876Nw r44 = (C306876Nw) r4;
                C306896Ny.A02(r3, userSession, A0N, A003.getId(), r44.A09, r44.A0E, str, A004);
            }
            r13.A03(r3, userSession, A003);
        } else {
            view2.startAnimation(this.A02);
            UserSession userSession2 = this.A05;
            C306886Nx r32 = this.A08;
            FollowButton followButton3 = r1.A0E;
            C267064at r12 = this.A0C;
            AnonymousClass0iw r0 = this.A03;
            FH6.A02((Activity) null, userSession2, followButton3, new HGN(r0, userSession2, r8, r12), C306906Nz.A00(r32), r0.getModuleName());
        }
        AnonymousClass0fD.A0C(-197508303, A052);
    }
}

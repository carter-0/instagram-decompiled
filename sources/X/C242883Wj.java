package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Wj  reason: invalid class name and case insensitive filesystem */
public final class C242883Wj implements C242813Wa {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass2rI A02;
    public final AnonymousClass0iw A03;
    public final C242813Wa A04;
    public final C233002un A05;
    public final C2354930b A06;

    public C242883Wj(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, C242813Wa r5, AnonymousClass2rI r6, C233002un r7, C2354930b r8) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(fragment, 3);
        0qQ.A0B(r6, 4);
        0qQ.A0B(r8, 5);
        0qQ.A0B(r3, 7);
        this.A04 = r5;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = r6;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r3;
    }

    public final void CnN(View view, String str) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 1);
        this.A04.CnN(view, str);
    }

    public final void Cna(View view, String str) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 1);
        this.A04.Cna(view, str);
    }

    public final void CuN(1Xj r7, AnonymousClass3W1 r8, Integer num, String str, boolean z) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(num, 3);
        this.A04.CuN(r7, r8, num, str, z);
    }

    public final void Cx1(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.Cx1(r2);
    }

    public final void Cy5(AnonymousClass3ZH r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.Cy5(r2, r3);
    }

    public final void Cy7(1Xj r2, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r2, 1);
        this.A04.Cy7(r2, str);
    }

    public final void D2C(1Xj r2, AnonymousClass3W1 r3, User user, int i) {
        0qQ.A0B(user, 0);
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A04.D2C(r2, r3, user, i);
    }

    public final void D2D(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2D(r2, r3);
    }

    public final void D2E(User user) {
        0qQ.A0B(user, 0);
        this.A04.D2E(user);
    }

    public final void D2I(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D2I(r2);
    }

    public final void D2J(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2J(r2, r3, i);
    }

    public final void D2L(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D2L(r2);
    }

    public final void D2O(1Xj r2, AnonymousClass3W1 r3, int i, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2O(r2, r3, i, z);
    }

    public final void D2P(1Xj r2, AnonymousClass3W1 r3, int i, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2P(r2, r3, i, z);
    }

    public final void D2U(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2U(r2, r3);
    }

    public final void D2Z(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void D2c(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D2c(r2);
    }

    public final void D2f(1Xj r2, AnonymousClass3W1 r3, Hashtag hashtag, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(hashtag, 1);
        0qQ.A0B(r3, 2);
        this.A04.D2f(r2, r3, hashtag, i);
    }

    public final void D2h(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D2h(r2);
    }

    public final void D2k(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D2k(r2);
    }

    public final void D2l(String str) {
        0qQ.A0B(str, 0);
        this.A04.D2l(str);
    }

    public final void D2m(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2m(r2, r3, i);
    }

    public final void D2n(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D2n(r2, r3);
    }

    public final void D2q(1Xj r11, AnonymousClass3W1 r12, String str) {
        0qQ.A0B(r11, 0);
        UserSession userSession = this.A01;
        User A2A = r11.A2A(userSession);
        if (A2A != null) {
            List singletonList = Collections.singletonList(new PendingRecipient(A2A));
            0qQ.A07(singletonList);
            C291175gg r8 = new C291175gg(singletonList);
            if (182.A06(0Tu.A05, userSession, 36325282906518340L)) {
                E5H e5h = new E5H();
                C309516Yo r1 = new C309516Yo(this.A00.requireActivity(), userSession);
                r1.A08();
                String str2 = str;
                if (str == null) {
                    str2 = "feed";
                }
                r1.A0A = str2;
                r1.A0B((Bundle) null, e5h);
                r1.A04();
            } else {
                String id = r11.getId();
                if (id != null) {
                    FragmentActivity activity = this.A00.getActivity();
                    if (activity != null) {
                        1pE A012 = 1pE.A01(activity, this.A03, userSession, "feed_ufi");
                        A012.A0B = r8;
                        A012.A0h = id;
                        A012.A0y = true;
                        A012.A06();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0wc A013 = AnonymousClass0kN.A01(this.A03, userSession);
            0Aj A002 = A013.A00(A013.A00, AnonymousClass000.A00(1279));
            if (str == null) {
                str = "feed";
            }
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A002.AAJ("author_id", AnonymousClass3ZA.A00(A2A));
            A002.AAJ("media_type", r11.BR7().name());
            A002.AAJ("open_thread_id", (String) null);
            A002.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D2u(1Xj r7, AnonymousClass3W1 r8, Boolean bool, int i, boolean z) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        A00(r7, r8);
        this.A04.D2u(r7, r8, bool, i, z);
    }

    public final void D2w(1Xj r2, AnonymousClass3W1 r3, Reel reel, AnonymousClass3N3 r5) {
        0qQ.A0B(reel, 0);
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r5, 3);
        this.A04.D2w(r2, r3, reel, r5);
    }

    public final void D2z(1Xj r2, AnonymousClass3W1 r3, Reel reel, AnonymousClass3N3 r5) {
        0qQ.A0B(reel, 0);
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r5, 3);
        this.A04.D2z(r2, r3, reel, r5);
    }

    public final void D30(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D30(r2);
    }

    public final void D3B(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D3B(r2, r3, i);
    }

    public final void D3C(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D3C(r2, r3);
    }

    public final void D3D(1Xj r5, AnonymousClass3W1 r6, boolean z) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        if (182.A06(0Tu.A05, this.A01, 36323294336527414L)) {
            A00(r5, r6);
        }
        this.A04.D3D(r5, r6, z);
    }

    public final void D3I(1Xj r2, AnonymousClass3W1 r3, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D3I(r2, r3, z);
    }

    public final void D3K(1Xj r11, AnonymousClass3W1 r12, String str, int i, boolean z) {
        1Xj r5 = r11;
        0qQ.A0B(r11, 0);
        AnonymousClass3W1 r6 = r12;
        0qQ.A0B(r12, 1);
        String str2 = str;
        0qQ.A0B(str, 2);
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedMediaHeaderViewBinderDelegateImpl.onClickUserName", -134420407);
        }
        try {
            A00(r11, r12);
            this.A04.D3K(r5, r6, str2, i, z);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-928332257);
            }
        }
    }

    public final void D3L(User user) {
        0qQ.A0B(user, 0);
        this.A04.D3L(user);
    }

    public final void D3M(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.D3M(r2, r3, i);
    }

    public final void D3N(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D3N(r2);
    }

    public final void D3b(AnonymousClass8ZN r2, C67231sQ r3, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r2, 2);
        0qQ.A0B(r3, 3);
        this.A04.D3b(r2, r3, r4, r5);
    }

    public final View.OnTouchListener D3c(1Xj r2) {
        0qQ.A0B(r2, 0);
        return this.A04.D3c(r2);
    }

    public final void D3d(1Xj r2, boolean z) {
        0qQ.A0B(r2, 0);
        this.A04.D3d(r2, z);
    }

    public final void D3x(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D3x(r2);
    }

    public final void D44(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D44(r2);
    }

    public final void D4B(String str) {
        0qQ.A0B(str, 0);
        this.A04.D4B(str);
    }

    public final void D4L(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.D4L(r2);
    }

    public final void DQd(View view, 1Xj r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(view, 1);
        this.A04.DQd(view, r3);
    }

    public final void DV6(String str) {
        0qQ.A0B(str, 0);
        this.A04.DV6(str);
    }

    public final void DVd(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.DVd(r2);
    }

    public final void DVe(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A04.DVe(r2, r3);
    }

    public final void DbT(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.DbT(r2);
    }

    public final View.OnTouchListener Dsc(1Xj r2, String str, String str2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        return this.A04.Dsc(r2, str, str2);
    }

    public final View.OnTouchListener Dsd(1Xj r2, String str, String str2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        return this.A04.Dsd(r2, str, str2);
    }

    public final View.OnTouchListener Dsk(1Xj r2, String str, String str2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        return this.A04.Dsk(r2, str, str2);
    }

    public final void Dtz(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A04.Dtz(r2);
    }

    private final void A00(1Xj r7, AnonymousClass3W1 r8) {
        W07 w07 = VKH.A00;
        UserSession userSession = this.A01;
        if (w07.A03(userSession, r7) || w07.A02(userSession, r7)) {
            Context context = this.A00.getContext();
            if (context != null) {
                AnonymousClass3KE.A00();
                AnonymousClass3KD.A00(context, userSession, r7, new C19566Wbq(r7, this), "profile");
                return;
            }
            return;
        }
        C2354930b r4 = this.A06;
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass3DY r3 = AnonymousClass3DY.PROFILE_TAP;
        C233002un r2 = r4.A03;
        if (r2 == null || !r2.A09(r7, r8, r3, num)) {
            16V A2B = r7.A2B(userSession);
            if (r2 != null && r2.A08(r7, r8, r3, A2B)) {
                r2.A05(r7, r8, r3, r4.A02.BJU(C2354930b.A00(r7, r4)));
                return;
            }
            return;
        }
        r4.A01(r7, r8, r3, (Integer) null);
    }

    public final C2360732i BD7() {
        return this.A04.BD7();
    }

    public final void D2r() {
        this.A04.D2r();
    }
}

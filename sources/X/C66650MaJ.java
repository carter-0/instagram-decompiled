package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.MaJ  reason: case insensitive filesystem */
public final class C66650MaJ {
    public AnonymousClass4DH A00;
    public AnonymousClass32A A01;
    public C16165Upq A02;
    public final Runnable A03;
    public final UserSession A04;

    public static Reel A01(UserSession userSession, C69614Now now) {
        Reel A0L;
        if (now == null) {
            return null;
        }
        if (now instanceof C66657MaQ) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36318801800731096L) && (A0L = ReelStore.A03(userSession).A0L(((C66657MaQ) now).A00.getId())) != null) {
                return A0L;
            }
            User user = ((C66657MaQ) now).A00;
            1OP r0 = 1OP.$redex_init_class;
            0qQ.A0B(user, 1);
            return AnonymousClass3PQ.A03(userSession, user);
        }
        throw new IllegalStateException("Unknown ReelForThreadData type");
    }

    public final void A02(Reel reel, AnonymousClass3BQ r10, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        RectF avatarBounds = gradientSpinnerAvatarView.getAvatarBounds();
        C16165Upq upq = this.A02;
        if (upq == null) {
            this.A02 = new C16165Upq((Activity) this.A00.getActivity(), avatarBounds, (C230222pE) new C50896Fkb(this, 1));
        } else if (!0nA.A0F(gradientSpinnerAvatarView).equals(upq.A00.C4O())) {
            this.A02.A0D(avatarBounds);
        }
        AnonymousClass32A r1 = this.A01;
        r1.A05 = this.A02;
        List singletonList = Collections.singletonList(reel);
        r1.A09(reel, r10, gradientSpinnerAvatarView2, singletonList, singletonList, singletonList);
    }

    public C66650MaJ(AnonymousClass4DH r3, UserSession userSession, Runnable runnable) {
        this.A04 = userSession;
        this.A00 = r3;
        this.A03 = runnable;
        AnonymousClass32A r1 = new AnonymousClass32A(r3, userSession, new AnonymousClass328(r3));
        this.A01 = r1;
        r1.A0C = AnonymousClass7TF.A0b();
    }

    public static C66657MaQ A00(UserSession userSession, AnonymousClass2Ep r5) {
        User user;
        if (!r5.BRZ().isEmpty()) {
            if (r5.C6a() == 29 && r5.Ash() != null && r5.C6F() == null && 182.A06(0Tu.A05, userSession, 36319407393283382L)) {
                user = r5.Ash();
            } else if (r5.CUG()) {
                return null;
            } else {
                user = (User) r5.BRZ().get(0);
            }
            return new C66657MaQ(user);
        } else if (r5.CUG() || r5.C6a() == 1013 || r5.C6a() == 1012 || r5.C6a() == 1014 || r5.CY7()) {
            return null;
        } else {
            return new C66657MaQ(AnonymousClass0t1.A01.A01(userSession));
        }
    }
}

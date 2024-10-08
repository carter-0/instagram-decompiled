package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;

/* renamed from: X.6US  reason: invalid class name */
public abstract class AnonymousClass6US {
    public static boolean A00;

    public static final void A00(UserSession userSession, Reel reel, C255773uh r14, C316236lK r15, C317186mr r16) {
        C252063oV r0;
        View view;
        C252063oV r02;
        C255773uh r11 = r14;
        if (r14.A0e == C250963mL.MEDIA) {
            UserSession userSession2 = userSession;
            if (!C317336n6.A00(userSession)) {
                C316236lK r12 = r15;
                LikeActionView likeActionView = r15.A03;
                if (likeActionView != null) {
                    likeActionView.A00();
                }
                AnonymousClass2fS A002 = AnonymousClass2fR.A00(userSession2);
                1Xj r03 = r11.A0b;
                r03.getClass();
                boolean A0M = A002.A0M(r03);
                IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = r15.A04;
                igBouncyUfiButtonImageView.A05();
                Context context = igBouncyUfiButtonImageView.getContext();
                igBouncyUfiButtonImageView.setSelected(A0M);
                int i = 2131964931;
                if (A0M) {
                    i = 2131964944;
                }
                igBouncyUfiButtonImageView.setContentDescription(context.getString(i));
                AnonymousClass0fU.A00(new AnonymousClass6UT(userSession2, reel, r11, r12, r16, A002), igBouncyUfiButtonImageView);
                0xa r1 = 1Au.A00(userSession2).A01;
                int i2 = r1.getInt("current_story_owner_story_index", 0);
                int i3 = r1.getInt("session_count", 0);
                User A003 = 0eE.A00(userSession2).A00();
                if (!A003.A2L() || !A003.A1x()) {
                    if (i2 == 1 && !A0M && 182.A06(0Tu.A05, userSession2, 36324926424101351L) && i3 == 1) {
                        r15.A00();
                        return;
                    } else if (!A00 && !A0M && i2 == 1) {
                        0Tu r2 = 0Tu.A05;
                        if ((182.A06(r2, userSession2, 36324926424101351L) && i3 > 1) || 182.A06(r2, userSession2, 36324926424232425L)) {
                            r15.A00();
                            A00 = true;
                            return;
                        }
                    }
                }
                igBouncyUfiButtonImageView.setVisibility(0);
                if ((!1NM.A00(r15.A01).A01() || ((r02 = r15.A02) != null && r02.CVM())) && (r0 = r15.A02) != null && (view = r0.getView()) != null) {
                    view.setVisibility(8);
                }
            }
        }
    }
}

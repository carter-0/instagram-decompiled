package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.NvY  reason: case insensitive filesystem */
public abstract class C69994NvY {
    public static final Reel A00(Context context, AnonymousClass0iw r8, UserSession userSession, C294875nB r10, C67059Mha mha, DirectShareTarget directShareTarget, boolean z, boolean z2) {
        Reel A01;
        RingSpec ringSpec;
        AnonymousClass7TF.A1C(context, 0, mha);
        AnonymousClass34S A00 = OXB.A00(userSession, directShareTarget);
        ImageUrl A02 = OXB.A02(userSession, directShareTarget);
        ImageUrl A012 = OXB.A01(userSession, directShareTarget);
        Drawable drawable = context.getDrawable(R.drawable.instagram_icons_exceptions_illo_subscriber_crown2_filled_68);
        if (A012 != null) {
            if ((directShareTarget.A05 != null || AnonymousClass48O.A02(directShareTarget.A01)) && drawable != null) {
                if (A02 == null) {
                    A02 = A012;
                }
                C66582MXn.A1G(mha.A03);
                GradientSpinnerAvatarView gradientSpinnerAvatarView = mha.A04;
                gradientSpinnerAvatarView.setVisibility(0);
                gradientSpinnerAvatarView.A0E(drawable, r8, A02);
            } else {
                mha.A02((AnonymousClass9IV) null, r8, A012);
            }
        } else if (A02 != null) {
            mha.A02((AnonymousClass9IV) null, r8, A02);
        } else if (!directShareTarget.A0M() && directShareTarget.A0R) {
            Object obj = A00.A00;
            if (obj != null) {
                mha.A02((AnonymousClass9IV) null, r8, (ImageUrl) obj);
                if (z) {
                    mha.A01(context.getDrawable(2Yu.A0H(context, R.attr.presenceBadgeLarge)));
                } else {
                    mha.A01((Drawable) null);
                }
            } else {
                throw AnonymousClass7TE.A0z("comes from NotNullable method");
            }
        } else if (182.A06(0Tu.A05, userSession, 36327670908205671L)) {
            mha.A03(AnonymousClass3UE.A05(DbT.A0j(userSession), DbT.A14(directShareTarget), false), r8);
        } else {
            Object obj2 = A00.A00;
            if (obj2 != null) {
                ImageUrl imageUrl = (ImageUrl) obj2;
                AnonymousClass7TF.A1H(r8, imageUrl);
                C66582MXn.A1G(mha.A03);
                GradientSpinnerAvatarView gradientSpinnerAvatarView2 = mha.A04;
                gradientSpinnerAvatarView2.setVisibility(0);
                gradientSpinnerAvatarView2.A0G((AnonymousClass9IV) null, r8, imageUrl, (ImageUrl) A00.A01);
            } else {
                throw AnonymousClass7TE.A0z("comes from NotNullable method");
            }
        }
        if (r10 != null) {
            directShareTarget.A01();
            if (z2) {
                AnonymousClass3U9 B33 = 1bJ.A00(userSession).B33(directShareTarget.A00());
                if (directShareTarget.A0S() && B33 != null) {
                    A01 = C66650MaJ.A01(userSession, C66650MaJ.A00(userSession, B33));
                } else if (directShareTarget.A04 != null && DbT.A14(directShareTarget).size() > 0) {
                    Object obj3 = DbT.A14(directShareTarget).get(0);
                    0qQ.A07(obj3);
                    A01 = C66650MaJ.A01(userSession, new C66657MaQ(AnonymousClass48M.A00(userSession, (PendingRecipient) obj3)));
                }
                if (A01 != null) {
                    GradientSpinnerAvatarView gradientSpinnerAvatarView3 = mha.A04;
                    gradientSpinnerAvatarView3.setGradientSpinnerVisible(true);
                    gradientSpinnerAvatarView3.setGradientSpinnerActivated(!A01.A16(userSession));
                    if (!A01.A16(userSession)) {
                        ringSpec = AnonymousClass3NW.A00(userSession, A01);
                    } else {
                        ringSpec = (RingSpec) AnonymousClass3Mk.A0C.getValue();
                    }
                    0qQ.A0B(ringSpec, 0);
                    gradientSpinnerAvatarView3.setGradientColor(ringSpec);
                    return A01;
                }
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView4 = mha.A04;
        gradientSpinnerAvatarView4.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView4.setGradientSpinnerActivated(false);
        return null;
    }
}

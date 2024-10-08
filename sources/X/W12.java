package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

public final class W12 {
    public static final W12 A00 = new Object();
    public static final AnonymousClass0iw A01 = new 0xG("bloks_follow_button");

    public static final void A00(C307786Rm r4, C276544tV r5, UserSession userSession, FollowButton followButton, User user) {
        AnonymousClass0iw r1;
        AnonymousClass0iw r3;
        boolean z = r4.A02 instanceof C229382nI;
        if (z) {
            r1 = C308206Td.A07(r4);
        } else {
            r1 = A01;
        }
        C267064at r0 = followButton.A0J;
        if (z) {
            r3 = C308206Td.A07(r4);
        } else {
            r3 = A01;
        }
        r0.A07(new C16364Uth(r3, r4, r5, userSession, followButton));
        r0.A03(r1, userSession, user);
    }

    public static final void A01(C276544tV r5, FollowButton followButton) {
        Typeface typeface;
        if (r5.A0R(46, false)) {
            followButton.setPrismButtonVariant(1QG.A03);
        }
        String A0E = r5.A0E();
        if (A0E != null) {
            int hashCode = A0E.hashCode();
            if (hashCode != -838103385) {
                if (hashCode == 3556653 && A0E.equals("text")) {
                    typeface = Typeface.DEFAULT;
                } else {
                    return;
                }
            } else if (A0E.equals("bold_text")) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                return;
            }
            0qQ.A08(typeface);
            0qQ.A0B(followButton, 0);
            followButton.setGravity(19);
            followButton.setPadding(0, 0, 0, 0);
            followButton.setMinHeight(0);
            followButton.setBackground((Drawable) null);
            Context context = followButton.getContext();
            followButton.setTextSize(0, DbU.A00(context, R.dimen.abc_text_size_menu_header_material));
            followButton.setTypeface(typeface);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2Yu.A0F(context, R.attr.inverseUpdatableSecondaryLighterButtonStyle), new int[]{16842904});
            0qQ.A07(obtainStyledAttributes);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                followButton.setTextColor(colorStateList);
            }
            obtainStyledAttributes.recycle();
        }
    }
}

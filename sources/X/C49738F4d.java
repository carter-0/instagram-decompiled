package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.F4d  reason: case insensitive filesystem */
public abstract class C49738F4d {
    public static final void A01(View view, AvatarCoinFlipConfig avatarCoinFlipConfig, AnonymousClass0iw r17, UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) AnonymousClass7TF.A0G(view, R.id.profile_coin_flip_view);
        Context A0S = AnonymousClass7TE.A0S(profileCoinFlipView);
        C320966tM.A03(A0S, profileCoinFlipView, userSession2, (Integer) null, R.dimen.appreciation_reels_grid_item_width);
        profileCoinFlipView.setProfilePicUrl(AnonymousClass7TF.A0Q(userSession2).Bh3(), r17);
        profileCoinFlipView.setCircleBackgroundColor(AnonymousClass7TF.A03(A0S, R.attr.igds_color_elevated_highlight_background));
        2eS.A01(profileCoinFlipView);
        AvatarCoinFlipConfig avatarCoinFlipConfig2 = avatarCoinFlipConfig;
        if (avatarCoinFlipConfig != null) {
            profileCoinFlipView.setAvatarDrawables(0sr.A1P(new C321006tQ[]{A00(A0S, avatarCoinFlipConfig2.A06, userSession2), A00(A0S, avatarCoinFlipConfig2.A05, userSession2)}));
        }
        profileCoinFlipView.postDelayed(new C51331FsP(new C321266tq((ViewGroup) AnonymousClass7TF.A0G(view, R.id.coin_flip_nux_container), C320946tJ.PROFILE_PICTURE, profileCoinFlipView, (List) null, G1G.A00, G1H.A00, G1I.A00, G1J.A00, 182.A06(0Tu.A05, userSession2, 36315937058262731L), true, false), profileCoinFlipView), 500);
    }

    public static final C321006tQ A00(Context context, AvatarCoinFlipSticker avatarCoinFlipSticker, UserSession userSession) {
        int A0H;
        int i;
        boolean A1X = DbW.A1X(avatarCoinFlipSticker);
        0Tu r5 = 0Tu.A05;
        UserSession userSession2 = userSession;
        Context context2 = context;
        if (182.A06(r5, userSession, 36315937058262731L)) {
            A0H = R.color.fds_transparent;
        } else {
            A0H = 2Yu.A0H(context, R.attr.igds_color_progress_bar_on_media);
        }
        int color = context.getColor(A0H);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        String str = avatarCoinFlipSticker.A03;
        if (182.A06(r5, userSession, 36315937058262731L)) {
            i = (int) (((double) dimensionPixelSize) * 1.1d);
        } else {
            i = dimensionPixelSize;
        }
        Drawable A02 = C320996tP.A02(context2, userSession2, str, i, dimensionPixelSize, A1X);
        if (!(A02 instanceof C321006tQ)) {
            return null;
        }
        C321006tQ r2 = (C321006tQ) A02;
        if (r2 != null) {
            C321106ta r0 = r2.A0a;
            if (r0 != null) {
                r0.A01(color, color);
            }
            r2.A01 = ((float) avatarCoinFlipSticker.A02) / ((float) avatarCoinFlipSticker.A01);
        }
        return r2;
    }
}

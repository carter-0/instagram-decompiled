package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.6tM  reason: invalid class name and case insensitive filesystem */
public abstract class C320966tM {
    public static final C321006tQ A00(Context context, UserSession userSession, String str, float f, int i) {
        int A0H;
        int i2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str2 = str;
        0qQ.A0B(str, 3);
        0Tu r4 = 0Tu.A05;
        Context context2 = context;
        if (182.A06(r4, userSession, 36315937058262731L)) {
            A0H = R.color.fds_transparent;
        } else {
            A0H = 2Yu.A0H(context, R.attr.igds_color_progress_bar_on_media);
        }
        int color = context.getColor(A0H);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        if (182.A06(r4, userSession, 36315937058262731L)) {
            i2 = (int) (((double) dimensionPixelSize) * 1.1d);
        } else {
            i2 = dimensionPixelSize;
        }
        Drawable A02 = C320996tP.A02(context2, userSession2, str2, i2, dimensionPixelSize, false);
        if (!(A02 instanceof C321006tQ)) {
            return null;
        }
        C321006tQ r1 = (C321006tQ) A02;
        if (r1 != null) {
            C321106ta r0 = r1.A0a;
            if (r0 != null) {
                r0.A01(color, color);
            }
            r1.A01 = f;
        }
        return r1;
    }

    public static final void A01(Context context, AvatarCoinFlipConfig avatarCoinFlipConfig, ProfileCoinFlipView profileCoinFlipView, AnonymousClass0iw r6, UserSession userSession) {
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse;
        String str;
        0qQ.A0B(context, 1);
        0qQ.A0B(avatarCoinFlipConfig, 2);
        0qQ.A0B(userSession, 4);
        if (!182.A06(0Tu.A05, userSession, 36315937058459342L) || (avatarCoinFlipBackgroundOptionResponse = avatarCoinFlipConfig.A04) == null || (str = avatarCoinFlipBackgroundOptionResponse.A01) == null || str.length() <= 0) {
            profileCoinFlipView.setCircleBackgroundColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_elevated_highlight_background)));
        } else {
            profileCoinFlipView.setCircleBackgroundImage(new SimpleImageUrl(str), r6);
        }
    }

    public static final void A02(Context context, ProfileCoinFlipView profileCoinFlipView, UserSession userSession, Boolean bool, String str, float f, int i) {
        0qQ.A0B(profileCoinFlipView, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(str, 3);
        A03(context, profileCoinFlipView, userSession, (Integer) null, i);
        profileCoinFlipView.A0F(C320946tJ.AVATAR);
        if (bool.equals(true)) {
            profileCoinFlipView.setCircleBackgroundColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_elevated_highlight_background)));
        }
        profileCoinFlipView.setAvatarImageDrawable(A00(context, userSession, str, f, i));
        profileCoinFlipView.A01.setAvatarScale(1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if (X.182.A06(r4, r12, 36315937058590415L) == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r10, com.instagram.avatars.coinflip.ProfileCoinFlipView r11, com.instagram.common.session.UserSession r12, java.lang.Integer r13, int r14) {
        /*
            r6 = 1
            X.0qQ.A0B(r12, r6)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36315937058262731(0x810527000b0ecb, double:3.029683055961889E-306)
            boolean r2 = X.182.A06(r4, r12, r0)
            if (r2 == 0) goto L_0x0073
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.content.res.Resources r2 = r10.getResources()
            int r2 = r2.getDimensionPixelSize(r14)
            double r2 = (double) r2
            r7 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r2 = r2 * r7
            int r5 = (int) r2
            r9.height = r5
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            boolean r2 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0047
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            if (r5 == 0) goto L_0x0047
            if (r13 == 0) goto L_0x0047
            android.content.res.Resources r3 = r10.getResources()
            int r2 = r13.intValue()
            int r2 = r3.getDimensionPixelSize(r2)
            r5.bottomMargin = r2
        L_0x0047:
            r11.A05 = r6
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r5 = r11.A01
            r2 = 36315937057738438(0x81052700030ec6, double:3.029683055630324E-306)
            boolean r2 = X.182.A06(r4, r12, r2)
            if (r2 == 0) goto L_0x0068
            boolean r0 = X.182.A06(r4, r12, r0)
            if (r0 == 0) goto L_0x0068
            r0 = 36315937058590415(0x81052700100ecf, double:3.0296830561691175E-306)
            boolean r1 = X.182.A06(r4, r12, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            r5.A00 = r0
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r0 = r11.A01
            r0.setAvatarScale(r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320966tM.A03(android.content.Context, com.instagram.avatars.coinflip.ProfileCoinFlipView, com.instagram.common.session.UserSession, java.lang.Integer, int):void");
    }
}

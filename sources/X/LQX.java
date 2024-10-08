package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.user.model.User;

public final class LQX {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final TargetViewSizeProvider A03;
    public final String A04;

    public static final C310416b1 A00(float f, float f2, int i, int i2) {
        C39890ADo aDo = new C39890ADo();
        aDo.A04 = f;
        aDo.A03 = f2;
        aDo.A06 = new C16338Ut8(17, (float) i, (float) i2);
        return new C310416b1(aDo);
    }

    public static final 0eP A01(C61037Jvb jvb, LQX lqx, ChannelChallengeStickerWinnerModel channelChallengeStickerWinnerModel, Integer num, Integer num2, float f, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int i7;
        int i8;
        LQX lqx2 = lqx;
        Context context = lqx2.A01;
        ChannelChallengeStickerWinnerModel channelChallengeStickerWinnerModel2 = channelChallengeStickerWinnerModel;
        ImageUrl imageUrl = channelChallengeStickerWinnerModel2.A00;
        ImageUrl imageUrl2 = imageUrl;
        C369688vA r14 = new C369688vA(context, jvb, imageUrl2, lqx2.A04, i, i2);
        float f2 = f;
        C310416b1 A002 = A00(1.0f, f2, i3, i4);
        0eP r1 = null;
        if (!z) {
            return AnonymousClass7TE.A1L(AnonymousClass7TE.A1L(r14, A002), (Object) null);
        }
        User user = channelChallengeStickerWinnerModel2.A01;
        if (user != null) {
            C347017w8 A003 = C39570A0m.A00(context, lqx2.A02, user, AnonymousClass81W.A00(lqx2.A03) * 2, false);
            float intrinsicHeight = ((float) lqx2.A00) / ((float) A003.getIntrinsicHeight());
            int intrinsicHeight2 = (int) ((((float) A003.getIntrinsicHeight()) * intrinsicHeight) / 2.0f);
            int intrinsicWidth3 = (int) ((((float) A003.getIntrinsicWidth()) * intrinsicHeight) / 2.0f);
            int intValue = num.intValue();
            if (intValue == 0) {
                intrinsicWidth = i3 - (r14.getIntrinsicWidth() / 2);
            } else if (intValue != 1) {
                int intrinsicHeight3 = r14.getIntrinsicHeight() / 2;
                if (intValue != 2) {
                    intrinsicWidth = i4 + intrinsicHeight3;
                } else {
                    intrinsicWidth = i4 - intrinsicHeight3;
                }
            } else {
                intrinsicWidth = i3 + (r14.getIntrinsicWidth() / 2);
            }
            int intValue2 = num2.intValue();
            if (intValue2 == 0) {
                intrinsicWidth2 = i3 - (r14.getIntrinsicWidth() / 2);
            } else if (intValue2 != 1) {
                int intrinsicHeight4 = r14.getIntrinsicHeight() / 2;
                if (intValue2 != 2) {
                    intrinsicWidth2 = i4 + intrinsicHeight4;
                } else {
                    intrinsicWidth2 = i4 - intrinsicHeight4;
                }
            } else {
                intrinsicWidth2 = i3 + (r14.getIntrinsicWidth() / 2);
            }
            int i9 = 0;
            if (intValue == 0) {
                i7 = (intrinsicWidth + i5) - intrinsicWidth3;
                i9 = i7;
                i8 = 0;
            } else if (intValue == 1) {
                i7 = (intrinsicWidth - i5) + intrinsicWidth3;
                i9 = i7;
                i8 = 0;
            } else if (intValue != 2) {
                i8 = (intrinsicWidth - i5) + intrinsicHeight2;
            } else {
                i8 = (intrinsicWidth + i5) - intrinsicHeight2;
            }
            if (intValue2 == 0) {
                i9 = intrinsicWidth2 + i6 + intrinsicWidth3;
            } else if (intValue2 == 1) {
                i9 = (intrinsicWidth2 - i6) - intrinsicWidth3;
            } else if (intValue2 != 2) {
                i8 = (intrinsicWidth2 - i6) - intrinsicHeight2;
            } else {
                i8 = intrinsicWidth2 + i6 + intrinsicHeight2;
            }
            r1 = AnonymousClass7TE.A1L(A003, A00(intrinsicHeight, f2, i9, i8));
        }
        return AnonymousClass7TE.A1L(AnonymousClass7TE.A1L(r14, A002), r1);
    }

    public LQX(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = targetViewSizeProvider;
        this.A04 = str;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom);
    }
}

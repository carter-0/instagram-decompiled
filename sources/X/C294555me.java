package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5me  reason: invalid class name and case insensitive filesystem */
public abstract class C294555me {
    public static final AnonymousClass9I1 A00(Context context, UserSession userSession, AnonymousClass3BQ r7) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        Resources resources = context.getResources();
        int ordinal = r7.ordinal();
        if (ordinal != 0) {
            if (ordinal == 72 || ordinal == 3) {
                0Tu r2 = 0Tu.A05;
                if (!182.A06(r2, userSession, 36324286474170306L)) {
                    boolean A06 = 182.A06(r2, userSession, 36324286474694600L);
                    i = resources.getDimensionPixelSize(R.dimen.clips_netego_card_width);
                    if (A06) {
                        f = (float) i;
                        f2 = 1.776f;
                    } else {
                        f3 = ((float) AnonymousClass0nB.A00(context)) / (((float) AnonymousClass0nB.A01(context)) / ((float) i));
                        i2 = (int) f3;
                    }
                }
                i = context.getResources().getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
                f = (float) i;
                f2 = 1.7777778f;
            } else {
                if (ordinal != 4) {
                    return null;
                }
                i = context.getResources().getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
                f = (float) i;
                f2 = 1.7777778f;
            }
            f3 = f * f2;
            i2 = (int) f3;
        } else {
            i = resources.getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            i2 = resources.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        }
        return new AnonymousClass9I1(i, i2, 4);
    }
}

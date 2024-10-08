package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;

public final class LNE {
    public static final int A00(UserSession userSession, ClipInfo clipInfo) {
        return Math.max(Math.min(JTP.A01((double) clipInfo.A0A, 1000.0d), (int) AnonymousClass30M.A06(AnonymousClass30J.SECONDS, C63469KxY.A00(userSession))), 15);
    }

    public final double A01(Context context, UserSession userSession, ClipInfo clipInfo) {
        AnonymousClass7TG.A1O(clipInfo, userSession);
        float A00 = (float) A00(userSession, clipInfo);
        float f = (float) clipInfo.A0A;
        return ((double) (0nA.A09(context) - (AnonymousClass7TF.A0A(context).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2))) / ((double) (A00 / (f / (((float) AnonymousClass7TE.A06(8.0f, f / (((float) A00(userSession, clipInfo)) * 1000.0f))) * 1000.0f))));
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class AAX {
    public static final int A01(Context context, UserSession userSession, List list, int i) {
        AnonymousClass7TF.A1C(context, 0, userSession);
        int A03 = (int) (((double) AnonymousClass7TG.A03(context)) * C346897vw.A00(userSession));
        int A0C = AnonymousClass7TE.A0C(context.getResources());
        int A06 = (0nA.A06(context) - (((int) (((double) context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin)) * C346897vw.A00(userSession))) * 2)) - A00(context, (Drawable) 00k.A0O(list, i), userSession);
        int i2 = 1;
        int size = list.size();
        for (int i3 = i + 1; i3 < size; i3++) {
            A06 -= A00(context, (Drawable) 00k.A0O(list, i3), userSession) + A03;
            if (A06 - A0C < 0 || i2 >= 8) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public static final int A00(Context context, Drawable drawable, UserSession userSession) {
        float f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                return (int) (((float) ((int) (((double) context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height)) * C346897vw.A00(userSession)))) * f);
            }
        }
        f = 2.2f;
        return (int) (((float) ((int) (((double) context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height)) * C346897vw.A00(userSession)))) * f);
    }
}

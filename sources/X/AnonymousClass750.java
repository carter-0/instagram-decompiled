package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.750  reason: invalid class name */
public abstract class AnonymousClass750 {
    public static final 0eP A00(Context context, AnonymousClass9HC r5, boolean z) {
        Integer num;
        String str;
        if (z) {
            return new 0eP("H,0.62857143:1", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size)));
        }
        if (((Boolean) r5.A0Y.getValue()).booleanValue()) {
            num = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.clips_midcard_three_clips_adjacent_video_height_new_design));
        } else if (((Boolean) r5.A0b.getValue()).booleanValue()) {
            if (((Boolean) r5.A0Z.getValue()).booleanValue()) {
                str = "H,0.66666667:1";
            } else {
                str = "H,0.555555:1";
            }
            return new 0eP(str, Integer.valueOf(C61380mr.A01(context, (int) ((Number) r5.A09.getValue()).longValue())));
        } else {
            num = null;
        }
        return new 0eP("H,0.640625:1", num);
    }
}

package X;

import com.instagram.android.R;
import com.instagram.api.schemas.StoryPollColorType;

/* renamed from: X.VFr  reason: case insensitive filesystem */
public abstract class C17043VFr {
    public static final int A00(StoryPollColorType storyPollColorType) {
        if (storyPollColorType == null) {
            return R.color.black;
        }
        switch (storyPollColorType.ordinal()) {
            case 2:
                return R.color.badge_color;
            case 4:
                return R.color.green_5;
            case 5:
                return R.color.clips_gradient_redesign_color_3;
            case 6:
                return R.color.clips_gradient_redesign_color_1;
            case 7:
                return R.color.clips_gradient_redesign_color_2;
            case 8:
                return R.color.clips_gradient_redesign_color_4;
            default:
                return R.color.black;
        }
    }
}

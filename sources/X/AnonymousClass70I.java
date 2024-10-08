package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.70I  reason: invalid class name */
public abstract class AnonymousClass70I {
    public static final int A01(Resources resources, ViewGroup viewGroup, UserSession userSession) {
        int i;
        0qQ.A0B(resources, 2);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36327795462781643L);
        Integer A02 = A02(viewGroup);
        if (A06) {
            int intValue = A02.intValue();
            if (intValue != 0) {
                i = R.dimen.prism_avatar_size_medium_device_variant;
                if (intValue != 1) {
                    i = R.dimen.appreciation_reels_grid_item_width;
                }
            } else {
                i = R.dimen.action_button_min_width;
            }
        } else {
            int intValue2 = A02.intValue();
            if (intValue2 == 0) {
                i = R.dimen.prism_avatar_size_small_device;
            } else if (intValue2 != 1) {
                i = R.dimen.activation_card_icon_container_width;
                if (intValue2 != 2) {
                    i = R.dimen.profile_header_avatar_size_new;
                }
            } else {
                i = R.dimen.abc_list_item_height_material;
            }
        }
        return resources.getDimensionPixelSize(i);
    }

    public static final int A00(Resources resources, ViewGroup viewGroup) {
        int i;
        boolean A02 = C61670oa.A02();
        Context context = viewGroup.getContext();
        if (A02) {
            0qQ.A07(context);
            int A05 = 0nA.A05(context);
            if (A05 < 667) {
                i = R.dimen.prism_avatar_story_ring_width_small_device;
            } else {
                i = R.dimen.prism_avatar_story_ring_width_large_device;
                if (A05 < 1000) {
                    i = R.dimen.prism_avatar_story_ring_width_medium_device;
                }
            }
            return resources.getDimensionPixelSize(i);
        }
        0qQ.A07(context);
        return (int) 0nA.A00(context, 2.5f);
    }

    public static final Integer A02(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        int A05 = 0nA.A05(context);
        if (!C61670oa.A02()) {
            return AnonymousClass05K.A0N;
        }
        if (A05 < 667) {
            return AnonymousClass05K.A00;
        }
        if (A05 < 1000) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }
}

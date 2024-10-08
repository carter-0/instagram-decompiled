package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.user.model.FollowStatus;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.5jr  reason: invalid class name and case insensitive filesystem */
public abstract class C292995jr {
    public static final SpannableStringBuilder A01(Context context, RIXUCtaType rIXUCtaType, int i) {
        Resources resources;
        int i2;
        int i3;
        0qQ.A0B(context, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (rIXUCtaType != RIXUCtaType.VIEW_ALL) {
            int ordinal = rIXUCtaType.ordinal();
            if (ordinal != 6) {
                i3 = R.drawable.spinsta_data_white;
                if (ordinal != 5) {
                    i3 = R.drawable.tray_play_icon;
                }
            } else {
                i3 = R.drawable.instagram_new_story_outline_12;
            }
            Drawable mutate = 0mk.A00(context, i3).mutate();
            0qQ.A07(mutate);
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            C2606346l r2 = new C2606346l(mutate);
            mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(i)));
            if (rIXUCtaType != RIXUCtaType.ZERO_BANNER) {
                r2.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                r2.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
            }
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(r2, 0, 1, 33);
        }
        int ordinal2 = rIXUCtaType.ordinal();
        if (ordinal2 == 6) {
            resources = context.getResources();
            i2 = 2131968252;
        } else if (ordinal2 != 5) {
            resources = context.getResources();
            i2 = 2131968253;
            if (ordinal2 != 4) {
                i2 = 2131968254;
            }
        } else {
            resources = context.getResources();
            i2 = 2131974347;
        }
        spannableStringBuilder.append(resources.getString(i2));
        return spannableStringBuilder;
    }

    public static final String A03(String str) {
        List list;
        List list2;
        List A03 = new 11S("_").A03(str);
        if (!A03.isEmpty()) {
            ListIterator listIterator = A03.listIterator(A03.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = 00k.A0d(A03, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = 0sn.A00;
        String str2 = ((String[]) list.toArray(new String[0]))[0];
        if (!00l.A0d(str2, ".", false)) {
            return str2;
        }
        List A032 = new 11S("\\.").A03(str2);
        if (!A032.isEmpty()) {
            ListIterator listIterator2 = A032.listIterator(A032.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        list2 = 00k.A0d(A032, listIterator2.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list2 = 0sn.A00;
        return ((String[]) list2.toArray(new String[0]))[1];
    }

    public static final int A00(Resources resources, Integer num, int i) {
        int i2;
        double d;
        int i3;
        int i4;
        int intValue = num.intValue();
        if (intValue == 0) {
            d = 1.7d;
            i3 = R.dimen.browser_error_screen_description_width;
            i4 = R.dimen.media_thumbnail_preview_item_height;
        } else if (intValue == 1) {
            d = 1.8d;
            i3 = R.dimen.card_width_medium_large;
            i4 = R.dimen.eu_stamp_icon_size;
        } else if (intValue == 2) {
            return resources.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.birthday_selfie_preview_margin_top);
            i2 = resources.getDimensionPixelSize(R.dimen.ig_logo_top_margin);
            int i5 = i - dimensionPixelSize;
            int i6 = (int) (((double) (i - (((i5 / dimensionPixelSize3) * dimensionPixelSize2) + dimensionPixelSize))) / 2.5d);
            int i7 = (int) (((double) (i - (dimensionPixelSize + ((i5 / i2) * dimensionPixelSize2)))) / 2.25d);
            if (i2 <= i6 && i6 <= dimensionPixelSize3) {
                return i6;
            }
            if (i2 <= i7 && i7 <= dimensionPixelSize3) {
                return i7;
            }
            if (i6 > dimensionPixelSize3) {
                return dimensionPixelSize3;
            }
            if (i7 >= i2) {
                return Math.max(i6, dimensionPixelSize3);
            }
            return i2;
        }
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(i3);
        i2 = resources.getDimensionPixelSize(i4);
        int i8 = (int) (((double) ((i - dimensionPixelSize4) - dimensionPixelSize5)) / d);
        if (i2 <= i8 && i8 <= dimensionPixelSize6) {
            return i8;
        }
        if (i8 > dimensionPixelSize6) {
            return dimensionPixelSize6;
        }
        return i2;
    }

    public static final EWA A02(FollowStatus followStatus) {
        int ordinal = followStatus.ordinal();
        if (ordinal == 4) {
            return EWA.UserActionFollow;
        }
        if (ordinal != 3) {
            return null;
        }
        return EWA.UserActionUnfollow;
    }
}

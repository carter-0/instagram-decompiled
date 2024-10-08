package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.List;
import java.util.Map;

/* renamed from: X.NQo  reason: case insensitive filesystem */
public final class C68635NQo extends C268694dq {
    public final Context A00;
    public final Integer A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final List A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;

    public C68635NQo(Context context, List list, float f) {
        Integer num;
        Map map;
        List list2 = list;
        0qQ.A0B(list2, 2);
        Context context2 = context;
        this.A00 = context2;
        this.A03 = list2;
        float f2 = f;
        this.A0B = 0se.A0M(A00(context2.getResources(), 0, f2, R.dimen.canvas_colour_wheel_offset_y));
        this.A05 = DbY.A0p(1, Integer.valueOf((int) (context2.getResources().getDimension(R.dimen.alert_dialog_button_cell_height) * f)), A00(context2.getResources(), 0, f2, R.dimen.canvas_colour_wheel_offset_y));
        this.A0D = DbY.A0q(2, Integer.valueOf((int) (context2.getResources().getDimension(R.dimen.alert_dialog_button_cell_height) * f)), A00(context2.getResources(), 0, f2, R.dimen.activation_card_icon_container_width), A00(context2.getResources(), 1, f2, R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
        this.A07 = 0Yt.A06(new 0eP[]{A00(context2.getResources(), 0, f2, R.dimen.activation_card_icon_container_width), A00(context2.getResources(), 1, f2, R.dimen.action_button_settings_height), A00(context2.getResources(), 2, f2, R.dimen.abc_alert_dialog_button_dimen), A00(context2.getResources(), 3, f2, R.dimen.abc_dropdownitem_icon_width)});
        this.A09 = 0Yt.A06(new 0eP[]{A00(context2.getResources(), 0, f2, R.dimen.activation_card_icon_container_width), A00(context2.getResources(), 1, f2, R.dimen.action_button_settings_height), A00(context2.getResources(), 2, f2, R.dimen.abc_alert_dialog_button_dimen), A00(context2.getResources(), 3, f2, R.dimen.abc_dropdownitem_icon_width), A00(context2.getResources(), 4, f2, R.dimen.abc_dialog_padding_material)});
        this.A0A = AnonymousClass7TE.A1H();
        this.A04 = AnonymousClass7TE.A1H();
        this.A0C = AnonymousClass7TE.A1H();
        this.A06 = AnonymousClass7TE.A1H();
        this.A08 = AnonymousClass7TE.A1H();
        int size = list2.size();
        if (size == 1) {
            num = AnonymousClass05K.A00;
        } else if (size == 2) {
            num = AnonymousClass05K.A01;
        } else if (size == 3) {
            num = AnonymousClass05K.A0C;
        } else if (size != 4) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0N;
        }
        this.A01 = num;
        List list3 = this.A03;
        int i = 0;
        for (Object next : list3) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            ImageUrl imageUrl = (ImageUrlBase) next;
            if (i < list3.size()) {
                int intValue = this.A01.intValue();
                if (intValue == 0) {
                    map = this.A0B;
                } else if (intValue == 1) {
                    map = this.A05;
                } else if (intValue == 2) {
                    map = this.A0D;
                } else if (intValue == 3) {
                    map = this.A07;
                } else if (intValue == 4) {
                    map = this.A09;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                Number number = (Number) C51968G9o.A10(map, i);
                if (number != null) {
                    C244303ay r12 = new C244303ay(imageUrl, "NoteChatPogAvatarDrawable", number.intValue(), 0, 0, this.A00.getColor(R.color.fds_transparent));
                    r12.setCallback(this);
                    this.A02.add(r12);
                }
            }
            i = i2;
        }
    }

    public final void draw(Canvas canvas) {
        Map map;
        0qQ.A0B(canvas, 0);
        int i = 0;
        for (Object next : this.A02) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            Drawable drawable = (Drawable) next;
            int intValue = this.A01.intValue();
            if (intValue == 0) {
                map = this.A0A;
            } else if (intValue == 1) {
                map = this.A04;
            } else if (intValue == 2) {
                map = this.A0C;
            } else if (intValue == 3) {
                map = this.A06;
            } else if (intValue == 4) {
                map = this.A08;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            Rect rect = (Rect) C51968G9o.A10(map, i);
            if (rect != null) {
                drawable.setBounds(rect);
                drawable.draw(canvas);
            }
            i = i2;
        }
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        super.onBoundsChange(rect2);
        this.A0A.put((Integer) null, C66580MXl.A0C(C66580MXl.A02(C66580MXl.A00(rect2), 0.1786d), C66582MXn.A02(rect2, 0.1786d), C66580MXl.A02(C66580MXl.A00(rect2), 0.821d), C66582MXn.A02(rect2, 0.821d)));
        Map map = this.A04;
        map.put((Integer) null, C66581MXm.A08(C66580MXl.A01(rect2) * 0.679d, C66580MXl.A02(C66580MXl.A00(rect2), 0.321d), C66580MXl.A02(C66580MXl.A01(rect2), 0.036d), C66580MXl.A02(C66580MXl.A00(rect2), 0.964d)));
        map.put(1, C66580MXl.A0C(C66582MXn.A03(rect2, 0.036d), C66580MXl.A02(C66580MXl.A01(rect2), 0.593d), C66580MXl.A02(C66580MXl.A00(rect2), 0.407d), C66582MXn.A02(rect2, 0.964d)));
        Map map2 = this.A0C;
        map2.put((Integer) null, C66581MXm.A08(C66580MXl.A01(rect2) * 0.557d, C66580MXl.A02(C66580MXl.A00(rect2), 0.436d), C66580MXl.A02(C66580MXl.A01(rect2), 0.029d), C66582MXn.A03(rect2, 0.964d)));
        map2.put(1, C66581MXm.A08(C66580MXl.A01(rect2) * 0.764d, C66582MXn.A03(rect2, 0.036d), C66580MXl.A02(C66580MXl.A01(rect2), 0.336d), C66580MXl.A02(C66580MXl.A00(rect2), 0.464d)));
        Integer A0q = C66580MXl.A0q();
        map2.put(A0q, C66581MXm.A08(C66580MXl.A01(rect2) * 0.964d, C66582MXn.A03(rect2, 0.436d), C66580MXl.A02(C66580MXl.A01(rect2), 0.593d), C66580MXl.A02(C66580MXl.A00(rect2), 0.807d)));
        Map map3 = this.A06;
        map3.put((Integer) null, C66580MXl.A0C(C66582MXn.A03(rect2, 0.036d), C66582MXn.A02(rect2, 0.036d), C66580MXl.A02(C66580MXl.A00(rect2), 0.564d), C66582MXn.A02(rect2, 0.564d)));
        Map map4 = map3;
        map4.put(A0q, C66581MXm.A08(C66580MXl.A01(rect2) * 0.964d, C66580MXl.A02(C66581MXm.A00(rect2, 1, C66581MXm.A08(C66580MXl.A01(rect2) * 0.864d, C66582MXn.A03(rect2, 0.564d), C66580MXl.A02(C66580MXl.A01(rect2), 0.464d), C66580MXl.A02(C66580MXl.A00(rect2), 0.964d)), map3), 0.179d), C66580MXl.A02(C66580MXl.A01(rect2), 0.621d), C66580MXl.A02(C66580MXl.A00(rect2), 0.521d)));
        map3.put(3, C66581MXm.A08(C66580MXl.A01(rect2) * 0.379d, C66580MXl.A02(C66580MXl.A00(rect2), 0.65d), C66580MXl.A02(C66580MXl.A01(rect2), 0.15d), C66580MXl.A02(C66580MXl.A00(rect2), 0.879d)));
        Map map5 = this.A08;
        map5.put((Integer) null, C66580MXl.A0C(C66580MXl.A02(C66580MXl.A00(rect2), 0.036d), C66582MXn.A02(rect2, 0.036d), C66580MXl.A02(C66580MXl.A00(rect2), 0.564d), C66582MXn.A02(rect2, 0.564d)));
        map5.put(3, C66580MXl.A0C(C66580MXl.A02(C66581MXm.A00(rect2, A0q, C66580MXl.A0C(C66580MXl.A02(C66581MXm.A00(rect2, 1, C66580MXl.A0C(C66582MXn.A03(rect2, 0.564d), C66580MXl.A02(C66580MXl.A01(rect2), 0.464d), C66582MXn.A03(rect2, 0.964d), C66582MXn.A02(rect2, 0.864d)), map5), 0.179d), C66582MXn.A02(rect2, 0.621d), C66582MXn.A03(rect2, 0.521d), C66582MXn.A02(rect2, 0.964d)), map5), 0.65d), C66582MXn.A02(rect2, 0.15d), C66582MXn.A03(rect2, 0.879d), C66582MXn.A02(rect2, 0.379d)));
        map5.put(4, C66581MXm.A08(C66580MXl.A01(rect2) * 0.736d, C66580MXl.A02(C66580MXl.A00(rect2), 0.014d), C66582MXn.A02(rect2, 0.564d), C66580MXl.A02(C66580MXl.A00(rect2), 0.186d)));
    }

    public final List A07() {
        return this.A02;
    }

    public static 0eP A00(Resources resources, Object obj, float f, int i) {
        return new 0eP(obj, Integer.valueOf((int) (resources.getDimension(i) * f)));
    }

    public final void setAlpha(int i) {
        invalidateSelf();
    }
}

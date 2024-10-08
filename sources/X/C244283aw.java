package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3aw  reason: invalid class name and case insensitive filesystem */
public abstract class C244283aw {
    public static final Drawable A00(Context context, Drawable drawable, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        String str2 = str;
        0qQ.A0B(str2, 1);
        List list2 = list;
        0qQ.A0B(list2, 2);
        return A04(context2, drawable, f, num, num2, num3, num4, (Integer) null, (Integer) null, num5, str2, list2, i, z, z2, z3, z4, z5);
    }

    public static final Drawable A01(Context context, Float f, Integer num, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        return A00(context, (Drawable) null, f, num, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, list, i, z, z2, z3, true, false);
    }

    public static final Drawable A02(Context context, String str, List list, int i) {
        return A00(context, (Drawable) null, (Float) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, list, i, false, false, false, true, false);
    }

    public static final C244323b0 A04(Context context, Drawable drawable, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        String str2 = str;
        0qQ.A0B(str2, 1);
        List<AnonymousClass171> list2 = list;
        0qQ.A0B(list2, 2);
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (AnonymousClass171 Bh3 : list2) {
            arrayList.add(Bh3.Bh3());
        }
        return A03(context2, drawable, f, num, num2, num3, (Integer) null, num4, num5, num6, num7, str2, arrayList, i, z, z2, z3, z4, z5);
    }

    public static final C244323b0 A05(Context context, Float f, Integer num, Integer num2, Integer num3, String str, List list, int i, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        List list2 = list;
        0qQ.A0B(list2, 2);
        return A03(context, (Drawable) null, f, num, num2, (Integer) null, num3, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str2, list2, i, z, false, false, true, false);
    }

    public static final C244323b0 A06(Context context, Float f, Integer num, Integer num2, String str, List list, int i) {
        return A04(context, (Drawable) null, f, AnonymousClass05K.A01, (Integer) null, num, (Integer) null, num2, (Integer) null, (Integer) null, str, list, i, false, true, false, true, false);
    }

    public static final C244323b0 A03(Context context, Drawable drawable, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        String str2 = str;
        0qQ.A0B(str2, 1);
        List list2 = list;
        0qQ.A0B(list2, 2);
        Integer num9 = null;
        Drawable drawable2 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        float f2 = 0.4f;
        int i3 = 3;
        boolean z6 = true;
        Context context2 = context;
        boolean z7 = z;
        if (drawable != null) {
            drawable2 = drawable;
            if (z || z5) {
                i2 = 0;
            } else {
                i2 = list2.size();
            }
            num12 = Integer.valueOf(i2);
            z6 = z4;
            if (num8 != null) {
                num11 = Integer.valueOf(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_icon_on_color)));
                num10 = Integer.valueOf(num8.intValue());
            }
            if (num7 != null) {
                num11 = Integer.valueOf(num7.intValue());
            }
        }
        if (f != null) {
            f2 = f.floatValue();
        }
        if (num2 != null) {
            i3 = num2.intValue();
        }
        if (num3 != null) {
            num14 = Integer.valueOf(num3.intValue());
        }
        if (num5 != null) {
            num15 = Integer.valueOf(num5.intValue());
        }
        if (num6 != null) {
            num13 = Integer.valueOf(num6.intValue());
        }
        if (num4 != null) {
            num9 = Integer.valueOf(num4.intValue());
        }
        if (num14 == null) {
            num14 = Integer.valueOf((int) 0nA.A04(context2, 2));
        }
        if (num13 == null) {
            try {
                num13 = Integer.valueOf(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_primary_background)));
            } catch (Resources.NotFoundException e) {
                2Yn.A03(context2, e);
                context2.getTheme().applyStyle(2Yn.A00(), true);
                num13 = Integer.valueOf(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_primary_background)));
            }
        }
        int color = context2.getColor(R.color.grey_5);
        if (num11 == null) {
            num11 = Integer.valueOf(context2.getColor(R.color.grey_5));
        }
        int intValue = num14.intValue();
        int intValue2 = num13.intValue();
        return C244293ax.A00(context2, drawable2, num, num10, num12, num15, (Integer) null, num9, str2, list2, f2, i, intValue, intValue2, i3, 0, color, intValue2, num11.intValue(), z7, z2, true, z3, false, false, false, z6);
    }
}

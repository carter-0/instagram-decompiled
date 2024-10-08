package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ax  reason: invalid class name and case insensitive filesystem */
public abstract class C244293ax {
    public static C244323b0 A00(Context context, Drawable drawable, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        int intValue;
        List list2;
        Context context2;
        int i9;
        Integer num7;
        int size;
        int size2;
        int i10;
        int intValue2;
        int i11;
        int color;
        int intValue3;
        float A04;
        int intValue4;
        int i12;
        int size3;
        int i13;
        int intValue5;
        int color2;
        C244303ay r8;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        Integer valueOf3 = Integer.valueOf(i4);
        if (valueOf3 == null) {
            intValue = 3;
        } else {
            intValue = valueOf3.intValue();
        }
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (true) {
            list2 = list;
            context2 = context;
            i9 = i;
            if (i14 >= Math.min(intValue, list2.size())) {
                break;
            }
            if (z) {
                size3 = 0;
            } else {
                size3 = list2.size() - 1;
            }
            if (i14 != size3 || num4 == null) {
                i13 = i9;
            } else {
                i13 = num4.intValue();
            }
            if (valueOf == null) {
                intValue5 = (int) 0nA.A04(context2, 2);
            } else {
                intValue5 = valueOf.intValue();
            }
            if (valueOf2 != null) {
                color2 = valueOf2.intValue();
            } else {
                color2 = context2.getColor(2Yu.A0C(context2));
            }
            ImageUrl imageUrl = (ImageUrl) list2.get(i14);
            String str2 = str;
            if (z2) {
                r8 = new C244303ay(imageUrl, str2, i13, z3 ? 1 : 0, 2Yu.A0F(context2, R.attr.avatarInnerStroke), intValue5, color2, 0, z4);
            } else {
                r8 = new C244303ay(imageUrl, str2, i13, intValue5, 0, 0);
            }
            arrayList.add(r8);
            i14++;
        }
        String str3 = null;
        int i15 = i5;
        if (i5 > 0) {
            if (z6) {
                String valueOf4 = String.valueOf(i15);
                if (valueOf4 != null) {
                    i12 = valueOf4.length();
                } else {
                    i12 = 0;
                }
                num7 = Integer.valueOf(i + (i12 * 13));
            } else {
                num7 = null;
            }
            int i16 = i3;
            if (i7 != 0) {
                i16 = i7;
            }
            ColorStateList valueOf5 = ColorStateList.valueOf(i16);
            if (valueOf == null) {
                intValue3 = (int) 0nA.A04(context2, 2);
            } else {
                intValue3 = valueOf.intValue();
            }
            float f2 = (float) (i - intValue3);
            if (num5 != null) {
                A04 = 0nA.A04(context2, num5.intValue());
            } else {
                A04 = 0nA.A04(context2, 15);
            }
            if (valueOf == null) {
                intValue4 = (int) 0nA.A04(context2, 2);
            } else {
                intValue4 = valueOf.intValue();
            }
            if (!z5) {
                str3 = "+";
            }
            arrayList.add(new U14(context2, valueOf5, str3, f2, A04, i15, i6, intValue4, z7));
        } else {
            num7 = null;
        }
        Drawable drawable2 = drawable;
        if (drawable != null) {
            if (z8) {
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                ColorStateList valueOf6 = ColorStateList.valueOf(i3);
                if (num3 == null) {
                    i10 = 0;
                } else if (valueOf == null) {
                    i10 = (int) 0nA.A04(context2, 2);
                } else {
                    i10 = valueOf.intValue();
                }
                if (valueOf == null) {
                    intValue2 = (int) 0nA.A04(context2, 2);
                } else {
                    intValue2 = valueOf.intValue();
                }
                float f3 = ((float) (i - intValue2)) / 2.0f;
                if (num3 == null) {
                    i11 = 0;
                } else if (valueOf == null) {
                    i11 = (int) 0nA.A04(context2, 2);
                } else {
                    i11 = valueOf.intValue();
                }
                if (num6 != null) {
                    color = num6.intValue();
                } else {
                    color = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_primary_background));
                }
                C14660U0g u0g = new C14660U0g(valueOf6, drawable2, f3, i10, i8, i11, color);
                if (num3 != null) {
                    arrayList.add(num3.intValue(), u0g);
                } else {
                    arrayList.add(u0g);
                }
            } else if (num3 != null) {
                arrayList.add(num3.intValue(), drawable2);
            } else {
                arrayList.add(drawable2);
            }
        }
        Integer num8 = num;
        float f4 = f;
        if (num4 == null) {
            if (z) {
                size2 = 0;
            } else {
                size2 = arrayList.size() - 1;
            }
            return new C244323b0(context2, num7, num8, arrayList, f4, i9, i9, size2);
        }
        int intValue6 = num4.intValue();
        if (z) {
            size = 0;
        } else {
            size = list2.size() - 1;
        }
        return new C244323b0(context2, num7, num8, arrayList, f4, intValue6, i9, size);
    }
}

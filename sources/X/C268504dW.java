package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4dW  reason: invalid class name and case insensitive filesystem */
public abstract class C268504dW {
    public Drawable A00(C307786Rm r15, C276544tV r16, C276544tV r17) {
        Drawable drawable;
        String str;
        String str2;
        GradientDrawable.Orientation orientation;
        int[] iArr;
        Drawable A00;
        Drawable A002;
        C276544tV r2 = r16;
        int i = r2.A04;
        C276544tV r4 = r17;
        if (i == 13318) {
            drawable = null;
            try {
                String A0K = r2.A0K(35);
                if (A0K != null) {
                    return C308136Sw.A01(r15, r4, AnonymousClass6Su.A03(A0K));
                }
                return null;
            } catch (C258053yO e) {
                e = e;
                str = C273654mx.A00(1221);
                str2 = "Error parsing color for ColorDrawable";
                1Kn.A00(r15, str, str2, e);
                return drawable;
            }
        } else if (i == 13322) {
            C276544tV A07 = r2.A07(35);
            C276544tV A072 = r2.A07(36);
            if (A07 == null || A072 == null) {
                throw new RuntimeException("Gradient drawable received with null begin or end color");
            }
            C276544tV A073 = r2.A07(38);
            String A0K2 = r2.A0K(40);
            if (A0K2 == null) {
                try {
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                } catch (C258053yO e2) {
                    1Kn.A00(r15, "GradientDrawableUtils", "Error parsing orientation for GradientDrawable", e2);
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                }
            } else {
                orientation = AnonymousClass6Su.A09(A0K2);
            }
            int A003 = AnonymousClass6TP.A00(r15, A07, 0);
            int A004 = AnonymousClass6TP.A00(r15, A072, 0);
            if (A073 != null) {
                iArr = new int[]{A003, AnonymousClass6TP.A00(r15, A073, 0), A004};
            } else {
                iArr = new int[]{A003, A004};
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            if (r17 == null) {
                return gradientDrawable;
            }
            try {
                String A0K3 = r4.A0K(46);
                float f = 0.0f;
                if (A0K3 != null) {
                    f = AnonymousClass6Su.A01(A0K3);
                }
                float[] fArr = new float[8];
                C308156Sy.A01(fArr, f, C308156Sy.A00(r4.A0N(56), 15));
                gradientDrawable.setCornerRadii(fArr);
                return gradientDrawable;
            } catch (C258053yO unused) {
                1Kn.A02("GradientDrawableUtils", "Error parsing Corner radius for Box decoration");
                return gradientDrawable;
            }
        } else if (i == 13330) {
            C276544tV A074 = r2.A07(35);
            if (A074 == null) {
                1Kn.A02("RippleDrawableUtils", "Client received a RippleDrawable with null content");
            }
            if (A074 == null) {
                A00 = new ColorDrawable();
            } else {
                A00 = C64361Kj.A00().A02.A00(r15, A074, r4);
            }
            ShapeDrawable shapeDrawable = null;
            if (r17 != null) {
                float[] fArr2 = new float[8];
                try {
                    String A0K4 = r4.A0K(46);
                    float f2 = 0.0f;
                    if (A0K4 != null) {
                        f2 = AnonymousClass6Su.A01(A0K4);
                    }
                    Arrays.fill(fArr2, f2);
                } catch (C258053yO unused2) {
                    1Kn.A02("RippleDrawableUtils", "Error parsing Corner radius for Box decoration");
                    Arrays.fill(fArr2, 0.0f);
                }
                shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr2, (RectF) null, (float[]) null));
            }
            return new RippleDrawable(ColorStateList.valueOf(Color.parseColor(r2.A0H())), A00, shapeDrawable);
        } else if (i == 13332) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable[] drawableArr = new Drawable[6];
            List A0M = r2.A0M(35);
            for (int i2 = 0; i2 < A0M.size(); i2++) {
                C276544tV r8 = (C276544tV) A0M.get(i2);
                C276544tV A075 = r8.A07(35);
                if (A075 == null) {
                    1Kn.A02("StateDrawableUtils", "Null Drawable model when creating children of a StateDrawable");
                    A002 = new ColorDrawable();
                } else {
                    A002 = C64361Kj.A00().A02.A00(r15, A075, r4);
                }
                String str3 = "";
                String A0K5 = r8.A0K(36);
                if (A0K5 != null) {
                    str3 = A0K5;
                }
                switch (str3.hashCode()) {
                    case -691041417:
                        if (!str3.equals("focused")) {
                            break;
                        } else {
                            drawableArr[1] = A002;
                            break;
                        }
                    case -318264286:
                        if (!str3.equals("pressed")) {
                            break;
                        } else {
                            drawableArr[3] = A002;
                            break;
                        }
                    case 270940796:
                        if (!str3.equals("disabled")) {
                            break;
                        } else {
                            drawableArr[4] = A002;
                            break;
                        }
                    case 1191572123:
                        if (!str3.equals("selected")) {
                            break;
                        } else {
                            drawableArr[2] = A002;
                            break;
                        }
                    case 1544803905:
                        if (!str3.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                            break;
                        } else {
                            drawableArr[0] = A002;
                            break;
                        }
                }
            }
            int i3 = 5;
            do {
                Drawable drawable2 = drawableArr[i3];
                if (drawable2 != null) {
                    stateListDrawable.addState(C14582Tym.A00[i3], drawable2);
                }
                i3--;
            } while (i3 >= 0);
            return stateListDrawable;
        } else if (i != 13340) {
            return new ColorDrawable();
        } else {
            drawable = null;
            try {
                C276544tV A076 = r2.A07(35);
                if (A076 != null) {
                    return C308136Sw.A01(r15, r4, AnonymousClass6TP.A00(r15, A076, 0));
                }
                return null;
            } catch (C258053yO e3) {
                e = e3;
                str = "ThemedColorDrawableUtils";
                str2 = "Parse error for ThemedColorDrawable";
                1Kn.A00(r15, str, str2, e);
                return drawable;
            }
        }
    }
}

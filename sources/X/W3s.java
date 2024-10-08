package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

public final class W3s {
    public static final W3s A00 = new Object();

    public static final void A03(Canvas canvas, View view) {
        C14681U1c u1c;
        U1B u1b;
        0qQ.A0B(canvas, 1);
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        Drawable background = view.getBackground();
        if (!(background instanceof C14681U1c) || (u1c = (C14681U1c) background) == null || (u1b = u1c.A03) == null) {
            canvas.clipRect(rect);
        } else if (u1b.A0E.A02()) {
            U1B.A05(u1b);
            Path path = u1b.A04;
            path.getClass();
            Path path2 = new Path(path);
            path2.offset((float) rect.left, (float) rect.top);
            canvas.clipPath(path2);
        } else {
            RectF A09 = u1b.A09();
            RectF rectF = new RectF(A09.left, A09.top, ((float) AnonymousClass7TF.A06(u1b)) - A09.right, ((float) JTP.A06(u1b)) - A09.bottom);
            rectF.offset((float) rect.left, (float) rect.top);
            canvas.clipRect(rectF);
        }
    }

    public static final void A04(Drawable drawable, View view) {
        0qQ.A0B(view, 0);
        C14681U1c A01 = A01(view);
        Drawable drawable2 = A01.A02;
        List list = A01.A06;
        Drawable drawable3 = drawable;
        view.setBackground(new C14681U1c(drawable2, drawable3, A01.A03, A01.A04, list, A01.A05));
    }

    public static final void A05(View view, float f) {
        0qQ.A0B(view, 0);
        if (C18103VlX.A00(view) == 2) {
            U18 A02 = A02(view);
            float A01 = W2U.A01(f);
            A02.A09.Epx(A02, Float.valueOf(A01), U18.A0B[1]);
        }
    }

    public static final void A06(View view, float f) {
        0qQ.A0B(view, 0);
        if (C18103VlX.A00(view) == 2) {
            U18 A02 = A02(view);
            float A01 = W2U.A01(f);
            if (A01 != A02.A00) {
                A02.A00 = A01;
                Paint paint = A02.A06;
                paint.setStrokeWidth(A01);
                paint.setPathEffect(U18.A01(A02.A04, A01));
                A02.invalidateSelf();
            }
        }
    }

    public static final void A07(View view, ReadableArray readableArray) {
        0sn<C18053Vkb> arrayList;
        Integer num;
        Float f;
        Float f2;
        int i;
        float f3;
        float f4;
        View view2 = view;
        0qQ.A0B(view2, 0);
        ReadableArray readableArray2 = readableArray;
        if (readableArray == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = new ArrayList<>();
            int size = readableArray2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ReadableMap map = readableArray2.getMap(i2);
                Context A0S = AnonymousClass7TE.A0S(view2);
                0qQ.A0B(map, 0);
                Boolean bool = null;
                if (!map.hasKey("offsetX") || !map.hasKey("offsetY")) {
                    throw AnonymousClass7TE.A0y();
                }
                float f5 = (float) map.getDouble("offsetX");
                float f6 = (float) map.getDouble("offsetY");
                if (map.hasKey("color")) {
                    ReadableType type = map.getType("color");
                    int ordinal = type.ordinal();
                    if (ordinal == 2) {
                        num = Integer.valueOf(map.getInt("color"));
                    } else if (ordinal == 4) {
                        num = SPt.A00(A0S, map.getMap("color"));
                    } else {
                        throw new RuntimeException(AnonymousClass7TG.A0m(type, "Unsupported color type ", new StringBuilder()));
                    }
                } else {
                    num = null;
                }
                if (map.hasKey("blurRadius")) {
                    f = Float.valueOf((float) map.getDouble("blurRadius"));
                } else {
                    f = null;
                }
                if (map.hasKey("spreadDistance")) {
                    f2 = Float.valueOf((float) map.getDouble("spreadDistance"));
                } else {
                    f2 = null;
                }
                if (map.hasKey("inset")) {
                    bool = Boolean.valueOf(map.getBoolean("inset"));
                }
                arrayList.add(new C18053Vkb(bool, f, f2, num, f5, f6));
            }
        }
        if (C18103VlX.A00(view2) == 2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C17179VLj vLj = A01(view2).A00;
            for (C18053Vkb vkb : arrayList) {
                float f7 = vkb.A00;
                float f8 = vkb.A01;
                Integer num2 = vkb.A05;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = -16777216;
                }
                Float f9 = vkb.A03;
                if (f9 != null) {
                    f3 = f9.floatValue();
                } else {
                    f3 = 0.0f;
                }
                Float f10 = vkb.A04;
                if (f10 != null) {
                    f4 = f10.floatValue();
                } else {
                    f4 = 0.0f;
                }
                Boolean bool2 = vkb.A02;
                if (bool2 == null || !bool2.booleanValue()) {
                    arrayList2.add(new C14658U0e(AnonymousClass7TE.A0S(view2), A00(view2).A0E, f7, f8, f3, f4, i));
                } else if (Build.VERSION.SDK_INT >= 29) {
                    arrayList3.add(new U13(AnonymousClass7TE.A0S(view2), vLj, A00(view2).A0E, f7, f8, f3, f4, i));
                }
            }
            C14681U1c A01 = A01(view2);
            view2.setBackground(new C14681U1c(A01.A02, A01.A01, A01.A03, A01.A04, arrayList2, arrayList3));
        }
    }

    public static final void A08(View view, C18649Vw1 vw1, C16525UwU uwU) {
        C18649Vw1 vw12;
        View view2 = view;
        C16525UwU uwU2 = uwU;
        boolean A1U = AnonymousClass7TF.A1U(0, view2, uwU2);
        U1B A002 = A00(view2);
        C18659VwF vwF = A002.A0E;
        switch (uwU2.ordinal()) {
            case 0:
                vw12 = vwF.A0C;
                break;
            case 1:
                vw12 = vwF.A09;
                break;
            case 2:
                vw12 = vwF.A0A;
                break;
            case 3:
                vw12 = vwF.A02;
                break;
            case 4:
                vw12 = vwF.A01;
                break;
            case 5:
                vw12 = vwF.A0B;
                break;
            case 6:
                vw12 = vwF.A08;
                break;
            case 7:
                vw12 = vwF.A03;
                break;
            case 8:
                vw12 = vwF.A00;
                break;
            case 9:
                vw12 = vwF.A04;
                break;
            case 10:
                vw12 = vwF.A05;
                break;
            case 11:
                vw12 = vwF.A06;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                vw12 = vwF.A07;
                break;
            default:
                throw new RuntimeException();
        }
        C18649Vw1 vw13 = vw1;
        if (!2Ob.A00(vw13, vw12)) {
            vwF.A01(uwU2, vw13);
            A002.A0H = A1U;
            A002.invalidateSelf();
        }
        C14681U1c A01 = A01(view2);
        for (Drawable drawable : A01.A06) {
            if (drawable instanceof C14658U0e) {
                C14658U0e u0e = (C14658U0e) drawable;
                C18659VwF vwF2 = u0e.A00;
                C18659VwF vwF3 = vwF2;
                if (vwF2 == null) {
                    vwF3 = new C18659VwF((C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null);
                }
                if (!vwF3.equals(vwF2)) {
                    u0e.A00 = vwF3;
                    u0e.invalidateSelf();
                }
                C18659VwF vwF4 = u0e.A00;
                if (vwF4 != null) {
                    vwF4.A01(uwU2, vw13);
                }
                drawable.invalidateSelf();
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            for (Drawable drawable2 : A01.A05) {
                if (drawable2 instanceof U13) {
                    U13 u13 = (U13) drawable2;
                    C18659VwF A012 = u13.A01();
                    if (A012 == null) {
                        A012 = new C18659VwF((C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null);
                    }
                    u13.A03(A012);
                    C18659VwF A013 = u13.A01();
                    if (A013 != null) {
                        A013.A01(uwU2, vw13);
                    }
                    drawable2.invalidateSelf();
                }
            }
        }
        U18 u18 = A01.A04;
        if (u18 != null) {
            0s0 r1 = u18.A08;
            AnonymousClass0YZ[] r0 = U18.A0B;
            Object A0s = Pxe.A0s(u18, r1, r0, 0);
            if (A0s == null) {
                A0s = new C18659VwF((C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null);
            }
            DbS.A1a(u18, A0s, r1, r0, 0);
            C18659VwF vwF5 = (C18659VwF) Pxe.A0s(u18, r1, r0, 0);
            if (vwF5 != null) {
                vwF5.A01(uwU2, vw13);
            }
            u18.invalidateSelf();
        }
    }

    public static final void A0A(View view, C16615UyB uyB, Integer num) {
        float f;
        0qQ.A0B(view, 0);
        U1B A002 = A00(view);
        int A003 = uyB.A00();
        float f2 = Float.NaN;
        if (num == null) {
            f = Float.NaN;
        } else {
            int intValue = num.intValue();
            f = (float) (16777215 & intValue);
            f2 = (float) (intValue >>> 24);
        }
        C18764Vzz vzz = A002.A0C;
        if (vzz == null) {
            vzz = new C18764Vzz(0.0f);
            A002.A0C = vzz;
        }
        if (!C18099VlT.A00(vzz.A03[A003], f)) {
            vzz.A01(f, A003);
            A002.invalidateSelf();
        }
        C18764Vzz vzz2 = A002.A0B;
        if (vzz2 == null) {
            vzz2 = new C18764Vzz(255.0f);
            A002.A0B = vzz2;
        }
        if (!C18099VlT.A00(vzz2.A03[A003], f2)) {
            vzz2.A01(f2, A003);
            A002.invalidateSelf();
        }
        A002.A0H = true;
    }

    public static final void A0B(View view, Integer num) {
        0qQ.A0B(view, 0);
        if ((num != null && num.intValue() != 0) || (view.getBackground() instanceof C14681U1c)) {
            U1B A002 = A00(view);
            A002.A01 = AnonymousClass7TG.A0A(num);
            A002.invalidateSelf();
        }
    }

    public static final void A0C(View view, Integer num) {
        0qQ.A0B(view, 0);
        U1B A002 = A00(view);
        if (A002.A0F != num) {
            A002.A0F = num;
            A002.A0H = true;
            A002.invalidateSelf();
        }
    }

    public static final void A0D(View view, Integer num) {
        int intValue;
        0qQ.A0B(view, 0);
        if (C18103VlX.A00(view) == 2) {
            U18 A02 = A02(view);
            if (num != null && (intValue = num.intValue()) != A02.A01) {
                A02.A01 = intValue;
                A02.A06.setColor(intValue);
                A02.invalidateSelf();
            }
        }
    }

    public static final U1B A00(View view) {
        C14681U1c A01 = A01(view);
        U1B u1b = A01.A03;
        if (u1b != null) {
            return u1b;
        }
        U1B u1b2 = new U1B(view.getContext());
        Drawable drawable = A01.A02;
        List list = A01.A06;
        view.setBackground(new C14681U1c(drawable, A01.A01, u1b2, A01.A04, list, A01.A05));
        return u1b2;
    }

    public static final C14681U1c A01(View view) {
        if (view.getBackground() instanceof C14681U1c) {
            Drawable background = view.getBackground();
            0qQ.A0C(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (C14681U1c) background;
        }
        Drawable background2 = view.getBackground();
        List list = 0sn.A00;
        C14681U1c u1c = new C14681U1c(background2, (Drawable) null, (U1B) null, (U18) null, list, list);
        view.setBackground(u1c);
        return u1c;
    }

    public static final U18 A02(View view) {
        C14681U1c A01 = A01(view);
        U18 u18 = A01.A04;
        if (u18 != null) {
            return u18;
        }
        Context A0S = AnonymousClass7TE.A0S(view);
        C18659VwF vwF = A00(view).A0E;
        0qQ.A07(vwF);
        C18649Vw1 vw1 = vwF.A0C;
        C18649Vw1 vw12 = vwF.A09;
        C18649Vw1 vw13 = vwF.A0A;
        C18649Vw1 vw14 = vwF.A01;
        C18649Vw1 vw15 = vwF.A02;
        C18649Vw1 vw16 = vwF.A0B;
        C18649Vw1 vw17 = vwF.A08;
        C18649Vw1 vw18 = vwF.A03;
        C18649Vw1 vw19 = vwF.A00;
        C18649Vw1 vw110 = vwF.A07;
        C18649Vw1 vw111 = vwF.A06;
        C18649Vw1 vw112 = vw111;
        C18649Vw1 vw113 = vw110;
        C18649Vw1 vw114 = vw19;
        C18649Vw1 vw115 = vw18;
        C18649Vw1 vw116 = vw17;
        C18649Vw1 vw117 = vw16;
        C18649Vw1 vw118 = vw15;
        C18649Vw1 vw119 = vw14;
        C18649Vw1 vw120 = vw13;
        C18649Vw1 vw121 = vw12;
        C18649Vw1 vw122 = vw1;
        U18 u182 = new U18(A0S, new C18659VwF(vw122, vw121, vw120, vw119, vw118, vw117, vw116, vw115, vw114, vw113, vw112, vwF.A05, vwF.A04), AnonymousClass05K.A00);
        Drawable drawable = A01.A02;
        List list = A01.A06;
        U18 u183 = u182;
        View view2 = view;
        view2.setBackground(new C14681U1c(drawable, A01.A01, A01.A03, u183, list, A01.A05));
        return u182;
    }

    public static final void A09(View view, C16615UyB uyB, Float f) {
        float f2;
        boolean A1Z = AnonymousClass7TG.A1Z(view, uyB);
        U1B A002 = A00(view);
        int A003 = uyB.A00();
        if (f != null) {
            f2 = W2U.A01(f.floatValue());
        } else {
            f2 = Float.NaN;
        }
        C18764Vzz vzz = A002.A0D;
        if (vzz == null) {
            vzz = new C18764Vzz();
            A002.A0D = vzz;
        }
        if (!C18099VlT.A00(vzz.A03[A003], f2)) {
            vzz.A01(f2, A003);
            if (A003 == 0 || A003 == A1Z || A003 == 2 || A003 == 3 || A003 == 4 || A003 == 5 || A003 == 8) {
                A002.A0H = A1Z;
            }
            A002.invalidateSelf();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C14681U1c A01 = A01(view);
            C17179VLj vLj = A01.A00;
            if (vLj == null) {
                vLj = new C17179VLj();
            }
            A01.A00 = vLj;
            if (vLj != null) {
                vLj.A00[uyB.ordinal()] = f;
            }
            for (Drawable drawable : A01.A05) {
                0qQ.A0C(drawable, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable");
                ((U13) drawable).A02(A01.A00);
                drawable.invalidateSelf();
            }
        }
    }
}

package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.android.R;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7TG  reason: invalid class name */
public abstract class AnonymousClass7TG {
    public static Bitmap A0K(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(224.0f / ((float) width), 224.0f / ((float) height));
        0fO.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, false);
        0qQ.A07(createBitmap);
        bitmap2.recycle();
        return createBitmap;
    }

    public static Rect A0L(Drawable drawable, Object obj) {
        0qQ.A0B(obj, 0);
        Rect bounds = drawable.getBounds();
        0qQ.A07(bounds);
        return bounds;
    }

    public static RectF A0M(Fragment fragment, Object obj) {
        0qQ.A0B(obj, 0);
        int A09 = 0nA.A09(fragment.requireContext());
        float A08 = (float) 0nA.A08(fragment.requireContext());
        RectF rectF = new RectF(0.0f, 0.0f, (float) A09, A08);
        rectF.offsetTo(0.0f, A08);
        return rectF;
    }

    public static 1NY A0a(0lg r2) {
        1NY r0 = new 1NY(r2, -2);
        r0.A04();
        return r0;
    }

    public static 1NY A0b(0lg r2) {
        1NY r0 = new 1NY(r2, -2);
        r0.A05();
        return r0;
    }

    public static C3266077l A0c(AnonymousClass7XR r3, AnonymousClass9HC r4, Object obj) {
        return C3259074q.A00(new AnonymousClass7DX((AnonymousClass7XN) r3), new AnonymousClass74P((C332847Wp) obj, 1, 0, false), r3, r4);
    }

    public static AnonymousClass7DZ A0d(AnonymousClass7XR r11, AnonymousClass9HC r12) {
        boolean z = r12.A1X;
        C3265877j r1 = new C3265877j(z);
        C333107Xr r7 = (C333107Xr) r11;
        AnonymousClass76C r4 = new AnonymousClass76C(r11);
        C3265977k A00 = r1.A00(r11);
        AnonymousClass7DV r6 = new AnonymousClass7DV((AnonymousClass7XX) r11, z);
        return new AnonymousClass7DZ(0sr.A1P(new AnonymousClass7DY[]{new C3266077l(new AnonymousClass7DX((AnonymousClass7XN) r11), r4, A00, r6, r7, r12, (C3266177m) null, false), r1}));
    }

    public static 0xY A0g(0xa r1, String str) {
        int i = r1.getInt(str, 0);
        0xY AR4 = r1.AR4();
        AR4.E5Z(str, i + 1);
        return AR4;
    }

    public static String A0l(16F r3) {
        if (r3.A11() != 16L.A0G) {
            return r3.A1P();
        }
        return null;
    }

    public static void A11(Path path, RectF rectF, float[] fArr, float f) {
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public static void A12(RectF rectF, float f, float f2) {
        rectF.left = f - f2;
        rectF.right += f2;
        rectF.top -= f2;
        rectF.bottom += f2;
    }

    public static void A13(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void A15(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(number.longValue());
    }

    public static void A17(Spannable spannable, Object obj) {
        spannable.setSpan(obj, 0, spannable.length(), 18);
    }

    public static void A18(Spannable spannable, Object obj, int i) {
        spannable.setSpan(obj, 0, spannable.length(), 18);
        spannable.setSpan(new ForegroundColorSpan(i), 0, spannable.length(), 18);
    }

    public static void A1B(ImageView imageView, Object obj) {
        Drawable drawable = imageView.getDrawable();
        if (0qQ.A0K(drawable, obj)) {
            return;
        }
        if (drawable instanceof C268684dp) {
            ((C268684dp) drawable).AHg();
        } else if (drawable instanceof C380029Wg) {
            C380029Wg r1 = (C380029Wg) drawable;
            if (r1.A00) {
                r1.A00 = false;
            }
        } else if (drawable instanceof C380039Wh) {
            C380039Wh r12 = (C380039Wh) drawable;
            if (r12.A00) {
                r12.A00 = false;
            }
        } else if (drawable instanceof C15833UjJ) {
            C15833UjJ ujJ = (C15833UjJ) drawable;
            if (ujJ.A00) {
                ujJ.A00 = false;
            }
        } else if (drawable instanceof C389979qX) {
            ((C389979qX) drawable).A00 = false;
        } else if (drawable instanceof AnonymousClass9Wk) {
            ((AnonymousClass9Wk) drawable).A00 = false;
        }
    }

    public static void A1N(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
    }

    public static void A1O(Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 2);
    }

    public static void A1P(Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 3);
    }

    public static void A1Q(Object obj, Object obj2) {
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
    }

    public static void A1R(Object obj, Object obj2) {
        0qQ.A0B(obj, 4);
        0qQ.A0B(obj2, 5);
    }

    public static void A1S(Object obj, Object obj2) {
        0qQ.A0B(obj, 5);
        0qQ.A0B(obj2, 6);
    }

    public static void A1T(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj3, 2);
    }

    public static void A1U(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(obj3, 3);
    }

    public static boolean A1Z(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        return true;
    }

    public static int A0A(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A0C(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A0E(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static Bundle A0P(Object obj, Object obj2, 0eP r3) {
        return Q21.A00(r3, new 0eP(obj, obj2));
    }

    public static 2Wb A0S(2V1 r2) {
        return new 2Wb(r2, new ArrayList());
    }

    public static AnonymousClass4Kx A0T(AnonymousClass4Kw r1, Class cls, String str, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4Kp(r1, cls, str, i)});
    }

    public static AnonymousClass4Kx A0U(AnonymousClass4L1 r1, AnonymousClass4Kr r2, AnonymousClass4Kr r3, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, r3, new AnonymousClass4L7(r1, str)});
    }

    public static AnonymousClass4Kx A0V(AnonymousClass4L1 r1, AnonymousClass4Kr r2, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, new AnonymousClass4L7(r1, str)});
    }

    public static AnonymousClass4Kx A0W(AnonymousClass4L1 r1, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r1, str)});
    }

    public static AnonymousClass4Kx A0X(Class cls, String str, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new C295925p8(cls, str, i)});
    }

    public static AnonymousClass4Kx A0Y(Class cls, String str, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4Kp(cls, str, i)});
    }

    public static C10425Rs1 A0Z() {
        return new C10425Rs1(new UserFlowLoggerImpl(02m.A0p), 791877554);
    }

    public static AnonymousClass5Gt A0e(Activity activity, int i) {
        return new AnonymousClass5Gt(activity, new C315476jx(i));
    }

    public static AnonymousClass5Gt A0f(Activity activity, CharSequence charSequence) {
        return new AnonymousClass5Gt(activity, new C315476jx(charSequence));
    }

    public static Integer A0h(Object obj) {
        ((Number) obj).intValue();
        return 1;
    }

    public static String A0p(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static GeneralSecurityException A0q(String str) {
        return new GeneralSecurityException(str);
    }

    public static ArrayList A0r(Iterable iterable) {
        return new ArrayList(0Yv.A1E(iterable, 10));
    }

    public static 0eO A0t() {
        return (0eO) C62000qj.A02.A0K.invoke();
    }

    public static C318126oR A0u() {
        return new C318126oR("An operation is not implemented.");
    }

    public static void A0v() {
        0dV.A0D("torch-code-gen", 16);
        0dV.A0D("dynamic_pytorch_impl", 16);
    }

    public static void A16(Parcel parcel, Number number, int i, int i2) {
        if (number == null) {
            parcel.writeInt(i);
            return;
        }
        parcel.writeInt(i2);
        parcel.writeInt(number.intValue());
    }

    public static void A1C(Fragment fragment, int i, int i2) {
        if (i == i2) {
            fragment.requireActivity().setResult(i2);
            fragment.requireActivity().finish();
        }
    }

    public static void A1G(C227762js r2, C238133Ar r3) {
        if (r2 != null) {
            r2.A0C = true;
            r2.onScrollStateChanged(r3, 0);
        }
    }

    public static void A1K(29I r1) {
        AnonymousClass29D r12 = r1.A00;
        String.valueOf(r12.A00.A0J());
        String.valueOf(r12.A00());
    }

    public static boolean A1X(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return 0qQ.A0K(obj2, ((C61910qF) obj).getFunctionDelegate());
    }

    public static boolean A1a(Object obj, 0s0 r2, AnonymousClass0YZ[] r3, int i) {
        return ((Boolean) r2.CDM(obj, r3[i])).booleanValue();
    }

    public static float A00(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A01(int i) {
        int A0L = 0se.A0L(i);
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static int A02(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static int A03(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static int A04(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
    }

    public static int A05(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    public static int A06(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
    }

    public static int A07(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
    }

    public static int A08(C342727p4 r0, C342717p3 r1) {
        Object A02 = r1.A02(r0);
        A02.getClass();
        return ((Number) A02).intValue();
    }

    public static int A09(1Xj r1) {
        if (r1.CeS()) {
            return 3;
        }
        return 1;
    }

    public static int A0B(Number number, String str, int i) {
        return (i + str.hashCode() + number.intValue()) * 31;
    }

    public static int A0D(Object obj, int i) {
        int A03 = AnonymousClass0fD.A03(i);
        0qQ.A0B(obj, 0);
        return A03;
    }

    public static int A0F(Iterator it) {
        return ((Number) it.next()).intValue();
    }

    public static int A0G(List list, int i) {
        return i % list.size();
    }

    public static long A0H() {
        return System.currentTimeMillis() * 1000;
    }

    public static long A0I() {
        return System.currentTimeMillis() / 1000;
    }

    public static ValueAnimator A0J(ValueAnimator valueAnimator, long j) {
        ValueAnimator duration = valueAnimator.setDuration(j);
        0qQ.A07(duration);
        return duration;
    }

    public static Typeface A0N(Context context) {
        return AnonymousClass0qo.A00(context).A02(0qm.A13);
    }

    public static Typeface A0O(Context context) {
        return AnonymousClass0qo.A00(context).A02(0qm.A0V);
    }

    public static View A0Q(AnonymousClass0eM r0) {
        return ((C252063oV) r0.getValue()).getView();
    }

    public static TextView A0R(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (TextView) requireViewById;
    }

    public static Object A0i(AnonymousClass4D7 r0, AnonymousClass0r6 r1, 02o r2) {
        Object collect = r1.collect(r2, r0);
        if (collect != 1Hj.A02) {
            return C60340gF.A00;
        }
        return collect;
    }

    public static String A0j() {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        return obj;
    }

    public static String A0k(17Z r0, Object obj) {
        r0.A0Z();
        r0.close();
        return obj.toString();
    }

    public static String A0m(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0n(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A0o(String str) {
        String upperCase = str.toUpperCase(AnonymousClass1Q2.A02());
        0qQ.A07(upperCase);
        return upperCase;
    }

    public static Map A0s(Map map, int i) {
        map.put("z_index", Integer.valueOf(i));
        return 0Yt.A0B(map);
    }

    public static void A0w(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 3);
        0qQ.A0B(obj3, 4);
    }

    public static void A0x(Context context, C306386Ly r1, int i) {
        r1.A0A(0nA.A04(context, i));
    }

    public static void A0y(Context context, C306386Ly r2, int i) {
        r2.A0F(context.getColor(2Yu.A0H(context, i)));
    }

    public static void A0z(Canvas canvas, Drawable drawable) {
        canvas.translate((float) drawable.getBounds().left, (float) drawable.getBounds().top);
    }

    public static void A10(ColorFilter colorFilter, Drawable drawable) {
        drawable.mutate().setColorFilter(colorFilter);
    }

    public static void A14(Drawable drawable, int i) {
        drawable.mutate().setAlpha(i);
    }

    public static void A19(View view, AnonymousClass85M r2) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(r2.A00);
        }
    }

    public static void A1A(View view, boolean z) {
        C294975nL.A04((C295005nO) null, new View[]{view}, z);
    }

    public static void A1D(0Aj r2, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("device_fold_orientation", C254483sY.A00);
        r2.AAJ("device_fold_state", C254493sZ.A00);
        r2.A7p("device_is_in_multi_window_mode", C254503sa.A00);
        r2.AAJ("device_aspect_ratio_category", C254473sX.A00);
        r2.Cgf();
    }

    public static void A1E(B2O b2o, 0Gb r3, IgArVoltronModuleLoader igArVoltronModuleLoader, 1US r5, AbstractCollection abstractCollection) {
        abstractCollection.add(new DynamicServiceModule(b2o, igArVoltronModuleLoader.getModuleLoader(r5), r3));
    }

    public static void A1F(16F r2, AbstractCollection abstractCollection) {
        String A1P;
        if (r2.A11() != 16L.A0G && (A1P = r2.A1P()) != null) {
            abstractCollection.add(A1P);
        }
    }

    public static void A1H(0wj r1, String str) {
        0f9 AEf = r1.AEf(str, 817902403);
        AEf.ABQ("navChain", AnonymousClass1QI.A00.A02.A00);
        AEf.ABQ("stackTrace", 2Og.A00(new Throwable()));
        AEf.report();
    }

    public static void A1I(0wj r0, String str, Throwable th, int i) {
        0f9 AEf = r0.AEf(str, i);
        AEf.ERJ(th);
        AEf.report();
    }

    public static void A1J(C317876nz r0, C273914nO r1) {
        r1.A06 = r0.A01();
    }

    public static void A1L(0xY r1, 0xa r2, String str, int i) {
        r1.E5Z(str, r2.getInt(str, i) + 1);
        r1.apply();
    }

    public static void A1M(0xa r0, String str, int i) {
        0xY AR4 = r0.AR4();
        AR4.E5Z(str, i);
        AR4.apply();
    }

    public static boolean A1V(C342697p1 r0, C342687p0 r1) {
        return ((Boolean) r1.A01(r0)).booleanValue();
    }

    public static boolean A1W(C342727p4 r0, C342717p3 r1) {
        Object A02 = r1.A02(r0);
        A02.getClass();
        return ((Boolean) A02).booleanValue();
    }

    public static int[] A1b(Context context, int i) {
        return new int[]{context.getColor(2Yu.A0H(context, i)), context.getColor(2Yu.A0H(context, i)), context.getColor(2Yu.A0H(context, i)), context.getColor(2Yu.A0H(context, i)), context.getColor(2Yu.A0H(context, i))};
    }
}

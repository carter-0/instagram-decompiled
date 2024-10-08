package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.BaseBundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.webrtc.VideoCodecInfo;

/* renamed from: X.Tnp  reason: case insensitive filesystem */
public abstract class C13989Tnp {
    public static float A01(int i, int i2, float f) {
        return (float) (i2 + AnonymousClass1GB.A01(((float) (i - i2)) * f));
    }

    public static int A09(int i, int i2, int i3, int i4) {
        int i5 = (i - i2) - 1;
        return (((i3 >> i5) & 1) << 1) + ((i4 >> i5) & 1);
    }

    public static int A0C(Resources.Theme theme, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, i2);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int A0J(View view, Object obj) {
        if (obj == null) {
            return 0;
        }
        return SPt.A01(view.getContext(), obj, 0).intValue();
    }

    public static int A0L(C307786Rm r2, C276544tV r3, int i) {
        C276544tV A07 = r3.A07(i);
        if (A07 == null) {
            return -1;
        }
        return AnonymousClass6TP.A00(r2, A07, 0);
    }

    public static IgTextView A0V(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        IgTextView inflate = layoutInflater.inflate(i, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
        return inflate;
    }

    public static 1Av A0Z(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 1Au.A00(userSession);
    }

    public static BufferedWriter A0f(File file, Charset charset) {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), charset));
    }

    public static Integer A0g(View view, Object obj) {
        if (obj != null) {
            return SPt.A01(view.getContext(), obj, 0);
        }
        return null;
    }

    public static String A0n(Location location) {
        if (location != null) {
            return Double.valueOf(location.getLatitude()).toString();
        }
        return null;
    }

    public static String A0o(16F r3) {
        if (r3.A11() != 16L.A0G) {
            return r3.A1P();
        }
        return null;
    }

    public static List A0v(UserSession userSession, C250973mM r2) {
        0qQ.A0B(userSession, 0);
        return C250973mM.A00(userSession, r2);
    }

    public static void A0y() {
        new 1E9(new 1hu((UserSession) null), 6, false);
    }

    public static void A19(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A1B(View view, Object obj, Object obj2, boolean z) {
        View[] viewArr = {view};
        if (obj == obj2) {
            C315596kB.A08(viewArr, z);
        } else {
            C315596kB.A09(viewArr, false);
        }
    }

    public static void A1S(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MG4(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static void A1U(float[] fArr, float f) {
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
    }

    public static void A1V(float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2;
    }

    public static boolean A1X(C14138TqY tqY) {
        UserSession userSession = (UserSession) tqY.A0t.getValue();
        0qQ.A0B(userSession, 0);
        return C249093j7.A00(userSession).booleanValue();
    }

    public static float A04(Comparable comparable, float f, float f2) {
        return ((Number) C229632nm.A09(comparable, new C52395GQu(f, f2))).floatValue();
    }

    public static float A05(Number number) {
        if (number != null) {
            return number.floatValue();
        }
        return 0.0f;
    }

    public static float A06(Object obj) {
        if (!(obj instanceof Double)) {
            return 0.0f;
        }
        return ((Number) obj).floatValue();
    }

    public static float A07(Object obj, Object obj2, float f) {
        if (obj instanceof Double) {
            return ((Number) obj2).floatValue();
        }
        return f;
    }

    public static int A0K(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        return Math.max(i2, i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
    }

    public static AnonymousClass327 A0Q(String str) {
        0bb r1 = new 0bb();
        r1.A06("prior_module", str);
        return r1;
    }

    public static C3251571g A0e(AnonymousClass2rW r3, int i) {
        return new C3251571g(r3.A01, i * 3, 3);
    }

    public static RuntimeException A0j(String str, int i) {
        return new RuntimeException(002.A0g(str, ": EGL error: 0x", Integer.toHexString(i)));
    }

    public static RuntimeException A0l(String str, String str2) {
        return new RuntimeException(002.A0g(str, str2, "' in program"));
    }

    public static String A0p(LeadGenBaseFormList leadGenBaseFormList) {
        LeadForm leadForm = leadGenBaseFormList.A01;
        if (leadForm != null) {
            return leadForm.A03;
        }
        return null;
    }

    public static String A0q(Product product) {
        User user = product.A0B;
        if (user != null) {
            return AnonymousClass3ZA.A00(user);
        }
        return null;
    }

    public static String A0r(User user) {
        if (user != null) {
            return AnonymousClass3ZA.A00(user);
        }
        return null;
    }

    public static Date A0t(long j) {
        return new Date(j * 1000);
    }

    public static void A11(ColorFilter colorFilter, Drawable drawable) {
        Drawable mutate;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(colorFilter);
        }
    }

    public static void A14(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static void A16(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static void A1C(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, CharSequence charSequence) {
        accessibilityNodeInfoCompat.addAction(new 04x(16, charSequence));
    }

    public static void A1D(0Aj r2, 0bb r3) {
        r2.AAK(r3, "configurations");
        r2.AAJ("bfa_platform", "native_android");
        r2.Cgf();
    }

    public static void A1E(0Aj r1, 0bb r2, String str) {
        r2.A06("shopping_session_id", str);
        r1.AAK(r2, "navigation_info");
    }

    public static void A1O(0xI r1, String str, String str2, String str3) {
        r1.A07(C297695sB.A01, str);
        r1.A07(C297695sB.A00, str2);
        r1.A0C("search_session_id", str3);
    }

    public static boolean A1Z(Object obj, Object obj2, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        }
        return z;
    }

    public static boolean A1a(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public static float A02(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static float A03(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int A08(int i, int i2) {
        return AnonymousClass05K.A00(i)[i2].intValue();
    }

    public static int A0A(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
    }

    public static int A0B(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
    }

    public static int A0D(Paint paint, int i) {
        return ((i & 255) << 24) | (paint.getColor() & 16777215);
    }

    public static int A0E(View view) {
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int A0F(View view) {
        return view.getHeight() - view.getPaddingBottom();
    }

    public static int A0G(View view) {
        return view.getWidth() - view.getPaddingRight();
    }

    public static int A0H(View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A0I(View view, int i) {
        return (i - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static GradientDrawable A0M(View view) {
        Drawable background = view.getBackground();
        background.getClass();
        return (GradientDrawable) background.mutate();
    }

    public static MotionEvent A0N(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        return obtain;
    }

    public static View A0O(AdapterView adapterView, int i) {
        return adapterView.getChildAt(i - adapterView.getFirstVisiblePosition());
    }

    public static Ty7 A0P(C307896Rx r0, C276544tV r1, AnonymousClass6Tm r2, int i) {
        return (Ty7) C307476Qg.A06(C276734to.A00(r0, r2, i), r1);
    }

    public static BaseFragmentActivity A0R(Fragment fragment) {
        BaseFragmentActivity requireActivity = fragment.requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        return requireActivity;
    }

    public static C19176WOi A0S(Iterator it) {
        C21004X9b x9b = (C21004X9b) it.next();
        0qQ.A0C(x9b, "null cannot be cast to non-null type com.instagram.business.promote.model.Promotion");
        return (C19176WOi) x9b;
    }

    public static 1OC A0T(1P0 r2, C239133Fc r3, C239123Fb r4) {
        r4.A09(r3);
        Integer num = AnonymousClass05K.A00;
        r4.A08 = "ads_viewer_context_policy";
        1OC A07 = r4.A07(num);
        A07.A00 = r2;
        return A07;
    }

    public static IgSimpleImageView A0U(ViewStub viewStub) {
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
        return (IgSimpleImageView) inflate;
    }

    public static AnonymousClass3NG A0W(ImageView imageView) {
        imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
        return new AnonymousClass3NG(imageView);
    }

    public static IgdsButton A0X(View view, int i) {
        View findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        return (IgdsButton) findViewById;
    }

    public static 0xY A0Y(UserSession userSession) {
        return 1Au.A00(userSession).A01.AR4();
    }

    public static AnonymousClass3K2 A0a(Fragment fragment) {
        FragmentActivity requireActivity = fragment.requireActivity();
        1OP r0 = 1OP.$redex_init_class;
        return AnonymousClass3K2.A04(requireActivity);
    }

    public static N4N A0b(C15286UZq uZq) {
        return (N4N) C67757MuC.A03(uZq.A07()).getValue();
    }

    public static C14087Tpd A0c(2Fk r0) {
        Object A02 = r0.A02();
        0qQ.A0A(A02);
        return (C14087Tpd) A02;
    }

    public static EmptyStateView A0d(0S7 r0) {
        0S7.A00(r0);
        View emptyView = r0.A04.getEmptyView();
        emptyView.getClass();
        return (EmptyStateView) emptyView;
    }

    public static Object A0h(AnonymousClass0eM r0, int i) {
        return ((List) r0.getValue()).get(i);
    }

    public static RuntimeException A0i(String str, int i) {
        return new RuntimeException(002.A0R(str, Integer.toHexString(i)));
    }

    public static RuntimeException A0k(String str, int i) {
        return new RuntimeException(002.A0O(str, i));
    }

    public static String A0m(int i) {
        return NumberFormat.getInstance(Locale.getDefault()).format((long) i);
    }

    public static String A0s(Enum enumR) {
        String lowerCase = enumR.name().toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        return lowerCase;
    }

    public static Iterator A0u(AbstractMap abstractMap) {
        Collection values = abstractMap.values();
        0qQ.A07(values);
        return values.iterator();
    }

    public static Map A0w(0Aj r0, Object obj, String str, String str2, AbstractMap abstractMap) {
        r0.AAJ(str, str2);
        return (Map) abstractMap.get(obj);
    }

    public static 0eP A0x(Object obj, Map map) {
        return new 0eP(obj, map.get(obj));
    }

    public static void A0z(Context context, View view, Object obj, int i) {
        view.setContentDescription(context.getString(i, new Object[]{obj}));
    }

    public static void A10(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().remove(str).apply();
    }

    public static void A12(PointF pointF, Random random, float f, float f2, float f3) {
        pointF.y = f3 + f2 + ((f - f2) * random.nextFloat());
    }

    public static void A13(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void A15(BaseBundle baseBundle, W3O w3o) {
        baseBundle.putLong("time_spent", System.currentTimeMillis() - w3o.A07);
    }

    public static void A17(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void A18(View view, float f, int i) {
        W3s.A09(view, C16615UyB.values()[i], Float.valueOf(f));
    }

    public static void A1A(View view, InputMethodManager inputMethodManager) {
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void A1F(0Aj r2, C18662VwK vwK, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("waterfall_id", vwK.A00());
    }

    public static void A1G(0Aj r2, WGU wgu, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("m_pk", wgu.A02);
    }

    public static void A1H(0Aj r2, Product product) {
        r2.A7p("is_checkout_enabled", Boolean.valueOf(product.A04()));
    }

    public static void A1I(0Aj r2, User user) {
        r2.A9F("target_user_type", Long.valueOf((long) user.BIW()));
    }

    public static void A1J(0Ak r2, N3M n3m, Object obj) {
        r2.A0R("category_id", String.valueOf(obj));
        r2.A0R("category_name", n3m.A06);
    }

    public static void A1K(0bb r2, String str, String str2) {
        r2.A06(str, str2);
        r2.A06("nav_chain", AnonymousClass1QI.A00.A02.A00);
    }

    public static void A1L(1yR r2, long j) {
        r2.A02(System.nanoTime() - j);
    }

    public static void A1M(17Z r5, Iterator it) {
        C306506Mk r1 = (C306506Mk) it.next();
        if (r1 != null) {
            r5.A0c();
            if (r1.A00 != null) {
                16P.A03(r5, "path_actions");
                for (C306526Mm r3 : r1.A00) {
                    if (r3 != null) {
                        r5.A0c();
                        if (r3.A03 != null) {
                            r5.A0q("move_to_action");
                            C306516Ml r2 = r3.A03;
                            r5.A0c();
                            r5.A0O("action_x", r2.A00);
                            r5.A0O("action_y", r2.A01);
                            r5.A0Z();
                        }
                        if (r3.A02 != null) {
                            r5.A0q("line_to_action");
                            C306536Mn r22 = r3.A02;
                            r5.A0c();
                            r5.A0O("action_x", r22.A00);
                            r5.A0O("action_y", r22.A01);
                            r5.A0Z();
                        }
                        if (r3.A01 != null) {
                            r5.A0q("close_action");
                            r5.A0c();
                            r5.A0Z();
                        }
                        if (r3.A00 != null) {
                            r5.A0q("add_round_rect_action");
                            C306566Mq r23 = r3.A00;
                            r5.A0c();
                            r5.A0O("rect_left", r23.A03);
                            r5.A0O("rect_top", r23.A05);
                            r5.A0O("rect_right", r23.A04);
                            r5.A0O("rect_bottom", r23.A02);
                            r5.A0O("radius_x", r23.A00);
                            r5.A0O("radius_y", r23.A01);
                            Path.Direction direction = r23.A06;
                            if (direction != null) {
                                r5.A0R("orientation", direction.name());
                            }
                            r5.A0Z();
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
    }

    public static void A1N(1Fa r2, String str, String str2) {
        r2.A9m(str, str2);
        r2.A9m("timezone_offset", String.valueOf(1G0.A00()));
    }

    public static void A1P(AnonymousClass1MK r1, 1NK r2, ImageUrl imageUrl, String str) {
        1OO A0J = r2.A0J(imageUrl, str);
        A0J.A02(r1);
        A0J.A01();
    }

    public static void A1Q(C250603lj r0, C2354830a r1, C229932oe r2, String str) {
        r1.A00(r0);
        r2.A01(r1.A01(), str);
    }

    public static void A1R(Object obj, AbstractCollection abstractCollection, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            abstractCollection.add(obj2);
        }
    }

    public static void A1T(String str, String str2) {
        0I1.A04("ReactNative", 002.A0R(str, str2));
    }

    public static boolean A1W(Resources resources, CharSequence charSequence, int i) {
        String string = resources.getString(i);
        0qQ.A07(string);
        return string.contentEquals(charSequence);
    }

    public static boolean A1Y(C15286UZq uZq) {
        C15272UZa A06 = uZq.A06();
        0qQ.A0C(A06, "null cannot be cast to non-null type com.instagram.base.scrollablenavigation.HasScrollableNavigation");
        return A06.CbJ();
    }

    public static VideoCodecInfo[] A1b(AbstractCollection abstractCollection) {
        return (VideoCodecInfo[]) abstractCollection.toArray(new VideoCodecInfo[abstractCollection.size()]);
    }

    public static double A00(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }
}

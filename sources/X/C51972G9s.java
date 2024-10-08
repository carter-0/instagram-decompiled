package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import org.webrtc.CameraCapturer;

/* renamed from: X.G9s  reason: case insensitive filesystem */
public abstract class C51972G9s {
    public static int A06(int i, int i2, int i3) {
        return i3 | (i & i2) | (1879048192 & i2);
    }

    public static 2WX A0V(2WX r3, Object obj) {
        return new 2WX(r3, new AnonymousClass9JS(AnonymousClass05K.A1F, obj, 4));
    }

    public static Long A0i(String str) {
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static Long A0j(String str) {
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static String A0o(Resources resources, int i) {
        return C253673rC.A04(resources, Integer.valueOf(i), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false);
    }

    public static String A0q(UserSession userSession, 1Xj r3) {
        User A2A = r3.A2A(userSession);
        if (A2A != null) {
            return A2A.getId();
        }
        return null;
    }

    public static LinkedHashMap A0t(Object obj) {
        0qQ.A0B(obj, 0);
        return new LinkedHashMap();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Wub, java.lang.RuntimeException] */
    public static C20561Wub A0v(C286575Wy r1, C286565Wx r2, int i) {
        r1.ExS(i);
        C286565Wx.A0L(r2, false);
        return new RuntimeException();
    }

    public static void A0z(C286575Wy r2, Object obj, Object obj2) {
        C286565Wx.A0L((C286565Wx) r2, false);
        C286645Xf.A04(r2, obj2, (0sL) obj);
    }

    public static void A13(Fragment fragment, RecyclerView recyclerView) {
        recyclerView.A11(C320826t1.A00(fragment.requireContext(), 0, false));
    }

    public static void A19(C320416sL r3) {
        r3.A04((Long) null, (String) null, 0sn.A00, false);
    }

    public static void A1B(Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 4);
    }

    public static void A1C(Object obj, Object obj2) {
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 4);
    }

    public static void A1D(Object obj, Object obj2) {
        0qQ.A0B(obj, 3);
        0qQ.A0B(obj2, 4);
    }

    public static void A1E(Object obj, Object obj2) {
        0qQ.A0B(obj, 6);
        0qQ.A0B(obj2, 7);
    }

    public static boolean A1I(int i) {
        if (i == 4) {
            return true;
        }
        return false;
    }

    public static boolean A1M(int i) {
        return (i & 112) == 32;
    }

    public static boolean A1N(int i) {
        return (i & 896) == 256;
    }

    public static boolean A1O(int i) {
        return (i & 7168) == 2048;
    }

    public static boolean A1P(int i, int i2, int i3) {
        if ((i & i2) == i3) {
            return true;
        }
        return false;
    }

    public static boolean A1S(C286575Wy r1, C286565Wx r2, Object obj, Object obj2) {
        C286565Wx.A0L(r2, false);
        C286645Xf.A04(r1, obj2, (0sL) obj);
        return 0fL.A02();
    }

    public static float A01(C286575Wy r1) {
        return (float) ((Configuration) r1.AJO(AndroidCompositionLocals_androidKt.A00)).screenWidthDp;
    }

    public static int A04(int i, int i2) {
        return i2 | (i & 7168) | (i & 57344);
    }

    public static int A05(int i, int i2) {
        return C229632nm.A04(2SP.A00, new 2HY(i, i2));
    }

    public static int A07(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static long A0F() {
        return 1 | (1 << 32);
    }

    public static GradientDrawable A0H(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    public static C287965b7 A0J(Object obj) {
        return new C287965b7(obj, 1.0f, 1500.0f);
    }

    public static C287965b7 A0K(Object obj) {
        return new C287965b7(obj, 1.0f, 400.0f);
    }

    public static C303876Bd A0L(String str) {
        C303876Bd r0 = new C303876Bd(16);
        r0.A09(str);
        return r0;
    }

    public static 2Wb A0Q(AnonymousClass3Y5 r2) {
        return new 2Wb(r2.A05, new ArrayList());
    }

    public static 2WX A0R(2WX r2, int i, long j) {
        return new 2WX(r2, new AnonymousClass9JR(AnonymousClass05K.A0u, i, j));
    }

    public static 2WX A0S(2WX r2, int i, long j) {
        return new 2WX(r2, new AnonymousClass9JR(AnonymousClass05K.A07, i, j));
    }

    public static 2WX A0T(2WX r2, int i, long j) {
        return new 2WX(r2, new AnonymousClass9JR(AnonymousClass05K.A01, i, j));
    }

    public static 2WX A0U(2WX r2, Integer num, int i) {
        return new 2WX(r2, new AnonymousClass9JS(num, "android.widget.Button", i));
    }

    public static C267324bN A0Y(Object obj) {
        C376489Ie r1 = (C376489Ie) obj;
        0qQ.A0B(r1, 0);
        return (C267324bN) r1.A03;
    }

    public static 0wc A0Z(AnonymousClass0iw r0, AnonymousClass0kM r1) {
        r1.A00 = r0;
        r1.A01(0kJ.A05);
        return r1.A00();
    }

    public static 0wc A0a(AnonymousClass0iw r1, 0lg r2) {
        AnonymousClass0kM r0 = new AnonymousClass0kM(r2);
        r0.A00 = r1;
        return r0.A00();
    }

    public static Object A0k(C286575Wy r1, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        C56547I1b i1b = new C56547I1b();
        r1.FLL(i1b);
        return i1b;
    }

    public static Object A0l(C286575Wy r1, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        AnonymousClass5aS r0 = new AnonymousClass5aS();
        r1.FLL(r0);
        return r0;
    }

    public static Object A0m(Object obj) {
        return ((AnonymousClass371) ((C239793Ih) obj).A00).FH3();
    }

    public static String A0p(C286575Wy r1) {
        return ((AnonymousClass0iw) r1.AJO(C286915Yh.A00)).getModuleName();
    }

    public static Set A0u() {
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        0qQ.A07(synchronizedSet);
        return synchronizedSet;
    }

    public static void A10(C286575Wy r1, Object obj, Object obj2) {
        C286565Wx.A0I((C286565Wx) r1);
        C286645Xf.A04(r1, obj2, (0sL) obj);
    }

    public static void A11(C286575Wy r1, 0sL r2, int i) {
        r2.invoke(r1, Integer.valueOf(i & 14));
        r1.ASN();
    }

    public static void A14(0Aj r2, 1Xj r3) {
        r2.AAJ("ranking_info_token", r3.A0C.getLoggingInfoToken());
    }

    public static void A15(0Aj r2, 1Xj r3) {
        r2.AAJ("mezql_token", r3.A0C.getMezqlToken());
    }

    public static void A17(C244103ae r3) {
        r3.A0L(1.0f);
        r3.A0a(true);
        r3.A0N(0);
        r3.A0E();
    }

    public static void A18(1NY r2, UserSession userSession, Class cls) {
        r2.A02 = new 1NS(new 0bH(userSession), cls);
    }

    public static void A1A(C254523sc r1) {
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str != null) {
            r1.A65 = str;
        }
    }

    public static void A1F(Object obj, Object obj2) {
        0qQ.A0B(obj, 10);
        0qQ.A0B(obj2, 11);
    }

    public static boolean A1J(int i) {
        if (i == 32) {
            return true;
        }
        return false;
    }

    public static boolean A1K(int i) {
        if (i == 16384) {
            return true;
        }
        return false;
    }

    public static boolean A1L(int i) {
        if ((i & 112) == 32) {
            return true;
        }
        return false;
    }

    public static boolean A1V(C286575Wy r0, Object obj, int i) {
        if (i == 0) {
            return r0.AGu(obj);
        }
        return r0.AGw(obj);
    }

    public static boolean A1Z(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean A1a(Object obj) {
        return ((Boolean) ((2Wa) obj).A03).booleanValue();
    }

    public static boolean A1b(Object obj, Object obj2) {
        ((Number) obj).intValue();
        0qQ.A0B(obj2, 0);
        return false;
    }

    public static float A02(C284945Oz r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static float A03(C243673Zt r0) {
        AnonymousClass2VL.A00();
        return ((Number) r0.A00).floatValue();
    }

    public static int A08(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static int A09(Context context, AnonymousClass2WJ r2) {
        return r2.Bnf().A02(2Yu.A0A(context));
    }

    public static int A0A(Context context, AnonymousClass2WJ r2, int i) {
        return r2.Bnf().A02(2Yu.A0H(context, i));
    }

    public static int A0B(AnonymousClass3Y5 r0, double d) {
        return 2Wd.A00(r0.Bnf(), Double.doubleToRawLongBits(d));
    }

    public static int A0C(2Wb r0, double d) {
        return 2Wd.A00(r0.Bnf(), Double.doubleToRawLongBits(d));
    }

    public static int A0D(2Wb r3, int i) {
        return 2Wd.A00(r3.Bnf(), C244013aV.A0C(r3, i));
    }

    public static int A0E(AnonymousClass2WJ r0, double d) {
        return 2Wd.A00(r0.Bnf(), Double.doubleToRawLongBits(d));
    }

    public static long A0G(float f) {
        return ((long) Float.floatToRawIntBits(f)) | 9221683186994511872L;
    }

    public static ViewPropertyAnimator A0I(View view) {
        return view.animate().alpha(0.0f);
    }

    public static 0Aj A0M(AnonymousClass0iw r1, 0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(r1, r2);
        return A01.A00(A01.A00, "instagram_clips_viewer_organic_tap");
    }

    public static 0Aj A0N(AnonymousClass0iw r1, 0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(r1, r2);
        return A01.A00(A01.A00, "instagram_thumbnail_impression");
    }

    public static 0Aj A0O(AnonymousClass0iw r1, 0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(r1, r2);
        return A01.A00(A01.A00, "instagram_clips_viewer_link_tap");
    }

    public static C49724F3n A0P(Context context) {
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        return new C49724F3n(context, locale);
    }

    public static AnonymousClass9JS A0W(AnonymousClass2WJ r1, int i, int i2) {
        return new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r1, i), i2);
    }

    public static 2WL A0X(int i, int i2) {
        return new 2WL(C245133cN.A00(i, i2), (Object) null);
    }

    public static 1Bk A0b(UserSession userSession) {
        1Bk r0 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r0);
        return r0;
    }

    public static 1Bk A0c(UserSession userSession) {
        1Bk r0 = C229232n3.A00(userSession).A00.A01;
        0qQ.A07(r0);
        return r0;
    }

    public static C2354830a A0d(C267324bN r1, Object obj, String str) {
        return AnonymousClass30Y.A00(r1, obj, 002.A0R(str, r1.getId()));
    }

    public static C230472pg A0e(1Xj r0) {
        if (r0.CcK()) {
            return C230472pg.SPONSORED;
        }
        return C230472pg.ORGANIC;
    }

    public static AnonymousClass2pP A0f(0lg r2) {
        return new AnonymousClass2pP(C60510iO.A00(r2), false);
    }

    public static Long A0g(1Xj r1) {
        return Long.valueOf((long) r1.BR7().A00);
    }

    public static Long A0h(User user) {
        return 00y.A0n(10, user.getId());
    }

    public static String A0n() {
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        return obj;
    }

    public static String A0r(UserSession userSession, 1Xj r1) {
        User A2A = r1.A2A(userSession);
        0qQ.A0A(A2A);
        return A2A.getId();
    }

    public static String A0s(Object obj) {
        return String.valueOf(obj.toString().hashCode());
    }

    public static void A0w(Drawable drawable, AnonymousClass2WJ r2, int i) {
        drawable.setColorFilter(AnonymousClass37O.A00(C244013aV.A02(r2, i)));
    }

    public static void A0x(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void A0y(View view, long j) {
        view.measure(C245063cG.A01(j), C245063cG.A00(j));
    }

    public static void A12(AnonymousClass5R3 r0, AnonymousClass5QA r1, AnonymousClass5QD r2, C268024cd r3, AnonymousClass5Q8 r4) {
        r0.EIm();
        r2.EUC(r3);
        r2.Ebv(r4);
        r2.ER3(r1);
    }

    public static void A16(0Aj r2, 1Xj r3, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("m_pk", C294185m0.A09(r3));
    }

    public static void A1G(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass3OA) it.next()).A0K);
    }

    public static void A1H(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C263944Ny) it.next()).A00);
    }

    public static boolean A1Q(C286575Wy r1, int i) {
        return 0qQ.A0K(r1.ECw(), Integer.valueOf(i));
    }

    public static boolean A1R(C286575Wy r0, int i, int i2, int i3) {
        r0.ExS(i);
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public static boolean A1T(C286575Wy r1, Modifier modifier, Object obj, int i) {
        C304846Fl.A02(r1, modifier, AnonymousClass5PI.A01(r1, obj, i));
        return 0fL.A02();
    }

    public static boolean A1U(C286575Wy r1, Modifier modifier, Object obj, int i) {
        C304846Fl.A03(r1, modifier, AnonymousClass5PI.A01(r1, obj, i));
        return 0fL.A02();
    }

    public static boolean A1W(C286575Wy r1, Object obj, Object obj2, boolean z) {
        return z | r1.AGw(obj) | r1.AGu(obj2);
    }

    public static boolean A1X(C286575Wy r1, Object obj, Object obj2, boolean z) {
        return z | r1.AGu(obj) | r1.AGu(obj2);
    }

    public static boolean A1Y(C284945Oz r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}

package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.CoroutineLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.common.dextricks.Constants;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.G9r  reason: case insensitive filesystem */
public abstract class C51971G9r {
    public static float A00(int i) {
        return i != 0 ? 1.0f : 0.0f;
    }

    public static int A08(C286575Wy r2, Object obj) {
        return !r2.AGw(obj) ? 2 : 4;
    }

    public static long A0L(int i) {
        return AnonymousClass5SF.A04(0, i, 0, Integer.MAX_VALUE);
    }

    public static LayoutInflater A0O(Context context) {
        0qQ.A0B(context, 0);
        return LayoutInflater.from(context);
    }

    public static 2WU A0d(AnonymousClass2WT r3, int i) {
        return new 2WU(C243983aS.A00, r3, i, true);
    }

    public static 2WU A0e(AnonymousClass2WT r3, boolean z) {
        return new 2WU(C243983aS.A00, r3, 3, z);
    }

    public static C331137Ps A0h(int i) {
        return new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", i, i);
    }

    public static Object A0o(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        return valueAnimator.getAnimatedValue();
    }

    public static void A17(0Aj r2, int i) {
        r2.A9F("chaining_position", Long.valueOf((long) i));
    }

    public static void A1I(2Wa r1) {
        r1.A01(false);
    }

    public static void A1P(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new C66161MFy(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static void A1Q(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MG6(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static float A01(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A04(int i) {
        return (i & 14) | (i & 112) | (i & 896);
    }

    public static int A07(C286575Wy r2, Object obj) {
        if (!r2.AGu(obj)) {
            return 1024;
        }
        return C249703kE.FLAG_MOVED;
    }

    public static int A09(C286575Wy r2, Object obj) {
        if (!r2.AGw(obj)) {
            return 1024;
        }
        return C249703kE.FLAG_MOVED;
    }

    public static int A0A(C286575Wy r2, Object obj) {
        if (!r2.AGw(obj)) {
            return 8192;
        }
        return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    }

    public static int A0C(2V1 r1, AnonymousClass2WJ r2) {
        return r2.Bnf().A02(2Yu.A0A(r1.A0C));
    }

    public static int A0E(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int A0H(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static long A0J() {
        return 0 << 32;
    }

    public static long A0K() {
        return ((long) Float.floatToRawIntBits(14.0f)) | 9221683186994511872L;
    }

    public static Bundle A0N(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", str);
        return bundle;
    }

    public static C285045Pl A0P(C285045Pl r1) {
        if (r1 == null) {
            return new C285045Pl(new C267794cD[16]);
        }
        return r1;
    }

    public static AnonymousClass5RD A0R(C287325Zx r2, C286575Wy r3, C287265Zr r4, int i) {
        return C291495hO.A02(r2, r3, r4, (i & 112) | (i & 14));
    }

    public static C587707f A0U(Object obj) {
        return ((Fragment) obj).requireActivity().getViewModelStore();
    }

    public static 2WX A0V(2V1 r2, 2WX r3, C243533Zd r4, String str) {
        return new 2WX(r3, new C243543Ze(r2, r4, str));
    }

    public static 2WX A0W(2V5 r2, 2WX r3, Integer num) {
        return new 2WX(r3, new AnonymousClass9JS(r2, num));
    }

    public static 2WX A0X(2WX r2, Integer num, float f, int i) {
        return new 2WX(r2, new AnonymousClass9JQ(num, f, i));
    }

    public static 2WX A0Y(2WX r2, Integer num, Object obj, int i) {
        return new 2WX(r2, new AnonymousClass9JS(num, obj, i));
    }

    public static 2WX A0Z(2WX r2, Integer num, Object obj, String str) {
        return new 2WX(r2, new C244253at(num, obj, str));
    }

    public static C246153e7 A0f(Context context, AnonymousClass3W2 r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        return new C246153e7(new AnonymousClass4HH(context, r3, userSession, r5), userSession, r5, r6);
    }

    public static NDr A0i(Object obj) {
        NCZ ncz = (NCZ) obj;
        0qQ.A0B(ncz, 0);
        return ncz.A06;
    }

    public static 1Ua A0j(UserSession userSession) {
        return 1UX.A00(userSession.A03.A06(), userSession);
    }

    public static Long A0m() {
        return 0L;
    }

    public static String A0r(1Xj r0) {
        return C254373sN.A06(r0.A0C.BIl());
    }

    public static String A0s(1Xj r0) {
        if (r0 != null) {
            return r0.getId();
        }
        return null;
    }

    public static String A0t(User user) {
        if (user != null) {
            return user.getUsername();
        }
        return null;
    }

    public static 0eP A0x(Object obj, long j) {
        return new 0eP(obj, new AnonymousClass5RW(j));
    }

    public static void A12(C286575Wy r1, Object obj, Object obj2) {
        C287595aO.A00(r1, obj, C287485aD.A03);
        C287595aO.A00(r1, obj2, C287485aD.A05);
    }

    public static void A14(GridLayoutManager gridLayoutManager, C320516sV r2) {
        gridLayoutManager.A01 = (C320806sz) r2.A0N.getValue();
    }

    public static void A15(AnonymousClass0Ac r1, AnonymousClass0Ac r2, 0Aj r3) {
        r3.A8M(r1, "entrypoint");
        r3.A8M(r2, "surface");
    }

    public static void A16(AnonymousClass0Ac r1, 0Aj r2, String str) {
        r2.A8M(r1, "pivot_page_entry_point");
        r2.AAJ("pivot_page_session_id", str);
    }

    public static void A19(0Aj r1, String str, String str2) {
        r1.AAJ("question_id", str);
        r1.AAJ("answer_id", str2);
    }

    public static void A1A(0Aj r1, String str, String str2) {
        r1.AAJ("container_module", str);
        r1.AAJ("inventory_source", str2);
    }

    public static void A1B(0bb r2, LoggingContext loggingContext) {
        r2.A05("product_id", Long.valueOf(loggingContext.A00));
    }

    public static void A1H(2V1 r0, 2Vh r1, C251283mr r2, AnonymousClass2V9 r3) {
        if (r1 != null) {
            r1.A00 = r0;
            r1.A01 = r2;
            r3.A01(r1);
        }
    }

    public static void A1L(C254523sc r1, 1PW r2) {
        r1.A06(r2.A01);
        r1.A0A(r2.A04);
    }

    public static void A1N(Object obj, long j) {
        ((0sP) obj).invoke(new C289295dM(j));
    }

    public static boolean A1Y(1Xj r0) {
        return C263304Kd.A03(r0.A0C.getClipsMetadata());
    }

    public static float A02(C284945Oz r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static float A03(C270284gU r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A05(C286575Wy r0, int i, int i2) {
        r0.Evl();
        if ((i & 8) != 0) {
            return i2 & -7169;
        }
        return i2;
    }

    public static int A06(C286575Wy r0, int i, int i2) {
        r0.Evl();
        if ((i & 4) != 0) {
            return i2 & -897;
        }
        return i2;
    }

    public static int A0B(C284945Oz r0) {
        return ((Number) r0.getValue()).intValue();
    }

    public static int A0D(Number number, String str) {
        return str.hashCode() + number.intValue();
    }

    public static int A0F(String str, int i, int i2) {
        return (i2 + str.hashCode() + i) * 31;
    }

    public static int A0G(String str, String str2) {
        return 00l.A07(str, str2, str.length() - 1);
    }

    public static int A0I(List list, int i) {
        return ((Number) list.get(i)).intValue();
    }

    public static Resources A0M(C70832Wc r0) {
        return r0.Aqq().A0C.getResources();
    }

    public static Modifier A0Q(Modifier modifier, float f) {
        return AnonymousClass6FZ.A01(C287205Zk.A0C(modifier, f), AnonymousClass5ZN.A00);
    }

    public static AnonymousClass5RD A0S(C286575Wy r2, float f) {
        return C287395a4.A00(C287275Zs.A01(f), r2, C287215Zl.A04);
    }

    public static CoroutineLiveData A0T(2YL r0, AnonymousClass0r6 r1) {
        return C226292g8.A00(C318116oQ.A00(r0).A00, r1);
    }

    public static C247393gG A0a(Drawable drawable, 2V1 r2) {
        C247393gG A00 = C247373gE.A00(r2);
        A00.A0D(drawable);
        A00.A0B();
        return A00;
    }

    public static C244103ae A0b(2V1 r0, 2V5 r1, CharSequence charSequence, int i) {
        C244103ae A00 = 2WW.A00(r0, i);
        A00.A0V(charSequence);
        A00.A0U(r1);
        return A00;
    }

    public static 2WW A0c(AnonymousClass2VW r0, 2WX r1, C244103ae r2) {
        r2.A05(r0);
        C244123ag.A00(r2, r1);
        return r2.A0A();
    }

    public static 27r A0g(AnonymousClass0eM r0) {
        return 27p.A01((UserSession) r0.getValue());
    }

    public static F3W A0k(String str) {
        IgFragmentFactoryImpl.A00();
        F3W f3w = new F3W();
        f3w.A0B = str;
        return f3w;
    }

    public static IllegalArgumentException A0l(String str, String str2, int i, int i2) {
        return new IllegalArgumentException(002.A02(i, i2, str, str2));
    }

    public static Long A0n(int i, String str) {
        0qQ.A0B(str, i);
        return 00y.A0n(10, str);
    }

    public static Object A0p(Iterator it) {
        return ((Map.Entry) it.next()).getValue();
    }

    public static String A0q(C284945Oz r0) {
        return ((C285975Tl) r0.getValue()).A01.A00;
    }

    public static String A0u(Iterator it) {
        return ((C267324bN) it.next()).getId();
    }

    public static String A0v(Iterator it) {
        return ((1Xj) it.next()).getId();
    }

    public static Map A0w(String str, AnonymousClass0eM r2) {
        return ((AnonymousClass4LR) r2.getValue()).Bay(str);
    }

    public static void A0y(SpannableStringBuilder spannableStringBuilder, Object obj, int i) {
        spannableStringBuilder.setSpan(obj, i, spannableStringBuilder.length(), 33);
    }

    public static void A0z(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void A10(C305006Gb r2, Object obj, 0sP r4, int i) {
        r2.CfA((0sP) null, r4, AnonymousClass5PI.A02(obj), i);
    }

    public static void A11(C286575Wy r2, C286705Xl r3, Object obj, int i) {
        C286715Xm.A00(r2, r3, AnonymousClass5PI.A01(r2, obj, i), 56);
    }

    public static void A13(C286575Wy r1, 0sL r2, int i) {
        Integer valueOf = Integer.valueOf(i);
        r1.FLL(valueOf);
        r1.ABr(valueOf, r2);
    }

    public static void A18(0Aj r1, 0xF r2, String str) {
        String A05 = r2.A05(str);
        if (A05 != null) {
            r1.AAJ(str, A05);
        }
    }

    public static void A1C(C251263mp r0, 2Wb r1, 2Wb r2, 2WX r3) {
        r1.A00(r0);
        r2.A00(C243563Zg.A0B(r1, r2, r3));
    }

    public static void A1D(C251263mp r0, 2Wb r1, 2Wb r2, 2WX r3) {
        r1.A00(r0);
        r2.A00(C243563Zg.A03(r1, r2, r3));
    }

    public static void A1E(C251263mp r0, 2Wb r1, 2Wb r2, 2WX r3) {
        r1.A00(r0);
        r2.A00(C243563Zg.A0G(r1, r2, r3));
    }

    public static void A1F(C251263mp r0, 2Wb r1, 2Wb r2, 2WX r3) {
        r1.A00(r0);
        r2.A00(C243563Zg.A05(r1, r2, r3));
    }

    public static void A1G(C251263mp r0, 2Wb r1, 2Wb r2, 2WX r3, C243583Zi r4) {
        r1.A00(r0);
        r2.A00(C243563Zg.A0K(r1, r2, r3, r4));
    }

    public static void A1J(C244103ae r1, AnonymousClass2V4 r2, int i, long j) {
        r1.A0Q(2Wd.A00(r2, j));
        r1.A0R(i);
    }

    public static void A1K(UserSession userSession) {
        1wS.A01(userSession).A0C(3);
    }

    public static void A1M(1Xj r0, AbstractCollection abstractCollection) {
        String id = r0.getId();
        if (id != null) {
            abstractCollection.add(id);
        }
    }

    public static void A1O(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.add(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static boolean A1R(C286575Wy r0) {
        r0.ASN();
        r0.ASN();
        return 0fL.A02();
    }

    public static boolean A1S(C286575Wy r0, C286565Wx r1, boolean z) {
        C286565Wx.A0L(r1, z);
        r0.ASN();
        return 0fL.A02();
    }

    public static boolean A1T(C286575Wy r0, Object obj, Object obj2) {
        return r0.AGu(obj) | r0.AGw(obj2);
    }

    public static boolean A1U(C286575Wy r0, Object obj, Object obj2) {
        return r0.AGu(obj) | r0.AGu(obj2);
    }

    public static boolean A1V(C286575Wy r0, Object obj, Object obj2) {
        return r0.AGw(obj) | r0.AGw(obj2);
    }

    public static boolean A1W(C284945Oz r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static boolean A1X(C270284gU r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static boolean A1Z(Object obj, Object obj2, boolean z) {
        if (0qQ.A0K(obj, obj2)) {
            return true;
        }
        return z;
    }

    public static boolean A1a(Object obj, 0sP r1) {
        return ((Boolean) r1.invoke(obj)).booleanValue();
    }

    public static boolean A1b(C62320sa r0) {
        return ((Boolean) r0.invoke()).booleanValue();
    }
}

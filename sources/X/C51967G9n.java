package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.G9n  reason: case insensitive filesystem */
public abstract class C51967G9n {
    public static float A00(float f, float f2) {
        return (f - f2) / 2.0f;
    }

    public static LazyListState A0A(C286575Wy r2) {
        return C305066Gi.A00(r2, 0, 0, 0, 3);
    }

    public static Modifier A0B(C286565Wx r1, Modifier modifier, Modifier modifier2) {
        C286565Wx.A0L(r1, false);
        return modifier.Ezh(modifier2);
    }

    public static Modifier A0C(Modifier modifier, float f) {
        return C287195Zj.A0B(modifier, 0.0f, 0.0f, 0.0f, f);
    }

    public static Modifier A0D(Modifier modifier, float f) {
        return C287195Zj.A0B(modifier, 0.0f, f, 0.0f, 0.0f);
    }

    public static Modifier A0E(Modifier modifier, float f) {
        return C287195Zj.A0B(modifier, f, 0.0f, 0.0f, 0.0f);
    }

    public static Modifier A0F(Modifier modifier, float f) {
        return C287195Zj.A09(modifier, 0.0f, f);
    }

    public static Modifier A0G(Modifier modifier, float f) {
        return C287195Zj.A09(modifier, f, 0.0f);
    }

    public static AnonymousClass2DO A0J(C286575Wy r1, int i) {
        return C287975bA.A00(r1, i, 0);
    }

    public static AnonymousClass9JR A0V(long j) {
        return new AnonymousClass9JR(AnonymousClass05K.A15, 0, j);
    }

    public static Boolean A0f(C286565Wx r1, boolean z) {
        C286565Wx.A0L(r1, false);
        return Boolean.valueOf(z);
    }

    public static Float A0g() {
        return Float.valueOf(0.0f);
    }

    public static Integer A0j() {
        return -1;
    }

    public static Integer A0k() {
        return 0;
    }

    public static List A0s(Object[] objArr) {
        0qQ.A0B(objArr, 0);
        return 03t.A0I(objArr);
    }

    public static 02z A0u() {
        return 106.A01((Object) null);
    }

    public static void A10(C305006Gb r2, Object obj, int i) {
        r2.Cf4((Object) null, AnonymousClass5PI.A04(obj, i, true));
    }

    public static boolean A1X(C286575Wy r1, Modifier modifier) {
        C287675aa.A02(r1, modifier, 0);
        return 0fL.A02();
    }

    public static int A01(int i) {
        int i2 = AnonymousClass3XX.A00;
        return View.MeasureSpec.makeMeasureSpec(i, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public static int A02(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A04(Number number, int i) {
        if (number != null) {
            return number.intValue();
        }
        return i;
    }

    public static long A05(AnonymousClass5QB r3) {
        long j = r3.A00;
        r3.A01.EJt();
        return j;
    }

    public static long A08(Number number, long j) {
        if (number != null) {
            return number.longValue();
        }
        return j;
    }

    public static Context A09(AnonymousClass3Y5 r0) {
        Context context = r0.A05.A0C;
        0qQ.A07(context);
        return context;
    }

    public static Modifier A0H(Modifier modifier, float f) {
        return C287195Zj.A09(modifier, f, 8.0f);
    }

    public static AnonymousClass5RW A0I(long j) {
        return new AnonymousClass5RW(j << 32);
    }

    public static C285975Tl A0L(String str) {
        return new C285975Tl(str, C285965Tk.A01);
    }

    public static AnonymousClass9JR A0S(int i, long j) {
        return new AnonymousClass9JR(AnonymousClass05K.A04, i, j);
    }

    public static AnonymousClass9JR A0T(int i, long j) {
        return new AnonymousClass9JR(AnonymousClass05K.A09, i, j);
    }

    public static AnonymousClass9JR A0U(int i, long j) {
        return new AnonymousClass9JR(AnonymousClass05K.A07, i, j);
    }

    public static 2WU A0W(AnonymousClass2WT r2, int i, boolean z) {
        return new 2WU(C243983aS.A00, r2, i, z);
    }

    public static C239793Ih A0d() {
        return new C239793Ih(C60340gF.A00);
    }

    public static Float A0h() {
        return Float.valueOf(1.0f);
    }

    public static IllegalArgumentException A0i() {
        return new IllegalArgumentException("Failed requirement.");
    }

    public static Integer A0l(int i) {
        if (i != 0) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public static void A17(0Aj r2) {
        r2.AAJ("viewer_session_id", "");
    }

    public static int A03(Number number, int i) {
        0qQ.A0B(number, i);
        return number.intValue();
    }

    public static long A06(AnonymousClass2WJ r1) {
        return C244013aV.A0C(r1, R.dimen.abc_dialog_padding_material);
    }

    public static long A07(AnonymousClass2WJ r1) {
        return C244013aV.A0C(r1, R.dimen.account_group_management_clickable_width);
    }

    public static C286025Tq A0K(C303876Bd r0, String str, String str2, int i, int i2) {
        r0.A0A(str, str2, i, i2);
        return r0.A02();
    }

    public static C318136oS A0M(2YL r0, C262094Cc r1, 0sL r2, C262224Cq r3) {
        1Eo.A05(r1, r2, r3);
        return C318116oQ.A00(r0);
    }

    public static 2Tl A0N(C251263mp r0, 2Wb r1, C70832Wc r2, 2WX r3) {
        r1.A00(r0);
        return C243563Zg.A03(r1, r2, r3);
    }

    public static 2Tp A0O(C251263mp r0, 2Wb r1, C70832Wc r2, 2WX r3) {
        r1.A00(r0);
        return C243563Zg.A0E(r1, r2, r3);
    }

    public static 2Tp A0P(C251263mp r0, 2Wb r1, C70832Wc r2, 2WX r3) {
        r1.A00(r0);
        return C243563Zg.A0G(r1, r2, r3);
    }

    public static 2Tp A0Q(C251263mp r0, 2Wb r1, C70832Wc r2, 2WX r3) {
        r1.A00(r0);
        return C243563Zg.A0B(r1, r2, r3);
    }

    public static 2WW A0R(2WX r0, C244103ae r1) {
        C244123ag.A00(r1, r0);
        return r1.A0A();
    }

    public static C238833Dp A0X(0lg r0) {
        C238833Dp A00 = C238833Dp.A00(r0);
        0qQ.A07(A00);
        return A00;
    }

    public static C229352nF A0Y(UserSession userSession) {
        C229352nF A00 = C229342nE.A00(userSession);
        0qQ.A07(A00);
        return A00;
    }

    public static 0wc A0Z(AnonymousClass0iw r0, 0lg r1, Object obj, int i) {
        0qQ.A0B(obj, i);
        return AnonymousClass0kN.A01(r0, r1);
    }

    public static C287065Yw A0a(C286575Wy r0, int i) {
        r0.ExS(i);
        return AnonymousClass5aQ.A00(r0);
    }

    public static AnonymousClass5ZE A0b(C286575Wy r0, int i) {
        r0.ExS(i);
        return AnonymousClass5aQ.A01(r0);
    }

    public static C254523sc A0c(UserSession userSession, 1Xj r2, AnonymousClass4DU r3, String str) {
        C254523sc A04 = C254513sb.A04(r2, r3, str);
        A04.A0G(userSession, r2);
        return A04;
    }

    public static Boolean A0e(C286575Wy r1, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        r1.FLL(valueOf);
        return valueOf;
    }

    public static Object A0m(C286575Wy r0, int i) {
        r0.ExS(i);
        return r0.ECw();
    }

    public static Object A0n(C286575Wy r0, C270284gU r1, int i) {
        r0.ExS(i);
        return r1.getValue();
    }

    public static Object A0o(C286565Wx r0, C270284gU r1, boolean z) {
        C286565Wx.A0L(r0, z);
        return r1.getValue();
    }

    public static String A0p(Context context, int i) {
        String string = context.getString(i);
        0qQ.A0A(string);
        return string;
    }

    public static String A0q(String str, int i, int i2) {
        String substring = str.substring(i, i2);
        0qQ.A07(substring);
        return substring;
    }

    public static String A0r(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static Set A0t(Object[] objArr, int i) {
        0qQ.A0B(objArr, i);
        return 03t.A0K(objArr);
    }

    public static void A0v() {
        C318996ps.A00().A03();
    }

    public static void A0w(int i, 0sP r1) {
        r1.invoke(Integer.valueOf(i));
    }

    public static void A0x(View view, int i, int i2) {
        view.findViewById(i).setVisibility(i2);
    }

    public static void A0y(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A0z(View view, C2354830a r2, 2el r3) {
        r3.A05(view, r2.A01());
    }

    public static void A11(C305006Gb r1, Object obj, Object obj2, int i) {
        r1.Cf4(obj2, AnonymousClass5PI.A03(obj, i));
    }

    public static void A12(C305006Gb r1, Object obj, 0sP r3, 0sP r4, int i) {
        r1.CfA(r3, r4, AnonymousClass5PI.A02(obj), i);
    }

    public static void A13(C286575Wy r1, Modifier modifier, float f) {
        C289585dr.A00(r1, C287205Zk.A0D(modifier, f));
    }

    public static void A14(C284945Oz r1, float f) {
        r1.Epw(Float.valueOf(f));
    }

    public static void A15(C284945Oz r1, int i) {
        r1.Epw(Integer.valueOf(i));
    }

    public static void A16(C284945Oz r1, boolean z) {
        r1.Epw(Boolean.valueOf(z));
    }

    public static void A18(0Aj r1, String str) {
        r1.AAJ(Py2.A00(), str);
    }

    public static void A19(2V5 r1, float f) {
        r1.A00(Float.valueOf(f));
    }

    public static void A1A(2V5 r1, int i) {
        r1.A00(Integer.valueOf(i));
    }

    public static void A1B(2V5 r1, boolean z) {
        r1.A00(Boolean.valueOf(z));
    }

    public static void A1C(2Wb r0, 2Wb r1, 2WX r2) {
        r1.A00(C243563Zg.A0E(r0, r1, r2));
    }

    public static void A1D(2Wb r0, 2Wb r1, 2WX r2) {
        r1.A00(C243563Zg.A0F(r0, r1, r2));
    }

    public static void A1E(2Wb r0, 2Wb r1, 2WX r2) {
        r1.A00(C243563Zg.A0B(r0, r1, r2));
    }

    public static void A1F(2Wb r0, 2Wb r1, 2WX r2) {
        r1.A00(C243563Zg.A03(r0, r1, r2));
    }

    public static void A1G(2Wb r1, C244103ae r2) {
        r1.A00(r2.A0A());
    }

    public static void A1H(2Wa r1, int i) {
        r1.A01(Integer.valueOf(i));
    }

    public static void A1I(2Wa r1, boolean z) {
        r1.A01(Boolean.valueOf(z));
    }

    public static void A1J(0j9 r1, 0jB r2, boolean z) {
        r2.A04(r1, Boolean.valueOf(z));
    }

    public static void A1K(UserSession userSession, 1Xj r1) {
        1E7.A00(userSession).A03(r1);
    }

    public static void A1L(Object obj, Object obj2, Object obj3, 0sJ r4, int i) {
        r4.invoke(obj, obj2, obj3, Integer.valueOf(i));
    }

    public static void A1M(Object obj, Object obj2, 0sK r3, int i) {
        r3.invoke(obj, obj2, Integer.valueOf(i));
    }

    public static void A1N(Object obj, Object obj2, 0sK r3, boolean z) {
        r3.invoke(obj, obj2, Boolean.valueOf(z));
    }

    public static void A1O(Object obj, Map map, int i) {
        map.put(Integer.valueOf(i), obj);
    }

    public static void A1P(Object obj, 0sL r2, int i) {
        r2.invoke(obj, Integer.valueOf(i));
    }

    public static void A1Q(0sP r1, float f) {
        r1.invoke(Float.valueOf(f));
    }

    public static boolean A1R(C286575Wy r0) {
        r0.ASN();
        return 0fL.A02();
    }

    public static boolean A1S(C286575Wy r0) {
        r0.ASM();
        return 0fL.A02();
    }

    public static boolean A1T(C286575Wy r0, int i) {
        r0.ExV(i);
        return 0fL.A02();
    }

    public static boolean A1U(C286575Wy r0, int i) {
        r0.ExS(i);
        return 0fL.A02();
    }

    public static boolean A1V(C286575Wy r0, int i, int i2) {
        r0.ExS(i);
        return r0.AGs(i2);
    }

    public static boolean A1W(C286575Wy r0, int i, boolean z) {
        r0.ExS(i);
        return r0.AGv(z);
    }

    public static boolean A1Y(C286575Wy r0, Object obj, int i) {
        r0.ExS(i);
        return r0.AGu(obj);
    }

    public static boolean A1Z(C286575Wy r0, Object obj, int i) {
        r0.ExS(i);
        return r0.AGw(obj);
    }

    public static boolean A1a(C286565Wx r0) {
        C286565Wx.A0I(r0);
        return 0fL.A02();
    }

    public static boolean A1b(C286565Wx r0, boolean z) {
        C286565Wx.A0L(r0, z);
        return 0fL.A02();
    }
}

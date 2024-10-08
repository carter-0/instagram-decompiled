package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.G9o  reason: case insensitive filesystem */
public abstract class C51968G9o {
    public static C267794cD A0N(C285045Pl r1, int i) {
        return (C267794cD) r1.A00(i - 1);
    }

    public static C288185bV A0R(long j) {
        return new C288185bV(j, 5);
    }

    public static AnonymousClass5RD A0V(C286575Wy r3) {
        return C287395a4.A02(C287275Zs.A01, r3, C287215Zl.A05, 0);
    }

    public static 0Tu A0b(Object obj) {
        0qQ.A0B(obj, 0);
        return 0Tu.A06;
    }

    public static AnonymousClass9JS A0d(Integer num, Object obj) {
        return new AnonymousClass9JS(num, obj, 3);
    }

    public static AnonymousClass9JS A0e(Integer num, Object obj) {
        return new AnonymousClass9JS(num, obj, 4);
    }

    public static 1Xj A0l(C267324bN r1) {
        0qQ.A0B(r1, 0);
        return r1.A02;
    }

    public static String A15(User user) {
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    public static C62320sa A19(C286565Wx r1, Object obj) {
        C286565Wx.A0L(r1, false);
        return (C62320sa) ((C59520Ya) obj);
    }

    public static 0sP A1A(C286565Wx r1, Object obj) {
        C286565Wx.A0L(r1, false);
        return (C59520Ya) obj;
    }

    public static void A1C(Context context, 1Fa r3, UserSession userSession) {
        1G2.A00(context, r3, userSession, new 1Cn(context), false);
    }

    public static void A1E(C286575Wy r1, C286565Wx r2, Object obj, Object obj2) {
        C286565Wx.A0L(r2, false);
        C286645Xf.A04(r1, obj2, (0sL) obj);
    }

    public static void A1H(C285635Sb r2, AnonymousClass5SW r3, AnonymousClass0eL r4) {
        r3.ENH(r2, new C290145ep((String) null, r4));
    }

    public static boolean A1Q(int i) {
        if ((i & 14) != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1R(int i) {
        if ((i & 14) == 4) {
            return true;
        }
        return false;
    }

    public static boolean A1T(C286575Wy r0, Object obj, boolean z, boolean z2) {
        return z | z2 | r0.AGw(obj);
    }

    public static boolean A1U(C286575Wy r0, Object obj, boolean z, boolean z2) {
        return z | z2 | r0.AGu(obj);
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A03(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int A0B(Object obj) {
        return ((Number) obj).intValue() & 3;
    }

    public static int A0C(Object obj) {
        return ((Number) obj).intValue() & 11;
    }

    public static int A0D(Object obj) {
        return ((Number) obj).intValue() & 17;
    }

    public static int A0E(Object obj) {
        return ((Number) obj).intValue() & 81;
    }

    public static long A0H(AnonymousClass5Q3 r4) {
        return C298565tf.A00(r4.Bwg(), 0);
    }

    public static Context A0I(C286575Wy r1) {
        return (Context) r1.AJO(AndroidCompositionLocals_androidKt.A01);
    }

    public static Context A0J(Object obj) {
        Context context = (Context) obj;
        0qQ.A0B(context, 0);
        return context;
    }

    public static C305006Gb A0L(Object obj) {
        C305006Gb r1 = (C305006Gb) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static Modifier A0O() {
        return Modifier.A00.Ezh(C287205Zk.A01);
    }

    public static AnonymousClass5RU A0S(Object obj) {
        AnonymousClass5RU r1 = (AnonymousClass5RU) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass5Q3 A0T(Object obj) {
        AnonymousClass5Q3 r1 = (AnonymousClass5Q3) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static C268064ch A0U(Object obj) {
        C268064ch r1 = (C268064ch) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass5RD A0W(C286575Wy r2) {
        return C287395a4.A01(C287275Zs.A01, r2, C287215Zl.A04);
    }

    public static AnonymousClass5RD A0X(C286575Wy r2) {
        return C291495hO.A00(C287275Zs.A07, r2, C287215Zl.A00);
    }

    public static C268024cd A0Y(C286575Wy r1) {
        return (C268024cd) r1.AJO(AnonymousClass5YA.A01);
    }

    public static C70762Uy A0a(Object obj) {
        C70762Uy r1 = (C70762Uy) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass9JQ A0c(Integer num, int i) {
        return new AnonymousClass9JQ(num, 100.0f, i);
    }

    public static 2WE A0f(Object obj) {
        2WE r1 = (2WE) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static C333867aH A0g(MediaCommentListRepository mediaCommentListRepository) {
        return (C333867aH) mediaCommentListRepository.A0L.getValue();
    }

    public static UserSession A0h(C286575Wy r1) {
        return (UserSession) r1.AJO(C286955Yl.A00);
    }

    public static C53032GhN A0i(H13 h13) {
        return (C53032GhN) h13.A08.getValue();
    }

    public static C53004Ggv A0j(C54136H0f h0f) {
        return (C53004Ggv) h0f.A01.getValue();
    }

    public static 1Xj A0m(Object obj) {
        1Xj r1 = (1Xj) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static C53043Ghb A0p(C54177H1x h1x) {
        return (C53043Ghb) h1x.A0C.getValue();
    }

    public static C53015Gh6 A0q(H18 h18) {
        return (C53015Gh6) h18.A0F.getValue();
    }

    public static Object A0y(Object obj) {
        AnonymousClass2VL.A00();
        return ((C243673Zt) obj).A00;
    }

    public static C58132Imy A1B(C286575Wy r1, Object obj, int i) {
        C58132Imy imy = new C58132Imy(obj, i);
        r1.FLL(imy);
        return imy;
    }

    public static void A1D(View view, int i) {
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i));
    }

    public static void A1F(C286575Wy r0, C286565Wx r1, Object obj, Object obj2, boolean z) {
        C286565Wx.A0L(r1, z);
        C286645Xf.A03(r0, obj2, (0sP) obj);
    }

    public static void A1G(AnonymousClass5QB r0, AnonymousClass5QD r1, long j) {
        r0.A01.EIm();
        r1.ElR(j);
    }

    public static void A1N(Object obj) {
        C286565Wx.A0L((C286565Wx) obj, false);
    }

    public static void A1P(0sL r1, C262224Cq r2, AnonymousClass0r6 r3) {
        AnonymousClass11O.A03(r2, new C61860pz(r1, r3));
    }

    public static boolean A1S(int i) {
        if ((i & 112) == 32) {
            return true;
        }
        return false;
    }

    public static boolean A1Y(Object obj) {
        C286565Wx.A0L((C286565Wx) obj, false);
        return false;
    }

    public static float A01(C270284gU r0) {
        return ((C289095d0) r0.getValue()).A00;
    }

    public static int A04(Context context) {
        return context.getColor(2Yu.A07(context));
    }

    public static int A05(Context context, AnonymousClass2WJ r1) {
        return C244013aV.A02(r1, 2Yu.A0A(context));
    }

    public static int A06(Context context, AnonymousClass2WJ r2) {
        return r2.Bnf().A02(2Yu.A07(context));
    }

    public static int A07(Context context, AnonymousClass2WJ r1) {
        return C244013aV.A02(r1, 2Yu.A08(context));
    }

    public static int A08(Context context, AnonymousClass2WJ r1, int i) {
        return C244013aV.A02(r1, 2Yu.A0H(context, i));
    }

    public static int A09(2Wb r0, long j) {
        return 2Wd.A00(r0.Bnf(), j);
    }

    public static int A0A(AnonymousClass30Y r0, C252093oY r1) {
        return r1.CEk(r0).intValue();
    }

    public static int A0F(String str, int i) {
        return (str.hashCode() + i) * 31;
    }

    public static long A0G(C284945Oz r1) {
        return ((C285975Tl) r1.getValue()).A00;
    }

    public static Drawable A0K(AnonymousClass2WJ r0, int i) {
        return C244013aV.A0D(r0, i).mutate();
    }

    public static C284945Oz A0M(C286575Wy r1, C267304bL r2) {
        return C287175Zh.A00(r1, r1.AJO(r2));
    }

    public static Modifier A0P(Modifier modifier, float f) {
        return AnonymousClass6FZ.A01(modifier, AnonymousClass5ZN.A01(f));
    }

    public static Modifier A0Q(Modifier modifier, float f, float f2, long j) {
        return C304816Fi.A03(modifier, AnonymousClass5ZN.A01(f), f2, j);
    }

    public static 2V5 A0Z(AnonymousClass3Y5 r1, float f) {
        return C247343gB.A00(r1, Float.valueOf(f));
    }

    public static C52476GUc A0k(C52477GUf gUf) {
        return gUf.A05().A00();
    }

    public static 1Xj A0n(Iterator it) {
        return ((C267324bN) it.next()).A02;
    }

    public static 0xa A0o(AnonymousClass0eM r0) {
        return ((1Av) r0.getValue()).A01;
    }

    public static Double A0r(0Tu r0, 0lg r1, long j) {
        return Double.valueOf(182.A00(r0, r1, j));
    }

    public static Integer A0s(AnonymousClass3W1 r0) {
        return Integer.valueOf(r0.getPosition());
    }

    public static Integer A0t(List list) {
        return Integer.valueOf(list.size());
    }

    public static Long A0u() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static Long A0v(Number number) {
        return Long.valueOf(number.longValue());
    }

    public static Object A0w(int i, 0sP r1) {
        return r1.invoke(Integer.valueOf(i));
    }

    public static Object A0x(C267324bN r0, AbstractMap abstractMap) {
        return abstractMap.get(r0.getId());
    }

    public static Object A0z(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static Object A10(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static String A11(Context context, C266444Yx r1) {
        return C66909Mes.A00(context, r1).toString();
    }

    public static String A12(C286575Wy r0, C61083JwL jwL) {
        return C59846JaM.A01(r0, jwL).toString();
    }

    public static String A13(C286575Wy r1, Number number) {
        return C288035bG.A00(r1, number.intValue());
    }

    public static String A14(C286575Wy r1, Object obj, int i) {
        return C288035bG.A01(r1, new Object[]{obj}, i);
    }

    public static String A16(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static Iterator A17(C286575Wy r0, List list, int i) {
        r0.ExS(i);
        return list.iterator();
    }

    public static ListIterator A18(List list) {
        return list.listIterator(list.size());
    }

    public static void A1I(0Aj r1, Long l, String str, String str2) {
        r1.AAJ(str, str2);
        r1.A9F("media_id", l);
    }

    public static void A1J(1NY r1, Class cls, Class cls2, String str) {
        r1.A0Q(cls, cls2);
        r1.A0G("max_id", str);
    }

    public static void A1K(1Fa r1, String str, String str2) {
        r1.A0A(str);
        r1.A9m("media_id", str2);
    }

    public static void A1L(1Fa r1, String str, String str2, String str3) {
        r1.A9m(str, str2);
        r1.A9m("container_module", str3);
    }

    public static void A1M(1Fa r1, String str, String str2, String str3) {
        r1.A0G(str, str2);
        r1.A0G("max_id", str3);
    }

    public static void A1O(0sP r1, boolean z) {
        r1.invoke(Boolean.valueOf(z));
    }

    public static boolean A1V(C267324bN r0) {
        return r0.A06().A07();
    }

    public static boolean A1W(UserSession userSession, 1Xj r1) {
        return r1.A1e(userSession).CcK();
    }

    public static boolean A1X(UserSession userSession, 1Xj r1) {
        return 0q2.A00(userSession).A0N(r1);
    }

    public static Object[] A1Z(Object obj, int i) {
        return new Object[]{obj, Integer.valueOf(i)};
    }

    public static Object[] A1a(Object obj, boolean z) {
        return new Object[]{obj, Boolean.valueOf(z)};
    }

    public static Object[] A1b(boolean z) {
        return new Object[]{Boolean.valueOf(z)};
    }

    public static int A02(long j) {
        return (int) (j & 4294967295L);
    }
}

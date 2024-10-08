package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.user.model.User;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.G9m  reason: case insensitive filesystem */
public abstract class C51966G9m {
    public static boolean A1Z(Object obj) {
        0qQ.A0B(obj, 0);
        AnonymousClass3XV r0 = 2WX.A02;
        return false;
    }

    public static int A01(int i) {
        return C301445zH.A00(i | 1);
    }

    public static int A03(AnonymousClass2rW r0) {
        return r0.A01.size();
    }

    public static Context A0O(2Wb r0) {
        Context context = r0.A00.A0C;
        0qQ.A07(context);
        return context;
    }

    public static Context A0P(UserSession userSession) {
        return userSession.A03.A06();
    }

    public static Context A0Q(Object obj) {
        return C243803a8.A00((AnonymousClass3Y5) obj);
    }

    public static C286575Wy A0R(Object obj, Object obj2) {
        C286575Wy r0 = (C286575Wy) obj;
        ((Number) obj2).intValue();
        return r0;
    }

    public static Modifier A0S(C304676Et r1, Modifier modifier) {
        return r1.AB0(C287215Zl.A00, modifier);
    }

    public static Modifier A0T(C285245Qk r1) {
        return r1.Ezh(C287205Zk.A02);
    }

    public static Modifier A0U(C285245Qk r1) {
        return r1.Ezh(C287205Zk.A01);
    }

    public static Modifier A0V(Modifier modifier) {
        return modifier.Ezh(C287205Zk.A02);
    }

    public static Modifier A0W(Modifier modifier) {
        return AnonymousClass6FZ.A01(modifier, AnonymousClass5ZN.A00);
    }

    public static Modifier A0X(Modifier modifier, long j) {
        return C304766Fd.A01(modifier, AnonymousClass5S0.A00, j);
    }

    public static AnonymousClass2DO A0Y(C286575Wy r1, int i, int i2) {
        return C287975bA.A00(r1, i2, i & 14);
    }

    public static AnonymousClass5RD A0Z(boolean z) {
        return C287675aa.A00(C287215Zl.A09, z);
    }

    public static AnonymousClass5RD A0a(boolean z) {
        return C287675aa.A00(C287215Zl.A0E, z);
    }

    public static AnonymousClass9JR A0k(int i, long j) {
        return new AnonymousClass9JR(AnonymousClass05K.A08, i, j);
    }

    public static JSO A0l(1Xj r0) {
        return r0.A0C.CGF();
    }

    public static C67231sQ A0n(1Xj r0) {
        return r0.A0C.getClipsMetadata();
    }

    public static AnonymousClass2DN A0o(C286575Wy r1, ImageUrl imageUrl, int i) {
        return 1zC.A01(r1, imageUrl, i & 14);
    }

    public static CreativeConfigIntf A0r(1Xj r0) {
        return r0.A0C.AsO();
    }

    public static C250513lZ A0w(1Xj r0) {
        return r0.A0C.getInjected();
    }

    public static C274354oA A0x(1Xj r0) {
        return r0.A0C.C5R();
    }

    public static AnonymousClass8Z1 A0y(AnonymousClass8ZA r0) {
        return r0.A00.Bmt();
    }

    public static User A11(1Xj r0) {
        return r0.A0C.CCd();
    }

    public static Object A15(C286575Wy r1) {
        return r1.AJO(AnonymousClass5YA.A07);
    }

    public static Object A16(C286575Wy r1) {
        return r1.AJO(AndroidCompositionLocals_androidKt.A01);
    }

    public static Object A17(Object obj) {
        return ((C284945Oz) obj).getValue();
    }

    public static Object A18(Object obj) {
        return ((C270284gU) obj).getValue();
    }

    public static Object A19(Object obj, int i) {
        return ((List) obj).get(i);
    }

    public static String A1D(1Xj r0) {
        return r0.A0C.CER();
    }

    public static String A1E(Object obj) {
        return ((1Xj) obj).getId();
    }

    public static String A1F(Object obj) {
        return ((AnonymousClass0iw) obj).getModuleName();
    }

    public static Iterator A1H(Object obj) {
        return ((List) obj).iterator();
    }

    public static List A1I(1Xj r0) {
        return r0.A0C.Alu();
    }

    public static 0sL A1K(C286575Wy r1, Object obj) {
        0sL r0 = C287485aD.A04;
        C287595aO.A00(r1, obj, r0);
        return r0;
    }

    public static 1Er A1L(0sL r1, C262224Cq r2) {
        return 1Eo.A04(19B.A00, r1, r2);
    }

    public static void A1M(C262564Ez r1, int i) {
        r1.A02 = new AnonymousClass4Ex(i);
    }

    public static void A1P(Object obj, Object obj2, C66131MDj mDj, int i) {
        mDj.A01 = obj;
        mDj.A02 = obj2;
        mDj.A00 = i;
    }

    public static boolean A1Q(int i, boolean z) {
        if (i != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1R(int i, boolean z) {
        if (i != 0) {
            return true;
        }
        return z;
    }

    public static boolean A1W(UserSession userSession, Object obj) {
        return 0qQ.A0K(obj, userSession.A06);
    }

    public static boolean A1Y(Object obj) {
        return ((1Xj) obj).CcK();
    }

    public static Object[] A1b() {
        return new Object[]{C60340gF.A00};
    }

    public static float A00(C268024cd r0, float f, float f2) {
        return f2 + r0.F06(f);
    }

    public static int A02(int i, float f) {
        return i + Float.floatToIntBits(f);
    }

    public static int A04(String str, int i) {
        return str.hashCode() + i;
    }

    public static int A05(String str, int i) {
        return str.length() + i;
    }

    public static int A06(List list) {
        return list.size() - 1;
    }

    public static long A07(long j) {
        return System.currentTimeMillis() - j;
    }

    public static long A08(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0B;
    }

    public static long A09(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0E;
    }

    public static long A0A(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0k;
    }

    public static long A0B(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0S;
    }

    public static long A0C(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0q;
    }

    public static long A0D(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0Y;
    }

    public static long A0E(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0V;
    }

    public static long A0F(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0d;
    }

    public static long A0G(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0n;
    }

    public static long A0H(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0o;
    }

    public static long A0I(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A13;
    }

    public static long A0J(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A17;
    }

    public static long A0K(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0z;
    }

    public static long A0L(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0s;
    }

    public static long A0M(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0t;
    }

    public static long A0N(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0l;
    }

    public static AnonymousClass5Z4 A0b(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A02;
    }

    public static AnonymousClass5Z4 A0c(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A00;
    }

    public static AnonymousClass5Z4 A0d(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A09;
    }

    public static AnonymousClass5Z4 A0e(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A05;
    }

    public static AnonymousClass5Z4 A0f(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A03;
    }

    public static AnonymousClass5Z4 A0g(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A06;
    }

    public static AnonymousClass5Z4 A0h(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A01;
    }

    public static C285975Tl A0i(C284945Oz r0) {
        return (C285975Tl) r0.getValue();
    }

    public static C268024cd A0j(C286575Wy r0, C267304bL r1) {
        return (C268024cd) r0.AJO(r1);
    }

    public static C267324bN A0m(Iterator it) {
        return (C267324bN) it.next();
    }

    public static C53026GhH A0p(AnonymousClass0eM r0) {
        return (C53026GhH) r0.getValue();
    }

    public static DirectCollectionArguments A0q(AnonymousClass0eM r0) {
        return (DirectCollectionArguments) r0.getValue();
    }

    public static 1Xj A0s(C267324bN r0) {
        return r0.A06().A0K;
    }

    public static 1Xj A0t(Iterator it) {
        return (1Xj) it.next();
    }

    public static 1Xj A0u(List list, int i) {
        return (1Xj) 00k.A0O(list, i);
    }

    public static 1Xj A0v(AnonymousClass0eM r0) {
        return (1Xj) r0.getValue();
    }

    public static INA A0z(AnonymousClass0eM r0) {
        return (INA) r0.getValue();
    }

    public static C53270GlI A10(C284945Oz r0) {
        return (C53270GlI) r0.getValue();
    }

    public static RecipeSheetParams A12(AnonymousClass0eM r0) {
        return (RecipeSheetParams) r0.getValue();
    }

    public static Long A13(0j9 r0, 0jB r1) {
        return (Long) r1.A01(r0);
    }

    public static Number A14(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static String A1A(C284945Oz r0) {
        return (String) r0.getValue();
    }

    public static String A1B(C267324bN r0) {
        return r0.A06().A0S;
    }

    public static String A1C(0j9 r0, 0jB r1) {
        return (String) r1.A01(r0);
    }

    public static String A1G(List list, int i) {
        return (String) 00k.A0O(list, i);
    }

    public static List A1J(List list) {
        List unmodifiableList = Collections.unmodifiableList(list);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static void A1N(AnonymousClass3W8 r1, AnonymousClass3W1 r2, boolean z) {
        r1.A00(r2, Boolean.valueOf(z));
    }

    public static void A1O(C228232l0 r1, C233162v9 r2, Object obj, Object obj2) {
        r1.DUE(C301155ye.A00(), r2, obj, obj2);
    }

    public static boolean A1S(C286575Wy r0, float f, boolean z) {
        return z | r0.AGr(f);
    }

    public static boolean A1T(C286575Wy r0, long j, boolean z) {
        return z | r0.AGt(j);
    }

    public static boolean A1U(C286575Wy r0, Object obj, boolean z) {
        return z | r0.AGw(obj);
    }

    public static boolean A1V(C286575Wy r0, boolean z, boolean z2) {
        return z2 | r0.AGv(z);
    }

    public static boolean A1X(CharSequence charSequence) {
        return !00l.A0W(charSequence);
    }

    public static boolean A1a(Object obj, Object obj2) {
        return !0qQ.A0K(obj, obj2);
    }
}

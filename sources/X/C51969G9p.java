package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagElement;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.G9p  reason: case insensitive filesystem */
public abstract class C51969G9p {
    public static int A05(int i, int i2, int i3) {
        return i | i2 | (458752 & i3);
    }

    public static long A0G(int i) {
        return ((long) i) | 9221401712017801216L;
    }

    public static AnonymousClass5TX A0R(C286575Wy r2, C62320sa r3) {
        AnonymousClass5TX r0 = new AnonymousClass5TX((C284895Os) null, r3);
        r2.FLL(r0);
        return r0;
    }

    public static Modifier A0V(C286565Wx r1, Modifier modifier, Object obj) {
        C286565Wx.A0L(r1, false);
        return C287635aW.A06(modifier, (C62320sa) obj);
    }

    public static 2el A0k() {
        return C71682ef.A01((0lg) null, C71682ef.A00());
    }

    public static Object A0t(Object obj, 0Yi r2) {
        0qQ.A0B(obj, 0);
        return r2.receiver;
    }

    public static String A0u(1Xj r1) {
        if (r1 != null) {
            return r1.getId();
        }
        return null;
    }

    public static void A13(Drawable drawable, ImageView.ScaleType scaleType, 2Wb r4, 2WX r5) {
        r4.A00(new GH5(drawable, scaleType, r5, false));
    }

    public static void A14(C286575Wy r2, Modifier modifier, long j) {
        C287675aa.A02(r2, C304766Fd.A01(modifier, AnonymousClass5S0.A00, j), 0);
    }

    public static void A1I(C244103ae r2) {
        r2.A0b(false);
        r2.A0Y(false);
        r2.A0Z(true);
    }

    public static void A1J(C244103ae r2) {
        r2.A0b(true);
        r2.A0Y(false);
        r2.A0Z(true);
    }

    public static boolean A1a(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static int A03(int i) {
        return i != 0 ? Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP : Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public static int A04(int i, int i2) {
        return i2 | (i & 896) | (i & 7168);
    }

    public static int A0A(0eP r0) {
        return ((Number) r0.A01).intValue();
    }

    public static long A0B() {
        return Double.doubleToRawLongBits(6.0d);
    }

    public static long A0C() {
        return Double.doubleToRawLongBits(42.0d);
    }

    public static long A0D() {
        return Double.doubleToRawLongBits(0.0d);
    }

    public static long A0E() {
        return Double.doubleToRawLongBits(10.0d);
    }

    public static long A0F() {
        return Double.doubleToRawLongBits(16.0d);
    }

    public static Context A0L(Object obj) {
        Context context = ((AnonymousClass3Y5) obj).A05.A0C;
        0qQ.A07(context);
        return context;
    }

    public static View A0N(2WI r0, 2WU r1) {
        return r1.A00(r0.A00.A04);
    }

    public static View A0O(Object obj) {
        View view = (View) obj;
        0qQ.A0B(view, 0);
        return view;
    }

    public static View A0P(Object obj) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        return view;
    }

    public static ViewGroup A0Q(Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        0qQ.A0B(viewGroup, 1);
        return viewGroup;
    }

    public static C286705Xl A0T(C267314bM r1, long j) {
        return r1.A02(new AnonymousClass5RW(j));
    }

    public static Modifier A0U() {
        return Modifier.A00.Ezh(C287205Zk.A02);
    }

    public static Modifier A0W(C286565Wx r0, Modifier modifier, Object obj, Object obj2, boolean z) {
        C286565Wx.A0L(r0, z);
        return C304916Fs.A00(modifier, obj2, (0sL) obj);
    }

    public static Modifier A0Y(Modifier modifier, String str) {
        return modifier.Ezh(new TestTagElement(str));
    }

    public static AnonymousClass5RD A0Z(C286575Wy r2, int i) {
        return C291495hO.A02(C287275Zs.A07, r2, C287215Zl.A02, i);
    }

    public static C303876Bd A0b() {
        return new C303876Bd(16);
    }

    public static AnonymousClass07g A0c(Object obj) {
        return (AnonymousClass07g) ((AnonymousClass0eM) obj).getValue();
    }

    public static 0Aj A0d(Object obj, String str) {
        0wc r1 = (0wc) obj;
        return r1.A00(r1.A00, str);
    }

    public static 2TB A0e(2V1 r0) {
        2Vz r02 = r0.A05;
        r02.getClass();
        return r02.A02;
    }

    public static C267324bN A0g(Object obj) {
        C267324bN r1 = (C267324bN) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static C52058GDe A0h(Object obj) {
        C52058GDe gDe = (C52058GDe) obj;
        0qQ.A0B(gDe, 0);
        return gDe;
    }

    public static 0lg A0j(C286575Wy r1) {
        return (0lg) r1.AJO(C286955Yl.A00);
    }

    public static AnonymousClass3W1 A0l(Object obj) {
        AnonymousClass3W1 r1 = (AnonymousClass3W1) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass3OA A0m(Object obj) {
        AnonymousClass3OA r1 = (AnonymousClass3OA) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static C53023GhE A0o(H1I h1i) {
        return (C53023GhE) h1i.A0L.getValue();
    }

    public static C51651FyD A0y(C286575Wy r1, Object obj, int i) {
        C51651FyD fyD = new C51651FyD(obj, i);
        r1.FLL(fyD);
        return fyD;
    }

    public static MP4 A0z(C286575Wy r1, Object obj, int i) {
        MP4 mp4 = new MP4(obj, i);
        r1.FLL(mp4);
        return mp4;
    }

    public static void A10(Animator animator) {
        animator.setInterpolator(new LinearInterpolator());
    }

    public static void A11(Activity activity, C46498Dg1 dg1) {
        new C49945FFy(dg1).A03(activity);
    }

    public static void A12(PorterDuff.Mode mode, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void A15(AnonymousClass07Z r1, 2Fk r2, Object obj, int i) {
        r2.A06(r1, new C64320LZv(obj, i));
    }

    public static void A1C(0Aj r1, String str) {
        r1.AAJ("client_session_id", str);
        r1.Cgf();
    }

    public static void A1D(0Aj r1, String str) {
        r1.AAJ("ranking_info_token", str);
        r1.Cgf();
    }

    public static void A1G(1Ln r0, Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            r0.A0x(map);
        }
    }

    public static void A1K(0f9 r1, String str) {
        r1.ABQ(DialogModule.KEY_MESSAGE, str);
        r1.report();
    }

    public static void A1L(Q03 q03) {
        new Q02(q03).A02();
    }

    public static void A1M(Object obj) {
        ((View) obj).setVisibility(8);
    }

    public static boolean A1V(2Wa r0) {
        return ((Boolean) r0.A03).booleanValue();
    }

    public static float A00(AnonymousClass5Q3 r1) {
        return C288025bF.A02(r1.Bwg());
    }

    public static float A01(AnonymousClass5Q3 r1) {
        return C288025bF.A00(r1.Bwg());
    }

    public static float A02(AnonymousClass3Y5 r0, long j) {
        return (float) 2Wd.A00(r0.Bnf(), j);
    }

    public static int A06(C268794e0 r0) {
        return r0.A0I().ordinal();
    }

    public static int A07(AnonymousClass3Y5 r0, long j) {
        return 2Wd.A00(r0.Bnf(), j);
    }

    public static int A08(AnonymousClass2WJ r0, int i) {
        return r0.Bnf().A02(i);
    }

    public static int A09(AnonymousClass2WJ r0, long j) {
        return 2Wd.A00(r0.Bnf(), j);
    }

    public static long A0H(C287955b5 r1) {
        return ((C289295dM) r1.getValue()).A00;
    }

    public static long A0I(0Tu r0, 0lg r1, long j) {
        return Double.doubleToRawLongBits(182.A00(r0, r1, j));
    }

    public static Activity A0J(C70832Wc r0) {
        return C61270mF.A00(C243803a8.A00(r0));
    }

    public static Context A0K(C70832Wc r0) {
        Context context = r0.Aqq().A0C;
        0qQ.A07(context);
        return context;
    }

    public static Resources A0M(C70832Wc r0) {
        return C243803a8.A00(r0).getResources();
    }

    public static ParcelableSnapshotMutableState A0S(Object obj) {
        return new ParcelableSnapshotMutableState(C289465dd.A00(), obj);
    }

    public static Modifier A0X(Modifier modifier, float f, long j) {
        return C304766Fd.A01(modifier, AnonymousClass5ZN.A01(f), j);
    }

    public static C289145d6 A0a(C268004cb r1, 0sP r2, int i, int i2) {
        return r1.Cfi(0Yt.A0E(), r2, i, i2);
    }

    public static AnonymousClass2WG A0f(C244463bE r5, C251273mq r6, C62320sa r7, 0sP r8) {
        return new AnonymousClass2WG(r6, r7, r8, r5.A01());
    }

    public static 1Bk A0i(1Bl r1, UserSession userSession, String str) {
        return r1.A01(C229272n7.A00(userSession, str));
    }

    public static 0xa A0n(1Am r1, 1An r2, Object obj) {
        return r1.A04(r2, obj.getClass());
    }

    public static IndexOutOfBoundsException A0p(String str, String str2, int i, int i2) {
        return new IndexOutOfBoundsException(002.A02(i, i2, str, str2));
    }

    public static Integer A0q(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static Long A0r(Number number) {
        return Long.valueOf((long) number.intValue());
    }

    public static Object A0s(GZF gzf, List list) {
        return list.get(gzf.A03());
    }

    public static List A0v(List list, int i) {
        return list.subList(i, list.size());
    }

    public static 0sL A0w(C286575Wy r1, Object obj, Object obj2, 0sL r4) {
        C287595aO.A00(r1, obj, r4);
        0sL r0 = C287485aD.A05;
        C287595aO.A00(r1, obj2, r0);
        return r0;
    }

    public static 0Yh A0x(Object obj) {
        return new 0Yh(obj.getClass());
    }

    public static void A16(0Aj r2, int i) {
        r2.A8k("media_index", Integer.valueOf(i));
    }

    public static void A17(0Aj r2, int i) {
        r2.A8k("total_num_candidates", Integer.valueOf(i));
    }

    public static void A18(0Aj r2, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        r2.AAJ("multi_ads_unit_id", intentAwareAdsInfoIntf.BUa());
    }

    public static void A19(0Aj r2, AnonymousClass0iw r3) {
        r2.AAJ("module_name", r3.getModuleName());
    }

    public static void A1A(0Aj r2, AnonymousClass0iw r3) {
        r2.AAJ("container_module", r3.getModuleName());
    }

    public static void A1B(0Aj r2, C249763kK r3) {
        r2.AAJ("client_session_id", r3.getSessionId());
    }

    public static void A1E(0Aj r1, String str, String str2, Map map) {
        r1.AAJ(str, str2);
        r1.A9H("extra_data", map);
    }

    public static void A1F(0Aj r1, String str, String str2, Map map) {
        r1.AAJ(str, str2);
        r1.A9H("extra_values", map);
    }

    public static void A1H(AnonymousClass4Ew r0, AnonymousClass4Ey r1, C246053du r2, float f) {
        r1.A03(r2);
        r1.A01(f);
        r1.A02 = r0;
    }

    public static void A1N(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 10);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 13);
    }

    public static void A1P(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 14);
    }

    public static void A1Q(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 15);
    }

    public static void A1R(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 16);
    }

    public static void A1S(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 17);
    }

    public static boolean A1T(C284945Oz r0, Object obj) {
        return 0qQ.A0K(r0.getValue(), obj);
    }

    public static boolean A1U(C284945Oz r0, Object obj) {
        return 0qQ.A0K(obj, r0.getValue());
    }

    public static boolean A1X(C267324bN r0, UserSession userSession, Object obj) {
        return 0qQ.A0K(obj, r0.A08(userSession));
    }

    public static boolean A1Y(C267324bN r0, Object obj) {
        return 0qQ.A0K(obj, r0.getId());
    }

    public static boolean A1Z(1Xj r0, Object obj) {
        return 0qQ.A0K(obj, r0.getId());
    }

    public static Object[] A1b(1Xj r0) {
        return new Object[]{r0.getId()};
    }

    public static boolean A1W(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36318509747017934L);
    }
}

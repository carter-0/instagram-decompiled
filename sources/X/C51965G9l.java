package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import androidx.compose.ui.Modifier;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.G9l  reason: case insensitive filesystem */
public abstract class C51965G9l {
    public static long A06(float f) {
        return Double.doubleToRawLongBits((double) f);
    }

    public static long A07(int i) {
        return Double.doubleToRawLongBits((double) i);
    }

    public static 0sP A0z(C286565Wx r1, Object obj) {
        0sP r2 = (0sP) obj;
        C286565Wx.A0L(r1, false);
        return r2;
    }

    public static 0sL A10(C286565Wx r1, Object obj) {
        0sL r2 = (0sL) obj;
        C286565Wx.A0L(r1, false);
        return r2;
    }

    public static C59520Ya A12(C286565Wx r1, Object obj) {
        C59520Ya r2 = (C59520Ya) obj;
        C286565Wx.A0L(r1, false);
        return r2;
    }

    public static float[] A1b() {
        return new float[2];
    }

    public static int A01(int i) {
        return (i & 14) | (i & 112);
    }

    public static int A02(int i) {
        return (i & 112) | (i & 14);
    }

    public static int A03(int i) {
        return ((i >> 3) & 14) | 48;
    }

    public static int A04(long j) {
        return (int) (j >> 32);
    }

    public static int A05(boolean z) {
        int i = 1237;
        if (z) {
            i = 1231;
        }
        return i * 31;
    }

    public static long A08(long j) {
        long j2 = j << 32;
        long j3 = AnonymousClass5RW.A01;
        return j2;
    }

    public static Context A0B(2V1 r0) {
        Context context = r0.A0C;
        0qQ.A07(context);
        return context;
    }

    public static Path A0C() {
        return new Path();
    }

    public static ColorDrawable A0D(int i) {
        return new ColorDrawable(i);
    }

    public static SpannableStringBuilder A0E() {
        return new SpannableStringBuilder();
    }

    public static C287965b7 A0F(Object obj, float f, float f2) {
        return new C287965b7(obj, f, f2);
    }

    public static C286565Wx A0G(Object obj) {
        C286565Wx r0 = (C286565Wx) obj;
        C286565Wx.A0I(r0);
        return r0;
    }

    public static C286565Wx A0H(Object obj, boolean z) {
        C286565Wx r0 = (C286565Wx) obj;
        C286565Wx.A0L(r0, z);
        return r0;
    }

    public static AnonymousClass5TX A0I(C284895Os r1, C62320sa r2) {
        return new AnonymousClass5TX(r1, r2);
    }

    public static C284945Oz A0J(C286565Wx r0, Object obj, boolean z) {
        C284945Oz r1 = (C284945Oz) obj;
        C286565Wx.A0L(r0, z);
        return r1;
    }

    public static Modifier A0L(C289515dj r1, Modifier modifier) {
        return r1.AAz(C287215Zl.A09, modifier);
    }

    public static C289295dM A0M(long j) {
        return new C289295dM(j);
    }

    public static AnonymousClass5RW A0N(long j) {
        return new AnonymousClass5RW(j);
    }

    public static AnonymousClass6GK A0O(Object obj, Object obj2) {
        AnonymousClass6GK r0 = (AnonymousClass6GK) obj;
        0eS.A00(obj2);
        return r0;
    }

    public static AnonymousClass5RD A0Q(C286575Wy r1, C287245Zp r2) {
        return C287395a4.A01(C287275Zs.A01, r1, r2);
    }

    public static C287625aV A0R(int i) {
        return new C287625aV(i);
    }

    public static C289095d0 A0T(float f) {
        return new C289095d0(f);
    }

    public static 1Ln A0U(0Aj r1, int i) {
        return new 1Ln(r1, i);
    }

    public static C245943dj A0V(C62320sa r1) {
        return new C245943dj(r1);
    }

    public static C244523bK A0W(2WX r1, AnonymousClass2WK r2, AnonymousClass2WG r3) {
        return new C244523bK(r1, r2, r3);
    }

    public static 2WX A0X(2WX r1, AnonymousClass2WY r2) {
        return new 2WX(r1, r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7gD, android.graphics.drawable.ColorDrawable] */
    public static C337357gD A0Y(int i) {
        return new ColorDrawable(i);
    }

    public static AnonymousClass9JQ A0b(Integer num, float f, int i) {
        return new AnonymousClass9JQ(num, f, i);
    }

    public static AnonymousClass9JR A0c(Integer num, int i, long j) {
        return new AnonymousClass9JR(num, i, j);
    }

    public static AnonymousClass9JS A0d(Integer num, Object obj, int i) {
        return new AnonymousClass9JS(num, obj, i);
    }

    public static 2Wd A0e(long j) {
        return new 2Wd(j);
    }

    public static C246263eI A0f(C62320sa r1) {
        return new C246263eI(r1);
    }

    public static ShowreelNativeClientName A0h(String str, int i) {
        return new ShowreelNativeClientName(str, i, str);
    }

    public static C270634h3 A0i(ClipsViewerSource clipsViewerSource, UserSession userSession) {
        return new C270634h3(clipsViewerSource, userSession);
    }

    public static DUF A0j(1Xj r0) {
        return r0.A0C.Anr();
    }

    public static 0jB A0k() {
        return new 0jB();
    }

    public static 02m A0l() {
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        return r0;
    }

    public static C52399GQy A0m(C286575Wy r1) {
        return AnonymousClass6CA.A00.A02(r1);
    }

    public static C254523sc A0n(AnonymousClass4DU r1, String str) {
        return new C254523sc(r1, str);
    }

    public static 1Xj A0o(1Xg r0) {
        return 1Xi.A02(r0.A05);
    }

    public static Float A0q(float f) {
        return new Float(f);
    }

    public static Object A0r(C286575Wy r1) {
        return r1.AJO(C286955Yl.A00);
    }

    public static String A0t(1Xj r0) {
        return r0.A0C.BIl();
    }

    public static String A0u(String str) {
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        return 1Xv.A06(str);
    }

    public static WeakReference A0v(Object obj) {
        return new WeakReference(obj);
    }

    public static List A0w(1Xj r0) {
        return r0.A0C.C9Z();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MCr, java.lang.RuntimeException] */
    public static MCr A0x() {
        return new RuntimeException();
    }

    public static C62320sa A0y(C286565Wx r0, Object obj, boolean z) {
        C62320sa r1 = (C62320sa) obj;
        C286565Wx.A0L(r0, z);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0rm, java.lang.Object] */
    public static 0rm A11() {
        return new Object();
    }

    public static void A13() {
        11Z.A06("This operation must be run on UI thread.");
    }

    public static void A14() {
        0qQ.A0F("mediaView");
        throw null;
    }

    public static void A15() {
        0qQ.A0F("viewModel");
        throw null;
    }

    public static void A16() {
        0qQ.A0F("feedNetworkSource");
        throw null;
    }

    public static void A17(int i) {
        0fL.A01(i, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
    }

    public static void A18(C286575Wy r1, Object obj) {
        C287595aO.A00(r1, obj, C287485aD.A04);
    }

    public static void A19(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "action");
    }

    public static void A1A(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "surface");
    }

    public static void A1B(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "entrypoint");
    }

    public static void A1C(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "action_source");
    }

    public static void A1D(0Aj r1, Long l) {
        r1.A9F("ad_id", l);
    }

    public static void A1E(0Aj r1, Long l) {
        r1.A9F("media_id", l);
    }

    public static void A1F(0Aj r1, Long l) {
        r1.A9F("container_id", l);
    }

    public static void A1G(0Aj r1, Long l) {
        r1.A9F("carousel_index", l);
    }

    public static void A1H(0Aj r1, Long l) {
        r1.A9F("media_author_id", l);
    }

    public static void A1I(0Aj r1, String str) {
        r1.AAJ("m_pk", str);
    }

    public static void A1J(0Aj r1, String str) {
        r1.AAJ("media_id", str);
    }

    public static void A1K(0Aj r1, String str) {
        r1.AAJ("nav_chain", str);
    }

    public static void A1L(0Aj r1, String str) {
        r1.AAJ("tracking_token", str);
    }

    public static void A1M(0Aj r1, String str) {
        r1.AAJ("containermodule", str);
    }

    public static void A1N(0Aj r1, String str) {
        r1.AAJ("media_tap_token", str);
    }

    public static void A1O(0Aj r1, String str) {
        r1.AAJ("viewer_session_id", str);
    }

    public static void A1P(0Aj r1, String str) {
        r1.AAJ("media_compound_key", str);
    }

    public static void A1Q(0Aj r1, String str) {
        r1.AAJ("ranking_info_token", str);
    }

    public static void A1R(0Aj r1, String str) {
        r1.AAJ("chaining_session_id", str);
    }

    public static void A1S(1Fa r1, String str) {
        r1.A9m("container_module", str);
    }

    public static void A1U(Object obj) {
        ((Number) obj).intValue();
    }

    public static void A1V(Object obj) {
        C286565Wx.A0I((C286565Wx) obj);
    }

    public static void A1W(Object obj, Object obj2) {
        ((0sP) obj).invoke(obj2);
    }

    public static void A1X(Object obj, boolean z) {
        C286565Wx.A0L((C286565Wx) obj, z);
    }

    public static float A00(0Tu r0, 0lg r1, long j) {
        return (float) 182.A00(r0, r1, j);
    }

    public static long A09(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0m;
    }

    public static long A0A(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0w;
    }

    public static C285245Qk A0K(C286575Wy r0, int i) {
        r0.ExS(i);
        return Modifier.A00;
    }

    public static GPU A0P(List list, int i) {
        return (GPU) list.get(i);
    }

    public static AnonymousClass5Z4 A0S(C286575Wy r0) {
        return AnonymousClass5aQ.A01(r0).A07;
    }

    public static 0Tu A0Z(Object obj, int i) {
        0qQ.A0B(obj, i);
        return 0Tu.A06;
    }

    public static UserFlowLoggerImpl A0a(AnonymousClass0eM r0) {
        return (UserFlowLoggerImpl) r0.getValue();
    }

    public static C12411Sto A0g() {
        return AnonymousClass2E0.A01().A04;
    }

    public static C3728893a A0p(AnonymousClass0eM r0) {
        return (C3728893a) r0.getValue();
    }

    public static Object A0s(Object obj, 0Yi r1, int i) {
        0qQ.A0B(obj, i);
        return r1.receiver;
    }

    public static void A1T(UserSession userSession, C254523sc r1) {
        r1.A4S = C233832wY.A00(userSession);
    }

    public static boolean A1Y(C286575Wy r0, C286565Wx r1, Object obj, 0sL r3) {
        C287595aO.A00(r0, obj, r3);
        return r1.A0K;
    }

    public static boolean A1Z(C286575Wy r0, Object obj, boolean z) {
        return z | r0.AGu(obj);
    }

    public static boolean A1a(0Tu r0, 0lg r1, long j) {
        return !182.A06(r0, r1, j);
    }
}

package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;

/* renamed from: X.G9q  reason: case insensitive filesystem */
public abstract class C51970G9q {
    public static int A05(int i) {
        return i != 0 ? 4 : 2;
    }

    public static int A07(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i2;
    }

    public static int A0A(List list) {
        0qQ.A0B(list, 0);
        return list.size() - 1;
    }

    public static C286565Wx A0R(C286575Wy r1, int i) {
        r1.ExS(i);
        C286565Wx r12 = (C286565Wx) r1;
        C286565Wx.A0L(r12, false);
        return r12;
    }

    public static void A13(C286575Wy r1, C286565Wx r2) {
        C286565Wx.A0L(r2, false);
        r1.ASN();
        r1.ASN();
    }

    public static void A15(AnonymousClass5Q4 r1) {
        0qQ.A0B(r1, 0);
        r1.AQW();
    }

    public static boolean A1T(int i) {
        return i < 0;
    }

    public static boolean A1U(int i) {
        return i != 0;
    }

    public static boolean A1V(int i) {
        return i == 4;
    }

    public static boolean A1W(int i, int i2) {
        return i > i2;
    }

    public static boolean A1X(C286575Wy r1, int i, int i2, int i3) {
        r1.ExS(i);
        return i2 == i3;
    }

    public static boolean A1Y(Object obj) {
        0qQ.A0B(obj, 2);
        return false;
    }

    public static float A00(int i) {
        return i != 0 ? 1.0f : 0.5f;
    }

    public static float A01(int i) {
        return i != 0 ? 0.0f : 1.0f;
    }

    public static float A02(2V5 r0) {
        return ((Number) r0.A00).floatValue();
    }

    public static int A06(int i) {
        return i != 0 ? 32 : 16;
    }

    public static int A09(2V5 r0) {
        return ((Number) r0.A00).intValue();
    }

    public static int A0B(0eP r0) {
        return ((Number) r0.A00).intValue();
    }

    public static long A0C() {
        return Double.doubleToRawLongBits(48.0d);
    }

    public static long A0D() {
        return Double.doubleToRawLongBits(8.0d);
    }

    public static long A0E() {
        return Double.doubleToRawLongBits(14.0d);
    }

    public static long A0F() {
        return Double.doubleToRawLongBits(32.0d);
    }

    public static long A0G() {
        return Double.doubleToRawLongBits(24.0d);
    }

    public static long A0H() {
        return Double.doubleToRawLongBits(4.0d);
    }

    public static long A0I() {
        return Double.doubleToRawLongBits(12.0d);
    }

    public static long A0J() {
        return Double.doubleToRawLongBits(2.0d);
    }

    public static long A0K() {
        return Double.doubleToRawLongBits(20.0d);
    }

    public static Context A0N(C286575Wy r1) {
        return (Context) r1.AJO(AndroidCompositionLocals_androidKt.A01);
    }

    public static View A0P(AnonymousClass3JR r1, 2da r2) {
        return r2.AA3(new AnonymousClass3Jb(r1));
    }

    public static Modifier A0U(Modifier modifier, C56547I1b i1b) {
        return modifier.Ezh(new FocusRequesterElement(i1b));
    }

    public static Modifier A0V(Modifier modifier, AnonymousClass5WO r2, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.Ezh(new NestedScrollElement(r2, nestedScrollDispatcher));
    }

    public static Modifier A0W(Modifier modifier, 0sP r2) {
        return modifier.Ezh(new OnGloballyPositionedElement(r2));
    }

    public static Modifier A0X(Modifier modifier, 0sP r2) {
        return modifier.Ezh(new BlockGraphicsLayerElement(r2));
    }

    public static AnonymousClass5RD A0Y() {
        return C287675aa.A00(C287215Zl.A0E, false);
    }

    public static AnonymousClass5RD A0Z(C286575Wy r2, C287265Zr r3) {
        return C291495hO.A02(C287275Zs.A07, r2, r3, 48);
    }

    public static C268024cd A0a(C286575Wy r1) {
        return (C268024cd) r1.AJO(AnonymousClass5YA.A01);
    }

    public static 17W A0e(Writer writer) {
        17W A0A = AnonymousClass15o.A00.A0A(writer);
        A0A.A0b();
        return A0A;
    }

    public static UserSession A0f(C286575Wy r1) {
        return (UserSession) r1.AJO(C286955Yl.A00);
    }

    public static Long A0i(String str) {
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static String A0k(Collection collection) {
        return new JSONArray(collection).toString();
    }

    public static AnonymousClass0eM A0n(Object obj, int i) {
        return AnonymousClass1YB.A00(new MMH(obj, i));
    }

    public static 0t0 A0o(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20609Wvq(obj, i));
    }

    public static 0t0 A0p(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73914Plp(obj, i));
    }

    public static C58161InR A0q(C286575Wy r1, Object obj, int i) {
        C58161InR inR = new C58161InR(obj, i);
        r1.FLL(inR);
        return inR;
    }

    public static C58132Imy A0r(C286575Wy r1, Object obj, int i) {
        C58132Imy imy = new C58132Imy(obj, i);
        r1.FLL(imy);
        return imy;
    }

    public static C58142In8 A0s(C286575Wy r1, Object obj, int i) {
        C58142In8 in8 = new C58142In8(obj, i);
        r1.FLL(in8);
        return in8;
    }

    public static G4U A0t(C286575Wy r1, Object obj, int i) {
        G4U g4u = new G4U(obj, i);
        r1.FLL(g4u);
        return g4u;
    }

    public static MMX A0u(C286575Wy r1, Object obj, Object obj2, int i) {
        MMX mmx = new MMX(i, obj, obj2);
        r1.FLL(mmx);
        return mmx;
    }

    public static MJ6 A0v(C286575Wy r1, Object obj, Object obj2, int i) {
        MJ6 mj6 = new MJ6(i, obj, obj2);
        r1.FLL(mj6);
        return mj6;
    }

    public static MJ7 A0w(C286575Wy r1, Object obj, Object obj2, int i) {
        MJ7 mj7 = new MJ7(i, obj, obj2);
        r1.FLL(mj7);
        return mj7;
    }

    public static MYK A0x(C286575Wy r1, String str, int i) {
        MYK myk = new MYK(str, i);
        r1.FLL(myk);
        return myk;
    }

    public static C73669Phi A0y(C286575Wy r1, Object obj, String str, int i) {
        C73669Phi phi = new C73669Phi(str, obj, i);
        r1.FLL(phi);
        return phi;
    }

    public static C73949PmT A0z(C286575Wy r1, Object obj, Object obj2, String str, int i) {
        C73949PmT pmT = new C73949PmT(obj, obj2, str, i);
        r1.FLL(pmT);
        return pmT;
    }

    public static void A12(Activity activity) {
        2dZ.A0t.A03(activity).A0T();
    }

    public static void A1Q(Object obj, AbstractCollection abstractCollection, AbstractCollection abstractCollection2, int i) {
        if (i != 0) {
            abstractCollection.add(obj);
        } else {
            abstractCollection2.add(obj);
        }
    }

    public static void A1S(C262204Co r1) {
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
    }

    public static boolean A1Z(Object obj) {
        C286565Wx.A0I((C286565Wx) obj);
        return 0fL.A02();
    }

    public static boolean A1a(Object obj, boolean z) {
        C286565Wx.A0L((C286565Wx) obj, z);
        return 0fL.A02();
    }

    public static Object[] A1b() {
        return new Object[]{new Object()};
    }

    public static float A03(AnonymousClass4Ey r1, C246053du r2) {
        r1.A03(r2);
        r1.A01(0.0f);
        return 0.0f;
    }

    public static float A04(Object obj, String str) {
        0qQ.A0C(obj, str);
        return ((Number) obj).floatValue();
    }

    public static int A08(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 4);
        return 4;
    }

    public static long A0L(C286575Wy r0, int i) {
        r0.ExS(i);
        return AnonymousClass5aQ.A00(r0).A0o;
    }

    public static long A0M(Number number) {
        return Double.doubleToRawLongBits((double) number.intValue());
    }

    public static GradientDrawable A0O(GradientDrawable.Orientation orientation, int i, int i2) {
        return new GradientDrawable(orientation, new int[]{i, i2});
    }

    public static GZQ A0Q(C284945Oz r0) {
        return (GZQ) ((JLH) r0.getValue());
    }

    public static ParcelableSnapshotMutableState A0S(Object obj) {
        C284885Or A00 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        return new ParcelableSnapshotMutableState(A00, obj);
    }

    public static Modifier A0T(C286575Wy r0, Modifier modifier, long j) {
        AnonymousClass5aQ.A02(r0);
        return C304766Fd.A01(modifier, AnonymousClass5ZM.A01, j);
    }

    public static AnonymousClass4Ey A0b(C243533Zd r0, String str) {
        AnonymousClass4Ey A00 = 2Vi.A00(r0, str);
        A00.A03(C246033ds.A05);
        return A00;
    }

    public static AnonymousClass9JR A0c(AnonymousClass2WJ r2, Integer num, int i, int i2) {
        return new AnonymousClass9JR(num, i2, C244013aV.A0C(r2, i));
    }

    public static AnonymousClass2V4 A0d(C70832Wc r0) {
        AnonymousClass2V4 r02 = r0.Aqq().A0D;
        0qQ.A07(r02);
        return r02;
    }

    public static C324356z9 A0g(Context context, AnonymousClass07Z r3, UserSession userSession) {
        return new C324356z9(context, AnonymousClass07i.A00(r3), userSession);
    }

    public static Integer A0h(0Tu r0, 0lg r1, long j) {
        return Integer.valueOf((int) 182.A01(r0, r1, j));
    }

    public static String A0j(1Xj r0) {
        String id = r0.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    public static ArrayList A0l(Iterable iterable) {
        return new ArrayList(00k.A0X(iterable));
    }

    public static ArrayList A0m(List list) {
        return new ArrayList(list.size());
    }

    public static 02z A10(boolean z) {
        return new 02z(Boolean.valueOf(z));
    }

    public static void A11(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator valueAnimator, C243673Zt r2) {
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.start();
        r2.A00(valueAnimator);
    }

    public static void A14(C286575Wy r2, Modifier modifier, AnonymousClass2DO r4) {
        C288165bT.A03(r2, modifier, r4, AnonymousClass5aQ.A00(r2).A0s);
    }

    public static void A16(0Aj r2, double d) {
        r2.A8D("sum_duration_ms", Double.valueOf(d));
    }

    public static void A17(0Aj r2, long j) {
        r2.A9F("ad_id", Long.valueOf(j));
    }

    public static void A18(0Aj r2, long j) {
        r2.A9F("media_id", Long.valueOf(j));
    }

    public static void A19(0Aj r2, long j) {
        r2.A9F("media_index", Long.valueOf(j));
    }

    public static void A1A(0Aj r2, long j) {
        r2.A9F("container_id", Long.valueOf(j));
    }

    public static void A1B(0Aj r2, long j) {
        r2.A9F("global_position", Long.valueOf(j));
    }

    public static void A1C(0Aj r2, long j) {
        r2.A9F("media_author_id", Long.valueOf(j));
    }

    public static void A1D(0Aj r2, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        r2.AAJ("trigger_type", intentAwareAdsInfoIntf.C9y());
    }

    public static void A1E(0Aj r2, AnonymousClass93U r3) {
        r2.AAJ("viewer_session_id", r3.CFD());
    }

    public static void A1F(0Aj r2, AnonymousClass93U r3) {
        r2.AAJ("chaining_session_id", r3.AmZ());
    }

    public static void A1G(0Aj r2, AnonymousClass93T r3) {
        r2.AAJ("viewer_session_id", r3.CFD());
    }

    public static void A1H(AnonymousClass4Ey r0, C246053du r1, float f) {
        r0.A03(r1);
        r0.A01(f);
        r0.A02(f);
    }

    public static void A1I(C244103ae r0, float f, boolean z) {
        r0.A0L(f);
        r0.A0a(z);
        r0.A0N(z ? 1 : 0);
    }

    public static void A1J(C244103ae r0, Integer num) {
        r0.A0B();
        r0.A0C();
        r0.A0X(num);
    }

    public static void A1K(C244103ae r0, Integer num, Integer num2) {
        r0.A0W(num);
        r0.A0C();
        r0.A0X(num2);
    }

    public static void A1L(1Xj r0, C310336ap r1) {
        r1.A09 = r0.A1Q();
        r1.A03();
    }

    public static void A1M(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 2;
    }

    public static void A1N(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 21);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 23);
    }

    public static void A1P(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        abstractCollection.add(obj2);
        abstractCollection.add(obj3);
    }

    public static void A1R(AnonymousClass0eM r0) {
        ((Animator) r0.getValue()).cancel();
    }
}

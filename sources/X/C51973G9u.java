package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.user.model.User;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.G9u  reason: case insensitive filesystem */
public abstract class C51973G9u {
    public static int A00() {
        Object[] objArr = {null, null, null};
        0qQ.A0B(objArr, 0);
        return 03t.A0I(objArr).size();
    }

    public static int A03(int i, int i2, int i3) {
        return i | i2 | (57344 & i3) | (i3 & 458752);
    }

    public static int A04(int i, int i2, int i3) {
        return i | i2 | (3670016 & i3) | (29360128 & i3);
    }

    public static long A08(int i, long j) {
        return (((long) i) & 4294967295L) | (j << 32);
    }

    public static View A0B(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return inflate;
    }

    public static Modifier A0D(C286565Wx r1, Modifier modifier, Object obj) {
        C286565Wx.A0L(r1, false);
        return modifier.Ezh(new BlockGraphicsLayerElement((0sP) obj));
    }

    public static Modifier A0E(C286565Wx r1, Modifier modifier, Object obj) {
        C286565Wx.A0L(r1, false);
        return modifier.Ezh(new OnGloballyPositionedElement((0sP) obj));
    }

    public static 2WX A0N(C244063aa r4, 2WX r5) {
        return new 2WX(r5, new AnonymousClass9JS(AnonymousClass05K.A0E, C244083ac.A00(r4), 4));
    }

    public static 2WX A0P(2WX r5, double d) {
        return new 2WX(r5, new AnonymousClass9JR(AnonymousClass05K.A08, 0, Double.doubleToRawLongBits(d)));
    }

    public static 2WX A0U(2WX r4, AnonymousClass2WJ r5, int i) {
        return new 2WX(r4, new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r5, i), 0));
    }

    public static 2WX A0Y(2WX r3, Integer num, boolean z) {
        return new 2WX(r3, new AnonymousClass9JS(num, Boolean.valueOf(z), 4));
    }

    public static 1Fj A0d(UserSession userSession, Class cls, boolean z, boolean z2) {
        return new 1Fj(new 0bH(userSession), new 1NX((File) null), cls, z, z2);
    }

    public static ReboundViewPager A0e(Context context) {
        0qQ.A0B(context, 0);
        return new ReboundViewPager(context, (AttributeSet) null);
    }

    public static String A0h(2Wb r3, Integer num) {
        String A00 = C14066TpE.A00(r3.Aqq().A0C.getResources(), num, (Integer) null, false);
        0qQ.A07(A00);
        return A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Wub, java.lang.RuntimeException] */
    public static C20561Wub A0n(C286575Wy r1, int i) {
        r1.ExS(i);
        C286565Wx.A0L((C286565Wx) r1, false);
        return new RuntimeException();
    }

    public static void A19(2WX r2, C244103ae r3, boolean z) {
        r3.A0b(true);
        r3.A0Y(z);
        r3.A0Z(true);
        r3.A05((AnonymousClass2VW) null);
        C244123ag.A00(r3, r2);
    }

    public static void A1E(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj3, 2);
    }

    public static boolean A1M(int i, int i2) {
        if ((i & i2) == 1048576) {
            return true;
        }
        return false;
    }

    public static boolean A1N(C286575Wy r3, int i, int i2) {
        r3.ExS(i);
        if ((i2 & 14) == 4) {
            return true;
        }
        return false;
    }

    public static boolean A1R(C286575Wy r1, C286565Wx r2) {
        C286565Wx.A0L(r2, false);
        r1.ASN();
        r1.ASN();
        return 0fL.A02();
    }

    public static boolean A1T(C286575Wy r1, Object obj, Object obj2, boolean z, boolean z2) {
        return z | z2 | r1.AGw(obj) | r1.AGw(obj2);
    }

    public static boolean A1W(2Wb r2, 2WX r3, C247393gG r4) {
        r4.A0C();
        C244123ag.A00(r4, r3);
        r2.A00(r4.A0A());
        return true;
    }

    public static boolean A1Z(1Av r3, String str) {
        return !r3.A01.getBoolean(002.A0R("dismissed_find_people_card", str), false);
    }

    public static boolean A1b(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj3, 2);
        return true;
    }

    public static int A02(int i, int i2) {
        return i2 | (3670016 & i) | (i & 29360128);
    }

    public static int A06(2Wb r3) {
        return 2Wd.A00(r3.Bnf(), Double.doubleToRawLongBits(1.0d));
    }

    public static long A09(C286575Wy r1, long j) {
        return C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j & 63)], AnonymousClass5RW.A03(j), AnonymousClass5RW.A02(j), AnonymousClass5RW.A01(j), ((Number) r1.AJO(AnonymousClass6CK.A00)).floatValue());
    }

    public static C285045Pl A0C(C285045Pl r1) {
        if (r1 == null) {
            return new C285045Pl(new C267794cD[16]);
        }
        return r1;
    }

    public static AnonymousClass5ZB A0F(long j) {
        return new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j, 0, 0);
    }

    public static AnonymousClass9JO A0I(Object obj) {
        C267324bN r1 = (C267324bN) obj;
        0qQ.A0B(r1, 0);
        return C254373sN.A01(r1.A02);
    }

    public static 2Wb A0J(C251263mp r2, C251263mp r3, 2V1 r4) {
        2Wb r0 = new 2Wb(r4, new ArrayList());
        r0.A00(r2);
        r0.A00(r3);
        return r0;
    }

    public static 2WX A0Q(2WX r3, AnonymousClass2WY r4, int i, long j) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JR(AnonymousClass05K.A05, i, j));
    }

    public static 2WX A0R(2WX r3, AnonymousClass2WY r4, int i, long j) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JR(AnonymousClass05K.A09, i, j));
    }

    public static 2WX A0S(2WX r3, AnonymousClass2WY r4, Integer num, float f, int i) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JQ(num, f, i));
    }

    public static 2WX A0T(2WX r3, AnonymousClass2WY r4, Integer num, Object obj, int i) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JS(num, obj, i));
    }

    public static 2WX A0Z(2WX r3, Object obj) {
        return new 2WX(r3, new AnonymousClass9JS(AnonymousClass05K.A1F, obj, 4));
    }

    public static 0wc A0b(AnonymousClass0iw r2, 0lg r3) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(r3);
        r1.A00 = r2;
        r1.A01(0kJ.A02);
        return r1.A00();
    }

    public static C246663ey A0f(Object obj, 0Yi r2) {
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj;
        0qQ.A0B(simpleZoomableViewContainer, 0);
        return C278414wq.A04(simpleZoomableViewContainer, (C278414wq) r2.receiver);
    }

    public static String A0k(1Xj r0) {
        User CCd = r0.A0C.CCd();
        if (CCd != null) {
            return CCd.getId();
        }
        return null;
    }

    public static ArrayList A0l(1Xj r2) {
        ArrayList arrayList = new ArrayList();
        ArrayList A3E = r2.A3E();
        if (A3E != null) {
            arrayList.addAll(A3E);
        }
        return arrayList;
    }

    public static C60340gF A0p(Object obj) {
        AnonymousClass5SW r1 = (AnonymousClass5SW) obj;
        0qQ.A0B(r1, 0);
        C285645Sc.A02(r1, 0);
        return C60340gF.A00;
    }

    public static 1IW A0q(AnonymousClass4D7 r2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r0 = new 1IW(1, 1Ey.A02(r2));
        r0.A0I();
        return r0;
    }

    public static void A0w(Context context, UserSession userSession, AnonymousClass3WR r3, String str, boolean z) {
        AnonymousClass4U8 r0 = new AnonymousClass4U8(context, userSession, r3, str);
        r0.A02 = z;
        AnonymousClass4UA.A00(r0.A00());
    }

    public static void A0y(C286575Wy r2, C286565Wx r3) {
        C62320sa r1 = C287485aD.A00;
        r2.ExX();
        if (r3.A0K) {
            r2.AMT(r1);
        } else {
            r2.FMk();
        }
    }

    public static void A10(0Aj r2) {
        r2.AAJ("nav_chain", String.valueOf(AnonymousClass1QI.A00.A02.A00));
    }

    public static void A11(0Aj r2, C320506sU r3) {
        r2.A8M(r3.A02, "pivot_page_entry_point");
        r2.AAJ("pivot_page_session_id", r3.getSessionId());
    }

    public static void A12(0Aj r2, String str, long j) {
        r2.AAJ("containermodule", str);
        r2.A9F("container_id", Long.valueOf(j));
    }

    public static void A1B(1Fa r2, Integer num) {
        if (num != AnonymousClass05K.A0C) {
            r2.A9m("delivery_class", C2606846q.A00(num));
        }
    }

    public static void A1D(Object obj) {
        AnonymousClass5RU r1 = (AnonymousClass5RU) obj;
        0qQ.A0B(r1, 0);
        r1.ESY(1);
    }

    public static void A1F(String str, AbstractCollection abstractCollection) {
        Long A0n = 00y.A0n(10, str);
        if (A0n != null) {
            abstractCollection.add(A0n);
        }
    }

    public static boolean A1G(int i) {
        if ((i & 14) == 4) {
            return true;
        }
        return false;
    }

    public static boolean A1H(int i) {
        if ((i & 112) == 32) {
            return true;
        }
        return false;
    }

    public static boolean A1I(int i) {
        if ((i & 896) == 256) {
            return true;
        }
        return false;
    }

    public static boolean A1J(int i) {
        if ((i & 7168) == 2048) {
            return true;
        }
        return false;
    }

    public static boolean A1K(int i) {
        if ((3670016 & i) == 1048576) {
            return true;
        }
        return false;
    }

    public static boolean A1L(int i) {
        if ((234881024 & i) == 67108864) {
            return true;
        }
        return false;
    }

    public static boolean A1O(C286575Wy r3, int i, int i2) {
        r3.ExS(i);
        if ((i2 & 112) == 32) {
            return true;
        }
        return false;
    }

    public static boolean A1P(C286575Wy r3, int i, int i2) {
        r3.ExS(i);
        if ((i2 & 896) == 256) {
            return true;
        }
        return false;
    }

    public static boolean A1Q(C286575Wy r3, int i, int i2) {
        r3.ExS(i);
        if ((i2 & 7168) == 2048) {
            return true;
        }
        return false;
    }

    public static boolean A1V(C7215Pzj pzj) {
        return 0qQ.A0K(pzj.A00, AnonymousClass1Q2.A02().getLanguage());
    }

    public static boolean A1X(C324356z9 r2) {
        if (r2.A03.A03 == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public static boolean A1Y(C324356z9 r2) {
        if (r2.A03.A03 == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public static int A01(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int A05(C284945Oz r0) {
        return ((C285975Tl) r0.getValue()).A01.A00.length();
    }

    public static int A07(Object obj, Map map) {
        Number number = (Number) map.get(obj);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static Bundle A0A(UserSession userSession, C46474Dfc dfc) {
        return C46447Df9.A03().A01.A01(userSession, dfc.A04());
    }

    public static C303986Bo A0G(0qm r0, AnonymousClass0qq r1) {
        Typeface A02 = r1.A02(r0);
        if (A02 != null) {
            return C303946Bk.A00(A02);
        }
        return null;
    }

    public static C285975Tl A0H(C284945Oz r4, String str) {
        C285975Tl r0 = (C285975Tl) r4.getValue();
        long j = r0.A00;
        C285965Tk r42 = r0.A02;
        0sn r02 = 0sn.A00;
        return new C285975Tl(new C286025Tq(r02, r02, str), r42, j);
    }

    public static 2Wb A0K(AnonymousClass3Y5 r2) {
        return new 2Wb(r2.Aqq(), new ArrayList());
    }

    public static 2Wb A0L(2Wb r2) {
        return new 2Wb(r2.Aqq(), new ArrayList());
    }

    public static 2Wb A0M(C70832Wc r2) {
        return new 2Wb(r2.Aqq(), new ArrayList());
    }

    public static 2WX A0O(C70832Wc r2, 2WX r3, UserSession userSession, JP2 jp2, GGH ggh) {
        return ggh.A02(C243803a8.A00(r2), ggh.A01(C243803a8.A00(r2), r3, userSession, jp2), userSession, jp2);
    }

    public static 2WX A0V(2WX r4, AnonymousClass2WJ r5, Integer num, int i) {
        return new 2WX(r4, new AnonymousClass9JR(num, i, C244013aV.A06(r5)));
    }

    public static 2WX A0W(2WX r4, AnonymousClass2WJ r5, Integer num, int i, int i2) {
        return new 2WX(r4, new AnonymousClass9JR(num, i2, C244013aV.A0C(r5, i)));
    }

    public static 2WX A0X(2WX r4, Integer num, double d, int i) {
        return new 2WX(r4, new AnonymousClass9JR(num, i, Double.doubleToRawLongBits(d)));
    }

    public static AnonymousClass4Ey A0a(C243533Zd r0, String str) {
        AnonymousClass4Ey A00 = 2Vi.A00(r0, str);
        A00.A03(C246033ds.A00);
        A00.A01(0.0f);
        return A00;
    }

    public static 1OC A0c(1NY r2, String str, String str2) {
        r2.A0G(str, str2);
        r2.A0Q(C298815u5.class, AnonymousClass93W.class);
        return r2.A0M();
    }

    public static IllegalArgumentException A0g(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static String A0i(C267324bN r0, UserSession userSession) {
        User A08 = r0.A08(userSession);
        if (A08 != null) {
            return A08.getId();
        }
        return "n/a";
    }

    public static String A0j(UserSession userSession, 1Xj r1) {
        User A2A = r1.A2A(userSession);
        if (A2A != null) {
            return A2A.getId();
        }
        return null;
    }

    public static List A0m(C298835u7 r2) {
        List Ao1 = r2.Ao1();
        if (Ao1.isEmpty()) {
            return r2.Ao4();
        }
        return Ao1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Wub, java.lang.RuntimeException] */
    public static C20561Wub A0o(C286575Wy r0, int i) {
        r0.ExS(i);
        C286565Wx.A0I((C286565Wx) r0);
        return new RuntimeException();
    }

    public static void A0r(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 4);
        0qQ.A0B(obj3, 5);
    }

    public static void A0s(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 7);
        0qQ.A0B(obj3, 8);
    }

    public static void A0t(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 8);
        0qQ.A0B(obj3, 9);
    }

    public static void A0u(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 9);
        0qQ.A0B(obj3, 10);
    }

    public static void A0v(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 15);
        0qQ.A0B(obj3, 16);
    }

    public static void A0x(Drawable drawable, AnonymousClass2WJ r2, int i) {
        drawable.setColorFilter(AnonymousClass37O.A00(r2.Bnf().A02(i)));
    }

    public static void A0z(C286575Wy r1, C286565Wx r2, C62320sa r3) {
        r1.ExX();
        if (r2.A0K) {
            r1.AMT(r3);
        } else {
            r1.FMk();
        }
    }

    public static void A13(0Aj r2, String str, long j) {
        r2.A9F("target_id", Long.valueOf(j));
        r2.AAJ("media_tap_token", str);
    }

    public static void A14(0Aj r2, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
    }

    public static void A15(0Ak r4) {
        r4.A0P("timestamp_in_ms", Double.valueOf((double) System.currentTimeMillis()));
    }

    public static void A16(AnonymousClass3Y5 r0, C244103ae r1, int i, long j) {
        r1.A0P(i);
        r1.A0Q(2Wd.A00(r0.Bnf(), j));
    }

    public static void A17(2Wb r0, C244103ae r1, int i, long j) {
        r1.A0P(i);
        r1.A0Q(2Wd.A00(r0.Bnf(), j));
    }

    public static void A18(C243673Zt r0) {
        AnonymousClass2VL.A00();
        Animator animator = (Animator) r0.A00;
        if (animator != null) {
            animator.cancel();
        }
    }

    public static void A1A(C244103ae r0, Integer num, float f, boolean z) {
        r0.A0C();
        r0.A0X(num);
        r0.A0L(f);
        r0.A0a(z);
        r0.A0N(z ? 1 : 0);
    }

    public static void A1C(UserSession userSession, C254523sc r1, AnonymousClass3OA r2, C251373n0 r3) {
        r1.A0K(userSession, r2);
        r1.A7K = "ad";
        r1.A07(r3.BnH());
    }

    public static boolean A1S(C286575Wy r0, Object obj, Object obj2, int i) {
        r0.ExS(i);
        return r0.AGw(obj) | r0.AGw(obj2);
    }

    public static boolean A1U(C286575Wy r2, Object obj, C286705Xl[] r4, int i) {
        C286715Xm.A01(r2, AnonymousClass5PI.A01(r2, obj, i), r4, 56);
        return 0fL.A02();
    }

    public static boolean A1a(C62037KWw kWw, String str, boolean z) {
        return ((Boolean) kWw.A03(str, z).getValue()).booleanValue();
    }
}

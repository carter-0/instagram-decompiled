package X;

import android.graphics.Typeface;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebookpay.logging.LoggingContext;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class G9t {
    public static 2WX A0x(2WX r2, Integer num, float f) {
        return new 2WX(r2, new AnonymousClass9JQ(num, f, 1));
    }

    public static 2WX A0z(2WX r2, Integer num, Object obj) {
        return new 2WX(r2, new AnonymousClass9JS(num, obj, 3));
    }

    public static 2WX A10(2WX r2, Integer num, Object obj) {
        return new 2WX(r2, new AnonymousClass9JS(num, obj, 4));
    }

    public static C244103ae A13(2V1 r2, CharSequence charSequence, int i) {
        C244103ae A00 = 2WW.A00(r2, 0);
        A00.A0V(charSequence);
        A00.A0U((2V5) null);
        A00.A0P(i);
        return A00;
    }

    public static 2WU A16(AnonymousClass2WT r4) {
        return new 2WU(C243983aS.A00, r4, 3, true);
    }

    public static 2WU A17(AnonymousClass2WT r4) {
        return new 2WU(C243983aS.A00, r4, 3, false);
    }

    public static void A1M(2Wb r1, 2WX r2, C244103ae r3) {
        r3.A05((AnonymousClass2VW) null);
        C244123ag.A00(r3, r2);
        r1.A00(r3.A0A());
    }

    public static void A1N(C244103ae r2, boolean z) {
        r2.A0Y(z);
        r2.A0Z(true);
        r2.A0D();
        r2.A05((AnonymousClass2VW) null);
    }

    public static void A1O(AnonymousClass0iw r1, C254523sc r2, AnonymousClass3VK r3) {
        r2.A81 = r3.A04(r1, (List) null);
        r2.A0V(r3.A03(r1));
    }

    public static boolean A1V(C286575Wy r0, Object obj, int i, int i2) {
        if ((i & i2) == 0) {
            return r0.AGu(obj);
        }
        return r0.AGw(obj);
    }

    public static int A0j(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        0qQ.A0B(obj2, 0);
        return intValue;
    }

    public static long A0k(int i) {
        if (i != 0) {
            return 1;
        }
        return 0;
    }

    public static long A0l(int i, long j) {
        return j - AnonymousClass30M.A03(AnonymousClass30K.A03(AnonymousClass30J.DAYS, i));
    }

    public static C304836Fk A0n(C304836Fk r1, int i) {
        if (i != 0) {
            return new C304826Fj(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return r1;
    }

    public static AnonymousClass5RD A0s(C287295Zu r2, C286575Wy r3, C287245Zp r4, int i) {
        int i2 = i >> 3;
        return C287395a4.A02(r2, r3, r4, (i2 & 112) | (i2 & 14));
    }

    public static 2Wb A0v(C251263mp r2, 2V1 r3) {
        2Wb r0 = new 2Wb(r3, new ArrayList());
        r0.A00(r2);
        return r0;
    }

    public static 2Wb A0w(2Wb r2) {
        return new 2Wb(r2.A00, new ArrayList());
    }

    public static 2WX A0y(2WX r2, Integer num, int i) {
        return new 2WX(r2, new AnonymousClass9JQ(num, 100.0f, i));
    }

    public static 2WX A11(Integer num, float f, int i) {
        return new 2WX((2WX) null, new AnonymousClass9JQ(num, f, i));
    }

    public static 2WX A12(Integer num, Object obj, int i) {
        return new 2WX((2WX) null, new AnonymousClass9JS(num, obj, i));
    }

    public static AnonymousClass9JQ A14() {
        return new AnonymousClass9JQ(AnonymousClass05K.A0C, 0.0f, 1);
    }

    public static String A19() {
        return Dbn.A00(52, 8, 17);
    }

    public static String A1A(C267324bN r0) {
        1Xj r02 = r0.A02;
        if (r02 != null) {
            return r02.getId();
        }
        return null;
    }

    public static String A1B(1Xj r0) {
        if (r0 != null) {
            return r0.A0C.BIl();
        }
        return null;
    }

    public static List A1D(AnonymousClass5RW r1, long j) {
        return 0sr.A1P(new AnonymousClass5RW[]{r1, new AnonymousClass5RW(j)});
    }

    public static C60340gF A1F(Object obj) {
        AnonymousClass5SW r1 = (AnonymousClass5SW) obj;
        0qQ.A0B(r1, 0);
        C285645Sc.A01(r1);
        return C60340gF.A00;
    }

    public static boolean A1T(C286575Wy r1, Object obj, int i) {
        if ((i & 8) == 0) {
            return r1.AGu(obj);
        }
        return r1.AGw(obj);
    }

    public static boolean A1U(C286575Wy r1, Object obj, int i) {
        if ((i & 64) == 0) {
            return r1.AGu(obj);
        }
        return r1.AGw(obj);
    }

    public static int A00(C286575Wy r0, float f) {
        if (r0.AGr(f)) {
            return 32;
        }
        return 16;
    }

    public static int A01(C286575Wy r0, float f) {
        if (r0.AGr(f)) {
            return 256;
        }
        return 128;
    }

    public static int A02(C286575Wy r0, float f) {
        if (r0.AGr(f)) {
            return C249703kE.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A03(C286575Wy r0, float f) {
        if (r0.AGr(f)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A04(C286575Wy r0, float f) {
        if (r0.AGr(f)) {
            return Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        }
        return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
    }

    public static int A05(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return 4;
        }
        return 2;
    }

    public static int A06(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return 32;
        }
        return 16;
    }

    public static int A07(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return 256;
        }
        return 128;
    }

    public static int A08(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return C249703kE.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A09(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A0A(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public static int A0B(C286575Wy r0, int i) {
        if (r0.AGs(i)) {
            return Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        }
        return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
    }

    public static int A0C(C286575Wy r0, long j) {
        if (r0.AGt(j)) {
            return 32;
        }
        return 16;
    }

    public static int A0D(C286575Wy r0, long j) {
        if (r0.AGt(j)) {
            return 256;
        }
        return 128;
    }

    public static int A0E(C286575Wy r0, long j) {
        if (r0.AGt(j)) {
            return C249703kE.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A0F(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return 32;
        }
        return 16;
    }

    public static int A0G(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return 256;
        }
        return 128;
    }

    public static int A0H(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return C249703kE.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A0I(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A0J(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public static int A0K(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        }
        return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
    }

    public static int A0L(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return 4194304;
    }

    public static int A0M(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return 67108864;
        }
        return 33554432;
    }

    public static int A0N(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return 536870912;
        }
        return 268435456;
    }

    public static int A0O(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return 4;
        }
        return 2;
    }

    public static int A0P(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return 32;
        }
        return 16;
    }

    public static int A0Q(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return 256;
        }
        return 128;
    }

    public static int A0R(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return C249703kE.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A0S(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A0T(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public static int A0U(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        }
        return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
    }

    public static int A0V(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return 4194304;
    }

    public static int A0W(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return 67108864;
        }
        return 33554432;
    }

    public static int A0X(C286575Wy r0, Object obj) {
        if (r0.AGu(obj)) {
            return 536870912;
        }
        return 268435456;
    }

    public static int A0Y(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return 4;
        }
        return 2;
    }

    public static int A0Z(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return 32;
        }
        return 16;
    }

    public static int A0a(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return 256;
        }
        return 128;
    }

    public static int A0b(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return C249703kE.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A0c(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A0d(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public static int A0e(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        }
        return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
    }

    public static int A0f(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return 4194304;
    }

    public static int A0g(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return 67108864;
        }
        return 33554432;
    }

    public static int A0h(C286575Wy r0, boolean z) {
        if (r0.AGv(z)) {
            return 536870912;
        }
        return 268435456;
    }

    public static int A0i(C70832Wc r0, long j) {
        AnonymousClass2V4 r02 = r0.Aqq().A0D;
        0qQ.A07(r02);
        return 2Wd.A00(r02, j);
    }

    public static long A0m(C289145d6 r2) {
        return C289155d7.A00(r2.getWidth(), r2.getHeight());
    }

    public static ParcelableSnapshotMutableState A0o(C286575Wy r2, Object obj) {
        C284885Or A00 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A00, obj);
        r2.FLL(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static Modifier A0p(C286575Wy r2, Modifier modifier) {
        return C304766Fd.A01(modifier, AnonymousClass5S0.A00, AnonymousClass5aQ.A00(r2).A0k);
    }

    public static Modifier A0q(C286575Wy r2, Modifier modifier, float f, float f2) {
        return C287195Zj.A0B(modifier, C287645aX.A00(r2), f, C287645aX.A00(r2), f2);
    }

    public static AnonymousClass5QA A0r(AnonymousClass5Q3 r0) {
        return ((AnonymousClass5QC) r0.Ayw()).A02.A02.A01;
    }

    public static AnonymousClass0xx A0t(Fragment fragment) {
        return C71772f0.A00(fragment.getViewLifecycleOwner().getLifecycle());
    }

    public static 0Aj A0u(AnonymousClass0iw r1, 0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(r1, r2);
        return A01.A00(A01.A00, "instagram_clips_viewer_link_impression");
    }

    public static AnonymousClass2V4 A15(Typeface typeface, 2Wb r1, C244103ae r2, int i, int i2) {
        r2.A0R(i);
        r2.A0S(typeface);
        r2.A0O(i2);
        return r1.Bnf();
    }

    public static AnonymousClass3W1 A18(1Xj r3) {
        return new AnonymousClass3W1(r3.A0o(), r3.A4o());
    }

    public static String A1C(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }

    public static 0eP A1E(float f, float f2) {
        return new 0eP(Float.valueOf(f), Float.valueOf(f2));
    }

    public static void A1G(0Aj r2) {
        r2.AAJ("media_tap_token", UUID.randomUUID().toString());
    }

    public static void A1H(0Aj r2, 1Xj r3) {
        r2.A8M(r3.BR7().A00(), "media_type");
    }

    public static void A1I(0Aj r2, 1Xj r3, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("m_pk", r3.getId());
    }

    public static void A1J(0Aj r2, String str) {
        r2.A9F("media_id", Long.valueOf(Long.parseLong(str)));
    }

    public static void A1K(0Aj r2, String str) {
        r2.A9F("media_author_id", Long.valueOf(Long.parseLong(str)));
    }

    public static void A1L(0bb r2, LoggingContext loggingContext, String str, List list) {
        r2.A07(str, list);
        r2.A02(SQ1.A00(loggingContext), "logging_policy");
    }

    public static void A1P(String str, Map map, AnonymousClass0eM r3) {
        map.putAll(((C59656JRy) r3.getValue()).AUR(str));
    }

    public static void A1Q(String str, Map map, AnonymousClass0eM r3) {
        map.putAll(((C228232l0) r3.getValue()).AUH(str));
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C275544qW) it.next()).F0H());
    }

    public static boolean A1S(C286575Wy r0, float f) {
        if (!r0.AGr(f)) {
            return false;
        }
        return true;
    }

    public static boolean A1W(C286575Wy r2, Object obj, int i, boolean z) {
        r2.ExS(i);
        return r2.AGv(z) | r2.AGu(obj);
    }

    public static boolean A1X(C286575Wy r0, Object obj, Object obj2, int i) {
        r0.ExS(i);
        return r0.AGw(obj) | r0.AGu(obj2);
    }

    public static boolean A1Y(C286575Wy r0, Object obj, Object obj2, int i) {
        r0.ExS(i);
        return r0.AGu(obj) | r0.AGw(obj2);
    }

    public static boolean A1Z(C286575Wy r0, Object obj, Object obj2, int i) {
        r0.ExS(i);
        return r0.AGu(obj) | r0.AGu(obj2);
    }

    public static boolean A1a(C286575Wy r1, Object obj, Object obj2, boolean z) {
        return z | r1.AGw(obj) | r1.AGw(obj2);
    }

    public static boolean A1b(AnonymousClass0eM r0) {
        Object value = r0.getValue();
        0qQ.A07(value);
        return ((Boolean) value).booleanValue();
    }
}

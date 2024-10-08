package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.G9x  reason: case insensitive filesystem */
public abstract class C51975G9x {
    public static C286565Wx A0E(C286575Wy r2, Object obj, Object obj2) {
        C286565Wx r0 = (C286565Wx) r2;
        C286565Wx.A0L(r0, false);
        C286645Xf.A04(r2, obj2, (0sL) obj);
        return r0;
    }

    public static Modifier A0G(C286565Wx r1, Modifier modifier, Object obj) {
        C286565Wx.A0L(r1, false);
        return modifier.Ezh(new ClearAndSetSemanticsElement((0sP) obj));
    }

    public static Modifier A0H(C286565Wx r1, Modifier modifier, Object obj) {
        C286565Wx.A0L(r1, false);
        return modifier.Ezh(new DrawWithCacheElement((0sP) obj));
    }

    public static 2YL A0O(2YL r1, Object obj) {
        C286565Wx r2 = (C286565Wx) obj;
        C286565Wx.A0L(r2, false);
        C286565Wx.A0L(r2, false);
        return r1;
    }

    public static C318136oS A0R(2YL r1, Object obj) {
        0qQ.A0B(obj, 0);
        return C318116oQ.A00(r1);
    }

    public static StringBuilder A0l(Object obj) {
        0qQ.A0B(obj, 0);
        return new StringBuilder();
    }

    public static ReentrantReadWriteLock.ReadLock A0q(Object obj) {
        0qQ.A0B(obj, 0);
        ReentrantReadWriteLock.ReadLock readLock = C56488HzK.A02.readLock();
        0qQ.A07(readLock);
        readLock.lock();
        return readLock;
    }

    public static AnonymousClass4D7 A0t(C262204Co r1) {
        if (r1 == null) {
            return null;
        }
        r1.AG7((CancellationException) null);
        return null;
    }

    public static void A12(C286575Wy r2, Modifier modifier, int i) {
        AnonymousClass6G3.A05(r2, C287205Zk.A0C(modifier, 120.0f), C287975bA.A00(r2, i, 0));
    }

    public static void A13(C286575Wy r6, Modifier modifier, String str) {
        AnonymousClass5ZZ.A0W(r6, modifier, AnonymousClass5aQ.A01(r6).A02, str, AnonymousClass5aQ.A00(r6).A0t);
    }

    public static void A1E(Object obj, Object obj2, C262224Cq r4, int i) {
        1Eo.A05(19B.A00, new MGC(obj, obj2, (AnonymousClass4D7) null, i), r4);
    }

    public static void A1L(float[] fArr, float f) {
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
    }

    public static boolean A1M(float f) {
        if (Float.compare(f, 0.0f) > 0) {
            return true;
        }
        return false;
    }

    public static boolean A1N(int i) {
        return (i & 14) == 4;
    }

    public static boolean A1P(int i) {
        return (i & 7168) == 2048;
    }

    public static boolean A1Q(int i, int i2) {
        return i == i2;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return C245173cR.A03(obj2, obj);
    }

    public static boolean A1a(Object obj, 05G r3, int i, boolean z) {
        return r3.AIY(obj, new C66920MfE(i, z, 7));
    }

    public static float A00(AnonymousClass5b4 r0) {
        return ((Number) r0.A04.getValue()).floatValue();
    }

    public static float A02(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        return floatValue;
    }

    public static int A03(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static long A07(int i, long j) {
        if (i != 0) {
            return j & 4294967295L;
        }
        return j >> 32;
    }

    public static Context A0A(C286575Wy r1) {
        Context applicationContext = ((Context) r1.AJO(AndroidCompositionLocals_androidKt.A01)).getApplicationContext();
        0qQ.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return applicationContext;
    }

    public static Resources A0B(C286575Wy r1) {
        return ((Context) r1.AJO(AndroidCompositionLocals_androidKt.A01)).getResources();
    }

    public static IGW A0C(LazyGridState lazyGridState) {
        return (IGW) ((JL7) lazyGridState.A0H.getValue());
    }

    public static Modifier A0I(C286565Wx r0, Modifier modifier, Object obj, boolean z) {
        C286565Wx.A0L(r0, z);
        return C289575dp.A01(modifier, (0sP) obj);
    }

    public static C52924Gey A0K(List list) {
        return C304796Fg.A00(list, 0, 9187343241974906880L);
    }

    public static AnonymousClass5RD A0L(C286575Wy r3) {
        return C287395a4.A02(C287275Zs.A01, r3, C287215Zl.A04, 48);
    }

    public static AnonymousClass5RD A0M(C286575Wy r3, C287265Zr r4, int i) {
        int i2 = ((i & 14) | 384) >> 3;
        return C291495hO.A02(C287275Zs.A07, r3, r4, (i2 & 112) | (i2 & 14));
    }

    public static AnonymousClass2YQ A0Q(Object obj) {
        if (obj instanceof AnonymousClass07P) {
            return ((AnonymousClass07P) obj).getDefaultViewModelCreationExtras();
        }
        return AnonymousClass2YP.A00;
    }

    public static C270634h3 A0V(ClipsViewerSource clipsViewerSource, UserSession userSession, 1Xj r4) {
        C270634h3 r1 = new C270634h3(clipsViewerSource, userSession);
        r1.A1C = r4.getId();
        return r1;
    }

    public static AnonymousClass2DN A0W(C286575Wy r1, String str) {
        return 1zC.A00(r1, new SimpleImageUrl(str));
    }

    public static 1Xj A0X(Object obj) {
        C376509Ig r1 = (C376509Ig) obj;
        0qQ.A0B(r1, 0);
        return ((C295745oq) r1.A02).A00();
    }

    public static C310336ap A0Z() {
        C310336ap r1 = new C310336ap();
        r1.A01 = 5000;
        return r1;
    }

    public static AnonymousClass6W8 A0a(Bundle bundle, Fragment fragment, 0lg r8) {
        return new AnonymousClass6W8(fragment.requireActivity(), bundle, r8, ModalActivity.class, "saved_feed");
    }

    public static Integer A0c(DirectThreadKey directThreadKey) {
        List list = directThreadKey.A02;
        if (list != null) {
            return Integer.valueOf(list.size());
        }
        return null;
    }

    public static Object A0e(C286575Wy r1, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        AnonymousClass5b4 A00 = C287705ad.A00(0.0f);
        r1.FLL(A00);
        return A00;
    }

    public static Object A0f(Object obj) {
        return ((AnonymousClass3JD) ((C239793Ih) obj).A00).Bny();
    }

    public static String A0h(1Xj r0) {
        User CCd = r0.A0C.CCd();
        if (CCd != null) {
            return CCd.getUsername();
        }
        return "";
    }

    public static HashMap A0n(Object obj, Object obj2, 0eP r3, 0eP r4) {
        return 0Yt.A02(new 0eP[]{r3, r4, new 0eP(obj, obj2)});
    }

    public static Map A0p(Object obj, Object obj2, Map map) {
        return 0Yt.A0C(map, new 0eP(obj, obj2));
    }

    public static AnonymousClass0eM A0r(Object obj, String str, 0eO r3, int i) {
        return AnonymousClass0eN.A00(r3, new C51803G2m(obj, str, str, i));
    }

    public static C58133Imz A0u(C286575Wy r1, Object obj, int i) {
        C58133Imz imz = new C58133Imz(obj, i);
        r1.FLL(imz);
        return imz;
    }

    public static C66196MId A0v(C286575Wy r1, Object obj, int i) {
        C66196MId mId = new C66196MId(obj, i);
        r1.FLL(mId);
        return mId;
    }

    public static MP6 A0w(C286575Wy r1, Object obj, int i) {
        MP6 mp6 = new MP6(obj, i);
        r1.FLL(mp6);
        return mp6;
    }

    public static C66218MIz A0x(C286575Wy r1, Object obj, int i) {
        C66218MIz mIz = new C66218MIz(obj, i);
        r1.FLL(mIz);
        return mIz;
    }

    public static void A18(0Aj r2, String str) {
        r2.AAJ("action", str);
        r2.AAJ("nudge_name", "multi_hide_explore_controls");
        r2.Cgf();
    }

    public static void A19(0bb r2, Object obj) {
        r2.A01(SUU.A01((C21267XRm) obj), "credential_type");
    }

    public static void A1A(1Ln r1, 1Xj r2, String str, List list) {
        r1.A0R("legacy_event_name", str);
        r1.A0m(r2.getId());
        r1.A0S("product_ids", list);
    }

    public static void A1B(LimitedInteractionsVersions limitedInteractionsVersions, AbstractMap abstractMap) {
        Integer num;
        String str;
        if (limitedInteractionsVersions == LimitedInteractionsVersions.V1) {
            num = AnonymousClass05K.A00;
        } else if (limitedInteractionsVersions == LimitedInteractionsVersions.V2_NOT_CUSTOMIZABLE) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        switch (num.intValue()) {
            case 0:
                str = "v1";
                break;
            case 1:
                str = "v2_not_customizable";
                break;
            default:
                str = "v2_customizable";
                break;
        }
        abstractMap.put("version", str);
    }

    public static void A1D(Object obj, Object obj2) {
        C249523jv r1 = (C249523jv) obj;
        if (!r1.CQG()) {
            r1.FIG(obj2);
        }
    }

    public static void A1K(AbstractMap abstractMap) {
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str != null) {
            abstractMap.put("nav_chain", str);
        }
    }

    public static boolean A1O(int i) {
        if ((i & 458752) == 131072) {
            return true;
        }
        return false;
    }

    public static boolean A1S(C286575Wy r3, int i, int i2) {
        r3.ExS(i);
        if ((i2 & 112) != 32) {
            return false;
        }
        return true;
    }

    public static boolean A1W(N49 n49, AnonymousClass7PF r4, AnonymousClass7PG r5, Object obj, 05G r7) {
        return r7.AIY(obj, AnonymousClass7PG.A00(n49, r4, r5.A02, r5.A03, r5.A04));
    }

    public static boolean A1X(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        0qQ.A0B(obj2, 0);
        return booleanValue;
    }

    public static boolean A1b(Object obj, 05G r3, boolean z, boolean z2, boolean z3) {
        return r3.AIY(obj, new C59732JVq(z, z2, z3, 9));
    }

    public static float A01(C287955b5 r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A04(C70832Wc r2) {
        return C243803a8.A00(r2).getColor(2Yu.A0E(C243803a8.A00(r2)));
    }

    public static int A05(Object obj, int i) {
        return ((i + obj.hashCode()) * 31) + C54732HQn.A00();
    }

    public static int A06(Object obj, Object obj2, 0sK r3, int i) {
        return ((Number) r3.invoke(obj, obj2, Integer.valueOf(i))).intValue();
    }

    public static long A08(Bitmap bitmap) {
        return C289155d7.A00(bitmap.getWidth(), bitmap.getHeight());
    }

    public static long A09(C284945Oz r1) {
        C289295dM r0 = (C289295dM) r1.getValue();
        0qQ.A0A(r0);
        return r0.A00;
    }

    public static IGX A0D(C284945Oz r0) {
        return (IGX) ((JLE) r0.getValue());
    }

    public static Modifier A0F(C286575Wy r3, Modifier modifier) {
        long j = AnonymousClass5aQ.A00(r3).A11;
        AnonymousClass5aQ.A02(r3);
        return C304766Fd.A01(modifier, AnonymousClass5ZM.A02, j);
    }

    public static C289295dM A0J(float f, float f2) {
        return new C289295dM(C289325dP.A00(f, f2));
    }

    public static C3022062b A0N(C286025Tq r0, String str, int i) {
        return (C3022062b) 00k.A0J(r0.A06(str, i, i));
    }

    public static AnonymousClass07g A0P(C286575Wy r1) {
        r1.ExT(1729797275);
        return C56390Hxj.A00(r1);
    }

    public static 0Aj A0S(AnonymousClass0iw r1, 0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(r1, r2);
        return A01.A00(A01.A00, "instagram_open_carousel_tap");
    }

    public static 1Ln A0T(1Ln r0, 29O r1, String str, String str2) {
        1Ln A00 = 29O.A00(r0, r1, str);
        A00.A0T();
        A00.A0R("composition_str_id", str2);
        return A00;
    }

    public static C309516Yo A0U(C54153H0x h0x) {
        return new C309516Yo(h0x.requireActivity(), h0x.A03());
    }

    public static C331157Pu A0Y(Resources resources, C331127Pr r2) {
        r2.A0d = resources.getText(2131972615);
        return r2.A00();
    }

    public static C53393GnQ A0b(C270284gU r0) {
        return (C53393GnQ) ((C61083JwL) r0.getValue()).A00;
    }

    public static Integer A0d(Integer num, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.compareTo(num) > 0) {
            return valueOf;
        }
        return num;
    }

    public static String A0g(0Aj r2, SavedCollection savedCollection, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("collection_id", savedCollection.A0F);
        return savedCollection.A02();
    }

    public static String A0i(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public static String A0j(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static String A0k(Iterator it) {
        return ((1Xj) it.next()).A2n();
    }

    public static AbstractMap A0m(C61770pa r0) {
        return (AbstractMap) 00k.A0I(r0.Bm6());
    }

    public static LinkedHashMap A0o(Map map) {
        return new LinkedHashMap(0se.A0L(map.size()));
    }

    public static 0eP A0s(float f, long j) {
        return new 0eP(Float.valueOf(f), new AnonymousClass5RW(j));
    }

    public static void A0y(Context context, Drawable drawable, C310336ap r3) {
        r3.A08(drawable, context.getColor(2Yu.A05(context)));
    }

    public static void A0z(Context context, C331127Pr r2) {
        r2.A06 = context.getColor(2Yu.A02(context));
    }

    public static void A10(View view, C255773uh r5, C255783ui r6, int i, int i2) {
        C306406Ma.A04(view, r6, r5.A00(), i, i2, true);
    }

    public static void A11(C286575Wy r2, int i) {
        AnonymousClass5ZZ.A0h(r2, AnonymousClass5aQ.A01(r2).A05, C304346Dc.A00(r2, i));
    }

    public static void A14(C286575Wy r2, AnonymousClass5Z4 r3, String str) {
        AnonymousClass5ZZ.A0u(r2, r3, str, AnonymousClass5aQ.A00(r2).A0t);
    }

    public static void A15(C286575Wy r3, String str) {
        AnonymousClass5ZZ.A0r(r3, AnonymousClass5aQ.A01(r3).A02, str, AnonymousClass5aQ.A00(r3).A0t);
    }

    public static void A16(C286575Wy r3, String str) {
        AnonymousClass5ZZ.A0r(r3, AnonymousClass5aQ.A01(r3).A00, str, AnonymousClass5aQ.A00(r3).A0t);
    }

    public static void A17(Fragment fragment, boolean z) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            2dZ.A0t.A03(activity).setIsLoading(z);
        }
    }

    public static void A1C(AnonymousClass2rW r1, List list) {
        r1.A01 = Collections.unmodifiableList(list);
        AnonymousClass2rW.A00(r1);
    }

    public static void A1F(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(0);
    }

    public static void A1G(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(false);
    }

    public static void A1H(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((String) null);
    }

    public static void A1I(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof Badge.ChallengeBadge) {
            abstractCollection.add(next);
        }
    }

    public static void A1J(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof Badge.AchievementBadge) {
            abstractCollection.add(next);
        }
    }

    public static boolean A1R(C286575Wy r1, float f, float f2, boolean z) {
        return z | r1.AGr(f) | r1.AGr(f2);
    }

    public static boolean A1T(C286575Wy r1, Object obj, int i) {
        C304846Fl.A04(r1, AnonymousClass5PI.A01(r1, obj, i));
        return 0fL.A02();
    }

    public static boolean A1U(C286575Wy r1, Object obj, int i, long j) {
        C304846Fl.A05(r1, AnonymousClass5PI.A01(r1, obj, i), j);
        return 0fL.A02();
    }

    public static boolean A1V(C286575Wy r1, String str, long j) {
        AnonymousClass5ZZ.A0r(r1, AnonymousClass5aQ.A01(r1).A01, str, j);
        r1.ASN();
        return 0fL.A02();
    }

    public static boolean A1Z(Object obj, Iterator it) {
        return 0qQ.A0K(((AnonymousClass9J3) it.next()).A03, obj);
    }
}

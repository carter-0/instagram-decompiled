package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Constraints;
import androidx.fragment.app.Fragment;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.showreel.composition.ui.reels.IgReelsShowreelCompositionView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;

/* renamed from: X.G9v  reason: case insensitive filesystem */
public abstract class C51974G9v {
    public static int A01(int i, int i2, int i3) {
        return i | i2 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3);
    }

    public static C238863Ds A06(0lg r3) {
        0qQ.A0B(r3, 0);
        if (182.A06(0Tu.A05, r3, 36314871905651563L)) {
            return C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON;
        }
        return C238863Ds.ATTACHMENT;
    }

    public static 2WX A0C(2WX r4, AnonymousClass2WY r5, float f) {
        return new 2WX(new 2WX(r4, r5), new AnonymousClass9JQ(AnonymousClass05K.A0C, f, 1));
    }

    public static 2WX A0I(2WX r6, AnonymousClass2WY r7, AnonymousClass2WJ r8, int i) {
        return new 2WX(new 2WX(r6, r7), new AnonymousClass9JR(AnonymousClass05K.A01, 0, C244013aV.A0C(r8, i)));
    }

    public static 2WX A0K(2WX r4, AnonymousClass2WY r5, Integer num) {
        return new 2WX(new 2WX(r4, r5), new AnonymousClass9JS(num, C243573Zh.CENTER, 3));
    }

    public static 2WX A0L(2WX r5, Integer num) {
        return new 2WX(new 2WX(r5, new AnonymousClass9JQ(num, 100.0f, 0)), new AnonymousClass9JQ(AnonymousClass05K.A00, 100.0f, 0));
    }

    public static Long A0T(UserSession userSession, 1Xj r3) {
        User A2A = r3.A2A(userSession);
        if (A2A != null) {
            return 00y.A0n(10, A2A.getId());
        }
        return null;
    }

    public static Timer A0c(String str) {
        Timer timer;
        if (str == null) {
            return timer;
        }
        timer = new Timer(str, true);
        return timer;
    }

    public static void A0m(0Aj r4, long j) {
        r4.A8D("timespent", Double.valueOf(((double) j) / 1000.0d));
        r4.Cgf();
    }

    public static void A0x(AnonymousClass3Y5 r1, C244103ae r2, int i, long j) {
        r2.A0K((float) i);
        r2.A0I((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0J((float) 2Wd.A00(r1.Bnf(), j));
    }

    public static void A0y(2Wb r2, C244103ae r3, boolean z) {
        r3.A0b(true);
        r3.A0Y(z);
        r3.A0Z(true);
        r3.A05((AnonymousClass2VW) null);
        r2.A00(r3.A0A());
    }

    public static void A0z(2WX r2, C244103ae r3, boolean z) {
        r3.A0b(true);
        r3.A0Y(z);
        r3.A0Z(true);
        r3.A0D();
        r3.A05((AnonymousClass2VW) null);
        C244123ag.A00(r3, r2);
    }

    public static void A10(C244103ae r1, AnonymousClass2WJ r2, int i, long j) {
        r1.A0K((float) i);
        r1.A0I((float) 2Wd.A00(r2.Bnf(), j));
        r1.A0J((float) 2Wd.A00(r2.Bnf(), j));
    }

    public static void A12(C244103ae r2, Integer num) {
        r2.A0C();
        r2.A0X(num);
        r2.A0L(1.28f);
        r2.A0a(false);
        r2.A0N(0);
    }

    public static void A13(C244103ae r2, Integer num, float f) {
        r2.A0C();
        r2.A0X(num);
        r2.A0L(f);
        r2.A0a(false);
        r2.A0N(0);
        r2.A0M(1);
        r2.A0b(true);
        r2.A0Y(false);
        r2.A0Z(true);
    }

    public static void A16(C244103ae r1, Integer num, Integer num2) {
        r1.A0W(num);
        r1.A0C();
        r1.A0X(num2);
        r1.A0G();
        r1.A0a(false);
        r1.A0N(0);
    }

    public static void A1A(C244103ae r1, Integer num, boolean z, boolean z2) {
        r1.A0C();
        r1.A0X(num);
        r1.A0G();
        r1.A0a(z);
        r1.A0N(z ? 1 : 0);
        r1.A0E();
        r1.A0b(z2);
        r1.A0Y(z);
        r1.A0Z(z2);
        r1.A05((AnonymousClass2VW) null);
    }

    public static void A1B(C244103ae r3, AbstractCollection abstractCollection) {
        r3.A0a(false);
        r3.A0N(0);
        r3.A0E();
        r3.A0b(true);
        r3.A0Y(false);
        r3.A0Z(true);
        r3.A05((AnonymousClass2VW) null);
        abstractCollection.add(r3.A0A());
    }

    public static void A1H(UserSession userSession, 1Xj r8, ArrayList arrayList, Collection collection) {
        ArrayList arrayList2 = arrayList;
        arrayList.addAll(collection);
        if (!arrayList.isEmpty()) {
            AnonymousClass4H4.A00.A08(userSession, r8.getId(), AnonymousClass0HM.A00().toString(), "bottom_sheet_entry_tag_clip_tag_pill", arrayList2);
        }
    }

    public static void A1I(C254523sc r2, 1PW r3, int i) {
        if (i != 0) {
            r2.A7P = (String) r3.A00().get(0);
            r2.A7x = r3.A00();
        }
    }

    public static void A1K(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj3, 3);
    }

    public static void A1L(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(obj3, 4);
    }

    public static void A1M(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        0qQ.A0B(obj3, 4);
    }

    public static void A1N(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 5);
        0qQ.A0B(obj2, 6);
        0qQ.A0B(obj3, 7);
    }

    public static void A1O(Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj3, 2);
        0qQ.A0B(obj4, 3);
    }

    public static void A1P(Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(obj3, 3);
        0qQ.A0B(obj4, 4);
    }

    public static void A1Q(Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, 7);
        0qQ.A0B(obj2, 8);
        0qQ.A0B(obj3, 9);
        0qQ.A0B(obj4, 10);
    }

    public static void A1S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        0qQ.A0B(obj3, 4);
        0qQ.A0B(obj4, 5);
        0qQ.A0B(obj5, 6);
    }

    public static C287965b7 A03() {
        return new C287965b7(new C289005cr(1 | (1 << 32)), 1.0f, 400.0f);
    }

    public static 2WX A0A(2V5 r3, 2WX r4, AnonymousClass2WY r5) {
        return new 2WX(new 2WX(r4, r5), new AnonymousClass9JS(r3, AnonymousClass05K.A1I));
    }

    public static 2WX A0B(2WX r4) {
        return new 2WX(r4, new AnonymousClass9JS(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3));
    }

    public static 2WX A0D(2WX r3, AnonymousClass2WY r4, float f, int i) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JQ(AnonymousClass05K.A01, f, i));
    }

    public static 2WX A0E(2WX r3, AnonymousClass2WY r4, int i, long j) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JR(AnonymousClass05K.A1I, i, j));
    }

    public static 2WX A0F(2WX r3, AnonymousClass2WY r4, int i, long j) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JR(AnonymousClass05K.A0A, i, j));
    }

    public static 2WX A0G(2WX r3, AnonymousClass2WY r4, int i, long j) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JR(AnonymousClass05K.A15, i, j));
    }

    public static 2WX A0H(2WX r3, AnonymousClass2WY r4, int i, long j) {
        return new 2WX(new 2WX(r3, r4), new AnonymousClass9JR(AnonymousClass05K.A08, i, j));
    }

    public static 2WX A0J(2WX r4, AnonymousClass2WY r5, Integer num) {
        return new 2WX(new 2WX(r4, r5), new AnonymousClass9JS(num, C243573Zh.CENTER, 3));
    }

    public static 2WX A0M(2WX r1, Integer num, int i, long j) {
        return new 2WX(new 2WX(r1, new AnonymousClass9JR(num, i, j)), new AnonymousClass9JR(AnonymousClass05K.A01, i, j));
    }

    public static 2WX A0N(2WX r1, Integer num, int i, long j) {
        return new 2WX(new 2WX(r1, new AnonymousClass9JR(num, i, j)), new AnonymousClass9JR(AnonymousClass05K.A0j, i, j));
    }

    public static 2WX A0O(2WX r1, Integer num, Integer num2, float f, int i) {
        return new 2WX(new 2WX(r1, new AnonymousClass9JQ(num, f, i)), new AnonymousClass9JQ(num2, f, i));
    }

    public static C230472pg A0R(C267324bN r0) {
        1Xj r02 = r0.A02;
        if (r02 == null) {
            return C230472pg.UNKNOWN;
        }
        if (r02.CcK()) {
            return C230472pg.SPONSORED;
        }
        return C230472pg.ORGANIC;
    }

    public static Long A0S(0Aj r2, String str, long j) {
        r2.AAJ("containermodule", str);
        r2.A9F("time_spent", Long.valueOf(j));
        return -1L;
    }

    public static Long A0U(1Xj r1) {
        User CCd = r1.A0C.CCd();
        if (CCd != null) {
            return 00y.A0n(10, CCd.getId());
        }
        return null;
    }

    public static Object A0Y(C286575Wy r2, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        AnonymousClass6FV r0 = new AnonymousClass6FV(C286645Xf.A00(r2, 19B.A00));
        r2.FLL(r0);
        return r0;
    }

    public static Object A0Z(C286575Wy r3, Object obj, Object obj2, boolean z) {
        if (obj != obj2) {
            return obj;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C284885Or A00 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A00, valueOf);
        r3.FLL(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static void A0e(ValueAnimator valueAnimator, View view, Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Float");
        view.setScaleX(((Number) obj).floatValue());
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setScaleY(((Number) animatedValue).floatValue());
    }

    public static void A0f(Activity activity, Bundle bundle, Fragment fragment, 0lg r10) {
        AnonymousClass6W8 r1 = new AnonymousClass6W8(activity, bundle, r10, ModalActivity.class, "profile");
        r1.A0J = ModalActivity.A08;
        r1.A0C(fragment.requireContext());
    }

    public static void A0j(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "surface");
        r2.AAJ("waterfall_id", "");
        r2.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
        r2.Cgf();
    }

    public static void A0k(AnonymousClass0Ac r1, 0Aj r2, String str, String str2, String str3) {
        r2.A8M(r1, "wearable_device");
        r2.AAJ("source_media_id", str);
        r2.AAJ("source_media_surface", str2);
        r2.AAJ("target_media_id", str3);
        r2.Cgf();
    }

    public static void A0n(0Aj r2, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, Long l) {
        r2.A9F("hscroll_seed_ad_id", l);
        r2.A7p("is_seed_ad_multi_ads_eligible", intentAwareAdsInfoIntf.CbN());
        r2.AAJ("hscroll_seed_ad_tracking_token", intentAwareAdsInfoIntf.Br4());
    }

    public static void A0o(0Aj r2, 1Xj r3) {
        r2.AAJ("mezql_token", r3.A0C.getMezqlToken());
        r2.AAJ("ranking_info_token", r3.A0C.getLoggingInfoToken());
    }

    public static void A0r(0Aj r2, String str) {
        r2.AAJ("action_source", str);
        r2.AAJ("options", (String) null);
        r2.A9F("options_count", (Long) null);
        r2.A9H("metadata", (Map) null);
        r2.Cgf();
    }

    public static void A0s(0Aj r2, String str, String str2) {
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "reels");
        r2.AAJ("ui_variant", str);
        r2.AAJ("social_context", str2);
    }

    public static void A0w(0bb r4, 0xF r5) {
        r4.A06("search_session_id", r5.A05("search_session_id"));
        r4.A06("serp_session_id", r5.A05("serp_session_id"));
        r4.A06("rank_token", r5.A05("rank_token"));
        r4.A06("query_text", r5.A05("query_text"));
    }

    public static void A1D(C227812jx r1) {
        C238143As r12;
        if (r1.mView != null && (r12 = (C238143As) r1.getScrollingViewProxy()) != null) {
            r12.EaP(false);
        }
    }

    public static void A1E(0wc r4, Long l, String str) {
        0Aj A00 = r4.A00(r4.A00, str);
        if (A00.isSampled()) {
            A00.A9F("media_id", l);
            A00.AAJ("entrypoint", "accept_flow_entrypoint_other");
            A00.AAJ("surface", "accept_flow_review_surface_dialog");
            A00.Cgf();
        }
    }

    public static void A1F(0wc r1, String str) {
        0Aj A00 = r1.A00(r1.A00, str);
        if (A00.isSampled()) {
            A00.AAJ("tool", "");
            A00.AAJ("debug", "");
            A00.Cgf();
        }
    }

    public static void A1R(Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, 11);
        0qQ.A0B(obj2, 12);
        0qQ.A0B(obj3, 13);
        0qQ.A0B(obj4, 14);
    }

    public static boolean A1T(int i) {
        if ((458752 & i) == 131072) {
            return true;
        }
        return false;
    }

    public static boolean A1U(int i) {
        if ((1879048192 & i) == 536870912) {
            return true;
        }
        return false;
    }

    public static boolean A1V(int i) {
        if ((29360128 & i) == 8388608) {
            return true;
        }
        return false;
    }

    public static int A00(int i, int i2) {
        return i2 | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i);
    }

    public static long A02(long j) {
        return AnonymousClass5SF.A04(Constraints.A03(j), Constraints.A01(j), Constraints.A02(j), Constraints.A00(j));
    }

    public static C289165d8 A04(long j) {
        return new C289165d8(AnonymousClass5TW.A00(AnonymousClass1GB.A01(C289295dM.A01(j)), AnonymousClass1GB.A01(C289295dM.A02(j))));
    }

    public static 0Aj A05(AnonymousClass0iw r1, 0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(r1, r2);
        0Aj A00 = A01.A00(A01.A00, "ig_ads_conversion_funnel");
        A00.A8M(C62666KkS.BIO_IG_REELS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        return A00;
    }

    public static C244523bK A07(C244463bE r7, C251273mq r8, AnonymousClass2WK r9, C62320sa r10, 0sP r11) {
        return new C244523bK((2WX) null, r9, new AnonymousClass2WG(r8, r10, r11, r7.A01()));
    }

    public static LithoView A08(Fragment fragment, ComponentTree componentTree) {
        LithoView lithoView = new LithoView(new 2V1(fragment.requireContext()), (AttributeSet) null);
        lithoView.A0k(componentTree, true);
        return lithoView;
    }

    public static 2Vm A09(Context context, AnonymousClass4Ew r1, AnonymousClass4Ey r2, AnonymousClass4Ey r3, int i) {
        r2.A04(AnonymousClass4F6.A00(context, i));
        r2.A02 = r1;
        return new 2Vm(new AnonymousClass4Ey[]{r3, r2});
    }

    public static C247373gE A0P(Drawable drawable, 2V1 r2, 2WX r3) {
        C247393gG A00 = C247373gE.A00(r2);
        A00.A0D(drawable);
        A00.A0B();
        A00.A0C();
        C244123ag.A00(A00, r3);
        return A00.A0A();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    public static SourceModelInfoParams A0Q(1Xj r4, AnonymousClass3W1 r5, String str, String str2) {
        int position = r5.getPosition();
        int i = r5.A03;
        String loggingInfoToken = r4.A0C.getLoggingInfoToken();
        ? obj = new Object();
        obj.A06 = str;
        obj.A02 = position;
        obj.A00 = i;
        obj.A08 = str2;
        obj.A07 = loggingInfoToken;
        return obj;
    }

    public static Object A0V(C286575Wy r2, int i) {
        r2.ExS(i);
        Object ECw = r2.ECw();
        if (ECw != AnonymousClass5XT.A00) {
            return ECw;
        }
        AnonymousClass5aS r0 = new AnonymousClass5aS();
        r2.FLL(r0);
        return r0;
    }

    public static Object A0W(C286575Wy r1, Object obj, int i) {
        r1.ExS(i);
        Object ECw = r1.ECw();
        if (ECw != obj) {
            return ECw;
        }
        AnonymousClass5aS r0 = new AnonymousClass5aS();
        r1.FLL(r0);
        return r0;
    }

    public static Object A0X(C286575Wy r3, Object obj, int i, boolean z) {
        r3.ExS(i);
        Object ECw = r3.ECw();
        if (ECw != obj) {
            return ECw;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C284885Or A00 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A00, valueOf);
        r3.FLL(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static String A0a(C254523sc r3, 1Xj r4) {
        int A0m = r4.A0m();
        String A2p = r4.A2p();
        if (A0m != -1) {
            r3.A2k = Integer.valueOf(A0m);
        }
        return A2p;
    }

    public static String A0b(List list, int i) {
        return ((C299575vQ) 00k.A0I((List) ((C61083JwL) list.get(i)).A00)).Be5().A03;
    }

    public static void A0d(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 4);
        0qQ.A0B(obj3, 5);
        0qQ.A0B(obj4, 6);
    }

    public static void A0g(Drawable drawable, ImageView.ScaleType scaleType, 2V1 r3, 2Wb r4, 2WX r5) {
        C247393gG A00 = C247373gE.A00(r3);
        A00.A0D(drawable);
        A00.A0E(scaleType);
        A00.A0C();
        C244123ag.A00(A00, r5);
        r4.A00(A00.A0A());
    }

    public static void A0h(Drawable drawable, 2V1 r2, 2Wb r3, 2WX r4) {
        C247393gG A00 = C247373gE.A00(r2);
        A00.A0D(drawable);
        A00.A0B();
        A00.A0C();
        C244123ag.A00(A00, r4);
        r3.A00(A00.A0A());
    }

    public static void A0i(C286575Wy r12, C303876Bd r13, int i, int i2) {
        r13.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65530, AnonymousClass5aQ.A00(r12).A0Y, 0, 0), i, i2);
    }

    public static void A0l(0Aj r2, int i, long j) {
        r2.A9F("media_id", Long.valueOf(j));
        r2.A8k("media_index", Integer.valueOf(i));
    }

    public static void A0p(0Aj r2, 1Xj r3, String str, String str2) {
        r2.AAJ(str, str2);
        r2.A9F("m_t", Long.valueOf((long) r3.BR7().A00));
    }

    public static void A0q(0Aj r2, AnonymousClass93U r3, long j) {
        r2.A9F("media_index", Long.valueOf(j));
        r2.AAJ("viewer_session_id", r3.CFD());
    }

    public static void A0t(0Aj r2, String str, String str2, Map map) {
        r2.AAJ(str, str2);
        r2.A9H("pc_component_dict_new", map);
        r2.A7p("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
    }

    public static void A0u(0Ak r2, AnonymousClass9J4 r3, String str, String str2) {
        r2.A0R(str, str2);
        r2.A0R("item_type", r3.A01.toString());
        r2.A0R("signal_surface", r3.A05.toString());
    }

    public static void A0v(0bb r2, CreatorViewerSignalModel creatorViewerSignalModel, AbstractCollection abstractCollection) {
        r2.A06("signal", creatorViewerSignalModel.BwM().toString());
        r2.A06("signal_text_enum", creatorViewerSignalModel.getTitle());
        abstractCollection.add(r2);
    }

    public static void A11(C244103ae r2, AnonymousClass2V4 r3, Number number, long j) {
        r2.A0H((float) 2Wd.A00(r3, j));
        if (number != null) {
            r2.A01.A0I = number.intValue();
        }
    }

    public static void A14(C244103ae r0, Integer num, float f, boolean z, boolean z2) {
        r0.A0C();
        r0.A0X(num);
        r0.A0L(f);
        r0.A0a(z);
        r0.A0N(z ? 1 : 0);
        r0.A0E();
        r0.A0b(z2);
        r0.A0Y(z);
        r0.A0Z(z2);
    }

    public static void A15(C244103ae r0, Integer num, int i, boolean z) {
        r0.A0C();
        r0.A0X(num);
        r0.A0G();
        r0.A0a(z);
        r0.A0N(i);
        r0.A0E();
    }

    public static void A17(C244103ae r0, Integer num, boolean z) {
        r0.A0B();
        r0.A0C();
        r0.A0X(num);
        r0.A0G();
        r0.A0a(z);
        r0.A0N(z ? 1 : 0);
    }

    public static void A18(C244103ae r1, Integer num, boolean z) {
        r1.A0C();
        r1.A0X(num);
        r1.A0L(1.33f);
        r1.A0a(z);
        r1.A0N(z ? 1 : 0);
    }

    public static void A19(C244103ae r0, Integer num, boolean z) {
        r0.A0W(num);
        r0.A0C();
        r0.A0X(num);
        r0.A0G();
        r0.A0a(z);
        r0.A0N(z ? 1 : 0);
    }

    public static void A1C(1Fa r2, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        r2.A9m((String) entry.getKey(), (String) entry.getValue());
    }

    public static void A1G(0lg r5, 1Xj r6) {
        int A05 = AnonymousClass0fD.A05(528212011);
        AnonymousClass1Nd.A00(r5).A00(new C240163Jv(r6, 1sy.A07, (AnonymousClass34A) null));
        AnonymousClass0fD.A0C(1989792748, A05);
    }

    public static void A1J(IgReelsShowreelCompositionView igReelsShowreelCompositionView) {
        igReelsShowreelCompositionView.getController();
        HashMap hashMap = new HashMap();
        hashMap.put(C52505GVi.HEADER, igReelsShowreelCompositionView.A00);
        hashMap.put(C52505GVi.TOOLBAR, igReelsShowreelCompositionView.A01);
    }

    public static boolean A1W(int i) {
        if ((57344 & i) == 16384) {
            return true;
        }
        return false;
    }

    public static boolean A1X(C286575Wy r0, int i, int i2) {
        r0.ExS(i);
        if ((i2 & 14) == 4) {
            return true;
        }
        return false;
    }

    public static boolean A1Y(C286575Wy r0, int i, int i2) {
        r0.ExS(i);
        if ((i2 & 112) == 32) {
            return true;
        }
        return false;
    }

    public static boolean A1Z(C286575Wy r0, int i, int i2) {
        r0.ExS(i);
        if ((i2 & 896) == 256) {
            return true;
        }
        return false;
    }

    public static boolean A1a(C286575Wy r0, int i, int i2) {
        r0.ExS(i);
        if ((i2 & 7168) == 2048) {
            return true;
        }
        return false;
    }

    public static boolean A1b(C286575Wy r2, Object obj, Object obj2, Object obj3, int i) {
        r2.ExS(i);
        return r2.AGu(obj) | r2.AGu(obj2) | r2.AGu(obj3);
    }
}

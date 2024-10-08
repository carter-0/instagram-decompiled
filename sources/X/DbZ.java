package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.ApiAdFormats;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public abstract class DbZ {
    public static int A03(0Aj r2, User user) {
        r2.AAJ("radio_type", (String) null);
        r2.AAJ("reason", (String) null);
        r2.AAJ("group_name", (String) null);
        return user.BIW();
    }

    public static int A04(1Uk r5, String str, String str2) {
        0qQ.A0B(str, 0);
        String A00 = 0JX.A00(str);
        0qQ.A07(A00);
        String substring = A00.substring(A00.length() - 15);
        0qQ.A07(substring);
        int parseLong = (int) (Long.parseLong(substring, 16) % 10000);
        1W3 AR0 = r5.AR0();
        AR0.A07(AGj.A01(str2), parseLong);
        AR0.A0B();
        return parseLong;
    }

    public static int A06(Calendar calendar) {
        return calendar.get(2);
    }

    public static Bundle A0A(String str, String str2, ArrayList arrayList, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", str);
        bundle.putStringArrayList("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", arrayList);
        bundle.putString("ContextualFeedFragment.ARGUMENT_FEED_TITLE", str2);
        bundle.putString("ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE", (String) null);
        bundle.putBoolean("ContextualFeedFragment.ARGUMENT_IS_NAVIGATION_FROM_FULL_AUDIENCE_MEDIA_GRID", z);
        return bundle;
    }

    public static TextView A0D(Fragment fragment, 2dZ r5) {
        FrameLayout frameLayout = r5.A0S;
        0qQ.A0C(frameLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        return (TextView) LayoutInflater.from(fragment.requireContext()).inflate(R.layout.action_bar_button_text, frameLayout, false).requireViewById(R.id.action_bar_button_text);
    }

    public static 1NY A0L(0lg r2) {
        0qQ.A0B(r2, 0);
        1NY r0 = new 1NY(r2, -2);
        r0.A04();
        return r0;
    }

    public static 1NY A0M(0lg r2) {
        0qQ.A0B(r2, 0);
        1NY r0 = new 1NY(r2, -2);
        r0.A05();
        return r0;
    }

    public static FEW A0W() {
        return new FEW(true, false, (String) null);
    }

    public static String A0l(0Aj r3, C254923tH r4, DirectShareTarget directShareTarget) {
        C254763t0 A02;
        r3.A8M(C71112Od3.A02(r4), TraceFieldType.TransportType);
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        C254793t3 A05 = AnonymousClass6W3.A05(r0);
        if (A05 == null || (A02 = C300965yF.A02(A05)) == null) {
            return null;
        }
        return A02.A00;
    }

    public static void A0u(Activity activity, Window window) {
        window.setBackgroundDrawable(new ColorDrawable(0));
        activity.getWindow().setStatusBarColor(activity.getColor(R.color.fds_transparent));
    }

    public static void A18(Fragment fragment, FragmentActivity fragmentActivity, 0lg r5) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r5);
        r1.A0F = true;
        r1.A0B((Bundle) null, fragment);
        r1.A04();
    }

    public static void A1D(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public static void A1U(1OC r1, int i) {
        if (i != -1) {
            r1.A01 = new C323146x1(i);
            19V.A01.add(new C324276yv(i));
        }
    }

    public static int A00(Context context, Fragment fragment, int i) {
        if (i != 0) {
            return 2Yu.A0H(context, R.attr.igds_color_link);
        }
        return 2Yu.A0D(fragment.requireContext());
    }

    public static long A07(String str) {
        Long A0n = 00y.A0n(10, str);
        if (A0n != null) {
            return A0n.longValue();
        }
        return 0;
    }

    public static long A08(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static Bundle A09(Parcelable parcelable, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("ARGUMENT_PRODUCT_ELIGIBILITY", str);
        bundle.putParcelable("ARGUMENT_PRODUCT_TYPE", parcelable);
        return bundle;
    }

    public static SpannableStringBuilder A0B(CharSequence charSequence, CharSequence charSequence2) {
        return new SpannableStringBuilder(charSequence).append(" ").append(charSequence2);
    }

    public static TextView A0C(Context context, C47035DpR dpR) {
        ScaleDrawable scaleDrawable = new ScaleDrawable(context.getDrawable(R.drawable.chevron_right), 16, 1.0f, 1.0f);
        scaleDrawable.setLevel(6000);
        TextView textView = dpR.A0A;
        RectF rectF = 0nA.A01;
        0qQ.A0B(textView, 0);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, scaleDrawable, (Drawable) null);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.direct_drawable_padding_size));
        return textView;
    }

    public static FragmentActivity A0E(Object obj) {
        return ((Fragment) obj).getActivity();
    }

    public static 0Aj A0G(0wc r2, User user, String str) {
        0Aj A00 = r2.A00(r2.A00, str);
        A00.AAJ("target_id", user.getId());
        return A00;
    }

    public static 0Aj A0H(0wc r1, String str, String str2, int i) {
        0Aj A00 = r1.A00(r1.A00, str);
        A00.AAJ("target_id", str2);
        A00.A8k("position", Integer.valueOf(i));
        return A00;
    }

    public static 1Ln A0I(C58840Ae r2, String str) {
        0wc r22 = (0wc) r2;
        1Ln r23 = new 1Ln(r22.A00(r22.A00, "yp_ig_family_center_setup_client_event"), 415);
        r23.A0R("current_module", "ig_supervision_upsell_helpers");
        r23.A0R(TraceFieldType.AdhocEventName, str);
        r23.A0R("fc_session_id", "");
        return r23;
    }

    public static ApiAdFormats A0N(String str, int i) {
        return new ApiAdFormats(str, i, str);
    }

    public static AnonymousClass6KM A0Y(AnonymousClass3UM r2, String str, String str2, String str3, int i) {
        AnonymousClass6KM r1 = new AnonymousClass6KM(str, str2, str3);
        r1.A00 = i;
        r1.A04 = r2.getAlgorithm();
        return r1;
    }

    public static IllegalStateException A0a() {
        return new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static Long A0c(Number number) {
        if (number != null) {
            return Long.valueOf((long) number.intValue());
        }
        return null;
    }

    public static Long A0d(String str) {
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static Object A0e(Context context) {
        return context.getSystemService("clipboard");
    }

    public static Object A0f(0lg r3, 2XO r4) {
        return r4.A02(r3, AnonymousClass05K.A00, 0qv.A02.A04(r3.getDeviceSession().A06()));
    }

    public static String A0h(Uri uri) {
        return uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static String A0n(AnonymousClass4V9 r0) {
        String str = r0.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static Throwable A0o(User user) {
        return new Throwable(002.A0R("username contains space: ", user.getUsername()));
    }

    public static UnsupportedOperationException A0p(Object obj) {
        return new UnsupportedOperationException(002.A0R("Unexpected partnerType, received ", obj.toString()));
    }

    public static HashMap A0q() {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        return hashMap;
    }

    public static HashMap A0r(C252503pD r2, C269474fB r3) {
        C268194cw r1 = new C268194cw(r3);
        r1.A0B(r2, "server_params");
        HashMap hashMap = new HashMap();
        hashMap.put("params", r1.toString());
        return hashMap;
    }

    public static void A0s(int i) {
        C59689JTv.A07(C60960kU.A00, i);
    }

    public static void A0v(Context context, Uri uri) {
        Intent A01 = AnonymousClass14B.A03.A00().A01(context);
        A01.setData(uri);
        0kR.A0B(context, A01);
    }

    public static void A10(Context context, C310336ap r2, CharSequence charSequence) {
        r2.A0D = charSequence;
        r2.A0D(context.getResources().getString(2131975851));
    }

    public static void A11(Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putString("destination_id", str);
        baseBundle.putString("encoded_query", uri.getEncodedQuery());
    }

    public static void A14(TextView textView, Object obj) {
        textView.setText((CharSequence) obj);
    }

    public static void A15(Fragment fragment) {
        AnonymousClass37D A01 = AnonymousClass37D.A00.A01(fragment.requireActivity());
        if (A01 != null) {
            A01.A0B();
        }
    }

    public static void A16(Fragment fragment) {
        if (fragment != null) {
            0hq childFragmentManager = fragment.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            if (AnonymousClass06S.A01(childFragmentManager) && childFragmentManager.A0M() > 0) {
                0s1 A0T = childFragmentManager.A0T(0);
                0qQ.A07(A0T);
                childFragmentManager.A0d(A0T.A00);
            }
        }
    }

    public static void A1B(Fragment fragment, Object obj, Object obj2) {
        fragment.setArguments(Q21.A00(new 0eP(obj, obj2)));
    }

    public static void A1C(Fragment fragment, 0sL r3, AnonymousClass0r6 r4) {
        AnonymousClass11O.A03(AnonymousClass07a.A00(fragment.getViewLifecycleOwner()), new C61860pz(r3, r4));
    }

    public static void A1J(0Aj r2, String str) {
        r2.AAJ("step", str);
        r2.AAJ("waterfall_id", 1Q0.A01());
    }

    public static void A1K(0bb r1, String str, String str2, String str3, String str4) {
        r1.A06("event", str);
        r1.A06("event_flow", str2);
        r1.A06("event_step", str3);
        r1.A06("event_category", str4);
    }

    public static void A1M(PandoGraphQLRequest pandoGraphQLRequest, 1P0 r3, UserSession userSession) {
        1vm.A01(userSession).A06(pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0), r3);
    }

    public static void A1O(1Fa r2, C323066wt r3, String str, String str2, boolean z) {
        r2.A9m("from_module", str);
        r2.A03();
        r2.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        r2.A9m("is_prefetch", "false");
        r2.A0H("is_app_start", z);
        if (r3.A01) {
            r2.A9m("push_disabled", "true");
        }
    }

    public static void A1Q(C309516Yo r1) {
        r1.A0A = FRY.A09;
        r1.A04();
    }

    public static void A1R(0wc r1, String str) {
        0Aj A00 = r1.A00(r1.A00, str);
        if (A00.isSampled()) {
            A00.Cgf();
        }
    }

    public static void A1S(0wc r1, String str, String str2) {
        0Aj A00 = r1.A00(r1.A00, str);
        A00.AAJ("target_id", str2);
        A00.Cgf();
    }

    public static void A1T(0wc r3, String str, String str2, String str3) {
        0Aj A00 = r3.A00(r3.A00, str);
        if (A00.isSampled()) {
            A00.AAJ("notification_feed_session_id", str2);
            A00.AAJ("notification_feed_visit_id", str3);
            A00.A8D("notification_feed_session_start_time", Double.valueOf(((double) System.currentTimeMillis()) / 1000.0d));
            A00.Cgf();
        }
    }

    public static void A1V(C307896Rx r1, Object obj) {
        C299275ur.A00(r1, AnonymousClass6Tm.A01, (C277014uI) obj);
    }

    public static void A1X(C252063oV r2) {
        if (r2.CVM()) {
            r2.getView().setVisibility(8);
        }
    }

    public static void A1Y(E5H e5h) {
        e5h.A04.getClass();
    }

    public static void A1Z(1pE r1, String str) {
        r1.A0B = new C254763t0(str);
    }

    public static void A1b(Object obj, 0s0 r3, AnonymousClass0YZ[] r4, int i) {
        r3.Epx(obj, Integer.valueOf(((Number) r3.CDM(obj, r4[i])).intValue() + 1), r4[i]);
    }

    public static int A01(Fragment fragment) {
        return fragment.requireContext().getColor(2Yu.A06(fragment.requireContext()));
    }

    public static int A02(Fragment fragment) {
        return fragment.requireContext().getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static int A05(AnonymousClass6Tm r1) {
        Object A01 = r1.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A01).intValue();
    }

    public static RecyclerView A0F(View view, int i) {
        return (RecyclerView) view.findViewById(i);
    }

    public static JVH A0J(05G r0) {
        return (JVH) r0.getValue();
    }

    public static ImmutableList A0K(ImmutableList.Builder builder) {
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }

    public static C314336i2 A0O(AnonymousClass0eM r0) {
        return (C314336i2) r0.getValue();
    }

    public static C309516Yo A0P(Fragment fragment, AnonymousClass0eM r3) {
        return new C309516Yo(fragment.requireActivity(), (0lg) r3.getValue());
    }

    public static C46530DgX A0Q(0lg r2, int i) {
        0qQ.A0B(r2, i);
        return (C46530DgX) r2.A01(C46530DgX.class, new GW6(r2, 17));
    }

    public static C313756gx A0R(AnonymousClass0eM r0) {
        return (C313756gx) r0.getValue();
    }

    public static C254923tH A0S(DirectShareTarget directShareTarget) {
        if (!directShareTarget.A0U()) {
            return C254923tH.DJANGO;
        }
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        return AnonymousClass6W3.A00(r0);
    }

    public static 1Xj A0T(List list, int i) {
        return (1Xj) list.get(i);
    }

    public static IgdsHeadline A0U(View view, int i) {
        return (IgdsHeadline) view.requireViewById(i);
    }

    public static AnonymousClass5Gt A0V(Activity activity, int i) {
        String string = activity.getString(i);
        0qQ.A07(string);
        return new AnonymousClass5Gt(activity, new C315476jx((CharSequence) string));
    }

    public static U0t A0X(Context context, int i, int i2) {
        return new U0t(context.getString(i2, new Object[]{Integer.valueOf(i)}), context.getColor(R.color.green_6), context.getColor(R.color.green_0), context.getColor(2Yu.A02(context)));
    }

    public static IllegalArgumentException A0Z(Object obj) {
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{obj}));
    }

    public static Long A0b(1Ln r1, String str, String str2, String str3, int i) {
        r1.A0q(str);
        r1.A0o(C313746gw.A01(Integer.valueOf(i)));
        r1.A0s(str2);
        if (str3 != null) {
            return 00y.A0n(10, str3);
        }
        return null;
    }

    public static Object A0g(AbstractList abstractList, int i) {
        Object obj = abstractList.get(i);
        0qQ.A07(obj);
        return obj;
    }

    public static String A0i(Fragment fragment) {
        return 0qv.A00(fragment.getContext());
    }

    public static String A0j(Fragment fragment) {
        return fragment.getString(2131972232);
    }

    public static String A0k(AnonymousClass0Ac r2, 0Aj r3, long j) {
        r3.A9F("media_id", Long.valueOf(j));
        r3.A8M(r2, "product_type");
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0m(0lg r0) {
        if (AnonymousClass0BO.A00(r0).BNv() > 0) {
            return "mas";
        }
        return null;
    }

    public static void A0t(int i, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(obj3, 3);
    }

    public static void A0w(Context context, Fragment fragment, int i) {
        C59689JTv.A09(context, fragment.getString(i));
    }

    public static void A0x(Context context, 1Fa r3, String str, String str2) {
        r3.A9m(str, str2);
        r3.A9m(DcV.A00(), 0qv.A00(context));
        r3.A9m("guid", 0qv.A02.A05(context));
    }

    public static void A0y(Context context, 1Fa r2, String str, String str2) {
        r2.A9m(str, str2);
        r2.A9m("guid", 0qv.A02.A05(context));
    }

    public static void A0z(Context context, C331127Pr r1, int i) {
        r1.A0d = context.getString(i);
    }

    public static void A12(Uri uri, BaseBundle baseBundle, String str, String str2) {
        baseBundle.putString(str, uri.getQueryParameter(str));
        baseBundle.putString(str2, uri.getQueryParameter(str2));
    }

    public static void A13(TextView textView, Fragment fragment, C266444Yx r3) {
        textView.setText(C66909Mes.A01(fragment, r3));
    }

    public static void A17(Fragment fragment) {
        AnonymousClass37D A01;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (A01 = AnonymousClass37D.A00.A01(activity)) != null) {
            A01.A0B();
        }
    }

    public static void A19(Fragment fragment, IgBloksScreenConfig igBloksScreenConfig, int i) {
        igBloksScreenConfig.A0U = fragment.getString(i);
    }

    public static void A1A(Fragment fragment, C3021461u r1, int i) {
        r1.setPrimaryActionText(fragment.getString(i));
    }

    public static void A1E(0Aj r2) {
        r2.AAJ("waterfall_id", 1Q0.A01());
        r2.AAJ("containermodule", "waterfall_log_in");
    }

    public static void A1F(0Aj r2, double d) {
        r2.A8D(TraceFieldType.StartTime, Double.valueOf(d));
        r2.AAJ("waterfall_id", 1Q0.A01());
    }

    public static void A1G(0Aj r2, double d, double d2) {
        r2.A8D("current_time", Double.valueOf(d));
        r2.A8D("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A1H(0Aj r2, double d, double d2) {
        r2.AAJ("waterfall_id", 1Q0.A01());
        r2.AAJ("containermodule", "waterfall_log_in");
        r2.A8D("elapsed_time", Double.valueOf(d - d2));
        r2.A8D(TraceFieldType.StartTime, Double.valueOf(d2));
    }

    public static void A1I(0Aj r2, long j) {
        r2.A9F("media_index", Long.valueOf(j));
        r2.AAJ("viewer_session_id", "");
        r2.Cgf();
    }

    public static void A1L(1Ln r1, String str, int i) {
        r1.A0q(str);
        r1.A0o(C313746gw.A01(Integer.valueOf(i)));
    }

    public static void A1N(1Fa r4, UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        r4.A0G("qe_universe_name", (String) A00.A1A.CDM(A00, 1Av.A8a[379]));
    }

    public static void A1P(AnonymousClass4DH r1, int i) {
        if (r1.getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) r1.getRootActivity()).Enj(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1xE, java.lang.Object] */
    public static void A1W(UserSession userSession) {
        2aN.A00(userSession).A04(2aD.A0Z);
        1xC.A01.A00(new Object());
    }

    public static void A1a(MediaMapQuery mediaMapQuery, W3Q w3q, MediaMapPin mediaMapPin, String str) {
        W3Q.A00(mediaMapQuery, w3q, mediaMapPin, str).Cgf();
    }
}

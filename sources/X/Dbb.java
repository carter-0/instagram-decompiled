package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;

public abstract class Dbb {
    public static double A00(Object obj) {
        0qQ.A0B(obj, 0);
        return (double) System.currentTimeMillis();
    }

    public static int A02(Context context) {
        0qQ.A0B(context, 0);
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static 0Aj A0E(0lg r2) {
        0qQ.A0B(r2, 0);
        0wc A02 = AnonymousClass0kN.A02(r2);
        return A02.A00(A02.A00, "ig_edit_dob");
    }

    public static void A0k(Context context, UserSession userSession, 2EG r8, String str) {
        new SUL(context, userSession, r8, str, false).A0A();
    }

    public static void A0q(Parcel parcel, Enum enumR) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(enumR.ordinal());
    }

    public static void A0r(SpannableStringBuilder spannableStringBuilder, Object obj, Matcher matcher) {
        spannableStringBuilder.setSpan(obj, matcher.start(1), matcher.end(1), 33);
    }

    public static void A1F(0Ak r2) {
        r2.A0R("radio_type", (String) null);
        r2.A0R("reason", (String) null);
        r2.A0R("group_name", (String) null);
    }

    public static void A1I(2da r1) {
        0qQ.A0B(r1, 0);
        r1.Eu4(true);
    }

    public static void A1J(2da r1) {
        0qQ.A0B(r1, 0);
        r1.setTitle("");
    }

    public static void A1R(Object obj) {
        0qQ.A0B(obj, 0);
        0qQ.A07(1as.A04.A02);
    }

    public static 1Ln A0F(0Aj r3, User user, int i) {
        1Ln r2 = new 1Ln(r3, i);
        r2.A0R("target_id", user.getId());
        return r2;
    }

    public static 1OC A0K(1NY r2, Class cls, Class cls2) {
        r2.A0O(0aS.A00, cls, cls2, false);
        r2.A0R = true;
        return r2.A0M();
    }

    public static AnonymousClass0wW A0M(Bundle bundle) {
        if (bundle != null) {
            return 09i.A0A.A04(bundle);
        }
        return null;
    }

    public static C239793Ih A0R(Object obj) {
        return new C239793Ih(((AnonymousClass371) ((C239793Ih) obj).A00).FH3());
    }

    public static Long A0S(Object obj) {
        AnonymousClass3Q2 r4 = (AnonymousClass3Q2) obj;
        return Long.valueOf(Math.max(r4.A04(), r4.A0g));
    }

    public static String A0T() {
        return DcV.A02(102, 12, 82);
    }

    public static String A0U() {
        return Dbq.A05(134, 25, 105);
    }

    public static String A0V() {
        return Dbq.A05(354, 8, 99);
    }

    public static String A0W() {
        return Dbq.A05(401, 12, 84);
    }

    public static String A0X() {
        return Dbq.A05(446, 41, 109);
    }

    public static HashMap A0d(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put("back_stack_tag", obj);
        hashMap.put("entrypoint", obj2);
        return hashMap;
    }

    public static HashMap A0e(Object obj, Object obj2, 0eP r3) {
        return 0Yt.A02(new 0eP[]{r3, new 0eP(obj, obj2)});
    }

    public static List A0g(RegFlowExtras regFlowExtras) {
        List list = regFlowExtras.A0f;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        regFlowExtras.A0f = arrayList;
        return arrayList;
    }

    public static void A0i(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity, bundle, r3, cls, str);
        r0.A07();
        r0.A0C(activity);
    }

    public static void A0o(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, 0lg r4) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r4);
        r0.A0B(bundle, fragment);
        r0.A04();
    }

    public static void A0s(View.OnClickListener onClickListener, AnonymousClass3JR r1, 2da r2) {
        r1.A0G = onClickListener;
        r1.A05 = 2131956164;
        r2.ErG(new AnonymousClass3Jb(r1));
    }

    public static void A0v(Fragment fragment) {
        2dZ.A0t.A03(fragment.getActivity()).A0T();
    }

    public static void A11(Fragment fragment, FragmentActivity fragmentActivity, 0lg r4) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r4);
        r1.A0F = true;
        r1.A0D(fragment);
        r1.A04();
    }

    public static void A12(Fragment fragment, FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r3);
        r0.A0E(fragment);
        r0.A04();
    }

    public static void A13(Fragment fragment, FragmentActivity fragmentActivity, 0lg r4) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r4);
        r1.A0D(fragment);
        r1.A0D = false;
        r1.A04();
    }

    public static void A14(Fragment fragment, FragmentActivity fragmentActivity, 0lg r4) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r4);
        r1.A0E(fragment);
        r1.A0G = true;
        r1.A04();
    }

    public static void A18(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "format");
        r2.A8M(C48139EZh.CONFIRMED, "action");
    }

    public static void A19(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "format");
        r2.A8M(C48139EZh.DISMISSED, "action");
    }

    public static void A1A(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "format");
        r2.A8M(C48139EZh.IMPRESSION, "action");
    }

    public static void A1B(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "media_source");
        r2.A8M(C360948fP.CLIPS, "capture_type");
    }

    public static void A1C(0Aj r2) {
        r2.AAJ("parent_surface", "instagram");
        r2.AAJ("surface", "profile");
    }

    public static void A1D(0Aj r2, String str, long j) {
        r2.AAJ("container_module", str);
        r2.A9F("creator_igid", Long.valueOf(j));
    }

    public static void A1E(0Aj r1, String str, String str2) {
        r1.AAJ(TraceFieldType.AdhocEventName, str);
        r1.AAJ("original_birthday", str2);
        r1.Cgf();
    }

    public static void A1G(1Ln r2, UserSession userSession) {
        r2.A0h(Long.valueOf(Long.parseLong(userSession.A06)));
    }

    public static void A1K(1NY r2, C66431MRl mRl, UserSession userSession) {
        r2.A0P(new C64842Lj4(new 0bH(userSession), mRl));
    }

    public static void A1Q(C310336ap r3) {
        1xC.A01.A00(new AnonymousClass3GP(r3.A00()));
    }

    public static void A1S(Object obj) {
        FragmentActivity activity = ((Fragment) obj).getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static boolean A1X(C61084JwM jwM, OpalProfileData opalProfileData, Object obj, 05G r5) {
        return r5.AIY(obj, C61084JwM.A02((OpalProfileData) jwM.A02, opalProfileData, (C62520KhB) jwM.A00));
    }

    public static boolean A1a(String str, int i) {
        if (0qQ.A00(str.charAt(i), 32) <= 0) {
            return true;
        }
        return false;
    }

    public static int A01(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
    }

    public static int A03(View view, int i) {
        view.requireViewById(i).setVisibility(8);
        return 8;
    }

    public static int A04(Fragment fragment) {
        return fragment.requireContext().getColor(2Yu.A06(fragment.getContext()));
    }

    public static int A05(Fragment fragment) {
        return fragment.requireContext().getColor(2Yu.A08(fragment.getContext()));
    }

    public static int A06(Fragment fragment) {
        return fragment.requireContext().getColor(2Yu.A0D(fragment.getContext()));
    }

    public static int A07(Fragment fragment, int i) {
        return fragment.requireContext().getResources().getDimensionPixelSize(i);
    }

    public static long A08(AnonymousClass0eM r1) {
        return Long.parseLong(((UserSession) r1.getValue()).A06);
    }

    public static Resources A09(Fragment fragment, Object obj) {
        0qQ.A07(obj);
        return fragment.requireContext().getResources();
    }

    public static ColorFilter A0A(Context context, Fragment fragment) {
        return AnonymousClass37O.A00(context.getColor(2Yu.A0B(fragment.getContext())));
    }

    public static SpannableStringBuilder A0B(Resources resources, Object obj, int i) {
        Spanned A00 = 0bC.A00(resources, new Object[]{obj}, i);
        0qQ.A07(A00);
        return new SpannableStringBuilder(A00);
    }

    public static SpannableStringBuilder A0C(Fragment fragment, Object obj, Object obj2, int i) {
        return new SpannableStringBuilder(fragment.getString(i, new Object[]{obj, obj2}));
    }

    public static Fragment A0D(String str) {
        Fragment newInstance = Class.forName(str).newInstance();
        0qQ.A0C(newInstance, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return newInstance;
    }

    public static C309516Yo A0G(C273374mT r3) {
        return new C309516Yo(r3.requireActivity(), r3.getSession());
    }

    public static C309516Yo A0H(SupportLinksFragment supportLinksFragment) {
        return new C309516Yo(supportLinksFragment.requireActivity(), supportLinksFragment.A02);
    }

    public static C309516Yo A0I(C307896Rx r3) {
        return new C309516Yo(C308206Td.A04(r3), C308206Td.A0B(r3));
    }

    public static IgBloksScreenConfig A0J(AnonymousClass0eM r1) {
        return new IgBloksScreenConfig((0lg) r1.getValue());
    }

    public static C307786Rm A0L(AnonymousClass6Tm r1) {
        Object A01 = r1.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        return (C307786Rm) A01;
    }

    public static 1Xj A0N(1Xl r1, Q03 q03, int i, int i2) {
        q03.A01(r1.BPf());
        q03.A09 = i;
        q03.A0B = i2;
        return r1.BPf();
    }

    public static C319986rY A0O(UserSession userSession, User user) {
        String id = user.getId();
        return GU2.A00(userSession, user.B6o(), user.A0N(), id);
    }

    public static User A0P(C47477E4b e4b) {
        return (User) C47477E4b.A00(e4b).A0E.getValue();
    }

    public static F10 A0Q(AnonymousClass3FW r2, E3D e3d) {
        return r2.A03(2Aq.A03(e3d.A0H()).A0O());
    }

    public static String A0Y(Uri uri, String str) {
        if (!OXO.A02(uri)) {
            return null;
        }
        return uri.getQueryParameter(str);
    }

    public static String A0Z(BaseBundle baseBundle) {
        String string = baseBundle.getString(Dbq.A00(), "");
        0qQ.A07(string);
        return string;
    }

    public static String A0a(Fragment fragment) {
        String A00 = 0qv.A00(fragment.requireContext());
        0qQ.A07(A00);
        return A00;
    }

    public static String A0b(C268654dm r0) {
        Throwable A01 = r0.A01();
        if (A01 != null) {
            return A01.getMessage();
        }
        return null;
    }

    public static String A0c(AnonymousClass6Tm r1) {
        Object A01 = r1.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        return A01.toString();
    }

    public static List A0f(double d) {
        List singletonList = Collections.singletonList(Double.valueOf(d));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static void A0h(Activity activity) {
        Window window = activity.getWindow();
        window.getClass();
        window.setSoftInputMode(16);
    }

    public static void A0j(Context context, 1Fa r2) {
        r2.A9m(Dbq.A04(), 0qv.A00(context));
    }

    public static void A0l(Resources resources, TextView textView, int i) {
        textView.setText(Html.fromHtml(resources.getString(i)));
    }

    public static void A0m(Resources resources, TextView textView, String str, int i) {
        textView.setText(0bC.A01(resources, new String[]{str}, i));
    }

    public static void A0n(Bundle bundle, Parcelable parcelable, Serializable serializable, String str, boolean z) {
        bundle.putParcelable(str, parcelable);
        bundle.putSerializable("cameraEntryPoint", serializable);
        bundle.putBoolean("show_all_destinations", z);
    }

    public static void A0p(Bundle bundle, FragmentActivity fragmentActivity, T8B t8b, int i) {
        t8b.A07 = fragmentActivity.getString(i);
        t8b.A00(bundle);
        t8b.F08(fragmentActivity).A04();
    }

    public static void A0t(View view, int i, int i2) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        requireViewById.setVisibility(i2);
    }

    public static void A0u(Fragment fragment) {
        2dZ.A0t.A03(fragment.requireActivity()).A0T();
    }

    public static void A0w(Fragment fragment) {
        fragment.getActivity().getWindow().setSoftInputMode(16);
    }

    public static void A0x(Fragment fragment) {
        2dZ.A0t.A03(fragment.getActivity()).setIsLoading(false);
    }

    public static void A0y(Fragment fragment) {
        2dZ.A0t.A03(fragment.getActivity()).setIsLoading(true);
    }

    public static void A0z(Fragment fragment) {
        fragment.requireActivity().getOnBackPressedDispatcher().A04();
    }

    public static void A10(Fragment fragment) {
        fragment.requireActivity().getWindow().setSoftInputMode(16);
    }

    public static void A15(Fragment fragment, AnonymousClass11X r3) {
        1ES.A00(fragment.requireContext(), AnonymousClass07i.A00(fragment), r3);
    }

    public static void A16(Fragment fragment, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C59689JTv.A09(fragment.getContext(), charSequence);
        }
    }

    public static void A17(Fragment fragment, boolean z) {
        2dZ.A0t.A03(fragment.getActivity()).setIsLoading(z);
    }

    public static void A1H(1Ln r1, String str) {
        r1.A0p(str);
        r1.A0q("chat_setup");
        r1.A0o("broadcast");
    }

    public static void A1L(1Fa r1, String str, String str2, String str3, String str4) {
        r1.A9m(str, str2);
        r1.A9m(DcV.A00(), str3);
        r1.A9m("guid", str4);
    }

    public static void A1M(AnonymousClass4DH r2) {
        r2.registerLifecycleListener(new EE7(r2.getActivity()));
    }

    public static void A1N(AnonymousClass4DH r2) {
        r2.registerLifecycleListener(new EE7(r2.requireActivity()));
    }

    public static void A1O(UserSession userSession, 2Cn r3) {
        1ES.A05(C290635fd.A01(userSession, r3), 1967622104, 2, false, false);
    }

    public static void A1P(UserSession userSession, EWJ ewj, Integer num, long j) {
        2Ci.A03(userSession, ewj, num, (Long) null, (Long) null, Long.valueOf(j), "take_break", (Map) null, true);
    }

    public static void A1T(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put("uids_count", String.valueOf(i));
        0qQ.A0B(obj, 0);
    }

    public static void A1U(String str, AbstractCollection abstractCollection, AnonymousClass0eM r3) {
        User A02 = ((17i) r3.getValue()).A02(str);
        if (A02 != null) {
            abstractCollection.add(A02);
        }
    }

    public static void A1V(Map.Entry entry, Map map) {
        map.put(entry.getKey(), entry.getValue());
    }

    public static void A1W(AnonymousClass0eM r1) {
        ((C322326ve) r1.getValue()).A04("edit_link");
    }

    public static boolean A1Y(0Tu r0, 0lg r1) {
        return 182.A05(r0, r1);
    }

    public static boolean A1Z(C363378jd r1, String str) {
        return C363388je.A03(r1.A00(CallerContext.A01(str)));
    }

    public static boolean A1b(String str, String str2, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return str2.equals(lowerCase);
    }
}

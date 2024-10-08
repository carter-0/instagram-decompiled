package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class DbV {
    public static Bundle A09() {
        return new Bundle(2);
    }

    public static AnonymousClass328 A0f(Fragment fragment) {
        return new AnonymousClass328(fragment, -1);
    }

    public static AnonymousClass6ST A0h(Context context) {
        return new AnonymousClass6ST(context, true);
    }

    public static Serializable A0l(Bundle bundle, String str) {
        Serializable serializable = bundle.getSerializable(str);
        if (serializable == null) {
            return null;
        }
        return serializable;
    }

    public static List A18(CharSequence charSequence, String str) {
        return 00l.A0R(charSequence, new String[]{str}, 0);
    }

    public static void A19(Context context, Intent intent) {
        intent.putExtra("com.instagram.url.extra.IS_ALREADY_HANDLED", true);
        0kR.A0B(context, intent);
    }

    public static void A1A(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public static void A1O(C309516Yo r1) {
        r1.A0D = false;
        r1.A04();
    }

    public static void A1Q(C67620Mqs mqs) {
        mqs.A02(new Void[0]);
    }

    public static void A1R(1pE r1) {
        r1.A0v = true;
        r1.A06();
    }

    public static Bundle A0A(0lg r1) {
        Bundle bundle = new Bundle();
        AnonymousClass0Dg.A00(bundle, r1);
        return bundle;
    }

    public static Bundle A0C(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static AnonymousClass3JR A0K() {
        AnonymousClass3JR r0 = new AnonymousClass3JR();
        r0.A00();
        return r0;
    }

    public static OID A0L(Object obj) {
        OID oid = (OID) obj;
        0qQ.A0B(oid, 0);
        return oid;
    }

    public static C309516Yo A0M(Fragment fragment, FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r3);
        r0.A0D(fragment);
        return r0;
    }

    public static C309516Yo A0N(Fragment fragment, FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r3);
        r0.A0E(fragment);
        return r0;
    }

    public static 02m A0P(DirectShareSheetFragment directShareSheetFragment) {
        return C70166NyK.A00(directShareSheetFragment.A0G).A00;
    }

    public static C46620Di0 A0Q(Object obj) {
        C46620Di0 di0 = (C46620Di0) obj;
        0qQ.A0B(di0, 0);
        return di0;
    }

    public static C310336ap A0W() {
        C310336ap r0 = new C310336ap();
        r0.A04();
        return r0;
    }

    public static C310336ap A0X() {
        C310336ap r0 = new C310336ap();
        r0.A05();
        return r0;
    }

    public static AnonymousClass6W8 A0Y(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity, bundle, r3, cls, str);
        r0.A08();
        return r0;
    }

    public static ActivityFeedViewModel A0Z(C46352Dcv dcv) {
        return (ActivityFeedViewModel) dcv.A0L.getValue();
    }

    public static C46775Dl2 A0b(EN1 en1) {
        return (C46775Dl2) en1.A00.getValue();
    }

    public static 0xa A0d() {
        return AnonymousClass0xl.A00(C61170le.A00).A00;
    }

    public static C262184Cl A0k(UserSession userSession) {
        return AnonymousClass0t1.A01.A01(userSession).A03;
    }

    public static String A0t() {
        return 0qv.A02.A04(C60960kU.A00);
    }

    public static String A13(Object obj, 0s0 r2, AnonymousClass0YZ[] r3, int i) {
        return (String) r2.CDM(obj, r3[i]);
    }

    public static ArrayList A14(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static void A1B(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    public static void A1C(Intent intent, int i, Bundle bundle) {
        bundle.putInt("business_account_flow", i);
        intent.putExtras(bundle);
    }

    public static void A1D(SpannableStringBuilder spannableStringBuilder, String str) {
        AnonymousClass7AV.A02(spannableStringBuilder, new C305766Jl(), str);
    }

    public static void A1E(View.OnClickListener onClickListener, Integer num, AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C65485Lu9(onClickListener, num, i, z));
    }

    public static void A1F(AnonymousClass07Z r1, 2Fk r2, 0sP r3, int i) {
        r2.A06(r1, new C64318LZs(i, r3));
    }

    public static void A1G(0Aj r1, String str) {
        r1.AAJ("action", str);
        r1.Cgf();
    }

    public static void A1H(0Aj r1, String str) {
        r1.AAJ("source", str);
        r1.Cgf();
    }

    public static void A1I(0Aj r1, String str) {
        r1.AAJ("entrypoint", str);
        r1.Cgf();
    }

    public static void A1J(0Aj r1, String str) {
        r1.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        r1.Cgf();
    }

    public static void A1K(0Aj r1, String str) {
        r1.AAJ("ig_ndx_source", str);
        r1.Cgf();
    }

    public static void A1L(0Aj r1, Map map) {
        r1.A9H("extra_client_data", map);
        r1.Cgf();
    }

    public static void A1P(AnonymousClass0iw r1, IgImageView igImageView, String str) {
        igImageView.setUrl(new SimpleImageUrl(str), r1);
    }

    public static void A1T(AnonymousClass6KM r1, C230012om r2) {
        r2.A09(new AnonymousClass6KN(r1));
    }

    public static void A1U(Object obj, AbstractCollection abstractCollection, int i) {
        if ((i ^ 1) != 0) {
            abstractCollection.add(obj);
        }
    }

    public static void A1V(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C70953OTa(str, str2));
    }

    public static void A1W(AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new C70944OSr(z));
    }

    public static double A00(Object obj, int i) {
        0qQ.A0B(obj, i);
        return (double) System.currentTimeMillis();
    }

    public static int A01(Context context) {
        return context.getColor(2Yu.A08(context));
    }

    public static int A02(Context context) {
        return context.getColor(2Yu.A06(context));
    }

    public static int A03(Uri uri) {
        return uri.getPathSegments().size();
    }

    public static int A04(0lg r0) {
        return AnonymousClass0BO.A00(r0).BNv();
    }

    public static Resources A05(Fragment fragment) {
        return fragment.requireContext().getResources();
    }

    public static ColorFilter A06(Context context, int i) {
        return AnonymousClass37O.A00(context.getColor(i));
    }

    public static Uri A07(Context context, String str) {
        return 0cp.A03(SQU.A01(context, str));
    }

    public static Uri A08(Uri.Builder builder, String str, String str2) {
        return builder.appendQueryParameter(str, str2).build();
    }

    public static Bundle A0B(Object obj, int i) {
        0qQ.A0B(obj, i);
        return new Bundle();
    }

    public static LayoutInflater A0D(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static LayoutInflater A0E(Fragment fragment) {
        return LayoutInflater.from(fragment.requireContext());
    }

    public static ViewGroup A0F(C227812jx r0) {
        return r0.getScrollingViewProxy().CEd();
    }

    public static Window A0G(Fragment fragment) {
        return fragment.requireActivity().getWindow();
    }

    public static ComposeView A0H(AnonymousClass4DH r1, Object obj, int i) {
        return GTX.A00(r1, AnonymousClass5PI.A03(obj, i));
    }

    public static 0hq A0I(Fragment fragment) {
        return fragment.requireActivity().getSupportFragmentManager();
    }

    public static AnonymousClass0xx A0J(Fragment fragment) {
        return AnonymousClass07a.A00(fragment.getViewLifecycleOwner());
    }

    public static AnonymousClass9F7 A0O(UserSession userSession) {
        return AnonymousClass9F4.A00(AnonymousClass9F3.A00(userSession));
    }

    public static C277014uI A0R(List list, int i) {
        return C280064zw.A00(list.get(i));
    }

    public static AnonymousClass2tC A0S(Fragment fragment) {
        return AnonymousClass2t9.A00(fragment.requireContext());
    }

    public static C252063oV A0T(View view, int i, boolean z) {
        return 2b1.A01(view.requireViewById(i), z, z);
    }

    public static 1Xj A0U(UserSession userSession, String str) {
        return 1E7.A00(userSession).A02(str);
    }

    public static C331127Pr A0V(Bundle bundle, Fragment fragment, 0lg r2) {
        fragment.setArguments(bundle);
        return new C331127Pr(r2);
    }

    public static 2aV A0a(UserSession userSession) {
        return 2aN.A00(userSession).A01();
    }

    public static 0xY A0c(UserSession userSession, 2B1 r1) {
        return r1.A07(userSession).AR4();
    }

    public static C319986rY A0e(User user) {
        return C319976rX.A01(user.B6o());
    }

    public static AnonymousClass37D A0g(Fragment fragment, AnonymousClass37E r1) {
        return r1.A01(fragment.getActivity());
    }

    public static FollowStatus A0i(UserSession userSession, User user) {
        return AnonymousClass2f1.A00(userSession).A0N(user);
    }

    public static User A0j(UserSession userSession, String str) {
        return 17h.A00(userSession).A02(str);
    }

    public static Boolean A0m(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static Integer A0n(Context context, int i) {
        return Integer.valueOf(context.getColor(i));
    }

    public static Integer A0o(BaseBundle baseBundle, String str) {
        return Integer.valueOf(baseBundle.getInt(str));
    }

    public static Long A0p(0Aj r0, String str, String str2, int i) {
        r0.AAJ(str, str2);
        return Long.valueOf((long) i);
    }

    public static Long A0q(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public static Object A0r(User user, AbstractMap abstractMap) {
        return abstractMap.get(user.getId());
    }

    public static String A0s() {
        return String.valueOf(AnonymousClass0HN.A00());
    }

    public static String A0u(Context context, Object obj, Object obj2, int i) {
        return context.getString(i, new Object[]{obj, obj2});
    }

    public static String A0v(Resources resources, Object obj, int i, int i2) {
        return resources.getQuantityString(i, i2, new Object[]{obj});
    }

    public static String A0w(Resources resources, Object obj, Object obj2, int i) {
        return resources.getString(i, new Object[]{obj, obj2});
    }

    public static String A0x(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0y(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0z(Fragment fragment, Object obj, int i) {
        return fragment.getString(i, new Object[]{obj});
    }

    public static String A10(C276544tV r0, String str) {
        String A0D = r0.A0D();
        if (A0D != null) {
            return A0D;
        }
        return str;
    }

    public static String A11(C276544tV r0, String str, int i) {
        String A0K = r0.A0K(i);
        if (A0K != null) {
            return A0K;
        }
        return str;
    }

    public static String A12(CharSequence charSequence) {
        return 00l.A0B(charSequence).toString();
    }

    public static ArrayList A15(Object obj) {
        0qQ.A07(obj);
        return new ArrayList();
    }

    public static Iterator A16(Map map) {
        return map.keySet().iterator();
    }

    public static List A17(0lg r0) {
        return AnonymousClass0BO.A00(r0).BO0();
    }

    public static void A1M(1Ln r1, String str) {
        r1.A0l(str);
        r1.A0k("tap");
    }

    public static void A1N(1NY r1, Class cls, Class cls2) {
        r1.A0Q(cls, cls2);
        r1.A0R = true;
    }

    public static void A1S(C358248ab r1) {
        r1.A07 = !C61670oa.A01();
    }

    public static boolean A1X(Uri uri, String str) {
        return Boolean.parseBoolean(uri.getQueryParameter(str));
    }

    public static boolean A1Y(UserSession userSession) {
        return 1Au.A00(userSession).A21();
    }

    public static boolean A1Z(User user, Object obj) {
        return 0qQ.A0K(obj, user.getId());
    }

    public static boolean A1a(User user, Set set) {
        return set.contains(user.getId());
    }

    public static boolean A1b(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).matches();
    }
}

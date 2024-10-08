package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

public abstract class DbT {
    public static int A00(0xa r1, String str) {
        return r1.getInt(str, 0);
    }

    public static LayoutInflater A0B(Context context) {
        0qQ.A0B(context, 0);
        return LayoutInflater.from(context);
    }

    public static View A0C(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public static C229382nI A0M(Fragment fragment, 0lg r2) {
        return C229382nI.A03(fragment, r2, (2el) null);
    }

    public static C229382nI A0N(FragmentActivity fragmentActivity, AnonymousClass0iw r2, 0lg r3) {
        return C229382nI.A01((SparseArray) null, fragmentActivity, r2, r3);
    }

    public static void A1E(Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putBoolean(str, uri.getBooleanQueryParameter(str, false));
    }

    public static boolean A1X(BaseBundle baseBundle, String str) {
        return baseBundle.getBoolean(str, false);
    }

    public static boolean A1a(0xa r1, String str) {
        return r1.getBoolean(str, false);
    }

    public static Context A07(Object obj) {
        return ((Fragment) obj).getContext();
    }

    public static Context A08(Object obj) {
        return ((Fragment) obj).requireContext();
    }

    public static Bundle A0A(Intent intent) {
        return intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
    }

    public static FragmentActivity A0E(Object obj) {
        return ((Fragment) obj).requireActivity();
    }

    public static CoroutineLiveData A0G(AnonymousClass0r6 r1) {
        return C226292g8.A00(19B.A00, r1);
    }

    public static 1Ln A0J(C313756gx r0) {
        return 1Ln.A0E(r0.A03);
    }

    public static 2dZ A0K(Activity activity) {
        return 2dZ.A0t.A03(activity);
    }

    public static 0jh A0P(0lg r1) {
        return 0jh.A04.A01(r1);
    }

    public static 1OC A0U(1NY r0, boolean z) {
        r0.A0R = z;
        return r0.A0M();
    }

    public static AnonymousClass0wW A0W(Bundle bundle) {
        return 09i.A0A.A04(bundle);
    }

    public static AnonymousClass14B A0e() {
        return AnonymousClass14B.A03.A00();
    }

    public static 0tS A0h() {
        return 0tS.A4E.A00();
    }

    public static AnonymousClass37D A0i(Activity activity) {
        return AnonymousClass37D.A00.A01(activity);
    }

    public static User A0j(UserSession userSession) {
        return AnonymousClass0t1.A01.A01(userSession);
    }

    public static Boolean A0l(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static IllegalStateException A0m() {
        return new IllegalStateException("Check failed.");
    }

    public static IllegalStateException A0n() {
        return new IllegalStateException("Missing required params");
    }

    public static Object A0p(AnonymousClass6Tm r0, int i) {
        return r0.A00.get(i);
    }

    public static Object A0r(Object obj) {
        return ((C62320sa) obj).invoke();
    }

    public static String A0s(Context context) {
        return 0qv.A02.A05(context);
    }

    public static String A0v(Uri uri) {
        return uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static String A0x(1Xj r0) {
        return r0.A0C.getLoggingInfoToken();
    }

    public static String A0y(DirectShareTarget directShareTarget) {
        String str = directShareTarget.A0I;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0z(CharSequence charSequence, Iterable iterable, 0sP r3) {
        return 00k.A0P(charSequence, "", "", iterable, r3);
    }

    public static List A14(DirectShareTarget directShareTarget) {
        return Collections.unmodifiableList(directShareTarget.A0Q);
    }

    public static void A1O(0Aj r2) {
        r2.AAJ("module", "waterfall_log_in");
    }

    public static void A1P(0Aj r2) {
        r2.AAJ("containermodule", "waterfall_log_in");
    }

    public static boolean A1Y(0Ak r0) {
        return r0.A00.isSampled();
    }

    public static int A01(List list, int i) {
        return i + list.size();
    }

    public static int A02(List list, int i) {
        return list.size() - i;
    }

    public static Activity A03(AnonymousClass4DH r0) {
        Activity rootActivity = r0.getRootActivity();
        0qQ.A0A(rootActivity);
        return rootActivity;
    }

    public static Context A04() {
        return C64361Kj.A00().A00;
    }

    public static Context A05(Context context) {
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        return applicationContext;
    }

    public static Context A06(Fragment fragment, Object obj, int i) {
        0qQ.A0B(obj, i);
        return fragment.requireContext();
    }

    public static Uri A09(String str) {
        Uri A03 = 0cp.A03(str);
        0qQ.A07(A03);
        return A03;
    }

    public static View A0D(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        0qQ.A07(inflate);
        return inflate;
    }

    public static 0hq A0F(FragmentActivity fragmentActivity) {
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        return supportFragmentManager;
    }

    public static 2Fk A0H(AnonymousClass0eM r0) {
        return (2Fk) r0.getValue();
    }

    public static RecyclerView A0I(View view, int i) {
        return (RecyclerView) view.requireViewById(i);
    }

    public static AnonymousClass1XT A0L(C268654dm r0) {
        return (AnonymousClass1XT) r0.A00();
    }

    public static AnonymousClass0iw A0O(AnonymousClass0eM r0) {
        return (AnonymousClass0iw) r0.getValue();
    }

    public static 0wc A0Q(AnonymousClass0iw r0, 0lg r1, int i) {
        0qQ.A0B(r1, i);
        return AnonymousClass0kN.A01(r0, r1);
    }

    public static 1OC A0R(15p r0, 1NY r1, Class cls, Class cls2, boolean z) {
        r1.A0O(r0, cls, cls2, z);
        return r1.A0M();
    }

    public static 1OC A0S(1NY r0, Class cls, Class cls2) {
        r0.A0R(cls, cls2);
        return r0.A0M();
    }

    public static 1OC A0T(1NY r0, String str, String str2) {
        r0.A9m(str, str2);
        return r0.A0M();
    }

    public static AnonymousClass6Tm A0V(C308276Tl r0, Object obj) {
        r0.A02(obj);
        return r0.A00();
    }

    public static 0lg A0X(AnonymousClass0eM r0) {
        return (0lg) r0.getValue();
    }

    public static UserSession A0Y(C307896Rx r0) {
        return C308206Td.A0B(r0);
    }

    public static UserSession A0Z(C307896Rx r0) {
        return C308206Td.A0B(r0);
    }

    public static IgTextView A0a(View view, int i) {
        return view.requireViewById(i);
    }

    public static IgImageView A0b(View view, int i) {
        return view.requireViewById(i);
    }

    public static IgdsBottomButtonLayout A0c(View view, int i) {
        return (IgdsBottomButtonLayout) view.requireViewById(i);
    }

    public static IgFormField A0d(View view, int i) {
        return (IgFormField) view.requireViewById(i);
    }

    public static DirectShareTarget A0f(Iterator it) {
        return (DirectShareTarget) it.next();
    }

    public static 0xa A0g(C62880wX r0) {
        return AnonymousClass0xl.A00(r0).A00;
    }

    public static User A0k(Iterator it) {
        return (User) it.next();
    }

    public static Object A0o(View view) {
        Object tag = view.getTag();
        tag.getClass();
        return tag;
    }

    public static Object A0q(AnonymousClass6Tm r0, String str, int i) {
        Object A03 = r0.A03(i);
        0qQ.A0C(A03, str);
        return A03;
    }

    public static String A0t(Context context, 1Fa r1, String str) {
        r1.A0A(str);
        return 0qv.A00(context);
    }

    public static String A0u(Context context, 1Fa r1, String str, String str2) {
        r1.A9m(str, str2);
        return 0qv.A00(context);
    }

    public static String A0w(BaseBundle baseBundle, String str, String str2) {
        String string = baseBundle.getString(str, str2);
        0qQ.A07(string);
        return string;
    }

    public static String A10(Object obj) {
        String obj2 = obj.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public static String A11(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A12(Locale locale, String str) {
        String lowerCase = str.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return lowerCase;
    }

    public static String A13(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static void A15() {
        AnonymousClass35B.A00().A01();
    }

    public static void A16(Context context, View view, int i) {
        view.setBackgroundColor(context.getColor(i));
    }

    public static void A17(Context context, TextView textView, int i) {
        textView.setTextColor(context.getColor(i));
    }

    public static void A18(Context context, TextView textView, int i) {
        textView.setText(context.getString(i));
    }

    public static void A19(Context context, C358248ab r1, int i) {
        r1.A05 = context.getString(i);
    }

    public static void A1A(Resources resources, View view, int i) {
        view.setContentDescription(resources.getString(i));
    }

    public static void A1B(Resources resources, ViewGroup.LayoutParams layoutParams, int i) {
        layoutParams.height = resources.getDimensionPixelSize(i);
    }

    public static void A1C(Resources resources, C331127Pr r1, int i) {
        r1.A0d = resources.getString(i);
    }

    public static void A1D(Resources resources, C310336ap r1, int i) {
        r1.A0D = resources.getString(i);
    }

    public static void A1F(View view, int i, int i2) {
        view.requireViewById(i).setVisibility(i2);
    }

    public static void A1G(View view, UserSession userSession, User user) {
        C267154b3.A02(view, userSession, user.getId());
    }

    public static void A1H(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A1I(Fragment fragment) {
        fragment.getParentFragmentManager().A0c();
    }

    public static void A1J(Fragment fragment) {
        fragment.requireActivity().onBackPressed();
    }

    public static void A1K(Fragment fragment) {
        fragment.requireActivity().finish();
    }

    public static void A1L(Fragment fragment, AnonymousClass6W8 r1) {
        r1.A0C(fragment.requireActivity());
    }

    public static void A1M(Fragment fragment, AnonymousClass6W8 r1) {
        r1.A0C(fragment.getActivity());
    }

    public static void A1N(Fragment fragment, 0eP[] r2) {
        fragment.setArguments(Q21.A00(r2));
    }

    public static void A1Q(0wj r0, String str, int i) {
        r0.AEf(str, i).report();
    }

    public static void A1R(C307786Rm r1, C276544tV r2, C308276Tl r3, C277014uI r4) {
        C307886Rw.A03(r1, r2, r3.A00(), r4);
    }

    public static void A1S(UserSession userSession, User user) {
        17h.A00(userSession).A03(user);
    }

    public static void A1T(UserSession userSession, Integer num, String str, long j) {
        2Ci.A08(userSession, num, Long.valueOf(j), str);
    }

    public static void A1U(IgdsBanner igdsBanner, CharSequence charSequence, boolean z) {
        igdsBanner.setBody(charSequence, Boolean.valueOf(z));
    }

    public static void A1V(C358248ab r0) {
        AnonymousClass0fN.A00(r0.A02());
    }

    public static void A1W(Iterator it, JSONArray jSONArray) {
        jSONArray.put(it.next());
    }

    public static boolean A1Z(IgFragmentActivity igFragmentActivity) {
        return igFragmentActivity.getSession() instanceof UserSession;
    }

    public static boolean A1b(AbstractCollection abstractCollection) {
        return !abstractCollection.isEmpty();
    }
}

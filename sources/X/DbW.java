package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class DbW {
    public static int A00(int i) {
        return i != 0 ? 8 : 0;
    }

    public static 1OC A0K(1NY r1) {
        r1.A0R = true;
        return r1.A0M();
    }

    public static Object A0e(AnonymousClass6Tm r2) {
        return r2.A00.get(0);
    }

    public static void A0r(DialogInterface dialogInterface) {
        0qQ.A0B(dialogInterface, 0);
        dialogInterface.dismiss();
    }

    public static void A0u(Paint paint) {
        0qQ.A0B(paint, 0);
        paint.setUnderlineText(false);
    }

    public static void A0y(Bundle bundle, Fragment fragment, C309516Yo r3) {
        fragment.setArguments(bundle);
        r3.A0B((Bundle) null, fragment);
        r3.A04();
    }

    public static void A10(0Aj r2) {
        r2.A7p("is_internal_build", false);
    }

    public static void A1I(C232672uC r1) {
        0qQ.A0B(r1, 0);
        r1.A7U(0);
    }

    public static void A1L(0xY r1, String str) {
        r1.E5T(str, true);
        r1.apply();
    }

    public static boolean A1S(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, i);
        return false;
    }

    public static boolean A1X(Object obj) {
        0qQ.A0B(obj, 1);
        return false;
    }

    public static boolean A1Y(Object obj) {
        0qQ.A0B(obj, 2);
        return true;
    }

    public static boolean A1Z(Object obj) {
        0qQ.A0B(obj, 3);
        return true;
    }

    public static boolean A1a(Object obj) {
        return obj == null;
    }

    public static int A01(int i) {
        return i != 0 ? 0 : 8;
    }

    public static long A05(UserSession userSession) {
        return new 2Cd(userSession).A01();
    }

    public static long A06(0xa r2, String str) {
        return r2.getLong(str, 0);
    }

    public static 0bY A0G() {
        return new 1Q7("IgSecureUriParser").A00;
    }

    public static 0wc A0J(0lg r1, String str) {
        return AnonymousClass0kN.A01(new 0xG(str), r1);
    }

    public static C276544tV A0M(AnonymousClass6Tm r0, int i) {
        return (C276544tV) r0.A00.get(i);
    }

    public static C331157Pu A0T(0lg r1) {
        return new C331127Pr(r1).A00();
    }

    public static AnonymousClass6W8 A0W(Activity activity, Bundle bundle, 0lg r4, Class cls, String str) {
        AnonymousClass6W8 r1 = new AnonymousClass6W8(activity, bundle, r4, cls, str);
        r1.A0J = ModalActivity.A08;
        return r1;
    }

    public static String A0i(AnonymousClass6Tm r0, int i) {
        return (String) r0.A00.get(i);
    }

    public static List A0m(DirectShareTarget directShareTarget) {
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static List A0n(User user) {
        return Collections.singletonList(new PendingRecipient(user));
    }

    public static List A0o(CharSequence charSequence, String str) {
        return new 11S(str).A03(charSequence);
    }

    public static AnonymousClass0eM A0p(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73661Pha(obj, i));
    }

    public static void A17(1Ln r2, C313756gx r3) {
        r2.A0h(Long.valueOf(r3.A02));
    }

    public static void A18(AnonymousClass0Jz r1, 2IS r2, String str) {
        r2.A00.A02().A0E(r1, str);
    }

    public static void A1D(1NY r4) {
        r4.A0O(0aS.A00, EM4.class, FCB.class, false);
    }

    public static void A1H(C232672uC r1) {
        if (r1 != null) {
            r1.A7U(0);
        }
    }

    public static void A1K(C331157Pu r1) {
        if (r1 != null) {
            r1.A0L((C332277Ui) null);
        }
    }

    public static 0eP[] A1b(Object obj, Object obj2) {
        return new 0eP[]{new 0eP(obj, obj2)};
    }

    public static int A02(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 2);
        return 2;
    }

    public static int A03(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 3);
        return 3;
    }

    public static int A04(Object obj, String str) {
        0qQ.A0C(obj, str);
        return ((Number) obj).intValue();
    }

    public static Uri.Builder A07(String str) {
        return 0cp.A03(str).buildUpon();
    }

    public static SpannableStringBuilder A08(Context context, int i) {
        return new SpannableStringBuilder(context.getString(i));
    }

    public static View A09(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return inflate;
    }

    public static ViewGroup.MarginLayoutParams A0A(View view, String str) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, str);
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static TextView A0B(View view, int i) {
        View findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        return (TextView) findViewById;
    }

    public static 0s1 A0C(Fragment fragment) {
        return new 0s1(fragment.getChildFragmentManager());
    }

    public static 0s1 A0D(FragmentActivity fragmentActivity) {
        return new 0s1(fragmentActivity.getSupportFragmentManager());
    }

    public static AnonymousClass0xx A0E(AnonymousClass07Z r0) {
        return C71772f0.A00(r0.getLifecycle());
    }

    public static 2YN A0F(Fragment fragment) {
        return new 2YN(fragment.requireActivity());
    }

    public static C309516Yo A0H(Fragment fragment, 0lg r2) {
        return new C309516Yo(fragment.requireActivity(), r2);
    }

    public static 0jh A0I(1Fa r0, 0lg r1, String str, String str2) {
        r0.A9m(str, str2);
        return 0jh.A04.A01(r1);
    }

    public static 1OC A0L(1NY r0, Class cls, Class cls2, boolean z) {
        r0.A0Q(cls, cls2);
        r0.A0R = z;
        return r0.A0M();
    }

    public static C277014uI A0N(AnonymousClass6Tm r0) {
        return ((C280064zw) r0.A02()).A00;
    }

    public static C277014uI A0O(AnonymousClass6Tm r0) {
        return ((C280064zw) r0.A00()).A00;
    }

    public static C277014uI A0P(AnonymousClass6Tm r0, int i) {
        return ((C280064zw) r0.A03(i)).A00;
    }

    public static C228602lw A0Q(Context context, AnonymousClass07Z r3) {
        return new C228602lw(context, AnonymousClass07i.A00(r3));
    }

    public static 0lg A0R(C307896Rx r1) {
        0lg A0B = C308206Td.A0B(r1);
        0qQ.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        return A0B;
    }

    public static UserSession A0S(AnonymousClass0eM r0, int i) {
        UserSession userSession = (UserSession) r0.getValue();
        0qQ.A0B(userSession, i);
        return userSession;
    }

    public static C358248ab A0U(Fragment fragment) {
        return new C358248ab(fragment.requireContext());
    }

    public static C358248ab A0V(Fragment fragment) {
        return new C358248ab((Activity) fragment.getActivity());
    }

    public static C49721F3j A0X() {
        return AnonymousClass35B.A00().A01();
    }

    public static AnonymousClass6ST A0Y(Fragment fragment) {
        return new AnonymousClass6ST(fragment.requireContext());
    }

    public static Float A0Z(0Tu r0, 0lg r1, long j) {
        return Float.valueOf((float) 182.A00(r0, r1, j));
    }

    public static IllegalArgumentException A0a(String str, int i) {
        return new IllegalArgumentException(002.A0O(str, i));
    }

    public static IllegalStateException A0b(String str, int i) {
        return new IllegalStateException(002.A0O(str, i));
    }

    public static IllegalStateException A0c(String str, String str2) {
        return new IllegalStateException(002.A0R(str, str2));
    }

    public static Object A0d(AnonymousClass6Tm r1) {
        Object A02 = r1.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        return A02;
    }

    public static Object A0f(AnonymousClass6Tm r1) {
        Object A01 = r1.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        return A01;
    }

    public static Object A0g(AnonymousClass6Tm r0, int i) {
        Object A03 = r0.A03(i);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        return A03;
    }

    public static String A0h(Context context, Object obj, int i) {
        return context.getString(i, new Object[]{obj});
    }

    public static String A0j(AnonymousClass6Tm r0, String str) {
        Object A00 = r0.A00();
        0qQ.A0C(A00, str);
        return (String) A00;
    }

    public static String A0k(AnonymousClass6Tm r0, String str) {
        Object A02 = r0.A02();
        0qQ.A0C(A02, str);
        return (String) A02;
    }

    public static String A0l(AnonymousClass0eM r0) {
        String str = (String) r0.getValue();
        0qQ.A07(str);
        return str;
    }

    public static void A0q(Context context, C310336ap r1, int i) {
        String string = context.getString(i);
        0qQ.A07(string);
        r1.A0G = string;
    }

    public static void A0s(Intent intent, 0lg r3) {
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
    }

    public static void A0t(Resources resources, C310336ap r2) {
        r2.A02 = resources.getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
    }

    public static void A0v(Uri uri, BaseBundle baseBundle) {
        baseBundle.putString("screen", uri.getHost());
    }

    public static void A0w(BaseBundle baseBundle, 0lg r3) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
    }

    public static void A0x(Bundle bundle, Fragment fragment, C309516Yo r2) {
        fragment.setArguments(bundle);
        r2.A0D(fragment);
        r2.A04();
    }

    public static void A0z(2Rw r0, Collection collection, List list) {
        list.clear();
        list.addAll(collection);
        r0.notifyDataSetChanged();
    }

    public static void A11(0Aj r2) {
        r2.AAJ("waterfall_id", 1Q0.A01());
    }

    public static void A12(0Aj r2, double d) {
        r2.A8D(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A13(0Aj r2, double d) {
        r2.A8D("current_time", Double.valueOf(d));
    }

    public static void A14(0Aj r2, long j) {
        r2.A9F("current_time", Long.valueOf(j));
    }

    public static void A15(0Aj r2, AnonymousClass0iw r3) {
        r2.AAJ("module", r3.getModuleName());
    }

    public static void A16(0Aj r2, AnonymousClass0iw r3) {
        r2.AAJ("containermodule", r3.getModuleName());
    }

    public static void A19(19f r1, 1Fa r2, 0jh r3) {
        r2.A9m("phone_id", r3.A02(r1));
    }

    public static void A1A(19f r1, 1Fa r2, 0jh r3) {
        r2.A0G("phone_id", r3.A02(r1));
    }

    public static void A1B(2da r1, int i) {
        r1.Eom(i);
        r1.Eu4(true);
    }

    public static void A1C(2da r1, String str) {
        r1.setTitle(str);
        r1.Eu4(true);
    }

    public static void A1E(1NY r0, 1P0 r1, AnonymousClass4D6 r2) {
        1OC A0M = r0.A0M();
        A0M.A00 = r1;
        r2.schedule(A0M);
    }

    public static void A1F(1Fa r2) {
        r2.A9m("waterfall_id", 1Q0.A01());
    }

    public static void A1G(1Fa r2, Object obj) {
        r2.A9m("google_tokens", obj.toString());
    }

    public static void A1J(AnonymousClass0iw r0, SUL sul) {
        sul.A0S = r0.getModuleName();
        sul.A0A();
    }

    public static void A1M(AnonymousClass3UM r0, AnonymousClass6KM r1) {
        String CDC = r0.CDC();
        if (CDC != null) {
            r1.A07 = CDC;
        }
    }

    public static void A1N(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 5);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 6);
    }

    public static void A1P(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 12);
    }

    public static void A1Q(Object obj, AbstractMap abstractMap) {
        abstractMap.put("params", obj.toString());
    }

    public static void A1R(AnonymousClass0eM r0, int i) {
        ((View) r0.getValue()).setVisibility(i);
    }

    public static boolean A1W(AnonymousClass6Tm r0, int i) {
        return Q0A.A01(r0.A03(i));
    }

    public static boolean A1T(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36318234865637399L);
    }

    public static boolean A1U(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36328624390946279L);
    }

    public static boolean A1V(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36328624391011816L);
    }
}

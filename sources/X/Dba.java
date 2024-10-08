package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Dba {
    public static SUL A0J(Context context, UserSession userSession, 2EG r8, String str) {
        return new SUL(context, userSession, r8, str, false);
    }

    public static Object A0U(Fragment fragment, C309516Yo r2) {
        r2.A0B((Bundle) null, fragment);
        r2.A04();
        return null;
    }

    public static String A0d(List list) {
        return (String) list.get(3);
    }

    public static void A0j(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, i);
    }

    public static void A0k(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A0r(Context context, CharSequence charSequence) {
        C59689JTv.A03(context, charSequence, (String) null, 1);
    }

    public static void A0x(SpannableStringBuilder spannableStringBuilder, Object obj) {
        spannableStringBuilder.setSpan(obj, 0, spannableStringBuilder.length(), 18);
    }

    public static void A0z(View view, 2el r3, AnonymousClass4DQ r4) {
        r3.A08(view, AnonymousClass3DZ.A00(r4), new AnonymousClass2eo[0]);
    }

    public static void A13(Fragment fragment, C309516Yo r2) {
        r2.A0B((Bundle) null, fragment);
        r2.A04();
    }

    public static void A18(0Aj r2) {
        r2.A7p("is_test_user", false);
    }

    public static void A1G(2da r1) {
        0qQ.A0B(r1, 0);
        r1.Etr(false);
    }

    public static void A1K(AnonymousClass4DJ r1, C358248ab r2) {
        0qQ.A0B(r2, 0);
        r2.A0m(r1);
    }

    public static void A1M(C358248ab r1) {
        r1.A0r(true);
        r1.A0s(true);
    }

    public static void A1S(Object obj, C262224Cq r3, int i, boolean z) {
        1Eo.A05(19B.A00, new JV6(obj, (AnonymousClass4D7) null, i, z), r3);
    }

    public static boolean A1U(int i) {
        return i <= 0;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        return obj2.equals(obj);
    }

    public static AccountFamily A09(AnonymousClass9BG r0, UserSession userSession) {
        return (AccountFamily) r0.A02.get(userSession.A06);
    }

    public static C309516Yo A0B(FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r3);
        r1.A0D = false;
        return r1;
    }

    public static FRU A0C(Object obj) {
        return (FRU) ((BusinessConversionActivity) obj).A09.getValue();
    }

    public static AnonymousClass6W8 A0K(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity, bundle, r3, cls, str);
        r0.A07();
        return r0;
    }

    public static SimpleWebViewConfig A0N(String str) {
        return new SimpleWebViewConfig(new C11225SFz(str));
    }

    public static User A0P(E3D e3d) {
        return AnonymousClass0t1.A01.A01(e3d.A0H());
    }

    public static F10 A0Q(AnonymousClass3FW r2) {
        return r2.A03(0);
    }

    public static File A0T(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        return file;
    }

    public static String A0X(Fragment fragment) {
        return 0qv.A02.A05(fragment.getContext());
    }

    public static String A0a(CategorySearchFragment categorySearchFragment) {
        if (categorySearchFragment.A0G) {
            return "change_category";
        }
        return "choose_category";
    }

    public static String A0b(0lg r1, String str) {
        return new C18559VuB(r1).A00(str);
    }

    public static String A0c(String str, int i, int i2) {
        return str.subSequence(i2, i + 1).toString();
    }

    public static HashMap A0f(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }

    public static AnonymousClass0eM A0g(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C73656PhV(obj, i));
    }

    public static 0t0 A0h(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20606Wvn(obj, i));
    }

    public static 0t0 A0i(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58180Ink(obj, i));
    }

    public static void A0l(Activity activity, Bundle bundle, 0lg r3, String str) {
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, bundle, r3, TransparentModalActivity.class, str);
        A02.A07();
        A02.A0C(activity);
    }

    public static void A0q(Context context, 0lg r2, C11225SFz sFz, String str) {
        sFz.A02 = str;
        SimpleWebViewActivity.A00(context, r2, new SimpleWebViewConfig(sFz));
    }

    public static void A0v(BaseBundle baseBundle, String str, String str2) {
        baseBundle.putString("args_entry_point", str);
        baseBundle.putString("args_session_id", str2);
    }

    public static void A10(TextView textView) {
        textView.setTransformationMethod(new PasswordTransformationMethod());
    }

    public static void A15(AnonymousClass07Z r1, 2Fk r2, 0sP r3, int i) {
        r2.A06(r1, new LZt(i, r3));
    }

    public static void A16(AnonymousClass07Z r1, 2Fk r2, 0sP r3, int i) {
        r2.A06(r1, new C64319LZu(i, r3));
    }

    public static void A19(0Aj r1, String str) {
        r1.AAJ("version", str);
        r1.Cgf();
    }

    public static void A1A(0Aj r1, String str, String str2) {
        r1.AAJ("partner_name", str);
        r1.AAJ("url", str2);
    }

    public static void A1C(1Ln r1, C313756gx r2) {
        r1.A0v(r2.A01);
        r1.Cgf();
    }

    public static void A1F(ImmutableList.Builder builder, ConversionStep conversionStep) {
        builder.add(new BusinessConversionStep(C48092EVk.NEXT, conversionStep));
    }

    public static void A1I(0wc r1, String str) {
        r1.A00(r1.A00, str).Cgf();
    }

    public static void A1J(1Ng r1, boolean z) {
        r1.A00(new 2D0(z));
    }

    public static void A1N(C51950G8t g8t) {
        if (g8t != null) {
            g8t.Cm0(0);
        }
    }

    public static void A1O(C51950G8t g8t) {
        if (g8t != null) {
            g8t.Cm0(1);
        }
    }

    public static void A1P(Object obj) {
        ((BusinessConversionActivity) obj).Clz((Bundle) null);
    }

    public static void A1Q(Object obj) {
        ((Fragment) obj).requireActivity().onBackPressed();
    }

    public static void A1R(Object obj) {
        ((BusinessConversionActivity) obj).EJN((Bundle) null);
    }

    public static void A1T(String str, String str2, Throwable th) {
        if (th != null) {
            0wb.A06(str, str2, th);
        } else {
            0wb.A03(str, str2);
        }
    }

    public static boolean A1W(TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment) {
        return 2B0.A01.A0E(timeSpentReminderFullyBlockingFragment.A01);
    }

    public static int A00(AnonymousClass0eM r0) {
        return ((IGRevShareProductType) r0.getValue()).ordinal();
    }

    public static long A01(UserSession userSession) {
        return 2Aq.A03(userSession).A0P();
    }

    public static long A02(2Aq r2, Object obj) {
        long A0P = r2.A0P();
        0qQ.A0B(obj, 0);
        return A0P;
    }

    public static Parcelable A03(Fragment fragment) {
        return fragment.requireArguments().getParcelable("RegFlowExtras.EXTRA_KEY");
    }

    public static ViewGroup A04(View view) {
        return (ViewGroup) view.findViewById(R.id.content_container);
    }

    public static TextView A05(View view) {
        return (TextView) view.requireViewById(R.id.subtitle);
    }

    public static TextView A06(View view) {
        return (TextView) view.requireViewById(R.id.title);
    }

    public static TextView A07(View view, int i) {
        View findViewById = view.findViewById(i);
        findViewById.getClass();
        return (TextView) findViewById;
    }

    public static FragmentActivity A08(C307896Rx r0) {
        return C308206Td.A03(C308206Td.A09(r0));
    }

    public static 2dZ A0A(Fragment fragment) {
        return 2dZ.A0t.A03(fragment.getActivity());
    }

    public static AnonymousClass0aP A0D(Fragment fragment) {
        return 09i.A0A.A02(fragment.requireArguments());
    }

    public static IgTextView A0E(View view, int i) {
        IgTextView findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        return findViewById;
    }

    public static W3Q A0F(Fragment fragment) {
        return fragment.requireParentFragment().A0F;
    }

    public static 1vn A0G(AnonymousClass0eM r0) {
        return 1vm.A01((UserSession) r0.getValue());
    }

    public static C358248ab A0H(Fragment fragment) {
        return new C358248ab((Activity) fragment.requireActivity());
    }

    public static C358248ab A0I(Fragment fragment) {
        return new C358248ab(fragment.getContext());
    }

    public static Reel A0L(UserSession userSession, String str) {
        return 1OP.A05(userSession).A0M(str);
    }

    public static NotificationBar A0M(View view) {
        return (NotificationBar) view.findViewById(R.id.notification_bar);
    }

    public static ProgressButton A0O(View view) {
        return (ProgressButton) view.requireViewById(R.id.next_button);
    }

    public static AnonymousClass3FW A0R(E3D e3d) {
        return new AnonymousClass3FW(e3d.A0H());
    }

    public static C239793Ih A0S(Object obj, 05G r1) {
        r1.Epw(obj);
        return new C239793Ih(C60340gF.A00);
    }

    public static Object A0V(AnonymousClass6Tm r0, int i) {
        Object A03 = r0.A03(i);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        return A03;
    }

    public static Object A0W(AnonymousClass0eM r0) {
        return ((2Fk) r0.getValue()).A02();
    }

    public static String A0Y(Fragment fragment, C266444Yx r1) {
        return C66909Mes.A01(fragment, r1).toString();
    }

    public static ArrayList A0e(Map map) {
        return new ArrayList(map.values());
    }

    public static void A0m(Activity activity, 2dY r1) {
        r1.A03(activity).setIsLoading(false);
    }

    public static void A0n(Activity activity, 2dY r1) {
        r1.A03(activity).setIsLoading(true);
    }

    public static void A0o(Context context, Intent intent, Uri.Builder builder) {
        intent.setData(builder.build());
        0kR.A0B(context, intent);
    }

    public static void A0p(Context context, ImageView imageView) {
        C49948FGd.A01(imageView, 2Yu.A0H(context, R.attr.glyphColorPrimary));
    }

    public static void A0s(Context context, String str, StringBuilder sb, int i) {
        sb.append(context.getString(i));
        sb.append(str);
    }

    public static void A0t(DialogInterface.OnClickListener onClickListener, C358248ab r1, int i) {
        r1.A0I(onClickListener, i);
        AnonymousClass0fN.A00(r1.A02());
    }

    public static void A0u(Uri uri, String str, AbstractMap abstractMap) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            abstractMap.put(str, queryParameter);
        }
    }

    public static void A0w(Bundle bundle, Fragment fragment, C309516Yo r2) {
        r2.A0B(bundle, fragment);
        r2.A0F = true;
        r2.A04();
    }

    public static void A0y(View view, View view2, View view3, int i, int i2) {
        view.setVisibility(i);
        view2.setVisibility(i2);
        view3.setVisibility(i2);
    }

    public static void A11(Fragment fragment) {
        fragment.requireActivity().setResult(-1);
    }

    public static void A12(Fragment fragment, C309516Yo r1) {
        r1.A0D(fragment);
        r1.A0F = true;
        r1.A04();
    }

    public static void A14(Fragment fragment, IgdsListCell igdsListCell, int i) {
        String string = fragment.getString(i);
        0qQ.A07(string);
        igdsListCell.A0I(string);
    }

    public static void A17(RecyclerView recyclerView, AnonymousClass0eM r2) {
        recyclerView.setAdapter((2Rw) r2.getValue());
    }

    public static void A1B(0Aj r2, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("action", "tap");
    }

    public static void A1D(1Ln r1, String str) {
        r1.A0l(str);
        r1.A0k("view");
    }

    public static void A1E(1Ln r1, String str) {
        r1.A0q(str);
        r1.A0o("instagram");
    }

    public static void A1H(1NY r2, String str) {
        r2.A0A(str);
        r2.A0Q(1XP.class, 1XY.class);
    }

    public static void A1L(C358248ab r0) {
        r0.A06();
        AnonymousClass0fN.A00(r0.A02());
    }

    public static boolean A1V(TextView textView) {
        return TextUtils.isEmpty(0nA.A0I(textView));
    }

    public static boolean A1X(Object obj, Object obj2) {
        return 0qQ.A0K(obj2, obj.toString());
    }

    public static boolean A1Z(Object obj, Object obj2, AbstractMap abstractMap, BitSet bitSet) {
        abstractMap.put(obj, obj2);
        bitSet.set(0);
        return false;
    }

    public static boolean A1a(AnonymousClass0eM r0) {
        return ((C314336i2) r0.getValue()).A06();
    }

    public static boolean A1b(AnonymousClass0eM r0) {
        return ((C314336i2) r0.getValue()).A07();
    }

    public static String A0Z(0Tu r2) {
        return 1AW.A04(r2, 18867207216300418L);
    }
}

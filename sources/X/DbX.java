package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public abstract class DbX {
    public static LayoutInflater A0E(View view) {
        0qQ.A0B(view, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return LayoutInflater.from(view.getContext());
    }

    public static 0wc A0O(AnonymousClass0iw r1, 0lg r2) {
        0qQ.A0B(r2, 0);
        return AnonymousClass0kN.A01(r1, r2);
    }

    public static 0wc A0Q(0lg r1) {
        0qQ.A0B(r1, 0);
        return AnonymousClass0kN.A02(r1);
    }

    public static HashMap A0v() {
        HashMap hashMap = new HashMap();
        new BitSet(0);
        return hashMap;
    }

    public static List A0x(CharSequence charSequence) {
        return 00l.A0R(charSequence, new String[]{","}, 0);
    }

    public static void A1W(Object obj, String str, C262224Cq r4, int i) {
        1Eo.A05(19B.A00, new MFV(obj, str, (AnonymousClass4D7) null, i), r4);
    }

    public static void A1X(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MG3(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static boolean A1a(Object obj) {
        return 0qQ.A0K(obj, true);
    }

    public static int A01(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A02(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public static int A05(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static Intent A08(Context context) {
        return AnonymousClass14B.A03.A00().A01(context);
    }

    public static Bundle A0B(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        return bundle;
    }

    public static Bundle A0C(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        return bundle;
    }

    public static Bundle A0D(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TEXT", str);
        return bundle;
    }

    public static C268194cw A0L(C252503pD r2, C269474fB r3) {
        C268194cw r1 = new C268194cw(r3);
        r1.A0B(r2, "server_params");
        return r1;
    }

    public static AnonymousClass3JR A0M() {
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A01 = R.drawable.instagram_x_pano_outline_24;
        return r1;
    }

    public static C277014uI A0S(AnonymousClass6Tm r0, int i) {
        return C280064zw.A00(r0.A00.get(i));
    }

    public static UserSession A0V(Fragment fragment) {
        return 09i.A0A.A06(fragment.requireArguments());
    }

    public static ImageUrl A0X(UserSession userSession) {
        return AnonymousClass0t1.A01.A01(userSession).Bh3();
    }

    public static C331127Pr A0e(0lg r2, boolean z) {
        C331127Pr r1 = new C331127Pr(r2);
        r1.A0a = Boolean.valueOf(z);
        return r1;
    }

    public static C358248ab A0g(Context context, CharSequence charSequence, String str) {
        C358248ab r0 = new C358248ab(context);
        r0.A05 = str;
        r0.A0q(charSequence);
        return r0;
    }

    public static AnonymousClass37D A0i(Fragment fragment) {
        return AnonymousClass37D.A00.A01(fragment.requireActivity());
    }

    public static String A0q(UserSession userSession) {
        return AnonymousClass0t1.A01.A01(userSession).getUsername();
    }

    public static String A0r(User user) {
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    public static String A0t(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static HashMap A0w(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", obj);
        return hashMap;
    }

    public static void A19(View.OnClickListener onClickListener, AnonymousClass3JR r1, 2da r2) {
        r1.A0G = onClickListener;
        r2.AA3(new AnonymousClass3Jb(r1));
    }

    public static void A1A(View.OnClickListener onClickListener, AnonymousClass3JR r1, 2da r2) {
        r1.A0G = onClickListener;
        r2.ErG(new AnonymousClass3Jb(r1));
    }

    public static void A1K(AnonymousClass0Ac r1, 0Aj r2, String str) {
        r2.AAJ("nav_chain", str);
        r2.A8M(r1, "invite_location");
    }

    public static void A1L(0Aj r2) {
        r2.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
        r2.Cgf();
    }

    public static void A1Q(1Xj r1, int i) {
        r1.A00 = i;
        r1.A0C.EUA(Integer.valueOf(i));
    }

    public static void A1R(Dc2 dc2) {
        1xC.A01.A00(new AnonymousClass3GR(dc2));
    }

    public static void A1S(Dc2 dc2) {
        1xC.A01.A00(new AnonymousClass3GP(dc2));
    }

    public static float A00(Context context) {
        return context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static int A03(Object obj, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        0qQ.A0B(obj, 0);
        return A05;
    }

    public static int A04(Object obj, int i) {
        int A03 = AnonymousClass0fD.A03(i);
        0qQ.A0B(obj, 1);
        return A03;
    }

    public static int A06(ListIterator listIterator) {
        return ((String) listIterator.previous()).length();
    }

    public static int A07(AnonymousClass0eM r0) {
        return ((Number) r0.getValue()).intValue();
    }

    public static Intent A09(String str) {
        return new Intent("android.intent.action.VIEW", 0cp.A03(str));
    }

    public static Bundle A0A(Activity activity) {
        return activity.getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
    }

    public static LayoutInflater A0F(View view, int i) {
        0qQ.A0B(view, i);
        return LayoutInflater.from(view.getContext());
    }

    public static ViewGroup.MarginLayoutParams A0G(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static ViewGroup.MarginLayoutParams A0H(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static ViewGroup A0I(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (ViewGroup) requireViewById;
    }

    public static ImageView A0J(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (ImageView) requireViewById;
    }

    public static RecyclerView A0K(View view) {
        return (RecyclerView) view.requireViewById(R.id.recycler_view);
    }

    public static C309516Yo A0N(FragmentActivity fragmentActivity, AnonymousClass0eM r3) {
        return new C309516Yo(fragmentActivity, (0lg) r3.getValue());
    }

    public static 0wc A0P(AnonymousClass0iw r1, AnonymousClass0eM r2) {
        return AnonymousClass0kN.A01(r1, (0lg) r2.getValue());
    }

    public static 1Ng A0R(AnonymousClass0eM r0) {
        return AnonymousClass1Nd.A00((0lg) r0.getValue());
    }

    public static AnonymousClass0wW A0T(Fragment fragment) {
        return (AnonymousClass0wW) C227642jf.A01(fragment).getValue();
    }

    public static UserSession A0U(Fragment fragment) {
        return (UserSession) C227642jf.A02(fragment).getValue();
    }

    public static UserSession A0W(C307896Rx r1) {
        UserSession A0B = C308206Td.A0B(r1);
        0qQ.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        return A0B;
    }

    public static IgSimpleImageView A0Y(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (IgSimpleImageView) requireViewById;
    }

    public static IgTextView A0Z(View view, int i) {
        IgTextView requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return requireViewById;
    }

    public static CircularImageView A0a(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (CircularImageView) requireViewById;
    }

    public static IgImageView A0b(View view, int i) {
        IgImageView requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return requireViewById;
    }

    public static 0nV A0c(AnonymousClass12V r2) {
        return r2.CO6(480314591, 3);
    }

    public static 1E8 A0d(AnonymousClass0eM r0) {
        return 1E7.A00((UserSession) r0.getValue());
    }

    public static C331127Pr A0f(AnonymousClass0eM r1) {
        return new C331127Pr((0lg) r1.getValue());
    }

    public static 1Av A0h(AnonymousClass0eM r0) {
        return 1Au.A00((UserSession) r0.getValue());
    }

    public static GradientSpinnerAvatarView A0j(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (GradientSpinnerAvatarView) requireViewById;
    }

    public static SpinnerImageView A0k(View view) {
        return (SpinnerImageView) view.requireViewById(R.id.loading_spinner);
    }

    public static User A0l(0eE r1, AnonymousClass0eM r2) {
        return r1.A01((UserSession) r2.getValue());
    }

    public static C262184Cl A0m(UserSession userSession) {
        return 0eE.A00(userSession).A00().A03;
    }

    public static Object A0n(List list, int i) {
        Object obj = list.get(i);
        0qQ.A0B(obj, 0);
        return obj;
    }

    public static String A0o(Fragment fragment) {
        return fragment.requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static String A0p(AnonymousClass6Tm r0, String str) {
        Object A00 = r0.A00();
        0qQ.A0C(A00, str);
        return (String) A00;
    }

    public static String A0s(Enum enumR) {
        return enumR.name().toLowerCase(Locale.US);
    }

    public static String A0u(List list, int i) {
        return ((User) list.get(i)).getUsername();
    }

    public static List A0y(Iterable iterable, ListIterator listIterator) {
        return 00k.A0d(iterable, listIterator.nextIndex() + 1);
    }

    public static void A0z(Activity activity) {
        Application application = activity.getApplication();
        0qQ.A07(application);
        AnonymousClass2XD.A00(application);
    }

    public static void A10(Activity activity, AnonymousClass37E r1) {
        AnonymousClass37D A01 = r1.A01(activity);
        if (A01 != null) {
            A01.A0B();
        }
    }

    public static void A11(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(i)));
    }

    public static void A12(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(AnonymousClass37O.A00(context.getColor(i)));
    }

    public static void A13(Context context, TextView textView, Object obj, int i) {
        textView.setText(context.getString(i, new Object[]{obj}));
    }

    public static void A14(Context context, AnonymousClass37E r1) {
        AnonymousClass37D A02 = r1.A02(context);
        if (A02 != null) {
            A02.A0B();
        }
    }

    public static void A15(Context context, AnonymousClass6ST r2) {
        r2.A00(context.getString(2131965491));
    }

    public static void A16(DialogInterface.OnClickListener onClickListener, C358248ab r1) {
        r1.A0C(onClickListener);
        AnonymousClass0fN.A00(r1.A02());
    }

    public static void A17(Intent intent, Fragment fragment) {
        fragment.requireActivity().setResult(-1, intent);
    }

    public static void A18(Bundle bundle, Fragment fragment, C309516Yo r2) {
        fragment.setArguments(bundle);
        r2.A0B((Bundle) null, fragment);
        r2.A04();
    }

    public static void A1B(View view, int i) {
        view.requireViewById(i).setVisibility(8);
    }

    public static void A1C(View view, int i, int i2) {
        view.setPadding(i, i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A1D(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    public static void A1E(View view, CharSequence charSequence, int i) {
        ((TextView) view.requireViewById(i)).setText(charSequence);
    }

    public static void A1F(TextView textView, Fragment fragment, Object obj, int i) {
        textView.setText(fragment.getString(i, new Object[]{obj}));
    }

    public static void A1G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A1H(Fragment fragment) {
        C59689JTv.A07(fragment.requireContext(), 2131972232);
    }

    public static void A1I(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void A1J(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static void A1M(1NY r2, String str, String str2) {
        r2.A9m(str, str2);
        r2.A0Q(1XP.class, 1XY.class);
    }

    public static void A1N(OID oid, int i) {
        oid.A02 = new OBB(i, R.id.recycler_view);
    }

    public static void A1O(C307896Rx r1, C308276Tl r2, C277014uI r3, Object obj) {
        r2.A01(obj);
        C299275ur.A00(r1, r2.A00(), r3);
    }

    public static void A1P(C307896Rx r1, C308276Tl r2, C277014uI r3, Object obj, int i) {
        r2.A03(obj, i);
        C299275ur.A00(r1, r2.A00(), r3);
    }

    public static void A1T(0xY r1, String str, String str2, boolean z) {
        r1.E5T(002.A0R(str, str2), z);
        r1.apply();
    }

    public static void A1U(0xa r0, String str, String str2) {
        0xY AR4 = r0.AR4();
        AR4.E5g(str, str2);
        AR4.apply();
    }

    public static void A1V(0xa r0, String str, boolean z) {
        0xY AR4 = r0.AR4();
        AR4.E5T(str, z);
        AR4.apply();
    }

    public static boolean A1Y(UserSession userSession) {
        return C319606qt.A01(userSession).A0K(userSession.A06);
    }

    public static boolean A1Z(2HR r0) {
        return ((Boolean) r0.get()).booleanValue();
    }

    public static boolean A1b(05G r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }
}

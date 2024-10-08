package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public abstract class DbY {
    public static Bundle A0A(Object obj) {
        0qQ.A0B(obj, 0);
        return new Bundle();
    }

    public static AnonymousClass0kM A0M(0lg r1) {
        0qQ.A0B(r1, 0);
        return new AnonymousClass0kM(r1);
    }

    public static AnonymousClass6Tm A0Q(Object obj) {
        C308276Tl r0 = new C308276Tl();
        r0.A03(obj, 0);
        return r0.A00();
    }

    public static 2el A0U() {
        return C71682ef.A01((0lg) null, C71682ef.A00());
    }

    public static AnonymousClass19S A0r(AnonymousClass12V r1, int i) {
        return 19E.A02(r1.AOJ(i, 3));
    }

    public static void A0x(Context context, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i) {
        gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(2Yu.A0H(context, i)));
        gradientSpinnerAvatarView.setPresenceBadgeDrawable((Drawable) null);
    }

    public static void A0z(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A1D(0Aj r2, double d, double d2) {
        r2.A8D("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A1E(0Aj r2, long j, long j2) {
        r2.A8D("elapsed_time", Double.valueOf((double) (j - j2)));
    }

    public static void A1L(UserSession userSession, NoteBubbleView noteBubbleView) {
        noteBubbleView.A0I(C249223jK.A04(userSession), false, C249223jK.A05(userSession), false);
    }

    public static void A1M(C358248ab r1, int i) {
        r1.A0H((DialogInterface.OnClickListener) null, i);
        AnonymousClass0fN.A00(r1.A02());
    }

    public static void A1S(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 2);
    }

    public static boolean A1X(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return true;
        }
        return false;
    }

    public static int A00(int i) {
        int A0L = 0se.A0L(i);
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static int A03(Object obj, 0s0 r2, AnonymousClass0YZ[] r3, int i) {
        return ((Number) r2.CDM(obj, r3[i])).intValue();
    }

    public static long A04(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0;
    }

    public static Intent A06(String str) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        return intent;
    }

    public static Bundle A08(Fragment fragment) {
        Bundle bundle = fragment.mArguments;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static Bundle A09(UserSession userSession) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        return bundle;
    }

    public static Bundle A0B(Object obj, Object obj2) {
        return Q21.A00(new 0eP(obj, obj2));
    }

    public static Bundle A0C(Object obj, Object obj2, 0eP r3, 0eP r4) {
        return Q21.A00(r3, r4, new 0eP(obj, obj2));
    }

    public static C587707f A0I(Object obj) {
        return ((AnonymousClass07g) ((AnonymousClass0eM) obj).getValue()).getViewModelStore();
    }

    public static C309516Yo A0J(FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r3);
        AnonymousClass35B.A00().A01();
        return r1;
    }

    public static C229382nI A0L(FragmentActivity fragmentActivity, 0lg r3, String str) {
        return C229382nI.A01((SparseArray) null, fragmentActivity, new 0xG(str), r3);
    }

    public static FxSsoViewModel A0V(AnonymousClass07g r2) {
        return new 2YN(r2).A00(FxSsoViewModel.class);
    }

    public static PendingRecipient A0W(DirectShareTarget directShareTarget, int i) {
        return (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(i);
    }

    public static IllegalStateException A0Y(String str) {
        return new IllegalStateException(002.A0g("Argument type for ", str, " is not yet supported"));
    }

    public static String A0a() {
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0f(View view, int i) {
        if (i != 0) {
            return view.getContext().getString(i);
        }
        return null;
    }

    public static String A0j(String str) {
        Locale locale = Locale.US;
        0qQ.A08(locale);
        String lowerCase = str.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return lowerCase;
    }

    public static String A0k(String str) {
        Locale locale = Locale.US;
        0qQ.A08(locale);
        String upperCase = str.toUpperCase(locale);
        0qQ.A07(upperCase);
        return upperCase;
    }

    public static ArrayList A0l(String str) {
        return new ArrayList(Arrays.asList(str.split(",")));
    }

    public static HashMap A0m(Object obj, Object obj2) {
        return 0Yt.A02(new 0eP[]{new 0eP(obj, obj2)});
    }

    public static LinkedHashMap A0p(Object obj, Object obj2, 0eP r3) {
        return 0Yt.A06(new 0eP[]{r3, new 0eP(obj, obj2)});
    }

    public static LinkedHashMap A0q(Object obj, Object obj2, 0eP r3, 0eP r4) {
        return 0Yt.A06(new 0eP[]{r3, r4, new 0eP(obj, obj2)});
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1pi, java.lang.Object] */
    public static void A0t() {
        if (C66631pj.A00 == null) {
            C66631pj.A00 = new Object();
        }
    }

    public static void A0u(Activity activity, Bundle bundle, 0lg r7, String str) {
        Activity activity2 = activity;
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity2, bundle, r7, ModalActivity.class, str);
        r0.A08();
        r0.A0C(activity2);
    }

    public static void A14(Fragment fragment, FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r3);
        r0.A0D(fragment);
        r0.A04();
    }

    public static void A18(Fragment fragment, boolean z) {
        2dZ.A0t.A03(fragment.requireActivity()).setIsLoading(z);
    }

    public static void A19(2YL r2, 0sL r3, AnonymousClass0r6 r4) {
        AnonymousClass11O.A03(C318116oQ.A00(r2), new C61860pz(r3, r4));
    }

    public static void A1A(0Aj r2) {
        r2.AAJ("guid", 0qv.A02.A04(C60960kU.A00));
    }

    public static void A1B(0Aj r2) {
        r2.A9F("os_version", Long.valueOf((long) Build.VERSION.SDK_INT));
    }

    public static void A1C(0Aj r2) {
        r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
    }

    public static void A1F(0Aj r2, String str) {
        r2.AAJ("action", str);
        r2.AAJ("ig_appid", "567067343352427");
    }

    public static void A1H(0Aj r2, String str, long j) {
        r2.AAJ("object_type", str);
        r2.A9F("pbs_owner_id", Long.valueOf(j));
    }

    public static boolean A1a(0lg r3) {
        CallerContext callerContext = C46508DgB.A00;
        return 182.A06(0Tu.A05, r3, 36313871178533136L);
    }

    public static int A01(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }

    public static int A02(0lg r0) {
        return C319606qt.A01(r0).A05().size();
    }

    public static Application A05(Fragment fragment) {
        Application application = fragment.requireActivity().getApplication();
        0qQ.A07(application);
        return application;
    }

    public static Drawable A07(Context context) {
        return context.getDrawable(2Yu.A0H(context, R.attr.presenceBadgeLarge));
    }

    public static SpannableStringBuilder A0D(Context context, Object obj, int i) {
        return new SpannableStringBuilder(context.getString(i, new Object[]{obj}));
    }

    public static SpannableStringBuilder A0E(Fragment fragment, Object obj, int i) {
        return new SpannableStringBuilder(fragment.getString(i, new Object[]{obj}));
    }

    public static View A0F(View view, int i) {
        return ((ViewStub) view.requireViewById(i)).inflate();
    }

    public static ViewPropertyAnimator A0G(View view) {
        return view.animate().alpha(1.0f);
    }

    public static Fragment A0H(FragmentActivity fragmentActivity) {
        return fragmentActivity.getSupportFragmentManager().A0P(R.id.layout_container_main);
    }

    public static C309516Yo A0K(C47480E4f e4f) {
        return new C309516Yo(e4f.requireActivity(), e4f.A05());
    }

    public static 1OC A0N(1NY r1, Class cls, Class cls2) {
        r1.A0R(cls, cls2);
        r1.A0R = true;
        return r1.A0M();
    }

    public static C276544tV A0O(AnonymousClass6Tm r1) {
        Object A01 = r1.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (C276544tV) A01;
    }

    public static C276544tV A0P(AnonymousClass6Tm r0, int i) {
        Object A03 = r0.A03(i);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (C276544tV) A03;
    }

    public static 0lg A0R(AnonymousClass0eM r1) {
        0lg r12 = (0lg) r1.getValue();
        0qQ.A0B(r12, 0);
        return r12;
    }

    public static C71662eb A0S(View view, int i) {
        return new C71662eb((ViewStub) view.requireViewById(i));
    }

    public static C71662eb A0T(View view, int i) {
        return new C71662eb((ViewStub) view.findViewById(i));
    }

    public static 0xa A0X(UserSession userSession, Object obj) {
        return 1Al.A01(userSession).A04(1An.A0O, obj.getClass());
    }

    public static Object A0Z(Fragment fragment, String str) {
        return 2Yc.A01(fragment.requireArguments(), Object.class, str);
    }

    public static String A0b(Context context, User user, int i) {
        return context.getString(i, new Object[]{user.getUsername()});
    }

    public static String A0c(Context context, Object obj, int i) {
        String string = context.getString(i, new Object[]{obj});
        0qQ.A07(string);
        return string;
    }

    public static String A0d(Resources resources, int i, int i2) {
        return resources.getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
    }

    public static String A0e(Resources resources, Object obj, int i, int i2) {
        String quantityString = resources.getQuantityString(i, i2, new Object[]{obj});
        0qQ.A07(quantityString);
        return quantityString;
    }

    public static String A0g(AnonymousClass6Tm r1) {
        Object A01 = r1.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        return (String) A01;
    }

    public static String A0h(AnonymousClass6Tm r0, int i) {
        Object A03 = r0.A03(i);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        return (String) A03;
    }

    public static String A0i(User user) {
        return 0mp.A06("https://www.instagram.com/%s/", new Object[]{user.getUsername()});
    }

    public static Iterator A0n(0lg r0) {
        return C319606qt.A01(r0).A05().iterator();
    }

    public static Iterator A0o(List list) {
        List unmodifiableList = Collections.unmodifiableList(list);
        0qQ.A07(unmodifiableList);
        return unmodifiableList.iterator();
    }

    public static void A0s() {
        AnonymousClass2ZQ A00 = C71172bH.A00();
        if (A00 != null) {
            A00.Eng(1QK.A0E);
        }
    }

    public static void A0v(Context context, MYU myu, AnonymousClass4DJ r3, AnonymousClass0eM r4) {
        myu.A0R(context, C71342cb.A00((0lg) r4.getValue()), r3);
    }

    public static void A0w(Context context, C358248ab r2, Object obj, int i) {
        r2.A0q(context.getString(i, new Object[]{obj}));
    }

    public static void A0y(Resources resources, TextView textView, Object obj, int i) {
        textView.setText(resources.getString(i, new Object[]{obj}));
    }

    public static void A10(View view, int i) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            viewStub.inflate();
        }
    }

    public static void A11(TextView textView, Context context) {
        textView.setTextColor(context.getColor(2Yu.A08(context)));
    }

    public static void A12(TextView textView, Context context) {
        textView.setTextColor(context.getColor(2Yu.A07(context)));
    }

    public static void A13(Fragment fragment, Fragment fragment2, C331127Pr r4) {
        r4.A00().A02(fragment.requireActivity(), fragment2);
    }

    public static void A15(Fragment fragment, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(fragment.getContext()));
    }

    public static void A16(Fragment fragment, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(fragment.requireContext()));
    }

    public static void A17(Fragment fragment, 2dY r1, boolean z) {
        r1.A03(fragment.getActivity()).setIsLoading(z);
    }

    public static void A1G(0Aj r2, String str) {
        r2.A9F("creator_igid", Long.valueOf(Long.parseLong(str)));
    }

    public static void A1I(0Aj r2, String str, String str2, double d) {
        r2.AAJ(str, str2);
        r2.A8D(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A1J(1Fa r2, String str, String str2) {
        r2.A9m(str, str2);
        r2.A9m("waterfall_id", 1Q0.A01());
    }

    public static void A1K(1xC r2, C310336ap r3) {
        r2.A00(new AnonymousClass3GP(r3.A00()));
    }

    public static void A1N(C310336ap r2) {
        1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
    }

    public static void A1O(User user) {
        if (user.B6o() == FollowStatus.A08) {
            user.A0n(FollowStatus.A06);
        }
    }

    public static void A1P(User user) {
        String username = user.getUsername();
        ImageUrl Bh3 = user.Bh3();
        synchronized (FGv.class) {
            FGv.A03.A00(username);
            0xY AR4 = FGv.A00.A00.AR4();
            AR4.E5T("did_facebook_sso", false);
            AR4.apply();
            FGv.A04.A00(Bh3.getUrl());
        }
    }

    public static void A1Q(AnonymousClass3UM r1, AnonymousClass6KM r2) {
        r2.A0B = r1.BxN();
        r2.A0C = r1.C8Y();
    }

    public static void A1R(C309416Ye r1) {
        r1.A08(UUID.randomUUID().toString());
    }

    public static void A1T(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (!0qQ.A0K(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A1U(Object obj, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        abstractCollection2.add(Boolean.valueOf(abstractCollection.add(obj)));
    }

    public static void A1V(StringBuilder sb, List list, int i) {
        if (i < list.size() - 1) {
            sb.append(", ");
        }
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).getId());
    }

    public static boolean A1Y(0Tu r0, 0lg r1, long j) {
        return 182.A06(r0, r1, j);
    }

    public static boolean A1Z(0Tu r0, 0lg r1, long j) {
        boolean A06 = 182.A06(r0, r1, j);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static boolean A1b(Object obj, Object obj2) {
        return 0qQ.A0K(obj.getClass(), obj2.getClass());
    }
}

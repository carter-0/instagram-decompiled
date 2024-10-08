package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class DbU {
    public static int A03(Calendar calendar) {
        return calendar.get(5);
    }

    public static View A08(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public static 1NY A0M(0lg r2) {
        return new 1NY(r2, -2);
    }

    public static UserSession A0W(C46430Der der) {
        UserSession A03 = C46430Der.A03(der);
        0qQ.A0B(A03, 0);
        return A03;
    }

    public static C252063oV A0Y(View view, int i) {
        return 2b1.A01(view.findViewById(i), false, false);
    }

    public static Object A0j(AnonymousClass6Tm r1) {
        return r1.A03(3);
    }

    public static boolean A1a(CharSequence charSequence, CharSequence charSequence2) {
        return 00l.A0d(charSequence, charSequence2, false);
    }

    public static Intent A04(Context context) {
        return new Intent(context, BusinessConversionActivity.class);
    }

    public static 1NY A0N(0lg r1) {
        1NY r0 = new 1NY(r1);
        r0.A04();
        return r0;
    }

    public static 1NY A0O(0lg r1) {
        1NY r0 = new 1NY(r1);
        r0.A05();
        return r0;
    }

    public static C309516Yo A0P(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, 0lg r4) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r4);
        r0.A0B(bundle, fragment);
        return r0;
    }

    public static C309516Yo A0Q(FragmentActivity fragmentActivity, 0lg r3) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r3);
        r1.A0F = true;
        return r1;
    }

    public static C308276Tl A0T(Object obj) {
        C308276Tl r0 = new C308276Tl();
        r0.A01(obj);
        return r0;
    }

    public static C297815sO A0f() {
        return new C297815sO(C60340gF.A00);
    }

    public static IllegalArgumentException A0h() {
        return new IllegalArgumentException("Required value was null.");
    }

    public static IllegalStateException A0i() {
        return new IllegalStateException("Missing Required Props");
    }

    public static void A0w(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        new AnonymousClass6W8(activity, bundle, r3, cls, str).A0C(activity);
    }

    public static void A15(Context context, RecyclerView recyclerView, int i, boolean z) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, i, z));
    }

    public static void A1C(BaseBundle baseBundle) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", "IgSessionManager.LOGGED_OUT_TOKEN");
    }

    public static void A1D(BaseBundle baseBundle, UserSession userSession) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
    }

    public static void A1F(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, String str, AbstractCollection abstractCollection, List list) {
        abstractCollection.add(new C70962OTj(onCheckedChangeListener, str, list));
    }

    public static void A1U(C332277Ui r0, AnonymousClass37D r1, Object obj) {
        ((AnonymousClass37F) obj).A0H = r0;
        r1.A0B();
    }

    public static void A1W(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new Pair(obj, obj2));
    }

    public static String[] A1b(List list, int i) {
        return (String[]) list.toArray(new String[i]);
    }

    public static float A00(Context context, int i) {
        return context.getResources().getDimension(i);
    }

    public static int A01(Context context) {
        return context.getColor(R.color.badge_color);
    }

    public static int A02(Enum enumR, int i) {
        0qQ.A0B(enumR, i);
        return enumR.ordinal();
    }

    public static Resources A05(View view) {
        return view.getContext().getResources();
    }

    public static Bundle A06(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static Spanned A07(Resources resources, String str, int i) {
        return 0bC.A01(resources, new String[]{str}, i);
    }

    public static View A09(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return inflate;
    }

    public static View A0A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        0qQ.A0A(inflate);
        return inflate;
    }

    public static View A0B(View view, int i) {
        View findViewById = view.findViewById(i);
        findViewById.getClass();
        return findViewById;
    }

    public static ViewGroup A0C(View view, int i) {
        return (ViewGroup) view.requireViewById(i);
    }

    public static ViewStub A0D(View view, int i) {
        return (ViewStub) view.requireViewById(i);
    }

    public static EditText A0E(View view, int i) {
        return (EditText) view.requireViewById(i);
    }

    public static ImageView A0F(View view, int i) {
        return (ImageView) view.requireViewById(i);
    }

    public static TextView A0G(View view, int i) {
        return (TextView) view.requireViewById(i);
    }

    public static Fragment A0H(C307896Rx r0) {
        return C308206Td.A00(C308206Td.A09(r0));
    }

    public static FragmentActivity A0I(Bundle bundle, Fragment fragment, Fragment fragment2) {
        fragment.setArguments(bundle);
        return fragment2.requireActivity();
    }

    public static 1vR A0J(2IS r0, String str, String str2) {
        r0.A04(str, str2);
        AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
        return AnonymousClass1vS.A00();
    }

    public static ImmutableList A0K(Collection collection) {
        ImmutableList copyOf = ImmutableList.copyOf(collection);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public static 2dZ A0L(Fragment fragment, 2dY r1) {
        return r1.A03(fragment.requireActivity());
    }

    public static C49730F3v A0R() {
        return C322576w3.A00().A00();
    }

    public static 1OC A0S(1NY r0, Class cls, Class cls2) {
        r0.A0Q(cls, cls2);
        return r0.A0M();
    }

    public static AnonymousClass2t9 A0U(AnonymousClass2tC r0, C232232tF r1) {
        r0.A01(r1);
        return r0.A00();
    }

    public static 0lg A0V(C307896Rx r0) {
        return C308206Td.A0A(C308206Td.A09(r0));
    }

    public static CircularImageView A0X(View view, int i) {
        return (CircularImageView) view.requireViewById(i);
    }

    public static C252063oV A0Z(View view, int i) {
        return 2b1.A00(view.requireViewById(i));
    }

    public static AnonymousClass30Y A0a(C250603lj r0, C2354830a r1) {
        r1.A00(r0);
        return r1.A01();
    }

    public static IgdsButton A0b(View view, int i) {
        return (IgdsButton) view.requireViewById(i);
    }

    public static 2aT A0c(UserSession userSession) {
        return 2aN.A00(userSession).A00();
    }

    public static C49889FBp A0d() {
        return C318996ps.A00().A01();
    }

    public static 0xY A0e(0xY r0, 0xa r1) {
        r0.apply();
        return r1.AR4();
    }

    public static Boolean A0g(BaseBundle baseBundle, String str) {
        return Boolean.valueOf(baseBundle.getBoolean(str));
    }

    public static Object A0k(0eO r0, C62320sa r1) {
        return AnonymousClass0eN.A00(r0, r1).getValue();
    }

    public static String A0l(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        string.getClass();
        return string;
    }

    public static String A0m(Fragment fragment, int i) {
        String string = fragment.getString(i);
        0qQ.A07(string);
        return string;
    }

    public static String A0n(UserSession userSession, 0eE r1) {
        return r1.A01(userSession).getUsername();
    }

    public static String A0o(IgFormField igFormField) {
        return igFormField.getText().toString();
    }

    public static String A0p(User user) {
        return user.Bh3().getUrl();
    }

    public static String A0q(AnonymousClass3UM r0) {
        return r0.CCd().getId();
    }

    public static String A0r(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0s(String str, Object obj, Object obj2, Object obj3) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2, obj3);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static String A0t(List list, int i) {
        return (String) list.get(i);
    }

    public static String A0u(AnonymousClass0eM r0) {
        return ((UserSession) r0.getValue()).A06;
    }

    public static void A0v() {
        C322576w3.A00().A00();
    }

    public static void A0x(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        AnonymousClass6W8.A02(activity, bundle, r3, cls, str).A0C(activity);
    }

    public static void A0y(Activity activity, Fragment fragment, C331127Pr r3) {
        r3.A00().A02(activity, fragment);
    }

    public static void A0z(Context context, int i) {
        C59689JTv.A09(context, context.getString(i));
    }

    public static void A10(Context context, Drawable drawable, int i) {
        drawable.setTint(context.getColor(i));
    }

    public static void A11(Context context, View view, int i) {
        view.setBackground(context.getDrawable(i));
    }

    public static void A12(Context context, View view, int i) {
        view.setContentDescription(context.getString(i));
    }

    public static void A13(Context context, ImageView imageView, int i) {
        imageView.setImageDrawable(context.getDrawable(i));
    }

    public static void A14(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(context.getColor(i));
    }

    public static void A16(Context context, C358248ab r1, int i) {
        r1.A0i(context.getDrawable(i));
    }

    public static void A17(Context context, C358248ab r1, int i) {
        r1.A0q(context.getString(i));
    }

    public static void A18(Context context, AnonymousClass6ST r1, int i) {
        r1.A00(context.getString(i));
    }

    public static void A19(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(context.getString(i));
    }

    public static void A1A(Resources resources, TextView textView, int i) {
        textView.setText(resources.getString(i));
    }

    public static void A1B(Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putString(str, uri.getQueryParameter(str));
    }

    public static void A1E(TextWatcher textWatcher, IgFormField igFormField) {
        igFormField.getMEditText().removeTextChangedListener(textWatcher);
    }

    public static void A1G(TextView textView, Fragment fragment, int i) {
        textView.setText(fragment.getString(i));
    }

    public static void A1H(TextView textView, User user) {
        textView.setText(user.getUsername());
    }

    public static void A1I(Fragment fragment, Fragment fragment2, C331157Pu r2) {
        r2.A02(fragment.requireActivity(), fragment2);
    }

    public static void A1J(Fragment fragment, C358248ab r1, int i) {
        r1.A0q(fragment.getString(i));
    }

    public static void A1K(Fragment fragment, AnonymousClass6W8 r1) {
        r1.A0C(fragment.requireContext());
    }

    public static void A1L(Fragment fragment, AnonymousClass6ST r1, int i) {
        r1.A00(fragment.getString(i));
    }

    public static void A1M(FragmentActivity fragmentActivity, C270634h3 r2, UserSession userSession) {
        C250563lf.A0X(fragmentActivity, r2.A00(), userSession);
    }

    public static void A1N(0Aj r1, String str, String str2, String str3) {
        r1.AAJ(str, str2);
        r1.AAJ("media_id", str3);
    }

    public static void A1O(1Fa r1, String str) {
        r1.A9m(Dbj.A01(), str);
    }

    public static void A1P(1Fa r1, String str, Object[] objArr) {
        r1.A0A(0mp.A06(str, objArr));
    }

    public static void A1Q(2Ru r1, C231642s0 r2) {
        r1.init(new C231642s0[]{r2});
    }

    public static void A1R(0xI r1, 0lg r2) {
        C60510iO.A00(r2).EFq(r1);
    }

    public static void A1S(AnonymousClass0iw r1, IgImageView igImageView, User user) {
        igImageView.setUrl(user.Bh3(), r1);
    }

    public static void A1T(AnonymousClass5Gt r0) {
        r0.A00().A06();
    }

    public static void A1V(User user, AbstractCollection abstractCollection) {
        abstractCollection.add(user.getId());
    }

    public static void A1X(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj.toString());
    }

    public static void A1Y(Object obj, AbstractMap abstractMap, boolean z) {
        abstractMap.put(obj, Boolean.valueOf(z));
    }

    public static boolean A1Z(0lg r0) {
        return AnonymousClass0BO.A00(r0).CKD();
    }
}

package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class DbS {
    public static Long A0j(int i) {
        return Long.valueOf((long) i);
    }

    public static void A1W(Object obj) {
        0qQ.A0B(obj, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
    }

    public static int A05(Object obj) {
        return ((List) obj).size();
    }

    public static int A06(boolean z, int i) {
        int i2 = 1237;
        if (z) {
            i2 = 1231;
        }
        return i + i2;
    }

    public static Context A07(C249703kE r0) {
        return r0.itemView.getContext();
    }

    public static Context A08(FRY fry) {
        return fry.A01.requireContext();
    }

    public static Intent A09() {
        return new Intent();
    }

    public static Bundle A0A(int i) {
        return new Bundle(i);
    }

    public static Bundle A0B(Object obj) {
        return ((Fragment) obj).requireArguments();
    }

    public static SpannableStringBuilder A0C(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static C227862kA A0I(C62320sa r1, C62320sa r2, C62320sa r3, C62230ry r4) {
        return new C227862kA(r1, r2, r3, r4);
    }

    public static AnonymousClass3JR A0K() {
        return new AnonymousClass3JR();
    }

    public static MultiAuthorStoryType A0L(String str, String str2, int i) {
        return new MultiAuthorStoryType(str, i, str2);
    }

    public static C309516Yo A0M(FragmentActivity fragmentActivity, 0lg r2) {
        return new C309516Yo(fragmentActivity, r2);
    }

    public static IgBloksScreenConfig A0N(0lg r1) {
        return new IgBloksScreenConfig(r1);
    }

    public static 0xG A0O(String str) {
        return new 0xG(str);
    }

    public static C308276Tl A0P() {
        return new C308276Tl();
    }

    public static GKO A0Q(Object[] objArr, int i) {
        return new GKO(objArr, i);
    }

    public static ViewModelListUpdate A0R() {
        return new ViewModelListUpdate();
    }

    public static AnonymousClass0wW A0S(Object obj) {
        return 09i.A0A.A05(obj);
    }

    public static UserSession A0U(Bundle bundle) {
        return 09i.A0A.A06(bundle);
    }

    public static SimpleImageUrl A0V(String str) {
        return new SimpleImageUrl(str);
    }

    public static C331127Pr A0W(0lg r1) {
        return new C331127Pr(r1);
    }

    public static C358248ab A0X(Activity activity) {
        return new C358248ab(activity);
    }

    public static C358248ab A0Y(Context context) {
        return new C358248ab(context);
    }

    public static C310336ap A0a() {
        return new C310336ap();
    }

    public static AnonymousClass6W8 A0b(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        return new AnonymousClass6W8(activity, bundle, r3, cls, str);
    }

    public static C254783t2 A0c(DirectShareTarget directShareTarget) {
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        return r0;
    }

    public static 0xY A0d(0xm r0) {
        return r0.A00.AR4();
    }

    public static 0xm A0e() {
        return AnonymousClass0xl.A00(C61170le.A00);
    }

    public static PR9 A0f(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, boolean z) {
        return new PR9(onCheckedChangeListener, i, z);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6Ye, java.lang.Object] */
    public static C309416Ye A0i() {
        1OP r0 = 1OP.$redex_init_class;
        return new Object();
    }

    public static String A0k() {
        return AnonymousClass1QI.A00.A02.A00;
    }

    public static String A0l(BaseBundle baseBundle) {
        return baseBundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static String A0m(BaseBundle baseBundle) {
        return baseBundle.getString("original_url");
    }

    public static String A0n(Dd4 dd4) {
        return dd4.A08.getModuleName();
    }

    public static String A0o(User user) {
        return user.A03.BxN();
    }

    public static String A0p(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return "null cannot be cast to non-null type kotlin.String";
    }

    public static String A0q(Object obj) {
        return ((User) obj).getId();
    }

    public static String A0u(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    public static ArrayList A0v(int i) {
        return new ArrayList(i);
    }

    public static BitSet A0w(int i) {
        return new BitSet(i);
    }

    public static LinkedHashMap A0x(int i) {
        return new LinkedHashMap(i);
    }

    public static LinkedHashSet A0y() {
        return new LinkedHashSet();
    }

    public static 0Yh A0z(Class cls) {
        return new 0Yh(cls);
    }

    public static 02z A10(Object obj) {
        return new 02z(obj);
    }

    public static JSONObject A11() {
        return new JSONObject();
    }

    public static void A12() {
        0qQ.A0F("logger");
        throw null;
    }

    public static void A13() {
        0qQ.A0F("adapter");
        throw null;
    }

    public static void A14() {
        0qQ.A0F("session");
        throw null;
    }

    public static void A15() {
        0qQ.A0F("instance");
        throw null;
    }

    public static void A16() {
        0qQ.A0F("entryPoint");
        throw null;
    }

    public static void A17() {
        0qQ.A0F("userSession");
        throw null;
    }

    public static void A1A(BaseBundle baseBundle, String str) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
    }

    public static void A1B(BaseBundle baseBundle, String str) {
        baseBundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
    }

    public static void A1C(TextView textView) {
        textView.setText("");
    }

    public static void A1D(Fragment fragment) {
        0nA.A0N(fragment.mView);
    }

    public static void A1F(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static void A1G(0Aj r1, String str) {
        r1.AAJ("flow", str);
    }

    public static void A1H(0Aj r1, String str) {
        r1.AAJ("step", str);
    }

    public static void A1I(0Aj r1, String str) {
        r1.AAJ("event", str);
    }

    public static void A1J(0Aj r1, String str) {
        r1.AAJ("action", str);
    }

    public static void A1K(0Aj r1, String str) {
        r1.AAJ("module", str);
    }

    public static void A1L(0Aj r1, String str) {
        r1.AAJ("source", str);
    }

    public static void A1M(0Aj r1, String str) {
        r1.AAJ("surface", str);
    }

    public static void A1N(0Aj r1, String str) {
        r1.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
    }

    public static void A1O(0Aj r1, String str) {
        r1.AAJ("container_module", str);
    }

    public static void A1P(1Fa r1, String str) {
        r1.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
    }

    public static void A1Q(C307896Rx r1, C277014uI r2) {
        C299275ur.A00(r1, AnonymousClass6Tm.A01, r2);
    }

    public static void A1R(AnonymousClass6Tm r0, C277014uI r1, Object obj) {
        C299275ur.A00((C307896Rx) obj, r0, r1);
    }

    public static void A1T(SpinnerImageView spinnerImageView) {
        spinnerImageView.setLoadingStatus(C255943uy.LOADING);
    }

    public static void A1U(Object obj) {
        ((C62320sa) obj).invoke();
    }

    public static void A1V(Object obj) {
        ((Dialog) obj).dismiss();
    }

    public static void A1X(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    public static void A1Y(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
    }

    public static void A1Z(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
    }

    public static void A1a(Object obj, Object obj2, 0s0 r3, AnonymousClass0YZ[] r4, int i) {
        r3.Epx(obj, obj2, r4[i]);
    }

    public static boolean A1b(Class cls) {
        return Parcelable.class.isAssignableFrom(cls);
    }

    public static double A00() {
        return (double) 1Q0.A00();
    }

    public static double A01() {
        return (double) System.currentTimeMillis();
    }

    public static int A02(Context context, int i) {
        return (int) 0nA.A04(context, i);
    }

    public static int A03(Resources resources, int i) {
        return (int) resources.getDimension(i);
    }

    public static int A04(0Tu r0, 0lg r1, long j) {
        return (int) 182.A01(r0, r1, j);
    }

    public static ViewGroup.MarginLayoutParams A0D(View view) {
        return (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    }

    public static ViewGroup A0E(View view, int i) {
        return (ViewGroup) view.findViewById(i);
    }

    public static ViewStub A0F(View view, int i) {
        return (ViewStub) view.findViewById(i);
    }

    public static ImageView A0G(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    public static 2YL A0H(AnonymousClass0eM r0) {
        return (2YL) r0.getValue();
    }

    public static 0Tu A0J(Object obj, int i) {
        0qQ.A0B(obj, i);
        return 0Tu.A05;
    }

    public static AnonymousClass0wW A0T(AnonymousClass0eM r0) {
        return (AnonymousClass0wW) r0.getValue();
    }

    public static IgdsFaceSwarm A0Z(C252063oV r0) {
        return (IgdsFaceSwarm) r0.getView();
    }

    public static User A0g(List list, int i) {
        return (User) list.get(i);
    }

    public static C262184Cl A0h(UserSession userSession, 0eE r1) {
        return r1.A01(userSession).A03;
    }

    public static String A0r(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static String A0s(Map.Entry entry) {
        return (String) entry.getValue();
    }

    public static String A0t(AnonymousClass0eM r0) {
        return (String) r0.getValue();
    }

    public static void A18(Context context, IgBloksScreenConfig igBloksScreenConfig, int i) {
        igBloksScreenConfig.A0U = context.getString(i);
    }

    public static void A19(Context context, C310336ap r1, int i) {
        r1.A0D = context.getString(i);
    }

    public static void A1E(Fragment fragment, C310336ap r1, int i) {
        r1.A0D = fragment.getString(i);
    }

    public static void A1S(C331127Pr r1, boolean z) {
        r1.A0a = Boolean.valueOf(z);
    }
}

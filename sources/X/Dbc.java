package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.nux.ui.NetzDgTermsTextView;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class Dbc {
    public static float A00(TextView textView, List list, int i) {
        CharSequence charSequence = (CharSequence) list.get(i);
        float measureText = textView.getPaint().measureText(charSequence, 0, charSequence.length());
        if (!(charSequence instanceof SpannableStringBuilder)) {
            return measureText;
        }
        Spanned spanned = (Spanned) charSequence;
        C2606346l[] r1 = (C2606346l[]) spanned.getSpans(0, spanned.length(), C2606346l.class);
        if (r1.length != 0) {
            return measureText + ((float) r1[0].getDrawable().getIntrinsicWidth());
        }
        return measureText;
    }

    public static Bundle A02(Object obj, String str, String str2, String str3) {
        0qQ.A0B(obj, 1);
        Bundle bundle = new Bundle();
        bundle.putString("invoice_id", str);
        bundle.putString("order_item_id", str2);
        bundle.putString("referrer", str3);
        1WM.getInstance();
        return bundle;
    }

    public static 1NY A05(0lg r5) {
        1NY r4 = new 1NY(r5, -2);
        r4.A04();
        r4.A02();
        String A0u = 002.A0u("api/", "v1/", "users/", "set_birthday_opt_in_settings/");
        0qQ.A07(A0u);
        r4.A0E = A0u;
        r4.A0Q(C47294DuN.class, F46.class);
        return r4;
    }

    public static Float A0B(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Float.valueOf(parcel.readFloat());
        }
        return null;
    }

    public static Integer A0C(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static void A0R(Fragment fragment, FragmentActivity fragmentActivity, 0lg r5) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, r5);
        r1.A0F = true;
        0qQ.A0A(fragment);
        r1.A0B((Bundle) null, fragment);
        r1.A04();
    }

    public static void A0V(0Aj r2) {
        r2.A8k("event_type", 2);
        r2.A8M(C59725JVj.POST_CAPTURE, "surface");
        r2.A8M(28t.A06, "media_type");
    }

    public static void A0Y(0Aj r2, double d, double d2) {
        r2.A8D("elapsed_time", Double.valueOf(d - d2));
        r2.AAJ("containermodule", "waterfall_log_in");
    }

    public static void A0g(0Aj r3, boolean z) {
        r3.A7p("allow_selection", Boolean.valueOf(z));
        r3.A7p("is_crosspost", false);
    }

    public static void A0r(SuggestBusinessFragment suggestBusinessFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ci6(new C22030Xtl("pro_account_suggestions", suggestBusinessFragment.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (suggestBusinessFragment.getContext() != null) {
            C59689JTv.A07(suggestBusinessFragment.getContext(), 2131961756);
            SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
            if (spinnerImageView != null && suggestBusinessFragment.mBusinessNavBar != null) {
                spinnerImageView.setVisibility(8);
            }
        }
    }

    public static void A0w(UserSession userSession, Object obj, Throwable th) {
        String obj2 = obj.toString();
        String format = String.format("Failed to check user eligibility for IGPC to AC Upsell! \n%s", Arrays.copyOf(new Object[]{th.getMessage()}, 1));
        0qQ.A07(format);
        FG9.A02(userSession, obj2, format);
    }

    public static AnimatorSet A01() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public static 0Aj A03(0wc r1, String str, String str2, String str3, String str4) {
        0Aj A00 = r1.A00(r1.A00, str);
        A00.AAJ("product", str2);
        A00.AAJ("product_type", str3);
        A00.AAJ("container_module", str4);
        return A00;
    }

    public static 0Aj A04(0wc r2, String str, AbstractMap abstractMap) {
        abstractMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A00 = r2.A00(r2.A00, "ig_wellbeing_tag_controls_action");
        A00.A9F("actor_ig_userid", Long.valueOf(Long.parseLong(str)));
        return A00;
    }

    public static C309516Yo A06(Object obj) {
        FRY fry = (FRY) obj;
        String str = FRY.A09;
        C309516Yo r1 = new C309516Yo(fry.A01.requireActivity(), fry.A02);
        r1.A0F = true;
        return r1;
    }

    public static UserSession A07(Activity activity) {
        08y r1 = 09i.A0A;
        Intent intent = activity.getIntent();
        0qQ.A07(intent);
        return r1.A06(C61350mg.A00(intent));
    }

    public static E0L A09(String str, String str2) {
        Fragment r2 = new C240383Kr();
        Bundle bundle = new Bundle();
        bundle.putString(DialogModule.KEY_TITLE, str);
        bundle.putString("body", str2);
        r2.setArguments(bundle);
        return r2;
    }

    public static User A0A(TreeJNI treeJNI, 1E6 r5) {
        return 1aC.A01(new 1E9(r5, new HashSet(), false), (ImmutablePandoUserDict) treeJNI.reinterpret(ImmutablePandoUserDict.class));
    }

    public static String A0D(1Fa r2, String str, int i, int i2, int i3) {
        r2.A0E = str;
        r2.A9m("year", String.valueOf(i));
        r2.A9m("month", String.valueOf(i2));
        return String.valueOf(i3);
    }

    public static AnonymousClass19S A0G() {
        return 19E.A02(AnonymousClass199.A02(AnonymousClass12T.A00.A04, new AnonymousClass19G((C262204Co) null)));
    }

    public static void A0H(Activity activity, Intent intent, Bundle bundle, int i) {
        intent.putExtra("argument_client_extras_bundle", bundle);
        intent.setFlags(536870912);
        0kR.A07(activity, intent, i);
        activity.overridePendingTransition(R.anim.signup_content_slide_in, R.anim.signup_content_fade_out);
    }

    public static void A0J(Context context, AttributeSet attributeSet, NetzDgTermsTextView netzDgTermsTextView) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1m);
        0qQ.A07(obtainStyledAttributes);
        netzDgTermsTextView.A00 = C71622eP.A00(context, obtainStyledAttributes, 0);
    }

    public static void A0L(BaseBundle baseBundle, String str, String str2, String str3, boolean z) {
        baseBundle.putString("COUNTRY_CODE", str);
        baseBundle.putString("NATIONAL_NUMBER", str2);
        baseBundle.putBoolean("IS_PHONE_CONFIRMED", z);
        baseBundle.putString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER, str3);
    }

    public static void A0M(Bundle bundle, Fragment fragment, 0lg r9) {
        AnonymousClass6W8 r1 = new AnonymousClass6W8(fragment.requireActivity(), bundle, r9, ModalActivity.class, "bloks");
        r1.A07();
        r1.A0C(fragment.requireActivity());
    }

    public static void A0Q(Fragment fragment) {
        AnonymousClass37D A01;
        BottomSheetFragment A09;
        AnonymousClass37E r3 = AnonymousClass37D.A00;
        AnonymousClass37D A012 = r3.A01(fragment.requireActivity());
        if (A012 != null && ((AnonymousClass37F) A012).A0g && (A01 = r3.A01(fragment.requireActivity())) != null && (A09 = A01.A09()) != null) {
            A09.A0T(0);
        }
    }

    public static void A0T(Fragment fragment, 0hq r3) {
        0s1 r1 = new 0s1(r3);
        r1.A0A(fragment, R.id.layout_container_main);
        r1.A0I("reg_gdpr_entrance");
        r1.A00();
    }

    public static void A0U(C58840Ae r4, String str, String str2) {
        0wc r42 = (0wc) r4;
        1Ln r1 = new 1Ln(r42.A00(r42.A00, "igwb_problematic_use_events"), 279);
        if (r1.A00.isSampled()) {
            r1.A0R("event_type", "click");
            r1.A0R("screen", str);
            r1.A0R("step", str2);
            r1.Cgf();
        }
    }

    public static void A0W(0Aj r2) {
        String A05 = 1Q9.A00(C49852F9r.A01, "two_factor").A05();
        0qQ.A07(A05);
        r2.AAJ(Dbq.A01(), A05);
        r2.AAJ("flow_id", C49852F9r.A00);
    }

    public static void A0a(0Aj r2, C321716ud r3, User user, String str) {
        r2.AAJ("event", str);
        r2.AAJ("actor_id", r3.A02);
        r2.AAJ("follower_status", C321716ud.A01(r3, user.B6o(), user.getId()));
        r2.AAJ("subscriber_status", C321716ud.A02(r3, user.A02, user.getId()));
        r2.A9F("profile_user_igid", Long.valueOf(Long.parseLong(user.getId())));
        r2.A9H("extra", new HashMap());
    }

    public static void A0b(0Aj r2, 1Xj r3, AnonymousClass3W1 r4, Long l, String str) {
        r2.A9F("media_author_id", l);
        r2.A9F("m_ix", Long.valueOf((long) r4.getPosition()));
        r2.A9F("recs_ix", Long.valueOf((long) r4.A0W));
        r2.AAJ("ranking_session_id", str);
        r2.A9F("m_t", Long.valueOf((long) r3.BR7().A00));
        r2.Cgf();
    }

    public static void A0d(0Aj r1, String str, String str2, String str3) {
        r1.AAJ("service_type", str);
        r1.AAJ("sticker_id", str2);
        r1.AAJ("reel_item_id", str3);
        r1.Cgf();
    }

    public static void A0f(0Aj r1, String str, String str2, String str3, List list) {
        r1.AAJ("event", str);
        r1.AAe("error_codes", list);
        r1.AAJ("media_id", str2);
        r1.AAJ("media_type", str3);
        r1.Cgf();
    }

    public static void A0i(1Ln r2, AnonymousClass283 r3) {
        r2.A0n(27x.A08.getModuleName());
        r2.A0R("sticker_tray_session_id", r3.A0U);
        r2.A0c(r3.A0A);
        r2.A0R("composition_str_id", r3.A0M);
        r2.A0M(r3.A0A, "composition_media_type");
        r2.A0u(AnonymousClass1QI.A00.A02.A00);
    }

    public static void A0k(2da r2) {
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A01 = R.drawable.instagram_x_pano_outline_24;
        r2.ErG(new AnonymousClass3Jb(r1));
    }

    public static void A0l(1Fa r2, RegFlowExtras regFlowExtras) {
        UserBirthDate userBirthDate = regFlowExtras.A03;
        if (userBirthDate != null) {
            r2.A9m("year", Integer.toString(userBirthDate.A02));
            r2.A9m("month", Integer.toString(regFlowExtras.A03.A01));
            r2.A9m("day", Integer.toString(regFlowExtras.A03.A00));
        }
    }

    public static void A0m(C47418E1m e1m, C52480GUi gUi) {
        C267624bv r2;
        UserSession userSession = (UserSession) e1m.A0E.getValue();
        FragmentActivity requireActivity = e1m.requireActivity();
        String A05 = e1m.A05();
        String A04 = e1m.A04();
        if (e1m instanceof DxF) {
            r2 = ((DxF) e1m).A06;
        } else if (e1m instanceof DxD) {
            r2 = ((DxD) e1m).A01;
        } else if (e1m instanceof DxC) {
            r2 = ((DxC) e1m).A00;
        } else if (e1m instanceof DxG) {
            r2 = ((DxG) e1m).A04;
        } else if (e1m instanceof DxB) {
            r2 = ((DxB) e1m).A00;
        } else {
            r2 = ((DxE) e1m).A05;
        }
        gUi.A01(requireActivity, r2, userSession, A05, A04);
    }

    public static void A0p(AnonymousClass4DH r3) {
        C227622jd r2 = new C227622jd();
        r2.A0E(new EE7(r3.getActivity()));
        r3.registerLifecycleListenerSet(r2);
    }

    public static void A0s(0wc r1, Long l, String str, String str2) {
        0Aj A00 = r1.A00(r1.A00, str);
        if (A00.isSampled()) {
            A00.A9F("media_id", l);
            A00.AAJ("entrypoint", str2);
            A00.Cgf();
        }
    }

    public static void A0t(C307896Rx r1, C277014uI r2, Object obj, Object obj2) {
        C308276Tl r0 = new C308276Tl();
        r0.A01(obj);
        r0.A02(obj2);
        C299275ur.A00(r1, r0.A00(), r2);
    }

    public static void A0v(UserSession userSession, Number number, Object obj, HashMap hashMap) {
        hashMap.put(obj, Double.valueOf(number.doubleValue() + 1.0d));
        1Av.A05(1Au.A00(userSession), "contacts_in_sharesheet_access_map", hashMap);
    }

    public static void A0x(1pE r2, User user) {
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        0qQ.A07(singletonList);
        r2.A0B = new C291175gg(singletonList);
    }

    public static boolean A12(0lg r3, String str) {
        0qQ.A0B(r3, 2);
        return !AJ0.A04("ig_android_access_library_fx_fetch_active_msgr_token", str, new C368198sE(r3, (String) null));
    }

    public static AnonymousClass283 A08(1Ln r2, C279294yP r3, 29R r4, String str) {
        r2.A0r(str);
        29R.A00(r2, r4);
        r2.A0a(r3);
        AnonymousClass283 r1 = r4.A04;
        r2.A0b(r1.A09);
        r2.A0T();
        r2.A0U();
        return r1;
    }

    public static String A0E(String str) {
        String country = AnonymousClass1Q2.A02().getCountry();
        if (country != null) {
            return PhoneNumberUtils.formatNumber(str, country);
        }
        return PhoneNumberUtils.formatNumber(str);
    }

    public static StringBuilder A0F(Context context, String str) {
        StringBuilder sb;
        if (0mk.A02(context)) {
            List asList = Arrays.asList(str.split(" "));
            Collections.reverse(asList);
            sb.append(C239023El.A00(' ').A02(asList));
            sb.append('+');
            return sb;
        }
        sb = new StringBuilder();
        sb.append('+');
        sb.append(str);
        return sb;
    }

    public static void A0I(Context context, Uri.Builder builder) {
        Intent data = AnonymousClass14B.A03.A00().A01(context).setData(builder.build());
        0qQ.A07(data);
        0kR.A0B(context, data);
    }

    public static void A0K(Uri uri, String str, JSONObject jSONObject) {
        if (uri.getQueryParameter(str) != null && !uri.getQueryParameter(str).isEmpty()) {
            jSONObject.put(str, uri.getQueryParameter(str));
        }
    }

    public static void A0N(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof IgLinearLayout) && (viewGroup = (ViewGroup) parent) != null) {
            TransitionManager.beginDelayedTransition(viewGroup, new AutoTransition());
        }
    }

    public static void A0O(View view, C314466iJ r2) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C48827Ekp.A00(findViewById);
            r2.DUr();
        }
    }

    public static void A0P(Fragment fragment) {
        if (!2db.A09()) {
            2db.A02(fragment.requireActivity(), 2Yu.A0F(fragment.requireContext(), R.attr.statusBarBackgroundColor));
        }
    }

    public static void A0S(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0eM r4) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, (0lg) r4.getValue());
        r0.A0D(fragment);
        r0.A04();
    }

    public static void A0X(0Aj r2, double d, double d2) {
        r2.A8D("current_time", Double.valueOf(d));
        r2.A8D("elapsed_time", Double.valueOf(d - d2));
        r2.A8D(TraceFieldType.StartTime, Double.valueOf(d2));
    }

    public static void A0Z(0Aj r2, C321716ud r3) {
        C321716ud.A03(r3);
        r2.AAJ("parent_surface", "instagram");
        r2.AAJ("surface", "dm_thread_view");
    }

    public static void A0c(0Aj r2, String str, String str2, double d) {
        r2.AAJ(str, str2);
        r2.AAJ("waterfall_id", 1Q0.A01());
        r2.A8D(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A0e(0Aj r2, String str, String str2, String str3, String str4) {
        r2.AAE(C263944Ny.A00(str), "merchant_id");
        0bb r1 = new 0bb();
        r1.A06("prior_module", str2);
        r1.A06("prior_submodule", str3);
        r1.A06("shopping_session_id", str4);
        r2.AAK(r1, "navigation_info");
    }

    public static void A0h(0bb r2, UserSession userSession, 2D6 r4, boolean z) {
        r2.A03("is_account_linked", Boolean.valueOf(z));
        r2.A03("reels_ccp_xpost_setting", Boolean.valueOf(C367288qV.A06(userSession)));
        r2.A03("reels_xar_xpost_setting", Boolean.valueOf(r4.A0C()));
    }

    public static void A0j(1Ln r1, C313756gx r2, String str, Map map, int i) {
        r1.A0q(str);
        r1.A0o(C313746gw.A01(Integer.valueOf(i)));
        r1.A0s((String) null);
        r1.A0i((Long) null);
        r1.A0v(r2.A01);
        r1.A0w(map);
        r1.Cgf();
    }

    public static void A0n(C47468E3r e3r) {
        e3r.requireActivity().setResult(-1, e3r.A0E);
        e3r.requireActivity().finishAfterTransition();
    }

    public static void A0o(AnonymousClass4DH r1) {
        Activity rootActivity = r1.getRootActivity();
        rootActivity.getClass();
        Window window = rootActivity.getWindow();
        window.getClass();
        window.setSoftInputMode(48);
    }

    public static void A0q(AnonymousClass4DH r1, int i) {
        if (r1.getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = r1.getRootActivity();
            0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) rootActivity).Enj(i);
        }
    }

    public static void A0u(UserSession userSession, 1Xj r3, Object obj, AbstractMap abstractMap) {
        abstractMap.put("media_id", r3.getId());
        abstractMap.put("ranking_token", r3.A0C.getLoggingInfoToken());
        abstractMap.put("media_owner_id", r3.A2A(userSession).getId());
        abstractMap.put("option", r3.BR7().name());
        abstractMap.put("share_surface", obj);
    }

    public static void A0y(AnonymousClass6W8 r4) {
        r4.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
    }

    public static void A0z(C47490E4u e4u, Boolean bool) {
        Context requireContext = e4u.requireContext();
        UserSession userSession = e4u.A02;
        Bitmap bitmap = e4u.A00;
        boolean booleanValue = bool.booleanValue();
        0qQ.A0B(userSession, 1);
        if (bitmap != null) {
            C48366EdN.A00(requireContext, bitmap, new C47697EDg(requireContext, 2), userSession, 1ES.A01(), booleanValue);
        }
    }

    public static void A10(Object obj, int i) {
        0f9 A00 = 0wj.A00(obj.getClass().getSimpleName(), i, true);
        A00.ABQ("su_check_timeout_event", "Checking whether there is a cache timeout event.");
        A00.report();
    }

    public static boolean A11(Context context) {
        return 0oI.A0I(context.getPackageManager(), Dbq.A05(159, 38, 122));
    }

    public static boolean A13(String str, int i) {
        if (0qQ.A00(str.charAt(i), 32) <= 0) {
            return true;
        }
        return false;
    }
}

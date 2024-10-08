package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.AudioAttributes;
import android.os.BaseBundle;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.media.AudioAttributesCompat;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.hyperthrift.HyperThriftBase$Builder;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.MXo  reason: case insensitive filesystem */
public abstract class C66583MXo {
    public static float A00(float f) {
        return (float) Math.min(Math.max((double) f, 0.0d), 1.0d);
    }

    public static LayoutInflater A09(LayoutInflater layoutInflater, Fragment fragment) {
        0qQ.A0B(layoutInflater, 0);
        if (fragment.requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID") != 0) {
            return layoutInflater.cloneInContext(new ContextThemeWrapper(fragment.getContext(), fragment.requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID")));
        }
        return layoutInflater;
    }

    public static View A0A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        return inflate;
    }

    public static 02M A0F(04k r2) {
        0qQ.A0B(r2, 1);
        02M A05 = r2.A00.A05(7);
        0qQ.A07(A05);
        return A05;
    }

    public static C3263576k A0I(0Aj r2, DirectThreadAnalyticsParams directThreadAnalyticsParams, Long l) {
        r2.A9F("thread_size", l);
        if (directThreadAnalyticsParams != null) {
            return directThreadAnalyticsParams.A02;
        }
        return null;
    }

    public static AnonymousClass3NG A0N(View view) {
        AnonymousClass3NG r0 = new AnonymousClass3NG(view);
        r0.A06 = false;
        return r0;
    }

    public static AnonymousClass7L2 A0V(AnonymousClass7LE r2, Object obj) {
        AnonymousClass7L2 r0 = r2.A04;
        0qQ.A0B(obj, 0);
        return r0;
    }

    public static DirectThreadAnalyticsParams A0W(AnonymousClass7LQ r2, C254703su r3) {
        if (r3.A1c()) {
            return null;
        }
        AnonymousClass7SD r1 = r2.A0G;
        0qQ.A07(r1);
        return C3263376i.A00(r1, r3.A2G);
    }

    public static C294975nL A0Y(View view) {
        C294975nL A01 = C294975nL.A01(view, 1);
        A01.A0G();
        return A01.A0D(new AccelerateInterpolator()).A0C(200);
    }

    public static Long A0f(DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        if (directThreadAnalyticsParams != null) {
            return Long.valueOf(directThreadAnalyticsParams.A01);
        }
        return null;
    }

    public static Object A0h(C61770pa r1) {
        0qQ.A0B(r1, 0);
        return 00k.A0J(r1.Bm6());
    }

    public static String A0i(UserSession userSession, AnonymousClass7LQ r2, Object obj, boolean z) {
        0qQ.A0B(obj, 5);
        boolean A00 = AnonymousClass760.A00(userSession, z);
        C254703su r0 = r2.A0e;
        if (!A00) {
            return r0.A0h();
        }
        return r0.A0i();
    }

    public static void A0p() {
        0qQ.A0B((Object) null, 0);
    }

    public static void A0r(Context context, TypedArray typedArray, TextView textView, int i) {
        int resourceId = typedArray.getResourceId(2, i);
        if (resourceId != 0) {
            textView.setImeActionLabel(context.getText(resourceId), textView.getImeActionId());
        }
    }

    public static void A0u(Parcel parcel, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, int i) {
        if (directMessageInteropReachabilityOptions == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        directMessageInteropReachabilityOptions.writeToParcel(parcel, i);
    }

    public static void A1B(1Ln r2) {
        r2.A0Z(8);
        r2.A0X(0);
    }

    public static void A1O(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MFR(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static boolean A1Y(View view) {
        0qQ.A0B(view, 0);
        return view.isEnabled();
    }

    public static byte[] A1b(byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public static int A01(int i) {
        return (527 + i) * 31;
    }

    public static int A02(long j) {
        return (int) (((new Date().getTime() - new Date(j * 1000).getTime()) / 1000) / 60);
    }

    public static Intent A08(Context context, UserSession userSession) {
        Intent intent = new Intent(context, RtcCallIntentHandlerActivity.class);
        intent.setAction("rtc_call_activity_intent_action_open_ongoing_call");
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        intent.putExtra("rtc_call_activity_intent_action_open_ongoing_call_entrypoint", "resume_ongoing_notification");
        return intent;
    }

    public static ViewPropertyAnimator A0D(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.setDuration(150).setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static 0Aj A0H(0lg r2) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(r2);
        r1.A01 = "direct_inbox";
        0wc A00 = r1.A00();
        return A00.A00(A00.A00, "direct_inbox_action");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.fbwebrtc.multiway.RtcMessageHeader, com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    public static RtcMessageHeader A0J(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        Object[] A01 = HyperThriftBase$Builder.A01(objArr);
        HyperThriftBase$Builder.A00(A01, 6);
        HyperThriftBase$Builder.A00(A01, 21);
        ? obj2 = new Object();
        obj2.A02("com.facebook.fbwebrtc.multiway.RtcMessageHeader", A01);
        return obj2;
    }

    public static UserSession A0M(Object obj) {
        return ((C66633Ma2) obj).A0p();
    }

    public static C72195OyG A0Q(AnonymousClass7IQ r0) {
        return (C72195OyG) r0.A02.getValue();
    }

    public static C72196OyH A0R(AnonymousClass7IQ r0) {
        return (C72196OyH) r0.A04.getValue();
    }

    public static C67754Mu9 A0S(C69180NgT ngT) {
        return (C67754Mu9) ngT.A04.getValue();
    }

    public static AnonymousClass7AO A0T(C327387Ao r1, AnonymousClass7B5 r2, AnonymousClass7B2 r3, AnonymousClass7AN r4) {
        return new AnonymousClass7AO(r1, r2, r3, r4);
    }

    public static C3257674b A0U(C327367Am r1) {
        return new C3257674b(r1);
    }

    public static AnonymousClass9HR A0X(DirectShareTarget directShareTarget) {
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        return AnonymousClass6W3.A03(r0);
    }

    public static IllegalStateException A0Z() {
        return new IllegalStateException("Not yet implemented");
    }

    public static IllegalStateException A0a() {
        return new IllegalStateException("Stub");
    }

    public static IllegalStateException A0b(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected model type ");
        sb.append(obj.getClass());
        return new IllegalStateException(sb.toString());
    }

    public static Integer A0c(int i, int i2) {
        if (i == i2) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static Object A0g(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        0qQ.A0B(mailboxNullable, 0);
        return mailboxNullable.value;
    }

    public static StringBuilder A0j(Object obj, Object obj2, Object obj3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("isViewInflated: ");
        sb.append(obj);
        sb.append(" \nfoundContainerBefore: ");
        sb.append(obj2);
        sb.append(" \nexistingFragment: ");
        sb.append(obj3);
        sb.append(" \nbackstack entry count: ");
        sb.append(i);
        sb.append(" \nExisting fragments on fragmentManager: ");
        return sb;
    }

    public static LinkedHashMap A0m(SEB seb, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SUU.A0A(seb, linkedHashMap);
        if (z) {
            linkedHashMap.put("is_reload", String.valueOf(z));
        }
        return linkedHashMap;
    }

    public static void A0s(Context context, View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C50989Fmc(context, onClickListener, i, i2));
    }

    public static void A0t(BaseBundle baseBundle, Enum enumR, String str, long j) {
        baseBundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT", str);
        baseBundle.putLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS", j);
        baseBundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CONTENT_TYPE_ORDINAL", enumR.ordinal());
    }

    public static void A10(AnonymousClass52S r3, AnonymousClass52U r4, int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        int A0A = r3.A0A(Math.max(Math.abs(i2), Math.abs(i3)));
        if (A0A > 0) {
            r4.A00(r3.A06, i2, i3, A0A);
        }
    }

    public static void A11(AnonymousClass0Ac r1, 0Ak r2, String str, String str2) {
        r2.A0M(r1, "source");
        r2.A0M(C69433Nld.A02, "prompt_type");
        r2.A0R("prompt_id", str);
        r2.A0R("open_thread_id", str2);
        r2.Cgf();
    }

    public static void A13(0Aj r1, 0bb r2) {
        r1.AAK(r2, "poll");
        r1.Cgf();
    }

    public static void A17(0Aj r1, Long l) {
        r1.A9F("consistent_thread_fbid", l);
        r1.Cgf();
    }

    public static void A18(0Aj r1, Map map) {
        r1.A9H("extra", map);
        r1.Cgf();
    }

    public static void A19(0Ak r2, PushInfraMetaData pushInfraMetaData, String str, long j) {
        r2.A0R("notif_event_log_flag", str);
        r2.A0Q("push_usecase_id", Long.valueOf(j));
        r2.A0R("pi_nid", pushInfraMetaData.A07);
    }

    public static void A1F(1Fa r1, String str, String str2) {
        r1.A0E = str;
        r1.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
    }

    public static void A1G(C309516Yo r0, String str) {
        r0.A0A = str;
        r0.A08();
        r0.A04();
    }

    public static void A1J(CharSequence charSequence, AbstractCollection abstractCollection) {
        abstractCollection.add(new C46448DfA(charSequence));
    }

    public static void A1N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        0qQ.A0B(obj, 27);
        0qQ.A0B(obj2, 28);
        0qQ.A0B(obj3, 29);
        0qQ.A0B(obj4, 30);
        0qQ.A0B(obj5, 31);
    }

    public static void A1U(Throwable th) {
        0KC.A0F("SuccessResponse", "json serialization error", th);
    }

    public static boolean A1a(Object obj, Object obj2) {
        return 0qQ.A0K(((C279864zZ) obj).A0H, obj2);
    }

    public static int A03(Fragment fragment) {
        return fragment.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE");
    }

    public static int A04(Fragment fragment, float f) {
        return (int) C61380mr.A00(fragment.requireContext(), f);
    }

    public static int A05(ImmutableMap immutableMap, Object obj, Object obj2) {
        return ((Number) immutableMap.getOrDefault(obj, obj2)).intValue();
    }

    public static int A06(String str) {
        return (527 + str.hashCode()) * 31;
    }

    public static Context A07(Fragment fragment, Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        return fragment.requireContext();
    }

    public static View A0B(Fragment fragment, int i) {
        View findViewById = fragment.requireView().findViewById(i);
        0qQ.A0A(findViewById);
        return findViewById;
    }

    public static ViewGroup A0C(AnonymousClass0eM r0) {
        return (ViewGroup) r0.getValue();
    }

    public static ViewPropertyAnimator A0E(ViewPropertyAnimator viewPropertyAnimator, float f) {
        return viewPropertyAnimator.scaleX(f).scaleY(f).setDuration(250);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.media.AudioAttributesImpl, java.lang.Object, androidx.media.AudioAttributesImplApi21] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat A0G(AudioAttributes.Builder builder) {
        AudioAttributes build = builder.build();
        ? obj = new Object();
        obj.A01 = build;
        obj.A00 = -1;
        ? obj2 = new Object();
        obj2.A00 = obj;
        return obj2;
    }

    public static C250663lr A0K(List list) {
        return (C250663lr) ((C53398GnV) 00k.A0I(list)).A02;
    }

    public static C232232tF A0L(AnonymousClass0eM r0) {
        return (C232232tF) r0.getValue();
    }

    public static CommonMediaTransport A0O(R4O r4o) {
        r4o.A04();
        return (CommonMediaTransport) r4o.A00;
    }

    public static C313756gx A0P(AnonymousClass0eM r0) {
        return C313746gw.A00((UserSession) r0.getValue());
    }

    public static Integer A0d(C68495NKo nKo) {
        AnonymousClass3U9 A0F = nKo.A0F();
        if (A0F != null) {
            return Integer.valueOf(A0F.AdN());
        }
        return null;
    }

    public static Long A0e(1Ln r0, String str, String str2, String str3) {
        r0.A0o(str);
        r0.A0s(str2);
        if (str3 != null) {
            return 00y.A0n(10, str3);
        }
        return null;
    }

    public static ArrayList A0k(05G r0) {
        return 00k.A0U((Collection) r0.getValue());
    }

    public static Iterator A0l(05G r0) {
        return ((Iterable) r0.getValue()).iterator();
    }

    public static LinkedHashMap A0n(05G r0) {
        return 0Yt.A03((Map) r0.getValue());
    }

    public static AnonymousClass0r6 A0o(AnonymousClass12V r0, AnonymousClass0r6 r1, int i, int i2) {
        return 11M.A01(r0.AOJ(i, i2), r1);
    }

    public static void A0q(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 22);
        0qQ.A0B(obj3, 23);
        0qQ.A0B(obj4, 24);
    }

    public static void A0v(View view, float f, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A07(layoutParams);
        layoutParams.height = (int) Math.ceil((double) f);
        layoutParams.width = (int) Math.ceil((double) f2);
        view.setLayoutParams(layoutParams);
    }

    public static void A0w(TextView textView, float f) {
        textView.setWidth((int) (((float) textView.getWidth()) * f));
        textView.setHeight(textView.getHeight());
    }

    public static void A0x(TextView textView, AnonymousClass7L0 r5) {
        Resources resources = textView.getResources();
        textView.setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size), resources.getDimensionPixelSize(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size), resources.getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding), 0);
        textView.setTextColor(r5.A0C);
    }

    public static void A0y(TextView textView, String str, String str2) {
        textView.setText(002.A0R(str, str2));
    }

    public static void A0z(Fragment fragment) {
        2db.A02(fragment.requireActivity(), 2Yu.A0F(fragment.requireContext(), R.attr.statusBarBackgroundColor));
    }

    public static void A12(0Aj r2, long j) {
        r2.A9F(TraceFieldType.Duration, Long.valueOf(j));
    }

    public static void A14(0Aj r2, AnonymousClass6BJ r3) {
        r2.AAJ("platform", MYV.A04(r3));
        r2.AAK(MYV.A00(r3), "messaging_data");
        r2.AAe("push_token_fbid", MYV.A07(r3));
        r2.AAJ("push_infra_notif_id", r3.A0J);
    }

    public static void A15(0Aj r2, AnonymousClass6BJ r3, String str, String str2) {
        String str3;
        r2.AAJ(str, str2);
        MYV myv = MYV.A01;
        if (14i.A08()) {
            str3 = AppStateModule.APP_STATE_BACKGROUND;
        } else {
            str3 = "foreground";
        }
        r2.AAJ("app_state", str3);
        r2.AAJ("app_startup_type", MYV.A02());
        r2.AAJ("render_target", MYV.A06(r3));
    }

    public static void A16(0Aj r2, C254783t2 r3) {
        r2.AAJ("open_thread_id", AnonymousClass4KK.A02(r3));
        r2.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r3));
    }

    public static void A1A(0bb r2, long j) {
        r2.A05("result_index", Long.valueOf(j));
    }

    public static void A1C(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, String str2, int i, int i2) {
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, str2);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.FailureReason, str2);
    }

    public static void A1D(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, String str2, int i, int i2) {
        lightweightQuickPerformanceLogger.markerPoint(i, i2, str);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.FailureReason, str2);
    }

    public static void A1E(UserFlowLogger userFlowLogger, String str, String str2, long j) {
        userFlowLogger.flowMarkPoint(j, 002.A0R(str, str2));
    }

    public static void A1H(02m r5, String str, int i) {
        r5.markerStart(694558626, i);
        r5.markerAnnotate(694558626, i, "endpoint", 0LA.A00());
        r5.markerAnnotate(694558626, i, "asl_session_id", 0LA.A01());
        r5.markerAnnotate(694558626, i, "activityClass", 002.A0g("<cls>", str, "</cls>"));
        r5.markerAnnotate(694558626, i, "method_class", 002.A0g("<cls>", str, "</cls>"));
    }

    public static void A1I(UserSession userSession, Integer num, Object obj) {
        1Zl.A00(userSession, num, obj.toString());
    }

    public static void A1K(Enum enumR, int[] iArr, int i) {
        iArr[enumR.ordinal()] = i;
    }

    public static void A1L(Integer num, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new LongPressActionData((LongPressActionLabelSpan) null, C69376NkG.A09, num, Integer.valueOf(i), str, (String) null));
    }

    public static void A1M(Integer num, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new LongPressActionData((LongPressActionLabelSpan) null, C69376NkG.A07, num, Integer.valueOf(i), str, (String) null));
    }

    public static void A1P(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", contextReplyMessageDecorationsViewModel=");
    }

    public static void A1Q(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", commonMessageDecorationsViewModel=");
    }

    public static void A1R(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", contextContentViewModel=");
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", contentViewModel=");
    }

    public static void A1T(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", replyContentViewModel=");
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Integer.toHexString(Integer.parseInt((String) it.next())));
    }

    public static boolean A1W(int i, Object obj) {
        return 0qQ.A0K(obj, Integer.valueOf(i));
    }

    public static boolean A1X(Context context, TypedArray typedArray, View view) {
        0qQ.A07(typedArray);
        int resourceId = typedArray.getResourceId(3, 0);
        if (resourceId != 0) {
            view.setContentDescription(context.getText(resourceId));
        }
        return false;
    }

    public static boolean A1Z(C66633Ma2 ma2) {
        return ma2.A0v().A0C.A0V(ma2.A0t(), C66633Ma2.A05(ma2));
    }
}

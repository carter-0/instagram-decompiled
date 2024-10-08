package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.MXp  reason: case insensitive filesystem */
public abstract class C66584MXp {
    public static int A01(int i, int i2, int i3, int i4) {
        return (i2 + ((i - i2) / 2)) - (i4 + ((i3 - i4) / 2));
    }

    public static View A09(Context context) {
        0qQ.A0B(context, 0);
        View view = new View(context);
        view.setVisibility(8);
        return view;
    }

    public static AnonymousClass7EZ A0L(LayoutInflater layoutInflater, ViewGroup viewGroup, C327997Da r3) {
        0qQ.A0B(r3, 1);
        AnonymousClass7EZ A01 = r3.createViewHolder(layoutInflater, viewGroup);
        0qQ.A07(A01);
        return A01;
    }

    public static Long A0R(AnonymousClass0Ac r2, 0Aj r3, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        r3.A8M(r2, "direct_source");
        if (directThreadAnalyticsParams != null) {
            return Long.valueOf(directThreadAnalyticsParams.A00);
        }
        return null;
    }

    public static String A0Z(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public static void A0j(TextView textView, AnonymousClass7L0 r6) {
        Resources resources = textView.getResources();
        textView.setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size), resources.getDimensionPixelSize(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size), resources.getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding), 0);
        textView.setTextColor(r6.A0C);
    }

    public static void A0k(Fragment fragment, 06p r2) {
        r2.A0I((String) null);
        r2.A0A(fragment, R.id.fragment_container);
        r2.A00();
    }

    public static float A00(Fragment fragment, NotesCreationBubbleView notesCreationBubbleView) {
        float f = (86.0f - 0.0f) / 0.75f;
        notesCreationBubbleView.A00.getLayoutParams().width = (int) C61380mr.A00(fragment.requireContext(), f);
        return f;
    }

    public static int A02(int i, int i2, int i3, int i4) {
        if (Math.abs(i - i2) < Math.abs(i - i3)) {
            return i4;
        }
        return i3;
    }

    public static int A06(0yN r3, 0yN r4) {
        String str = r3.universeName;
        String str2 = r4.universeName;
        if (!str.equalsIgnoreCase(str2)) {
            return str.compareTo(str2);
        }
        String str3 = r3.name;
        if ("is_enabled".equals(str3)) {
            return -1;
        }
        String str4 = r4.name;
        if ("is_enabled".equals(str4)) {
            return 1;
        }
        return str3.compareTo(str4);
    }

    public static 0Aj A0B(0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(new 0xG("igd_locked_chat"), r2);
        return A01.A00(A01.A00, "igd_locked_chat_events");
    }

    public static 0Df A0E(Object obj, Object obj2) {
        0Df A02 = GraphQlCallInput.A02.A02();
        0Df.A00(A02, obj, "product_use_case");
        0Df.A00(A02, obj2, "fbid");
        return A02;
    }

    public static AnonymousClass9J6 A0F(MessagingUser messagingUser, String str) {
        String str2 = messagingUser.A03;
        0qQ.A07(str2);
        return new AnonymousClass9J6(str, str2, 5);
    }

    public static C61072JwA A0G(Integer num, Integer num2, String str, int i, int i2) {
        return new C61072JwA(i2, 11, (Object) new C61901KQu(new GSY(num, num2, "sticker", (String) null, 4), str, i));
    }

    public static 1aU A0H(C69183NgW ngW) {
        UserSession userSession = (UserSession) ngW.A02.getValue();
        return AnonymousClass6AN.A02(userSession, AnonymousClass61K.DEV_OPTIONS, AnonymousClass45R.A00(userSession)).A00();
    }

    public static C69177NgP A0K(Parcelable parcelable) {
        C69177NgP ngP = new C69177NgP();
        Bundle bundle = new Bundle();
        bundle.putParcelable("BANNER_VIEW_MODEL", parcelable);
        ngP.setArguments(bundle);
        return ngP;
    }

    public static DirectShareTarget A0P(0lg r3, DirectShareTarget directShareTarget, C254783t2 r5) {
        if (182.A06(0Tu.A05, r3, 36313763805661419L)) {
            return new DirectShareTarget(r5, (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0));
        }
        return directShareTarget;
    }

    public static String A0S() {
        return MYP.A01(9, 8, 18);
    }

    public static String A0T(0Aj r2, C55868Hop hop) {
        r2.AAJ("container_module", hop.A00.getModuleName());
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0W(C68314NAb nAb, Object obj, byte[] bArr) {
        17k.A07(obj, "Failed to resolve preview ID");
        if (bArr == null) {
            return null;
        }
        String A03 = C304566Ea.A03(nAb, bArr);
        17k.A07(A03, "Failed to resolve header attribution ID");
        return A03;
    }

    public static String A0Y(Object obj) {
        0eP r1 = (0eP) obj;
        0qQ.A0B(r1, 0);
        return ((C254703su) r1.A00).A0g();
    }

    public static HttpURLConnection A0d(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        0qQ.A0C(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }

    public static HashMap A0e(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, obj);
        hashMap.put("is_pending", String.valueOf(z));
        return hashMap;
    }

    public static LinkedHashMap A0f(QDN qdn) {
        SEB A03 = qdn.A1Q.A03();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SUU.A0A(A03, linkedHashMap);
        return linkedHashMap;
    }

    public static Map A0g(DirectPromptTypes directPromptTypes) {
        return 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01));
    }

    public static void A0h(Activity activity, AnonymousClass0iw r2, UserSession userSession, DirectMessageSearchMessage directMessageSearchMessage, C254783t2 r5) {
        1pE A01 = 1pE.A01(activity, r2, userSession, "direct_message_search");
        A01.A0B = r5;
        A01.A0Y = directMessageSearchMessage.A07;
        A01.A0I = Long.valueOf(directMessageSearchMessage.A00);
        A01.A0J = Long.valueOf(directMessageSearchMessage.A01);
        A01.A0l = directMessageSearchMessage.A03;
        A01.A06();
    }

    public static void A0i(View view, C249703kE r3, int i, int i2) {
        view.setPadding(i, i2, r3.itemView.getPaddingRight(), r3.itemView.getPaddingBottom());
    }

    public static void A0m(AnonymousClass0Ac r1, AnonymousClass0Ac r2, 0Aj r3, String str) {
        r3.AAJ(TraceFieldType.AdhocEventName, str);
        r3.A8M(r1, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r3.A8M(r2, "user_role");
    }

    public static void A0n(AnonymousClass0Ac r1, 0Aj r2, String str, String str2) {
        r2.AAJ(TraceFieldType.RequestID, str);
        r2.A8M(r1, "tray_type");
        r2.AAJ("bottom_sheet_session_id", str2);
    }

    public static void A0o(AnonymousClass0Ac r1, 0Ak r2, String str, boolean z) {
        r2.A0M(r1, "thread_type");
        r2.A0O("is_e2ee", Boolean.valueOf(z));
        r2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
    }

    public static void A0p(0Aj r2, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        r2.A9F("thread_size", Long.valueOf(directThreadAnalyticsParams.A01));
        r2.A8M(directThreadAnalyticsParams.A02, "direct_source");
        r2.A9F("consistent_thread_fbid", Long.valueOf(directThreadAnalyticsParams.A00));
        r2.Cgf();
    }

    public static void A0s(0Aj r2, C55868Hop hop, String str) {
        r2.AAJ("nav_chain", str);
        r2.AAJ("search_session_id", hop.A05);
        r2.AAJ("serp_session_id", hop.A06);
        r2.AAJ("rank_token", hop.A02.E4z());
        r2.AAJ("query_text", hop.A04);
    }

    public static void A0t(0Aj r2, Long l, String str, String str2, String str3) {
        r2.AAJ("message_id", str);
        r2.A9F("sender_id", l);
        r2.AAJ("bot_response_id", str2);
        r2.A8M(XSV.A02, "thread_type");
        r2.AAJ("thread_session_id", str3);
    }

    public static void A0u(0Aj r3, String str) {
        r3.AAJ(C67009Mgh.A01(9, 10, 4), str);
    }

    public static void A0v(0Aj r2, String str) {
        r2.AAJ(TraceFieldType.AdhocEventName, str);
        r2.A8M(C69483NmR.IN_THREAD, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r2.A8M(C69459Nm3.RECEIVER, "user_role");
    }

    public static void A0x(0Aj r1, String str, String str2, String str3) {
        r1.AAJ("action", str);
        r1.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        r1.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        r1.Cgf();
    }

    public static void A0y(0Aj r2, List list, boolean z) {
        r2.AAe("data_sources", list);
        r2.A7p("impression_selected", Boolean.valueOf(z));
    }

    public static void A0z(0bb r2, String str, boolean z) {
        r2.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r2.A03("is_xac_thread", Boolean.valueOf(z));
    }

    public static void A13(0wc r1, String str, String str2) {
        0Aj A00 = r1.A00(r1.A00, str);
        if (A00.isSampled()) {
            A00.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A00.A7p("is_e2ee", true);
            A00.Cgf();
        }
    }

    public static void A14(UserSession userSession, AnonymousClass74W r1) {
        C370538wd r12 = r1.A02;
        if (r12 != null) {
            1bJ.A00(userSession).FKz(r12);
        }
    }

    public static void A15(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj, 46);
        0qQ.A0B(obj2, 47);
        0qQ.A0B(obj3, 52);
    }

    public static void A16(String str, String str2, String str3) {
        0f9 AEf = 0wj.A01.AEf("Message fails to be rebuilt from payload", 20123732);
        AEf.ABQ("fetchReason", "message_receive");
        AEf.ABQ("threadId", str);
        AEf.ABQ("messageId", str2);
        AEf.ABQ("error", str3);
        AEf.report();
    }

    public static int A03(View view) {
        return (int) (((float) ((view.getLeft() + view.getRight()) / 2)) + view.getTranslationX());
    }

    public static int A04(View view) {
        return (int) (((float) ((view.getTop() + view.getBottom()) / 2)) + view.getTranslationY());
    }

    public static int A05(Fragment fragment) {
        return fragment.requireContext().getColor(2Yu.A0B(fragment.getContext()));
    }

    public static int A07(AnonymousClass0eM r0) {
        2Eq r02 = (2Eq) r0.getValue();
        if (r02 != null) {
            return r02.C6a();
        }
        return 0;
    }

    public static PointF A08(MotionEvent motionEvent) {
        return new PointF(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public static View A0A(Fragment fragment, int i) {
        View findViewById = fragment.requireView().findViewById(i);
        0qQ.A0A(findViewById);
        0qQ.A07(findViewById);
        return findViewById;
    }

    public static 0Aj A0C(0lg r2) {
        0wc A02 = AnonymousClass0kN.A02(r2);
        return A02.A00(A02.A00, "mwb_odnc_interaction_event");
    }

    public static 1Ln A0D(AnonymousClass0eM r0) {
        return 1Ln.A0J(((AnonymousClass7I3) r0.getValue()).A01);
    }

    public static Media A0I(R4O r4o, R4O r4o2) {
        r4o.A04();
        Media media = (Media) r4o.A00;
        R5b A02 = r4o2.A02();
        A02.getClass();
        media.media_ = A02;
        return media;
    }

    public static TransportPayload A0J(R4O r4o, R4O r4o2) {
        r4o.A04();
        TransportPayload transportPayload = (TransportPayload) r4o.A00;
        R5b A02 = r4o2.A02();
        A02.getClass();
        transportPayload.transportPayload_ = A02;
        return transportPayload;
    }

    public static AnonymousClass9HC A0M(AnonymousClass9HD r2, AnonymousClass0eM r3) {
        Parcelable.Creator creator = Capabilities.CREATOR;
        return r2.A00((UserSession) r3.getValue(), C376189Gz.A00(0sn.A00));
    }

    public static AnonymousClass3U9 A0N(C68495NKo nKo) {
        return 1bJ.A00(nKo.A0D()).B33(nKo.A0G());
    }

    public static IgdsHeadline A0O(View view) {
        View requireViewById = view.requireViewById(R.id.headline);
        0qQ.A07(requireViewById);
        return (IgdsHeadline) requireViewById;
    }

    public static I4Z A0Q(AnonymousClass0eM r0) {
        return (I4Z) ((C53033GhO) r0.getValue()).A0B.getValue();
    }

    public static String A0U(CQLResultSet cQLResultSet, int i, int i2) {
        Integer nullableInteger = cQLResultSet.getNullableInteger(i, i2);
        if (nullableInteger != null) {
            return Integer.toHexString(nullableInteger.intValue());
        }
        return null;
    }

    public static String A0V(CQLResultSet cQLResultSet, int i, int i2) {
        Integer nullableInteger = cQLResultSet.getNullableInteger(i, i2);
        if (nullableInteger != null) {
            return Integer.toHexString(nullableInteger.intValue());
        }
        return null;
    }

    public static String A0X(Number number) {
        if (number.intValue() != 0) {
            return "invited";
        }
        return "accepted";
    }

    public static String A0a(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public static String A0b(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public static StringBuilder A0c(Object obj, StringBuilder sb, StringBuilder sb2) {
        sb.append(obj);
        sb2.append(sb.toString());
        return new StringBuilder();
    }

    public static void A0l(Fragment fragment, NJY njy) {
        C309516Yo r1 = new C309516Yo(njy.requireActivity(), njy.A0N());
        r1.A0D(fragment);
        r1.A0A = NJY.__redex_internal_original_name;
        r1.A08();
        r1.A04();
    }

    public static void A0q(0Aj r2, C254793t3 r3) {
        if (C300965yF.A02(r3) != null) {
            r2.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C300965yF.A01(r3).A00);
        }
    }

    public static void A0r(0Aj r2, C254783t2 r3) {
        r2.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r3));
        r2.AAJ("open_thread_id", AnonymousClass4KK.A02(r3));
    }

    public static void A0w(0Aj r2, String str, String str2, String str3) {
        r2.AAJ(str, str2);
        r2.AAJ("session_instance_id", str3);
        r2.AAJ("feed_type", "trending");
    }

    public static void A10(1Ln r1, String str, String str2, long j) {
        r1.A0h(Long.valueOf(j));
        r1.A0l(str);
        r1.A0k(str2);
    }

    public static void A11(16F r1, AbstractCollection abstractCollection) {
        C16622UyI uyI = (C16622UyI) EnumHelper.A00(r1.A1Q(), C16622UyI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (uyI != null) {
            abstractCollection.add(uyI);
        }
    }

    public static void A12(1NY r2, String str, String str2, String str3, String str4) {
        r2.A02();
        r2.A0A("api/v1/direct_v2/collection/grid_view_items/");
        r2.A0Q(C43819CEl.class, C45567Cyf.class);
        r2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        r2.A9m("client_context", str2);
        r2.A9m("collection_type", str3);
        r2.A9m("collection_id", str4);
    }

    public static void A17(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((Uri) it.next()).getPath());
    }

    public static void A18(Iterator it, JSONObject jSONObject) {
        Map.Entry entry = (Map.Entry) it.next();
        jSONObject.put((String) entry.getKey(), entry.getValue());
    }
}

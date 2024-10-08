package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.BaseBundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.util.NotificationScope;
import com.google.common.collect.ImmutableCollection;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.rtc.presentation.arsidebar.ArSidebarButton;
import com.instagram.rtc.rsys.models.ParticipantModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: X.MXl  reason: case insensitive filesystem */
public abstract class C66580MXl {
    public static int A02(double d, double d2) {
        return AnonymousClass1GB.A00(d * d2);
    }

    public static UserSession A0Q(C68449NIn nIn) {
        UserSession A0i = nIn.A0i();
        0qQ.A0B(A0i, 0);
        return A0i;
    }

    public static DirectThreadKey A0h(16F r2) {
        DirectThreadKey parseFromJson = C254733sx.parseFromJson(r2);
        0qQ.A0B(parseFromJson, 0);
        return parseFromJson;
    }

    public static Integer A0q() {
        return 2;
    }

    public static 01B A16(Class cls, String str, String str2) {
        return new 01B(cls, str, str2, 0);
    }

    public static void A1F(TextView textView, Context context) {
        textView.setMaxWidth(AnonymousClass7PV.A00(context, false));
    }

    public static boolean A1Y(Object obj) {
        0qQ.A0B(obj, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return false;
    }

    public static int A04(C301345z0 r0) {
        return r0.mResultSet.getCount();
    }

    public static Context A09(Object obj) {
        return ((View) obj).getContext();
    }

    public static Intent A0A(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public static Rect A0C(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3, i4);
    }

    public static SpannableString A0D(CharSequence charSequence) {
        return new SpannableString(charSequence);
    }

    public static ForegroundColorSpan A0E(int i) {
        return new ForegroundColorSpan(i);
    }

    public static AnonymousClass68L A0F(MailboxFeature mailboxFeature, int i) {
        return mailboxFeature.mMailboxApiHandleMetaProvider.ASa(i);
    }

    public static MailboxFutureImpl A0G(AnonymousClass68L r1) {
        return new MailboxFutureImpl(r1);
    }

    public static T5L A0K(R5b r5b) {
        return new T5L(r5b);
    }

    public static 0wc A0N(AnonymousClass0kM r0, String str) {
        r0.A01 = str;
        return r0.A00();
    }

    public static 1a8 A0O() {
        return new 1a8(C318146oT.A01);
    }

    public static AnonymousClass7FT A0Y(Context context, UserSession userSession, AnonymousClass9HC r3, AnonymousClass7LQ r4, C254703su r5) {
        return AnonymousClass7FG.A00(context, userSession, r3, r4, r5.A10);
    }

    public static C242243Te A0b(Object obj) {
        return ((AnonymousClass3U9) obj).A01.A0s;
    }

    public static AnonymousClass3U9 A0d(Object obj, String str) {
        return ((2Dr) obj).A0N(str);
    }

    public static C254763t0 A0g(String str) {
        return new C254763t0(str);
    }

    public static MessageIdentifier A0i(String str, String str2) {
        return new MessageIdentifier(str, str2);
    }

    public static MsysThreadId A0j(Long l, long j) {
        return new MsysThreadId(C254923tH.ACT, l, j);
    }

    public static IllegalArgumentException A0p() {
        return new IllegalArgumentException("threadId can't be null");
    }

    public static String A0t(BaseBundle baseBundle) {
        return baseBundle.getString("collection_id");
    }

    public static String A0v(C301345z0 r0, int i, int i2) {
        return r0.mResultSet.getString(i, i2);
    }

    public static String A0y(Object obj) {
        return ((C254703su) obj).A0g();
    }

    public static String A10(String str, String str2) {
        return 002.A0T(str, str2, ' ');
    }

    public static UnsupportedOperationException A11() {
        return new UnsupportedOperationException();
    }

    public static HashSet A12(Collection collection) {
        return new HashSet(collection);
    }

    public static C73594PgU A14(Object obj, int i) {
        return new C73594PgU(obj, i);
    }

    public static C73588PgO A15(Object obj, int i) {
        return new C73588PgO(obj, i);
    }

    public static JSONObject A17(String str) {
        return new JSONObject(str);
    }

    public static void A18() {
        0qQ.A0F("threadId");
        throw null;
    }

    public static void A19() {
        0qQ.A0F("recyclerView");
        throw null;
    }

    public static void A1J(0Aj r1, String str) {
        r1.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
    }

    public static void A1K(0Aj r1, String str) {
        r1.AAJ("open_thread_id", str);
    }

    public static void A1L(0Ak r1, String str) {
        r1.A0R("selected_item", str);
    }

    public static void A1N(NotificationScope notificationScope, Object obj, String str) {
        ((MailboxFutureImpl) obj).setNotification(str, notificationScope);
    }

    public static void A1R(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static boolean A1X(UserSession userSession, Object obj) {
        return 0qQ.A0K(userSession.A06, obj);
    }

    public static boolean A1Z(Object obj) {
        return "thread_key".equals(obj);
    }

    public static double A00(Rect rect) {
        return (double) rect.width();
    }

    public static double A01(Rect rect) {
        return (double) rect.height();
    }

    public static int A03(BroadcastReceiver broadcastReceiver, Context context, Intent intent, int i) {
        int A01 = AnonymousClass0fD.A01(i);
        AnonymousClass0fQ.A01(broadcastReceiver, context, intent);
        return A01;
    }

    public static int A05(AnonymousClass7S7 r0) {
        return r0.C6Q().A08;
    }

    public static int A06(String str) {
        0qQ.A07(str);
        return str.length();
    }

    public static long A07(C254793t3 r1) {
        return C300965yF.A03(r1).A00;
    }

    public static long A08(String str) {
        0qQ.A07(str);
        return Long.parseLong(str);
    }

    public static Resources A0B(View view) {
        Resources resources = view.getResources();
        0qQ.A07(resources);
        return resources;
    }

    public static C295115nb A0H(AccountSession accountSession) {
        return (C295115nb) accountSession.getNotificationCenterCallbackManager();
    }

    public static TraceInfo A0I(MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl, String str, String str2) {
        TraceInfo A01 = C3030067a.A01(mailboxFutureImpl, str, str2);
        mailboxFutureImpl.Eiu(mailboxCallback);
        return A01;
    }

    public static C249803kO A0J(ImmutableCollection immutableCollection) {
        C249803kO it = immutableCollection.iterator();
        0qQ.A07(it);
        return it;
    }

    public static R5b A0L(R4O r4o) {
        r4o.A04();
        return r4o.A00;
    }

    public static R5b A0M(R4O r4o) {
        R5b A02 = r4o.A02();
        0qQ.A07(A02);
        return A02;
    }

    public static UserSession A0P(C66633Ma2 ma2, int i) {
        UserSession A0p = ma2.A0p();
        0qQ.A0B(A0p, i);
        return A0p;
    }

    public static IgImageView A0R(AnonymousClass0eM r0) {
        return (IgImageView) r0.getValue();
    }

    public static SupplementMessagePayload A0S(TransportPayload transportPayload) {
        SupplementMessagePayload A0M = transportPayload.A0M();
        0qQ.A07(A0M);
        return A0M;
    }

    public static C72202OyR A0T(AnonymousClass0eM r0) {
        return (C72202OyR) r0.getValue();
    }

    public static C66913Mex A0U(AnonymousClass0eM r0) {
        return (C66913Mex) r0.getValue();
    }

    public static C333517Zg A0V(AnonymousClass0eK r0) {
        return (C333517Zg) r0.get();
    }

    public static C333517Zg A0W(C62320sa r0) {
        return (C333517Zg) r0.invoke();
    }

    public static C2614949u A0X(AnonymousClass0eM r0) {
        return (C2614949u) r0.getValue();
    }

    public static AnonymousClass7SD A0Z(AnonymousClass7S7 r0) {
        AnonymousClass7SD C6Q = r0.C6Q();
        0qQ.A07(C6Q);
        return C6Q;
    }

    public static C254703su A0a(Iterator it) {
        return (C254703su) it.next();
    }

    public static AnonymousClass2Ep A0c(Iterator it) {
        return (AnonymousClass2Ep) it.next();
    }

    public static 2Dm A0e(AnonymousClass0eM r0) {
        return (2Dm) r0.getValue();
    }

    public static N4t A0f(Iterator it) {
        return (N4t) it.next();
    }

    public static PendingRecipient A0k(Iterator it) {
        return (PendingRecipient) it.next();
    }

    public static C71139Odj A0l(AnonymousClass0eM r0) {
        return (C71139Odj) r0.getValue();
    }

    public static ArSidebarButton A0m(AnonymousClass0eM r0) {
        return (ArSidebarButton) r0.getValue();
    }

    public static ParticipantModel A0n(Iterator it) {
        return (ParticipantModel) it.next();
    }

    public static 0BQ A0o(0lg r0, Object obj) {
        0qQ.A07(obj);
        return AnonymousClass0BO.A00(r0);
    }

    public static Number A0r(AnonymousClass0eM r0) {
        return (Number) r0.getValue();
    }

    public static Object A0s(AnonymousClass0eK r0) {
        Object obj = r0.get();
        0qQ.A07(obj);
        return obj;
    }

    public static String A0u(AnonymousClass681 r0, int i) {
        return (String) r0.A00(i);
    }

    public static String A0w(C68495NKo nKo) {
        return nKo.A0G().A00;
    }

    public static String A0x(C254793t3 r0) {
        return C300965yF.A01(r0).A00;
    }

    public static String A0z(String str, int i) {
        String substring = str.substring(i);
        0qQ.A07(substring);
        return substring;
    }

    public static List A13(Object obj, Map map) {
        return (List) map.get(obj);
    }

    public static void A1A(View view) {
        view.animate().cancel();
    }

    public static void A1B(View view, int i) {
        view.getLayoutParams().height = i;
    }

    public static void A1C(View view, int i) {
        view.getLayoutParams().width = i;
    }

    public static void A1D(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
        viewPropertyAnimator.withEndAction(runnable).start();
    }

    public static void A1E(EditText editText) {
        editText.setSelection(editText.length());
    }

    public static void A1G(Fragment fragment) {
        C49960FGs.A03(fragment.getActivity());
    }

    public static void A1H(0Aj r1, String str) {
        r1.AAJ(C66643MaC.A00(), str);
    }

    public static void A1I(0Aj r1, String str) {
        r1.AAJ(C66955Mfo.A00(), str);
    }

    public static void A1M(0Df r1, GraphQlCallInput graphQlCallInput, String str) {
        r1.A0E(graphQlCallInput.A02(), str);
    }

    public static void A1O(1aT r1, boolean z) {
        r1.accept(Boolean.valueOf(z));
    }

    public static void A1P(UserSession userSession, 1OS r1) {
        1Ou.A01(userSession).A0A(r1);
    }

    public static void A1Q(C252063oV r0, int i) {
        r0.getView().setVisibility(i);
    }

    public static void A1S(Object obj, Object obj2) {
        0u4.A03(obj).remove(obj2);
    }

    public static void A1T(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static void A1U(String str, String str2, String str3) {
        0KC.A0D(str3, 002.A0R(str, str2));
    }

    public static void A1V(String str, String str2, StringBuilder sb) {
        sb.append(002.A0R(str, str2));
    }

    public static void A1W(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static boolean A1a(String str, int i, String str2) {
        0qQ.A0B(str, i);
        return str2.startsWith(str);
    }

    public static boolean A1b(Set set) {
        return !set.isEmpty();
    }
}

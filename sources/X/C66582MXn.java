package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebookpay.logging.LoggingContext;
import com.instagram.android.R;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.MXn  reason: case insensitive filesystem */
public abstract class C66582MXn {
    public static Drawable A0A(AnonymousClass7L2 r1) {
        0qQ.A0B(r1, 0);
        return r1.A03.A04();
    }

    public static SpannableStringBuilder A0C(UserSession userSession, CharSequence charSequence) {
        C253003q3 r0 = new C253003q3(new SpannableStringBuilder(charSequence), userSession);
        r0.A03((C253023q5) null);
        return r0.A00();
    }

    public static 02m A0M(Object obj) {
        0qQ.A0B(obj, 0);
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        return r0;
    }

    public static AnonymousClass7EZ A0T(LayoutInflater layoutInflater, ViewGroup viewGroup, C327997Da r3) {
        0qQ.A0B(r3, 3);
        return r3.createViewHolder(layoutInflater, viewGroup);
    }

    public static MsysActiveUserSession A0c(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 1y0.A00(userSession);
    }

    public static HashMap A0x(Object obj) {
        0qQ.A0B(obj, 0);
        return new HashMap();
    }

    public static void A1E(AnonymousClass68L r2, MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl) {
        if (!r2.EJd(mailboxCallback)) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public static boolean A1S(UserSession userSession, Object obj, boolean z) {
        0qQ.A0B(obj, 5);
        return AnonymousClass760.A00(userSession, z);
    }

    public static int A06(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 1;
    }

    public static int A07(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
    }

    public static Bundle A0B(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", parcelable);
        return bundle;
    }

    public static 0Aj A0H(0wc r1, String str, String str2) {
        0Aj A00 = r1.A00(r1.A00, str);
        A00.AAJ("open_thread_id", str2);
        return A00;
    }

    public static AnonymousClass68L A0I(Mailbox mailbox) {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        AnonymousClass68L r0 = mailbox.mSynchronousMailboxApiHandleProvider;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass68L r02 = new C68316NAd(mailbox).A00;
        mailbox.mSynchronousMailboxApiHandleProvider = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0bY] */
    public static MY3 A0J(Context context) {
        HashMap hashMap = MY3.A06;
        return MY3.A01(context, (ProviderInfo) null, new Object());
    }

    public static 0Sy A0K(Context context, Intent intent) {
        0Sy r1 = new 0Sy();
        r1.A0B(intent, context.getClassLoader());
        return r1;
    }

    public static AnonymousClass7FE A0U(UserSession userSession, AnonymousClass9HC r7, AnonymousClass7LQ r8, AnonymousClass7L2 r9, C254703su r10) {
        return AnonymousClass7FD.A04(userSession, r7, r8, r9, r10.A10, AnonymousClass0eN.A01(AnonymousClass7FC.A00));
    }

    public static AnonymousClass7FE A0V(UserSession userSession, AnonymousClass9HC r7, AnonymousClass7LQ r8, AnonymousClass7L2 r9, 2FW r10) {
        return AnonymousClass7FD.A04(userSession, r7, r8, r9, r10, AnonymousClass0eN.A01(AnonymousClass7FC.A00));
    }

    public static C331157Pu A0f(Fragment fragment) {
        return C48943Emh.A00(AnonymousClass37D.A00.A01(fragment.getActivity()));
    }

    public static Long A0l(long j) {
        return Long.valueOf(j * 1000);
    }

    public static Long A0m(C301345z0 r0, int i, int i2) {
        return Long.valueOf(r0.mResultSet.getLong(i, i2));
    }

    public static Object A0o(Context context) {
        Object systemService = context.getSystemService("keyguard");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return systemService;
    }

    public static Object A0p(Context context) {
        Object systemService = context.getSystemService("notification");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return systemService;
    }

    public static String A0t(C254703su r0, int i) {
        if (i != 0) {
            return r0.A0i();
        }
        return r0.A0h();
    }

    public static String A0u(C254703su r0, int i) {
        if (i == 0) {
            return r0.A0h();
        }
        return r0.A0i();
    }

    public static LinkedHashMap A0y(Object obj, Object obj2) {
        return 0Yt.A07(new 0eP[]{new 0eP(obj, obj2)});
    }

    public static void A15(View view, int i, int i2) {
        if (view != null) {
            view.setTranslationY((float) ((-i) - i2));
        }
    }

    public static void A16(Fragment fragment) {
        2dZ.A0t.A03(fragment.requireActivity()).A0T();
    }

    public static void A17(AnonymousClass0Ac r1, 0Ak r2, Map map) {
        r2.A0M(r1, "action");
        r2.A00.A9H("extra_info", map);
    }

    public static void A18(AnonymousClass0Ac r1, 0bb r2, C252323ov r3) {
        r2.A01(r1, "tracking_type");
        r2.A06("current_watching_module", r3.A00.getModuleName());
    }

    public static void A19(0Aj r2, String str) {
        r2.AAJ("event", str);
        r2.AAJ("surface", "inbox");
    }

    public static void A1I(C66633Ma2 ma2) {
        ((AnonymousClass3AD) ma2.A0z.getValue()).setIsLoading(false);
    }

    public static void A1K(C309556Ys r2) {
        r2.A02 = 0;
        r2.A01 = -1;
    }

    public static void A1M(Runnable runnable) {
        if (runnable != null) {
            0no.A00().A02(runnable);
        }
    }

    public static boolean A1Q(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36312707242132699L);
    }

    public static boolean A1R(UserSession userSession, C254703su r2) {
        return r2.A1j(AnonymousClass0t1.A01.A01(userSession));
    }

    public static boolean A1U(Object obj, long j) {
        return 0qQ.A0K(((C279864zZ) obj).A0H, String.valueOf(j));
    }

    public static byte[] A1a(String str) {
        byte[] bytes = str.getBytes(AnonymousClass15Q.A05);
        0qQ.A07(bytes);
        return bytes;
    }

    public static byte[] A1b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKeySpec);
        return instance.doFinal(bArr2);
    }

    public static float A00(AnonymousClass0eM r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A01(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public static int A02(Rect rect, double d) {
        return AnonymousClass1GB.A00(((double) rect.height()) * d);
    }

    public static int A03(Rect rect, double d) {
        return AnonymousClass1GB.A00(((double) rect.width()) * d);
    }

    public static int A04(View view, int i) {
        return (i - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A05(0Tu r0, 0lg r1, long j) {
        if (182.A06(r0, r1, j)) {
            return R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp;
        }
        return R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin;
    }

    public static int A08(Map.Entry entry) {
        return ((Number) entry.getValue()).intValue();
    }

    public static int A09(AnonymousClass0eM r0) {
        return ((View) r0.getValue()).getVisibility();
    }

    public static View A0D(AnonymousClass0eM r0) {
        return ((C71662eb) r0.getValue()).A01();
    }

    public static TextView A0E(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) inflate;
    }

    public static TextView A0F(View view) {
        View requireViewById = view.requireViewById(R.id.title);
        0qQ.A07(requireViewById);
        return (TextView) requireViewById;
    }

    public static CoroutineLiveData A0G(Object obj, C262224Cq r1, AnonymousClass0r6 r2, AnonymousClass109 r3) {
        return C226292g8.A00(19B.A00, 10b.A02(obj, r1, r2, r3));
    }

    public static BizUserInboxState A0L(UserSession userSession) {
        return C242003Sf.A00(String.valueOf(AnonymousClass4k9.A00(userSession).A02()));
    }

    public static 1aU A0N(1aU r1, String str) {
        return r1.A0P(AnonymousClass6F9.A00(str)).A0H();
    }

    public static C269794fh A0O(UserSession userSession, AnonymousClass438 r1) {
        return C318146oT.A00(r1.A00(userSession).A02());
    }

    public static UserSession A0P(C66633Ma2 ma2) {
        UserSession A0p = ma2.A0p();
        0qQ.A0B(A0p, 0);
        return A0p;
    }

    public static AddMessageContent A0Q(R4O r4o, R4O r4o2) {
        r4o.A04();
        AddMessageContent addMessageContent = (AddMessageContent) r4o.A00;
        R5b A02 = r4o2.A02();
        A02.getClass();
        addMessageContent.addMessageContent_ = A02;
        return addMessageContent;
    }

    public static SupplementMessageContent A0R(TransportPayload transportPayload) {
        SupplementMessageContent supplementMessageContent = transportPayload.A0M().content_;
        if (supplementMessageContent == null) {
            return SupplementMessageContent.DEFAULT_INSTANCE;
        }
        return supplementMessageContent;
    }

    public static C3018760k A0S(AnonymousClass0eM r0) {
        return C3018660j.A01((UserSession) r0.getValue());
    }

    public static AnonymousClass7ZY A0W(AnonymousClass0eK r0) {
        return ((C333517Zg) r0.get()).BSN();
    }

    public static AnonymousClass7SD A0X(AnonymousClass0eK r0) {
        return ((C333517Zg) r0.get()).C6l().C6Q();
    }

    public static AnonymousClass7DZ A0Y(AnonymousClass7DY r0, AnonymousClass7DY r1) {
        return new AnonymousClass7DZ(0sr.A1P(new AnonymousClass7DY[]{r0, r1}));
    }

    public static C242243Te A0Z(C68495NKo nKo) {
        AnonymousClass3U9 A0F = nKo.A0F();
        if (A0F != null) {
            return A0F.A01.A0s;
        }
        return null;
    }

    public static AnonymousClass3U9 A0a(UserSession userSession, DirectThreadKey directThreadKey) {
        return 2Dr.A03(2L2.A00(userSession), directThreadKey);
    }

    public static AnonymousClass3U9 A0b(UserSession userSession, String str) {
        return 2L2.A00(userSession).A0N(str);
    }

    public static AnonymousClass7S7 A0d(AnonymousClass0eK r0) {
        return ((C333517Zg) r0.get()).C6l();
    }

    public static C327687Bu A0e(C254703su r2) {
        1at A00 = C327657Br.A00();
        2FW r0 = r2.A10;
        0qQ.A07(r0);
        return A00.A01(r0);
    }

    public static AnonymousClass3Q2 A0g(UserSession userSession, C300925yB r2) {
        return 28K.A00(userSession).A03(r2.A06);
    }

    public static 2Hw A0h(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        return (2Hw) entry.getValue();
    }

    public static 2Hw A0i(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        return (2Hw) entry.getValue();
    }

    public static IllegalArgumentException A0j(Object obj, StringBuilder sb) {
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0k(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static Long A0n(Number number) {
        return Long.valueOf(TimeUnit.SECONDS.toMillis(number.longValue()));
    }

    public static Object A0q(1bp r0) {
        List C6L = r0.C6L();
        0qQ.A07(C6L);
        Object A0I = 00k.A0I(C6L);
        0qQ.A07(A0I);
        return A0I;
    }

    public static Object A0r(List list) {
        return list.get(list.size() - 1);
    }

    public static String A0s(UserSession userSession, C254703su r1, boolean z) {
        if (!AnonymousClass760.A00(userSession, z)) {
            return r1.A0h();
        }
        return r1.A0i();
    }

    public static String A0v(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public static String A0w(String str) {
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        String lowerCase = str.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return lowerCase;
    }

    public static List A0z(int i) {
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static List A10(long j) {
        List singletonList = Collections.singletonList(Long.valueOf(j));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static void A11(ShapeDrawable shapeDrawable, int i) {
        C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i);
    }

    public static void A12(SpannableStringBuilder spannableStringBuilder, Object obj, int i) {
        spannableStringBuilder.setSpan(obj, i, spannableStringBuilder.length(), 17);
    }

    public static void A13(View view, int i) {
        view.layout(i, i, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void A14(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A1A(0Aj r1, String str, String str2) {
        r1.AAJ(str, str2);
        if (r1.isSampled()) {
            r1.Cgf();
        }
    }

    public static void A1B(0bb r2, LoggingContext loggingContext) {
        r2.A02(SQ1.A00(loggingContext), "logging_policy");
    }

    public static void A1C(1Ln r1, C313756gx r2, Long l) {
        r1.A0i(l);
        r1.A0v(r2.A01);
        r1.Cgf();
    }

    public static void A1D(AnonymousClass68L r0, MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl) {
        if (!r0.EJd(mailboxCallback)) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public static void A1F(AnonymousClass67Z r1, boolean z) {
        r1.A02(Boolean.valueOf(z));
        r1.A00();
    }

    public static void A1G(C252063oV r1) {
        if (r1.CVM()) {
            r1.getView().setVisibility(8);
        }
    }

    public static void A1H(C69358Njy njy, NJT njt) {
        OYI.A00(njt.A0D()).CqZ(new Bundle(), njt, njy);
    }

    public static void A1J(AnonymousClass7FV r5, C332767Wh r6, DirectMessageIdentifier directMessageIdentifier, String str, String str2) {
        r6.AFb(str, str2, r5.Aqm().A00, directMessageIdentifier.A00, true);
    }

    public static void A1L(CharSequence charSequence, AnonymousClass0eM r2) {
        ((TextView) r2.getValue()).setText(charSequence);
    }

    public static void A1N(String str, AbstractCollection abstractCollection) {
        abstractCollection.add(Long.valueOf(Long.parseLong(str)));
    }

    public static void A1O(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).getUsername());
    }

    public static void A1P(AnonymousClass0eM r0, int i) {
        View view = (View) r0.getValue();
        0qQ.A07(view);
        view.setVisibility(i);
    }

    public static boolean A1T(User user, User user2) {
        return 0qQ.A0K(user.getId(), user2.getId());
    }

    public static boolean A1V(ReentrantReadWriteLock reentrantReadWriteLock) {
        return reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS);
    }

    public static boolean A1W(AnonymousClass0eK r0) {
        Object obj = r0.get();
        0qQ.A07(obj);
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1X(AnonymousClass0eM r2) {
        return AnonymousClass65A.A02(((AnonymousClass65E) r2.getValue()).A00, 36315949948669728L);
    }

    public static boolean A1Y(AnonymousClass0eM r0) {
        return ((AnonymousClass65E) r0.getValue()).A01();
    }

    public static boolean A1Z(AnonymousClass0eM r0) {
        return ((C240913Nc) r0.getValue()).A01();
    }
}

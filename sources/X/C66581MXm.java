package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.MXm  reason: case insensitive filesystem */
public abstract class C66581MXm {
    public static int A04(String str) {
        0qQ.A0B(str, 0);
        return str.length();
    }

    public static MailboxNullable A0K() {
        return new MailboxNullable((Object) null);
    }

    public static 1a8 A0P() {
        return new 1a8((C269794fh) null);
    }

    public static AnonymousClass3U9 A0a(Object obj, String str) {
        0qQ.A0B(str, 0);
        return ((2Dr) obj).A0N(str);
    }

    public static IgdsListCell A0d(Context context) {
        return new IgdsListCell(context, (AttributeSet) null);
    }

    public static DirectThreadKey A0e(String str) {
        return new DirectThreadKey(str, (List) null);
    }

    public static String A0w(CharSequence charSequence, Iterable iterable) {
        return 00k.A0P(charSequence, "", "", iterable, (0sP) null);
    }

    public static void A16(Context context, AnonymousClass6W8 r2) {
        r2.A0H = false;
        r2.A07();
        r2.A0C(context);
    }

    public static void A1T(Object obj, 0V2 r2) {
        0qQ.A0B(r2, 0);
        r2.FIA(obj);
    }

    public static void A1U(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        11Z.A02(runnable);
    }

    public static boolean A1V(int i) {
        return i == 1;
    }

    public static boolean A1Y(0xa r2, String str, String str2) {
        return r2.getBoolean(002.A0R(str, str2), false);
    }

    public static boolean A1Z(Object obj) {
        0qQ.A0B(obj, 3);
        return false;
    }

    public static int A05(JSONObject jSONObject) {
        return jSONObject.optString("__typename").hashCode();
    }

    public static long A06() {
        return new Date().getTime();
    }

    public static Bundle A09(0lg r1) {
        Bundle bundle = new Bundle();
        C227642jf.A03(bundle, r1);
        return bundle;
    }

    public static ViewPropertyAnimator A0D(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.setDuration(300);
    }

    public static C331277Qg A0F(Object obj) {
        return (C331277Qg) C331277Qg.A06.get(obj);
    }

    public static 0Tu A0G() {
        return 0Tu.A00(new 0Tu());
    }

    public static Mailbox A0H(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        0qQ.A0B(mailbox, 0);
        return mailbox;
    }

    public static AnonymousClass68L A0I(MailboxFeature mailboxFeature) {
        return mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
    }

    public static MailboxFutureImpl A0J(AnonymousClass68L r1, MailboxCallback mailboxCallback) {
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(r1);
        mailboxFutureImpl.Eiu(mailboxCallback);
        return mailboxFutureImpl;
    }

    public static UserSession A0Q(Object obj) {
        UserSession userSession = (UserSession) obj;
        0qQ.A0B(userSession, 0);
        return userSession;
    }

    public static C66736Mbh A0U(C66633Ma2 ma2) {
        return (C66736Mbh) ma2.A2t.getValue();
    }

    public static C74503Pvy A0V(C66633Ma2 ma2) {
        return (C74503Pvy) ma2.A1h.getValue();
    }

    public static C67710MtP A0W(DirectSearchInboxFragment directSearchInboxFragment) {
        return (C67710MtP) directSearchInboxFragment.A0P.getValue();
    }

    public static AnonymousClass7LQ A0Y(Object obj, Object obj2) {
        AnonymousClass7LQ r1 = (AnonymousClass7LQ) obj;
        0qQ.A0B(obj2, 0);
        return r1;
    }

    public static C355148Ov A0c(Context context, UserSession userSession, Integer num, List list, boolean z) {
        C355148Ov r0 = new C355148Ov(context, userSession, num, z);
        r0.A02(list);
        return r0;
    }

    public static 2bu A0g(C66633Ma2 ma2) {
        return (2bu) ma2.A2U.getValue();
    }

    public static C70840ONr A0h(Object obj) {
        C70840ONr oNr = (C70840ONr) obj;
        0qQ.A0B(oNr, 0);
        return oNr;
    }

    public static C74121PpO A0i() {
        C74121PpO ppO = C74121PpO.A00;
        0qQ.A0B(ppO, 1);
        return ppO;
    }

    public static NCZ A0j(Object obj) {
        NCZ ncz = (NCZ) obj;
        0qQ.A0B(ncz, 0);
        return ncz;
    }

    public static String A0t(C301345z0 r1, int i) {
        return r1.mResultSet.getString(i, 1);
    }

    public static String A0u(C301345z0 r1, int i) {
        return r1.mResultSet.getString(i, 2);
    }

    public static String A0v(C301345z0 r1, int i) {
        return r1.mResultSet.getString(i, 6);
    }

    public static Set A12(Object obj) {
        Set set = (Set) obj;
        0qQ.A0B(set, 0);
        return set;
    }

    public static void A17(Intent intent, String str, String str2) {
        intent.setComponent(new ComponentName(str, str2));
    }

    public static void A18(Rect rect, View view, View view2) {
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public static void A19(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static void A1A(View view, int i) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }

    public static void A1B(View view, int i, int i2) {
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static void A1D(Fragment fragment, C69358Njy njy, 2DR r3) {
        r3.CqZ(new Bundle(), fragment, njy);
    }

    public static void A1K(C68449NIn nIn, int i) {
        IgTextView igTextView = nIn.A0L;
        if (igTextView != null) {
            igTextView.setVisibility(i);
        }
    }

    public static void A1M(User user, AbstractCollection abstractCollection) {
        abstractCollection.add(new PendingRecipient(user));
    }

    public static void A1Q(Object obj, Object obj2) {
        AnonymousClass67Z r0 = (AnonymousClass67Z) obj;
        r0.A02(obj2);
        r0.A00();
    }

    public static double A00(Rect rect, Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return (double) rect.width();
    }

    public static float A01(Drawable drawable) {
        return drawable.getBounds().exactCenterX();
    }

    public static int A02(Context context) {
        return context.getColor(2Yu.A09(context));
    }

    public static int A03(Resources resources, Number number) {
        return resources.getDimensionPixelSize(number.intValue());
    }

    public static SharedPreferences A07(Context context, int i) {
        return C71072Oar.A00(context, Integer.valueOf(i));
    }

    public static Rect A08(double d, int i, int i2, int i3) {
        return new Rect(i, i2, i3, AnonymousClass1GB.A00(d));
    }

    public static View A0A(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static View A0B(AnonymousClass0eM r0) {
        View view = (View) r0.getValue();
        0qQ.A07(view);
        return view;
    }

    public static ViewPropertyAnimator A0C(View view, float f) {
        return view.animate().alpha(f);
    }

    public static ViewPropertyAnimator A0E(ViewPropertyAnimator viewPropertyAnimator, float f) {
        return viewPropertyAnimator.scaleX(f).scaleY(f);
    }

    public static 1aU A0L(AnonymousClass68Z r0, 1aU r1) {
        return r1.A0L(r0).A0D();
    }

    public static 1aU A0M(AnonymousClass68Z r0, 1aU r1) {
        return r1.A0M(r0).A0H();
    }

    public static 1aU A0N(1aU r1, String str) {
        return r1.A0O(AnonymousClass6F9.A00(str));
    }

    public static 1aU A0O(1aU r1, String str) {
        return r1.A0P(AnonymousClass6F9.A00(str));
    }

    public static UserSession A0R(Object obj, AbstractCollection abstractCollection, AnonymousClass0eM r2) {
        abstractCollection.add(obj);
        return (UserSession) r2.getValue();
    }

    public static UserSession A0S(AnonymousClass0eM r0) {
        return ((AnonymousClass65E) r0.getValue()).A00;
    }

    public static C252063oV A0T(View view, int i) {
        return 2b1.A00(view.findViewById(i));
    }

    public static AnonymousClass9HC A0X(UserSession userSession, AnonymousClass9HD r2, List list) {
        return r2.A00(userSession, C376189Gz.A00(list));
    }

    public static AnonymousClass7SD A0Z(C333517Zg r0) {
        return r0.C6l().C6Q();
    }

    public static MYb A0b(AnonymousClass0eM r0) {
        return ((C66594MYg) r0.getValue()).A01;
    }

    public static ExtendedImageUrl A0f(User user) {
        return new ExtendedImageUrl(user.Bh3());
    }

    public static IGFOAMessagingSendToSentLogger A0k(UserSession userSession, String str) {
        return AnonymousClass7G0.A00(userSession, str.hashCode());
    }

    public static Boolean A0l(C254783t2 r0) {
        return Boolean.valueOf(AnonymousClass6W3.A07(r0));
    }

    public static Integer A0m(Context context) {
        return Integer.valueOf(2Yu.A03(context));
    }

    public static Integer A0n(Cursor cursor, int i) {
        return Integer.valueOf(cursor.getInt(i));
    }

    public static Integer A0o(CQLResultSet cQLResultSet, int i, int i2) {
        return Integer.valueOf(cQLResultSet.getInteger(i, i2));
    }

    public static Integer A0p(Number number) {
        return Integer.valueOf((int) number.floatValue());
    }

    public static Long A0q(CQLResultSet cQLResultSet, int i, int i2) {
        return Long.valueOf(cQLResultSet.getLong(i, i2));
    }

    public static Long A0r(UserSession userSession, 0eE r1) {
        return r1.A01(userSession).BST();
    }

    public static Object A0s(AnonymousClass681 r0, Map map, int i) {
        return map.get(r0.A00(i));
    }

    public static String A0x(Number number) {
        return String.valueOf(number.longValue());
    }

    public static String A0y(Object obj) {
        return obj.getClass().getName();
    }

    public static ArrayList A0z(String str) {
        return 0sr.A1L(new String[]{str});
    }

    public static Iterator A10(Iterable iterable, int i) {
        return 00k.A0d(iterable, i).iterator();
    }

    public static List A11(String str, String str2) {
        return 0sr.A1P(new String[]{str, str2});
    }

    public static 0eP A13(Object obj, int i) {
        return new 0eP(Integer.valueOf(i), obj);
    }

    public static 0eP A14(Object obj, boolean z) {
        return new 0eP(obj, Boolean.valueOf(z));
    }

    public static void A15(Context context, TextView textView, int i) {
        textView.setText(context.getText(i));
    }

    public static void A1C(ImageView imageView, int i) {
        imageView.setImageTintList(ColorStateList.valueOf(i));
    }

    public static void A1E(0Aj r2, long j) {
        r2.A9F("position", Long.valueOf(j));
    }

    public static void A1F(0Aj r2, long j) {
        r2.A9F("search_query_length", Long.valueOf(j));
    }

    public static void A1G(0Aj r2, boolean z) {
        r2.A7p("is_epd", Boolean.valueOf(z));
    }

    public static void A1H(0Aj r2, boolean z) {
        r2.A7p("is_e2ee", Boolean.valueOf(z));
    }

    public static void A1I(1Ln r1, String str) {
        r1.A0l(str);
        r1.A0k("impression");
    }

    public static void A1J(1Ln r1, String str) {
        r1.A0p(str);
        r1.A0q("thread_view");
    }

    public static void A1L(AnonymousClass3U9 r0, 2Dm r1) {
        r1.FLo(r0.BJz());
    }

    public static void A1N(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 1;
    }

    public static void A1O(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 3;
    }

    public static void A1P(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 19);
    }

    public static void A1R(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
    }

    public static void A1S(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static boolean A1W(int i, List list) {
        return list.contains(Integer.valueOf(i));
    }

    public static boolean A1X(16F r0, Object obj) {
        r0.A1J();
        return ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(obj);
    }

    public static boolean A1a(boolean z) {
        return Boolean.valueOf(z).booleanValue();
    }

    public static Object[] A1b(Object obj, int i) {
        return Arrays.copyOf(new Object[]{obj}, i);
    }
}

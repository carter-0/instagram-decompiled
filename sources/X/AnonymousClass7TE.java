package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7TE  reason: invalid class name */
public abstract class AnonymousClass7TE {
    public static float A00(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static int A05(float f, float f2) {
        return Math.round(f * f2);
    }

    public static int A06(float f, float f2) {
        return AnonymousClass1GB.A01(f * f2);
    }

    public static int A0L(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Boolean A0u() {
        return false;
    }

    public static Boolean A0v() {
        return true;
    }

    public static Object A12(AbstractList abstractList) {
        return abstractList.get(0);
    }

    public static Object A13(List list) {
        return list.get(0);
    }

    public static float A04(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A0B(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static int A0M(Object obj) {
        return ((Number) obj).intValue();
    }

    public static long A0P(long j) {
        return j / 1000;
    }

    public static long A0R(Object obj) {
        return ((Number) obj).longValue();
    }

    public static Context A0T(AnonymousClass8BA r0) {
        return r0.A0o.getContext();
    }

    public static Matrix A0U() {
        return new Matrix();
    }

    public static Paint A0V(int i) {
        return new Paint(i);
    }

    public static Rect A0W() {
        return new Rect();
    }

    public static RectF A0Y() {
        return new RectF();
    }

    public static Bundle A0a() {
        return new Bundle();
    }

    public static 0Aj A0e(0wc r1, String str) {
        return r1.A00(r1.A00, str);
    }

    public static AnonymousClass4L7 A0f(AnonymousClass4L1 r1, String str) {
        return new AnonymousClass4L7(r1, str);
    }

    public static AnonymousClass4L3 A0g(AnonymousClass4L0 r1) {
        return new AnonymousClass4L3(r1);
    }

    public static AnonymousClass4Kx A0h(AnonymousClass4Kr[] r1) {
        return new AnonymousClass4Kx(r1);
    }

    public static ReelTappableObjectType A0i(String str, String str2, int i) {
        return new ReelTappableObjectType(str, i, str2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, X.1Pf] */
    public static C64481Pf A0j(Throwable th) {
        return new IOException(th);
    }

    public static UserSession A0k(C15291UZw uZw) {
        UserSession userSession = uZw.A00;
        0qQ.A07(userSession);
        return userSession;
    }

    public static AnonymousClass3NG A0m(View view) {
        return new AnonymousClass3NG(view);
    }

    public static VoiceOption A0o(String str, String str2, String str3) {
        return new VoiceOption(str, str2, str3);
    }

    public static 0xY A0p(1Av r0) {
        return r0.A01.AR4();
    }

    public static C317486nL A0r(String str, int i) {
        return new C317486nL(str, i);
    }

    public static C306386Ly A0s(Context context, int i) {
        return new C306386Ly(context, i);
    }

    public static File A0t(String str) {
        return new File(str);
    }

    public static IllegalArgumentException A0w(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalStateException A0x() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A0y() {
        return new IllegalStateException("Required value was null.");
    }

    public static IllegalStateException A0z(String str) {
        return new IllegalStateException(str);
    }

    public static Long A10(String str) {
        return 00y.A0n(10, str);
    }

    public static NullPointerException A11(String str) {
        return new NullPointerException(str);
    }

    public static RuntimeException A15(String str) {
        return new RuntimeException(str);
    }

    public static StringBuilder A1A() {
        return new StringBuilder();
    }

    public static UnsupportedOperationException A1B(String str) {
        return new UnsupportedOperationException(str);
    }

    public static ArrayList A1C() {
        return new ArrayList();
    }

    public static ArrayList A1D(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashMap A1E() {
        return new HashMap();
    }

    public static HashSet A1F() {
        return new HashSet();
    }

    public static LinkedHashMap A1H() {
        return new LinkedHashMap();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Wub, java.lang.RuntimeException] */
    public static C20561Wub A1K() {
        return new RuntimeException();
    }

    public static 0eP A1L(Object obj, Object obj2) {
        return new 0eP(obj, obj2);
    }

    public static AnonymousClass4D7 A1M(Object obj, Object obj2, 1Em r2) {
        return r2.create(obj2, (AnonymousClass4D7) obj);
    }

    public static void A1Q(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A1V(0Aj r2, AnonymousClass283 r3) {
        r2.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static void A1Z(0sL r1, C262224Cq r2) {
        1Eo.A05(19B.A00, r1, r2);
    }

    public static boolean A1a(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static float A01(Resources resources, int i) {
        return (float) resources.getDimensionPixelSize(i);
    }

    public static float A02(View view) {
        return (float) view.getWidth();
    }

    public static float A03(View view) {
        return (float) view.getHeight();
    }

    public static int A07(Context context) {
        return 2Yu.A0H(context, R.attr.igds_color_creation_tools_pink);
    }

    public static int A08(Context context) {
        return context.getColor(R.color.black_50_transparent);
    }

    public static int A09(Context context) {
        return context.getColor(R.color.canvas_bottom_sheet_description_text_color);
    }

    public static int A0A(Context context) {
        return context.getColor(R.color.design_dark_default_color_on_background);
    }

    public static int A0C(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    public static int A0D(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }

    public static int A0E(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    public static int A0F(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static int A0G(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
    }

    public static int A0H(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
    }

    public static int A0I(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.before_and_after_caption_font_size);
    }

    public static int A0J(Drawable drawable) {
        return drawable.getBounds().left;
    }

    public static int A0K(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A0N(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static int A0O(String str) {
        return str.hashCode() * 31;
    }

    public static long A0Q(Object obj) {
        return (long) obj.hashCode();
    }

    public static Context A0S(View view) {
        Context context = view.getContext();
        0qQ.A07(context);
        return context;
    }

    public static Rect A0X(Drawable drawable) {
        Rect bounds = drawable.getBounds();
        0qQ.A07(bounds);
        return bounds;
    }

    public static Drawable A0Z(Iterator it) {
        return (Drawable) it.next();
    }

    public static View A0b(View view, int i) {
        View findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        return findViewById;
    }

    public static View A0c(AnonymousClass0eM r0) {
        return (View) r0.getValue();
    }

    public static TextView A0d(View view, int i) {
        return (TextView) view.findViewById(i);
    }

    public static UserSession A0l(AnonymousClass0eM r0) {
        return (UserSession) r0.getValue();
    }

    public static 29L A0n(UserSession userSession) {
        return 27p.A01(userSession).A0J;
    }

    public static 0xa A0q(UserSession userSession) {
        return 1Au.A00(userSession).A01;
    }

    public static Object A14(AnonymousClass0eM r0) {
        Object value = r0.getValue();
        0qQ.A07(value);
        return value;
    }

    public static String A16(Context context, int i) {
        String string = context.getString(i);
        0qQ.A07(string);
        return string;
    }

    public static String A17(16F r1) {
        String A0q = r1.A0q();
        r1.A1J();
        return A0q;
    }

    public static String A18(Iterator it) {
        return (String) it.next();
    }

    public static String A19(List list, int i) {
        return (String) list.get(i);
    }

    public static Iterator A1G(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        0qQ.A07(it);
        return it;
    }

    public static List A1I(Object obj) {
        List singletonList = Collections.singletonList(obj);
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static Map.Entry A1J(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A1N(Context context, Paint paint, int i) {
        paint.setColor(context.getColor(i));
    }

    public static void A1O(Context context, C306386Ly r1, int i) {
        r1.A0F(context.getColor(i));
    }

    public static void A1P(Resources resources, C306386Ly r1, int i) {
        r1.A0M(resources.getString(i));
    }

    public static void A1R(Drawable drawable, int i) {
        drawable.setColorFilter(AnonymousClass37O.A00(i));
    }

    public static void A1S(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A1T(Parcel parcel, Enum enumR) {
        parcel.writeString(enumR.name());
    }

    public static void A1U(View view, boolean z) {
        C294975nL.A05(new View[]{view}, z);
    }

    public static void A1W(0Aj r1, String str, int i) {
        r1.A8k(str, Integer.valueOf(i));
    }

    public static void A1X(0qm r0, AnonymousClass0qq r1, C306386Ly r2) {
        r2.A0I(r1.A02(r0));
    }

    public static void A1Y(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static boolean A1b(List list) {
        return !list.isEmpty();
    }
}

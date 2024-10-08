package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.nio.Buffer;
import java.text.BreakIterator;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.webrtc.VideoCodecInfo;

/* renamed from: X.Tno  reason: case insensitive filesystem */
public abstract class C13988Tno {
    public static float A00(float f, float f2, float f3) {
        return f2 + (f3 * (f - f2));
    }

    public static float A01(int i) {
        return ((float) i) / 2.0f;
    }

    public static int A02(float f, float f2) {
        return (int) Math.ceil((double) (f * f2));
    }

    public static int A06(int i, int i2) {
        return Math.abs(i - i2);
    }

    public static int A07(int i, int i2, int i3) {
        return Math.max(i3, i - i2);
    }

    public static View A0G(ViewGroup viewGroup) {
        return viewGroup.getChildAt(0);
    }

    public static ReadableArray A0I(Object obj) {
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return null;
    }

    public static ReadableMap A0J(Object obj) {
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return null;
    }

    public static UserSession A0L(C14138TqY tqY) {
        UserSession userSession = (UserSession) tqY.A0t.getValue();
        0qQ.A0B(userSession, 0);
        return userSession;
    }

    public static Integer A0R() {
        return 1;
    }

    public static Integer A0S(C276544tV r1, int i) {
        return Integer.valueOf(r1.A03(i, 0));
    }

    public static String A0e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static C255543uJ A0k(String str, C255533uI r3) {
        return new C255543uJ(str, r3, 2);
    }

    public static C255543uJ A0l(String str, C255533uI r3) {
        return new C255543uJ(str, r3, 3);
    }

    public static C255543uJ A0m(String str, C255533uI r3) {
        return new C255543uJ(str, r3, 4);
    }

    public static void A0o(float f, float f2, Paint paint) {
        paint.setAlpha((int) (f * f2));
    }

    public static void A0w(Drawable drawable, float f, float f2, float f3, float f4) {
        drawable.setBounds((int) f, (int) f2, (int) f3, (int) f4);
    }

    public static boolean A1W(int i, int i2) {
        return i == i2;
    }

    public static int A04(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public static int A05(int i, int i2) {
        if (i > 32) {
            return i - ((i - 1) & -32);
        }
        return i2;
    }

    public static int A0B(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        return i + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int A0E(boolean z) {
        return z ? 0 : 8;
    }

    public static ULw A0H(16F r1) {
        return (ULw) 16P.A01(r1, WRU.A00);
    }

    public static ULH A0N(16F r1) {
        return (ULH) 16P.A01(r1, C19233WQs.A00);
    }

    public static C16597Uxr A0O(Object obj) {
        return (C16597Uxr) C16597Uxr.A01.get(obj);
    }

    public static IOException A0P() {
        return new IOException("Field name should not be null");
    }

    public static Object A0W(Object obj, SerialDescriptor serialDescriptor, C2590240b r3, C255463uA[] r4, int i) {
        return r3.AO5(obj, r4[i], serialDescriptor, i);
    }

    public static String A0b(User user) {
        return user.A03.getUsername();
    }

    public static String A0f(Object obj, SerialDescriptor serialDescriptor, C2590240b r3, int i) {
        return (String) r3.AO4(obj, C255453u9.A01, serialDescriptor, i);
    }

    public static String A0g(String str) {
        return 002.A0R("Unexpected key found: ", str);
    }

    public static List A0j(Object obj, SerialDescriptor serialDescriptor, C2590240b r3, C255463uA[] r4, int i) {
        return (List) r3.AO5(obj, r4[i], serialDescriptor, i);
    }

    public static void A0n() {
        0qQ.A0F("grid");
        throw null;
    }

    public static void A0r(Context context, C46498Dg1 dg1) {
        new C49945FFy(dg1).A05(context);
    }

    public static void A17(0Aj r1, 0bb r2) {
        r1.AAK(r2, "navigation_info");
    }

    public static void A18(0Aj r1, 0bb r2) {
        r1.AAK(r2, "configurations");
        r1.Cgf();
    }

    public static void A1C(0Aj r1, String str) {
        r1.AAJ("prior_module", str);
    }

    public static void A1D(0Aj r1, String str) {
        r1.AAJ("shopping_session_id", str);
    }

    public static void A1F(17Z r2, C306576Mr r3) {
        r2.A0R("text_emphasis_mode", r3.A00);
    }

    public static void A1G(17Z r1, String str) {
        if (str != null) {
            r1.A0R("text_color", str);
        }
    }

    public static void A1K(C59830Ja5 ja5) {
        ja5.A02.EHu(false);
    }

    public static void A1R(String str, AbstractCollection abstractCollection, Map map) {
        abstractCollection.add(new VideoCodecInfo(str, map));
    }

    public static void A1T(AbstractCollection abstractCollection, float f, float f2) {
        abstractCollection.add(new PointF(f, f2));
    }

    public static void A1U(Calendar calendar, long j) {
        calendar.setTime(new Date(j));
    }

    public static int A03(int i) {
        return Integer.valueOf(i).intValue();
    }

    public static int A08(Context context) {
        return context.getColor(2Yu.A0D(context));
    }

    public static int A09(Context context, int i) {
        return Math.round(0nA.A04(context, i));
    }

    public static int A0A(View view, int i) {
        return View.combineMeasuredStates(i, view.getMeasuredState());
    }

    public static int A0C(EditText editText) {
        return editText.getText().length();
    }

    public static int A0D(Number number) {
        number.getClass();
        return number.intValue();
    }

    public static DisplayMetrics A0F(View view) {
        return view.getResources().getDisplayMetrics();
    }

    public static 1Bk A0K(UserSession userSession) {
        return C229232n3.A00(userSession).A00();
    }

    public static C14278TtB A0M(Object obj, Map map) {
        return (C14278TtB) ((UmH) map.get(obj));
    }

    public static Boolean A0Q(C276544tV r0, int i, boolean z) {
        return Boolean.valueOf(r0.A0R(i, z));
    }

    public static Long A0T(BaseBundle baseBundle, String str) {
        return Long.valueOf(baseBundle.getLong(str));
    }

    public static Object A0U(View view, Object obj) {
        view.setTag(obj);
        return view.getTag();
    }

    public static Object A0V(C307786Rm r0, C276544tV r1) {
        Object A06 = C307476Qg.A06(r0, r1);
        A06.getClass();
        return A06;
    }

    public static String A0X(C15286UZq uZq) {
        String str = uZq.A06().A0J;
        if (str != null) {
            return str;
        }
        0qQ.A0F("query");
        throw AnonymousClass00P.createAndThrow();
    }

    public static String A0Y(C15286UZq uZq) {
        return uZq.A07().A04();
    }

    public static String A0Z(C15286UZq uZq) {
        String str = uZq.A06().A0L;
        if (str != null) {
            return str;
        }
        0qQ.A0F("serpSessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public static String A0a(C15286UZq uZq) {
        return uZq.A06().A04();
    }

    public static String A0c(CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public static String A0d(Object obj) {
        return AnonymousClass3XB.A00(obj.getClass());
    }

    public static Thread A0h(Handler handler) {
        return handler.getLooper().getThread();
    }

    public static ArrayList A0i(List list) {
        ArrayList A00 = C306556Mp.A00(list);
        0qQ.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        return A00;
    }

    public static void A0p(int i, Paint paint) {
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A0q(Context context, View view, int i) {
        view.setBackgroundResource(2Yu.A0H(context, i));
    }

    public static void A0s(Context context, StringBuilder sb, int i) {
        sb.append(context.getString(i));
    }

    public static void A0t(Resources resources, Paint paint, int i) {
        paint.setTextSize((float) resources.getDimensionPixelSize(i));
    }

    public static void A0u(Resources resources, Paint paint, int i) {
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(i));
    }

    public static void A0v(RectF rectF, Drawable drawable) {
        rectF.set(drawable.getBounds());
    }

    public static void A0x(Drawable drawable, View view) {
        drawable.setState(view.getDrawableState());
    }

    public static void A0y(BaseBundle baseBundle, 0xI r1, String str) {
        r1.A0C(str, baseBundle.getString(str));
    }

    public static void A0z(View view) {
        C242363Tt.A03(view, view.getContext());
    }

    public static void A10(View view, int i) {
        W3s.A0B(view, Integer.valueOf(i));
    }

    public static void A11(View view, int i, int i2, int i3) {
        view.measure(i3, View.MeasureSpec.makeMeasureSpec(i, i2));
    }

    public static void A12(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }

    public static void A13(View view, C18649Vw1 vw1, int i) {
        W3s.A08(view, vw1, C16525UwU.values()[i]);
    }

    public static void A14(View view, 2el r2, C229932oe r3, String str) {
        r2.A05(view, r3.A00(str));
    }

    public static void A15(TextView textView, int i) {
        textView.setText(String.valueOf(i));
    }

    public static void A16(TextView textView, boolean z) {
        textView.getPaint().setFakeBoldText(z);
    }

    public static void A19(0Aj r1, 0bb r2, String str, String str2) {
        r2.A06(str, str2);
        r1.AAK(r2, "navigation_info");
    }

    public static void A1A(0Aj r2, String str) {
        r2.AAE(C263944Ny.A00(str), "merchant_id");
    }

    public static void A1B(0Aj r2, String str) {
        r2.AAE(C263944Ny.A00(str), "merchant_igid");
    }

    public static void A1E(0Aj r1, String str, String str2, String str3) {
        r1.AAJ(str, str2);
        r1.AAJ("query_text", str3);
    }

    public static void A1H(17Z r1, Iterator it) {
        r1.A0t((String) it.next());
    }

    public static void A1I(16F r0, AnonymousClass1FD r1, AbstractCollection abstractCollection) {
        abstractCollection.add(16P.A01(r0, r1));
    }

    public static void A1J(WGU wgu, Object obj) {
        wgu.A0Q(obj.toString());
    }

    public static void A1L(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 5;
    }

    public static void A1M(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 6;
    }

    public static void A1N(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 7;
    }

    public static void A1O(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 11);
    }

    public static void A1P(Object obj, BreakIterator breakIterator) {
        breakIterator.setText(obj.toString());
    }

    public static void A1Q(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void A1S(Buffer buffer, int i) {
        buffer.position(buffer.position() + i);
    }

    public static void A1V(ReadWriteLock readWriteLock) {
        readWriteLock.writeLock().unlock();
    }

    public static boolean A1X(Resources resources, Object obj, int i) {
        return 0qQ.A0K(resources.getString(i), obj);
    }

    public static boolean A1Y(0lg r0) {
        return C249093j7.A00(r0).booleanValue();
    }

    public static boolean A1Z(CharSequence charSequence, int i) {
        return Character.isWhitespace(charSequence.charAt(i));
    }

    public static boolean A1a(List list) {
        return Collections.unmodifiableList(list).isEmpty();
    }

    public static Object[] A1b(Object[] objArr, int i) {
        Object[] copyOf = Arrays.copyOf(objArr, i);
        0qQ.A07(copyOf);
        return copyOf;
    }
}

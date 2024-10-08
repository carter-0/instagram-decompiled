package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7TF  reason: invalid class name */
public abstract class AnonymousClass7TF {
    public static RectF A0C(float f, float f2) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        rectF.offsetTo(0.0f, f2);
        return rectF;
    }

    public static 0Tu A0H(Object obj) {
        0qQ.A0B(obj, 0);
        return 0Tu.A05;
    }

    public static void A12(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
    }

    public static void A1H(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
    }

    public static void A1K(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new C66183MGu(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static boolean A1P(int i) {
        return i != 0;
    }

    public static boolean A1Q(int i) {
        return i == 0;
    }

    public static boolean A1R(int i) {
        return i > 0;
    }

    public static boolean A1S(int i, int i2) {
        return i == i2;
    }

    public static boolean A1T(int i, int i2) {
        return i < i2;
    }

    public static boolean A1V(Object obj) {
        return obj != null;
    }

    public static boolean A1W(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static boolean A1X(Object obj, Object obj2) {
        System.arraycopy(obj, 0, obj2, 0, 27);
        return false;
    }

    public static float[] A1a(float[] fArr) {
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public static int A01(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A09(boolean z, int i) {
        int i2 = 1237;
        if (z) {
            i2 = 1231;
        }
        return (i + i2) * 31;
    }

    public static Bitmap A0B(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        return createBitmap;
    }

    public static AnonymousClass4L7 A0I(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static 17W A0K(Writer writer) {
        17W A0A = AnonymousClass15o.A00.A0A(writer);
        A0A.A0c();
        return A0A;
    }

    public static AnonymousClass8ME A0M(AnonymousClass8BA r0) {
        return (AnonymousClass8ME) r0.A1g.get();
    }

    public static C2802350v A0O(AnonymousClass5JL r0) {
        AnonymousClass513 r02 = r0.A02;
        0qQ.A0A(r02);
        return r02.A00();
    }

    public static C306386Ly A0P(Context context, int i, int i2) {
        return new C306386Ly(context, i2 - (i * 2));
    }

    public static String A0j(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        return lowerCase;
    }

    public static String A0k(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        0qQ.A07(upperCase);
        return upperCase;
    }

    public static StringBuilder A0n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static ArrayList A0p(Iterable iterable) {
        return new ArrayList(0Yv.A1E(iterable, 10));
    }

    public static Map A0w(Object obj, Object obj2) {
        return 0se.A0M(new 0eP(obj, obj2));
    }

    public static void A13(Canvas canvas, Rect rect) {
        canvas.translate((float) rect.left, (float) rect.top);
    }

    public static void A16(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A17(Fragment fragment, Runnable runnable) {
        C226112fe.A0B.A05(fragment.requireActivity(), runnable);
    }

    public static void A18(1Ln r1) {
        r1.A0u(AnonymousClass1QI.A00.A02.A00);
    }

    public static void A1A(C306386Ly r1, CharSequence charSequence) {
        r1.A0L(new SpannableString(charSequence));
    }

    public static void A1I(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new 0eP(obj, obj2));
    }

    public static void A1J(Object obj, 0s0 r3, AnonymousClass0YZ[] r4, int i, boolean z) {
        r3.Epx(obj, Boolean.valueOf(z), r4[i]);
    }

    public static void A1L(String str, Object obj, String str2) {
        ((0c9) obj).A03.A00(str, str2);
        throw null;
    }

    public static int A00(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A02(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int A03(Context context, int i) {
        return context.getColor(2Yu.A0H(context, i));
    }

    public static int A04(Drawable drawable) {
        return drawable.getBounds().centerX();
    }

    public static int A05(Drawable drawable) {
        return drawable.getBounds().centerY();
    }

    public static int A06(Drawable drawable) {
        return drawable.getBounds().width();
    }

    public static int A07(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A08(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static Resources A0A(Context context) {
        Resources resources = context.getResources();
        0qQ.A07(resources);
        return resources;
    }

    public static Handler A0D() {
        return new Handler(Looper.getMainLooper());
    }

    public static DisplayMetrics A0E(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static View A0F(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return requireViewById;
    }

    public static View A0G(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return requireViewById;
    }

    public static 2cs A0J() {
        return C61340me.A00().A02();
    }

    public static 0lg A0L(AnonymousClass0eM r0, int i) {
        0lg r02 = (0lg) r0.getValue();
        0qQ.A0B(r02, i);
        return r02;
    }

    public static 0xY A0N(UserSession userSession) {
        return 1Au.A00(userSession).A01.AR4();
    }

    public static User A0Q(UserSession userSession) {
        return 0eE.A00(userSession).A00();
    }

    public static Boolean A0R(0Tu r0, 0lg r1, long j) {
        return Boolean.valueOf(182.A06(r0, r1, j));
    }

    public static Boolean A0S(16F r0) {
        return Boolean.valueOf(r0.A0d());
    }

    public static Double A0T(float f) {
        return 012.A0p(String.valueOf(f));
    }

    public static Float A0U(16F r2) {
        return new Float(r2.A0U());
    }

    public static Float A0V(16F r2) {
        return Float.valueOf((float) r2.A0U());
    }

    public static IllegalArgumentException A0W(String str, String str2) {
        return new IllegalArgumentException(002.A0R(str, str2));
    }

    public static Integer A0X(16F r0) {
        return Integer.valueOf(r0.A1D());
    }

    public static Long A0Y(0Tu r0, 0lg r1, long j) {
        return Long.valueOf(182.A01(r0, r1, j));
    }

    public static Long A0Z(16F r1) {
        return Long.valueOf(r1.A0y());
    }

    public static Object A0a(Iterator it) {
        Object next = it.next();
        0qQ.A07(next);
        return next;
    }

    public static String A0b() {
        return UUID.randomUUID().toString();
    }

    public static String A0c() {
        return AnonymousClass0HM.A00().toString();
    }

    public static String A0d(Resources resources, int i) {
        String string = resources.getString(i);
        0qQ.A07(string);
        return string;
    }

    public static String A0e(Resources resources, Object obj, int i) {
        return resources.getString(i, new Object[]{obj});
    }

    public static String A0f(EditText editText) {
        return editText.getText().toString();
    }

    public static String A0g(UserSession userSession) {
        return 27p.A01(userSession).A04.A0L;
    }

    public static String A0h(Object obj) {
        return String.valueOf(obj.hashCode());
    }

    public static String A0i(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0l(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0m(String str, Throwable th) {
        return 002.A0R(str, th.getMessage());
    }

    public static ArrayList A0o(Cursor cursor) {
        return new ArrayList(cursor.getCount());
    }

    public static ArrayList A0q(Object obj, int i) {
        0qQ.A0B(obj, i);
        return new ArrayList();
    }

    public static HashSet A0r(String str, String str2) {
        return 0sc.A05(new String[]{str, str2});
    }

    public static Iterator A0s(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static Iterator A0t(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static Iterator A0u(Map map) {
        return map.entrySet().iterator();
    }

    public static Iterator A0v(Map map) {
        return map.values().iterator();
    }

    public static 0eP A0x(Object obj, int i) {
        return new 0eP(obj, Integer.valueOf(i));
    }

    public static 0eP A0y(Object obj, long j) {
        return new 0eP(obj, Long.valueOf(j));
    }

    public static C60340gF A0z(C251983oI r1) {
        r1.setTransactionSuccessful();
        C60340gF r0 = C60340gF.A00;
        r1.endTransaction();
        return r0;
    }

    public static C60340gF A10(C251983oI r0, AnonymousClass1WV r1) {
        r1.ATQ();
        r0.setTransactionSuccessful();
        return C60340gF.A00;
    }

    public static void A11(Resources resources, C306386Ly r1, int i) {
        r1.A0A((float) resources.getDimensionPixelSize(i));
    }

    public static void A14(Canvas canvas, Drawable drawable) {
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
    }

    public static void A15(Canvas canvas, Drawable drawable, float f, float f2) {
        canvas.translate(f, f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void A19(0f9 r0, String str, String str2, Throwable th) {
        r0.ABQ(str, str2);
        r0.ERJ(th);
        r0.report();
    }

    public static void A1B(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 2);
    }

    public static void A1C(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 3);
    }

    public static void A1D(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 4);
    }

    public static void A1E(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 7);
    }

    public static void A1F(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 8);
    }

    public static void A1G(Object obj, int i, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 9);
    }

    public static void A1M(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static void A1N(AnonymousClass0eM r0) {
        ((Dialog) r0.getValue()).dismiss();
    }

    public static void A1O(05G r1, boolean z) {
        r1.Epw(Boolean.valueOf(z));
    }

    public static boolean A1U(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, i);
        0qQ.A0B(obj2, 1);
        return true;
    }

    public static boolean A1Y(Object obj, boolean z) {
        return 0qQ.A0K(obj, Boolean.valueOf(z));
    }

    public static boolean A1Z(AnonymousClass0eM r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static Object[] A1b(int i) {
        return new Object[]{Integer.valueOf(i)};
    }
}

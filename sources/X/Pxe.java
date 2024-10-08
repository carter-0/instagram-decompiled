package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.proxygen.HTTPRequestError;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class Pxe {
    public static char A00(String str) {
        return str.charAt(0);
    }

    public static double A01(int i) {
        return (double) W2U.A00((float) i);
    }

    public static SharedPreferences A0H(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static Integer A0l() {
        return 5;
    }

    public static Integer A0m() {
        return 7;
    }

    public static String A0x(String str, int i) {
        return str.substring(0, i);
    }

    public static StringBuilder A15(int i, int i2) {
        return new StringBuilder(i + i2);
    }

    public static void A1M(Resources resources, ImageView imageView, int i) {
        imageView.setImageDrawable(resources.getDrawable(i, (Resources.Theme) null));
    }

    public static Object[] A1b() {
        return new Object[0];
    }

    public static int A02(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int A03(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int A04(int i, int i2, int i3) {
        return i3 | ((i & 8191) << i2);
    }

    public static int A06(C11389SRd sRd) {
        return sRd.A00 - sRd.A01;
    }

    public static int A09(Object obj) {
        return ((Integer) obj).intValue();
    }

    public static long A0D(byte[] bArr, int i) {
        return ((long) bArr[i]) & 255;
    }

    public static Intent A0E() {
        return new Intent("android.intent.action.VIEW");
    }

    public static Intent A0F(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static Intent A0G(String str) {
        return new Intent(str);
    }

    public static Uri.Builder A0I() {
        return new Uri.Builder();
    }

    public static Bundle A0J(Bundle bundle) {
        return new Bundle(bundle);
    }

    public static Pair A0K(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static SparseArray A0L() {
        return new SparseArray();
    }

    public static 0yf A0N(int i) {
        return new 01r(i);
    }

    public static SJM A0O(SOW sow) {
        return new SJM(sow);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.SRd, java.lang.Object] */
    public static C11389SRd A0P(int i) {
        ? obj = new Object();
        obj.A02 = new byte[i];
        obj.A00 = i;
        return obj;
    }

    public static 2IV A0R() {
        return new GraphQlCallInput();
    }

    public static HTTPRequestError.ProxygenError A0S(String str, int i) {
        return new HTTPRequestError.ProxygenError(str, i);
    }

    public static QZK A0T(BaseJavaModule baseJavaModule) {
        QZK qzk = baseJavaModule.mReactApplicationContext;
        0Sd.A01(qzk, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return qzk;
    }

    public static WritableNativeMap A0U() {
        return new WritableNativeMap();
    }

    public static C266724aF A0V(TimeUnit timeUnit, long j, long j2) {
        return new C266724aF(timeUnit, j, j2);
    }

    public static Feature A0X(String str, long j) {
        return new Feature(str, j);
    }

    public static ImmutableList.Builder A0Y() {
        return new ImmutableList.Builder();
    }

    public static UserSession A0a(Object obj) {
        return 09i.A0A.A08(obj);
    }

    public static ByteArrayOutputStream A0b() {
        return new ByteArrayOutputStream();
    }

    public static IOException A0c(String str, Throwable th) {
        return new IOException(str, th);
    }

    public static AssertionError A0d() {
        return new AssertionError();
    }

    public static AssertionError A0e(Object obj) {
        return new AssertionError(obj);
    }

    public static IllegalArgumentException A0g() {
        return new IllegalArgumentException();
    }

    public static IllegalArgumentException A0h(String str, Throwable th) {
        return new IllegalArgumentException(str, th);
    }

    public static IllegalStateException A0i() {
        return new IllegalStateException();
    }

    public static IllegalStateException A0j(String str, Throwable th) {
        return new IllegalStateException(str, th);
    }

    public static IndexOutOfBoundsException A0k(String str) {
        return new IndexOutOfBoundsException(str);
    }

    public static Integer A0n() {
        return 8;
    }

    public static Object A0p() {
        return new Object();
    }

    public static Object A0q(C269674fV r1, ContainerDeserializerBase containerDeserializerBase) {
        return containerDeserializerBase.A01.BWm(r1);
    }

    public static Object A0s(Object obj, 0s0 r2, AnonymousClass0YZ[] r3, int i) {
        return r2.CDM(obj, r3[i]);
    }

    public static Object A0t(Object[] objArr, int i) {
        Object obj = objArr[i];
        obj.getClass();
        return obj;
    }

    public static RuntimeException A0u(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static String A0v(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A11(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, charset);
    }

    public static String A13(String[] strArr, int i) {
        return strArr[i].trim();
    }

    public static StringBuilder A14(int i) {
        return new StringBuilder(i);
    }

    public static StringBuilder A16(String str) {
        return new StringBuilder(str);
    }

    public static Charset A17() {
        return Charset.forName(ReactWebViewManager.HTML_ENCODING);
    }

    public static HashMap A19(Map map) {
        return new HashMap(map);
    }

    public static LinkedList A1A() {
        return new LinkedList();
    }

    public static NoSuchElementException A1C() {
        return new NoSuchElementException();
    }

    public static AtomicLong A1D(long j) {
        return new AtomicLong(j);
    }

    public static JSONArray A1E() {
        return new JSONArray();
    }

    public static void A1G() {
        11Z.A05("This operation can't be run on UI thread.");
    }

    public static void A1H(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
    }

    public static void A1I(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i & 63) | 128);
    }

    public static void A1P(AnonymousClass2gO r0, Object obj) {
        ((2Fk) obj).A08(r0);
    }

    public static void A1Q(0Aj r1, 0bb r2) {
        r1.AAK(r2, "event_payload");
    }

    public static void A1R(0Ak r1, String str) {
        r1.A0R("iab_session_id", str);
    }

    public static void A1U(RH0 rh0, Object obj, Map map) {
        map.put(rh0.A00, obj);
    }

    public static void A1Y(StringBuilder sb) {
        sb.append(", ");
    }

    public static void A1a(char[] cArr, char[] cArr2, int i, int i2) {
        cArr2[i2] = cArr[i & 15];
    }

    public static int A05(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        return googleApiAvailabilityLight.A03(context, 12451000);
    }

    public static int A07(C11389SRd sRd, int i) {
        sRd.A0O(i);
        return sRd.A07();
    }

    public static int A08(Enum enumR, int[] iArr) {
        return iArr[enumR.ordinal()];
    }

    public static int A0A(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static long A0B(int i) {
        return (long) (i & 1048575);
    }

    public static long A0C(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static LinearLayout A0M(View view, int i) {
        return (LinearLayout) view.findViewById(i);
    }

    public static C7580QKv A0Q(Reference reference) {
        return (C7580QKv) reference.get();
    }

    public static SUj A0W(2Fk r0) {
        return (SUj) r0.A02();
    }

    public static ImmutableMap A0Z(ImmutableMap.Builder builder, Object obj, Object obj2) {
        builder.put(obj, obj2);
        return builder.build();
    }

    public static CharSequence A0f(List list, int i) {
        return (CharSequence) list.get(i);
    }

    public static Long A0o(Object obj, Map map) {
        return (Long) map.get(obj);
    }

    public static Object A0r(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return obj2;
    }

    public static String A0w(0Tu r0, 0lg r1, long j) {
        String A04 = 182.A04(r0, r1, j);
        0qQ.A0A(A04);
        return A04;
    }

    public static String A0y(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        0qQ.A07(string);
        return string;
    }

    public static String A0z(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static String A10(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static String A12(Locale locale, String str, Object[] objArr) {
        String format = String.format(locale, str, objArr);
        0qQ.A07(format);
        return format;
    }

    public static Collection A18(Map.Entry entry) {
        return (Collection) entry.getValue();
    }

    public static List A1B(Object obj, AbstractMap abstractMap) {
        return (List) abstractMap.get(obj);
    }

    public static void A1F() {
        Thread.currentThread().interrupt();
    }

    public static void A1J(long j, List list) {
        list.add(Long.valueOf(j));
    }

    public static void A1K(ContentValues contentValues, String str, int i) {
        contentValues.put(str, Integer.valueOf(i));
    }

    public static void A1L(Context context, Intent intent) {
        intent.setPackage(context.getPackageName());
    }

    public static void A1N(Handler handler, Object obj, int i) {
        handler.obtainMessage(i, obj).sendToTarget();
    }

    public static void A1O(Parcel parcel, Class cls, List list) {
        parcel.readList(list, cls.getClassLoader());
    }

    public static void A1S(0bb r1, String str) {
        r1.A06("view_name", str);
    }

    public static void A1T(0bb r1, String str) {
        r1.A06("target_name", str);
    }

    public static void A1V(Class cls, Object obj, AbstractMap abstractMap) {
        abstractMap.put(cls.getName(), obj);
    }

    public static void A1W(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A1X(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, Long.valueOf(j));
    }

    public static void A1Z(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf != null && !valueOf.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebResourceRequest;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import java.io.File;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public abstract class Pxf {
    public static long A0E(int i) {
        return ((long) i) * 1000;
    }

    public static XQX A0L(String str, Throwable th) {
        return new XQX(str, th, 1, true);
    }

    public static AnonymousClass40G A0M(Object obj) {
        return new AnonymousClass40G(obj, (String) null, true);
    }

    public static ImmutableMap.Builder A0Q() {
        return new ImmutableMap.Builder(4);
    }

    public static 1Pq A0S() {
        return new 1Pq((1HW) null);
    }

    public static String A0m(String str, Object[] objArr) {
        return String.format((Locale) null, str, objArr);
    }

    public static CountDownLatch A0y() {
        return new CountDownLatch(1);
    }

    public static AtomicInteger A10() {
        return new AtomicInteger(0);
    }

    public static void A1A(Parcel parcel, String str, int i, boolean z) {
        C301145yd.A0C(parcel, str, 3, z);
        C301145yd.A06(parcel, i);
    }

    public static boolean A1R(int i) {
        return i >= 0;
    }

    public static boolean A1S(Parcel parcel, String str) {
        C301145yd.A0C(parcel, str, 1, false);
        return false;
    }

    public static int A03(Parcel parcel) {
        return C301145yd.A01(parcel, 20293);
    }

    public static int A04(Pair pair) {
        return ((Number) pair.second).intValue();
    }

    public static int A05(Pair pair) {
        return ((Number) pair.first).intValue();
    }

    public static int A0D(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 8);
    }

    public static long A0F(String str) {
        return new File(str).length();
    }

    public static HandlerThread A0I(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        AnonymousClass0fe.A00(handlerThread);
        return handlerThread;
    }

    public static HandlerThread A0J(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        AnonymousClass0fe.A00(handlerThread);
        return handlerThread;
    }

    public static SUj A0P(Object obj) {
        SUj sUj = (SUj) obj;
        0qQ.A0B(sUj, 0);
        return sUj;
    }

    public static String A0d(CharSequence charSequence, String str, String str2) {
        return new 11S(str).A00(charSequence, str2);
    }

    public static String A0f(Object obj) {
        return new Gson().A0B(obj);
    }

    public static String A0k(String str) {
        return new 2Mg(str).A00();
    }

    public static List A0v() {
        return Collections.synchronizedList(new ArrayList());
    }

    public static Map A0w() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static void A17(Parcel parcel, int i, int i2) {
        C301145yd.A07(parcel, IgNetworkConsentStorage.MAX_ENTRIES, i);
        C301145yd.A06(parcel, i2);
    }

    public static void A1B(View view, int i) {
        view.setBackground(new ColorDrawable(i));
    }

    public static void A1F(C266824aP r1, C266764aJ r2) {
        r1.A04(new C266794aM(r2));
    }

    public static void A1M(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new 1Fn(str, str2));
    }

    public static String[] A1a(AbstractCollection abstractCollection, int i) {
        return (String[]) abstractCollection.toArray(new String[i]);
    }

    public static String[] A1b(Set set, int i) {
        return (String[]) set.toArray(new String[i]);
    }

    public static char A00(String str, StringBuilder sb) {
        sb.append(str);
        sb.append('\'');
        return '\'';
    }

    public static int A01(int i, int i2, int i3) {
        return Math.max(i3, Math.min(i, i2));
    }

    public static int A02(Activity activity, int i) {
        int A00 = AnonymousClass0fD.A00(i);
        AnonymousClass0fQ.A00(activity);
        return A00;
    }

    public static int A06(C11389SRd sRd, int i) {
        sRd.A0O(i);
        return sRd.A01();
    }

    public static int A07(C11389SRd sRd, int i) {
        sRd.A0P(i);
        return sRd.A05();
    }

    public static int A08(Object obj) {
        return Arrays.hashCode(new Object[]{obj});
    }

    public static int A09(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A0A(Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{obj, obj2});
    }

    public static int A0B(Object obj, Object obj2, Object obj3) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3});
    }

    public static int A0C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4, obj5});
    }

    public static Configuration A0G(Context context) {
        return context.getResources().getConfiguration();
    }

    public static Handler A0H(HandlerThread handlerThread) {
        return new Handler(handlerThread.getLooper());
    }

    public static Pair A0K(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static AnonymousClass45J A0N(Context context, AnonymousClass3RV r2, String str) {
        return r2.A00(context, 002.A0R("rti.mqtt.", str));
    }

    public static 0R3 A0O() {
        return 0b6.A00().A07();
    }

    public static AnonymousClass1QX A0R(1QS r2, AnonymousClass1QT r3) {
        return new AnonymousClass1QX(r2, r3.A00());
    }

    public static C46649DiU A0T(String str, Map map, Map map2) {
        return C46649DiU.A06(str, C359608dC.A01(map), map2);
    }

    public static File A0U(String str, String str2, File file) {
        return new File(file, 002.A0R(str, str2));
    }

    public static ArrayIndexOutOfBoundsException A0V(String str, Object[] objArr) {
        return new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static ClassLoader A0W(Object obj) {
        return obj.getClass().getClassLoader();
    }

    public static IllegalArgumentException A0X(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalStateException A0Y(String str, Object[] objArr) {
        return new IllegalStateException(String.format(str, objArr));
    }

    public static Integer A0Z(String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static String A0a(MediaFormat mediaFormat) {
        0qQ.A07(mediaFormat);
        return mediaFormat.getString("mime");
    }

    public static String A0b(Uri.Builder builder) {
        return builder.build().toString();
    }

    public static String A0c(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl().toString();
    }

    public static String A0e(Class cls, String str) {
        return 002.A0R(str, cls.getName());
    }

    public static String A0g(Object obj) {
        return obj.getClass().getCanonicalName();
    }

    public static String A0h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String A0i(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static String A0j(Object obj, Map map) {
        return String.valueOf(map.get(obj));
    }

    public static String A0l(String str, Object obj) {
        return 002.A0R(str, obj.toString());
    }

    public static String A0n(Locale locale, String str) {
        String upperCase = str.toUpperCase(locale);
        0qQ.A07(upperCase);
        return upperCase;
    }

    public static String A0o(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return group;
    }

    public static String A0p(byte[] bArr, int i) {
        String encodeToString = Base64.encodeToString(bArr, i);
        0qQ.A07(encodeToString);
        return encodeToString;
    }

    public static ArrayList A0q(Object[] objArr) {
        return new ArrayList(Arrays.asList(objArr));
    }

    public static HashMap A0r(Object obj, int i) {
        0qQ.A0B(obj, i);
        return new HashMap();
    }

    public static HashSet A0s(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A0t(BaseBundle baseBundle) {
        return baseBundle.keySet().iterator();
    }

    public static Iterator A0u(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static Map A0x(Map map) {
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public static ScheduledThreadPoolExecutor A0z() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        return scheduledThreadPoolExecutor;
    }

    public static Logger A11(Class cls) {
        return Logger.getLogger(cls.getName());
    }

    public static void A12(long j, StringBuilder sb) {
        sb.append(j);
        sb.append(", createdAtTs=");
    }

    public static void A13(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A14(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A15(Handler handler, int i) {
        handler.obtainMessage(i).sendToTarget();
    }

    public static void A16(IInterface iInterface, Parcel parcel) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void A18(Parcel parcel, Number number) {
        parcel.writeLong(number.longValue());
    }

    public static void A19(Parcel parcel, Number number) {
        parcel.writeInt(number.intValue());
    }

    public static void A1C(C11230SGo sGo, C13891TjE tjE, int i, int i2) {
        tjE.FP8(SPi.A00(sGo, i, i2));
    }

    public static void A1D(0Ak r2, double d) {
        r2.A0P("event_ts", Double.valueOf(d));
    }

    public static void A1E(AnonymousClass0Jz r1, GraphQlCallInput graphQlCallInput, String str) {
        graphQlCallInput.A02().A0E(r1, str);
    }

    public static void A1G(16F r1, C269674fV r2, StdDeserializer stdDeserializer) {
        r2.A0R(r1, stdDeserializer.A0U(r2));
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A1H(C269514fF r1, C268894eF r2, String str, Object[] objArr) {
        r1.A08(r2, String.format(str, objArr));
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A1I(02m r1, String str, String str2, int i) {
        r1.markerAnnotate(i, str, str2);
        r1.markerEnd(i, 3);
    }

    public static void A1J(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 4;
    }

    public static void A1K(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(str2);
    }

    public static void A1L(String str, String str2, String str3, String str4) {
        Log.w(str4, 002.A0g(str, str2, str3));
    }

    public static void A1N(String str, StringBuilder sb, boolean z) {
        sb.append(002.A1D(str, z));
    }

    public static void A1O(StringBuilder sb, Object obj) {
        sb.append(obj.toString());
    }

    public static void A1P(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('\'');
    }

    public static void A1Q(AbstractCollection abstractCollection, double d) {
        abstractCollection.add(Double.valueOf(d));
    }

    public static boolean A1U(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public static byte[] A1V(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        0qQ.A07(bytes);
        return bytes;
    }

    public static Object[] A1W(long j) {
        return new Object[]{Long.valueOf(j)};
    }

    public static Object[] A1X(Object obj, Object obj2, int i) {
        return Arrays.copyOf(new Object[]{obj, obj2}, i);
    }

    public static Object[] A1Y(Object obj, Object obj2, int i) {
        return new Object[]{obj, obj2, Integer.valueOf(i)};
    }

    public static Object[] A1Z(Throwable th) {
        return new Object[]{th.getMessage()};
    }

    public static boolean A1T(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36322860552366721L);
    }
}

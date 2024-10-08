package X;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.util.Base64;
import android.util.Log;
import android.util.Range;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.systrace.SystraceMessage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class Pxg {
    public static int A02(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
        return parcel2.readInt();
    }

    public static long A0D(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static long A0F(OutputStream outputStream, long j) {
        outputStream.write((((int) j) & 127) | 128);
        return j >>> 7;
    }

    public static AnonymousClass40G A0Q(Throwable th) {
        return new AnonymousClass40G(0sn.A00, th.getMessage(), false);
    }

    public static C307446Qd A0V(C307896Rx r1, AnonymousClass6Tm r2) {
        return C307476Qg.A02(C276734to.A00(r1, r2, 2));
    }

    public static C307446Qd A0W(C307896Rx r1, AnonymousClass6Tm r2) {
        return C307476Qg.A02(C276734to.A00(r1, r2, 3));
    }

    public static IllegalStateException A0f(String str, Object[] objArr) {
        return new IllegalStateException(String.format((Locale) null, str, objArr));
    }

    public static Object A0i(Class cls) {
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Object A0j(Collection collection) {
        return new ArrayList(collection).get(0);
    }

    public static String A0o(0lg r1) {
        0qQ.A0B(r1, 0);
        return C60510iO.A00(r1).BcO();
    }

    public static List A17(AnonymousClass6Tm r2) {
        Object obj = r2.A00.get(1);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        return (List) obj;
    }

    public static void A1E(Parcel parcel, int i, boolean z) {
        C301145yd.A09(parcel, 1, z);
        C301145yd.A06(parcel, i);
    }

    public static void A1F(Parcel parcel, Parcelable parcelable, int i, int i2) {
        C301145yd.A0A(parcel, parcelable, 1, i, false);
        C301145yd.A06(parcel, i2);
    }

    public static void A1G(Parcel parcel, Enum enumR) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(enumR.name());
    }

    public static void A1I(Animation animation) {
        animation.setFillAfter(true);
        animation.setInterpolator(new AccelerateInterpolator());
    }

    public static void A1N(String str, Object obj) {
        if (Log.isLoggable(str, 3)) {
            String.valueOf(String.valueOf(obj));
        }
    }

    public static void A1O(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static boolean A1T(int i, int i2) {
        return i <= i2;
    }

    public static boolean A1V(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return true;
        }
        return false;
    }

    public static boolean A1W(Parcel parcel, byte[] bArr) {
        C301145yd.A0F(parcel, bArr, 2, false);
        return false;
    }

    public static byte[] A1Y(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            return 0Yw.A0W(byteArray, i, byteArray.length);
        }
        return byteArray;
    }

    public static double A00() {
        return Math.pow(10.0d, 6.0d);
    }

    public static int A04(C11389SRd sRd) {
        sRd.A0O(8);
        return (sRd.A01() >> 24) & 255;
    }

    public static int A0B(int[] iArr, boolean[] zArr, int i, int i2, int i3) {
        if (!zArr[i]) {
            return i2;
        }
        int i4 = i2 + 1;
        iArr[i2] = i3;
        return i4;
    }

    public static long A0C(int i, long j) {
        return j | ((((long) i) & 255) << 16);
    }

    public static long A0G(Object obj) {
        return Double.doubleToRawLongBits(((Number) obj).doubleValue());
    }

    public static Activity A0K(Reference reference) {
        if (reference != null) {
            return (Activity) reference.get();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0bY] */
    public static Uri A0L(String str) {
        return 0cp.A01(new Object(), str);
    }

    public static BadParcelableException A0M(int i) {
        return new BadParcelableException(002.A0O("Parcel data not fully consumed, unread size: ", i));
    }

    public static 2Rb A0R() {
        if (AnonymousClass2RZ.A00 == null) {
            return 2Ra.A00;
        }
        2Rb r1 = AnonymousClass2RZ.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.privacy.zone.api.ZoneInterface");
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5I7, java.io.IOException] */
    public static AnonymousClass5I7 A0T(String str) {
        ? iOException = new IOException(str);
        iOException.A00 = null;
        return iOException;
    }

    public static C13903TjQ A0U(Object obj) {
        return SH5.A02.A00(obj.getClass());
    }

    public static BufferedReader A0X(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static IndexOutOfBoundsException A0g(int i) {
        return new IndexOutOfBoundsException(002.A0c("Beginning index: ", " < 0", i));
    }

    public static NullPointerException A0h(int i) {
        return new NullPointerException(002.A0O("at index ", i));
    }

    public static String A0l(int i, String str, String str2) {
        if (i != 0) {
            return str.concat(str2);
        }
        return new String(str);
    }

    public static String A0w(StringBuilder sb) {
        sb.append(']');
        return sb.toString();
    }

    public static String A0x(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static String A0z(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 11);
        0qQ.A07(encodeToString);
        return encodeToString;
    }

    public static Iterator A15(Collection collection) {
        return new HashSet(collection).iterator();
    }

    public static Iterator A16(Collection collection) {
        return new ArrayList(collection).iterator();
    }

    public static C60340gF A19(Object obj) {
        AnonymousClass9FB r1 = (AnonymousClass9FB) obj;
        0qQ.A0B(r1, 0);
        r1.A0B = false;
        return C60340gF.A00;
    }

    public static void A1A() {
        SystraceMessage.A00(SystraceMessage.A01, "", 8192).A02();
    }

    public static void A1B(int i, byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i3] = (byte) (i & 255);
    }

    public static void A1D(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.position(bufferInfo.offset);
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A1K(C266724aF r0, C266764aJ r1, C266744aH r2) {
        r2.A03 = r0;
        r1.A02(r2.A00());
    }

    public static byte[] A1X(String str) {
        byte[] decode = Base64.decode(str, 11);
        0qQ.A07(decode);
        return decode;
    }

    public static MediaCodecInfo[] A1Z(int i) {
        return new MediaCodecList(i).getCodecInfos();
    }

    public static 0eP[] A1b(Object obj, Object obj2, 0eP r3, 0eP r4) {
        return new 0eP[]{r3, r4, new 0eP(obj, obj2)};
    }

    public static int A01(Service service, Intent intent, int i) {
        int A04 = AnonymousClass0fD.A04(i);
        if (intent != null) {
            0eG.A01.A01(service, intent);
        }
        return A04;
    }

    public static int A03(Range range) {
        return ((Number) range.getUpper()).intValue();
    }

    public static int A05(0Tu r0, 0lg r1, long j) {
        return Long.valueOf(182.A01(r0, r1, j)).intValue();
    }

    public static int A06(Object obj, Map map) {
        return ((Number) map.get(obj)).intValue();
    }

    public static int A07(String str, StringBuilder sb, Object[] objArr, int i) {
        sb.append(str);
        int i2 = i + 1;
        sb.append(objArr[i]);
        return i2;
    }

    public static int A08(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        0qQ.A07(string);
        return Integer.parseInt(string);
    }

    public static int A09(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(jSONArray.getString(i));
        return i + 1;
    }

    public static int A0A(List list) {
        int size = list.size();
        int i = size * 2;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static long A0E(C266724aF r4, TimeUnit timeUnit) {
        return r4.A02(timeUnit) - r4.A03(timeUnit);
    }

    public static long A0H(Iterator it) {
        return ((Number) it.next()).longValue();
    }

    public static long A0I(List list, int i) {
        return ((Number) list.get(i)).longValue();
    }

    public static long A0J(List list, int i) {
        return Long.parseLong((String) list.get(i));
    }

    public static Handler A0N(HandlerThread handlerThread) {
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static PowerManager A0O(Context context) {
        Object systemService = context.getSystemService("power");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    public static C2818559v A0P(AnonymousClass0Ac r1, 0Aj r2, String str, String str2) {
        r2.AAJ(str, str2);
        r2.A8M(r1, "product_type");
        return C2818559v.ANDROID;
    }

    public static C13845TiL A0S(Object obj) {
        return SO7.A00().A01(obj.getClass());
    }

    public static File A0Y(Uri uri) {
        return new File(uri.getPath());
    }

    public static IOException A0Z(String str, String str2) {
        return new IOException(002.A0R(str, str2));
    }

    public static InputStreamReader A0a(Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        0qQ.A07(openRawResource);
        return new InputStreamReader(openRawResource, AnonymousClass15Q.A05);
    }

    public static IllegalArgumentException A0b(String str, long j) {
        return new IllegalArgumentException(002.A0Q(str, j));
    }

    public static IllegalArgumentException A0c(String str, String str2, String str3) {
        return new IllegalArgumentException(002.A0g(str, str2, str3));
    }

    public static IllegalArgumentException A0d(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0e(String str, String str2, String str3) {
        return new IllegalStateException(002.A0g(str, str2, str3));
    }

    public static RuntimeException A0k(String str, String str2) {
        return new RuntimeException(002.A0R(str, str2));
    }

    public static String A0m(UserFlowLoggerImpl userFlowLoggerImpl, String str, Throwable th, long j) {
        userFlowLoggerImpl.flowMarkPoint(j, str);
        String message = th.getMessage();
        if (message == null) {
            return "empty";
        }
        return message;
    }

    public static String A0n(AnonymousClass6Tm r2, int i) {
        Object A03 = r2.A03(i);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        return (String) A03;
    }

    public static String A0p(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static String A0q(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public static String A0r(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public static String A0s(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0t(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A0u(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String A0v(String str, Locale locale, Object[] objArr, int i) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i));
        0qQ.A07(format);
        return format;
    }

    public static String A0y(StringBuilder sb, long j) {
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public static Field A10(Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static URI A11(Uri.Builder builder) {
        return new URI(builder.build().toString());
    }

    public static ByteBuffer A12(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static ByteBuffer A13(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
    }

    public static ArrayList A14(AbstractCollection abstractCollection) {
        return new ArrayList(abstractCollection.size());
    }

    public static Set A18(Object[] objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static void A1C(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static void A1H(Parcel parcel, Number number, int i) {
        parcel.writeInt(i);
        parcel.writeDouble(number.doubleValue());
    }

    public static void A1J(0Ak r1, 0bb r2, String str) {
        r2.A06("view_name", str);
        r1.A0N(r2, "event_payload");
    }

    public static void A1L(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void A1M(Class cls) {
        Class.forName(cls.getName(), true, cls.getClassLoader());
    }

    public static void A1P(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A1Q(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.w(str2, sb.toString());
    }

    public static void A1R(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.getClass());
    }

    public static void A1S(StringBuilder sb, Map.Entry entry) {
        sb.append((String) entry.getKey());
    }

    public static boolean A1U(Parcel parcel) {
        if (parcel.readInt() != 1) {
            return false;
        }
        return true;
    }

    public static Object[] A1a(Object obj, int i, int i2) {
        return new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)};
    }
}

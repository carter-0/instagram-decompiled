package X;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.widget.listcell.ListCell;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.common.collect.CompactHashSet;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public abstract class Pxh {
    public static int A03(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static int A04(int i, int i2, int i3) {
        return Math.min(i3, i - i2);
    }

    public static int A0B(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static Bitmap A0H(Bitmap bitmap, Matrix matrix) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        0fO.A03(bitmap);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static SJC A0R(C11354SOn sOn, REA rea) {
        return new SJC(sOn, rea, -1, 2500000, false, false);
    }

    public static ItemDetails A0V() {
        return new ItemDetails(AnonymousClass05K.A00, (String) null);
    }

    public static C3734595o A0Y(Class cls) {
        return new C3734595o(cls, new Class[0]);
    }

    public static Object A0e(Class cls) {
        return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Object A0h(String str) {
        return Class.forName(str).getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static String A0o(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i2, i - i2, charset);
    }

    public static ArrayList A0t(Cursor cursor, AbstractMap abstractMap) {
        ArrayList arrayList = (ArrayList) abstractMap.get(cursor.getString(0));
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public static 015 A0y(Class cls, String str, String str2) {
        return new 015(cls, str, str2, 0);
    }

    public static void A15(Cursor cursor, AbstractMap abstractMap) {
        String string = cursor.getString(0);
        if (((ArrayList) abstractMap.get(string)) == null) {
            abstractMap.put(string, new ArrayList());
        }
    }

    public static void A1G(C3734595o r2, Class cls, int i) {
        r2.A02(new C3735395y(cls, i, 0));
    }

    public static String[] A1b(String str, String str2) {
        return str.split(str2, -1);
    }

    public static float A00(float f, float f2, float f3) {
        PointF pointF = SQL.A00;
        return f2 + (f3 * (f - f2));
    }

    public static int A05(int i, int i2, int i3) {
        int i4 = (i & 3) << 3;
        return ((255 & i3) << i4) | (i2 & ((255 << i4) ^ -1));
    }

    public static int A06(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A0C(List list, double d) {
        return (int) Math.ceil((d / 100.0d) * ((double) list.size()));
    }

    public static int A0E(byte[] bArr, int i, int i2, int i3, int i4) {
        if ((bArr[i] & 255) != 255 || bArr[i2] != 0) {
            return i4;
        }
        System.arraycopy(bArr, i + 2, bArr, i2, (i4 - (i - i3)) - 2);
        return i4 - 1;
    }

    public static long A0G(Object obj) {
        long longValue = ((Number) obj).longValue();
        return (longValue >> 63) ^ (longValue << 1);
    }

    public static Uri A0I(String str) {
        return C9944Rjx.A00.buildUpon().appendPath("package").appendPath(str).build();
    }

    public static Bundle A0J(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_use_alley_oop", z);
        bundle.putString("url", str);
        bundle.putString("package_name", str2);
        return bundle;
    }

    public static AnonymousClass2gB A0M() {
        return new AnonymousClass2gB();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.react.bridge.UnexpectedNativeTypeException, java.lang.RuntimeException] */
    public static UnexpectedNativeTypeException A0P(Class cls, String str, String str2) {
        String A13 = 002.A13("Value for ", str, " cannot be cast from ", str2, " to ", cls.getSimpleName());
        0qQ.A0B(A13, 1);
        return new RuntimeException(A13);
    }

    public static IllegalStateException A0a() {
        return new IllegalStateException("closed");
    }

    public static IllegalStateException A0b() {
        return new IllegalStateException("This dynamic value has been recycled");
    }

    public static Object A0d(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, String str) {
        Bundle bundle = browserLiteJSBridgeCall.A02;
        if (!bundle.containsKey(str)) {
            return null;
        }
        return bundle.get(str);
    }

    public static String A0j(C250663lr r1) {
        return r1.A07("financial_id");
    }

    public static String A0p(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, AnonymousClass2RN.A00);
    }

    public static StringBuilder A0r(String str, StringBuilder sb, List list, int i) {
        sb.append("]");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BloksCrash: children-binding index ");
        sb2.append(i);
        sb2.append(" scopeKey: ");
        sb2.append(str);
        sb2.append(" out of bounds for array of size ");
        sb2.append(list.size());
        sb2.append(" ");
        return sb2;
    }

    public static UnsupportedOperationException A0s() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static Map A0x(Object obj, AbstractMap abstractMap) {
        abstractMap.put("htc_video_rotA-000", obj);
        abstractMap.put("htc_video_rotA-090", 90);
        abstractMap.put("htc_video_rotA-180", 180);
        abstractMap.put("htc_video_rotA-270", 270);
        return Collections.unmodifiableMap(abstractMap);
    }

    public static 11S A0z(String str, Set set) {
        return new 11S(str, set);
    }

    public static short A10(short[] sArr, int i, int i2, int i3, int i4) {
        return (short) (((sArr[i] * (i2 - i3)) + (sArr[i4] * i3)) / i2);
    }

    public static void A11() {
        0qQ.A0F("loggingContext");
        throw null;
    }

    public static void A12(int i, byte[] bArr) {
        bArr[3] = (byte) (((i >> 11) & 3) | (bArr[3] & 252));
        bArr[4] = (byte) ((i >> 3) & 255);
        bArr[5] = (byte) (((i & 7) << 5) | 31);
    }

    public static void A19(0Aj r2, String str, String str2) {
        r2.AAJ(TraceFieldType.AdhocEventName, str);
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "DIRECT_LINK");
        r2.AAJ("clicked_url", str2);
        r2.Cgf();
    }

    public static void A1A(0Ak r3, String str, String str2) {
        r3.A0R("family_device_id", str);
        r3.A0R("waterfall_id", 1Q0.A01());
        r3.A0R("containermodule", "install_referrer");
        r3.A0R("referrer", str2);
        r3.Cgf();
    }

    public static void A1D(IABEvent iABEvent, StringBuilder sb, char c) {
        sb.append(", type=");
        sb.append(iABEvent.A02);
        sb.append(", iabSessionId='");
        sb.append(iABEvent.A03);
        sb.append(c);
        sb.append(", eventTs=");
        sb.append(iABEvent.A01);
        sb.append(", createdAtTs=");
    }

    public static void A1P(StringBuilder sb) {
        sb.append("[");
    }

    public static void A1R(Map map) {
        map.put("credential_type", "shop_pay");
    }

    public static void A1U(Object[] objArr) {
        objArr[34] = "\\\"";
        objArr[92] = "\\\\";
        objArr[9] = "\\t";
        objArr[8] = "\\b";
        objArr[10] = "\\n";
        objArr[13] = "\\r";
        objArr[12] = "\\f";
    }

    public static boolean A1V(MediaCodecInfo mediaCodecInfo, Object obj) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, mediaCodecInfo.getSupportedTypes());
        return arrayList.contains(obj);
    }

    public static boolean A1X(Object obj, 11S r1) {
        return r1.A07((CharSequence) obj);
    }

    public static float A01(Parcel parcel, int i) {
        C295505oK.A0D(parcel, i);
        return parcel.readFloat();
    }

    public static float A02(C12828T8z t8z) {
        return (float) t8z.A0B();
    }

    public static int A07(MediaMetadataRetriever mediaMetadataRetriever, int i) {
        return Integer.parseInt(mediaMetadataRetriever.extractMetadata(i));
    }

    public static int A08(Parcel parcel, int i) {
        C295505oK.A0D(parcel, i);
        return parcel.readInt();
    }

    public static int A09(AnonymousClass4XV r0, int i) {
        r0.A0G(i);
        return r0.A01();
    }

    public static int A0A(Object obj, Object obj2, Object obj3, Object obj4) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4});
    }

    public static int A0D(byte[] bArr, int i) {
        return i + Arrays.hashCode(bArr);
    }

    public static long A0F(C12524SwA swA) {
        SQLiteStatement compileStatement = swA.A03().compileStatement("PRAGMA page_count");
        AnonymousClass0fa.A00(1087689373);
        long simpleQueryForLong = compileStatement.simpleQueryForLong();
        AnonymousClass0fa.A00(-1175832770);
        SQLiteStatement compileStatement2 = swA.A03().compileStatement("PRAGMA page_size");
        AnonymousClass0fa.A00(-1218113153);
        long simpleQueryForLong2 = compileStatement2.simpleQueryForLong();
        AnonymousClass0fa.A00(-1738440242);
        return simpleQueryForLong * simpleQueryForLong2;
    }

    public static Parcel A0K(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(1276056990);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        AnonymousClass0fD.A0A(932077576, A03);
        obtain.writeStrongBinder(iBinder);
        return obtain;
    }

    public static Parcelable A0L(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static 1Ln A0N(0lg r2, String str) {
        0wc A02 = AnonymousClass0kN.A02(r2);
        1Ln r1 = new 1Ln(A02.A00(A02.A00, "instagram_android_install_with_referrer"), 285);
        if (str != null) {
            r1.A0R("error", str);
        }
        return r1;
    }

    public static C60104Jfk A0O(AnonymousClass0eM r0) {
        return (C60104Jfk) r0.getValue();
    }

    public static Q1G A0Q(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        ((Number) entry.getKey()).intValue();
        return (Q1G) entry.getValue();
    }

    public static C12404Std A0S(AnonymousClass0eM r0) {
        return (C12404Std) r0.getValue();
    }

    public static C11360SOw A0T(Object obj, Map map) {
        return (C11360SOw) map.get(obj);
    }

    public static ECPPaymentRequest A0U(2Fk r0) {
        return (ECPPaymentRequest) r0.A02();
    }

    public static JsonDeserializer A0W(C13901TjO tjO, C269674fV r2, C268894eF r3, JsonDeserializer jsonDeserializer) {
        C268894eF A03 = r3.A03();
        if (jsonDeserializer == null) {
            return r2.A0B(tjO, A03);
        }
        return r2.A0D(tjO, A03, jsonDeserializer);
    }

    public static SG2 A0X(MatroskaExtractor matroskaExtractor, int i) {
        MatroskaExtractor.A04(matroskaExtractor, i);
        return matroskaExtractor.A0R;
    }

    public static AnonymousClass95n A0Z(C3734595o r0, C3734795q r1) {
        r0.A01(r1);
        return r0.A00();
    }

    public static NullPointerException A0c() {
        return new NullPointerException("zze");
    }

    public static Object A0f(Object obj, String str, Map map) {
        Object obj2 = map.get(obj);
        0qQ.A0C(obj2, str);
        return obj2;
    }

    public static Object A0g(String str) {
        return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static String A0i(int i, Object obj) {
        return String.format("Pos: %d, limit: %d, len: %d", new Object[]{obj, Integer.valueOf(i), 1});
    }

    public static String A0k(UserFlowLoggerImpl userFlowLoggerImpl, Throwable th, long j) {
        userFlowLoggerImpl.flowAnnotate(j, "stacktrace", 2Og.A00(th));
        String message = th.getMessage();
        if (message == null) {
            return "empty";
        }
        return message;
    }

    public static String A0l(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0m(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0n(String str, Map map) {
        return (String) C2818159r.A00(str, map);
    }

    public static StringBuilder A0q(Object obj, int i) {
        return new StringBuilder(i + String.valueOf(obj).length());
    }

    public static Collection A0u(Object obj, Object obj2, AbstractMap abstractMap) {
        1J2.A01(obj, obj2);
        Collection collection = (Collection) abstractMap.get(obj);
        if (collection != null) {
            return collection;
        }
        CompactHashSet compactHashSet = new CompactHashSet();
        abstractMap.put(obj, compactHashSet);
        return compactHashSet;
    }

    public static LinkedHashMap A0v(0eP r0, 0eP r1, 0eP r2, 0eP r3, 0eP r4) {
        return 0Yt.A06(new 0eP[]{r0, r1, r2, r3, r4});
    }

    public static Locale A0w() {
        AnonymousClass2E0.A08();
        return AnonymousClass1Q2.A02();
    }

    public static void A13(Context context, ListCell listCell, int i) {
        listCell.setPrimaryText(context.getString(i));
    }

    public static void A14(Intent intent, String str, AbstractMap abstractMap) {
        abstractMap.put(str, intent.getStringExtra(str));
    }

    public static void A16(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, SurfaceTexture surfaceTexture, HandlerThread handlerThread) {
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, new Handler(looper));
    }

    public static void A17(BaseBundle baseBundle, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        baseBundle.putString((String) entry.getKey(), (String) entry.getValue());
    }

    public static void A18(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "product_type");
        r2.A8M(C2818559v.ANDROID, "platform");
        r2.A9F("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A1B(C361258fv r0, String str, float f, float f2) {
        GLES20.glUniform2f(C361258fv.A00(r0, str), f, f2);
    }

    public static void A1C(IABEvent iABEvent, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(iABEvent.A02);
        sb.append(", iabSessionId='");
        sb.append(iABEvent.A03);
        sb.append('\'');
        sb.append(", eventTs=");
    }

    public static void A1E(Callback callback, Object obj) {
        callback.invoke(obj);
    }

    public static void A1F(C266824aP r1, C266764aJ r2, C266744aH r3) {
        r2.A02(r3.A00());
        r1.A04(new C266794aM(r2));
    }

    public static void A1H(Object obj) {
        obj.getClass().getClassLoader();
    }

    public static void A1I(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), obj);
    }

    public static void A1J(String str, String str2, String str3) {
        STH.A03(str3, 002.A0R(str, str2));
    }

    public static void A1K(String str, String str2, String str3) {
        Log.w(str3, 002.A0R(str, str2));
    }

    public static void A1L(String str, String str2, String str3) {
        Log.e(str3, str.concat(str2));
    }

    public static void A1M(String str, String str2, String str3) {
        2AG.A04(str3, 002.A0R(str, str2));
    }

    public static void A1N(String str, String str2, JSONObject jSONObject) {
        jSONObject.put(str2, Long.parseLong(str));
    }

    public static void A1O(String str, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(Integer.valueOf(Integer.parseInt(str.substring(i, i2))));
    }

    public static void A1Q(Throwable th, AbstractMap abstractMap) {
        abstractMap.put("error", th.toString());
        String stackTraceString = Log.getStackTraceString(th);
        0qQ.A0A(stackTraceString);
        abstractMap.put(TraceFieldType.Error, stackTraceString);
    }

    public static void A1S(AtomicLong atomicLong) {
        atomicLong.set(SystemClock.uptimeMillis());
    }

    public static void A1T(boolean z) {
        17k.A0H(z, "no calls to next() since the last call to remove()");
    }

    public static boolean A1W(Class cls, Object obj) {
        return cls.isAssignableFrom(obj.getClass());
    }

    public static int[] A1Y(int i) {
        return new int[]{i};
    }

    public static Object[] A1Z() {
        return new Object[]{"value_"};
    }

    public static Object[] A1a(int i, int i2, int i3) {
        return new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
    }
}

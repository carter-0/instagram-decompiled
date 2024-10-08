package X;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import android.widget.EditText;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.File;
import java.lang.reflect.Executable;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Pxk {
    public static Bitmap A09(Bitmap bitmap, Matrix matrix) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        0fO.A03(bitmap2);
        return Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
    }

    public static Object A0G(Object obj, Object[] objArr, int i) {
        if (obj == null || i != 1) {
            return null;
        }
        Object obj2 = objArr[0];
        obj2.getClass();
        if (!obj2.equals(obj)) {
            return null;
        }
        Object obj3 = objArr[1];
        obj3.getClass();
        return obj3;
    }

    public static String A0H(C61080JwI jwI) {
        List list = (List) jwI.A00;
        0qQ.A0B(list, 0);
        if (C11413SSl.A02(list).isEmpty()) {
            return "credit_card_nux";
        }
        return "credit_card_pux";
    }

    public static StringBuilder A0J(int i) {
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
        sb.append('{');
        return sb;
    }

    public static void A0M(int i, int i2, char[] cArr, int i3) {
        int i4 = i | i2;
        cArr[i3] = (char) ((i4 >>> 10) + 55232);
        cArr[i3 + 1] = (char) ((i4 & 1023) + 56320);
    }

    public static void A0S(WebView webView) {
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
    }

    public static void A0T(WebView webView) {
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }

    public static void A0X(QKL qkl) {
        EditText editText = qkl.A05;
        if (editText != null && editText.requestFocus()) {
            EditText editText2 = qkl.A05;
            Context context = qkl.getContext();
            Dialog dialog = qkl.A01;
            if (editText2 != null) {
                editText2.postDelayed(new TIQ(dialog, context, editText2), 200);
            }
        }
    }

    public static void A0g(byte[] bArr, int i) {
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static int A00(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 >= i2) {
            return i3;
        }
        int highestOneBit = Integer.highestOneBit(i2 - 1);
        int i4 = highestOneBit + highestOneBit;
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    public static int A02(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        return i5;
    }

    public static int A04(byte[] bArr, int i, long j) {
        int i2 = i + 1;
        bArr[i] = (byte) (((int) (j >> 32)) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (((int) (j >> 40)) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((int) (j >> 48)) & 255);
        return i4;
    }

    public static int A05(byte[] bArr, int i, long j) {
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        return i5;
    }

    public static long A06(long j) {
        return (((j >> 24) & 255) << 21) | (j & 255) | (((j >> 8) & 255) << 7) | (((j >> 16) & 255) << 14);
    }

    public static long A07(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static Rect A0A(DocumentType documentType, float f, int i, int i2) {
        int i3 = (int) (16.0f * f);
        int widthToHeightRatio = (int) ((((float) i2) / 2.0f) - ((((float) (i - (i3 * 2))) * (1.0f / documentType.getWidthToHeightRatio())) / 2.0f));
        return new Rect(i3, widthToHeightRatio, i - i3, i2 - widthToHeightRatio);
    }

    public static C346327uz A0C(String str) {
        C346327uz r3 = new C346327uz(str);
        SparseIntArray sparseIntArray = r3.A0A;
        sparseIntArray.put(10241, 9729);
        sparseIntArray.put(10240, 9729);
        sparseIntArray.put(10242, 33071);
        sparseIntArray.put(10243, 33071);
        return r3;
    }

    public static AnonymousClass4Kx A0D() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r2 = new AnonymousClass4L7(r1, "base64url_encoded_island_rsa_pub");
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "base64url_encoded_island_rsa_pub_signature");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r1, "base64url_encoded_opaque_pub");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r1, "base64url_encoded_opaque_pub_signature");
        AnonymousClass4L7 r6 = new AnonymousClass4L7(r1, "base64url_encoded_island_ed25519_pub");
        AnonymousClass4L7 r7 = new AnonymousClass4L7(r1, "base64url_encoded_island_ed25519_pub_signature");
        AnonymousClass4L7 r8 = new AnonymousClass4L7(AnonymousClass4LF.A00, "is_registered");
        AnonymousClass4L8 r12 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, r3, r4, r5, r6, r7, r8, new AnonymousClass4L7(r12, "attempts_remaining"), new AnonymousClass4L7(r12, "login_timeout_remaining_secs")});
    }

    public static Ni4 A0E(Context context, Uri uri) {
        String fileExtensionFromUrl;
        OOC ooc = new OOC();
        File cacheDir = context.getCacheDir();
        long currentTimeMillis = System.currentTimeMillis();
        if (uri == null) {
            fileExtensionFromUrl = "jpg";
        } else {
            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        }
        ooc.A03(RDK.A00.A00(context), cacheDir, 002.A0r("temp__", ".", fileExtensionFromUrl, currentTimeMillis));
        return ooc.A00();
    }

    public static IllegalArgumentException A0F(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Length too large: ");
        sb.append(i);
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static UnsupportedOperationException A0K(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong view binded in: ");
        sb.append(obj.getClass());
        return new UnsupportedOperationException(sb.toString());
    }

    public static void A0V(0Aj r2) {
        r2.AAJ(Py7.A00(), AnonymousClass2M6.A00);
        r2.AAJ("product_type", AnonymousClass2MT.A00);
        r2.AAJ("platform", "android");
        r2.A9F("actual_event_time", Long.valueOf(System.currentTimeMillis()));
        r2.Cgf();
    }

    public static void A0W(0Aj r2, 0bb r3, int i) {
        1Ln r1 = new 1Ln(r2, i);
        if (r1.A00.isSampled()) {
            r1.A0N(r3, "event_payload");
            r1.Cgf();
        }
    }

    public static void A0Y(C39897ADz aDz, AbstractMap abstractMap, float f, long j) {
        abstractMap.put("render_audio_was_recording", String.valueOf(aDz.A0A));
        abstractMap.put("render_audio_frame_size_ms", String.valueOf(Math.round(f)));
        abstractMap.put("render_audio_num_frames", String.valueOf(aDz.A06));
        abstractMap.put("render_audio_samples_per_frame", String.valueOf(j));
    }

    public static void A0Z(C10782Ry3 ry3, String str) {
        if (str != null) {
            ry3.A02 = new FormCellLoggingEvents(new FormCellFocusEvents("user_click_contactdetails_atomic", "client_add_contactdetails_fail", "client_add_contactdetails_success", str));
        }
    }

    public static void A0a(String str, StringBuilder sb, int i, boolean z) {
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        sb.append(i);
    }

    public static void A0b(StringBuilder sb, int i) {
        sb.append('\\');
        sb.append((char) (((i >>> 6) & 3) + 48));
        sb.append((char) (((i >>> 3) & 7) + 48));
    }

    public static void A0c(Executable executable, AbstractCollection abstractCollection, AbstractMap abstractMap, AbstractMap abstractMap2) {
        abstractMap.put(executable.getName(), executable);
        if (executable.getParameterTypes().length == 0) {
            abstractMap2.put(executable.getName(), executable);
            if (executable.getName().startsWith("get")) {
                abstractCollection.add(executable.getName());
            }
        }
    }

    public static void A0d(Executable executable, AbstractMap abstractMap, AbstractMap abstractMap2) {
        if (Modifier.isPublic(executable.getModifiers()) && executable.getParameterTypes().length == 0) {
            if (executable.getName().startsWith("has")) {
                abstractMap.put(executable.getName(), executable);
            } else if (executable.getName().startsWith("get")) {
                abstractMap2.put(executable.getName(), executable);
            }
        }
    }

    public static void A0f(AbstractMap abstractMap, int i) {
        abstractMap.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        abstractMap.put("bg_lime", Integer.valueOf(Color.rgb(i, 255, i)));
        abstractMap.put("bg_cyan", Integer.valueOf(Color.rgb(i, 255, 255)));
        abstractMap.put("bg_red", Integer.valueOf(Color.rgb(255, i, i)));
        abstractMap.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, i)));
        abstractMap.put("bg_magenta", Integer.valueOf(Color.rgb(255, i, 255)));
        abstractMap.put("bg_blue", Integer.valueOf(Color.rgb(i, i, 255)));
        abstractMap.put("bg_black", Integer.valueOf(Color.rgb(i, i, i)));
    }

    public static boolean A0h(AbstractMap abstractMap) {
        abstractMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        abstractMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        abstractMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        abstractMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        abstractMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        abstractMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        abstractMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        abstractMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        return false;
    }

    public static int A01(AnonymousClass4XV r4) {
        return (r4.A02() << 21) | (r4.A02() << 14) | (r4.A02() << 7) | r4.A02();
    }

    public static PendingIntent A08(PendingIntent pendingIntent, Parcel parcel) {
        int readInt = parcel.readInt();
        if (((char) readInt) == 1) {
            return (PendingIntent) C295505oK.A04(parcel, PendingIntent.CREATOR, readInt);
        }
        C295505oK.A0C(parcel, readInt);
        return pendingIntent;
    }

    public static RectF A0B(ReadableMap readableMap) {
        float f = (float) readableMap.getDouble("x");
        float f2 = (float) readableMap.getDouble("y");
        return new RectF(W2U.A01(f), W2U.A01(f2), W2U.A01((float) (((double) f) + readableMap.getDouble(IgReactMediaPickerNativeModule.WIDTH))), W2U.A01((float) (((double) f2) + readableMap.getDouble(IgReactMediaPickerNativeModule.HEIGHT))));
    }

    public static String A0I(Object obj, Throwable th) {
        String A0g = 002.A0g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0g), th);
        return 002.A11("<", A0g, " threw ", th.getClass().getName(), ">");
    }

    public static void A0L() {
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    public static void A0N(Context context, SOJ soj, String str, String str2) {
        if (str.length() != 0) {
            if (!0b6.A00().A0A().A0G(context, context.getPackageManager().getLaunchIntentForPackage(str))) {
                soj.A01("FAILED_APP_OPEN");
            } else {
                soj.A01(str2);
            }
        }
    }

    public static void A0O(Context context, String str, StringBuilder sb) {
        sb.append(str);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
    }

    public static void A0P(BaseBundle baseBundle, ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
            baseBundle.putLong(str, (long) readableMap.getDouble(str));
        }
    }

    public static void A0Q(Bundle bundle, C58840Ae r8, SRE sre, Integer num, Throwable th) {
        String message = th.getMessage();
        Class<?> cls = th.getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls, 1);
        SRE sre2 = sre;
        sre2.A03(bundle, r8, num, message, 0q1.A01(cls), 2Og.A00(th));
    }

    public static void A0R(Parcel parcel, ViewGroup.MarginLayoutParams marginLayoutParams, byte b) {
        parcel.writeByte(b);
        parcel.writeInt(marginLayoutParams.bottomMargin);
        parcel.writeInt(marginLayoutParams.leftMargin);
        parcel.writeInt(marginLayoutParams.rightMargin);
        parcel.writeInt(marginLayoutParams.topMargin);
        parcel.writeInt(marginLayoutParams.height);
        parcel.writeInt(marginLayoutParams.width);
    }

    public static void A0U(AnonymousClass0Ac r1, 0Ak r2) {
        r2.A0M(r1, "product_type");
        r2.A0M(C2818559v.ANDROID, "platform");
        r2.A0Q("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A0e(AbstractCollection abstractCollection, Collection collection, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        if (collection.contains(entry.getValue())) {
            abstractCollection.add(entry.getKey());
        }
    }

    public static byte[] A0i(String str, long j, long j2) {
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}).getBytes(AnonymousClass2RN.A05);
    }
}

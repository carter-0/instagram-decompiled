package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.PromiseImpl;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.logging.FBPayLoggerData;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableMap;
import com.instagram.react.modules.base.IgNativeColorsModule;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import org.json.JSONObject;

public abstract class Pxi {
    public static float A02(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        return parcel.readFloat();
    }

    public static int A03(int i, int i2) {
        return (((i + i2) * 31) + i2) * 31;
    }

    public static int A05(Parcel parcel, int i) {
        C295505oK.A0F(parcel, i, 4);
        return parcel.readInt();
    }

    public static C11353SOm A0I(Object obj) {
        0qQ.A0B(obj, 0);
        return AnonymousClass2E0.A01();
    }

    public static Object A0V(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return obj;
        }
        return null;
    }

    public static String A0e(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return parcel.readString();
        }
        return null;
    }

    public static String A0i(String str) {
        return str.substring(0, 1).toLowerCase();
    }

    public static 0eP A0q(Object obj, float f) {
        return new 0eP(obj, Double.valueOf((double) f));
    }

    public static void A0r(int i) {
        GLES20.glBindFramebuffer(i, 0);
        GLES20.glBindTexture(3553, 0);
    }

    public static void A0t(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (((int) (j >> i)) & 255);
    }

    public static void A0z(IBinder iBinder, Parcel parcel) {
        iBinder.transact(1, parcel, (Parcel) null, 1);
    }

    public static void A10(IBinder iBinder, Parcel parcel, int i) {
        iBinder.transact(i, parcel, (Parcel) null, 1);
    }

    public static void A11(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        parcel.readInt();
    }

    public static void A12(Parcel parcel, int i, int i2) {
        C301145yd.A07(parcel, 4, i);
        C301145yd.A06(parcel, i2);
    }

    public static void A13(Parcel parcel, String str) {
        C301145yd.A0C(parcel, str, 1, false);
    }

    public static void A14(Parcel parcel, String str, int i, boolean z) {
        C301145yd.A0C(parcel, str, 4, z);
        C301145yd.A06(parcel, i);
    }

    public static void A16(Parcel parcel, List list, int i, int i2) {
        C301145yd.A0E(parcel, list, i, false);
        C301145yd.A06(parcel, i2);
    }

    public static void A1J(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new C59712JUv(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static boolean A1P(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A1R(Parcel parcel, Parcelable parcelable, int i) {
        C301145yd.A0A(parcel, parcelable, 2, i, false);
        return false;
    }

    public static boolean A1S(C250663lr r2) {
        return r2.getCoercedBooleanField(6, "is_optional");
    }

    public static boolean A1W(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static double A00(Parcel parcel, int i) {
        C295505oK.A0F(parcel, i, 8);
        return parcel.readDouble();
    }

    public static int A04(int i, int i2) {
        return ((i << 28) + (i2 + 112)) >> 30;
    }

    public static int A06(Parcel parcel, int i) {
        int A01 = C301145yd.A01(parcel, 20293);
        C301145yd.A05(parcel, i);
        return A01;
    }

    public static long A08(Parcel parcel, int i) {
        C295505oK.A0F(parcel, i, 8);
        return parcel.readLong();
    }

    public static Intent A0B(String str, String str2) {
        return new Intent().putExtra(str, str2);
    }

    public static Bundle A0C(Bundle bundle, Object obj) {
        if (obj == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static LayoutInflater A0F(Context context, int i) {
        return LayoutInflater.from(new ContextThemeWrapper(context, i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8Af, java.lang.Exception] */
    public static C351748Af A0H(String str, Throwable th) {
        return new Exception(str, th);
    }

    public static FBPayLoggerData A0J(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("logger_data");
        parcelable.getClass();
        return (FBPayLoggerData) parcelable;
    }

    public static C8608Qxp A0K(Fragment fragment) {
        C8608Qxp qxp = fragment.mParentFragment;
        0qQ.A0C(qxp, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        return qxp;
    }

    public static JsonSerializer A0M(C13901TjO tjO, JsonSerializer jsonSerializer, C269504fE r2, int i) {
        if (i != 0) {
            return ((C269714fZ) jsonSerializer).ALi(tjO, r2);
        }
        return jsonSerializer;
    }

    public static C8146Qhf A0N(C267574bm r1) {
        C8146Qhf A11 = r1.A11(r1.A01);
        A11.A1J();
        return A11;
    }

    public static Object A0X(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static String A0Y() {
        return String.valueOf(C9960RkF.A00.getAndIncrement());
    }

    public static String A0f(Parcel parcel, String str, int i, int i2, int i3) {
        if (i == i2) {
            return C295505oK.A08(parcel, i3);
        }
        C295505oK.A0C(parcel, i3);
        return str;
    }

    public static String A0j(String str) {
        return str.replace('$', '.');
    }

    public static LinkedHashMap A0n(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("logging_context", obj);
        return linkedHashMap;
    }

    public static void A0s(int i, int i2, char[] cArr, int i3) {
        cArr[i3] = (char) (((i & 31) << 6) | (i2 & 63));
    }

    public static void A0v(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A0x(BaseBundle baseBundle, String str, String str2, int i) {
        baseBundle.putString(002.A0b(str, "#", i), str2);
    }

    public static void A0y(Bundle bundle, C11249SHj sHj) {
        bundle.putParcelable("logger_data", new FBPayLoggerData(sHj));
    }

    public static void A1A(2Fk r1, AnonymousClass2gB r2, 0sP r3, int i) {
        r2.A0E(r1, new C64319LZu(i, r3));
    }

    public static void A1B(0Aj r1, 0bb r2, Map map) {
        r2.A08("checkout_info", map);
        r1.AAK(r2, "event_payload");
    }

    public static void A1C(0Aj r1, String str) {
        r1.AAJ("containermodule", str);
        r1.Cgf();
    }

    public static void A1D(17Z r0, JsonSerializer jsonSerializer, C269504fE r2, SPK spk, Object obj) {
        if (spk == null) {
            jsonSerializer.A0A(r0, r2, obj);
        } else {
            jsonSerializer.A09(r0, r2, spk, obj);
        }
    }

    public static void A1E(C269674fV r3, BeanDeserializerBase beanDeserializerBase) {
        C8157Qhq[] qhqArr = beanDeserializerBase.A0G;
        if (qhqArr != null && 0 < qhqArr.length) {
            r3.A0g(qhqArr[0].A00);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static void A1F(1Ng r1, Integer num, String str, boolean z) {
        r1.A00(new C50272FWd(num, str, z));
    }

    public static void A1I(Object obj, Map map) {
        if (obj != null) {
            map.put("CREDENTIAL_TYPE", obj);
        }
    }

    public static void A1K(String str, Object obj, String str2) {
        ((PromiseImpl) obj).reject(str, str2, (Throwable) null, (C13948Tm8) null);
    }

    public static void A1L(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new CheckoutSetupKeyValue(str, str2));
    }

    public static boolean A1Q(Parcel parcel, int i, int i2, int i3, boolean z) {
        if (i == i2) {
            return C295505oK.A0G(parcel, i3);
        }
        C295505oK.A0C(parcel, i3);
        return z;
    }

    public static boolean A1T(CheckoutConfiguration checkoutConfiguration) {
        return checkoutConfiguration.A0I.contains(C8891REi.REQUEST_BILLING_ADDRESS);
    }

    public static boolean A1U(C269504fE r2) {
        return r2.A05.A0D(C269424f6.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public static boolean A1V(1UV r1, Object obj, Object obj2) {
        return r1.apply(new ImmutableEntry(obj, obj2));
    }

    public static boolean A1Y(Object obj, boolean z) {
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public static byte[] A1a(Parcel parcel, byte[] bArr, int i, int i2, int i3) {
        if (i == i2) {
            return C295505oK.A0H(parcel, i3);
        }
        C295505oK.A0C(parcel, i3);
        return bArr;
    }

    public static byte[] A1b(TAO tao) {
        if (tao == null) {
            return null;
        }
        return tao.A03();
    }

    public static float A01(float f, float f2, float f3) {
        return Math.max(f3, Math.min(f, f2));
    }

    public static int A07(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return Integer.parseInt(group);
    }

    public static long A09(String str, JSONObject jSONObject) {
        return Long.parseLong(jSONObject.getString(str));
    }

    public static long A0A(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return Long.parseLong(group);
    }

    public static Bundle A0D(Parcel parcel, Class cls) {
        return parcel.readBundle(cls.getClassLoader());
    }

    public static Bundle A0E(2FO r0, String str, Map map) {
        r0.Cgl(str, map);
        return new Bundle();
    }

    public static AnonymousClass2gB A0G(SJ1 sj1, Stc stc) {
        AnonymousClass2gB A05 = stc.A05(sj1);
        0qQ.A0C(A05, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.paymentmethod.model.PaymentMethodComponentData>>");
        return A05;
    }

    public static C268894eF A0L(C268894eF r0, int i) {
        C268894eF A07 = r0.A07(i);
        if (A07 == null) {
            return AnonymousClass4eE.A07;
        }
        return A07;
    }

    public static C8467QvC A0O(byte[] bArr) {
        AnonymousClass3Qk.A02(bArr);
        return TAO.A01(bArr, bArr.length);
    }

    public static C249803kO A0P(Parcel parcel, ImmutableCollection immutableCollection) {
        parcel.writeInt(immutableCollection.size());
        return immutableCollection.iterator();
    }

    public static C249803kO A0Q(C250663lr r0, Class cls, String str, int i, int i2) {
        return r0.getRequiredCompactedTreeListField(i, str, cls, i2).iterator();
    }

    public static Boolean A0R(Object obj, Object obj2) {
        return Boolean.valueOf(0qQ.A0K(obj, obj2));
    }

    public static Integer A0S(Parcel parcel, int i) {
        return AnonymousClass05K.A00(i)[parcel.readInt()];
    }

    public static Long A0T(Parcel parcel) {
        return Long.valueOf(parcel.readLong());
    }

    public static Object A0U(Parcel parcel, Class cls) {
        return parcel.readValue(cls.getClassLoader());
    }

    public static Object A0W(String str, String str2, AbstractMap abstractMap) {
        return abstractMap.get(002.A0R(str, str2));
    }

    public static String A0Z(int i, int i2, String str, String str2) {
        return 002.A0R(str2, str.substring(i, i2));
    }

    public static String A0a(Activity activity) {
        return activity.getIntent().getAction();
    }

    public static String A0b(Context context, int i) {
        return IgNativeColorsModule.parseColorInteger(context.getColor(i));
    }

    public static String A0c(Uri uri) {
        return AnonymousClass6QJ.A00(uri).toString();
    }

    public static String A0d(BaseBundle baseBundle, String str) {
        return String.valueOf(baseBundle.get(str));
    }

    public static String A0g(C250663lr r0, Enum enumR, String str, int i) {
        return String.valueOf(r0.getOptionalEnumField(i, str, enumR));
    }

    public static String A0h(S01 s01, TAO tao) {
        byte[] A03 = tao.A03();
        return s01.A00(A03, A03.length);
    }

    public static ArrayList A0k(List list, int i) {
        return new ArrayList(list.size() + i);
    }

    public static Iterator A0l(Parcel parcel, AbstractCollection abstractCollection) {
        parcel.writeInt(abstractCollection.size());
        return abstractCollection.iterator();
    }

    public static Iterator A0m(Collection collection) {
        return C11424STg.A03(collection).iterator();
    }

    public static Set A0o(ImmutableMap.Builder builder, Object obj, Object obj2, AnonymousClass0eM r3) {
        builder.put(obj, obj2);
        return (Set) r3.getValue();
    }

    public static C318126oR A0p(String str, String str2) {
        return new C318126oR(002.A0R(str, str2));
    }

    public static void A0u(Context context, Drawable drawable, View view, int i) {
        drawable.setTint(context.getColor(i));
        view.setBackground(drawable);
    }

    public static void A0w(BaseBundle baseBundle, String str) {
        baseBundle.putStringArray("PTT_UTIL_CAP_NAMES", new String[]{str});
    }

    public static void A15(Parcel parcel, Iterator it) {
        parcel.writeString((String) it.next());
    }

    public static void A17(SparseArray sparseArray, SparseArray sparseArray2, int i) {
        sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
    }

    public static void A18(View view) {
        0qQ.A0A(view);
        view.setVisibility(8);
    }

    public static void A19(ImageView imageView, C7371Q9a q9a, List list, int i) {
        C7371Q9a.A00(imageView, q9a, (String) list.get(i));
    }

    public static void A1G(Object obj, Object obj2, BitSet bitSet, Map map) {
        map.put(obj, obj2);
        bitSet.set(2);
    }

    public static void A1H(Object obj, Object obj2, BitSet bitSet, Map map) {
        map.put(obj, obj2);
        bitSet.set(3);
    }

    public static void A1M(ByteBuffer byteBuffer, float f) {
        byteBuffer.putShort((short) ((int) ((f * 50000.0f) + 0.5f)));
    }

    public static void A1N(ByteBuffer byteBuffer, AbstractCollection abstractCollection, long j) {
        byteBuffer.putLong(j);
        abstractCollection.add(byteBuffer.array());
    }

    public static void A1O(ByteBuffer byteBuffer, List list, int i) {
        byteBuffer.putInt(i);
        byteBuffer.putInt(list.size());
    }

    public static boolean A1X(Object obj, List list, int i) {
        return obj.equals(list.get(i));
    }

    public static boolean A1Z(String str) {
        return str.trim().isEmpty();
    }
}

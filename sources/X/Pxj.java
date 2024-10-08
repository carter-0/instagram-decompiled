package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.common.json.FbJsonField;
import com.facebook.msys.mcf.MsysError;
import com.facebook.odin.model.FeatureData;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.form.fragment.model.FormMutationEvent;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.logging.FBPayLoggerData;
import com.facebookpay.offsite.models.message.GsonUtils;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fbpay.w3c.CardDetails;
import com.google.gson.Gson;
import com.instagram.android.R;
import java.io.FileNotFoundException;
import java.text.BreakIterator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONObject;

public abstract class Pxj {
    public static char A01(C369008tg r4) {
        GLES20.glBindFramebuffer(36160, r4.A00);
        GLES20.glViewport(0, 0, r4.A02, r4.A01);
        return 36160;
    }

    public static int A08(Parcel parcel, int i, int i2, int i3) {
        if (i != 4) {
            C295505oK.A0C(parcel, i2);
            return i3;
        }
        C295505oK.A0F(parcel, i2, 4);
        return parcel.readInt();
    }

    public static Context A0E(View view) {
        0qQ.A0B(view, 0);
        Context context = view.getContext();
        0qQ.A07(context);
        return context;
    }

    public static ContextThemeWrapper A0K(Fragment fragment, Object obj) {
        0qQ.A0B(obj, 0);
        Context requireContext = fragment.requireContext();
        AnonymousClass2E0.A0A();
        return new ContextThemeWrapper(requireContext, R.style.FBPayUIWidget);
    }

    public static MsysError A0T() {
        return new MsysError(MsysError.initNativeHolder("FileManagerInitializationError", 0, (Map) null));
    }

    public static RH6 A0W(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        return RH6.valueOf(parcel.readString());
    }

    public static SelectionHeaderItem A0X(int i) {
        return new SelectionHeaderItem(RH6.A0p, Integer.valueOf(i), AnonymousClass05K.A0C, (String) null, (String) null);
    }

    public static Gson A0Z(GsonUtils gsonUtils, Object obj) {
        0qQ.A0B(obj, 0);
        return gsonUtils.deserializerGson((String) null);
    }

    public static Float A0g(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            return Float.valueOf((float) jSONObject.optDouble(str));
        }
        return null;
    }

    public static Object A0j(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return obj;
        }
        return null;
    }

    public static Object A0l(Object obj, Class cls, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static String A0n(Parcel parcel, String str, int i, int i2) {
        if (i == 2) {
            return C295505oK.A08(parcel, i2);
        }
        C295505oK.A0C(parcel, i2);
        return str;
    }

    public static String A0o(Parcel parcel, String str, int i, int i2) {
        if (i == 3) {
            return C295505oK.A08(parcel, i2);
        }
        C295505oK.A0C(parcel, i2);
        return str;
    }

    public static String A0p(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static void A16(RectF rectF, float f, float f2) {
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
    }

    public static void A18(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeParcelable(parcelable, i);
    }

    public static void A19(Parcel parcel, Enum enumR) {
        if (enumR == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(enumR.ordinal());
    }

    public static void A1A(Parcel parcel, Enum enumR) {
        if (enumR == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(enumR.name());
    }

    public static void A1C(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setDatabaseEnabled(false);
        webSettings.setSaveFormData(false);
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
    }

    public static void A1F(C60104Jfk jfk, Integer num, Integer num2, Integer num3, 0eP[] r6) {
        jfk.A0E(new L7Y(num, num2, num3, (0eP[]) Arrays.copyOf(r6, r6.length)));
    }

    public static boolean A1W(Parcel parcel) {
        if (parcel.readByte() == 1) {
            return true;
        }
        return false;
    }

    public static byte A00(int i, long j) {
        return (byte) ((i >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double A04(AbstractMap abstractMap) {
        FeatureData featureData = (FeatureData) abstractMap.get("333");
        if (featureData != null) {
            return featureData.A00;
        }
        return -1.0d;
    }

    public static float A05(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i != 1) {
            return 0.92f;
        }
        return 0.5f;
    }

    public static int A09(Parcel parcel, int i, int i2, int i3, int i4) {
        if (i != i2) {
            C295505oK.A0C(parcel, i3);
            return i4;
        }
        C295505oK.A0D(parcel, i3);
        return parcel.readInt();
    }

    public static long A0D(long j) {
        return Math.max(0, j) * 8 * 1000000;
    }

    public static TypedValue A0J(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public static QDG A0M(AnonymousClass07g r2) {
        return new 2YN(r2).A00(QDG.class);
    }

    public static C345997uQ A0Q(AbstractMap abstractMap, ArrayList arrayList, float[] fArr) {
        abstractMap.put("aTextureCoord", new C345987uP(fArr));
        arrayList.add("aTextureCoord");
        return new C345997uQ(arrayList, abstractMap);
    }

    public static C7X A0R(C250663lr r2) {
        return (C7X) r2.A01(C7X.class, 1825808236);
    }

    public static QVG A0S(C250663lr r2) {
        return (QVG) r2.A01(QVG.class, 736683160);
    }

    public static AnonymousClass612 A0U(Class cls, int i) {
        return new AnonymousClass612(new C295925p8(cls, "InlineXFBVestaError", i), "XFBVestaError");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public static IdCaptureLogger A0V(Object obj) {
        ? r1 = (IdCaptureBaseActivity) obj;
        r1.setResult(0);
        r1.finish();
        return r1.A02();
    }

    public static AnonymousClass6Tm A0a(Object obj) {
        C308276Tl r0 = new C308276Tl();
        r0.A01(obj);
        return r0.A00();
    }

    public static ArrayIndexOutOfBoundsException A0c(int i) {
        return new ArrayIndexOutOfBoundsException(002.A0O("Index < 0: ", i));
    }

    public static ArrayIndexOutOfBoundsException A0d(int i, int i2) {
        return new ArrayIndexOutOfBoundsException(002.A02(i, i2, "Index > length: ", ", "));
    }

    public static Enum A0f(C250663lr r3) {
        return r3.getOptionalEnumField(1, "error_step", HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public static IllegalStateException A0h(Object obj, int[] iArr, int i) {
        return new IllegalStateException(002.A05(iArr[i], "Source subfield ", " is present but null: ", obj.toString()));
    }

    public static String A0q(CreditCard creditCard) {
        String A0C = creditCard.A02.A0C("last_four_digits");
        if (A0C == null) {
            return "";
        }
        return A0C;
    }

    public static String A0s(String str) {
        return 00p.A0g(str, " ", "", false);
    }

    public static Calendar A0u() {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        return instance;
    }

    public static LinkedHashMap A0x(SEB seb) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (seb != null) {
            SUU.A0A(seb, linkedHashMap);
        }
        return linkedHashMap;
    }

    public static List A0y(String str, String str2) {
        List singletonList = Collections.singletonList(new FormMutationEvent(str, str2));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static Set A10(Object obj) {
        return Collections.unmodifiableMap(((AutofillData) obj).A00).keySet();
    }

    public static void A11(int i, int i2, Object obj) {
        if (i2 < i - 1) {
            System.arraycopy(obj, i2 + 1, obj, i2, (i - i2) - 1);
        }
    }

    public static void A12(Context context, String str, String str2) {
        Intent data = new Intent(str).setData(0cp.A03(str2));
        0qQ.A07(data);
        0kR.A00(context, data);
    }

    public static void A13(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void A15(Paint paint, C11388SRb sRb) {
        if (sRb != null) {
            paint.setColorFilter((ColorFilter) sRb.A06());
        }
    }

    public static void A1B(Parcel parcel, String str, int i, int i2) {
        if (str == null) {
            parcel.writeInt(i);
            return;
        }
        parcel.writeInt(i2);
        parcel.writeString(str);
    }

    public static void A1D(0Aj r2, 0bb r3, String str) {
        r3.A05("ad_id", 00y.A0n(10, str));
        r2.AAK(r3, "custom_fields");
        r2.Cgf();
    }

    public static void A1H(BeanDeserializerBase beanDeserializerBase, BeanDeserializerBase beanDeserializerBase2) {
        beanDeserializerBase2.A01 = beanDeserializerBase.A01;
        beanDeserializerBase2.A00 = beanDeserializerBase.A00;
        beanDeserializerBase2.A04 = beanDeserializerBase.A04;
    }

    public static void A1I(QDC qdc, String str) {
        if (str != null) {
            qdc.A09.Cgl(str, QDC.A00(qdc, (Object) null, (Throwable) null));
        }
    }

    public static void A1P(Throwable th) {
        String simpleName = S3Z.class.getSimpleName();
        0qQ.A07(simpleName);
        0kD.A0I(simpleName, th, 0Yt.A0E());
    }

    public static void A1Q(Throwable th, Map map) {
        if (th != null) {
            map.put("error_message", 2Og.A00(th));
        }
    }

    public static void A1U(Map map, String str, String str2) {
        if (!map.containsKey("logging_context")) {
            map.put("logging_context", C11418SSt.A00(str, str2));
        }
    }

    public static Object[] A1b(Object obj, int i, int i2) {
        Object[] objArr = new Object[(((i * 3) / 2) + 1)];
        System.arraycopy(obj, 0, objArr, 0, i2);
        return objArr;
    }

    public static char A02(String str, StringBuilder sb, int i) {
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            sb.append("_");
        }
        return charAt;
    }

    public static double A03(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getDouble(str);
        }
        return 0.0d;
    }

    public static float A06(Context context) {
        return context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
    }

    public static float A07(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return Float.parseFloat(group);
    }

    public static int A0A(Parcel parcel, Object obj) {
        obj.getClass().getClassLoader();
        return parcel.readInt();
    }

    public static int A0B(Object obj, Object obj2) {
        0qQ.A07(obj);
        return ((ULT) ((C7614QQe) obj2).A02.A02).A01;
    }

    public static int A0C(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.last();
    }

    public static Intent A0F(Intent intent, String str, String str2, Throwable th) {
        return intent.putExtra(str, str2).putExtra("error", th.getMessage());
    }

    public static ApplicationInfo A0G(Context context) {
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
    }

    public static Parcelable A0H(Fragment fragment) {
        Parcelable parcelable = fragment.requireArguments().getParcelable("logging_context");
        0qQ.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext");
        return parcelable;
    }

    public static RemoteException A0I(Object obj) {
        return new RemoteException(String.valueOf(obj).concat(" : Binder has died."));
    }

    public static ViewGroup.MarginLayoutParams A0L(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return null;
    }

    public static C71492dQ A0N(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        return (C71492dQ) layoutParams;
    }

    public static 0s1 A0O(Fragment fragment) {
        0hq childFragmentManager = fragment.getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        return new 0s1(childFragmentManager);
    }

    public static FbJsonField A0P(Class cls, String str) {
        return FbJsonField.jsonField(cls.getDeclaredField(str), (Class) null, (TA4) null);
    }

    public static FBPayLoggerData A0Y(Bundle bundle) {
        bundle.getClass();
        Parcelable parcelable = bundle.getParcelable("logger_data");
        parcelable.getClass();
        return (FBPayLoggerData) parcelable;
    }

    public static FileNotFoundException A0b(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new FileNotFoundException(sb.toString());
    }

    public static CharSequence A0e(Object obj, Object obj2) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj2;
        }
        return obj.toString();
    }

    public static Object A0i(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object A0k(Fragment fragment) {
        return 0B0.A01(CardDetails.CREATOR, fragment.requireArguments().getParcelable("payment_info"), CardDetails.class);
    }

    public static Object A0m(Object obj, AnonymousClass0eM r2) {
        Object value = r2.getValue();
        0qQ.A07(value);
        return ((Map) value).get(obj);
    }

    public static String A0r(Object obj, Map map) {
        String str = (String) map.get(obj);
        if (str == null) {
            return "";
        }
        return str;
    }

    public static AbstractMap.SimpleImmutableEntry A0t(Object obj, Object[] objArr, int i) {
        obj.getClass();
        Object obj2 = objArr[i + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static HashSet A0v(C11330SNj sNj) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, new C11330SNj[]{sNj});
        return hashSet;
    }

    public static Iterator A0w(Parcel parcel, Set set) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static NavigableMap A0z(Object obj, Map map) {
        NavigableMap navigableMap = (NavigableMap) map.get(obj);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(obj, treeMap);
        return treeMap;
    }

    public static void A14(Resources resources, WebView webView) {
        webView.loadUrl(0mp.A06("javascript:document.getElementById(\"main\").innerHTML=\"<h3>%s</h3>\"", new Object[]{resources.getString(2131972232)}));
    }

    public static void A17(Drawable drawable, View view, ViewGroup viewGroup) {
        View requireViewById = view.requireViewById(R.id.card_icon);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) requireViewById).setImageDrawable(drawable);
        viewGroup.addView(view);
    }

    public static void A1E(QNI qni, String str, String str2, String str3) {
        qni.A07(str, Py7.A00());
        qni.A07(str2, "product_id");
        qni.A07(str3, "client_receiver_id");
    }

    public static void A1G(C7871Qbv qbv, C13262TSd tSd, TimeUnit timeUnit, long j) {
        C13262TSd.A00(qbv, tSd, SystemClock.elapsedRealtime() + timeUnit.toMillis(j));
    }

    public static void A1J(TAO tao, String str, JSONObject jSONObject) {
        jSONObject.put(str, C3735896d.A00(tao.A03()));
    }

    public static void A1K(Number number, Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        if (number != null) {
            map.put("component_data_id", Long.valueOf(number.longValue()));
        }
    }

    public static void A1L(Object obj, Object obj2, Object obj3, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        if (obj3 != null) {
            abstractMap.put("target_name", obj3);
        }
    }

    public static void A1M(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A1N(String str, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(Long.parseLong(str)));
    }

    public static void A1O(StringBuilder sb, Map.Entry entry) {
        sb.append(entry.getKey());
        sb.append('=');
        sb.append(entry.getValue());
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((String) next).length() > 0) {
            abstractCollection.add(next);
        }
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((ECPIncentive) it.next()).getTitle());
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof String) {
            abstractCollection.add(next);
        }
    }

    public static boolean A1V(Activity activity) {
        return C59910bu.A02().A00(activity, activity.getIntent(), activity);
    }

    public static boolean A1X(Parcel parcel, boolean z) {
        int readInt = parcel.readInt();
        if (((char) readInt) == 1) {
            return C295505oK.A0G(parcel, readInt);
        }
        C295505oK.A0C(parcel, readInt);
        return z;
    }

    public static boolean A1Y(Iterable iterable, Iterable iterable2) {
        0qQ.A08(iterable);
        return !00k.A0l(iterable2, iterable).isEmpty();
    }

    public static boolean A1Z(Object obj, AbstractList abstractList) {
        int indexOf = abstractList.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        abstractList.remove(indexOf);
        return true;
    }

    public static byte[] A1a(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        if (string == null) {
            return null;
        }
        return Base64.decode(string, 11);
    }
}

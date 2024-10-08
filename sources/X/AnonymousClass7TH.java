package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.debughead.models.AggregateScrollData;
import com.instagram.debug.devoptions.debughead.models.ScrollPerfData;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;

/* renamed from: X.7TH  reason: invalid class name */
public abstract class AnonymousClass7TH {
    public static float A00(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static TransformMatrixParams A08() {
        Integer num = AnonymousClass05K.A00;
        return new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }

    public static void A0K() {
        new 1E9(new 1hu((UserSession) null), 6, false);
    }

    public static void A0L(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        drawable.unscheduleSelf(runnable);
    }

    public static void A0M(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        drawable.scheduleSelf(runnable, j);
    }

    public static void A0N(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A0O(Parcel parcel, TreeJNI treeJNI) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, treeJNI);
    }

    public static void A0P(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(number.floatValue());
    }

    public static void A0Q(Parcel parcel, List list, int i) {
        Parcelable parcelable = (Parcelable) list.get(i);
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static void A0Z(AggregateScrollData aggregateScrollData) {
        aggregateScrollData.mSumUtil = 0.0f;
        aggregateScrollData.mSum1Drop = 0.0f;
        aggregateScrollData.mSum4Drop = 0.0f;
        aggregateScrollData.mAvgUtil = 0.0f;
        aggregateScrollData.mAvg1Drop = 0.0f;
        aggregateScrollData.mAvg4Drop = 0.0f;
        aggregateScrollData.mContainer = "";
        aggregateScrollData.mMinUtil = 0.0f;
        aggregateScrollData.mMin1Drop = 0.0f;
        aggregateScrollData.mMin4Drop = 0.0f;
        aggregateScrollData.mMaxUtil = 0.0f;
        aggregateScrollData.mMax1Drop = 0.0f;
        aggregateScrollData.mMax4Drop = 0.0f;
        aggregateScrollData.mTotalTimeSpent = 0.0f;
    }

    public static void A0b(Integer num, Object[] objArr, int i, int i2) {
        objArr[i2] = new HowItWorksNuxFragment$Row(num, (Integer) null, Integer.valueOf(i), (Integer) null);
    }

    public static int A02(C306386Ly r2) {
        return (int) r2.A0b.measureText(r2.A0F.toString());
    }

    public static Bitmap A03(Object obj, Object obj2) {
        if (obj instanceof BitmapDrawable) {
            return ((BitmapDrawable) obj2).getBitmap();
        }
        if (obj instanceof AnonymousClass8DV) {
            return ((AnonymousClass8DV) obj2).A07;
        }
        if (obj instanceof AnonymousClass9X8) {
            return C39908AIz.A01(((AnonymousClass9X8) obj).A0B.A0X, 0);
        }
        return null;
    }

    public static Bundle A05(int i) {
        return Q21.A00(new 0eP("serviceType", Integer.valueOf(i)));
    }

    public static AnonymousClass4Kx A09() {
        C342787pA r2 = C342787pA.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.HEIGHT), new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.WIDTH), new AnonymousClass4L7(r2, "x"), new AnonymousClass4L7(r2, "y"), new AnonymousClass4L7(AnonymousClass4L8.A00, "z"), new AnonymousClass4L7(r2, "rotation")});
    }

    public static 1Xj A0B(C15291UZw uZw, String str) {
        UserSession userSession = uZw.A00;
        0qQ.A07(userSession);
        return 1E7.A00(userSession).A02(str);
    }

    public static C273914nO A0C() {
        C273914nO r1 = new C273914nO();
        r1.A01 = C273924nP.STATIC_STICKERS;
        return r1;
    }

    public static 0eP A0I() {
        return new 0eP("serviceType", 58);
    }

    public static 0eP A0J(Object obj) {
        return new 0eP("commandType", obj);
    }

    public static void A0R(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A0T(TextView textView, AnonymousClass0eM r2) {
        if (textView != null) {
            textView.setTextColor(((Number) r2.getValue()).intValue());
        }
    }

    public static void A0U(0Aj r2) {
        r2.AAJ("module", 27x.A08.getModuleName());
    }

    public static void A0V(0Aj r2) {
        r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        r2.Cgf();
    }

    public static void A0X(0Aj r2, 27x r3) {
        r2.A9F("capture_format_index", 0L);
        r2.A8M(r3.A0I(), "capture_type");
    }

    public static void A0c(Object obj, Object obj2, List list, 0eP r4, 0eP r5) {
        list.add(Q21.A00(r4, r5, new 0eP(obj, obj2)));
    }

    public static void A0d(Object obj, List list, 0eP r4) {
        list.add(Q21.A00(r4, new 0eP("commandType", obj)));
    }

    public static 0eP[] A0h(Object obj, Object obj2, 0eP r3, 0eP r4, 0eP r5) {
        return new 0eP[]{r3, r4, r5, new 0eP(obj, obj2)};
    }

    public static int A01(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
    }

    public static RectF A04(Fragment fragment) {
        Context requireContext = fragment.requireContext();
        int A09 = 0nA.A09(requireContext);
        float A08 = (float) 0nA.A08(requireContext);
        RectF rectF = new RectF(0.0f, 0.0f, (float) A09, A08);
        rectF.offsetTo(0.0f, A08);
        return rectF;
    }

    public static View A06(AnonymousClass0eM r0) {
        Object value = r0.getValue();
        0qQ.A07(value);
        return (View) value;
    }

    public static 28D A07(BaseBundle baseBundle, String str) {
        if (!(baseBundle.get(str) instanceof 28D)) {
            return 28D.A5J;
        }
        Object obj = baseBundle.get(str);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
        return (28D) obj;
    }

    public static AnonymousClass6M4 A0A(Context context, Drawable drawable) {
        AnonymousClass6M3 r2 = new AnonymousClass6M3(context, drawable, context.getResources().getDimensionPixelSize(R.dimen.iglive_sup_toggle_view_height));
        r2.A07 = context.getResources().getString(2131968679);
        r2.A02(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        r2.A03 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        return r2.A00();
    }

    public static Double A0D(Object obj) {
        return 012.A0p(String.valueOf(obj));
    }

    public static Number A0E(ScrollPerfData scrollPerfData, List list, int i) {
        scrollPerfData.getFieldValue((String) list.get(i));
        return (Number) scrollPerfData.getFieldValue((String) list.get(i));
    }

    public static HashSet A0F(String str, String str2, String str3) {
        return 0sc.A05(new String[]{str, str2, str3});
    }

    public static HashSet A0G(String str, String str2, String str3, String str4) {
        return 0sc.A05(new String[]{str, str2, str3, str4});
    }

    public static HashSet A0H(String str, String str2, String str3, String str4, String str5) {
        return 0sc.A05(new String[]{str, str2, str3, str4, str5});
    }

    public static void A0S(EditText editText, int i, int i2) {
        if (editText.getText().length() > 0 && i < 1) {
            editText.setSelection(1, Math.max(i2, 1));
        }
    }

    public static void A0W(0Aj r2, 27x r3) {
        r2.A8M(r3.A0J(), "camera_destination");
    }

    public static void A0Y(AnonymousClass6MU r1, C317876nz r2, C273914nO r3) {
        r3.A06 = r2.A01();
        r3.A01(r1.A00);
    }

    public static void A0a(C358248ab r0, boolean z) {
        r0.A0r(z);
        r0.A0s(z);
        AnonymousClass0fN.A00(r0.A02());
    }

    public static void A0e(Key key, AlgorithmParameterSpec algorithmParameterSpec, Cipher cipher, byte[] bArr, int i) {
        cipher.init(i, key, algorithmParameterSpec);
        if (bArr != null && bArr.length != 0) {
            cipher.updateAAD(bArr);
        }
    }

    public static void A0f(List list, 0eP[] r2) {
        list.add(Q21.A00(r2));
    }

    public static boolean A0g(String str, List list, int i) {
        return str.equals(list.get(i));
    }
}

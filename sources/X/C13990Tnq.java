package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Parcel;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.google.common.collect.ImmutableSet;
import com.instagram.android.R;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.venue.Venue;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.User;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Tnq  reason: case insensitive filesystem */
public abstract class C13990Tnq {
    public static ColorStateList A0D(Context context, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        0qQ.A07(obtainStyledAttributes);
        return obtainStyledAttributes.getColorStateList(0);
    }

    public static View A0F(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent");
        return inflate;
    }

    public static 0Df A0I(AnonymousClass0K0 r6, GraphQlCallInput graphQlCallInput, Object obj, Object obj2) {
        0Df A02 = r6.A02();
        0Df.A00(A02, "1L1D", "key");
        A02.A0E(graphQlCallInput.A02(), "caller_context");
        if (obj instanceof AnonymousClass9GV) {
            2IV r3 = new 2IV();
            2IV r2 = new 2IV();
            r2.A09(((AnonymousClass9GV) obj2).A00, "sensitive_string_value");
            r3.A06(r2, "facebook_token_auth_from_cal");
            r3.A08("fallback_to_business_person", false);
            A02.A0E(r3.A02(), "fb_token_auth");
        }
        return A02;
    }

    public static C255543uJ A0g(String str, C255533uI r3) {
        return new C255543uJ(str, r3, 1);
    }

    public static void A0o(Resources resources, TextView textView, int i) {
        textView.setTextSize(0, (float) resources.getDimensionPixelSize(i));
    }

    public static void A0q(RectF rectF, float f, int i) {
        rectF.set(0.0f, 0.0f, f, (float) i);
    }

    public static void A0v(TextView textView, CharSequence charSequence, boolean z) {
        textView.setVisibility(0);
        textView.setText(charSequence);
        textView.setFocusable(z);
    }

    public static void A17(0bb r2, WGU wgu) {
        r2.A03("is_business_user_access_token_enabled", true);
        r2.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(wgu.A04));
    }

    public static void A18(0bb r2, WGU wgu) {
        r2.A03("is_business_user_access_token_enabled", true);
        r2.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(wgu.A04));
    }

    public static void A1K(MapBottomSheetController mapBottomSheetController) {
        mapBottomSheetController.mBottomSheetBehavior.A0R(true, mapBottomSheetController.A02());
    }

    public static void A1M(C19201WPh wPh) {
        FragmentActivity fragmentActivity = wPh.A04;
        if (fragmentActivity instanceof FragmentActivity) {
            C48732EjH.A00().A02(fragmentActivity, wPh.A0B, wPh.A09.getModuleName(), (String) null, false);
        }
    }

    public static void A1N(ShoppingCartFragment shoppingCartFragment, User user, String str) {
        ShoppingCartFragment.A02(shoppingCartFragment, user, (String) null, str, false);
    }

    public static void A1O(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        refreshableNestedScrollingParent.A08 = new AnonymousClass3AF(refreshableNestedScrollingParent, false);
    }

    public static void A1Q(Object obj, C255473uB r2, SerialDescriptor serialDescriptor, AnonymousClass484 r4) {
        r4.AS8(obj, r2, serialDescriptor, 0);
        r4.AST(serialDescriptor);
    }

    public static void A1T(String str, SerialDescriptor serialDescriptor, AnonymousClass484 r3) {
        r3.ASC(str, serialDescriptor, 0);
        r3.AST(serialDescriptor);
    }

    public static void A1Y(float[] fArr, float f, float f2, float f3) {
        fArr[4] = f;
        fArr[5] = f2;
        fArr[6] = f3;
        fArr[7] = f2;
    }

    public static double A00(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public static float A02(Object obj) {
        if (!(obj instanceof Double)) {
            return Float.NaN;
        }
        return ((Number) obj).floatValue();
    }

    public static float A04(int[] iArr, float f, int i) {
        return Math.abs(f - ((float) iArr[i]));
    }

    public static int A05(int i, int i2, int i3) {
        if (i == 255) {
            return i2;
        }
        int i4 = i3 & 16777215;
        if (i == 0) {
            return i4;
        }
        return i4 | ((((i3 >>> 24) * (i + (i >> 7))) >> 8) << 24);
    }

    public static int A08(View view, int i) {
        if (i != 0) {
            return 0;
        }
        return view.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
    }

    public static int A09(View view, Object obj) {
        if (obj == null) {
            return -16777216;
        }
        return SPt.A01(view.getContext(), obj, -16777216).intValue();
    }

    public static int A0B(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        return ((Number) obj).intValue();
    }

    public static 0Aj A0H(WGU wgu, 0wc r4, String str) {
        0Aj A00 = r4.A00(r4.A00, str);
        A00.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, wgu.A01);
        A00.AAJ("waterfall_id", wgu.A03);
        return A00;
    }

    public static 2IV A0J(AnonymousClass9JK r2) {
        String str = ((CallerContext) r2.A01).A02;
        0qQ.A07(str);
        2IV r1 = new 2IV();
        r1.A09(str, "caller");
        r1.A09("function_credential", "function_credential");
        return r1;
    }

    public static MediaMapFragment A0P(Fragment fragment) {
        MediaMapFragment mediaMapFragment = fragment.mParentFragment;
        mediaMapFragment.getClass();
        return mediaMapFragment;
    }

    public static C323486xZ A0V(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        return C323426xT.A00(merchantShoppingCartFragment.A02).A07;
    }

    public static C14780U8q A0X(C15341Uar uar) {
        return (C14780U8q) uar.A0J.getValue();
    }

    public static String A0b(Object obj, SerialDescriptor serialDescriptor, C2590240b r3, int i) {
        return (String) r3.AO4(obj, C255453u9.A01, serialDescriptor, i);
    }

    public static String A0c(Map map) {
        map.put("backgroundColor", "Color");
        return "Color";
    }

    public static StringBuilder A0d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        return sb;
    }

    public static 1HR A0f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        return new 1HR(AnonymousClass3FN.A00);
    }

    public static void A0i(int i, float f) {
        GLES20.glTexParameterf(i, 10240, f);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
    }

    public static void A0l(Context context, View.OnClickListener onClickListener, CharSequence charSequence, List list) {
        list.add(new C50989Fmc(context, onClickListener, charSequence));
    }

    public static void A0m(Context context, TextView textView, C55796Hnc hnc, float f) {
        textView.setLetterSpacing(hnc.A01 / (((float) ((int) f)) / context.getResources().getDisplayMetrics().scaledDensity));
    }

    public static void A0s(Spannable spannable, ReactAbsoluteSizeSpan[] reactAbsoluteSizeSpanArr, float f, int i, int i2) {
        ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = reactAbsoluteSizeSpanArr[i];
        spannable.setSpan(new AbsoluteSizeSpan((int) Math.max(((float) reactAbsoluteSizeSpan.getSize()) * f, (float) i2)), spannable.getSpanStart(reactAbsoluteSizeSpan), spannable.getSpanEnd(reactAbsoluteSizeSpan), spannable.getSpanFlags(reactAbsoluteSizeSpan));
        spannable.removeSpan(reactAbsoluteSizeSpan);
    }

    public static void A0y(FragmentActivity fragmentActivity, 0lg r2) {
        new C309516Yo(fragmentActivity, r2).A06();
    }

    public static void A0z(AnonymousClass0Ac r2, AnonymousClass0Ac r3, 1Ln r4, List list) {
        r4.A0M(r2, "event_target");
        r4.A0M(r3, "event_type");
        r4.A0S("permission_access_purposes", list);
        r4.A0q("instagram_android");
    }

    public static void A10(0Aj r2, WGU wgu, Object obj) {
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, wgu.A01);
        r2.AAJ("waterfall_id", wgu.A03);
        r2.AAJ("step", obj.toString());
        r2.AAJ("m_pk", wgu.A02);
    }

    public static void A12(0Ak r3, MediaMapQuery mediaMapQuery) {
        String A0R;
        r3.A0R("query_token", mediaMapQuery.A02);
        r3.A0R("search_id", mediaMapQuery.A07);
        C16614UyA uyA = mediaMapQuery.A06;
        r3.A0R("search_type", uyA.toString());
        int ordinal = uyA.ordinal();
        if (ordinal != 1) {
            A0R = mediaMapQuery.A01;
            if (ordinal == 0) {
                A0R = A0R.toLowerCase();
            }
        } else {
            A0R = 002.A0R("#", mediaMapQuery.A01.toLowerCase());
        }
        r3.A0R("search_query", A0R);
    }

    public static void A16(0bb r1, 1Ln r2, Long l, String str, String str2) {
        r2.A0R("experience_id", str);
        r2.A0Q("user_fbid", l);
        r2.A0p(str2);
        r2.A0N(r1, "event_data");
        r2.Cgf();
    }

    public static void A1C(1Fa r1, String str, String str2) {
        r1.A0E = str;
        r1.A9m("fb_auth_token", str2);
    }

    public static void A1H(PromoteData promoteData, PromoteState promoteState) {
        promoteState.A09(promoteData, BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO.toString());
    }

    public static void A1I(C331047Ph r1, C231642s0 r2, C231642s0 r3, AnonymousClass2s2 r4, int i) {
        r4.A03 = i;
        r1.A0B(r2, r3, r4);
    }

    public static void A1J(0wc r2, C255773uh r3, AnonymousClass3BQ r4, String str, String str2) {
        0Aj A00 = r2.A00(r2.A00, str);
        if (A00.isSampled()) {
            A00.AAJ("tracking_token", str2);
            C64113LOb lOb = r3.A0E;
            lOb.getClass();
            A00.AAJ("reel_id_type", C18241Vo8.A01(lOb.A04));
            A00.AAJ("reel_id", r3.A0k);
            A00.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C14164Tr2.A00(r4).name());
            A00.Cgf();
        }
    }

    public static void A1L(C15357Ub9 ub9) {
        HAI hai = ub9.A08;
        ArrayList arrayList = new ArrayList();
        Venue venue = ub9.A0H;
        if (!(venue == null || venue.A00() == null || venue.A01() == null)) {
            boolean z = ub9.A0L;
            arrayList.size();
            arrayList.add(new C19283WSr(ub9.A03, ub9.A0F, venue, z));
        }
        if (ub9.A0H != null) {
            arrayList.add(ub9.A04);
        }
        hai.A08(arrayList);
    }

    public static void A1X(float[] fArr, float f, float f2) {
        fArr[12] = f;
        fArr[13] = f2;
    }

    public static void A1Z(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static Object[] A1b(Object[] objArr, int i) {
        Object[] objArr2 = objArr[i];
        0qQ.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return objArr2;
    }

    public static float A01(Canvas canvas, Drawable drawable) {
        canvas.save();
        canvas.translate(((float) drawable.getBounds().left) + (((float) drawable.getBounds().width()) / 2.0f), ((float) drawable.getBounds().top) + (((float) drawable.getBounds().height()) / 2.0f));
        return 2.0f;
    }

    public static float A03(Random random) {
        return (float) (-0.6283185307179586d + ((0.6283185307179586d - -0.6283185307179586d) * ((double) random.nextFloat())));
    }

    public static int A06(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        return iArr[0];
    }

    public static int A07(Parcel parcel, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(parcel.readString());
        return i + 1;
    }

    public static int A0A(Fragment fragment) {
        return 0nA.A08(fragment.requireContext());
    }

    public static long A0C(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }

    public static Drawable A0E(View view, int i) {
        return C323656xt.A00(view.getContext(), i);
    }

    public static RecyclerView A0G(View view) {
        return (RecyclerView) view.findViewById(R.id.recycler_view);
    }

    public static C20877X2e A0K(View view, Q6H q6h) {
        return UIManagerHelper.A05(q6h, view.getId());
    }

    public static ImmutableSet A0L(Collection collection) {
        ImmutableSet A03 = ImmutableSet.A03(collection);
        0qQ.A07(A03);
        return A03;
    }

    public static WGU A0M(AnonymousClass0eM r0) {
        Object value = r0.getValue();
        0qQ.A07(value);
        return (WGU) value;
    }

    public static C18079Vl8 A0N() {
        return C322576w3.A00().A01();
    }

    public static PromoteState A0O(AnonymousClass0eM r0) {
        return (PromoteState) r0.getValue();
    }

    public static IgdsBottomButtonLayout A0Q(View view) {
        return (IgdsBottomButtonLayout) view.requireViewById(R.id.bottom_button_layout);
    }

    public static C16039UnS A0R(C15267UYh uYh) {
        return (C16039UnS) uYh.A07();
    }

    public static C14765U8b A0S(AnonymousClass0eM r0) {
        return (C14765U8b) r0.getValue();
    }

    public static C14787U8y A0T(AnonymousClass0eM r0) {
        return (C14787U8y) r0.getValue();
    }

    public static U8Z A0U(AnonymousClass0eM r0) {
        return (U8Z) r0.getValue();
    }

    public static LightboxArguments A0W(AnonymousClass0eM r0) {
        return (LightboxArguments) r0.getValue();
    }

    public static Us7 A0Y(View view, int i) {
        return new Us7(view.requireViewById(i));
    }

    public static Integer A0Z(Set set, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            02m.A0p.markerEnd(i, 111);
        }
        return valueOf;
    }

    public static String A0a(Layout layout, int i) {
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        CharSequence text = layout.getText();
        0qQ.A07(text);
        return text.subSequence(lineStart, lineEnd).toString();
    }

    public static FloatBuffer A0e(float[] fArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static void A0h() {
        C322576w3.A00().A01();
    }

    public static void A0j(int i, int i2, int i3, int i4, int i5) {
        GLES20.glViewport(i, i2, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(i5, 0);
    }

    public static void A0k(Activity activity, 1DN r2, Object[] objArr, int i) {
        1DL.A04(activity, r2, (String[]) Arrays.copyOf(objArr, i));
    }

    public static void A0n(Resources resources, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
    }

    public static void A0p(Paint.Align align, Paint paint, Typeface typeface, float f) {
        paint.setTextAlign(align);
        paint.setTypeface(typeface);
        paint.setTextSize(f);
    }

    public static void A0r(Parcel parcel, Map map) {
        parcel.writeInt(map.size());
    }

    public static void A0t(Spanned spanned, C306386Ly r1, Class cls, Collection collection, Collection collection2) {
        018.A18(collection, C263324Kh.A06(spanned, cls));
        Spannable spannable = r1.A0F;
        0qQ.A07(spannable);
        018.A18(collection2, C263324Kh.A06(spannable, AnonymousClass91R.class));
    }

    public static void A0u(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), i3);
    }

    public static void A0w(Fragment fragment) {
        C59689JTv.A07(fragment.requireContext(), 2131970170);
    }

    public static void A0x(Fragment fragment) {
        C59689JTv.A0B(fragment.requireContext(), "something_went_wrong");
    }

    public static void A11(0Aj r2, C52673Gal gal, String str, long j) {
        r2.A9F("ad_id", Long.valueOf(Long.parseLong(str)));
        r2.A9F("page_id", Long.valueOf(j));
        r2.AAJ(C21058XCk.A00(), gal.A02);
        r2.A8M(gal.A00, "on_feed_messaging_surface");
    }

    public static void A13(0Ak r2, Hashtag hashtag) {
        r2.A0R("hashtag_name", hashtag.getName());
    }

    public static void A14(0bb r2, long j) {
        r2.A05("end_time_ms", Long.valueOf(j));
    }

    public static void A15(0bb r2, long j) {
        r2.A05("start_time_ms", Long.valueOf(j));
    }

    public static void A19(16F r2, AbstractCollection abstractCollection) {
        String A1P;
        if (r2.A11() != 16L.A0G && (A1P = r2.A1P()) != null) {
            abstractCollection.add(A1P);
        }
    }

    public static void A1A(16F r1, AbstractCollection abstractCollection) {
        XRE xre = (XRE) EnumHelper.A00(r1.A1Q(), XRE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (xre != null) {
            abstractCollection.add(xre);
        }
    }

    public static void A1B(UWU uwu) {
        uwu.onStateChange(uwu.getState());
    }

    public static void A1D(AnonymousClass4DH r1, AnonymousClass0eM r2) {
        r1.registerLifecycleListener((C252233om) r2.getValue());
    }

    public static void A1E(AnonymousClass4DH r1, AnonymousClass0eM r2) {
        r1.registerLifecycleListener((C234042wt) r2.getValue());
    }

    public static void A1F(AnonymousClass4DH r1, AnonymousClass0eM r2) {
        r1.unregisterLifecycleListener((C252233om) r2.getValue());
    }

    public static void A1G(AnonymousClass4DH r1, AnonymousClass0eM r2) {
        r1.unregisterLifecycleListener((C234042wt) r2.getValue());
    }

    public static void A1P(Object obj, AnonymousClass0eM r2) {
        ((List) r2.getValue()).add(obj);
    }

    public static void A1R(String str, int i) {
        0I1.A04("ReactNative", 002.A0O(str, i));
    }

    public static void A1S(String str, String str2, int i) {
        Log.e(str, str2);
        Log.e(str, 002.A0R(" ", GLES20.glGetShaderInfoLog(i)));
        GLES20.glDeleteShader(i);
    }

    public static void A1U(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append("\n            Reason: ");
    }

    public static void A1V(AnonymousClass0eM r0) {
        ((AnonymousClass36D) r0.getValue()).A00();
    }

    public static boolean A1a(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    public static void A1W(double[] dArr, double d, int i) {
        dArr[i] = ((double) Math.round(d * 1000.0d)) * 0.001d;
    }
}

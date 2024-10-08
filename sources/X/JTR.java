package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Spanned;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.notifications.persistence.room.IgNotificationsDatabase;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import java.io.File;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract class JTR {
    public static double A00(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public static double A01(2cs r1) {
        0qQ.A0B(r1, 0);
        return r1.A09.A00;
    }

    public static int A0D(AnonymousClass283 r3) {
        if (r3.A01 != 2) {
            return 1;
        }
        return 2;
    }

    public static int A0F(String str) {
        0qQ.A0B(str, 0);
        return str.hashCode();
    }

    public static Resources A0Q(Context context) {
        0qQ.A0B(context, 0);
        return context.getResources();
    }

    public static FrameLayout.LayoutParams A0Y() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public static GQC A0a(int i) {
        return new GQC(C52518GVv.A01, i, 0);
    }

    public static IgTextView A0h(View view, int i) {
        IgTextView requireViewById = view.requireViewById(i);
        0qQ.A0B(requireViewById, 0);
        return requireViewById;
    }

    public static InfoItem A0t(Integer num, String str, int i) {
        return new InfoItem(new IconConfig.SimpleIconConfig(i), num, str, (String) null);
    }

    public static AnonymousClass19S A17(AnonymousClass12V r1, int i) {
        return 19E.A02(r1.CO6(i, 3));
    }

    public static void A19(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
    }

    public static void A1K(0bb r2, int i) {
        r2.A05("balance", Long.valueOf((long) i));
    }

    public static void A1M(AnonymousClass8RF r2) {
        r2.A0G(new C355878Rs(-1));
    }

    public static void A1V(05G r1) {
        r1.Epw(false);
    }

    public static void A1W(05G r1) {
        r1.Epw(true);
    }

    public static int A0A(Drawable drawable, float f) {
        return (int) (f - (((float) drawable.getIntrinsicWidth()) / 2.0f));
    }

    public static int A0C(AnonymousClass283 r1) {
        if (r1.A01 != 2) {
            return 1;
        }
        return 2;
    }

    public static int A0E(LTY lty) {
        return ((Number) lty.A04.A00).intValue();
    }

    public static int A0G(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static long A0L() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static long A0M(String str) {
        Long A0n = 00y.A0n(10, str);
        if (A0n != null) {
            return A0n.longValue();
        }
        return 0;
    }

    public static long A0N(TimeUnit timeUnit) {
        return timeUnit.toMillis(1);
    }

    public static 2YM A0b(Object obj) {
        return ((Fragment) obj).requireActivity().getDefaultViewModelProviderFactory();
    }

    public static 0Aj A0d(27x r2) {
        0wc r22 = r2.A01;
        return r22.A00(r22.A00, "ig_camera_ui_tool_click");
    }

    public static C12075SmU A0e(UserSession userSession) {
        return new C12075SmU(new S1R(userSession));
    }

    public static GalleryItem.LocalGalleryMedium A0f(Medium medium) {
        return new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
    }

    public static 0nV A0j(int i) {
        return AnonymousClass12T.A00.CO6(480314591, i);
    }

    public static C3499682q A0k(Object obj) {
        return ((C267844cJ) obj).Ajn().A00();
    }

    public static C60282Jid A0l(Object obj) {
        return (C60282Jid) ((K4L) obj).A0A.getValue();
    }

    public static Class A0v(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static Integer A0w(UserSession userSession) {
        return AnonymousClass0t1.A01.A01(userSession).A0N();
    }

    public static List A16(Collection collection) {
        if (collection == null) {
            return Collections.emptyList();
        }
        return ImmutableList.copyOf(collection);
    }

    public static void A1B(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static void A1I(0Aj r1, 0bb r2, String str) {
        r1.AAK(r2, "event_data");
        r1.AAJ("avatar_session_id", str);
    }

    public static void A1L(AnonymousClass2t9 r1, List list) {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(list);
        r1.A05(viewModelListUpdate);
    }

    public static void A1N(1iA r1, Map map) {
        map.put("media_type", String.valueOf(r1.A00));
    }

    public static boolean A1X(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36322465407838403L);
    }

    public static boolean A1Y(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36323848387374658L);
    }

    public static boolean A1Z(UserSession userSession) {
        return AnonymousClass0t1.A01.A01(userSession).A2L();
    }

    public static boolean A1b(Object[] objArr, int i) {
        Boolean bool = objArr[i];
        0qQ.A0C(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    public static float A02(Context context) {
        return context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
    }

    public static float A03(AnonymousClass0Ud r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A04(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }

    public static int A05(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    public static int A06(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
    }

    public static int A07(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
    }

    public static int A08(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
    }

    public static int A09(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
    }

    public static int A0B(View view, View view2) {
        return view.getWidth() - view2.getWidth();
    }

    public static int A0H(C62320sa r0) {
        return ((Number) r0.invoke()).intValue();
    }

    public static int A0I(05G r0) {
        return ((Set) r0.getValue()).size();
    }

    public static int A0J(05G r0) {
        return ((AbstractCollection) r0.getValue()).size();
    }

    public static int A0K(05G r0) {
        return ((Number) r0.getValue()).intValue();
    }

    public static long A0O(C62320sa r1) {
        return ((Number) r1.invoke()).longValue();
    }

    public static Context A0P(C361478gI r0) {
        Context applicationContext = r0.A0D().getApplicationContext();
        0qQ.A07(applicationContext);
        return applicationContext;
    }

    public static Resources A0R(Fragment fragment) {
        Resources resources = fragment.requireContext().getResources();
        0qQ.A07(resources);
        return resources;
    }

    public static Drawable A0S(C347017w8 r0) {
        return (Drawable) 00k.A0A(r0.A05());
    }

    public static Spanned A0T(Resources resources, Object obj, int i) {
        Spanned A00 = 0bC.A00(resources, new Object[]{obj}, i);
        0qQ.A07(A00);
        return A00;
    }

    public static View A0U(View view) {
        ViewParent parent = view.getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    public static View A0V(View view, int i) {
        return ((ViewStub) view.findViewById(i)).inflate();
    }

    public static View A0W(AnonymousClass0eM r0) {
        return ((C240913Nc) r0.getValue()).A00();
    }

    public static ViewStub A0X(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (ViewStub) requireViewById;
    }

    public static ImageView A0Z(AnonymousClass0eM r0) {
        Object value = r0.getValue();
        0qQ.A07(value);
        return (ImageView) value;
    }

    public static RecyclerView A0c(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (RecyclerView) requireViewById;
    }

    public static C56078HsR A0g(Object obj, int i) {
        return new C56078HsR(new Object[]{obj}, i);
    }

    public static IgImageView A0i(View view, int i) {
        IgImageView findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        return findViewById;
    }

    public static AnonymousClass831 A0m(AnonymousClass831 r1, Iterable iterable) {
        return new AnonymousClass831(00k.A0a(iterable), r1.A03);
    }

    public static IgdsButton A0n(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (IgdsButton) requireViewById;
    }

    public static KTX A0o(AnonymousClass0eM r0) {
        return ((IGTVUploadViewModel) r0.getValue()).A02();
    }

    public static C234462xu A0p(Context context, AnonymousClass0eM r3) {
        return new C234462xu(context, (UserSession) r3.getValue());
    }

    public static AnonymousClass5GY A0q(AnonymousClass0eK r0) {
        return ((IgNotificationsDatabase) r0.get()).A00();
    }

    public static C262294Dd A0r(AnonymousClass0eM r0) {
        return ((C239283Fv) r0.getValue()).AR3();
    }

    public static 0xY A0s(AnonymousClass0eM r0) {
        return ((0xa) r0.getValue()).AR4();
    }

    public static 17i A0u(AnonymousClass0eM r0) {
        return 17h.A00((UserSession) r0.getValue());
    }

    public static Object A0x(Object obj, AnonymousClass0eM r2) {
        return ((Map) r2.getValue()).get(obj);
    }

    public static Object A0y(Object obj, AnonymousClass4D7 r2, C262094Cc r3, 0sL r4) {
        Object A00 = 1Eo.A00(r2, r3, r4);
        if (A00 != obj) {
            return C60340gF.A00;
        }
        return A00;
    }

    public static Object A0z(Object obj, AnonymousClass0Ud r2) {
        return ((Map) r2.getValue()).get(obj);
    }

    public static Object A10(Iterator it) {
        return ((Reference) it.next()).get();
    }

    public static Object A11(List list, int i) {
        return ((ValueAnimator) list.get(i)).getAnimatedValue();
    }

    public static String A12(17Z r0, Object obj) {
        r0.close();
        String obj2 = obj.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public static String A13(17Z r0, Object obj) {
        r0.A0Y();
        r0.close();
        return obj.toString();
    }

    public static String A14(String str, Object[] objArr, int i) {
        String format = String.format(str, Arrays.copyOf(objArr, i));
        0qQ.A07(format);
        return format;
    }

    public static Iterator A15(AnonymousClass0Ud r0) {
        return ((Iterable) r0.getValue()).iterator();
    }

    public static void A18(Context context, TextView textView, Object obj, Object obj2, int i) {
        textView.setText(context.getString(i, new Object[]{obj, obj2}));
    }

    public static void A1A(Handler handler, Runnable runnable) {
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 10000);
    }

    public static void A1C(View view, int i) {
        ((ViewStub) view.requireViewById(i)).inflate();
    }

    public static void A1D(View view, int i) {
        view.requireViewById(i).setVisibility(0);
    }

    public static void A1E(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        findViewById.setVisibility(i2);
    }

    public static void A1F(EditText editText) {
        editText.setSelection(editText.getText().length());
    }

    public static void A1G(2YL r0, 0sK r1, AnonymousClass0r6 r2, AnonymousClass0r6 r3) {
        AnonymousClass11O.A03(C318116oQ.A00(r0), AnonymousClass10H.A03(r1, r2, r3));
    }

    public static void A1H(2YL r0, 0sJ r1, AnonymousClass0r6 r2, AnonymousClass0r6 r3, AnonymousClass0r6 r4) {
        AnonymousClass11O.A03(C318116oQ.A00(r0), AnonymousClass10H.A00(r1, r2, r3, r4));
    }

    public static void A1J(0Aj r2, MusicProduct musicProduct) {
        r2.AAJ("product", C14245TsS.A00(musicProduct));
    }

    public static void A1O(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A1P(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (0qQ.A0K(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A1Q(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (!0qQ.A0K(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A1R(Object obj, Object obj2, AbstractCollection abstractCollection, List list) {
        if (list.contains(obj)) {
            abstractCollection.add(obj2);
        }
    }

    public static void A1S(Object obj, AbstractCollection abstractCollection) {
        if (!abstractCollection.contains(obj)) {
            abstractCollection.add(obj);
        }
    }

    public static void A1T(Object obj, List list) {
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static void A1U(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static boolean A1a(AnonymousClass0Ud r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }
}

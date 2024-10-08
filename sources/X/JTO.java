package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.state.CreationState;
import com.instagram.feed.media.ReelCTA;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.model.shopping.ProductTag;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.Product;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class JTO {
    public static int A04(float f, float f2) {
        return Math.round(f / f2);
    }

    public static int A05(float f, float f2) {
        return AnonymousClass1GB.A01(f / f2);
    }

    public static ReelCTA A0j(List list) {
        return (ReelCTA) list.get(0);
    }

    public static double A00(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static float A03(2cs r2) {
        return (float) r2.A09.A00;
    }

    public static int A08(AnonymousClass831 r0) {
        return r0.A01.size();
    }

    public static int A09(ClipInfo clipInfo) {
        return clipInfo.A05 - clipInfo.A07;
    }

    public static int A0A(Integer[] numArr, int i) {
        return numArr[i].intValue();
    }

    public static Canvas A0B(Bitmap bitmap) {
        return new Canvas(bitmap);
    }

    public static Paint A0C() {
        return new Paint();
    }

    public static View A0F(C249703kE r0) {
        View view = r0.itemView;
        0qQ.A06(view);
        return view;
    }

    public static View A0G(Object obj) {
        return ((Fragment) obj).requireView();
    }

    public static AnonymousClass07V A0J(Object obj) {
        return ((AnonymousClass07Z) obj).getLifecycle();
    }

    public static AnonymousClass2Fj A0K() {
        return new AnonymousClass2Fj();
    }

    public static 2YN A0L(2YM r1, AnonymousClass07g r2) {
        return new 2YN(r1, r2);
    }

    public static 1WY A0M(String str, int i) {
        TreeMap treeMap = 1WY.A08;
        return 1Wa.A00(str, i);
    }

    public static 1Ln A0N(27x r0) {
        return 1Ln.A08(r0.A01);
    }

    public static AnonymousClass81A A0O() {
        return new 0bb();
    }

    public static 17W A0Q(Writer writer) {
        return AnonymousClass15o.A00.A0A(writer);
    }

    public static CreationState A0i(String str, int i) {
        return new CreationState(str, i);
    }

    public static 1ua A0n(Context context, UserSession userSession) {
        return 1ua.A0G.A01(context, userSession);
    }

    public static Product A0q(ProductTag productTag) {
        return C14502TxO.A00(productTag.A02);
    }

    public static File A0s(File file, String str) {
        return new File(file, str);
    }

    public static FileOutputStream A0t(File file) {
        return new FileOutputStream(file);
    }

    public static IOException A0u(String str) {
        return new IOException(str);
    }

    public static StringWriter A0v() {
        return new StringWriter();
    }

    public static Integer A0w(int i) {
        return new Integer(i);
    }

    public static Long A0y(long j) {
        return new Long(j);
    }

    public static Object A10(Object obj, AnonymousClass4D7 r1) {
        return ((C262214Cp) obj).A0E(r1);
    }

    public static List A14(1Xj r0) {
        return r0.A0C.C0K();
    }

    public static 0eQ A1B(Throwable th) {
        return new 0eQ(th);
    }

    public static C66196MId A1C(Object obj, int i) {
        return new C66196MId(obj, i);
    }

    public static C262224Cq A1D(Object obj, Object obj2) {
        C262224Cq r0 = (C262224Cq) obj;
        0eS.A00(obj2);
        return r0;
    }

    public static AnonymousClass2Q8 A1E(0sL r1, C262224Cq r2) {
        return 1Eo.A02(19B.A00, r1, r2);
    }

    public static AnonymousClass134 A1F() {
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        return AnonymousClass12y.A00.A0P();
    }

    public static 1HR A1G(int i) {
        return new 1HR(i);
    }

    public static 02o A1H(Object obj, Object obj2) {
        02o r0 = (02o) obj;
        0eS.A00(obj2);
        return r0;
    }

    public static C61860pz A1I(0sL r1, AnonymousClass0r6 r2) {
        return new C61860pz(r1, r2);
    }

    public static 02z A1J() {
        return 106.A01(0sn.A00);
    }

    public static void A1K() {
        0qQ.A0F("delegate");
        throw null;
    }

    public static void A1L() {
        0qQ.A0F("mediaTaggingInfos");
        throw null;
    }

    public static void A1M() {
        0qQ.A0F("dependencyProvider");
        throw null;
    }

    public static void A1N(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A1O(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "tool_type");
    }

    public static void A1P(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, "media_type");
    }

    public static void A1Q(0Aj r1, String str) {
        r1.AAJ("entity", str);
    }

    public static void A1R(0Aj r1, String str) {
        r1.AAJ("view_mode", str);
    }

    public static void A1S(0Aj r1, String str) {
        r1.AAJ("camera_session_id", str);
    }

    public static void A1T(0Aj r1, String str) {
        r1.AAJ("legacy_falco_event_name", str);
    }

    public static void A1U(0Ak r1, String str) {
        r1.A0R("camera_session_id", str);
    }

    public static void A1V(1Ln r1) {
        r1.A0t("IG_CAMERA_ENTITY_TAP");
    }

    public static void A1W(1Fa r1, String str) {
        r1.A9m("media_id", str);
    }

    public static void A1X(SpinnerImageView spinnerImageView) {
        spinnerImageView.setLoadingStatus(C255943uy.SUCCESS);
    }

    public static void A1Y(Integer num, 0sL r2, C262224Cq r3) {
        1Eo.A03(num, 19B.A00, r2, r3);
    }

    public static void A1Z(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type android.app.Activity");
    }

    public static void A1a(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    public static boolean A1b(int i) {
        return Log.isLoggable("Paging", i);
    }

    public static float A01(Bitmap bitmap) {
        return (float) bitmap.getHeight();
    }

    public static float A02(Bitmap bitmap) {
        return (float) bitmap.getWidth();
    }

    public static int A06(Drawable drawable) {
        return drawable.getBounds().bottom;
    }

    public static int A07(ClipsCreationViewModel clipsCreationViewModel) {
        return ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
    }

    public static Drawable A0D(AnonymousClass0eM r0) {
        return (Drawable) r0.getValue();
    }

    public static Handler A0E(AnonymousClass0eM r0) {
        return (Handler) r0.getValue();
    }

    public static View A0H(Iterator it) {
        return (View) it.next();
    }

    public static TextView A0I(AnonymousClass0eM r0) {
        return (TextView) r0.getValue();
    }

    public static C61074JwC A0P(05G r0) {
        return (C61074JwC) r0.getValue();
    }

    public static C60316JjJ A0R(AnonymousClass0eM r0) {
        return (C60316JjJ) r0.getValue();
    }

    public static C60315JjI A0S(AnonymousClass0eM r0) {
        return (C60315JjI) r0.getValue();
    }

    public static LTH A0T(AnonymousClass0eM r0) {
        return (LTH) r0.getValue();
    }

    public static AnonymousClass7I6 A0U(AnonymousClass0eM r0) {
        return (AnonymousClass7I6) r0.getValue();
    }

    public static C61061Jvz A0V(AnonymousClass0Ud r0) {
        return (C61061Jvz) r0.getValue();
    }

    public static Medium A0W(Iterator it) {
        return (Medium) it.next();
    }

    public static IgTextView A0X(View view, int i) {
        return view.findViewById(i);
    }

    public static IgImageView A0Y(View view, int i) {
        return view.findViewById(i);
    }

    public static MediaSession A0Z(Iterator it) {
        return (MediaSession) it.next();
    }

    public static C317966o8 A0a(Iterator it) {
        return (C317966o8) it.next();
    }

    public static 29R A0b(UserSession userSession) {
        return 27p.A01(userSession).A09;
    }

    public static 29f A0c(UserSession userSession) {
        return 27p.A01(userSession).A0A;
    }

    public static KMU A0d(Iterator it) {
        return (KMU) it.next();
    }

    public static LPJ A0e(Iterator it) {
        return (LPJ) it.next();
    }

    public static AnonymousClass51M A0f(AnonymousClass831 r0, int i) {
        return (AnonymousClass51M) r0.A04(i);
    }

    public static AnonymousClass51M A0g(Iterator it) {
        return (AnonymousClass51M) it.next();
    }

    public static AnonymousClass831 A0h(2Fk r0) {
        return (AnonymousClass831) r0.A02();
    }

    public static IGTVUploadViewModel A0k(AnonymousClass0eM r0) {
        return (IGTVUploadViewModel) r0.getValue();
    }

    public static BrandedContentTag A0l(Iterator it) {
        return (BrandedContentTag) it.next();
    }

    public static AnonymousClass3Q2 A0m(Iterator it) {
        return (AnonymousClass3Q2) it.next();
    }

    public static C255783ui A0o(Iterator it) {
        return (C255783ui) it.next();
    }

    public static MediaTaggingInfo A0p(AbstractList abstractList, int i) {
        return (MediaTaggingInfo) abstractList.get(i);
    }

    public static C61013JvD A0r(AnonymousClass0Ud r0) {
        return (C61013JvD) r0.getValue();
    }

    public static Iterable A0x(05G r0) {
        return (Iterable) r0.getValue();
    }

    public static Number A0z(Object obj, AbstractMap abstractMap) {
        return (Number) abstractMap.get(obj);
    }

    public static String A11(AnonymousClass0Ud r0) {
        return (String) r0.getValue();
    }

    public static AbstractList A12(AbstractList abstractList, int i) {
        return (AbstractList) abstractList.get(i);
    }

    public static Collection A13(05G r0) {
        return (Collection) r0.getValue();
    }

    public static List A15(AnonymousClass0eM r0) {
        return (List) r0.getValue();
    }

    public static List A16(05G r0) {
        return (List) r0.getValue();
    }

    public static List A17(AnonymousClass0Ud r0) {
        return (List) r0.getValue();
    }

    public static Map A18(05G r0) {
        return (Map) r0.getValue();
    }

    public static Map A19(AnonymousClass0Ud r0) {
        return (Map) r0.getValue();
    }

    public static 0eP A1A(Iterator it) {
        return (0eP) it.next();
    }
}

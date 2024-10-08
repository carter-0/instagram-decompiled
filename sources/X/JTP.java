package X;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.JsonWriter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class JTP {
    public static int A01(double d, double d2) {
        return (int) Math.ceil(d / d2);
    }

    public static Paint A0D() {
        return new Paint(1);
    }

    public static C56078HsR A0P(int i) {
        return new C56078HsR(new Object[0], i);
    }

    public static GKO A0Q(int i) {
        return new GKO(new Object[0], i);
    }

    public static 0nV A0U(AnonymousClass12V r1, int i) {
        return r1.AOJ(i, 3);
    }

    public static 0nV A0V(AnonymousClass12V r1, int i) {
        return r1.CO6(i, 3);
    }

    public static Float A0h() {
        return new Float(0.0f);
    }

    public static Iterator A0x(List list) {
        0qQ.A0B(list, 0);
        return list.iterator();
    }

    public static 0V1 A10(C61770pa r2) {
        return new 0V1((C262204Co) null, r2);
    }

    public static void A16(C71492dQ r1) {
        r1.A0u = 0;
        r1.A0F = 0;
        r1.A0s = 0;
        r1.A0M = 0;
    }

    public static void A1K(2cs r3, float f) {
        r3.A08((double) f, true);
    }

    public static boolean A1Y(View view) {
        return view.canScrollVertically(-1);
    }

    public static int A08(AnonymousClass51M r2) {
        return r2.A08 - r2.A09;
    }

    public static Bundle A0F(UserSession userSession) {
        Bundle bundle = new Bundle();
        C227642jf.A04(bundle, userSession);
        return bundle;
    }

    public static LayoutInflater A0G(View view) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return LayoutInflater.from(view.getContext());
    }

    public static C268654dm A0N(Object obj) {
        return (C268654dm) ((C297815sO) obj).A00;
    }

    public static UserSession A0R(C61438K7n k7n) {
        return (UserSession) k7n.A0J.getValue();
    }

    public static AnonymousClass0vF A0W(C61620nx r1, String str) {
        r1.A01 = str;
        return new AnonymousClass0vF(r1);
    }

    public static ClipsCreationViewModel A0Y(C61423K6w k6w) {
        return (ClipsCreationViewModel) k6w.A0P.getValue();
    }

    public static AnonymousClass863 A0Z(AnonymousClass861 r0) {
        return (AnonymousClass863) r0.A0G.A02();
    }

    public static IGTVDraftsRepository A0a(IGTVUploadViewModel iGTVUploadViewModel) {
        return (IGTVDraftsRepository) iGTVUploadViewModel.A0C.getValue();
    }

    public static C60985Juh A0e(IgLiveHeartbeatManager igLiveHeartbeatManager) {
        return (C60985Juh) igLiveHeartbeatManager.A08.getValue();
    }

    public static IgLiveModerationRepository A0f(C313776gz r0) {
        return (IgLiveModerationRepository) r0.A0A.getValue();
    }

    public static Float A0i() {
        return new Float(1.0f);
    }

    public static Integer A0j(int i) {
        if (i != 0) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public static Object A0l(Object obj) {
        if (obj != 1Hj.A02) {
            return C60340gF.A00;
        }
        return obj;
    }

    public static String A0p(AnonymousClass283 r0) {
        String str = r0.A0L;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void A14(View view, int i, int i2) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
    }

    public static void A1A(2Fk r1, Object obj) {
        r1.A0B(new AnonymousClass88W(obj));
    }

    public static void A1D(RecyclerView recyclerView, int i, int i2) {
        recyclerView.A11(new AnonymousClass3V7(i, i2));
    }

    public static void A1E(0Aj r2) {
        r2.A8M(C279294yP.CLIPS, "camera_destination");
    }

    public static void A1F(0Aj r2) {
        r2.A8M(C59725JVj.POST_CAPTURE, "surface");
    }

    public static void A1G(0Aj r2) {
        r2.AAJ("view_mode", "host");
    }

    public static void A1H(0Aj r2) {
        r2.A8M(C279294yP.FEED, "camera_destination");
    }

    public static void A1I(0Aj r2, AnonymousClass283 r3) {
        r2.AAJ("camera_session_id", r3.A0L);
    }

    public static void A1J(0Aj r2, AnonymousClass283 r3) {
        r2.A8M(r3.A0A, "media_type");
    }

    public static void A1N(AnonymousClass8RF r1, int i) {
        r1.A0G(new C355868Rr(i));
    }

    public static void A1O(Object obj, int i) {
        View view = (View) obj;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A1P(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = new 0eP(obj, obj2);
    }

    public static void A1S(String str) {
        new File(str).delete();
    }

    public static void A1T(String str, String str2, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new N49(str, str2, i));
    }

    public static boolean A1X(int i, boolean z) {
        if ((i & 1) != 0) {
            return false;
        }
        return z;
    }

    public static float A00(float f, View view) {
        return f / ((float) view.getHeight());
    }

    public static int A02(Context context, Context context2, int i) {
        return context2.getColor(2Yu.A0H(context, i));
    }

    public static int A03(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static int A04(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
    }

    public static int A05(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
    }

    public static int A06(Drawable drawable) {
        return drawable.getBounds().height();
    }

    public static int A07(2Rw r0, Object obj, int i, int i2) {
        0qQ.A0B(obj, i);
        return r0.getItemViewType(i2);
    }

    public static int A09(Number number) {
        0qQ.A0A(number);
        return number.intValue();
    }

    public static Application A0A(Activity activity) {
        Application application = activity.getApplication();
        0qQ.A07(application);
        return application;
    }

    public static ContentResolver A0B(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        0qQ.A07(contentResolver);
        return contentResolver;
    }

    public static Context A0C(View view, int i) {
        0qQ.A0B(view, i);
        return view.getContext();
    }

    public static Drawable A0E(Context context, Number number) {
        return context.getDrawable(number.intValue());
    }

    public static View A0H(ViewStub viewStub, int i) {
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static AnonymousClass07Z A0I(Fragment fragment, C262094Cc r1, 0sL r2, C262224Cq r3) {
        1Eo.A05(r1, r2, r3);
        return fragment.getViewLifecycleOwner();
    }

    public static C318136oS A0J(2YL r0, Object obj, int i) {
        0qQ.A0B(obj, i);
        return C318116oQ.A00(r0);
    }

    public static C318136oS A0K(2YL r0, Object obj, 05G r2) {
        r2.Epw(obj);
        return C318116oQ.A00(r0);
    }

    public static 1vR A0L(GraphQlCallInput graphQlCallInput, 2IS r1, String str) {
        r1.A00(graphQlCallInput, str);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return AnonymousClass1vS.A00();
    }

    public static C61061Jvz A0M(05G r0) {
        return (C61061Jvz) r0.getValue();
    }

    public static Medium A0O(Iterator it) {
        return ((GalleryItem) it.next()).A00;
    }

    public static UserSession A0S(K66 k66, int i) {
        UserSession A0S = k66.A0S();
        0qQ.A0B(A0S, i);
        return A0S;
    }

    public static IgSimpleImageView A0T(View view, int i) {
        return (IgSimpleImageView) view.requireViewById(i);
    }

    public static 27r A0X(K66 k66) {
        return 27p.A01(k66.A0S());
    }

    public static C294975nL A0b(View view) {
        C294975nL A00 = C294975nL.A00(view);
        A00.A0G();
        return A00;
    }

    public static C294975nL A0c(View view, int i) {
        C294975nL A01 = C294975nL.A01(view, i);
        A01.A0G();
        return A01;
    }

    public static User A0d(Iterator it) {
        return (User) it.next();
    }

    public static Boolean A0g(0Aj r0, String str, String str2, boolean z) {
        r0.AAJ(str, str2);
        return Boolean.valueOf(z);
    }

    public static Integer A0k(Resources resources, int i) {
        return Integer.valueOf(resources.getDimensionPixelSize(i));
    }

    public static String A0m(Bundle bundle, String str) {
        String string = bundle.getString(str);
        C320236s2.A03(bundle, string, str);
        return string;
    }

    public static String A0n(17Z r0, Object obj) {
        r0.close();
        return obj.toString();
    }

    public static String A0o(ImageUrl imageUrl) {
        String url = imageUrl.getUrl();
        0qQ.A07(url);
        return url;
    }

    public static String A0q(C270194gL r0) {
        return r0.A03().getId();
    }

    public static String A0r(Reel reel) {
        String id = reel.getId();
        0qQ.A07(id);
        return id;
    }

    public static String A0s(MusicSearchPlaylist musicSearchPlaylist) {
        return musicSearchPlaylist.A00().getId();
    }

    public static String A0t(File file) {
        String path = file.getPath();
        0qQ.A07(path);
        return path;
    }

    public static String A0u(File file) {
        String canonicalPath = file.getCanonicalPath();
        0qQ.A07(canonicalPath);
        return canonicalPath;
    }

    public static Iterator A0v(17Z r0, List list) {
        r0.A0b();
        return list.iterator();
    }

    public static Iterator A0w(C3499682q r0) {
        return r0.Co4().iterator();
    }

    public static Set A0y(Object obj) {
        Set singleton = Collections.singleton(obj);
        0qQ.A07(singleton);
        return singleton;
    }

    public static ReentrantReadWriteLock.WriteLock A0z(ReentrantReadWriteLock reentrantReadWriteLock) {
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        return writeLock;
    }

    public static void A11(Activity activity, 1DN r2, String str) {
        1DL.A04(activity, r2, new String[]{str});
    }

    public static void A12(JsonWriter jsonWriter, String str, String str2) {
        jsonWriter.name(str).value(str2);
    }

    public static void A13(View view) {
        view.setId(View.generateViewId());
    }

    public static void A15(View view, boolean z) {
        view.getParent().requestDisallowInterceptTouchEvent(z);
    }

    public static void A17(Fragment fragment, AnonymousClass3E6 r1) {
        r1.DmJ(fragment.requireActivity());
    }

    public static void A18(Fragment fragment, AnonymousClass3E6 r1) {
        r1.DmJ(fragment.getActivity());
    }

    public static void A19(2Fk r1, int i) {
        r1.A0B(Integer.valueOf(i));
    }

    public static void A1B(2Fk r1, boolean z) {
        r1.A0B(Boolean.valueOf(z));
    }

    public static void A1C(C232322tW r0, 2Rw r1) {
        C232332tX.A00(r0).A03(r1);
    }

    public static void A1L(29E r1, String str, String str2, long j) {
        r1.A0C(002.A0R(str, str2), j);
    }

    public static void A1M(UserSession userSession) {
        28E.A00(userSession).A04();
    }

    public static void A1Q(Object obj, AbstractMap abstractMap, float f) {
        abstractMap.put(obj, Float.valueOf(f));
    }

    public static void A1R(Object obj, Map map, boolean z) {
        map.put(obj, Boolean.valueOf(z));
    }

    public static void A1U(String str, Throwable th) {
        0kD.A0I(str, th, 0Yt.A0E());
    }

    public static void A1V(AbstractCollection abstractCollection, float f) {
        abstractCollection.add(Float.valueOf(f));
    }

    public static void A1W(05G r1, int i) {
        r1.Epw(Integer.valueOf(i));
    }

    public static boolean A1Z(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A00(followersShareFragment).COf();
    }

    public static boolean A1a(Object obj, AnonymousClass0eM r2) {
        return obj.equals(r2.getValue());
    }

    public static boolean A1b(Object obj, 05G r2) {
        return r2.AIY(r2.getValue(), obj);
    }
}

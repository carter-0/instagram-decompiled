package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONObject;

public abstract class JTQ {
    public static int A00(int i) {
        return i != 0 ? 0 : 4;
    }

    public static Bitmap A07(AnonymousClass3LX r1) {
        0qQ.A0B(r1, 1);
        return r1.A01;
    }

    public static C355878Rs A0J() {
        return new C355878Rs(-1);
    }

    public static AtomicBoolean A0k() {
        return new AtomicBoolean(false);
    }

    public static C262204Co A0n(C262204Co r1) {
        if (r1 == null) {
            return null;
        }
        r1.AG7((CancellationException) null);
        return null;
    }

    public static 1HR A0o() {
        return new 1HR(0);
    }

    public static 05D A0p() {
        return 10D.A01(AnonymousClass05K.A00, 0, 0);
    }

    public static void A0y(C252553pI r5, RecyclerView recyclerView, C229132mt r7, C3251771i r8) {
        recyclerView.A15(new C3251871j(r5, r7, r8, false, false));
    }

    public static void A1H(AnonymousClass3NL r1, AnonymousClass3NG r2) {
        r2.A04 = r1;
        r2.A07 = true;
        r2.A0C = true;
        r2.A00();
    }

    public static void A1I(IgdsButton igdsButton) {
        igdsButton.setLoading(true);
        igdsButton.setEnabled(false);
    }

    public static void A1L(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
    }

    public static boolean A1O(int i, int i2) {
        return i != i2;
    }

    public static boolean A1P(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1X(Object obj) {
        0qQ.A0B(obj, 0);
        return true;
    }

    public static int A01(int i) {
        return i > 0 ? 0 : 8;
    }

    public static int A02(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        return 8;
    }

    public static Context A06(C249703kE r0) {
        Context context = r0.itemView.getContext();
        0qQ.A07(context);
        return context;
    }

    public static Uri A09(String str) {
        return Uri.fromFile(new File(str));
    }

    public static C71492dQ A0B(int i, int i2, int i3, int i4) {
        C71492dQ r0 = new C71492dQ(i, i2);
        r0.A0u = i3;
        r0.A0F = i4;
        return r0;
    }

    public static C270354gb A0C(ConstraintLayout constraintLayout) {
        C270354gb r0 = new C270354gb();
        r0.A0I(constraintLayout);
        return r0;
    }

    public static AnonymousClass1QT A0E() {
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        r1.A04 = 1CE.A02;
        return r1;
    }

    public static SimpleImageUrl A0G(String str) {
        return C253833rU.A01(new File(str));
    }

    public static AnonymousClass831 A0K(ClipsCreationViewModel clipsCreationViewModel) {
        return (AnonymousClass831) clipsCreationViewModel.A0G.A02();
    }

    public static C60235Jhs A0L(K6K k6k) {
        return (C60235Jhs) k6k.A0j.getValue();
    }

    public static C61013JvD A0Q(IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        return (C61013JvD) igLiveBroadcastInfoManager.A06.getValue();
    }

    public static Object A0Y(Object obj) {
        return ((AnonymousClass3JC) ((C239793Ih) obj).A00).A01;
    }

    public static String A0c(Map map) {
        return new JSONObject(map).toString();
    }

    public static StringBuilder A0d(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        return sb;
    }

    public static List A0i(Object obj) {
        List list = (List) obj;
        0qQ.A0B(list, 0);
        return list;
    }

    public static List A0j(List list) {
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static AnonymousClass0eM A0l(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73657PhW(obj, i));
    }

    public static C241503Pl A0m(AnonymousClass4D7 r1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C241503Pl.A01;
        return new C241503Pl(1Ey.A02(r1));
    }

    public static void A0t(int i, List list) {
        list.add(new C46448DfA(i));
    }

    public static void A0w(View view, int i, int i2) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
    }

    public static void A0x(2Fk r1, Object obj) {
        r1.A0A(new AnonymousClass88W(obj));
    }

    public static void A13(0Aj r1, Long l) {
        r1.A9F("media_id", l);
        r1.Cgf();
    }

    public static void A15(0Aj r1, String str) {
        r1.AAJ("product", str);
        r1.Cgf();
    }

    public static void A16(0Aj r1, List list) {
        r1.AAe("current_guest_ids", list);
        r1.Cgf();
    }

    public static void A1A(1Ln r1) {
        r1.A0n(27x.A08.getModuleName());
    }

    public static void A1B(1Ln r1, AnonymousClass283 r2) {
        r1.A0b(r2.A09);
        r1.A0T();
    }

    public static void A1D(1Fa r1, String str, String str2) {
        r1.A9m("product", str);
        r1.A9m("browse_session_id", str2);
    }

    public static void A1F(1xC r1, Dc2 dc2) {
        r1.A00(new AnonymousClass3GP(dc2));
    }

    public static void A1G(AnonymousClass2t9 r1) {
        r1.A05(new ViewModelListUpdate());
    }

    public static void A1J(AnonymousClass3Q2 r0, 1ua r1, int i) {
        if (i != 0) {
            r1.A0F(r0);
        } else {
            r1.A0E(r0);
        }
    }

    public static void A1M(AbstractCollection abstractCollection, 0sL r2, C262224Cq r3) {
        abstractCollection.add(1Eo.A02(19B.A00, r2, r3));
    }

    public static void A1N(05G r1, int i) {
        r1.Epw(new Integer(i));
    }

    public static boolean A1U(Class cls, Object obj) {
        return obj.equals(new 0Yh(cls));
    }

    public static boolean A1V(Class cls, Object obj) {
        return 0qQ.A0K(obj, new 0Yh(cls));
    }

    public static boolean A1W(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1Z(String str) {
        return new File(str).exists();
    }

    public static 0eP[] A1b(Object obj, Object obj2, 0eP r3) {
        return new 0eP[]{r3, new 0eP(obj, obj2)};
    }

    public static int A03(Fragment fragment, int i) {
        return fragment.requireContext().getColor(i);
    }

    public static int A04(LTY lty, int i) {
        return lty.A0H(i).size();
    }

    public static ValueAnimator A05(int i, int i2) {
        return ValueAnimator.ofInt(new int[]{i, i2});
    }

    public static BitmapDrawable A08(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static TextView A0A(AnonymousClass0eM r0) {
        Object value = r0.getValue();
        0qQ.A07(value);
        return (TextView) value;
    }

    public static 2IS A0D(0Df r0, Object obj, String str) {
        0Df.A00(r0, obj, str);
        return new 2IS();
    }

    public static 1Ng A0F(FollowersShareFragment followersShareFragment) {
        return AnonymousClass1Nd.A00(followersShareFragment.A0R());
    }

    public static ContentNoteMetadata A0H(AnonymousClass0eM r0) {
        return ((ContentNotesImmersiveReplyContent) r0.getValue()).A02;
    }

    public static 27r A0I(K5U k5u) {
        return 27p.A01(k5u.A0O());
    }

    public static AnonymousClass3Q2 A0M(UserSession userSession, String str) {
        return 28K.A00(userSession).A03(str);
    }

    public static AnonymousClass3Q2 A0N(MediaSession mediaSession, C267834cI r1) {
        return r1.BbQ(mediaSession.BbR());
    }

    public static C339797kB A0O(ViewGroup viewGroup) {
        return new C339797kB(viewGroup, R.layout.permission_empty_state_view);
    }

    public static C294975nL A0P(C294975nL r1, double d, double d2) {
        return r1.A0E(C71392co.A03(d, d2));
    }

    public static Integer A0R(UserSession userSession, 0eE r1) {
        return r1.A01(userSession).A0N();
    }

    public static Long A0S(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public static Long A0T(String str) {
        return new Long(Long.parseLong(str));
    }

    public static Long A0U(AtomicInteger atomicInteger) {
        return Long.valueOf((long) atomicInteger.get());
    }

    public static Object A0V(AnonymousClass5b4 r1, AnonymousClass5b9 r2, Object obj, AnonymousClass4D7 r4) {
        return r1.A03(r2, obj, r1.A02(), r4);
    }

    public static Object A0W(1Ef r1, UserSession userSession, AnonymousClass4D7 r3) {
        return 1vm.A01(userSession).A04(r1, r3);
    }

    public static Object A0X(MediaCommentListRepository mediaCommentListRepository, Object obj, AnonymousClass4D7 r2, 0sP r3) {
        Object A09 = MediaCommentListRepository.A09(mediaCommentListRepository, r2, r3);
        if (A09 != obj) {
            return C60340gF.A00;
        }
        return A09;
    }

    public static String A0Z() {
        return String.valueOf(System.nanoTime());
    }

    public static String A0a(Context context, int i) {
        return 02K.A01(context).getString(i);
    }

    public static String A0b(MusicSearchPlaylist musicSearchPlaylist) {
        return musicSearchPlaylist.A00().getTitle();
    }

    public static ArrayList A0e(Object obj) {
        0eS.A00(obj);
        return new ArrayList();
    }

    public static ArrayList A0f(Map map) {
        return new ArrayList(map.size());
    }

    public static Iterator A0g(AnonymousClass3Q2 r0) {
        return r0.A0L().iterator();
    }

    public static Iterator A0h(List list) {
        return Collections.unmodifiableList(list).iterator();
    }

    public static 02z A0q() {
        return 106.A01(0Yt.A0E());
    }

    public static 02z A0r(int i) {
        return new 02z(Integer.valueOf(i));
    }

    public static 02z A0s(boolean z) {
        return 106.A01(Boolean.valueOf(z));
    }

    public static void A0u(Canvas canvas, AnonymousClass0eM r2) {
        ((Drawable) r2.getValue()).draw(canvas);
    }

    public static void A0v(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(f);
    }

    public static void A0z(0Aj r2, long j) {
        r2.A9F("a_pk", Long.valueOf(j));
    }

    public static void A10(0Aj r2, long j) {
        r2.A9F(TraceFieldType.BroadcastId, Long.valueOf(j));
    }

    public static void A11(0Aj r2, 1QA r3) {
        r2.AAJ("waterfall_id", r3.A05());
    }

    public static void A12(0Aj r2, 27x r3) {
        r2.A8M(r3.A0I(), "capture_type");
    }

    public static void A14(0Aj r2, String str) {
        r2.AAE(C263944Ny.A00(str), "a_pk");
    }

    public static void A17(0Aj r2, boolean z) {
        r2.A7p("is_album", Boolean.valueOf(z));
    }

    public static void A18(0Ak r2, 27x r3) {
        r2.A0M(r3.A0I(), "capture_type");
    }

    public static void A19(0bb r1, String str, String str2, String str3) {
        r1.A06(str, str2);
        r1.A06("suppress_reason", str3);
    }

    public static void A1C(1Ln r0, Long l, Map map) {
        r0.A0i(l);
        r0.A0w(map);
        r0.Cgf();
    }

    public static void A1E(29E r2, Enum enumR, long j) {
        r2.A0A(j, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumR.name());
    }

    public static void A1K(Object obj) {
        0qQ.A0A(obj);
        0qQ.A0B(obj, 0);
    }

    public static boolean A1S(Tag tag, List list) {
        return list.contains(tag.getId());
    }

    public static boolean A1T(User user, List list) {
        return list.contains(user.getId());
    }

    public static boolean A1Y(Object obj, String str) {
        return str.equals(obj.toString());
    }

    public static Integer[] A1a(Integer num, Integer num2, Integer num3, int i) {
        return new Integer[]{num, num2, num3, Integer.valueOf(i)};
    }

    public static boolean A1Q(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36323002278947562L);
    }

    public static boolean A1R(0Tu r2, 0lg r3) {
        return 182.A06(r2, r3, 36323002279144173L);
    }
}

package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.rsys.audio.gen.AudioApi;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.video.ui.CamcorderBlinker;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductTag;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.reels.store.ReelStore;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.user.model.Product;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

public abstract class JTS {
    public static double A00(float f, float f2) {
        return Math.toDegrees(Math.atan((double) Math.abs(f / f2)));
    }

    public static Rect A08(Bitmap bitmap) {
        return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public static FrameLayout.LayoutParams A0D() {
        return new FrameLayout.LayoutParams(-1, -2);
    }

    public static StringWriter A0a(Object obj) {
        0qQ.A0B(obj, 0);
        return new StringWriter();
    }

    public static Character A0b(String str) {
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static Double A0c(long j) {
        return Double.valueOf((double) (((float) j) / 1000.0f));
    }

    public static 1IW A0s(AnonymousClass4D7 r3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r0 = new 1IW(1, 1Ey.A02(r3));
        r0.A0I();
        return r0;
    }

    public static void A0v(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(1);
    }

    public static void A0x(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static void A12(2Fk r2) {
        r2.A0B(new AnonymousClass88W(true));
    }

    public static void A1D(0bb r2, int i, int i2) {
        r2.A05("page_number", Long.valueOf((long) i));
        r2.A05("total_pages", Long.valueOf((long) i2));
    }

    public static void A1N(C357318Xk r3, AlbumEditFragment albumEditFragment) {
        C357318Xk r0;
        if (r3 != null && r3.A05() && (r0 = albumEditFragment.A0I) != null) {
            r0.A04(false);
        }
    }

    public static void A1O(C357318Xk r3, C59962JcV jcV) {
        C357318Xk r0;
        if (r3 != null && r3.A05() && (r0 = jcV.A0H) != null) {
            r0.A04(false);
        }
    }

    public static Object[] A1b(Object[] objArr) {
        return 00k.A0a(0sr.A1P(objArr)).toArray(new AnonymousClass0r6[0]);
    }

    public static int A03(LTY lty) {
        return ((Number) lty.A04.A01).intValue();
    }

    public static long A06(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return -1;
    }

    public static Resources A07(C249703kE r0) {
        Context context = r0.itemView.getContext();
        0qQ.A07(context);
        return context.getResources();
    }

    public static 1VA A0F(UserSession userSession, AnonymousClass1V7 r3, Class cls) {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        return 1V9.A00(context, cls, 1V8.A00(userSession, r3));
    }

    public static 1Ef A0G(PandoGraphQLRequest pandoGraphQLRequest) {
        return pandoGraphQLRequest.setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
    }

    public static ImmutableList A0H(int i) {
        if (i != 0) {
            return ImmutableList.of(AudioTrackType.REACTIVE);
        }
        return ImmutableList.of(AudioTrackType.ORIGINAL, AudioTrackType.REACTIVE);
    }

    public static 1Pq A0I(0lg r1) {
        1Pq r12 = new 1Pq(new 1HV(r1));
        r12.A01(AnonymousClass05K.A0N);
        return r12;
    }

    public static C59960JcS A0P(0lg r3) {
        return (C59960JcS) r3.A01(C59960JcS.class, new C73903Ple(r3, 11));
    }

    public static C43347Bwl A0R(C250663lr r3, int i) {
        return (C43347Bwl) r3.reinterpretIfFulfillsType(i, "XIGGenAIPersonaVersion", C43347Bwl.class, 1777778047);
    }

    public static C239123Fb A0S(2IS r2, 0lg r3, Class cls, String str, boolean z) {
        C239113Fa r1 = new C239113Fa(r2, cls, str, z);
        C239123Fb r0 = new C239123Fb(r3);
        r0.A08(r1);
        return r0;
    }

    public static Reel A0T(UserSession userSession, 1Ns r3, String str, boolean z) {
        Reel reel = new Reel(r3, str, z);
        ReelStore.A03(userSession).A0X(reel);
        return reel;
    }

    public static 0xa A0V(JY2 jy2) {
        return ((1Am) jy2.A01.getValue()).A04(1An.A0c, jy2.getClass());
    }

    public static MVF A0X(I4T i4t, Object obj) {
        return (MVF) ((Map) i4t.A05.getValue()).get(obj);
    }

    public static Object A0g(NCY ncy) {
        2LV r1 = AudioApi.CONVERTER;
        0qQ.A08(r1);
        C70405O5i o5i = ncy.A00;
        if (o5i != null) {
            return o5i.A00.A00(r1);
        }
        return null;
    }

    public static String A0j(0Aj r1, 27x r2, String str) {
        r1.AAJ("legacy_falco_event_name", str);
        String str2 = r2.A04.A0L;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String A0l(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static ArrayList A0n(Collection collection) {
        ArrayList arrayList;
        if (collection != null) {
            return arrayList;
        }
        arrayList = new ArrayList();
        return arrayList;
    }

    public static LinkedHashMap A0p(Object obj, Object obj2, 0eP r3, 0eP r4) {
        return 0Yt.A07(new 0eP[]{r3, r4, new 0eP(obj, obj2)});
    }

    public static C262204Co A0t(Fragment fragment, 0sL r3, AnonymousClass0r6 r4) {
        return AnonymousClass11O.A03(AnonymousClass07a.A00(fragment.getViewLifecycleOwner()), new C61860pz(r3, r4));
    }

    public static void A0w(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        AnonymousClass7AV.A02(spannableStringBuilder, new AnonymousClass7AK(new Integer(i)), str);
    }

    public static void A10(AnonymousClass07Z r2, 0sL r3, AnonymousClass0r6 r4) {
        AnonymousClass11O.A03(C71772f0.A00(r2.getLifecycle()), new C61860pz(r3, r4));
    }

    public static void A11(AnonymousClass07Z r2, 0sL r3, AnonymousClass0r6 r4) {
        AnonymousClass11O.A03(AnonymousClass07a.A00(r2), new C61860pz(r3, r4));
    }

    public static void A14(AnonymousClass0Ac r1, 0Aj r2) {
        r2.A8M(r1, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r2.A8k("event_type", 2);
    }

    public static void A15(AnonymousClass0Ac r1, 0Aj r2, int i) {
        r2.A8M(r1, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r2.A8k("event_type", Integer.valueOf(i));
    }

    public static void A16(0Aj r2) {
        r2.A9F("capture_format_index", 0L);
    }

    public static void A19(0Aj r2, AnonymousClass283 r3) {
        r2.AAJ("composition_str_id", r3.A0M);
        r2.A8M(r3.A0A, "composition_media_type");
    }

    public static void A1A(0Aj r2, 27x r3) {
        r2.AAK(2AL.A07(r3.A00, r3.A03), "system_info");
    }

    public static void A1C(0Aj r2, Map map) {
        r2.A9H("custom_fields", map);
        r2.AAJ("application_state", AnonymousClass5BB.A00());
    }

    public static void A1E(1Ln r1) {
        r1.A0u(AnonymousClass1QI.A00.A02.A00);
        r1.Cgf();
    }

    public static void A1H(AnonymousClass818 r2, C368278sM r3, AnonymousClass819 r4, UserSession userSession, String str) {
        0bb r1 = new 0bb();
        r1.A06("suppress_reason", str);
        C368288sN.A00(r2, r3, r4, r1, userSession);
    }

    public static void A1I(C64358Laa laa, Object obj, Object obj2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj);
        jSONObject.put("data", obj2);
        laa.A01.A00(jSONObject);
    }

    public static void A1K(1Fa r2, Object obj, String str) {
        r2.A0A("creatives/story_media_search_keyed_format/");
        r2.A9m("media_types", obj.toString());
        r2.A9m("q", str);
    }

    public static void A1L(1Fa r2, String str, String str2) {
        r2.A02();
        String A0u = 002.A0u("api/", "v1/", str, str2);
        0qQ.A07(A0u);
        r2.A0E = A0u;
    }

    public static void A1M(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, C61446K8a k8a, String str, Collection collection, boolean z) {
        k8a.A04 = new ArrayList(collection);
        k8a.A03 = str;
        k8a.A09 = z;
        k8a.A00 = brandedContentGatingInfoIntf;
    }

    public static void A1P(AnonymousClass80Q r0) {
        AnonymousClass8BA r02;
        if (r0 != null && (r02 = r0.A00.A0e) != null) {
            r02.A0y.A0B();
        }
    }

    public static void A1R(AnonymousClass3Q2 r1, String str) {
        File parentFile = new File(str).getParentFile();
        parentFile.getClass();
        r1.A3w = parentFile.getName();
    }

    public static void A1U(C306386Ly r5, float f, float f2, float f3) {
        float f4 = (float) (r5.A06 / 2);
        r5.setBounds((int) (f - f2), (int) (f3 - f4), (int) f, (int) (f3 + f4));
    }

    public static boolean A1Y(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36316662907015732L);
    }

    public static float A01(Context context, float f) {
        return (context.getResources().getDimension(R.dimen.asset_picker_redesign_sticker_height) * f) / 1000.0f;
    }

    public static float A02(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return ((Number) obj2).floatValue();
    }

    public static int A04(ReentrantReadWriteLock reentrantReadWriteLock) {
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            return reentrantReadWriteLock.getReadHoldCount();
        }
        return 0;
    }

    public static long A05(0Tu r0, 0lg r1, long j) {
        return 182.A01(r0, r1, j) * 1000;
    }

    public static LayoutInflater A09(Context context, LayoutInflater layoutInflater) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(context, R.style.MusicCreationLightOverlayTheme));
    }

    public static LayoutInflater A0A(LayoutInflater layoutInflater, Fragment fragment) {
        return layoutInflater.cloneInContext(new C251383n1(fragment.getContext(), (int) R.style.EffectDarkMode));
    }

    public static View A0B(MotionEvent motionEvent, RecyclerView recyclerView) {
        return recyclerView.A0U(motionEvent.getX(), motionEvent.getY());
    }

    public static View A0C(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return ((ViewStub) requireViewById).inflate();
    }

    public static 2YL A0E(Fragment fragment, AnonymousClass07g r2, UserSession userSession) {
        return new 2YN(new C3500182v(userSession, fragment.requireActivity()), r2).A00(ClipsCreationViewModel.class);
    }

    public static UserSession A0J(AnonymousClass0eM r1) {
        UserSession userSession = (UserSession) r1.getValue();
        0qQ.A0B(userSession, 0);
        return userSession;
    }

    public static 29H A0K(AnonymousClass0eM r0) {
        return 27p.A01((UserSession) r0.getValue()).A03;
    }

    public static C61194Jyn A0L(AbstractList abstractList, int i, int i2) {
        return (C61194Jyn) ((AbstractList) abstractList.get(i)).get(i2);
    }

    public static C3507085w A0M(Fragment fragment, AnonymousClass0eM r2) {
        return new C3507085w((UserSession) r2.getValue(), fragment.requireActivity());
    }

    public static AnonymousClass860 A0N(Fragment fragment) {
        return new 2YN(fragment.requireActivity()).A00(AnonymousClass860.class);
    }

    public static AnonymousClass7Z7 A0O(UserSession userSession, DirectShareTarget directShareTarget) {
        return AnonymousClass1pH.A00().E52(userSession).A00(directShareTarget);
    }

    public static JY0 A0Q(Context context, 0lg r3, Object obj) {
        return (JY0) r3.A01(JY0.class, new C58695Iw4(16, (Object) context.getApplicationContext(), (Object) r3, obj));
    }

    public static AnonymousClass3Q2 A0U(UserSession userSession, Iterator it) {
        return 28K.A00(userSession).A03(((MediaSession) it.next()).BbR());
    }

    public static IgRoomDatabase A0W(1VA r0, 0lg r1, Class cls) {
        r0.A01();
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) r0.A00();
        r1.A04(cls, igRoomDatabase);
        return igRoomDatabase;
    }

    public static Product A0Y(Iterator it) {
        return C14502TxO.A00(((ProductTag) it.next()).A02);
    }

    public static LEQ A0Z(C357498Yd r2, K6W k6w) {
        return r2.A00(k6w.requireContext(), K6W.A00(k6w)).A01();
    }

    public static IllegalStateException A0d(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(((C297815sO) obj).A00);
        return new IllegalStateException(sb.toString());
    }

    public static Integer A0e(UserSession userSession) {
        return 0eE.A00(userSession).A00().A0N();
    }

    public static Object A0f(Parcel parcel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        parcel.writeString((String) entry.getKey());
        return entry.getValue();
    }

    public static Object A0h(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        abstractMap.put(obj, arrayList);
        return arrayList;
    }

    public static String A0i(Resources resources, int i, int i2) {
        return resources.getString(i2, new Object[]{Integer.valueOf(i)});
    }

    public static String A0k(17Z r0, Object obj) {
        r0.A0Y();
        r0.close();
        String obj2 = obj.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public static AbstractCollection A0m(Object obj, AbstractMap abstractMap) {
        AbstractCollection abstractCollection = (AbstractCollection) abstractMap.get(obj);
        if (abstractCollection != null) {
            return abstractCollection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        abstractMap.put(obj, linkedHashSet);
        return linkedHashSet;
    }

    public static Calendar A0o() {
        Calendar A00 = C361828gs.A00();
        A00.setTime(C362978ip.A01(C361828gs.A00(), new Date()));
        return A00;
    }

    public static List A0q(2Fk r0) {
        List list = (List) r0.A02();
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    public static List A0r(AnonymousClass0Ud r0) {
        return 00k.A0a(((Map) r0.getValue()).keySet());
    }

    public static void A0u(Context context, TextView textView, int i) {
        textView.setTextColor(context.getColor(2Yu.A0H(context, i)));
    }

    public static void A0y(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        requireViewById.setVisibility(8);
    }

    public static void A0z(Fragment fragment) {
        00N onBackPressedDispatcher;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.A04();
        }
    }

    public static void A13(2YL r0, 0sL r1, AnonymousClass0r6 r2) {
        AnonymousClass11O.A03(C318116oQ.A00(r0), 10q.A01(r1, r2));
    }

    public static void A17(0Aj r2, long j) {
        r2.AAE(new C263944Ny(Long.valueOf(j)), "a_pk");
    }

    public static void A18(0Aj r2, 1QA r3) {
        String A05 = r3.A05();
        0qQ.A07(A05);
        r2.AAJ("waterfall_id", A05);
    }

    public static void A1B(0Aj r2, AnonymousClass3Q2 r3) {
        r2.AAJ(Dbm.A00(), C2373637i.A01(r3));
    }

    public static void A1F(1Ln r1, 29R r2, String str) {
        r1.A0r(str);
        29R.A00(r1, r2);
        r1.A0a(r2.A0J());
    }

    public static void A1G(1Ln r1, String str, String str2) {
        r1.A0q(str);
        r1.A0o("broadcast");
        r1.A0s(str2);
    }

    public static void A1J(17Z r2, Iterator it) {
        Number number = (Number) it.next();
        if (number != null) {
            r2.A0h(number.longValue());
        }
    }

    public static void A1Q(CamcorderBlinker camcorderBlinker) {
        Context context = camcorderBlinker.getContext();
        camcorderBlinker.A00 = 0nA.A09(context);
        camcorderBlinker.A01 = AnimationUtils.loadAnimation(context, R.anim.camcorder_blinker);
    }

    public static void A1S(0xa r2, String str, int i) {
        int i2 = r2.getInt(str, i) + 1;
        0xY AR4 = r2.AR4();
        AR4.E5Z(str, i2);
        AR4.apply();
    }

    public static void A1T(C294975nL r0, float f) {
        r0.A0G();
        r0.A0K(f);
        r0.A0A().A0H();
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(Long.parseLong((String) it.next())));
    }

    public static void A1W(AnonymousClass0eM r0, int i) {
        Object value = r0.getValue();
        0qQ.A07(value);
        ((View) value).setVisibility(i);
    }

    public static void A1X(AnonymousClass0eM r0, int i) {
        View view = (View) r0.getValue();
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static boolean A1Z(05G r2) {
        return r2.AIY(r2.getValue(), new ArrayList());
    }

    public static boolean A1a(AnonymousClass0Ud r0) {
        return !((Collection) r0.getValue()).isEmpty();
    }
}

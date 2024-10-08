package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public abstract class JTT {
    public static Context A0B(Fragment fragment, Object obj) {
        0qQ.A0B(obj, 0);
        return fragment.requireContext();
    }

    public static Bitmap A0C(Bitmap bitmap, float f, float f2) {
        Bitmap bitmap2 = bitmap;
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f / ((float) bitmap.getHeight()));
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        0fO.A03(bitmap2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, false);
        0qQ.A07(createBitmap);
        bitmap2.recycle();
        return createBitmap;
    }

    public static GKO A0J() {
        return new GKO(new Object[0], 2131974093);
    }

    public static OpalAudienceSelectorRepository.OpalAudience A0c(C250663lr r8, String str, String str2, boolean z) {
        return new OpalAudienceSelectorRepository.OpalAudience(str, str2, r8.A09("full_name"), r8.A0A("profile_pic_url"), z, r8.getCoercedBooleanField(4, "is_verified"), false);
    }

    public static ClipInfo A0d(Medium medium) {
        ClipInfo clipInfo = new ClipInfo((String) null, 16777215);
        clipInfo.A0C = Integer.valueOf(medium.A07);
        int i = medium.A0B;
        int i2 = medium.A04;
        clipInfo.A09 = i;
        clipInfo.A06 = i2;
        return clipInfo;
    }

    public static void A0z(Rect rect, TextView textView) {
        textView.getLineBounds(0, rect);
        textView.setMaxLines(AnonymousClass1GB.A00(((double) Math.max(textView.getHeight(), 0)) / ((double) Math.max(rect.bottom - rect.top, 1))));
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static void A10(Drawable drawable, View view) {
        if (drawable != null) {
            drawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A0j, view.getResources().getColor(R.color.canvas_bottom_sheet_description_text_color, (Resources.Theme) null)));
        }
    }

    public static void A12(View view) {
        C71492dQ r1 = new C71492dQ(-1, -1);
        r1.A0F = 0;
        r1.A0u = 0;
        r1.A0M = 0;
        r1.A0s = 0;
        view.setLayoutParams(r1);
    }

    public static void A1J(C355378Pt r4, C355368Ps r5) {
        r5.A04 = r4;
        if (r5.getWidth() > 0 && r5.getHeight() > 0) {
            C355378Pt r2 = r5.A04;
            0qQ.A0A(r2);
            r2.setBounds(0, 0, r5.getWidth(), r5.getHeight());
        }
    }

    public static void A1K(FeedColorFilterPicker feedColorFilterPicker) {
        feedColorFilterPicker.A00 = -1;
        feedColorFilterPicker.A01 = -1;
        feedColorFilterPicker.setHorizontalFadingEdgeEnabled(false);
        feedColorFilterPicker.setHorizontalScrollBarEnabled(false);
        feedColorFilterPicker.A06 = new ArrayList();
    }

    public static void A1N(IgdsButton igdsButton) {
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        C43346Bwk bwk = (C43346Bwk) next;
        if (((C62626Kix) bwk.getOptionalEnumField(0, "audience_enum", C62626Kix.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && bwk.getOptionalStringField(1, "audience_formatted") != null) {
            abstractCollection.add(next);
        }
    }

    public static float A00(C71412ct r5) {
        return (float) Math.min(Math.max(r5.A00, 0.0d), 1.0d);
    }

    public static int A01(int i, int i2) {
        if ((i & 4) != 0) {
            return 0;
        }
        return i2;
    }

    public static int A07(UserSession userSession, AnonymousClass3Q2 r3) {
        if (0qQ.A0K(r3.A1N, C376399Hv.A00())) {
            return C3495980z.A00(userSession).A01;
        }
        ClipInfo clipInfo = r3.A1N;
        return clipInfo.A05 - clipInfo.A07;
    }

    public static int A08(Iterable iterable) {
        int A0L = 0se.A0L(0Yv.A1E(iterable, 10));
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static AttributeSet A0D(AttributeSet attributeSet, int i) {
        if ((i & 2) != 0) {
            return null;
        }
        return attributeSet;
    }

    public static IGCreatorIncentiveProgramFetchEntryPoint A0G(String str, String str2, int i) {
        return new IGCreatorIncentiveProgramFetchEntryPoint(str, i, str2);
    }

    public static C60186Jh5 A0L(K3R k3r) {
        return (C60186Jh5) k3r.A05.getValue();
    }

    public static C357088Wk A0O(C351978Be r0) {
        return (C357088Wk) r0.A00.A1x.get();
    }

    public static C60263JiK A0Q(K6A k6a) {
        return (C60263JiK) k6a.A0P.getValue();
    }

    public static C67715MtU A0T(KQV kqv) {
        return (C67715MtU) kqv.A05.getValue();
    }

    public static C67715MtU A0U(KQW kqw) {
        return (C67715MtU) kqw.A06.getValue();
    }

    public static C60326JjV A0Z(K5B k5b) {
        return (C60326JjV) k5b.A0B.getValue();
    }

    public static IgRoomDatabase A0h(UserSession userSession, AnonymousClass2MY r6) {
        Class<CreationDatabase> cls = CreationDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase != null) {
            return igRoomDatabase;
        }
        Context context = C60960kU.A00;
        0qQ.A07(context);
        1VA A00 = 1V9.A00(context, cls, 1V8.A00(userSession, r6));
        1VC.A00(A00, 1702658258, 1401021912, true);
        r6.A00(A00);
        IgRoomDatabase igRoomDatabase2 = (IgRoomDatabase) A00.A00();
        userSession.A04(cls, igRoomDatabase2);
        return igRoomDatabase2;
    }

    public static MediaTaggingInfo A0i(TaggingActivity taggingActivity, AbstractList abstractList) {
        return (MediaTaggingInfo) abstractList.get(taggingActivity.A00);
    }

    public static IllegalArgumentException A0k(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported type ");
        sb.append(new 0Yh(cls));
        return new IllegalArgumentException(sb.toString());
    }

    public static Collection A0r(Object obj) {
        Collection values = ((AbstractMap) obj).values();
        0qQ.A07(values);
        return values;
    }

    public static List A0t(Iterable iterable) {
        if (iterable != null) {
            return 00k.A0a(iterable);
        }
        return 0sn.A00;
    }

    public static Set A0u(Uri.Builder builder, Uri uri) {
        builder.scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (!queryParameterNames.contains("utm_source")) {
            builder.appendQueryParameter("utm_source", "qr");
        }
        return queryParameterNames;
    }

    public static 0Yh A0v() {
        return new 0Yh(C60315JjI.class);
    }

    public static 0Yh A0w() {
        return new 0Yh(C60316JjJ.class);
    }

    public static void A0x() {
        0qQ.A0F("musicOverlayEditController");
        throw null;
    }

    public static void A0y(PointF pointF, 17Z r2) {
        if (pointF != null) {
            r2.A0q("position");
            r2.A0b();
            r2.A0f(pointF.x);
            r2.A0f(pointF.y);
            r2.A0Y();
        }
    }

    public static void A11(Pair pair, Map map) {
        Object obj = pair.first;
        0qQ.A06(obj);
        Object obj2 = pair.second;
        0qQ.A06(obj2);
        TreeSet treeSet = new TreeSet();
        treeSet.add(obj2);
        map.put(obj, treeSet);
    }

    public static void A13(View view) {
        if (view != null) {
            view.setAlpha(1.0f);
        }
    }

    public static void A17(1WE r0, String str, int i) {
        if (str == null) {
            r0.ADb(i);
        } else {
            r0.ADh(i, str);
        }
    }

    public static void A18(0Aj r2) {
        r2.AAJ("device_aspect_ratio_category", C254473sX.A00);
        r2.AAJ("device_fold_orientation", C254483sY.A00);
        r2.AAJ("device_fold_state", C254493sZ.A00);
        r2.A7p("device_is_in_multi_window_mode", C254503sa.A00);
        r2.Cgf();
    }

    public static void A1A(0Aj r1, Map map) {
        r1.A9H("extra_data", map);
        r1.Cgf();
    }

    public static void A1B(0Ak r1, String str, String str2) {
        r1.A0R("reason", str);
        r1.A0R("reason_info", str2);
    }

    public static void A1E(1Ln r2, AnonymousClass283 r3) {
        r2.A0c(r3.A0A);
        r2.A0R("composition_str_id", r3.A0M);
        r2.A0M(r3.A0A, "composition_media_type");
        r2.A0u(AnonymousClass1QI.A00.A02.A00);
    }

    public static void A1L(AnonymousClass8RF r1, boolean z) {
        r1.A0G(new AnonymousClass8RU(z));
    }

    public static void A1M(FilterGroupModel filterGroupModel) {
        filterGroupModel.EWl(19, true);
    }

    public static void A1O(OIS ois, 2MD r2) {
        r2.A09(new OU0(ois));
    }

    public static void A1P(1iA r1, AnonymousClass3Q2 r2, 1ua r3, PendingMediaStore pendingMediaStore) {
        Set singleton = Collections.singleton(r2.A35);
        0qQ.A07(singleton);
        pendingMediaStore.A0C(r1, singleton);
        pendingMediaStore.A0D(r2, r2.A35);
        r3.A05.A04();
    }

    public static void A1Q(C14199Tre tre, Object obj) {
        tre.A05(AnonymousClass05K.A0C, obj, new Object());
    }

    public static void A1S(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new Integer(i));
    }

    public static boolean A1b(Object obj, Object obj2) {
        return 0qQ.A0K(((C65211bM) obj).getPk(), obj2);
    }

    public static int A02(Context context) {
        Integer A0J = 2Yu.A0J(context, R.attr.stackedTimelineCommonTrackHeight);
        if (A0J != null) {
            return A0J.intValue();
        }
        return context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
    }

    public static int A03(Bitmap bitmap) {
        return bitmap.getWidth() * bitmap.getHeight();
    }

    public static int A04(Parcel parcel, Parcelable.Creator creator, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(creator.createFromParcel(parcel));
        return i + 1;
    }

    public static int A05(View view, int i) {
        return view.getResources().getDimensionPixelSize(i);
    }

    public static int A06(Fragment fragment) {
        return 0nA.A09(fragment.requireContext());
    }

    public static int A09(AnonymousClass0eM r0) {
        return ((Drawable) r0.getValue()).getIntrinsicHeight();
    }

    public static long A0A(AnonymousClass0Ud r1) {
        return ((Number) r1.getValue()).longValue();
    }

    public static View A0E(View view, int i) {
        return C240903Nb.A00(view, i).A00();
    }

    public static View A0F(AppCompatActivity appCompatActivity, String str, int i) {
        View findViewById = appCompatActivity.findViewById(i);
        0qQ.A0C(findViewById, str);
        return findViewById;
    }

    public static BrandedContentDisclosureBaseViewModel A0H(AnonymousClass0eM r0) {
        return (BrandedContentDisclosureBaseViewModel) r0.getValue();
    }

    public static 1Ng A0I(C61942KSr kSr) {
        return AnonymousClass1Nd.A00(kSr.A0G());
    }

    public static AnonymousClass2tC A0K(Context context, AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass2tC A00 = AnonymousClass2t9.A00(context);
        A00.A01(new C15780UiP(context, userSession));
        A00.A01(new C15779UiO(context, userSession));
        A00.A01(new C15781UiQ(context, r3));
        A00.A01(new H7C(context, r3));
        return A00;
    }

    public static 27r A0M(FollowersShareFragment followersShareFragment) {
        return 27p.A01(followersShareFragment.A0R());
    }

    public static AnonymousClass283 A0N(1Ln r2, 29R r3, String str) {
        r2.A0r(str);
        29R.A00(r2, r3);
        r2.A0a(r3.A0J());
        AnonymousClass283 r1 = r3.A04;
        r2.A0b(r1.A09);
        r2.A0T();
        return r1;
    }

    public static C60259JiG A0P(AnonymousClass0eM r0) {
        return (C60259JiG) r0.getValue();
    }

    public static AnonymousClass5w8 A0R(AnonymousClass0eM r0) {
        return AnonymousClass5w9.A00((UserSession) r0.getValue());
    }

    public static C295095nZ A0S(UserSession userSession) {
        return AnonymousClass5w9.A00(userSession).A04();
    }

    public static C60206JhP A0V(AnonymousClass0eM r0) {
        return (C60206JhP) r0.getValue();
    }

    public static C64088LMg A0W(AnonymousClass0eM r0) {
        return ((C60266JiN) r0.getValue()).A01;
    }

    public static KTX A0X(C61942KSr kSr) {
        return C61942KSr.A01(kSr).A02();
    }

    public static C65414Lsu A0Y(C61942KSr kSr) {
        return C61942KSr.A01(kSr).A0M;
    }

    public static C60327JjW A0a(AnonymousClass0eM r0) {
        return (C60327JjW) r0.getValue();
    }

    public static MusicBrowseCategory A0b(AnonymousClass0eM r1) {
        C60330JjZ jjZ = (C60330JjZ) r1.getValue();
        return C60330JjZ.A00((C62550Khg) jjZ.A0B.getValue(), jjZ).A00();
    }

    public static AnonymousClass3Q2 A0e(C61347K3p k3p) {
        return k3p.A0B(k3p.A0A());
    }

    public static AnonymousClass3Q2 A0f(K6A k6a) {
        return k6a.A06(k6a.requireContext());
    }

    public static PromptStickerModel A0g(AnonymousClass0eM r0) {
        return (PromptStickerModel) r0.getValue();
    }

    public static C239793Ih A0j(boolean z) {
        return new C239793Ih(Boolean.valueOf(z));
    }

    public static Long A0l(0Aj r0, Long l, String str, int i) {
        r0.A9F(str, l);
        return Long.valueOf((long) i);
    }

    public static Object A0m(List list, int i) {
        return list.get(i % list.size());
    }

    public static String A0n(MediaSuggestedProductTag mediaSuggestedProductTag) {
        return mediaSuggestedProductTag.A07().A0H;
    }

    public static String A0o(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        String obj2 = sb.toString();
        if (obj == null) {
            return obj2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj2);
        sb2.append("|   mediatorLoadStates: ");
        sb2.append(obj);
        sb2.append(10);
        return sb2.toString();
    }

    public static String A0p(AnonymousClass0eM r0) {
        String str = 27p.A01((UserSession) r0.getValue()).A04.A0L;
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public static ArrayList A0q(0Ak r2, AbstractMap abstractMap) {
        r2.A0Q("current_guest_count", Long.valueOf((long) abstractMap.size()));
        return new ArrayList(abstractMap.size());
    }

    public static List A0s(C232222tE r0, C232222tE r1) {
        return 0sr.A1P(new C232222tE[]{r0, r1});
    }

    public static void A14(View view, View view2, View view3, int i) {
        view.setVisibility(i);
        view2.setVisibility(i);
        view3.setVisibility(i);
    }

    public static void A15(View view, Fragment fragment) {
        int color = fragment.requireContext().getColor(2Yu.A0C(fragment.requireContext()));
        view.setBackgroundColor(color);
        2db.A02(fragment.requireActivity(), color);
        AnonymousClass2uJ.A04(fragment.requireActivity(), color);
    }

    public static void A16(Fragment fragment) {
        0nA.A0J(fragment.requireActivity());
    }

    public static void A19(0Aj r3, C270194gL r4) {
        r3.A9F("parent_a_pk", 00y.A0n(10, r4.A03().getId()));
        String str = r4.A0X;
        str.getClass();
        r3.A9F("parent_b_pk", 00y.A0n(10, str));
        String str2 = r4.A0e;
        str2.getClass();
        r3.AAJ("parent_m_pk", str2);
    }

    public static void A1C(0bb r2, long j) {
        r2.A05("impression_count", Long.valueOf(j));
    }

    public static void A1D(1Ln r2, C279294yP r3, 27x r4) {
        r2.A0a(r3);
        AnonymousClass283 r1 = r4.A04;
        r2.A0b(r1.A09);
        r2.A0T();
        r2.A0U();
        r2.A0n(27x.A08.getModuleName());
        r2.A0c(r1.A0A);
        r2.A0u(AnonymousClass1QI.A00.A02.A00);
    }

    public static void A1F(1Ln r1, C313756gx r2, Long l) {
        r1.A0i(l);
        r1.A0v(r2.A01);
    }

    public static void A1G(1Ln r0, Long l, String str) {
        r0.A0j(l);
        r0.A0v(str);
        r0.Cgf();
    }

    public static void A1H(1Ln r0, String str, String str2) {
        r0.A0l(str);
        r0.A0v(str2);
        r0.Cgf();
    }

    public static void A1I(1Ln r0, String str, Map map) {
        r0.A0x(map);
        r0.A0v(str);
        r0.Cgf();
    }

    public static void A1R(C66966Mfz mfz, int i) {
        mfz.A04 = Integer.valueOf(i);
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(Long.parseLong((String) ((Map.Entry) it.next()).getKey())));
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(it.next());
    }

    public static void A1W(AbstractList abstractList, int i) {
        if (i < abstractList.size()) {
            KMU kmu = (KMU) abstractList.get(i);
            kmu.A07.post(new C65881M2w(kmu));
            abstractList.remove(i);
        }
    }

    public static void A1X(05G r0, 05G r1) {
        r1.Epw(r0.getValue());
    }

    public static boolean A1Y(Context context, 1Fa r5, UserSession userSession, String str, String str2) {
        r5.A9m(str, str2);
        r5.A9m("waterfall_id", 1Q0.A01());
        r5.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06);
        r5.A9m(C21058XCk.A01(0, 9, 50), 0qv.A00(context));
        0qv r0 = 0qv.A02;
        0qQ.A0A(context);
        r5.A9m("guid", r0.A05(context));
        return false;
    }

    public static boolean A1Z(Context context, Object obj, int i) {
        return 0qQ.A0K(obj, context.getString(i));
    }

    public static boolean A1a(C61942KSr kSr) {
        return C61942KSr.A01(kSr).A06();
    }
}

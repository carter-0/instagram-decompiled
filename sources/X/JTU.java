package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.freetransform.widget.ClipTransformItemView;
import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.igtv.widget.TitleDescriptionEditor;
import com.instagram.leadgen.core.api.LeadFormIntf;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;

public abstract class JTU {
    public static int A03(C252553pI r2, C228432lf r3, int i) {
        0qQ.A0B(r2, 0);
        View A03 = r3.A03(r2);
        if (A03 == null) {
            return -1;
        }
        int A06 = C252553pI.A06(A03);
        if (i < 0) {
            return Math.max(0, A06 - 1);
        }
        return Math.min(A06 + 1, r2.A0U() - 1);
    }

    public static Context A06(View view) {
        0qQ.A0B(view, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = view.getContext();
        0qQ.A07(context);
        return context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ULF, java.lang.Object] */
    public static ULF A0E(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ? obj = new Object();
        obj.A00 = z ? 1 : 0;
        obj.A03 = null;
        obj.A02 = null;
        obj.A05 = list;
        obj.A04 = arrayList;
        obj.A01 = 5;
        obj.A06 = z;
        return obj;
    }

    public static 1OC A0G(1NY r4) {
        r4.A0O((15p) null, 1XP.class, 1XY.class, true);
        r4.A0R = true;
        return r4.A0M();
    }

    public static 1OC A0H(1NY r3, String str, String str2, boolean z) {
        r3.A9m(str, str2);
        r3.A0O((15p) null, 1XP.class, 1XY.class, z);
        return r3.A0M();
    }

    public static AnonymousClass6W8 A0O(Fragment fragment, 0lg r5, C56044Hrt hrt) {
        Bundle A00 = hrt.A00();
        A00.putBoolean("modal_dismiss_on_cancel", true);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(fragment.requireActivity(), A00, r5, TransparentModalActivity.class, "clips_camera");
        A02.A07();
        return A02;
    }

    public static C297815sO A0S(String str) {
        return new C297815sO(new QP5((String) null, (String) null, str, (String) null, 6));
    }

    public static Integer A0V(Enum enumR) {
        if (enumR.ordinal() != 1) {
            return null;
        }
        return 7;
    }

    public static List A0b(List list, List list2) {
        List A0W = 00k.A0W(0Yv.A1F(0sr.A1P(new List[]{list, list2})));
        0qQ.A0B(A0W, 0);
        return A0W;
    }

    public static 0eQ A0c(Throwable th) {
        0qQ.A0B(th, 0);
        return new 0eQ(th);
    }

    public static void A0l(BaseBundle baseBundle, Object obj, Map map) {
        if (map.containsKey(obj)) {
            baseBundle.putBoolean(obj.toString(), true);
        }
    }

    public static void A0r(C249703kE r2) {
        ImageView imageView;
        0qQ.A0B(r2, 0);
        View view = r2.itemView;
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public static void A12(0Aj r3, boolean z) {
        r3.A7p("is_organic_product_tagging", Boolean.valueOf(z));
        r3.AAJ("prior_submodule", (String) null);
        r3.Cgf();
    }

    public static void A1D(TitleDescriptionEditor titleDescriptionEditor) {
        titleDescriptionEditor.A0L = false;
        titleDescriptionEditor.A0N = true;
        titleDescriptionEditor.A0M = true;
        titleDescriptionEditor.A0I = null;
        titleDescriptionEditor.A09 = null;
        View.inflate(titleDescriptionEditor.getContext(), R.layout.title_description_layout, titleDescriptionEditor);
    }

    public static void A1F(AnonymousClass4O6 r7, Long l, String str, String str2, List list) {
        r7.A00(new AnonymousClass9JF(AnonymousClass4O9.CAMERA, AnonymousClass4OA.UNSPECIFIED), l, str, str2, (String) null, list);
    }

    public static void A1H(User user, Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new WSZ(user, num, (String) null, false, false));
    }

    public static boolean A1Q(Parcel parcel) {
        if (parcel.readInt() != 1) {
            return false;
        }
        return true;
    }

    public static boolean A1R(0bb r3, UserSession userSession) {
        r3.A03("is_business_user_access_token_enabled", true);
        return C16905VAi.A00(userSession).A00 != null;
    }

    public static boolean A1T(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eu4(true);
        return false;
    }

    public static float A00(ClipsReviewProgressBar clipsReviewProgressBar, int i) {
        int i2 = clipsReviewProgressBar.A00;
        return ((float) clipsReviewProgressBar.getWidth()) * 0mi.A00(((float) i) / ((float) i2), 0.0f, 1.0f);
    }

    public static long A05(Number number) {
        if (number != null) {
            return (long) number.intValue();
        }
        return 0;
    }

    public static Bundle A07(Parcelable parcelable, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_audio_track", parcelable);
        bundle.putString("args_media_id", str);
        bundle.putBoolean("args_has_existing_snippet_selection", z);
        return bundle;
    }

    public static AnonymousClass2YQ A08(Object obj) {
        return ((Fragment) obj).requireActivity().getDefaultViewModelCreationExtras();
    }

    public static 0Aj A09(0lg r2) {
        0wc A01 = AnonymousClass0kN.A01(new 0xG("igd_security_alert"), r2);
        return A01.A00(A01.A00, "igd_security_alerts");
    }

    public static 0Df A0A(Object obj) {
        AnonymousClass0K0 r1 = GraphQlCallInput.A02;
        String obj2 = UUID.randomUUID().toString();
        0Df A02 = r1.A02();
        0Df.A00(A02, obj2, "client_mutation_id");
        0Df.A00(A02, obj, "unpublished_content_id");
        return A02;
    }

    public static 0f9 A0B() {
        0KC.A0D("BugReportComposerFragment", "Ignoring click because we are processing an action");
        return 0wj.A01.AEf("BugReportComposerFragment", 817892340);
    }

    public static C60308Jj7 A0C(Object obj) {
        return (C60308Jj7) ((K65) obj).A0A.getValue();
    }

    public static C3499682q A0L(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
        return ((C267844cJ) obj).Ajn().A00();
    }

    public static C358248ab A0N(Context context, int i, int i2) {
        C358248ab r0 = new C358248ab(context);
        r0.A09(i);
        r0.A08(i2);
        return r0;
    }

    public static IgEditSeekBar A0P(Context context, LinearLayout linearLayout) {
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(2Yu.A0C(context));
        IgEditSeekBar igEditSeekBar = new IgEditSeekBar(context);
        igEditSeekBar.A01 = 0.0f;
        igEditSeekBar.A02 = 100;
        return igEditSeekBar;
    }

    public static C297815sO A0R(Object obj) {
        return new C297815sO(((C297815sO) obj).A00.toString());
    }

    public static Exception A0T(Object obj) {
        if (obj instanceof C297815sO) {
            return new AnonymousClass3g0("IGTVSeriesRepository network request failed");
        }
        return new RuntimeException();
    }

    public static LinkedHashMap A0Z(Object obj, 0eP r3, 0eP r4, 0eP r5, 0eP r6) {
        return 0Yt.A06(new 0eP[]{r3, r4, r5, r6, new 0eP("utm_content", obj)});
    }

    public static List A0a(AnonymousClass51M r3) {
        AnonymousClass51R r32 = r3.A0F;
        return 0sr.A1P(new Long[]{Long.valueOf((long) r32.A05), Long.valueOf((long) r32.A09)});
    }

    public static void A0e(Activity activity, Bundle bundle, 0lg r9) {
        AnonymousClass6W8 r1 = new AnonymousClass6W8(activity, bundle, r9, TransparentBackgroundModalActivity.class, "bottom_sheet");
        r1.A09(0);
        r1.A0C(activity.getApplicationContext());
    }

    public static void A0i(Matrix matrix, ClipTransformItemView clipTransformItemView, float f, float f2) {
        float f3 = clipTransformItemView.A01;
        matrix.postScale(f3, f3, f, f2);
        matrix.postRotate(clipTransformItemView.A00, f, f2);
        matrix.postTranslate(clipTransformItemView.A02 * clipTransformItemView.A04.width(), clipTransformItemView.A03 * clipTransformItemView.A04.height());
    }

    public static void A0k(BaseBundle baseBundle, K7Y k7y) {
        k7y.A07 = baseBundle.getString("args_media_id", "");
        k7y.A08 = baseBundle.getString("args_waterfall_id", "");
    }

    public static void A0n(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        if (obj == obj2 && viewGroup.getChildCount() == 1) {
            viewGroup.getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), i);
        }
    }

    public static void A0q(Fragment fragment, 0hq r2) {
        0s1 r0 = new 0s1(r2);
        r0.A03(fragment);
        r0.A00();
    }

    public static void A0s(1WE r2, Number number, int i) {
        if (number == null) {
            r2.ADb(i);
        } else {
            r2.ADa(i, number.longValue());
        }
    }

    public static void A0t(AnonymousClass0Ac r1, 0Aj r2, 0bb r3) {
        r2.A8M(r1, "platform");
        r2.A9F("actual_event_time", Long.valueOf(System.currentTimeMillis()));
        r2.AAK(r3, "event_payload");
    }

    public static void A0u(AnonymousClass0Ac r1, 1Ln r2) {
        r2.A0M(r1, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r2.A0T();
        r2.A0M(C59793JYm.OTHER, "media_source");
    }

    public static void A0v(AnonymousClass0Ah r1, 0Aj r2, String str, String str2) {
        r2.AAJ("interaction_type", str);
        r2.AAJ("commerce_integrity_review_decision", str2);
        r2.AAE(r1, "merchant_id");
        r2.Cgf();
    }

    public static void A0x(0Aj r2, AnonymousClass283 r3) {
        r2.AAJ("discovery_session_id", r3.A0O);
        r2.AAJ("search_session_id", r3.A0P);
    }

    public static void A0z(0Aj r2, String str, String str2) {
        r2.A9F("private_list_id", 00y.A0n(10, str));
        r2.AAJ("private_list_name", str2);
        r2.Cgf();
    }

    public static void A13(0Ak r2, String str) {
        r2.A0R("camera_session_id", str);
        0sn r1 = 0sn.A00;
        r2.A0S("camera_tools", r1);
        r2.A0S("camera_tools_struct", r1);
    }

    public static void A14(1Ln r2, int i) {
        r2.A0c(28t.A06);
        r2.A0n(27x.A09.getModuleName());
        r2.A0Q("segment_index", Long.valueOf((long) i));
        r2.A0U();
    }

    public static void A15(1Ln r2, AnonymousClass283 r3) {
        r2.A0n("giphy_clips_grid");
        r2.A0c(28t.A06);
        r2.A0R("third_party_session_id", r3.A0Q);
    }

    public static void A17(1Ln r1, Object obj, Object obj2) {
        r1.A0x(0se.A0M(new 0eP(obj, obj2)));
        r1.Cgf();
    }

    public static void A1B(C15092UOk uOk, AbstractCollection abstractCollection) {
        float f = uOk.A01;
        abstractCollection.add(new C53368Gms((int) (((float) uOk.A04) / f), (int) (((float) uOk.A02) / f), 11));
    }

    public static boolean A1S(N4R n4r, Object obj, List list, 05G r3) {
        return r3.AIY(obj, N4R.A01((List) n4r.A00, list));
    }

    public static boolean A1U(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36325235662992134L);
    }

    public static boolean A1V(0lg r3) {
        return 182.A06(0Tu.A05, r3, 36316126037217265L);
    }

    public static boolean A1W(AnonymousClass8N5 r10, Integer num, Object obj, 05G r13) {
        Bitmap bitmap = r10.A02;
        Bitmap bitmap2 = r10.A00;
        float[] fArr = r10.A08;
        return r13.AIY(obj, new AnonymousClass8N5(bitmap, bitmap2, r10.A01, r10.A03, r10.A04, num, fArr, r10.A07, r10.A06));
    }

    public static boolean A1Y(TagsInteractiveLayout tagsInteractiveLayout) {
        tagsInteractiveLayout.A0A = new ArrayList();
        tagsInteractiveLayout.A0B = new ArrayList();
        tagsInteractiveLayout.A09 = new ArrayList();
        tagsInteractiveLayout.A0C = new ArrayList();
        tagsInteractiveLayout.A0H = false;
        tagsInteractiveLayout.A0G = false;
        return false;
    }

    public static boolean A1Z(Object obj, Object obj2, Object obj3, Map map, 05G r5) {
        0Ym r0 = new 0Ym();
        r0.putAll(map);
        r0.put(obj, obj2);
        return r5.AIY(obj3, 0se.A0N(r0));
    }

    public static Float[] A1b(RectF rectF, Float f) {
        return new Float[]{f, Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom)};
    }

    public static int A01(Context context) {
        Resources resources = context.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        }
        return 0;
    }

    public static int A02(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i2 = dimensionPixelSize % i;
        if (i2 != 0) {
            return dimensionPixelSize + (i - i2);
        }
        return dimensionPixelSize;
    }

    public static long A04() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - ((((long) TimeZone.getDefault().getOffset(currentTimeMillis)) + currentTimeMillis) % 86400000);
    }

    public static WGU A0D(AnonymousClass0eM r0) {
        return WGU.A00((UserSession) r0.getValue());
    }

    public static 0xI A0F(ShareLaterFragment shareLaterFragment, String str) {
        0xI A00 = 0xI.A00(shareLaterFragment, str);
        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
        0qQ.A0A(shareLaterMedia);
        A00.A09("facebook_enabled", Boolean.valueOf(shareLaterMedia.A07));
        return A00;
    }

    public static C228602lw A0I(Context context, AnonymousClass07Z r4) {
        return new C228602lw(context, AnonymousClass07i.A00(r4), (Integer) null);
    }

    public static UserSession A0J(AnonymousClass0eM r1) {
        UserSession userSession = (UserSession) r1.getValue();
        0qQ.A0B(userSession, 1);
        return userSession;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.6Ly, X.8vV] */
    public static C369898vV A0K(Context context, C317486nL r4) {
        0qQ.A0A(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        ? r1 = new C306386Ly(context, AnonymousClass8XF.A01(context));
        r1.A0M(r4.A02);
        r1.A0A((float) dimensionPixelSize);
        r1.A09();
        return r1;
    }

    public static AnonymousClass8IG A0M(Fragment fragment, AnonymousClass0eM r2) {
        return new AnonymousClass8IG((UserSession) r2.getValue(), fragment.requireActivity());
    }

    public static Product A0Q(Iterator it) {
        return ((MediaSuggestedProductTag) it.next()).A07();
    }

    public static Integer A0U(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return Integer.valueOf(parcel.readInt());
    }

    public static Long A0W(1Ln r0, String str, String str2) {
        r0.A0l(str);
        if (str2 != null) {
            return 00y.A0n(10, str2);
        }
        return null;
    }

    public static String A0X(C3499682q r0, int i) {
        return ((MediaSession) r0.Co4().get(i)).BbR();
    }

    public static String A0Y(Iterator it) {
        return ((Tag) it.next()).getId();
    }

    public static 05G A0d(AnonymousClass0eM r0) {
        return C54436HDl.A00((C54436HDl) r0.getValue()).A02;
    }

    public static void A0f(Context context, Drawable.Callback callback, C306386Ly r3, int i, int i2) {
        r3.A0M(context.getString(i));
        r3.A0G(i2, context.getString(2131961564));
        r3.setCallback(callback);
    }

    public static void A0g(Context context, AnonymousClass3Q2 r3, 1ua r4) {
        r4.A05(AnonymousClass6WL.A02(context), r3);
        1Cn r1 = new 1Cn(context);
        if (!r1.A07(false) && r1.A05()) {
            C59689JTv.A07(context, 2131969286);
        }
    }

    public static void A0h(Context context, C306386Ly r3) {
        AJB.A08(context, r3, (float) context.getResources().getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size), 0.0f, 0.0f);
    }

    public static void A0j(Drawable drawable) {
        drawable.setBounds(drawable.getBounds().left, drawable.getBounds().top, drawable.getBounds().right, drawable.getBounds().bottom);
        drawable.invalidateSelf();
    }

    public static void A0m(View view, int i, boolean z) {
        View[] viewArr = {view};
        if (i != 0) {
            C294975nL.A04((C295005nO) null, viewArr, z);
        } else {
            C294975nL.A05(viewArr, z);
        }
    }

    public static void A0o(Fragment fragment) {
        if (fragment.getContext() != null) {
            ((Activity) fragment.getContext()).onBackPressed();
        }
    }

    public static void A0p(Fragment fragment, int i) {
        AnonymousClass2ZP r1;
        Activity A00 = C61190ls.A00(fragment.requireActivity());
        if ((A00 instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) A00) != null) {
            r1.Enj(i);
        }
    }

    public static void A0w(0Aj r2, long j, long j2) {
        r2.A9F("medium_confidence_suggestions_count", Long.valueOf(j));
        r2.A9F("low_confidence_suggestions_count", Long.valueOf(j2));
    }

    public static void A0y(0Aj r2, String str) {
        r2.AAJ(Dbg.A00(), str);
        r2.A8M(2M7.A09, "product_type");
        r2.A8M(C2818559v.ANDROID, "platform");
        r2.A9F("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A10(0Aj r2, String str, String str2, long j) {
        r2.A9F("question_id", Long.valueOf(j));
        r2.AAJ("question_source", str);
        r2.AAJ("question_text", str2);
    }

    public static void A11(0Aj r2, String str, String str2, String str3, String str4) {
        r2.AAJ(str, str2);
        r2.AAJ(Dbe.A00(), str3);
        r2.A9F("ig_user_id", 00y.A0n(10, str4));
    }

    public static void A16(1Ln r1, 29R r2, String str) {
        r1.A0r(str);
        29R.A00(r1, r2);
        r1.A0a(C279294yP.CLIPS);
    }

    public static void A19(UZ3 uz3) {
        uz3.A09().A04();
        uz3.A08().A00();
    }

    public static void A1A(UserSession userSession, Integer num) {
        27p.A01(userSession).A03.A07(C394299xr.A00(num));
    }

    public static void A1C(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        K9I k9i = directPrivateStoryRecipientController.A0H;
        if (k9i != null) {
            k9i.A06();
        }
    }

    public static void A1E(0xa r0, String str, Set set) {
        0xY AR4 = r0.AR4();
        AR4.E5h(str, set);
        AR4.apply();
    }

    public static void A1G(C232822uV r3, SlideInAndOutIconView slideInAndOutIconView, int i) {
        slideInAndOutIconView.setIconColor(i);
        slideInAndOutIconView.setIconScale(0.5f);
        slideInAndOutIconView.A03 = C242233Td.END;
        slideInAndOutIconView.A02 = C232812uU.SLIDE_OUT;
        AnonymousClass4UR r2 = new AnonymousClass4UR();
        r2.A07.add(new WeakReference(slideInAndOutIconView));
        r2.A02(r3);
    }

    public static void A1I(OutputStream outputStream, ByteBuffer byteBuffer) {
        outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static void A1J(Object obj, 1IX r2) {
        if (r2.isActive()) {
            r2.resumeWith(obj);
        }
    }

    public static void A1K(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((BBU) it.next()).A04);
    }

    public static void A1L(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((LeadFormIntf) it.next()).FEQ());
    }

    public static void A1M(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((PeopleTag) it.next()).A07().getId());
    }

    public static void A1N(AbstractCollection abstractCollection, Iterator it) {
        N49 n49 = (N49) it.next();
        2IV r2 = new 2IV();
        r2.A09(n49.A00, "prompt");
        r2.A09(n49.A01, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        abstractCollection.add(r2);
    }

    public static void A1O(Iterator it) {
        ((C262204Co) it.next()).AG7((CancellationException) null);
    }

    public static void A1P(05G r1) {
        r1.Epw(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
    }

    public static boolean A1X(FollowersShareFragment followersShareFragment) {
        return AnonymousClass5w9.A00(followersShareFragment.A0R()).A0C(followersShareFragment.A0R());
    }

    public static boolean A1a(AnonymousClass0eM r3) {
        UserSession userSession = (UserSession) r3.getValue();
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36318221980342273L);
    }

    public static void A18(2cs r4, C252203oj r5) {
        r4.A09(C71392co.A04(33.0d, 8.0d));
        r4.A00 = 0.001d;
        r4.A02 = 0.001d;
        r4.A08(0.0d, true);
        r4.A0A(r5);
    }
}

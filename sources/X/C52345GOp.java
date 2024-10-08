package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GOp  reason: case insensitive filesystem */
public final class C52345GOp {
    public static final C52345GOp A00 = new Object();

    public static final SpannableString A00(Context context, 1Xj r10) {
        C267284bJ BZ6;
        C67161s9 A1N = r10.A1N();
        if (A1N == null || (BZ6 = A1N.BZ6()) == null) {
            return null;
        }
        String username = BZ6.CCd().getUsername();
        Resources resources = context.getResources();
        SpannableStringBuilder A0E = C51965G9l.A0E();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 2131955698;
        if (A1N.BP2() == ClipsMashupType.A0A) {
            i = 2131955728;
        }
        A0E.append(resources.getString(i));
        GNT.A00(A0E, username, "{username}", arrayDeque, new Object[]{new StyleSpan(1)}, 0);
        return new SpannableString(A0E);
    }

    public static final C3498982i A01(UserSession userSession, AnonymousClass8JI r9, String str) {
        1Xj A0U;
        User A2A;
        String A2U;
        long j;
        Long A10;
        0qQ.A0B(userSession, 0);
        if (!(str == null || (A0U = DbV.A0U(userSession, str)) == null || (A2A = A0U.A2A(userSession)) == null)) {
            if (A0U.A5p()) {
                ExtendedImageUrl A1m = A0U.A1m(A0U.A0y());
                if (A1m != null) {
                    A2U = A1m.A0A;
                }
            } else {
                A2U = A0U.A2U();
            }
            if (A2U != null) {
                if (A0U.A1B() <= 0 && A0U.CeS()) {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(A2U);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        if (extractMetadata == null || (A10 = AnonymousClass7TE.A10(extractMetadata)) == null) {
                            j = 0;
                        } else {
                            j = A10.longValue();
                        }
                    } catch (Exception e) {
                        String id = A0U.getId();
                        if (id != null) {
                            0wb.A03("ClipsRemixUtil _media_metadata_retriever_error.", 002.A0u("for media id: ", id, ", exc: ", e.getMessage()));
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    return new C3498982i(new A5F(A2U, j), r9, A0U, A2A);
                }
                j = A0U.A1B();
                return new C3498982i(new A5F(A2U, j), r9, A0U, A2A);
            }
        }
        return null;
    }

    public static final void A02(Activity activity, 28D r83, UserSession userSession, ImageUrl imageUrl, AnonymousClass8JI r86, 1Xj r87, 1Xj r88, DirectCameraViewModel directCameraViewModel, MusicAttributionConfig musicAttributionConfig, Boolean bool, String str, String str2, String str3, boolean z) {
        String str4;
        Class cls;
        MusicAssetModel musicAssetModel;
        MusicAttributionConfig musicAttributionConfig2 = musicAttributionConfig;
        if (musicAttributionConfig == null || (musicAssetModel = musicAttributionConfig2.A02) == null) {
            str4 = null;
        } else {
            str4 = musicAssetModel.A0E;
        }
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        String id = r87.getId();
        if (id != null) {
            String A06 = 1Xv.A06(id);
            28D r7 = r83;
            0qQ.A0B(r7, 1);
            DirectCameraViewModel directCameraViewModel2 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool2 = null;
            ImageUrl imageUrl2 = null;
            String str8 = null;
            String str9 = null;
            boolean z2 = false;
            AnonymousClass8JL r12 = AnonymousClass8JL.NONE;
            C2801950r r18 = C2801950r.CLIPS;
            Set A0N = C51976G9y.A0N(r7);
            String id2 = r87.getId();
            if (id2 != null) {
                String A0x = DbT.A0x(r87);
                if (directCameraViewModel != null) {
                    directCameraViewModel2 = directCameraViewModel;
                }
                if (r88 != null) {
                    str8 = r88.A2n();
                    str9 = DbT.A0x(r88);
                }
                if (str4 != null) {
                    z2 = true;
                }
                UserSession userSession2 = userSession;
                if (str != null && !182.A06(0Tu.A05, userSession2, 36328276498594998L)) {
                    str6 = str;
                    str7 = str2;
                    str5 = str3;
                    bool2 = bool;
                    imageUrl2 = imageUrl;
                    r12 = AnonymousClass8JL.EFFECT;
                }
                if (z) {
                    cls = TransparentModalActivity.class;
                } else {
                    cls = ModalActivity.class;
                }
                Activity activity2 = activity;
                AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity2, AEX.A00(r7, (293) null, (AnonymousClass8ZN) null, (ClipsCameraCommandAction) null, (AnonymousClass84B) null, r12, (C279584ys) null, imageUrl2, (C279284yO) null, (SharePlatformStickerClientModel) null, (ReelsVisualRepliesModel) null, r18, r86, directCameraViewModel2, musicAttributionConfig2, (AudioOverlayTrack) null, (InstagramAudioApplySource) null, (PendingRecipient) null, (PromptStickerModel) null, (QuestionResponseReshareModel) null, bool2, (Integer) null, (String) null, (String) null, str6, str5, str7, (String) null, (String) null, (String) null, str4, (String) null, (String) null, A06, A0x, id2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str8, str9, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, A0N, false, true, false, false, false, false, false, z2, false, false, false, true, false, false, false, false, true), userSession2, cls, "clips_camera");
                A02.A0D = C51965G9l.A1a(0Tu.A05, userSession2, 36330144809435620L);
                Dbc.A0y(A02);
                A02.A0A(activity2, 9587);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A04(Fragment fragment, FragmentActivity fragmentActivity, 28D r20, ClipsMashupType clipsMashupType, AnonymousClass0iw r22, UserSession userSession, ImageUrl imageUrl, 1Xj r25, 1Xj r26, C52345GOp gOp, Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        AnonymousClass8JI r16;
        1Xj r17 = r25;
        String str5 = str4;
        28D r13 = r20;
        String str6 = str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str7 = str3;
        UserSession userSession2 = userSession;
        ImageUrl imageUrl2 = imageUrl;
        Boolean bool2 = bool;
        if (!r17.A5U()) {
            ClipsMashupType clipsMashupType2 = clipsMashupType;
            if (r13 != 28D.A1Y && r13 != 28D.A1Z && clipsMashupType == null) {
                C331127Pr A0W = DbS.A0W(userSession2);
                String str8 = userSession2.A05;
                String moduleName = r22.getModuleName();
                String id = r17.getId();
                if (id != null) {
                    int A0A = AnonymousClass7TG.A0A(num);
                    Dba.A0j(1, str8, moduleName);
                    H04 h04 = new H04();
                    Bundle A0C = DbX.A0C(str8);
                    A0C.putString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_CONTAINER_MODULE_NAME", moduleName);
                    A0C.putString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_ID", id);
                    A0C.putInt("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_INDEX", A0A);
                    A0C.putString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_SOURCE_MEDIA_ID", str);
                    A0C.putSerializable("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_ENTRY_POINT", r13);
                    A0C.putString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ID", str6);
                    A0C.putString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_NAME", str7);
                    A0C.putString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ATTRIBUTION_USER_ID", str5);
                    if (bool != null) {
                        A0C.putBoolean("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_SUPPORTED", bool2.booleanValue());
                    }
                    A0C.putParcelable("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_THUMBNAIL_URL", imageUrl2);
                    A0C.putBoolean("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_USE_TRANSPARENT_MODAL_ACTIVITY", true);
                    h04.setArguments(A0C);
                    DbU.A0y(fragmentActivity2, h04, A0W);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            } else if (clipsMashupType2 == ClipsMashupType.A0A) {
                r16 = AnonymousClass8JI.SEQUENTIAL_REMIX;
                gOp.A0F(fragmentActivity2, fragment, r13, userSession2, imageUrl2, r16, r17, r26, bool2, str6, str7, str5, true);
            }
        }
        r16 = AnonymousClass8JI.REMIX;
        gOp.A0F(fragmentActivity2, fragment, r13, userSession2, imageUrl2, r16, r17, r26, bool2, str6, str7, str5, true);
    }

    public static final void A05(Fragment fragment, UserSession userSession, 1Xj r14, AnonymousClass4DU r15, String str, String str2) {
        C267284bJ BZ6;
        String moduleName;
        String str3;
        String str4 = str;
        if (str == null) {
            moduleName = r15.getModuleName();
            str3 = "session id is null";
        } else {
            C67161s9 A1N = r14.A1N();
            if (A1N != null && (BZ6 = A1N.BZ6()) != null) {
                if (HWO.A00(BZ6)) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("shopping_session_id", str2);
                    C309516Yo A0H = DbW.A0H(fragment, userSession);
                    String moduleName2 = r15.getModuleName();
                    0qQ.A0B(moduleName2, 0);
                    String A002 = AnonymousClass000.A00(2170);
                    String string = fragment.getString(2131969693);
                    String A2n = r14.A2n();
                    String moduleName3 = r15.getModuleName();
                    ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                    contextualFeedFragment.setArguments(C46424Del.A04(A0a, A002, string, A2n, moduleName2, moduleName3, str4, (ArrayList) null));
                    Dba.A0w((Bundle) null, contextualFeedFragment, A0H);
                    return;
                }
                String productType = BZ6.getProductType();
                if (productType == null || ProductType.CLIPS != ProductType.A01.get(productType)) {
                    moduleName = r15.getModuleName();
                    str3 = "unknown original media type";
                } else {
                    C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.ORIGINAL_CREATOR_VIDEO, userSession);
                    A0i.A1C = r14.A30();
                    C250563lf.A0X(fragment.requireActivity(), A0i.A00(), userSession);
                    return;
                }
            } else {
                return;
            }
        }
        0wb.A03(moduleName, str3);
    }

    public static final void A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C58099ImL.A01(userSession, DbY.A0r(AnonymousClass12T.A00, 1596010039), 23);
    }

    public static final void A07(UserSession userSession, Context context, FragmentActivity fragmentActivity) {
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(context, A0N, 2131973671);
        A0N.A0i = true;
        Dbb.A0i(fragmentActivity, C49891FBs.A00(A0N, C46649DiU.A04(AnonymousClass000.A00(1202), AnonymousClass7TE.A1E())), userSession, ModalActivity.class, "bloks");
    }

    public static final boolean A08(Context context, AnonymousClass8J0 r10, UserSession userSession, Integer num, int i) {
        0qQ.A0B(context, 4);
        if (!(r10 == null || AnonymousClass8JI.SEQUENTIAL_REMIX != r10.A03 || num == null)) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36317204072895317L)) {
                long A01 = 182.A01(r2, userSession, 36598679049669880L);
                long intValue = (long) (i - num.intValue());
                if (0 <= intValue && intValue <= A01) {
                    C59689JTv.A09(context, context.getResources().getString(2131973124, AnonymousClass7TF.A1b((int) AnonymousClass7TE.A0P(A01))));
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A09(Context context, AnonymousClass8JI r4, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(context, 0);
        if (!z || !z2 || !z3 || !z4 || r4 != AnonymousClass8JI.REMIX) {
            return false;
        }
        C310336ap A0X = DbV.A0X();
        DbS.A19(context, A0X, 2131971956);
        A0X.A0J = true;
        DbY.A1N(A0X);
        return true;
    }

    public static final boolean A0C(UserSession userSession, 1Xj r7) {
        0qQ.A0B(r7, 0);
        C52345GOp gOp = A00;
        if (!A0D(r7)) {
            return false;
        }
        if (r7.A5p()) {
            C67161s9 BP1 = r7.A0C.BP1();
            if (BP1 != null) {
                return BP1.getMashupsAllowed();
            }
            return false;
        } else if (r7.A5U()) {
            C67161s9 BP12 = r7.A0C.BP1();
            return BP12 != null && BP12.getMashupsAllowed() && r7.A1B() <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        } else {
            C67161s9 A1N = r7.A1N();
            if (A1N == null || !A1N.getMashupsAllowed() || r7.A58()) {
                return false;
            }
            return !2R8.A02(userSession, r7) || gOp.A0J(userSession);
        }
    }

    public final void A0F(Activity activity, Fragment fragment, 28D r36, UserSession userSession, ImageUrl imageUrl, AnonymousClass8JI r39, 1Xj r40, 1Xj r41, Boolean bool, String str, String str2, String str3, boolean z) {
        UserSession userSession2 = userSession;
        1Xj r6 = r40;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession2, r6);
        28D r8 = r36;
        0qQ.A0B(r8, 4);
        02m.A0p.markerStart(366619078);
        boolean z2 = z;
        Activity activity2 = activity;
        ImageUrl imageUrl2 = imageUrl;
        AnonymousClass8JI r9 = r39;
        1Xj r13 = r41;
        Boolean bool2 = bool;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if ((r6.A5V() || r6.A5Y()) && r6.A1J() == null && r6.A1O() == null) {
            C58241Ioj ioj = new C58241Ioj(userSession2, r6, activity2, r8, r9, bool2, imageUrl2, (Object) null, r13, str4, str5, str6, A1Z ? 1 : 0, z2);
            1NY A0a = AnonymousClass7TG.A0a(userSession2);
            A0a.A0Q(CF9.class, C45652D0c.class);
            A0a.A0A("music/configure_original_sound_for_mashup/");
            String A30 = r6.A30();
            if (A30 != null) {
                1OC A0T = DbT.A0T(A0a, "original_media_id", A30);
                A0T.A00 = new EQT(fragment.getParentFragmentManager(), ioj, r6, 3);
                1ES.A00(fragment.requireContext(), AnonymousClass07i.A00(fragment), A0T);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        A02(activity2, r8, userSession2, imageUrl2, r9, r6, r13, (DirectCameraViewModel) null, A0E(activity2, r6), bool2, str4, str5, str6, z2);
    }

    public final void A0G(Activity activity, AnonymousClass9P8 r5, 1Xj r6, C56044Hrt hrt) {
        AnonymousClass8JI r1;
        MusicAssetModel musicAssetModel;
        0qQ.A0B(activity, 1);
        MusicAttributionConfig A0E = A0E(activity, r6);
        String id = r6.getId();
        if (id != null) {
            hrt.A0f = id;
            String str = null;
            if (r5 != null) {
                r1 = r5.A06;
            } else {
                r1 = null;
            }
            hrt.A07 = r1;
            hrt.A08 = A0E;
            if (!(A0E == null || (musicAssetModel = A0E.A02) == null)) {
                str = musicAssetModel.A0E;
            }
            hrt.A0G = str;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0H(Context context, AnonymousClass07i r16, UserSession userSession, 1Xj r18, String str) {
        C67161s9 A1N;
        int i;
        int i2;
        int i3;
        C358248ab A0Y;
        C50003FIo fIo;
        C358278ae r0;
        AnonymousClass07i r8 = r16;
        String str2 = str;
        C51972G9s.A1D(r8, str2);
        1Xj r10 = r18;
        C67161s9 BP1 = r10.A0C.BP1();
        Context context2 = context;
        UserSession userSession2 = userSession;
        if ((BP1 == null || !BP1.getMashupsAllowed()) && ((A1N = r10.A1N()) == null || !A1N.getMashupsAllowed())) {
            int i4 = 2131952905;
            int i5 = 2131952902;
            int i6 = 2131952901;
            int i7 = 2131952904;
            int i8 = 2131952903;
            if (r10.A5G()) {
                i4 = 2131952910;
                i5 = 2131952907;
                i6 = 2131952906;
                i7 = 2131952909;
                i8 = 2131952908;
            }
            A0Y = DbS.A0Y(context);
            A0Y.A09(i4);
            A0Y.A08(i5);
            fIo = new C50003FIo(context2, r8, userSession2, r10, str2, 1, false);
            r0 = C358278ae.BLUE_BOLD;
        } else {
            int i9 = 2131975579;
            int i10 = 2131975576;
            i = 2131975580;
            i2 = 2131975578;
            i3 = 2131975577;
            if (r10.A5G()) {
                i9 = 2131975584;
                i10 = 2131975581;
                i = 2131975585;
                i2 = 2131975583;
                i3 = 2131975582;
            }
            A0Y = DbS.A0Y(context);
            A0Y.A09(i9);
            A0Y.A08(i10);
            fIo = new C50003FIo(context2, r8, userSession2, r10, str2, 1, true);
            r0 = C358278ae.RED_BOLD;
        }
        A0Y.A0Q(fIo, r0, i);
        A0Y.A0G(new C50025FJk(context, userSession2, 65), i2);
        DbY.A1M(A0Y, i3);
    }

    public final void A0I(Fragment fragment, FragmentActivity fragmentActivity, 28D r19, AnonymousClass0iw r20, UserSession userSession, 1Xj r22, Integer num, String str) {
        AnonymousClass0iw r4 = r20;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(r4, userSession2);
        28D r2 = r19;
        1Xj r7 = r22;
        AnonymousClass7TF.A1B(r2, 7, r7);
        A04(fragment, fragmentActivity, r2, (ClipsMashupType) null, r4, userSession2, (ImageUrl) null, r7, (1Xj) null, this, (Boolean) null, num, str, (String) null, (String) null, (String) null);
    }

    public final boolean A0K(UserSession userSession) {
        if (DbT.A0j(userSession).A0N() != AnonymousClass05K.A01) {
            return false;
        }
        if (A0B(userSession) || A0A(userSession)) {
            return true;
        }
        return false;
    }

    public static final void A03(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        DbU.A1D(AnonymousClass7TE.A0a(), userSession);
        C47398E0q e0q = new C47398E0q();
        C331127Pr A0e = DbX.A0e(userSession, false);
        A0e.A0g = context.getString(2131968772);
        A0e.A0v = true;
        A0e.A1J = true;
        A0e.A0h = context.getString(2131961845);
        A0e.A0L = new ID0(27, (Object) fragmentActivity, (Object) context, (Object) userSession);
        A0e.A1N = true;
        String A16 = AnonymousClass7TE.A16(context, 2131961843);
        C54489HFv hFv = new C54489HFv(context, userSession, A16, context.getColor(2Yu.A06(context)));
        SpannableStringBuilder A0C = DbS.A0C(A16);
        AnonymousClass7AV.A02(A0C, hFv, A16);
        A0e.A0b = A0C;
        C331157Pu A002 = A0e.A00();
        AnonymousClass7TE.A1Z(new C58107ImT((Object) A002, (Object) fragmentActivity, (Object) e0q, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(fragmentActivity));
    }

    public static final boolean A0A(UserSession userSession) {
        Boolean Cad;
        User A02 = 17h.A00(userSession).A02(userSession.A06);
        if (A02 == null || (Cad = A02.A03.Cad()) == null || !Cad.booleanValue() || A0B(userSession)) {
            return false;
        }
        1Av A002 = 1Au.A00(userSession);
        0s0 r1 = A002.A4o;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (AnonymousClass7TG.A1a(A002, r1, r3, 332)) {
            return false;
        }
        1Av A003 = 1Au.A00(userSession);
        if (!AnonymousClass7TG.A1a(A003, A003.A4n, r3, 331)) {
            return true;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        0s0 r1 = A002.A7K;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (!AnonymousClass7TG.A1a(A002, r1, r3, 267)) {
            1Av A003 = 1Au.A00(userSession);
            if (!AnonymousClass7TG.A1a(A003, A003.A4o, r3, 332)) {
                1Av A004 = 1Au.A00(userSession);
                if (AnonymousClass7TG.A1a(A004, A004.A4n, r3, 331)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A0D(1Xj r2) {
        if (r2.A54() || r2.A1v() == null || r2.A1t() == AnonymousClass3QO.CLOSE_FRIENDS || r2.A1t() == AnonymousClass3QO.FOLLOWERS_ONLY || r2.A5M()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.music.common.config.MusicAttributionConfig A0E(android.app.Activity r10, X.1Xj r11) {
        /*
            r9 = this;
            X.AnonymousClass7TG.A1N(r10, r11)
            X.46h r2 = r11.A1O()
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r11.A1J()
            if (r0 == 0) goto L_0x005a
            X.5Bc r1 = new X.5Bc
            r1.<init>(r0)
        L_0x0012:
            if (r2 == 0) goto L_0x005c
            com.instagram.api.schemas.MusicInfo r0 = r2.A00
            com.instagram.api.schemas.TrackData r2 = r0.BUk()
            com.instagram.music.common.model.MusicConsumptionModel r1 = r0.BUp()
            java.lang.Integer r0 = r1.AdU()
            r3 = 0
            r8 = 0
            if (r0 != 0) goto L_0x0034
            java.util.List r0 = r2.BDX()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = X.00k.A0O(r0, r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0058
        L_0x0034:
            int r6 = r0.intValue()
            if (r2 == 0) goto L_0x003e
        L_0x003a:
            com.instagram.music.common.model.MusicAssetModel r3 = com.instagram.music.common.model.MusicAssetModel.A01(r2, r8)
        L_0x003e:
            r2 = 0
            boolean r7 = r1.getShouldMuteAudio()
            java.lang.String r5 = r1.getShouldMuteAudioReason()
            java.lang.Boolean r0 = r1.Ab6()
            if (r0 == 0) goto L_0x0051
            boolean r8 = r0.booleanValue()
        L_0x0051:
            com.instagram.music.common.config.MusicAttributionConfig r1 = new com.instagram.music.common.config.MusicAttributionConfig
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0058:
            r6 = 0
            goto L_0x003a
        L_0x005a:
            r1 = 0
            goto L_0x0012
        L_0x005c:
            if (r1 == 0) goto L_0x0067
            android.content.Context r0 = X.DbT.A05(r10)
            com.instagram.music.common.config.MusicAttributionConfig r1 = r1.Col(r0)
            return r1
        L_0x0067:
            java.lang.String r1 = "null music/sound model for media id: "
            java.lang.String r0 = r11.getId()
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "ClipsRemixUtil_create_music_attribution_config_null"
            X.0wb.A03(r0, r1)
            r1 = 0
            return r1
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52345GOp.A0E(android.app.Activity, X.1Xj):com.instagram.music.common.config.MusicAttributionConfig");
    }

    public final boolean A0J(UserSession userSession) {
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if ((DbT.A1a(A0q, "clips_media_remix_enabled") || DbW.A06(A0q, "preference_clips_account_remix_enabled_last_sync_ms") + 43200000 <= System.currentTimeMillis()) && DbT.A0j(userSession).A0N() == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }
}

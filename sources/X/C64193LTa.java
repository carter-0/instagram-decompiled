package X;

import android.os.Build;
import android.util.Base64;
import android.util.JsonWriter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AppInstallCTAInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.LTa  reason: case insensitive filesystem */
public final class C64193LTa {
    public static final C64193LTa A00 = new Object();
    public static final Integer[] A01 = {AnonymousClass05K.A00, AnonymousClass05K.A01, AnonymousClass05K.A0C, AnonymousClass05K.A0N, AnonymousClass05K.A0Y, AnonymousClass05K.A0u, AnonymousClass05K.A15};

    public static final 1NY A01(28D r8, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, C16674UzA uzA, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TF.A1B(userSession, 1, str);
        AnonymousClass7TF.A1E(str3, 5, mediaUploadMetadata);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0R = true;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        uzA.A00(A0a, userSession, A1A);
        if (z) {
            A1A.append("?video=1");
        }
        A0a.A0E = DbT.A10(A1A);
        String str6 = mediaUploadMetadata.A05;
        String str7 = mediaUploadMetadata.A03;
        if (!0mp.A0B(str6) && C59737JVv.A02(userSession, str7, 0sn.A00).length() > 0) {
            A0a.A9m(AnonymousClass000.A00(256), str6);
        }
        String str8 = mediaUploadMetadata.A03;
        String str9 = mediaUploadMetadata.A04;
        A0a.A9m("upload_id", str);
        A0a.A9m(AnonymousClass000.A00(5354), str5);
        if (!0mp.A0B(str8)) {
            A0a.A9m(AnonymousClass000.A00(507), str8);
            if (0qQ.A0K(str8, "com.wearable.facebook.monza")) {
                A0a.A9m("internal_features", C391429sz.A0W.toString());
            }
            if (!0mp.A0B(str9)) {
                A0a.A9m("app_attribution_android_raw_namespace", str8);
            }
        }
        if (z) {
            A0a.A9m(AnonymousClass000.A00(1924), str2);
        }
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass9JM r6 = (AnonymousClass9JM) it.next();
                JSONObject A11 = DbS.A11();
                A11.put(TraceFieldType.ContentType, r6.A03);
                A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A01);
                A11.put(Dbm.A01(), r6.A05);
                A11.put(DialogModule.KEY_TITLE, r6.A02);
                A11.put("segment_index", r6.A00);
                A11.put(AnonymousClass000.A00(195), r6.A04);
                jSONArray.put(A11);
            }
            A0a.AA0(C273654mx.A00(2334), DbT.A10(jSONArray));
        }
        if (z2) {
            A0a.A9m("from_drafts", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (0oI.A09(C60960kU.A00)) {
            A0a.A9m("is_upload_type_override_allowed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        A0a.A9m(Dbm.A02(0, 9, 14), str3);
        if (r8 != null) {
            A0a.A0C("camera_entry_point", (int) r8.A00);
        }
        if (182.A06(0Tu.A05, userSession, 36310851816259925L)) {
            A0a.A0F("X-IG-EU-CONFIGURE-DISABLED", "true");
        }
        A0a.A0C("include_e2ee_mentioned_user_list", 1);
        if (z4) {
            A0a.A0F("X-IG-App-ID", "871865944585275");
        }
        if (!0mp.A0B(mediaUploadMetadata.A03)) {
            String str10 = mediaUploadMetadata.A0A;
            String str11 = mediaUploadMetadata.A03;
            if (!0mp.A0B(str10) && C59737JVv.A02(userSession, str11, 0sn.A00).length() > 0) {
                A0a.A9m("wearable_shared_media_global_id", str10);
            }
        }
        if (z3) {
            A0a.A0C(AnonymousClass000.A00(1492), 1);
        }
        if (str4 != null) {
            A0a.A9m("publish_id", str4);
        }
        return A0a;
    }

    public static final String A04(AnonymousClass9J6 r5) {
        String str = null;
        StringWriter A0v = JTO.A0v();
        JsonWriter jsonWriter = new JsonWriter(A0v);
        String str2 = r5.A00;
        if (str2 != null) {
            str = 00l.A0J(str2, str2, '_');
        }
        String str3 = r5.A01;
        try {
            jsonWriter.beginObject();
            if (str != null) {
                JTP.A12(jsonWriter, C273654mx.A00(291), str);
            }
            if (str3 != null) {
                JTP.A12(jsonWriter, C273654mx.A00(707), str3);
            }
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException unused) {
        }
        return A0v.toString();
    }

    public static final LinkedHashMap A0G(UserSession userSession, AnonymousClass3Q2 r14, String str) {
        String A002;
        String str2;
        String valueOf;
        String str3;
        0qQ.A0B(str, 2);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("upload_id", str);
        JTR.A1N(r14.A1G, A1H);
        String valueOf2 = String.valueOf(r14.A0N);
        String A003 = AnonymousClass000.A00(815);
        A1H.put(A003, valueOf2);
        if (AnonymousClass7TF.A1V(r14.A3O)) {
            A1H.put("is_sidecar", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (AnonymousClass7TF.A1V(r14.A3Q)) {
            A1H.put("is_threads", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        String str4 = r14.A3N;
        if (!(str4 == null || str4.length() == 0)) {
            A1H.put(AnonymousClass000.A00(5105), str4);
        }
        if (r14.A2U != null && !r14.A15(ShareType.A02)) {
            A1H.put("is_post_live_clips", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A1H.put(TraceFieldType.BroadcastId, r14.A2U);
        }
        UserSession userSession2 = userSession;
        if ((!r14.A4t.isEmpty()) || AJ8.A08(userSession, r14)) {
            if (r14.A15(ShareType.A02)) {
                A1H.put("for_album", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (C379909Vu.A05(r14)) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(AJ8.A01(r14));
            }
            A1H.put("photo_to_video_duration_ms", valueOf);
            A0N(r14, A1H);
            Set<ADJ> set = r14.A4t;
            try {
                StringWriter A0v = JTO.A0v();
                17W A0e = C51970G9q.A0e(A0v);
                for (ADJ A004 : set) {
                    ABB.A00(A0e, A004);
                }
                str3 = JTR.A13(A0e, A0v);
            } catch (IOException unused) {
                str3 = null;
            }
            A1H.put("sticker_burnin_params", str3);
        }
        int i = r14.A0H;
        int i2 = r14.A0G;
        Double d = r14.A24;
        Double d2 = r14.A25;
        int i3 = r14.A0A;
        String str5 = r14.A33;
        if (str5 == null) {
            A002 = null;
        } else {
            A002 = 0mf.A00(str5);
        }
        A1H.put("image_compression", A07(userSession2, d, d2, A002, i, i2, i3));
        try {
            str2 = 0mh.A00(AnonymousClass0BO.A00(userSession2).BNy(userSession2.A06));
        } catch (IOException unused2) {
            str2 = "";
        }
        A1H.put("xsharing_user_ids", str2);
        A1H.put("retry_context", r14.A0H());
        if (r14.A1G == 1iA.A0Q) {
            A0L(userSession2, r14, A1H);
        }
        A0M(userSession2, r14, A1H);
        if (r14.A1G == 1iA.A06 && r14.A57) {
            A1H.put("render_as_sticker", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (r14.A0E() == ShareType.CUTOUT_STICKER || r14.A0E() == ShareType.STORY_TEMPLATE_ASSET) {
            A1H.put(A003, String.valueOf(r14.A0N));
        }
        return A1H;
    }

    public static final void A0H(1Fb r2, UserSession userSession, MW1 mw1, String str, String str2, String str3) {
        AnonymousClass7TF.A1C(userSession, 0, str);
        if (mw1.CT1()) {
            C63384Kw5.A00(r2, userSession, str, str2, str3);
        }
        if (mw1.Cbj() && mw1.BtM() != null) {
            r2.A9m(AnonymousClass000.A00(3974), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            r2.A9m("share_to_threads_destination_id", mw1.BtM());
            List BtN = mw1.BtN();
            if (BtN != null && !BtN.isEmpty()) {
                r2.AA0(AnonymousClass000.A00(5226), 0mh.A00(BtN));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0208, code lost:
        if (r4.length() == 0) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (X.JTS.A0e(r11) != X.AnonymousClass05K.A01) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (X.JTS.A0e(r11) != X.AnonymousClass05K.A0C) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36313012184811092L) == false) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x021c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b9 A[SYNTHETIC, Splitter:B:136:0x02b9] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(X.1Fb r10, com.instagram.common.session.UserSession r11, X.MW1 r12, boolean r13) {
        /*
            r6 = 0
            X.0qQ.A0B(r11, r6)
            r5 = 1
            java.lang.String r1 = r12.Bxn()
            if (r1 == 0) goto L_0x0016
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "source_media_id"
            r10.A9m(r0, r1)
        L_0x0016:
            com.instagram.model.venue.Venue r3 = r12.CDg()
            if (r3 == 0) goto L_0x0036
            java.lang.String r2 = X.C63383Kw4.A00(r3)     // Catch:{ IOException -> 0x0036 }
            java.lang.String r0 = "location"
            r10.A9m(r0, r2)     // Catch:{ IOException -> 0x0036 }
            java.lang.String r1 = "facebook_events"
            java.lang.String r0 = r3.A03()     // Catch:{ IOException -> 0x0036 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "event"
            r10.A9m(r0, r2)     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            java.util.ArrayList r1 = r12.BbX()
            boolean r0 = X.DbT.A1b(r1)
            r2 = 0
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = com.instagram.tagging.model.TagSerializer.A01(r1, r2, r2)
            java.lang.String r0 = "usertags"
            r10.A9m(r0, r1)
        L_0x004a:
            X.JxB r4 = r12.Aqi()
            java.lang.String r3 = r12.Aob()
            java.util.List r8 = r12.Aoc()
            if (r3 != 0) goto L_0x0091
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x009f
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313012185138775(0x81027e00050657, double:3.02783335442078E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 != 0) goto L_0x0091
            r0 = 36316448160944513(0x81059e00231181, double:3.030006279355893E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x007e
            java.lang.Integer r1 = X.JTS.A0e(r11)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0091
        L_0x007e:
            r0 = 36316448160878976(0x81059e00221180, double:3.030006279314447E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x009f
            java.lang.Integer r1 = X.JTS.A0e(r11)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x009f
        L_0x0091:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313012184811092(0x81027e00000654, double:3.027833354213552E-306)
            boolean r1 = X.182.A06(r7, r11, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            java.lang.String r7 = "internal_features"
            if (r0 == 0) goto L_0x00dc
            if (r4 == 0) goto L_0x00b3
            X.0Tu r9 = X.0Tu.A05
            r0 = 36324977964102180(0x810d6000063224, double:3.035400561219562E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            if (r0 == 0) goto L_0x00dc
        L_0x00b3:
            int r0 = r8.size()
            if (r0 <= r5) goto L_0x00be
            java.lang.String r1 = X.0mh.A00(r8)     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00d2
        L_0x00be:
            if (r3 != 0) goto L_0x00ca
            int r0 = r8.size()
            if (r0 != r5) goto L_0x00d7
            java.lang.String r3 = X.AnonymousClass7TE.A19(r8, r6)
        L_0x00ca:
            java.lang.String r0 = "invite_coauthor_user_id"
            r10.A9m(r0, r3)
            goto L_0x00d7
        L_0x00d0:
            java.lang.String r1 = ""
        L_0x00d2:
            java.lang.String r0 = "invite_coauthor_user_ids"
            r10.AA0(r0, r1)
        L_0x00d7:
            java.lang.String r0 = "coauthor_post"
            r10.A9m(r7, r0)
        L_0x00dc:
            java.util.ArrayList r1 = r12.BgW()
            boolean r0 = X.DbT.A1b(r1)
            if (r0 == 0) goto L_0x00f1
            if (r13 != 0) goto L_0x00f1
            java.lang.String r1 = com.instagram.tagging.model.TagSerializer.A00(r1, r2)
            java.lang.String r0 = "product_tags"
            r10.A9m(r0, r1)
        L_0x00f1:
            com.instagram.model.shopping.productcollection.ProductCollectionTagInfo r3 = r12.Bg3()
            if (r3 == 0) goto L_0x010f
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C63337KvK.A00(r0, r3)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            r0 = 3780(0xec4, float:5.297E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x010f:
            java.util.List r1 = r12.BgT()
            if (r1 == 0) goto L_0x012a
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x012a
            if (r13 != 0) goto L_0x012a
            java.lang.String r1 = A0D(r1)
            r0 = 5133(0x140d, float:7.193E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.AA0(r0, r1)
        L_0x012a:
            java.lang.String r1 = r11.A06
            java.lang.String r0 = r12.B8f()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x015b
            com.instagram.model.fundraiser.NewFundraiserInfo r3 = r12.BVw()
            if (r3 == 0) goto L_0x0150
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C64130LPe.A01(r0, r3)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "new_fundraiser_info"
            r10.A9m(r0, r1)
        L_0x0150:
            java.lang.String r1 = r12.getFundraiserId()
            if (r1 == 0) goto L_0x015b
            java.lang.String r0 = "fundraiser_id"
            r10.A9m(r0, r1)
        L_0x015b:
            boolean r0 = r12.AsA()
            java.lang.String r3 = "1"
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = "create_story_template"
            r10.A9m(r0, r3)
        L_0x0168:
            com.instagram.user.model.UpcomingEvent r1 = r12.CBy()
            if (r1 == 0) goto L_0x018a
            X.1E5 r0 = X.1E4.A00(r11)
            com.instagram.user.model.UpcomingEventImpl r5 = r1.FGz(r0)
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C45712D2l.A00(r0, r5)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "upcoming_event"
            r10.A9m(r0, r1)
        L_0x018a:
            boolean r0 = r12.getCommentsDisabled()
            if (r0 == 0) goto L_0x0195
            java.lang.String r0 = "disable_comments"
            r10.A9m(r0, r3)
        L_0x0195:
            boolean r0 = r12.getLikeAndViewCountsDisabled()
            if (r0 == 0) goto L_0x01a4
            r0 = 82
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r3)
        L_0x01a4:
            boolean r0 = r12.BtC()
            if (r0 == 0) goto L_0x01b3
            r0 = 777(0x309, float:1.089E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r3)
        L_0x01b3:
            r0 = 1730(0x6c2, float:2.424E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            if (r4 == 0) goto L_0x01d8
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C63980LGx.A00(r0, r4)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "content_scheduling_metadata"
            r10.A9m(r0, r1)
            r0 = 3923(0xf53, float:5.497E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r5, r0)
        L_0x01d8:
            boolean r0 = r12.Cd7()
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "text_post"
            r10.A9m(r5, r0)
        L_0x01e3:
            java.lang.String r1 = r12.Aun()
            X.JV7 r0 = r12.B9G()
            if (r0 == 0) goto L_0x01ef
            java.lang.String r2 = r0.A01
        L_0x01ef:
            if (r1 != 0) goto L_0x01f4
            if (r2 == 0) goto L_0x01fd
            r1 = r2
        L_0x01f4:
            r0 = 1257(0x4e9, float:1.761E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x01fd:
            java.lang.String r4 = r12.AsG()
            if (r4 == 0) goto L_0x020a
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto L_0x020b
        L_0x020a:
            r1 = 1
        L_0x020b:
            r0 = 1238(0x4d6, float:1.735E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            if (r1 != 0) goto L_0x0216
            r10.A9m(r2, r4)
        L_0x0216:
            java.lang.String r1 = r12.Ajo()
            if (r1 == 0) goto L_0x022c
            if (r4 == 0) goto L_0x0224
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0227
        L_0x0224:
            r10.A9m(r2, r1)
        L_0x0227:
            java.lang.String r0 = "camera_session_id"
            r10.A9m(r0, r1)
        L_0x022c:
            java.lang.String r1 = r12.AcI()
            if (r1 == 0) goto L_0x024a
            r0 = 1334(0x536, float:1.87E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
            java.lang.String r1 = r12.B08()
            if (r1 == 0) goto L_0x024a
            r0 = 282(0x11a, float:3.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x024a:
            java.lang.String r1 = r12.getCaptureType()
            if (r1 == 0) goto L_0x0255
            java.lang.String r0 = "capture_type"
            r10.A9m(r0, r1)
        L_0x0255:
            java.util.List r0 = r12.BF9()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x026c
            java.util.List r0 = r12.BF9()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "in_app_share_ids"
            r10.A9m(r0, r1)
        L_0x026c:
            java.lang.String r1 = r12.BYm()
            if (r1 == 0) goto L_0x027b
            r0 = 3704(0xe78, float:5.19E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x027b:
            X.Juw r2 = r12.BFj()
            if (r2 == 0) goto L_0x0299
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.LPS.A01(r0, r2)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            r0 = 4867(0x1303, float:6.82E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x0299:
            X.Jvb r2 = r12.B55()
            if (r2 == 0) goto L_0x02b3
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.LH6.A00(r2, r0)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "media_prompt_info"
            r10.A9m(r0, r1)
        L_0x02b3:
            java.util.List r2 = r12.Amo()
            if (r2 == 0) goto L_0x02d3
            java.io.StringWriter r1 = X.JTO.A0v()     // Catch:{ IOException -> 0x02cd }
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x02cd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02cd }
            X.C63187Ksu.A00(r0, r2)     // Catch:{ IOException -> 0x02cd }
            r0.close()     // Catch:{ IOException -> 0x02cd }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x02cd }
            goto L_0x02ce
        L_0x02cd:
            r1 = 0
        L_0x02ce:
            java.lang.String r0 = "channel_tags"
            r10.A9m(r0, r1)
        L_0x02d3:
            boolean r0 = r12.CVp()
            java.lang.String r2 = "is_meta_only_post"
            if (r0 == 0) goto L_0x02de
            r10.A9m(r2, r3)
        L_0x02de:
            boolean r0 = r12.CYb()
            if (r0 == 0) goto L_0x02f8
            r0 = 1520(0x5f0, float:2.13E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r3)
            java.lang.String r1 = r12.BYT()
            if (r1 == 0) goto L_0x02f8
            java.lang.String r0 = "open_to_public_submission_text"
            r10.A9m(r0, r1)
        L_0x02f8:
            if (r13 == 0) goto L_0x0307
            int r0 = r12.Alz()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "carousel_mixed_aspect_ratio_type"
            r10.A9m(r0, r1)
        L_0x0307:
            boolean r0 = r12.CXY()
            if (r0 == 0) goto L_0x0310
            r10.A9m(r2, r3)
        L_0x0310:
            java.lang.String r0 = r12.BmY()
            if (r0 != 0) goto L_0x0347
            java.lang.String r0 = r12.BmU()
            if (r0 != 0) goto L_0x0347
            java.lang.String r0 = r12.BMk()
            if (r0 != 0) goto L_0x0347
            java.lang.Integer r0 = r12.AfK()
            if (r0 != 0) goto L_0x0347
            int r1 = r12.BmG()
            r0 = -1
            if (r1 != r0) goto L_0x0347
            X.JV7 r0 = r12.B9G()
            if (r0 != 0) goto L_0x0347
            java.lang.String r0 = r12.AfR()
            if (r0 != 0) goto L_0x0347
            java.lang.Boolean r0 = r12.AfN()
            if (r0 != 0) goto L_0x0347
            java.lang.String r0 = r12.AfL()
            if (r0 == 0) goto L_0x0354
        L_0x0347:
            java.lang.String r1 = A08(r12)
            r0 = 5325(0x14cd, float:7.462E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x0354:
            java.util.List r2 = r12.AfO()
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x036c
            java.lang.String r1 = ","
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r0 = r0.A02(r2)
            r10.A9m(r7, r0)
        L_0x036c:
            java.lang.String r1 = A06(r11, r12)
            if (r1 == 0) goto L_0x0377
            java.lang.String r0 = "shared_album_reel_metadata"
            r10.A9m(r0, r1)
        L_0x0377:
            java.lang.String r2 = r12.Ac3()
            java.lang.String r1 = r12.Ac2()
            if (r2 == 0) goto L_0x038a
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r2)
        L_0x038a:
            if (r1 == 0) goto L_0x0395
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x0395:
            java.lang.String r1 = r12.BSd()
            if (r1 == 0) goto L_0x03a6
            int r0 = r1.length()
            if (r0 == 0) goto L_0x03a6
            java.lang.String r0 = "mv_link"
            r10.A9m(r0, r1)
        L_0x03a6:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r12.B8y()
            if (r0 == 0) goto L_0x03b3
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "gen_ai_detection_method"
            r10.A9m(r0, r1)
        L_0x03b3:
            java.lang.Boolean r0 = r12.CUB()
            if (r0 == 0) goto L_0x03c6
            java.lang.String r1 = r0.toString()
            r0 = 4932(0x1344, float:6.911E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64193LTa.A0I(X.1Fb, com.instagram.common.session.UserSession, X.MW1, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(X.1Fb r10, com.instagram.common.session.UserSession r11, X.LBT r12, long r13, boolean r15) {
        /*
            r0 = 0
            X.0qQ.A0B(r11, r0)
            boolean r7 = X.DbW.A1Y(r12)
            java.lang.String r1 = r12.A0Q
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "caption"
            r10.A9m(r0, r1)
        L_0x0011:
            X.4k0 r2 = r12.A08
            if (r2 == 0) goto L_0x002d
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C271974jt.A00(r0, r2)
            java.lang.String r1 = X.JTP.A0n(r0, r1)
            r0 = 4571(0x11db, float:6.405E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x002d:
            int r0 = r12.A03
            java.lang.String r1 = X.AnonymousClass6LX.A00(r11, r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r12.A0A
            java.lang.String r2 = r5.A08
            java.lang.String r0 = "54"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x0047
            boolean r0 = X.00l.A0W(r2)
            if (r0 == 0) goto L_0x0049
        L_0x0047:
            java.lang.String r1 = "4"
        L_0x0049:
            java.lang.String r0 = "source_type"
            r10.A9m(r0, r1)
            java.lang.String r4 = "1"
            java.lang.String r6 = "edits"
            if (r15 == 0) goto L_0x00e9
            com.instagram.pendingmedia.model.ClipInfo r8 = r12.A0F
            if (r8 == 0) goto L_0x030c
            java.util.List r0 = r12.A0a
            if (r0 == 0) goto L_0x0305
            java.lang.String r1 = A0B(r1, r0)
            if (r1 == 0) goto L_0x0067
            java.lang.String r0 = "clips"
            r10.AA0(r0, r1)
        L_0x0067:
            double r2 = r12.A00
            int r9 = r8.A07
            double r0 = (double) r9
            double r2 = r2 - r0
            int r0 = r8.A05
            int r0 = r0 - r9
            double r0 = (double) r0
            double r2 = r2 / r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            int r0 = (int) r2
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "poster_frame_index"
            r10.AA0(r0, r1)
            int r0 = X.JTO.A09(r8)
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "length"
            r10.AA0(r0, r1)
            boolean r0 = r12.A0g
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2672(0xa70, float:3.744E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.AA0(r0, r1)
            X.3QG r2 = r12.A0I
            int r0 = r2.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r2.A00
            java.lang.String r0 = A0A(r1, r0)
            r10.AA0(r6, r0)
            java.lang.Boolean r0 = r12.A0L
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "revshare_ads_toggled_on"
            r10.A9m(r0, r1)
        L_0x00c0:
            boolean r0 = r12.A0k
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "video_subtitles_enabled"
            r10.A9m(r0, r4)
        L_0x00c9:
            java.util.HashMap r8 = r12.A0X
            if (r8 == 0) goto L_0x0102
            java.lang.Integer[] r6 = A01
            r3 = 7
            r2 = 0
        L_0x00d1:
            r0 = r6[r2]
            java.lang.String r1 = X.C59903JbS.A00(r0)
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = X.DbS.A0r(r1, r8)
            r10.A9m(r1, r0)
        L_0x00e4:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0102
            goto L_0x00d1
        L_0x00e9:
            X.4nL r2 = r12.A0G
            if (r2 == 0) goto L_0x00c9
            java.io.StringWriter r1 = X.JTO.A0v()     // Catch:{ IOException -> 0x00c9 }
            X.17W r0 = X.JTO.A0Q(r1)     // Catch:{ IOException -> 0x00c9 }
            X.C273874nK.A00(r0, r2)     // Catch:{ IOException -> 0x00c9 }
            java.lang.String r0 = X.JTP.A0n(r0, r1)     // Catch:{ IOException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c9
            r10.AA0(r6, r0)
            goto L_0x00c9
        L_0x0102:
            boolean r0 = r12.A0f
            if (r0 == 0) goto L_0x0301
            java.lang.String r1 = "true"
        L_0x0108:
            java.lang.String r0 = "hide_from_profile_grid"
            r10.A9m(r0, r1)
            X.4yP r0 = r12.A04
            long r0 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "bottom_camera_dial_selected"
            r10.A9m(r0, r1)
            X.3QO r0 = r12.A0B
            java.lang.String r2 = "audience"
            if (r0 == 0) goto L_0x02ea
            java.lang.String r1 = r0.A00
        L_0x0126:
            r10.A9m(r2, r1)
        L_0x0129:
            java.lang.Boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "is_paid_partnership"
            r10.A9m(r0, r1)
        L_0x0136:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = r12.A0E
            java.lang.String r2 = "sponsor_tags"
            if (r0 == 0) goto L_0x0149
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            boolean r0 = r12.A0j
            java.lang.String r0 = A0F(r1, r0)
            r10.A9m(r2, r0)
        L_0x0149:
            java.util.List r1 = r12.A0Z
            if (r1 == 0) goto L_0x015c
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x015c
            boolean r0 = r12.A0j
            java.lang.String r0 = A0F(r1, r0)
            r10.A9m(r2, r0)
        L_0x015c:
            com.instagram.api.schemas.BrandedContentGatingInfo r2 = r12.A06
            if (r2 == 0) goto L_0x0174
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C45512Cxm.A00(r0, r2)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "media_gating_info"
            r10.A9m(r0, r1)
        L_0x0174:
            com.instagram.api.schemas.BrandedContentProjectMetadata r2 = r12.A07
            if (r2 == 0) goto L_0x019f
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.LGt.A00(r0, r2)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "branded_content_project_metadata"
            r10.A9m(r0, r1)
            com.instagram.api.schemas.AppInstallCTAInfo r0 = A02(r2)
            if (r0 == 0) goto L_0x019f
            java.lang.String r1 = A05(r0)
            r0 = 4473(0x1179, float:6.268E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x019f:
            boolean r0 = r12.A0e
            if (r0 == 0) goto L_0x01ac
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "create_pa_boost_post_access_token_not_expire"
            r10.A9m(r0, r1)
        L_0x01ac:
            java.lang.String r1 = r12.A0W
            if (r1 == 0) goto L_0x01b9
            r0 = 5032(0x13a8, float:7.051E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x01b9:
            java.lang.String r1 = A09(r12)
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = "extra"
            r10.AA0(r0, r1)
        L_0x01c4:
            java.lang.String r1 = A03()
            if (r1 == 0) goto L_0x01cf
            java.lang.String r0 = "device"
            r10.AA0(r0, r1)
        L_0x01cf:
            java.lang.String r1 = r12.A0P
            if (r1 == 0) goto L_0x01d8
            java.lang.String r0 = "camera_position"
            r10.A9m(r0, r1)
        L_0x01d8:
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r12.A0D
            if (r1 == 0) goto L_0x01f1
            java.lang.Boolean r0 = r1.A0E
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x02e2
            java.lang.String r1 = X.C59670JTa.A06(r1)
            r0 = 1756(0x6dc, float:2.46E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x01ee:
            r10.AA0(r0, r1)
        L_0x01f1:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            int r0 = r0.getOffset(r13)
            long r0 = (long) r0
            long r0 = X.AnonymousClass7TE.A0P(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "timezone_offset"
            r10.A9m(r0, r1)
            java.lang.String r1 = r12.A0T
            java.lang.String r0 = "nav_chain"
            r10.A9m(r0, r1)
            X.9J6 r0 = r12.A05
            if (r0 == 0) goto L_0x021b
            java.lang.String r1 = A04(r0)
            java.lang.String r0 = "created_from_highlight_info"
            r10.A9m(r0, r1)
        L_0x021b:
            java.lang.Boolean r0 = r12.A0M
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x0228
            java.lang.String r0 = "should_post_quietly"
            r10.A9m(r0, r4)
        L_0x0228:
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x023d
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x023d
            java.lang.String r1 = r5.A02
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x023d:
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x024e
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x024e
            java.lang.String r1 = r5.A08
            java.lang.String r0 = "metagallery_media_id"
            r10.A9m(r0, r1)
        L_0x024e:
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x0269
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0269
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "0"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0269
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "horizon_world_id"
            r10.A9m(r0, r1)
        L_0x0269:
            java.util.List r0 = r12.A0d
            java.lang.Integer r3 = r12.A0N
            java.util.List r2 = r12.A0c
            if (r0 == 0) goto L_0x0298
            if (r3 == 0) goto L_0x0298
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "waveform"
            r10.A9m(r0, r1)
            java.lang.String r1 = r3.toString()
            r0 = 1933(0x78d, float:2.709E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
            if (r2 == 0) goto L_0x0298
            java.lang.String r1 = A0E(r2)
            r0 = 808(0x328, float:1.132E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
        L_0x0298:
            java.util.List r0 = r12.A0b
            if (r0 == 0) goto L_0x02a9
            java.lang.String r1 = A0C(r0)
            r0 = 3712(0xe80, float:5.202E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.AA0(r0, r1)
        L_0x02a9:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r12.A09
            if (r0 == 0) goto L_0x02b4
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "gen_ai_detection_method"
            r10.A9m(r0, r1)
        L_0x02b4:
            X.L4x r2 = r12.A0H
            if (r2 == 0) goto L_0x02d0
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C64013LJa.A00(r0, r2)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            r0 = 5162(0x142a, float:7.234E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.AA0(r0, r1)
        L_0x02d0:
            java.lang.Boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x02e1
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_quicksnap_recap"
            r10.A9m(r0, r1)
        L_0x02e1:
            return
        L_0x02e2:
            java.lang.String r1 = X.C59670JTa.A05(r1)
            java.lang.String r0 = "music_params"
            goto L_0x01ee
        L_0x02ea:
            boolean r0 = r12.A0h
            if (r0 == 0) goto L_0x0129
            java.lang.String r1 = r12.A0R
            if (r1 == 0) goto L_0x0129
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            java.lang.String r0 = r0.A00
            r10.A9m(r2, r0)
            r0 = 1341(0x53d, float:1.879E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            goto L_0x0126
        L_0x0301:
            java.lang.String r1 = "false"
            goto L_0x0108
        L_0x0305:
            java.lang.String r0 = "Video MediaShareParams must have clipInfoList"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x030c:
            java.lang.String r0 = "Video MediaShareParams must have stitchedClipInfo"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64193LTa.A0J(X.1Fb, com.instagram.common.session.UserSession, X.LBT, long, boolean):void");
    }

    public static final void A0L(UserSession userSession, AnonymousClass3Q2 r5, Map map) {
        0Tu r2 = 0Tu.A05;
        if ((182.A06(r2, userSession, 36315954237476676L) || 182.A06(r2, userSession, 36315954237542213L)) && !0mp.A0B(r5.A3y)) {
            String str = r5.A3y;
            if (str != null) {
                Charset charset = StandardCharsets.UTF_8;
                0qQ.A08(charset);
                byte[] bytes = str.getBytes(charset);
                0qQ.A07(bytes);
                map.put("xmp_data", Base64.encodeToString(bytes, 2));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final AppInstallCTAInfo A02(BrandedContentProjectMetadata brandedContentProjectMetadata) {
        String str = brandedContentProjectMetadata.A05;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = brandedContentProjectMetadata.A06;
        if (str3 != null) {
            str2 = str3;
        }
        if (str.length() > 0 || str2.length() > 0) {
            return new AppInstallCTAInfo(str, str2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4.A01 == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A09(X.LBT r4) {
        /*
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0009
            int r1 = r4.A01
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x004e
            java.io.StringWriter r3 = X.JTO.A0v()     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException | NullPointerException -> 0x004e }
            r0.<init>(r3)     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r1 = r0.beginObject()     // Catch:{ IOException | NullPointerException -> 0x004e }
            r0 = 888(0x378, float:1.244E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r2 = r1.name(r0)     // Catch:{ IOException | NullPointerException -> 0x004e }
            int r0 = r4.A02     // Catch:{ IOException | NullPointerException -> 0x004e }
            long r0 = (long) r0     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r1 = r2.value(r0)     // Catch:{ IOException | NullPointerException -> 0x004e }
            r0 = 887(0x377, float:1.243E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r2 = r1.name(r0)     // Catch:{ IOException | NullPointerException -> 0x004e }
            int r0 = r4.A01     // Catch:{ IOException | NullPointerException -> 0x004e }
            long r0 = (long) r0     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r0 = r2.value(r0)     // Catch:{ IOException | NullPointerException -> 0x004e }
            android.util.JsonWriter r0 = r0.endObject()     // Catch:{ IOException | NullPointerException -> 0x004e }
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException | NullPointerException -> 0x004e }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException | NullPointerException -> 0x004e }
            return r0
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ IOException | NullPointerException -> 0x004e }
            throw r0     // Catch:{ IOException | NullPointerException -> 0x004e }
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64193LTa.A09(X.LBT):java.lang.String");
    }

    public static final void A0M(UserSession userSession, AnonymousClass3Q2 r5, Map map) {
        String str;
        if (AnonymousClass7TF.A1V(r5.A3Q)) {
            str = AnonymousClass000.A00(4107);
        } else if (!182.A06(0Tu.A05, userSession, 36319102448442267L)) {
            return;
        } else {
            if (r5.A0w()) {
                str = "feed";
            } else if (r5.A15(ShareType.A02)) {
                str = "story";
            } else {
                return;
            }
        }
        map.put("IG-FB-Xpost-entry-point-v2", str);
    }

    public static final void A0N(AnonymousClass3Q2 r6, Map map) {
        int i;
        MusicOverlayStickerModel A02 = C59923Jbm.A00.A02(r6.A4b);
        try {
            if (!C59911Jba.A02(r6)) {
                return;
            }
            if (A02 != null) {
                String str = A02.A0S;
                Integer num = A02.A0K;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (str == null || str.equals("0")) {
                    0wb.A03("missingAudioAssetId", "We are music muxing, but are missing an asset ID.");
                    return;
                }
                StringWriter A0v = JTO.A0v();
                17W A0K = AnonymousClass7TF.A0K(A0v);
                A0K.A0R("asset_fbid", str);
                A0K.A0P("offset_ms", i);
                String A0k = AnonymousClass7TG.A0k(A0K, A0v);
                0qQ.A07(A0k);
                map.put("music_burnin_params", A0k);
                if (AnonymousClass497.A00(AnonymousClass3WT.MUSIC_LYRICS, r6.A4b) != null) {
                    map.put("story_has_lyrics", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                }
                C255783ui A002 = AnonymousClass497.A00(AnonymousClass3WT.MEDIA, r6.A4b);
                if (A002 != null) {
                    ProductType productType = A002.A0m;
                    if (productType == ProductType.FEED || productType == ProductType.FEED_CAROUSEL) {
                        map.put("is_feed_reshare", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        return;
                    }
                    return;
                }
                return;
            }
            0wb.A03("isMusicMuxingWithNoParams", "We are music muxing, but have no parameters somehow.");
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        if (r12.A0E() == com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        if (r0 == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (X.DbT.A1b(r12.A0K(new X.C64449Lc5(r0), X.1us.class)) != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017a, code lost:
        if (r6 == com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r12.A5L != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0yf A00(com.instagram.common.session.UserSession r11, X.AnonymousClass3Q2 r12, java.lang.String r13) {
        /*
            boolean r4 = X.C51970G9q.A1Y(r13)
            X.0yf r3 = new X.0yf
            r3.<init>()
            com.instagram.pendingmedia.model.constants.ShareType r6 = r12.A0E()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.1iA r0 = r12.A1G
            X.1iA r5 = X.1iA.A0a
            if (r0 != r5) goto L_0x002a
            boolean r0 = X.C64016LJd.A01(r12)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r12.A5M
            if (r0 != 0) goto L_0x002a
            int r0 = r12.A05
            if (r0 != 0) goto L_0x002a
            boolean r1 = r12.A5L
            r0 = 1
            if (r1 == 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "use_default_cover"
            r2.add(r0)
        L_0x0032:
            java.lang.String r0 = r12.A2k
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "has-overlay"
            r2.add(r0)
        L_0x003b:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r1 = X.DbT.A0z(r1, r2, r0)
            java.lang.String r0 = "content_tags"
            r3.put(r0, r1)
        L_0x004d:
            X.1iA r8 = X.1iA.A07
            X.1iA r2 = X.1iA.A0Q
            X.1iA r1 = X.1iA.A0X
            X.1iA r0 = X.1iA.A0Y
            X.1iA r7 = X.1iA.A0K
            X.1iA[] r0 = new X.1iA[]{r8, r2, r1, r0, r7}
            java.util.EnumSet r1 = java.util.EnumSet.of(r5, r0)
            X.1iA r0 = r12.A1G
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = "upload_mediatype_param"
            java.lang.String r0 = "Invalid upload media type reported"
            X.0wb.A03(r1, r0)
        L_0x006e:
            X.1iA r0 = r12.A1G
            X.JTR.A1N(r0, r3)
            java.lang.String r0 = "upload_id"
            r3.put(r0, r13)
            int r0 = r12.A0N
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 815(0x32f, float:1.142E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r3.put(r2, r1)
            X.1iA r1 = r12.A1G
            if (r1 == r7) goto L_0x02a3
            X.1iA r0 = X.1iA.A0N
            if (r1 == r0) goto L_0x02a3
            java.lang.String r7 = "1"
            if (r1 != r8) goto L_0x0181
            X.4n7 r8 = r12.A1L
            java.lang.String r0 = "is_direct_voice"
            r3.put(r0, r7)
        L_0x009a:
            if (r8 == 0) goto L_0x029e
            int r0 = r8.AzN()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "upload_media_duration_ms"
            r3.put(r0, r1)
            A0M(r11, r12, r3)
            java.util.EnumSet r10 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r12.A15(r10)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "for_album"
            r3.put(r0, r7)
        L_0x00b9:
            boolean r0 = r12.A0x()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "is_igtv_video"
            r3.put(r0, r7)
            r0 = 4984(0x1378, float:6.984E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r7)
        L_0x00cd:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36320614277915305(0x810968000f22a9, double:3.0326409485038285E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            r9 = 1
            if (r0 == 0) goto L_0x0178
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r6 != r1) goto L_0x017e
            com.instagram.pendingmedia.model.constants.ShareType r0 = r12.A0E()
            if (r0 != r1) goto L_0x00eb
            boolean r0 = r12.A15(r10)
            if (r0 != 0) goto L_0x00f4
        L_0x00eb:
            com.instagram.pendingmedia.model.constants.ShareType r8 = r12.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            r0 = 0
            if (r8 != r1) goto L_0x00f5
        L_0x00f4:
            r0 = 1
        L_0x00f5:
            if (r0 != 0) goto L_0x017e
        L_0x00f7:
            if (r9 != 0) goto L_0x011d
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r6 == r1) goto L_0x011d
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.HIGHLIGHTS
            if (r6 == r0) goto L_0x011d
            boolean r0 = r12.A4w
            if (r0 == 0) goto L_0x0122
            java.util.EnumSet r0 = java.util.EnumSet.of(r1)
            X.0qQ.A07(r0)
            X.Lc5 r1 = new X.Lc5
            r1.<init>(r0)
            java.lang.Class<X.1us> r0 = X.1us.class
            java.util.ArrayList r0 = r12.A0K(r1, r0)
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x0122
        L_0x011d:
            java.lang.String r0 = "for_direct_story"
            r3.put(r0, r7)
        L_0x0122:
            java.lang.String r0 = r12.A3O
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = "is_sidecar"
            r3.put(r0, r7)
        L_0x012f:
            boolean r0 = r12.A0v()
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "is_clips_video"
            r3.put(r0, r7)
        L_0x013a:
            java.lang.String r0 = r12.A3Q
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = "is_threads"
            r3.put(r0, r7)
        L_0x0147:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.EXPRESSIVE_QUESTION_STICKER
            if (r1 != r0) goto L_0x015a
            X.1iA r0 = r12.A07()
            if (r0 != r5) goto L_0x015a
            java.lang.String r0 = "is_story_interaction_response"
            r3.put(r0, r7)
        L_0x015a:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.MEDIA_KIT
            if (r6 != r0) goto L_0x0163
            java.lang.String r0 = "is_media_kit_cover"
            r3.put(r0, r7)
        L_0x0163:
            java.lang.String r1 = r12.A0H()
            java.lang.String r0 = "retry_context"
            r3.put(r0, r1)
            java.lang.String r1 = r11.A06
            X.0BQ r0 = X.AnonymousClass0BO.A00(r11)
            java.util.List r0 = r0.BNy(r1)
            goto L_0x0204
        L_0x0178:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r6 != r0) goto L_0x017e
            goto L_0x00f7
        L_0x017e:
            r9 = 0
            goto L_0x00f7
        L_0x0181:
            com.instagram.pendingmedia.model.ClipInfo r8 = r12.A1N
            int r0 = r12.A0S
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1913(0x779, float:2.68E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
            int r0 = r12.A0R
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1912(0x778, float:2.679E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r1)
            boolean r0 = X.C64016LJd.A01(r12)
            if (r0 == 0) goto L_0x01b6
            boolean r0 = X.C64016LJd.A00(r11, r12)
            if (r0 != 0) goto L_0x01b6
            int r0 = r12.A05
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "extract_cover_frame"
            r3.put(r0, r7)
        L_0x01b6:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 != r0) goto L_0x009a
            r0 = 1283(0x503, float:1.798E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r7)
            java.util.List r0 = r12.A4G
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x01fb
            java.util.List r0 = r12.A4G
            java.lang.Object r9 = r0.get(r4)
            com.instagram.pendingmedia.model.ClipInfo r9 = (com.instagram.pendingmedia.model.ClipInfo) r9
            boolean r0 = r9.A0L
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hflip"
            r3.put(r0, r1)
            java.lang.Integer r0 = r9.A0C
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "rotate"
            r3.put(r0, r1)
            goto L_0x009a
        L_0x01f3:
            java.lang.String r1 = "PendingMediaApi"
            java.lang.String r0 = "unsupported: custom cover frame timestamp"
            X.0KC.A0C(r1, r0)
            goto L_0x01b6
        L_0x01fb:
            java.lang.String r1 = "direct_video_upload"
            java.lang.String r0 = "clip info list is empty"
            X.0wb.A03(r1, r0)
            goto L_0x009a
        L_0x0204:
            java.lang.String r1 = X.0mh.A00(r0)     // Catch:{ IOException -> 0x0209 }
            goto L_0x020b
        L_0x0209:
            java.lang.String r1 = ""
        L_0x020b:
            java.lang.String r0 = "xsharing_user_ids"
            r3.put(r0, r1)
            A0N(r12, r3)
            A0L(r11, r12, r3)
            int r0 = r12.A0N
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r2, r0)
        L_0x0221:
            boolean r0 = r12.A5p
            if (r0 == 0) goto L_0x02a3
            java.lang.String r8 = "variant_name"
            java.lang.String r5 = "ig/text_sticker_translation/original_language"
            r3.put(r8, r5)
            X.Jw4 r2 = r12.A0m
            if (r2 == 0) goto L_0x02a3
            java.lang.Object r0 = r2.A00
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x02a3
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Locale r0 = X.AnonymousClass1Q2.A03()
            java.lang.String r1 = r0.getISO3Language()
            r0 = 777(0x309, float:1.089E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r6.put(r0, r1)
            r6.put(r8, r5)
            boolean r8 = r2.A02
            java.lang.Object r0 = r2.A00
            java.util.Iterator r5 = X.C51966G9m.A1H(r0)
        L_0x025c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x027e
            java.lang.Object r0 = r5.next()
            X.JtT r0 = (X.C60909JtT) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "language"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "is_lipsync"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r0, r1, r2)
            r7.add(r0)
            goto L_0x025c
        L_0x027e:
            r0 = 826(0x33a, float:1.157E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r6.put(r0, r7)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r2 = X.DbT.A10(r0)
            java.lang.String r1 = "\\"
            java.lang.String r0 = ""
            java.lang.String r1 = X.00p.A0g(r2, r1, r0, r4)
            java.lang.String r0 = "autodub_creation_params"
            r3.put(r0, r1)
            return r3
        L_0x029e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64193LTa.A00(com.instagram.common.session.UserSession, X.3Q2, java.lang.String):X.0yf");
    }

    public static final String A03() {
        try {
            StringWriter A0v = JTO.A0v();
            JsonWriter endObject = new JsonWriter(A0v).beginObject().name("manufacturer").value(Build.MANUFACTURER).name("model").value(Build.MODEL).name(AnonymousClass000.A00(2608)).value((long) Build.VERSION.SDK_INT).name("android_release").value(Build.VERSION.RELEASE).endObject();
            if (endObject != null) {
                endObject.close();
                return A0v.toString();
            }
            throw AnonymousClass7TE.A0y();
        } catch (IOException | NullPointerException unused) {
            return null;
        }
    }

    public static final String A05(AppInstallCTAInfo appInstallCTAInfo) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        String str = appInstallCTAInfo.A00;
        if (str != null) {
            A0K.A0R(AnonymousClass000.A00(505), str);
        }
        String str2 = appInstallCTAInfo.A01;
        if (str2 != null) {
            A0K.A0R(AnonymousClass000.A00(1491), str2);
        }
        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
        0qQ.A07(A0k);
        return A0k;
    }

    public static final String A06(UserSession userSession, MW1 mw1) {
        List Aat = mw1.Aat();
        if (Aat != null && !Aat.isEmpty()) {
            try {
                JSONObject A11 = DbS.A11();
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = Aat.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    User A0k = DbT.A0k(it);
                    if (!C51966G9m.A1W(userSession, A0k.getId())) {
                        if (A0k.getId().length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            DbU.A1V(A0k, A1C);
                        }
                    }
                }
                if (DbT.A1b(A1C)) {
                    A11.put("thread_member_ids", new JSONArray(A1C));
                }
                String Bxk = mw1.Bxk();
                if (Bxk == null) {
                    Bxk = "";
                }
                A11.put("chat_name", Bxk);
                return A11.toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        if (java.lang.Double.isNaN(r2) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (java.lang.Double.isNaN(r1) == false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A07(com.instagram.common.session.UserSession r8, java.lang.Double r9, java.lang.Double r10, java.lang.String r11, int r12, int r13, int r14) {
        /*
            java.io.StringWriter r4 = X.JTO.A0v()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            android.util.JsonWriter r5 = r0.beginObject()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = "lib_name"
            android.util.JsonWriter r1 = r5.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r0.equals(r11)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x004b
            boolean r0 = com.instagram.util.jpeg.JpegBridge.A01()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = com.instagram.util.jpeg.JpegBridge.getJpegLibraryNameNative()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
        L_0x0025:
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = "lib_version"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = X.LTE.A04(r11)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r1.value(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = "quality"
            android.util.JsonWriter r1 = r5.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r1.value(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            goto L_0x0064
        L_0x0044:
            r0 = 689(0x2b1, float:9.65E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            goto L_0x0025
        L_0x004b:
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equals(r11)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "libwebp"
            goto L_0x0025
        L_0x0056:
            java.lang.String r0 = "image/heic"
            boolean r0 = r0.equals(r11)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "androidx.heifwriter"
            goto L_0x0025
        L_0x0061:
            java.lang.String r0 = "unknown"
            goto L_0x0025
        L_0x0064:
            if (r12 == 0) goto L_0x007c
            if (r13 == 0) goto L_0x007c
            java.lang.String r0 = "original_width"
            android.util.JsonWriter r2 = r5.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            long r0 = (long) r12     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r2.value(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = "original_height"
            android.util.JsonWriter r2 = r5.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            long r0 = (long) r13     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r2.value(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
        L_0x007c:
            if (r9 == 0) goto L_0x00a2
            double r2 = r9.doubleValue()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r0 = 36322212005160966(0x810adc00062806, double:3.033651357647516E-306)
            boolean r0 = X.182.A06(r6, r8, r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x0096
            boolean r1 = java.lang.Double.isNaN(r2)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r0 = 0
            if (r1 != 0) goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "msssim"
            android.util.JsonWriter r0 = r5.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r0.value(r2)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
        L_0x00a2:
            if (r10 == 0) goto L_0x00c8
            double r1 = r10.doubleValue()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r6 = 36322212005160966(0x810adc00062806, double:3.033651357647516E-306)
            boolean r0 = X.182.A06(r0, r8, r6)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x00bc
            boolean r3 = java.lang.Double.isNaN(r1)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r0 = 0
            if (r3 != 0) goto L_0x00bd
        L_0x00bc:
            r0 = 1
        L_0x00bd:
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "ssim"
            android.util.JsonWriter r0 = r5.name(r0)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            r0.value(r1)     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
        L_0x00c8:
            android.util.JsonWriter r0 = r5.endObject()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            if (r0 == 0) goto L_0x00d6
            r0.close()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            return r0
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
            throw r0     // Catch:{ IOException -> 0x00e2, NullPointerException -> 0x00db }
        L_0x00db:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00e2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64193LTa.A07(com.instagram.common.session.UserSession, java.lang.Double, java.lang.Double, java.lang.String, int, int, int):java.lang.String");
    }

    public static final String A08(MW1 mw1) {
        String str;
        StringWriter A0v = JTO.A0v();
        JsonWriter jsonWriter = new JsonWriter(A0v);
        String BmY = mw1.BmY();
        String BmU = mw1.BmU();
        String BMk = mw1.BMk();
        int BmG = mw1.BmG();
        String Ayq = mw1.Ayq();
        JV7 B9G = mw1.B9G();
        C42120BHy AfS = mw1.AfS();
        String AfR = mw1.AfR();
        Boolean AfN = mw1.AfN();
        String AfL = mw1.AfL();
        List AfM = mw1.AfM();
        Integer AfK = mw1.AfK();
        Boolean AfP = mw1.AfP();
        String AfQ = mw1.AfQ();
        String Bxq = mw1.Bxq();
        try {
            jsonWriter.beginObject();
            if (BmY != null) {
                JsonWriter name = jsonWriter.name("reply_id");
                AtomicBoolean atomicBoolean = 1Xj.A0i;
                name.value(1Xv.A06(BmY));
            }
            if (BmU != null) {
                JsonWriter name2 = jsonWriter.name(AnonymousClass000.A00(5185));
                AtomicBoolean atomicBoolean2 = 1Xj.A0i;
                name2.value(1Xv.A06(BmU));
            }
            if (BMk != null) {
                JTP.A12(jsonWriter, AnonymousClass000.A00(5002), BMk);
            }
            if (BmG != -1) {
                jsonWriter.name(C273654mx.A00(381)).value(Integer.valueOf(BmG));
            }
            if (AfN != null) {
                jsonWriter.name("fediverse_composer_enabled").value(AfN.booleanValue());
            }
            if (Ayq != null) {
                JTP.A12(jsonWriter, "draft_client_uuid", Ayq);
            }
            if (B9G != null) {
                str = B9G.A02;
            } else {
                str = null;
            }
            if (str != null) {
                jsonWriter.name(C66579MXk.A00(322)).value(B9G.A02);
            }
            if (AfS != null) {
                JsonWriter name3 = jsonWriter.name(AnonymousClass000.A00(4099));
                StringWriter A0v2 = JTO.A0v();
                17W A0Q = JTO.A0Q(A0v2);
                D0E.A00(A0Q, AfS);
                name3.value(JTR.A12(A0Q, A0v2));
            }
            if (AfR != null) {
                JTP.A12(jsonWriter, C273654mx.A00(394), AfR);
            }
            if (AfL != null) {
                JTP.A12(jsonWriter, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AfL);
            }
            if (AnonymousClass7TE.A1b(AfM)) {
                jsonWriter.name("excluded_inline_media_ids").value(0mh.A00(AfM));
            }
            if (AfK != null) {
                jsonWriter.name("auto_delete_after").value(AfK);
            }
            if (AfP != null) {
                jsonWriter.name("is_loop_community").value(AfP.booleanValue());
            }
            if (AfQ != null) {
                JTP.A12(jsonWriter, "loop_community_name", AfQ);
            }
            if (Bxq != null) {
                JTP.A12(jsonWriter, "ranking_info_token", Bxq);
            }
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException unused) {
        }
        return DbT.A10(A0v);
    }

    public static final String A0A(String str, int i) {
        try {
            StringWriter A0v = JTO.A0v();
            JsonWriter jsonWriter = new JsonWriter(A0v);
            jsonWriter.beginObject();
            JTP.A12(jsonWriter, "filter_type", str);
            jsonWriter.name(C273654mx.A00(2382)).value(Float.valueOf(((float) i) / 100.0f));
            jsonWriter.endObject();
            jsonWriter.close();
            return A0v.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public static final String A0B(String str, List list) {
        String str2;
        try {
            StringWriter A0v = JTO.A0v();
            JsonWriter jsonWriter = new JsonWriter(A0v);
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ClipInfo clipInfo = (ClipInfo) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("length").value(((double) JTO.A09(clipInfo)) / 1000.0d);
                JTP.A12(jsonWriter, "source_type", str);
                if (clipInfo.A0E != null) {
                    jsonWriter.name("software").value(clipInfo.A0E);
                }
                int i = clipInfo.A03;
                if (i != -1) {
                    if (i == 1) {
                        str2 = "front";
                    } else {
                        str2 = "back";
                    }
                    JTP.A12(jsonWriter, "camera_position", str2);
                }
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.close();
            return A0v.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.Jtn, java.lang.Object] */
    public static final String A0C(List list) {
        String str;
        C2802350v A002;
        C273914nO BkW;
        C273924nP r2;
        String str2;
        String str3;
        Integer num;
        C2802550x r0;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A6D a6d = (A6D) it.next();
            AnonymousClass513 r02 = a6d.A00;
            Boolean bool = null;
            if (!(r02 == null || (A002 = r02.A00()) == null || (BkW = A002.BkW()) == null || (r2 = BkW.A01) == null)) {
                if (!(A002 instanceof C2802250u) || (r0 = ((C2802250u) A002).A0D) == null) {
                    str2 = null;
                } else {
                    str2 = r0.A00;
                }
                C273924nP r1 = C273924nP.STATIC_STICKERS;
                if (r2 == r1) {
                    str3 = BkW.A00();
                } else {
                    str3 = null;
                }
                C369458un r03 = a6d.A02;
                if (r03 != null) {
                    bool = Boolean.valueOf(r03.A0D);
                }
                if (r2 == r1) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                boolean A1a = DbX.A1a(bool);
                ? obj = new Object();
                obj.A00 = num;
                obj.A01 = str3;
                obj.A03 = A1a;
                obj.A02 = str2;
                A1C.add(obj);
            }
        }
        StringWriter A0v = JTO.A0v();
        17W A0e = C51970G9q.A0e(A0v);
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            C60929Jtn jtn = (C60929Jtn) it2.next();
            A0e.A0c();
            Integer num2 = jtn.A00;
            if (num2 != null) {
                if (1 - num2.intValue() != 0) {
                    str = "text";
                } else {
                    str = "sticker";
                }
                A0e.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            String str4 = jtn.A01;
            if (str4 != null) {
                A0e.A0R("sticker_id", str4);
            }
            A0e.A0S(C273654mx.A00(323), jtn.A03);
            String str5 = jtn.A02;
            if (str5 != null) {
                A0e.A0R("text", str5);
            }
            A0e.A0Z();
        }
        return JTS.A0k(A0e, A0v);
    }

    public static final String A0D(List list) {
        StringWriter A0v = JTO.A0v();
        17W A0e = C51970G9q.A0e(A0v);
        if (AnonymousClass7TE.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LK0.A00((C61043Jvh) it.next(), A0e);
            }
        }
        return JTS.A0k(A0e, A0v);
    }

    public static final String A0E(List list) {
        StringWriter A0v = JTO.A0v();
        17W A0e = C51970G9q.A0e(A0v);
        if (AnonymousClass7TE.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C64014LJb.A00((C61079JwH) it.next(), A0e);
            }
        }
        return JTS.A0k(A0e, A0v);
    }

    public static final String A0F(List list, boolean z) {
        StringWriter A0v = JTO.A0v();
        17W A0e = C51970G9q.A0e(A0v);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0l = JTO.A0l(it);
            A0l.A04 = z;
            LJX.A00(A0e, A0l);
        }
        return JTS.A0k(A0e, A0v);
    }

    public static final void A0K(1Fb r2, C63661L1x l1x) {
        StringWriter A0v = JTO.A0v();
        17W A0Q = JTO.A0Q(A0v);
        LJG.A00(A0Q, l1x);
        r2.A9m("creator_geo_gating_info", JTR.A12(A0Q, A0v));
    }
}

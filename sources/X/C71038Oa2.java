package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Oa2  reason: case insensitive filesystem */
public final class C71038Oa2 {
    public static final List A05 = 0sr.A1P(new Integer[]{303970949, 303965077});
    public boolean A00;
    public final C16666Uz2 A01;
    public final C14068TpH A02;
    public final C16677UzD A03;
    public final String A04;

    public final synchronized void A01() {
        if (this.A00) {
            A00(615);
            02m.A0p.markerEnd(303960177, 6646);
            this.A00 = false;
        }
    }

    public final synchronized void A02(int i) {
        String A002 = AnonymousClass000.A00(3623);
        if (this.A00) {
            02m.A0p.markerPoint(i, A002);
        }
    }

    public final synchronized void A03(Boolean bool, Integer num, Integer num2, String str, Map map, int i) {
        int i2;
        String str2;
        02m r2 = 02m.A0p;
        if (num != null) {
            r2.markerAnnotate(i, "request_type", O3P.A00(num));
        }
        if (map != null) {
            r2.markerAnnotate(i, AnonymousClass9NE.A00(), DbT.A11("trigger_session_id", map));
        }
        r2.markerAnnotate(i, "container_module", this.A04);
        String A10 = DbT.A10(C21522Xdo.A00(this.A01));
        Locale locale = Locale.US;
        0qQ.A08(locale);
        r2.markerAnnotate(i, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, DbT.A12(locale, A10));
        r2.markerAnnotate(i, "location", DbT.A12(locale, DbT.A10(C21522Xdo.A01(this.A02))));
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        r2.markerAnnotate(i, "fetch_type", i2);
        if (i == 303960177) {
            switch (this.A03.ordinal()) {
                case 0:
                    str2 = "ig_media";
                    break;
                case 1:
                    str2 = "ig_comment";
                    break;
                case 2:
                    str2 = "ig_direct_message";
                    break;
                case 3:
                    str2 = "ig_direct_message_thread";
                    break;
                case 4:
                    str2 = "ig_user";
                    break;
                case 5:
                    str2 = "ig_product";
                    break;
                case 6:
                    str2 = "ig_ad";
                    break;
                case 7:
                    str2 = "ig_hashtag";
                    break;
                case 8:
                    str2 = "ig_cowatch_local_media";
                    break;
                case 9:
                    str2 = "ig_story_question_response";
                    break;
                case 10:
                    str2 = "ig_story_highlight";
                    break;
                case 11:
                    str2 = "ig_ar_effect";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str2 = "ig_song";
                    break;
                case 13:
                    str2 = "ig_fundraiser";
                    break;
                case 14:
                    str2 = "ig_guide";
                    break;
                case 15:
                    str2 = "ig_frx_object";
                    break;
                case 16:
                    str2 = "ig_room";
                    break;
                case 17:
                    str2 = "ig_encrypted_direct_message";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    str2 = "ig_live_question";
                    break;
                case 19:
                    str2 = "ig_service";
                    break;
                case 20:
                    str2 = "ig_commerce_fb_review";
                    break;
                case 21:
                    str2 = "ig_commerce_ig_review";
                    break;
                case 22:
                    str2 = "ig_commerce_review_response";
                    break;
                case 23:
                    str2 = "ig_commerce_fb_question";
                    break;
                case 24:
                    str2 = "ig_commerce_ig_question";
                    break;
                case 25:
                    str2 = "ig_commerce_platform_answer";
                    break;
                case 26:
                    str2 = "ig_commerce_external_question";
                    break;
                case 27:
                    str2 = "ig_commerce_external_answer";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    str2 = "ig_location_page";
                    break;
                case 30:
                    str2 = "ig_canvas";
                    break;
                case 31:
                    str2 = "ig_prompt";
                    break;
                case 33:
                    str2 = "ig_igd_prompt";
                    break;
                case 34:
                    str2 = "ig_igd_prompt_response";
                    break;
                case 35:
                    str2 = "ig_third_party_app";
                    break;
                case 36:
                    str2 = "igd_shared_stack_single_attachment";
                    break;
                case 37:
                    str2 = "ig_generated_content";
                    break;
                case 38:
                    str2 = "ig_reuse_text";
                    break;
                case 39:
                    str2 = "ig_event";
                    break;
                case 40:
                    str2 = "ig_gen_ai_magic_mod";
                    break;
                case Seq.NULL_REFNUM:
                    str2 = "ig_text_app_keyword";
                    break;
                case Seq.RefTracker.REF_OFFSET:
                    str2 = "ig_gen_ai_retexturing";
                    break;
                case 43:
                    str2 = "ig_collection";
                    break;
                case 45:
                    str2 = "ig_thread_theme";
                    break;
                case 48:
                    str2 = "ig_world_pages";
                    break;
                default:
                    throw AnonymousClass7TE.A0w("Unsupported FRXObject type");
            }
            r2.markerAnnotate(i, TraceFieldType.ContentType, str2);
            r2.markerAnnotate(i, "locale", AnonymousClass1Q2.A03().getLanguage());
        } else {
            r2.markerAnnotate(i, "object_type", this.A03.toString());
            if (str == null) {
                str = "[]";
            }
            r2.markerAnnotate(i, "selected_tags", str);
            if (bool != null) {
                r2.markerAnnotate(i, "is_bloks", bool.booleanValue());
            }
        }
    }

    public final synchronized void A04(Integer num, String str, boolean z) {
        synchronized (this) {
            if (this.A00) {
                A00(111);
            }
            this.A00 = true;
            02m.A0p.markerStart(303965077);
            A03(Boolean.valueOf(z), num, (Integer) null, str, (Map) null, 303965077);
        }
    }

    public final synchronized void A05(short s) {
        if (this.A00) {
            A00(s);
            this.A00 = false;
        }
    }

    public static final void A00(short s) {
        02m r2 = 02m.A0p;
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            r2.markerEnd(AnonymousClass7TG.A0F(it), s);
        }
    }

    public C71038Oa2(C16666Uz2 uz2, C14068TpH tpH, C16677UzD uzD, String str) {
        C51974G9v.A1P(str, uz2, tpH, uzD);
        this.A04 = str;
        this.A01 = uz2;
        this.A02 = tpH;
        this.A03 = uzD;
    }
}

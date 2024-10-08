package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CV9 {
    public static Map A00(C239663Hm r5) {
        List list;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        String str;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str2;
        List list2;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI9 = null;
        if (r5.AaD() != null) {
            AnonymousClass3ZV AaD = r5.AaD();
            if (AaD != null) {
                treeUpdaterJNI8 = AaD.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1H.put("affiliate_info", treeUpdaterJNI8);
        }
        if (r5.Ai1() != null) {
            C277964w1 Ai1 = r5.Ai1();
            if (Ai1 != null) {
                treeUpdaterJNI7 = Ai1.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1H.put("broadcast_experiments", treeUpdaterJNI7);
        }
        if (r5.Ai2() != null) {
            A1H.put(TraceFieldType.BroadcastId, r5.Ai2());
        }
        if (r5.Ai4() != null) {
            A1H.put("broadcast_message", r5.Ai4());
        }
        User Ai5 = r5.Ai5();
        if (Ai5 != null) {
            A1H.put("broadcast_owner", Ai5.A08());
        }
        if (r5.Ai6() != null) {
            A1H.put("broadcast_prompt", r5.Ai6());
        }
        if (r5.Ai7() != null) {
            A1H.put("broadcast_status", r5.Ai7());
        }
        if (r5.Amw() != null) {
            C278064wB Amw = r5.Amw();
            if (Amw != null) {
                treeUpdaterJNI6 = Amw.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1H.put("charity_info", treeUpdaterJNI6);
        }
        if (r5.An0() != null) {
            List<DTG> An0 = r5.An0();
            if (An0 != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(An0);
                for (DTG dtg : An0) {
                    if (dtg != null) {
                        treeUpdaterJNI5 = dtg.FHC();
                    } else {
                        treeUpdaterJNI5 = null;
                    }
                    A0p.add(treeUpdaterJNI5);
                }
                list2 = 00k.A0X(A0p);
            } else {
                list2 = null;
            }
            A1H.put("chat_info", list2);
        }
        List AoU = r5.AoU();
        if (AoU != null) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(AoU);
            Iterator it = AoU.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0p2, it);
            }
            A1H.put("cobroadcasters", A0p2);
        }
        if (r5.ArQ() != null) {
            A1H.put("copyright_violation", r5.ArQ());
        }
        if (r5.Ars() != null) {
            A1H.put("cover_frame_url", r5.Ars());
        }
        if (r5.Au1() != null) {
            IGLiveGames Au1 = r5.Au1();
            if (Au1 != null) {
                str2 = Au1.A00;
            } else {
                str2 = null;
            }
            A1H.put(C273654mx.A00(2228), str2);
        }
        if (r5.Av7() != null) {
            A1H.put("dash_abr_playback_url", r5.Av7());
        }
        if (r5.getDashManifest() != null) {
            A1H.put("dash_manifest", r5.getDashManifest());
        }
        if (r5.Av9() != null) {
            A1H.put("dash_playback_url", r5.Av9());
        }
        if (r5.Ax5() != null) {
            C277454vC Ax5 = r5.Ax5();
            if (Ax5 != null) {
                treeUpdaterJNI4 = Ax5.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("dimensions_typed", treeUpdaterJNI4);
        }
        if (r5.B1P() != null) {
            A1H.put("encoding_tag", r5.B1P());
        }
        if (r5.B2j() != null) {
            A1H.put("expire_at", r5.B2j());
        }
        if (r5.B3y() != null) {
            A1H.put("fan_club_subscribe_enabled", r5.B3y());
        }
        if (r5.B8u() != null) {
            IGLiveGameStatus B8u = r5.B8u();
            if (B8u != null) {
                str = B8u.A00;
            } else {
                str = null;
            }
            A1H.put("game_status", str);
        }
        if (r5.B8w() != null) {
            C278084wF B8w = r5.B8w();
            if (B8w != null) {
                treeUpdaterJNI3 = B8w.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("gating", treeUpdaterJNI3);
        }
        if (r5.BDA() != null) {
            A1H.put("hide_from_feed_unit", r5.BDA());
        }
        if (r5.BEY() != null) {
            C41845B3m.A0x(r5.BEY(), A1H);
        }
        if (r5.BFo() != null) {
            A1H.put("igtv_post_id", r5.BFo());
        }
        if (r5.BGv() != null) {
            A1H.put("index_position_in_response", r5.BGv());
        }
        if (r5.BIT() != null) {
            A1H.put("internal_only", r5.BIT());
        }
        if (r5.CSr() != null) {
            A1H.put("is_exclusive_live", r5.CSr());
        }
        if (r5.CTl() != null) {
            A1H.put("is_fit_green", r5.CTl());
        }
        if (r5.CWS() != null) {
            A1H.put(C273654mx.A00(318), r5.CWS());
        }
        if (r5.CWT() != null) {
            A1H.put(C273654mx.A00(319), r5.CWT());
        }
        if (r5.CYW() != null) {
            A1H.put(C273654mx.A00(2934), r5.CYW());
        }
        if (r5.CZM() != null) {
            A1H.put("is_player_live_trace_enabled", r5.CZM());
        }
        if (r5.CbE() != null) {
            A1H.put("is_scheduled_live", r5.CbE());
        }
        if (r5.Ced() != null) {
            A1H.put("is_viewer_comment_allowed", r5.Ced());
        }
        if (r5.BNN() != null) {
            A1H.put("live_post_id", r5.BNN());
        }
        if (r5.getMediaId() != null) {
            C41845B3m.A13(r5.getMediaId(), A1H);
        }
        if (r5.BQf() != null) {
            C277994w4 BQf = r5.BQf();
            if (BQf != null) {
                treeUpdaterJNI2 = BQf.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("media_overlay_info", treeUpdaterJNI2);
        }
        if (r5.BVB() != null) {
            A1H.put("muted", r5.BVB());
        }
        if (r5.BXW() != null) {
            A1H.put("number_of_qualities", r5.BXW());
        }
        if (r5.getOrganicTrackingToken() != null) {
            A1H.put("organic_tracking_token", r5.getOrganicTrackingToken());
        }
        if (r5.BdK() != null) {
            A1H.put("playlist", r5.BdK());
        }
        if (r5.getPreview() != null) {
            A1H.put("preview", r5.getPreview());
        }
        if (r5.Bhb() != null) {
            A1H.put("progressive_playback_url", r5.Bhb());
        }
        if (r5.BiJ() != null) {
            A1H.put("published_time", r5.BiJ());
        }
        if (r5.Bif() != null) {
            A1H.put("question_pk", r5.Bif());
        }
        if (r5.BjH() != null) {
            A1H.put("ranked_position", r5.BjH());
        }
        if (r5.Bnq() != null) {
            A1H.put("response_timestamp", r5.Bnq());
        }
        if (r5.BrI() != null) {
            A1H.put("seen_ranked_position", r5.BrI());
        }
        if (r5.Bv7() != null) {
            A1H.put("show_bff_upsell", r5.Bv7());
        }
        if (r5.BwZ() != null) {
            A1H.put("simulcast_fb_broadcast_id", r5.BwZ());
        }
        if (r5.getSponsorTags() != null) {
            List<AnonymousClass536> sponsorTags = r5.getSponsorTags();
            if (sponsorTags != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(sponsorTags);
                for (AnonymousClass536 r0 : sponsorTags) {
                    if (r0 != null) {
                        treeUpdaterJNI = r0.FHC();
                    } else {
                        treeUpdaterJNI = null;
                    }
                    A0p3.add(treeUpdaterJNI);
                }
                list = 00k.A0X(A0p3);
            } else {
                list = null;
            }
            A1H.put("sponsor_tags", list);
        }
        if (r5.C1b() != null) {
            A1H.put(C273654mx.A00(3381), r5.C1b());
        }
        if (r5.C2x() != null) {
            A1H.put("sup_active", r5.C2x());
        }
        if (r5.C8s() != null) {
            A1H.put("total_unique_viewer_count", r5.C8s());
        }
        if (r5.CBq() != null) {
            A1H.put("unseen_media_ids", r5.CBq());
        }
        if (r5.CCt() != null) {
            C278104wH CCt = r5.CCt();
            if (CCt != null) {
                treeUpdaterJNI9 = CCt.FHC();
            }
            A1H.put("user_pay_viewer_config", treeUpdaterJNI9);
        }
        if (r5.CE0() != null) {
            A1H.put("video_duration", r5.CE0());
        }
        if (r5.CEy() != null) {
            A1H.put("viewer_count", r5.CEy());
        }
        List CF0 = r5.CF0();
        if (CF0 != null) {
            ArrayList A0p4 = AnonymousClass7TF.A0p(CF0);
            Iterator it2 = CF0.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1T(A0p4, it2);
            }
            A1H.put("viewer_count_avatars", A0p4);
        }
        if (r5.CFW() != null) {
            A1H.put("visibility", r5.CFW());
        }
        return 0Yt.A0B(A1H);
    }
}

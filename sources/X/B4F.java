package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4F {
    public static Map A01(C65211bM r6) {
        String str;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = null;
        if (r6.AeJ() != null) {
            C269804fi AeJ = r6.AeJ();
            if (AeJ != null) {
                treeUpdaterJNI6 = AeJ.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            linkedHashMap.put("avatar_media_info", treeUpdaterJNI6);
        }
        if (r6.getBackgroundColor() != null) {
            linkedHashMap.put("background_color", r6.getBackgroundColor());
        }
        if (r6.Aei() != null) {
            linkedHashMap.put("background_color_alpha", r6.Aei());
        }
        if (r6.Akw() != null) {
            linkedHashMap.put("can_viewer_hide", r6.Akw());
        }
        if (r6.Al5() != null) {
            linkedHashMap.put("can_viewer_unhide", r6.Al5());
        }
        if (r6.AlN() != null) {
            C269824fk AlN = r6.AlN();
            if (AlN != null) {
                treeUpdaterJNI5 = AlN.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            linkedHashMap.put("caption_area", treeUpdaterJNI5);
        }
        if (r6.Aln() != null) {
            List<DT9> Aln = r6.Aln();
            if (Aln != null) {
                arrayList3 = new ArrayList();
                for (DT9 dt9 : Aln) {
                    if (dt9 != null) {
                        arrayList3.add(dt9.FHC());
                    }
                }
            } else {
                arrayList3 = null;
            }
            linkedHashMap.put(AnonymousClass000.A00(541), arrayList3);
        }
        if (r6.AnF() != null) {
            linkedHashMap.put("child_comment_count", r6.AnF());
        }
        if (r6.AnG() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1167), r6.AnG());
        }
        if (r6.ApE() != null) {
            linkedHashMap.put("comment_has_a_visual_reply_media", r6.ApE());
        }
        if (r6.ApF() != null) {
            linkedHashMap.put("comment_index", r6.ApF());
        }
        if (r6.ApI() != null) {
            linkedHashMap.put("comment_like_count", r6.ApI());
        }
        List<User> ApM = r6.ApM();
        if (ApM != null) {
            ArrayList arrayList4 = new ArrayList(0Yv.A1E(ApM, 10));
            for (User A08 : ApM) {
                arrayList4.add(A08.A08());
            }
            linkedHashMap.put("comment_social_context_likers", arrayList4);
        }
        if (r6.AsC() != null) {
            linkedHashMap.put("created_at", r6.AsC());
        }
        if (r6.AsE() != null) {
            linkedHashMap.put("created_at_utc", r6.AsE());
        }
        if (r6.Avm() != null) {
            linkedHashMap.put("default_caption", r6.Avm());
        }
        if (r6.Awx() != null) {
            linkedHashMap.put("did_report_as_spam", r6.Awx());
        }
        if (r6.AyN() != null) {
            linkedHashMap.put("distinct_emojis_used", r6.AyN());
        }
        List<User> Azi = r6.Azi();
        if (Azi != null) {
            ArrayList arrayList5 = new ArrayList(0Yv.A1E(Azi, 10));
            for (User A082 : Azi) {
                arrayList5.add(A082.A08());
            }
            linkedHashMap.put("e2ee_mentioned_user_list", arrayList5);
        }
        if (r6.B4I() != null) {
            List<C46277DTg> B4I = r6.B4I();
            if (B4I != null) {
                arrayList2 = new ArrayList();
                for (C46277DTg dTg : B4I) {
                    if (dTg != null) {
                        arrayList2.add(dTg.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            linkedHashMap.put("fb_mentioned_users", arrayList2);
        }
        if (r6.B6C() != null) {
            linkedHashMap.put("first_sentence_length", r6.B6C());
        }
        if (r6.B9K() != null) {
            CommentGiphyMediaInfoIntf B9K = r6.B9K();
            if (B9K != null) {
                treeUpdaterJNI4 = B9K.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            linkedHashMap.put("giphy_media_info", treeUpdaterJNI4);
        }
        if (r6.BBU() != null) {
            linkedHashMap.put("has_liked_comment", r6.BBU());
        }
        if (r6.BBa() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1398), r6.BBa());
        }
        if (r6.BBc() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1399), r6.BBc());
        }
        if (r6.BCJ() != null) {
            linkedHashMap.put("has_translation", r6.BCJ());
        }
        if (r6.BDL() != null) {
            linkedHashMap.put("hide_username", r6.BDL());
        }
        if (r6.BEd() != null) {
            linkedHashMap.put(AnonymousClass000.A00(300), r6.BEd());
        }
        if (r6.BGS() != null) {
            C269834fl BGS = r6.BGS();
            if (BGS != null) {
                treeUpdaterJNI3 = BGS.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("imagine_create_media_info", treeUpdaterJNI3);
        }
        if (r6.BHF() != null) {
            ClientDisplayMethod BHF = r6.BHF();
            if (BHF != null) {
                str2 = BHF.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put("inline_composer_display_condition", str2);
        }
        if (r6.CQf() != null) {
            linkedHashMap.put("is_covered", r6.CQf());
        }
        if (r6.CQg() != null) {
            linkedHashMap.put("is_created_by_media_owner", r6.CQg());
        }
        if (r6.CUE() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1514), r6.CUE());
        }
        if (r6.CUi() != null) {
            linkedHashMap.put("is_high_value", r6.CUi());
        }
        if (r6.CWH() != null) {
            linkedHashMap.put("is_liked_by_media_owner", r6.CWH());
        }
        if (r6.CWI() != null) {
            linkedHashMap.put("is_limited", r6.CWI());
        }
        if (r6.CYC() != null) {
            linkedHashMap.put("is_new", r6.CYC());
        }
        if (r6.CZ8() != null) {
            linkedHashMap.put("is_pinned", r6.CZ8());
        }
        if (r6.CaE() != null) {
            linkedHashMap.put("is_question", r6.CaE());
        }
        if (r6.CaL() != null) {
            linkedHashMap.put("is_ranked_comment", r6.CaL());
        }
        if (r6.Cef() != null) {
            linkedHashMap.put("is_viewer_followed_by_comment_author", r6.Cef());
        }
        if (r6.BKF() != null) {
            C269854fn BKF = r6.BKF();
            if (BKF != null) {
                treeUpdaterJNI2 = BKF.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("keyword_highlight_info", treeUpdaterJNI2);
        }
        if (r6.BPo() != null) {
            linkedHashMap.put("media_code", r6.BPo());
        }
        if (r6.getMediaId() != null) {
            linkedHashMap.put("media_id", r6.getMediaId());
        }
        if (r6.BQL() != null) {
            C269874fp BQL = r6.BQL();
            if (BQL != null) {
                treeUpdaterJNI = BQL.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("media_info", treeUpdaterJNI);
        }
        Map BRh = r6.BRh();
        if (BRh != null) {
            linkedHashMap.put("mention_user_list", BRh);
        }
        if (r6.BWE() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1616), r6.BWE());
        }
        if (r6.BWF() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1617), r6.BWF());
        }
        if (r6.BWu() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1645), r6.BWu());
        }
        if (r6.BXJ() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1647), r6.BXJ());
        }
        if (r6.BaV() != null) {
            linkedHashMap.put("parent_comment_id", r6.BaV());
        }
        if (r6.BaW() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1667), r6.BaW());
        }
        if (r6.getPk() != null) {
            linkedHashMap.put("pk", r6.getPk());
        }
        if (r6.Bev() != null) {
            List<C65211bM> Bev = r6.Bev();
            if (Bev != null) {
                arrayList = new ArrayList();
                for (C65211bM r0 : Bev) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("preview_child_comments", arrayList);
        }
        if (r6.Bfr() != null) {
            PrivateReplyStatus Bfr = r6.Bfr();
            if (Bfr != null) {
                str = Bfr.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("private_reply_status", str);
        }
        if (r6.Bm8() != null) {
            linkedHashMap.put("replied_to_comment_id", r6.Bm8());
        }
        if (r6.Bnw() != null) {
            CommentRestrictStatus Bnw = r6.Bnw();
            if (Bnw != null) {
                str3 = Bnw.A00;
            }
            linkedHashMap.put("restricted_status", str3);
        }
        if (r6.BvL() != null) {
            linkedHashMap.put("show_fanclub_badge", r6.BvL());
        }
        if (r6.Bvr() != null) {
            linkedHashMap.put("show_reshare_nudge", r6.Bvr());
        }
        if (r6.getText() != null) {
            linkedHashMap.put("text", r6.getText());
        }
        if (r6.getTextColor() != null) {
            linkedHashMap.put("text_color", r6.getTextColor());
        }
        if (r6.C5c() != null) {
            linkedHashMap.put("text_size", r6.C5c());
        }
        if (r6.CAf() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6.CAf());
        }
        User CCd = r6.CCd();
        if (CCd != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CCd.A08());
        }
        return 0Yt.A0B(linkedHashMap);
    }

    public static C65211bM A00(C65211bM r127, C65211bM r128) {
        TreeJNI treeJNI;
        BEL bel;
        C269814fj r72;
        ArrayList arrayList;
        CommentGiphyMediaInfo commentGiphyMediaInfo;
        BEN ben;
        C269844fm r73;
        C269864fo r71;
        HashMap hashMap;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        ArrayList arrayList7;
        String str2;
        String str3;
        C65211bM r0 = r128;
        0qQ.A0B(r0, 1);
        C65211bM r67 = r127;
        C269804fi AeJ = r67.AeJ();
        String backgroundColor = r67.getBackgroundColor();
        String Aei = r67.Aei();
        Boolean Akw = r67.Akw();
        Boolean Al5 = r67.Al5();
        C269824fk AlN = r67.AlN();
        List<DT9> Aln = r67.Aln();
        Integer AnF = r67.AnF();
        Integer AnG = r67.AnG();
        Boolean ApE = r67.ApE();
        Integer ApF = r67.ApF();
        Integer ApI = r67.ApI();
        List ApM = r67.ApM();
        Long AsC = r67.AsC();
        Long AsE = r67.AsE();
        String Avm = r67.Avm();
        Boolean Awx = r67.Awx();
        List AyN = r67.AyN();
        List Azi = r67.Azi();
        List<C46277DTg> B4I = r67.B4I();
        Integer B6C = r67.B6C();
        CommentGiphyMediaInfoIntf B9K = r67.B9K();
        Boolean BBU = r67.BBU();
        Boolean BBa = r67.BBa();
        Boolean BBc = r67.BBc();
        Boolean BCJ = r67.BCJ();
        Boolean BDL = r67.BDL();
        String BEd = r67.BEd();
        C269834fl BGS = r67.BGS();
        ClientDisplayMethod BHF = r67.BHF();
        Boolean CQf = r67.CQf();
        Boolean CQg = r67.CQg();
        Boolean CUE = r67.CUE();
        Boolean CUi = r67.CUi();
        Boolean CWH = r67.CWH();
        Boolean CWI = r67.CWI();
        Boolean CYC = r67.CYC();
        Boolean CZ8 = r67.CZ8();
        Boolean CaE = r67.CaE();
        Boolean CaL = r67.CaL();
        Boolean Cef = r67.Cef();
        C269854fn BKF = r67.BKF();
        String BPo = r67.BPo();
        String mediaId = r67.getMediaId();
        C269874fp BQL = r67.BQL();
        Map BRh = r67.BRh();
        String BWE = r67.BWE();
        String BWF = r67.BWF();
        Integer BWu = r67.BWu();
        Integer BXJ = r67.BXJ();
        String BaV = r67.BaV();
        Integer BaW = r67.BaW();
        String pk = r67.getPk();
        List Bev = r67.Bev();
        PrivateReplyStatus Bfr = r67.Bfr();
        String Bm8 = r67.Bm8();
        CommentRestrictStatus Bnw = r67.Bnw();
        Boolean BvL = r67.BvL();
        Boolean Bvr = r67.Bvr();
        String text = r67.getText();
        String textColor = r67.getTextColor();
        Integer C5c = r67.C5c();
        Integer CAf = r67.CAf();
        User CCd = r67.CCd();
        if (r0.AeJ() != null) {
            AeJ = r0.AeJ();
        }
        if (r0.getBackgroundColor() != null) {
            backgroundColor = r0.getBackgroundColor();
        }
        if (r0.Aei() != null) {
            Aei = r0.Aei();
        }
        if (r0.Akw() != null) {
            Akw = r0.Akw();
        }
        if (r0.Al5() != null) {
            Al5 = r0.Al5();
        }
        if (r0.AlN() != null) {
            AlN = r0.AlN();
        }
        if (r0.Aln() != null) {
            Aln = r0.Aln();
        }
        if (r0.AnF() != null) {
            AnF = r0.AnF();
        }
        if (r0.AnG() != null) {
            AnG = r0.AnG();
        }
        if (r0.ApE() != null) {
            ApE = r0.ApE();
        }
        if (r0.ApF() != null) {
            ApF = r0.ApF();
        }
        if (r0.ApI() != null) {
            ApI = r0.ApI();
        }
        List ApM2 = r0.ApM();
        if (ApM2 != null) {
            ApM = ApM2;
        }
        if (r0.AsC() != null) {
            AsC = r0.AsC();
        }
        if (r0.AsE() != null) {
            AsE = r0.AsE();
        }
        if (r0.Avm() != null) {
            Avm = r0.Avm();
        }
        if (r0.Awx() != null) {
            Awx = r0.Awx();
        }
        if (r0.AyN() != null) {
            AyN = r0.AyN();
        }
        List Azi2 = r0.Azi();
        if (Azi2 != null) {
            Azi = Azi2;
        }
        if (r0.B4I() != null) {
            B4I = r0.B4I();
        }
        if (r0.B6C() != null) {
            B6C = r0.B6C();
        }
        if (r0.B9K() != null) {
            B9K = r0.B9K();
        }
        if (r0.BBU() != null) {
            BBU = r0.BBU();
        }
        if (r0.BBa() != null) {
            BBa = r0.BBa();
        }
        if (r0.BBc() != null) {
            BBc = r0.BBc();
        }
        if (r0.BCJ() != null) {
            BCJ = r0.BCJ();
        }
        if (r0.BDL() != null) {
            BDL = r0.BDL();
        }
        if (r0.BEd() != null) {
            BEd = r0.BEd();
        }
        if (r0.BGS() != null) {
            BGS = r0.BGS();
        }
        if (r0.BHF() != null) {
            BHF = r0.BHF();
        }
        if (r0.CQf() != null) {
            CQf = r0.CQf();
        }
        if (r0.CQg() != null) {
            CQg = r0.CQg();
        }
        if (r0.CUE() != null) {
            CUE = r0.CUE();
        }
        if (r0.CUi() != null) {
            CUi = r0.CUi();
        }
        if (r0.CWH() != null) {
            CWH = r0.CWH();
        }
        if (r0.CWI() != null) {
            CWI = r0.CWI();
        }
        if (r0.CYC() != null) {
            CYC = r0.CYC();
        }
        if (r0.CZ8() != null) {
            CZ8 = r0.CZ8();
        }
        if (r0.CaE() != null) {
            CaE = r0.CaE();
        }
        if (r0.CaL() != null) {
            CaL = r0.CaL();
        }
        if (r0.Cef() != null) {
            Cef = r0.Cef();
        }
        if (r0.BKF() != null) {
            BKF = r0.BKF();
        }
        if (r0.BPo() != null) {
            BPo = r0.BPo();
        }
        if (r0.getMediaId() != null) {
            mediaId = r0.getMediaId();
        }
        if (r0.BQL() != null) {
            BQL = r0.BQL();
        }
        Map BRh2 = r0.BRh();
        if (BRh2 != null) {
            BRh = BRh2;
        }
        if (r0.BWE() != null) {
            BWE = r0.BWE();
        }
        if (r0.BWF() != null) {
            BWF = r0.BWF();
        }
        if (r0.BWu() != null) {
            BWu = r0.BWu();
        }
        if (r0.BXJ() != null) {
            BXJ = r0.BXJ();
        }
        if (r0.BaV() != null) {
            BaV = r0.BaV();
        }
        if (r0.BaW() != null) {
            BaW = r0.BaW();
        }
        if (r0.getPk() != null) {
            pk = r0.getPk();
        }
        if (r0.Bev() != null) {
            Bev = r0.Bev();
        }
        if (r0.Bfr() != null) {
            Bfr = r0.Bfr();
        }
        if (r0.Bm8() != null) {
            Bm8 = r0.Bm8();
        }
        if (r0.Bnw() != null) {
            Bnw = r0.Bnw();
        }
        if (r0.BvL() != null) {
            BvL = r0.BvL();
        }
        if (r0.Bvr() != null) {
            Bvr = r0.Bvr();
        }
        if (r0.getText() != null) {
            text = r0.getText();
        }
        if (r0.getTextColor() != null) {
            textColor = r0.getTextColor();
        }
        if (r0.C5c() != null) {
            C5c = r0.C5c();
        }
        if (r0.CAf() != null) {
            CAf = r0.CAf();
        }
        User CCd2 = r0.CCd();
        if (CCd2 != null) {
            CCd = CCd2;
        }
        TreeUpdaterJNI treeUpdaterJNI7 = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        if (r67 instanceof C41895B5q) {
            0eP[] r6 = new 0eP[64];
            if (AeJ != null) {
                treeUpdaterJNI = AeJ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L = AnonymousClass7TE.A1L("avatar_media_info", treeUpdaterJNI);
            0eP A1L2 = AnonymousClass7TE.A1L("background_color", backgroundColor);
            0eP A1L3 = AnonymousClass7TE.A1L("background_color_alpha", Aei);
            0eP A1L4 = AnonymousClass7TE.A1L("can_viewer_hide", Akw);
            0eP A1L5 = AnonymousClass7TE.A1L("can_viewer_unhide", Al5);
            if (AlN != null) {
                treeUpdaterJNI2 = AlN.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP A1L6 = AnonymousClass7TE.A1L("caption_area", treeUpdaterJNI2);
            if (Aln != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                for (DT9 dt9 : Aln) {
                    if (dt9 != null) {
                        arrayList3.add(dt9.FHC());
                    }
                }
            } else {
                arrayList3 = null;
            }
            0eP A1L7 = AnonymousClass7TE.A1L(AnonymousClass000.A00(541), arrayList3);
            0eP A1L8 = AnonymousClass7TE.A1L("child_comment_count", AnF);
            0eP A1L9 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1167), AnG);
            0eP A1L10 = AnonymousClass7TE.A1L("comment_has_a_visual_reply_media", ApE);
            0eP A1L11 = AnonymousClass7TE.A1L("comment_index", ApF);
            0eP A1L12 = AnonymousClass7TE.A1L("comment_like_count", ApI);
            if (ApM != null) {
                arrayList4 = AnonymousClass7TF.A0p(ApM);
                Iterator it = ApM.iterator();
                while (it.hasNext()) {
                    C41846B3n.A1T(arrayList4, it);
                }
            } else {
                arrayList4 = null;
            }
            0eP A1L13 = AnonymousClass7TE.A1L("comment_social_context_likers", arrayList4);
            0eP A1L14 = AnonymousClass7TE.A1L("created_at", AsC);
            0eP A1L15 = AnonymousClass7TE.A1L("created_at_utc", AsE);
            0eP A1L16 = AnonymousClass7TE.A1L("default_caption", Avm);
            0eP A1L17 = AnonymousClass7TE.A1L("did_report_as_spam", Awx);
            0eP A1L18 = AnonymousClass7TE.A1L("distinct_emojis_used", AyN);
            if (Azi != null) {
                arrayList5 = AnonymousClass7TF.A0p(Azi);
                Iterator it2 = Azi.iterator();
                while (it2.hasNext()) {
                    C41846B3n.A1T(arrayList5, it2);
                }
            } else {
                arrayList5 = null;
            }
            0eP A1L19 = AnonymousClass7TE.A1L("e2ee_mentioned_user_list", arrayList5);
            if (B4I != null) {
                arrayList6 = AnonymousClass7TE.A1C();
                for (C46277DTg dTg : B4I) {
                    if (dTg != null) {
                        arrayList6.add(dTg.FHC());
                    }
                }
            } else {
                arrayList6 = null;
            }
            0eP A1L20 = AnonymousClass7TE.A1L("fb_mentioned_users", arrayList6);
            0eP A1L21 = AnonymousClass7TE.A1L("first_sentence_length", B6C);
            if (B9K != null) {
                treeUpdaterJNI3 = B9K.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            System.arraycopy(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, AnonymousClass7TE.A1L("giphy_media_info", treeUpdaterJNI3), AnonymousClass7TE.A1L("has_liked_comment", BBU), AnonymousClass7TE.A1L(AnonymousClass000.A00(1398), BBa), AnonymousClass7TE.A1L(AnonymousClass000.A00(1399), BBc), AnonymousClass7TE.A1L("has_translation", BCJ), AnonymousClass7TE.A1L("hide_username", BDL)}, 0, r6, 0, 27);
            0eP A1L22 = AnonymousClass7TE.A1L(AnonymousClass000.A00(300), BEd);
            if (BGS != null) {
                treeUpdaterJNI4 = BGS.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            0eP A1L23 = AnonymousClass7TE.A1L("imagine_create_media_info", treeUpdaterJNI4);
            if (BHF != null) {
                str = BHF.A00;
            } else {
                str = null;
            }
            0eP A1L24 = AnonymousClass7TE.A1L("inline_composer_display_condition", str);
            0eP A1L25 = AnonymousClass7TE.A1L("is_covered", CQf);
            0eP A1L26 = AnonymousClass7TE.A1L("is_created_by_media_owner", CQg);
            0eP A1L27 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1514), CUE);
            0eP A1L28 = AnonymousClass7TE.A1L("is_high_value", CUi);
            0eP A1L29 = AnonymousClass7TE.A1L("is_liked_by_media_owner", CWH);
            0eP A1L30 = AnonymousClass7TE.A1L("is_limited", CWI);
            0eP A1L31 = AnonymousClass7TE.A1L("is_new", CYC);
            0eP A1L32 = AnonymousClass7TE.A1L("is_pinned", CZ8);
            0eP A1L33 = AnonymousClass7TE.A1L("is_question", CaE);
            0eP A1L34 = AnonymousClass7TE.A1L("is_ranked_comment", CaL);
            0eP A1L35 = AnonymousClass7TE.A1L("is_viewer_followed_by_comment_author", Cef);
            if (BKF != null) {
                treeUpdaterJNI5 = BKF.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            0eP A1L36 = AnonymousClass7TE.A1L("keyword_highlight_info", treeUpdaterJNI5);
            0eP A1L37 = AnonymousClass7TE.A1L("media_code", BPo);
            0eP A1L38 = AnonymousClass7TE.A1L("media_id", mediaId);
            if (BQL != null) {
                treeUpdaterJNI6 = BQL.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            0eP A1L39 = AnonymousClass7TE.A1L("media_info", treeUpdaterJNI6);
            0eP A1L40 = AnonymousClass7TE.A1L("mention_user_list", BRh);
            0eP A1L41 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1616), BWE);
            0eP A1L42 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1617), BWF);
            0eP A1L43 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1645), BWu);
            0eP A1L44 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1647), BXJ);
            0eP A1L45 = AnonymousClass7TE.A1L("parent_comment_id", BaV);
            0eP A1L46 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1667), BaW);
            0eP A1L47 = AnonymousClass7TE.A1L("pk", pk);
            if (Bev != null) {
                arrayList7 = AnonymousClass7TE.A1C();
                Iterator it3 = Bev.iterator();
                while (it3.hasNext()) {
                    C41847B3o.A1W(arrayList7, it3);
                }
            } else {
                arrayList7 = null;
            }
            System.arraycopy(new 0eP[]{A1L22, A1L23, A1L24, A1L25, A1L26, A1L27, A1L28, A1L29, A1L30, A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, A1L38, A1L39, A1L40, A1L41, A1L42, A1L43, A1L44, A1L45, A1L46, A1L47, AnonymousClass7TE.A1L("preview_child_comments", arrayList7)}, 0, r6, 27, 27);
            if (Bfr != null) {
                str2 = Bfr.A00;
            } else {
                str2 = null;
            }
            0eP A1L48 = AnonymousClass7TE.A1L("private_reply_status", str2);
            0eP A1L49 = AnonymousClass7TE.A1L("replied_to_comment_id", Bm8);
            if (Bnw != null) {
                str3 = Bnw.A00;
            } else {
                str3 = null;
            }
            0eP A1L50 = AnonymousClass7TE.A1L("restricted_status", str3);
            0eP A1L51 = AnonymousClass7TE.A1L("show_fanclub_badge", BvL);
            0eP A1L52 = AnonymousClass7TE.A1L("show_reshare_nudge", Bvr);
            0eP A1L53 = AnonymousClass7TE.A1L("text", text);
            0eP A1L54 = AnonymousClass7TE.A1L("text_color", textColor);
            0eP A1L55 = AnonymousClass7TE.A1L("text_size", C5c);
            0eP A1L56 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, CAf);
            if (CCd != null) {
                treeUpdaterJNI7 = CCd.A08();
            }
            System.arraycopy(new 0eP[]{A1L48, A1L49, A1L50, A1L51, A1L52, A1L53, A1L54, A1L55, A1L56, AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, treeUpdaterJNI7)}, 0, r6, 54, 10);
            treeJNI = C41847B3o.A0o(r67, r6);
        } else {
            1E9 r62 = new 1E9(new 1hu((UserSession) null), 6, false);
            if (AeJ != null) {
                bel = AeJ.F1u();
            } else {
                bel = null;
            }
            if (AlN != null) {
                r72 = AlN.FF8();
            } else {
                r72 = null;
            }
            if (Aln != null) {
                treeUpdaterJNI7 = AnonymousClass7TF.A0p(Aln);
                for (DT9 F1E : Aln) {
                    treeUpdaterJNI7.add(F1E.F1E());
                }
            }
            if (B4I != null) {
                arrayList = AnonymousClass7TF.A0p(B4I);
                for (C46277DTg F30 : B4I) {
                    arrayList.add(F30.F30());
                }
            } else {
                arrayList = null;
            }
            if (B9K != null) {
                commentGiphyMediaInfo = B9K.F1x();
            } else {
                commentGiphyMediaInfo = null;
            }
            if (BGS != null) {
                ben = BGS.F1y();
            } else {
                ben = null;
            }
            if (BKF != null) {
                r73 = BKF.FFB();
            } else {
                r73 = null;
            }
            if (BQL != null) {
                r71 = BQL.FDx(r62);
            } else {
                r71 = null;
            }
            if (BRh != null) {
                hashMap = new HashMap(BRh);
            } else {
                hashMap = null;
            }
            if (Bev != null) {
                arrayList2 = AnonymousClass7TF.A0p(Bev);
                Iterator it4 = Bev.iterator();
                while (it4.hasNext()) {
                    C41846B3n.A1H(r62, arrayList2, it4);
                }
            } else {
                arrayList2 = null;
            }
            treeJNI = new 1bK(BHF, bel, commentGiphyMediaInfo, ben, Bnw, Bfr, r71, r72, r73, CCd, Akw, Al5, ApE, Awx, BBU, BBa, BBc, BCJ, BDL, CQf, CQg, CUE, CUi, CWH, CWI, CYC, CZ8, CaE, CaL, Cef, BvL, Bvr, AnF, AnG, ApF, ApI, B6C, BWu, BXJ, BaW, C5c, CAf, AsC, AsE, backgroundColor, Aei, Avm, BEd, BPo, mediaId, BWE, BWF, BaV, pk, Bm8, text, textColor, hashMap, treeUpdaterJNI7, ApM, AyN, Azi, arrayList, arrayList2);
        }
        return (C65211bM) treeJNI;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xdl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21519Xdl {
    public static C274354oA A00(C274354oA r2, C274354oA r3) {
        0qQ.A0B(r3, 1);
        C21494Xcl xcl = new C21494Xcl(r2);
        if (r3.AkK() != null) {
            xcl.A0G = r3.AkK();
        }
        if (r3.AkR() != null) {
            xcl.A0H = r3.AkR();
        }
        if (r3.AvV() != null) {
            xcl.A08 = r3.AvV();
        }
        if (r3.AwG() != null) {
            xcl.A0b = r3.AwG();
        }
        if (r3.AxC() != null) {
            xcl.A0S = r3.AxC();
        }
        if (r3.B2p() != null) {
            xcl.A0c = r3.B2p();
        }
        if (r3.B51() != null) {
            xcl.A00 = r3.B51();
        }
        if (r3.BCf() != null) {
            xcl.A09 = r3.BCf();
        }
        if (r3.BDr() != null) {
            xcl.A01 = r3.BDr();
        }
        if (r3.BGY() != null) {
            xcl.A0T = r3.BGY();
        }
        if (r3.COr() != null) {
            xcl.A0I = r3.COr();
        }
        if (r3.CTh() != null) {
            xcl.A0J = r3.CTh();
        }
        if (r3.CYr() != null) {
            xcl.A0K = r3.CYr();
        }
        if (r3.CZb() != null) {
            xcl.A0L = r3.CZb();
        }
        if (r3.Cah() != null) {
            xcl.A0M = r3.Cah();
        }
        if (r3.Cbk() != null) {
            xcl.A0N = r3.Cbk();
        }
        if (r3.BMo() != null) {
            xcl.A02 = r3.BMo();
        }
        1Xj BN0 = r3.BN0();
        if (BN0 != null) {
            xcl.A0C = BN0;
        }
        if (r3.BOe() != null) {
            xcl.A03 = r3.BOe();
        }
        if (r3.BRd() != null) {
            xcl.A0U = r3.BRd();
        }
        if (r3.BcX() != null) {
            xcl.A0A = r3.BcX();
        }
        if (r3.BeG() != null) {
            xcl.A0d = r3.BeG();
        }
        if (r3.BeL() != null) {
            xcl.A0B = r3.BeL();
        }
        User Bfp = r3.Bfp();
        if (Bfp != null) {
            xcl.A0E = Bfp;
        }
        if (r3.Biy() != null) {
            xcl.A0V = r3.Biy();
        }
        if (r3.BlH() != null) {
            xcl.A05 = r3.BlH();
        }
        if (r3.BlM() != null) {
            xcl.A0f = r3.BlM();
        }
        if (r3.BmH() != null) {
            xcl.A04 = r3.BmH();
        }
        if (r3.BmI() != null) {
            xcl.A0W = r3.BmI();
        }
        List BmJ = r3.BmJ();
        if (BmJ != null) {
            xcl.A0g = BmJ;
        }
        if (r3.BmM() != null) {
            xcl.A0X = r3.BmM();
        }
        User BmX = r3.BmX();
        if (BmX != null) {
            xcl.A0F = BmX;
        }
        if (r3.Bmv() != null) {
            xcl.A0Y = r3.Bmv();
        }
        if (r3.BnU() != null) {
            xcl.A0Z = r3.BnU();
        }
        if (r3.BqP() != null) {
            xcl.A06 = r3.BqP();
        }
        if (r3.Bs4() != null) {
            xcl.A0a = r3.Bs4();
        }
        if (r3.BtE() != null) {
            xcl.A0D = r3.BtE();
        }
        if (r3.BuL() != null) {
            xcl.A0O = r3.BuL();
        }
        if (r3.BvV() != null) {
            xcl.A0P = r3.BvV();
        }
        if (r3.By8() != null) {
            xcl.A0e = r3.By8();
        }
        if (r3.C5E() != null) {
            xcl.A07 = r3.C5E();
        }
        if (r3.CF7() != null) {
            xcl.A0Q = r3.CF7();
        }
        if (r3.CGc() != null) {
            xcl.A0R = r3.CGc();
        }
        return xcl.A01();
    }

    public static Map A01(C274354oA r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.AkK() != null) {
            A1H.put(C273654mx.A00(245), r5.AkK());
        }
        if (r5.AkR() != null) {
            A1H.put("can_reply", r5.AkR());
        }
        TreeUpdaterJNI treeUpdaterJNI10 = null;
        if (r5.AvV() != null) {
            C274364oB AvV = r5.AvV();
            if (AvV != null) {
                treeUpdaterJNI9 = AvV.FHC();
            } else {
                treeUpdaterJNI9 = null;
            }
            A1H.put("debug_info", treeUpdaterJNI9);
        }
        if (r5.AwG() != null) {
            A1H.put("delete_timestamp", r5.AwG());
        }
        if (r5.AxC() != null) {
            A1H.put("direct_reply_count", r5.AxC());
        }
        if (r5.B2p() != null) {
            A1H.put("expiry_timestamp", r5.B2p());
        }
        if (r5.B51() != null) {
            C274374oC B51 = r5.B51();
            if (B51 != null) {
                treeUpdaterJNI8 = B51.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1H.put("fediverse_info", treeUpdaterJNI8);
        }
        if (r5.BCf() != null) {
            TextPostAppHeaderFollowVariant BCf = r5.BCf();
            if (BCf != null) {
                str3 = BCf.A00;
            } else {
                str3 = null;
            }
            A1H.put(C273654mx.A00(723), str3);
        }
        if (r5.BDr() != null) {
            C274384oE BDr = r5.BDr();
            if (BDr != null) {
                treeUpdaterJNI7 = BDr.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1H.put("hush_info", treeUpdaterJNI7);
        }
        if (r5.BGY() != null) {
            A1H.put(AnonymousClass000.A00(161), r5.BGY());
        }
        if (r5.COr() != null) {
            A1H.put("is_archived", r5.COr());
        }
        if (r5.CTh() != null) {
            A1H.put("is_first_post", r5.CTh());
        }
        if (r5.CYr() != null) {
            A1H.put("is_parent_edited", r5.CYr());
        }
        if (r5.CZb() != null) {
            A1H.put("is_post_unavailable", r5.CZb());
        }
        if (r5.Cah() != null) {
            A1H.put("is_reply", r5.Cah());
        }
        if (r5.Cbk() != null) {
            A1H.put(C273654mx.A00(788), r5.Cbk());
        }
        if (r5.BMo() != null) {
            C274404oG BMo = r5.BMo();
            if (BMo != null) {
                treeUpdaterJNI6 = BMo.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1H.put(C273654mx.A00(801), treeUpdaterJNI6);
        }
        1Xj BN0 = r5.BN0();
        if (BN0 != null) {
            A1H.put("linked_inline_media", BN0.A1C());
        }
        if (r5.BOe() != null) {
            C274414oH BOe = r5.BOe();
            if (BOe != null) {
                treeUpdaterJNI5 = BOe.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1H.put("loop_community_info", treeUpdaterJNI5);
        }
        if (r5.BRd() != null) {
            A1H.put("mention_count", r5.BRd());
        }
        if (r5.BcX() != null) {
            C274434oJ BcX = r5.BcX();
            if (BcX != null) {
                treeUpdaterJNI4 = BcX.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("pinned_post_info", treeUpdaterJNI4);
        }
        if (r5.BeG() != null) {
            A1H.put(C273654mx.A00(884), r5.BeG());
        }
        if (r5.BeL() != null) {
            TextPostAppPostUnavailableReason BeL = r5.BeL();
            if (BeL != null) {
                str2 = BeL.A00;
            } else {
                str2 = null;
            }
            A1H.put(C273654mx.A00(885), str2);
        }
        User Bfp = r5.Bfp();
        if (Bfp != null) {
            A1H.put(C273654mx.A00(892), Bfp.A08());
        }
        if (r5.Biy() != null) {
            A1H.put("quote_count", r5.Biy());
        }
        if (r5.BlH() != null) {
            C274444oL BlH = r5.BlH();
            if (BlH != null) {
                treeUpdaterJNI3 = BlH.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("related_trends_info", treeUpdaterJNI3);
        }
        if (r5.BlM() != null) {
            A1H.put(C273654mx.A00(935), r5.BlM());
        }
        if (r5.BmH() != null) {
            ReplyControlStr BmH = r5.BmH();
            if (BmH != null) {
                str = BmH.A00;
            } else {
                str = null;
            }
            A1H.put(C273654mx.A00(381), str);
        }
        if (r5.BmI() != null) {
            A1H.put("reply_count", r5.BmI());
        }
        List BmJ = r5.BmJ();
        if (BmJ != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BmJ);
            Iterator it = BmJ.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put(C273654mx.A00(382), A0r);
        }
        if (r5.BmM() != null) {
            A1H.put("reply_level", r5.BmM());
        }
        User BmX = r5.BmX();
        if (BmX != null) {
            A1H.put(C273654mx.A00(383), BmX.A08());
        }
        if (r5.Bmv() != null) {
            A1H.put("repost_count", r5.Bmv());
        }
        if (r5.BnU() != null) {
            A1H.put(AnonymousClass000.A00(1768), r5.BnU());
        }
        if (r5.BqP() != null) {
            TextAppSearchDiscussionTopic BqP = r5.BqP();
            if (BqP != null) {
                treeUpdaterJNI2 = BqP.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put(C273654mx.A00(950), treeUpdaterJNI2);
        }
        if (r5.Bs4() != null) {
            A1H.put("self_thread_count", r5.Bs4());
        }
        if (r5.BtE() != null) {
            C274334o8 BtE = r5.BtE();
            if (BtE != null) {
                treeUpdaterJNI = BtE.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("share_info", treeUpdaterJNI);
        }
        if (r5.BuL() != null) {
            A1H.put(C273654mx.A00(960), r5.BuL());
        }
        if (r5.BvV() != null) {
            A1H.put("show_header_follow", r5.BvV());
        }
        if (r5.By8() != null) {
            A1H.put(C273654mx.A00(394), r5.By8());
        }
        if (r5.C5E() != null) {
            C274454oN C5E = r5.C5E();
            if (C5E != null) {
                treeUpdaterJNI10 = C5E.FHC();
            }
            A1H.put("text_fragments", treeUpdaterJNI10);
        }
        if (r5.CF7() != null) {
            A1H.put(C273654mx.A00(426), r5.CF7());
        }
        if (r5.CGc() != null) {
            A1H.put(C273654mx.A00(1014), r5.CGc());
        }
        return 0Yt.A0B(A1H);
    }
}

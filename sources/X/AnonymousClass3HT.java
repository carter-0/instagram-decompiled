package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.FriendshipStatusImpl;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3HT  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass3HT {
    public static FriendshipStatus A00(FriendshipStatus friendshipStatus, FriendshipStatus friendshipStatus2) {
        TreeJNI friendshipStatusImpl;
        FriendshipStatus friendshipStatus3 = friendshipStatus;
        Boolean Ag8 = friendshipStatus3.Ag8();
        Boolean B6t = friendshipStatus3.B6t();
        Boolean B6y = friendshipStatus3.B6y();
        Boolean BGp = friendshipStatus3.BGp();
        Boolean CPL = friendshipStatus3.CPL();
        Boolean CPQ = friendshipStatus3.CPQ();
        Boolean CPW = friendshipStatus3.CPW();
        Boolean CSW = friendshipStatus3.CSW();
        Boolean CTK = friendshipStatus3.CTK();
        Boolean CTW = friendshipStatus3.CTW();
        Boolean CUH = friendshipStatus3.CUH();
        Boolean CXP = friendshipStatus3.CXP();
        Boolean CXQ = friendshipStatus3.CXQ();
        Boolean CY0 = friendshipStatus3.CY0();
        Boolean CY1 = friendshipStatus3.CY1();
        Boolean CY2 = friendshipStatus3.CY2();
        Boolean CY3 = friendshipStatus3.CY3();
        Boolean CZq = friendshipStatus3.CZq();
        Boolean Caq = friendshipStatus3.Caq();
        Boolean Cdk = friendshipStatus3.Cdk();
        Boolean Cek = friendshipStatus3.Cek();
        Boolean BVC = friendshipStatus3.BVC();
        Boolean BZS = friendshipStatus3.BZS();
        Integer Bjk = friendshipStatus3.Bjk();
        Boolean Bug = friendshipStatus3.Bug();
        Boolean C2N = friendshipStatus3.C2N();
        Boolean C5T = friendshipStatus3.C5T();
        if (friendshipStatus2.Ag8() != null) {
            Ag8 = friendshipStatus2.Ag8();
        }
        if (friendshipStatus2.B6t() != null) {
            B6t = friendshipStatus2.B6t();
        }
        if (friendshipStatus2.B6y() != null) {
            B6y = friendshipStatus2.B6y();
        }
        if (friendshipStatus2.BGp() != null) {
            BGp = friendshipStatus2.BGp();
        }
        if (friendshipStatus2.CPL() != null) {
            CPL = friendshipStatus2.CPL();
        }
        if (friendshipStatus2.CPQ() != null) {
            CPQ = friendshipStatus2.CPQ();
        }
        if (friendshipStatus2.CPW() != null) {
            CPW = friendshipStatus2.CPW();
        }
        if (friendshipStatus2.CSW() != null) {
            CSW = friendshipStatus2.CSW();
        }
        if (friendshipStatus2.CTK() != null) {
            CTK = friendshipStatus2.CTK();
        }
        if (friendshipStatus2.CTW() != null) {
            CTW = friendshipStatus2.CTW();
        }
        if (friendshipStatus2.CUH() != null) {
            CUH = friendshipStatus2.CUH();
        }
        if (friendshipStatus2.CXP() != null) {
            CXP = friendshipStatus2.CXP();
        }
        if (friendshipStatus2.CXQ() != null) {
            CXQ = friendshipStatus2.CXQ();
        }
        if (friendshipStatus2.CY0() != null) {
            CY0 = friendshipStatus2.CY0();
        }
        if (friendshipStatus2.CY1() != null) {
            CY1 = friendshipStatus2.CY1();
        }
        if (friendshipStatus2.CY2() != null) {
            CY2 = friendshipStatus2.CY2();
        }
        if (friendshipStatus2.CY3() != null) {
            CY3 = friendshipStatus2.CY3();
        }
        if (friendshipStatus2.CZq() != null) {
            CZq = friendshipStatus2.CZq();
        }
        if (friendshipStatus2.Caq() != null) {
            Caq = friendshipStatus2.Caq();
        }
        if (friendshipStatus2.Cdk() != null) {
            Cdk = friendshipStatus2.Cdk();
        }
        if (friendshipStatus2.Cek() != null) {
            Cek = friendshipStatus2.Cek();
        }
        if (friendshipStatus2.BVC() != null) {
            BVC = friendshipStatus2.BVC();
        }
        if (friendshipStatus2.BZS() != null) {
            BZS = friendshipStatus2.BZS();
        }
        if (friendshipStatus2.Bjk() != null) {
            Bjk = friendshipStatus2.Bjk();
        }
        if (friendshipStatus2.Bug() != null) {
            Bug = friendshipStatus2.Bug();
        }
        if (friendshipStatus2.C2N() != null) {
            C2N = friendshipStatus2.C2N();
        }
        if (friendshipStatus2.C5T() != null) {
            C5T = friendshipStatus2.C5T();
        }
        if (friendshipStatus3 instanceof ImmutablePandoFriendshipStatus) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            TreeJNI treeJNI = (TreeJNI) friendshipStatus3;
            friendshipStatusImpl = new TreeUpdaterJNI(0Yt.A06(new 0eP[]{new 0eP("blocking", Ag8), new 0eP("followed_by", B6t), new 0eP("following", B6y), new 0eP("incoming_request", BGp), new 0eP("is_banner_profile_upsell", CPL), new 0eP("is_bestie", CPQ), new 0eP("is_blocking_reel", CPW), new 0eP("is_eligible_to_subscribe", CSW), new 0eP("is_fb_friends", CTK), new 0eP("is_feed_favorite", CTW), new 0eP("is_group_creation_reachable", CUH), new 0eP("is_messaging_only_blocking", CXP), new 0eP("is_messaging_pseudo_blocking", CXQ), new 0eP("is_muting_friend_map", CY0), new 0eP("is_muting_media_notes", CY1), new 0eP("is_muting_notes", CY2), new 0eP("is_muting_reel", CY3), new 0eP("is_private", CZq), new 0eP("is_restricted", Caq), new 0eP("is_unavailable", Cdk), new 0eP("is_viewer_unconnected", Cek), new 0eP("muting", BVC), new 0eP("outgoing_request", BZS), new 0eP("reachability_status", Bjk), new 0eP("should_show_profile_upsell", Bug), new 0eP("subscribed", C2N), new 0eP("text_post_app_pre_following", C5T)}), treeJNI).applyToTree(treeJNI);
            0qQ.A07(friendshipStatusImpl);
        } else {
            Boolean bool = CZq;
            Boolean bool2 = Caq;
            Boolean bool3 = Cdk;
            Boolean bool4 = Cek;
            Boolean bool5 = BVC;
            Boolean bool6 = BZS;
            Boolean bool7 = Bug;
            Boolean bool8 = C2N;
            Boolean bool9 = C5T;
            Integer num = Bjk;
            Boolean bool10 = Ag8;
            Boolean bool11 = B6t;
            Boolean bool12 = B6y;
            Boolean bool13 = BGp;
            Boolean bool14 = CPL;
            Boolean bool15 = CPQ;
            Boolean bool16 = CPW;
            friendshipStatusImpl = new FriendshipStatusImpl(bool10, bool11, bool12, bool13, bool14, bool15, bool16, CSW, CTK, CTW, CUH, CXP, CXQ, CY0, CY1, CY2, CY3, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num);
        }
        return (FriendshipStatus) friendshipStatusImpl;
    }

    public static Map A01(FriendshipStatus friendshipStatus) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (friendshipStatus.Ag8() != null) {
            linkedHashMap.put("blocking", friendshipStatus.Ag8());
        }
        if (friendshipStatus.B6t() != null) {
            linkedHashMap.put("followed_by", friendshipStatus.B6t());
        }
        if (friendshipStatus.B6y() != null) {
            linkedHashMap.put("following", friendshipStatus.B6y());
        }
        if (friendshipStatus.BGp() != null) {
            linkedHashMap.put("incoming_request", friendshipStatus.BGp());
        }
        if (friendshipStatus.CPL() != null) {
            linkedHashMap.put("is_banner_profile_upsell", friendshipStatus.CPL());
        }
        if (friendshipStatus.CPQ() != null) {
            linkedHashMap.put("is_bestie", friendshipStatus.CPQ());
        }
        if (friendshipStatus.CPW() != null) {
            linkedHashMap.put("is_blocking_reel", friendshipStatus.CPW());
        }
        if (friendshipStatus.CSW() != null) {
            linkedHashMap.put("is_eligible_to_subscribe", friendshipStatus.CSW());
        }
        if (friendshipStatus.CTK() != null) {
            linkedHashMap.put("is_fb_friends", friendshipStatus.CTK());
        }
        if (friendshipStatus.CTW() != null) {
            linkedHashMap.put("is_feed_favorite", friendshipStatus.CTW());
        }
        if (friendshipStatus.CUH() != null) {
            linkedHashMap.put("is_group_creation_reachable", friendshipStatus.CUH());
        }
        if (friendshipStatus.CXP() != null) {
            linkedHashMap.put("is_messaging_only_blocking", friendshipStatus.CXP());
        }
        if (friendshipStatus.CXQ() != null) {
            linkedHashMap.put("is_messaging_pseudo_blocking", friendshipStatus.CXQ());
        }
        if (friendshipStatus.CY0() != null) {
            linkedHashMap.put("is_muting_friend_map", friendshipStatus.CY0());
        }
        if (friendshipStatus.CY1() != null) {
            linkedHashMap.put("is_muting_media_notes", friendshipStatus.CY1());
        }
        if (friendshipStatus.CY2() != null) {
            linkedHashMap.put("is_muting_notes", friendshipStatus.CY2());
        }
        if (friendshipStatus.CY3() != null) {
            linkedHashMap.put("is_muting_reel", friendshipStatus.CY3());
        }
        if (friendshipStatus.CZq() != null) {
            linkedHashMap.put("is_private", friendshipStatus.CZq());
        }
        if (friendshipStatus.Caq() != null) {
            linkedHashMap.put("is_restricted", friendshipStatus.Caq());
        }
        if (friendshipStatus.Cdk() != null) {
            linkedHashMap.put("is_unavailable", friendshipStatus.Cdk());
        }
        if (friendshipStatus.Cek() != null) {
            linkedHashMap.put("is_viewer_unconnected", friendshipStatus.Cek());
        }
        if (friendshipStatus.BVC() != null) {
            linkedHashMap.put("muting", friendshipStatus.BVC());
        }
        if (friendshipStatus.BZS() != null) {
            linkedHashMap.put("outgoing_request", friendshipStatus.BZS());
        }
        if (friendshipStatus.Bjk() != null) {
            linkedHashMap.put("reachability_status", friendshipStatus.Bjk());
        }
        if (friendshipStatus.Bug() != null) {
            linkedHashMap.put("should_show_profile_upsell", friendshipStatus.Bug());
        }
        if (friendshipStatus.C2N() != null) {
            linkedHashMap.put("subscribed", friendshipStatus.C2N());
        }
        if (friendshipStatus.C5T() != null) {
            linkedHashMap.put("text_post_app_pre_following", friendshipStatus.C5T());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}

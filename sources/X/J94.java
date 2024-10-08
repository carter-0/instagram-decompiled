package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;

public final class J94 extends 0Yg implements 0sL {
    public final /* synthetic */ WallPostInfo A00;
    public final /* synthetic */ WallPostItem A01;
    public final /* synthetic */ C66528MVg A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J94(WallPostInfo wallPostInfo, WallPostItem wallPostItem, C66528MVg mVg, String str, 0sP r6, boolean z, boolean z2) {
        super(2);
        this.A00 = wallPostInfo;
        this.A04 = r6;
        this.A06 = z;
        this.A03 = str;
        this.A01 = wallPostItem;
        this.A02 = mVg;
        this.A05 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r15 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1290259173, "com.instagram.wonderwall.ui.compose.components.WallPost.<anonymous> (WallPost.kt:68)");
            }
            C285245Qk r3 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(r3, 8.0f);
            WallPostInfo wallPostInfo = this.A00;
            0sP r12 = this.A04;
            boolean z = this.A06;
            String str = this.A03;
            WallPostItem wallPostItem = this.A01;
            C66528MVg mVg = this.A02;
            boolean z2 = this.A05;
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A07, r15, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r15);
            C286565Wx r1 = (C286565Wx) r15;
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r15, A07);
            C51973G9u.A0y(r15, r1);
            C51971G9r.A12(r15, A022, A042);
            0sL r9 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r15, A002)) {
                C51971G9r.A13(r15, r9, A002);
            }
            C51965G9l.A18(r15, A012);
            User user = wallPostInfo.A03;
            String id = user.getId();
            String username = user.getUsername();
            ImageUrl Bh3 = user.Bh3();
            C54623HLg hLg = C54623HLg.FeedPost;
            C55196Hdm.A00(r15, Bh3, wallPostInfo.A05, hLg, id, username, r12, AnonymousClass5PI.A01(r15, new JGX(wallPostInfo, 8), 1551171271), 12585984, 32, false);
            r15.ExS(793802695);
            if (z) {
                WallInfo wallInfo = wallPostInfo.A04;
                if (!0qQ.A0K(str, wallInfo.A01)) {
                    String id2 = user.getId();
                    User user2 = wallInfo.A00;
                    if (!DbV.A1Z(user2, id2)) {
                        C286575Wy r19 = r15;
                        C55196Hdm.A00(r19, user2.Bh3(), (HMM) null, hLg, user2.getId(), user2.getUsername(), r12, (0sK) null, 199680, 144, true);
                    }
                }
            }
            C286565Wx.A0L(r1, false);
            G9w.A15(r15, r3, 8.0f);
            C286575Wy r6 = r15;
            I5C.A03(r6, wallPostItem, mVg, 8.0f, 48, 0, z2);
            I5B.A02(r6, wallPostItem, (0sP) null, 8.0f, 48, 28, false, false);
            r15.ExS(793822973);
            if (!wallPostItem.BeB().A01() && str != null) {
                boolean A003 = wallPostInfo.A00();
                C66528MVg mVg2 = null;
                if (A003) {
                    mVg2 = mVg;
                }
                C55199Hdp.A00(r15, wallPostItem, mVg2, 0, 0);
            }
            C286565Wx.A0L(r1, false);
            G9w.A15(r15, r3, 4.0f);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(1226532793);
            }
        } else {
            r15.Evl();
        }
        return C60340gF.A00;
    }
}

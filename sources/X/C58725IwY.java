package X;

import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostInfo;
import java.util.List;

/* renamed from: X.IwY  reason: case insensitive filesystem */
public final class C58725IwY extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58725IwY(boolean z, int i) {
        super(1);
        this.A01 = z;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WallPostInfo wallPostInfo = (WallPostInfo) obj;
        0qQ.A0B(wallPostInfo, 0);
        boolean z = this.A01;
        int i = this.A00;
        String str = wallPostInfo.A06;
        User user = wallPostInfo.A03;
        WallInfo wallInfo = wallPostInfo.A04;
        String str2 = wallPostInfo.A07;
        boolean z2 = wallPostInfo.A0B;
        boolean z3 = wallPostInfo.A09;
        List list = wallPostInfo.A08;
        HMM hmm = wallPostInfo.A05;
        long j = wallPostInfo.A02;
        int i2 = wallPostInfo.A00;
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1U(user, wallInfo, str2);
        AnonymousClass7TF.A1G(list, 8, hmm);
        return new WallPostInfo(user, wallInfo, hmm, str, str2, list, i, i2, j, z2, z3, z);
    }
}

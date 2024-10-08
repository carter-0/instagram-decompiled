package X;

import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostInfo;
import java.util.List;

/* renamed from: X.J4h  reason: case insensitive filesystem */
public final class C59048J4h extends 0Yg implements 0sP {
    public static final C59048J4h A00 = new C59048J4h();

    public C59048J4h() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WallPostInfo wallPostInfo = (WallPostInfo) obj;
        0qQ.A0B(wallPostInfo, 0);
        String str = wallPostInfo.A06;
        User user = wallPostInfo.A03;
        WallInfo wallInfo = wallPostInfo.A04;
        String str2 = wallPostInfo.A07;
        boolean z = wallPostInfo.A0B;
        boolean z2 = wallPostInfo.A0A;
        int i = wallPostInfo.A01;
        List list = wallPostInfo.A08;
        HMM hmm = wallPostInfo.A05;
        long j = wallPostInfo.A02;
        int i2 = wallPostInfo.A00;
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1U(user, wallInfo, str2);
        AnonymousClass7TF.A1G(list, 8, hmm);
        return new WallPostInfo(user, wallInfo, hmm, str, str2, list, i, i2, j, z, !wallPostInfo.A09, z2);
    }
}

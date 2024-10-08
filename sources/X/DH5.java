package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

public final /* synthetic */ class DH5 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ DH5(AnonymousClass7Z6 r1, User user, String str, String str2, String str3, boolean z) {
        this.A00 = r1;
        this.A05 = z;
        this.A02 = str;
        this.A01 = user;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A05;
        String str = this.A02;
        User user = this.A01;
        String str2 = this.A03;
        String str3 = this.A04;
        C66665MaY A052 = C66669Mac.A05(r0.A00, oDs, AnonymousClass1fN.class, str, z);
        long A0H = AnonymousClass7TG.A0H();
        String id = user.getId();
        String username = user.getUsername();
        ImageUrl Bh3 = user.Bh3();
        1bp r5 = new 1bp(A052, directThreadKey, l, A0H);
        r5.A02 = id;
        r5.A05 = username;
        r5.A04 = str2;
        r5.A03 = str3;
        r5.A01 = Bh3;
        r5.A00 = new SimpleImageUrl("https://static.xx.fbcdn.net/rsrc.php/v3/yE/r/YrvGZ_MpBMD.png");
        return r5;
    }
}

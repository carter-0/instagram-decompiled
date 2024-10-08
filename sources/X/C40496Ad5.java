package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.Ad5  reason: case insensitive filesystem */
public final /* synthetic */ class C40496Ad5 implements B1V {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ AnonymousClass7Z6 A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C40496Ad5(ImageUrl imageUrl, AnonymousClass7Z6 r2, User user, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A02 = r2;
        this.A08 = z;
        this.A04 = str;
        this.A00 = j;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = user;
        this.A07 = str4;
        this.A01 = imageUrl;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.A9t] */
    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r2 = this.A02;
        boolean z = this.A08;
        String str = this.A04;
        long j = this.A00;
        String str2 = this.A05;
        String str3 = this.A06;
        User user = this.A03;
        String str4 = this.A07;
        ImageUrl imageUrl = this.A01;
        UserSession userSession = r2.A00;
        C66665MaY A052 = C66669Mac.A05(userSession, oDs, AnonymousClass1jz.class, (String) null, z);
        DirectThreadKey directThreadKey2 = directThreadKey;
        AnonymousClass7TF.A1H(userSession, directThreadKey2);
        1bp r10 = new 1bp(A052, directThreadKey2, OQO.A01(userSession, directThreadKey2), AnonymousClass7TG.A0H());
        ? obj = new Object();
        obj.A00 = j;
        obj.A05 = str;
        obj.A07 = str2;
        obj.A06 = str3;
        obj.A02 = null;
        obj.A03 = user;
        obj.A04 = str4;
        obj.A01 = imageUrl;
        r10.A00 = obj;
        return r10;
    }
}

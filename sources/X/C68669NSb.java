package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.NSb  reason: case insensitive filesystem */
public final class C68669NSb extends 0ng {
    public final /* synthetic */ C299275ur A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C71077Oaw A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public final void run() {
        C71077Oaw oaw = this.A04;
        String str = this.A05;
        User user = this.A03;
        List list = this.A07;
        String str2 = this.A06;
        C58768IxF ixF = new C58768IxF(23, oaw, this.A02, this.A01, this.A00);
        OXH.A02(new C73964Pmi(list, ixF, user, str2, str, 4), oaw.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68669NSb(C299275ur r4, C277014uI r5, C277014uI r6, User user, C71077Oaw oaw, String str, String str2, List list) {
        super(1651335304, 3, false, false);
        this.A04 = oaw;
        this.A05 = str;
        this.A03 = user;
        this.A07 = list;
        this.A06 = str2;
        this.A00 = r4;
        this.A02 = r5;
        this.A01 = r6;
    }
}

package X;

import com.instagram.user.model.User;

/* renamed from: X.IbL  reason: case insensitive filesystem */
public final class C57477IbL implements C51889G6e {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C57477IbL(C52971GgO ggO, User user, String str, String str2) {
        this.A00 = ggO;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = user;
    }

    public final void DwT(String str) {
        C52971GgO ggO = this.A00;
        String str2 = this.A02;
        String str3 = this.A03;
        User user = this.A01;
        I21.A00.A01(ggO.A0C.A02);
        ggO.A0B.A00(new C74192PqY(ggO, user, str2, str3, 16));
        ggO.A0O.Epw(new C334757bp(user, str2, new MJD(user, ggO, str2, str3, 3), new MJD(user, ggO, str2, str3, 4)));
    }
}

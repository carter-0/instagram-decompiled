package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.DGz  reason: case insensitive filesystem */
public final /* synthetic */ class C45970DGz implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C45970DGz(AnonymousClass7Z6 r1, User user, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = user;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        User user = this.A01;
        1bp r4 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65611ei.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r4.A01 = user;
        r4.A02 = false;
        return r4;
    }
}

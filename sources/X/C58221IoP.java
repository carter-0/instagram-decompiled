package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.IoP  reason: case insensitive filesystem */
public final class C58221IoP extends 0Yg implements C62320sa {
    public final /* synthetic */ C333717a0 A00;
    public final /* synthetic */ I47 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ 05G A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58221IoP(C333717a0 r2, I47 i47, String str, List list, List list2, Set set, 05G r8) {
        super(0);
        this.A00 = r2;
        this.A02 = str;
        this.A03 = list;
        this.A01 = i47;
        this.A05 = set;
        this.A04 = list2;
        this.A06 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C333717a0 r8 = this.A00;
        String str = this.A02;
        List list = this.A03;
        0qQ.A0B(list, 1);
        I21 i21 = I21.A00;
        UserSession userSession = r8.A02;
        C51965G9l.A0l().markerPoint(309476254, AnonymousClass000.A00(2706));
        i21.A01(userSession);
        C333717a0.A02(r8, "block_accounts_action", str, list);
        1Z4 r5 = 1Z4.A00;
        I47 i47 = this.A01;
        UserSession userSession2 = i47.A04;
        Set set = this.A05;
        r5.A02(userSession2, 00k.A0a(set), I47.A00(this.A04));
        i47.A01.A0D();
        this.A06.Epw(new AnonymousClass9IK(new AnonymousClass9I0(set.size(), 0)));
        return C60340gF.A00;
    }
}

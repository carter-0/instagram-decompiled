package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.Callable;

/* renamed from: X.Pcb  reason: case insensitive filesystem */
public final class C73436Pcb implements Callable {
    public final /* synthetic */ C254703su A00;
    public final /* synthetic */ C333537Zi A01;
    public final /* synthetic */ C68965Nbs A02;
    public final /* synthetic */ C254743sy A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C73436Pcb(C254703su r1, C333537Zi r2, C68965Nbs nbs, C254743sy r4, String str, String str2, boolean z, boolean z2) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = nbs;
        this.A06 = z;
        this.A04 = str;
        this.A07 = z2;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        DirectThreadKey A032 = C66647MaG.A03(this.A03);
        C254703su r1 = this.A00;
        boolean z = r1.A2P;
        String A0f = r1.A0f();
        C333537Zi r8 = this.A01;
        UserSession userSession = r8.A03;
        Class<C65711gJ> cls = C65711gJ.class;
        String str2 = this.A02.A00;
        C70621ODs A0M = r1.A0M();
        boolean z2 = this.A06;
        String str3 = A0f;
        if (z2) {
            str3 = null;
        }
        C66665MaY A042 = C66669Mac.A04(userSession, A0M, cls, str2, str3, z);
        String str4 = this.A04;
        boolean z3 = this.A07;
        1OS r3 = new 1OS(A042);
        r3.A00 = A032;
        r3.A02 = str4;
        r3.A01 = A0f;
        r3.A05 = z;
        r3.A04 = z2;
        r3.A03 = z3;
        String str5 = r3.A05;
        if (z2 && (str = this.A05) != null) {
            C333537Zi.A0A(r8, str, str5, A032.A00, 13, z, true);
        }
        OYx oYx = O58.A01;
        OYx.A00(userSession, str5.hashCode(), z2, false);
        oYx.A02(userSession, r3, (String) null);
        C66580MXl.A1P(userSession, r3);
        return AnonymousClass7TE.A0v();
    }
}

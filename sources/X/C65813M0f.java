package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.M0f  reason: case insensitive filesystem */
public final class C65813M0f implements C46203DQf {
    public final /* synthetic */ C239413Gj A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void Cz6(Reel reel) {
        Reel reel2 = reel;
        C270194gL r3 = reel.A0H;
        if (r3 != null) {
            C239413Gj r6 = this.A00;
            String str = this.A01;
            String str2 = this.A03;
            String str3 = this.A02;
            2MD A012 = 2MD.A01();
            User A032 = r3.A03();
            String str4 = r3.A0Y;
            if (str4 == null) {
                str4 = "";
            }
            AnonymousClass3NV r2 = r3.A0A;
            if (r2 == null) {
                r2 = AnonymousClass3NV.A08;
            }
            boolean z = false;
            boolean A1W = AnonymousClass7TF.A1W(r2, AnonymousClass3NV.A0A);
            boolean A1W2 = AnonymousClass7TF.A1W(r2, AnonymousClass3NV.A04);
            if (r3.A01 != null) {
                z = true;
            }
            A012.A09(C239413Gj.A00(reel2, A032, r6, str4, str, str2, str3, A1W, A1W2, z));
        }
    }

    public C65813M0f(C239413Gj r1, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }
}

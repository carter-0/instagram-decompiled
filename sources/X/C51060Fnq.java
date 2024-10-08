package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fnq  reason: case insensitive filesystem */
public final class C51060Fnq implements C46203DQf {
    public final /* synthetic */ AnonymousClass3BQ A00;
    public final /* synthetic */ C239413Gj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void Cz6(Reel reel) {
        String str;
        String str2;
        UserSession userSession;
        C270194gL r2 = reel.A0H;
        if (!(r2 == null || (str2 = r2.A0d) == null || str2.equals("0"))) {
            C278114wI r0 = r2.A06;
            if (r0 == null) {
                r0 = C278114wI.UNKNOWN;
            }
            if (r0.A00() && (userSession = this.A01.A01) != null) {
                FragmentActivity A002 = C239403Gi.A00();
                if (A002 != null) {
                    C270634h3 r02 = new C270634h3(ClipsViewerSource.LIVE_PUSH_NOTIF, userSession);
                    r02.A1C = str2;
                    I6Y.A01(A002, r02, userSession, false);
                    return;
                }
                return;
            }
        }
        if (!this.A06 || (str = this.A05) == null) {
            C239413Gj.A01(reel, this.A00, this.A01, this.A02, this.A03);
            return;
        }
        C239413Gj.A02(reel, this.A00, this.A01, str, this.A04);
    }

    public C51060Fnq(AnonymousClass3BQ r1, C239413Gj r2, String str, String str2, String str3, String str4, boolean z) {
        this.A01 = r2;
        this.A06 = z;
        this.A05 = str;
        this.A00 = r1;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}

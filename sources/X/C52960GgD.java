package X;

import android.app.Application;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GgD  reason: case insensitive filesystem */
public final class C52960GgD extends C361478gI {
    public List A00 = 0sn.A00;
    public final UserSession A01;
    public final C55521Hj3 A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final AnonymousClass0r6 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52960GgD(Application application, UserSession userSession, C55521Hj3 hj3, C62037KWw kWw, String str) {
        super(application);
        C51974G9v.A1L(application, kWw, userSession);
        this.A02 = hj3;
        this.A01 = userSession;
        this.A04 = LGl.A01(C318116oQ.A00(this), new MC9(new PageFetcher(new PagingConfig(20, 20, 60, false), new C58081IlI(new C58694Iw3(str, kWw, 12), (AnonymousClass4D7) null, 1)).A03, 62));
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A03 = r0;
        this.A05 = 0u9.A04(r0);
    }
}

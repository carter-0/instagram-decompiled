package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.H6q  reason: case insensitive filesystem */
public final class C54299H6q extends C228042kh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ C54190H2k A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C54299H6q(Context context, AnonymousClass07i r2, C54190H2k h2k, AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        this.A04 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = context;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = h2k;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A04;
        C229352nF A0Y = C51967G9n.A0Y(userSession);
        String str = this.A05;
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        String A062 = 1Xv.A06(this.A06);
        return new C52998Ggp(A0Y, new C55879Hp0(this.A00, this.A01, this.A02, this.A03, userSession, A062), str);
    }
}

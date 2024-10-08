package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pc3  reason: case insensitive filesystem */
public final class C73406Pc3 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1X9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C73406Pc3(Context context, AnonymousClass0iw r2, UserSession userSession, 1X9 r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
    }

    public final void run() {
        C72192OyC A012;
        1X9 r2 = this.A03;
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        AnonymousClass7TG.A1T(context, userSession, r3);
        AnonymousClass38Y A002 = r2.A00(context, userSession);
        Context context2 = A002.A04;
        UserSession userSession2 = A002.A06;
        if (new C70810OMf(context2, r3, userSession2).A01("ar_effect_try_on") && (A012 = C66953Mfm.A01(userSession2)) != null) {
            A012.A09.A0N.A0L(AnonymousClass05K.A0N, str, str2, str3, A012.A02.A06);
        }
    }
}

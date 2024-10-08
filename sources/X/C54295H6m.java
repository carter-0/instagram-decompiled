package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6m  reason: case insensitive filesystem */
public final class C54295H6m extends C228042kh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C54295H6m(Context context, AnonymousClass07i r2, AnonymousClass0iw r3, UserSession userSession, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = userSession;
        if (i != 0) {
            this.A05 = str;
            this.A06 = str2;
        } else {
            this.A06 = str;
            this.A05 = str2;
        }
        this.A02 = context;
        this.A01 = r3;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        int i = this.A00;
        UserSession userSession = (UserSession) this.A04;
        C229352nF A0Y = C51967G9n.A0Y(userSession);
        if (i != 0) {
            String str = this.A05;
            String str2 = this.A06;
            return new C52999Ggq(A0Y, new C55888Hp9((Context) this.A02, (AnonymousClass07i) this.A03, (AnonymousClass0iw) this.A01, userSession, C56469Hz1.A00, str2), str);
        }
        String str3 = this.A06;
        String str4 = this.A05;
        return new C52992Ggj(A0Y, new C55871Hos((Context) this.A02, (AnonymousClass07i) this.A03, (AnonymousClass0iw) this.A01, userSession, C56468Hz0.A00, str4), str3);
    }
}

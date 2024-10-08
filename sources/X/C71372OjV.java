package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjV  reason: case insensitive filesystem */
public final class C71372OjV implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C270184gK A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ C317116mk A05;
    public final /* synthetic */ C316136lA A06;

    public C71372OjV(UserSession userSession, C270184gK r2, C255773uh r3, C250973mM r4, AnonymousClass3BQ r5, C317116mk r6, C316136lA r7) {
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A00 = userSession;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1100756126);
        C317116mk r6 = this.A05;
        r6.Dfj(this.A01);
        C316136lA r7 = this.A06;
        C309196Xh.A02(this.A00, this.A02, this.A03, this.A04, r6, r7);
        AnonymousClass0fD.A0C(158802453, A052);
    }
}

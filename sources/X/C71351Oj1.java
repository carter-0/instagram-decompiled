package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oj1  reason: case insensitive filesystem */
public final class C71351Oj1 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass7EX A02;
    public final /* synthetic */ N8M A03;

    public C71351Oj1(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7EX r3, N8M n8m) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = n8m;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-615220246);
        C72193OyD A002 = C69843Nt7.A00(this.A00, this.A01);
        N8M n8m = this.A03;
        int i = n8m.A02;
        String str = n8m.A03;
        String str2 = n8m.A05;
        C72193OyD.A00(A002, "cta", "tap", str, str2, i, true);
        this.A02.A01.CpQ(str2, str, AnonymousClass7TE.A1I(n8m.A04));
        AnonymousClass0fD.A0C(-1340846937, A05);
    }
}

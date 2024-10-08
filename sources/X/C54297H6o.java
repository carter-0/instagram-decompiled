package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;

/* renamed from: X.H6o  reason: case insensitive filesystem */
public final class C54297H6o extends C228042kh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C54297H6o(Context context, AnonymousClass07i r2, AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3) {
        this.A03 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        C229352nF A0Y = C51967G9n.A0Y(userSession);
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        return new C53007Ggy(A0Y, userSession, new PromptPivotPageRepository(this.A00, this.A01, this.A02, userSession, C56449Hyh.A00, str2, str3), str);
    }
}

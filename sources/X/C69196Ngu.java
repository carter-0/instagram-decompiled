package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ngu  reason: case insensitive filesystem */
public final class C69196Ngu extends C2806552w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C314466iJ A04;
    public final /* synthetic */ N3L A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69196Ngu(Context context, View view, AnonymousClass0iw r4, UserSession userSession, C314466iJ r6, N3L n3l, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = r4;
        this.A05 = n3l;
        this.A01 = view;
        this.A04 = r6;
    }

    public final void onClick(View view) {
        Context context = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass0iw r5 = this.A02;
        N3L n3l = this.A05;
        View view2 = this.A01;
        C314466iJ r8 = this.A04;
        0nA.A0N(view2);
        HashMap A1E = AnonymousClass7TE.A1E();
        long j = n3l.A00;
        A1E.put("requester_user_id", String.valueOf(j));
        C66813Mcz mcz = new C66813Mcz(r5, userSession);
        mcz.A01(XSV.A06, n3l.A01, n3l.A0C, j);
        C66813Mcz.A00(C69476NmK.PROACTIVE_WARNING_BANNER_PRIMARY_ACTION, mcz);
        C360678ey A052 = C359988do.A05(userSession, "com.instagram.safety_notice.safety_notice_warning.action", A1E);
        A052.A00(new C15411UcN(3, r5, userSession, context, r8));
        1ES.A06(A052, -5, true);
    }
}

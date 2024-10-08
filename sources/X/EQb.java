package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.math.BigInteger;

public final class EQb extends H4J {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C48145EZn A01;
    public final /* synthetic */ C48142EZk A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQb(Context context, 0hq r2, C48145EZn eZn, C48142EZk eZk, UserSession userSession, Integer num, String str, boolean z) {
        super(r2);
        this.A01 = eZn;
        this.A00 = context;
        this.A04 = num;
        this.A05 = str;
        this.A03 = userSession;
        this.A02 = eZk;
        this.A06 = z;
    }

    public final void onFail(C268654dm r11) {
        int A032 = AnonymousClass0fD.A03(912656892);
        C48145EZn eZn = this.A01;
        UserSession userSession = this.A03;
        C49947FGb.A01(eZn, this.A02, userSession);
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131964489);
        User A0j = DbT.A0j(userSession);
        Integer num = this.A04;
        String username = A0j.getUsername();
        Uri A08 = DbV.A08(DbW.A07("https://www.instagram.com/invites/contact/").appendQueryParameter("utm_source", Pxd.A00(767)).appendQueryParameter("utm_medium", C49119Epi.A00(num)), "utm_content", new BigInteger(A0j.getId()).toString(36));
        0qQ.A07(A08);
        String A0u = DbV.A0u(context, username, A08.toString(), 2131964488);
        0qQ.A07(A0u);
        F8M.A00(context, num, A16, A0u, this.A05);
        AnonymousClass0fD.A0A(1497154508, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(891465514);
        C47354Dvo dvo = (C47354Dvo) obj;
        int A0D = AnonymousClass7TG.A0D(dvo, 818376719);
        C48145EZn eZn = this.A01;
        UserSession userSession = this.A03;
        C49947FGb.A02(eZn, this.A02, userSession, dvo.A00, this.A06);
        F8M.A00(this.A00, this.A04, dvo.A01, dvo.A00, this.A05);
        AnonymousClass0fD.A0A(-939001480, A0D);
        AnonymousClass0fD.A0A(265984311, A032);
    }
}

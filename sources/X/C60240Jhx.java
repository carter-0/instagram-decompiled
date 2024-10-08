package X;

import android.view.View;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Jhx  reason: case insensitive filesystem */
public final class C60240Jhx extends 2YL {
    public BrandedContentGatingInfo A00 = new BrandedContentGatingInfo((Integer) null, (String) null, (HashMap) null, (List) null, (List) null);
    public String A01 = "";
    public String A02 = "";
    public String A03;
    public final 2Fk A04;
    public final UserSession A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;

    public final void A00(BrandedContentGatingInfo brandedContentGatingInfo, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TG.A1O(str3, str4);
        this.A00 = brandedContentGatingInfo;
        this.A01 = str3;
        this.A02 = str4;
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = this.A05;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36314386574477844L)) {
            C62582KiF kiF = C62582KiF.A06;
            String str5 = this.A03;
            if (str5 == null) {
                str5 = "";
            }
            A1C.add(new C64800LiK(new LYC((Object) this, 64), kiF, str5, false, false));
        }
        A1C.addAll(0sr.A1P(new C232262tL[]{new C64800LiK((View.OnClickListener) null, C62582KiF.A04, this.A01, false, false), new FY7(AnonymousClass05K.A15, "feed"), new C64800LiK((View.OnClickListener) null, C62582KiF.A09, this.A02, false, false), new FY7(AnonymousClass05K.A1F, "feed")}));
        this.A08.Epw(A1C);
    }

    public C60240Jhx(UserSession userSession) {
        this.A05 = userSession;
        02z A1J = JTO.A1J();
        this.A08 = A1J;
        this.A04 = DbT.A0G(A1J);
        1HR A0w = G9w.A0w();
        this.A06 = A0w;
        this.A07 = 0u9.A04(A0w);
    }
}

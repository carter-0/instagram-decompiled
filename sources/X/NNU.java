package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class NNU extends C228042kh {
    public final Resources A00;
    public final UserSession A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final AnonymousClass72Q A04;
    public final DirectThreadKey A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09 = "challenges";

    public NNU(Resources resources, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7L2 r6, AnonymousClass72Q r7, DirectThreadKey directThreadKey, String str, String str2, String str3) {
        0qQ.A0B(userSession, 2);
        this.A00 = resources;
        this.A01 = userSession;
        this.A05 = directThreadKey;
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Resources resources = this.A00;
        UserSession userSession = this.A01;
        DirectThreadKey directThreadKey = this.A05;
        String str = this.A08;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A09;
        return new NVF(resources, userSession, C69911NuD.A00(userSession), this.A02, this.A03, this.A04, directThreadKey, str, str2, str3, str4);
    }
}

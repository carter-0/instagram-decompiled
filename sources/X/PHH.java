package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.File;

public final class PHH implements C320986tO {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C304566Ea A01;
    public final /* synthetic */ PEN A02;
    public final /* synthetic */ DirectAnimatedMedia A03;
    public final /* synthetic */ AnonymousClass9HR A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        0qQ.A0B(str2, 2);
        UserSession userSession = this.A00;
        userSession.A01(C70937OSk.class, C73911Plm.A00(userSession, 6));
        DirectAnimatedMedia directAnimatedMedia = this.A03;
        File A0t = AnonymousClass7TE.A0t(str2);
        String A0s = DbV.A0s();
        AnonymousClass9HR r4 = this.A04;
        C70937OSk.A00(userSession, directAnimatedMedia, r4, A0t, A0s);
        String str3 = this.A05;
        if (str3.length() != 0) {
            this.A02.A00.A02(this.A01.A09(r4, str3, this.A06), C73021PTe.A00);
        }
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public final void onError(String str) {
    }

    public PHH(UserSession userSession, C304566Ea r2, PEN pen, DirectAnimatedMedia directAnimatedMedia, AnonymousClass9HR r5, String str, String str2) {
        this.A00 = userSession;
        this.A03 = directAnimatedMedia;
        this.A04 = r5;
        this.A05 = str;
        this.A02 = pen;
        this.A01 = r2;
        this.A06 = str2;
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.user.model.User;
import java.util.List;

public final class P49 implements C74511Pw6 {
    public final DirectShareTarget A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass2Ep A03;
    public final AnonymousClass37D A04;
    public final User A05;

    public P49(Context context, UserSession userSession, AnonymousClass2Ep r4, DirectShareTarget directShareTarget, AnonymousClass37D r6, User user) {
        DbW.A1O(userSession, 2, user);
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = r6;
        this.A03 = r4;
        this.A00 = directShareTarget;
        this.A05 = user;
    }

    public final void Csp(C317966o8 r1, C69319NjK njK, int i) {
    }

    public final void CuT() {
    }

    public final void CxN(C317966o8 r1, N34 n34, String str) {
    }

    public final void D7d(C317966o8 r1) {
    }

    public final void DI3(N34 n34, C68137N2b n2b, String str) {
        C68137N2b n2b2 = n2b;
        0qQ.A0B(n2b2, 0);
        UserSession userSession = this.A02;
        C333537Zi A002 = C333527Zh.A00(userSession);
        DirectShareTarget directShareTarget = this.A00;
        A002.ELL((Context) null, userSession, (C254933tI) null, n2b2.A00, DbS.A0c(directShareTarget), (String) null, (String) null, (List) null, this.A03.CVE());
        this.A04.A0B();
        User user = this.A05;
        C69842Nt6.A00(userSession, user.getId());
        C69919NuL.A00(this.A01, (AnonymousClass0iw) null, userSession, directShareTarget, user, (C70636OEh) null, (String) null);
    }

    public final void DNZ(N34 n34, String str) {
    }

    public final void DOo() {
    }

    public final void DT2(C66569MWx mWx) {
    }

    public final void Dnb(N34 n34, DirectStoreSticker directStoreSticker, String str) {
    }

    public final void Du2() {
    }

    public final void Duk(String str) {
    }

    public final void Dul(String str) {
    }

    public final void EuP() {
    }

    public final DirectShareTarget BtL() {
        return this.A00;
    }
}

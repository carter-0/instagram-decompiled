package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

public final class EUG extends EC7 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C50924FlD A01;
    public final /* synthetic */ 0Jv A02;
    public final /* synthetic */ ProgressButton A03;
    public final /* synthetic */ User A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EUG(UserSession userSession, UserSession userSession2, C50924FlD flD, 0Jv r10, ProgressButton progressButton, User user, User user2) {
        super(userSession, (C267094ax) null, user, "create", true);
        this.A01 = flD;
        this.A03 = progressButton;
        this.A02 = r10;
        this.A04 = user2;
        this.A00 = userSession2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Eb4] */
    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(466735621);
        EUG.super.onFail(r5);
        this.A03.setShowProgressBar(false);
        0Jv r2 = this.A02;
        EVQ evq = EVQ.FAILED;
        ? obj = new Object();
        obj.A00 = evq;
        r2.AId(obj);
        AnonymousClass0fD.A0A(1773368722, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1410035177);
        EUG.super.onStart();
        ProgressButton progressButton = this.A03;
        progressButton.setShowProgressBar(true);
        progressButton.setEnabled(false);
        AnonymousClass0fD.A0A(-2071507073, A032);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.Eb4] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.Eb4] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(2011116256);
        DwR dwR = (DwR) obj;
        int A033 = AnonymousClass0fD.A03(475154728);
        EUG.super.onSuccess(dwR);
        this.A03.setShowProgressBar(false);
        boolean z = dwR.A00().A0E;
        0Jv r2 = this.A02;
        if (z) {
            EVQ evq = EVQ.FOLLOWED;
            ? obj2 = new Object();
            obj2.A00 = evq;
            r2.AId(obj2);
            if (!dwR.A07) {
                User user = this.A04;
                UserSession userSession = this.A00;
                user.A0g(userSession);
                DbT.A0j(userSession).A0h(userSession);
            }
        } else {
            EVQ evq2 = EVQ.REQUESTED;
            ? obj3 = new Object();
            obj3.A00 = evq2;
            r2.AId(obj3);
        }
        AnonymousClass0fD.A0A(1238472609, A033);
        AnonymousClass0fD.A0A(-2083657021, A032);
    }
}

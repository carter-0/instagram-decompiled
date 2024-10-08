package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class EME extends C47695EDe {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3EO A01;
    public final /* synthetic */ AnonymousClass0aP A02;
    public final /* synthetic */ C47705EDo A03;
    public final /* synthetic */ C49557Exs A04;
    public final /* synthetic */ List A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EME(android.net.Uri r11, androidx.fragment.app.FragmentActivity r12, X.AnonymousClass3EO r13, X.AnonymousClass0iw r14, X.AnonymousClass0aP r15, X.C50515Fdb r16, X.C47705EDo r17, X.C49557Exs r18, X.C46634DiE r19, java.lang.Integer r20, java.lang.String r21, java.util.List r22, int r23) {
        /*
            r10 = this;
            r1 = r10
            r5 = r15
            r10.A02 = r15
            r0 = r18
            r10.A04 = r0
            r0 = r17
            r10.A03 = r0
            r0 = r23
            r10.A00 = r0
            r0 = r22
            r10.A05 = r0
            r10.A01 = r13
            r3 = r11
            r2 = r12
            r4 = r14
            r6 = r16
            r7 = r19
            r8 = r20
            r9 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EME.<init>(android.net.Uri, androidx.fragment.app.FragmentActivity, X.3EO, X.0iw, X.0aP, X.Fdb, X.EDo, X.Exs, X.DiE, java.lang.Integer, java.lang.String, java.util.List, int):void");
    }

    public final void A03(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, user);
        if (this.A04.A02) {
            C319606qt A012 = C319606qt.A01(userSession);
            String id = user.getId();
            C47705EDo eDo = this.A03;
            C67623Mqv mqv = C67620Mqs.A04;
            AnonymousClass0iw r4 = eDo.A05;
            0qQ.A0A(r4);
            A012.A09(eDo.A01, r4, userSession2, AnonymousClass05K.A05, id, A1Z);
        }
        super.A03(userSession, user);
    }

    public final void A04(EM4 em4) {
        int A0D = AnonymousClass7TG.A0D(em4, 740076642);
        C319606qt.A01(this.A02).A0G(this.A04.A00.getId());
        super.A04(em4);
        AnonymousClass0fD.A0A(-1824396854, A0D);
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(1039330655);
        C47705EDo eDo = this.A03;
        0xI A002 = 0xI.A00(eDo, "deferred_recovered_account_skipped");
        A002.A0C("account_id", this.A04.A00.getId());
        DbU.A1R(A002, this.A02);
        int i = this.A00 + 1;
        if (i < this.A05.size()) {
            C47705EDo.A00(this.A01, eDo, i);
        } else {
            C47705EDo.A01(eDo);
        }
        AnonymousClass0fD.A0A(-1566302930, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(98845441, C47695EDe.A00(this, obj, 24673539));
    }
}

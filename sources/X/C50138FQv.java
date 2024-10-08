package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FQv  reason: case insensitive filesystem */
public final class C50138FQv implements AnonymousClass2gO {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ AnonymousClass0aP A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C50138FQv(FragmentActivity fragmentActivity, AnonymousClass0iw r2, AnonymousClass0aP r3, UserSession userSession, Double d, String str, String str2, String str3) {
        this.A07 = str;
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A04 = d;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = userSession;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Iterator it = ((List) obj).iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C60937Jtv jtv = (C60937Jtv) it.next();
            if (this.A07.equals(jtv.A03)) {
                EDV edv = new EDV(16, this, jtv);
                FragmentActivity fragmentActivity = this.A00;
                AnonymousClass0aP r7 = this.A02;
                QP8 qp8 = (QP8) jtv.A02;
                1OC A0A = FHA.A0A(r7, FHA.A0G(FxcalAccountType.INSTAGRAM, qp8.A01, this.A03.A06), (Boolean) null, qp8.A04, 0qv.A00(fragmentActivity), DbT.A0s(fragmentActivity), "account_switcher", (String) null);
                A0A.A00 = edv;
                1ES.A03(A0A);
                z = true;
            }
        }
        if (!z) {
            FragmentActivity fragmentActivity2 = this.A00;
            AnonymousClass7TF.A1B(fragmentActivity2, 1, this.A02);
            DbX.A0z(fragmentActivity2);
            boolean A062 = 1AW.A06(0Tu.A05, 2324155779101309145L);
            UserSession userSession = this.A03;
            0BQ A002 = AnonymousClass0BO.A00(userSession);
            String str = this.A05;
            FFQ.A00().A01(fragmentActivity2, A002.AEO(fragmentActivity2, (Uri) null, userSession, str, false).A00, userSession, !A062);
            userSession.getClass();
            C46400DeN.A03(userSession, (Long) null, (Long) null, "intra_app", this.A06, str, (String) null, (String) null, (String) null, (String) null, this.A04.doubleValue(), false, true, false);
        }
    }
}

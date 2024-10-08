package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class LBH {
    public List A00;
    public 05G A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final 2Er A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C41655Ay7(this, 16));
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final FragmentActivity A0B;

    public LBH(FragmentActivity fragmentActivity, UserSession userSession, 2Er r7) {
        this.A0B = fragmentActivity;
        this.A05 = userSession;
        this.A06 = r7;
        this.A04 = fragmentActivity.getApplicationContext();
        0sn r1 = 0sn.A00;
        this.A00 = r1;
        this.A01 = C51967G9n.A0u();
        02z A10 = DbS.A10(C62500Kgq.HIDDEN);
        this.A08 = A10;
        02z A012 = 106.A01(r1);
        this.A09 = A012;
        MCA A002 = MCA.A00(this, new AnonymousClass0r6[]{A10, A012, this.A01}, 37);
        this.A0A = 10b.A02(C65260LqF.A00, DbW.A0E(fragmentActivity), A002, AnonymousClass10A.A01);
    }
}

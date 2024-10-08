package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IMs  reason: case insensitive filesystem */
public final class C57052IMs implements C59548JNu {
    public final /* synthetic */ C53946Gwq A00;
    public final /* synthetic */ C272034jz A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ 0r1 A03;
    public final /* synthetic */ 0rm A04;

    public final void DVW(C55890HpB hpB, String str, String str2, int i) {
        C55890HpB hpB2 = hpB;
        0qQ.A0B(hpB2, 0);
        C53946Gwq gwq = this.A00;
        C52971GgO ggO = gwq.A02;
        C272034jz r7 = this.A01;
        0rm r2 = this.A04;
        int i2 = i;
        ggO.A0T(r7, (Integer) r2.A00, str, str2, i2);
        I6I i6i = I6I.A00;
        UserSession userSession = gwq.A03;
        boolean z = gwq.A01.A0f;
        String moduleName = gwq.A04.getModuleName();
        List list = this.A02;
        i6i.A03(hpB2, userSession, r7, moduleName, list, new C58218IoM(9, hpB2, this.A03, gwq, r7, list), new C58735Iwi(i2, 10, r2), new J6O(gwq, 41), new C59111J6t(gwq, 44), i2, z);
    }

    public C57052IMs(C53946Gwq gwq, C272034jz r2, List list, 0r1 r4, 0rm r5) {
        this.A00 = gwq;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = list;
        this.A03 = r4;
    }
}

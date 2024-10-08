package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IMr  reason: case insensitive filesystem */
public final class C57051IMr implements C59548JNu {
    public final /* synthetic */ C333777a7 A00;
    public final /* synthetic */ IPS A01;
    public final /* synthetic */ C272034jz A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ 0rm A04;

    public final void DVW(C55890HpB hpB, String str, String str2, int i) {
        C55890HpB hpB2 = hpB;
        0qQ.A0B(hpB2, 0);
        IPS ips = this.A01;
        0sI r11 = ips.A0A;
        C272034jz r10 = this.A02;
        0rm r6 = this.A04;
        int i2 = i;
        r11.invoke(str, str2, r10, r6.A00, Integer.valueOf(i2));
        I6I i6i = I6I.A00;
        UserSession userSession = ips.A03;
        C333777a7 r5 = this.A00;
        boolean z = r5.A0f;
        String moduleName = ips.A04.getModuleName();
        List list = this.A03;
        C58735Iwi iwi = new C58735Iwi(i2, 9, r6);
        JG1 jg1 = new JG1(9, r5, ips);
        i6i.A03(hpB2, userSession, r10, moduleName, list, new C58208IoC(20, hpB2, ips, list, r10), iwi, new J6O(ips, 25), jg1, i2, z);
    }

    public C57051IMr(C333777a7 r1, IPS ips, C272034jz r3, List list, 0rm r5) {
        this.A01 = ips;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = list;
    }
}

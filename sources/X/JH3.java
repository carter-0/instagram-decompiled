package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class JH3 extends 0Yg implements 0sK {
    public final /* synthetic */ C53397GnU A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ 0rk A03;
    public final /* synthetic */ AnonymousClass62P A04;
    public final /* synthetic */ C304516Dt A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JH3(C53397GnU gnU, C62320sa r3, 0sP r4, 0rk r5, AnonymousClass62P r6, C304516Dt r7) {
        super(3);
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = gnU;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r8 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-313785114, "com.instagram.profilecard.ui.ProfileCardTagsContainer.<anonymous>.<anonymous> (ProfileCardContent.kt:1025)");
            }
            C304516Dt r0 = this.A05;
            0rk r6 = this.A03;
            AnonymousClass62P r5 = this.A04;
            C53397GnU gnU = this.A00;
            C62320sa r11 = this.A01;
            0sP r12 = this.A02;
            Iterator A0u = AnonymousClass7TF.A0u(r0);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                List list = (List) A1J.getValue();
                EVW evw = (EVW) A1J.getKey();
                r8.ExS(-401266954);
                int i = 0;
                while (r6.A00 < 2 && i < list.size()) {
                    String A1G = C51966G9m.A1G(list, i);
                    r8.ExS(-401263610);
                    if (A1G != null) {
                        int i2 = r6.A00;
                        I7V.A07(r8, evw, A1G, r11, r12, i2, 0, ((AnonymousClass5RW) r5.get(i2 % r5.size())).A00, gnU.A0F, gnU.A0E);
                    }
                    C51965G9l.A1X(r8, false);
                    i++;
                    r6.A00++;
                }
                C51965G9l.A1X(r8, false);
            }
            if (0fL.A02()) {
                0fL.A00(-739046375);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}

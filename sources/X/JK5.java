package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class JK5 extends 0Yg implements 0sI {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C299635va A02;
    public final /* synthetic */ C22332Xzh A03;
    public final /* synthetic */ C22330Xzf A04;
    public final /* synthetic */ C53334GmK A05;
    public final /* synthetic */ C53008Ggz A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ AnonymousClass4DU A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ C62320sa A0A;
    public final /* synthetic */ C62320sa A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK5(C284945Oz r2, C284945Oz r3, C299635va r4, C22332Xzh xzh, C22330Xzf xzf, C53334GmK gmK, C53008Ggz ggz, UserSession userSession, AnonymousClass4DU r10, List list, C62320sa r12, C62320sa r13, boolean z, boolean z2) {
        super(5);
        this.A03 = xzh;
        this.A09 = list;
        this.A07 = userSession;
        this.A0B = r12;
        this.A0A = r13;
        this.A05 = gmK;
        this.A04 = xzf;
        this.A08 = r10;
        this.A02 = r4;
        this.A0C = z;
        this.A0D = z2;
        this.A06 = ggz;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C299575vQ r11 = (C299575vQ) obj3;
        C286575Wy r10 = (C286575Wy) obj4;
        int A0M2 = AnonymousClass7TE.A0M(obj5);
        AnonymousClass7TF.A1B(obj, 0, r11);
        if ((A0M2 & 112) == 0) {
            i = G9t.A06(r10, A0M) | A0M2;
        } else {
            i = A0M2;
        }
        if ((A0M2 & 896) == 0) {
            i |= G9t.A0Q(r10, r11);
        }
        if ((i & 5841) != 1168 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1434298201, "com.instagram.barcelona.permalink.ui.component.PermalinkContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PermalinkContent.kt:254)");
            }
            String str = r11.Be5().A03;
            List list = this.A09;
            UserSession userSession = this.A07;
            C62320sa r16 = this.A0B;
            C62320sa r14 = this.A0A;
            C53334GmK gmK = this.A05;
            C22330Xzf xzf = this.A04;
            C22332Xzh xzh = this.A03;
            AnonymousClass4DU r6 = this.A08;
            C299635va r5 = this.A02;
            boolean z = this.A0C;
            boolean z2 = this.A0D;
            C53008Ggz ggz = this.A06;
            String str2 = str;
            List list2 = list;
            C62320sa r25 = r16;
            C299635va r162 = r5;
            C22332Xzh xzh2 = xzh;
            C22330Xzf xzf2 = xzf;
            C53334GmK gmK2 = gmK;
            C53008Ggz ggz2 = ggz;
            C284945Oz r13 = this.A01;
            C284945Oz r142 = this.A00;
            C299575vQ r15 = r11;
            if (C51973G9u.A1U(r10, new JD6(r13, r142, r15, r162, xzh2, xzf2, gmK2, ggz2, userSession, r6, str2, list2, r25, r14, A0M, z, z2), new C286705Xl[0], -1033096039)) {
                0fL.A00(1047431833);
            }
        } else {
            r10.Evl();
        }
        return C60340gF.A00;
    }
}

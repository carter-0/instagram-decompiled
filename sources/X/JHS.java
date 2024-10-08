package X;

import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.ui.Modifier;

public final class JHS extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = obj2;
        if (this.A00 != 0) {
            C286575Wy r2 = (C286575Wy) obj4;
            int A0M = AnonymousClass7TE.A0M(obj3);
            0qQ.A0B(obj, 0);
            if ((A0M & 17) != 16 || !r2.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(77088783, "com.instagram.schools.management.ui.SchoolOnboardingConfirmSchoolContent.<anonymous> (SchoolOnboardingConfirmSchoolContent.kt:59)");
                }
                String str = this.A07;
                String str2 = this.A06;
                boolean z = this.A08;
                C56346Hwx.A01(r2, (HM5) this.A01, (C54635HLs) this.A05, str, str2, (C62320sa) this.A04, (C62320sa) this.A02, (0sP) this.A03, 0, z);
                if (0fL.A02()) {
                    0fL.A00(359578281);
                }
            } else {
                r2.Evl();
            }
            return C60340gF.A00;
        }
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, -1525724089)) {
            0fL.A01(1219847955, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
        }
        C287605aT r4 = (C287605aT) C51972G9s.A0l(A0R, A0R.ECw(), AnonymousClass5XT.A00);
        Modifier A002 = AnonymousClass5ZU.A00((C287095Yz) this.A01, r4, Modifier.A00);
        boolean z2 = this.A08;
        Modifier Ezh = A002.Ezh(new CombinedClickableElement((C287085Yy) null, r4, (C287625aV) this.A05, this.A06, this.A07, (C62320sa) this.A02, (C62320sa) this.A04, (C62320sa) this.A03, z2));
        if (0fL.A02()) {
            0fL.A00(-1922433245);
        }
        C51965G9l.A1V(A0R);
        return Ezh;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A08 = z;
        this.A06 = str;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A07 = str2;
        this.A04 = obj4;
        this.A03 = obj5;
    }
}

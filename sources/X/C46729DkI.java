package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.userlist.data.LikesListRepository;

/* renamed from: X.DkI  reason: case insensitive filesystem */
public final class C46729DkI extends C361478gI {
    public final C61079JwH A00;
    public final UserSession A01;
    public final LikesListRepository A02;
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0r6 A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46729DkI(android.app.Application r19, X.C61079JwH r20, com.instagram.common.session.UserSession r21, com.instagram.user.userlist.data.LikesListRepository r22) {
        /*
            r18 = this;
            r15 = 1
            r6 = r19
            r1 = r20
            r0 = r21
            X.DbZ.A0t(r15, r6, r0, r1)
            r4 = r18
            r4.<init>(r6)
            r4.A01 = r0
            r4.A00 = r1
            r1 = r22
            r4.A02 = r1
            java.lang.String r11 = ""
            X.02z r5 = X.DbS.A10(r11)
            r4.A04 = r5
            r14 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            X.02z r3 = X.DbS.A10(r0)
            r4.A03 = r3
            X.0r6 r1 = r1.A01
            r0 = 2
            X.IkM r2 = new X.IkM
            r2.<init>(r0, r6, r4, r1)
            r4.A06 = r2
            r6 = 0
            r1 = 6
            X.Pfy r0 = new X.Pfy
            r0.<init>(r4, r6, r1)
            X.0pt r2 = X.AnonymousClass10H.A00(r0, r5, r2, r3)
            X.6oS r1 = X.C318116oQ.A00(r4)
            X.109 r0 = X.AnonymousClass10A.A01
            X.Drt r5 = new X.Drt
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            r16 = r14
            r17 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.05F r0 = X.10b.A02(r5, r1, r2, r0)
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46729DkI.<init>(android.app.Application, X.JwH, com.instagram.common.session.UserSession, com.instagram.user.userlist.data.LikesListRepository):void");
    }

    public final int A0E(Integer num) {
        C61079JwH jwH = this.A00;
        1Xl A042 = jwH.A04();
        if (A042 == null) {
            return 2131964955;
        }
        1Xj BPf = A042.BPf();
        boolean z = true;
        if (BPf == null) {
            return 2131964955;
        }
        if (!BPf.A4S()) {
            z = false;
        }
        if ((BPf.A5T() || BPf.A5R()) && C243353Yk.A03(this.A01, BPf, num)) {
            return 2131964956;
        }
        if (BPf.A0C.CEg() == null) {
            return 2131964955;
        }
        UserSession userSession = this.A01;
        if (C46342Dck.A02(userSession, BPf)) {
            if (z) {
                return 2131976690;
            }
            if (182.A06(0Tu.A05, userSession, 36320854795232150L)) {
                return 2131969513;
            }
            return 2131969515;
        } else if (z) {
            return 2131976689;
        } else {
            if (((QP4) jwH.A00).A01) {
                return 2131969512;
            }
            if (BPf.A5G() || !C243353Yk.A02(userSession, BPf)) {
                return 2131964955;
            }
            return 2131976689;
        }
    }

    public final void onCleared() {
        this.A02.close();
    }
}

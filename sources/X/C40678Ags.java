package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ags  reason: case insensitive filesystem */
public final class C40678Ags implements AnonymousClass8XQ {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C357638Yz A03;
    public final /* synthetic */ AnonymousClass8XQ A04;

    public final void DCx(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A04.DCx(exc);
    }

    public final void DQY(AnonymousClass8XW r10, List list, List list2, int i) {
        int i2;
        0qQ.A0B(r10, 0);
        AnonymousClass7TF.A1B(list, 1, list2);
        AnonymousClass8XQ r2 = this.A04;
        C3494680m r5 = this.A03.A08;
        Object obj = r5.A00;
        C362178hT r1 = (C362178hT) r2;
        0qQ.A0B(obj, 0);
        if (obj instanceof AnonymousClass80O) {
            i2 = r1.A03.A00;
        } else if (obj instanceof AnonymousClass9QA) {
            i2 = r1.A03.A01;
        } else {
            i2 = 0;
        }
        if (r5.A00 instanceof AnonymousClass80O) {
            if (182.A06(0Tu.A05, this.A02, 36330398212440680L) && !this.A00) {
                if (i2 == 0) {
                    i2 = -3;
                }
                r10.A0D(i2);
                this.A00 = true;
                this.A01 = false;
                r2.DQY(r10, 0u4.A01(list), 0u4.A01(list2), i);
            }
        }
        if (r5.A00 instanceof AnonymousClass9QA) {
            if (182.A06(0Tu.A06, this.A02, 36330398212440680L) && !this.A01) {
                if (i2 == 0) {
                    i2 = -1;
                }
                r10.A0D(i2);
                this.A00 = false;
                this.A01 = true;
                r2.DQY(r10, 0u4.A01(list), 0u4.A01(list2), i);
            }
        }
        if (r10.A02.A05.isEmpty()) {
            r10.A0D(-1);
        }
        r2.DQY(r10, 0u4.A01(list), 0u4.A01(list2), i);
    }

    public C40678Ags(UserSession userSession, C357638Yz r2, AnonymousClass8XQ r3) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = userSession;
    }
}

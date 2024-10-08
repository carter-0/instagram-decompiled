package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TrU  reason: case insensitive filesystem */
public final class C14190TrU extends C249383je {
    public C238133Ar A00;
    public final C20952X6f A01;
    public final C14228TsB A02;

    public C14190TrU(UserSession userSession, C229132mt r10, Integer num, int i) {
        AnonymousClass7TF.A1D(userSession, 1, r10);
        C14197Trc trc = new C14197Trc(this);
        this.A01 = trc;
        this.A02 = new C14228TsB(userSession, r10, trc, AnonymousClass05K.A00, num, i, true);
    }

    public final void onScroll(C238133Ar r5, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0fD.A03(1371923185);
        0qQ.A0B(r5, 0);
        this.A00 = r5;
        C14228TsB tsB = this.A02;
        if (tsB.A05 == AnonymousClass05K.A01 && C14228TsB.A00(tsB, i, i2, i3)) {
            tsB.A02.ACw();
        }
        AnonymousClass0fD.A0A(-597590489, A03);
    }

    public final void onScrollStateChanged(C238133Ar r8, int i) {
        int count;
        int A0D = AnonymousClass7TG.A0D(r8, 1933427799);
        this.A00 = r8;
        if (i == 0) {
            C14228TsB tsB = this.A02;
            int B6L = r8.B6L();
            int BLQ = (r8.BLQ() - r8.B6L()) + 1;
            C231272rL AZK = r8.AZK();
            if (AZK != null) {
                count = AZK.getCount();
            } else {
                count = r8.getCount();
            }
            if (tsB.A05 == AnonymousClass05K.A00 && C14228TsB.A00(tsB, B6L, BLQ, count)) {
                tsB.A02.ACw();
            }
        }
        AnonymousClass0fD.A0A(-1856053484, A0D);
    }
}

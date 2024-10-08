package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TsD  reason: case insensitive filesystem */
public final class C14230TsD extends AnonymousClass1GX {
    public final C14228TsB A00;
    public final C14231TsE A01;

    public C14230TsD(UserSession userSession, C229132mt r10, C231272rL r11, Integer num, int i, boolean z) {
        Integer num2;
        C14231TsE tsE = new C14231TsE(r11);
        this.A01 = tsE;
        if (z) {
            num2 = AnonymousClass05K.A00;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        this.A00 = new C14228TsB(userSession, r10, tsE, num2, num, i, true);
    }

    public final void onScroll(C238133Ar r5, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0fD.A03(-1202991376);
        C14228TsB tsB = this.A00;
        if (tsB.A05 == AnonymousClass05K.A01 && C14228TsB.A00(tsB, i, i2, i3)) {
            tsB.A02.ACw();
        }
        AnonymousClass0fD.A0A(-751222886, A03);
    }

    public final void onScrollStateChanged(C238133Ar r8, int i) {
        int A0D = AnonymousClass7TG.A0D(r8, -951554787);
        C231272rL AZK = r8.AZK();
        if (i == 0 && AZK != null) {
            C14228TsB tsB = this.A00;
            int B6L = r8.B6L();
            int BLQ = (r8.BLQ() - r8.B6L()) + 1;
            int count = AZK.getCount();
            if (tsB.A05 == AnonymousClass05K.A00 && C14228TsB.A00(tsB, B6L, BLQ, count)) {
                tsB.A02.ACw();
            }
        }
        AnonymousClass0fD.A0A(-74519864, A0D);
    }

    public C14230TsD(UserSession userSession, C229132mt r10, C231272rL r11, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        C14231TsE tsE = new C14231TsE(r11);
        this.A01 = tsE;
        if (z) {
            num2 = AnonymousClass05K.A00;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        this.A00 = new C14228TsB(userSession, r10, tsE, num2, num, i, z2);
    }
}

package X;

import java.util.List;

/* renamed from: X.PDs  reason: case insensitive filesystem */
public final class C72639PDs implements C74413PuT {
    public final /* synthetic */ long A00;
    public final /* synthetic */ OL8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    public C72639PDs(OL8 ol8, String str, 0sP r3, long j) {
        this.A01 = ol8;
        this.A02 = str;
        this.A03 = r3;
        this.A00 = j;
    }

    public final void DFJ(OE3 oe3) {
        OL8 ol8 = this.A01;
        ol8.A01.A00(this.A02, (List) null, 119, 0);
        this.A03.invoke(oe3);
        if (oe3.A01 != null) {
            ol8.A00.A00(this.A00);
        }
    }

    public final void DFL(boolean z) {
        long j;
        C70808OMd oMd = this.A01.A01;
        String str = this.A02;
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        oMd.A00(str, C66582MXn.A10(j), 118, 0);
    }
}

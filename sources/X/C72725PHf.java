package X;

import java.util.Map;

/* renamed from: X.PHf  reason: case insensitive filesystem */
public final class C72725PHf implements C74474PvU {
    public boolean A00 = true;
    public final /* synthetic */ OH6 A01;
    public final /* synthetic */ C69093NeY A02;

    public final void DZL() {
        this.A00 = false;
        C69093NeY neY = this.A02;
        neY.A00 = this.A01.A02;
        neY.A06.A05(new C72865PNb(AnonymousClass7TE.A0c(neY.A08.A07), AnonymousClass05K.A1F, AnonymousClass05K.A00, false));
    }

    public C72725PHf(OH6 oh6, C69093NeY neY) {
        this.A01 = oh6;
        this.A02 = neY;
    }

    public final void Di4() {
        C70578OCa oCa = this.A01.A02;
        oCa.A00.DbI(oCa.A01, AnonymousClass05K.A01, (Map) null);
    }

    public final void onDismiss() {
        if (this.A00) {
            C70578OCa oCa = this.A01.A02;
            oCa.A00.DbJ(oCa.A01);
        }
    }

    public final void onShow() {
        C70578OCa oCa = this.A01.A02;
        oCa.A00.DbK(oCa.A01);
    }
}

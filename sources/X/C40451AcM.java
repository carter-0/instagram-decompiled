package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.AcM  reason: case insensitive filesystem */
public final class C40451AcM implements C66484MTn {
    public final /* synthetic */ C329067Hl A00;
    public final /* synthetic */ MessageIdentifier A01;

    public final void EMf(C53401GnY gnY, C381779cJ r11, List list, int i, long j, boolean z, boolean z2) {
        C53401GnY gnY2 = gnY;
        if (gnY != null) {
            C329067Hl r2 = this.A00;
            C329067Hl.A0i(r2, Integer.valueOf(C329067Hl.A00(r2)), gnY.A04, gnY.A03, "gallery_picker", true, true);
        }
        this.A00.A1k.A05(gnY2, this.A01, r11, Long.valueOf(j), list, false, z2);
    }

    public C40451AcM(C329067Hl r1, MessageIdentifier messageIdentifier) {
        this.A00 = r1;
        this.A01 = messageIdentifier;
    }

    public final void EIt() {
        C329067Hl r4 = this.A00;
        if (182.A06(0Tu.A05, r4.A1Z, 36325901382071653L)) {
            r4.A1D();
        }
    }
}

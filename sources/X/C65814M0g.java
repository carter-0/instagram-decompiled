package X;

/* renamed from: X.M0g  reason: case insensitive filesystem */
public final class C65814M0g implements MTB {
    public final /* synthetic */ C62423KfY A00;

    public C65814M0g(C62423KfY kfY) {
        this.A00 = kfY;
    }

    public final void Dn3() {
        long j;
        C62423KfY kfY = this.A00;
        M0X m0x = kfY.A0a;
        C22371Y0z y0z = kfY.A0I;
        long j2 = 0;
        if (y0z != null) {
            j = y0z.C8j();
        } else {
            j = 0;
        }
        C65819M0l m0l = kfY.A0H;
        if (m0l != null) {
            j2 = m0l.A00;
        }
        1Ln A03 = M0X.A03(m0x, AnonymousClass05K.A08);
        A03.A0Q("rtmp_duration", Long.valueOf(j));
        A03.A0Q("rtc_duration", Long.valueOf(j2));
        A03.Cgf();
    }
}

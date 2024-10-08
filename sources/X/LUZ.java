package X;

import android.content.DialogInterface;
import java.util.Map;

public final class LUZ implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public LUZ(KUZ kuz, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A02 = kuz;
        this.A06 = z;
        this.A03 = z2;
        this.A01 = map;
        this.A04 = z3;
        this.A05 = z4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A00;
        KUZ kuz = (KUZ) this.A02;
        if (i2 != 0) {
            Integer num = AnonymousClass05K.A1I;
            boolean z = this.A06;
            boolean z2 = this.A03;
            boolean z3 = this.A04;
            boolean z4 = this.A05;
            LTO lto = (LTO) kuz.A01.getValue();
            Integer num2 = AnonymousClass05K.A15;
            lto.A08(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), num2, num, (Map) this.A01, (Map) null, 0Yt.A0E());
            return;
        }
        Integer num3 = AnonymousClass05K.A1F;
        boolean z5 = this.A06;
        boolean z6 = this.A03;
        Map map = (Map) this.A01;
        boolean z7 = this.A04;
        boolean z8 = this.A05;
        Integer num4 = AnonymousClass05K.A15;
        Boolean valueOf = Boolean.valueOf(z5);
        Boolean valueOf2 = Boolean.valueOf(z6);
        Boolean valueOf3 = Boolean.valueOf(z7);
        Boolean valueOf4 = Boolean.valueOf(z8);
        ((LTO) kuz.A01.getValue()).A08(valueOf, valueOf2, valueOf3, valueOf4, num4, num3, map, (Map) null, 0Yt.A0E());
        C60307Jj6 jj6 = (C60307Jj6) kuz.A02.getValue();
        jj6.A00.A09(valueOf, valueOf2, valueOf3, valueOf4, num4, map);
        Dba.A1S(jj6, C318116oQ.A00(jj6), 1, false);
    }
}

package X;

import com.facebook.proxygen.TraceFieldType;

public final class NRL extends 0ng {
    public final /* synthetic */ C72208OyY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRL(C72208OyY oyY) {
        super(660);
        this.A00 = oyY;
    }

    public final void run() {
        C254783t2 r0;
        String str;
        C72208OyY oyY = this.A00;
        if (oyY.A06 != null && oyY.A03 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(oyY.A0C, "direct_inbox_search_dwell_30s");
            if (A0e.isSampled()) {
                C66580MXl.A1H(A0e, oyY.A06);
                C66581MXm.A1F(A0e, oyY.A00);
                A0e.AAe("recipient_ids", C72208OyY.A02(oyY));
                C66580MXl.A1J(A0e, C72208OyY.A01(oyY));
                if (oyY.A0G && !oyY.A08 && !oyY.A0A && (r0 = oyY.A04) != null) {
                    C254923tH A002 = AnonymousClass6W3.A00(r0);
                    if (A002 != null) {
                        str = A002.A00;
                    } else {
                        str = null;
                    }
                    A0e.AAJ(TraceFieldType.TransportType, str);
                }
                A0e.Cgf();
            }
        }
    }
}

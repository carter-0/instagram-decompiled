package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

public final class PSP implements 1aV {
    public final int A00;
    public final long A01;
    public final Object A02;

    public PSP(C69183NgW ngW, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = ngW;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        long j;
        AnonymousClass632 r5;
        AnonymousClass68L A0F;
        MailboxFutureImpl A0J;
        MailboxCallback oog;
        AnonymousClass638 r11 = (AnonymousClass638) obj;
        switch (this.A00) {
            case 0:
                i = 0;
                0qQ.A0B(r11, 0);
                j = this.A01;
                C71722Opg A002 = C71722Opg.A00(this.A02, 43);
                r5 = r11.A07;
                A0F = C66580MXl.A0F(r5, 0);
                A0J = C66581MXm.A0J(A0F, A002);
                break;
            case 1:
                0qQ.A0B(r11, 0);
                j = this.A01;
                C71722Opg A003 = C71722Opg.A00(this.A02, 44);
                r5 = r11.A07;
                A0F = C66580MXl.A0F(r5, 0);
                A0J = C66581MXm.A0J(A0F, A003);
                i = 3;
                break;
            case 2:
                0qQ.A0B(r11, 0);
                long j2 = this.A01;
                byte[] bArr = C69183NgW.A03;
                C71722Opg A004 = C71722Opg.A00(this.A02, 45);
                AnonymousClass632 r52 = r11.A07;
                A0F = C66580MXl.A0F(r52, 0);
                A0J = C66581MXm.A0J(A0F, A004);
                oog = new C71661Oog(0, j2, r52, A0J, bArr);
                break;
            default:
                0qQ.A0B(r11, 0);
                j = this.A01;
                C71722Opg A005 = C71722Opg.A00(this.A02, 46);
                r5 = r11.A07;
                A0F = C66580MXl.A0F(r5, 0);
                A0J = C66581MXm.A0J(A0F, A005);
                i = 2;
                break;
        }
        oog = new C71718Opc(r5, A0J, i, j);
        C66582MXn.A1E(A0F, oog, A0J);
    }
}

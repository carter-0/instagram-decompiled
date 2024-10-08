package X;

import android.content.Context;

/* renamed from: X.Sv4  reason: case insensitive filesystem */
public final class C12472Sv4 implements C13736Tg8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C12472Sv4(Context context, C13736Tg8 tg8, C11214SFo sFo, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A04 = str;
        this.A03 = sFo;
        if (i != 0) {
            this.A05 = str2;
            this.A02 = tg8;
        } else {
            this.A02 = tg8;
            this.A05 = str2;
        }
    }

    public final void Dap(Boolean bool, Integer num, Throwable th) {
        ((C13736Tg8) this.A02).Dap(bool, num, th);
    }

    public final void Das(String str) {
        C7422QCn A032;
        int i;
        if (this.A00 != 0) {
            String str2 = this.A04;
            SIS sis = AnonymousClass2E0.A03().A03;
            0qQ.A07(sis);
            A032 = sis.A02((C11214SFo) this.A03, str2);
            i = 1;
        } else {
            SIS sis2 = AnonymousClass2E0.A03().A03;
            0qQ.A07(sis2);
            String str3 = this.A04;
            C11214SFo sFo = (C11214SFo) this.A03;
            AnonymousClass5A3 r3 = sis2.A01;
            C45906DEl dEl = new C45906DEl(sis2, sFo, str3, 1);
            SOC soc = sis2.A00;
            DbZ.A0t(0, r3, soc, sFo);
            A032 = SSC.A03(new C8296Qnc(dEl, soc, r3, sFo));
            SIS.A00(A032, soc);
            i = 0;
        }
        SUj.A0H(A032, new C11632Sda(this, str, i));
    }
}

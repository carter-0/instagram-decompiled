package X;

import java.util.List;

public final class ECS extends 1P0 {
    public final String A00;
    public final /* synthetic */ C49692F2c A01;

    public ECS(C49692F2c f2c, String str) {
        0qQ.A0B(str, 2);
        this.A01 = f2c;
        this.A00 = str;
    }

    public final void onFail(C268654dm r5) {
        String errorMessage;
        int A0D = AnonymousClass7TG.A0D(r5, -79650595);
        1XP r0 = (1XP) r5.A00();
        if (r0 == null || (errorMessage = r0.getErrorMessage()) == null) {
            C49692F2c f2c = this.A01;
            f2c.A02.Dwe(AnonymousClass7TE.A16(f2c.A00, 2131968258), AnonymousClass05K.A00);
        } else {
            this.A01.A02.Dwe(errorMessage, AnonymousClass05K.A01);
        }
        AnonymousClass0fD.A0A(1435335790, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-149660278);
        this.A01.A02.Dwf();
        AnonymousClass0fD.A0A(119458024, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        F2H f2h;
        int i;
        int A03 = AnonymousClass0fD.A03(1053578685);
        C47365Dvz dvz = (C47365Dvz) obj;
        int A0D = AnonymousClass7TG.A0D(dvz, -1603670531);
        String str = this.A00;
        C49692F2c f2c = this.A01;
        if (!0qQ.A0K(str, f2c.A03.invoke())) {
            i = 1278534716;
        } else {
            if (dvz.A02) {
                f2c.A02.Dwd();
            } else {
                C51931G7z g7z = f2c.A02;
                String str2 = dvz.A01;
                if (str2 == null) {
                    str2 = "";
                }
                C47348Dvi dvi = dvz.A00;
                if (dvi == null || (f2h = dvi.A00) == null) {
                    list = null;
                } else {
                    list = f2h.A00();
                }
                g7z.Dwh(str2, list);
            }
            i = -801855756;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(1368940860, A03);
    }
}

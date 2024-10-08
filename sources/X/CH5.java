package X;

public final class CH5 extends 1P0 {
    public final int A00;

    public CH5(int i) {
        this.A00 = i;
    }

    public final void onFail(C268654dm r3) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-143036279);
                i2 = 1075205959;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1827259268);
                i2 = 1849596052;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1809774955);
                i2 = -676579589;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-202235095);
                i2 = -2038529648;
                break;
            case 5:
                i = AnonymousClass0fD.A03(834705226);
                i2 = 12710187;
                break;
            default:
                CH5.super.onFail(r3);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(120186233);
                AnonymousClass0fD.A0A(-414406057, AnonymousClass0fD.A03(1595426722));
                i2 = -567116087;
                break;
            case 2:
                i = AnonymousClass0fD.A03(35843079);
                AnonymousClass0fD.A0A(1418882515, AnonymousClass0fD.A03(-2022542513));
                i2 = 1814776645;
                break;
            case 3:
                i = AnonymousClass0fD.A03(120520211);
                AnonymousClass3JC r5 = (AnonymousClass3JC) obj;
                int A03 = AnonymousClass0fD.A03(-1286131620);
                DE2.A00 = r5;
                Object obj2 = r5.A01;
                if (obj2 != null) {
                    DZP dzp = (DZP) obj2;
                    if (!(dzp.B8k() == null || dzp.B8k().Bh0() == null)) {
                        DE2.A01 = dzp.B8k().Bh0().BuR();
                    }
                }
                AnonymousClass0fD.A0A(-1370703516, A03);
                i2 = -1822593885;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-958925819);
                AnonymousClass0fD.A0A(-1188651609, AnonymousClass0fD.A03(-681300185));
                i2 = -543343099;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1441658908);
                AnonymousClass0fD.A0A(-539557065, AnonymousClass0fD.A03(-798391189));
                i2 = -1229063265;
                break;
            default:
                CH5.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}

package X;

/* renamed from: X.WFi  reason: case insensitive filesystem */
public final class C18981WFi implements C13919TlL, C13550TcM {
    public final int A00;
    public final Object A01;

    public C18981WFi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(Throwable th) {
        if (3 - this.A00 != 0) {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onSuccess() {
        UHR uhr;
        String str;
        switch (this.A00) {
            case 0:
                C17951Vii vii = (C17951Vii) this.A01;
                for (C13550TcM A002 : vii.A00) {
                    vii.A00(A002);
                }
                return;
            case 1:
                uhr = (UHR) this.A01;
                str = "PIN_ADDRESS_SHARED";
                break;
            case 2:
                uhr = (UHR) this.A01;
                str = "LOADED";
                break;
            case 3:
                ((S2X) this.A01).A00(0);
                return;
            default:
                C17951Vii vii2 = (C17951Vii) this.A01;
                for (C13550TcM A003 : vii2.A00) {
                    vii2.A00(A003);
                }
                return;
        }
        UHS.A04(uhr, (Object) null, str);
        UHR.A01(uhr);
    }
}

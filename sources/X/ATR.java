package X;

import android.os.Handler;

public final class ATR implements C341687nM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ATR(Handler handler, C341427mr r2, C341687nM r3, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = handler;
    }

    public final void DCg(C391719tX r4) {
        C341687nM r2;
        Handler handler;
        String str;
        int i = this.A00;
        C341457mv r0 = ((C341427mr) this.A01).A0I;
        switch (i) {
            case 0:
                r0.A05.A01("prAE");
                r2 = (C341687nM) this.A03;
                handler = (Handler) this.A02;
                str = "prepareRecorder";
                break;
            case 1:
                r0.A05.A01("aAE");
                r2 = (C341687nM) this.A03;
                handler = (Handler) this.A02;
                str = "addOutput/startInput";
                break;
            default:
                r0.A05.A01("rOAE");
                r2 = (C341687nM) this.A03;
                handler = (Handler) this.A02;
                str = "removeOutput/stopInput";
                break;
        }
        C341427mr.A01(handler, r4, r2, str);
    }

    public final void onSuccess() {
        C341687nM r4;
        Handler handler;
        String str;
        int i = this.A00;
        C341457mv r0 = ((C341427mr) this.A01).A0I;
        switch (i) {
            case 0:
                r0.A05.A01("prAE");
                ((C341687nM) this.A03).onSuccess();
                return;
            case 1:
                r0.A05.A01("aAE");
                r4 = (C341687nM) this.A03;
                handler = (Handler) this.A02;
                str = "";
                break;
            default:
                r0.A05.A01("rOAE");
                r4 = (C341687nM) this.A03;
                handler = (Handler) this.A02;
                str = "Error when stopping session";
                break;
        }
        handler.post(new C346507vI(0, str, r4));
    }
}

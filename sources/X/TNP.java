package X;

import java.util.concurrent.Callable;

public final /* synthetic */ class TNP implements Callable {
    public final /* synthetic */ STX A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ TNP(STX stx, String str, String str2) {
        this.A00 = stx;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object call() {
        STX stx = this.A00;
        return stx.A0K.FPn(stx.A01.getPackageName(), this.A01, this.A02, (String) null, 3);
    }
}

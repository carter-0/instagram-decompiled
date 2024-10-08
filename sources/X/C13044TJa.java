package X;

import java.util.List;

/* renamed from: X.TJa  reason: case insensitive filesystem */
public final class C13044TJa implements Runnable {
    public final /* synthetic */ C11329SNi A00;
    public final /* synthetic */ C10321RqJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C13044TJa(C11329SNi sNi, C10321RqJ rqJ, String str, List list) {
        this.A00 = sNi;
        this.A02 = str;
        this.A01 = rqJ;
        this.A03 = list;
    }

    public final void run() {
        C11329SNi.A00(this.A00, this.A01, this.A02, this.A03);
    }
}

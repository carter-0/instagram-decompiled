package X;

import java.util.HashMap;

/* renamed from: X.Apw  reason: case insensitive filesystem */
public final /* synthetic */ class C41198Apw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C346267ut A02;
    public final /* synthetic */ C364988mL A03;

    public /* synthetic */ C41198Apw(C346267ut r1, C364988mL r2, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }

    public final void run() {
        C364988mL r4 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        C346267ut r7 = this.A02;
        synchronized (r4) {
            r4.A01 = i;
            r4.A00 = i2;
            r4.A08 = r7;
            r4.A09 = true;
            C345087su r5 = r4.A06;
            if (r5 == null) {
                r5 = new C345087su(r4.A0A, new C345047sq(), new C345077st(), false);
                r4.A06 = r5;
            }
            r5.A03(i, i2, 0);
            if (r7 != null) {
                r5.A0E = r7;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("OutputFrameBuffer", 002.A0P("x", i, i2));
            r4.A0B.Ajt().ETZ(hashMap);
            r4.A0C.A00.A8c(r5, 0);
        }
    }
}

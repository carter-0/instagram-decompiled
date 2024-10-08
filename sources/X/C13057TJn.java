package X;

import java.util.Map;

/* renamed from: X.TJn  reason: case insensitive filesystem */
public final class C13057TJn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12381SsV A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C13057TJn(C12381SsV ssV, String str, Map map, int i) {
        this.A01 = ssV;
        this.A02 = str;
        this.A00 = i;
        this.A03 = map;
    }

    public final void run() {
        this.A01.A00.D5I(this.A02, this.A00, this.A03);
    }
}
